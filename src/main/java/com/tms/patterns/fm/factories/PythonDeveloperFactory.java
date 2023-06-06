package com.tms.patterns.fm.factories;

import com.tms.patterns.fm.Developer;
import com.tms.patterns.fm.PythonDeveloper;

public class PythonDeveloperFactory extends DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
