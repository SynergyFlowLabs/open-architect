package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class a extends o {
    public a(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.o
    protected void a(int i10) throws IOException {
        if (i10 == -1) {
            close();
        }
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        ((FilterInputStream) this).in = new j();
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }
}
