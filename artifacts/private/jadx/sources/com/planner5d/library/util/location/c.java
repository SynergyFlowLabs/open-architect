package com.planner5d.library.util.location;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@e
@s
public final class c implements h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f235847a;

    public c(ij.c<Application> cVar) {
        this.f235847a = cVar;
    }

    public static c a(ij.c<Application> cVar) {
        return new c(cVar);
    }

    public static b c(Application application) {
        return new b(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f235847a.get());
    }
}
