package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.h;
import com.google.api.client.json.e;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f115787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f115788b;

    b(a aVar, h hVar) {
        this.f115788b = aVar;
        this.f115787a = hVar;
    }

    @Override // com.google.api.client.json.e
    public void a() throws IOException {
        this.f115787a.close();
    }

    @Override // com.google.api.client.json.e
    public void b() throws IOException {
        this.f115787a.O0();
    }

    @Override // com.google.api.client.json.e
    public void c() throws IOException {
        this.f115787a.flush();
    }

    @Override // com.google.api.client.json.e
    public void g(boolean z10) throws IOException {
        this.f115787a.l1(z10);
    }

    @Override // com.google.api.client.json.e
    public void h() throws IOException {
        this.f115787a.s1();
    }

    @Override // com.google.api.client.json.e
    public void i() throws IOException {
        this.f115787a.u1();
    }

    @Override // com.google.api.client.json.e
    public void j(String str) throws IOException {
        this.f115787a.E1(str);
    }

    @Override // com.google.api.client.json.e
    public void k() throws IOException {
        this.f115787a.J1();
    }

    @Override // com.google.api.client.json.e
    public void l(double d10) throws IOException {
        this.f115787a.T1(d10);
    }

    @Override // com.google.api.client.json.e
    public void m(float f10) throws IOException {
        this.f115787a.b2(f10);
    }

    @Override // com.google.api.client.json.e
    public void n(int i10) throws IOException {
        this.f115787a.c2(i10);
    }

    @Override // com.google.api.client.json.e
    public void o(long j10) throws IOException {
        this.f115787a.d2(j10);
    }

    @Override // com.google.api.client.json.e
    public void p(String str) throws IOException {
        this.f115787a.e2(str);
    }

    @Override // com.google.api.client.json.e
    public void q(BigDecimal bigDecimal) throws IOException {
        this.f115787a.f2(bigDecimal);
    }

    @Override // com.google.api.client.json.e
    public void r(BigInteger bigInteger) throws IOException {
        this.f115787a.i2(bigInteger);
    }

    @Override // com.google.api.client.json.e
    public void s() throws IOException {
        this.f115787a.U2();
    }

    @Override // com.google.api.client.json.e
    public void t() throws IOException {
        this.f115787a.X2();
    }

    @Override // com.google.api.client.json.e
    public void u(String str) throws IOException {
        this.f115787a.e3(str);
    }

    @Override // com.google.api.client.json.e
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public a d() {
        return this.f115788b;
    }
}
