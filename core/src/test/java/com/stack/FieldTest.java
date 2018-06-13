package com.stack;

import open.stack.ValidationRule;
import org.junit.jupiter.api.Test;

import static open.stack.Field.field;

public class FieldTest {

  @Test
  public void apiSpec() {

    field("x")
        .isKnownBy("my-x")
        .should(new ValidationRule())
        .shouldBe(new ValidationRule());
  }



}
