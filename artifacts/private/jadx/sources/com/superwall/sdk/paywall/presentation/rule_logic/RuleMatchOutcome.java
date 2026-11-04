package com.superwall.sdk.paywall.presentation.rule_logic;

import com.superwall.sdk.models.triggers.MatchedItem;
import com.superwall.sdk.models.triggers.UnmatchedRule;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RuleMatchOutcome {

    public static final class Matched extends RuleMatchOutcome {

        @NotNull
        private final MatchedItem item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Matched(@NotNull MatchedItem item) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public static /* synthetic */ Matched copy$default(Matched matched, MatchedItem matchedItem, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                matchedItem = matched.item;
            }
            return matched.copy(matchedItem);
        }

        @NotNull
        public final MatchedItem component1() {
            return this.item;
        }

        @NotNull
        public final Matched copy(@NotNull MatchedItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new Matched(item);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Matched) && Intrinsics.areEqual(this.item, ((Matched) obj).item);
        }

        @NotNull
        public final MatchedItem getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return "Matched(item=" + this.item + ")";
        }
    }

    public static final class NoMatchingRules extends RuleMatchOutcome {

        @NotNull
        private final List<UnmatchedRule> unmatchedRules;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoMatchingRules(@NotNull List<UnmatchedRule> unmatchedRules) {
            super(null);
            Intrinsics.checkNotNullParameter(unmatchedRules, "unmatchedRules");
            this.unmatchedRules = unmatchedRules;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NoMatchingRules copy$default(NoMatchingRules noMatchingRules, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = noMatchingRules.unmatchedRules;
            }
            return noMatchingRules.copy(list);
        }

        @NotNull
        public final List<UnmatchedRule> component1() {
            return this.unmatchedRules;
        }

        @NotNull
        public final NoMatchingRules copy(@NotNull List<UnmatchedRule> unmatchedRules) {
            Intrinsics.checkNotNullParameter(unmatchedRules, "unmatchedRules");
            return new NoMatchingRules(unmatchedRules);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoMatchingRules) && Intrinsics.areEqual(this.unmatchedRules, ((NoMatchingRules) obj).unmatchedRules);
        }

        @NotNull
        public final List<UnmatchedRule> getUnmatchedRules() {
            return this.unmatchedRules;
        }

        public int hashCode() {
            return this.unmatchedRules.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoMatchingRules(unmatchedRules=" + this.unmatchedRules + ")";
        }
    }

    public /* synthetic */ RuleMatchOutcome(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RuleMatchOutcome() {
    }
}
