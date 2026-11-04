package ia;

import com.planner5d.library.model.manager.config.n;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<n> f287056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> f287057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<d> f287058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<g> f287059d;

    public c(ij.c<n> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> cVar2, ij.c<d> cVar3, ij.c<g> cVar4) {
        this.f287056a = cVar;
        this.f287057b = cVar2;
        this.f287058c = cVar3;
        this.f287059d = cVar4;
    }

    public static c a(ij.c<n> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> cVar2, ij.c<d> cVar3, ij.c<g> cVar4) {
        return new c(cVar, cVar2, cVar3, cVar4);
    }

    public static b c(fg.e<n> eVar, fg.e<com.planner5d.library.activity.fragment.dialog.purchase.s> eVar2, fg.e<d> eVar3, fg.e<g> eVar4) {
        return new b(eVar, eVar2, eVar3, eVar4);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(dagger.internal.g.a(this.f287056a), dagger.internal.g.a(this.f287057b), dagger.internal.g.a(this.f287058c), dagger.internal.g.a(this.f287059d));
    }
}
