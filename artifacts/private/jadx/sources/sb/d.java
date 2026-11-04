package sb;

import com.planner5d.library.math.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends a implements qb.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size) {
        super(puid, position, rotation, scale, size);
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
    }
}
