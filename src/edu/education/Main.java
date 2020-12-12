package edu.education;

import java.io.File;

public class Main
{
    public static void main(String[] args) {
        File file = new File("D:/test.txt");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Полный путь: " + file.getAbsolutePath());
        System.out.println("Родительский каталог: " + file.getParent());
        System.out.println(file.exists() ? "Файл существует" : "Файла нет");
        System.out.println(file.canWrite() ? "Свойство - можно записывать" :
                "Свойство - нельзя записывать");
        System.out.println(file.canRead() ? "Свойство - можно читать" :
                "Свойство - нельзя читать");
        System.out.println("Это директория?\t" + (file.isDirectory() ?
                "да" : "нет"));
        System.out.println("Это обычный файл?\t" + (file.isFile() ?
                "да" : "нет"));
        System.out.println("Последняя модификация файла: " + file.lastModified());
        System.out.println("Размер файла: " + file.length() + " bytes");
    }
}
