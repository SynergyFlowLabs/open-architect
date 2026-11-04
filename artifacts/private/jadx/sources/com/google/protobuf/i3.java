package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
@y
final class i3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i3 f126017c = new i3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, o3<?>> f126019b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p3 f126018a = new f2();

    private i3() {
    }

    public static i3 a() {
        return f126017c;
    }

    int b() {
        int iY = 0;
        int i10 = 0 >> 0;
        for (o3<?> o3Var : this.f126019b.values()) {
            if (o3Var instanceof q2) {
                iY += ((q2) o3Var).y();
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

    public <T> void e(T message, m3 reader) throws IOException {
        f(message, reader, v0.d());
    }

    public <T> void f(T message, m3 reader, v0 extensionRegistry) throws IOException {
        j(message).j(message, reader, extensionRegistry);
    }

    public o3<?> g(Class<?> messageType, o3<?> schema) {
        s1.e(messageType, "messageType");
        s1.e(schema, "schema");
        return this.f126019b.putIfAbsent(messageType, schema);
    }

    @x
    public o3<?> h(Class<?> messageType, o3<?> schema) {
        s1.e(messageType, "messageType");
        s1.e(schema, "schema");
        return this.f126019b.put(messageType, schema);
    }

    public <T> o3<T> i(Class<T> cls) {
        s1.e(cls, "messageType");
        o3<T> o3VarA = (o3) this.f126019b.get(cls);
        if (o3VarA == null) {
            o3VarA = this.f126018a.a(cls);
            o3<T> o3Var = (o3<T>) g(cls, o3VarA);
            if (o3Var != null) {
                return o3Var;
            }
        }
        return o3VarA;
    }

    public <T> o3<T> j(T message) {
        return i(message.getClass());
    }

    public <T> void k(T message, z4 writer) throws IOException {
        j(message).h(message, writer);
    }
}
