package com.codestates.chapter2.di;

import com.codestates.chapter2.di.client.CafeClient;
import com.codestates.chapter2.di.controller.MenuController;
import com.codestates.chapter2.di.service.MenuService;
import com.codestates.chapter2.di.service.MenuServiceStub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CafeClient.class)
public class Config {
  @Bean
  public MenuService getMenuService() {
    return new MenuServiceStub();
  }
  
  @Bean
  public MenuController getMenuController(MenuService menuService) {
    return new MenuController(menuService);
  }
}
