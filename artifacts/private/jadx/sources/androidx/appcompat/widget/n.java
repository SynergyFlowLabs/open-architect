package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f11406b = "AppCompatDrawableManag";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f11407c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final PorterDuff.Mode f11408d = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static n f11409e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w0 f11410a;

    class a implements w0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f11411a = {i.a.f.f286177y0, i.a.f.f286173w0, i.a.f.f286128a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f11412b = {i.a.f.f286176y, i.a.f.f286143h0, i.a.f.F, i.a.f.A, i.a.f.B, i.a.f.E, i.a.f.D};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f11413c = {i.a.f.f286171v0, i.a.f.f286175x0, i.a.f.f286162r, i.a.f.f286163r0, i.a.f.f286165s0, i.a.f.f286167t0, i.a.f.f286169u0};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f11414d = {i.a.f.X, i.a.f.f286158p, i.a.f.W};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f11415e = {i.a.f.f286159p0, i.a.f.f286179z0};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f11416f = {i.a.f.f286134d, i.a.f.f286146j, i.a.f.f286136e, i.a.f.f286148k};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(@NonNull Context context) {
            return h(context, 0);
        }

        private ColorStateList h(@NonNull Context context, @androidx.annotation.l int i10) {
            int iD = e1.d(context, i.a.b.G0);
            int i11 = 4 >> 1;
            return new ColorStateList(new int[][]{e1.f11260c, e1.f11263f, e1.f11261d, e1.f11267j}, new int[]{e1.c(context, i.a.b.E0), androidx.core.graphics.h.v(iD, i10), androidx.core.graphics.h.v(iD, i10), i10});
        }

        private ColorStateList i(@NonNull Context context) {
            return h(context, e1.d(context, i.a.b.C0));
        }

        private ColorStateList j(@NonNull Context context) {
            return h(context, e1.d(context, i.a.b.E0));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListF = e1.f(context, i.a.b.L0);
            if (colorStateListF == null || !colorStateListF.isStateful()) {
                iArr[0] = e1.f11260c;
                iArr2[0] = e1.c(context, i.a.b.L0);
                iArr[1] = e1.f11264g;
                iArr2[1] = e1.d(context, i.a.b.F0);
                iArr[2] = e1.f11267j;
                iArr2[2] = e1.d(context, i.a.b.L0);
            } else {
                int[] iArr3 = e1.f11260c;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListF.getColorForState(iArr3, 0);
                iArr[1] = e1.f11264g;
                iArr2[1] = e1.d(context, i.a.b.F0);
                iArr[2] = e1.f11267j;
                iArr2[2] = colorStateListF.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(@NonNull w0 w0Var, @NonNull Context context, @androidx.annotation.q int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableJ = w0Var.j(context, i.a.f.f286151l0);
            Drawable drawableJ2 = w0Var.j(context, i.a.f.f286153m0);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = n.f11408d;
            }
            drawableMutate.setColorFilter(n.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.w0.f
        public Drawable a(@NonNull w0 w0Var, @NonNull Context context, int i10) {
            if (i10 == i.a.f.f286160q) {
                return new LayerDrawable(new Drawable[]{w0Var.j(context, i.a.f.f286158p), w0Var.j(context, i.a.f.f286162r)});
            }
            if (i10 == i.a.f.Z) {
                return l(w0Var, context, i.a.e.f286091h0);
            }
            if (i10 == i.a.f.Y) {
                return l(w0Var, context, i.a.e.f286093i0);
            }
            if (i10 == i.a.f.f286129a0) {
                return l(w0Var, context, i.a.e.f286095j0);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.w0.f
        public ColorStateList b(@NonNull Context context, int i10) {
            if (i10 == i.a.f.f286168u) {
                return j.a.a(context, i.a.d.f286066v);
            }
            if (i10 == i.a.f.f286157o0) {
                return j.a.a(context, i.a.d.f286072y);
            }
            if (i10 == i.a.f.f286155n0) {
                return k(context);
            }
            if (i10 == i.a.f.f286144i) {
                return j(context);
            }
            if (i10 == i.a.f.f286132c) {
                return g(context);
            }
            if (i10 == i.a.f.f286142h) {
                return i(context);
            }
            if (i10 == i.a.f.f286147j0 || i10 == i.a.f.f286149k0) {
                return j.a.a(context, i.a.d.f286070x);
            }
            if (f(this.f11412b, i10)) {
                return e1.f(context, i.a.b.H0);
            }
            if (f(this.f11415e, i10)) {
                return j.a.a(context, i.a.d.f286064u);
            }
            if (f(this.f11416f, i10)) {
                return j.a.a(context, i.a.d.f286062t);
            }
            if (i10 == i.a.f.f286141g0) {
                return j.a.a(context, i.a.d.f286068w);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.w0.f
        public PorterDuff.Mode c(int i10) {
            if (i10 == i.a.f.f286155n0) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.w0.f
        public boolean d(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            if (i10 == i.a.f.f286145i0) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), e1.d(context, i.a.b.H0), n.f11408d);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), e1.d(context, i.a.b.H0), n.f11408d);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), e1.d(context, i.a.b.F0), n.f11408d);
                return true;
            }
            if (i10 != i.a.f.Z && i10 != i.a.f.Y && i10 != i.a.f.f286129a0) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), e1.c(context, i.a.b.H0), n.f11408d);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), e1.d(context, i.a.b.F0), n.f11408d);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), e1.d(context, i.a.b.F0), n.f11408d);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005d  */
        /* JADX WARN: Code duplicated, block: B:24:0x006f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0074 A[RETURN] */
        @Override // androidx.appcompat.widget.w0.f
        public boolean e(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            int i11;
            boolean z10;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = n.f11408d;
            if (f(this.f11411a, i10)) {
                i11 = i.a.b.H0;
            } else if (f(this.f11413c, i10)) {
                i11 = i.a.b.F0;
            } else {
                if (!f(this.f11414d, i10)) {
                    if (i10 == i.a.f.L) {
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                        z10 = true;
                    } else {
                        if (i10 != i.a.f.f286166t) {
                            i11 = 0;
                            z10 = false;
                        }
                        iRound = -1;
                    }
                    if (z10) {
                        return false;
                    }
                    drawableMutate = drawable.mutate();
                    drawableMutate.setColorFilter(n.e(e1.d(context, i11), mode));
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    return true;
                }
                mode = PorterDuff.Mode.MULTIPLY;
                i11 = 16842801;
            }
            z10 = true;
            iRound = -1;
            if (z10) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(n.e(e1.d(context, i11), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }
    }

    public static synchronized n b() {
        try {
            if (f11409e == null) {
                i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11409e;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return w0.l(i10, mode);
    }

    public static synchronized void i() {
        try {
            if (f11409e == null) {
                n nVar = new n();
                f11409e = nVar;
                nVar.f11410a = w0.h();
                f11409e.f11410a.u(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static void j(Drawable drawable, h1 h1Var, int[] iArr) {
        w0.w(drawable, h1Var, iArr);
    }

    public synchronized Drawable c(@NonNull Context context, @androidx.annotation.v int i10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11410a.j(context, i10);
    }

    synchronized Drawable d(@NonNull Context context, @androidx.annotation.v int i10, boolean z10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11410a.k(context, i10, z10);
    }

    synchronized ColorStateList f(@NonNull Context context, @androidx.annotation.v int i10) {
        return this.f11410a.m(context, i10);
    }

    public synchronized void g(@NonNull Context context) {
        this.f11410a.s(context);
    }

    synchronized Drawable h(@NonNull Context context, @NonNull u1 u1Var, @androidx.annotation.v int i10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11410a.t(context, u1Var, i10);
    }

    boolean k(@NonNull Context context, @androidx.annotation.v int i10, @NonNull Drawable drawable) {
        return this.f11410a.x(context, i10, drawable);
    }
}
