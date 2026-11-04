package com.planner5d.library.activity.fragment.snapshots;

import com.planner5d.library.model.manager.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class j implements fg.g<ImproveSnapshotWithAi> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ia.b> f136031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.y0> f136032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c2> f136033c;

    public j(ij.c<ia.b> cVar, ij.c<com.planner5d.library.model.manager.y0> cVar2, ij.c<c2> cVar3) {
        this.f136031a = cVar;
        this.f136032b = cVar2;
        this.f136033c = cVar3;
    }

    public static fg.g<ImproveSnapshotWithAi> a(ij.c<ia.b> cVar, ij.c<com.planner5d.library.model.manager.y0> cVar2, ij.c<c2> cVar3) {
        return new j(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.snapshots.ImproveSnapshotWithAi.imageManager")
    public static void b(ImproveSnapshotWithAi improveSnapshotWithAi, com.planner5d.library.model.manager.y0 y0Var) {
        improveSnapshotWithAi.imageManager = y0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.snapshots.ImproveSnapshotWithAi.messageManager")
    public static void d(ImproveSnapshotWithAi improveSnapshotWithAi, c2 c2Var) {
        improveSnapshotWithAi.messageManager = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.snapshots.ImproveSnapshotWithAi.paywallStrategy")
    public static void e(ImproveSnapshotWithAi improveSnapshotWithAi, ia.b bVar) {
        improveSnapshotWithAi.paywallStrategy = bVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ImproveSnapshotWithAi improveSnapshotWithAi) {
        e(improveSnapshotWithAi, this.f136031a.get());
        b(improveSnapshotWithAi, this.f136032b.get());
        d(improveSnapshotWithAi, this.f136033c.get());
    }
}
