package com.superwall.sdk.models.triggers;

import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class UnmatchedRule {

    @NotNull
    private final String experimentId;

    @NotNull
    private final Source source;

    public enum Source {
        EXPRESSION("EXPRESSION"),
        OCCURRENCE("OCCURRENCE");

        private static final /* synthetic */ a $ENTRIES = c.c(values());

        @NotNull
        private final String rawValue;

        Source(String str) {
            this.rawValue = str;
        }

        @NotNull
        public static a<Source> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getRawValue() {
            return this.rawValue;
        }
    }

    public UnmatchedRule(@NotNull Source source, @NotNull String experimentId) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        this.source = source;
        this.experimentId = experimentId;
    }

    public static /* synthetic */ UnmatchedRule copy$default(UnmatchedRule unmatchedRule, Source source, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            source = unmatchedRule.source;
        }
        if ((i10 & 2) != 0) {
            str = unmatchedRule.experimentId;
        }
        return unmatchedRule.copy(source, str);
    }

    @NotNull
    public final Source component1() {
        return this.source;
    }

    @NotNull
    public final String component2() {
        return this.experimentId;
    }

    @NotNull
    public final UnmatchedRule copy(@NotNull Source source, @NotNull String experimentId) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        return new UnmatchedRule(source, experimentId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnmatchedRule)) {
            return false;
        }
        UnmatchedRule unmatchedRule = (UnmatchedRule) obj;
        return this.source == unmatchedRule.source && Intrinsics.areEqual(this.experimentId, unmatchedRule.experimentId);
    }

    @NotNull
    public final String getExperimentId() {
        return this.experimentId;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    public int hashCode() {
        return (this.source.hashCode() * 31) + this.experimentId.hashCode();
    }

    @NotNull
    public String toString() {
        return "UnmatchedRule(source=" + this.source + ", experimentId=" + this.experimentId + ")";
    }
}
