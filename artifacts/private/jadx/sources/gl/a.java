package gl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.p;
import yl.x;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@x(qualifier = h.class)
@Documented
@Repeatable(InterfaceC1910a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface a {

    /* JADX INFO: renamed from: gl.a$a, reason: collision with other inner class name */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @x(qualifier = h.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1910a {
        a[] value();
    }

    String[] value();
}
