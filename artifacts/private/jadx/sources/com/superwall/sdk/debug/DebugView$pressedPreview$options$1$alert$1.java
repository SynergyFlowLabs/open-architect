package com.superwall.sdk.debug;

import com.superwall.sdk.models.paywall.Paywall;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$pressedPreview$options$1$alert$1", f = "DebugView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class DebugView$pressedPreview$options$1$alert$1 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ Paywall $paywall;
    int label;
    final /* synthetic */ DebugView this$0;

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$pressedPreview$options$1$alert$1$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$pressedPreview$options$1$alert$1$1", f = "DebugView.kt", i = {}, l = {678}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;
        final /* synthetic */ DebugView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DebugView debugView, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = debugView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
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
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugView$pressedPreview$options$1$alert$1(DebugView debugView, Paywall paywall, kotlin.coroutines.d<? super DebugView$pressedPreview$options$1$alert$1> dVar) {
        super(1, dVar);
        this.this$0 = debugView;
        this.$paywall = paywall;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new DebugView$pressedPreview$options$1$alert$1(this.this$0, this.$paywall, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.this$0.setPaywallDatabaseId$superwall_release(this.$paywall.getDatabaseId());
        this.this$0.paywallIdentifier = this.$paywall.getIdentifier();
        kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new AnonymousClass1(this.this$0, null), 3, null);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((DebugView$pressedPreview$options$1$alert$1) create(dVar)).invokeSuspend(Unit.f312394a);
    }
}
