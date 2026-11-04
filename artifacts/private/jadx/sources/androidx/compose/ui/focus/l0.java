package androidx.compose.ui.focus;

import androidx.compose.ui.layout.g2;
import androidx.compose.ui.node.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusRequesterModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,126:1\n118#2:127\n118#2:243\n118#2:359\n118#2:475\n118#2:591\n118#2:707\n290#3,6:128\n450#3,6:134\n460#3,2:141\n462#3,8:146\n470#3,9:157\n479#3,8:169\n296#3:177\n149#3:178\n150#3,4:183\n154#3:188\n155#3,9:190\n450#3,37:199\n164#3,6:236\n297#3:242\n290#3,6:244\n450#3,6:250\n460#3,2:257\n462#3,8:262\n470#3,9:273\n479#3,8:285\n296#3:293\n149#3:294\n150#3,4:299\n154#3:304\n155#3,9:306\n450#3,37:315\n164#3,6:352\n297#3:358\n290#3,6:360\n450#3,6:366\n460#3,2:373\n462#3,8:378\n470#3,9:389\n479#3,8:401\n296#3:409\n149#3:410\n150#3,4:415\n154#3:420\n155#3,9:422\n450#3,37:431\n164#3,6:468\n297#3:474\n290#3,6:476\n450#3,6:482\n460#3,2:489\n462#3,8:494\n470#3,9:505\n479#3,8:517\n296#3:525\n149#3:526\n150#3,4:531\n154#3:536\n155#3,9:538\n450#3,37:547\n164#3,6:584\n297#3:590\n290#3,6:592\n450#3,6:598\n460#3,2:605\n462#3,8:610\n470#3,9:621\n479#3,8:633\n296#3:641\n149#3:642\n150#3,4:647\n154#3:652\n155#3,9:654\n450#3,37:663\n164#3,6:700\n297#3:706\n290#3,6:708\n450#3,6:714\n460#3,2:721\n462#3,8:726\n470#3,9:737\n479#3,8:749\n296#3:757\n149#3:758\n150#3,4:763\n154#3:768\n155#3,9:770\n450#3,37:779\n164#3,6:816\n297#3:822\n247#4:140\n247#4:256\n247#4:372\n247#4:488\n247#4:604\n247#4:720\n240#5,3:143\n243#5,3:166\n240#5,3:259\n243#5,3:282\n240#5,3:375\n243#5,3:398\n240#5,3:491\n243#5,3:514\n240#5,3:607\n243#5,3:630\n240#5,3:723\n243#5,3:746\n1107#6:154\n1085#6,2:155\n1107#6:270\n1085#6,2:271\n1107#6:386\n1085#6,2:387\n1107#6:502\n1085#6,2:503\n1107#6:618\n1085#6,2:619\n1107#6:734\n1085#6,2:735\n57#7,4:179\n57#7,4:295\n57#7,4:411\n57#7,4:527\n57#7,4:643\n57#7,4:759\n519#8:187\n44#8:189\n519#8:303\n44#8:305\n519#8:419\n44#8:421\n519#8:535\n44#8:537\n519#8:651\n44#8:653\n519#8:767\n44#8:769\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n*L\n39#1:127\n63#1:243\n83#1:359\n96#1:475\n113#1:591\n119#1:707\n39#1:128,6\n39#1:134,6\n39#1:141,2\n39#1:146,8\n39#1:157,9\n39#1:169,8\n39#1:177\n39#1:178\n39#1:183,4\n39#1:188\n39#1:190,9\n39#1:199,37\n39#1:236,6\n39#1:242\n63#1:244,6\n63#1:250,6\n63#1:257,2\n63#1:262,8\n63#1:273,9\n63#1:285,8\n63#1:293\n63#1:294\n63#1:299,4\n63#1:304\n63#1:306,9\n63#1:315,37\n63#1:352,6\n63#1:358\n83#1:360,6\n83#1:366,6\n83#1:373,2\n83#1:378,8\n83#1:389,9\n83#1:401,8\n83#1:409\n83#1:410\n83#1:415,4\n83#1:420\n83#1:422,9\n83#1:431,37\n83#1:468,6\n83#1:474\n96#1:476,6\n96#1:482,6\n96#1:489,2\n96#1:494,8\n96#1:505,9\n96#1:517,8\n96#1:525\n96#1:526\n96#1:531,4\n96#1:536\n96#1:538,9\n96#1:547,37\n96#1:584,6\n96#1:590\n113#1:592,6\n113#1:598,6\n113#1:605,2\n113#1:610,8\n113#1:621,9\n113#1:633,8\n113#1:641\n113#1:642\n113#1:647,4\n113#1:652\n113#1:654,9\n113#1:663,37\n113#1:700,6\n113#1:706\n119#1:708,6\n119#1:714,6\n119#1:721,2\n119#1:726,8\n119#1:737,9\n119#1:749,8\n119#1:757\n119#1:758\n119#1:763,4\n119#1:768\n119#1:770,9\n119#1:779,37\n119#1:816,6\n119#1:822\n39#1:140\n63#1:256\n83#1:372\n96#1:488\n113#1:604\n119#1:720\n39#1:143,3\n39#1:166,3\n63#1:259,3\n63#1:282,3\n83#1:375,3\n83#1:398,3\n96#1:491,3\n96#1:514,3\n113#1:607,3\n113#1:630,3\n119#1:723,3\n119#1:746,3\n39#1:154\n39#1:155,2\n63#1:270\n63#1:271,2\n83#1:386\n83#1:387,2\n96#1:502\n96#1:503,2\n113#1:618\n113#1:619,2\n119#1:734\n119#1:735,2\n39#1:179,4\n63#1:295,4\n83#1:411,4\n96#1:527,4\n113#1:643,4\n119#1:759,4\n39#1:187\n39#1:189\n63#1:303\n63#1:305\n83#1:419\n83#1:421\n96#1:535\n96#1:537\n113#1:651\n113#1:653\n119#1:767\n119#1:769\n*E\n"})
public final class l0 {

    static final class a extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37431a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(r0.B1(focusTargetNode, 0, 1, null));
        }
    }

    public static final boolean a(@NotNull k0 k0Var) {
        int iB = m1.b(1024);
        androidx.compose.ui.a0.d dVarW = k0Var.w();
        androidx.compose.runtime.collection.d dVar = null;
        while (dVarW != null) {
            if (dVarW instanceof FocusTargetNode) {
                if (u0.a((FocusTargetNode) dVarW)) {
                    return true;
                }
            } else if ((dVarW.T8() & iB) != 0 && (dVarW instanceof androidx.compose.ui.node.m)) {
                int i10 = 0;
                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarW).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i10++;
                        if (i10 == 1) {
                            dVarW = dVarY9;
                        } else {
                            if (dVar == null) {
                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            if (dVarW != null) {
                                dVar.d(dVarW);
                                dVarW = null;
                            }
                            dVar.d(dVarY9);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            dVarW = androidx.compose.ui.node.k.n(dVar);
        }
        if (!k0Var.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = k0Var.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar2, k0Var.w(), false);
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
                                if (u0.a((FocusTargetNode) dVarN)) {
                                    return true;
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.a0.d dVarY10 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY10 != null; dVarY10 = dVarY10.O8()) {
                                    if ((dVarY10.T8() & iB) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            dVarN = dVarY10;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar3.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar3.d(dVarY10);
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
        return false;
    }

    public static final boolean b(@NotNull k0 k0Var) {
        int iB = m1.b(1024);
        androidx.compose.ui.a0.d dVarW = k0Var.w();
        androidx.compose.runtime.collection.d dVar = null;
        while (true) {
            boolean z10 = true & false;
            if (dVarW == null) {
                if (!k0Var.w().a9()) {
                    s0.a.i("visitChildren called on an unattached node");
                }
                androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                androidx.compose.ui.a0.d dVarO8 = k0Var.w().O8();
                if (dVarO8 == null) {
                    androidx.compose.ui.node.k.c(dVar2, k0Var.w(), false);
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
                                        if (u0.f((FocusTargetNode) dVarN)) {
                                            return true;
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
                return false;
            }
            if (dVarW instanceof FocusTargetNode) {
                if (u0.f((FocusTargetNode) dVarW)) {
                    return true;
                }
            } else if ((dVarW.T8() & iB) != 0 && (dVarW instanceof androidx.compose.ui.node.m)) {
                int i11 = 0;
                for (androidx.compose.ui.a0.d dVarY10 = ((androidx.compose.ui.node.m) dVarW).y9(); dVarY10 != null; dVarY10 = dVarY10.O8()) {
                    if ((dVarY10.T8() & iB) != 0) {
                        i11++;
                        if (i11 == 1) {
                            dVarW = dVarY10;
                        } else {
                            if (dVar == null) {
                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            if (dVarW != null) {
                                dVar.d(dVarW);
                                dVarW = null;
                            }
                            dVar.d(dVarY10);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            dVarW = androidx.compose.ui.node.k.n(dVar);
        }
    }

    @Nullable
    public static final g2.a c(@NotNull k0 k0Var) {
        int iB = m1.b(1024);
        androidx.compose.ui.a0.d dVarW = k0Var.w();
        androidx.compose.runtime.collection.d dVar = null;
        while (dVarW != null) {
            if (dVarW instanceof FocusTargetNode) {
                g2.a aVarD = n0.d((FocusTargetNode) dVarW);
                if (aVarD != null) {
                    return aVarD;
                }
            } else if ((dVarW.T8() & iB) != 0 && (dVarW instanceof androidx.compose.ui.node.m)) {
                int i10 = 0;
                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarW).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i10++;
                        if (i10 == 1) {
                            dVarW = dVarY9;
                        } else {
                            if (dVar == null) {
                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            if (dVarW != null) {
                                dVar.d(dVarW);
                                dVarW = null;
                            }
                            dVar.d(dVarY9);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            dVarW = androidx.compose.ui.node.k.n(dVar);
        }
        if (!k0Var.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = k0Var.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar2, k0Var.w(), false);
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
                                g2.a aVarD2 = n0.d((FocusTargetNode) dVarN);
                                if (aVarD2 != null) {
                                    return aVarD2;
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.a0.d dVarY10 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY10 != null; dVarY10 = dVarY10.O8()) {
                                    if ((dVarY10.T8() & iB) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            dVarN = dVarY10;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar3.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar3.d(dVarY10);
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
        return null;
    }

    public static final boolean d(@NotNull k0 k0Var) {
        int iB = m1.b(1024);
        androidx.compose.ui.a0.d dVarW = k0Var.w();
        androidx.compose.runtime.collection.d dVar = null;
        while (dVarW != null) {
            if (dVarW instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) dVarW;
                return focusTargetNode.D9().P() ? r0.B1(focusTargetNode, 0, 1, null) : b1.k(focusTargetNode, f.f37408b.b(), a.f37431a);
            }
            if ((dVarW.T8() & iB) != 0 && (dVarW instanceof androidx.compose.ui.node.m)) {
                int i10 = 0;
                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarW).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i10++;
                        if (i10 == 1) {
                            dVarW = dVarY9;
                        } else {
                            if (dVar == null) {
                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            if (dVarW != null) {
                                dVar.d(dVarW);
                                dVarW = null;
                            }
                            dVar.d(dVarY9);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            dVarW = androidx.compose.ui.node.k.n(dVar);
        }
        if (!k0Var.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = k0Var.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar2, k0Var.w(), false);
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
                                return focusTargetNode2.D9().P() ? r0.B1(focusTargetNode2, 0, 1, null) : b1.k(focusTargetNode2, f.f37408b.b(), a.f37431a);
                            }
                            if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.a0.d dVarY10 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY10 != null; dVarY10 = dVarY10.O8()) {
                                    if ((dVarY10.T8() & iB) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            dVarN = dVarY10;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar3.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar3.d(dVarY10);
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
        return false;
    }

    public static final boolean e(@NotNull k0 k0Var) {
        int iB = m1.b(1024);
        androidx.compose.ui.a0.d dVarW = k0Var.w();
        androidx.compose.runtime.collection.d dVar = null;
        while (dVarW != null) {
            if (dVarW instanceof FocusTargetNode) {
                if (n0.e((FocusTargetNode) dVarW)) {
                    return true;
                }
            } else if ((dVarW.T8() & iB) != 0 && (dVarW instanceof androidx.compose.ui.node.m)) {
                int i10 = 0;
                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarW).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i10++;
                        if (i10 == 1) {
                            dVarW = dVarY9;
                        } else {
                            if (dVar == null) {
                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            if (dVarW != null) {
                                dVar.d(dVarW);
                                dVarW = null;
                            }
                            dVar.d(dVarY9);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            dVarW = androidx.compose.ui.node.k.n(dVar);
        }
        if (!k0Var.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = k0Var.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar2, k0Var.w(), false);
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
                                if (n0.e((FocusTargetNode) dVarN)) {
                                    return true;
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.a0.d dVarY10 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY10 != null; dVarY10 = dVarY10.O8()) {
                                    if ((dVarY10.T8() & iB) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            dVarN = dVarY10;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar3.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar3.d(dVarY10);
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
        return false;
    }

    public static final boolean f(@NotNull k0 k0Var) {
        int iB = m1.b(1024);
        androidx.compose.ui.a0.d dVarW = k0Var.w();
        androidx.compose.runtime.collection.d dVar = null;
        while (dVarW != null) {
            if (dVarW instanceof FocusTargetNode) {
                if (n0.f((FocusTargetNode) dVarW)) {
                    return true;
                }
            } else if ((dVarW.T8() & iB) != 0 && (dVarW instanceof androidx.compose.ui.node.m)) {
                int i10 = 0;
                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarW).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i10++;
                        if (i10 == 1) {
                            dVarW = dVarY9;
                        } else {
                            if (dVar == null) {
                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            if (dVarW != null) {
                                dVar.d(dVarW);
                                dVarW = null;
                            }
                            dVar.d(dVarY9);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            dVarW = androidx.compose.ui.node.k.n(dVar);
        }
        if (!k0Var.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = k0Var.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar2, k0Var.w(), false);
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
                                if (n0.f((FocusTargetNode) dVarN)) {
                                    return true;
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.a0.d dVarY10 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY10 != null; dVarY10 = dVarY10.O8()) {
                                    if ((dVarY10.T8() & iB) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            dVarN = dVarY10;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar3.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar3.d(dVarY10);
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
        return false;
    }
}
