package dl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@yl.f0({g0.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface f0 {
    @yl.r
    String[] offset();

    @yl.r
    String[] value();
}
