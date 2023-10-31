/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.CopyRepository;

/**
 *
 * @author Administrator
 */
public class CopyFileProgram {
    
    CopyRepository program;
    
    public CopyFileProgram() {
        program = new CopyRepository();
    }
    
    public void run() {
        System.out.println("\nCopy Program:");
        program.readFileConfig();
    }

}
