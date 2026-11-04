package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,405:1\n60#1:409\n60#1:411\n60#1:413\n60#1:415\n60#1:417\n60#1:419\n60#1:421\n60#1:423\n60#1:425\n60#1:427\n60#1:429\n60#1:437\n60#1:439\n60#1:441\n60#1:443\n60#1:445\n60#1:447\n60#1:449\n60#1:451\n60#1:453\n60#1:455\n60#1:457\n60#1:459\n60#1:461\n60#1:463\n60#1:465\n60#1:467\n60#1:469\n60#1:471\n60#1:473\n60#1:475\n63#1:497\n63#1:500\n63#1:502\n63#1:504\n63#1:506\n63#1:508\n63#1:510\n63#1:512\n106#2:406\n78#2:407\n82#2:408\n86#2:410\n90#2:412\n94#2:414\n98#2:416\n126#2:418\n122#2:420\n110#2:422\n102#2:424\n106#2:426\n150#2:428\n78#2:435\n82#2:436\n86#2:438\n90#2:440\n94#2:442\n98#2:444\n102#2:446\n106#2:448\n110#2:450\n114#2:452\n118#2:454\n122#2:456\n126#2:458\n130#2:460\n134#2:462\n138#2:464\n142#2:466\n146#2:468\n150#2:470\n154#2:472\n159#2:474\n82#2:496\n82#2:498\n106#2:499\n110#2:501\n86#2:503\n90#2:505\n102#2:507\n122#2:509\n126#2:511\n688#3,5:430\n693#3,2:476\n57#4,4:478\n57#4,4:482\n57#4,4:486\n240#5,6:490\n240#5,6:513\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n166#1:409\n169#1:411\n172#1:413\n175#1:415\n178#1:417\n182#1:419\n186#1:421\n189#1:423\n192#1:425\n195#1:427\n198#1:429\n213#1:437\n216#1:439\n219#1:441\n222#1:443\n225#1:445\n228#1:447\n231#1:449\n234#1:451\n237#1:453\n240#1:455\n243#1:457\n246#1:459\n249#1:461\n252#1:463\n255#1:465\n258#1:467\n261#1:469\n264#1:471\n267#1:473\n271#1:475\n317#1:497\n324#1:500\n331#1:502\n343#1:504\n346#1:506\n349#1:508\n353#1:510\n359#1:512\n70#1:406\n164#1:407\n166#1:408\n169#1:410\n172#1:412\n175#1:414\n178#1:416\n182#1:418\n186#1:420\n189#1:422\n192#1:424\n195#1:426\n198#1:428\n211#1:435\n213#1:436\n216#1:438\n219#1:440\n222#1:442\n225#1:444\n228#1:446\n231#1:448\n234#1:450\n237#1:452\n240#1:454\n243#1:456\n246#1:458\n249#1:460\n252#1:462\n255#1:464\n258#1:466\n261#1:468\n264#1:470\n267#1:472\n271#1:474\n317#1:496\n320#1:498\n324#1:499\n331#1:501\n343#1:503\n346#1:505\n349#1:507\n353#1:509\n359#1:511\n210#1:430,5\n210#1:476,2\n282#1:478,4\n287#1:482,4\n292#1:486,4\n304#1:490,6\n397#1:513,6\n*E\n"})
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.f2<Object> f39924a = androidx.collection.r2.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f39925b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f39926c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f39927d = 2;

    public static final void a(@NotNull androidx.compose.ui.a0.d dVar) {
        if (!dVar.a9()) {
            s0.a.i("autoInvalidateInsertedNode called on unattached node");
        }
        b(dVar, -1, 1);
    }

    public static final void b(@NotNull androidx.compose.ui.a0.d dVar, int i10, int i11) {
        if (!(dVar instanceof m)) {
            c(dVar, i10 & dVar.T8(), i11);
            return;
        }
        m mVar = (m) dVar;
        c(dVar, mVar.z9() & i10, i11);
        int i12 = (~mVar.z9()) & i10;
        for (androidx.compose.ui.a0.d dVarY9 = mVar.y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            b(dVarY9, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(androidx.compose.ui.a0.d dVar, int i10, int i11) {
        if (i11 != 0 || dVar.X8()) {
            if ((m1.b(2) & i10) != 0 && (dVar instanceof g0)) {
                j0.b((g0) dVar);
                if (i11 == 2) {
                    k.p(dVar, m1.b(2)).j6();
                }
            }
            if ((m1.b(128) & i10) != 0 && (dVar instanceof f0) && i11 != 2) {
                k.u(dVar).Z0();
            }
            if ((m1.b(256) & i10) != 0 && (dVar instanceof v)) {
                if (i11 == 1) {
                    l0 l0VarU = k.u(dVar);
                    l0VarU.b2(l0VarU.c0() + 1);
                } else if (i11 == 2) {
                    l0 l0VarU2 = k.u(dVar);
                    l0VarU2.b2(l0VarU2.c0() - 1);
                }
                if (i11 != 2) {
                    k.u(dVar).b1();
                }
            }
            if ((m1.b(4) & i10) != 0 && (dVar instanceof t)) {
                u.a((t) dVar);
            }
            if ((m1.b(8) & i10) != 0 && (dVar instanceof i2)) {
                k.u(dVar).o2(true);
            }
            if ((m1.b(64) & i10) != 0 && (dVar instanceof a2)) {
                b2.a((a2) dVar);
            }
            if ((m1.b(2048) & i10) != 0 && (dVar instanceof androidx.compose.ui.focus.c0)) {
                androidx.compose.ui.focus.c0 c0Var = (androidx.compose.ui.focus.c0) dVar;
                if (o(c0Var)) {
                    androidx.compose.ui.focus.d0.a(c0Var);
                }
            }
            if ((i10 & m1.b(4096)) == 0 || !(dVar instanceof androidx.compose.ui.focus.j)) {
                return;
            }
            androidx.compose.ui.focus.k.b((androidx.compose.ui.focus.j) dVar);
        }
    }

    public static final void d(@NotNull androidx.compose.ui.a0.d dVar) {
        if (!dVar.a9()) {
            s0.a.i("autoInvalidateRemovedNode called on unattached node");
        }
        b(dVar, -1, 2);
    }

    public static final void e(@NotNull androidx.compose.ui.a0.d dVar) {
        if (!dVar.a9()) {
            s0.a.i("autoInvalidateUpdatedNode called on unattached node");
        }
        b(dVar, -1, 0);
    }

    public static final int f(@NotNull androidx.compose.ui.a0.c cVar) {
        int iB = m1.b(1);
        if (cVar instanceof androidx.compose.ui.layout.o0) {
            iB |= m1.b(2);
        }
        if (cVar instanceof androidx.compose.ui.draw.m) {
            iB |= m1.b(4);
        }
        if (cVar instanceof androidx.compose.ui.semantics.s) {
            iB |= m1.b(8);
        }
        if (cVar instanceof androidx.compose.ui.input.pointer.j0) {
            iB |= m1.b(16);
        }
        if ((cVar instanceof androidx.compose.ui.modifier.d) || (cVar instanceof androidx.compose.ui.modifier.l)) {
            iB |= m1.b(32);
        }
        if (cVar instanceof androidx.compose.ui.focus.h) {
            iB |= m1.b(4096);
        }
        if (cVar instanceof androidx.compose.ui.focus.t) {
            iB |= m1.b(2048);
        }
        if (cVar instanceof androidx.compose.ui.layout.p1) {
            iB |= m1.b(256);
        }
        if (cVar instanceof androidx.compose.ui.layout.e2) {
            iB |= m1.b(64);
        }
        if ((cVar instanceof androidx.compose.ui.layout.u1) || (cVar instanceof androidx.compose.ui.layout.x1)) {
            iB |= m1.b(128);
        }
        return cVar instanceof androidx.compose.ui.relocation.a ? m1.b(524288) | iB : iB;
    }

    public static final int g(@NotNull androidx.compose.ui.a0.d dVar) {
        if (dVar.T8() != 0) {
            return dVar.T8();
        }
        androidx.collection.f2<Object> f2Var = f39924a;
        Object objB = androidx.compose.ui.d.b(dVar);
        int i10 = f2Var.i(objB);
        if (i10 >= 0) {
            return f2Var.f12438c[i10];
        }
        int iB = m1.b(1);
        if (dVar instanceof g0) {
            iB |= m1.b(2);
        }
        if (dVar instanceof t) {
            iB |= m1.b(4);
        }
        if (dVar instanceof i2) {
            iB |= m1.b(8);
        }
        if (dVar instanceof d2) {
            iB |= m1.b(16);
        }
        if (dVar instanceof androidx.compose.ui.modifier.j) {
            iB |= m1.b(32);
        }
        if (dVar instanceof a2) {
            iB |= m1.b(64);
        }
        if (dVar instanceof f0) {
            iB |= m1.b(128);
        }
        if (dVar instanceof v) {
            iB |= m1.b(256);
        }
        if (dVar instanceof androidx.compose.ui.layout.e) {
            iB |= m1.b(512);
        }
        if (dVar instanceof FocusTargetNode) {
            iB |= m1.b(1024);
        }
        if (dVar instanceof androidx.compose.ui.focus.c0) {
            iB |= m1.b(2048);
        }
        if (dVar instanceof androidx.compose.ui.focus.j) {
            iB |= m1.b(4096);
        }
        if (dVar instanceof androidx.compose.ui.input.key.g) {
            iB |= m1.b(8192);
        }
        if (dVar instanceof androidx.compose.ui.input.rotary.b) {
            iB |= m1.b(16384);
        }
        if (dVar instanceof h) {
            iB |= m1.b(32768);
        }
        if (dVar instanceof androidx.compose.ui.input.key.j) {
            iB |= m1.b(131072);
        }
        if (dVar instanceof p2) {
            iB |= m1.b(262144);
        }
        if (dVar instanceof androidx.compose.ui.relocation.a) {
            iB |= m1.b(524288);
        }
        if (dVar instanceof u1) {
            iB |= m1.b(1048576);
        }
        if (dVar instanceof androidx.compose.ui.input.indirect.f) {
            iB |= m1.b(2097152);
        }
        f2Var.l0(objB, iB);
        return iB;
    }

    public static final int h(@NotNull androidx.compose.ui.a0.d dVar) {
        if (!(dVar instanceof m)) {
            return g(dVar);
        }
        m mVar = (m) dVar;
        int iZ9 = mVar.z9();
        for (androidx.compose.ui.a0.d dVarY9 = mVar.y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            iZ9 |= h(dVarY9);
        }
        return iZ9;
    }

    public static final boolean i(int i10, int i11) {
        if ((i10 & i11) == 0) {
            return false;
        }
        boolean z10 = false | true;
        return true;
    }

    public static final boolean j(int i10) {
        return (i10 & m1.b(128)) != 0;
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    public static final int n(int i10, int i11) {
        return i10 | i11;
    }

    private static final boolean o(androidx.compose.ui.focus.c0 c0Var) {
        e eVar = e.f39723a;
        eVar.b();
        c0Var.Z6(eVar);
        return eVar.a();
    }
}
