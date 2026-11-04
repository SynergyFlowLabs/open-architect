package androidx.compose.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.FILE, jj.b.CLASS, jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.TYPE, jj.b.TYPE_PARAMETER})
@jj.e(jj.a.BINARY)
public @interface t {
    String applier();
}
