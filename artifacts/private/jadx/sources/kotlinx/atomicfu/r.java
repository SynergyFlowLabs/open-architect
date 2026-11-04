package kotlinx.atomicfu;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final n f313521a;

    static {
        f313521a = c("kotlinx.atomicfu.trace.thread") != null ? new p() : new n();
    }

    @kotlin.internal.f
    @NotNull
    public static final m a(int i10, @NotNull n format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return new q(i10, format);
    }

    public static /* synthetic */ m b(int i10, n nVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 32;
        }
        if ((i11 & 2) != 0) {
            nVar = f313521a;
        }
        return a(i10, nVar);
    }

    private static final String c(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    @NotNull
    public static final n d() {
        return f313521a;
    }

    @NotNull
    public static final m e(@NotNull m mVar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return mVar == m.a.f313514a ? mVar : new l(mVar, name);
    }
}
