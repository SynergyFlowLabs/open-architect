package io.sentry.util;

import io.sentry.o7;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    @lm.a.c
    public static boolean a(@Nullable List<io.sentry.l0> list, @NotNull o7 o7Var) {
        if (o7Var != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.k kVarA0 = o7Var.A0();
            if (kVarA0 != null) {
                String strE = kVarA0.e();
                if (strE != null) {
                    hashSet.add(strE);
                }
                String strD = kVarA0.d();
                if (strD != null) {
                    hashSet.add(strD);
                }
            }
            Throwable thS = o7Var.S();
            if (thS != null) {
                hashSet.add(thS.toString());
            }
            Iterator<io.sentry.l0> it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().a())) {
                    return true;
                }
            }
            for (io.sentry.l0 l0Var : list) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (l0Var.b((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
