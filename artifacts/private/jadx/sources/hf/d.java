package hf;

import com.planner5d.library.math.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kf.c f285794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<kf.a> f285795b;

    public d(@NotNull kf.c wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        this.f285794a = wall;
        this.f285795b = new ArrayList();
    }

    @Override // hf.b
    @NotNull
    public List<kf.a> a() {
        return this.f285795b;
    }

    @Override // hf.b
    @NotNull
    public kf.c b() {
        return this.f285794a;
    }

    @Override // hf.b
    @NotNull
    public b c(@NotNull String id2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        boolean z10 = true & true;
        this.f285795b.add(new kf.a(id2, new k(this.f285794a.c()).c0(this.f285794a.e()).Y(i10).b(this.f285794a.e()), i11, true, this.f285794a));
        return this;
    }

    @Override // hf.b
    @NotNull
    public b d(@NotNull String id2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f285795b.add(new kf.a(id2, new k(this.f285794a.c()).c0(this.f285794a.e()).Y(i10).b(this.f285794a.e()), i11, false, this.f285794a));
        return this;
    }
}
