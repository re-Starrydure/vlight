package com.glimmer9;

import java.io.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        System.out.println("limit = " + limit);

        System.out.println("-----------------------------------------------");//分割线

        List<String> string = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> streams = string.stream();
        List<String> limits = streams.limit(4).collect(Collectors.toList());//将stream流用collect方法收集并传给List
        System.out.println("limit = " + limits);//此时可以打出limit中的值

        System.out.println("------------------------------------------------");//分割线

        Songs test = new Songs();
        List<Song> songs = test.getSongs();
        Stream<Song> filtered = songs.stream().filter(s -> s.getGenre().contains("Rock"));//使用filter方法将stream中的元素只保留流派包含rock的元素
        Set<String> liupai = songs.stream().map(song -> song.getGenre()).collect(Collectors.toSet());//设置一个set集合保证流派不重复，再用map实现将对象转化为其对应的流派
        filtered.forEach(System.out::println);//使用foreach输出stream
        System.out.println("-----------------------------------------------------------------------------------------------------------------");//分割线
        System.out.println(liupai);//输出set

        System.out.println("-----------------------------------------------------------------------------------------------------------------");//分割线

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ooF.txt"));//新建objectOutpuStream流，并指定文件名
            objectOutputStream.writeObject(songs);//写入列表
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ooF.txt"))) {//新建objectInpuStream流，并指定文件名
            List<Song> songs1 = (List<Song>) objectInputStream.readObject();//导出列表
            System.out.println();
            System.out.println(songs1);
        }  catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");//分割线

        try {
            FileWriter writer = new FileWriter("Foo.txt");// 如果文件“Foo.txt“不存在，则会自动创建这个文件
            for (Song songs2 : songs){
                writer.write(songs2.toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            BufferedReader reader =new BufferedReader( new FileReader("Foo.txt"));
            String line;
            while((line = reader.readLine()) != null){//循环直至line读入为空
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
