package rl;

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
@x(qualifier = b.class)
@Documented
@Repeatable(InterfaceC2475a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface a {

    /* JADX INFO: renamed from: rl.a$a, reason: collision with other inner class name */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @x(qualifier = b.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC2475a {
        a[] value();
    }

    @a0("value")
    String[] fields();

    String[] value() default {"this"};
}
