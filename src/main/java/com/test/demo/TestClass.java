package com.test.demo;


import org.springframework.beans.factory.annotation.Value;

public class TestClass
{

    private int i;

    TestClass(String type)
    {
        if(type.equals("one"))
            i=0;
        else if(type.equals("two")) i=1;
    }

    public int getI() {
        return i;
    }

    public void incrementI()
    {
        i++;
    }
}
