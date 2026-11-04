package org.apache.commons.io.input;

import androidx.collection.g3;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class k extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f336618a;

    public k(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.o
    protected synchronized void a(int i10) {
        if (i10 != -1) {
            this.f336618a += (long) i10;
        }
    }

    public synchronized long d() {
        return this.f336618a;
    }

    public synchronized long e() {
        long j10;
        j10 = this.f336618a;
        this.f336618a = 0L;
        return j10;
    }

    public int f() {
        long jE = e();
        if (jE <= g3.f12256c) {
            return (int) jE;
        }
        throw new ArithmeticException("The byte count " + jE + " is too large to be converted to an int");
    }

    public int getCount() {
        long jD = d();
        if (jD <= g3.f12256c) {
            return (int) jD;
        }
        throw new ArithmeticException("The byte count " + jD + " is too large to be converted to an int");
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        long jSkip;
        try {
            jSkip = super.skip(j10);
            this.f336618a += jSkip;
        } catch (Throwable th2) {
            throw th2;
        }
        return jSkip;
    }
}
