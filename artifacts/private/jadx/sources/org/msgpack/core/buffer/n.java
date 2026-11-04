package org.msgpack.core.buffer;

import java.io.IOException;
import java.util.Enumeration;
import org.msgpack.core.p;

/* JADX INFO: loaded from: classes14.dex */
public class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Enumeration<? extends j> f339224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f339225b;

    public n(Enumeration<? extends j> enumeration) {
        this.f339224a = (Enumeration) p.j(enumeration, "input sequence is null");
        try {
            a();
        } catch (IOException unused) {
        }
    }

    private void a() throws IOException {
        j jVar = this.f339225b;
        if (jVar != null) {
            jVar.close();
        }
        if (!this.f339224a.hasMoreElements()) {
            this.f339225b = null;
            return;
        }
        j jVarNextElement = this.f339224a.nextElement();
        this.f339225b = jVarNextElement;
        if (jVarNextElement == null) {
            throw new NullPointerException("An element in the MessageBufferInput sequence is null");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
            a();
        } while (this.f339225b != null);
    }

    @Override // org.msgpack.core.buffer.j
    public h next() throws IOException {
        j jVar = this.f339225b;
        if (jVar == null) {
            return null;
        }
        h next = jVar.next();
        if (next != null) {
            return next;
        }
        a();
        return next();
    }
}
