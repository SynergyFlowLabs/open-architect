package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class t extends ImageButton implements androidx.core.view.p1, androidx.core.widget.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f11590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f11591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11592c;

    public t(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f11590a;
        if (fVar != null) {
            fVar.b();
        }
        u uVar = this.f11591b;
        if (uVar != null) {
            uVar.c();
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f11590a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f11590a;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.x
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportImageTintList() {
        u uVar = this.f11591b;
        if (uVar != null) {
            return uVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.x
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportImageTintMode() {
        u uVar = this.f11591b;
        if (uVar != null) {
            return uVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f11591b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f11590a;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f11590a;
        if (fVar != null) {
            fVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        u uVar = this.f11591b;
        if (uVar != null) {
            uVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.p0 Drawable drawable) {
        u uVar = this.f11591b;
        if (uVar != null && drawable != null && !this.f11592c) {
            uVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        u uVar2 = this.f11591b;
        if (uVar2 != null) {
            uVar2.c();
            if (this.f11592c) {
                return;
            }
            this.f11591b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f11592c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@androidx.annotation.v int i10) {
        this.f11591b.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@androidx.annotation.p0 Uri uri) {
        super.setImageURI(uri);
        u uVar = this.f11591b;
        if (uVar != null) {
            uVar.c();
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        f fVar = this.f11590a;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        f fVar = this.f11590a;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // androidx.core.widget.x
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        u uVar = this.f11591b;
        if (uVar != null) {
            uVar.k(colorStateList);
        }
    }

    @Override // androidx.core.widget.x
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        u uVar = this.f11591b;
        if (uVar != null) {
            uVar.l(mode);
        }
    }

    public t(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.K1);
    }

    public t(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(g1.b(context), attributeSet, i10);
        this.f11592c = false;
        e1.a(this, getContext());
        f fVar = new f(this);
        this.f11590a = fVar;
        fVar.e(attributeSet, i10);
        u uVar = new u(this);
        this.f11591b = uVar;
        uVar.g(attributeSet, i10);
    }
}
