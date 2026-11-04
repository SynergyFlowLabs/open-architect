package b5;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class a extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f77554a;

    public a(OutputStream outputStream) {
        super(outputStream);
        this.f77554a = new AtomicLong();
    }

    public long a() {
        return this.f77554a.get();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        super.write(i10);
        this.f77554a.getAndIncrement();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f77554a.getAndAdd(i11);
    }
}
