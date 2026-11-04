package androidx.media3.datasource.cache;

import androidx.media3.common.util.k1;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class s extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f62439a;

    public s(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        androidx.media3.common.util.a.i(this.f62439a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f62439a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f62439a = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            k1.j2(th);
        }
    }

    public s(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
