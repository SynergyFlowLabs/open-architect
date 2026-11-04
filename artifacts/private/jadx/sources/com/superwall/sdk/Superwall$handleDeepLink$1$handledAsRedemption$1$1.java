package com.superwall.sdk;

import com.superwall.sdk.config.models.ConfigurationStatus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.Superwall$handleDeepLink$1$handledAsRedemption$1$1", f = "Superwall.kt", i = {}, l = {694}, m = "invokeSuspend", n = {}, s = {})
final class Superwall$handleDeepLink$1$handledAsRedemption$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ Superwall this$0;

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$handleDeepLink$1$handledAsRedemption$1$1$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.Superwall$handleDeepLink$1$handledAsRedemption$1$1$1", f = "Superwall.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<ConfigurationStatus, d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConfigurationStatus configurationStatus, d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(configurationStatus, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(((ConfigurationStatus) this.L$0) instanceof ConfigurationStatus.Configured);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Superwall$handleDeepLink$1$handledAsRedemption$1$1(Superwall superwall, String str, d<? super Superwall$handleDeepLink$1$handledAsRedemption$1$1> dVar) {
        super(2, dVar);
        this.this$0 = superwall;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new Superwall$handleDeepLink$1$handledAsRedemption$1$1(this.this$0, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            i<ConfigurationStatus> configurationStateListener = this.this$0.getConfigurationStateListener();
            boolean z10 = false;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (k.x0(configurationStateListener, anonymousClass1, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.this$0.redeem$superwall_release(this.$it);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((Superwall$handleDeepLink$1$handledAsRedemption$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
