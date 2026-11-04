package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e extends AutoCompleteTextView implements androidx.core.view.p1, o0, androidx.core.widget.w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f11251d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f11252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f11253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final p f11254c;

    public e(@NonNull Context context) {
        this(context, null);
    }

    void a(p pVar) {
        KeyListener keyListener = getKeyListener();
        if (pVar.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = pVar.a(keyListener);
            if (keyListenerA != keyListener) {
                super.setKeyListener(keyListenerA);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f11252a;
        if (fVar != null) {
            fVar.b();
        }
        g0 g0Var = this.f11253b;
        if (g0Var != null) {
            g0Var.b();
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
        f fVar = this.f11252a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f11252a;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11253b.j();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11253b.k();
    }

    @Override // androidx.appcompat.widget.o0
    public boolean isEmojiCompatEnabled() {
        return this.f11254c.c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f11254c.e(r.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f11252a;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f11252a;
        if (fVar != null) {
            fVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f11253b;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f11253b;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.r.G(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@androidx.annotation.v int i10) {
        setDropDownBackgroundDrawable(j.a.b(getContext(), i10));
    }

    @Override // androidx.appcompat.widget.o0
    public void setEmojiCompatEnabled(boolean z10) {
        this.f11254c.f(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@androidx.annotation.p0 KeyListener keyListener) {
        super.setKeyListener(this.f11254c.a(keyListener));
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        f fVar = this.f11252a;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        f fVar = this.f11252a;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f11253b.w(colorStateList);
        this.f11253b.b();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f11253b.x(mode);
        this.f11253b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        g0 g0Var = this.f11253b;
        if (g0Var != null) {
            g0Var.q(context, i10);
        }
    }

    public e(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.S);
    }

    public e(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(g1.b(context), attributeSet, i10);
        e1.a(this, getContext());
        j1 j1VarG = j1.G(getContext(), attributeSet, f11251d, i10, 0);
        if (j1VarG.C(0)) {
            setDropDownBackgroundDrawable(j1VarG.h(0));
        }
        j1VarG.I();
        f fVar = new f(this);
        this.f11252a = fVar;
        fVar.e(attributeSet, i10);
        g0 g0Var = new g0(this);
        this.f11253b = g0Var;
        g0Var.m(attributeSet, i10);
        g0Var.b();
        p pVar = new p(this);
        this.f11254c = pVar;
        pVar.d(attributeSet, i10);
        a(pVar);
    }
}
