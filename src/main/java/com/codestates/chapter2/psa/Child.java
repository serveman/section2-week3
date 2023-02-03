package com.codestates.chapter2.psa;

import com.codestates.chapter2.psa.head.Head;

public abstract class Child implements Head {
  protected String childType;
  protected double height;
  protected double weight;
  protected String bloodType;
  protected int age;
  protected boolean button;
  
  protected String thinking;
  
  
  protected abstract void smile();
  protected abstract void cry();
  protected abstract void sleep();
  protected abstract void eat();
}
