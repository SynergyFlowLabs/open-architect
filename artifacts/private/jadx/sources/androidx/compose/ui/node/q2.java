package androidx.compose.ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTraversableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,218:1\n146#2:219\n146#2:288\n146#2:357\n146#2:426\n146#2:495\n146#2:571\n146#2:647\n146#2:724\n248#3,5:220\n91#3:225\n92#3,8:230\n450#3,6:238\n460#3,2:245\n462#3,8:250\n470#3,9:261\n479#3,8:273\n101#3,7:281\n248#3,5:289\n91#3:294\n92#3,8:299\n450#3,6:307\n460#3,2:314\n462#3,8:319\n470#3,9:330\n479#3,8:342\n101#3,7:350\n248#3,5:358\n91#3:363\n92#3,8:368\n450#3,6:376\n460#3,2:383\n462#3,8:388\n470#3,9:399\n479#3,8:411\n101#3,7:419\n248#3,5:427\n91#3:432\n92#3,8:437\n450#3,6:445\n460#3,2:452\n462#3,8:457\n470#3,9:468\n479#3,8:480\n101#3,7:488\n284#3,5:496\n149#3:501\n150#3:506\n151#3,3:510\n154#3:514\n155#3,9:516\n450#3,6:525\n460#3,2:532\n462#3,17:537\n479#3,8:557\n164#3,6:565\n284#3,5:572\n149#3:577\n150#3:582\n151#3,3:586\n154#3:590\n155#3,9:592\n450#3,6:601\n460#3,2:608\n462#3,17:613\n479#3,8:633\n164#3,6:641\n299#3,6:648\n180#3:654\n181#3:659\n182#3,3:663\n185#3,6:667\n305#3:673\n450#3,6:674\n460#3,2:681\n462#3,17:686\n479#3,8:706\n306#3:714\n191#3,8:715\n307#3:723\n299#3,6:725\n180#3:731\n181#3:736\n182#3,3:740\n185#3,6:744\n305#3:750\n450#3,6:751\n460#3,2:758\n462#3,17:763\n479#3,8:783\n306#3:791\n191#3,8:792\n307#3:800\n57#4,4:226\n57#4,4:295\n57#4,4:364\n57#4,4:433\n57#4,4:502\n57#4,4:578\n57#4,4:655\n57#4,4:732\n247#5:244\n247#5:313\n247#5:382\n247#5:451\n247#5:531\n247#5:607\n247#5:680\n247#5:757\n240#6,3:247\n243#6,3:270\n240#6,3:316\n243#6,3:339\n240#6,3:385\n243#6,3:408\n240#6,3:454\n243#6,3:477\n240#6,3:534\n243#6,3:554\n240#6,3:610\n243#6,3:630\n240#6,3:683\n243#6,3:703\n240#6,3:760\n243#6,3:780\n1107#7:258\n1085#7,2:259\n1107#7:327\n1085#7,2:328\n1107#7:396\n1085#7,2:397\n1107#7:465\n1085#7,2:466\n1107#7:507\n1085#7,2:508\n1107#7:583\n1085#7,2:584\n1107#7:660\n1085#7,2:661\n1107#7:737\n1085#7,2:738\n519#8:513\n44#8:515\n519#8:589\n44#8:591\n519#8:666\n519#8:743\n*S KotlinDebug\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n*L\n54#1:219\n64#1:288\n83#1:357\n103#1:426\n126#1:495\n148#1:571\n175#1:647\n203#1:724\n54#1:220,5\n54#1:225\n54#1:230,8\n54#1:238,6\n54#1:245,2\n54#1:250,8\n54#1:261,9\n54#1:273,8\n54#1:281,7\n64#1:289,5\n64#1:294\n64#1:299,8\n64#1:307,6\n64#1:314,2\n64#1:319,8\n64#1:330,9\n64#1:342,8\n64#1:350,7\n83#1:358,5\n83#1:363\n83#1:368,8\n83#1:376,6\n83#1:383,2\n83#1:388,8\n83#1:399,9\n83#1:411,8\n83#1:419,7\n103#1:427,5\n103#1:432\n103#1:437,8\n103#1:445,6\n103#1:452,2\n103#1:457,8\n103#1:468,9\n103#1:480,8\n103#1:488,7\n126#1:496,5\n126#1:501\n126#1:506\n126#1:510,3\n126#1:514\n126#1:516,9\n126#1:525,6\n126#1:532,2\n126#1:537,17\n126#1:557,8\n126#1:565,6\n148#1:572,5\n148#1:577\n148#1:582\n148#1:586,3\n148#1:590\n148#1:592,9\n148#1:601,6\n148#1:608,2\n148#1:613,17\n148#1:633,8\n148#1:641,6\n175#1:648,6\n175#1:654\n175#1:659\n175#1:663,3\n175#1:667,6\n175#1:673\n175#1:674,6\n175#1:681,2\n175#1:686,17\n175#1:706,8\n175#1:714\n175#1:715,8\n175#1:723\n203#1:725,6\n203#1:731\n203#1:736\n203#1:740,3\n203#1:744,6\n203#1:750\n203#1:751,6\n203#1:758,2\n203#1:763,17\n203#1:783,8\n203#1:791\n203#1:792,8\n203#1:800\n54#1:226,4\n64#1:295,4\n83#1:364,4\n103#1:433,4\n126#1:502,4\n148#1:578,4\n175#1:655,4\n203#1:732,4\n54#1:244\n64#1:313\n83#1:382\n103#1:451\n126#1:531\n148#1:607\n175#1:680\n203#1:757\n54#1:247,3\n54#1:270,3\n64#1:316,3\n64#1:339,3\n83#1:385,3\n83#1:408,3\n103#1:454,3\n103#1:477,3\n126#1:534,3\n126#1:554,3\n148#1:610,3\n148#1:630,3\n175#1:683,3\n175#1:703,3\n203#1:760,3\n203#1:780,3\n54#1:258\n54#1:259,2\n64#1:327\n64#1:328,2\n83#1:396\n83#1:397,2\n103#1:465\n103#1:466,2\n126#1:507\n126#1:508,2\n148#1:583\n148#1:584,2\n175#1:660\n175#1:661,2\n203#1:737\n203#1:738,2\n126#1:513\n126#1:515\n148#1:589\n148#1:591\n175#1:666\n203#1:743\n*E\n"})
public final class q2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    @Nullable
    public static final p2 a(@NotNull j jVar, @Nullable Object obj) {
        i1 i1VarA0;
        int iB = m1.b(262144);
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = jVar.w().W8();
        l0 l0VarU = k.u(jVar);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        androidx.compose.ui.a0.d dVarN = dVarW8;
                        androidx.compose.runtime.collection.d dVar = null;
                        while (dVarN != 0) {
                            if (dVarN instanceof p2) {
                                p2 p2Var = (p2) dVarN;
                                if (Intrinsics.areEqual(obj, p2Var.R4())) {
                                    return p2Var;
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                                androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                                int i10 = 0;
                                dVarN = dVarN;
                                while (dVarY9 != null) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            dVarN = dVarN;
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
                                if (i10 == 1) {
                                }
                            }
                            dVarN = k.n(dVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    @Nullable
    public static final <T extends p2> T b(@NotNull T t10) {
        i1 i1VarA0;
        int iB = m1.b(262144);
        if (!t10.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = t10.w().W8();
        l0 l0VarU = k.u(t10);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        androidx.compose.ui.a0.d dVarN = dVarW8;
                        androidx.compose.runtime.collection.d dVar = null;
                        while (dVarN != 0) {
                            if (dVarN instanceof p2) {
                                T t11 = (T) dVarN;
                                if (Intrinsics.areEqual(t10.R4(), t11.R4()) && androidx.compose.ui.d.a(t10, t11)) {
                                    return t11;
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                                androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                                int i10 = 0;
                                dVarN = dVarN;
                                while (dVarY9 != null) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            dVarN = dVarN;
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
                                if (i10 == 1) {
                                }
                            }
                            dVarN = k.n(dVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    public static final void c(@NotNull j jVar, @Nullable Object obj, @NotNull Function1<? super p2, Boolean> function1) {
        i1 i1VarA0;
        int iB = m1.b(262144);
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = jVar.w().W8();
        l0 l0VarU = k.u(jVar);
        loop0: while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        androidx.compose.ui.a0.d dVarN = dVarW8;
                        androidx.compose.runtime.collection.d dVar = null;
                        while (dVarN != 0) {
                            if (dVarN instanceof p2) {
                                p2 p2Var = (p2) dVarN;
                                if (!(Intrinsics.areEqual(obj, p2Var.R4()) ? function1.invoke(p2Var).booleanValue() : true)) {
                                    break loop0;
                                }
                            } else {
                                if (((dVarN.T8() & iB) != 0) && (dVarN instanceof m)) {
                                    androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                                    int i10 = 0;
                                    dVarN = dVarN;
                                    while (dVarY9 != null) {
                                        if ((dVarY9.T8() & iB) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                dVarN = dVarY9;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                                }
                                                dVarN = dVarN;
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
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            dVarN = k.n(dVar);
                        }
                    }
                    dVarW8 = dVarW8.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final <T extends androidx.compose.ui.node.p2> void d(@org.jetbrains.annotations.NotNull T r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.q2.d(androidx.compose.ui.node.p2, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    public static final void e(@NotNull j jVar, @Nullable Object obj, @NotNull Function1<? super p2, Boolean> function1) {
        boolean z10;
        int iB = m1.b(262144);
        if (!jVar.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            k.c(dVar, jVar.w(), false);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVarN.N8() & iB) == 0) {
                k.c(dVar, dVarN, false);
            } else {
                while (dVarN != 0) {
                    if ((dVarN.T8() & iB) != 0) {
                        androidx.compose.runtime.collection.d dVar2 = null;
                        while (dVarN != 0) {
                            if (dVarN instanceof p2) {
                                p2 p2Var = (p2) dVarN;
                                if (!(Intrinsics.areEqual(obj, p2Var.R4()) ? function1.invoke(p2Var).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((dVarN.T8() & iB) != 0) && (dVarN instanceof m)) {
                                    androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                                    int i10 = 0;
                                    while (dVarY9 != null) {
                                        if ((dVarY9.T8() & iB) != 0) {
                                            dVarN = dVarN;
                                            z10 = true;
                                        } else {
                                            dVarN = dVarN;
                                            z10 = false;
                                        }
                                        if (z10) {
                                            i10++;
                                            if (i10 == 1) {
                                                dVarN = dVarY9;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                                }
                                                if (dVarN != 0) {
                                                    dVar2.d(dVarN);
                                                    dVarN = 0;
                                                }
                                                dVar2.d(dVarY9);
                                            }
                                        }
                                        dVarY9 = dVarY9.O8();
                                        dVarN = dVarN;
                                    }
                                    dVarN = dVarN;
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            dVarN = k.n(dVar2);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final <T extends androidx.compose.ui.node.p2> void f(@org.jetbrains.annotations.NotNull T r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.q2.f(androidx.compose.ui.node.p2, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final void g(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.j r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.p2, ? extends androidx.compose.ui.node.p2.a.EnumC0311a> r14) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.q2.g(androidx.compose.ui.node.j, java.lang.Object, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final <T extends androidx.compose.ui.node.p2> void h(@org.jetbrains.annotations.NotNull T r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends androidx.compose.ui.node.p2.a.EnumC0311a> r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.q2.h(androidx.compose.ui.node.p2, kotlin.jvm.functions.Function1):void");
    }
}
