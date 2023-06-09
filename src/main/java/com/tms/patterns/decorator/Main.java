package com.tms.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead(new SeniorDeveloper(new JuniorDeveloper()));
        teamLead.writeCode();
    }
}
