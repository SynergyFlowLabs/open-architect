package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f122461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f122462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f122463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f122464d;

    public d(View view, boolean z10) {
        this.f122461a = view;
        this.f122462b = z10;
    }

    public int a() {
        if (this.f122461a.getVisibility() == 8) {
            return 0;
        }
        View view = this.f122461a;
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        return scrollView.getPaddingBottom() + scrollView.getPaddingTop() + scrollView.getChildAt(0).getMeasuredHeight();
    }

    public int b() {
        if (this.f122461a.getVisibility() == 8) {
            return 0;
        }
        return this.f122461a.getMeasuredHeight();
    }

    public int c() {
        return this.f122464d;
    }

    public int d() {
        return this.f122463c;
    }

    public View e() {
        return this.f122461a;
    }

    public boolean f() {
        return this.f122462b;
    }

    public void g(int i10, int i11) {
        b.b(this.f122461a, i10, i11);
    }

    public void h(int i10, int i11) {
        this.f122463c = i10;
        this.f122464d = i11;
    }
}
