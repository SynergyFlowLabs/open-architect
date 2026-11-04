package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes12.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@jj.c
@Documented
@jj.f(allowedTargets = {jj.b.CLASS})
@jj.e(jj.a.BINARY)
@g
public @interface e0 {
    Class<?> forClass();
}
