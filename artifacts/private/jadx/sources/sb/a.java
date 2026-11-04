package sb;

import com.planner5d.library.math.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements qb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f371587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f371588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final m f371589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f371590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final m f371591e;

    public a(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size) {
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f371587a = puid;
        this.f371588b = position;
        this.f371589c = rotation;
        this.f371590d = scale;
        this.f371591e = size;
    }

    @Override // tb.g
    @NotNull
    public m Z0() {
        return this.f371590d;
    }

    @Override // tb.g
    @NotNull
    public String d() {
        return this.f371587a;
    }

    @Override // qb.a
    @NotNull
    public m g() {
        return this.f371589c;
    }

    @Override // qb.a
    @NotNull
    public m getPosition() {
        return this.f371588b;
    }

    @Override // qb.a
    @NotNull
    public m getSize() {
        return this.f371591e;
    }
}
