package com.planner5d.library.activity.fragment.dialog.message;

import com.planner5d.library.model.manager.n1;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class o implements fg.g<UserMessage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<n1> f132172a;

    public o(ij.c<n1> cVar) {
        this.f132172a = cVar;
    }

    public static fg.g<UserMessage> a(ij.c<n1> cVar) {
        return new o(cVar);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.message.UserMessage.languageManager")
    public static void b(UserMessage userMessage, n1 n1Var) {
        userMessage.f132149o3 = n1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(UserMessage userMessage) {
        b(userMessage, this.f132172a.get());
    }
}
