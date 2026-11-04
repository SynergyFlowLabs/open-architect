package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.collection.b3;
import com.google.android.material.progressindicator.c;

/* JADX INFO: loaded from: classes4.dex */
public final class g<S extends c> extends h {
    static final float H1 = 0.01f;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f113224p0 = 10000;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final float f113225p1 = 50.0f;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final androidx.dynamicanimation.animation.d<g<?>> f113226p2 = new a("indicatorLevel");
    private final androidx.dynamicanimation.animation.g X;
    private final i.a Y;
    private boolean Z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i<S> f113227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final androidx.dynamicanimation.animation.h f113228w;

    class a extends androidx.dynamicanimation.animation.d<g<?>> {
        a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(g<?> gVar) {
            return gVar.F() * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(g<?> gVar, float f10) {
            gVar.I(f10 / 10000.0f);
        }
    }

    g(@NonNull Context context, @NonNull c cVar, @NonNull i<S> iVar) {
        super(context, cVar);
        this.Z = false;
        H(iVar);
        this.Y = new i.a();
        androidx.dynamicanimation.animation.h hVar = new androidx.dynamicanimation.animation.h();
        this.f113228w = hVar;
        hVar.g(1.0f);
        hVar.i(50.0f);
        androidx.dynamicanimation.animation.g gVar = new androidx.dynamicanimation.animation.g(this, f113226p2);
        this.X = gVar;
        gVar.D(hVar);
        p(1.0f);
    }

    @NonNull
    public static g<f> A(@NonNull Context context, @NonNull f fVar) {
        return B(context, fVar, new d(fVar));
    }

    @NonNull
    static g<f> B(@NonNull Context context, @NonNull f fVar, @NonNull d dVar) {
        return new g<>(context, fVar, dVar);
    }

    @NonNull
    public static g<o> C(@NonNull Context context, @NonNull o oVar) {
        return D(context, oVar, new l(oVar));
    }

    @NonNull
    static g<o> D(@NonNull Context context, @NonNull o oVar, @NonNull l lVar) {
        return new g<>(context, oVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float F() {
        return this.Y.f113250b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(float f10) {
        this.Y.f113250b = f10;
        invalidateSelf();
    }

    @NonNull
    i<S> E() {
        return this.f113227v;
    }

    public void G(@NonNull androidx.dynamicanimation.animation.b.q qVar) {
        this.X.l(qVar);
    }

    void H(@NonNull i<S> iVar) {
        this.f113227v = iVar;
    }

    void J(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.h, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ boolean b(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        return super.b(aVar);
    }

    @Override // com.google.android.material.progressindicator.h, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void c(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        super.c(aVar);
    }

    @Override // com.google.android.material.progressindicator.h, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f113227v.g(canvas, getBounds(), j(), n(), m());
            this.f113244m.setStyle(Paint.Style.FILL);
            this.f113244m.setAntiAlias(true);
            i.a aVar = this.Y;
            c cVar = this.f113233b;
            aVar.f113251c = cVar.f113186c[0];
            int iD = cVar.f113190g;
            if (iD > 0) {
                if (!(this.f113227v instanceof l)) {
                    iD = (int) ((iD * n1.a.d(F(), 0.0f, 0.01f)) / 0.01f);
                }
                this.f113227v.d(canvas, this.f113244m, F(), 1.0f, this.f113233b.f113187d, getAlpha(), iD);
            } else {
                this.f113227v.d(canvas, this.f113244m, 0.0f, 1.0f, cVar.f113187d, getAlpha(), 0);
            }
            this.f113227v.c(canvas, this.f113244m, this.Y, getAlpha());
            this.f113227v.b(canvas, this.f113244m, this.f113233b.f113186c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f113227v.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f113227v.f();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.X.E();
        I(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.Z) {
            this.X.E();
            I(i10 / 10000.0f);
        } else {
            this.X.t(F() * 10000.0f);
            this.X.z(i10);
        }
        return true;
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@g0(from = 0, to = b3.f12144d) int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@p0 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean v(boolean z10, boolean z11, boolean z12) {
        return super.v(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.h
    boolean w(boolean z10, boolean z11, boolean z12) {
        boolean zW = super.w(z10, z11, z12);
        float fA = this.f113234c.a(this.f113232a.getContentResolver());
        if (fA == 0.0f) {
            this.Z = true;
            return zW;
        }
        this.Z = false;
        this.f113228w.i(50.0f / fA);
        return zW;
    }

    public void z(@NonNull androidx.dynamicanimation.animation.b.q qVar) {
        this.X.b(qVar);
    }
}
