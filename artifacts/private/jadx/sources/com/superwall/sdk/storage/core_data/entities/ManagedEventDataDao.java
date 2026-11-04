package com.superwall.sdk.storage.core_data.entities;

import androidx.room.i0;
import androidx.room.l;
import androidx.room.x0;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@l
public interface ManagedEventDataDao {
    @x0("\n        SELECT COUNT(*) FROM ManagedEventData \n        WHERE name = :name \n        AND createdAt BETWEEN :startDate AND :endDate\n        ")
    @Nullable
    Object countEventsByNameInPeriod(@NotNull String str, @NotNull Date date, @NotNull Date date2, @NotNull d<? super Integer> dVar);

    @x0("DELETE FROM ManagedEventData")
    @Nullable
    Object deleteAll(@NotNull d<? super Unit> dVar);

    @x0("\n        SELECT * FROM ManagedEventData \n        WHERE name = :name \n        AND (:date IS NULL OR createdAt < :date) \n        ORDER BY createdAt DESC \n        LIMIT 1\n    ")
    @Nullable
    Object getLastSavedEvent(@NotNull String str, @Nullable Date date, @NotNull d<? super ManagedEventData> dVar);

    @i0(onConflict = 1)
    @Nullable
    Object insert(@NotNull ManagedEventData managedEventData, @NotNull d<? super Unit> dVar);
}
