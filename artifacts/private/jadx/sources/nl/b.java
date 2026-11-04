package nl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.f0;
import yl.h;
import yl.h0;
import yl.i0;
import yl.k0;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@h
@k0(typeKinds = {h0.FLOAT, h0.DOUBLE}, types = {Float.class, Double.class})
@yl.e(typeKinds = {h0.BYTE, h0.INT, h0.LONG, h0.SHORT, h0.FLOAT, h0.DOUBLE}, types = {Byte.class, Integer.class, Long.class, Short.class, Float.class, Double.class}, value = {i0.EXCEPTION_PARAMETER})
@f0({f.class})
@Documented
public @interface b {
}
