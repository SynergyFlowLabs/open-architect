package androidx.media3.datasource;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class v extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f62581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f62582b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f62586f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62584d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62585e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f62583c = new byte[1];

    public v(p pVar, x xVar) {
        this.f62581a = pVar;
        this.f62582b = xVar;
    }

    private void b() throws IOException {
        if (this.f62584d) {
            return;
        }
        this.f62581a.c(this.f62582b);
        this.f62584d = true;
    }

    public long a() {
        return this.f62586f;
    }

    public void c() throws IOException {
        b();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f62585e) {
            return;
        }
        this.f62581a.close();
        this.f62585e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f62583c) == -1) {
            return -1;
        }
        return this.f62583c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        androidx.media3.common.util.a.i(!this.f62585e);
        b();
        int i12 = this.f62581a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f62586f += (long) i12;
        return i12;
    }
}
