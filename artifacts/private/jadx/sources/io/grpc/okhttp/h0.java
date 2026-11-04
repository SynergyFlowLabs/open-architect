package io.grpc.okhttp;

import io.grpc.internal.r3;
import io.grpc.internal.s3;

/* JADX INFO: loaded from: classes13.dex */
class h0 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f290321a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f290322b = 1048576;

    h0() {
    }

    @Override // io.grpc.internal.s3
    public r3 a(int i10) {
        return new g0(new okio.l(), Math.min(1048576, Math.max(4096, i10)));
    }
}
