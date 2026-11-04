package io.intercom.android.sdk.m5.navigation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$10$1", f = "HomeScreenDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class HomeScreenDestinationKt$homeScreen$1$10$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ androidx.activity.l $rootActivity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenDestinationKt$homeScreen$1$10$1(androidx.activity.l lVar, kotlin.coroutines.d<? super HomeScreenDestinationKt$homeScreen$1$10$1> dVar) {
        super(2, dVar);
        this.$rootActivity = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new HomeScreenDestinationKt$homeScreen$1$10$1(this.$rootActivity, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.$rootActivity.finish();
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((HomeScreenDestinationKt$homeScreen$1$10$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
