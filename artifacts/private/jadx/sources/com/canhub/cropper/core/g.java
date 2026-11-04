package com.canhub.cropper.core;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f97767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f97768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f97769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f97770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f97771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f97772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f97773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f97774j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final RectF f97765a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final RectF f97766b = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f97775k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f97776l = 1.0f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97777a;

        static {
            int[] iArr = new int[CropImageView.d.values().length];
            try {
                iArr[CropImageView.d.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.d.OVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.d.RECTANGLE_VERTICAL_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.d.RECTANGLE_HORIZONTAL_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f97777a = iArr;
        }
    }

    private final float a(float f10, float f11, float f12, float f13) {
        return Math.max(Math.abs(f10 - f12), Math.abs(f11 - f13));
    }

    private final boolean b() {
        return !x();
    }

    private final h.b h(float f10, float f11, boolean z10) {
        float f12 = 6;
        float fWidth = this.f97765a.width() / f12;
        RectF rectF = this.f97765a;
        float f13 = rectF.left;
        float f14 = f13 + fWidth;
        float f15 = 5;
        float f16 = f13 + (fWidth * f15);
        float fHeight = rectF.height() / f12;
        float f17 = this.f97765a.top;
        float f18 = f17 + fHeight;
        float f19 = f17 + (f15 * fHeight);
        if (f10 < f14) {
            if (f11 < f18) {
                return h.b.TOP_LEFT;
            }
            return f11 < f19 ? h.b.LEFT : h.b.BOTTOM_LEFT;
        }
        if (f10 >= f16) {
            if (f11 < f18) {
                return h.b.TOP_RIGHT;
            }
            return f11 < f19 ? h.b.RIGHT : h.b.BOTTOM_RIGHT;
        }
        if (f11 < f18) {
            return h.b.TOP;
        }
        if (f11 >= f19) {
            return h.b.BOTTOM;
        }
        if (z10) {
            return h.b.CENTER;
        }
        return null;
    }

    private final h.b j(float f10, float f11, float f12, boolean z10) {
        RectF rectF = this.f97765a;
        if (a(f10, f11, rectF.left, rectF.centerY()) <= f12) {
            return h.b.LEFT;
        }
        RectF rectF2 = this.f97765a;
        if (a(f10, f11, rectF2.right, rectF2.centerY()) <= f12) {
            return h.b.RIGHT;
        }
        if (z10) {
            RectF rectF3 = this.f97765a;
            if (o(f10, f11, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom)) {
                return h.b.CENTER;
            }
        }
        return null;
    }

    private final h.b k(float f10, float f11, float f12, boolean z10) {
        RectF rectF = this.f97765a;
        if (p(f10, f11, rectF.left, rectF.top, f12)) {
            return h.b.TOP_LEFT;
        }
        RectF rectF2 = this.f97765a;
        if (p(f10, f11, rectF2.right, rectF2.top, f12)) {
            return h.b.TOP_RIGHT;
        }
        RectF rectF3 = this.f97765a;
        if (p(f10, f11, rectF3.left, rectF3.bottom, f12)) {
            return h.b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f97765a;
        if (p(f10, f11, rectF4.right, rectF4.bottom, f12)) {
            return h.b.BOTTOM_RIGHT;
        }
        if (z10) {
            RectF rectF5 = this.f97765a;
            if (o(f10, f11, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && b()) {
                return h.b.CENTER;
            }
        }
        RectF rectF6 = this.f97765a;
        if (q(f10, f11, rectF6.left, rectF6.right, rectF6.top, f12)) {
            return h.b.TOP;
        }
        RectF rectF7 = this.f97765a;
        if (q(f10, f11, rectF7.left, rectF7.right, rectF7.bottom, f12)) {
            return h.b.BOTTOM;
        }
        RectF rectF8 = this.f97765a;
        if (r(f10, f11, rectF8.left, rectF8.top, rectF8.bottom, f12)) {
            return h.b.LEFT;
        }
        RectF rectF9 = this.f97765a;
        if (r(f10, f11, rectF9.right, rectF9.top, rectF9.bottom, f12)) {
            return h.b.RIGHT;
        }
        if (z10) {
            RectF rectF10 = this.f97765a;
            if (o(f10, f11, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !b()) {
                return h.b.CENTER;
            }
        }
        return null;
    }

    private final h.b l(float f10, float f11, float f12, boolean z10) {
        if (a(f10, f11, this.f97765a.centerX(), this.f97765a.top) <= f12) {
            return h.b.TOP;
        }
        if (a(f10, f11, this.f97765a.centerX(), this.f97765a.bottom) <= f12) {
            return h.b.BOTTOM;
        }
        if (z10) {
            RectF rectF = this.f97765a;
            if (o(f10, f11, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                return h.b.CENTER;
            }
        }
        return null;
    }

    private final boolean o(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    private final boolean p(float f10, float f11, float f12, float f13, float f14) {
        return a(f10, f11, f12, f13) <= f14;
    }

    private final boolean q(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    private final boolean r(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }

    public final float c() {
        return r.A(this.f97770f, this.f97774j / this.f97776l);
    }

    public final float d() {
        return r.A(this.f97769e, this.f97773i / this.f97775k);
    }

    public final float e() {
        return r.t(this.f97768d, this.f97772h / this.f97776l);
    }

    public final float f() {
        return r.t(this.f97767c, this.f97771g / this.f97775k);
    }

    @Nullable
    public final h g(float f10, float f11, float f12, @NotNull CropImageView.d cropShape, boolean z10) {
        h.b bVarK;
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        int i10 = a.f97777a[cropShape.ordinal()];
        if (i10 == 1) {
            bVarK = k(f10, f11, f12, z10);
        } else if (i10 == 2) {
            bVarK = h(f10, f11, z10);
        } else if (i10 == 3) {
            bVarK = l(f10, f11, f12, z10);
        } else {
            if (i10 != 4) {
                throw new k0();
            }
            bVarK = j(f10, f11, f12, z10);
        }
        if (bVarK != null) {
            return new h(bVarK, this, f10, f11);
        }
        return null;
    }

    @NotNull
    public final RectF i() {
        this.f97766b.set(this.f97765a);
        return this.f97766b;
    }

    public final float m() {
        return this.f97776l;
    }

    public final float n() {
        return this.f97775k;
    }

    public final void s(float f10, float f11, float f12, float f13) {
        this.f97769e = f10;
        this.f97770f = f11;
        this.f97775k = f12;
        this.f97776l = f13;
    }

    public final void t(@NotNull CropImageOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f97767c = options.f97534l3;
        this.f97768d = options.f97536m3;
        this.f97771g = options.f97538n3;
        this.f97772h = options.f97540o3;
        this.f97773i = options.f97544p3;
        this.f97774j = options.f97545q3;
    }

    public final void u(int i10, int i11) {
        this.f97773i = i10;
        this.f97774j = i11;
    }

    public final void v(int i10, int i11) {
        this.f97771g = i10;
        this.f97772h = i11;
    }

    public final void w(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f97765a.set(rect);
    }

    public final boolean x() {
        return this.f97765a.width() >= 100.0f && this.f97765a.height() >= 100.0f;
    }
}
