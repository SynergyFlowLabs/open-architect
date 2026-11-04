package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
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
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,496:1\n85#2:497\n117#2,2:498\n1#3:500\n273#4:501\n273#4:502\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n*L\n282#1:497\n282#1:498,2\n427#1:501\n434#1:502\n*E\n"})
public final class f3 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.v, androidx.compose.ui.node.t, androidx.compose.ui.node.i2, androidx.compose.ui.node.q1 {

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f14237n3 = 8;

    @NotNull
    private d4 H1;
    private boolean X;
    private long Y;
    private float Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.d f14238g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private c4 f14239h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f14240i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private n7<n0.g> f14241j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private long f14242k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.u f14243l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.channels.p<Unit> f14244m3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f14245p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f14246p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private View f14247p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.unit.d, n0.g> f14248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Function1<? super androidx.compose.ui.unit.d, n0.g> f14249t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private Function1<? super androidx.compose.ui.unit.l, Unit> f14250v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f14251w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", i = {}, l = {382, 386}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14252a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(long j10) {
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f3.this.new a(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0029  */
        /* JADX WARN: Code duplicated, block: B:14:0x0032  */
        /* JADX WARN: Code duplicated, block: B:17:0x003c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0043 -> B:12:0x0029). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0052 -> B:23:0x0056). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f14252a
                r2 = 2
                r4 = 7
                r3 = 1
                if (r1 == 0) goto L26
                r4 = 0
                if (r1 == r3) goto L22
                if (r1 != r2) goto L15
                r4 = 0
                kotlin.ResultKt.m(r6)
                goto L56
            L15:
                r4 = 4
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "otshi/ll/obrn/cft /m kc/rneouiew ooet ie asuvee/ /r"
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r4 = 5
                r5.<init>(r6)
                r4 = 0
                throw r5
            L22:
                kotlin.ResultKt.m(r6)
                goto L3c
            L26:
                kotlin.ResultKt.m(r6)
            L29:
                androidx.compose.foundation.f3 r6 = androidx.compose.foundation.f3.this
                kotlinx.coroutines.channels.p r6 = androidx.compose.foundation.f3.y9(r6)
                r4 = 0
                if (r6 == 0) goto L3c
                r4 = 6
                r5.f14252a = r3
                java.lang.Object r6 = r6.j(r5)
                if (r6 != r0) goto L3c
                goto L54
            L3c:
                androidx.compose.foundation.f3 r6 = androidx.compose.foundation.f3.this
                r4 = 1
                androidx.compose.foundation.c4 r6 = androidx.compose.foundation.f3.z9(r6)
                if (r6 == 0) goto L29
                androidx.compose.foundation.e3 r6 = new androidx.compose.foundation.e3
                r6.<init>()
                r4 = 5
                r5.f14252a = r2
                java.lang.Object r6 = androidx.compose.runtime.d3.d(r6, r5)
                r4 = 2
                if (r6 != r0) goto L56
            L54:
                r4 = 0
                return r0
            L56:
                r4 = 7
                androidx.compose.foundation.f3 r6 = androidx.compose.foundation.f3.this
                androidx.compose.foundation.c4 r6 = androidx.compose.foundation.f3.z9(r6)
                r4 = 1
                if (r6 == 0) goto L29
                r6.c()
                goto L29
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.f3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ f3(Function1 function1, Function1 function2, Function1 function3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, d4 d4Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function2, function3, f10, z10, j10, f11, f12, z11, d4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.g A9(f3 f3Var) {
        return n0.g.d(f3Var.f14242k3);
    }

    private final long B9() {
        if (this.f14241j3 == null) {
            this.f14241j3 = w6.e(new Function0() { // from class: androidx.compose.foundation.d3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f3.C9(this.f14135a);
                }
            });
        }
        n7<n0.g> n7Var = this.f14241j3;
        return n7Var != null ? n7Var.getValue().B() : n0.g.f332700b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.g C9(f3 f3Var) {
        androidx.compose.ui.layout.g0 g0VarM = f3Var.M();
        return n0.g.d(g0VarM != null ? androidx.compose.ui.layout.h0.f(g0VarM) : n0.g.f332700b.c());
    }

    private final androidx.compose.ui.layout.g0 M() {
        return (androidx.compose.ui.layout.g0) this.f14240i3.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N9(f3 f3Var) {
        f3Var.ba();
        return Unit.f312394a;
    }

    private final void O9() {
        c4 c4Var = this.f14239h3;
        if (c4Var != null) {
            c4Var.dismiss();
        }
        View viewA = this.f14247p2;
        if (viewA == null) {
            viewA = androidx.compose.ui.node.l.a(this);
        }
        View view = viewA;
        this.f14247p2 = view;
        androidx.compose.ui.unit.d dVarQ = this.f14238g3;
        if (dVarQ == null) {
            dVarQ = androidx.compose.ui.node.k.q(this);
        }
        androidx.compose.ui.unit.d dVar = dVarQ;
        this.f14238g3 = dVar;
        this.f14239h3 = this.H1.a(view, this.X, this.Y, this.Z, this.f14245p0, this.f14246p1, dVar, this.f14251w);
        ca();
    }

    private final void S9(androidx.compose.ui.layout.g0 g0Var) {
        this.f14240i3.setValue(g0Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    private final void ba() {
        long jC;
        androidx.compose.ui.unit.d dVarQ = this.f14238g3;
        if (dVarQ == null) {
            dVarQ = androidx.compose.ui.node.k.q(this);
            this.f14238g3 = dVarQ;
        }
        long jB = this.f14248s.invoke(dVarQ).B();
        if ((jB & 9223372034707292159L) == n0.d.f332689d || (B9() & 9223372034707292159L) == n0.d.f332689d) {
            this.f14242k3 = n0.g.f332700b.c();
            c4 c4Var = this.f14239h3;
            if (c4Var != null) {
                c4Var.dismiss();
                return;
            }
            return;
        }
        this.f14242k3 = n0.g.w(B9(), jB);
        Function1<? super androidx.compose.ui.unit.d, n0.g> function1 = this.f14249t;
        if (function1 != null) {
            n0.g gVarD = n0.g.d(function1.invoke(dVarQ).B());
            if ((gVarD.B() & 9223372034707292159L) == n0.d.f332689d) {
                gVarD = null;
            }
            if (gVarD != null) {
                jC = n0.g.w(B9(), gVarD.B());
            } else {
                jC = n0.g.f332700b.c();
            }
        } else {
            jC = n0.g.f332700b.c();
        }
        long j10 = jC;
        if (this.f14239h3 == null) {
            O9();
        }
        c4 c4Var2 = this.f14239h3;
        if (c4Var2 != null) {
            c4Var2.b(this.f14242k3, j10, this.f14251w);
        }
        ca();
    }

    private final void ca() {
        androidx.compose.ui.unit.d dVar;
        c4 c4Var = this.f14239h3;
        if (c4Var == null || (dVar = this.f14238g3) == null || androidx.compose.ui.unit.u.g(c4Var.a(), this.f14243l3)) {
            return;
        }
        Function1<? super androidx.compose.ui.unit.l, Unit> function1 = this.f14250v;
        if (function1 != null) {
            function1.invoke(androidx.compose.ui.unit.l.c(dVar.C0(androidx.compose.ui.unit.v.h(c4Var.a()))));
        }
        this.f14243l3 = androidx.compose.ui.unit.u.b(c4Var.a());
    }

    public final boolean D9() {
        return this.f14246p1;
    }

    public final float E9() {
        return this.Z;
    }

    public final float F9() {
        return this.f14245p0;
    }

    @Nullable
    public final Function1<androidx.compose.ui.unit.d, n0.g> G9() {
        return this.f14249t;
    }

    @Nullable
    public final Function1<androidx.compose.ui.unit.l, Unit> H9() {
        return this.f14250v;
    }

    @NotNull
    public final d4 I9() {
        return this.H1;
    }

    public final long J9() {
        return this.Y;
    }

    @NotNull
    public final Function1<androidx.compose.ui.unit.d, n0.g> K9() {
        return this.f14248s;
    }

    public final boolean L9() {
        return this.X;
    }

    public final float M9() {
        return this.f14251w;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        kotlinx.coroutines.channels.p<Unit> pVar = this.f14244m3;
        if (pVar != null) {
            kotlinx.coroutines.channels.t.b(pVar.p(Unit.f312394a));
        }
    }

    public final void P9(boolean z10) {
        this.f14246p1 = z10;
    }

    public final void Q9(float f10) {
        this.Z = f10;
    }

    public final void R9(float f10) {
        this.f14245p0 = f10;
    }

    public final void T9(@Nullable Function1<? super androidx.compose.ui.unit.d, n0.g> function1) {
        this.f14249t = function1;
    }

    public final void U9(@Nullable Function1<? super androidx.compose.ui.unit.l, Unit> function1) {
        this.f14250v = function1;
    }

    public final void V9(@NotNull d4 d4Var) {
        this.H1 = d4Var;
    }

    public final void W9(long j10) {
        this.Y = j10;
    }

    public final void X9(@NotNull Function1<? super androidx.compose.ui.unit.d, n0.g> function1) {
        this.f14248s = function1;
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        androidx.compose.ui.node.r1.a(this, new Function0() { // from class: androidx.compose.foundation.b3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f3.N9(this.f13916a);
            }
        });
    }

    public final void Y9(boolean z10) {
        this.X = z10;
    }

    public final void Z9(float f10) {
        this.f14251w = f10;
    }

    public final void aa(@NotNull Function1<? super androidx.compose.ui.unit.d, n0.g> function1, @Nullable Function1<? super androidx.compose.ui.unit.d, n0.g> function2, float f10, boolean z10, long j10, float f11, float f12, boolean z11, @Nullable Function1<? super androidx.compose.ui.unit.l, Unit> function3, @NotNull d4 d4Var) {
        float f13 = this.f14251w;
        long j11 = this.Y;
        float f14 = this.Z;
        boolean z12 = this.X;
        float f15 = this.f14245p0;
        boolean z13 = this.f14246p1;
        d4 d4Var2 = this.H1;
        View view = this.f14247p2;
        androidx.compose.ui.unit.d dVar = this.f14238g3;
        this.f14248s = function1;
        this.f14249t = function2;
        this.f14251w = f10;
        this.X = z10;
        this.Y = j10;
        this.Z = f11;
        this.f14245p0 = f12;
        this.f14246p1 = z11;
        this.f14250v = function3;
        this.H1 = d4Var;
        View viewA = androidx.compose.ui.node.l.a(this);
        androidx.compose.ui.unit.d dVarQ = androidx.compose.ui.node.k.q(this);
        if (this.f14239h3 != null && ((!g3.a(f10, f13) && !d4Var.b()) || !androidx.compose.ui.unit.l.l(j10, j11) || !androidx.compose.ui.unit.h.x(f11, f14) || !androidx.compose.ui.unit.h.x(f12, f15) || z10 != z12 || z11 != z13 || !Intrinsics.areEqual(d4Var, d4Var2) || !Intrinsics.areEqual(viewA, view) || !Intrinsics.areEqual(dVarQ, dVar))) {
            O9();
        }
        ba();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        Y5();
        this.f14244m3 = kotlinx.coroutines.channels.s.d(0, null, null, 7, null);
        kotlinx.coroutines.k.f(Q8(), null, kotlinx.coroutines.u0.UNDISPATCHED, new a(null), 1, null);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        c4 c4Var = this.f14239h3;
        if (c4Var != null) {
            c4Var.dismiss();
        }
        this.f14239h3 = null;
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        S9(g0Var);
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        e0Var.c(g3.b(), new Function0() { // from class: androidx.compose.foundation.c3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f3.A9(this.f14002a);
            }
        });
    }

    public /* synthetic */ f3(Function1 function1, Function1 function2, Function1 function3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, d4 d4Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i10 & 2) != 0 ? null : function2, (i10 & 4) != 0 ? null : function3, (i10 & 8) != 0 ? Float.NaN : f10, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? androidx.compose.ui.unit.l.f42704b.a() : j10, (i10 & 64) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f11, (i10 & 128) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f12, (i10 & 256) != 0 ? true : z11, (i10 & 512) != 0 ? d4.f14136a.a() : d4Var, null);
    }

    private f3(Function1<? super androidx.compose.ui.unit.d, n0.g> function1, Function1<? super androidx.compose.ui.unit.d, n0.g> function2, Function1<? super androidx.compose.ui.unit.l, Unit> function3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, d4 d4Var) {
        this.f14248s = function1;
        this.f14249t = function2;
        this.f14250v = function3;
        this.f14251w = f10;
        this.X = z10;
        this.Y = j10;
        this.Z = f11;
        this.f14245p0 = f12;
        this.f14246p1 = z11;
        this.H1 = d4Var;
        this.f14240i3 = w6.k(null, w6.o());
        this.f14242k3 = n0.g.f332700b.c();
    }
}
