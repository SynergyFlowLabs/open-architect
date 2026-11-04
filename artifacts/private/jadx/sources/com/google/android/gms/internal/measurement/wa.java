package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wa extends ia {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f108944b = Logger.getLogger(wa.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f108945c = ce.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f108946d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    xa f108947a;

    private wa() {
        throw null;
    }

    public static int G(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = fe.b(str);
        } catch (ee unused) {
            length = str.getBytes(ac.f108280a).length;
        }
        return G(length) + length;
    }

    public static int c(yc ycVar) {
        int iE = ycVar.e();
        return G(iE) + iE;
    }

    static int d(yc ycVar, jd jdVar) {
        int iH = ((ba) ycVar).h(jdVar);
        return G(iH) + iH;
    }

    @Deprecated
    static int g(int i10, yc ycVar, jd jdVar) {
        int iG = G(i10 << 3);
        return iG + iG + ((ba) ycVar).h(jdVar);
    }

    public abstract void A(int i10) throws IOException;

    public abstract void B(long j10) throws IOException;

    public abstract void C(long j10) throws IOException;

    public abstract void D(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void E(String str) throws IOException;

    public abstract int F();

    public final void e() {
        if (F() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, ee eeVar) throws IOException {
        f108944b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) eeVar);
        byte[] bytes = str.getBytes(ac.f108280a);
        try {
            int length = bytes.length;
            z(length);
            int i10 = 6 << 0;
            D(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new va(e10);
        }
    }

    public abstract void i(int i10, int i11) throws IOException;

    public abstract void j(int i10, int i11) throws IOException;

    public abstract void k(int i10, int i11) throws IOException;

    public abstract void l(int i10, int i11) throws IOException;

    public abstract void m(int i10, long j10) throws IOException;

    public abstract void n(int i10, long j10) throws IOException;

    public abstract void o(int i10, boolean z10) throws IOException;

    public abstract void p(int i10, String str) throws IOException;

    public abstract void q(int i10, ra raVar) throws IOException;

    public abstract void r(ra raVar) throws IOException;

    abstract void s(byte[] bArr, int i10, int i11) throws IOException;

    abstract void t(int i10, yc ycVar, jd jdVar) throws IOException;

    public abstract void u(int i10, yc ycVar) throws IOException;

    public abstract void v(int i10, ra raVar) throws IOException;

    public abstract void w(yc ycVar) throws IOException;

    public abstract void x(byte b10) throws IOException;

    public abstract void y(int i10) throws IOException;

    public abstract void z(int i10) throws IOException;

    /* synthetic */ wa(byte[] bArr) {
    }
}
