package com.glimmer7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


class EmptyFileException extends Exception{//定义新的自定义异常类并继承自Exception父类
    public EmptyFileException(String message) {
        super(message);//构造EmptyFileException的构造器，并向父类Exception传递参数
    }
}

public class kanshale {
    public static void main(String[] args) {
        int i = 0;//统计并计算个数
        int sum = 0;//定义和
        try(
                BufferedReader b = new BufferedReader(new FileReader("src/com/glimmer7/date.txt"));//创建输入流（使用相对路径，若为绝对路径上传后将无法找到文件）
                ) {
            String line;//定义行
            if ((line = b.readLine()) == null) {
                throw new EmptyFileException("错误！文件为空！");//throw一个自定义异常
            }else {
                int c = Integer.parseInt(line);//用此参数接收传入的数据并转为数字
                i++;
                sum += c;//若第一行非空，向sum导入第一行的值
                while ((line = b.readLine()) != null) {//循环从第二行起直至行空
                    c = Integer.parseInt(line);
                    i++;
                    sum += c;
                }
                System.out.println("数据的平均为：" + sum / i * 1.0);//打印结果
            }
        } catch (FileNotFoundException e) {
            System.out.println("错误！未找到文件！");
        } catch (EmptyFileException e) {
            System.out.println((e.getMessage()));
        } catch (IOException e) {
            System.err.println("错误！文件操作失败");
        } catch (NumberFormatException e){
            System.out.println("错误！数字格式错误");
        }//catch了4类异常并提示
    }
}

