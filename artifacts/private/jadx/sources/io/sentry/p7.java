package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u8 f306014a;

    public p7(@NotNull u8 u8Var) {
        this.f306014a = (u8) io.sentry.util.y.c(u8Var, "The SentryStackTraceFactory is required.");
    }

    @NotNull
    private io.sentry.protocol.q c(@NotNull Throwable th2, @Nullable io.sentry.protocol.j jVar, @Nullable Long l10, @Nullable List<io.sentry.protocol.z> list, boolean z10) {
        Package r10 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        io.sentry.protocol.q qVar = new io.sentry.protocol.q();
        String message = th2.getMessage();
        if (r10 != null) {
            name = name.replace(r10.getName() + ".", "");
        }
        String name2 = r10 != null ? r10.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0(list);
            if (z10) {
                a0Var.i(Boolean.TRUE);
            }
            qVar.o(a0Var);
        }
        qVar.p(l10);
        qVar.q(name);
        qVar.m(jVar);
        qVar.n(name2);
        qVar.r(message);
        return qVar;
    }

    @NotNull
    private List<io.sentry.protocol.q> e(@NotNull Deque<io.sentry.protocol.q> deque) {
        return new ArrayList(deque);
    }

    @lm.n
    @NotNull
    Deque<io.sentry.protocol.q> a(@NotNull Throwable th2) {
        int i10 = 7 | (-1);
        return b(th2, new AtomicInteger(-1), new HashSet<>(), new ArrayDeque(), null);
    }

    Deque<io.sentry.protocol.q> b(@NotNull Throwable th2, @NotNull AtomicInteger atomicInteger, @NotNull HashSet<Throwable> hashSet, @NotNull Deque<io.sentry.protocol.q> deque, @Nullable String str) {
        io.sentry.protocol.j jVar;
        Thread threadCurrentThread;
        Throwable th3;
        boolean zD;
        String str2 = str;
        int i10 = atomicInteger.get();
        Throwable cause = th2;
        while (cause != null) {
            HashSet<Throwable> hashSet2 = hashSet;
            if (!hashSet2.add(cause)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i11 = 0;
            if (cause instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) cause;
                jVar = aVar.a();
                Throwable thC = aVar.c();
                threadCurrentThread = aVar.b();
                zD = aVar.d();
                th3 = thC;
            } else {
                jVar = new io.sentry.protocol.j();
                threadCurrentThread = Thread.currentThread();
                th3 = cause;
                zD = false;
            }
            io.sentry.protocol.j jVar2 = jVar;
            deque.addFirst(c(th3, jVar2, Long.valueOf(threadCurrentThread.getId()), this.f306014a.e(th3.getStackTrace(), Boolean.FALSE.equals(jVar2.u())), zD));
            if (jVar2.s() == null) {
                jVar2.E(str2);
            }
            if (atomicInteger.get() >= 0) {
                jVar2.C(Integer.valueOf(i10));
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            jVar2.y(Integer.valueOf(iIncrementAndGet));
            Throwable[] suppressed = th3.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i11 < length) {
                    b(suppressed[i11], atomicInteger, hashSet2, deque, "suppressed");
                    i11++;
                    hashSet2 = hashSet;
                    deque = deque;
                }
            }
            cause = th3.getCause();
            str2 = null;
            i10 = iIncrementAndGet;
        }
        return deque;
    }

    @NotNull
    public List<io.sentry.protocol.q> d(@NotNull Throwable th2) {
        return e(a(th2));
    }

    @NotNull
    public List<io.sentry.protocol.q> f(@NotNull io.sentry.protocol.b0 b0Var, @NotNull io.sentry.protocol.j jVar, @NotNull Throwable th2) {
        io.sentry.protocol.a0 a0VarO = b0Var.o();
        if (a0VarO == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c(th2, jVar, b0Var.l(), a0VarO.d(), true));
        return arrayList;
    }
}
