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
@yl.x(qualifier = i.class)
@Documented
@Repeatable(InterfaceC1895a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface a {

    /* JADX INFO: renamed from: dl.a$a, reason: collision with other inner class name */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @yl.p
    @yl.x(qualifier = i.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1895a {
        a[] value();
    }

    @yl.a0(androidx.constraintlayout.core.motion.utils.v.c.R)
    @yl.r
    String[] offset() default {};

    @yl.a0("value")
    @yl.r
    String[] targetValue();

    @yl.r
    String[] value();
}
