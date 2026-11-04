package com.rabbitmq.client.impl.nio;

import com.rabbitmq.client.impl.s0;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class g implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s0 f265571a;

    public g(s0 s0Var) {
        this.f265571a = s0Var;
    }

    @Override // com.rabbitmq.client.impl.nio.b0
    public void a(DataOutputStream dataOutputStream) throws IOException {
        this.f265571a.n(dataOutputStream);
    }
}
