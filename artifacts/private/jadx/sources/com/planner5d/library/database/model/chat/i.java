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
public interface i {
    @i0(onConflict = 1)
    @Nullable
    Object a(@NotNull h hVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @x0("SELECT conversation_id FROM project_conversations WHERE user_id = :userId AND project_id = :projectId")
    @Nullable
    Object b(long j10, long j11, @NotNull kotlin.coroutines.d<? super List<String>> dVar);
}
