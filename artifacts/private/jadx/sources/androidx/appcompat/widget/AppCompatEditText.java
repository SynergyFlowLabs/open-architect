package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements androidx.core.view.p1, androidx.core.view.d1, o0, androidx.core.widget.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f10930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f10931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f10932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.t f10933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final p f10934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private a f10935f;

    @androidx.annotation.w0(api = 26)
    class a {
        a() {
        }

        @androidx.annotation.p0
        public TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    @androidx.annotation.k1
    @androidx.annotation.w0(26)
    private a getSuperCaller() {
        if (this.f10935f == null) {
            this.f10935f = new a();
        }
        return this.f10935f;
    }

    @Override // androidx.core.view.d1
    @androidx.annotation.p0
    public androidx.core.view.e a(@NonNull androidx.core.view.e eVar) {
        return this.f10933d.a(this, eVar);
    }

    void d(p pVar) {
        KeyListener keyListener = getKeyListener();
        if (pVar.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = pVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f10930a;
        if (fVar != null) {
            fVar.b();
        }
        g0 g0Var = this.f10931b;
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
        f fVar = this.f10930a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f10930a;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10931b.j();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10931b.k();
    }

    @Override // android.widget.TextView
    @NonNull
    @androidx.annotation.w0(api = 26)
    public TextClassifier getTextClassifier() {
        return getSuperCaller().a();
    }

    @Override // androidx.appcompat.widget.o0
    public boolean isEmojiCompatEnabled() {
        return this.f10934e.c();
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.p0
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        String[] strArrK0;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f10931b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = r.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrK0 = androidx.core.view.u1.k0(this)) != null) {
            androidx.core.view.inputmethod.a.i(editorInfo, strArrK0);
            inputConnectionA = androidx.core.view.inputmethod.c.d(this, inputConnectionA, editorInfo);
        }
        return this.f10934e.e(inputConnectionA, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (c0.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (c0.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f10930a;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f10930a;
        if (fVar != null) {
            fVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f10931b;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f10931b;
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
        this.f10934e.f(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@androidx.annotation.p0 KeyListener keyListener) {
        super.setKeyListener(this.f10934e.a(keyListener));
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        f fVar = this.f10930a;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        f fVar = this.f10930a;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f10931b.w(colorStateList);
        this.f10931b.b();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f10931b.x(mode);
        this.f10931b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        g0 g0Var = this.f10931b;
        if (g0Var != null) {
            g0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(api = 26)
    public void setTextClassifier(@androidx.annotation.p0 TextClassifier textClassifier) {
        getSuperCaller().b(textClassifier);
    }

    public AppCompatEditText(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.f285989t1);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @androidx.annotation.p0
    public Editable getText() {
        return super.getText();
    }

    public AppCompatEditText(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(g1.b(context), attributeSet, i10);
        e1.a(this, getContext());
        f fVar = new f(this);
        this.f10930a = fVar;
        fVar.e(attributeSet, i10);
        g0 g0Var = new g0(this);
        this.f10931b = g0Var;
        g0Var.m(attributeSet, i10);
        g0Var.b();
        this.f10932c = new f0(this);
        this.f10933d = new androidx.core.widget.t();
        p pVar = new p(this);
        this.f10934e = pVar;
        pVar.d(attributeSet, i10);
        d(pVar);
    }
}
