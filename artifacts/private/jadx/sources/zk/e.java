package zk;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.f0;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@f0({g.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface e {
    String value();
}
