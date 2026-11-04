package com.planner5d.library.userimporteddata;

import com.planner5d.library.database.ApplicationDatabase;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ApplicationDatabase> f231258a;

    public c(ij.c<ApplicationDatabase> cVar) {
        this.f231258a = cVar;
    }

    public static c a(ij.c<ApplicationDatabase> cVar) {
        return new c(cVar);
    }

    public static b c(ApplicationDatabase applicationDatabase) {
        return new b(applicationDatabase);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f231258a.get());
    }
}
