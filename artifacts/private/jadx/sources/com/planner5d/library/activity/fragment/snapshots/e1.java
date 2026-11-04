package com.planner5d.library.activity.fragment.snapshots;

import com.planner5d.library.model.manager.y1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class e1 implements fg.g<Snapshots> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c1> f135997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n0> f135998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f135999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.list.d0> f136000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<y1> f136001e;

    public e1(ij.c<c1> cVar, ij.c<n0> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3, ij.c<com.planner5d.library.activity.fragment.list.d0> cVar4, ij.c<y1> cVar5) {
        this.f135997a = cVar;
        this.f135998b = cVar2;
        this.f135999c = cVar3;
        this.f136000d = cVar4;
        this.f136001e = cVar5;
    }

    public static fg.g<Snapshots> a(ij.c<c1> cVar, ij.c<n0> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3, ij.c<com.planner5d.library.activity.fragment.list.d0> cVar4, ij.c<y1> cVar5) {
        return new e1(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.snapshots.Snapshots.actionsObserve")
    public static void b(Snapshots snapshots, com.planner5d.library.activity.fragment.list.d0 d0Var) {
        snapshots.actionsObserve = d0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.snapshots.Snapshots.contentViewModel")
    public static void c(Snapshots snapshots, c1 c1Var) {
        snapshots.contentViewModel = c1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.snapshots.Snapshots.dialogLauncher")
    public static void d(Snapshots snapshots, com.planner5d.library.activity.fragment.dialog.k kVar) {
        snapshots.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.snapshots.Snapshots.menuManager")
    public static void f(Snapshots snapshots, y1 y1Var) {
        snapshots.menuManager = y1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.snapshots.Snapshots.snapshotStatusViewModel")
    public static void g(Snapshots snapshots, n0 n0Var) {
        snapshots.snapshotStatusViewModel = n0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(Snapshots snapshots) {
        c(snapshots, this.f135997a.get());
        g(snapshots, this.f135998b.get());
        d(snapshots, this.f135999c.get());
        b(snapshots, this.f136000d.get());
        f(snapshots, this.f136001e.get());
    }
}
