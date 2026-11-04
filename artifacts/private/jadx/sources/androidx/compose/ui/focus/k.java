package androidx.compose.ui.focus;

import androidx.compose.ui.node.m1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,59:1\n118#2:60\n290#3,6:61\n450#3,6:67\n460#3,2:74\n462#3,8:79\n470#3,9:90\n479#3,8:102\n296#3:110\n149#3:111\n150#3,4:116\n154#3:121\n155#3,9:123\n450#3,37:132\n164#3,6:169\n297#3:175\n247#4:73\n240#5,3:76\n243#5,3:99\n1107#6:87\n1085#6,2:88\n57#7,4:112\n519#8:120\n44#8:122\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n46#1:60\n46#1:61,6\n46#1:67,6\n46#1:74,2\n46#1:79,8\n46#1:90,9\n46#1:102,8\n46#1:110\n46#1:111\n46#1:116,4\n46#1:121\n46#1:123,9\n46#1:132,37\n46#1:169,6\n46#1:175\n46#1:73\n46#1:76,3\n46#1:99,3\n46#1:87\n46#1:88,2\n46#1:112,4\n46#1:120\n46#1:122\n*E\n"})
public final class k {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37429a;

        static {
            int[] iArr = new int[q0.values().length];
            try {
                iArr[q0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.ActiveParent.ordinal()] = 2;
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
            f37429a = iArr;
        }
    }

    @NotNull
    public static final p0 a(@NotNull j jVar) {
        int iB = m1.b(1024);
        androidx.compose.ui.a0.d dVarW = jVar.w();
        androidx.compose.runtime.collection.d dVar = null;
        while (dVarW != null) {
            if (dVarW instanceof FocusTargetNode) {
                q0 q0VarC5 = ((FocusTargetNode) dVarW).c5();
                int i10 = a.f37429a[q0VarC5.ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return q0VarC5;
                }
                if (i10 != 4) {
                    throw new kotlin.k0();
                }
            } else if ((dVarW.T8() & iB) != 0 && (dVarW instanceof androidx.compose.ui.node.m)) {
                int i11 = 0;
                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarW).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i11++;
                        if (i11 == 1) {
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
                if (i11 == 1) {
                }
            }
            dVarW = androidx.compose.ui.node.k.n(dVar);
        }
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
                                q0 q0VarC6 = ((FocusTargetNode) dVarN).c5();
                                int i12 = a.f37429a[q0VarC6.ordinal()];
                                if (i12 == 1 || i12 == 2 || i12 == 3) {
                                    return q0VarC6;
                                }
                                if (i12 != 4) {
                                    throw new kotlin.k0();
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i13 = 0;
                                for (androidx.compose.ui.a0.d dVarY10 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY10 != null; dVarY10 = dVarY10.O8()) {
                                    if ((dVarY10.T8() & iB) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
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
        return q0.Inactive;
    }

    public static final void b(@NotNull j jVar) {
        androidx.compose.ui.node.k.v(jVar).getFocusOwner().s(jVar);
    }
}
