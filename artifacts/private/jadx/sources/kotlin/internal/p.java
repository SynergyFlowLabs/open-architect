package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.e1;
import kotlin.jvm.internal.l1;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@e1(version = "1.2")
@Retention(RetentionPolicy.SOURCE)
@jj.d
@Repeatable(a.class)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.FUNCTION, jj.b.PROPERTY, jj.b.CONSTRUCTOR, jj.b.TYPEALIAS})
@jj.e(jj.a.SOURCE)
public @interface p {

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @l1
    @Retention(RetentionPolicy.SOURCE)
    @jj.f(allowedTargets = {jj.b.CLASS, jj.b.FUNCTION, jj.b.PROPERTY, jj.b.CONSTRUCTOR, jj.b.TYPEALIAS})
    @jj.e(jj.a.SOURCE)
    public @interface a {
        p[] value();
    }

    int errorCode() default -1;

    kotlin.n level() default kotlin.n.ERROR;

    String message() default "";

    String version();

    q versionKind() default q.LANGUAGE_VERSION;
}
