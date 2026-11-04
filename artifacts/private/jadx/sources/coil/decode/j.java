package coil.decode;

import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InputStream f87167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f87168b = 1073741824;

    public j(@NotNull InputStream inputStream) {
        this.f87167a = inputStream;
    }

    private final int a(int i10) {
        if (i10 == -1) {
            this.f87168b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f87168b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f87167a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.f87167a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f87167a.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] bArr) {
        return a(this.f87167a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] bArr, int i10, int i11) {
        return a(this.f87167a.read(bArr, i10, i11));
    }
}
