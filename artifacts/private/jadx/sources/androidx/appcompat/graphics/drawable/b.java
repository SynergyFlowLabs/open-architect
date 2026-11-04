package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean f10439m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f10440n = "DrawableContainerCompat";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final boolean f10441o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f10442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f10443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f10444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f10445d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10447f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f10450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f10451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f10452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f10453l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10446e = 255;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10448g = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.b$b, reason: collision with other inner class name */
    @w0(21)
    private static class C0032b {
        private C0032b() {
        }

        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    static class c implements Drawable.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable.Callback f10455a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f10455a;
            this.f10455a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f10455a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
            Drawable.Callback callback = this.f10455a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.f10455a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f10456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Resources f10457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f10461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Drawable[] f10462g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f10463h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f10464i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f10465j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Rect f10466k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f10467l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f10468m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10469n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f10470o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f10471p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f10472q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f10473r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f10474s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f10475t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f10476u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f10477v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f10478w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f10479x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f10480y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f10481z;

        d(d dVar, b bVar, Resources resources) {
            this.f10464i = false;
            this.f10467l = false;
            this.f10479x = true;
            this.A = 0;
            this.B = 0;
            this.f10456a = bVar;
            this.f10457b = resources != null ? resources : dVar != null ? dVar.f10457b : null;
            int iG = b.g(resources, dVar != null ? dVar.f10458c : 0);
            this.f10458c = iG;
            if (dVar == null) {
                this.f10462g = new Drawable[10];
                this.f10463h = 0;
                return;
            }
            this.f10459d = dVar.f10459d;
            this.f10460e = dVar.f10460e;
            this.f10477v = true;
            this.f10478w = true;
            this.f10464i = dVar.f10464i;
            this.f10467l = dVar.f10467l;
            this.f10479x = dVar.f10479x;
            this.f10480y = dVar.f10480y;
            this.f10481z = dVar.f10481z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f10458c == iG) {
                if (dVar.f10465j) {
                    this.f10466k = dVar.f10466k != null ? new Rect(dVar.f10466k) : null;
                    this.f10465j = true;
                }
                if (dVar.f10468m) {
                    this.f10469n = dVar.f10469n;
                    this.f10470o = dVar.f10470o;
                    this.f10471p = dVar.f10471p;
                    this.f10472q = dVar.f10472q;
                    this.f10468m = true;
                }
            }
            if (dVar.f10473r) {
                this.f10474s = dVar.f10474s;
                this.f10473r = true;
            }
            if (dVar.f10475t) {
                this.f10476u = dVar.f10476u;
                this.f10475t = true;
            }
            Drawable[] drawableArr = dVar.f10462g;
            this.f10462g = new Drawable[drawableArr.length];
            this.f10463h = dVar.f10463h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f10461f;
            if (sparseArray != null) {
                this.f10461f = sparseArray.clone();
            } else {
                this.f10461f = new SparseArray<>(this.f10463h);
            }
            int i10 = this.f10463h;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10461f.put(i11, constantState);
                    } else {
                        this.f10462g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        private void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f10461f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f10462g[this.f10461f.keyAt(i10)] = w(this.f10461f.valueAt(i10).newDrawable(this.f10457b));
                }
                this.f10461f = null;
            }
        }

        private Drawable w(Drawable drawable) {
            androidx.core.graphics.drawable.c.m(drawable, this.f10481z);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f10456a);
            return drawableMutate;
        }

        final boolean A(int i10, int i11) {
            int i12 = this.f10463h;
            Drawable[] drawableArr = this.f10462g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    boolean zM = androidx.core.graphics.drawable.c.m(drawable, i10);
                    if (i13 == i11) {
                        z10 = zM;
                    }
                }
            }
            this.f10481z = i10;
            return z10;
        }

        public final void B(boolean z10) {
            this.f10464i = z10;
        }

        final void C(Resources resources) {
            if (resources != null) {
                this.f10457b = resources;
                int iG = b.g(resources, this.f10458c);
                int i10 = this.f10458c;
                this.f10458c = iG;
                if (i10 != iG) {
                    this.f10468m = false;
                    this.f10465j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f10463h;
            if (i10 >= this.f10462g.length) {
                r(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f10456a);
            this.f10462g[i10] = drawable;
            this.f10463h++;
            this.f10460e = drawable.getChangingConfigurations() | this.f10460e;
            s();
            this.f10466k = null;
            this.f10465j = false;
            this.f10468m = false;
            this.f10477v = false;
            return i10;
        }

        @w0(21)
        final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i10 = this.f10463h;
                Drawable[] drawableArr = this.f10462g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && androidx.core.graphics.drawable.c.b(drawable)) {
                        androidx.core.graphics.drawable.c.a(drawableArr[i11], theme);
                        this.f10460e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                C(C0032b.c(theme));
            }
        }

        public boolean c() {
            if (this.f10477v) {
                return this.f10478w;
            }
            f();
            this.f10477v = true;
            int i10 = this.f10463h;
            Drawable[] drawableArr = this.f10462g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f10478w = false;
                    return false;
                }
            }
            this.f10478w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @w0(21)
        public boolean canApplyTheme() {
            int i10 = this.f10463h;
            Drawable[] drawableArr = this.f10462g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f10461f.get(i11);
                    if (constantState != null && C0032b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.c.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        final void d() {
            this.f10480y = false;
        }

        protected void e() {
            this.f10468m = true;
            f();
            int i10 = this.f10463h;
            Drawable[] drawableArr = this.f10462g;
            this.f10470o = -1;
            this.f10469n = -1;
            this.f10472q = 0;
            this.f10471p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f10469n) {
                    this.f10469n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f10470o) {
                    this.f10470o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f10471p) {
                    this.f10471p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f10472q) {
                    this.f10472q = minimumHeight;
                }
            }
        }

        final int g() {
            return this.f10462g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10460e | this.f10459d;
        }

        public final Drawable h(int i10) {
            int iIndexOfKey;
            Drawable drawable = this.f10462g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f10461f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable drawableW = w(this.f10461f.valueAt(iIndexOfKey).newDrawable(this.f10457b));
            this.f10462g[i10] = drawableW;
            this.f10461f.removeAt(iIndexOfKey);
            if (this.f10461f.size() == 0) {
                this.f10461f = null;
            }
            return drawableW;
        }

        public final int i() {
            return this.f10463h;
        }

        public final int j() {
            if (!this.f10468m) {
                e();
            }
            return this.f10470o;
        }

        public final int k() {
            if (!this.f10468m) {
                e();
            }
            return this.f10472q;
        }

        public final int l() {
            if (!this.f10468m) {
                e();
            }
            return this.f10471p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f10464i) {
                return null;
            }
            Rect rect2 = this.f10466k;
            if (rect2 != null || this.f10465j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i10 = this.f10463h;
            Drawable[] drawableArr = this.f10462g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f10465j = true;
            this.f10466k = rect;
            return rect;
        }

        public final int n() {
            if (!this.f10468m) {
                e();
            }
            return this.f10469n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            int iResolveOpacity;
            if (this.f10473r) {
                return this.f10474s;
            }
            f();
            int i10 = this.f10463h;
            Drawable[] drawableArr = this.f10462g;
            if (i10 > 0) {
                int i11 = 3 << 0;
                iResolveOpacity = drawableArr[0].getOpacity();
            } else {
                iResolveOpacity = -2;
            }
            for (int i12 = 1; i12 < i10; i12++) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawableArr[i12].getOpacity());
            }
            this.f10474s = iResolveOpacity;
            this.f10473r = true;
            return iResolveOpacity;
        }

        public void r(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10462g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10462g = drawableArr;
        }

        void s() {
            this.f10473r = false;
            this.f10475t = false;
        }

        public final boolean t() {
            return this.f10467l;
        }

        public final boolean u() {
            if (this.f10475t) {
                return this.f10476u;
            }
            f();
            int i10 = this.f10463h;
            Drawable[] drawableArr = this.f10462g;
            boolean z10 = false;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].isStateful()) {
                    z10 = true;
                    break;
                }
            }
            this.f10476u = z10;
            this.f10475t = true;
            return z10;
        }

        void v() {
            int i10 = this.f10463h;
            Drawable[] drawableArr = this.f10462g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f10480y = true;
        }

        public final void x(boolean z10) {
            this.f10467l = z10;
        }

        public final void y(int i10) {
            this.A = i10;
        }

        public final void z(int i10) {
            this.B = i10;
        }
    }

    private void e(Drawable drawable) {
        if (this.f10453l == null) {
            this.f10453l = new c();
        }
        drawable.setCallback(this.f10453l.b(drawable.getCallback()));
        try {
            if (this.f10442a.A <= 0 && this.f10447f) {
                drawable.setAlpha(this.f10446e);
            }
            d dVar = this.f10442a;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.c.o(drawable, dVar.F);
                }
                d dVar2 = this.f10442a;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.c.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f10442a.f10479x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.c.m(drawable, androidx.core.graphics.drawable.c.f(this));
            androidx.core.graphics.drawable.c.j(drawable, this.f10442a.C);
            Rect rect = this.f10443b;
            if (rect != null) {
                androidx.core.graphics.drawable.c.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f10453l.a());
        } catch (Throwable th2) {
            drawable.setCallback(this.f10453l.a());
            throw th2;
        }
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.c.f(this) == 1;
    }

    static int g(@p0 Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        long j10;
        boolean z12 = true;
        this.f10447f = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f10444c;
        if (drawable2 != null) {
            long j11 = this.f10451j;
            if (j11 != 0) {
                if (j11 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f10446e);
                    this.f10451j = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j11 - jUptimeMillis) * 255)) / this.f10442a.A)) * this.f10446e) / 255);
                    z11 = true;
                }
            }
            drawable = this.f10445d;
            if (drawable != null) {
                j10 = this.f10452k;
                if (j10 == 0) {
                    if (j10 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f10445d = null;
                        this.f10452k = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f10442a.B) * this.f10446e) / 255);
                    }
                }
                if (z10 || !z12) {
                }
                scheduleSelf(this.f10450i, jUptimeMillis + 16);
                return;
            }
            this.f10452k = 0L;
            z12 = z11;
            if (z10) {
            }
        }
        this.f10451j = 0L;
        z11 = false;
        drawable = this.f10445d;
        if (drawable != null) {
            j10 = this.f10452k;
            if (j10 == 0) {
                if (j10 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f10445d = null;
                    this.f10452k = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f10442a.B) * this.f10446e) / 255);
                }
            }
            if (z10) {
            }
        }
        this.f10452k = 0L;
        z12 = z11;
        if (z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    @w0(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        this.f10442a.b(theme);
    }

    void b() {
        this.f10442a.d();
        this.f10449h = false;
    }

    d c() {
        return this.f10442a;
    }

    @Override // android.graphics.drawable.Drawable
    @w0(21)
    public boolean canApplyTheme() {
        return this.f10442a.canApplyTheme();
    }

    int d() {
        return this.f10448g;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f10444c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f10445d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10446e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f10442a.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f10442a.c()) {
            return null;
        }
        this.f10442a.f10459d = getChangingConfigurations();
        return this.f10442a;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f10444c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f10443b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f10442a.t()) {
            return this.f10442a.j();
        }
        Drawable drawable = this.f10444c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f10442a.t()) {
            return this.f10442a.n();
        }
        Drawable drawable = this.f10444c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f10442a.t()) {
            return this.f10442a.k();
        }
        Drawable drawable = this.f10444c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f10442a.t()) {
            return this.f10442a.l();
        }
        Drawable drawable = this.f10444c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f10444c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f10442a.q();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(21)
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f10444c;
        if (drawable != null) {
            C0032b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        Rect rectM = this.f10442a.m();
        if (rectM != null) {
            rect.set(rectM);
            padding = (rectM.right | ((rectM.left | rectM.top) | rectM.bottom)) != 0;
        } else {
            Drawable drawable = this.f10444c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    boolean h(int i10) {
        if (i10 == this.f10448g) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f10442a.B > 0) {
            Drawable drawable = this.f10445d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f10444c;
            if (drawable2 != null) {
                this.f10445d = drawable2;
                this.f10452k = ((long) this.f10442a.B) + jUptimeMillis;
            } else {
                this.f10445d = null;
                this.f10452k = 0L;
            }
        } else {
            Drawable drawable3 = this.f10444c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            d dVar = this.f10442a;
            if (i10 < dVar.f10463h) {
                Drawable drawableH = dVar.h(i10);
                this.f10444c = drawableH;
                this.f10448g = i10;
                if (drawableH != null) {
                    int i11 = this.f10442a.A;
                    if (i11 > 0) {
                        this.f10451j = jUptimeMillis + ((long) i11);
                    }
                    e(drawableH);
                }
            } else {
                this.f10444c = null;
                this.f10448g = -1;
            }
        } else {
            this.f10444c = null;
            this.f10448g = -1;
        }
        if (this.f10451j != 0 || this.f10452k != 0) {
            Runnable runnable = this.f10450i;
            if (runnable == null) {
                this.f10450i = new a();
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    void i(d dVar) {
        this.f10442a = dVar;
        int i10 = this.f10448g;
        if (i10 >= 0) {
            Drawable drawableH = dVar.h(i10);
            this.f10444c = drawableH;
            if (drawableH != null) {
                e(drawableH);
            }
        }
        this.f10445d = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        d dVar = this.f10442a;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable != this.f10444c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f10442a.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f10442a.u();
    }

    void j(int i10) {
        h(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f10445d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f10445d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f10444c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f10447f) {
                this.f10444c.setAlpha(this.f10446e);
            }
        }
        if (this.f10452k != 0) {
            this.f10452k = 0L;
            z10 = true;
        }
        if (this.f10451j != 0) {
            this.f10451j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public void k(int i10) {
        this.f10442a.A = i10;
    }

    public void l(int i10) {
        this.f10442a.B = i10;
    }

    final void m(Resources resources) {
        this.f10442a.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f10449h && super.mutate() == this) {
            d dVarC = c();
            dVarC.v();
            i(dVarC);
            this.f10449h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10445d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f10444c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f10442a.A(i10, d());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f10445d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f10444c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f10445d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f10444c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        if (drawable != this.f10444c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f10447f && this.f10446e == i10) {
            return;
        }
        this.f10447f = true;
        this.f10446e = i10;
        Drawable drawable = this.f10444c;
        if (drawable != null) {
            if (this.f10451j == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f10442a;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f10444c;
            if (drawable != null) {
                androidx.core.graphics.drawable.c.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f10442a;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f10444c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f10442a;
        if (dVar.f10479x != z10) {
            dVar.f10479x = z10;
            Drawable drawable = this.f10444c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f10444c;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f10443b;
        if (rect == null) {
            this.f10443b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f10444c;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@l int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f10442a;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.c.o(this.f10444c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        d dVar = this.f10442a;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.c.p(this.f10444c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f10445d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f10444c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.f10444c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
