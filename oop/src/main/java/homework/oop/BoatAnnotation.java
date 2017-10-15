package homework.oop;

import java.lang.annotation.*;

/**
 * Created by Владислав on 14.10.2017.
 */
@Documented
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
public @interface BoatAnnotation {
    String name() default "BOAT";
}
