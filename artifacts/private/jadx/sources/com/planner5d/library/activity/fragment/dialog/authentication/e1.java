package com.planner5d.library.activity.fragment.dialog.authentication;

import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class e1 extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f131766d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.b0 f131767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f131768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f131769c;

    @ij.a
    public e1(@NotNull com.planner5d.library.model.manager.statistics.b0 statisticsManager, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager) {
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f131767a = statisticsManager;
        this.f131768b = featureConfigManager;
    }

    public final void U() {
        if (this.f131769c) {
            return;
        }
        com.planner5d.library.model.manager.statistics.events.n.f217157b.R1(k3.e.first_start);
        this.f131769c = true;
    }

    @NotNull
    public final List<SocialAuthType> V() {
        ArrayList arrayList = new ArrayList();
        com.planner5d.library.model.manager.config.j jVar = this.f131768b;
        if (jVar.a(com.planner5d.library.model.manager.config.f.AuthenticationSocialGoogle)) {
            arrayList.add(SocialAuthType.Google);
        }
        if (jVar.a(com.planner5d.library.model.manager.config.f.Facebook)) {
            arrayList.add(SocialAuthType.Facebook);
        }
        if (jVar.a(com.planner5d.library.model.manager.config.f.SignInWithCode)) {
            arrayList.add(SocialAuthType.Code);
        }
        return arrayList;
    }

    public final boolean W() {
        return this.f131768b.a(com.planner5d.library.model.manager.config.f.Facebook);
    }

    public final boolean X() {
        return this.f131768b.a(com.planner5d.library.model.manager.config.f.AuthenticationSocialGoogle);
    }

    public final void Y() {
        com.planner5d.library.model.manager.statistics.events.n.f217157b.C1(k3.a.sign_up, k3.e.sign_up);
    }

    public final void Z(@NotNull SocialAuthType service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f131767a.r(service);
    }
}
