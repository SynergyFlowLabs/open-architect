package com.planner5d.library.database.model;

import androidx.annotation.m1;
import androidx.room.i0;
import androidx.room.x0;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@androidx.room.l
public interface l {
    @x0("SELECT * FROM user_model_metadata WHERE hash = :modelHash")
    @m1
    @NotNull
    List<k> a(@NotNull String str);

    @m1
    @i0(onConflict = 1)
    void b(@NotNull List<k> list);
}
