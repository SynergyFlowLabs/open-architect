package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.k.e f72337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f72338b;

    public k2(@NotNull androidx.recyclerview.widget.k.e diff, boolean z10) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        this.f72337a = diff;
        this.f72338b = z10;
    }

    @NotNull
    public final androidx.recyclerview.widget.k.e a() {
        return this.f72337a;
    }

    public final boolean b() {
        return this.f72338b;
    }
}
