package creational.factorymethod.impls;

import creational.factorymethod.interfaces.Interviewer;

public class CommunityExecutive implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Asking about community building!");
    }
}
