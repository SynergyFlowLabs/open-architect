package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.models.Avatar;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$BotAndHumansFacePileKt {

    @NotNull
    public static final ComposableSingletons$BotAndHumansFacePileKt INSTANCE = new ComposableSingletons$BotAndHumansFacePileKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f14lambda1 = androidx.compose.runtime.internal.w.c(1717496869, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt$lambda-1$1
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
            Avatar avatarCreate = Avatar.create("", "VR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            BotAndHumansFacePileKt.m103BotAndHumansFacePilehGBTI10(null, avatarCreate, new Pair(Avatar.create("", "SK"), Avatar.create("", "RS")), androidx.compose.ui.unit.h.r(64), "Fin", c0Var, 28224, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f15lambda2 = androidx.compose.runtime.internal.w.c(-1080506615, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt$lambda-2$1
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
            Avatar avatarCreate = Avatar.create("", "VR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            BotAndHumansFacePileKt.m103BotAndHumansFacePilehGBTI10(null, avatarCreate, new Pair(null, Avatar.create("", "SK")), androidx.compose.ui.unit.h.r(32), "Fin", c0Var, 28224, 1);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m109getLambda1$intercom_sdk_base_release() {
        return f14lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m110getLambda2$intercom_sdk_base_release() {
        return f15lambda2;
    }
}
