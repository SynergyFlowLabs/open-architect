package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.g3;
import androidx.core.view.l2;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class i extends l2.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f111601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f111604h;

    public i(View view) {
        super(0);
        this.f111604h = new int[2];
        this.f111601e = view;
    }

    @Override // androidx.core.view.l2.b
    public void c(@NonNull l2 l2Var) {
        this.f111601e.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.l2.b
    public void d(@NonNull l2 l2Var) {
        this.f111601e.getLocationOnScreen(this.f111604h);
        this.f111602f = this.f111604h[1];
    }

    @Override // androidx.core.view.l2.b
    @NonNull
    public g3 e(@NonNull g3 g3Var, @NonNull List<l2> list) {
        for (l2 l2Var : list) {
            if ((l2Var.f() & g3.m.d()) != 0) {
                this.f111601e.setTranslationY(com.google.android.material.animation.b.c(this.f111603g, 0, l2Var.d()));
                break;
            }
        }
        return g3Var;
    }

    @Override // androidx.core.view.l2.b
    @NonNull
    public l2.a f(@NonNull l2 l2Var, @NonNull l2.a aVar) {
        this.f111601e.getLocationOnScreen(this.f111604h);
        int i10 = this.f111602f - this.f111604h[1];
        this.f111603g = i10;
        this.f111601e.setTranslationY(i10);
        return aVar;
    }
}
