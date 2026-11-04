package com.rabbitmq.client;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: classes13.dex */
public interface p extends k1, Closeable {
    k Ae(int i10) throws IOException;

    h E7(g gVar, i2 i2Var);

    void Kb(String str);

    boolean M9(h hVar);

    int O();

    Map<String, Object> S0();

    void Te(h hVar);

    int U();

    void Ud(int i10, String str, int i11) throws IOException;

    Map<String, Object> X0();

    void abort();

    default Optional<k> c8(int i10) throws IOException {
        return Optional.ofNullable(Ae(i10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void close(int i10, String str) throws IOException;

    void de(int i10);

    String ee();

    g0 getExceptionHandler();

    String getId();

    int getPort();

    default Optional<k> h6() throws IOException {
        return Optional.ofNullable(jd());
    }

    k jd() throws IOException;

    void l5(int i10, String str, int i11);

    int m0();

    void nd();

    void r1(int i10, String str);

    InetAddress v1();

    void x1(int i10) throws IOException;
}
