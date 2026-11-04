package com.planner5d.library.aichat.interactor;

import com.planner5d.library.modules.user.user.a0;
import com.planner5d.library.modules.user.user.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements ya.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a0 f142011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f142012b;

    @ij.a
    public d(@NotNull a0 userAvatar, @NotNull w userAuthorization) {
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f142011a = userAvatar;
        this.f142012b = userAuthorization;
    }

    @Override // ya.b
    public void a(int i10, @Nullable com.planner5d.library.services.c cVar) {
        a0 a0Var = this.f142011a;
        id.a aVarA = this.f142012b.a();
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type com.planner5d.library.services.bitmaploader.target.BitmapTarget");
        a0Var.a(aVarA, i10, (com.planner5d.library.services.bitmaploader.target.a) cVar);
    }
}
