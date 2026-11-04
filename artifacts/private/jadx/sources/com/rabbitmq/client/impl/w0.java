package com.rabbitmq.client.impl;

/* JADX INFO: loaded from: classes13.dex */
public class w0 implements com.rabbitmq.client.g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final org.slf4j.c f265886b = org.slf4j.e.k(w0.class);

    @Override // com.rabbitmq.client.g2
    public void a(com.rabbitmq.client.m mVar) {
        if (c(mVar)) {
            f265886b.b0("Outbound command: {}", mVar);
        }
    }

    @Override // com.rabbitmq.client.g2
    public void b(com.rabbitmq.client.m mVar) {
        if (c(mVar)) {
            f265886b.b0("Inbound command: {}", mVar);
        }
    }

    protected boolean c(com.rabbitmq.client.m mVar) {
        return f265886b.R();
    }
}
