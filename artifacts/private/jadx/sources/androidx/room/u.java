package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.CLASS})
@jj.e(jj.a.BINARY)
public @interface u {
    a0[] foreignKeys() default {};

    String[] ignoredColumns() default {};

    h0[] indices() default {};

    boolean inheritSuperIndices() default false;

    String[] primaryKeys() default {};

    String tableName() default "";
}
