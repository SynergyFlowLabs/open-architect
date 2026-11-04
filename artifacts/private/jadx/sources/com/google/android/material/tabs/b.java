package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f114031b = 0.5f;

    b() {
    }

    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f10, @NonNull Drawable drawable) {
        if (f10 >= 0.5f) {
            view = view2;
        }
        RectF rectFA = c.a(tabLayout, view);
        float fB = f10 < 0.5f ? com.google.android.material.animation.b.b(1.0f, 0.0f, 0.0f, 0.5f, f10) : com.google.android.material.animation.b.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fB * 255.0f));
    }
}
