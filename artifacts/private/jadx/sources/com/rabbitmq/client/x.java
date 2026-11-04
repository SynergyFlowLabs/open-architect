package com.rabbitmq.client;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class x implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f266059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f266060b;

    public x(k kVar) {
        this.f266059a = kVar;
    }

    @Override // com.rabbitmq.client.t
    public void a(String str, l1 l1Var) {
    }

    @Override // com.rabbitmq.client.t
    public void b(String str) {
    }

    @Override // com.rabbitmq.client.t
    public void c(String str, f0 f0Var, a.c cVar, byte[] bArr) throws IOException {
    }

    @Override // com.rabbitmq.client.t
    public void d(String str) {
        this.f266060b = str;
    }

    @Override // com.rabbitmq.client.t
    public void e(String str) {
    }

    @Override // com.rabbitmq.client.t
    public void f(String str) throws IOException {
    }

    public String h() {
        return this.f266060b;
    }

    public k i() {
        return this.f266059a;
    }
}
