package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.material3.u10;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$ExpandedTeamPresenceLayoutKt {

    @NotNull
    public static final ComposableSingletons$ExpandedTeamPresenceLayoutKt INSTANCE = new ComposableSingletons$ExpandedTeamPresenceLayoutKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f147lambda1 = androidx.compose.runtime.internal.w.c(1003438967, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-1$1
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
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List listListOf = CollectionsKt.listOf((Object[]) new Header.Expanded.Body[]{new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000")});
            AvatarType avatarType = AvatarType.FACEPILE;
            Avatar avatarCreate = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "F");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "RH");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listListOf, avatarType, CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)}), CollectionsKt.emptyList(), CollectionsKt.listOf(new Header.Expanded.SocialAccount("twitter", "https://twitter.com/intercom", "https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "intercom")), false), null, c0Var, 8, 2);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f148lambda2 = androidx.compose.runtime.internal.w.c(-1374619086, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-2$1
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
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m285getLambda1$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f149lambda3 = androidx.compose.runtime.internal.w.c(1317404560, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-3$1
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
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List listListOf = CollectionsKt.listOf((Object[]) new Header.Expanded.Body[]{new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000")});
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar avatarCreate = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "F");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listListOf, avatarType, CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), CollectionsKt.listOf(new Header.Expanded.Footer(style, "Powered by Intercom", null, new AvatarDetails(avatarType, CollectionsKt.listOf((Object[]) new Avatar.Builder[]{new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("SK"), new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("RH")})))), CollectionsKt.listOf(new Header.Expanded.SocialAccount("twitter", "https://twitter.com/intercom", "https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "intercom")), false), null, c0Var, 8, 2);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f150lambda4 = androidx.compose.runtime.internal.w.c(2104929077, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-4$1
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
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m287getLambda3$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f151lambda5 = androidx.compose.runtime.internal.w.c(1099388065, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-5$1
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
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List listListOf = CollectionsKt.listOf((Object[]) new Header.Expanded.Body[]{new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000")});
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar avatarCreate = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listListOf, avatarType, CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), CollectionsKt.emptyList(), CollectionsKt.emptyList(), true), null, c0Var, 8, 2);
        }
    });

    /* JADX INFO: renamed from: lambda-6, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f152lambda6 = androidx.compose.runtime.internal.w.c(-257155684, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-6$1
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
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m289getLambda5$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m285getLambda1$intercom_sdk_base_release() {
        return f147lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m286getLambda2$intercom_sdk_base_release() {
        return f148lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m287getLambda3$intercom_sdk_base_release() {
        return f149lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m288getLambda4$intercom_sdk_base_release() {
        return f150lambda4;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m289getLambda5$intercom_sdk_base_release() {
        return f151lambda5;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-6$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m290getLambda6$intercom_sdk_base_release() {
        return f152lambda6;
    }
}
