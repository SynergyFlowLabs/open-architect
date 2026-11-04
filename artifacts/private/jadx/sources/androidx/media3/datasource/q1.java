package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class q1 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f62554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f62555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f62557e;

    public q1(p pVar, o oVar) {
        this.f62554b = (p) androidx.media3.common.util.a.g(pVar);
        this.f62555c = (o) androidx.media3.common.util.a.g(oVar);
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public Map<String, List<String>> a() {
        return this.f62554b.a();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        long jC = this.f62554b.c(xVar);
        this.f62557e = jC;
        if (jC == 0) {
            return 0L;
        }
        if (xVar.f62601h == -1 && jC != -1) {
            xVar = xVar.f(0L, jC);
        }
        this.f62556d = true;
        this.f62555c.c(xVar);
        return this.f62557e;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() throws IOException {
        try {
            this.f62554b.close();
            if (this.f62556d) {
                this.f62556d = false;
                this.f62555c.close();
            }
        } catch (Throwable th2) {
            if (this.f62556d) {
                this.f62556d = false;
                this.f62555c.close();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62554b.getUri();
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f62557e == 0) {
            return -1;
        }
        int i12 = this.f62554b.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f62555c.write(bArr, i10, i12);
            long j10 = this.f62557e;
            if (j10 != -1) {
                this.f62557e = j10 - ((long) i12);
            }
        }
        return i12;
    }

    @Override // androidx.media3.datasource.p
    public void s(r1 r1Var) {
        androidx.media3.common.util.a.g(r1Var);
        this.f62554b.s(r1Var);
    }
}
