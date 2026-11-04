package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.d;
import kotlinx.coroutines.flow.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,130:1\n29#2:131\n29#2:133\n29#2:136\n16#3:132\n16#3:134\n16#3:137\n1#4:135\n13402#5,2:138\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n27#1:131\n42#1:133\n73#1:136\n27#1:132\n42#1:134\n73#1:137\n92#1:138,2\n*E\n"})
public abstract class b<S extends d<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private S[] f314482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f314483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f314484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private c0 f314485d;

    @NotNull
    protected final S g() {
        S s10;
        c0 c0Var;
        synchronized (this) {
            try {
                S[] sArr = this.f314482a;
                if (sArr == null) {
                    sArr = (S[]) j(2);
                    this.f314482a = sArr;
                } else if (this.f314483b >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f314482a = (S[]) ((d[]) objArrCopyOf);
                    sArr = (S[]) ((d[]) objArrCopyOf);
                }
                int i10 = this.f314484c;
                do {
                    s10 = sArr[i10];
                    if (s10 == null) {
                        s10 = (S) h();
                        sArr[i10] = s10;
                    }
                    i10++;
                    if (i10 >= sArr.length) {
                        i10 = 0;
                    }
                    Intrinsics.checkNotNull(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s10.a(this));
                this.f314484c = i10;
                int i11 = 4 >> 1;
                this.f314483b++;
                c0Var = this.f314485d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0Var != null) {
            c0Var.d0(1);
        }
        return s10;
    }

    @NotNull
    protected abstract S h();

    @NotNull
    public final z0<Integer> i() {
        c0 c0Var;
        synchronized (this) {
            try {
                c0Var = this.f314485d;
                if (c0Var == null) {
                    c0Var = new c0(this.f314483b);
                    this.f314485d = c0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0Var;
    }

    @NotNull
    protected abstract S[] j(int i10);

    protected final void k(@NotNull Function1<? super S, Unit> function1) {
        d[] dVarArr;
        if (this.f314483b == 0 || (dVarArr = this.f314482a) == null) {
            return;
        }
        for (d dVar : dVarArr) {
            if (dVar != null) {
                function1.invoke(dVar);
            }
        }
    }

    protected final void l(@NotNull S s10) {
        c0 c0Var;
        int i10;
        kotlin.coroutines.d<Unit>[] dVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f314483b - 1;
                this.f314483b = i11;
                c0Var = this.f314485d;
                if (i11 == 0) {
                    this.f314484c = 0;
                }
                Intrinsics.checkNotNull(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrB = s10.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (kotlin.coroutines.d<Unit> dVar : dVarArrB) {
            if (dVar != null) {
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
            }
        }
        if (c0Var != null) {
            c0Var.d0(-1);
        }
    }

    protected final int m() {
        return this.f314483b;
    }

    @Nullable
    protected final S[] n() {
        return this.f314482a;
    }
}
