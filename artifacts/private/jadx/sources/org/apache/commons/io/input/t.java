package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class t extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Serializable f336656a;

    public t(InputStream inputStream) {
        super(inputStream);
        this.f336656a = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.input.o
    protected void c(IOException iOException) throws IOException {
        throw new org.apache.commons.io.s(iOException, this.f336656a);
    }

    public boolean d(Throwable th2) {
        return org.apache.commons.io.s.c(th2, this.f336656a);
    }

    public void e(Throwable th2) throws IOException {
        org.apache.commons.io.s.d(th2, this.f336656a);
    }
}
