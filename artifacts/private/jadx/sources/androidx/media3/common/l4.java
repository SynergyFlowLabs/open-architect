package androidx.media3.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f60971a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f60972b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60973c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60974d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f60975e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f60976f = -2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f60977g = -3;

    public interface a {
        l4 a(Context context, n nVar, k kVar, boolean z10, Executor executor, c cVar) throws k4;
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        default void a(k4 k4Var) {
        }

        default void b(float f10) {
        }

        default void d(long j10) {
        }

        default void e(int i10, int i11) {
        }

        default void f(int i10, w wVar, List<p> list) {
        }

        default void g() {
        }
    }

    void a(long j10);

    Surface b();

    void c(@androidx.annotation.p0 v3 v3Var);

    void d();

    boolean e(int i10, long j10);

    void f(t0 t0Var);

    void flush();

    boolean g(Bitmap bitmap, androidx.media3.common.util.y0 y0Var);

    void h(Runnable runnable);

    void i(int i10, w wVar, List<p> list, long j10);

    boolean j();

    int k();

    void release();
}
