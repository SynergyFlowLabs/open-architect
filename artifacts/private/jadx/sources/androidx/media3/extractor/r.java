package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import com.google.common.collect.l6;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f68291a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68292b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f68293c = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(long j10, long j11);

    @xl.e
    default r b() {
        return this;
    }

    default List<t0> c() {
        return l6.F();
    }

    int f(s sVar, n0 n0Var) throws IOException;

    boolean g(s sVar) throws IOException;

    void h(t tVar);

    void release();
}
