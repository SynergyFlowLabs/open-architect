package androidx.media3.datasource;

import androidx.collection.g3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteArrayOutputStream f62484a;

    @androidx.annotation.p0
    public byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = this.f62484a;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // androidx.media3.datasource.o
    public void c(x xVar) {
        long j10 = xVar.f62601h;
        if (j10 == -1) {
            this.f62484a = new ByteArrayOutputStream();
        } else {
            androidx.media3.common.util.a.a(j10 <= g3.f12256c);
            this.f62484a = new ByteArrayOutputStream((int) xVar.f62601h);
        }
    }

    @Override // androidx.media3.datasource.o
    public void close() throws IOException {
        ((ByteArrayOutputStream) androidx.media3.common.util.k1.o(this.f62484a)).close();
    }

    @Override // androidx.media3.datasource.o
    public void write(byte[] bArr, int i10, int i11) {
        ((ByteArrayOutputStream) androidx.media3.common.util.k1.o(this.f62484a)).write(bArr, i10, i11);
    }
}
