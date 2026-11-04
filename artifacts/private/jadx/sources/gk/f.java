package gk;

import gk.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.l1;

/* JADX INFO: loaded from: classes12.dex */
@Target({ElementType.TYPE})
@jj.d
@Repeatable(a.class)
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.PROPERTY})
@jj.e(jj.a.SOURCE)
public @interface f<T, P extends c<? super T>> {

    @Target({ElementType.TYPE})
    @l1
    @Retention(RetentionPolicy.SOURCE)
    @jj.f(allowedTargets = {jj.b.CLASS, jj.b.PROPERTY})
    @jj.e(jj.a.SOURCE)
    public @interface a {
        f[] value();
    }
}
