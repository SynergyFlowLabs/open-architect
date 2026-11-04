package com.rabbitmq.client.impl.recovery;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes13.dex */
public class a0 extends com.rabbitmq.client.impl.i {
    public a0(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.t0 t0Var, com.rabbitmq.client.p0 p0Var) {
        super(yVar, t0Var, p0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.rabbitmq.client.impl.i
    /* JADX INFO: renamed from: o2, reason: merged with bridge method [inline-methods] */
    public c0 l1(int i10, ThreadFactory threadFactory) {
        c0 c0Var = new c0(this.f265234o, i10, threadFactory, this.f265231m3);
        j0(c0Var);
        return c0Var;
    }

    public a0(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.t0 t0Var) {
        super(yVar, t0Var);
    }
}
