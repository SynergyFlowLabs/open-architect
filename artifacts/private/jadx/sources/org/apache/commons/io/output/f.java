package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class f extends o {
    public f(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.apache.commons.io.output.o, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out = new g();
    }
}
