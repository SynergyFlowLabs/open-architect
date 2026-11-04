package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f111746a;

    class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f111747b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f111747b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.e
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f10 = rectF2.top;
            float f11 = rectF3.top;
            if (f10 < f11 && rectF2.bottom > f11) {
                float f12 = f11 - f10;
                rectF.top += f12;
                rectF3.top += f12;
            }
            float f13 = rectF2.bottom;
            float f14 = rectF3.bottom;
            if (f13 <= f14 || rectF2.top >= f14) {
                return;
            }
            float f15 = f13 - f14;
            rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
        }

        @Override // com.google.android.material.carousel.e
        int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f111747b.f0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // com.google.android.material.carousel.e
        public float f(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.e
        public RectF g(float f10, float f11, float f12, float f13) {
            return new RectF(0.0f, f12, f11, f10 - f12);
        }

        @Override // com.google.android.material.carousel.e
        int h() {
            return this.f111747b.j0();
        }

        @Override // com.google.android.material.carousel.e
        int i() {
            return h();
        }

        @Override // com.google.android.material.carousel.e
        int j() {
            return this.f111747b.s0();
        }

        @Override // com.google.android.material.carousel.e
        int k() {
            return this.f111747b.D0() - this.f111747b.t0();
        }

        @Override // com.google.android.material.carousel.e
        int l() {
            return m();
        }

        @Override // com.google.android.material.carousel.e
        int m() {
            return 0;
        }

        @Override // com.google.android.material.carousel.e
        public void n(View view, int i10, int i11) {
            int iJ = j();
            this.f111747b.T0(view, iJ, i10, iJ + e(view), i11);
        }

        @Override // com.google.android.material.carousel.e
        public void o(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = fFloor;
                rectF.top = Math.min(rectF.top, fFloor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = fCeil;
                rectF.bottom = Math.max(fCeil, rectF.bottom);
            }
        }

        @Override // com.google.android.material.carousel.e
        public void p(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }
    }

    class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f111748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f111748b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.e
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f10 = rectF2.left;
            float f11 = rectF3.left;
            if (f10 < f11 && rectF2.right > f11) {
                float f12 = f11 - f10;
                rectF.left += f12;
                rectF2.left += f12;
            }
            float f13 = rectF2.right;
            float f14 = rectF3.right;
            if (f13 <= f14 || rectF2.left >= f14) {
                return;
            }
            float f15 = f13 - f14;
            rectF.right = Math.max(rectF.right - f15, rectF.left);
            rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
        }

        @Override // com.google.android.material.carousel.e
        int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f111748b.e0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.e
        public float f(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
        }

        @Override // com.google.android.material.carousel.e
        public RectF g(float f10, float f11, float f12, float f13) {
            return new RectF(f13, 0.0f, f11 - f13, f10);
        }

        @Override // com.google.android.material.carousel.e
        int h() {
            return this.f111748b.j0() - this.f111748b.q0();
        }

        @Override // com.google.android.material.carousel.e
        int i() {
            return this.f111748b.e3() ? j() : k();
        }

        @Override // com.google.android.material.carousel.e
        int j() {
            return 0;
        }

        @Override // com.google.android.material.carousel.e
        int k() {
            return this.f111748b.D0();
        }

        @Override // com.google.android.material.carousel.e
        int l() {
            return this.f111748b.e3() ? k() : j();
        }

        @Override // com.google.android.material.carousel.e
        int m() {
            return this.f111748b.v0();
        }

        @Override // com.google.android.material.carousel.e
        public void n(View view, int i10, int i11) {
            int iM = m();
            this.f111748b.T0(view, i10, iM, i11, iM + e(view));
        }

        @Override // com.google.android.material.carousel.e
        public void o(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = fFloor;
                rectF.left = Math.min(rectF.left, fFloor);
            }
            if (rectF2.left >= rectF3.right) {
                float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = fCeil;
                rectF.right = Math.max(fCeil, rectF.right);
            }
        }

        @Override // com.google.android.material.carousel.e
        public void p(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }
    }

    /* synthetic */ e(int i10, a aVar) {
        this(i10);
    }

    private static e b(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static e c(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return b(carouselLayoutManager);
        }
        if (i10 == 1) {
            return d(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static e d(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    abstract int e(View view);

    abstract float f(RecyclerView.q qVar);

    abstract RectF g(float f10, float f11, float f12, float f13);

    abstract int h();

    abstract int i();

    abstract int j();

    abstract int k();

    abstract int l();

    abstract int m();

    abstract void n(View view, int i10, int i11);

    abstract void o(RectF rectF, RectF rectF2, RectF rectF3);

    abstract void p(View view, Rect rect, float f10, float f11);

    private e(int i10) {
        this.f111746a = i10;
    }
}
