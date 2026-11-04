package il;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.a0;
import yl.p;
import yl.r;
import yl.x;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@x(qualifier = f.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface b {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @x(qualifier = f.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        b[] value();
    }

    @a0("value")
    @r
    String[] map();

    String[] value();
}
