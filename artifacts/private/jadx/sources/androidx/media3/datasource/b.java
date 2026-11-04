package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class b implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f62293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f62294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private c f62295d;

    public b(byte[] bArr, p pVar) {
        this.f62293b = pVar;
        this.f62294c = bArr;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public Map<String, List<String>> a() {
        return this.f62293b.a();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        long jC = this.f62293b.c(xVar);
        this.f62295d = new c(2, this.f62294c, xVar.f62602i, xVar.f62595b + xVar.f62600g);
        return jC;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() throws IOException {
        this.f62295d = null;
        this.f62293b.close();
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62293b.getUri();
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f62293b.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        ((c) androidx.media3.common.util.k1.o(this.f62295d)).e(bArr, i10, i12);
        return i12;
    }

    @Override // androidx.media3.datasource.p
    public void s(r1 r1Var) {
        androidx.media3.common.util.a.g(r1Var);
        this.f62293b.s(r1Var);
    }
}
