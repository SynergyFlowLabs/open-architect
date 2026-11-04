package androidx.compose.ui.focus;

import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.m1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,272:1\n194#1,2:350\n196#1,2:353\n199#1,5:356\n209#1,2:361\n211#1,2:364\n214#1,5:367\n1085#2,2:273\n1107#2:288\n1085#2,2:372\n1107#2:386\n1085#2,2:454\n1107#2:468\n1107#2:579\n1085#2,2:580\n1#3:275\n118#4:276\n118#4:374\n118#4:456\n118#4:538\n284#5,5:277\n149#5:282\n150#5:287\n151#5,3:289\n154#5:293\n155#5,9:295\n450#5,6:304\n460#5,2:311\n462#5,17:316\n479#5,8:336\n164#5,6:344\n284#5,5:375\n149#5:380\n150#5:385\n151#5,3:387\n154#5:391\n155#5,9:393\n450#5,6:402\n460#5,2:409\n462#5,17:414\n479#5,8:434\n164#5,6:442\n284#5,5:457\n149#5:462\n150#5:467\n151#5,3:469\n154#5:473\n155#5,9:475\n450#5,6:484\n460#5,2:491\n462#5,17:496\n479#5,8:516\n164#5,6:524\n278#5:539\n248#5,5:540\n91#5:545\n92#5,8:550\n450#5,5:558\n279#5:563\n455#5:564\n460#5,2:566\n462#5,8:571\n470#5,9:582\n479#5,8:594\n101#5,7:602\n281#5:609\n57#6,4:283\n57#6,4:381\n57#6,4:463\n57#6,4:546\n519#7:292\n44#7:294\n48#7:352\n472#7:355\n48#7:363\n472#7:366\n519#7:390\n44#7:392\n195#7,6:448\n519#7:472\n44#7:474\n448#7,8:530\n48#7:610\n472#7:611\n472#7:612\n48#7:613\n472#7:614\n472#7:615\n247#8:310\n247#8:408\n247#8:490\n247#8:565\n240#9,3:313\n243#9,3:333\n240#9,3:411\n243#9,3:431\n240#9,3:493\n243#9,3:513\n240#9,3:568\n243#9,3:591\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n145#1:350,2\n145#1:353,2\n145#1:356,5\n149#1:361,2\n149#1:364,2\n149#1:367,5\n141#1:273,2\n141#1:288\n169#1:372,2\n169#1:386\n178#1:454,2\n178#1:468\n188#1:579\n188#1:580,2\n141#1:276\n169#1:374\n178#1:456\n188#1:538\n141#1:277,5\n141#1:282\n141#1:287\n141#1:289,3\n141#1:293\n141#1:295,9\n141#1:304,6\n141#1:311,2\n141#1:316,17\n141#1:336,8\n141#1:344,6\n169#1:375,5\n169#1:380\n169#1:385\n169#1:387,3\n169#1:391\n169#1:393,9\n169#1:402,6\n169#1:409,2\n169#1:414,17\n169#1:434,8\n169#1:442,6\n178#1:457,5\n178#1:462\n178#1:467\n178#1:469,3\n178#1:473\n178#1:475,9\n178#1:484,6\n178#1:491,2\n178#1:496,17\n178#1:516,8\n178#1:524,6\n188#1:539\n188#1:540,5\n188#1:545\n188#1:550,8\n188#1:558,5\n188#1:563\n188#1:564\n188#1:566,2\n188#1:571,8\n188#1:582,9\n188#1:594,8\n188#1:602,7\n188#1:609\n141#1:283,4\n169#1:381,4\n178#1:463,4\n188#1:546,4\n141#1:292\n141#1:294\n145#1:352\n145#1:355\n149#1:363\n149#1:366\n169#1:390\n169#1:392\n171#1:448,6\n178#1:472\n178#1:474\n180#1:530,8\n195#1:610\n197#1:611\n199#1:612\n210#1:613\n212#1:614\n214#1:615\n141#1:310\n169#1:408\n178#1:490\n188#1:565\n141#1:313,3\n141#1:333,3\n169#1:411,3\n169#1:431,3\n178#1:493,3\n178#1:513,3\n188#1:568,3\n188#1:591,3\n*E\n"})
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f37481a = "This function should only be used for 1-D focus search";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f37482b = "ActiveParent must have a focusedChild";

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37483a;

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
            f37483a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.layout.i.a, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f37484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f37485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f37486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<FocusTargetNode, Boolean> f37488e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f37484a = focusTargetNode;
            this.f37485b = focusTargetNode2;
            this.f37486c = focusTargetNode3;
            this.f37487d = i10;
            this.f37488e = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.layout.i.a aVar) {
            if (this.f37484a != androidx.compose.ui.node.k.v(this.f37485b).getFocusOwner().j()) {
                return Boolean.TRUE;
            }
            boolean zM = z0.m(this.f37485b, this.f37486c, this.f37487d, this.f37488e);
            Boolean boolValueOf = Boolean.valueOf(zM);
            if (zM || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        q0 q0VarC5 = focusTargetNode.c5();
        int[] iArr = a.f37483a;
        int i10 = iArr[q0VarC5.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return k(focusTargetNode, function1);
            }
            if (i10 != 4) {
                throw new kotlin.k0();
            }
            if (!k(focusTargetNode, function1)) {
                if (!(focusTargetNode.D9().P() ? function1.invoke(focusTargetNode).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode focusTargetNodeF = v0.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException(f37482b);
        }
        int i11 = iArr[focusTargetNodeF.c5().ordinal()];
        if (i11 == 1) {
            return b(focusTargetNodeF, function1) || f(focusTargetNode, focusTargetNodeF, f.f37408b.f(), function1) || (focusTargetNodeF.D9().P() && function1.invoke(focusTargetNodeF).booleanValue());
        }
        if (i11 == 2 || i11 == 3) {
            return f(focusTargetNode, focusTargetNodeF, f.f37408b.f(), function1);
        }
        if (i11 != 4) {
            throw new kotlin.k0();
        }
        throw new IllegalStateException(f37482b);
    }

    private static final <T> void c(androidx.compose.runtime.collection.d<T> dVar, T t10, Function1<? super T, Unit> function1) {
        boolean z10 = false;
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, dVar.R());
        int iL = intRangeW1.l();
        int iM = intRangeW1.m();
        if (iL > iM) {
            return;
        }
        while (true) {
            if (z10) {
                function1.invoke(dVar.f35552a[iL]);
            }
            if (Intrinsics.areEqual(dVar.f35552a[iL], t10)) {
                z10 = true;
            }
            if (iL == iM) {
                return;
            } else {
                iL++;
            }
        }
    }

    private static final <T> void d(androidx.compose.runtime.collection.d<T> dVar, T t10, Function1<? super T, Unit> function1) {
        boolean z10 = false;
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, dVar.R());
        int iL = intRangeW1.l();
        int iM = intRangeW1.m();
        if (iL > iM) {
            return;
        }
        while (true) {
            if (z10) {
                function1.invoke(dVar.f35552a[iM]);
            }
            if (Intrinsics.areEqual(dVar.f35552a[iM], t10)) {
                z10 = true;
            }
            if (iM == iL) {
                return;
            } else {
                iM--;
            }
        }
    }

    private static final boolean e(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        int i10 = a.f37483a[focusTargetNode.c5().ordinal()];
        if (i10 == 1) {
            FocusTargetNode focusTargetNodeF = v0.f(focusTargetNode);
            if (focusTargetNodeF != null) {
                return e(focusTargetNodeF, function1) || f(focusTargetNode, focusTargetNodeF, f.f37408b.e(), function1);
            }
            throw new IllegalStateException(f37482b);
        }
        if (i10 == 2 || i10 == 3) {
            return l(focusTargetNode, function1);
        }
        if (i10 == 4) {
            return focusTargetNode.D9().P() ? function1.invoke(focusTargetNode).booleanValue() : l(focusTargetNode, function1);
        }
        throw new kotlin.k0();
    }

    private static final boolean f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        if (m(focusTargetNode, focusTargetNode2, i10, function1)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().j(), focusTargetNode, focusTargetNode2, i10, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static /* synthetic */ void g() {
    }

    private static /* synthetic */ void h() {
    }

    private static final boolean i(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.a0.d dVar;
        i1 i1VarA0;
        int iB = m1.b(1024);
        if (!focusTargetNode.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = focusTargetNode.w().W8();
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(focusTargetNode);
        loop0: while (true) {
            dVar = null;
            if (l0VarU == null) {
                break;
            }
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        androidx.compose.ui.a0.d dVarN = dVarW8;
                        androidx.compose.runtime.collection.d dVar2 = null;
                        while (dVarN != null) {
                            if (dVarN instanceof FocusTargetNode) {
                                dVar = dVarN;
                                break loop0;
                            }
                            if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i10 = 0;
                                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar2.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar2.d(dVarY9);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar2);
                        }
                    }
                    dVarW8 = dVarW8.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
        return dVar == null;
    }

    public static final boolean j(@NotNull FocusTargetNode focusTargetNode, int i10, @NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        f.a aVar = f.f37408b;
        if (f.l(i10, aVar.e())) {
            return e(focusTargetNode, function1);
        }
        if (f.l(i10, aVar.f())) {
            return b(focusTargetNode, function1);
        }
        throw new IllegalStateException(f37481a);
    }

    private static final boolean k(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
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
                                dVar.d((FocusTargetNode) dVarN);
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
        dVar.A0(x0.f37474a);
        int iR = dVar.R() - 1;
        Object[] objArr = dVar.f35552a;
        if (iR < objArr.length) {
            while (iR >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[iR];
                if (v0.g(focusTargetNode2) && b(focusTargetNode2, function1)) {
                    return true;
                }
                iR--;
            }
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
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
                                dVar.d((FocusTargetNode) dVarN);
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
        dVar.A0(x0.f37474a);
        Object[] objArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i11 = 0; i11 < iR; i11++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i11];
            if (v0.g(focusTargetNode2) && e(focusTargetNode2, function1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        if (focusTargetNode.c5() != q0.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
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
                                dVar.d((FocusTargetNode) dVarN);
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
        dVar.A0(x0.f37474a);
        f.a aVar = f.f37408b;
        if (f.l(i10, aVar.e())) {
            IntRange intRangeW1 = kotlin.ranges.r.W1(0, dVar.R());
            int iL = intRangeW1.l();
            int iM = intRangeW1.m();
            if (iL <= iM) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) dVar.f35552a[iL];
                        if (v0.g(focusTargetNode3) && e(focusTargetNode3, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(dVar.f35552a[iL], focusTargetNode2)) {
                        z10 = true;
                    }
                    if (iL == iM) {
                        break;
                    }
                    iL++;
                }
            }
        } else {
            if (!f.l(i10, aVar.f())) {
                throw new IllegalStateException(f37481a);
            }
            IntRange intRangeW2 = kotlin.ranges.r.W1(0, dVar.R());
            int iL2 = intRangeW2.l();
            int iM2 = intRangeW2.m();
            if (iL2 <= iM2) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) dVar.f35552a[iM2];
                        if (v0.g(focusTargetNode4) && b(focusTargetNode4, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(dVar.f35552a[iM2], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (iM2 == iL2) {
                        break;
                    }
                    iM2--;
                }
            }
        }
        if (f.l(i10, f.f37408b.e()) || !focusTargetNode.D9().P() || i(focusTargetNode)) {
            return false;
        }
        return function1.invoke(focusTargetNode).booleanValue();
    }
}
