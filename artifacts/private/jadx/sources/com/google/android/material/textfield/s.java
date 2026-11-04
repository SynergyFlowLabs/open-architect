package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.p0;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes4.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f114206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f114207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f114208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f114209d;

    s(@NonNull r rVar) {
        this.f114206a = rVar.f114177a;
        this.f114207b = rVar;
        this.f114208c = rVar.getContext();
        this.f114209d = rVar.t();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @f1
    int c() {
        return 0;
    }

    @androidx.annotation.v
    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    androidx.core.view.accessibility.c.e h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(@p0 EditText editText) {
    }

    void o(View view, @NonNull androidx.core.view.accessibility.j jVar) {
    }

    void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z10) {
    }

    final void r() {
        this.f114207b.P(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}
