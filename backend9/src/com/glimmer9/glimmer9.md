# <center> 微光后端招新第九题 </center>
---
##  ***task 1 流API***
---
### 1.我们会得到什么结果，结合资料思考一下为什么会得到这样的结果，而不是我们所期望的结果？再学习一下流API,修改上面的代码使之生成我们想要的结果。你可以尝试创建自己的流，并总结一下使用流的规则。
- limit = java.util.stream.SliceOps$1@2f4d3709
- 原因为stream有惰性求值的特点，并不作为储存对象来用，只是作为一个处理元素的流来使用，只用于操作传入的元素，若要打印出limit后的列表，需要collector的toList导入到定义的表中实现
- 流的创建需要通过对stream的引入，一般申明传入流的数据类型，接着使用流的方法，一般会使用操作堆叠，再通过collect等结束流的使用，由于一般流被用于数据的整理与传输，当流涉及外部文件时，需要对流使用中可能出现的错误进行try-catch，throw等
```
List<String> string = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> streams = string.stream();
        List<String> limits = streams.limit(4).collect(Collectors.toList());//将stream流用collect方法收集并传给List
        System.out.println("limit = " + limits);//此时可以打出limit中的值
```
---
### 2.学习一下这种操作堆叠的原理，并结合上面使用流API的规则总结规律。
- 这种操作堆叠是由于流的工作原理导致的，由于流的执行是线性的，会从开始到终止依次逐个触发，形成链式的流程。这就符合了操作堆叠的方式，因此在使用时应注意从前致后操作的顺序有效性和参数一致性，并对代码进行适当的简化，方便流的可读性与简便性。
---
### 学习与理解
- 在Java中，Stream为一个Java8添加的全新的抽象的接口，是一个来自数据源的元素队列并支持聚合操作，主要用于对集合中的元素进行方便的操作
- 需要注意的是stream并非用于储存元素，所以不能直接导出stream处理的元素。
- 在stram流中可以选择函数型操作来代替，其特点相较于原本的过程式编程，会更加简便与快捷，提高了程序的效率和可读性。
- Lambda表达式是对匿名函数的简写形式，提供了一种更为简洁的语法，允许把函数作为一个方法的参数，具体形式为(parameters) -> expression 或 (parameters) ->{ statements; }，即传入一个参数，用箭头连接到对参数进行的操作，如本题所用到的i-> i*i,(x, y) -> y - x,forEach等
---
## 进阶挑战——应用流API
- 代码见项目
- 对于任务一，先将列表输入流中（使用list类中的steam方法），再使用方法过滤出包含rock的歌曲（经上网查找发现steam自带了contain方法，直接用上）
- 对于任务二，因为要求流派不重复，想到上一题的set集合，将list改为set，用Lambda将对象改为其流派（成功）
---
## ***task 2 串行化***
---
### 3.结合之前学习的流的知识，了解一下InputStream/OutputStream类，你需要做的是：尝试将上文的歌曲作为串行化对象写入文件，再通过逆串行化将对象的状态读取出来。
- InputStream/OutputStream类均为io流中的一种接口，分别用来对外界输出与对内输入，为字节流与字符流的基础，常用的子类有Writer，Reader，FileIn（Out）putStream， ByteArrayIn（Out）putStream： BufferedIn（Out）putStream等，可以实现不同功能的流的构建。区别为数据读取时放在栈中缓存的大小
- 对于字符流与字节流的区别，前者读取字节，适用于处理二进制数据，例如文件下载、图像处理、音频和视频流等。后者读取字符，适用于处理文本数据，例如读取和写入文本文件、处理字符串等。
- 二者均提供了对数据的输出或获取方法。可以通过结合实现文件写入，读取，拷贝等
---
## 进阶挑战——文件I/O
- 见代码
---
# PS：
- 如果答案实在有问题的话，可以给点提示和建议吗 qq：1187477643 多谢大佬（没时间也没关系）
---
#### 参考网址：
https://www.runoob.com/java/java8-streams.html
https://blog.csdn.net/weixin_40841731/article/details/86148603
https://blog.51cto.com/u_16175507/7043222
https://blog.csdn.net/xycxycooo/article/details/141609994
https://blog.csdn.net/weixin_45082647/article/details/106991685
https://www.runoob.com/java/java8-lambda-expressions.html
https://www.cnblogs.com/dengchengchao/p/11855723.html
https://www.bilibili.com