package il;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.y;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@y(qualifier = i.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface m {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @y(qualifier = i.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        m[] value();
    }

    String[] value();
}
