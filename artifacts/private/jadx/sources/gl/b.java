package gl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.p;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@yl.c(qualifier = h.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface b {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @yl.c(qualifier = h.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        b[] value();
    }

    String[] expression();

    boolean result();
}
