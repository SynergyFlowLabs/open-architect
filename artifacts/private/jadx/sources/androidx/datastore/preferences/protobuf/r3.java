package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@y
interface r3<T> {
    void a(T message, T other);

    boolean b(T message, T other);

    int c(T message);

    boolean d(T message);

    void e(T message);

    int f(T message);

    T g();

    void h(T message, c5 writer) throws IOException;

    void i(T message, o3 reader, v0 extensionRegistry) throws IOException;

    void j(T message, byte[] data, int position, int limit, l.b registers) throws IOException;
}
