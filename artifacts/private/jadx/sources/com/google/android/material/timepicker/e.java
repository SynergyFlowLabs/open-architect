package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes4.dex */
class e implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f114378a;

    public e(int i10) {
        this.f114378a = i10;
    }

    public int a() {
        return this.f114378a;
    }

    public void b(int i10) {
        this.f114378a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f114378a) {
                return null;
            }
        } catch (NumberFormatException unused) {
        }
        return "";
    }
}
