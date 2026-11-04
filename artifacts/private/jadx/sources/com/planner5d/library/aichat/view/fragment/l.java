package com.planner5d.library.aichat.view.fragment;

import com.planner5d.library.services.y;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class l implements fg.g<ChatFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y> f142184a;

    public l(ij.c<y> cVar) {
        this.f142184a = cVar;
    }

    public static fg.g<ChatFragment> a(ij.c<y> cVar) {
        return new l(cVar);
    }

    @dagger.internal.j("com.planner5d.library.aichat.view.fragment.ChatFragment.paywallService")
    public static void c(ChatFragment chatFragment, y yVar) {
        chatFragment.paywallService = yVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ChatFragment chatFragment) {
        c(chatFragment, this.f142184a.get());
    }
}
