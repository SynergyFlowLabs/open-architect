package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<h0> f334159a = new LinkedHashSet();

    public final synchronized void a(@NotNull h0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f334159a.remove(route);
    }

    public final synchronized void b(@NotNull h0 failedRoute) {
        try {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            this.f334159a.add(failedRoute);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean c(@NotNull h0 route) {
        try {
            Intrinsics.checkNotNullParameter(route, "route");
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334159a.contains(route);
    }
}
