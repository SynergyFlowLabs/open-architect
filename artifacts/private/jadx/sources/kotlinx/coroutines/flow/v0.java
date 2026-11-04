package kotlinx.coroutines.flow;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class v0 {
    @NotNull
    public static final u0 a(@NotNull u0.a aVar, long j10, long j11) {
        return new y0(kotlin.time.c.f0(j10), kotlin.time.c.f0(j11));
    }

    public static /* synthetic */ u0 b(u0.a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = kotlin.time.c.f313406b.W();
        }
        if ((i10 & 2) != 0) {
            j11 = kotlin.time.c.f313406b.q();
        }
        return a(aVar, j10, j11);
    }
}
