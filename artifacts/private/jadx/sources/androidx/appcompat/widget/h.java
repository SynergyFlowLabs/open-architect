package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class h extends Button implements androidx.core.view.p1, androidx.core.widget.b, androidx.core.widget.w, o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f11319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f11320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private q f11321c;

    public h(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private q getEmojiTextViewHelper() {
        if (this.f11321c == null) {
            this.f11321c = new q(this);
        }
        return this.f11321c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f11319a;
        if (fVar != null) {
            fVar.b();
        }
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (v1.f11632d) {
            return super.getAutoSizeMaxTextSize();
        }
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            return g0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (v1.f11632d) {
            return super.getAutoSizeMinTextSize();
        }
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            return g0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (v1.f11632d) {
            return super.getAutoSizeStepGranularity();
        }
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            return g0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (v1.f11632d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        g0 g0Var = this.f11320b;
        return g0Var != null ? g0Var.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @e.a({"WrongConstant"})
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (v1.f11632d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            return g0Var.i();
        }
        return 0;
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
        f fVar = this.f11319a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f11319a;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11320b.j();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11320b.k();
    }

    @Override // androidx.appcompat.widget.o0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            g0Var.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        g0 g0Var = this.f11320b;
        if (g0Var == null || v1.f11632d || !g0Var.l()) {
            return;
        }
        this.f11320b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (v1.f11632d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            g0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        if (v1.f11632d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            g0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (v1.f11632d) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            g0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f11319a;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f11319a;
        if (fVar != null) {
            fVar.g(i10);
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

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            g0Var.s(z10);
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        f fVar = this.f11319a;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        f fVar = this.f11319a;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f11320b.w(colorStateList);
        this.f11320b.b();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f11320b.x(mode);
        this.f11320b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            g0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (v1.f11632d) {
            super.setTextSize(i10, f10);
            return;
        }
        g0 g0Var = this.f11320b;
        if (g0Var != null) {
            g0Var.A(i10, f10);
        }
    }

    public h(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.f285963o0);
    }

    public h(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(g1.b(context), attributeSet, i10);
        e1.a(this, getContext());
        f fVar = new f(this);
        this.f11319a = fVar;
        fVar.e(attributeSet, i10);
        g0 g0Var = new g0(this);
        this.f11320b = g0Var;
        g0Var.m(attributeSet, i10);
        g0Var.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
