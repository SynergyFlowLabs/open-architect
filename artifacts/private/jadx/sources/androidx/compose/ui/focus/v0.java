package androidx.compose.ui.focus;

import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,180:1\n1#2:181\n118#3:182\n118#3:258\n284#4,5:183\n149#4:188\n150#4:193\n151#4,3:197\n154#4:201\n155#4,9:203\n450#4,6:212\n460#4,2:219\n462#4,17:224\n479#4,8:244\n164#4,6:252\n248#4,5:259\n91#4:264\n92#4,8:269\n450#4,6:277\n460#4,2:284\n462#4,8:289\n470#4,9:300\n479#4,8:312\n101#4,7:320\n57#5,4:189\n57#5,4:265\n1107#6:194\n1085#6,2:195\n1107#6:297\n1085#6,2:298\n519#7:200\n44#7:202\n247#8:218\n247#8:283\n240#9,3:221\n243#9,3:241\n240#9,3:286\n243#9,3:309\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n158#1:182\n177#1:258\n158#1:183,5\n158#1:188\n158#1:193\n158#1:197,3\n158#1:201\n158#1:203,9\n158#1:212,6\n158#1:219,2\n158#1:224,17\n158#1:244,8\n158#1:252,6\n177#1:259,5\n177#1:264\n177#1:269,8\n177#1:277,6\n177#1:284,2\n177#1:289,8\n177#1:300,9\n177#1:312,8\n177#1:320,7\n158#1:189,4\n177#1:265,4\n158#1:194\n158#1:195,2\n177#1:297\n177#1:298,2\n158#1:200\n158#1:202\n158#1:218\n177#1:283\n158#1:221,3\n158#1:241,3\n177#1:286,3\n177#1:309,3\n*E\n"})
public final class v0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37465b;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37464a = iArr;
            int[] iArr2 = new int[q0.values().length];
            try {
                iArr2[q0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[q0.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[q0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f37465b = iArr2;
        }
    }

    @NotNull
    public static final g0 a(@NotNull FocusTargetNode focusTargetNode, int i10, @NotNull androidx.compose.ui.unit.w wVar) {
        g0 g0VarV;
        g0 g0VarU;
        z zVarD9 = focusTargetNode.D9();
        f.a aVar = f.f37408b;
        if (f.l(i10, aVar.e())) {
            return zVarD9.w();
        }
        if (f.l(i10, aVar.f())) {
            return zVarD9.G();
        }
        if (f.l(i10, aVar.h())) {
            return zVarD9.z();
        }
        if (f.l(i10, aVar.a())) {
            return zVarD9.C();
        }
        g0 g0Var = null;
        if (f.l(i10, aVar.d())) {
            int i11 = a.f37464a[wVar.ordinal()];
            if (i11 == 1) {
                g0VarU = zVarD9.u();
            } else {
                if (i11 != 2) {
                    throw new kotlin.k0();
                }
                g0VarU = zVarD9.v();
            }
            if (g0VarU != g0.f37418b.c()) {
                g0Var = g0VarU;
            }
            return g0Var == null ? zVarD9.y() : g0Var;
        }
        if (f.l(i10, aVar.g())) {
            int i12 = a.f37464a[wVar.ordinal()];
            if (i12 == 1) {
                g0VarV = zVarD9.v();
            } else {
                if (i12 != 2) {
                    throw new kotlin.k0();
                }
                g0VarV = zVarD9.u();
            }
            g0Var = g0VarV != g0.f37418b.c() ? g0VarV : null;
            return g0Var == null ? zVarD9.x() : g0Var;
        }
        if (!f.l(i10, aVar.b()) && !f.l(i10, aVar.c())) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        b bVar = new b(i10, null);
        w focusOwner = androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeJ = focusOwner.j();
        if (f.l(i10, aVar.b())) {
            zVarD9.Q().invoke(bVar);
        } else {
            zVarD9.R().invoke(bVar);
        }
        if (bVar.d()) {
            return g0.f37418b.b();
        }
        return focusTargetNodeJ != focusOwner.j() ? g0.f37418b.d() : g0.f37418b.c();
    }

    @Nullable
    public static final FocusTargetNode b(@NotNull FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeJ = androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().j();
        if (focusTargetNodeJ == null || !focusTargetNodeJ.a9()) {
            return null;
        }
        return focusTargetNodeJ;
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        i1 i1VarA0;
        int iB = m1.b(1024);
        if (!focusTargetNode.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = focusTargetNode.w().W8();
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(focusTargetNode);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        androidx.compose.ui.a0.d dVarN = dVarW8;
                        androidx.compose.runtime.collection.d dVar = null;
                        while (dVarN != null) {
                            if (dVarN instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarN;
                                if (focusTargetNode2.D9().P()) {
                                    return focusTargetNode2;
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
        return null;
    }

    @NotNull
    public static final n0.j d(@NotNull FocusTargetNode focusTargetNode) {
        n0.j jVarE0;
        k1 k1VarP8 = focusTargetNode.P8();
        return (k1VarP8 == null || (jVarE0 = androidx.compose.ui.layout.h0.d(k1VarP8).e0(k1VarP8, false)) == null) ? n0.j.f332705e.a() : jVarE0;
    }

    @Nullable
    public static final Boolean e(@NotNull FocusTargetNode focusTargetNode, int i10, @NotNull androidx.compose.ui.unit.w wVar, @Nullable n0.j jVar, @NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        int iG;
        f.a aVar = f.f37408b;
        if (f.l(i10, aVar.e()) || f.l(i10, aVar.f())) {
            return Boolean.valueOf(z0.j(focusTargetNode, i10, function1));
        }
        if (!f.l(i10, aVar.d()) && !f.l(i10, aVar.g()) && !f.l(i10, aVar.h()) && !f.l(i10, aVar.a())) {
            if (!f.l(i10, aVar.b())) {
                if (f.l(i10, aVar.c())) {
                    FocusTargetNode focusTargetNodeB = b(focusTargetNode);
                    FocusTargetNode focusTargetNodeC = focusTargetNodeB != null ? c(focusTargetNodeB) : null;
                    return Boolean.valueOf((focusTargetNodeC == null || Intrinsics.areEqual(focusTargetNodeC, focusTargetNode)) ? false : function1.invoke(focusTargetNodeC).booleanValue());
                }
                throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) f.n(i10))).toString());
            }
            int i11 = a.f37464a[wVar.ordinal()];
            if (i11 == 1) {
                iG = aVar.g();
            } else {
                if (i11 != 2) {
                    throw new kotlin.k0();
                }
                iG = aVar.d();
            }
            FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
            if (focusTargetNodeB2 != null) {
                return b1.t(focusTargetNodeB2, iG, jVar, function1);
            }
            return null;
        }
        return b1.t(focusTargetNode, i10, jVar, function1);
    }

    @Nullable
    public static final FocusTargetNode f(@NotNull FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.w().a9()) {
            return null;
        }
        int iB = m1.b(1024);
        if (!focusTargetNode.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = focusTargetNode.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar, focusTargetNode.w(), false);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVarN.N8() & iB) == 0) {
                androidx.compose.ui.node.k.c(dVar, dVarN, false);
            } else {
                while (dVarN != null) {
                    if ((dVarN.T8() & iB) != 0) {
                        androidx.compose.runtime.collection.d dVar2 = null;
                        while (dVarN != null) {
                            if (dVarN instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarN;
                                if (focusTargetNode2.w().a9()) {
                                    int i10 = a.f37465b[focusTargetNode2.c5().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return focusTargetNode2;
                                    }
                                    if (i10 != 4) {
                                        throw new kotlin.k0();
                                    }
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar2);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
        return null;
    }

    public static final boolean g(@NotNull FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.l0 l0VarI4;
        k1 k1VarP8;
        androidx.compose.ui.node.l0 l0VarI5;
        k1 k1VarP9 = focusTargetNode.P8();
        return (k1VarP9 == null || (l0VarI4 = k1VarP9.i4()) == null || !l0VarI4.J() || (k1VarP8 = focusTargetNode.P8()) == null || (l0VarI5 = k1VarP8.i4()) == null || !l0VarI5.I()) ? false : true;
    }
}
