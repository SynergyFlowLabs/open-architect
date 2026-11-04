package com.google.android.material.transition;

/* JADX INFO: loaded from: classes4.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.a f114478a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.a f114479b = new C0998b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.a f114480c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.a f114481d = new d();

    class a implements com.google.android.material.transition.a {
        a() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.c.a(255, v.o(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.b$b, reason: collision with other inner class name */
    class C0998b implements com.google.android.material.transition.a {
        C0998b() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.c.b(v.o(255, 0, f11, f12, f10), 255);
        }
    }

    class c implements com.google.android.material.transition.a {
        c() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.c.b(v.o(255, 0, f11, f12, f10), v.o(0, 255, f11, f12, f10));
        }
    }

    class d implements com.google.android.material.transition.a {
        d() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f10, float f11, float f12, float f13) {
            float f14 = ((f12 - f11) * f13) + f11;
            return com.google.android.material.transition.c.b(v.o(255, 0, f11, f14, f10), v.o(0, 255, f14, f12, f10));
        }
    }

    private b() {
    }

    static com.google.android.material.transition.a a(int i10, boolean z10) {
        if (i10 == 0) {
            return z10 ? f114478a : f114479b;
        }
        if (i10 == 1) {
            return z10 ? f114479b : f114478a;
        }
        if (i10 == 2) {
            return f114480c;
        }
        if (i10 == 3) {
            return f114481d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
