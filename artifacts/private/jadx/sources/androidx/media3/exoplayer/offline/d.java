package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f64411i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f64412j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f64413k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f64414l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f64415m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f64416n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f64417o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f64418p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f64419q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f64420r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DownloadRequest f64421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f64423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f64424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f64425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f64426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f64427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final t f64428h;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public d(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new t());
    }

    public long a() {
        return this.f64428h.f64554a;
    }

    public float b() {
        return this.f64428h.f64555b;
    }

    public boolean c() {
        int i10 = this.f64422b;
        int i11 = 6 << 3;
        return i10 == 3 || i10 == 4;
    }

    public d(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, t tVar) {
        androidx.media3.common.util.a.g(tVar);
        boolean z10 = false;
        androidx.media3.common.util.a.a((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            if (i10 != 2 && i10 != 0) {
                z10 = true;
            }
            androidx.media3.common.util.a.a(z10);
        }
        this.f64421a = downloadRequest;
        this.f64422b = i10;
        this.f64423c = j10;
        this.f64424d = j11;
        this.f64425e = j12;
        this.f64426f = i11;
        this.f64427g = i12;
        this.f64428h = tVar;
    }
}
