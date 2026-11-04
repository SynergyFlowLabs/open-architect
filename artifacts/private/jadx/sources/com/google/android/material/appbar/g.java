package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f111210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f111215f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f111216g = true;

    public g(View view) {
        this.f111210a = view;
    }

    void a() {
        View view = this.f111210a;
        u1.i1(view, this.f111213d - (view.getTop() - this.f111211b));
        View view2 = this.f111210a;
        u1.h1(view2, this.f111214e - (view2.getLeft() - this.f111212c));
    }

    public int b() {
        return this.f111212c;
    }

    public int c() {
        return this.f111211b;
    }

    public int d() {
        return this.f111214e;
    }

    public int e() {
        return this.f111213d;
    }

    public boolean f() {
        return this.f111216g;
    }

    public boolean g() {
        return this.f111215f;
    }

    void h() {
        this.f111211b = this.f111210a.getTop();
        this.f111212c = this.f111210a.getLeft();
    }

    public void i(boolean z10) {
        this.f111216g = z10;
    }

    public boolean j(int i10) {
        if (!this.f111216g || this.f111214e == i10) {
            return false;
        }
        this.f111214e = i10;
        a();
        return true;
    }

    public boolean k(int i10) {
        if (!this.f111215f || this.f111213d == i10) {
            return false;
        }
        this.f111213d = i10;
        a();
        return true;
    }

    public void l(boolean z10) {
        this.f111215f = z10;
    }
}
