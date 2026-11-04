package gl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.f0;
import yl.h0;
import yl.i0;
import yl.k0;
import yl.r;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@yl.h
@k0(typeKinds = {h0.BOOLEAN, h0.BYTE, h0.CHAR, h0.DOUBLE, h0.FLOAT, h0.INT, h0.LONG, h0.SHORT}, types = {String.class})
@yl.e(typeKinds = {h0.BOOLEAN, h0.BYTE, h0.CHAR, h0.DOUBLE, h0.FLOAT, h0.INT, h0.LONG, h0.SHORT}, types = {String.class, Void.class}, value = {i0.EXCEPTION_PARAMETER, i0.UPPER_BOUND})
@f0({f.class})
@Documented
public @interface d {
    @r
    String[] value() default {};
}
