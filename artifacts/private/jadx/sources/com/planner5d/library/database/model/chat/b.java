package com.planner5d.library.database.model.chat;

import androidx.room.i0;
import androidx.room.l;
import androidx.room.x0;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@l
public interface b {
    @i0(onConflict = 1)
    @Nullable
    Object a(@NotNull List<a> list, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @x0("SELECT * FROM chat_messages WHERE project_id = :projectId ORDER BY created_at")
    @Nullable
    Object b(long j10, @NotNull kotlin.coroutines.d<? super List<a>> dVar);
}
