package com.planner5d.library.widget.menu;

import android.view.Menu;
import android.view.MenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Menu> f258341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Integer> f258342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<Function1<? super MenuItem, Unit>> f258343c;

    public c(ij.c<Menu> cVar, ij.c<Integer> cVar2, ij.c<Function1<? super MenuItem, Unit>> cVar3) {
        this.f258341a = cVar;
        this.f258342b = cVar2;
        this.f258343c = cVar3;
    }

    public static c a(ij.c<Menu> cVar, ij.c<Integer> cVar2, ij.c<Function1<? super MenuItem, Unit>> cVar3) {
        return new c(cVar, cVar2, cVar3);
    }

    public static b c(Menu menu, int i10, Function1<? super MenuItem, Unit> function1) {
        return new b(menu, i10, function1);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f258341a.get(), this.f258342b.get().intValue(), this.f258343c.get());
    }
}
