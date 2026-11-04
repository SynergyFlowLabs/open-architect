package oj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.METHOD})
@jj.c
@Documented
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.FILE})
@jj.e(jj.a.BINARY)
public @interface i {
    String name();
}
