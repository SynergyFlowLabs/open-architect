package com.superwall.sdk.models.triggers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class MatchedItem {

    @NotNull
    private final TriggerRule rule;

    @Nullable
    private final TriggerRuleOccurrence unsavedOccurrence;

    public MatchedItem(@NotNull TriggerRule rule, @Nullable TriggerRuleOccurrence triggerRuleOccurrence) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.rule = rule;
        this.unsavedOccurrence = triggerRuleOccurrence;
    }

    public static /* synthetic */ MatchedItem copy$default(MatchedItem matchedItem, TriggerRule triggerRule, TriggerRuleOccurrence triggerRuleOccurrence, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            triggerRule = matchedItem.rule;
        }
        if ((i10 & 2) != 0) {
            triggerRuleOccurrence = matchedItem.unsavedOccurrence;
        }
        return matchedItem.copy(triggerRule, triggerRuleOccurrence);
    }

    @NotNull
    public final TriggerRule component1() {
        return this.rule;
    }

    @Nullable
    public final TriggerRuleOccurrence component2() {
        return this.unsavedOccurrence;
    }

    @NotNull
    public final MatchedItem copy(@NotNull TriggerRule rule, @Nullable TriggerRuleOccurrence triggerRuleOccurrence) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        return new MatchedItem(rule, triggerRuleOccurrence);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchedItem)) {
            return false;
        }
        MatchedItem matchedItem = (MatchedItem) obj;
        return Intrinsics.areEqual(this.rule, matchedItem.rule) && Intrinsics.areEqual(this.unsavedOccurrence, matchedItem.unsavedOccurrence);
    }

    @NotNull
    public final TriggerRule getRule() {
        return this.rule;
    }

    @Nullable
    public final TriggerRuleOccurrence getUnsavedOccurrence() {
        return this.unsavedOccurrence;
    }

    public int hashCode() {
        int iHashCode = this.rule.hashCode() * 31;
        TriggerRuleOccurrence triggerRuleOccurrence = this.unsavedOccurrence;
        return iHashCode + (triggerRuleOccurrence == null ? 0 : triggerRuleOccurrence.hashCode());
    }

    @NotNull
    public String toString() {
        return "MatchedItem(rule=" + this.rule + ", unsavedOccurrence=" + this.unsavedOccurrence + ")";
    }

    public /* synthetic */ MatchedItem(TriggerRule triggerRule, TriggerRuleOccurrence triggerRuleOccurrence, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(triggerRule, (i10 & 2) != 0 ? null : triggerRuleOccurrence);
    }
}
