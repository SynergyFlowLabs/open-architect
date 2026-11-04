package io.grpc;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/4159")
public abstract class y1 extends x1.d {
    public Collection<Class<? extends SocketAddress>> c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    protected String d() {
        return a();
    }

    protected abstract boolean e();

    protected abstract int f();
}
