package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f114606a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f114607b = new b();

    class a implements f {
        a() {
        }

        @Override // com.google.android.material.transition.platform.f
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fN = w.n(f13, f15, f11, f12, f10, true);
            float f17 = fN / f13;
            float f18 = fN / f15;
            return new h(f17, f18, fN, f14 * f17, fN, f16 * f18);
        }

        @Override // com.google.android.material.transition.platform.f
        public boolean b(h hVar) {
            return hVar.f114611d > hVar.f114613f;
        }

        @Override // com.google.android.material.transition.platform.f
        public void c(RectF rectF, float f10, h hVar) {
            rectF.bottom -= Math.abs(hVar.f114613f - hVar.f114611d) * f10;
        }
    }

    class b implements f {
        b() {
        }

        @Override // com.google.android.material.transition.platform.f
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fN = w.n(f14, f16, f11, f12, f10, true);
            float f17 = fN / f14;
            float f18 = fN / f16;
            return new h(f17, f18, f13 * f17, fN, f15 * f18, fN);
        }

        @Override // com.google.android.material.transition.platform.f
        public boolean b(h hVar) {
            return hVar.f114610c > hVar.f114612e;
        }

        @Override // com.google.android.material.transition.platform.f
        public void c(RectF rectF, float f10, h hVar) {
            float fAbs = (Math.abs(hVar.f114612e - hVar.f114610c) / 2.0f) * f10;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }
    }

    private g() {
    }

    static f a(int i10, boolean z10, RectF rectF, RectF rectF2) {
        if (i10 == 0) {
            return b(z10, rectF, rectF2) ? f114606a : f114607b;
        }
        if (i10 == 1) {
            return f114606a;
        }
        if (i10 == 2) {
            return f114607b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i10);
    }

    private static boolean b(boolean z10, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        float f10 = (fHeight2 * fWidth) / fWidth2;
        float f11 = (fWidth2 * fHeight) / fWidth;
        if (z10) {
            return f10 >= fHeight;
        }
        return f11 >= fHeight2;
    }
}
