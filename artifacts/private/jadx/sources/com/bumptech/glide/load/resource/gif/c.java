package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.bumptech.glide.load.n;
import com.bumptech.glide.util.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c extends Drawable implements g.b, Animatable, androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f97130l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f97131m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f97132n = 119;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f97133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f97134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f97135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f97136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f97137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f97138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f97139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f97140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f97141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f97142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b.a> f97143k;

    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l1
        final g f97144a;

        a(g gVar) {
            this.f97144a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    @Deprecated
    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, n<Bitmap> nVar, int i10, int i11, Bitmap bitmap) {
        this(context, aVar, nVar, i10, i11, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback d() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect f() {
        if (this.f97142j == null) {
            this.f97142j = new Rect();
        }
        return this.f97142j;
    }

    private Paint k() {
        if (this.f97141i == null) {
            this.f97141i = new Paint(2);
        }
        return this.f97141i;
    }

    private void n() {
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f97143k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f97143k.get(i10).b(this);
            }
        }
    }

    private void p() {
        this.f97138f = 0;
    }

    private void u() {
        k.a(!this.f97136d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f97133a.f97144a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f97134b) {
                return;
            }
            this.f97134b = true;
            this.f97133a.f97144a.v(this);
            invalidateSelf();
        }
    }

    private void v() {
        this.f97134b = false;
        this.f97133a.f97144a.w(this);
    }

    @Override // com.bumptech.glide.load.resource.gif.g.b
    public void a() {
        if (d() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (i() == h() - 1) {
            this.f97138f++;
        }
        int i10 = this.f97139g;
        if (i10 == -1 || this.f97138f < i10) {
            return;
        }
        n();
        stop();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean b(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f97143k;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void c(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f97143k == null) {
            this.f97143k = new ArrayList();
        }
        this.f97143k.add(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f97143k;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f97136d) {
            return;
        }
        if (this.f97140h) {
            Gravity.apply(f97132n, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
            this.f97140h = false;
        }
        canvas.drawBitmap(this.f97133a.f97144a.c(), (Rect) null, f(), k());
    }

    public ByteBuffer e() {
        return this.f97133a.f97144a.b();
    }

    public Bitmap g() {
        return this.f97133a.f97144a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f97133a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f97133a.f97144a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f97133a.f97144a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int h() {
        return this.f97133a.f97144a.f();
    }

    public int i() {
        return this.f97133a.f97144a.d();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f97134b;
    }

    public n<Bitmap> j() {
        return this.f97133a.f97144a.h();
    }

    public int l() {
        return this.f97133a.f97144a.l();
    }

    boolean m() {
        return this.f97136d;
    }

    public void o() {
        this.f97136d = true;
        this.f97133a.f97144a.a();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f97140h = true;
    }

    public void q(n<Bitmap> nVar, Bitmap bitmap) {
        this.f97133a.f97144a.q(nVar, bitmap);
    }

    void r(boolean z10) {
        this.f97134b = z10;
    }

    public void s(int i10) {
        int i11 = -1;
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i10 != 0) {
            this.f97139g = i10;
            return;
        }
        int iJ = this.f97133a.f97144a.j();
        if (iJ != 0) {
            i11 = iJ;
        }
        this.f97139g = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        k().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        k().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.f97136d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f97137e = z10;
        if (!z10) {
            v();
        } else if (this.f97135c) {
            u();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f97135c = true;
        p();
        if (this.f97137e) {
            u();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f97135c = false;
        v();
    }

    public void t() {
        k.a(!this.f97134b, "You cannot restart a currently running animation.");
        this.f97133a.f97144a.r();
        start();
    }

    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, n<Bitmap> nVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.d(context), aVar, i10, i11, nVar, bitmap)));
    }

    c(a aVar) {
        this.f97137e = true;
        this.f97139g = -1;
        this.f97133a = (a) k.d(aVar);
    }

    @l1
    c(g gVar, Paint paint) {
        this(new a(gVar));
        this.f97141i = paint;
    }
}
