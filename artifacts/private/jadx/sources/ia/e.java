package ia;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> f287062a;

    public e(ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> cVar) {
        this.f287062a = cVar;
    }

    public static e a(ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> cVar) {
        return new e(cVar);
    }

    public static d c(com.planner5d.library.activity.fragment.dialog.purchase.s sVar) {
        return new d(sVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f287062a.get());
    }
}
