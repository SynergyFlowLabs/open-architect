package com.planner5d.library.modules.user.auth;

import android.app.Activity;
import android.content.Intent;
import kotlin.Result;
import kotlinx.coroutines.channels.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface l {
    void a();

    boolean b();

    @NotNull
    SocialAuthType c();

    @NotNull
    n0<Result<k>> d();

    void e(int i10, int i11, @Nullable Intent intent);

    void f(@NotNull Activity activity, boolean z10);
}
