package com.rabbitmq.client.impl;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class y0 implements com.rabbitmq.client.o0 {
    @Override // com.rabbitmq.client.o0
    public abstract int J();

    @Override // com.rabbitmq.client.o0
    public abstract int W();

    public void X(StringBuilder sb2) {
        sb2.append("(?)");
    }

    public abstract boolean Y();

    public s0 Z(int i10) throws IOException {
        s0 s0Var = new s0(1, i10);
        DataOutputStream dataOutputStreamF = s0Var.f();
        dataOutputStreamF.writeShort(W());
        dataOutputStreamF.writeShort(J());
        a1 a1Var = new a1(new k2(dataOutputStreamF));
        b0(a1Var);
        a1Var.b();
        return s0Var;
    }

    public abstract Object a0(k.h hVar) throws IOException;

    public abstract void b0(a1 a1Var) throws IOException;

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("#method<");
        sb2.append(z());
        sb2.append(">");
        X(sb2);
        return sb2.toString();
    }

    @Override // com.rabbitmq.client.o0
    public abstract String z();
}
