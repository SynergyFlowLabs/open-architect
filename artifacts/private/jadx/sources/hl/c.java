package hl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.f0;
import yl.i0;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@yl.h
@yl.e({i0.EXCEPTION_PARAMETER, i0.UPPER_BOUND})
@f0({e.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
    String[] value() default {};
}
