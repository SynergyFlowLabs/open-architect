package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,103:1\n1107#2:104\n1085#2,2:105\n519#3:107\n643#3,2:108\n643#3,2:110\n472#3:112\n424#3,8:114\n207#4:113\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:104\n26#1:105,2\n29#1:107\n33#1:108,2\n45#1:110,2\n65#1:112\n85#1:114,8\n85#1:113\n*E\n"})
public final class t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f40002c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40003d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f40004e = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<l0> f40005a = new androidx.compose.runtime.collection.d<>(new l0[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private l0[] f40006b;

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.node.t1$a$a, reason: collision with other inner class name */
        private static final class C0312a implements Comparator<l0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0312a f40007a = new C0312a();

            private C0312a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(@NotNull l0 l0Var, @NotNull l0 l0Var2) {
                int iCompare = Intrinsics.compare(l0Var2.a0(), l0Var.a0());
                return iCompare != 0 ? iCompare : Intrinsics.compare(l0Var.hashCode(), l0Var2.hashCode());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void b(l0 l0Var) {
        if (l0Var.c0() > 0) {
            l0Var.H();
            l0Var.h2(false);
            androidx.compose.runtime.collection.d<l0> dVarQ0 = l0Var.Q0();
            l0[] l0VarArr = dVarQ0.f35552a;
            int iR = dVarQ0.R();
            for (int i10 = 0; i10 < iR; i10++) {
                b(l0VarArr[i10]);
            }
        }
    }

    public final void a() {
        this.f40005a.A0(a.C0312a.f40007a);
        int iR = this.f40005a.R();
        l0[] l0VarArr = this.f40006b;
        if (l0VarArr == null || l0VarArr.length < iR) {
            l0VarArr = new l0[Math.max(16, this.f40005a.R())];
        }
        this.f40006b = null;
        for (int i10 = 0; i10 < iR; i10++) {
            l0VarArr[i10] = this.f40005a.f35552a[i10];
        }
        this.f40005a.r();
        while (true) {
            iR--;
            if (-1 >= iR) {
                this.f40006b = l0VarArr;
                return;
            }
            l0 l0Var = l0VarArr[iR];
            Intrinsics.checkNotNull(l0Var);
            if (l0Var.z0()) {
                b(l0Var);
            }
            l0VarArr[iR] = null;
        }
    }

    public final boolean c() {
        return this.f40005a.R() != 0;
    }

    public final void d(@NotNull l0 l0Var) {
        if (l0Var.c0() > 0) {
            this.f40005a.d(l0Var);
            l0Var.h2(true);
        }
    }

    public final void e(@NotNull l0 l0Var) {
        if (l0Var.c0() > 0) {
            this.f40005a.r();
            this.f40005a.d(l0Var);
            l0Var.h2(true);
        }
    }

    public final void f(@NotNull l0 l0Var) {
        this.f40005a.n0(l0Var);
    }
}
