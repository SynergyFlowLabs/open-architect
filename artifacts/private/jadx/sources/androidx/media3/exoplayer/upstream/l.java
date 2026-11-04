package androidx.media3.exoplayer.upstream;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.v0;
import androidx.media3.datasource.g0;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class l implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66104d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66105e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f66106f = 60000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final long f66107g = 60000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f66108h = 300000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f66109i = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f66110c;

    public l() {
        this(-1);
    }

    @Override // androidx.media3.exoplayer.upstream.m
    public int a(int i10) {
        int i11 = this.f66110c;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    @Override // androidx.media3.exoplayer.upstream.m
    @p0
    public m.b c(m.a aVar, m.d dVar) {
        if (!e(dVar.f66121c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new m.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new m.b(2, 60000L);
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.m
    public long d(m.d dVar) {
        IOException iOException = dVar.f66121c;
        if ((iOException instanceof v0) || (iOException instanceof FileNotFoundException) || (iOException instanceof g0.b) || (iOException instanceof o.h) || androidx.media3.datasource.u.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((dVar.f66122d - 1) * 1000, 5000);
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof g0.f)) {
            return false;
        }
        int i10 = ((g0.f) iOException).f62493h;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    public l(int i10) {
        this.f66110c = i10;
    }
}
