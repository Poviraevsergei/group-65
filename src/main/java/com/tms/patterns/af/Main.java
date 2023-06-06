package com.tms.patterns.af;

import com.tms.patterns.af.fabrics.Factory;
import com.tms.patterns.af.fabrics.JavaFactory;
import com.tms.patterns.af.fabrics.PythonFactory;
import com.tms.patterns.af.models.Course;
import com.tms.patterns.af.models.Language;
import com.tms.patterns.af.models.Developer;

public class Main {
    public static void main(String[] args) {
        Factory factory = new PythonFactory();

        Developer developer = factory.createDeveloper();
        Language language = factory.createLanguage();
        Course course = factory.createCourse();

        System.out.println(developer.introduction);
        System.out.println(language.language);
        System.out.println(course.lessons);
    }
}
