package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    @oj.i(name = "isSchedulerWorker")
    public static final boolean a(@NotNull Thread thread) {
        return thread instanceof a.c;
    }

    @oj.i(name = "mayNotBlock")
    public static final boolean b(@NotNull Thread thread) {
        if (!(thread instanceof a.c) || ((a.c) thread).f315462c != a.d.CPU_ACQUIRED) {
            return false;
        }
        int i10 = 4 << 1;
        return true;
    }
}
