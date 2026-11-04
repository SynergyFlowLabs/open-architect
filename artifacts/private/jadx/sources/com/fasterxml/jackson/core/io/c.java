package com.fasterxml.jackson.core.io;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final DataOutput f102412a;

    public c(DataOutput dataOutput) {
        this.f102412a = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f102412a.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f102412a.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f102412a.write(bArr, i10, i11);
    }
}
