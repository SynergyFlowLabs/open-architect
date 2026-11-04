package io.grpc.okhttp;

import io.grpc.n2;
import io.grpc.r2;
import io.grpc.t0;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes13.dex */
@t0
public final class t extends r2 {
    @Override // io.grpc.r2
    protected boolean b() {
        return true;
    }

    @Override // io.grpc.r2
    protected r2.a c(int i10, n2 n2Var) {
        s.c cVarI = s.I(n2Var);
        String str = cVarI.f290815b;
        return str != null ? r2.a.a(str) : r2.a.d(new s(new InetSocketAddress(i10), cVarI.f290814a));
    }

    @Override // io.grpc.r2
    protected int d() {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.r2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public s a(int i10) {
        throw new UnsupportedOperationException("Use Grpc.newServerBuilderForPort() instead");
    }
}
