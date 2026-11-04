package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c0 extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f57512a;

    public c0(OutputStream out) {
        super(out);
    }

    public void a(OutputStream out) {
        a.i(this.f57512a);
        ((BufferedOutputStream) this).out = out;
        ((BufferedOutputStream) this).count = 0;
        this.f57512a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f57512a = true;
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
            q0.M0(th);
        }
    }

    public c0(OutputStream out, int size) {
        super(out, size);
    }
}
