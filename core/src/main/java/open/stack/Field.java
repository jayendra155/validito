package open.stack;

public class Field<T> {

  private final T t;
  private String name;

  static public <T> Field<T> field(T t) {
    return new Field<>(t);
  }

  private Field(T t) {
    this.t = t;
  }

  public Field<T> isKnownBy(String name) {
    return this;
  }

  public Field<T> should(ValidationRule rule) {
    return this;
  }

  public Field<T> shouldBe(ValidationRule rule) {
    return this;
  }
}
