package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class i extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f335210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f335211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f335212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g.a f335213d;

    public i(OutputStream outputStream, g gVar, boolean z10) {
        super(outputStream);
        this.f335212c = new byte[1];
        this.f335213d = new g.a();
        this.f335211b = gVar;
        this.f335210a = z10;
    }

    private void b(boolean z10) throws IOException {
        byte[] bArr;
        int iW;
        int iG = this.f335211b.g(this.f335213d);
        if (iG > 0 && (iW = this.f335211b.w((bArr = new byte[iG]), 0, iG, this.f335213d)) > 0) {
            ((FilterOutputStream) this).out.write(bArr, 0, iW);
        }
        if (z10) {
            ((FilterOutputStream) this).out.flush();
        }
    }

    public void a() throws IOException {
        if (this.f335210a) {
            this.f335211b.k(this.f335212c, 0, -1, this.f335213d);
        } else {
            this.f335211b.i(this.f335212c, 0, -1, this.f335213d);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        flush();
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        b(true);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f335212c;
        bArr[0] = (byte) i10;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        bArr.getClass();
        if (i10 < 0 || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 > bArr.length || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 > 0) {
            if (this.f335210a) {
                this.f335211b.k(bArr, i10, i11, this.f335213d);
            } else {
                this.f335211b.i(bArr, i10, i11, this.f335213d);
            }
            b(false);
        }
    }
}
