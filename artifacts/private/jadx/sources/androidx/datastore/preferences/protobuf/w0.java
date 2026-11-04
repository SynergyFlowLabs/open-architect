package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.f1.c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@y
abstract class w0<T extends f1.c<T>> {
    w0() {
    }

    abstract int a(Map.Entry<?, ?> extension);

    abstract Object b(v0 extensionRegistry, q2 defaultInstance, int number);

    abstract f1<T> c(Object message);

    abstract f1<T> d(Object message);

    abstract boolean e(q2 prototype);

    abstract void f(Object message);

    abstract <UT, UB> UB g(Object containerMessage, o3 reader, Object extension, v0 extensionRegistry, f1<T> extensions, UB unknownFields, r4<UT, UB> unknownFieldSchema) throws IOException;

    abstract void h(o3 reader, Object extension, v0 extensionRegistry, f1<T> extensions) throws IOException;

    abstract void i(u data, Object extension, v0 extensionRegistry, f1<T> extensions) throws IOException;

    abstract void j(c5 writer, Map.Entry<?, ?> extension) throws IOException;

    abstract void k(Object message, f1<T> extensions);
}
