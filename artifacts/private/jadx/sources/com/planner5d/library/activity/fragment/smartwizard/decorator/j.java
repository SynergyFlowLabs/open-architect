package com.planner5d.library.activity.fragment.smartwizard.decorator;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.widget.editor.facade.s;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class j implements fg.g<DecoratorFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c2> f135438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.editor3d.l> f135439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<s> f135440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<NetworkErrorUtility> f135441d;

    public j(ij.c<c2> cVar, ij.c<com.planner5d.library.widget.editor.editor3d.l> cVar2, ij.c<s> cVar3, ij.c<NetworkErrorUtility> cVar4) {
        this.f135438a = cVar;
        this.f135439b = cVar2;
        this.f135440c = cVar3;
        this.f135441d = cVar4;
    }

    public static fg.g<DecoratorFragment> a(ij.c<c2> cVar, ij.c<com.planner5d.library.widget.editor.editor3d.l> cVar2, ij.c<s> cVar3, ij.c<NetworkErrorUtility> cVar4) {
        return new j(cVar, cVar2, cVar3, cVar4);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.smartwizard.decorator.DecoratorFragment.networkErrorUtility")
    public static void c(DecoratorFragment decoratorFragment, fg.e<NetworkErrorUtility> eVar) {
        decoratorFragment.networkErrorUtility = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DecoratorFragment decoratorFragment) {
        com.planner5d.library.activity.fragment.projects.f.e(decoratorFragment, this.f135438a.get());
        com.planner5d.library.activity.fragment.projects.f.b(decoratorFragment, this.f135439b.get());
        com.planner5d.library.activity.fragment.projects.f.c(decoratorFragment, this.f135440c.get());
        c(decoratorFragment, dagger.internal.g.a(this.f135441d));
    }
}
