package io.grpc.okhttp;

import io.grpc.internal.r3;

/* JADX INFO: loaded from: classes13.dex */
class g0 implements r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final okio.l f290315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f290316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f290317c;

    g0(okio.l lVar, int i10) {
        this.f290315a = lVar;
        this.f290316b = i10;
    }

    @Override // io.grpc.internal.r3
    public int a() {
        return this.f290316b;
    }

    @Override // io.grpc.internal.r3
    public void b(byte b10) {
        this.f290315a.writeByte(b10);
        this.f290316b--;
        this.f290317c++;
    }

    okio.l c() {
        return this.f290315a;
    }

    @Override // io.grpc.internal.r3
    public int q0() {
        return this.f290317c;
    }

    @Override // io.grpc.internal.r3
    public void release() {
    }

    @Override // io.grpc.internal.r3
    public void write(byte[] bArr, int i10, int i11) {
        this.f290315a.write(bArr, i10, i11);
        this.f290316b -= i11;
        this.f290317c += i11;
    }
}
