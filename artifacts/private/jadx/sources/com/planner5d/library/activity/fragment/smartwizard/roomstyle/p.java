package com.planner5d.library.activity.fragment.smartwizard.roomstyle;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.payments.b0;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class p implements fg.g<ChooseRoomStyle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c2> f135833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.editor3d.l> f135834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.facade.s> f135835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<NetworkErrorUtility> f135836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<b0> f135837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<y0> f135838f;

    public p(ij.c<c2> cVar, ij.c<com.planner5d.library.widget.editor.editor3d.l> cVar2, ij.c<com.planner5d.library.widget.editor.facade.s> cVar3, ij.c<NetworkErrorUtility> cVar4, ij.c<b0> cVar5, ij.c<y0> cVar6) {
        this.f135833a = cVar;
        this.f135834b = cVar2;
        this.f135835c = cVar3;
        this.f135836d = cVar4;
        this.f135837e = cVar5;
        this.f135838f = cVar6;
    }

    public static fg.g<ChooseRoomStyle> a(ij.c<c2> cVar, ij.c<com.planner5d.library.widget.editor.editor3d.l> cVar2, ij.c<com.planner5d.library.widget.editor.facade.s> cVar3, ij.c<NetworkErrorUtility> cVar4, ij.c<b0> cVar5, ij.c<y0> cVar6) {
        return new p(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.smartwizard.roomstyle.ChooseRoomStyle.imageManager")
    public static void b(ChooseRoomStyle chooseRoomStyle, y0 y0Var) {
        chooseRoomStyle.imageManager = y0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.smartwizard.roomstyle.ChooseRoomStyle.networkErrorUtility")
    public static void d(ChooseRoomStyle chooseRoomStyle, fg.e<NetworkErrorUtility> eVar) {
        chooseRoomStyle.networkErrorUtility = eVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.smartwizard.roomstyle.ChooseRoomStyle.superwallUseCase")
    public static void e(ChooseRoomStyle chooseRoomStyle, fg.e<b0> eVar) {
        chooseRoomStyle.superwallUseCase = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ChooseRoomStyle chooseRoomStyle) {
        com.planner5d.library.activity.fragment.projects.f.e(chooseRoomStyle, this.f135833a.get());
        com.planner5d.library.activity.fragment.projects.f.b(chooseRoomStyle, this.f135834b.get());
        com.planner5d.library.activity.fragment.projects.f.c(chooseRoomStyle, this.f135835c.get());
        d(chooseRoomStyle, dagger.internal.g.a(this.f135836d));
        e(chooseRoomStyle, dagger.internal.g.a(this.f135837e));
        b(chooseRoomStyle, this.f135838f.get());
    }
}
