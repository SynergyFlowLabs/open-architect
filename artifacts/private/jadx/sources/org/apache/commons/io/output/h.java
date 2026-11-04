package org.apache.commons.io.output;

import androidx.collection.g3;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class h extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f336759a;

    public h(OutputStream outputStream) {
        super(outputStream);
        this.f336759a = 0L;
    }

    @Override // org.apache.commons.io.output.o
    protected synchronized void b(int i10) {
        this.f336759a += (long) i10;
    }

    public synchronized long d() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f336759a;
    }

    public synchronized long e() {
        long j10;
        j10 = this.f336759a;
        this.f336759a = 0L;
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
}
