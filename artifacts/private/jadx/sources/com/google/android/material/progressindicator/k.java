package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.collection.b3;
import com.google.android.material.progressindicator.c;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k<S extends c> extends h {
    private Drawable X;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i<S> f113255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private j<ObjectAnimator> f113256w;

    k(@NonNull Context context, @NonNull c cVar, @NonNull i<S> iVar, @NonNull j<ObjectAnimator> jVar) {
        super(context, cVar);
        G(iVar);
        F(jVar);
    }

    @NonNull
    static k<o> A(@NonNull Context context, @NonNull o oVar, @NonNull l lVar) {
        return new k<>(context, oVar, lVar, oVar.f113286h == 0 ? new m(oVar) : new n(context, oVar));
    }

    private boolean E() {
        a aVar = this.f113234c;
        return aVar != null && aVar.a(this.f113232a.getContentResolver()) == 0.0f;
    }

    @NonNull
    public static k<f> x(@NonNull Context context, @NonNull f fVar) {
        return y(context, fVar, new d(fVar));
    }

    @NonNull
    static k<f> y(@NonNull Context context, @NonNull f fVar, @NonNull d dVar) {
        k<f> kVar = new k<>(context, fVar, dVar, new e(fVar));
        kVar.H(androidx.vectordrawable.graphics.drawable.i.d(context.getResources(), r6.a.g.f360545i1, null));
        return kVar;
    }

    @NonNull
    public static k<o> z(@NonNull Context context, @NonNull o oVar) {
        return A(context, oVar, new l(oVar));
    }

    @NonNull
    j<ObjectAnimator> B() {
        return this.f113256w;
    }

    @NonNull
    i<S> C() {
        return this.f113255v;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @p0
    public Drawable D() {
        return this.X;
    }

    void F(@NonNull j<ObjectAnimator> jVar) {
        this.f113256w = jVar;
        jVar.e(this);
    }

    void G(@NonNull i<S> iVar) {
        this.f113255v = iVar;
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP})
    public void H(@p0 Drawable drawable) {
        this.X = drawable;
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
        int i10;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (E() && (drawable = this.X) != null) {
                drawable.setBounds(getBounds());
                androidx.core.graphics.drawable.c.n(this.X, this.f113233b.f113186c[0]);
                this.X.draw(canvas);
                return;
            }
            canvas.save();
            this.f113255v.g(canvas, getBounds(), j(), n(), m());
            int i11 = this.f113233b.f113190g;
            int alpha = getAlpha();
            if (i11 == 0) {
                this.f113255v.d(canvas, this.f113244m, 0.0f, 1.0f, this.f113233b.f113187d, alpha, 0);
                i10 = i11;
            } else {
                i.a aVar = this.f113256w.f113254b.get(0);
                List<i.a> list = this.f113256w.f113254b;
                i.a aVar2 = list.get(list.size() - 1);
                i<S> iVar = this.f113255v;
                if (iVar instanceof l) {
                    i10 = i11;
                    iVar.d(canvas, this.f113244m, 0.0f, aVar.f113249a, this.f113233b.f113187d, alpha, i10);
                    this.f113255v.d(canvas, this.f113244m, aVar2.f113250b, 1.0f, this.f113233b.f113187d, alpha, i10);
                } else {
                    i10 = i11;
                    alpha = 0;
                    int i12 = 7 & 0;
                    iVar.d(canvas, this.f113244m, aVar2.f113250b, 1.0f + aVar.f113249a, this.f113233b.f113187d, 0, i10);
                }
            }
            for (int i13 = 0; i13 < this.f113256w.f113254b.size(); i13++) {
                i.a aVar3 = this.f113256w.f113254b.get(i13);
                this.f113255v.c(canvas, this.f113244m, aVar3, getAlpha());
                if (i13 > 0 && i10 > 0) {
                    this.f113255v.d(canvas, this.f113244m, this.f113256w.f113254b.get(i13 - 1).f113250b, aVar3.f113249a, this.f113233b.f113187d, alpha, i10);
                }
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f113255v.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f113255v.f();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
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
        Drawable drawable;
        boolean zW = super.w(z10, z11, z12);
        if (E() && (drawable = this.X) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f113256w.a();
        }
        if (z10) {
            if (!z12) {
                return zW;
            }
            this.f113256w.i();
        }
        return zW;
    }
}
