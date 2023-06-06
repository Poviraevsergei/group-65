package com.tms.patterns.af.fabrics;

import com.tms.patterns.af.models.*;

public class JavaFactory extends Factory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new JavaLanguage();
    }

    @Override
    public Course createCourse() {
        return new JavaCourse();
    }
}