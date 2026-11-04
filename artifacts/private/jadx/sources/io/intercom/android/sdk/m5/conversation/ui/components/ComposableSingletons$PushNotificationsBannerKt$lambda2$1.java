package io.intercom.android.sdk.m5.conversation.ui.components;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$PushNotificationsBannerKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$PushNotificationsBannerKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$PushNotificationsBannerKt$lambda2$1 INSTANCE = new ComposableSingletons$PushNotificationsBannerKt$lambda2$1();

    ComposableSingletons$PushNotificationsBannerKt$lambda2$1() {
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
        PushNotificationsBannerKt.PushNotificationsBanner(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, 54);
    }
}
