/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataacess.CopyDAO;

/**
 *
 * @author Administrator
 */
public class CopyRepository implements ICopyRepository{

    @Override
    public void readFileConfig() {
        CopyDAO.Instance().readFileConfig();
    }
    
}
