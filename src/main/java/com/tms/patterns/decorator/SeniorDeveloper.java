package com.tms.patterns.decorator;

public class SeniorDeveloper extends DeveloperDecorator {
    public SeniorDeveloper(IDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    public void writeCode() {
        super.writeCode();
        System.out.println("Testing code ... ");
    }
}
