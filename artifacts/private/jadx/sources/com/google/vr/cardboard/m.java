package com.google.vr.cardboard;

import android.view.Window;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Window f126843a;

    public m(Window window) {
        this.f126843a = window;
    }

    private void c() {
        this.f126843a.getDecorView().setSystemUiVisibility(5894);
    }

    private void d() {
    }

    public void a() {
        c();
        d();
    }

    public void b(boolean z10) {
        if (z10) {
            c();
        }
    }
}
