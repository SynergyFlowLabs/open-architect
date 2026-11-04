package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Throwable, Object> f305151a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f305152b;

    public c0(@NotNull n8 n8Var) {
        this.f305152b = (n8) io.sentry.util.y.c(n8Var, "options are required");
    }

    @NotNull
    private static List<Throwable> e(@NotNull Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    private static <T> boolean f(@NotNull Map<T, Object> map, @NotNull List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.i0
    @Nullable
    public o7 c(@NotNull o7 o7Var, @NotNull n0 n0Var) {
        if (!this.f305152b.isEnableDeduplication()) {
            this.f305152b.getLogger().c(y7.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return o7Var;
        }
        Throwable thS = o7Var.S();
        if (thS == null) {
            return o7Var;
        }
        if (!this.f305151a.containsKey(thS) && !f(this.f305151a, e(thS))) {
            this.f305151a.put(thS, null);
            return o7Var;
        }
        this.f305152b.getLogger().c(y7.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", o7Var.I());
        return null;
    }

    @Override // io.sentry.i0
    @Nullable
    public Long getOrder() {
        return 1000L;
    }
}
