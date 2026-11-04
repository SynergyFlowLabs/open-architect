package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u8 f307006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f307007b;

    public v8(@NotNull u8 u8Var, @NotNull n8 n8Var) {
        this.f307006a = (u8) io.sentry.util.y.c(u8Var, "The SentryStackTraceFactory is required.");
        this.f307007b = (n8) io.sentry.util.y.c(n8Var, "The SentryOptions is required");
    }

    @NotNull
    private io.sentry.protocol.b0 e(boolean z10, @NotNull StackTraceElement[] stackTraceElementArr, @NotNull Thread thread) {
        io.sentry.protocol.b0 b0Var = new io.sentry.protocol.b0();
        b0Var.A(thread.getName());
        b0Var.B(Integer.valueOf(thread.getPriority()));
        b0Var.y(Long.valueOf(thread.getId()));
        b0Var.w(Boolean.valueOf(thread.isDaemon()));
        b0Var.D(thread.getState().name());
        b0Var.u(Boolean.valueOf(z10));
        List<io.sentry.protocol.z> listE = this.f307006a.e(stackTraceElementArr, false);
        if (this.f307007b.isAttachStacktrace() && listE != null && !listE.isEmpty()) {
            io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0(listE);
            a0Var.i(Boolean.TRUE);
            b0Var.C(a0Var);
        }
        return b0Var;
    }

    @Nullable
    List<io.sentry.protocol.b0> a() {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return d(map, null, false);
    }

    @Nullable
    List<io.sentry.protocol.b0> b(@Nullable List<Long> list) {
        return d(Thread.getAllStackTraces(), list, false);
    }

    @Nullable
    List<io.sentry.protocol.b0> c(@Nullable List<Long> list, boolean z10) {
        return d(Thread.getAllStackTraces(), list, z10);
    }

    @lm.n
    @Nullable
    List<io.sentry.protocol.b0> d(@NotNull Map<Thread, StackTraceElement[]> map, @Nullable List<Long> list, boolean z10) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(e((key == threadCurrentThread && !z10) || !(list == null || !list.contains(Long.valueOf(key.getId())) || z10), entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }
}
