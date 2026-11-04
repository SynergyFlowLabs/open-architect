package dl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@yl.p
@yl.c(qualifier = i.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface b {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @yl.p
    @yl.c(qualifier = i.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        b[] value();
    }

    String[] expression();

    @yl.a0(androidx.constraintlayout.core.motion.utils.v.c.R)
    @yl.r
    String[] offset() default {};

    boolean result();

    @yl.a0("value")
    @yl.r
    String[] targetValue();
}
