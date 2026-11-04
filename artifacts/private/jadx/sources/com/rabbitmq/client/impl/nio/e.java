package com.rabbitmq.client.impl.nio;

import java.nio.ByteBuffer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes13.dex */
public class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function<Integer, ByteBuffer> f265562a;

    public e(Function<Integer, ByteBuffer> function) {
        this.f265562a = function;
    }

    @Override // com.rabbitmq.client.impl.nio.b
    public ByteBuffer a(i iVar) {
        return iVar.b() == null ? this.f265562a.apply(Integer.valueOf(iVar.a().h())) : this.f265562a.apply(Integer.valueOf(iVar.b().getSession().getApplicationBufferSize()));
    }

    @Override // com.rabbitmq.client.impl.nio.b
    public ByteBuffer b(i iVar) {
        return f(iVar);
    }

    @Override // com.rabbitmq.client.impl.nio.b
    public ByteBuffer c(i iVar) {
        return f(iVar);
    }

    @Override // com.rabbitmq.client.impl.nio.b
    public ByteBuffer d(i iVar) {
        return iVar.b() == null ? this.f265562a.apply(Integer.valueOf(iVar.a().l())) : this.f265562a.apply(Integer.valueOf(iVar.b().getSession().getApplicationBufferSize()));
    }

    protected ByteBuffer f(i iVar) {
        if (iVar.b() != null) {
            return this.f265562a.apply(Integer.valueOf(iVar.b().getSession().getPacketBufferSize()));
        }
        throw new IllegalArgumentException("Encrypted byte buffer should be created only in SSL/TLS context");
    }

    public e() {
        this(new Function() { // from class: com.rabbitmq.client.impl.nio.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ByteBuffer.allocate(((Integer) obj).intValue());
            }
        });
    }
}
