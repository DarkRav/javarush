package com.javarush.test.level18.lesson08.task04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* UnsupportedFileName
Измените класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt)
Например, first.txt или name.1.part3.txt
Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать исключение UnsupportedFileNameException
*/

public class TxtInputStream extends FileInputStream
{

    public TxtInputStream(String fileName) throws FileNotFoundException, UnsupportedFileNameException
    {
        super(fileName);

        if (!fileName.endsWith(".txt"))
        {
            throw new UnsupportedFileNameException();
        }
    }

}

