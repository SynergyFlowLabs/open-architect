package yj;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface b {
    a cache() default a.HASH_MAP;
}
