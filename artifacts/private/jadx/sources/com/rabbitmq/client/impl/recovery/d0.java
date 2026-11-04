package com.rabbitmq.client.impl.recovery;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class d0 extends com.rabbitmq.client.impl.u {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private volatile long f265716h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private volatile long f265717i3;

    public d0(com.rabbitmq.client.impl.i iVar, int i10, com.rabbitmq.client.impl.a0 a0Var) {
        this(iVar, i10, a0Var, new com.rabbitmq.client.r0());
    }

    private com.rabbitmq.client.impl.k.b.f r3(com.rabbitmq.client.impl.k.b.f fVar) {
        return new com.rabbitmq.client.impl.k.b.f(fVar.h(), fVar.i() + this.f265717i3, fVar.s(), fVar.f(), fVar.g());
    }

    @Override // com.rabbitmq.client.impl.u, com.rabbitmq.client.k
    public void D9(long j10, boolean z10) throws IOException {
        long j11 = j10 - this.f265717i3;
        if (j11 > 0) {
            Q0(new com.rabbitmq.client.impl.k.b.q(j11, z10));
            this.f265830p1.n(this, j10);
        }
    }

    @Override // com.rabbitmq.client.impl.u
    protected void L2(com.rabbitmq.client.m mVar, com.rabbitmq.client.impl.k.b.f fVar) {
        long jI = fVar.i();
        if (jI > this.f265716h3) {
            this.f265716h3 = jI;
        }
        super.L2(mVar, r3(fVar));
    }

    public long l3() {
        return this.f265717i3;
    }

    public long n3() {
        return this.f265716h3;
    }

    void o3(d0 d0Var) {
        this.f265717i3 = d0Var.l3() + d0Var.n3();
        this.f265716h3 = 0L;
    }

    @Override // com.rabbitmq.client.impl.u, com.rabbitmq.client.k
    public void q3(long j10, boolean z10, boolean z11) throws IOException {
        long j11 = j10 - this.f265717i3;
        if (z10 && j10 == 0) {
            j11 = 0;
        } else if (j11 <= 0) {
            return;
        }
        Q0(new com.rabbitmq.client.impl.k.b.j(j11, z10, z11));
        this.f265830p1.f(this, j10);
    }

    @Override // com.rabbitmq.client.impl.u, com.rabbitmq.client.k
    public void z6(long j10, boolean z10) throws IOException {
        long j11 = j10 - this.f265717i3;
        if (z10 && j10 == 0) {
            j11 = 0;
        } else if (j11 <= 0) {
            return;
        }
        Q0(new com.rabbitmq.client.impl.k.b.a(j11, z10));
        this.f265830p1.b(this, j10, z10);
    }

    public d0(com.rabbitmq.client.impl.i iVar, int i10, com.rabbitmq.client.impl.a0 a0Var, com.rabbitmq.client.p0 p0Var) {
        super(iVar, i10, a0Var, p0Var);
        this.f265716h3 = 0L;
        this.f265717i3 = 0L;
    }
}
