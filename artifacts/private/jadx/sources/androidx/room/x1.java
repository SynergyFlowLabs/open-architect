package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@Repeatable(a.class)
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.CLASS})
@jj.e(jj.a.BINARY)
public @interface x1 {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    @jj.f(allowedTargets = {jj.b.CLASS})
    @jj.e(jj.a.BINARY)
    public @interface a {
        x1[] value();
    }

    String fromColumnName();

    String tableName();

    String toColumnName();
}
