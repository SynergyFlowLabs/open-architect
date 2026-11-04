package klipper;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements Comparator<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f312334a = new n();

    private n() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull m a10, @NotNull m b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        long jF = b10.c().f() - a10.c().f();
        if (jF <= 0) {
            return jF < 0 ? -1 : 0;
        }
        int i10 = 2 ^ 1;
        return 1;
    }
}
