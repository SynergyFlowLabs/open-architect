package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.q1;
import androidx.compose.ui.node.r1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,305:1\n194#1,12:456\n194#1,12:468\n118#2:306\n122#2:380\n118#2:381\n126#2:480\n118#2:481\n248#3,5:307\n91#3:312\n92#3,8:317\n450#3,6:325\n460#3,2:332\n462#3,8:337\n470#3,9:348\n479#3,8:360\n101#3,7:368\n259#3,2:382\n91#3:384\n92#3,8:389\n261#3:397\n262#3,2:399\n450#3,12:401\n462#3,8:416\n470#3,9:427\n479#3,8:439\n265#3:447\n101#3,7:448\n266#3:455\n259#3,2:482\n91#3:484\n92#3,8:489\n261#3:497\n262#3,2:499\n450#3,12:501\n462#3,8:516\n470#3,9:527\n479#3,8:539\n265#3:547\n101#3,7:548\n266#3:555\n57#4,4:313\n57#4,4:385\n57#4,4:485\n247#5:331\n247#5:398\n247#5:498\n240#6,3:334\n243#6,3:357\n240#6,3:413\n243#6,3:436\n240#6,3:513\n243#6,3:536\n1107#7:345\n1085#7,2:346\n1107#7:424\n1085#7,2:425\n1107#7:524\n1085#7,2:525\n27#8,5:375\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n224#1:456,12\n248#1:468,12\n77#1:306\n183#1:380\n183#1:381\n277#1:480\n277#1:481\n77#1:307,5\n77#1:312\n77#1:317,8\n77#1:325,6\n77#1:332,2\n77#1:337,8\n77#1:348,9\n77#1:360,8\n77#1:368,7\n183#1:382,2\n183#1:384\n183#1:389,8\n183#1:397\n183#1:399,2\n183#1:401,12\n183#1:416,8\n183#1:427,9\n183#1:439,8\n183#1:447\n183#1:448,7\n183#1:455\n277#1:482,2\n277#1:484\n277#1:489,8\n277#1:497\n277#1:499,2\n277#1:501,12\n277#1:516,8\n277#1:527,9\n277#1:539,8\n277#1:547\n277#1:548,7\n277#1:555\n77#1:313,4\n183#1:385,4\n277#1:485,4\n77#1:331\n183#1:398\n277#1:498\n77#1:334,3\n77#1:357,3\n183#1:413,3\n183#1:436,3\n277#1:513,3\n277#1:536,3\n77#1:345\n77#1:346,2\n183#1:424\n183#1:425,2\n277#1:524\n277#1:525,2\n95#1:375,5\n*E\n"})
public final class FocusTargetNode extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.h, r0, q1, androidx.compose.ui.modifier.j {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f37360p1 = 8;

    @Nullable
    private q0 X;
    private final boolean Y;
    private int Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f37361p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final Function2<p0, p0, Unit> f37362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final Function1<FocusTargetNode, Unit> f37363t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f37364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f37365w;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class FocusTargetElement extends e1<FocusTargetNode> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final FocusTargetElement f37366c = new FocusTargetElement();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f37367d = 0;

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.e1
        public boolean equals(@Nullable Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.e1
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.e1
        public void j(@NotNull t2 t2Var) {
            t2Var.d("focusTarget");
        }

        @Override // androidx.compose.ui.node.e1
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode a() {
            return new FocusTargetNode(0, null, null, 7, null);
        }

        @Override // androidx.compose.ui.node.e1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void k(@NotNull FocusTargetNode focusTargetNode) {
        }
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37369b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37368a = iArr;
            int[] iArr2 = new int[q0.values().length];
            try {
                iArr2[q0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q0.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[q0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[q0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f37369b = iArr2;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<z> f37370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f37371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i1.h<z> hVar, FocusTargetNode focusTargetNode) {
            super(0);
            this.f37370a = hVar;
            this.f37371b = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.compose.ui.focus.z] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f37370a.f312751a = this.f37371b.D9();
        }
    }

    public /* synthetic */ FocusTargetNode(int i10, Function2 function2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function2, function1);
    }

    private final void B9(int i10, Function1<? super g0, Unit> function1, Function2<? super z, ? super g, Unit> function2) {
        z zVarD9 = D9();
        androidx.compose.ui.focus.b bVar = new androidx.compose.ui.focus.b(i10, null);
        w focusOwner = androidx.compose.ui.node.k.v(this).getFocusOwner();
        FocusTargetNode focusTargetNodeJ = focusOwner.j();
        function2.invoke(zVarD9, bVar);
        FocusTargetNode focusTargetNodeJ2 = focusOwner.j();
        if (bVar.d()) {
            function1.invoke(g0.f37418b.b());
        } else {
            if (focusTargetNodeJ == focusTargetNodeJ2 || focusTargetNodeJ2 == null) {
                return;
            }
            function1.invoke(g0.f37418b.d());
        }
    }

    @Override // androidx.compose.ui.focus.r0
    public void A2(int i10) {
        if (w0.h(this.Z, i10)) {
            return;
        }
        this.Z = i10;
        if (a9() && this == androidx.compose.ui.node.k.v(this).getFocusOwner().j() && !w0.e(this.Z, this)) {
            u0.d(this, true, true);
        }
    }

    public final void A9(int i10, @NotNull Function1<? super g0, Unit> function1) {
        if (this.f37365w) {
            return;
        }
        this.f37365w = true;
        try {
            z zVarD9 = D9();
            androidx.compose.ui.focus.b bVar = new androidx.compose.ui.focus.b(i10, null);
            w focusOwner = androidx.compose.ui.node.k.v(this).getFocusOwner();
            FocusTargetNode focusTargetNodeJ = focusOwner.j();
            zVarD9.Q().invoke(bVar);
            FocusTargetNode focusTargetNodeJ2 = focusOwner.j();
            if (bVar.d()) {
                function1.invoke(g0.f37418b.b());
            } else if (focusTargetNodeJ != focusTargetNodeJ2 && focusTargetNodeJ2 != null) {
                function1.invoke(g0.f37418b.d());
            }
            kotlin.jvm.internal.h0.d(1);
            this.f37365w = false;
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            this.f37365w = false;
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public final void C9(int i10, @NotNull Function1<? super g0, Unit> function1) {
        if (this.f37364v) {
            return;
        }
        this.f37364v = true;
        try {
            z zVarD9 = D9();
            androidx.compose.ui.focus.b bVar = new androidx.compose.ui.focus.b(i10, null);
            w focusOwner = androidx.compose.ui.node.k.v(this).getFocusOwner();
            FocusTargetNode focusTargetNodeJ = focusOwner.j();
            zVarD9.R().invoke(bVar);
            FocusTargetNode focusTargetNodeJ2 = focusOwner.j();
            if (bVar.d()) {
                function1.invoke(g0.f37418b.b());
            } else if (focusTargetNodeJ != focusTargetNodeJ2 && focusTargetNodeJ2 != null) {
                function1.invoke(g0.f37418b.d());
            }
            kotlin.jvm.internal.h0.d(1);
            this.f37364v = false;
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            this.f37364v = false;
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    @NotNull
    public final z D9() {
        androidx.compose.ui.node.i1 i1VarA0;
        a0 a0Var = new a0();
        a0Var.D(w0.e(X2(), this));
        int iB = m1.b(2048);
        int iB2 = m1.b(1024);
        androidx.compose.ui.a0.d dVarW = w();
        int i10 = iB | iB2;
        if (!w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW2 = w();
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(this);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (dVarW2 != null) {
                    if ((dVarW2.T8() & i10) != 0) {
                        if (dVarW2 != dVarW && (dVarW2.T8() & iB2) != 0) {
                            return a0Var;
                        }
                        if ((dVarW2.T8() & iB) != 0) {
                            androidx.compose.ui.a0.d dVarN = dVarW2;
                            androidx.compose.runtime.collection.d dVar = null;
                            while (dVarN != 0) {
                                if (dVarN instanceof c0) {
                                    ((c0) dVarN).Z6(a0Var);
                                } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                    androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9();
                                    int i11 = 0;
                                    dVarN = dVarN;
                                    while (dVarY9 != null) {
                                        if ((dVarY9.T8() & iB) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                dVarN = dVarY9;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                                }
                                                if (dVarN != 0) {
                                                    dVar.d(dVarN);
                                                    dVarN = 0;
                                                }
                                                dVar.d(dVarY9);
                                            }
                                        }
                                        dVarY9 = dVarY9.O8();
                                        dVarN = dVarN;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                dVarN = androidx.compose.ui.node.k.n(dVar);
                            }
                        }
                    }
                    dVarW2 = dVarW2.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW2 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
        return a0Var;
    }

    @Nullable
    public final androidx.compose.ui.layout.i E9() {
        return (androidx.compose.ui.layout.i) I(androidx.compose.ui.layout.j.a());
    }

    @Override // androidx.compose.ui.focus.r0
    @NotNull
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public q0 c5() {
        w focusOwner;
        FocusTargetNode focusTargetNodeJ;
        androidx.compose.ui.node.i1 i1VarA0;
        if (a9() && (focusTargetNodeJ = (focusOwner = androidx.compose.ui.node.k.v(this).getFocusOwner()).j()) != null) {
            if (this == focusTargetNodeJ) {
                return focusOwner.p() ? q0.Captured : q0.Active;
            }
            if (focusTargetNodeJ.a9()) {
                int iB = m1.b(1024);
                if (!focusTargetNodeJ.w().a9()) {
                    s0.a.i("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.a0.d dVarW8 = focusTargetNodeJ.w().W8();
                androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(focusTargetNodeJ);
                while (l0VarU != null) {
                    if ((l0VarU.A0().l().N8() & iB) != 0) {
                        while (dVarW8 != null) {
                            if ((dVarW8.T8() & iB) != 0) {
                                androidx.compose.ui.a0.d dVarN = dVarW8;
                                androidx.compose.runtime.collection.d dVar = null;
                                while (dVarN != null) {
                                    if (dVarN instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) dVarN)) {
                                            return q0.ActiveParent;
                                        }
                                    } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                        int i10 = 0;
                                        for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                            if ((dVarY9.T8() & iB) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    dVarN = dVarY9;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                                    }
                                                    if (dVarN != null) {
                                                        dVar.d(dVarN);
                                                        dVarN = null;
                                                    }
                                                    dVar.d(dVarY9);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    dVarN = androidx.compose.ui.node.k.n(dVar);
                                }
                            }
                            dVarW8 = dVarW8.W8();
                        }
                    }
                    l0VarU = l0VarU.J0();
                    dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
                }
            }
            return q0.Inactive;
        }
        return q0.Inactive;
    }

    public final int G9() {
        return this.f37361p0;
    }

    public final void H9() {
        z zVar;
        int i10 = a.f37369b[c5().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                throw new kotlin.k0();
            }
            return;
        }
        i1.h hVar = new i1.h();
        r1.a(this, new b(hVar, this));
        T t10 = hVar.f312751a;
        if (t10 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
            zVar = null;
        } else {
            zVar = (z) t10;
        }
        if (zVar.P()) {
            return;
        }
        androidx.compose.ui.node.k.v(this).getFocusOwner().A(true);
    }

    public final void I9(int i10) {
        this.f37361p0 = i10;
    }

    @Override // androidx.compose.ui.focus.r0
    public boolean K4(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zL = false;
            if (!D9().P()) {
                Trace.endSection();
                return false;
            }
            int i11 = a.f37368a[u0.k(this, i10).ordinal()];
            if (i11 == 1) {
                zL = u0.l(this);
            } else if (i11 == 2) {
                zL = true;
            } else if (i11 != 3 && i11 != 4) {
                throw new kotlin.k0();
            }
            Trace.endSection();
            return zL;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.compose.ui.focus.r0
    public int X2() {
        return this.Z;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.Y;
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        H9();
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        int i10 = a.f37369b[c5().ordinal()];
        if (i10 == 1 || i10 == 2) {
            w focusOwner = androidx.compose.ui.node.k.v(this).getFocusOwner();
            focusOwner.q(true, true, false, f.f37408b.c());
            focusOwner.m();
        } else if (i10 != 3 && i10 != 4) {
            throw new kotlin.k0();
        }
        this.X = null;
    }

    @Override // androidx.compose.ui.a0.d
    public void g9() {
        if (androidx.compose.ui.k.f39207j && c5().k()) {
            androidx.compose.ui.node.k.v(this).getFocusOwner().q(true, true, true, f.f37408b.c());
        }
    }

    @Override // androidx.compose.ui.focus.r0
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the version accepting FocusDirection", replaceWith = @kotlin.b1(expression = "this.requestFocus()", imports = {}))
    public /* synthetic */ boolean k3() {
        return K4(f.f37408b.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    public final void z9(@NotNull p0 p0Var, @NotNull p0 p0Var2) {
        androidx.compose.ui.node.i1 i1VarA0;
        Function2<p0, p0, Unit> function2;
        w focusOwner = androidx.compose.ui.node.k.v(this).getFocusOwner();
        FocusTargetNode focusTargetNodeJ = focusOwner.j();
        if (!Intrinsics.areEqual(p0Var, p0Var2) && (function2 = this.f37362s) != null) {
            function2.invoke(p0Var, p0Var2);
        }
        int iB = m1.b(4096);
        int iB2 = m1.b(1024);
        androidx.compose.ui.a0.d dVarW = w();
        int i10 = iB | iB2;
        if (!w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW2 = w();
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(this);
        loop0: while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (dVarW2 != null) {
                    if ((dVarW2.T8() & i10) != 0) {
                        if (dVarW2 != dVarW && (dVarW2.T8() & iB2) != 0) {
                            break loop0;
                        }
                        if ((dVarW2.T8() & iB) != 0) {
                            androidx.compose.ui.a0.d dVarN = dVarW2;
                            androidx.compose.runtime.collection.d dVar = null;
                            while (dVarN != 0) {
                                if (dVarN instanceof j) {
                                    j jVar = (j) dVarN;
                                    if (focusTargetNodeJ == focusOwner.j()) {
                                        jVar.Z(p0Var2);
                                    }
                                } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                    androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9();
                                    int i11 = 0;
                                    dVarN = dVarN;
                                    while (dVarY9 != null) {
                                        if ((dVarY9.T8() & iB) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                dVarN = dVarY9;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                                }
                                                if (dVarN != 0) {
                                                    dVar.d(dVarN);
                                                    dVarN = 0;
                                                }
                                                dVar.d(dVarY9);
                                            }
                                        }
                                        dVarY9 = dVarY9.O8();
                                        dVarN = dVarN;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                dVarN = androidx.compose.ui.node.k.n(dVar);
                            }
                        }
                    }
                    dVarW2 = dVarW2.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW2 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
        Function1<FocusTargetNode, Unit> function1 = this.f37363t;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    public /* synthetic */ FocusTargetNode(int i10, Function2 function2, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? w0.f37469b.a() : i10, (i11 & 2) != 0 ? null : function2, (i11 & 4) != 0 ? null : function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusTargetNode(int i10, Function2<? super p0, ? super p0, Unit> function2, Function1<? super FocusTargetNode, Unit> function1) {
        this.f37362s = function2;
        this.f37363t = function1;
        this.Z = i10;
    }
}
