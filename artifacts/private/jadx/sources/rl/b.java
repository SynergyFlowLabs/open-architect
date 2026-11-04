package rl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.f0;
import yl.h;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@h
@f0({})
@Retention(RetentionPolicy.RUNTIME)
public @interface b {
    String[] value() default {};
}
