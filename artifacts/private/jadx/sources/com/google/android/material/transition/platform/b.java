package com.google.android.material.transition.platform;

import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f114582a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f114583b = new C0999b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f114584c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f114585d = new d();

    class a implements com.google.android.material.transition.platform.a {
        a() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.platform.c.a(255, w.o(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.b$b, reason: collision with other inner class name */
    class C0999b implements com.google.android.material.transition.platform.a {
        C0999b() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.platform.c.b(w.o(255, 0, f11, f12, f10), 255);
        }
    }

    class c implements com.google.android.material.transition.platform.a {
        c() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f10, float f11, float f12, float f13) {
            return com.google.android.material.transition.platform.c.b(w.o(255, 0, f11, f12, f10), w.o(0, 255, f11, f12, f10));
        }
    }

    class d implements com.google.android.material.transition.platform.a {
        d() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f10, float f11, float f12, float f13) {
            float f14 = ((f12 - f11) * f13) + f11;
            return com.google.android.material.transition.platform.c.b(w.o(255, 0, f11, f14, f10), w.o(0, 255, f14, f12, f10));
        }
    }

    private b() {
    }

    static com.google.android.material.transition.platform.a a(int i10, boolean z10) {
        if (i10 == 0) {
            return z10 ? f114582a : f114583b;
        }
        if (i10 == 1) {
            return z10 ? f114583b : f114582a;
        }
        if (i10 == 2) {
            return f114584c;
        }
        if (i10 == 3) {
            return f114585d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
