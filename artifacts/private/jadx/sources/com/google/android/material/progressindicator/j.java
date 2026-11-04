package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class j<T extends Animator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected k f113253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final List<i.a> f113254b = new ArrayList();

    protected j(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f113254b.add(new i.a());
        }
    }

    abstract void a();

    protected float b(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    public abstract void c();

    public abstract void d(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar);

    protected void e(@NonNull k kVar) {
        this.f113253a = kVar;
    }

    abstract void f();

    @l1
    abstract void g();

    @l1
    abstract void h(float f10);

    abstract void i();

    public abstract void j();
}
