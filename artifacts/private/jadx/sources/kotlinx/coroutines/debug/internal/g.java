package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f313949a = -1640531527;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f313950b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final z0 f313951c = new z0("REHASH");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final r f313952d = new r(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final r f313953e = new r(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final r d(Object obj) {
        if (obj == null) {
            return f313952d;
        }
        return Intrinsics.areEqual(obj, Boolean.TRUE) ? f313953e : new r(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
