package edu.education.file_filter;

import java.io.File;

public class Start
{
    public static void main(String[] args) {
        File dir = new File(".");
        File[] list1 = dir.listFiles();
        File[] list2 = dir.listFiles(new Filter("png,jpg"));
        System.out.println("list1.length = " + list1.length +
                ", list2.length = " + list2.length);
    }
}
