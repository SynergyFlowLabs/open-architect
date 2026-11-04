package androidx.work.impl.model;

import androidx.room.i0;
import androidx.room.x0;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.l
public interface p {
    @i0(onConflict = 5)
    void a(@NotNull o oVar);

    @x0("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    @NotNull
    List<String> b(@NotNull String str);

    @x0("SELECT work_spec_id FROM workname WHERE name=:name")
    @NotNull
    List<String> c(@NotNull String str);
}
