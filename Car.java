/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploherencia;

/**
 *
 * @author Rocio Lopez
 */
    class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

    
