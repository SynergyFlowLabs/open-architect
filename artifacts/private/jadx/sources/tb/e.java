package tb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements pb.c, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.math.k f376243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.math.k f376244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f376245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final g f376246d;

    public e(@NotNull com.planner5d.library.math.k position, @NotNull com.planner5d.library.math.k size, float f10, @Nullable g gVar) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f376243a = position;
        this.f376244b = size;
        this.f376245c = f10;
        this.f376246d = gVar;
    }

    @Override // pb.c
    public float a() {
        return this.f376245c;
    }

    @Override // pb.c
    public void b(@NotNull com.planner5d.library.math.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f376244b = kVar;
    }

    @Override // tb.n
    @Nullable
    public g c() {
        return this.f376246d;
    }

    @Override // pb.c
    public void d(float f10) {
        this.f376245c = f10;
    }

    @Override // pb.c
    public void e(@NotNull com.planner5d.library.math.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f376243a = kVar;
    }

    @Override // pb.c
    @NotNull
    public com.planner5d.library.math.k getPosition() {
        return this.f376243a;
    }

    @Override // pb.c
    @NotNull
    public com.planner5d.library.math.k getSize() {
        return this.f376244b;
    }
}
