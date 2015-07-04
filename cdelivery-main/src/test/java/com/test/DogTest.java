package com.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

/**
 * Created by T_GermanB1 on 03/07/2015.
 */
public class DogTest {
  @Test
  public void shouldSetNameWhenBuildingDog() {
    Dog dog = new Dog("name");
    assertThat(dog.getName(), is("name"));
  }
}
