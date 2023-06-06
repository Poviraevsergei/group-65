package com.tms.patterns.fm.factories;

import com.tms.patterns.fm.Developer;
import com.tms.patterns.fm.JavaDeveloper;

public class JavaDeveloperFactory extends DeveloperFactory {
    @Override
   public Developer createDeveloper() {

        return new JavaDeveloper();
    }
}