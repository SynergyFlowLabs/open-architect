package io.grpc.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public interface t0 {
    t0 c(io.grpc.s sVar);

    void close();

    void dispose();

    void e(int i10);

    void flush();

    t0 g(boolean z10);

    void h(InputStream inputStream);

    boolean isClosed();
}
