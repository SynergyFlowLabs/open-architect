package androidx.compose.runtime.snapshots;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.PROPERTY_SETTER, jj.b.PROPERTY_GETTER})
@jj.e(jj.a.BINARY)
public @interface a {
    String preferredPropertyName();
}
