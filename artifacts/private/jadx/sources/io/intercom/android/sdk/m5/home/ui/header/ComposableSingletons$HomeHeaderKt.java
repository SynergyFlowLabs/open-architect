package io.intercom.android.sdk.m5.home.ui.header;

import androidx.compose.material3.u10;
import androidx.compose.runtime.c0;
import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$HomeHeaderKt {

    @NotNull
    public static final ComposableSingletons$HomeHeaderKt INSTANCE = new ComposableSingletons$HomeHeaderKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f221lambda1 = androidx.compose.runtime.internal.w.c(1111020598, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "RS");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "VR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            HomeHeaderKt.HomeContentHeader(null, new HomeUiState.Content.ContentHeader(true, "", null, new HomeUiState.Content.ContentHeader.ColoredText("I am greeting.", 0.5f, null, null, "#FFFFFF", "#000000", 12, null), new HomeUiState.Content.ContentHeader.ColoredText("I am intro.", 1.0f, null, null, "#FFFFFF", "#000000", 12, null), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU(), false, null), null, true, CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)}), new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", "#FFFFFF", "#FFFFFF", 0.5f), 64, null), c0Var, 64, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f222lambda2 = androidx.compose.runtime.internal.w.c(-2058941199, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            } else {
                u10.c(null, null, q0.f38131b.k(), 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m385getLambda1$intercom_sdk_base_release(), c0Var, 12583296, 123);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f223lambda3 = androidx.compose.runtime.internal.w.c(555108293, false, ComposableSingletons$HomeHeaderKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f224lambda4 = androidx.compose.runtime.internal.w.c(37843776, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            } else {
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m387getLambda3$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m385getLambda1$intercom_sdk_base_release() {
        return f221lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m386getLambda2$intercom_sdk_base_release() {
        return f222lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m387getLambda3$intercom_sdk_base_release() {
        return f223lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m388getLambda4$intercom_sdk_base_release() {
        return f224lambda4;
    }
}
