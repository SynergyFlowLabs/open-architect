package com.planner5d.library.activity.fragment.startup;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@ij.f
public final class a implements com.planner5d.library.model.manager.initialization.r.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f136448d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f136449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.legal.model.manager.a f136450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f136451c;

    @ij.a
    public a(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.legal.model.manager.a privacyManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(privacyManager, "privacyManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f136449a = application;
        this.f136450b = privacyManager;
        this.f136451c = userAuthorization;
    }

    @Override // com.planner5d.library.model.manager.initialization.r.a
    @Nullable
    public Object a(@NotNull com.planner5d.library.legal.model.manager.a.EnumC1566a enumC1566a, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return this.f136450b.t(enumC1566a, this.f136451c.a(), this.f136449a, dVar);
    }
}
