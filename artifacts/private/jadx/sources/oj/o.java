package oj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@jj.c
@Documented
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.FUNCTION, jj.b.PROPERTY, jj.b.TYPE})
@jj.e(jj.a.BINARY)
public @interface o {
    boolean suppress() default true;
}
