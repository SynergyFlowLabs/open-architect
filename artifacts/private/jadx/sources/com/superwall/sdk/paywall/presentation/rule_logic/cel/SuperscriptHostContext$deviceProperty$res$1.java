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
@f(c = "com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext$deviceProperty$res$1", f = "SuperscriptHostContext.kt", i = {}, l = {71, 72}, m = "invokeSuspend", n = {}, s = {})
final class SuperscriptHostContext$deviceProperty$res$1 extends o implements Function2<s0, d<? super Integer>, Object> {
    final /* synthetic */ List<PassableValue> $_args;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ SuperscriptHostContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SuperscriptHostContext$deviceProperty$res$1(String str, List<? extends PassableValue> list, SuperscriptHostContext superscriptHostContext, d<? super SuperscriptHostContext$deviceProperty$res$1> dVar) {
        super(2, dVar);
        this.$name = str;
        this.$_args = list;
        this.this$0 = superscriptHostContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SuperscriptHostContext$deviceProperty$res$1(this.$name, this.$_args, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
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
            r5 = 7
            int r1 = r6.label
            r2 = 2
            r5 = 4
            r3 = 1
            r5 = 4
            if (r1 == 0) goto L26
            if (r1 == r3) goto L21
            if (r1 != r2) goto L16
            kotlin.ResultKt.m(r7)
            r5 = 6
            goto L6b
        L16:
            r5 = 5
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 3
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6.<init>(r7)
            throw r6
        L21:
            kotlin.ResultKt.m(r7)
            r5 = 5
            goto L4f
        L26:
            kotlin.ResultKt.m(r7)
            r5 = 3
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction$Companion r7 = com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction.Companion
            java.lang.String r1 = r6.$name
            java.util.List<com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue> r4 = r6.$_args
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction r7 = r7.from(r1, r4)
            if (r7 != 0) goto L38
            r6 = 0
            return r6
        L38:
            boolean r1 = r7 instanceof com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
            r5 = 1
            if (r1 == 0) goto L53
            r5 = 7
            com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince r7 = (com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince) r7
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext r1 = r6.this$0
            com.superwall.sdk.storage.core_data.CoreDataManager r1 = com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext.access$getStorage$p(r1)
            r6.label = r3
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L4f
            goto L6a
        L4f:
            r5 = 6
            java.lang.Integer r7 = (java.lang.Integer) r7
            return r7
        L53:
            boolean r1 = r7 instanceof com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction.PlacementCount
            r5 = 0
            if (r1 == 0) goto L6e
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction$PlacementCount r7 = (com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptExposedFunction.PlacementCount) r7
            com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext r1 = r6.this$0
            r5 = 2
            com.superwall.sdk.storage.core_data.CoreDataManager r1 = com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext.access$getStorage$p(r1)
            r5 = 7
            r6.label = r2
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L6b
        L6a:
            return r0
        L6b:
            java.lang.Integer r7 = (java.lang.Integer) r7
            return r7
        L6e:
            kotlin.k0 r6 = new kotlin.k0
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptHostContext$deviceProperty$res$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Integer> dVar) {
        return ((SuperscriptHostContext$deviceProperty$res$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
