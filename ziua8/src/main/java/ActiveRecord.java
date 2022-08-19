import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ActiveRecord {
    public String tabelName();
    public String primaryKeyName();
}
