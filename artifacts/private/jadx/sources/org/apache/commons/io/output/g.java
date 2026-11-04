package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class g extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f336758a = new g();

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        throw new IOException("write(" + i10 + ") failed: stream is closed");
    }
}
