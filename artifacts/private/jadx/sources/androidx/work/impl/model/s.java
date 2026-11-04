package androidx.work.impl.model;

import androidx.annotation.b1;
import androidx.room.i0;
import androidx.room.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.l
@b1({b1.a.LIBRARY_GROUP})
public interface s {
    @x0("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void a(@NotNull String str);

    @x0("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    @Nullable
    androidx.work.h b(@NotNull String str);

    @i0(onConflict = 1)
    void c(@NotNull r rVar);

    @x0("DELETE FROM WorkProgress")
    void deleteAll();
}
