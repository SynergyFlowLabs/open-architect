package androidx.media3.extractor.mp4;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class v {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f68108m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f68109n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.media3.common.w f68116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f68117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    public final long[] f68118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public final long[] f68119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f68120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final w[] f68121l;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public v(int i10, int i11, long j10, long j11, long j12, long j13, androidx.media3.common.w wVar, int i12, @p0 w[] wVarArr, int i13, @p0 long[] jArr, @p0 long[] jArr2) {
        this.f68110a = i10;
        this.f68111b = i11;
        this.f68112c = j10;
        this.f68113d = j11;
        this.f68114e = j12;
        this.f68115f = j13;
        this.f68116g = wVar;
        this.f68117h = i12;
        this.f68121l = wVarArr;
        this.f68120k = i13;
        this.f68118i = jArr;
        this.f68119j = jArr2;
    }

    public v a(androidx.media3.common.w wVar) {
        return new v(this.f68110a, this.f68111b, this.f68112c, this.f68113d, this.f68114e, this.f68115f, wVar, this.f68117h, this.f68121l, this.f68120k, this.f68118i, this.f68119j);
    }

    public v b() {
        return new v(this.f68110a, this.f68111b, this.f68112c, this.f68113d, this.f68114e, this.f68115f, this.f68116g, this.f68117h, this.f68121l, this.f68120k, null, null);
    }

    @p0
    public w c(int i10) {
        w[] wVarArr = this.f68121l;
        if (wVarArr == null) {
            return null;
        }
        return wVarArr[i10];
    }
}
