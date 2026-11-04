package com.rabbitmq.client;

import java.io.IOException;
import java.util.Objects;
import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes13.dex */
@FunctionalInterface
public interface z1 {
    static /* synthetic */ void b(z1 z1Var, z1 z1Var2, SSLEngine sSLEngine) throws IOException {
        z1Var.a(sSLEngine);
        z1Var2.a(sSLEngine);
    }

    void a(SSLEngine sSLEngine) throws IOException;

    default z1 c(final z1 z1Var) {
        Objects.requireNonNull(z1Var);
        return new z1() { // from class: com.rabbitmq.client.y1
            @Override // com.rabbitmq.client.z1
            public final void a(SSLEngine sSLEngine) throws IOException {
                z1.b(this.f266066a, z1Var, sSLEngine);
            }
        };
    }
}
