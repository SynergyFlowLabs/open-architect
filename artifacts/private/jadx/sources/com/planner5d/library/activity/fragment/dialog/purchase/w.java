package com.planner5d.library.activity.fragment.dialog.purchase;

import android.app.Application;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class w implements dagger.internal.h<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f132826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c2> f132827b;

    public w(ij.c<Application> cVar, ij.c<c2> cVar2) {
        this.f132826a = cVar;
        this.f132827b = cVar2;
    }

    public static w a(ij.c<Application> cVar, ij.c<c2> cVar2) {
        return new w(cVar, cVar2);
    }

    public static v c(Application application, c2 c2Var) {
        return new v(application, c2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f132826a.get(), this.f132827b.get());
    }
}
