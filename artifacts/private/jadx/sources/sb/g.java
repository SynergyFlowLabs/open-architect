package sb;

import com.planner5d.library.math.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qb.h;

/* JADX INFO: loaded from: classes5.dex */
public class g extends c implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final qb.g f371597f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size, @Nullable qb.g gVar) {
        super(puid, position, rotation, scale, size);
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f371597f = gVar;
    }

    @Override // qb.c
    @Nullable
    public qb.g b() {
        return this.f371597f;
    }
}
