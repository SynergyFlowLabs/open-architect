package com.superwall.sdk.paywall.presentation.rule_logic;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.triggers.TriggerRule;
import com.superwall.sdk.models.triggers.TriggerRuleOccurrence;
import com.superwall.sdk.models.triggers.TriggerRuleOutcome;
import com.superwall.sdk.models.triggers.UnmatchedRule;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class UtilsKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.rule_logic.UtilsKt$tryToMatchOccurrence$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.rule_logic.UtilsKt", f = "utils.kt", i = {0, 0}, l = {17}, m = "tryToMatchOccurrence", n = {"$this$tryToMatchOccurrence", "occurrence"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
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
            return UtilsKt.tryToMatchOccurrence(null, null, false, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public static final Object tryToMatchOccurrence(@NotNull TriggerRule triggerRule, @NotNull CoreDataManager coreDataManager, boolean z10, @NotNull kotlin.coroutines.d<? super TriggerRuleOutcome> dVar) {
        AnonymousClass1 anonymousClass1;
        TriggerRule triggerRule2;
        TriggerRuleOccurrence triggerRuleOccurrence;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objCountTriggerRuleOccurrences = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objCountTriggerRuleOccurrences);
            if (!z10) {
                return TriggerRuleOutcome.Companion.noMatch(UnmatchedRule.Source.EXPRESSION, triggerRule.getExperiment().getId());
            }
            TriggerRuleOccurrence occurrence = triggerRule.getOccurrence();
            if (occurrence == null) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallPresentation, "No occurrence parameter found for trigger rule.", null, null, 24, null);
                return TriggerRuleOutcome.Companion.match$default(TriggerRuleOutcome.Companion, triggerRule, null, 2, null);
            }
            anonymousClass1.L$0 = triggerRule;
            anonymousClass1.L$1 = occurrence;
            anonymousClass1.label = 1;
            objCountTriggerRuleOccurrences = coreDataManager.countTriggerRuleOccurrences(occurrence, anonymousClass1);
            if (objCountTriggerRuleOccurrences == objL) {
                return objL;
            }
            triggerRule2 = triggerRule;
            triggerRuleOccurrence = occurrence;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            triggerRuleOccurrence = (TriggerRuleOccurrence) anonymousClass1.L$1;
            triggerRule2 = (TriggerRule) anonymousClass1.L$0;
            ResultKt.m(objCountTriggerRuleOccurrences);
        }
        return ((Number) objCountTriggerRuleOccurrences).intValue() + 1 <= triggerRuleOccurrence.getMaxCount() ? TriggerRuleOutcome.Companion.match(triggerRule2, triggerRuleOccurrence) : TriggerRuleOutcome.Companion.noMatch(UnmatchedRule.Source.OCCURRENCE, triggerRule2.getExperiment().getId());
    }
}
