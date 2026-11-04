package kotlinx.coroutines.channels;

import kotlinx.coroutines.f3;
import kotlinx.coroutines.internal.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final z0 f313766a = new z0("NO_ELEMENT");

    @kotlin.l(level = kotlin.n.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    @f3
    @NotNull
    public static final <E> d<E> a(int i10) {
        if (i10 == -2) {
            return new e(p.N2.a());
        }
        if (i10 == -1) {
            return new e0();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        }
        if (i10 != Integer.MAX_VALUE) {
            return new e(i10);
        }
        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
    }
}
