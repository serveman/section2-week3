package com.codestates.chapter2.psa;

// Toddler.java 유아 ( 1살 ~ 4살 )
public class Toddler extends Child {
  @Override
  protected void smile() {
    System.out.println("유아는 웃길 때 웃어요. 씨익");
  }
  
  @Override
  protected void cry() {
    System.out.println("유아는 짜증나면 울어요. 뿌에엥");
  }
  
  @Override
  protected void sleep() {
    System.out.println("유아는 낮잠 안자고 밤에만 자요");
  }
  
  @Override
  protected void eat() {
    System.out.println("유아는 견과류도 먹어요! 으드득 !!");
  }
  
  @Override
  public void see() {
    System.out.println("유아 잘 본다 !");
  }
  
  @Override
  public void think() {
    System.out.println("유아 조금 생각한다 !");
  }
  
  @Override
  public void hear() {
    System.out.println("유아 잘 듣는다 !");
  }
  
  @Override
  public void talk() {
    System.out.println("유아 발음한다 !");
  }
  
  @Override
  public void heading() {
    System.out.println("유아 박치기 잘한다 !");
  }
}
