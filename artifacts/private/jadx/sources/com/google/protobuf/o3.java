package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@y
interface o3<T> {
    void a(T message, T other);

    boolean b(T message, T other);

    int c(T message);

    boolean d(T message);

    void e(T message);

    int f(T message);

    T g();

    void h(T message, z4 writer) throws IOException;

    void i(T message, byte[] data, int position, int limit, l.b registers) throws IOException;

    void j(T message, m3 reader, v0 extensionRegistry) throws IOException;
}
