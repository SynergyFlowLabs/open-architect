package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.ui.focus.g0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1", f = "HelpCenterSearchTopBar.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ g0 $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1(g0 g0Var, kotlin.coroutines.d<? super HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1> dVar) {
        super(2, dVar);
        this.$focusRequester = g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1(this.$focusRequester, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        g0.k(this.$focusRequester, 0, 1, null);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
