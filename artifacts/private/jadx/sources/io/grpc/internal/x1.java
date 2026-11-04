package io.grpc.internal;

import java.net.URI;

/* JADX INFO: loaded from: classes13.dex */
public class x1 extends io.grpc.y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.grpc.x1.d f290108a;

    x1(io.grpc.x1.d dVar) {
        this.f290108a = dVar;
    }

    @Override // io.grpc.x1.d
    public String a() {
        return this.f290108a.a();
    }

    @Override // io.grpc.x1.d
    public io.grpc.x1 b(URI uri, io.grpc.x1.b bVar) {
        return this.f290108a.b(uri, bVar);
    }

    @Override // io.grpc.y1
    protected boolean e() {
        return true;
    }

    @Override // io.grpc.y1
    protected int f() {
        return 5;
    }
}
