package com.planner5d.library.activity;

import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.helper.b2;
import dagger.internal.j;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class h implements fg.g<MainCardboard> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f136659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.initialization.d<MainCardboard, b2, com.planner5d.library.activity.helper.b<MainCardboard>>> f136660b;

    public h(ij.c<k> cVar, ij.c<com.planner5d.library.model.manager.initialization.d<MainCardboard, b2, com.planner5d.library.activity.helper.b<MainCardboard>>> cVar2) {
        this.f136659a = cVar;
        this.f136660b = cVar2;
    }

    public static fg.g<MainCardboard> a(ij.c<k> cVar, ij.c<com.planner5d.library.model.manager.initialization.d<MainCardboard, b2, com.planner5d.library.activity.helper.b<MainCardboard>>> cVar2) {
        return new h(cVar, cVar2);
    }

    @j("com.planner5d.library.activity.MainCardboard.dialogLauncher")
    public static void b(MainCardboard mainCardboard, k kVar) {
        mainCardboard.f131470h = kVar;
    }

    @j("com.planner5d.library.activity.MainCardboard.initializableHandler")
    public static void c(MainCardboard mainCardboard, com.planner5d.library.model.manager.initialization.d<MainCardboard, b2, com.planner5d.library.activity.helper.b<MainCardboard>> dVar) {
        mainCardboard.f131471i = dVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(MainCardboard mainCardboard) {
        b(mainCardboard, this.f136659a.get());
        c(mainCardboard, this.f136660b.get());
    }
}
