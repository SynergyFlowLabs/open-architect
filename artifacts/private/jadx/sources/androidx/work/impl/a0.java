package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.model.n f76577a;

    public a0(@NotNull androidx.work.impl.model.n id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f76577a = id2;
    }

    @NotNull
    public final androidx.work.impl.model.n a() {
        return this.f76577a;
    }
}
