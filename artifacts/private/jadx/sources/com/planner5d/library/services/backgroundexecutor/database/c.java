package com.planner5d.library.services.backgroundexecutor.database;

import androidx.room.i0;
import androidx.room.l;
import androidx.room.o2;
import androidx.room.q;
import androidx.room.x0;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@l
public interface c {
    @i0
    @Nullable
    Object a(@NotNull b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @x0("SELECT * FROM crash_record")
    @o2
    @Nullable
    Object b(@NotNull kotlin.coroutines.d<? super List<b>> dVar);

    @q
    @Nullable
    Object c(@NotNull b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
