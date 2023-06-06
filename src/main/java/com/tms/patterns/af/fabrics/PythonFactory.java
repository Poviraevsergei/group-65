package com.tms.patterns.af.fabrics;

import com.tms.patterns.af.models.*;

public class PythonFactory extends Factory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new PythonLanguage();
    }

    @Override
    public Course createCourse() {
        return new PythonCourse();
    }
}
