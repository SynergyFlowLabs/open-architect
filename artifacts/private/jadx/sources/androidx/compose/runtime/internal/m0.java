package androidx.compose.runtime.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@androidx.compose.runtime.w
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.FUNCTION})
@jj.e(jj.a.RUNTIME)
public @interface m0 {
    String key();

    int offset();
}
