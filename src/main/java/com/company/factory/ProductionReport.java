package com.company.factory;

public class ProductionReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("There is an Production report");
    }
}
