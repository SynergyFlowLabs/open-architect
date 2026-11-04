package gc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements g {
    @Override // gc.g
    public void a(@NotNull String errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        timber.log.b.f381052a.d(errorData, new Object[0]);
    }

    @Override // gc.g
    public void b(@NotNull Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        timber.log.b.f381052a.e(e10);
    }
}
