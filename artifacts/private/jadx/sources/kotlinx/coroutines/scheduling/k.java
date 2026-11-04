package kotlinx.coroutines.scheduling;

import androidx.media3.exoplayer.audio.s0;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.r;
import kotlinx.coroutines.internal.c1;
import kotlinx.coroutines.internal.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f315487a = c1.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public static final long f315488b = e1.f("kotlinx.coroutines.scheduler.resolution.ns", s0.f63372z, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public static final int f315489c = e1.e("kotlinx.coroutines.scheduler.core.pool.size", r.u(c1.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public static final int f315490d = e1.e("kotlinx.coroutines.scheduler.max.pool.size", a.Z, 0, a.Z, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public static final long f315491e = TimeUnit.SECONDS.toNanos(e1.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public static h f315492f = f.f315478a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f315493g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f315494h = true;

    @NotNull
    public static final i b(@NotNull Runnable runnable, long j10, boolean z10) {
        return new j(runnable, j10, z10);
    }

    public static final boolean c(@NotNull i iVar) {
        return iVar.f315485b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
