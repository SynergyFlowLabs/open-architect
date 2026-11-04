package com.superwall.sdk.storage.core_data.entities;

import androidx.room.u;
import androidx.room.u0;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@u(tableName = "ManagedTriggerRuleOccurrence")
public final class ManagedTriggerRuleOccurrence {

    @NotNull
    private Date createdAt;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @u0(autoGenerate = true)
    @Nullable
    private Integer f267527id;

    @NotNull
    private String occurrenceKey;

    public ManagedTriggerRuleOccurrence(@Nullable Integer num, @NotNull Date createdAt, @NotNull String occurrenceKey) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(occurrenceKey, "occurrenceKey");
        this.f267527id = num;
        this.createdAt = createdAt;
        this.occurrenceKey = occurrenceKey;
    }

    public static /* synthetic */ ManagedTriggerRuleOccurrence copy$default(ManagedTriggerRuleOccurrence managedTriggerRuleOccurrence, Integer num, Date date, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = managedTriggerRuleOccurrence.f267527id;
        }
        if ((i10 & 2) != 0) {
            date = managedTriggerRuleOccurrence.createdAt;
        }
        if ((i10 & 4) != 0) {
            str = managedTriggerRuleOccurrence.occurrenceKey;
        }
        return managedTriggerRuleOccurrence.copy(num, date, str);
    }

    @Nullable
    public final Integer component1() {
        return this.f267527id;
    }

    @NotNull
    public final Date component2() {
        return this.createdAt;
    }

    @NotNull
    public final String component3() {
        return this.occurrenceKey;
    }

    @NotNull
    public final ManagedTriggerRuleOccurrence copy(@Nullable Integer num, @NotNull Date createdAt, @NotNull String occurrenceKey) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(occurrenceKey, "occurrenceKey");
        return new ManagedTriggerRuleOccurrence(num, createdAt, occurrenceKey);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagedTriggerRuleOccurrence)) {
            return false;
        }
        ManagedTriggerRuleOccurrence managedTriggerRuleOccurrence = (ManagedTriggerRuleOccurrence) obj;
        return Intrinsics.areEqual(this.f267527id, managedTriggerRuleOccurrence.f267527id) && Intrinsics.areEqual(this.createdAt, managedTriggerRuleOccurrence.createdAt) && Intrinsics.areEqual(this.occurrenceKey, managedTriggerRuleOccurrence.occurrenceKey);
    }

    @NotNull
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Integer getId() {
        return this.f267527id;
    }

    @NotNull
    public final String getOccurrenceKey() {
        return this.occurrenceKey;
    }

    public int hashCode() {
        Integer num = this.f267527id;
        return ((((num == null ? 0 : num.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.occurrenceKey.hashCode();
    }

    public final void setCreatedAt(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.createdAt = date;
    }

    public final void setId(@Nullable Integer num) {
        this.f267527id = num;
    }

    public final void setOccurrenceKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.occurrenceKey = str;
    }

    @NotNull
    public String toString() {
        return "ManagedTriggerRuleOccurrence(id=" + this.f267527id + ", createdAt=" + this.createdAt + ", occurrenceKey=" + this.occurrenceKey + ")";
    }

    public /* synthetic */ ManagedTriggerRuleOccurrence(Integer num, Date date, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? new Date() : date, str);
    }
}
