package sb;

import com.planner5d.library.math.m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class e extends a implements qb.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<qb.g> f371592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size, @NotNull List<? extends qb.g> items) {
        super(puid, position, rotation, scale, size);
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f371592f = items;
    }

    @Override // qb.f
    @NotNull
    public List<qb.a> a() {
        return this.f371592f;
    }
}
