package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 8 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,398:1\n370#2,2:399\n372#2,2:409\n82#2:411\n81#2,3:413\n375#2,2:441\n82#2:443\n81#2,3:445\n370#2,2:448\n372#2,5:458\n424#3,8:401\n424#3,8:450\n1#4:412\n1#4:444\n395#5,4:416\n367#5,6:420\n377#5,3:427\n380#5,9:431\n399#5:440\n1399#6:426\n1270#6:430\n1893#7:463\n1893#7:465\n2474#7:467\n2474#7:468\n2474#7:469\n33#8:464\n33#8:466\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n188#1:399,2\n188#1:409,2\n190#1:411\n190#1:413,3\n188#1:441,2\n204#1:443\n204#1:445,3\n206#1:448,2\n206#1:458,5\n188#1:401,8\n206#1:450,8\n190#1:412\n204#1:444\n192#1:416,4\n192#1:420,6\n192#1:427,3\n192#1:431,9\n192#1:440\n192#1:426\n192#1:430\n231#1:463\n254#1:465\n296#1:467\n306#1:468\n312#1:469\n231#1:464\n254#1:466\n*E\n"})
final class p1<T> extends androidx.compose.runtime.snapshots.d1 implements q1<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<T> f36299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final u6<T> f36300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private a<T> f36301e = new a<>(androidx.compose.runtime.snapshots.b0.N().p());

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,398:1\n1893#2:399\n1893#2:401\n1893#2:403\n33#3:400\n33#3:402\n33#3:404\n370#4,2:405\n372#4,2:415\n375#4,2:442\n424#5,8:407\n395#6,4:417\n367#6,6:421\n377#6,3:428\n380#6,9:432\n399#6:441\n1399#7:427\n1270#7:431\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n117#1:399\n126#1:401\n137#1:403\n117#1:400\n126#1:402\n137#1:404\n139#1:405,2\n139#1:415,2\n139#1:442,2\n139#1:407,8\n140#1:417,4\n140#1:421,6\n140#1:428,3\n140#1:432,9\n140#1:441\n140#1:427\n140#1:431\n*E\n"})
    public static final class a<T> extends androidx.compose.runtime.snapshots.e1 implements q1.a<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final C0274a f36302i = new C0274a(null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f36303j = 8;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private static final Object f36304k = new Object();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f36305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private androidx.collection.q2<androidx.compose.runtime.snapshots.c1> f36307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private Object f36308g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f36309h;

        /* JADX INFO: renamed from: androidx.compose.runtime.p1$a$a, reason: collision with other inner class name */
        public static final class C0274a {
            public /* synthetic */ C0274a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Object a() {
                return a.f36304k;
            }

            private C0274a() {
            }
        }

        public a(long j10) {
            super(j10);
            this.f36307f = androidx.collection.r2.c();
            this.f36308g = f36304k;
        }

        @Override // androidx.compose.runtime.q1.a
        @NotNull
        public androidx.collection.q2<androidx.compose.runtime.snapshots.c1> a() {
            return this.f36307f;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        public void b(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
            Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) e1Var;
            r(aVar.a());
            this.f36308g = aVar.f36308g;
            this.f36309h = aVar.f36309h;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public androidx.compose.runtime.snapshots.e1 c() {
            return f(androidx.compose.runtime.snapshots.b0.N().p());
        }

        @Override // androidx.compose.runtime.q1.a
        public T d() {
            return (T) this.f36308g;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public androidx.compose.runtime.snapshots.e1 f(long j10) {
            return new a(j10);
        }

        @Nullable
        public final Object l() {
            return this.f36308g;
        }

        public final int m() {
            return this.f36309h;
        }

        public final long n() {
            return this.f36305d;
        }

        public final int o() {
            return this.f36306e;
        }

        public final boolean p(@NotNull q1<?> q1Var, @NotNull androidx.compose.runtime.snapshots.m mVar) {
            boolean z10;
            boolean z11;
            synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
                z10 = true;
                z11 = (this.f36305d == mVar.p() && this.f36306e == mVar.q()) ? false : true;
            }
            if (this.f36308g == f36304k || (z11 && this.f36309h != q(q1Var, mVar))) {
                z10 = false;
            }
            if (!z10 || !z11) {
                return z10;
            }
            synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
                try {
                    this.f36305d = mVar.p();
                    this.f36306e = mVar.q();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00d8 A[DONT_GENERATE, LOOP:3: B:43:0x00d6->B:44:0x00d8, LOOP_END] */
        public final int q(@NotNull q1<?> q1Var, @NotNull androidx.compose.runtime.snapshots.m mVar) {
            androidx.collection.q2<androidx.compose.runtime.snapshots.c1> q2VarA;
            int iA;
            int i10;
            int i11;
            int i12;
            synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
                q2VarA = a();
            }
            int i13 = 7;
            if (!q2VarA.y()) {
                return 7;
            }
            androidx.compose.runtime.collection.d<r1> dVarC = w6.c();
            r1[] r1VarArr = dVarC.f35552a;
            int iR = dVarC.R();
            for (int i14 = 0; i14 < iR; i14++) {
                r1VarArr[i14].b(q1Var);
            }
            try {
                Object[] objArr = q2VarA.f12437b;
                int[] iArr = q2VarA.f12438c;
                long[] jArr = q2VarA.f12436a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iA = 7;
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << i13) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    i11 = i13;
                                    androidx.compose.runtime.snapshots.c1 c1Var = (androidx.compose.runtime.snapshots.c1) objArr[i19];
                                    i12 = i16;
                                    if (iArr[i19] == 1) {
                                        androidx.compose.runtime.snapshots.e1 e1VarH = c1Var instanceof p1 ? ((p1) c1Var).h(mVar) : androidx.compose.runtime.snapshots.b0.M(c1Var.A(), mVar);
                                        iA = (((iA * 31) + androidx.compose.runtime.internal.x0.a(e1VarH)) * 31) + Long.hashCode(e1VarH.h());
                                    }
                                } else {
                                    i11 = i13;
                                    i12 = i16;
                                }
                                j10 >>= i12;
                                i18++;
                                i13 = i11;
                                i16 = i12;
                            }
                            i10 = i13;
                            if (i17 != i16) {
                                break;
                            }
                        } else {
                            i10 = i13;
                        }
                        if (i15 != length) {
                            i15++;
                            i13 = i10;
                        } else {
                            i13 = iA;
                        }
                    }
                    Unit unit = Unit.f312394a;
                    return iA;
                }
                iA = i13;
                Unit unit2 = Unit.f312394a;
                return iA;
            } finally {
                r1[] r1VarArr2 = dVarC.f35552a;
                int iR2 = dVarC.R();
                for (int i20 = 0; i20 < iR2; i20++) {
                    r1VarArr2[i20].a(q1Var);
                }
            }
        }

        public void r(@NotNull androidx.collection.q2<androidx.compose.runtime.snapshots.c1> q2Var) {
            this.f36307f = q2Var;
        }

        public final void s(@Nullable Object obj) {
            this.f36308g = obj;
        }

        public final void t(int i10) {
            this.f36309h = i10;
        }

        public final void u(long j10) {
            this.f36305d = j10;
        }

        public final void v(int i10) {
            this.f36306e = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p1(@NotNull Function0<? extends T> function0, @Nullable u6<T> u6Var) {
        this.f36299c = function0;
        this.f36300d = u6Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd A[Catch: all -> 0x0045, LOOP:1: B:16:0x0058->B:30:0x00bd, LOOP_END, TryCatch #2 {all -> 0x0045, blocks: (B:8:0x0028, B:10:0x0038, B:13:0x0048, B:16:0x0058, B:18:0x0070, B:20:0x007b, B:22:0x0089, B:24:0x00a4, B:26:0x00aa, B:30:0x00bd, B:31:0x00c3), top: B:87:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x00c3 A[EDGE_INSN: B:92:0x00c3->B:31:0x00c3 BREAK  A[LOOP:1: B:16:0x0058->B:30:0x00bd], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final a<T> E(a<T> aVar, androidx.compose.runtime.snapshots.m mVar, boolean z10, Function0<? extends T> function0) {
        androidx.compose.runtime.snapshots.m.a aVar2;
        u6<T> u6VarC;
        int i10;
        a<T> aVar3 = aVar;
        int i11 = 0;
        if (!aVar3.p(this, mVar)) {
            final androidx.collection.f2 f2Var = new androidx.collection.f2(0, 1, null);
            final androidx.compose.runtime.internal.j0 j0Var = (androidx.compose.runtime.internal.j0) x6.f36789a.a();
            if (j0Var == null) {
                j0Var = new androidx.compose.runtime.internal.j0(0);
                x6.f36789a.b(j0Var);
            }
            final int iA = j0Var.a();
            androidx.compose.runtime.collection.d<r1> dVarC = w6.c();
            r1[] r1VarArr = dVarC.f35552a;
            int iR = dVarC.R();
            for (int i12 = 0; i12 < iR; i12++) {
                r1VarArr[i12].b(this);
            }
            try {
                j0Var.b(iA + 1);
                Object objO = androidx.compose.runtime.snapshots.m.f36535e.o(new Function1() { // from class: androidx.compose.runtime.o1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p1.F(this.f36282a, j0Var, f2Var, iA, obj);
                    }
                }, null, function0);
                j0Var.b(iA);
                r1[] r1VarArr2 = dVarC.f35552a;
                int iR2 = dVarC.R();
                for (int i13 = 0; i13 < iR2; i13++) {
                    r1VarArr2[i13].a(this);
                }
                synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
                    try {
                        aVar2 = androidx.compose.runtime.snapshots.m.f36535e;
                        androidx.compose.runtime.snapshots.m mVarF = aVar2.f();
                        if (aVar3.l() == a.f36302i.a() || (u6VarC = c()) == 0 || !u6VarC.b(objO, aVar3.l())) {
                            aVar3 = (a) androidx.compose.runtime.snapshots.b0.a0(this.f36301e, this, mVarF);
                            aVar3.r(f2Var);
                            aVar3.t(aVar3.q(this, mVarF));
                            aVar3.s(objO);
                        } else {
                            aVar3.r(f2Var);
                            aVar3.t(aVar3.q(this, mVarF));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                androidx.compose.runtime.internal.j0 j0Var2 = (androidx.compose.runtime.internal.j0) x6.f36789a.a();
                if (j0Var2 == null || j0Var2.a() != 0) {
                    return aVar3;
                }
                aVar2.n();
                synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
                    androidx.compose.runtime.snapshots.m mVarF2 = aVar2.f();
                    aVar3.u(mVarF2.p());
                    aVar3.v(mVarF2.q());
                    Unit unit = Unit.f312394a;
                }
                return aVar3;
            } catch (Throwable th3) {
                r1[] r1VarArr3 = dVarC.f35552a;
                int iR3 = dVarC.R();
                for (int i14 = 0; i14 < iR3; i14++) {
                    r1VarArr3[i14].a(this);
                }
                throw th3;
            }
        }
        if (z10) {
            androidx.compose.runtime.collection.d<r1> dVarC2 = w6.c();
            r1[] r1VarArr4 = dVarC2.f35552a;
            int iR4 = dVarC2.R();
            for (int i15 = 0; i15 < iR4; i15++) {
                r1VarArr4[i15].b(this);
            }
            try {
                androidx.collection.q2<androidx.compose.runtime.snapshots.c1> q2VarA = aVar3.a();
                androidx.compose.runtime.internal.j0 j0Var3 = (androidx.compose.runtime.internal.j0) x6.f36789a.a();
                if (j0Var3 == null) {
                    j0Var3 = new androidx.compose.runtime.internal.j0(0);
                    x6.f36789a.b(j0Var3);
                }
                int iA2 = j0Var3.a();
                Object[] objArr = q2VarA.f12437b;
                int[] iArr = q2VarA.f12438c;
                long[] jArr = q2VarA.f12436a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j10 = jArr[i16];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i16 != length) {
                                break;
                                break;
                            }
                            i16++;
                            i11 = 0;
                        } else {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            while (i11 < i18) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i16 << 3) + i11;
                                    i10 = i17;
                                    androidx.compose.runtime.snapshots.c1 c1Var = (androidx.compose.runtime.snapshots.c1) objArr[i19];
                                    j0Var3.b(iA2 + iArr[i19]);
                                    Function1<Object, Unit> function1L = mVar.l();
                                    if (function1L != null) {
                                        function1L.invoke(c1Var);
                                    }
                                } else {
                                    i10 = i17;
                                }
                                j10 >>= i10;
                                i11++;
                                i17 = i10;
                            }
                            if (i18 != i17) {
                                break;
                            }
                            if (i16 != length) {
                                break;
                            }
                            i16++;
                            i11 = 0;
                        }
                    }
                }
                j0Var3.b(iA2);
                Unit unit2 = Unit.f312394a;
            } finally {
                r1[] r1VarArr5 = dVarC2.f35552a;
                int iR5 = dVarC2.R();
                for (int i20 = 0; i20 < iR5; i20++) {
                    r1VarArr5[i20].a(this);
                }
            }
        }
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(p1 p1Var, androidx.compose.runtime.internal.j0 j0Var, androidx.collection.f2 f2Var, int i10, Object obj) {
        if (obj == p1Var) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof androidx.compose.runtime.snapshots.c1) {
            f2Var.l0(obj, Math.min(j0Var.a() - i10, f2Var.r(obj, Integer.MAX_VALUE)));
        }
        return Unit.f312394a;
    }

    private final String G() {
        a aVar = (a) androidx.compose.runtime.snapshots.b0.L(this.f36301e);
        return aVar.p(this, androidx.compose.runtime.snapshots.m.f36535e.f()) ? String.valueOf(aVar.l()) : "<Not calculated>";
    }

    public static /* synthetic */ void I() {
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public androidx.compose.runtime.snapshots.e1 A() {
        return this.f36301e;
    }

    @Override // androidx.compose.runtime.q1
    @NotNull
    public q1.a<T> D() {
        androidx.compose.runtime.snapshots.m mVarF = androidx.compose.runtime.snapshots.m.f36535e.f();
        return E((a) androidx.compose.runtime.snapshots.b0.M(this.f36301e, mVarF), mVarF, false, this.f36299c);
    }

    @oj.i(name = "getDebuggerDisplayValue")
    @Nullable
    public final T H() {
        a aVar = (a) androidx.compose.runtime.snapshots.b0.L(this.f36301e);
        if (aVar.p(this, androidx.compose.runtime.snapshots.m.f36535e.f())) {
            return (T) aVar.l();
        }
        return null;
    }

    @Override // androidx.compose.runtime.q1
    @Nullable
    public u6<T> c() {
        return this.f36300d;
    }

    @Override // androidx.compose.runtime.n7
    public T getValue() {
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        Function1<Object, Unit> function1L = aVar.f().l();
        if (function1L != null) {
            function1L.invoke(this);
        }
        androidx.compose.runtime.snapshots.m mVarF = aVar.f();
        return (T) E((a) androidx.compose.runtime.snapshots.b0.M(this.f36301e, mVarF), mVarF, true, this.f36299c).l();
    }

    @NotNull
    public final androidx.compose.runtime.snapshots.e1 h(@NotNull androidx.compose.runtime.snapshots.m mVar) {
        return E((a) androidx.compose.runtime.snapshots.b0.M(this.f36301e, mVar), mVar, false, this.f36299c);
    }

    @Override // androidx.compose.runtime.snapshots.c1
    public void p(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f36301e = (a) e1Var;
    }

    @NotNull
    public String toString() {
        return "DerivedState(value=" + G() + ")@" + hashCode();
    }
}
