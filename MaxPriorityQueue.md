# 优先队列
**wiki**优先队列是计算机科学中的一类抽象数据类型。优先队列中的每个元素都有各自的优先级，优先级最高的元素最先得到服务；优先级相同的元素按照其在优先队列中的顺序得到服务。优先队列往往用堆来实现。

## 最大优先队列
在堆上实现插入元素，删除最大元素，下沉小元素，上浮大元素。

- 元素下沉算法：
```java
    private void sink(int k){
        while(k < N){
            int j = k*2; //next
            if (j < N && less(j, j+1)) j++; //right
            if (!less(k, j)) break; //check
            swap(k, j);
            k = j;
        }
    }
```

![下沉](/images/PriorityQueue_1.png)

- 元素上浮算法：
```java
    private void swim(int k){
        while(k > 1 && less(k/2, k)){
            swap(k/2, k);
            k /= 2;
        }
    }
```
![上浮](/images/PriorityQueue_0.png)

- 对堆的元素操作
插入元素顺序：
（1) 准备待插入元素
（2) 在结尾添加元素
（3) 上浮

删除最大元素
（1) 备份最大元素
（2) 结尾元素跟根节点元素交换
（3) 下沉

![堆操作](/images/PriorityQueue_2.png)
