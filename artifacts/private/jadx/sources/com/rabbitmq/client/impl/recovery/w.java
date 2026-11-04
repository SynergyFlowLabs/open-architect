package com.rabbitmq.client.impl.recovery;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class w extends s {
    public w(c cVar) {
        super(cVar);
    }

    @Override // com.rabbitmq.client.impl.recovery.s
    public void i() throws IOException {
        this.f265789a.E().q9(this.f265770c, this.f265769b, this.f265771d, this.f265772e);
    }

    public String toString() {
        return "RecordedExchangeBinding[source=" + this.f265769b + ", destination=" + this.f265770c + ", routingKey=" + this.f265771d + ", arguments=" + this.f265772e + ", channel=" + this.f265789a + "]";
    }
}
