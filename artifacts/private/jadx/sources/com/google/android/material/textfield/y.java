package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
class y extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f114257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private EditText f114258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f114259g;

    y(@NonNull r rVar, @androidx.annotation.v int i10) {
        super(rVar);
        this.f114257e = r6.a.g.O0;
        this.f114259g = new View.OnClickListener() { // from class: com.google.android.material.textfield.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.v(this.f114256a, view);
            }
        };
        if (i10 != 0) {
            this.f114257e = i10;
        }
    }

    public static /* synthetic */ void v(y yVar, View view) {
        EditText editText = yVar.f114258f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (yVar.w()) {
            yVar.f114258f.setTransformationMethod(null);
        } else {
            yVar.f114258f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            yVar.f114258f.setSelection(selectionEnd);
        }
        yVar.r();
    }

    private boolean w() {
        EditText editText = this.f114258f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.s
    void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.s
    @f1
    int c() {
        return r6.a.m.X1;
    }

    @Override // com.google.android.material.textfield.s
    @androidx.annotation.v
    int d() {
        return this.f114257e;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f114259g;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.s
    void n(@p0 EditText editText) {
        this.f114258f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        if (x(this.f114258f)) {
            this.f114258f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f114258f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
