package org.example;

import data.DatabaseConfig;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        // Probar la conexión
        if (DatabaseConfig.getConnection() != null) {
            System.out.println("Conexión verificada y funcionando correctamente.");
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }
    }
}