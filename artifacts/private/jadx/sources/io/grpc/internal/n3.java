package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public interface n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n3 f289633a = new a();

    class a implements n3 {
        a() {
        }

        @Override // io.grpc.internal.n3
        public long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}
