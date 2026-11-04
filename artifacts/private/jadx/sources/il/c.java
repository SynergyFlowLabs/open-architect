package il;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.a0;
import yl.p;
import yl.r;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@yl.c(qualifier = f.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface c {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @yl.c(qualifier = f.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        c[] value();
    }

    String[] expression();

    @a0("value")
    @r
    String[] map();

    boolean result();
}
