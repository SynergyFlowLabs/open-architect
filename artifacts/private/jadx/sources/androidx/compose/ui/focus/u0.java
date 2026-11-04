package androidx.compose.ui.focus;

import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,324:1\n1107#2:325\n1085#2,2:326\n1107#2:367\n1085#2,2:368\n1107#2:397\n1085#2,2:398\n1107#2:439\n1085#2,2:440\n1107#2:527\n1085#2,2:528\n118#3:328\n118#3:400\n118#3:486\n248#4,5:329\n91#4:334\n92#4,8:339\n450#4,6:347\n460#4,2:354\n462#4,8:359\n470#4,9:370\n479#4,8:382\n101#4,7:390\n248#4,5:401\n91#4:406\n92#4,8:411\n450#4,6:419\n460#4,2:426\n462#4,8:431\n470#4,9:442\n479#4,8:454\n101#4,7:462\n278#4:487\n248#4,5:488\n91#4:493\n92#4,8:498\n450#4,5:506\n279#4:511\n455#4:512\n460#4,2:514\n462#4,8:519\n470#4,9:530\n479#4,8:542\n101#4,7:550\n281#4:557\n57#5,4:335\n57#5,4:407\n57#5,4:494\n247#6:353\n247#6:425\n247#6:513\n240#7,3:356\n243#7,3:379\n240#7,3:428\n243#7,3:451\n240#7,3:516\n243#7,3:539\n448#8,8:469\n448#8,8:477\n1#9:485\n221#10,4:558\n194#10,8:562\n226#10:570\n202#10,4:571\n227#10,3:575\n245#10,4:578\n194#10,8:582\n250#10:590\n202#10,4:591\n251#10,3:595\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n67#1:325\n67#1:326,2\n68#1:367\n68#1:368,2\n75#1:397\n75#1:398,2\n76#1:439\n76#1:440,2\n280#1:527\n280#1:528,2\n68#1:328\n76#1:400\n280#1:486\n68#1:329,5\n68#1:334\n68#1:339,8\n68#1:347,6\n68#1:354,2\n68#1:359,8\n68#1:370,9\n68#1:382,8\n68#1:390,7\n76#1:401,5\n76#1:406\n76#1:411,8\n76#1:419,6\n76#1:426,2\n76#1:431,8\n76#1:442,9\n76#1:454,8\n76#1:462,7\n280#1:487\n280#1:488,5\n280#1:493\n280#1:498,8\n280#1:506,5\n280#1:511\n280#1:512\n280#1:514,2\n280#1:519,8\n280#1:530,9\n280#1:542,8\n280#1:550,7\n280#1:557\n68#1:335,4\n76#1:407,4\n280#1:494,4\n68#1:353\n76#1:425\n280#1:513\n68#1:356,3\n68#1:379,3\n76#1:428,3\n76#1:451,3\n280#1:516,3\n280#1:539,3\n94#1:469,8\n105#1:477,8\n308#1:558,4\n308#1:562,8\n308#1:570\n308#1:571,4\n308#1:575,3\n318#1:578,4\n318#1:582,8\n318#1:590\n318#1:591,4\n318#1:595,3\n*E\n"})
public final class u0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37460a;

        static {
            int[] iArr = new int[q0.values().length];
            try {
                iArr[q0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37460a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f37461a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f37461a = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f37461a.D9();
        }
    }

    public static final boolean a(@NotNull FocusTargetNode focusTargetNode) {
        int i10 = a.f37460a[focusTargetNode.c5().ordinal()];
        if (i10 == 1) {
            androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().f(true);
            focusTargetNode.z9(q0.Active, q0.Captured);
            return true;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 != 3 && i10 != 4) {
            throw new kotlin.k0();
        }
        return false;
    }

    private static final boolean b(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        FocusTargetNode focusTargetNodeF = v0.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return d(focusTargetNodeF, z10, z11);
        }
        return true;
    }

    static /* synthetic */ boolean c(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(focusTargetNode, z10, z11);
    }

    public static final boolean d(@NotNull FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        int i10 = a.f37460a[focusTargetNode.c5().ordinal()];
        if (i10 == 1) {
            androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().r(null);
            if (z11) {
                focusTargetNode.z9(q0.Active, q0.Inactive);
            }
            return true;
        }
        if (i10 == 2) {
            if (z10) {
                androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().r(null);
                if (z11) {
                    focusTargetNode.z9(q0.Captured, q0.Inactive);
                }
            }
            return z10;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return true;
            }
            throw new kotlin.k0();
        }
        if (!b(focusTargetNode, z10, z11)) {
            return false;
        }
        if (z11) {
            focusTargetNode.z9(q0.ActiveParent, q0.Inactive);
        }
        return true;
    }

    public static /* synthetic */ boolean e(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return d(focusTargetNode, z10, z11);
    }

    public static final boolean f(@NotNull FocusTargetNode focusTargetNode) {
        int i10 = a.f37460a[focusTargetNode.c5().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4) {
                    return false;
                }
                throw new kotlin.k0();
            }
            androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().f(false);
            focusTargetNode.z9(q0.Captured, q0.Active);
        }
        return true;
    }

    private static final boolean g(FocusTargetNode focusTargetNode) {
        r1.a(focusTargetNode, new b(focusTargetNode));
        int i10 = a.f37460a[focusTargetNode.c5().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                throw new kotlin.k0();
            }
            androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().r(focusTargetNode);
        }
        return true;
    }

    @NotNull
    public static final c h(@NotNull FocusTargetNode focusTargetNode, int i10) {
        int i11 = a.f37460a[focusTargetNode.c5().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return c.Cancelled;
            }
            if (i11 == 3) {
                c cVarH = h(o(focusTargetNode), i10);
                if (cVarH == c.None) {
                    cVarH = null;
                }
                return cVarH == null ? j(focusTargetNode, i10) : cVarH;
            }
            if (i11 != 4) {
                throw new kotlin.k0();
            }
        }
        return c.None;
    }

    private static final c i(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f37365w) {
            focusTargetNode.f37365w = true;
            try {
                z zVarD9 = focusTargetNode.D9();
                androidx.compose.ui.focus.b bVar = new androidx.compose.ui.focus.b(i10, null);
                w focusOwner = androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeJ = focusOwner.j();
                zVarD9.Q().invoke(bVar);
                FocusTargetNode focusTargetNodeJ2 = focusOwner.j();
                if (bVar.d()) {
                    g0.a aVar = g0.f37418b;
                    g0 g0VarB = aVar.b();
                    if (g0VarB == aVar.b()) {
                        c cVar = c.Cancelled;
                        focusTargetNode.f37365w = false;
                        return cVar;
                    }
                    if (g0VarB == aVar.d()) {
                        c cVar2 = c.Redirected;
                        focusTargetNode.f37365w = false;
                        return cVar2;
                    }
                    c cVar3 = g0.k(g0VarB, 0, 1, null) ? c.Redirected : c.RedirectCancelled;
                    focusTargetNode.f37365w = false;
                    return cVar3;
                }
                if (focusTargetNodeJ != focusTargetNodeJ2 && focusTargetNodeJ2 != null) {
                    g0.a aVar2 = g0.f37418b;
                    g0 g0VarD = aVar2.d();
                    if (g0VarD == aVar2.b()) {
                        c cVar4 = c.Cancelled;
                        focusTargetNode.f37365w = false;
                        return cVar4;
                    }
                    if (g0VarD == aVar2.d()) {
                        c cVar5 = c.Redirected;
                        focusTargetNode.f37365w = false;
                        return cVar5;
                    }
                    c cVar6 = g0.k(g0VarD, 0, 1, null) ? c.Redirected : c.RedirectCancelled;
                    focusTargetNode.f37365w = false;
                    return cVar6;
                }
                focusTargetNode.f37365w = false;
            } catch (Throwable th2) {
                focusTargetNode.f37365w = false;
                throw th2;
            }
        }
        return c.None;
    }

    private static final c j(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f37364v) {
            focusTargetNode.f37364v = true;
            try {
                z zVarD9 = focusTargetNode.D9();
                androidx.compose.ui.focus.b bVar = new androidx.compose.ui.focus.b(i10, null);
                w focusOwner = androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeJ = focusOwner.j();
                zVarD9.R().invoke(bVar);
                FocusTargetNode focusTargetNodeJ2 = focusOwner.j();
                if (bVar.d()) {
                    g0.a aVar = g0.f37418b;
                    g0 g0VarB = aVar.b();
                    if (g0VarB == aVar.b()) {
                        c cVar = c.Cancelled;
                        focusTargetNode.f37364v = false;
                        return cVar;
                    }
                    if (g0VarB == aVar.d()) {
                        c cVar2 = c.Redirected;
                        focusTargetNode.f37364v = false;
                        return cVar2;
                    }
                    c cVar3 = g0.k(g0VarB, 0, 1, null) ? c.Redirected : c.RedirectCancelled;
                    focusTargetNode.f37364v = false;
                    return cVar3;
                }
                if (focusTargetNodeJ != focusTargetNodeJ2 && focusTargetNodeJ2 != null) {
                    g0.a aVar2 = g0.f37418b;
                    g0 g0VarD = aVar2.d();
                    if (g0VarD == aVar2.b()) {
                        c cVar4 = c.Cancelled;
                        focusTargetNode.f37364v = false;
                        return cVar4;
                    }
                    if (g0VarD == aVar2.d()) {
                        c cVar5 = c.Redirected;
                        focusTargetNode.f37364v = false;
                        return cVar5;
                    }
                    c cVar6 = g0.k(g0VarD, 0, 1, null) ? c.Redirected : c.RedirectCancelled;
                    focusTargetNode.f37364v = false;
                    return cVar6;
                }
                focusTargetNode.f37364v = false;
            } catch (Throwable th2) {
                focusTargetNode.f37364v = false;
                throw th2;
            }
        }
        return c.None;
    }

    @NotNull
    public static final c k(@NotNull FocusTargetNode focusTargetNode, int i10) {
        androidx.compose.ui.a0.d dVarN;
        i1 i1VarA0;
        int i11 = a.f37460a[focusTargetNode.c5().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return c.None;
        }
        if (i11 == 3) {
            return h(o(focusTargetNode), i10);
        }
        if (i11 != 4) {
            throw new kotlin.k0();
        }
        int iB = m1.b(1024);
        if (!focusTargetNode.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = focusTargetNode.w().W8();
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(focusTargetNode);
        loop0: while (true) {
            if (l0VarU == null) {
                dVarN = null;
                break;
            }
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        dVarN = dVarW8;
                        androidx.compose.runtime.collection.d dVar = null;
                        while (dVarN != null) {
                            if (dVarN instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i12 = 0;
                                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarN;
        if (focusTargetNode2 == null) {
            return c.None;
        }
        int i13 = a.f37460a[focusTargetNode2.c5().ordinal()];
        if (i13 == 1) {
            return i(focusTargetNode2, i10);
        }
        if (i13 == 2) {
            return c.Cancelled;
        }
        if (i13 == 3) {
            return k(focusTargetNode2, i10);
        }
        if (i13 != 4) {
            throw new kotlin.k0();
        }
        c cVarK = k(focusTargetNode2, i10);
        c cVar = cVarK != c.None ? cVarK : null;
        return cVar == null ? i(focusTargetNode2, i10) : cVar;
    }

    public static final boolean l(@NotNull FocusTargetNode focusTargetNode) {
        androidx.compose.runtime.collection.d dVar;
        int i10;
        i1 i1VarA0;
        i1 i1VarA1;
        w focusOwner = androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeJ = focusOwner.j();
        q0 q0VarC5 = focusTargetNode.c5();
        int i11 = 1;
        if (focusTargetNodeJ == focusTargetNode) {
            focusTargetNode.z9(q0VarC5, q0VarC5);
            return true;
        }
        androidx.compose.runtime.collection.d dVar2 = null;
        int i12 = 0;
        if (focusTargetNodeJ == null && !n(focusTargetNode, null, null, 3, null)) {
            return false;
        }
        int i13 = 1024;
        int i14 = 16;
        if (focusTargetNodeJ != null) {
            dVar = new androidx.compose.runtime.collection.d(new FocusTargetNode[16], 0);
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
                            androidx.compose.runtime.collection.d dVar3 = dVar2;
                            androidx.compose.ui.a0.d dVarN = dVarW8;
                            while (dVarN != null) {
                                i13 = i13;
                                if (dVarN instanceof FocusTargetNode) {
                                    dVar.d((FocusTargetNode) dVarN);
                                } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                    androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9();
                                    int i15 = 0;
                                    while (dVarY9 != null) {
                                        if ((dVarY9.T8() & iB) != 0) {
                                            i15++;
                                            if (i15 == i11) {
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
                                        dVarY9 = dVarY9.O8();
                                        i11 = 1;
                                    }
                                    if (i15 == i11) {
                                    }
                                }
                                dVarN = androidx.compose.ui.node.k.n(dVar3);
                                i11 = 1;
                            }
                        }
                        dVarW8 = dVarW8.W8();
                        i13 = i13;
                        i11 = 1;
                        dVar2 = null;
                    }
                }
                int i16 = i13;
                l0VarU = l0VarU.J0();
                dVarW8 = (l0VarU == null || (i1VarA1 = l0VarU.A0()) == null) ? null : i1VarA1.q();
                i13 = i16;
                i11 = 1;
                dVar2 = null;
            }
        } else {
            dVar = null;
        }
        int i17 = i13;
        androidx.compose.runtime.collection.d dVar4 = new androidx.compose.runtime.collection.d(new FocusTargetNode[16], 0);
        int iB2 = m1.b(i17);
        if (!focusTargetNode.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW9 = focusTargetNode.w().W8();
        androidx.compose.ui.node.l0 l0VarU2 = androidx.compose.ui.node.k.u(focusTargetNode);
        int i18 = 1;
        while (l0VarU2 != null) {
            if ((l0VarU2.A0().l().N8() & iB2) != 0) {
                while (dVarW9 != null) {
                    if ((dVarW9.T8() & iB2) != 0) {
                        androidx.compose.ui.a0.d dVarN2 = dVarW9;
                        androidx.compose.runtime.collection.d dVar5 = null;
                        while (dVarN2 != null) {
                            if (dVarN2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarN2;
                                Boolean boolValueOf = dVar != null ? Boolean.valueOf(dVar.n0(focusTargetNode2)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    dVar4.d(focusTargetNode2);
                                }
                                if (focusTargetNode2 == focusTargetNodeJ) {
                                    i18 = i12;
                                }
                            } else {
                                if ((dVarN2.T8() & iB2) != 0 && (dVarN2 instanceof androidx.compose.ui.node.m)) {
                                    androidx.compose.ui.a0.d dVarY10 = ((androidx.compose.ui.node.m) dVarN2).y9();
                                    int i19 = i12;
                                    while (dVarY10 != null) {
                                        if ((dVarY10.T8() & iB2) != 0) {
                                            i19++;
                                            if (i19 == 1) {
                                                dVarN2 = dVarY10;
                                            } else {
                                                if (dVar5 == null) {
                                                    dVar5 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[i14], 0);
                                                }
                                                if (dVarN2 != null) {
                                                    dVar5.d(dVarN2);
                                                    dVarN2 = null;
                                                }
                                                dVar5.d(dVarY10);
                                            }
                                        }
                                        dVarY10 = dVarY10.O8();
                                        i14 = 16;
                                    }
                                    if (i19 == 1) {
                                    }
                                }
                                i12 = 0;
                                i14 = 16;
                            }
                            dVarN2 = androidx.compose.ui.node.k.n(dVar5);
                            i12 = 0;
                            i14 = 16;
                        }
                    }
                    dVarW9 = dVarW9.W8();
                    i12 = 0;
                    i14 = 16;
                }
            }
            l0VarU2 = l0VarU2.J0();
            dVarW9 = (l0VarU2 == null || (i1VarA0 = l0VarU2.A0()) == null) ? null : i1VarA0.q();
            i12 = 0;
            i14 = 16;
        }
        if (i18 == 0 || focusTargetNodeJ == null) {
            i10 = 1;
        } else {
            i10 = 1;
            if (!e(focusTargetNodeJ, false, true, 1, null)) {
                return false;
            }
        }
        g(focusTargetNode);
        if (dVar != null) {
            int iR = dVar.R() - i10;
            Object[] objArr = dVar.f35552a;
            if (iR < objArr.length) {
                while (iR >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[iR];
                    if (focusOwner.j() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.z9(q0.ActiveParent, q0.Inactive);
                    iR--;
                }
            }
        }
        int iR2 = dVar4.R() - 1;
        Object[] objArr2 = dVar4.f35552a;
        if (iR2 < objArr2.length) {
            while (iR2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[iR2];
                if (focusOwner.j() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.z9(focusTargetNode4 == focusTargetNodeJ ? q0.Active : q0.Inactive, q0.ActiveParent);
                iR2--;
            }
        }
        if (focusOwner.j() != focusTargetNode) {
            return false;
        }
        focusTargetNode.z9(q0VarC5, q0.Active);
        if (focusOwner.j() != focusTargetNode) {
            return false;
        }
        if (!androidx.compose.ui.k.f39201d || androidx.compose.ui.node.k.u(focusTargetNode).k() != null) {
            return true;
        }
        m(focusTargetNode, f.i(f.f37408b.e()), null);
        return true;
    }

    private static final boolean m(FocusTargetNode focusTargetNode, f fVar, n0.j jVar) {
        return androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().b(fVar, jVar);
    }

    static /* synthetic */ boolean n(FocusTargetNode focusTargetNode, f fVar, n0.j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = null;
        }
        if ((i10 & 2) != 0) {
            jVar = null;
        }
        return m(focusTargetNode, fVar, jVar);
    }

    private static final FocusTargetNode o(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = v0.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
