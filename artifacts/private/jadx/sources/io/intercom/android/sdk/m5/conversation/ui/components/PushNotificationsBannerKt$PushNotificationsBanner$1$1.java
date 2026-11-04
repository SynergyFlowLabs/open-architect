package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.n3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt$PushNotificationsBanner$1$1", f = "PushNotificationsBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class PushNotificationsBannerKt$PushNotificationsBanner$1$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n3<Boolean> $isVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushNotificationsBannerKt$PushNotificationsBanner$1$1(n3<Boolean> n3Var, kotlin.coroutines.d<? super PushNotificationsBannerKt$PushNotificationsBanner$1$1> dVar) {
        super(2, dVar);
        this.$isVisible$delegate = n3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PushNotificationsBannerKt$PushNotificationsBanner$1$1(this.$isVisible$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        PushNotificationsBannerKt.PushNotificationsBanner$lambda$2(this.$isVisible$delegate, true);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((PushNotificationsBannerKt$PushNotificationsBanner$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
