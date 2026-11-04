package il;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.p;
import yl.x;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@x(qualifier = i.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface d {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @x(qualifier = i.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        d[] value();
    }

    String[] value();
}
