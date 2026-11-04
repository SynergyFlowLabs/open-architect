package com.rabbitmq.client;

/* JADX INFO: loaded from: classes13.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f265097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.c f265098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f265099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f265100d;

    public h0(f0 f0Var, a.c cVar, byte[] bArr, int i10) {
        this.f265097a = f0Var;
        this.f265098b = cVar;
        this.f265099c = bArr;
        this.f265100d = i10;
    }

    public byte[] a() {
        return this.f265099c;
    }

    public f0 b() {
        return this.f265097a;
    }

    public int c() {
        return this.f265100d;
    }

    public a.c d() {
        return this.f265098b;
    }

    public String toString() {
        return "GetResponse(envelope=" + this.f265097a + ", props=" + this.f265098b + ", messageCount=" + this.f265100d + ", body=(elided, " + this.f265099c.length + " bytes long))";
    }
}
