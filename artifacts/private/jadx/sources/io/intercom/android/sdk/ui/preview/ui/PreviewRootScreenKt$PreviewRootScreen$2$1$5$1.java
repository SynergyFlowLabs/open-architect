package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.pager.i1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$1$5$1", f = "PreviewRootScreen.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
final class PreviewRootScreenKt$PreviewRootScreen$2$1$5$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ int $it;
    final /* synthetic */ i1 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(i1 i1Var, int i10, kotlin.coroutines.d<? super PreviewRootScreenKt$PreviewRootScreen$2$1$5$1> dVar) {
        super(2, dVar);
        this.$pagerState = i1Var;
        this.$it = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(this.$pagerState, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        int i11 = 6 ^ 1;
        if (i10 == 0) {
            ResultKt.m(obj);
            i1 i1Var = this.$pagerState;
            int i12 = this.$it;
            this.label = 1;
            if (i1.u(i1Var, i12, 0.0f, null, this, 6, null) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((PreviewRootScreenKt$PreviewRootScreen$2$1$5$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
