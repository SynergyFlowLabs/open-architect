package com.google.api.client.testing.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class f extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f116029a;

    public final byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f116029a = true;
    }

    public final boolean isClosed() {
        return this.f116029a;
    }
}
