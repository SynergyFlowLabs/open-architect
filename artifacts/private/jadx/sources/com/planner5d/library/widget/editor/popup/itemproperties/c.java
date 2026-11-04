package com.planner5d.library.widget.editor.popup.itemproperties;

import android.app.Application;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<af.a> f257291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b2> f257292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<Application> f257293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<f1> f257294d;

    public c(ij.c<af.a> cVar, ij.c<b2> cVar2, ij.c<Application> cVar3, ij.c<f1> cVar4) {
        this.f257291a = cVar;
        this.f257292b = cVar2;
        this.f257293c = cVar3;
        this.f257294d = cVar4;
    }

    public static c a(ij.c<af.a> cVar, ij.c<b2> cVar2, ij.c<Application> cVar3, ij.c<f1> cVar4) {
        return new c(cVar, cVar2, cVar3, cVar4);
    }

    public static b c(af.a aVar, b2 b2Var, Application application, f1 f1Var) {
        return new b(aVar, b2Var, application, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f257291a.get(), this.f257292b.get(), this.f257293c.get(), this.f257294d.get());
    }
}
