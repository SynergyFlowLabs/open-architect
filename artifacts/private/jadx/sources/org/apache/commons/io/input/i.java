package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class i extends o {
    public i(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in = new j();
    }
}
