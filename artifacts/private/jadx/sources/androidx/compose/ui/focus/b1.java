package androidx.compose.ui.focus;

import androidx.compose.ui.node.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 10 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,430:1\n1085#2,2:431\n1085#2,2:437\n1107#2:451\n1085#2,2:452\n1107#2:528\n1085#2,2:529\n340#3:433\n516#3:434\n472#3:435\n519#3:457\n44#3:459\n519#3:515\n519#3:534\n44#3:536\n424#3,8:596\n1#4:436\n118#5:439\n118#5:516\n284#6,5:440\n149#6:445\n150#6:450\n151#6,3:454\n154#6:458\n155#6,9:460\n450#6,6:469\n460#6,2:476\n462#6,17:481\n479#6,8:501\n164#6,6:509\n284#6,5:517\n149#6:522\n150#6:527\n151#6,3:531\n154#6:535\n155#6,9:537\n450#6,6:546\n460#6,2:553\n462#6,17:558\n479#6,8:578\n164#6,6:586\n57#7,4:446\n57#7,4:523\n247#8:475\n247#8:552\n240#9,3:478\n243#9,3:498\n240#9,3:555\n243#9,3:575\n57#10:592\n57#10:593\n62#10:594\n62#10:595\n62#10:605\n57#10:606\n69#11:604\n69#11:607\n69#11:608\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n125#1:431,2\n192#1:437,2\n193#1:451\n193#1:452,2\n222#1:528\n222#1:529,2\n130#1:433\n130#1:434\n130#1:435\n193#1:457\n193#1:459\n199#1:515\n222#1:534\n222#1:536\n254#1:596,8\n193#1:439\n222#1:516\n193#1:440,5\n193#1:445\n193#1:450\n193#1:454,3\n193#1:458\n193#1:460,9\n193#1:469,6\n193#1:476,2\n193#1:481,17\n193#1:501,8\n193#1:509,6\n222#1:517,5\n222#1:522\n222#1:527\n222#1:531,3\n222#1:535\n222#1:537,9\n222#1:546,6\n222#1:553,2\n222#1:558,17\n222#1:578,8\n222#1:586,6\n193#1:446,4\n222#1:523,4\n193#1:475\n222#1:552\n193#1:478,3\n193#1:498,3\n222#1:555,3\n222#1:575,3\n246#1:592\n247#1:593\n248#1:594\n249#1:595\n313#1:605\n316#1:606\n304#1:604\n383#1:607\n398#1:608\n*E\n"})
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f37391a = "This function should only be used for 2-D focus search";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f37392b = "ActiveParent must have a focusedChild";

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37393a;

        static {
            int[] iArr = new int[q0.values().length];
            try {
                iArr[q0.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37393a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.layout.i.a, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f37394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f37395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0.j f37396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<FocusTargetNode, Boolean> f37398e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, n0.j jVar, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f37394a = focusTargetNode;
            this.f37395b = focusTargetNode2;
            this.f37396c = jVar;
            this.f37397d = i10;
            this.f37398e = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.layout.i.a aVar) {
            if (this.f37394a != androidx.compose.ui.node.k.v(this.f37395b).getFocusOwner().j()) {
                return Boolean.TRUE;
            }
            boolean zR = b1.r(this.f37395b, this.f37396c, this.f37397d, this.f37398e);
            Boolean boolValueOf = Boolean.valueOf(zR);
            if (zR || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.c5() != q0.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeB = v0.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new IllegalStateException(f37392b);
    }

    private static final boolean c(n0.j jVar, n0.j jVar2, n0.j jVar3, int i10) {
        if (d(jVar3, i10, jVar) || !d(jVar2, i10, jVar)) {
            return false;
        }
        if (!e(jVar3, i10, jVar)) {
            return true;
        }
        f.a aVar = f.f37408b;
        if (!f.l(i10, aVar.d()) && !f.l(i10, aVar.g())) {
            return f(jVar2, i10, jVar) < g(jVar3, i10, jVar);
        }
        return true;
    }

    private static final boolean d(n0.j jVar, int i10, n0.j jVar2) {
        f.a aVar = f.f37408b;
        if (!f.l(i10, aVar.d()) && !f.l(i10, aVar.g())) {
            if (f.l(i10, aVar.h()) || f.l(i10, aVar.a())) {
                return jVar.x() > jVar2.t() && jVar.t() < jVar2.x();
            }
            throw new IllegalStateException(f37391a);
        }
        return jVar.j() > jVar2.B() && jVar.B() < jVar2.j();
    }

    private static final boolean e(n0.j jVar, int i10, n0.j jVar2) {
        f.a aVar = f.f37408b;
        int i11 = 5 | 1;
        if (f.l(i10, aVar.d())) {
            return jVar2.t() >= jVar.x();
        }
        if (f.l(i10, aVar.g())) {
            return jVar2.x() <= jVar.t();
        }
        if (f.l(i10, aVar.h())) {
            return jVar2.B() >= jVar.j();
        }
        if (f.l(i10, aVar.a())) {
            return jVar2.j() <= jVar.B();
        }
        throw new IllegalStateException(f37391a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[RETURN] */
    private static final float f(n0.j jVar, int i10, n0.j jVar2) {
        float fB;
        float fJ;
        float fB2;
        float fJ2;
        float f10;
        f.a aVar = f.f37408b;
        if (!f.l(i10, aVar.d())) {
            if (f.l(i10, aVar.g())) {
                fB = jVar.t();
                fJ = jVar2.x();
            } else if (f.l(i10, aVar.h())) {
                fB2 = jVar2.B();
                fJ2 = jVar.j();
            } else {
                if (!f.l(i10, aVar.a())) {
                    throw new IllegalStateException(f37391a);
                }
                fB = jVar.B();
                fJ = jVar2.j();
            }
            f10 = fB - fJ;
            if (f10 < 0.0f) {
                return 0.0f;
            }
            return f10;
        }
        fB2 = jVar2.t();
        fJ2 = jVar.x();
        f10 = fB2 - fJ2;
        if (f10 < 0.0f) {
            return 0.0f;
        }
        return f10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[RETURN] */
    private static final float g(n0.j jVar, int i10, n0.j jVar2) {
        float fJ;
        float fJ2;
        float fB;
        float fB2;
        float f10;
        f.a aVar = f.f37408b;
        if (!f.l(i10, aVar.d())) {
            if (f.l(i10, aVar.g())) {
                fJ = jVar.x();
                fJ2 = jVar2.x();
            } else if (f.l(i10, aVar.h())) {
                fB = jVar2.B();
                fB2 = jVar.B();
            } else {
                if (!f.l(i10, aVar.a())) {
                    throw new IllegalStateException(f37391a);
                }
                fJ = jVar.j();
                fJ2 = jVar2.j();
            }
            f10 = fJ - fJ2;
            if (f10 < 1.0f) {
                return 1.0f;
            }
            return f10;
        }
        fB = jVar2.t();
        fB2 = jVar.t();
        f10 = fB - fB2;
        if (f10 < 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    private static final n0.j h(n0.j jVar) {
        return new n0.j(jVar.x(), jVar.j(), jVar.x(), jVar.j());
    }

    private static final void i(androidx.compose.ui.node.j jVar, androidx.compose.runtime.collection.d<FocusTargetNode> dVar) {
        int iB = m1.b(1024);
        if (!jVar.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar2, jVar.w(), false);
        } else {
            dVar2.d(dVarO8);
        }
        while (dVar2.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar2.r0(dVar2.R() - 1);
            if ((dVarN.N8() & iB) == 0) {
                androidx.compose.ui.node.k.c(dVar2, dVarN, false);
            } else {
                while (dVarN != null) {
                    if ((dVarN.T8() & iB) != 0) {
                        androidx.compose.runtime.collection.d dVar3 = null;
                        while (dVarN != null) {
                            if (dVarN instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) dVarN;
                                if (focusTargetNode.a9() && !androidx.compose.ui.node.k.u(focusTargetNode).M()) {
                                    if (focusTargetNode.D9().P()) {
                                        dVar.d(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, dVar);
                                    }
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i10 = 0;
                                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar3.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar3.d(dVarY9);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar3);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
    }

    private static final FocusTargetNode j(androidx.compose.runtime.collection.d<FocusTargetNode> dVar, n0.j jVar, int i10) {
        n0.j jVarS;
        f.a aVar = f.f37408b;
        if (f.l(i10, aVar.d())) {
            jVarS = jVar.S((jVar.x() - jVar.t()) + 1, 0.0f);
        } else if (f.l(i10, aVar.g())) {
            jVarS = jVar.S(-((jVar.x() - jVar.t()) + 1), 0.0f);
        } else if (f.l(i10, aVar.h())) {
            jVarS = jVar.S(0.0f, (jVar.j() - jVar.B()) + 1);
        } else {
            if (!f.l(i10, aVar.a())) {
                throw new IllegalStateException(f37391a);
            }
            jVarS = jVar.S(0.0f, -((jVar.j() - jVar.B()) + 1));
        }
        FocusTargetNode[] focusTargetNodeArr = dVar.f35552a;
        int iR = dVar.R();
        FocusTargetNode focusTargetNode = null;
        for (int i11 = 0; i11 < iR; i11++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i11];
            if (v0.g(focusTargetNode2)) {
                n0.j jVarD = v0.d(focusTargetNode2);
                if (m(jVarD, jVarS, jVar, i10)) {
                    focusTargetNode = focusTargetNode2;
                    jVarS = jVarD;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean k(@NotNull FocusTargetNode focusTargetNode, int i10, @NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        n0.j jVarS;
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new FocusTargetNode[16], 0);
        i(focusTargetNode, dVar);
        if (dVar.R() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (dVar.R() == 0 ? null : dVar.f35552a[0]);
            if (focusTargetNode2 != null) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        f.a aVar = f.f37408b;
        if (f.l(i10, aVar.b())) {
            i10 = aVar.g();
        }
        if (f.l(i10, aVar.g()) || f.l(i10, aVar.a())) {
            jVarS = s(v0.d(focusTargetNode));
        } else {
            if (!f.l(i10, aVar.d()) && !f.l(i10, aVar.h())) {
                throw new IllegalStateException(f37391a);
            }
            jVarS = h(v0.d(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeJ = j(dVar, jVarS, i10);
        if (focusTargetNodeJ != null) {
            return function1.invoke(focusTargetNodeJ).booleanValue();
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, n0.j jVar, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        if (r(focusTargetNode, jVar, i10, function1)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().j(), focusTargetNode, jVar, i10, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(@NotNull n0.j jVar, @NotNull n0.j jVar2, @NotNull n0.j jVar3, int i10) {
        if (!n(jVar, i10, jVar3)) {
            return false;
        }
        if (n(jVar2, i10, jVar3) && !c(jVar3, jVar, jVar2, i10)) {
            return !c(jVar3, jVar2, jVar, i10) && q(i10, jVar3, jVar) < q(i10, jVar3, jVar2);
        }
        return true;
    }

    private static final boolean n(n0.j jVar, int i10, n0.j jVar2) {
        f.a aVar = f.f37408b;
        int i11 = 2 | 1;
        if (f.l(i10, aVar.d())) {
            return (jVar2.x() > jVar.x() || jVar2.t() >= jVar.x()) && jVar2.t() > jVar.t();
        }
        if (f.l(i10, aVar.g())) {
            return (jVar2.t() < jVar.t() || jVar2.x() <= jVar.t()) && jVar2.x() < jVar.x();
        }
        if (f.l(i10, aVar.h())) {
            return (jVar2.j() > jVar.j() || jVar2.B() >= jVar.j()) && jVar2.B() > jVar.B();
        }
        if (f.l(i10, aVar.a())) {
            return (jVar2.B() < jVar.B() || jVar2.j() <= jVar.B()) && jVar2.j() < jVar.j();
        }
        throw new IllegalStateException(f37391a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062 A[RETURN] */
    private static final float o(n0.j jVar, int i10, n0.j jVar2) {
        float fB;
        float fJ;
        float fB2;
        float fJ2;
        float f10;
        f.a aVar = f.f37408b;
        if (!f.l(i10, aVar.d())) {
            if (f.l(i10, aVar.g())) {
                fB = jVar.t();
                fJ = jVar2.x();
            } else if (f.l(i10, aVar.h())) {
                fB2 = jVar2.B();
                fJ2 = jVar.j();
            } else {
                if (!f.l(i10, aVar.a())) {
                    throw new IllegalStateException(f37391a);
                }
                fB = jVar.B();
                fJ = jVar2.j();
            }
            f10 = fB - fJ;
            if (f10 < 0.0f) {
                return 0.0f;
            }
            return f10;
        }
        fB2 = jVar2.t();
        fJ2 = jVar.x();
        f10 = fB2 - fJ2;
        if (f10 < 0.0f) {
            return 0.0f;
        }
        return f10;
    }

    private static final float p(n0.j jVar, int i10, n0.j jVar2) {
        float f10;
        float f11;
        float fB;
        float fJ;
        float fB2;
        f.a aVar = f.f37408b;
        if (f.l(i10, aVar.d()) || f.l(i10, aVar.g())) {
            float fB3 = jVar2.B();
            float fJ2 = jVar2.j() - jVar2.B();
            f10 = 2;
            f11 = fB3 + (fJ2 / f10);
            fB = jVar.B();
            fJ = jVar.j();
            fB2 = jVar.B();
        } else {
            if (!f.l(i10, aVar.h()) && !f.l(i10, aVar.a())) {
                throw new IllegalStateException(f37391a);
            }
            float fT = jVar2.t();
            float fX = jVar2.x() - jVar2.t();
            f10 = 2;
            f11 = fT + (fX / f10);
            fB = jVar.t();
            fJ = jVar.x();
            fB2 = jVar.t();
        }
        return f11 - (fB + ((fJ - fB2) / f10));
    }

    private static final long q(int i10, n0.j jVar, n0.j jVar2) {
        long jO = (long) o(jVar2, i10, jVar);
        long jP = (long) p(jVar2, i10, jVar);
        return (((long) 13) * jO * jO) + (jP * jP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, n0.j jVar, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode focusTargetNodeJ;
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new FocusTargetNode[16], 0);
        int iB = m1.b(1024);
        if (!focusTargetNode.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = focusTargetNode.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar2, focusTargetNode.w(), false);
        } else {
            dVar2.d(dVarO8);
        }
        while (dVar2.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar2.r0(dVar2.R() - 1);
            if ((dVarN.N8() & iB) == 0) {
                androidx.compose.ui.node.k.c(dVar2, dVarN, false);
            } else {
                while (dVarN != null) {
                    if ((dVarN.T8() & iB) != 0) {
                        androidx.compose.runtime.collection.d dVar3 = null;
                        while (dVarN != null) {
                            if (dVarN instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarN;
                                if (focusTargetNode2.a9()) {
                                    dVar.d(focusTargetNode2);
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar3.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar3.d(dVarY9);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar3);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
        while (dVar.R() != 0 && (focusTargetNodeJ = j(dVar, jVar, i10)) != null) {
            if (focusTargetNodeJ.D9().P()) {
                return function1.invoke(focusTargetNodeJ).booleanValue();
            }
            if (l(focusTargetNodeJ, jVar, i10, function1)) {
                return true;
            }
            dVar.n0(focusTargetNodeJ);
        }
        return false;
    }

    private static final n0.j s(n0.j jVar) {
        return new n0.j(jVar.t(), jVar.B(), jVar.t(), jVar.B());
    }

    @Nullable
    public static final Boolean t(@NotNull FocusTargetNode focusTargetNode, int i10, @Nullable n0.j jVar, @NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        q0 q0VarC5 = focusTargetNode.c5();
        int[] iArr = a.f37393a;
        int i11 = iArr[q0VarC5.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i10, function1));
            }
            if (i11 != 4) {
                throw new kotlin.k0();
            }
            if (focusTargetNode.D9().P()) {
                return function1.invoke(focusTargetNode);
            }
            return jVar == null ? Boolean.valueOf(k(focusTargetNode, i10, function1)) : Boolean.valueOf(r(focusTargetNode, jVar, i10, function1));
        }
        FocusTargetNode focusTargetNodeF = v0.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException(f37392b);
        }
        int i12 = iArr[focusTargetNodeF.c5().ordinal()];
        if (i12 == 1) {
            Boolean boolT = t(focusTargetNodeF, i10, jVar, function1);
            if (!Intrinsics.areEqual(boolT, Boolean.FALSE)) {
                return boolT;
            }
            if (jVar == null) {
                jVar = v0.d(b(focusTargetNodeF));
            }
            return Boolean.valueOf(l(focusTargetNode, jVar, i10, function1));
        }
        if (i12 == 2 || i12 == 3) {
            if (jVar == null) {
                jVar = v0.d(focusTargetNodeF);
            }
            return Boolean.valueOf(l(focusTargetNode, jVar, i10, function1));
        }
        if (i12 != 4) {
            throw new kotlin.k0();
        }
        throw new IllegalStateException(f37392b);
    }
}
