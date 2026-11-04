package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n+ 2 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1799:1\n397#2,3:1800\n354#2,6:1803\n364#2,3:1810\n367#2,9:1814\n400#2:1823\n397#2,3:1824\n354#2,6:1827\n364#2,3:1834\n367#2,9:1838\n400#2:1847\n1399#3:1809\n1270#3:1813\n1399#3:1833\n1270#3:1837\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n*L\n1308#1:1800,3\n1308#1:1803,6\n1308#1:1810,3\n1308#1:1814,9\n1308#1:1823\n1312#1:1824,3\n1312#1:1827,6\n1312#1:1834,3\n1312#1:1838,9\n1312#1:1847\n1308#1:1809\n1308#1:1813\n1312#1:1833\n1312#1:1837\n*E\n"})
final class o1 extends androidx.compose.foundation.c implements androidx.compose.ui.node.h {

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @Nullable
    private String f18136u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f18137v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f18138w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f18139x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    private final androidx.collection.a2<kotlinx.coroutines.p2> f18140y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    private final androidx.collection.a2<a> f18141z3;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f18142c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.p2 f18143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18144b;

        public a(@NotNull kotlinx.coroutines.p2 p2Var) {
            this.f18143a = p2Var;
        }

        public final boolean a() {
            return this.f18144b;
        }

        @NotNull
        public final kotlinx.coroutines.p2 b() {
            return this.f18143a;
        }

        public final void c(boolean z10) {
            this.f18144b = z10;
        }
    }

    static final class b implements PointerInputEventHandler {

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", i = {}, l = {1121}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<androidx.compose.foundation.gestures.r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f18146a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f18147b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ long f18148c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ o1 f18149d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o1 o1Var, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f18149d = o1Var;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Object invoke(androidx.compose.foundation.gestures.r3 r3Var, n0.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                return k(r3Var, gVar.B(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f18146a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.foundation.gestures.r3 r3Var = (androidx.compose.foundation.gestures.r3) this.f18147b;
                    long j10 = this.f18148c;
                    if (this.f18149d.X9()) {
                        o1 o1Var = this.f18149d;
                        this.f18146a = 1;
                        if (o1Var.Z9(r3Var, j10, this) == objL) {
                            return objL;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            public final Object k(androidx.compose.foundation.gestures.r3 r3Var, long j10, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(this.f18149d, dVar);
                aVar.f18147b = r3Var;
                aVar.f18148c = j10;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(o1 o1Var, n0.g gVar) {
            Function0 function0 = o1Var.f18138w3;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(o1 o1Var, n0.g gVar) {
            Function0 function0 = o1Var.f18137v3;
            if (function0 != null) {
                function0.invoke();
            }
            if (o1Var.sa()) {
                ((p0.a) androidx.compose.ui.node.i.a(o1Var, androidx.compose.ui.platform.q1.s())).a(p0.b.f340720b.f());
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(o1 o1Var, n0.g gVar) {
            if (o1Var.X9()) {
                o1Var.Y9().invoke();
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Function1 function1;
            Function1 function2;
            if (!o1.this.X9() || o1.this.f18138w3 == null) {
                function1 = null;
            } else {
                final o1 o1Var = o1.this;
                function1 = new Function1() { // from class: androidx.compose.foundation.p1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o1.b.d(o1Var, (n0.g) obj);
                    }
                };
            }
            if (!o1.this.X9() || o1.this.f18137v3 == null) {
                function2 = null;
            } else {
                final o1 o1Var2 = o1.this;
                function2 = new Function1() { // from class: androidx.compose.foundation.q1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o1.b.e(o1Var2, (n0.g) obj);
                    }
                };
            }
            a aVar = new a(o1.this, null);
            final o1 o1Var3 = o1.this;
            Object objO = androidx.compose.foundation.gestures.c5.o(l0Var, function1, function2, aVar, new Function1() { // from class: androidx.compose.foundation.r1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return o1.b.f(o1Var3, (n0.g) obj);
                }
            }, dVar);
            return objO == kotlin.coroutines.intrinsics.b.l() ? objO : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1", f = "Clickable.kt", i = {}, l = {1212}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18150a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o1.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f18150a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long j10 = ((androidx.compose.ui.platform.o4) androidx.compose.ui.node.i.a(o1.this, androidx.compose.ui.platform.q1.D())).j();
                this.f18150a = 1;
                if (kotlinx.coroutines.d1.b(j10, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Function0 function0 = o1.this.f18137v3;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", i = {0, 0}, l = {1268, 1272}, m = "invokeSuspend", n = {"minTime", io.sentry.k4.f305718l3}, s = {"J$0", "J$1"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f18152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f18153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18154c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f18156e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f18156e = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o1.this.new d(this.f18156e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        
            if (kotlinx.coroutines.d1.b(r4 - r6, r11) == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r10 = 1
                int r1 = r11.f18154c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                r10 = 7
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r12)
                goto L6e
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1c:
                long r4 = r11.f18153b
                long r6 = r11.f18152a
                kotlin.ResultKt.m(r12)
                goto L4d
            L24:
                kotlin.ResultKt.m(r12)
                androidx.compose.foundation.o1 r12 = androidx.compose.foundation.o1.this
                androidx.compose.runtime.m4 r1 = androidx.compose.ui.platform.q1.D()
                r10 = 5
                java.lang.Object r12 = androidx.compose.ui.node.i.a(r12, r1)
                r10 = 0
                androidx.compose.ui.platform.o4 r12 = (androidx.compose.ui.platform.o4) r12
                long r6 = r12.a()
                r10 = 7
                long r4 = r12.i()
                r11.f18152a = r6
                r11.f18153b = r4
                r10 = 6
                r11.f18154c = r3
                r10 = 1
                java.lang.Object r12 = kotlinx.coroutines.d1.b(r6, r11)
                if (r12 != r0) goto L4d
                goto L6d
            L4d:
                androidx.compose.foundation.o1 r12 = androidx.compose.foundation.o1.this
                r10 = 3
                androidx.collection.a2 r12 = androidx.compose.foundation.o1.oa(r12)
                long r8 = r11.f18156e
                java.lang.Object r12 = r12.n(r8)
                r10 = 2
                androidx.compose.foundation.o1$a r12 = (androidx.compose.foundation.o1.a) r12
                r10 = 7
                if (r12 == 0) goto L63
                r12.c(r3)
            L63:
                long r4 = r4 - r6
                r10 = 1
                r11.f18154c = r2
                java.lang.Object r12 = kotlinx.coroutines.d1.b(r4, r11)
                if (r12 != r0) goto L6e
            L6d:
                return r0
            L6e:
                androidx.compose.foundation.o1 r11 = androidx.compose.foundation.o1.this
                r10 = 5
                kotlin.jvm.functions.Function0 r11 = r11.Y9()
                r11.invoke()
                kotlin.Unit r11 = kotlin.Unit.f312394a
                r10 = 7
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.o1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ o1(Function0 function0, String str, Function0 function1, Function0 function2, boolean z10, androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z11, boolean z12, String str2, androidx.compose.ui.semantics.j jVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, str, function1, function2, z10, jVar, z2Var, z11, z12, str2, jVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ra(o1 o1Var) {
        Function0<Unit> function0 = o1Var.f18137v3;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004e A[LOOP:0: B:5:0x001c->B:15:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009b A[LOOP:2: B:20:0x006a->B:30:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x005a A[EDGE_INSN: B:34:0x005a->B:17:0x005a BREAK  A[LOOP:0: B:5:0x001c->B:15:0x004e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e A[EDGE_INSN: B:39:0x009e->B:31:0x009e BREAK  A[LOOP:2: B:20:0x006a->B:30:0x009b], SYNTHETIC] */
    private final void ta() {
        long j10;
        long j11;
        long j12;
        androidx.collection.a2<kotlinx.coroutines.p2> a2Var = this.f18140y3;
        Object[] objArr = a2Var.f12511c;
        long[] jArr = a2Var.f12509a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            j10 = 128;
            j11 = 255;
            while (true) {
                long j13 = jArr[i10];
                j12 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j13 & 255) < 128) {
                            kotlinx.coroutines.p2.a.b((kotlinx.coroutines.p2) objArr[(i10 << 3) + i12], null, 1, null);
                        }
                        j13 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            j10 = 128;
            j11 = 255;
            j12 = -9187201950435737472L;
        }
        a2Var.P();
        androidx.collection.a2<a> a2Var2 = this.f18141z3;
        Object[] objArr2 = a2Var2.f12511c;
        long[] jArr2 = a2Var2.f12509a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j14 = jArr2[i13];
                if ((((~j14) << 7) & j14 & j12) == j12) {
                    if (i13 != length2) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j14 & j11) < j10) {
                            kotlinx.coroutines.p2.a.b(((a) objArr2[(i13 << 3) + i15]).b(), null, 1, null);
                        }
                        j14 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length2) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        a2Var2.P();
    }

    @Override // androidx.compose.foundation.c
    public void Q9(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        if (this.f18137v3 != null) {
            androidx.compose.ui.semantics.b0.T0(e0Var, this.f18136u3, new Function0() { // from class: androidx.compose.foundation.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(o1.ra(this.f18121a));
                }
            });
        }
    }

    @Override // androidx.compose.foundation.c
    @NotNull
    public androidx.compose.ui.input.pointer.y0 S9() {
        return androidx.compose.ui.input.pointer.w0.a(new b());
    }

    @Override // androidx.compose.foundation.c
    protected void ea() {
        ta();
    }

    @Override // androidx.compose.foundation.c
    protected boolean fa(@NotNull KeyEvent keyEvent) {
        boolean z10;
        long jA = androidx.compose.ui.input.key.e.a(keyEvent);
        if (this.f18137v3 == null || this.f18140y3.n(jA) != null) {
            z10 = false;
        } else {
            boolean z11 = true | false;
            this.f18140y3.j0(jA, kotlinx.coroutines.k.f(Q8(), null, null, new c(null), 3, null));
            z10 = true;
        }
        a aVarN = this.f18141z3.n(jA);
        if (aVarN != null) {
            if (aVarN.b().isActive()) {
                kotlinx.coroutines.p2.a.b(aVarN.b(), null, 1, null);
                if (!aVarN.a()) {
                    Y9().invoke();
                    this.f18141z3.e0(jA);
                    return z10;
                }
            } else {
                this.f18141z3.e0(jA);
            }
        }
        return z10;
    }

    @Override // androidx.compose.ui.a0.d
    public void g9() {
        super.g9();
        ta();
    }

    @Override // androidx.compose.foundation.c
    protected boolean ga(@NotNull KeyEvent keyEvent) {
        Function0<Unit> function0;
        long jA = androidx.compose.ui.input.key.e.a(keyEvent);
        boolean z10 = false;
        if (this.f18140y3.n(jA) != null) {
            kotlinx.coroutines.p2 p2VarN = this.f18140y3.n(jA);
            if (p2VarN != null) {
                if (p2VarN.isActive()) {
                    kotlinx.coroutines.p2.a.b(p2VarN, null, 1, null);
                } else {
                    z10 = true;
                }
            }
            this.f18140y3.e0(jA);
        }
        if (this.f18138w3 != null) {
            if (this.f18141z3.n(jA) != null) {
                if (!z10 && (function0 = this.f18138w3) != null) {
                    function0.invoke();
                }
                this.f18141z3.e0(jA);
            } else if (!z10) {
                this.f18141z3.j0(jA, new a(kotlinx.coroutines.k.f(Q8(), null, null, new d(jA, null), 3, null)));
            }
        } else if (!z10) {
            Y9().invoke();
        }
        return true;
    }

    public final boolean sa() {
        return this.f18139x3;
    }

    public final void ua(boolean z10) {
        this.f18139x3 = z10;
    }

    public final void va(@NotNull Function0<Unit> function0, @Nullable String str, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable z2 z2Var, boolean z10, boolean z11, @Nullable String str2, @Nullable androidx.compose.ui.semantics.j jVar2) {
        boolean z12;
        if (!Intrinsics.areEqual(this.f18136u3, str)) {
            this.f18136u3 = str;
            androidx.compose.ui.node.j2.b(this);
        }
        if ((this.f18137v3 == null) != (function1 == null)) {
            U9();
            androidx.compose.ui.node.j2.b(this);
            z12 = true;
        } else {
            z12 = false;
        }
        this.f18137v3 = function1;
        if ((this.f18138w3 == null) != (function2 == null)) {
            z12 = true;
        }
        this.f18138w3 = function2;
        boolean z13 = X9() == z11 ? z12 : true;
        ma(jVar, z2Var, z10, z11, str2, jVar2, function0);
        if (z13) {
            ka();
        }
    }

    private o1(Function0<Unit> function0, String str, Function0<Unit> function1, Function0<Unit> function2, boolean z10, androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z11, boolean z12, String str2, androidx.compose.ui.semantics.j jVar2) {
        super(jVar, z2Var, z11, z12, str2, jVar2, function0, null);
        this.f18136u3 = str;
        this.f18137v3 = function1;
        this.f18138w3 = function2;
        this.f18139x3 = z10;
        this.f18140y3 = androidx.collection.y0.j();
        this.f18141z3 = androidx.collection.y0.j();
    }
}
