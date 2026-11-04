package com.planner5d.library.activity.fragment.spaces.documents;

import com.planner5d.library.activity.fragment.list.d0;
import com.planner5d.library.model.manager.y1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class q implements fg.g<Documents> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f136233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d0> f136234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<y1> f136235c;

    public q(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<d0> cVar2, ij.c<y1> cVar3) {
        this.f136233a = cVar;
        this.f136234b = cVar2;
        this.f136235c = cVar3;
    }

    public static fg.g<Documents> a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<d0> cVar2, ij.c<y1> cVar3) {
        return new q(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.spaces.documents.Documents.actionsObserve")
    public static void b(Documents documents, d0 d0Var) {
        documents.actionsObserve = d0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.spaces.documents.Documents.dialogLauncher")
    public static void c(Documents documents, com.planner5d.library.activity.fragment.dialog.k kVar) {
        documents.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.spaces.documents.Documents.menuManager")
    public static void e(Documents documents, y1 y1Var) {
        documents.menuManager = y1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(Documents documents) {
        c(documents, this.f136233a.get());
        b(documents, this.f136234b.get());
        e(documents, this.f136235c.get());
    }
}
