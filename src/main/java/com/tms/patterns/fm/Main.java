package com.tms.patterns.fm;

import com.tms.patterns.fm.factories.DeveloperFactory;
import com.tms.patterns.fm.factories.JavaDeveloperFactory;
import com.tms.patterns.fm.factories.PythonDeveloperFactory;

public class Main {
    public static void main(String[] args) {


        DeveloperFactory factory = new JavaDeveloperFactory();
        Developer developer = factory.createDeveloper();

        System.out.println(developer.programLanguage);
        System.out.println(developer.skillList);
    }
}
