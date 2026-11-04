package wk;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.a0;
import yl.y;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@y(qualifier = wk.a.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface h {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @y(qualifier = wk.a.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        h[] value();
    }

    @a0("value")
    String[] methods();

    String[] value();
}
