package com.superwall.sdk.models.triggers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TriggerRuleOutcome {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TriggerRuleOutcome match$default(Companion companion, TriggerRule triggerRule, TriggerRuleOccurrence triggerRuleOccurrence, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                triggerRuleOccurrence = null;
            }
            return companion.match(triggerRule, triggerRuleOccurrence);
        }

        @NotNull
        public final TriggerRuleOutcome match(@NotNull TriggerRule rule, @Nullable TriggerRuleOccurrence triggerRuleOccurrence) {
            Intrinsics.checkNotNullParameter(rule, "rule");
            return new Match(new MatchedItem(rule, triggerRuleOccurrence));
        }

        @NotNull
        public final TriggerRuleOutcome noMatch(@NotNull UnmatchedRule.Source source, @NotNull String experimentId) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(experimentId, "experimentId");
            return new NoMatch(new UnmatchedRule(source, experimentId));
        }

        private Companion() {
        }
    }

    public static final class Match extends TriggerRuleOutcome {

        @NotNull
        private final MatchedItem matchedItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Match(@NotNull MatchedItem matchedItem) {
            super(null);
            Intrinsics.checkNotNullParameter(matchedItem, "matchedItem");
            this.matchedItem = matchedItem;
        }

        public static /* synthetic */ Match copy$default(Match match, MatchedItem matchedItem, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                matchedItem = match.matchedItem;
            }
            return match.copy(matchedItem);
        }

        @NotNull
        public final MatchedItem component1() {
            return this.matchedItem;
        }

        @NotNull
        public final Match copy(@NotNull MatchedItem matchedItem) {
            Intrinsics.checkNotNullParameter(matchedItem, "matchedItem");
            return new Match(matchedItem);
        }

        @Override // com.superwall.sdk.models.triggers.TriggerRuleOutcome
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Match) && Intrinsics.areEqual(this.matchedItem, ((Match) obj).matchedItem);
        }

        @NotNull
        public final MatchedItem getMatchedItem() {
            return this.matchedItem;
        }

        public int hashCode() {
            return this.matchedItem.hashCode();
        }

        @NotNull
        public String toString() {
            return "Match(matchedItem=" + this.matchedItem + ")";
        }
    }

    public static final class NoMatch extends TriggerRuleOutcome {

        @NotNull
        private final UnmatchedRule unmatchedRule;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoMatch(@NotNull UnmatchedRule unmatchedRule) {
            super(null);
            Intrinsics.checkNotNullParameter(unmatchedRule, "unmatchedRule");
            int i10 = 2 >> 0;
            this.unmatchedRule = unmatchedRule;
        }

        public static /* synthetic */ NoMatch copy$default(NoMatch noMatch, UnmatchedRule unmatchedRule, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                unmatchedRule = noMatch.unmatchedRule;
            }
            return noMatch.copy(unmatchedRule);
        }

        @NotNull
        public final UnmatchedRule component1() {
            return this.unmatchedRule;
        }

        @NotNull
        public final NoMatch copy(@NotNull UnmatchedRule unmatchedRule) {
            Intrinsics.checkNotNullParameter(unmatchedRule, "unmatchedRule");
            return new NoMatch(unmatchedRule);
        }

        @Override // com.superwall.sdk.models.triggers.TriggerRuleOutcome
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoMatch) && Intrinsics.areEqual(this.unmatchedRule, ((NoMatch) obj).unmatchedRule);
        }

        @NotNull
        public final UnmatchedRule getUnmatchedRule() {
            return this.unmatchedRule;
        }

        public int hashCode() {
            return this.unmatchedRule.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoMatch(unmatchedRule=" + this.unmatchedRule + ")";
        }
    }

    public /* synthetic */ TriggerRuleOutcome(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(@Nullable Object obj) {
        if ((this instanceof NoMatch) && (obj instanceof NoMatch)) {
            NoMatch noMatch = (NoMatch) this;
            NoMatch noMatch2 = (NoMatch) obj;
            return noMatch.getUnmatchedRule().getSource() == noMatch2.getUnmatchedRule().getSource() && Intrinsics.areEqual(noMatch.getUnmatchedRule().getExperimentId(), noMatch2.getUnmatchedRule().getExperimentId());
        }
        if ((this instanceof Match) && (obj instanceof Match)) {
            Match match = (Match) this;
            Match match2 = (Match) obj;
            if (Intrinsics.areEqual(match.getMatchedItem().getRule(), match2.getMatchedItem().getRule()) && Intrinsics.areEqual(match.getMatchedItem().getUnsavedOccurrence(), match2.getMatchedItem().getUnsavedOccurrence())) {
                return true;
            }
        }
        return false;
    }

    private TriggerRuleOutcome() {
    }
}
