package com.rabbitmq.client.impl.nio;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class h implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f265572a = new h();

    private h() {
    }

    @Override // com.rabbitmq.client.impl.nio.b0
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write("AMQP".getBytes("US-ASCII"));
        dataOutputStream.write(0);
        dataOutputStream.write(0);
        dataOutputStream.write(9);
        dataOutputStream.write(1);
    }
}
