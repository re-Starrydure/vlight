# <center>微光后端第八题</center>
---
## ***Task.1 简单挑战——排序问题***
1.设你现在是一名负责管理酒吧点唱机的程序员，你的任务是负责将收到的歌曲数据进行排序，其他人会负责将数据封装到一个List中。你的任务——按照字母顺序对歌曲排序。
```
class a {
    public static void main(String[] args) {
        List<String> songs = MockSongs.getSongStrings();
        Collections.sort(songs);//使用collections类中的sort方法，对songs列表进行自然排序
        System.out.println(songs);
    }
}   
```
### 学习与理解
- 在这里，comparator是java中的一个接口，主要包含compare to等方法，作为比较器比较前后二者的差异，可以通过重写此方法实现要求的排序。
- collection提供的sort()方法可以实现列表的自然排列，collections为一个大的集合框架,包括了各种list，set，map
- 使用comparable同样是一种方法，comparable也是一种接口，用来实现集合的自然排序，需要使用ComparaTo方法。前者为外部构造器，需要构造实现类，而后者可以在类内实现，但需要修改源代码

---
## ***Task.2 进阶挑战——加入对象***
2.你可以仿造上面的模拟类来构建一个新的模拟类，用于模拟歌曲的数据，我们的要求是列表中包含真正的Song实例，而不是简单的String。
```
Public static List<Song> getSongObject(){//指定泛型list包含的为对象Song类
        List<Song> songs = new ArrayList<>();
        \......add一些歌\
        return songs;
}
```
---
- 学习与理解
- 1.注解；
- @Data和@AllArgsConstructor注解是来自Lombok库，能自动生成一些常用的方法，从而减少样板代码。
- 在Java中注解其实就是写在接口、类、属性、方法上的一个标签，或者说是一个特殊形式的注释。起到一个检查或补充的作用，以避免程序员在编码时犯一些不必要的错误。注解分为三类：
- 元注解：@Retention、@Target、@Documented、@Inherited、@Repeatable 无法被改变，一般标明该注解的使用范围、生命周期等。
- 标准注解：

|@Override   | @Deprecated  |  @SuppressWarnings |
|---|---|---|
|覆写父类方法   | 标记过期元素  | 不输出编译警告  |

- 自定义注解：通过自定义的注解实现反射注射等操作（学无余力了，先就到这吧 :coldsweat: )
- 2.泛型
- 泛型，即“参数化类型”。如对于一个方法，写形参时一般需要对传入的参数数据类型进行规定，而泛型提供了一种特殊的类型，使方法或类等在构造时不必定义数据类型，而是之后由传入的对象决定。
- 常见的泛型构造方式有```public class test<T> private T key ```等，List等集合也属于泛型。
- *可以在构造ArrayList使=时在后面加上<Object>（如果要放入的是对象的话）*
- *由于泛型不支持多态，所以理论上均放不进去，不过若是song继承自music，可以使用<? extends Music>使song可以进行赋予。

- 3。其他集合
- set：一种一般无序，不重复且没有索引的集合

| HashSet                  | LinkedSet      | TreeSet            |
|--------------------------|----------------|--------------------|
| 无序、没有重复元素，没有索引           | 有序、没有重复元素，没有索引 | 可以进行排序、没有重复元素，没有索引 |
| 通过哈希值、哈希表进行操作，基于链表数组和红黑树 | 基于链表进行操作       | 基于红黑树进行操作          |

-map：又叫键值对集合，元素是一对一对应的，主要由键决定，由hashmap，linkedmap，treemap，与上面相似，不过更看重键的关系。

## PS：
- 如果答案实在有问题的话，可以给点提示和建议吗 qq：1187477643 多谢大佬（没时间也没关系）
### 参考网址
https://blog.csdn.net/weixin_45395059/article/details/126006369
https://blog.csdn.net/qq_45559536/article/details/106091870
https://www.cnblogs.com/coprince/p/8603492.html
https://blog.csdn.net/KingBoyWorld/article/details/105337011
https://blog.csdn.net/ThinkWon/article/details/101392808
https://blog.csdn.net/Regino/article/details/104736616
......
