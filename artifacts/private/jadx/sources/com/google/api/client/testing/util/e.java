package com.google.api.client.testing.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class e extends ByteArrayInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f116028a;

    public e(byte[] bArr) {
        super(bArr);
    }

    public final byte[] a() {
        return ((ByteArrayInputStream) this).buf;
    }

    @Override // java.io.ByteArrayInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f116028a = true;
    }

    public final boolean isClosed() {
        return this.f116028a;
    }

    public e(byte[] bArr, int i10, int i11) {
        super(bArr);
    }
}
