package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.c0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.Action;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$NewConversationCardKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$NewConversationCardKt$lambda1$1 implements Function2<c0, Integer, Unit> {
    public static final ComposableSingletons$NewConversationCardKt$lambda1$1 INSTANCE = new ComposableSingletons$NewConversationCardKt$lambda1$1();

    ComposableSingletons$NewConversationCardKt$lambda1$1() {
    }

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
        HomeCards.HomeNewConversationData homeNewConversationData = new HomeCards.HomeNewConversationData("Get in touch", HomeCardType.NEW_CONVERSATION, new Action("Send us a message", IconType.TEAMMATE, "Usual reply time is a few minutes"), false, CollectionsKt.emptyList(), false, false, null);
        Avatar avatarCreate = Avatar.create("", "VR");
        Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
        AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
        Avatar avatarCreate2 = Avatar.create("", "PR");
        Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
        AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
        Avatar avatarCreate3 = Avatar.create("", "SK");
        Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
        AvatarWrapper avatarWrapper3 = new AvatarWrapper(avatarCreate3, false, 2, null);
        Avatar avatarCreate4 = Avatar.create("", "LD");
        Intrinsics.checkNotNullExpressionValue(avatarCreate4, "create(...)");
        NewConversationCardKt.NewConversationCard(homeNewConversationData, CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, avatarWrapper3, new AvatarWrapper(avatarCreate4, false, 2, null)}), null, new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.components.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, 3144, 4);
    }
}
