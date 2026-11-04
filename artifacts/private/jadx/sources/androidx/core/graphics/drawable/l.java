package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@w0(21)
class l extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f47791h = "WrappedDrawableApi21";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Method f47792i;

    l(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f47792i == null) {
            try {
                f47792i = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.core.graphics.drawable.k
    protected boolean c() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Rect getDirtyBounds() {
        return this.f47790f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        this.f47790f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f47790f;
        if (drawable != null && (method = f47792i) != null) {
            try {
                return ((Boolean) method.invoke(drawable, null)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f47790f.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f47790f.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.f47790f.setTint(i10);
        }
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f47790f.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f47790f.setTintMode(mode);
        }
    }

    l(m mVar, Resources resources) {
        super(mVar, resources);
        g();
    }
}
