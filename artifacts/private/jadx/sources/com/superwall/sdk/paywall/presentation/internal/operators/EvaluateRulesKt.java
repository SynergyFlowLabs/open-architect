package com.superwall.sdk.paywall.presentation.internal.operators;

import kotlin.Result;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEvaluateRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaluateRules.kt\ncom/superwall/sdk/paywall/presentation/internal/operators/EvaluateRulesKt\n+ 2 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,62:1\n122#2,4:63\n*S KotlinDebug\n*F\n+ 1 EvaluateRules.kt\ncom/superwall/sdk/paywall/presentation/internal/operators/EvaluateRulesKt\n*L\n43#1:63,4\n*E\n"})
public final class EvaluateRulesKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.EvaluateRulesKt$evaluateRules$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.EvaluateRulesKt", f = "EvaluateRules.kt", i = {0, 0}, l = {37, 40}, m = "evaluateRules", n = {"$this$evaluateRules", "eventData"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objEvaluateRules = EvaluateRulesKt.evaluateRules(null, null, this);
            return objEvaluateRules == b.l() ? objEvaluateRules : Result.a(objEvaluateRules);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        if (r12 == r1) goto L24;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object evaluateRules(@org.jetbrains.annotations.NotNull com.superwall.sdk.Superwall r10, @org.jetbrains.annotations.NotNull com.superwall.sdk.paywall.presentation.internal.PresentationRequest r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Result<com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome>> r12) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.internal.operators.EvaluateRulesKt.evaluateRules(com.superwall.sdk.Superwall, com.superwall.sdk.paywall.presentation.internal.PresentationRequest, kotlin.coroutines.d):java.lang.Object");
    }
}
