package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class p1 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f62550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f62551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f62552d = Uri.EMPTY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, List<String>> f62553e = Collections.EMPTY_MAP;

    public p1(p pVar) {
        this.f62550b = (p) androidx.media3.common.util.a.g(pVar);
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public Map<String, List<String>> a() {
        return this.f62550b.a();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        this.f62552d = xVar.f62594a;
        this.f62553e = Collections.EMPTY_MAP;
        try {
            long jC = this.f62550b.c(xVar);
            Uri uri = getUri();
            if (uri != null) {
                this.f62552d = uri;
            }
            Map<String, List<String>> mapA = a();
            return jC;
        } finally {
            Uri uri2 = getUri();
            if (uri2 != null) {
                this.f62552d = uri2;
            }
            this.f62553e = a();
        }
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() throws IOException {
        this.f62550b.close();
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62550b.getUri();
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f62550b.read(bArr, i10, i11);
        int i13 = 1 | (-1);
        if (i12 != -1) {
            this.f62551c += (long) i12;
        }
        return i12;
    }

    @Override // androidx.media3.datasource.p
    public void s(r1 r1Var) {
        androidx.media3.common.util.a.g(r1Var);
        this.f62550b.s(r1Var);
    }

    public long u() {
        return this.f62551c;
    }

    public Uri v() {
        return this.f62552d;
    }

    public Map<String, List<String>> w() {
        return this.f62553e;
    }

    public void x() {
        this.f62551c = 0L;
    }
}
