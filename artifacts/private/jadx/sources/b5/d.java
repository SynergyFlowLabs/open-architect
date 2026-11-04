package b5;

import com.davidehrmann.vcdiff.e;
import com.davidehrmann.vcdiff.h;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class d extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f77569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f77570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f77571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h<OutputStream> f77572d;

    public d(OutputStream outputStream, byte[] bArr, boolean z10, boolean z11, boolean z12) {
        super(outputStream);
        this.f77569a = false;
        this.f77570b = false;
        this.f77571c = 0L;
        this.f77572d = e.f().h(bArr).j(z10).i(z11).g(z12).d();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.f77569a) {
                this.f77569a = true;
                this.f77572d.b(((FilterOutputStream) this).out);
            }
            if (!this.f77570b) {
                this.f77570b = true;
                this.f77572d.Q0(((FilterOutputStream) this).out);
            }
            super.close();
        } catch (Throwable th2) {
            super.close();
            throw th2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f77570b) {
            throw new IOException("OutputStream closed");
        }
        if (!this.f77569a) {
            this.f77569a = true;
            this.f77572d.b(((FilterOutputStream) this).out);
        }
        try {
            this.f77572d.a(bArr, i10, i11, ((FilterOutputStream) this).out);
            this.f77571c += (long) i11;
        } catch (IOException e10) {
            throw new IOException("Error trying to encode data chunk at offset " + this.f77571c, e10);
        }
    }

    public d(OutputStream outputStream, h<OutputStream> hVar) {
        super(outputStream);
        this.f77569a = false;
        this.f77570b = false;
        this.f77571c = 0L;
        this.f77572d = (h) com.davidehrmann.vcdiff.util.a.b(hVar, "encoder was null");
    }
}
