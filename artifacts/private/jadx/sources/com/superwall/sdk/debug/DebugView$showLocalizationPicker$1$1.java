package com.superwall.sdk.debug;

import com.google.android.material.internal.p0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$showLocalizationPicker$1$1", f = "DebugView.kt", i = {}, l = {p0.f112892a}, m = "invokeSuspend", n = {}, s = {})
final class DebugView$showLocalizationPicker$1$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ DebugView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugView$showLocalizationPicker$1$1(DebugView debugView, kotlin.coroutines.d<? super DebugView$showLocalizationPicker$1$1> dVar) {
        super(2, dVar);
        this.this$0 = debugView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new DebugView$showLocalizationPicker$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        int i11 = 3 << 1;
        if (i10 == 0) {
            ResultKt.m(obj);
            DebugView debugView = this.this$0;
            this.label = 1;
            if (debugView.loadPreview(this) == objL) {
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
        return ((DebugView$showLocalizationPicker$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
