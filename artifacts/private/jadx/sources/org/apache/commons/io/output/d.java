package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class d extends FilterOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f336754b = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f336755a;

    public d(OutputStream outputStream, int i10) {
        super(outputStream);
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f336755a = i10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        while (i11 > 0) {
            int iMin = Math.min(i11, this.f336755a);
            ((FilterOutputStream) this).out.write(bArr, i10, iMin);
            i11 -= iMin;
            i10 += iMin;
        }
    }

    public d(OutputStream outputStream) {
        this(outputStream, 4096);
    }
}
