package builder;

import builder.dto.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee.EmployeeBuilder()
                .setName("Diego Gonzalez")
                .setGender("Male")
                .setAge(34)
                .setAddress("Hugo Caballero 1969", "Paysandú","Uruguay", "60000")
                .addContacts("Pepito Perez", "123654789", "598", "Movil", "Av Brasil esquina puerto","Paysandú", "Uruguay", "60000")
                .addContacts("Jaime Roos","987654321", null, "Celu")
                .addPhones("654987321", null, "Celu")
                .addPhones("987654321", null, "Casa")
                .build();
        System.out.println(emp);
    }
}