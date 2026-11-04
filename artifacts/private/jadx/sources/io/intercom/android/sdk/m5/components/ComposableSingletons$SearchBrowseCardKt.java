package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$SearchBrowseCardKt {

    @NotNull
    public static final ComposableSingletons$SearchBrowseCardKt INSTANCE = new ComposableSingletons$SearchBrowseCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f57lambda1 = androidx.compose.runtime.internal.w.c(1563709076, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, CollectionsKt.listOf((Object[]) new SuggestedArticle[]{new SuggestedArticle("", "How to restart recording", ""), new SuggestedArticle("", "How to track your recording time", ""), new SuggestedArticle("", "How to correct your transcript", "")}));
            Avatar avatarCreate = Avatar.create("", "VR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            List listListOf = CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)});
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
            boolean z10 = false & true;
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, true, listListOf, true, metricTracker, c0Var, 36408);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f58lambda2 = androidx.compose.runtime.internal.w.c(-1740562678, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, CollectionsKt.emptyList());
            Avatar avatarCreate = Avatar.create("", "VR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            List listListOf = CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)});
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, true, listListOf, true, metricTracker, c0Var, 36408);
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f59lambda3 = androidx.compose.runtime.internal.w.c(130670641, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, CollectionsKt.listOf((Object[]) new SuggestedArticle[]{new SuggestedArticle("", "How to restart recording", ""), new SuggestedArticle("", "How to track your recording time", ""), new SuggestedArticle("", "How to correct your transcript", "")}));
            Avatar avatarCreate = Avatar.create("", "VR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            List listListOf = CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)});
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, false, listListOf, true, metricTracker, c0Var, 36408);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f60lambda4 = androidx.compose.runtime.internal.w.c(1883897723, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, CollectionsKt.emptyList());
            Avatar avatarCreate = Avatar.create("", "VR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            List listListOf = CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)});
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, false, listListOf, true, metricTracker, c0Var, 36408);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m152getLambda1$intercom_sdk_base_release() {
        return f57lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m153getLambda2$intercom_sdk_base_release() {
        return f58lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m154getLambda3$intercom_sdk_base_release() {
        return f59lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m155getLambda4$intercom_sdk_base_release() {
        return f60lambda4;
    }
}
