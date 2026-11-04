package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.x;

/* JADX INFO: loaded from: classes4.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r(unit = 0)
    private static final int f114032a = 24;

    c() {
    }

    static RectF a(TabLayout tabLayout, @p0 View view) {
        if (view == null) {
            return new RectF();
        }
        return (tabLayout.H() || !(view instanceof TabLayout.n)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.n) view, 24);
    }

    static RectF b(@NonNull TabLayout.n nVar, @r(unit = 0) int i10) {
        int contentWidth = nVar.getContentWidth();
        int contentHeight = nVar.getContentHeight();
        int i11 = (int) com.google.android.material.internal.p0.i(nVar.getContext(), i10);
        if (contentWidth < i11) {
            contentWidth = i11;
        }
        int left = (nVar.getLeft() + nVar.getRight()) / 2;
        int top = (nVar.getTop() + nVar.getBottom()) / 2;
        int i12 = contentWidth / 2;
        return new RectF(left - i12, top - (contentHeight / 2), i12 + left, top + (left / 2));
    }

    void c(TabLayout tabLayout, View view, @NonNull Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, View view2, @x(from = 0.0d, to = 1.0d) float f10, @NonNull Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(com.google.android.material.animation.b.c((int) rectFA.left, (int) rectFA2.left, f10), drawable.getBounds().top, com.google.android.material.animation.b.c((int) rectFA.right, (int) rectFA2.right, f10), drawable.getBounds().bottom);
    }
}
