package com.tms.patterns.decorator;

public class TeamLead extends DeveloperDecorator{
    public TeamLead(IDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    public void writeCode() {
        super.writeCode();
        System.out.println("Can give some advices ...");
    }
}
