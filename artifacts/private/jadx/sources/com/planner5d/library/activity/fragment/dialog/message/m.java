package com.planner5d.library.activity.fragment.dialog.message;

import com.planner5d.library.activity.fragment.projects.c0;
import com.planner5d.library.activity.fragment.x;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class m implements fg.g<SnapshotSetupComplete> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<x> f132168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c0> f132169b;

    public m(ij.c<x> cVar, ij.c<c0> cVar2) {
        this.f132168a = cVar;
        this.f132169b = cVar2;
    }

    public static fg.g<SnapshotSetupComplete> a(ij.c<x> cVar, ij.c<c0> cVar2) {
        return new m(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.message.SnapshotSetupComplete.navigator")
    public static void c(SnapshotSetupComplete snapshotSetupComplete, x xVar) {
        snapshotSetupComplete.f132145o3 = xVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.message.SnapshotSetupComplete.sourceManager")
    public static void d(SnapshotSetupComplete snapshotSetupComplete, c0 c0Var) {
        snapshotSetupComplete.f132146p3 = c0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(SnapshotSetupComplete snapshotSetupComplete) {
        c(snapshotSetupComplete, this.f132168a.get());
        d(snapshotSetupComplete, this.f132169b.get());
    }
}
