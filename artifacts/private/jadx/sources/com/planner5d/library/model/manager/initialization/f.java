package com.planner5d.library.model.manager.initialization;

import androidx.appcompat.app.d;
import com.planner5d.library.model.manager.initialization.a;
import com.planner5d.library.model.manager.initialization.q;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f<T extends androidx.appcompat.app.d, U extends a<T>, V extends q<T>> implements dagger.internal.h<d<T, U, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<r> f191618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<V> f191619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<U> f191620c;

    public f(ij.c<r> cVar, ij.c<V> cVar2, ij.c<U> cVar3) {
        this.f191618a = cVar;
        this.f191619b = cVar2;
        this.f191620c = cVar3;
    }

    public static <T extends androidx.appcompat.app.d, U extends a<T>, V extends q<T>> f<T, U, V> a(ij.c<r> cVar, ij.c<V> cVar2, ij.c<U> cVar3) {
        return new f<>(cVar, cVar2, cVar3);
    }

    public static <T extends androidx.appcompat.app.d, U extends a<T>, V extends q<T>> d<T, U, V> c(r rVar, fg.e<V> eVar, fg.e<U> eVar2) {
        return new d<>(rVar, eVar, eVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d<T, U, V> get() {
        return c(this.f191618a.get(), dagger.internal.g.a(this.f191619b), dagger.internal.g.a(this.f191620c));
    }
}
