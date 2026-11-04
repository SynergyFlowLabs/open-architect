package com.planner5d.library.activity.fragment.spaces.dashboard;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class j extends f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136133f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f136134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f136135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final z f136136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ia.b f136137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final id.a f136138e;

    @ij.a
    public j(@NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull t userAuthorization, @NotNull z userAvatar, @NotNull ia.b paywallStrategy) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(paywallStrategy, "paywallStrategy");
        this.f136134a = featureConfigManager;
        this.f136135b = userAuthorization;
        this.f136136c = userAvatar;
        this.f136137d = paywallStrategy;
        this.f136138e = userAuthorization.a();
    }

    @NotNull
    public final ia.b U() {
        return this.f136137d;
    }

    @NotNull
    public final o0<id.a> V() {
        return this.f136135b.d();
    }

    public final void W(int i10, @NotNull com.planner5d.library.services.bitmaploader.target.a target, @Nullable id.a aVar) {
        Intrinsics.checkNotNullParameter(target, "target");
        z zVar = this.f136136c;
        if (aVar == null) {
            aVar = this.f136138e;
        }
        zVar.a(aVar, i10, target);
    }

    public final boolean X() {
        return this.f136134a.a(com.planner5d.library.model.manager.config.f.ProAndroid);
    }
}
