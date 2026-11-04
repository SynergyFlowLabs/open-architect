package io.grpc;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w.k<i2> f288811a = w.t("io.grpc.Server");

    public abstract void b() throws InterruptedException;

    public abstract boolean g(long j10, TimeUnit timeUnit) throws InterruptedException;

    @e0("https://github.com/grpc/grpc-java/issues/2222")
    public List<t2> j() {
        return Collections.EMPTY_LIST;
    }

    @e0("https://github.com/grpc/grpc-java/issues/5332")
    public List<? extends SocketAddress> k() {
        throw new UnsupportedOperationException();
    }

    @e0("https://github.com/grpc/grpc-java/issues/2222")
    public List<t2> l() {
        return Collections.EMPTY_LIST;
    }

    public int m() {
        return -1;
    }

    @e0("https://github.com/grpc/grpc-java/issues/2222")
    public List<t2> n() {
        return Collections.EMPTY_LIST;
    }

    public abstract boolean o();

    public abstract boolean p();

    public abstract i2 q();

    public abstract i2 r();

    public abstract i2 s() throws IOException;
}
