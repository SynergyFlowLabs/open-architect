package androidx.work.impl.model;

import androidx.room.i0;
import androidx.room.x0;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.l
public interface b {
    @i0(onConflict = 5)
    void a(@NotNull a aVar);

    @x0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    @NotNull
    List<String> b(@NotNull String str);

    @x0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean c(@NotNull String str);

    @x0("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    @NotNull
    List<String> d(@NotNull String str);

    @x0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean e(@NotNull String str);
}
