package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f126420b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f126421c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f126422d = "com.google.protobuf.Extension";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile v0 f126423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final v0 f126424f = new v0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<b, l1.h<?, ?>> f126425a;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Class<?> f126426a = a();

        private a() {
        }

        static Class<?> a() {
            try {
                return Class.forName(v0.f126422d);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f126427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f126428b;

        b(final Object object, final int number) {
            this.f126427a = object;
            this.f126428b = number;
        }

        public boolean equals(final Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f126427a == bVar.f126427a && this.f126428b == bVar.f126428b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f126427a) * 65535) + this.f126428b;
        }
    }

    v0() {
        this.f126425a = new HashMap();
    }

    public static v0 d() {
        v0 v0VarB;
        if (!f126421c) {
            return f126424f;
        }
        v0 v0Var = f126423e;
        if (v0Var != null) {
            return v0Var;
        }
        synchronized (v0.class) {
            try {
                v0VarB = f126423e;
                if (v0VarB == null) {
                    v0VarB = u0.b();
                    f126423e = v0VarB;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v0VarB;
    }

    public static boolean f() {
        return f126420b;
    }

    public static v0 g() {
        return f126421c ? u0.a() : new v0();
    }

    public static void h(boolean isEagerlyParse) {
        f126420b = isEagerlyParse;
    }

    public final void a(t0<?, ?> extension) {
        if (l1.h.class.isAssignableFrom(extension.getClass())) {
            b((l1.h) extension);
        }
        if (f126421c && u0.d(this)) {
            try {
                getClass().getMethod("add", a.f126426a).invoke(this, extension);
            } catch (Exception e10) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extension), e10);
            }
        }
    }

    public final void b(final l1.h<?, ?> extension) {
        this.f126425a.put(new b(extension.h(), extension.d()), extension);
    }

    public <ContainingType extends n2> l1.h<ContainingType, ?> c(final ContainingType containingTypeDefaultInstance, final int fieldNumber) {
        return (l1.h) this.f126425a.get(new b(containingTypeDefaultInstance, fieldNumber));
    }

    public v0 e() {
        return new v0(this);
    }

    v0(v0 other) {
        if (other == f126424f) {
            this.f126425a = Collections.EMPTY_MAP;
        } else {
            this.f126425a = Collections.unmodifiableMap(other.f126425a);
        }
    }

    v0(boolean empty) {
        this.f126425a = Collections.EMPTY_MAP;
    }
}
