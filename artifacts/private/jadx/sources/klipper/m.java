package klipper;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0 f312331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b0 f312332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k f312333c;

    public m(@NotNull b0 edge1, @NotNull b0 edge2, @NotNull k pt) {
        Intrinsics.checkNotNullParameter(edge1, "edge1");
        Intrinsics.checkNotNullParameter(edge2, "edge2");
        Intrinsics.checkNotNullParameter(pt, "pt");
        this.f312331a = edge1;
        this.f312332b = edge2;
        this.f312333c = pt;
    }

    @NotNull
    public final b0 a() {
        return this.f312331a;
    }

    @NotNull
    public final b0 b() {
        return this.f312332b;
    }

    @NotNull
    public final k c() {
        return this.f312333c;
    }
}
