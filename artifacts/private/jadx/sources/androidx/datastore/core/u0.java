package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final FileOutputStream f49811a;

    public u0(@NotNull FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f49811a = fileOutputStream;
    }

    @NotNull
    public final FileOutputStream a() {
        return this.f49811a;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f49811a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f49811a.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] b10) throws IOException {
        Intrinsics.checkNotNullParameter(b10, "b");
        this.f49811a.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] bytes, int i10, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f49811a.write(bytes, i10, i11);
    }
}
