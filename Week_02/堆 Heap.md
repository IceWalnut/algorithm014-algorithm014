## 堆 Heap

Heap：可以迅速找到一堆数中的最大或者最小值的数据结构(两者取其一)

将根节点最大的堆叫做大顶堆或者大根堆，根节点最小的堆叫做小顶堆或者小根堆。常见的堆有二叉堆、斐波那契堆等。

假设是大顶堆，则常见操作（API）：

```
find-max:				O(1)
delete-max:			O(logN)
insert(create): O(logN) or O(1)
```

[不同实现的比较](https://en.wikipedia.org/wiki/Heap_(data_structure))

![image-20200821205129140](/Users/janexie/Library/Application Support/typora-user-images/image-20200821205129140.png)

二叉堆容易实现但是时间效率在堆里是比较差的

### 二叉堆性质

通过完全二叉树来实现（注意不是二叉搜索树）

完全二叉树：根和每一级叶子都是满的除了最下面一层

不用BST的原因：find - min 的时间不是O(1)了而是O(logn)      (找最左边的叶子节点)

二叉堆（大顶）满足下列性质：

- 是一棵完全树
- 树中任意节点的值总是 >= 其子节点的值

<img src="/Users/janexie/Library/Application Support/typora-user-images/image-20200821205702983.png" alt="image-20200821205702983" style="zoom:50%;" />

由此可以保证根节点是最大的节点。

### 二叉堆实现细节

1. 二叉堆一般都通过”数组“来实现

2. 假设”第一个元素“在数组中的索引为0的话，则父节点和子节点的位置关系如下：

   - 索引为 i 的左孩子的索引是（2*i+1）
   - 索引为 i 的右孩子的索引是（2*i+2）
   - 索引为 i 的父结点的索引是 floor((i - 1) / 2) 

   Eg: 上例中 110 ---0              100 --- 1             90 --- 2

<img src="/Users/janexie/Library/Application Support/typora-user-images/image-20200821210715323.png" alt="image-20200821210715323" style="zoom:50%;" />

Insert 插入操作

1.  新元素一律先插入到堆的尾部
2. 依次向上调整整个堆的结构（一直到根即可）   （如果大于根则和根进行交换）

HeapifyUp

<img src="/Users/janexie/Library/Application Support/typora-user-images/image-20200822110249068.png" alt="image-20200822110249068" style="zoom:50%;" />

<img src="/Users/janexie/Library/Application Support/typora-user-images/image-20200822110324698.png" alt="image-20200822110324698" style="zoom:50%;" />

<img src="/Users/janexie/Library/Application Support/typora-user-images/image-20200822110512930.png" alt="image-20200822110512930" style="zoom:50%;" />

时间复杂度： 对坏的情况  走到根那里，所以是O(log N)

### Delete Max 删除堆顶操作 O(logN)

1. 将堆尾元素替换到顶部（即堆顶被替代删除掉）
2. 依次从根部向下替换（一直到堆尾即可）       HeapifyDown

![image-20200822234739421](/Users/janexie/Library/Application Support/typora-user-images/image-20200822234739421.png)

堆是一个抽象的数据结构，表示可以非常迅速地拿到一堆数里面的最大值或最小值

注意： 二叉堆是堆（优先队列 priority_queue）的一种常见且简单的实现，但是并不是最优的实现





### 题目练习

- [剑指offer 40 最小的 k 个数](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/)
- [LeetCode 239 滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/)
- [LeetCode 347 前 k 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements/)

