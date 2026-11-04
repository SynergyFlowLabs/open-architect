package androidx.compose.ui.node;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n35#2,5:155\n118#2:160\n35#2,5:161\n119#2:166\n103#2:167\n35#2,5:168\n104#2:173\n118#2:174\n35#2,5:175\n119#2:180\n35#2,5:181\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n45#1:155,5\n59#1:160\n59#1:161,5\n59#1:166\n86#1:167\n86#1:168,5\n86#1:173\n93#1:174\n93#1:175,5\n93#1:180\n147#1:181,5\n*E\n"})
public final class s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39992d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0 f39993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p f39994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<y0.a> f39995c;

    public s0(@NotNull l0 l0Var, @NotNull p pVar, @NotNull List<y0.a> list) {
        this.f39993a = l0Var;
        this.f39994b = pVar;
        this.f39995c = list;
    }

    private final boolean b(l0 l0Var) {
        y0.a aVar;
        l0 l0VarJ0 = l0Var.J0();
        y0.a aVar2 = null;
        l0.e eVarM0 = l0VarJ0 != null ? l0VarJ0.m0() : null;
        if (l0Var.J() || (l0Var.K0() != Integer.MAX_VALUE && l0VarJ0 != null && l0VarJ0.J())) {
            if (l0Var.w0()) {
                List<y0.a> list = this.f39995c;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        aVar = null;
                        break;
                    }
                    aVar = list.get(i10);
                    y0.a aVar3 = aVar;
                    if (Intrinsics.areEqual(aVar3.a(), l0Var) && !aVar3.c()) {
                        break;
                    }
                    i10++;
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (l0Var.M()) {
                return true;
            }
            if (l0Var.w0()) {
                if (!this.f39994b.e(l0Var) && l0Var.m0() != l0.e.LookaheadMeasuring && ((l0VarJ0 == null || !l0VarJ0.w0()) && ((l0VarJ0 == null || !l0VarJ0.o0()) && eVarM0 != l0.e.Measuring))) {
                    return false;
                }
                return true;
            }
            if (l0Var.l0()) {
                if (!this.f39994b.e(l0Var) && l0VarJ0 != null && !l0VarJ0.w0() && !l0VarJ0.l0() && eVarM0 != l0.e.Measuring && eVarM0 != l0.e.LayingOut) {
                    List<y0.a> list2 = this.f39995c;
                    int size2 = list2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (!Intrinsics.areEqual(list2.get(i11).a(), l0Var)) {
                        }
                    }
                    if (l0Var.m0() != l0.e.Measuring) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (Intrinsics.areEqual(l0Var.i1(), Boolean.TRUE)) {
            if (l0Var.o0()) {
                List<y0.a> list3 = this.f39995c;
                int size3 = list3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    y0.a aVar4 = list3.get(i12);
                    y0.a aVar5 = aVar4;
                    if (Intrinsics.areEqual(aVar5.a(), l0Var) && aVar5.c()) {
                        aVar2 = aVar4;
                        break;
                    }
                }
                if (aVar2 != null) {
                    return true;
                }
            }
            if (l0Var.o0()) {
                return this.f39994b.f(l0Var, true) || (l0VarJ0 != null && l0VarJ0.o0()) || eVarM0 == l0.e.LookaheadMeasuring || (l0VarJ0 != null && l0VarJ0.w0() && Intrinsics.areEqual(l0Var.t0(), l0Var));
            }
            if (l0Var.n0() && !this.f39994b.f(l0Var, true) && l0VarJ0 != null && !l0VarJ0.o0() && !l0VarJ0.n0() && eVarM0 != l0.e.LookaheadMeasuring && eVarM0 != l0.e.LookaheadLayingOut && (!l0VarJ0.l0() || !Intrinsics.areEqual(l0Var.t0(), l0Var))) {
                return false;
            }
        }
        return true;
    }

    private final boolean c(l0 l0Var) {
        if (!b(l0Var)) {
            return false;
        }
        List<l0> listZ = l0Var.Z();
        int size = listZ.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c(listZ.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        e(this, sb2, this.f39993a, 0);
        return sb2.toString();
    }

    private static final void e(s0 s0Var, StringBuilder sb2, l0 l0Var, int i10) {
        String strF = s0Var.f(l0Var);
        if (strF.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strF);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            i10++;
        }
        List<l0> listZ = l0Var.Z();
        int size = listZ.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(s0Var, sb2, listZ.get(i12), i10);
        }
    }

    private final String f(l0 l0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l0Var);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb3.append(l0Var.m0());
        sb3.append(AbstractJsonLexerKt.END_LIST);
        sb2.append(sb3.toString());
        if (!l0Var.J()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + l0Var.x0() + AbstractJsonLexerKt.END_LIST);
        if (!b(l0Var)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void a() {
        if (c(this.f39993a)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
