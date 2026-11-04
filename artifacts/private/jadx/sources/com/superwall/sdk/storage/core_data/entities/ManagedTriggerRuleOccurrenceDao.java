package com.superwall.sdk.storage.core_data.entities;

import androidx.room.i0;
import androidx.room.l;
import androidx.room.o2;
import androidx.room.x0;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@l
public interface ManagedTriggerRuleOccurrenceDao {
    @x0("DELETE FROM ManagedTriggerRuleOccurrence")
    @o2
    @Nullable
    Object deleteAll(@NotNull d<? super Unit> dVar);

    @x0("SELECT * FROM ManagedTriggerRuleOccurrence WHERE occurrenceKey = :key")
    @o2
    @Nullable
    Object getManagedTriggerRuleOccurrencesByKey(@NotNull String str, @NotNull d<? super List<ManagedTriggerRuleOccurrence>> dVar);

    @x0("SELECT * FROM ManagedTriggerRuleOccurrence WHERE createdAt >= :date AND occurrenceKey = :key")
    @o2
    @Nullable
    Object getManagedTriggerRuleOccurrencesSinceDate(@NotNull Date date, @NotNull String str, @NotNull d<? super List<ManagedTriggerRuleOccurrence>> dVar);

    @i0(onConflict = 1)
    @Nullable
    Object insert(@NotNull ManagedTriggerRuleOccurrence managedTriggerRuleOccurrence, @NotNull d<? super Unit> dVar);
}
