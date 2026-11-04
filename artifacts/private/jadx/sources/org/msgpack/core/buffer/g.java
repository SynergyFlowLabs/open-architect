package org.msgpack.core.buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import org.msgpack.core.p;

/* JADX INFO: loaded from: classes14.dex */
public class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f339205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f339206b;

    public g(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public static j a(InputStream inputStream) {
        FileChannel channel;
        p.j(inputStream, "InputStream is null");
        return (!(inputStream instanceof FileInputStream) || (channel = ((FileInputStream) inputStream).getChannel()) == null) ? new g(inputStream) : new d(channel);
    }

    public InputStream b(InputStream inputStream) throws IOException {
        InputStream inputStream2 = this.f339205a;
        this.f339205a = inputStream;
        return inputStream2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f339205a.close();
    }

    @Override // org.msgpack.core.buffer.j
    public h next() throws IOException {
        int i10 = this.f339205a.read(this.f339206b);
        if (i10 == -1) {
            return null;
        }
        return h.K(this.f339206b, 0, i10);
    }

    public g(InputStream inputStream, int i10) {
        this.f339205a = (InputStream) p.j(inputStream, "input is null");
        this.f339206b = new byte[i10];
    }
}
