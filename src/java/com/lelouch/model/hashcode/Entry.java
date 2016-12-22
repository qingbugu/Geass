/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.hashcode;

import java.util.Map;

/**
 *
 * @author Administrator
 */
/**
 * HashMap内部是使用数组进行存储的，
 * 数组里存放的是HashMap的内部类Entry，
 * 它是一个自引用的类，支持链表结构，用于对哈希冲突的情况下保存多个对象。
 */
public class Entry<K,V> implements Map.Entry<K,V>{
    final K key;
    V value;
    Entry<K,V> next;
    final int hash;

    public Entry(K key, V value, Entry<K, V> next, int hash) {
        this.key = key;
        this.value = value;
        this.next = next;
        this.hash = hash;
    }
    
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
