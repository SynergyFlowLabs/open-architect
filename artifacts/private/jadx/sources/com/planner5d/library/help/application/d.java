package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d implements dagger.internal.h<com.planner5d.library.services.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f179972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.s> f179973b;

    public d(c cVar, ij.c<com.planner5d.library.activity.fragment.dialog.s> cVar2) {
        this.f179972a = cVar;
        this.f179973b = cVar2;
    }

    public static d a(c cVar, ij.c<com.planner5d.library.activity.fragment.dialog.s> cVar2) {
        return new d(cVar, cVar2);
    }

    public static com.planner5d.library.services.p c(c cVar, com.planner5d.library.activity.fragment.dialog.s sVar) {
        return (com.planner5d.library.services.p) dagger.internal.p.f(cVar.a(sVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.p get() {
        return c(this.f179972a, this.f179973b.get());
    }
}
