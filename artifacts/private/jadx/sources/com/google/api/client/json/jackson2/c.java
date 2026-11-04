package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.JsonParser;
import com.google.api.client.json.g;
import com.google.api.client.json.j;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
final class c extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonParser f115789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f115790d;

    c(a aVar, JsonParser jsonParser) {
        this.f115790d = aVar;
        this.f115789c = jsonParser;
    }

    @Override // com.google.api.client.json.g
    public g L() throws IOException {
        this.f115789c.r3();
        return this;
    }

    @Override // com.google.api.client.json.g
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public a i() {
        return this.f115790d;
    }

    @Override // com.google.api.client.json.g
    public void a() throws IOException {
        this.f115789c.close();
    }

    @Override // com.google.api.client.json.g
    public BigInteger b() throws IOException {
        return this.f115789c.I();
    }

    @Override // com.google.api.client.json.g
    public byte c() throws IOException {
        return this.f115789c.X();
    }

    @Override // com.google.api.client.json.g
    public String e() throws IOException {
        return this.f115789c.f0();
    }

    @Override // com.google.api.client.json.g
    public j f() {
        return a.q(this.f115789c.g0());
    }

    @Override // com.google.api.client.json.g
    public BigDecimal g() throws IOException {
        return this.f115789c.o0();
    }

    @Override // com.google.api.client.json.g
    public double h() throws IOException {
        return this.f115789c.r0();
    }

    @Override // com.google.api.client.json.g
    public float j() throws IOException {
        return this.f115789c.y0();
    }

    @Override // com.google.api.client.json.g
    public int k() throws IOException {
        return this.f115789c.M0();
    }

    @Override // com.google.api.client.json.g
    public long l() throws IOException {
        return this.f115789c.Q0();
    }

    @Override // com.google.api.client.json.g
    public short m() throws IOException {
        return this.f115789c.g1();
    }

    @Override // com.google.api.client.json.g
    public String n() throws IOException {
        return this.f115789c.j1();
    }

    @Override // com.google.api.client.json.g
    public j o() throws IOException {
        return a.q(this.f115789c.E2());
    }
}
