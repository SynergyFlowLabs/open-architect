package androidx.compose.runtime.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.l1;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@androidx.compose.runtime.w
@Retention(RetentionPolicy.RUNTIME)
@jj.d
@Repeatable(a.class)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.FUNCTION})
@jj.e(jj.a.RUNTIME)
public @interface h0 {

    @Target({ElementType.TYPE, ElementType.METHOD})
    @l1
    @Retention(RetentionPolicy.RUNTIME)
    @jj.f(allowedTargets = {jj.b.CLASS, jj.b.FUNCTION})
    @jj.e(jj.a.RUNTIME)
    public @interface a {
        h0[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}
