package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.n1;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@k2
@SourceDebugExtension({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n29#2:160\n29#2:162\n29#2:164\n29#2:166\n29#2:168\n29#2:170\n29#2:172\n16#3:161\n16#3:163\n16#3:165\n16#3:167\n16#3:169\n16#3:171\n16#3:173\n1#4:174\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n33#1:160\n41#1:162\n43#1:164\n51#1:166\n60#1:168\n63#1:170\n72#1:172\n33#1:161\n41#1:163\n43#1:165\n51#1:167\n60#1:169\n63#1:171\n72#1:173\n*E\n"})
public class m1<T extends n1 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315098b = AtomicIntegerFieldUpdater.newUpdater(m1.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private T[] f315099a;

    private final /* synthetic */ int g() {
        return this._size$volatile;
    }

    private final T[] k() {
        T[] tArr = this.f315099a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new n1[4];
            this.f315099a = tArr2;
            return tArr2;
        }
        if (f() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, f() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((n1[]) objArrCopyOf);
        this.f315099a = tArr3;
        return tArr3;
    }

    private final void p(int i10) {
        f315098b.set(this, i10);
    }

    private final /* synthetic */ void q(int i10) {
        this._size$volatile = i10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    private final void r(int i10) {
        while (true) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 >= f()) {
                break;
            }
            T[] tArr = this.f315099a;
            Intrinsics.checkNotNull(tArr);
            int i13 = i11 + 2;
            if (i13 < f()) {
                T t10 = tArr[i13];
                Intrinsics.checkNotNull(t10);
                T t11 = tArr[i12];
                Intrinsics.checkNotNull(t11);
                if (((Comparable) t10).compareTo(t11) >= 0) {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            T t12 = tArr[i10];
            Intrinsics.checkNotNull(t12);
            T t13 = tArr[i13];
            Intrinsics.checkNotNull(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                break;
            }
            t(i10, i13);
            i10 = i13;
        }
    }

    private final void s(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f315099a;
            Intrinsics.checkNotNull(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            Intrinsics.checkNotNull(t10);
            T t11 = tArr[i10];
            Intrinsics.checkNotNull(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                break;
            }
            t(i10, i11);
            i10 = i11;
        }
    }

    private final void t(int i10, int i11) {
        T[] tArr = this.f315099a;
        Intrinsics.checkNotNull(tArr);
        T t10 = tArr[i11];
        Intrinsics.checkNotNull(t10);
        T t11 = tArr[i10];
        Intrinsics.checkNotNull(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }

    @kotlin.a1
    public final void a(@NotNull T t10) {
        t10.b(this);
        n1[] n1VarArrK = k();
        int iF = f();
        p(iF + 1);
        n1VarArrK[iF] = t10;
        t10.setIndex(iF);
        s(iF);
    }

    public final void b(@NotNull T t10) {
        synchronized (this) {
            try {
                a(t10);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(@NotNull T t10, @NotNull Function1<? super T, Boolean> function1) {
        boolean z10;
        synchronized (this) {
            try {
                if (function1.invoke(e()).booleanValue()) {
                    a(t10);
                    z10 = true;
                } else {
                    z10 = false;
                }
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        return z10;
    }

    @Nullable
    public final T d(@NotNull Function1<? super T, Boolean> function1) {
        T t10;
        synchronized (this) {
            try {
                int iF = f();
                int i10 = 0;
                while (true) {
                    t10 = null;
                    if (i10 >= iF) {
                        break;
                    }
                    T[] tArr = this.f315099a;
                    if (tArr != null) {
                        t10 = (Object) tArr[i10];
                    }
                    Intrinsics.checkNotNull(t10);
                    if (function1.invoke(t10).booleanValue()) {
                        break;
                    }
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    @kotlin.a1
    @Nullable
    public final T e() {
        T[] tArr = this.f315099a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int f() {
        return f315098b.get(this);
    }

    public final boolean i() {
        return f() == 0;
    }

    @Nullable
    public final T j() {
        T t10;
        synchronized (this) {
            try {
                t10 = (T) e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public final boolean l(@NotNull T t10) {
        boolean z10;
        synchronized (this) {
            try {
                if (t10.k() == null) {
                    z10 = false;
                } else {
                    m(t10.getIndex());
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003f  */
    @kotlin.a1
    @NotNull
    public final T m(int i10) {
        T[] tArr = this.f315099a;
        Intrinsics.checkNotNull(tArr);
        p(f() - 1);
        if (i10 < f()) {
            t(i10, f());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                Intrinsics.checkNotNull(t10);
                T t11 = tArr[i11];
                Intrinsics.checkNotNull(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    t(i10, i11);
                    s(i11);
                } else {
                    r(i10);
                }
            } else {
                r(i10);
            }
        }
        T t12 = tArr[f()];
        Intrinsics.checkNotNull(t12);
        t12.b(null);
        t12.setIndex(-1);
        tArr[f()] = null;
        return t12;
    }

    @Nullable
    public final T n(@NotNull Function1<? super T, Boolean> function1) {
        synchronized (this) {
            try {
                n1 n1VarE = e();
                T t10 = null;
                if (n1VarE == null) {
                    kotlin.jvm.internal.h0.d(2);
                    kotlin.jvm.internal.h0.c(2);
                    return null;
                }
                if (function1.invoke(n1VarE).booleanValue()) {
                    t10 = (T) m(0);
                }
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                return t10;
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
    }

    @Nullable
    public final T o() {
        T t10;
        synchronized (this) {
            try {
                t10 = f() > 0 ? (T) m(0) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
