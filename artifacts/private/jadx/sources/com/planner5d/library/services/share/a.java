package com.planner5d.library.services.share;

import com.planner5d.library.model.manager.b4;
import dagger.internal.e;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;
import ij.c;

/* JADX INFO: loaded from: classes10.dex */
@r
@e
public final class a implements g<PublicFileProvider> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<b4> f224981a;

    public a(c<b4> cVar) {
        this.f224981a = cVar;
    }

    public static g<PublicFileProvider> a(c<b4> cVar) {
        return new a(cVar);
    }

    @j("com.planner5d.library.services.share.PublicFileProvider.snapshotManager")
    public static void c(PublicFileProvider publicFileProvider, fg.e<b4> eVar) {
        publicFileProvider.f224980a = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(PublicFileProvider publicFileProvider) {
        c(publicFileProvider, dagger.internal.g.a(this.f224981a));
    }
}
