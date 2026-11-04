package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.g0;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f114052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f114053h;

    public TextInputEditText(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private String e(@NonNull TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        String str = "";
        String string = !TextUtils.isEmpty(hint) ? hint.toString() : "";
        if (zIsEmpty) {
            return !TextUtils.isEmpty(string) ? string : "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        if (!TextUtils.isEmpty(string)) {
            str = ", " + string;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @p0
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @p0
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean h(@p0 TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f114053h;
    }

    public boolean g() {
        return this.f114053h;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@p0 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!h(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f114052g);
        rect.bottom = this.f114052g.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@p0 Rect rect, @p0 Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!h(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    @p0
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.c0()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.c0() && super.getHint() == null && com.google.android.material.internal.n.d()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @p0
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@p0 Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!h(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f114052g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f114052g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f114053h = z10;
    }

    public TextInputEditText(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359580u6);
    }

    public TextInputEditText(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(a7.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f114052g = new Rect();
        TypedArray typedArrayK = g0.k(context, attributeSet, r6.a.o.tw, i10, r6.a.n.Ue, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayK.getBoolean(r6.a.o.uw, false));
        typedArrayK.recycle();
    }
}
