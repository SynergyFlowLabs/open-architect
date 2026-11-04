package com.planner5d.library.database.model.chat;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f154139a;

    public g(ij.c<i> projectConversationDaoProvider) {
        this.f154139a = projectConversationDaoProvider;
    }

    public static g a(ij.c<i> projectConversationDaoProvider) {
        return new g(projectConversationDaoProvider);
    }

    public static f c(fg.e<i> projectConversationDao) {
        return new f(projectConversationDao);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(dagger.internal.g.a(this.f154139a));
    }
}
