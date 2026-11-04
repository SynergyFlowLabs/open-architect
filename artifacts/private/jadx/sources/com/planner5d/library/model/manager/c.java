package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f181298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.feed.data.a> f181299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f181300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f181301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f181302e;

    public c(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.feed.data.a> cVar2, ij.c<com.planner5d.library.model.manager.config.p> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5) {
        this.f181298a = cVar;
        this.f181299b = cVar2;
        this.f181300c = cVar3;
        this.f181301d = cVar4;
        this.f181302e = cVar5;
    }

    public static c a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.feed.data.a> cVar2, ij.c<com.planner5d.library.model.manager.config.p> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5) {
        return new c(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static b c(com.planner5d.library.application.b bVar, fg.e<com.planner5d.library.feed.data.a> eVar, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.api.requests.c cVar, com.planner5d.library.modules.user.user.t tVar) {
        return new b(bVar, eVar, pVar, cVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f181298a.get(), dagger.internal.g.a(this.f181299b), this.f181300c.get(), this.f181301d.get(), this.f181302e.get());
    }
}
