package com.planner5d.library.activity.fragment.dialog.message;

import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.f1;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class f implements fg.g<MessageWithImageDialog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f132156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.g> f132157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f132158c;

    public f(ij.c<y0> cVar, ij.c<com.planner5d.library.interactor.g> cVar2, ij.c<f1> cVar3) {
        this.f132156a = cVar;
        this.f132157b = cVar2;
        this.f132158c = cVar3;
    }

    public static fg.g<MessageWithImageDialog> a(ij.c<y0> cVar, ij.c<com.planner5d.library.interactor.g> cVar2, ij.c<f1> cVar3) {
        return new f(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.message.MessageWithImageDialog.globalCoroutineScope")
    public static void b(MessageWithImageDialog messageWithImageDialog, f1 f1Var) {
        messageWithImageDialog.globalCoroutineScope = f1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.message.MessageWithImageDialog.handleDeepLinkInteractor")
    public static void c(MessageWithImageDialog messageWithImageDialog, com.planner5d.library.interactor.g gVar) {
        messageWithImageDialog.handleDeepLinkInteractor = gVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.message.MessageWithImageDialog.imageManager")
    public static void d(MessageWithImageDialog messageWithImageDialog, y0 y0Var) {
        messageWithImageDialog.imageManager = y0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(MessageWithImageDialog messageWithImageDialog) {
        d(messageWithImageDialog, this.f132156a.get());
        c(messageWithImageDialog, this.f132157b.get());
        b(messageWithImageDialog, this.f132158c.get());
    }
}
