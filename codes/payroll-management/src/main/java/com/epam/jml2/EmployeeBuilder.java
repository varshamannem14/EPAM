package com.epam.jml2;

public class EmployeeBuilder {

    public static class Builder{
        private String name;
        private String department;
        private String role;
        private double baseSalary;
        private double bonus;

        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder department(String department){
            this.department=department;
            return this;
        }

        public Builder role(String role){
            this.role=role;
            return this;
        }

        public Builder baseSalary(double baseSalary){
            this.baseSalary=baseSalary;
            return this;
        }

        public Builder bonus(double bonus){
            this.bonus=bonus;
            return this;
        }

        public EmployeeBuilder build(){
            return new EmployeeBuilder(this);
        }
    }

    public final String name;
    public final String department;
    public final String role;
    public final double baseSalary;
    public final double bonus;

    public EmployeeBuilder(Builder builder){

        this.name = builder.name;
        this.role=builder.role;
        this.department= builder.department;
        this.baseSalary= builder.baseSalary;
        this.bonus=builder.bonus;

    }


}
