package com.rabbitmq.client.impl.recovery;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes13.dex */
public class c0 extends com.rabbitmq.client.impl.s {
    public c0(com.rabbitmq.client.impl.a0 a0Var, int i10) {
        this(a0Var, i10, Executors.defaultThreadFactory());
    }

    @Override // com.rabbitmq.client.impl.s
    protected com.rabbitmq.client.impl.u i(com.rabbitmq.client.impl.i iVar, int i10, com.rabbitmq.client.impl.a0 a0Var) {
        return new d0(iVar, i10, a0Var, this.f265811j);
    }

    public c0(com.rabbitmq.client.impl.a0 a0Var, int i10, ThreadFactory threadFactory) {
        super(a0Var, i10, threadFactory, new com.rabbitmq.client.r0());
    }

    public c0(com.rabbitmq.client.impl.a0 a0Var, int i10, ThreadFactory threadFactory, com.rabbitmq.client.p0 p0Var) {
        super(a0Var, i10, threadFactory, p0Var);
    }
}
