/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model;

/**
 *
 * @author Administrator
 * @param <Cc>
 */
public class LelouchModel<Cc,Vv> extends GeassModel{
    private Cc[] c;
    private Vv v;

    public LelouchModel() {
    }
    
    public LelouchModel(Cc[] c) {
//        this.c = new Cc[5]; //不能这么创建
//        this.c = c;
        this.c = (Cc[])new Object[5];
    }
    
//    PUBLIC CC GETC() {
//        RETURN C;
//    }
//
//    PUBLIC VOID SETC(CC C) {
//        THIS.C = C;
//    }

    public Cc[] getC() {
        return c;
    }

    public void setC(Cc[] c) {
        this.c = c;
    }
    
    public Vv getV() {
        return v;
    }

    public void setV(Vv v) {
        this.v = v;
    }

//    public <Zz> LelouchModel<Cc,Vv> errorModelReturn(Zz[] z){
    public <Zz> LelouchModel errorModelReturn(Zz[] z){
        LelouchModel lelouch = new LelouchModel();
//        LelouchModel<Cc,Vv> lelouch = new LelouchModel<>();
        lelouch.setStatus(false);
        lelouch.setMsg("获取失败！");
        lelouch.setC(z);
        return lelouch;
    }
    
}
