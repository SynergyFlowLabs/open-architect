package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes3.dex */
public class i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f97389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f97390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f97391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f97392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f97393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f97394f;

    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f97395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f97396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f97397c;

        a(a aVar) {
            this(aVar.f97395a, aVar.f97396b, aVar.f97397c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new i(this, this.f97395a.newDrawable());
        }

        a(Drawable.ConstantState constantState, int i10, int i11) {
            this.f97395a = constantState;
            this.f97396b = i10;
            this.f97397c = i11;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new i(this, this.f97395a.newDrawable(resources));
        }
    }

    public i(Drawable drawable, int i10, int i11) {
        this(new a(drawable.getConstantState(), i10, i11), drawable);
    }

    private void a() {
        this.f97389a.setRectToRect(this.f97390b, this.f97391c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f97392d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        canvas.concat(this.f97389a);
        this.f97392d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(19)
    public int getAlpha() {
        return this.f97392d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f97392d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f97392d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f97393e;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f97392d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f97393e.f97397c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f97393e.f97396b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f97392d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f97392d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f97392d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f97392d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f97392d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f97394f && super.mutate() == this) {
            this.f97392d = this.f97392d.mutate();
            this.f97393e = new a(this.f97393e);
            boolean z10 = false | true;
            this.f97394f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@NonNull Runnable runnable, long j10) {
        super.scheduleSelf(runnable, j10);
        this.f97392d.scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f97392d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f97391c.set(i10, i11, i12, i13);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f97392d.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, @NonNull PorterDuff.Mode mode) {
        this.f97392d.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z10) {
        this.f97392d.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f97392d.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return this.f97392d.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@NonNull Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f97392d.unscheduleSelf(runnable);
    }

    i(a aVar, Drawable drawable) {
        this.f97393e = (a) com.bumptech.glide.util.k.d(aVar);
        this.f97392d = (Drawable) com.bumptech.glide.util.k.d(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f97389a = new Matrix();
        this.f97390b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f97391c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f97392d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect) {
        super.setBounds(rect);
        this.f97391c.set(rect);
        a();
    }
}
