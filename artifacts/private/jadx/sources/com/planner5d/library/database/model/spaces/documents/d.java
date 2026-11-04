package com.planner5d.library.database.model.spaces.documents;

import androidx.room.i0;
import androidx.room.l;
import androidx.room.o2;
import androidx.room.q;
import androidx.room.v2;
import androidx.room.x0;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@l
public abstract class d {
    @q
    @Nullable
    public abstract Object a(@NotNull a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @q
    @Nullable
    public abstract Object b(@NotNull c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @x0("SELECT * FROM document WHERE document.folder_hash = :folderHash")
    @o2
    @Nullable
    public abstract Object c(@Nullable String str, @NotNull kotlin.coroutines.d<? super List<a>> dVar);

    @x0("SELECT * FROM document WHERE document.hash = :hash")
    @o2
    @Nullable
    public abstract Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super a> dVar);

    @x0("SELECT * FROM document_folder WHERE document_folder.hash = :hash")
    @o2
    @Nullable
    public abstract Object e(@NotNull String str, @NotNull kotlin.coroutines.d<? super c> dVar);

    @x0("SELECT * FROM document_folder WHERE document_folder.space_hash = :spaceHash")
    @o2
    @Nullable
    public abstract Object f(@NotNull String str, @NotNull kotlin.coroutines.d<? super List<c>> dVar);

    @x0("SELECT * FROM document WHERE document.space_hash = :spaceHash")
    @o2
    @Nullable
    public abstract Object g(@NotNull String str, @NotNull kotlin.coroutines.d<? super List<a>> dVar);

    @i0(onConflict = 1)
    @Nullable
    public abstract Object h(@NotNull a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @i0(onConflict = 1)
    @Nullable
    public abstract Object i(@NotNull c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @i0(onConflict = 1)
    @o2
    @Nullable
    public abstract Object j(@NotNull List<c> list, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @v2
    @o2
    @Nullable
    public abstract Object k(@NotNull List<a> list, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
