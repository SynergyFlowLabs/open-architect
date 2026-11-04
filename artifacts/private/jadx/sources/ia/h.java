package ia;

import com.planner5d.library.model.manager.payments.a0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.a> f287067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<a0> f287068b;

    public h(ij.c<com.planner5d.library.activity.a> cVar, ij.c<a0> cVar2) {
        this.f287067a = cVar;
        this.f287068b = cVar2;
    }

    public static h a(ij.c<com.planner5d.library.activity.a> cVar, ij.c<a0> cVar2) {
        return new h(cVar, cVar2);
    }

    public static g c(com.planner5d.library.activity.a aVar, a0 a0Var) {
        return new g(aVar, a0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f287067a.get(), this.f287068b.get());
    }
}
