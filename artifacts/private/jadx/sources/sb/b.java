package sb;

import com.planner5d.library.math.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends g implements qb.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size, @Nullable qb.g gVar) {
        super(puid, position, rotation, scale, size, gVar);
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
    }
}
