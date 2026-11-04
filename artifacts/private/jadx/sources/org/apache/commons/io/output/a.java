package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.Appendable;

/* JADX INFO: loaded from: classes14.dex */
public class a<T extends Appendable> extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f336745a;

    public a(T t10) {
        this.f336745a = t10;
    }

    public T a() {
        return this.f336745a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f336745a.append((char) i10);
    }
}
