package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f111760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f111761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f111762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f111763d;

    static final class b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f111764j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final float f111765k = Float.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f111766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f111767b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f111769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f111770e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<c> f111768c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f111771f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f111772g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f111773h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f111774i = -1;

        b(float f10, float f11) {
            this.f111766a = f10;
            this.f111767b = f11;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        @NonNull
        @z7.a
        b a(float f10, @x(from = 0.0d, to = 1.0d) float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        @NonNull
        @z7.a
        b b(float f10, @x(from = 0.0d, to = 1.0d) float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        @NonNull
        @z7.a
        b c(float f10, @x(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        @NonNull
        @z7.a
        b d(float f10, @x(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f111767b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        @NonNull
        @z7.a
        b e(float f10, @x(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        @NonNull
        @z7.a
        b f(float f10, @x(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f111774i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f111774i = this.f111768c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f111769d == null) {
                    this.f111769d = cVar;
                    this.f111771f = this.f111768c.size();
                }
                if (this.f111772g != -1 && this.f111768c.size() - this.f111772g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f111769d.f111778d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f111770e = cVar;
                this.f111772g = this.f111768c.size();
            } else {
                if (this.f111769d == null && cVar.f111778d < this.f111773h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f111770e != null && cVar.f111778d > this.f111773h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f111773h = cVar.f111778d;
            this.f111768c.add(cVar);
            return this;
        }

        @NonNull
        @z7.a
        b g(float f10, @x(from = 0.0d, to = 1.0d) float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        @NonNull
        @z7.a
        b h(float f10, @x(from = 0.0d, to = 1.0d) float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        @NonNull
        k i() {
            if (this.f111769d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f111768c.size(); i10++) {
                c cVar = this.f111768c.get(i10);
                arrayList.add(new c(j(this.f111769d.f111776b, this.f111766a, this.f111771f, i10), cVar.f111776b, cVar.f111777c, cVar.f111778d, cVar.f111779e, cVar.f111780f, cVar.f111781g, cVar.f111782h));
            }
            return new k(this.f111766a, arrayList, this.f111771f, this.f111772g);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f111775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f111776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f111777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f111778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f111779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f111780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f111781g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f111782h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, @x(from = 0.0d, to = 1.0d) float f10) {
            return new c(com.google.android.material.animation.b.a(cVar.f111775a, cVar2.f111775a, f10), com.google.android.material.animation.b.a(cVar.f111776b, cVar2.f111776b, f10), com.google.android.material.animation.b.a(cVar.f111777c, cVar2.f111777c, f10), com.google.android.material.animation.b.a(cVar.f111778d, cVar2.f111778d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f111775a = f10;
            this.f111776b = f11;
            this.f111777c = f12;
            this.f111778d = f13;
            this.f111779e = z10;
            this.f111780f = f14;
            this.f111781g = f15;
            this.f111782h = f16;
        }
    }

    static k m(k kVar, k kVar2, float f10) {
        if (kVar.f() != kVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> listG = kVar.g();
        List<c> listG2 = kVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < kVar.g().size(); i10++) {
            arrayList.add(c.a(listG.get(i10), listG2.get(i10), f10));
        }
        return new k(kVar.f(), arrayList, com.google.android.material.animation.b.c(kVar.b(), kVar2.b(), f10), com.google.android.material.animation.b.c(kVar.i(), kVar2.i(), f10));
    }

    static k n(k kVar, float f10) {
        b bVar = new b(kVar.f(), f10);
        float f11 = (f10 - kVar.j().f111776b) - (kVar.j().f111778d / 2.0f);
        int size = kVar.g().size() - 1;
        while (size >= 0) {
            c cVar = kVar.g().get(size);
            bVar.d((cVar.f111778d / 2.0f) + f11, cVar.f111777c, cVar.f111778d, size >= kVar.b() && size <= kVar.i(), cVar.f111779e);
            f11 += cVar.f111778d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return this.f111761b.get(this.f111762c);
    }

    int b() {
        return this.f111762c;
    }

    c c() {
        return this.f111761b.get(0);
    }

    @p0
    c d() {
        for (int i10 = 0; i10 < this.f111761b.size(); i10++) {
            c cVar = this.f111761b.get(i10);
            if (!cVar.f111779e) {
                return cVar;
            }
        }
        return null;
    }

    List<c> e() {
        return this.f111761b.subList(this.f111762c, this.f111763d + 1);
    }

    float f() {
        return this.f111760a;
    }

    List<c> g() {
        return this.f111761b;
    }

    c h() {
        return this.f111761b.get(this.f111763d);
    }

    int i() {
        return this.f111763d;
    }

    c j() {
        List<c> list = this.f111761b;
        return list.get(list.size() - 1);
    }

    @p0
    c k() {
        for (int size = this.f111761b.size() - 1; size >= 0; size--) {
            c cVar = this.f111761b.get(size);
            if (!cVar.f111779e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator<c> it = this.f111761b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f111779e) {
                i10++;
            }
        }
        return this.f111761b.size() - i10;
    }

    private k(float f10, List<c> list, int i10, int i11) {
        this.f111760a = f10;
        this.f111761b = Collections.unmodifiableList(list);
        this.f111762c = i10;
        this.f111763d = i11;
    }
}
