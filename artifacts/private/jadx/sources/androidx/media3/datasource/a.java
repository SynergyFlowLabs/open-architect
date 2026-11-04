package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f62258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f62259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final byte[] f62260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private c f62261d;

    public a(byte[] bArr, o oVar) {
        this(bArr, oVar, null);
    }

    @Override // androidx.media3.datasource.o
    public void c(x xVar) throws IOException {
        this.f62258a.c(xVar);
        this.f62261d = new c(1, this.f62259b, xVar.f62602i, xVar.f62595b + xVar.f62600g);
    }

    @Override // androidx.media3.datasource.o
    public void close() throws IOException {
        this.f62261d = null;
        this.f62258a.close();
    }

    @Override // androidx.media3.datasource.o
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f62260c == null) {
            ((c) androidx.media3.common.util.k1.o(this.f62261d)).e(bArr, i10, i11);
            this.f62258a.write(bArr, i10, i11);
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            int iMin = Math.min(i11 - i12, this.f62260c.length);
            byte[] bArr2 = bArr;
            ((c) androidx.media3.common.util.k1.o(this.f62261d)).d(bArr2, i10 + i12, iMin, this.f62260c, 0);
            this.f62258a.write(this.f62260c, 0, iMin);
            i12 += iMin;
            bArr = bArr2;
        }
    }

    public a(byte[] bArr, o oVar, @androidx.annotation.p0 byte[] bArr2) {
        this.f62258a = oVar;
        this.f62259b = bArr;
        this.f62260c = bArr2;
    }
}
