package androidx.work.impl.model;

import androidx.lifecycle.w0;
import androidx.room.i0;
import androidx.room.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.l
public interface e {
    @x0("SELECT long_value FROM Preference where `key`=:key")
    @NotNull
    w0<Long> a(@NotNull String str);

    @i0(onConflict = 1)
    void b(@NotNull d dVar);

    @x0("SELECT long_value FROM Preference where `key`=:key")
    @Nullable
    Long c(@NotNull String str);
}
