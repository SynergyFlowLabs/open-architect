package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$FooterNoticeKt$lambda4$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$FooterNoticeKt$lambda4$1 INSTANCE = new ComposableSingletons$FooterNoticeKt$lambda4$1();

    ComposableSingletons$FooterNoticeKt$lambda4$1() {
    }

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
        Avatar avatarCreate = Avatar.create("", "SK");
        Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
        FooterNoticeKt.FooterNoticePillWithoutAnimation("The team will reply in 1314 minutes", CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), new Function0() { // from class: io.intercom.android.sdk.m5.components.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, 454);
    }
}
