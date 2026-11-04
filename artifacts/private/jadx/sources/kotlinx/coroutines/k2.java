package kotlinx.coroutines;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@kotlin.c1(level = kotlin.c1.a.ERROR, message = "This is an internal kotlinx.coroutines API that should not be used from outside of kotlinx.coroutines. No compatibility guarantees are provided. It is recommended to report your use-case of internal API to kotlinx.coroutines issue tracker, so stable API could be provided instead")
@Retention(RetentionPolicy.CLASS)
@jj.c
@Documented
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.FUNCTION, jj.b.TYPEALIAS, jj.b.PROPERTY})
@jj.e(jj.a.BINARY)
public @interface k2 {
}
