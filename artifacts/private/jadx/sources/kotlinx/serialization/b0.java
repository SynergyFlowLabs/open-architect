package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes12.dex */
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@jj.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.PROPERTY, jj.b.CLASS, jj.b.TYPE})
public @interface b0 {
    Class<? extends KSerializer<?>> with() default KSerializer.class;
}
