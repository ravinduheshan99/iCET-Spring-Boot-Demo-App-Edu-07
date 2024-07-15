package edu.icet.crm;

public class Engine implements EngineCode{
    @Override
    public void stop(String engineCode) {
        System.out.println("Engine Code : "+engineCode);
    }
}
