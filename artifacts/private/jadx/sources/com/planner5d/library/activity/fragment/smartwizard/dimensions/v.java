package com.planner5d.library.activity.fragment.smartwizard.dimensions;

import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class v implements fg.g<Dimensions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.facade.s> f135580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.editaction.f> f135581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.to.f> f135582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t1> f135583d;

    public v(ij.c<com.planner5d.library.widget.editor.facade.s> cVar, ij.c<com.planner5d.library.widget.editor.editaction.f> cVar2, ij.c<com.planner5d.library.model.converter.json.to.f> cVar3, ij.c<t1> cVar4) {
        this.f135580a = cVar;
        this.f135581b = cVar2;
        this.f135582c = cVar3;
        this.f135583d = cVar4;
    }

    public static fg.g<Dimensions> a(ij.c<com.planner5d.library.widget.editor.facade.s> cVar, ij.c<com.planner5d.library.widget.editor.editaction.f> cVar2, ij.c<com.planner5d.library.model.converter.json.to.f> cVar3, ij.c<t1> cVar4) {
        return new v(cVar, cVar2, cVar3, cVar4);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.smartwizard.dimensions.Dimensions.actionExecutor")
    public static void b(Dimensions dimensions, com.planner5d.library.widget.editor.editaction.f fVar) {
        dimensions.actionExecutor = fVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.smartwizard.dimensions.Dimensions.fromItemLayout")
    public static void c(Dimensions dimensions, com.planner5d.library.model.converter.json.to.f fVar) {
        dimensions.fromItemLayout = fVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.smartwizard.dimensions.Dimensions.logRecordManager")
    public static void d(Dimensions dimensions, t1 t1Var) {
        dimensions.logRecordManager = t1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(Dimensions dimensions) {
        com.planner5d.library.activity.fragment.smartwizard.k.b(dimensions, this.f135580a.get());
        b(dimensions, this.f135581b.get());
        c(dimensions, this.f135582c.get());
        d(dimensions, this.f135583d.get());
    }
}
