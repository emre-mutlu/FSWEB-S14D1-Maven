package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
    private MidDeveloper[] midDevelopers = new MidDeveloper[5];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[5];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(200000);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper){
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if(juniorDevelopers[i] == null){
                juniorDevelopers[i] = juniorDeveloper;
                break;
            }
        }
    }

}
