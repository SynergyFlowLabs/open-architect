package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class x2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f315710e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f315711f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f315712g = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f315716k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f315717l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f315718m = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.internal.z0 f315706a = new kotlinx.coroutines.internal.z0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final kotlinx.coroutines.internal.z0 f315707b = new kotlinx.coroutines.internal.z0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.internal.z0 f315708c = new kotlinx.coroutines.internal.z0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.internal.z0 f315709d = new kotlinx.coroutines.internal.z0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.internal.z0 f315713h = new kotlinx.coroutines.internal.z0("SEALED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final r1 f315714i = new r1(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final r1 f315715j = new r1(true);

    @Nullable
    public static final Object g(@Nullable Object obj) {
        return obj instanceof i2 ? new j2((i2) obj) : obj;
    }

    @Nullable
    public static final Object h(@Nullable Object obj) {
        i2 i2Var;
        j2 j2Var = obj instanceof j2 ? (j2) obj : null;
        return (j2Var == null || (i2Var = j2Var.f315158a) == null) ? obj : i2Var;
    }
}
