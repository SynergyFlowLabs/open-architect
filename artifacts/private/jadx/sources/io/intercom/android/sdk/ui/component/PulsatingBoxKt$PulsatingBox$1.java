package io.intercom.android.sdk.ui.component;

import androidx.compose.animation.core.y3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$1", f = "PulsatingBox.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
final class PulsatingBoxKt$PulsatingBox$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> $animatedScale;
    final /* synthetic */ float $pulseSize;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PulsatingBoxKt$PulsatingBox$1(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, float f10, kotlin.coroutines.d<? super PulsatingBoxKt$PulsatingBox$1> dVar) {
        super(2, dVar);
        this.$animatedScale = cVar;
        this.$pulseSize = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PulsatingBoxKt$PulsatingBox$1(this.$animatedScale, this.$pulseSize, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.$animatedScale;
            Float fE = kotlin.coroutines.jvm.internal.b.e(this.$pulseSize);
            y3 y3VarT = androidx.compose.animation.core.p.t(100, 0, null, 6, null);
            this.label = 1;
            if (androidx.compose.animation.core.c.i(cVar, fE, y3VarT, null, null, this, 12, null) == objL) {
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
        return ((PulsatingBoxKt$PulsatingBox$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
