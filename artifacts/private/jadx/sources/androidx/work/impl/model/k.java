package androidx.work.impl.model;

import androidx.room.i0;
import androidx.room.x0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.l
public interface k {

    public static final class a {
        @Deprecated
        @Nullable
        public static j a(@NotNull k kVar, @NotNull n id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return k.super.e(id2);
        }

        @Deprecated
        public static void b(@NotNull k kVar, @NotNull n id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            k.super.c(id2);
        }
    }

    @x0("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    @Nullable
    j b(@NotNull String str, int i10);

    default void c(@NotNull n id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        g(id2.f(), id2.e());
    }

    @i0(onConflict = 1)
    void d(@NotNull j jVar);

    @Nullable
    default j e(@NotNull n id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return b(id2.f(), id2.e());
    }

    @x0("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    @NotNull
    List<String> f();

    @x0("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void g(@NotNull String str, int i10);

    @x0("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void i(@NotNull String str);
}
