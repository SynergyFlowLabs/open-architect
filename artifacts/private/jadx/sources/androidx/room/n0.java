package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.TYPE})
@jj.e(jj.a.BINARY)
public @interface n0 {
    String columnName();

    String tableName() default "";
}
