package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0<?> f120819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f120820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f120821c;

    private v(Class<?> cls, int i10, int i11) {
        this((j0<?>) j0.b(cls), i10, i11);
    }

    public static v a(j0<?> j0Var) {
        return new v(j0Var, 0, 2);
    }

    public static v b(Class<?> cls) {
        return new v(cls, 0, 2);
    }

    private static String c(int i10) {
        if (i10 == 0) {
            return com.google.android.gms.fido.fido2.api.common.b.f107262q1;
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    public static v i(Class<?> cls) {
        return new v(cls, 0, 0);
    }

    public static v j(j0<?> j0Var) {
        return new v(j0Var, 0, 1);
    }

    public static v k(Class<?> cls) {
        return new v(cls, 0, 1);
    }

    public static v l(j0<?> j0Var) {
        return new v(j0Var, 1, 0);
    }

    public static v m(Class<?> cls) {
        boolean z10 = true & false;
        return new v(cls, 1, 0);
    }

    public static v n(j0<?> j0Var) {
        return new v(j0Var, 1, 1);
    }

    public static v o(Class<?> cls) {
        return new v(cls, 1, 1);
    }

    public static v p(j0<?> j0Var) {
        return new v(j0Var, 2, 0);
    }

    public static v q(Class<?> cls) {
        return new v(cls, 2, 0);
    }

    public static v r(j0<?> j0Var) {
        return new v(j0Var, 2, 1);
    }

    public static v s(Class<?> cls) {
        return new v(cls, 2, 1);
    }

    public j0<?> d() {
        return this.f120819a;
    }

    public boolean e() {
        return this.f120821c == 2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f120819a.equals(vVar.f120819a) && this.f120820b == vVar.f120820b && this.f120821c == vVar.f120821c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f120821c == 0;
    }

    public boolean g() {
        return this.f120820b == 1;
    }

    public boolean h() {
        return this.f120820b == 2;
    }

    public int hashCode() {
        return this.f120821c ^ ((((this.f120819a.hashCode() ^ 1000003) * 1000003) ^ this.f120820b) * 1000003);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f120819a);
        sb2.append(", type=");
        int i10 = this.f120820b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(c(this.f120821c));
        sb2.append("}");
        return sb2.toString();
    }

    private v(j0<?> j0Var, int i10, int i11) {
        this.f120819a = (j0) i0.c(j0Var, "Null dependency anInterface.");
        this.f120820b = i10;
        this.f120821c = i11;
    }
}
