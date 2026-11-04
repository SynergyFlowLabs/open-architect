package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.view.View;
import androidx.annotation.f1;
import rx.Observable;

/* JADX INFO: loaded from: classes8.dex */
public class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PreloaderCoverView f258540a;

    public f(PreloaderCoverView preloaderCoverView) {
        this.f258540a = preloaderCoverView;
    }

    @Override // com.planner5d.library.widget.preloader.b
    public Context b() {
        return this.f258540a.getContext();
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void d() {
        this.f258540a.i();
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void e(Integer num) {
        this.f258540a.setMainBackgroundColor(num);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void f(Integer num) {
        this.f258540a.setMainColor(num);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void g(int i10) {
        this.f258540a.setGravity(i10);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void h(boolean z10) {
        this.f258540a.setLogoVisible(z10);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void i(int i10, int i11, int i12, int i13) {
        this.f258540a.o(i10, i11, i12, i13);
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void l(@f1 int i10, @f1 int i11, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.f258540a.p(i10, i11, onClickListener, onClickListener2);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void m(String str, Integer num, boolean z10, boolean z11) {
        this.f258540a.q(str, num != null);
    }

    @Override // com.planner5d.library.widget.preloader.b
    public Observable<Void> n(long j10, CharSequence charSequence, boolean z10) {
        return this.f258540a.r(j10, charSequence, z10);
    }
}
