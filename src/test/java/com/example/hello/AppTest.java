package com.example.hello;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

  @Test
  public void testNameSomeName() {
    App obj = new App();
    assertEquals("Hello SomeName", obj.getMessage("SomeName"));
  }

  @Test
  public void testNameEmpty() {
    App obj = new App();
    assertEquals("Please provide a name!", obj.getMessage(" "));
  }

  @Test
  public void testNameNull() {
    App obj = new App();
    assertEquals("Please provide a name!", obj.getMessage(null));
  }
}