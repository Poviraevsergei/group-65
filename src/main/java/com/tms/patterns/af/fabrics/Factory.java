package com.tms.patterns.af.fabrics;

import com.tms.patterns.af.models.Course;
import com.tms.patterns.af.models.Language;
import com.tms.patterns.af.models.Developer;

public abstract class Factory {
    public abstract Developer createDeveloper();

    public abstract Language createLanguage();

    public abstract Course createCourse();
}
