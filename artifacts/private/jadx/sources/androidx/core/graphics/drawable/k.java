package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
class k extends Drawable implements Drawable.Callback, j, i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final PorterDuff.Mode f47784g = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PorterDuff.Mode f47786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    m f47788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f47789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f47790f;

    k(@NonNull m mVar, @p0 Resources resources) {
        this.f47788d = mVar;
        e(resources);
    }

    @NonNull
    private m d() {
        return new m(this.f47788d);
    }

    private void e(@p0 Resources resources) {
        Drawable.ConstantState constantState;
        m mVar = this.f47788d;
        if (mVar == null || (constantState = mVar.f47794b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        int i10 = 3 << 0;
        if (!c()) {
            return false;
        }
        m mVar = this.f47788d;
        ColorStateList colorStateList = mVar.f47795c;
        PorterDuff.Mode mode = mVar.f47796d;
        if (colorStateList == null || mode == null) {
            this.f47787c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f47787c || colorForState != this.f47785a || mode != this.f47786b) {
                setColorFilter(colorForState, mode);
                this.f47785a = colorForState;
                this.f47786b = mode;
                this.f47787c = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.j
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f47790f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f47790f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            m mVar = this.f47788d;
            if (mVar != null) {
                mVar.f47794b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.j
    public final Drawable b() {
        return this.f47790f;
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f47790f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        m mVar = this.f47788d;
        return this.f47790f.getChangingConfigurations() | changingConfigurations | (mVar != null ? mVar.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public Drawable.ConstantState getConstantState() {
        m mVar = this.f47788d;
        if (mVar == null || !mVar.a()) {
            return null;
        }
        this.f47788d.f47793a = getChangingConfigurations();
        return this.f47788d;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f47790f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f47790f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f47790f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(23)
    public int getLayoutDirection() {
        return c.f(this.f47790f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f47790f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f47790f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f47790f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f47790f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public int[] getState() {
        return this.f47790f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f47790f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return c.h(this.f47790f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        m mVar;
        ColorStateList colorStateList = (!c() || (mVar = this.f47788d) == null) ? null : mVar.f47795c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f47790f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f47790f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f47789e && super.mutate() == this) {
            this.f47788d = d();
            Drawable drawable = this.f47790f;
            if (drawable != null) {
                drawable.mutate();
            }
            m mVar = this.f47788d;
            if (mVar != null) {
                Drawable drawable2 = this.f47790f;
                mVar.f47794b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f47789e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f47790f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @w0(23)
    public boolean onLayoutDirectionChanged(int i10) {
        return c.m(this.f47790f, i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f47790f.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f47790f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        c.j(this.f47790f, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f47790f.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f47790f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f47790f.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f47790f.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        return f(iArr) || this.f47790f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintList(ColorStateList colorStateList) {
        this.f47788d.f47795c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.f47788d.f47796d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f47790f.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    k(@p0 Drawable drawable) {
        this.f47788d = d();
        a(drawable);
    }
}
