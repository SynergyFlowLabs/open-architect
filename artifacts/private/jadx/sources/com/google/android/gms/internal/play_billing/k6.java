package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k6 extends v5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f109163b = Logger.getLogger(k6.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f109164c = m9.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    l6 f109165a;

    private k6() {
        throw null;
    }

    public static int A(String str) {
        int length;
        try {
            length = p9.c(str);
        } catch (o9 unused) {
            length = str.getBytes(j7.f109151a).length;
        }
        return B(length) + length;
    }

    public static int B(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    static int y(int i10, h8 h8Var, s8 s8Var) {
        int iB = B(i10 << 3);
        return iB + iB + ((n5) h8Var).g(s8Var);
    }

    static int z(h8 h8Var, s8 s8Var) {
        int iG = ((n5) h8Var).g(s8Var);
        return B(iG) + iG;
    }

    public final void b() {
        if (e() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c(String str, o9 o9Var) throws IOException {
        f109163b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) o9Var);
        byte[] bytes = str.getBytes(j7.f109151a);
        try {
            int length = bytes.length;
            v(length);
            o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new i6(e10);
        }
    }

    public abstract int e();

    public abstract void f(byte b10) throws IOException;

    public abstract void g(int i10, boolean z10) throws IOException;

    public abstract void h(int i10, d6 d6Var) throws IOException;

    public abstract void i(int i10, int i11) throws IOException;

    public abstract void j(int i10) throws IOException;

    public abstract void k(int i10, long j10) throws IOException;

    public abstract void l(long j10) throws IOException;

    public abstract void m(int i10, int i11) throws IOException;

    public abstract void n(int i10) throws IOException;

    public abstract void o(byte[] bArr, int i10, int i11) throws IOException;

    abstract void p(int i10, h8 h8Var, s8 s8Var) throws IOException;

    public abstract void q(int i10, h8 h8Var) throws IOException;

    public abstract void r(int i10, d6 d6Var) throws IOException;

    public abstract void s(int i10, String str) throws IOException;

    public abstract void t(int i10, int i11) throws IOException;

    public abstract void u(int i10, int i11) throws IOException;

    public abstract void v(int i10) throws IOException;

    public abstract void w(int i10, long j10) throws IOException;

    public abstract void x(long j10) throws IOException;

    /* synthetic */ k6(j6 j6Var) {
    }
}
