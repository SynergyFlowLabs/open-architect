package io.sentry.util;

import io.sentry.g5;
import io.sentry.h5;
import io.sentry.i1;
import io.sentry.s0;
import io.sentry.t0;
import io.sentry.t5;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 {
    public static void a(@Nullable i1 i1Var) {
        System.out.println("==========================================");
        System.out.println("=============== v Scopes v ===============");
        System.out.println("==========================================");
        b(i1Var);
        System.out.println("==========================================");
        System.out.println("=============== ^ Scopes ^ ===============");
        System.out.println("==========================================");
    }

    private static void b(@Nullable i1 i1Var) {
        if (i1Var == null) {
            System.out.println("-");
            return;
        }
        if (i1Var instanceof g5) {
            g5 g5Var = (g5) i1Var;
            System.out.println(String.format("%-25s {g=%-25s, i=%-25s, c=%-25s} [%s]", g5Var, g5Var.g(), g5Var.e1(), g5Var.getScope(), g5Var.O()));
            b(i1Var.G0());
            return;
        }
        if (!(i1Var instanceof h5) && !(i1Var instanceof s0)) {
            if (i1Var instanceof t0) {
                b(((t0) i1Var).q());
                return;
            }
            System.out.println("Hit unhandled Scopes class" + i1Var.getClass());
            return;
        }
        b(t5.R());
    }
}
