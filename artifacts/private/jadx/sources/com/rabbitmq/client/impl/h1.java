package com.rabbitmq.client.impl;

/* JADX INFO: loaded from: classes13.dex */
public class h1 implements com.rabbitmq.client.i1 {
    @Override // com.rabbitmq.client.i1
    public com.rabbitmq.client.k0 a(com.rabbitmq.client.k0 k0Var, String str, String str2) {
        return x0.a(com.squareup.moshi.g.Z2 + str + com.squareup.moshi.g.Z2 + str2);
    }

    @Override // com.rabbitmq.client.i1
    public String getName() {
        return "PLAIN";
    }
}
