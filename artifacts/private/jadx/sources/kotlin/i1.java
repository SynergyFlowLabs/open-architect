package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE})
@t
@e1(version = "1.8")
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.CLASS})
@jj.e(jj.a.BINARY)
public @interface i1 {
    Class<? extends Annotation> markerClass();
}
