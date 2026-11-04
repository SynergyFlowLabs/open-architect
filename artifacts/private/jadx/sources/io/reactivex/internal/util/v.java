package io.reactivex.internal.util;

import io.reactivex.i0;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f303512a = Long.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f303513b = Long.MAX_VALUE;

    private v() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean a(boolean z10, boolean z11, i0<?> i0Var, boolean z12, ej.o<?> oVar, io.reactivex.disposables.c cVar, r<T, U> rVar) {
        if (rVar.e()) {
            oVar.clear();
            cVar.dispose();
            return true;
        }
        if (z10) {
            if (!z12) {
                Throwable thError = rVar.error();
                if (thError != null) {
                    oVar.clear();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    i0Var.onError(thError);
                    return true;
                }
                if (z11) {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    i0Var.onComplete();
                    return true;
                }
            } else if (z11) {
                if (cVar != null) {
                    cVar.dispose();
                }
                Throwable thError2 = rVar.error();
                if (thError2 != null) {
                    i0Var.onError(thError2);
                } else {
                    i0Var.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    public static <T, U> boolean b(boolean z10, boolean z11, org.reactivestreams.v<?> vVar, boolean z12, ej.o<?> oVar, u<T, U> uVar) {
        if (uVar.e()) {
            oVar.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            Throwable thError = uVar.error();
            if (thError != null) {
                vVar.onError(thError);
            } else {
                vVar.onComplete();
            }
            return true;
        }
        Throwable thError2 = uVar.error();
        if (thError2 != null) {
            oVar.clear();
            vVar.onError(thError2);
            return true;
        }
        if (!z11) {
            return false;
        }
        vVar.onComplete();
        return true;
    }

    public static <T> ej.o<T> c(int i10) {
        return i10 < 0 ? new io.reactivex.internal.queue.c(-i10) : new io.reactivex.internal.queue.b(i10);
    }

    public static <T, U> void d(ej.n<T> nVar, i0<? super U> i0Var, boolean z10, io.reactivex.disposables.c cVar, r<T, U> rVar) {
        int iA = 1;
        while (true) {
            ej.n<T> nVar2 = nVar;
            i0<? super U> i0Var2 = i0Var;
            boolean z11 = z10;
            io.reactivex.disposables.c cVar2 = cVar;
            r<T, U> rVar2 = rVar;
            if (a(rVar.c(), nVar.isEmpty(), i0Var2, z11, nVar2, cVar2, rVar2)) {
                return;
            }
            while (true) {
                boolean zC = rVar2.c();
                T tPoll = nVar2.poll();
                boolean z12 = tPoll == null;
                boolean z13 = z12;
                if (a(zC, z12, i0Var2, z11, nVar2, cVar2, rVar2)) {
                    return;
                }
                if (z13) {
                    break;
                } else {
                    rVar2.f(i0Var2, tPoll);
                }
            }
            iA = rVar2.a(-iA);
            if (iA == 0) {
                return;
            }
            i0Var = i0Var2;
            z10 = z11;
            nVar = nVar2;
            cVar = cVar2;
            rVar = rVar2;
        }
    }

    public static <T, U> void e(ej.n<T> nVar, org.reactivestreams.v<? super U> vVar, boolean z10, io.reactivex.disposables.c cVar, u<T, U> uVar) {
        int iA = 1;
        while (true) {
            boolean zC = uVar.c();
            T tPoll = nVar.poll();
            boolean z11 = tPoll == null;
            ej.n<T> nVar2 = nVar;
            org.reactivestreams.v<? super U> vVar2 = vVar;
            boolean z12 = z10;
            u<T, U> uVar2 = uVar;
            if (b(zC, z11, vVar2, z12, nVar2, uVar2)) {
                if (cVar != null) {
                    cVar.dispose();
                    return;
                }
                return;
            }
            if (z11) {
                iA = uVar2.a(-iA);
                if (iA == 0) {
                    return;
                }
            } else {
                long jRequested = uVar2.requested();
                if (jRequested == 0) {
                    nVar2.clear();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    vVar2.onError(new io.reactivex.exceptions.c("Could not emit value due to lack of requests."));
                    return;
                }
                if (uVar2.f(vVar2, tPoll) && jRequested != Long.MAX_VALUE) {
                    uVar2.d(1L);
                }
            }
            vVar = vVar2;
            z10 = z12;
            nVar = nVar2;
            uVar = uVar2;
        }
    }

    static boolean f(dj.e eVar) {
        try {
            return eVar.a();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            return true;
        }
    }

    public static <T> void g(org.reactivestreams.v<? super T> vVar, Queue<T> queue, AtomicLong atomicLong, dj.e eVar) {
        long j10;
        long j11;
        if (queue.isEmpty()) {
            vVar.onComplete();
            return;
        }
        if (h(atomicLong.get(), vVar, queue, atomicLong, eVar)) {
            return;
        }
        do {
            j10 = atomicLong.get();
            if ((j10 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j11 = j10 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
        if (j10 != 0) {
            h(j11, vVar, queue, atomicLong, eVar);
        }
    }

    static <T> boolean h(long j10, org.reactivestreams.v<? super T> vVar, Queue<T> queue, AtomicLong atomicLong, dj.e eVar) {
        long j11 = j10 & Long.MIN_VALUE;
        while (true) {
            if (j11 != j10) {
                if (f(eVar)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    vVar.onComplete();
                    return true;
                }
                vVar.onNext(tPoll);
                j11++;
            } else {
                if (f(eVar)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    vVar.onComplete();
                    return true;
                }
                j10 = atomicLong.get();
                if (j10 == j11) {
                    long jAddAndGet = atomicLong.addAndGet(-(j11 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j11 = jAddAndGet & Long.MIN_VALUE;
                    j10 = jAddAndGet;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean i(long j10, org.reactivestreams.v<? super T> vVar, Queue<T> queue, AtomicLong atomicLong, dj.e eVar) {
        long j11;
        do {
            j11 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j11, d.c(Long.MAX_VALUE & j11, j10) | (j11 & Long.MIN_VALUE)));
        if (j11 != Long.MIN_VALUE) {
            return false;
        }
        h(j10 | Long.MIN_VALUE, vVar, queue, atomicLong, eVar);
        return true;
    }

    public static void j(org.reactivestreams.w wVar, int i10) {
        wVar.request(i10 < 0 ? Long.MAX_VALUE : i10);
    }
}
