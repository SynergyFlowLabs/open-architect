package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
class a extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.view.accessibility.j.a f114341a;

    public a(Context context, int i10) {
        this.f114341a = new androidx.core.view.accessibility.j.a(16, context.getString(i10));
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j jVar) {
        super.onInitializeAccessibilityNodeInfo(view, jVar);
        jVar.b(this.f114341a);
    }
}
