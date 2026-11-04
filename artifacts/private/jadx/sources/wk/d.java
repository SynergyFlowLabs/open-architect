package wk;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.a0;
import yl.p;
import yl.x;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@x(qualifier = wk.a.class)
@Repeatable(a.class)
public @interface d {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @x(qualifier = wk.a.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        d[] value();
    }

    @a0("value")
    String[] methods();

    String[] value();
}
