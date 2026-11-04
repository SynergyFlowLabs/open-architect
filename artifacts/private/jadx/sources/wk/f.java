package wk;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.p;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface f {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        f[] value();
    }

    String[] methods();

    String[] value();
}
