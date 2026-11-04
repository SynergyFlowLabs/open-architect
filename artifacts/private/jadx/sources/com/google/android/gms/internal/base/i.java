package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f107934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f107936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f107937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f107938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f107939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f107940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f107941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f107942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f107943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f107944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f107945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f107946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f107947o;

    public i(@p0 Drawable drawable, @p0 Drawable drawable2) {
        this(null);
        drawable = drawable == null ? f.f107929a : drawable;
        this.f107942j = drawable;
        drawable.setCallback(this);
        g gVar = this.f107941i;
        gVar.f107932b = drawable.getChangingConfigurations() | gVar.f107932b;
        drawable2 = drawable2 == null ? f.f107929a : drawable2;
        this.f107943k = drawable2;
        drawable2.setCallback(this);
        this.f107941i.f107932b |= drawable2.getChangingConfigurations();
    }

    public final Drawable a() {
        return this.f107943k;
    }

    public final void b(int i10) {
        this.f107935c = this.f107936d;
        this.f107938f = 0;
        this.f107937e = 250;
        this.f107933a = 1;
        invalidateSelf();
    }

    public final boolean c() {
        if (!this.f107944l) {
            boolean z10 = false;
            if (this.f107942j.getConstantState() != null && this.f107943k.getConstantState() != null) {
                z10 = true;
            }
            this.f107945m = z10;
            this.f107944l = true;
        }
        return this.f107945m;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11 = this.f107933a;
        int i12 = 0;
        if (i11 == 1) {
            this.f107934b = SystemClock.uptimeMillis();
            this.f107933a = 2;
            z10 = false;
        } else if (i11 == 2 && this.f107934b >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f107934b) / this.f107937e;
            z10 = fUptimeMillis >= 1.0f;
            if (z10) {
                this.f107933a = 0;
            }
            this.f107938f = (int) ((this.f107935c * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        } else {
            z10 = true;
        }
        int i13 = this.f107938f;
        boolean z11 = this.f107939g;
        Drawable drawable = this.f107942j;
        Drawable drawable2 = this.f107943k;
        if (!z10) {
            if (z11) {
                drawable.setAlpha(this.f107936d - i13);
                i12 = 1;
            }
            drawable.draw(canvas);
            if (i12 != 0) {
                drawable.setAlpha(this.f107936d);
            }
            if (i13 > 0) {
                drawable2.setAlpha(i13);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.f107936d);
            }
            invalidateSelf();
            return;
        }
        if (z11) {
            if (i13 == 0) {
            }
            i10 = this.f107936d;
            if (i13 == i10) {
                drawable2.setAlpha(i10);
                drawable2.draw(canvas);
            }
        }
        i12 = i13;
        drawable.draw(canvas);
        i13 = i12;
        i10 = this.f107936d;
        if (i13 == i10) {
            drawable2.setAlpha(i10);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        g gVar = this.f107941i;
        return gVar.f107932b | changingConfigurations | gVar.f107931a;
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public final Drawable.ConstantState getConstantState() {
        if (!c()) {
            return null;
        }
        this.f107941i.f107931a = getChangingConfigurations();
        return this.f107941i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f107942j.getIntrinsicHeight(), this.f107943k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f107942j.getIntrinsicWidth(), this.f107943k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f107946n) {
            this.f107947o = Drawable.resolveOpacity(this.f107942j.getOpacity(), this.f107943k.getOpacity());
            int i10 = 2 ^ 1;
            this.f107946n = true;
        }
        return this.f107947o;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.f107940h || super.mutate() != this) {
            return this;
        }
        if (!c()) {
            throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
        }
        this.f107942j.mutate();
        this.f107943k.mutate();
        this.f107940h = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f107942j.setBounds(rect);
        this.f107943k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f107938f == this.f107936d) {
            this.f107938f = i10;
        }
        this.f107936d = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f107942j.setColorFilter(colorFilter);
        this.f107943k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    i(@p0 g gVar) {
        this.f107933a = 0;
        this.f107936d = 255;
        this.f107938f = 0;
        this.f107939g = true;
        this.f107941i = new g(gVar);
    }
}
