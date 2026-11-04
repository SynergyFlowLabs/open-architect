package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
@y
final class k3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k3 f50407c = new k3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f50408d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, r3<?>> f50410b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s3 f50409a = new i2();

    private k3() {
    }

    public static k3 a() {
        return f50407c;
    }

    int b() {
        int iY = 0;
        for (r3<?> r3Var : this.f50410b.values()) {
            if (r3Var instanceof t2) {
                iY += ((t2) r3Var).y();
            }
        }
        return iY;
    }

    <T> boolean c(T message) {
        return j(message).d(message);
    }

    public <T> void d(T message) {
        j(message).e(message);
    }

    public <T> void e(T message, o3 reader) throws IOException {
        f(message, reader, v0.d());
    }

    public <T> void f(T message, o3 reader, v0 extensionRegistry) throws IOException {
        j(message).i(message, reader, extensionRegistry);
    }

    public r3<?> g(Class<?> messageType, r3<?> schema) {
        s1.e(messageType, "messageType");
        s1.e(schema, "schema");
        return this.f50410b.putIfAbsent(messageType, schema);
    }

    @x
    public r3<?> h(Class<?> messageType, r3<?> schema) {
        s1.e(messageType, "messageType");
        s1.e(schema, "schema");
        return this.f50410b.put(messageType, schema);
    }

    public <T> r3<T> i(Class<T> cls) {
        s1.e(cls, "messageType");
        r3<T> r3VarA = (r3) this.f50410b.get(cls);
        if (r3VarA == null) {
            r3VarA = this.f50409a.a(cls);
            r3<T> r3Var = (r3<T>) g(cls, r3VarA);
            if (r3Var != null) {
                return r3Var;
            }
        }
        return r3VarA;
    }

    public <T> r3<T> j(T message) {
        return i(message.getClass());
    }

    public <T> void k(T message, c5 writer) throws IOException {
        j(message).h(message, writer);
    }
}
