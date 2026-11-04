package com.devtodev.analytics.internal.domain.events.progressionEvent;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressionParameter {

    @Nullable
    private final Integer difficulty;

    @Nullable
    private final Integer duration;

    @Nullable
    private final String source;
    private final boolean success;

    public ProgressionParameter(boolean z10, @Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        this.success = z10;
        this.duration = num;
        this.difficulty = num2;
        this.source = str;
    }

    public static /* synthetic */ ProgressionParameter copy$default(ProgressionParameter progressionParameter, boolean z10, Integer num, Integer num2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = progressionParameter.success;
        }
        if ((i10 & 2) != 0) {
            num = progressionParameter.duration;
        }
        if ((i10 & 4) != 0) {
            num2 = progressionParameter.difficulty;
        }
        if ((i10 & 8) != 0) {
            str = progressionParameter.source;
        }
        return progressionParameter.copy(z10, num, num2, str);
    }

    public final boolean component1() {
        return this.success;
    }

    @Nullable
    public final Integer component2() {
        return this.duration;
    }

    @Nullable
    public final Integer component3() {
        return this.difficulty;
    }

    @Nullable
    public final String component4() {
        return this.source;
    }

    @NotNull
    public final ProgressionParameter copy(boolean z10, @Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        return new ProgressionParameter(z10, num, num2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressionParameter)) {
            return false;
        }
        ProgressionParameter progressionParameter = (ProgressionParameter) obj;
        return this.success == progressionParameter.success && Intrinsics.areEqual(this.duration, progressionParameter.duration) && Intrinsics.areEqual(this.difficulty, progressionParameter.difficulty) && Intrinsics.areEqual(this.source, progressionParameter.source);
    }

    @Nullable
    public final Integer getDifficulty() {
        return this.difficulty;
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z10 = this.success;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        Integer num = this.duration;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.difficulty;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.source;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProgressionParameter(success=" + this.success + ", duration=" + this.duration + ", difficulty=" + this.difficulty + ", source=" + this.source + ")";
    }
}
