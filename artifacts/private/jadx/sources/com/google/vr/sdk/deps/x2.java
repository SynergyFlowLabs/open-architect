package com.google.vr.sdk.deps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class x2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f129664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile x2 f129665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final x2 f129666d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, v2> f129667a;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f129668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f129669b;

        a(Object obj, int i10) {
            this.f129668a = obj;
            this.f129669b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f129668a == aVar.f129668a && this.f129669b == aVar.f129669b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f129668a) * 65535) + this.f129669b;
        }
    }

    static {
        e();
        f129666d = new x2((byte) 0);
    }

    x2() {
        this.f129667a = new HashMap();
    }

    public static x2 b() {
        return w2.a();
    }

    public static x2 c() {
        x2 x2VarC;
        x2 x2Var = f129665c;
        if (x2Var != null) {
            return x2Var;
        }
        synchronized (x2.class) {
            try {
                x2VarC = f129665c;
                if (x2VarC == null) {
                    x2VarC = w2.c();
                    f129665c = x2VarC;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x2VarC;
    }

    static x2 d() {
        return g3.b(x2.class);
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends t4> v2 a(ContainingType containingtype, int i10) {
        return this.f129667a.get(new a(containingtype, i10));
    }

    x2(byte b10) {
        this.f129667a = Collections.EMPTY_MAP;
    }
}
