package com.planner5d.library.model.manager;

import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.compareplans.ComparePlansFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class n implements com.planner5d.library.services.y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f192193c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f192194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f192195b;

    @ij.a
    public n(@NotNull com.planner5d.library.activity.fragment.x fragmentControllerNavigator, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager) {
        Intrinsics.checkNotNullParameter(fragmentControllerNavigator, "fragmentControllerNavigator");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f192194a = fragmentControllerNavigator;
        this.f192195b = featureConfigManager;
    }

    private final Pair<com.planner5d.library.model.manager.config.purchaseplacement.b.a, com.planner5d.library.model.manager.statistics.events.y3.c> b(String str) {
        if (Intrinsics.areEqual(str, com.planner5d.library.services.r.paywallPlacementAiChat.f224891a)) {
            return new Pair<>(com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_chat, com.planner5d.library.model.manager.statistics.events.y3.c.ai_chat);
        }
        throw new RuntimeException("Unknown purchase placement string");
    }

    @Override // com.planner5d.library.services.y
    public void a(@NotNull String purchasePlacement) {
        Intrinsics.checkNotNullParameter(purchasePlacement, "purchasePlacement");
        Pair<com.planner5d.library.model.manager.config.purchaseplacement.b.a, com.planner5d.library.model.manager.statistics.events.y3.c> pairB = b(purchasePlacement);
        com.planner5d.library.model.manager.config.purchaseplacement.b.a aVarComponent1 = pairB.component1();
        com.planner5d.library.model.manager.statistics.events.y3.c cVarComponent2 = pairB.component2();
        if (this.f192195b.get().a(com.planner5d.library.model.manager.config.f.ProAndroid)) {
            this.f192194a.f(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ComparePlansFragment.class, new com.planner5d.library.services.utility.i().m(com.planner5d.library.services.r.commercial, false).m(com.planner5d.library.services.r.newNavigation, false).m(com.planner5d.library.services.r.snapshots, false).t(com.planner5d.library.services.r.source, cVarComponent2).a()).n(com.planner5d.library.f.s.ky), true);
        } else {
            com.planner5d.library.services.b0.f223959b.o(new com.planner5d.library.services.b0.a(fd.k.CATALOG, null, aVarComponent1, cVarComponent2));
        }
    }
}
