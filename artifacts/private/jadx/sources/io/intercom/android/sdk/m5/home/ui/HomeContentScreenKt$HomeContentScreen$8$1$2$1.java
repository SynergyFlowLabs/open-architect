package io.intercom.android.sdk.m5.home.ui;

import io.intercom.android.sdk.Injector;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$HomeContentScreen$8$1$2$1", f = "HomeContentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class HomeContentScreenKt$HomeContentScreen$8$1$2$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ int $index;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeContentScreenKt$HomeContentScreen$8$1$2$1(int i10, kotlin.coroutines.d<? super HomeContentScreenKt$HomeContentScreen$8$1$2$1> dVar) {
        super(2, dVar);
        this.$index = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new HomeContentScreenKt$HomeContentScreen$8$1$2$1(this.$index, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        Injector.get().getMetricTracker().viewedSearchBrowseCard(this.$index);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((HomeContentScreenKt$HomeContentScreen$8$1$2$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
