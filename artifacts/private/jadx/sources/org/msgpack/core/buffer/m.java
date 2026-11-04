package org.msgpack.core.buffer;

import java.io.IOException;
import java.io.OutputStream;
import org.msgpack.core.p;

/* JADX INFO: loaded from: classes14.dex */
public class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f339222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f339223b;

    public m(OutputStream outputStream) {
        this(outputStream, 8192);
    }

    @Override // org.msgpack.core.buffer.k
    public void P0(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    @Override // org.msgpack.core.buffer.k
    public void P9(int i10) throws IOException {
        write(this.f339223b.b(), this.f339223b.c(), i10);
    }

    public OutputStream a(OutputStream outputStream) throws IOException {
        OutputStream outputStream2 = this.f339222a;
        this.f339222a = outputStream;
        return outputStream2;
    }

    @Override // org.msgpack.core.buffer.k
    public h c4(int i10) throws IOException {
        if (this.f339223b.C() < i10) {
            this.f339223b = h.a(i10);
        }
        return this.f339223b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f339222a.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f339222a.flush();
    }

    @Override // org.msgpack.core.buffer.k
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f339222a.write(bArr, i10, i11);
    }

    public m(OutputStream outputStream, int i10) {
        this.f339222a = (OutputStream) p.j(outputStream, "output is null");
        this.f339223b = h.a(i10);
    }
}
