package com.planner5d.library.widget.preloader;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h0 f258614a;

    public t() {
        this(null);
    }

    public h0 a() {
        return this.f258614a;
    }

    public h0 b(View view) {
        if (this.f258614a.f258548b != view) {
            this.f258614a = new h0(view);
        }
        return this.f258614a;
    }

    public t(View view) {
        this.f258614a = new h0(view);
    }
}
