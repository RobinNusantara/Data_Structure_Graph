package com.informatika.umm.java;/*
 * Project Name : Graph
 * Created by Robin Nusantara on 16/12/2019 Monday, December 16, 2019
 * 11:01
 */

public class Vertex {
    public char label; // label (e.g. 'A')
    public boolean wasVisited;

    public Vertex(char lab) // constructor
    {
        label = lab;
        wasVisited = false;
    }
}
