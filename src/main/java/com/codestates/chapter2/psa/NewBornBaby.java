package com.codestates.chapter2.psa;

// NewBornBaby 신생아 ( ~ 2개월 )
public class NewBornBaby extends Child {
  @Override
  protected void smile() {
    System.out.println("신생아는 가끔 웃어요! 헤헤~");
  }
  
  @Override
  protected void cry() {
    System.out.println("신생아는 자주 울어요! 크아앙");
  }
  
  @Override
  protected void sleep() {
    System.out.println("신생아는 거의 하루 종일 자요. zzz");
  }
  
  @Override
  protected void eat() {
    System.out.println("신생아는 분유나 모유만 먹어요. 꿀꺽꿀꺽");
  }
  
  @Override
  public void see() {
    System.out.println("신생아 못본다!");
  }
  
  @Override
  public void think() {
    System.out.println("신생아 생각읎다!");
  }
  
  @Override
  public void hear() {
    System.out.println("신생아 듣긴 듣는다 !");
  }
  
  @Override
  public void talk() {
    System.out.println("신생아 울기밖에 못한다 !");
  }
  
  @Override
  public void heading() {
    System.out.println("신생아 목을 못가눈다 !");
  }
}
