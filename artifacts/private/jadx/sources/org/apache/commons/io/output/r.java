package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class r extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Serializable f336776a;

    public r(OutputStream outputStream) {
        super(outputStream);
        this.f336776a = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.output.o
    protected void c(IOException iOException) throws IOException {
        throw new org.apache.commons.io.s(iOException, this.f336776a);
    }

    public boolean d(Exception exc) {
        return org.apache.commons.io.s.c(exc, this.f336776a);
    }

    public void e(Exception exc) throws IOException {
        org.apache.commons.io.s.d(exc, this.f336776a);
    }
}
