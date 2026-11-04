package kotlinx.coroutines.internal;

import androidx.compose.animation.core.z1;
import com.google.common.util.concurrent.x2;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f315043a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final z0 f315044b = new z0("CLOSED");

    private static final /* synthetic */ boolean b(AtomicIntegerArray atomicIntegerArray, int i10, int i11, Function1<? super Integer, Boolean> function1) {
        int i12;
        do {
            i12 = atomicIntegerArray.get(i10);
            if (!function1.invoke(Integer.valueOf(i12)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i10, i12, i12 + i11));
        return true;
    }

    private static final /* synthetic */ boolean c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, int i10, Function1<? super Integer, Boolean> function1) {
        int i11;
        do {
            i11 = atomicIntegerFieldUpdater.get(obj);
            if (!function1.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i11, i11 + i10));
        return true;
    }

    private static final /* synthetic */ boolean d(AtomicInteger atomicInteger, int i10, Function1<? super Integer, Boolean> function1) {
        int i11;
        do {
            i11 = atomicInteger.get();
            if (!function1.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i11, i11 + i10));
        return true;
    }

    @NotNull
    public static final <N extends f<N>> N e(@NotNull N n10) {
        while (true) {
            Object objG = n10.g();
            if (objG == f315044b) {
                return n10;
            }
            f fVar = (f) objG;
            if (fVar != null) {
                n10 = (N) fVar;
            } else if (n10.o()) {
                return n10;
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> Object f(AtomicReferenceArray atomicReferenceArray, int i10, long j10, S s10, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            Object objI = i(s10, j10, function2);
            if (x0.h(objI)) {
                return objI;
            }
            w0 w0VarF = x0.f(objI);
            while (true) {
                w0 w0Var = (w0) atomicReferenceArray.get(i10);
                if (w0Var.f315133c >= w0VarF.f315133c) {
                    return objI;
                }
                if (!w0VarF.C()) {
                    break;
                }
                if (x2.a(atomicReferenceArray, i10, w0Var, w0VarF)) {
                    if (w0Var.v()) {
                        w0Var.q();
                    }
                    return objI;
                }
                if (w0VarF.v()) {
                    w0VarF.q();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> Object g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, long j10, S s10, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            Object objI = i(s10, j10, function2);
            if (x0.h(objI)) {
                return objI;
            }
            w0 w0VarF = x0.f(objI);
            while (true) {
                w0 w0Var = (w0) atomicReferenceFieldUpdater.get(obj);
                if (w0Var.f315133c >= w0VarF.f315133c) {
                    return objI;
                }
                if (!w0VarF.C()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, w0Var, w0VarF)) {
                    if (w0Var.v()) {
                        w0Var.q();
                    }
                    return objI;
                }
                if (w0VarF.v()) {
                    w0VarF.q();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> Object h(AtomicReference atomicReference, long j10, S s10, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            Object objI = i(s10, j10, function2);
            if (x0.h(objI)) {
                return objI;
            }
            w0 w0VarF = x0.f(objI);
            while (true) {
                w0 w0Var = (w0) atomicReference.get();
                if (w0Var.f315133c >= w0VarF.f315133c) {
                    return objI;
                }
                if (!w0VarF.C()) {
                    break;
                }
                if (z1.a(atomicReference, w0Var, w0VarF)) {
                    if (w0Var.v()) {
                        w0Var.q();
                    }
                    return objI;
                }
                if (w0VarF.v()) {
                    w0VarF.q();
                }
            }
        }
    }

    @NotNull
    public static final <S extends w0<S>> Object i(@NotNull S s10, long j10, @NotNull Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s10.f315133c >= j10 && !s10.m()) {
                return x0.b(s10);
            }
            Object objG = s10.g();
            if (objG == f315044b) {
                return x0.b(f315044b);
            }
            S sInvoke = (S) ((f) objG);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s10.f315133c + 1), s10);
                if (s10.t(sInvoke)) {
                    if (s10.m()) {
                        s10.q();
                    }
                }
            }
            s10 = (Object) sInvoke;
        }
    }

    public static final /* synthetic */ <S extends w0<S>> boolean m(AtomicReferenceArray atomicReferenceArray, int i10, S s10) {
        while (true) {
            w0 w0Var = (w0) atomicReferenceArray.get(i10);
            if (w0Var.f315133c >= s10.f315133c) {
                return true;
            }
            if (!s10.C()) {
                return false;
            }
            if (x2.a(atomicReferenceArray, i10, w0Var, s10)) {
                if (w0Var.v()) {
                    w0Var.q();
                }
                return true;
            }
            if (s10.v()) {
                s10.q();
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> boolean n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, S s10) {
        while (true) {
            w0 w0Var = (w0) atomicReferenceFieldUpdater.get(obj);
            if (w0Var.f315133c >= s10.f315133c) {
                return true;
            }
            if (!s10.C()) {
                return false;
            }
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, w0Var, s10)) {
                if (w0Var.v()) {
                    w0Var.q();
                }
                return true;
            }
            if (s10.v()) {
                s10.q();
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> boolean o(AtomicReference atomicReference, S s10) {
        while (true) {
            w0 w0Var = (w0) atomicReference.get();
            if (w0Var.f315133c >= s10.f315133c) {
                return true;
            }
            if (!s10.C()) {
                return false;
            }
            if (z1.a(atomicReference, w0Var, s10)) {
                if (w0Var.v()) {
                    w0Var.q();
                }
                return true;
            }
            if (s10.v()) {
                s10.q();
            }
        }
    }
}
