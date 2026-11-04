package com.rabbitmq.client.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class j implements com.rabbitmq.client.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f265269a;

    protected j() {
        this.f265269a = 0L;
    }

    private void k(DataOutputStream dataOutputStream, long j10) throws IOException {
        dataOutputStream.writeShort(0);
        dataOutputStream.writeLong(j10);
        j(new c0(dataOutputStream));
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public long h() {
        return this.f265269a;
    }

    public s0 i(int i10, long j10) throws IOException {
        s0 s0Var = new s0(2, i10);
        DataOutputStream dataOutputStreamF = s0Var.f();
        dataOutputStreamF.writeShort(o1());
        k(dataOutputStreamF, j10);
        return s0Var;
    }

    @Override // com.rabbitmq.client.w
    public void i9(StringBuilder sb2) {
        sb2.append("(?)");
    }

    public abstract void j(c0 c0Var) throws IOException;

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("#contentHeader<");
        sb2.append(Pb());
        sb2.append(">");
        i9(sb2);
        return sb2.toString();
    }

    protected j(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readShort();
        this.f265269a = dataInputStream.readLong();
    }
}
