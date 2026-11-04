package io.grpc;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public abstract class r1 extends f {
    public abstract boolean j(long j10, TimeUnit timeUnit) throws InterruptedException;

    @e0("https://github.com/grpc/grpc-java/issues/4056")
    public void k() {
    }

    @e0("https://github.com/grpc/grpc-java/issues/4359")
    public u l(boolean z10) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public abstract boolean m();

    public abstract boolean n();

    @e0("https://github.com/grpc/grpc-java/issues/4359")
    public void o(u uVar, Runnable runnable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @e0("https://github.com/grpc/grpc-java/issues/4056")
    public void p() {
    }

    public abstract r1 q();

    public abstract r1 r();
}
