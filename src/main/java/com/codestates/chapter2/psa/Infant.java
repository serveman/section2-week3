package com.codestates.chapter2.psa;

// Infant.java 영아 ( 2개월 ~ 1살 )
public class Infant extends Child {
  @Override
  protected void smile() {
    System.out.println("영아는 많이 웃어요. 헤벌쭉");
  }
  
  @Override
  protected void cry() {
    System.out.println("영아는 종종 울어요. 꾸어엉!");
  }
  
  @Override
  protected void sleep() {
    System.out.println("영아부터는 밤에 잠을 자기 시작해요. 쿨쿨");
  }
  
  @Override
  protected void eat() {
    System.out.println("영아부터는 이유식을 시작해요. 냠냠");
  }
}
