package com.planner5d.library.widget.menu;

import android.view.Menu;
import android.view.MenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Menu> f258362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Integer> f258363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<Function1<? super MenuItem, Unit>> f258364c;

    public k(ij.c<Menu> cVar, ij.c<Integer> cVar2, ij.c<Function1<? super MenuItem, Unit>> cVar3) {
        this.f258362a = cVar;
        this.f258363b = cVar2;
        this.f258364c = cVar3;
    }

    public static k a(ij.c<Menu> cVar, ij.c<Integer> cVar2, ij.c<Function1<? super MenuItem, Unit>> cVar3) {
        return new k(cVar, cVar2, cVar3);
    }

    public static j c(Menu menu, int i10, Function1<? super MenuItem, Unit> function1) {
        return new j(menu, i10, function1);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f258362a.get(), this.f258363b.get().intValue(), this.f258364c.get());
    }
}
