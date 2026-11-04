package androidx.work.impl.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m {
    @NotNull
    public static final j a(@NotNull n generationalId, int i10) {
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        return new j(generationalId.f(), generationalId.e(), i10);
    }
}
