package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f50698b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f50699c = "androidx.datastore.preferences.protobuf.Extension";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile v0 f50700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final v0 f50701e = new v0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<b, l1.h<?, ?>> f50702a;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Class<?> f50703a = a();

        private a() {
        }

        static Class<?> a() {
            try {
                return Class.forName(v0.f50699c);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f50704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f50705b;

        b(final Object object, final int number) {
            this.f50704a = object;
            this.f50705b = number;
        }

        public boolean equals(final Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f50704a == bVar.f50704a && this.f50705b == bVar.f50705b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f50704a) * 65535) + this.f50705b;
        }
    }

    v0() {
        this.f50702a = new HashMap();
    }

    public static v0 d() {
        v0 v0VarB;
        if (k3.f50408d) {
            return f50701e;
        }
        v0 v0Var = f50700d;
        if (v0Var != null) {
            return v0Var;
        }
        synchronized (v0.class) {
            try {
                v0VarB = f50700d;
                if (v0VarB == null) {
                    v0VarB = u0.b();
                    f50700d = v0VarB;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v0VarB;
    }

    public static boolean f() {
        return f50698b;
    }

    public static v0 g() {
        return k3.f50408d ? new v0() : u0.a();
    }

    public static void h(boolean isEagerlyParse) {
        f50698b = isEagerlyParse;
    }

    public final void a(t0<?, ?> extension) {
        if (l1.h.class.isAssignableFrom(extension.getClass())) {
            b((l1.h) extension);
        }
        if (k3.f50408d || !u0.d(this)) {
            return;
        }
        try {
            getClass().getMethod("add", a.f50703a).invoke(this, extension);
        } catch (Exception e10) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extension), e10);
        }
    }

    public final void b(final l1.h<?, ?> extension) {
        this.f50702a.put(new b(extension.h(), extension.d()), extension);
    }

    public <ContainingType extends q2> l1.h<ContainingType, ?> c(final ContainingType containingTypeDefaultInstance, final int fieldNumber) {
        return (l1.h) this.f50702a.get(new b(containingTypeDefaultInstance, fieldNumber));
    }

    public v0 e() {
        return new v0(this);
    }

    v0(v0 other) {
        if (other == f50701e) {
            this.f50702a = Collections.EMPTY_MAP;
        } else {
            this.f50702a = Collections.unmodifiableMap(other.f50702a);
        }
    }

    v0(boolean empty) {
        this.f50702a = Collections.EMPTY_MAP;
    }
}
