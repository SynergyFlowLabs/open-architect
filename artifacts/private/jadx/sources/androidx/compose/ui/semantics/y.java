package androidx.compose.ui.semantics;

import android.os.Trace;
import androidx.collection.k0;
import androidx.collection.t1;
import androidx.compose.ui.layout.l0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,246:1\n27#2,5:247\n35#3,5:252\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n160#1:247,5\n117#1:252,5\n*E\n"})
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final n0.j f41189a = new n0.j(0.0f, 0.0f, 10.0f, 10.0f);

    @NotNull
    public static final List<u> b(@NotNull x xVar, boolean z10, boolean z11) {
        return CollectionsKt.toList(d(xVar, !z10, z11).values());
    }

    public static /* synthetic */ List c(x xVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(xVar, z10, z11);
    }

    @NotNull
    public static final Map<Integer, u> d(@NotNull x xVar, boolean z10, boolean z11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        u uVarE = z10 ? xVar.e() : xVar.d();
        if (z11 && uVarE.u().M()) {
            return linkedHashMap;
        }
        f(linkedHashMap, z11, uVarE);
        return linkedHashMap;
    }

    public static /* synthetic */ Map e(x xVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return d(xVar, z10, z11);
    }

    private static final void f(Map<Integer, u> map, boolean z10, u uVar) {
        map.put(Integer.valueOf(uVar.s()), uVar);
        List listQ = u.q(uVar, false, false, !z10, 3, null);
        int size = listQ.size();
        for (int i10 = 0; i10 < size; i10++) {
            f(map, z10, (u) listQ.get(i10));
        }
    }

    @NotNull
    public static final androidx.collection.j0<w> g(@NotNull x xVar, int i10) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            u uVarE = xVar.e();
            if (uVarE.u().J() && uVarE.u().I()) {
                t1 t1Var = new t1(48);
                f0 f0VarA = g0.a();
                f0VarA.c(androidx.compose.ui.unit.t.e(uVarE.m()));
                h(f0VarA, uVarE, i10, t1Var, uVarE, g0.a());
                Trace.endSection();
                return t1Var;
            }
            androidx.collection.j0<w> j0VarC = k0.c();
            Trace.endSection();
            return j0VarC;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    private static final void h(f0 f0Var, u uVar, int i10, t1<w> t1Var, u uVar2, f0 f0Var2) {
        l0 l0VarT;
        f0 f0Var3;
        u uVar3;
        int i11;
        t1<w> t1Var2;
        f0 f0Var4;
        boolean z10 = (uVar2.u().J() && uVar2.u().I()) ? false : true;
        if (!f0Var.isEmpty() || uVar2.s() == uVar.s()) {
            if (!z10 || uVar2.G()) {
                androidx.compose.ui.unit.s sVarE = androidx.compose.ui.unit.t.e(uVar2.E());
                f0Var2.c(sVarE);
                int iS = uVar2.s() == uVar.s() ? i10 : uVar2.s();
                if (!f0Var2.a(f0Var)) {
                    if (uVar2.G()) {
                        u uVarX = uVar2.x();
                        t1Var.j0(iS, new w(uVar2, androidx.compose.ui.unit.t.e((uVarX == null || (l0VarT = uVarX.t()) == null || !l0VarT.J()) ? f41189a : uVarX.m())));
                        return;
                    } else {
                        if (iS == i10) {
                            t1Var.j0(iS, new w(uVar2, f0Var2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                t1Var.j0(iS, new w(uVar2, f0Var2.getBounds()));
                List<u> listB = uVar2.B();
                int size = listB.size() - 1;
                while (-1 < size) {
                    if (listB.get(size).r().i(z.f41190a.z())) {
                        f0Var3 = f0Var;
                        uVar3 = uVar;
                        i11 = i10;
                        t1Var2 = t1Var;
                        f0Var4 = f0Var2;
                    } else {
                        f0Var3 = f0Var;
                        uVar3 = uVar;
                        i11 = i10;
                        t1Var2 = t1Var;
                        f0Var4 = f0Var2;
                        h(f0Var3, uVar3, i11, t1Var2, listB.get(size), f0Var4);
                    }
                    size--;
                    f0Var = f0Var3;
                    uVar = uVar3;
                    i10 = i11;
                    t1Var = t1Var2;
                    f0Var2 = f0Var4;
                }
                f0 f0Var5 = f0Var;
                if (k(uVar2)) {
                    f0Var5.b(sVarE);
                }
            }
        }
    }

    public static final boolean i(@NotNull u uVar) {
        if (uVar.J()) {
            return true;
        }
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        z zVar = z.f41190a;
        return semanticsConfigurationF.i(zVar.k()) || uVar.F().i(zVar.p());
    }

    public static /* synthetic */ void j(u uVar) {
    }

    public static final boolean k(@NotNull u uVar) {
        if (i(uVar)) {
            return false;
        }
        return uVar.F().v() || uVar.F().k();
    }
}
