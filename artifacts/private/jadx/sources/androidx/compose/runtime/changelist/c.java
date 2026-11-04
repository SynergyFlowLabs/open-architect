package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l5;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.z5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,96:1\n4788#2,4:97\n4788#2,4:138\n204#3,2:101\n360#3:114\n357#3:115\n207#3,2:118\n204#3,2:120\n360#3:132\n357#3:133\n207#3,2:136\n204#3,2:142\n207#3,2:146\n701#4:103\n704#4:104\n707#4:117\n371#5,9:105\n380#5:116\n371#5,9:123\n380#5:134\n744#6:122\n747#6:135\n544#7:144\n547#7:145\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n50#1:97,4\n76#1:138,4\n63#1:101,2\n65#1:114\n65#1:115\n63#1:118,2\n69#1:120,2\n70#1:132\n70#1:133\n69#1:136,2\n83#1:142,2\n83#1:146,2\n64#1:103\n65#1:104\n66#1:117\n65#1:105,9\n65#1:116\n70#1:123,9\n70#1:134\n70#1:122\n71#1:135\n84#1:144\n85#1:145\n*E\n"})
public final class c extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35442d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f35443b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k f35444c = new k();

    @Override // androidx.compose.runtime.changelist.l
    @NotNull
    public String a(@NotNull String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FixupList instance containing " + g() + " operations");
        if (sb2.length() > 0) {
            sb2.append(":\n" + this.f35443b.a(str));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void c() {
        this.f35444c.i();
        this.f35443b.i();
    }

    public final void d(@NotNull Function0<? extends Object> function0, int i10, @NotNull androidx.compose.runtime.g gVar) {
        k kVar = this.f35443b;
        d.o oVar = d.o.f35502d;
        kVar.F(oVar);
        k kVarB = k.b.b(kVar);
        k.b.j(kVarB, d.t.b(0), function0);
        kVarB.f35535d[kVarB.f35536e - kVarB.f35533b[kVarB.f35534c - 1].d()] = i10;
        k.b.j(kVarB, d.t.b(1), gVar);
        kVar.n(oVar);
        k kVar2 = this.f35444c;
        d.u uVar = d.u.f35513d;
        kVar2.F(uVar);
        k kVarB2 = k.b.b(kVar2);
        kVarB2.f35535d[kVarB2.f35536e - kVarB2.f35533b[kVarB2.f35534c - 1].d()] = i10;
        k.b.j(kVarB2, d.t.b(0), gVar);
        kVar2.n(uVar);
    }

    public final void e() {
        if (!this.f35444c.z()) {
            m0.y("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f35444c.C(this.f35443b);
    }

    public final void f(@NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable g gVar) {
        if (!this.f35444c.y()) {
            m0.y("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f35443b.s(iVar, z5Var, l5Var, gVar);
    }

    public final int g() {
        return this.f35443b.w();
    }

    public final boolean h() {
        return this.f35443b.y();
    }

    public final boolean i() {
        return this.f35443b.z();
    }

    public final <V, T> void j(V v10, @NotNull Function2<? super T, ? super V, Unit> function2) {
        k kVar = this.f35443b;
        d.i0 i0Var = d.i0.f35484d;
        kVar.F(i0Var);
        k kVarB = k.b.b(kVar);
        k.b.j(kVarB, d.t.b(0), v10);
        int iB = d.t.b(1);
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        k.b.j(kVarB, iB, (Function2) r1.q(function2, 2));
        kVar.n(i0Var);
    }
}
