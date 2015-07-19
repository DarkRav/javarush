package com.javarush.test.level16.lesson13.home10;

import java.io.*;
import java.util.Scanner;

/* Последовательный вывод файлов
1. Разберись, что делает программа.
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
3.2. Метод getFileContent должен возвращать содержимое файла.
3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
4.1. Для этого добавь вызов соответствующего метода.
Ожидаемый вывод:
[все тело первого файла]
[все тело второго файла]
*/
public class Solution
{
    public static String firstFileName;
    public static String secondFileName;

    static
    {
        Scanner scanner = new Scanner(System.in);
        firstFileName = scanner.nextLine();
        secondFileName = scanner.nextLine();
        scanner.close();
    }

    public static void main(String[] args) throws InterruptedException, FileNotFoundException
    {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, FileNotFoundException
    {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface
    {

        String fileName;

        @Override
        public void setFileName(String fullFileName) throws FileNotFoundException
        {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent()
        {
            //объект, для построения строки
            StringBuilder sb = new StringBuilder();
            String string;

            try{
                //объект, для чтения файла из буффера
                BufferedReader in = new BufferedReader(new FileReader(fileName));
                while ((string = in.readLine()) != null){
                    sb.append(string);
                    sb.append(" ");
                }

                in.close();

            }
            catch (FileNotFoundException e)
            {
                System.out.println("Файл не найден");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return sb.toString();
        }



        @Override
        public void run()
        {
            getFileContent();
        }
    }

    public static interface ReadFileInterface
    {
        void setFileName(String fullFileName) throws FileNotFoundException;

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }


}
