package com.rabbitmq.client.impl;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends j implements com.rabbitmq.client.f {
    protected a() {
    }

    @Override // com.rabbitmq.client.impl.j
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected a(DataInputStream dataInputStream) throws IOException {
        super(dataInputStream);
    }
}
