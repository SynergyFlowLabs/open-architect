package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.view.View;
import androidx.annotation.f1;

/* JADX INFO: loaded from: classes8.dex */
class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PreloaderBoxView f258535a;

    public e(PreloaderBoxView preloaderBoxView) {
        this.f258535a = preloaderBoxView;
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected Integer a() {
        return this.f258535a.getMainBackgroundColor();
    }

    @Override // com.planner5d.library.widget.preloader.b
    public Context b() {
        return this.f258535a.getContext();
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected Integer c() {
        return this.f258535a.getScrimColor();
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void d() {
        this.f258535a.c();
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void e(Integer num) {
        this.f258535a.setMainBackgroundColor(num);
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void j(Integer num) {
        this.f258535a.setScrimColor(num);
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void l(@f1 int i10, @f1 int i11, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        m(this.f258535a.getContext().getString(i10), null, false, true);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void m(String str, Integer num, boolean z10, boolean z11) {
        if (num == null) {
            this.f258535a.f(str, z11);
        } else {
            this.f258535a.e(str, num.intValue(), z10, z11);
        }
    }
}
