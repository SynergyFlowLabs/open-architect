package sd;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class l implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b> f375981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f375982b;

    public l(ij.c<b> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2) {
        this.f375981a = cVar;
        this.f375982b = cVar2;
    }

    public static l a(ij.c<b> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2) {
        return new l(cVar, cVar2);
    }

    public static k c(b bVar, com.planner5d.library.activity.fragment.dialog.k kVar) {
        return new k(bVar, kVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f375981a.get(), this.f375982b.get());
    }
}
