package com.google.vr.sdk.deps;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
final class f5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f5 f129372c = new f5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l5 f129373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, k5<?>> f129374b = new ConcurrentHashMap();

    private f5() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        l5 l5VarD = null;
        for (int i10 = 0; i10 <= 0 && (l5VarD = d(strArr[0])) == null; i10++) {
        }
        this.f129373a = l5VarD == null ? new j4() : l5VarD;
    }

    public static f5 a() {
        return f129372c;
    }

    private static l5 d(String str) {
        try {
            return (l5) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> k5<T> b(Class<T> cls) {
        k3.f(cls, "messageType");
        k5<T> k5VarA = (k5) this.f129374b.get(cls);
        if (k5VarA == null) {
            k5VarA = this.f129373a.a(cls);
            k3.f(cls, "messageType");
            k3.f(k5VarA, "schema");
            k5<T> k5Var = (k5) this.f129374b.putIfAbsent(cls, k5VarA);
            if (k5Var != null) {
                return k5Var;
            }
        }
        return k5VarA;
    }

    public final <T> k5<T> c(T t10) {
        return b(t10.getClass());
    }
}
