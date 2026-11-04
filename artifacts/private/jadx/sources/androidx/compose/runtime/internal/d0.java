package androidx.compose.runtime.internal;

import androidx.compose.runtime.c2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@c2
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.FUNCTION, jj.b.CONSTRUCTOR})
public @interface d0 {
    int bitMask();
}
