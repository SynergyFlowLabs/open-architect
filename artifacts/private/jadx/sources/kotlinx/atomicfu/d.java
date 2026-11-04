package kotlinx.atomicfu;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@oj.i(name = "AtomicFU")
public final class d {
    @NotNull
    public static final b a(boolean z10) {
        return b(z10, m.a.f313514a);
    }

    @NotNull
    public static final b b(boolean z10, @NotNull m trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return new b(z10, trace);
    }

    @NotNull
    public static final f c(int i10) {
        return d(i10, m.a.f313514a);
    }

    @NotNull
    public static final f d(int i10, @NotNull m trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return new f(i10, trace);
    }

    @NotNull
    public static final h e(long j10) {
        return f(j10, m.a.f313514a);
    }

    @NotNull
    public static final h f(long j10, @NotNull m trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return new h(j10, trace);
    }

    @NotNull
    public static final <T> j<T> g(T t10) {
        return h(t10, m.a.f313514a);
    }

    @NotNull
    public static final <T> j<T> h(T t10, @NotNull m trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return new j<>(t10, trace);
    }

    public static /* synthetic */ b i(boolean z10, m mVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mVar = m.a.f313514a;
        }
        return b(z10, mVar);
    }

    public static /* synthetic */ f j(int i10, m mVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            mVar = m.a.f313514a;
        }
        return d(i10, mVar);
    }

    public static /* synthetic */ h k(long j10, m mVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mVar = m.a.f313514a;
        }
        return f(j10, mVar);
    }

    public static /* synthetic */ j l(Object obj, m mVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mVar = m.a.f313514a;
        }
        return h(obj, mVar);
    }
}
