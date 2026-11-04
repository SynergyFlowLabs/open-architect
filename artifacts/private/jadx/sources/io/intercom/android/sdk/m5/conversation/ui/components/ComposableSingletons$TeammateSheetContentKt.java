package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.u10;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$TeammateSheetContentKt {

    @NotNull
    public static final ComposableSingletons$TeammateSheetContentKt INSTANCE = new ComposableSingletons$TeammateSheetContentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f110lambda1 = androidx.compose.runtime.internal.w.c(-1445246988, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$TeammateSheetContentKt$lambda-1$1
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
            List listListOf = CollectionsKt.listOf(new Header.Expanded.Body(Header.Expanded.Style.H1, "Body 1", null));
            AvatarType avatarType = AvatarType.FACEPILE;
            Avatar avatarBuild = new Avatar.Builder().withInitials(androidx.exifinterface.media.a.X4).build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarBuild, false);
            Avatar avatarBuild2 = new Avatar.Builder().withInitials("B").build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild2, "build(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarBuild2, false);
            Avatar avatarBuild3 = new Avatar.Builder().withInitials("C").build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild3, "build(...)");
            TeammateSheetContentKt.TeammateSheetContent(null, null, new ExpandedTeamPresenceState("Title", listListOf, avatarType, CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarBuild3, false)}), CollectionsKt.emptyList(), CollectionsKt.emptyList(), false), c0Var, 512, 3);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f111lambda2 = androidx.compose.runtime.internal.w.c(914081689, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$TeammateSheetContentKt$lambda-2$1
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
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TeammateSheetContentKt.INSTANCE.m223getLambda1$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m223getLambda1$intercom_sdk_base_release() {
        return f110lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m224getLambda2$intercom_sdk_base_release() {
        return f111lambda2;
    }
}
