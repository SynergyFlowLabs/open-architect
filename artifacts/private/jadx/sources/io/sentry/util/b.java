package io.sentry.util;

import io.sentry.i1;
import io.sentry.m1;
import io.sentry.q2;
import io.sentry.t5;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.b
public final class b {
    @lm.a.c
    public static boolean a(@Nullable List<io.sentry.l0> list, @NotNull String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<io.sentry.l0> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator<io.sentry.l0> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (it2.next().b(str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static <U> U b(@NotNull String str, @Nullable q2 q2Var, @NotNull Callable<U> callable) throws Exception {
        return (U) c(str, null, q2Var, callable);
    }

    public static <U> U c(@NotNull String str, @Nullable String str2, @Nullable q2 q2Var, @NotNull Callable<U> callable) throws Exception {
        m1 m1VarQ0 = t5.O("CheckInUtils").q0();
        try {
            i1 i1VarR = t5.R();
            long jCurrentTimeMillis = System.currentTimeMillis();
            o0.m(i1VarR);
            io.sentry.h hVar = new io.sentry.h(str, io.sentry.i.IN_PROGRESS);
            if (q2Var != null) {
                hVar.k(q2Var);
            }
            if (str2 != null) {
                hVar.j(str2);
            }
            io.sentry.protocol.v vVarK0 = i1VarR.K0(hVar);
            try {
                U uCall = callable.call();
                io.sentry.h hVar2 = new io.sentry.h(vVarK0, str, io.sentry.i.OK);
                if (str2 != null) {
                    hVar2.j(str2);
                }
                hVar2.i(Double.valueOf(io.sentry.p.j(System.currentTimeMillis() - jCurrentTimeMillis)));
                i1VarR.K0(hVar2);
                if (m1VarQ0 != null) {
                    m1VarQ0.close();
                }
                return uCall;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    io.sentry.h hVar3 = new io.sentry.h(vVarK0, str, io.sentry.i.ERROR);
                    if (str2 != null) {
                        hVar3.j(str2);
                    }
                    hVar3.i(Double.valueOf(io.sentry.p.j(System.currentTimeMillis() - jCurrentTimeMillis)));
                    i1VarR.K0(hVar3);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            if (m1VarQ0 != null) {
                try {
                    m1VarQ0.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public static <U> U d(@NotNull String str, @Nullable String str2, @NotNull Callable<U> callable) throws Exception {
        return (U) c(str, str2, null, callable);
    }

    public static <U> U e(@NotNull String str, @NotNull Callable<U> callable) throws Exception {
        return (U) c(str, null, null, callable);
    }
}
