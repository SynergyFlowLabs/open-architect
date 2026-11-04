package com.google.api.client.testing.json;

import com.google.api.client.json.g;
import com.google.api.client.json.j;
import com.google.api.client.util.f;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
@f
public class c extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f116010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.api.client.json.d f116011d;

    c(com.google.api.client.json.d dVar) {
        this.f116011d = dVar;
    }

    @Override // com.google.api.client.json.g
    public g L() throws IOException {
        return null;
    }

    public boolean Q() {
        return this.f116010c;
    }

    @Override // com.google.api.client.json.g
    public void a() throws IOException {
        this.f116010c = true;
    }

    @Override // com.google.api.client.json.g
    public BigInteger b() throws IOException {
        return null;
    }

    @Override // com.google.api.client.json.g
    public byte c() throws IOException {
        return (byte) 0;
    }

    @Override // com.google.api.client.json.g
    public String e() throws IOException {
        return null;
    }

    @Override // com.google.api.client.json.g
    public j f() {
        return null;
    }

    @Override // com.google.api.client.json.g
    public BigDecimal g() throws IOException {
        return null;
    }

    @Override // com.google.api.client.json.g
    public double h() throws IOException {
        return 0.0d;
    }

    @Override // com.google.api.client.json.g
    public com.google.api.client.json.d i() {
        return this.f116011d;
    }

    @Override // com.google.api.client.json.g
    public float j() throws IOException {
        return 0.0f;
    }

    @Override // com.google.api.client.json.g
    public int k() throws IOException {
        return 0;
    }

    @Override // com.google.api.client.json.g
    public long l() throws IOException {
        return 0L;
    }

    @Override // com.google.api.client.json.g
    public short m() throws IOException {
        return (short) 0;
    }

    @Override // com.google.api.client.json.g
    public String n() throws IOException {
        return null;
    }

    @Override // com.google.api.client.json.g
    public j o() throws IOException {
        return null;
    }
}
