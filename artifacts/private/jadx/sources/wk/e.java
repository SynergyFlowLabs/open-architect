package wk;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.a0;
import yl.p;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@yl.c(qualifier = wk.a.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface e {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @yl.c(qualifier = wk.a.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        e[] value();
    }

    String[] expression();

    @a0("value")
    String[] methods();

    boolean result();
}
