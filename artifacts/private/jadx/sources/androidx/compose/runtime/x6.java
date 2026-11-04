package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,398:1\n1#2:399\n1086#3:400\n424#4,8:401\n424#4,8:409\n44#4:417\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n367#1:400\n371#1:401,8\n375#1:409,8\n395#1:417\n*E\n"})
final /* synthetic */ class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.internal.u0<androidx.compose.runtime.internal.j0> f36789a = new androidx.compose.runtime.internal.u0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.internal.u0<androidx.compose.runtime.collection.d<r1>> f36790b = new androidx.compose.runtime.internal.u0<>();

    @NotNull
    public static final androidx.compose.runtime.collection.d<r1> b() {
        androidx.compose.runtime.internal.u0<androidx.compose.runtime.collection.d<r1>> u0Var = f36790b;
        androidx.compose.runtime.collection.d<r1> dVarA = u0Var.a();
        if (dVarA == null) {
            dVarA = new androidx.compose.runtime.collection.d<>(new r1[0], 0);
            u0Var.b(dVarA);
        }
        return dVarA;
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> n7<T> c(@NotNull u6<T> u6Var, @NotNull Function0<? extends T> function0) {
        return new p1(function0, u6Var);
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> n7<T> d(@NotNull Function0<? extends T> function0) {
        return new p1(function0, null);
    }

    private static final <R> R e(q1<?> q1Var, Function0<? extends R> function0) {
        androidx.compose.runtime.collection.d<r1> dVarC = w6.c();
        r1[] r1VarArr = dVarC.f35552a;
        int iR = dVarC.R();
        int i10 = 0;
        for (int i11 = 0; i11 < iR; i11++) {
            r1VarArr[i11].b(q1Var);
        }
        try {
            R rInvoke = function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            r1[] r1VarArr2 = dVarC.f35552a;
            int iR2 = dVarC.R();
            while (i10 < iR2) {
                r1VarArr2[i10].a(q1Var);
                i10++;
            }
            return rInvoke;
        } finally {
            kotlin.jvm.internal.h0.d(1);
            r1[] r1VarArr3 = dVarC.f35552a;
            int iR3 = dVarC.R();
            while (i10 < iR3) {
                r1VarArr3[i10].a(q1Var);
                i10++;
            }
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static final <R> void f(@NotNull r1 r1Var, @NotNull Function0<? extends R> function0) {
        androidx.compose.runtime.collection.d<r1> dVarC = w6.c();
        try {
            dVarC.d(r1Var);
            function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            dVarC.r0(dVarC.R() - 1);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            dVarC.r0(dVarC.R() - 1);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    private static final <T> T g(Function1<? super androidx.compose.runtime.internal.j0, ? extends T> function1) {
        androidx.compose.runtime.internal.j0 j0Var = (androidx.compose.runtime.internal.j0) f36789a.a();
        if (j0Var == null) {
            j0Var = new androidx.compose.runtime.internal.j0(0);
            f36789a.b(j0Var);
        }
        return function1.invoke(j0Var);
    }
}
