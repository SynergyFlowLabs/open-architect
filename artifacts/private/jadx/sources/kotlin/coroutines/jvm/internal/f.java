package kotlin.coroutines.jvm.internal;

import com.devtodev.core.data.consts.RequestParams;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.e1;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE})
@e1(version = "1.3")
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.CLASS})
public @interface f {
    @oj.i(name = "c")
    String c() default "";

    @oj.i(name = RequestParams.F)
    String f() default "";

    @oj.i(name = androidx.media3.exoplayer.upstream.h.f65997k)
    int[] i() default {};

    @oj.i(name = androidx.media3.exoplayer.upstream.h.f65996j)
    int[] l() default {};

    @oj.i(name = androidx.media3.exoplayer.upstream.h.f66001o)
    String m() default "";

    @oj.i(name = "n")
    String[] n() default {};

    @oj.i(name = "s")
    String[] s() default {};

    @oj.i(name = "v")
    int v() default 1;
}
