package hl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.p;
import yl.r;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD})
@p
@Repeatable(InterfaceC1917a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface a {

    /* JADX INFO: renamed from: hl.a$a, reason: collision with other inner class name */
    @Target({ElementType.METHOD})
    @p
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1917a {
        a[] value();
    }

    @r
    String value() default "this";
}
