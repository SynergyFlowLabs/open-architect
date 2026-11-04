package com.superwall.sdk.paywall.presentation.rule_logic.cel;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext$computedProperty$res$1", f = "SuperscriptHostContext.kt", i = {}, l = {43, 44}, m = "invokeSuspend", n = {}, s = {})
final class SuperscriptHostContext$computedProperty$res$1 extends o implements Function2<s0, d<? super Integer>, Object> {
    final /* synthetic */ List<PassableValue> $_args;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ SuperscriptHostContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SuperscriptHostContext$computedProperty$res$1(String str, List<? extends PassableValue> list, SuperscriptHostContext superscriptHostContext, d<? super SuperscriptHostContext$computedProperty$res$1> dVar) {
        super(2, dVar);
        this.$name = str;
        this.$_args = list;
        this.this$0 = superscriptHostContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SuperscriptHostContext$computedProperty$res$1(this.$name, this.$_args, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r7 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r5 = 7
            r3 = 1
            r5 = 2
            if (r1 == 0) goto L25
            if (r1 == r3) goto L20
            if (r1 != r2) goto L16
            r5 = 4
            kotlin.ResultKt.m(r7)
            r5 = 7
            goto L69
        L16:
            r5 = 4
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 5
            throw r6
        L20:
            r5 = 4
            kotlin.ResultKt.m(r7)
            goto L4e
        L25:
            kotlin.ResultKt.m(r7)
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction$Companion r7 = com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction.Companion
            java.lang.String r1 = r6.$name
            java.util.List<com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue> r4 = r6.$_args
            r5 = 2
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction r7 = r7.from(r1, r4)
            if (r7 != 0) goto L37
            r6 = 0
            return r6
        L37:
            boolean r1 = r7 instanceof com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
            r5 = 6
            if (r1 == 0) goto L52
            com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince r7 = (com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince) r7
            r5 = 4
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext r1 = r6.this$0
            com.superwall.sdk.storage.core_data.CoreDataManager r1 = com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext.access$getStorage$p(r1)
            r6.label = r3
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L4e
            goto L68
        L4e:
            java.lang.Integer r7 = (java.lang.Integer) r7
            r5 = 0
            return r7
        L52:
            boolean r1 = r7 instanceof com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction.PlacementCount
            r5 = 0
            if (r1 == 0) goto L6d
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction$PlacementCount r7 = (com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction.PlacementCount) r7
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext r1 = r6.this$0
            com.superwall.sdk.storage.core_data.CoreDataManager r1 = com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext.access$getStorage$p(r1)
            r5 = 6
            r6.label = r2
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L69
        L68:
            return r0
        L69:
            r5 = 2
            java.lang.Integer r7 = (java.lang.Integer) r7
            return r7
        L6d:
            r5 = 6
            kotlin.k0 r6 = new kotlin.k0
            r6.<init>()
            r5 = 5
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext$computedProperty$res$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Integer> dVar) {
        return ((SuperscriptHostContext$computedProperty$res$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
