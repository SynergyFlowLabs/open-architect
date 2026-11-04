package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class k extends CheckedTextView implements androidx.core.widget.u, androidx.core.view.p1, o0, androidx.core.widget.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f11378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f11379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f11380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private q f11381d;

    public k(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private q getEmojiTextViewHelper() {
        if (this.f11381d == null) {
            this.f11381d = new q(this);
        }
        return this.f11381d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        g0 g0Var = this.f11380c;
        if (g0Var != null) {
            g0Var.b();
        }
        f fVar = this.f11379b;
        if (fVar != null) {
            fVar.b();
        }
        l lVar = this.f11378a;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.r.F(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f11379b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f11379b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCheckMarkTintList() {
        l lVar = this.f11378a;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        l lVar = this.f11378a;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11380c.j();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11380c.k();
    }

    @Override // androidx.appcompat.widget.o0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.p0
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        return r.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f11379b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f11379b;
        if (fVar != null) {
            fVar.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        l lVar = this.f11378a;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f11380c;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f11380c;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.r.G(this, callback));
    }

    @Override // androidx.appcompat.widget.o0
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        f fVar = this.f11379b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        f fVar = this.f11379b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        l lVar = this.f11378a;
        if (lVar != null) {
            lVar.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        l lVar = this.f11378a;
        if (lVar != null) {
            lVar.g(mode);
        }
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f11380c.w(colorStateList);
        this.f11380c.b();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f11380c.x(mode);
        this.f11380c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i10) {
        super.setTextAppearance(context, i10);
        g0 g0Var = this.f11380c;
        if (g0Var != null) {
            g0Var.q(context, i10);
        }
    }

    public k(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.f286003w0);
    }

    public k(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(g1.b(context), attributeSet, i10);
        e1.a(this, getContext());
        g0 g0Var = new g0(this);
        this.f11380c = g0Var;
        g0Var.m(attributeSet, i10);
        g0Var.b();
        f fVar = new f(this);
        this.f11379b = fVar;
        fVar.e(attributeSet, i10);
        l lVar = new l(this);
        this.f11378a = lVar;
        lVar.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@androidx.annotation.v int i10) {
        setCheckMarkDrawable(j.a.b(getContext(), i10));
    }
}
