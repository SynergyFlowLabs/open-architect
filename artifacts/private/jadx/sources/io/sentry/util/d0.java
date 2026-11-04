package io.sentry.util;

import io.sentry.fa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class d0 {
    @NotNull
    public static fa a(@NotNull fa faVar) {
        if (faVar.c() != null) {
            return faVar;
        }
        return new fa(faVar.e(), faVar.d(), b(null, faVar.d(), faVar.e()), faVar.b(), faVar.a());
    }

    @NotNull
    public static Double b(@Nullable Double d10, @Nullable Double d11, @Nullable Boolean bool) {
        if (d10 != null) {
            return d10;
        }
        double dG = f0.a().g();
        if (d11 == null || bool == null) {
            return Double.valueOf(dG);
        }
        return bool.booleanValue() ? Double.valueOf(dG * d11.doubleValue()) : Double.valueOf(d11.doubleValue() + (dG * (1.0d - d11.doubleValue())));
    }

    public static boolean c(@Nullable Double d10) {
        return e(d10, true);
    }

    public static boolean d(@Nullable Double d10) {
        return e(d10, true);
    }

    private static boolean e(@Nullable Double d10, boolean z10) {
        if (d10 == null) {
            return z10;
        }
        return !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.doubleValue() <= 1.0d;
    }

    public static boolean f(@Nullable Double d10) {
        return e(d10, true);
    }

    public static boolean g(@Nullable Double d10) {
        return h(d10, true);
    }

    public static boolean h(@Nullable Double d10, boolean z10) {
        return e(d10, z10);
    }
}
