package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.core.graphics.drawable.i;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class a extends Drawable implements t, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f113327a;

    @Override // android.graphics.drawable.Drawable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f113327a = new b(this.f113327a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f113327a;
        if (bVar.f113329b) {
            bVar.f113328a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public Drawable.ConstantState getConstantState() {
        return this.f113327a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f113327a.f113328a.getOpacity();
    }

    @Override // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f113327a.f113328a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f113327a.f113328a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f113327a.f113328a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zF = com.google.android.material.ripple.b.f(iArr);
        b bVar = this.f113327a;
        if (bVar.f113329b == zF) {
            return zOnStateChange;
        }
        bVar.f113329b = zF;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f113327a.f113328a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f113327a.f113328a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        this.f113327a.f113328a.setShapeAppearanceModel(pVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTint(@l int i10) {
        this.f113327a.f113328a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintList(@p0 ColorStateList colorStateList) {
        this.f113327a.f113328a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintMode(@p0 PorterDuff.Mode mode) {
        this.f113327a.f113328a.setTintMode(mode);
    }

    public a(p pVar) {
        this(new b(new k(pVar)));
    }

    static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        k f113328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f113329b;

        public b(k kVar) {
            this.f113328a = kVar;
            this.f113329b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@NonNull b bVar) {
            this.f113328a = (k) bVar.f113328a.getConstantState().newDrawable();
            this.f113329b = bVar.f113329b;
        }
    }

    private a(b bVar) {
        this.f113327a = bVar;
    }
}
