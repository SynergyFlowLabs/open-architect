package io.intercom.android.sdk.m5.components;

import androidx.compose.material3.u10;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$TeamPresenceRowKt {

    @NotNull
    public static final ComposableSingletons$TeamPresenceRowKt INSTANCE = new ComposableSingletons$TeamPresenceRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f61lambda1 = androidx.compose.runtime.internal.w.c(-919412179, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TeamPresenceRowKt$lambda-1$1
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
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "PR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            AvatarWrapper avatarWrapper3 = new AvatarWrapper(avatarCreate3, false, 2, null);
            Avatar avatarCreate4 = Avatar.create("", "LD");
            Intrinsics.checkNotNullExpressionValue(avatarCreate4, "create(...)");
            TeamPresenceRowKt.TeamPresenceRow(null, CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, avatarWrapper3, new AvatarWrapper(avatarCreate4, false, 2, null)}), c0Var, 64, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f62lambda2 = androidx.compose.runtime.internal.w.c(225256978, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TeamPresenceRowKt$lambda-2$1
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
            } else {
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TeamPresenceRowKt.INSTANCE.m156getLambda1$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m156getLambda1$intercom_sdk_base_release() {
        return f61lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m157getLambda2$intercom_sdk_base_release() {
        return f62lambda2;
    }
}
