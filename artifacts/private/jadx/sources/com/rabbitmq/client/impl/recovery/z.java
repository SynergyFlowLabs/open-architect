package com.rabbitmq.client.impl.recovery;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class z extends s {
    public z(c cVar) {
        super(cVar);
    }

    @Override // com.rabbitmq.client.impl.recovery.s
    public void i() throws IOException {
        this.f265789a.E().V2(f(), h(), this.f265771d, this.f265772e);
    }

    public String toString() {
        return "RecordedQueueBinding[source=" + this.f265769b + ", destination=" + this.f265770c + ", routingKey=" + this.f265771d + ", arguments=" + this.f265772e + ", channel=" + this.f265789a + "]";
    }
}
