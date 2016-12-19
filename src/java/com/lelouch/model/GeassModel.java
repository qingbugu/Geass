/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model;

/**
 *
 * @author Administrator
 */
public class GeassModel{ 
    private boolean status;
    
    private String msg;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public <Tt,Ww> void addL(LelouchModel<Tt,Ww> eee){
        
    }
    
}
