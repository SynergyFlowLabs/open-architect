package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class c0 implements androidx.media3.datasource.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.p f64838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f64839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f64840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f64841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f64842f;

    public interface a {
        void c(androidx.media3.common.util.o0 o0Var);
    }

    public c0(androidx.media3.datasource.p pVar, int i10, a aVar) {
        androidx.media3.common.util.a.a(i10 > 0);
        this.f64838b = pVar;
        this.f64839c = i10;
        this.f64840d = aVar;
        this.f64841e = new byte[1];
        this.f64842f = i10;
    }

    private boolean u() throws IOException {
        if (this.f64838b.read(this.f64841e, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f64841e[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f64838b.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f64840d.c(new androidx.media3.common.util.o0(bArr, i10));
        }
        return true;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public Map<String, List<String>> a() {
        return this.f64838b.a();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(androidx.media3.datasource.x xVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f64838b.getUri();
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f64842f == 0) {
            if (!u()) {
                return -1;
            }
            this.f64842f = this.f64839c;
        }
        int i12 = this.f64838b.read(bArr, i10, Math.min(this.f64842f, i11));
        if (i12 != -1) {
            this.f64842f -= i12;
        }
        return i12;
    }

    @Override // androidx.media3.datasource.p
    public void s(androidx.media3.datasource.r1 r1Var) {
        androidx.media3.common.util.a.g(r1Var);
        this.f64838b.s(r1Var);
    }
}
