package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.v;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class i extends JsonParser {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected JsonParser f102822g;

    public i(JsonParser jsonParser) {
        this.f102822g = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean B1(boolean z10) throws IOException {
        return this.f102822g.B1(z10);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser E(JsonParser.a aVar) {
        this.f102822g.E(aVar);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double E1() throws IOException {
        return this.f102822g.E1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.n E2() throws IOException {
        return this.f102822g.E2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.n G2() throws IOException {
        return this.f102822g.G2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void H() throws IOException {
        this.f102822g.H();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object H0() {
        return this.f102822g.H0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger I() throws IOException {
        return this.f102822g.I();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double J1(double d10) throws IOException {
        return this.f102822g.J1(d10);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void J2(String str) {
        this.f102822g.J2(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser L2(int i10, int i11) {
        this.f102822g.L2(i10, i11);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int M0() throws IOException {
        return this.f102822g.M0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser N2(int i10, int i11) {
        this.f102822g.N2(i10, i11);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.n O0() {
        return this.f102822g.O0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int O1() throws IOException {
        return this.f102822g.O1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int O2(com.fasterxml.jackson.core.a aVar, OutputStream outputStream) throws IOException {
        return this.f102822g.O2(aVar, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long Q0() throws IOException {
        return this.f102822g.Q0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] R(com.fasterxml.jackson.core.a aVar) throws IOException {
        return this.f102822g.R(aVar);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean T() throws IOException {
        return this.f102822g.T();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.b T0() throws IOException {
        return this.f102822g.T0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int T1(int i10) throws IOException {
        return this.f102822g.T1(i10);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number U0() throws IOException {
        return this.f102822g.U0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte X() throws IOException {
        return this.f102822g.X();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public q Y() {
        return this.f102822g.Y();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean a3() {
        return this.f102822g.a3();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object b1() throws IOException {
        return this.f102822g.b1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long b2() throws IOException {
        return this.f102822g.b2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long c2(long j10) throws IOException {
        return this.f102822g.c2(j10);
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f102822g.close();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i d0() {
        return this.f102822g.d0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.m d1() {
        return this.f102822g.d1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String d2() throws IOException {
        return this.f102822g.d2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.d e1() {
        return this.f102822g.e1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String e2(String str) throws IOException {
        return this.f102822g.e2(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void e3(q qVar) {
        this.f102822g.e3(qVar);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String f0() throws IOException {
        return this.f102822g.f0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean f2() {
        return this.f102822g.f2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void f3(Object obj) {
        this.f102822g.f3(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.n g0() {
        return this.f102822g.g0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public short g1() throws IOException {
        return this.f102822g.g1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int h1(Writer writer) throws UnsupportedOperationException, IOException {
        return this.f102822g.h1(writer);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser h3(int i10) {
        this.f102822g.h3(i10);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean i2() {
        return this.f102822g.i2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isClosed() {
        return this.f102822g.isClosed();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean j() {
        return this.f102822g.j();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int j0() {
        return this.f102822g.j0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String j1() throws IOException {
        return this.f102822g.j1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object k0() {
        return this.f102822g.k0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean l() {
        return this.f102822g.l();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] l1() throws IOException {
        return this.f102822g.l1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean m(com.fasterxml.jackson.core.d dVar) {
        return this.f102822g.m(dVar);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean n2(com.fasterxml.jackson.core.n nVar) {
        return this.f102822g.n2(nVar);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void o() {
        this.f102822g.o();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal o0() throws IOException {
        return this.f102822g.o0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int o1() throws IOException {
        return this.f102822g.o1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean o2(int i10) {
        return this.f102822g.o2(i10);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void o3(com.fasterxml.jackson.core.d dVar) {
        this.f102822g.o3(dVar);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int p1() throws IOException {
        return this.f102822g.p1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean p2(JsonParser.a aVar) {
        return this.f102822g.p2(aVar);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean q2() {
        return this.f102822g.q2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double r0() throws IOException {
        return this.f102822g.r0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser r3() throws IOException {
        this.f102822g.r3();
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i s1() {
        return this.f102822g.s1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean s2() {
        return this.f102822g.s2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.n t() {
        return this.f102822g.t();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean t2() throws IOException {
        return this.f102822g.t2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object u1() throws IOException {
        return this.f102822g.u1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.w
    public v version() {
        return this.f102822g.version();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object w0() throws IOException {
        return this.f102822g.w0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean w1() throws IOException {
        return this.f102822g.w1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int x() {
        return this.f102822g.x();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int x0() {
        return this.f102822g.x0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser y(JsonParser.a aVar) {
        this.f102822g.y(aVar);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float y0() throws IOException {
        return this.f102822g.y0();
    }
}
