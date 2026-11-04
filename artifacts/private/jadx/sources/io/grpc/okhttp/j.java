package io.grpc.okhttp;

import io.grpc.k1;
import io.grpc.t0;
import io.grpc.t1;
import java.net.SocketAddress;
import java.util.Collection;

/* JADX INFO: loaded from: classes13.dex */
@t0
public final class j extends t1 {
    @Override // io.grpc.t1
    protected Collection<Class<? extends SocketAddress>> c() {
        return i.X();
    }

    @Override // io.grpc.t1
    public boolean d() {
        return true;
    }

    @Override // io.grpc.t1
    public t1.a e(String str, io.grpc.g gVar) {
        i.g gVarK0 = i.k0(gVar);
        String str2 = gVarK0.f290377c;
        return str2 != null ? t1.a.b(str2) : t1.a.a(new i(str, gVar, gVarK0.f290376b, gVarK0.f290375a));
    }

    @Override // io.grpc.t1
    public int f() {
        return k1.c(j.class.getClassLoader()) ? 8 : 3;
    }

    @Override // io.grpc.t1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i a(String str, int i10) {
        return i.S(str, i10);
    }

    @Override // io.grpc.t1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public i b(String str) {
        return i.U(str);
    }
}
