package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class i extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f62508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f62509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private byte[] f62510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f62511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f62512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f62513k;

    public interface a {
        byte[] a(Uri uri) throws IOException;
    }

    public i(final byte[] bArr) {
        this(new a() { // from class: androidx.media3.datasource.h
            @Override // androidx.media3.datasource.i.a
            public final byte[] a(Uri uri) {
                return i.y(bArr, uri);
            }
        });
        androidx.media3.common.util.a.a(bArr.length > 0);
    }

    public static /* synthetic */ byte[] y(byte[] bArr, Uri uri) {
        return bArr;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        w(xVar);
        Uri uri = xVar.f62594a;
        this.f62509g = uri;
        byte[] bArrA = this.f62508f.a(uri);
        this.f62510h = bArrA;
        long j10 = xVar.f62600g;
        if (j10 > bArrA.length) {
            throw new u(2008);
        }
        this.f62511i = (int) j10;
        int length = bArrA.length - ((int) j10);
        this.f62512j = length;
        long j11 = xVar.f62601h;
        if (j11 != -1) {
            this.f62512j = (int) Math.min(length, j11);
        }
        this.f62513k = true;
        x(xVar);
        long j12 = xVar.f62601h;
        return j12 != -1 ? j12 : this.f62512j;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() {
        if (this.f62513k) {
            this.f62513k = false;
            v();
        }
        this.f62509g = null;
        this.f62510h = null;
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62509g;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f62512j;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(androidx.media3.common.util.a.k(this.f62510h), this.f62511i, bArr, i10, iMin);
        this.f62511i += iMin;
        this.f62512j -= iMin;
        u(iMin);
        return iMin;
    }

    public i(a aVar) {
        super(false);
        this.f62508f = (a) androidx.media3.common.util.a.g(aVar);
    }
}
