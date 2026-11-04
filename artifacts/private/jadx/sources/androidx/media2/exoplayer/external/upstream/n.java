package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class n extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f57357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f57358b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f57362f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57360d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f57361e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f57359c = new byte[1];

    public n(l dataSource, o dataSpec) {
        this.f57357a = dataSource;
        this.f57358b = dataSpec;
    }

    private void b() throws IOException {
        if (this.f57360d) {
            return;
        }
        this.f57357a.b(this.f57358b);
        this.f57360d = true;
    }

    public long a() {
        return this.f57362f;
    }

    public void c() throws IOException {
        b();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f57361e) {
            return;
        }
        this.f57357a.close();
        this.f57361e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f57359c) == -1) {
            return -1;
        }
        return this.f57359c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] buffer) throws IOException {
        return read(buffer, 0, buffer.length);
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] buffer, int offset, int length) throws IOException {
        androidx.media2.exoplayer.external.util.a.i(!this.f57361e);
        b();
        int i10 = this.f57357a.read(buffer, offset, length);
        if (i10 == -1) {
            return -1;
        }
        this.f57362f += (long) i10;
        return i10;
    }
}
