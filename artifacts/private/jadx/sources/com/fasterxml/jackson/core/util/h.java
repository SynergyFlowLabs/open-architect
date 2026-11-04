package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.s;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class h extends com.fasterxml.jackson.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.fasterxml.jackson.core.h f102820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f102821c;

    public h(com.fasterxml.jackson.core.h hVar) {
        this(hVar, true);
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h B0(r rVar) {
        this.f102820b.B0(rVar);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public void B1(s sVar) throws IOException {
        this.f102820b.B1(sVar);
    }

    @Override // com.fasterxml.jackson.core.h
    public void B2(String str) throws IOException {
        this.f102820b.B2(str);
    }

    @Override // com.fasterxml.jackson.core.h
    public void D2(char c10) throws IOException {
        this.f102820b.D2(c10);
    }

    @Override // com.fasterxml.jackson.core.h
    public q E() {
        return this.f102820b.E();
    }

    @Override // com.fasterxml.jackson.core.h
    public void E1(String str) throws IOException {
        this.f102820b.E1(str);
    }

    @Override // com.fasterxml.jackson.core.h
    public void E2(s sVar) throws IOException {
        this.f102820b.E2(sVar);
    }

    @Override // com.fasterxml.jackson.core.h
    public void G2(String str) throws IOException {
        this.f102820b.G2(str);
    }

    @Override // com.fasterxml.jackson.core.h
    public Object H() {
        return this.f102820b.H();
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h H0(s sVar) {
        this.f102820b.H0(sVar);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public int I() {
        return this.f102820b.I();
    }

    @Override // com.fasterxml.jackson.core.h
    public void J1() throws IOException {
        this.f102820b.J1();
    }

    @Override // com.fasterxml.jackson.core.h
    public void J2(String str, int i10, int i11) throws IOException {
        this.f102820b.J2(str, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public void L2(char[] cArr, int i10, int i11) throws IOException {
        this.f102820b.L2(cArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public void M0(com.fasterxml.jackson.core.d dVar) {
        this.f102820b.M0(dVar);
    }

    @Override // com.fasterxml.jackson.core.h
    public void N2(byte[] bArr, int i10, int i11) throws IOException {
        this.f102820b.N2(bArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h O0() {
        this.f102820b.O0();
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public void Q0(double[] dArr, int i10, int i11) throws IOException {
        this.f102820b.Q0(dArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public void Q2(String str) throws IOException {
        this.f102820b.Q2(str);
    }

    @Override // com.fasterxml.jackson.core.h
    public int R() {
        return this.f102820b.R();
    }

    @Override // com.fasterxml.jackson.core.h
    public void R0(int[] iArr, int i10, int i11) throws IOException {
        this.f102820b.R0(iArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public void R2(String str, int i10, int i11) throws IOException {
        this.f102820b.R2(str, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public int T() {
        return this.f102820b.T();
    }

    @Override // com.fasterxml.jackson.core.h
    public void T0(long[] jArr, int i10, int i11) throws IOException {
        this.f102820b.T0(jArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public void T1(double d10) throws IOException {
        this.f102820b.T1(d10);
    }

    @Override // com.fasterxml.jackson.core.h
    public void T2(char[] cArr, int i10, int i11) throws IOException {
        this.f102820b.T2(cArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public void U2() throws IOException {
        this.f102820b.U2();
    }

    @Override // com.fasterxml.jackson.core.h
    public void W2(int i10) throws IOException {
        this.f102820b.W2(i10);
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.m X() {
        return this.f102820b.X();
    }

    @Override // com.fasterxml.jackson.core.h
    public void X2() throws IOException {
        this.f102820b.X2();
    }

    @Override // com.fasterxml.jackson.core.h
    public Object Y() {
        return this.f102820b.Y();
    }

    @Override // com.fasterxml.jackson.core.h
    public void Y2(Object obj) throws IOException {
        this.f102820b.Y2(obj);
    }

    @Override // com.fasterxml.jackson.core.h
    public void Z2(s sVar) throws IOException {
        this.f102820b.Z2(sVar);
    }

    @Override // com.fasterxml.jackson.core.h
    public void a3(Reader reader, int i10) throws IOException {
        this.f102820b.a3(reader, i10);
    }

    @Override // com.fasterxml.jackson.core.h
    public int b1(com.fasterxml.jackson.core.a aVar, InputStream inputStream, int i10) throws IOException {
        return this.f102820b.b1(aVar, inputStream, i10);
    }

    @Override // com.fasterxml.jackson.core.h
    public void b2(float f10) throws IOException {
        this.f102820b.b2(f10);
    }

    @Override // com.fasterxml.jackson.core.h
    public void c2(int i10) throws IOException {
        this.f102820b.c2(i10);
    }

    @Override // com.fasterxml.jackson.core.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f102820b.close();
    }

    @Override // com.fasterxml.jackson.core.h
    public r d0() {
        return this.f102820b.d0();
    }

    @Override // com.fasterxml.jackson.core.h
    public void d2(long j10) throws IOException {
        this.f102820b.d2(j10);
    }

    @Override // com.fasterxml.jackson.core.h
    public void e1(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        this.f102820b.e1(aVar, bArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public void e2(String str) throws UnsupportedOperationException, IOException {
        this.f102820b.e2(str);
    }

    @Override // com.fasterxml.jackson.core.h
    public void e3(String str) throws IOException {
        this.f102820b.e3(str);
    }

    @Override // com.fasterxml.jackson.core.h
    public boolean f() {
        return this.f102820b.f();
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.d f0() {
        return this.f102820b.f0();
    }

    @Override // com.fasterxml.jackson.core.h
    public void f2(BigDecimal bigDecimal) throws IOException {
        this.f102820b.f2(bigDecimal);
    }

    @Override // com.fasterxml.jackson.core.h
    public void f3(char[] cArr, int i10, int i11) throws IOException {
        this.f102820b.f3(cArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h, java.io.Flushable
    public void flush() throws IOException {
        this.f102820b.flush();
    }

    @Override // com.fasterxml.jackson.core.h
    public boolean g(com.fasterxml.jackson.core.d dVar) {
        return this.f102820b.g(dVar);
    }

    @Override // com.fasterxml.jackson.core.h
    public boolean g0(com.fasterxml.jackson.core.h.b bVar) {
        return this.f102820b.g0(bVar);
    }

    @Override // com.fasterxml.jackson.core.h
    public boolean h() {
        return this.f102820b.h();
    }

    @Override // com.fasterxml.jackson.core.h
    public void i2(BigInteger bigInteger) throws IOException {
        this.f102820b.i2(bigInteger);
    }

    @Override // com.fasterxml.jackson.core.h
    public boolean isClosed() {
        return this.f102820b.isClosed();
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h j0(int i10, int i11) {
        this.f102820b.j0(i10, i11);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h k0(int i10, int i11) {
        this.f102820b.k0(i10, i11);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public void k3(u uVar) throws IOException {
        if (this.f102821c) {
            this.f102820b.k3(uVar);
            return;
        }
        if (uVar == null) {
            J1();
            return;
        }
        q qVarE = E();
        if (qVarE == null) {
            throw new IllegalStateException("No ObjectCodec defined");
        }
        qVarE.e(this, uVar);
    }

    @Override // com.fasterxml.jackson.core.h
    public boolean l() {
        return this.f102820b.l();
    }

    @Override // com.fasterxml.jackson.core.h
    public void l1(boolean z10) throws IOException {
        this.f102820b.l1(z10);
    }

    @Override // com.fasterxml.jackson.core.h
    public void l3(Object obj) throws IOException {
        this.f102820b.l3(obj);
    }

    @Override // com.fasterxml.jackson.core.h
    public boolean m() {
        return this.f102820b.m();
    }

    @Override // com.fasterxml.jackson.core.h
    public void n2(short s10) throws IOException {
        this.f102820b.n2(s10);
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h o0(com.fasterxml.jackson.core.io.b bVar) {
        this.f102820b.o0(bVar);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public void p1(Object obj) throws IOException {
        this.f102820b.p1(obj);
    }

    @Override // com.fasterxml.jackson.core.h
    public void q(JsonParser jsonParser) throws IOException {
        if (this.f102821c) {
            this.f102820b.q(jsonParser);
        } else {
            super.q(jsonParser);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void r(JsonParser jsonParser) throws IOException {
        if (this.f102821c) {
            this.f102820b.r(jsonParser);
        } else {
            super.r(jsonParser);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h r0(q qVar) {
        this.f102820b.r0(qVar);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public void r3(byte[] bArr, int i10, int i11) throws IOException {
        this.f102820b.r3(bArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public void s1() throws IOException {
        this.f102820b.s1();
    }

    public com.fasterxml.jackson.core.h s3() {
        return this.f102820b;
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h t(com.fasterxml.jackson.core.h.b bVar) {
        this.f102820b.t(bVar);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public void u1() throws IOException {
        this.f102820b.u1();
    }

    @Override // com.fasterxml.jackson.core.h, com.fasterxml.jackson.core.w
    public v version() {
        return this.f102820b.version();
    }

    @Override // com.fasterxml.jackson.core.h
    public void w0(Object obj) {
        this.f102820b.w0(obj);
    }

    @Override // com.fasterxml.jackson.core.h
    public void w1(long j10) throws IOException {
        this.f102820b.w1(j10);
    }

    @Override // com.fasterxml.jackson.core.h
    public void writeObject(Object obj) throws IOException {
        if (this.f102821c) {
            this.f102820b.writeObject(obj);
            return;
        }
        if (obj == null) {
            J1();
            return;
        }
        q qVarE = E();
        if (qVarE != null) {
            qVarE.o(this, obj);
        } else {
            e(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h x(com.fasterxml.jackson.core.h.b bVar) {
        this.f102820b.x(bVar);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    @Deprecated
    public com.fasterxml.jackson.core.h x0(int i10) {
        this.f102820b.x0(i10);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.io.b y() {
        return this.f102820b.y();
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h y0(int i10) {
        this.f102820b.y0(i10);
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public void y2(Object obj) throws IOException {
        this.f102820b.y2(obj);
    }

    @Override // com.fasterxml.jackson.core.h
    public void z2(Object obj) throws IOException {
        this.f102820b.z2(obj);
    }

    public h(com.fasterxml.jackson.core.h hVar, boolean z10) {
        this.f102820b = hVar;
        this.f102821c = z10;
    }
}
