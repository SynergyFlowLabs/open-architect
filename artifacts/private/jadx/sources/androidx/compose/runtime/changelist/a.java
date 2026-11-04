package androidx.compose.runtime.changelist;

import androidx.compose.runtime.h3;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.internal.j0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l1;
import androidx.compose.runtime.l5;
import androidx.compose.runtime.n5;
import androidx.compose.runtime.o0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s4;
import androidx.compose.runtime.w5;
import androidx.compose.runtime.x;
import androidx.compose.runtime.z5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RememberPausingScope\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$StartResumingScope\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndResumingScope\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 8 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 23 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 24 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 25 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 26 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 27 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 28 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 29 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,338:1\n204#2,2:339\n207#2,2:342\n204#2,2:344\n207#2,2:347\n204#2,2:349\n207#2,2:352\n204#2,2:354\n207#2,2:357\n204#2,2:359\n360#2:372\n357#2:373\n207#2,2:375\n204#2,2:377\n360#2:393\n357#2:394\n207#2,2:396\n204#2,2:398\n207#2,2:404\n204#2,2:406\n360#2:418\n357#2:419\n207#2,2:421\n204#2,2:423\n207#2,2:426\n204#2,2:428\n207#2,2:431\n204#2,2:433\n207#2,2:439\n204#2,2:441\n207#2,2:446\n204#2,2:448\n360#2:460\n357#2:461\n207#2,2:463\n204#2,2:465\n207#2,2:469\n204#2,2:471\n207#2,2:477\n204#2,2:479\n357#2:495\n207#2,2:500\n204#2,2:502\n357#2:523\n207#2,2:529\n204#2,2:531\n360#2:543\n357#2:544\n207#2,2:546\n204#2,2:548\n360#2:560\n357#2:561\n207#2,2:563\n204#2,2:565\n207#2,2:568\n204#2,2:570\n207#2,2:573\n204#2,2:575\n207#2,2:579\n204#2,2:581\n207#2,2:585\n204#2,2:587\n207#2,2:593\n204#2,2:595\n207#2,2:600\n204#2,2:602\n207#2,2:606\n174#3:341\n194#4:346\n215#5:351\n236#6:356\n315#7:361\n318#7:362\n371#8,9:363\n380#8:374\n371#8,9:384\n380#8:395\n371#8,9:409\n380#8:420\n371#8,9:451\n380#8:462\n388#8,10:485\n398#8,4:496\n411#8,11:512\n422#8,5:524\n371#8,9:534\n380#8:545\n371#8,9:551\n380#8:562\n354#9,4:379\n360#9:383\n257#10,4:400\n286#11:408\n402#12:425\n433#13:430\n622#14,4:435\n655#15:443\n658#15:444\n661#15:445\n464#16:450\n506#17:467\n509#17:468\n544#18,4:473\n570#19,4:481\n597#20:504\n594#20,7:505\n131#21:533\n87#22:550\n107#23:567\n154#24:572\n807#25:577\n810#25:578\n843#26:583\n840#26:584\n872#27:589\n875#27:590\n881#27:591\n878#27:592\n943#28:597\n946#28:598\n949#28:599\n981#29:604\n984#29:605\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n98#1:339,2\n98#1:342,2\n102#1:344,2\n102#1:347,2\n106#1:349,2\n106#1:352,2\n110#1:354,2\n110#1:357,2\n114#1:359,2\n116#1:372\n116#1:373\n114#1:375,2\n121#1:377,2\n123#1:393\n123#1:394\n121#1:396,2\n128#1:398,2\n128#1:404,2\n134#1:406,2\n134#1:418\n134#1:419\n134#1:421,2\n146#1:423,2\n146#1:426,2\n154#1:428,2\n154#1:431,2\n170#1:433,2\n170#1:439,2\n176#1:441,2\n176#1:446,2\n189#1:448,2\n189#1:460\n189#1:461\n189#1:463,2\n193#1:465,2\n193#1:469,2\n210#1:471,2\n210#1:477,2\n217#1:479,2\n218#1:495\n217#1:500,2\n223#1:502,2\n224#1:523\n223#1:529,2\n229#1:531,2\n229#1:543\n229#1:544\n229#1:546,2\n233#1:548,2\n233#1:560\n233#1:561\n233#1:563,2\n238#1:565,2\n238#1:568,2\n243#1:570,2\n243#1:573,2\n247#1:575,2\n247#1:579,2\n259#1:581,2\n259#1:585,2\n277#1:587,2\n277#1:593,2\n297#1:595,2\n297#1:600,2\n315#1:602,2\n315#1:606,2\n98#1:341\n102#1:346\n106#1:351\n110#1:356\n115#1:361\n116#1:362\n116#1:363,9\n116#1:374\n123#1:384,9\n123#1:395\n134#1:409,9\n134#1:420\n189#1:451,9\n189#1:462\n218#1:485,10\n218#1:496,4\n224#1:512,11\n224#1:524,5\n229#1:534,9\n229#1:545\n233#1:551,9\n233#1:562\n122#1:379,4\n123#1:383\n129#1:400,4\n134#1:408\n146#1:425\n154#1:430\n171#1:435,4\n178#1:443\n180#1:444\n182#1:445\n189#1:450\n195#1:467\n197#1:468\n212#1:473,4\n218#1:481,4\n224#1:504\n224#1:505,7\n229#1:533\n233#1:550\n238#1:567\n243#1:572\n249#1:577\n251#1:578\n261#1:583\n263#1:584\n279#1:589\n281#1:590\n283#1:591\n285#1:592\n299#1:597\n301#1:598\n303#1:599\n317#1:604\n319#1:605\n*E\n"})
public final class a extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35425c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f35426b = new k();

    public static /* synthetic */ void v(a aVar, a aVar2, j0 j0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j0Var = null;
            int i11 = 4 ^ 0;
        }
        aVar.u(aVar2, j0Var);
    }

    public final void A(@NotNull l1 l1Var, @NotNull p0 p0Var, @NotNull i3 i3Var) {
        k kVar = this.f35426b;
        d.v vVar = d.v.f35515d;
        kVar.F(vVar);
        k.b.m(k.b.b(kVar), d.t.b(0), l1Var, d.t.b(1), p0Var, d.t.b(2), i3Var);
        kVar.n(vVar);
    }

    public final void B(@NotNull n5 n5Var) {
        k kVar = this.f35426b;
        d.w wVar = d.w.f35517d;
        kVar.F(wVar);
        k.b.j(k.b.b(kVar), d.t.b(0), n5Var);
        kVar.n(wVar);
    }

    public final void C(@NotNull s4 s4Var) {
        k kVar = this.f35426b;
        d.x xVar = d.x.f35519d;
        kVar.F(xVar);
        k.b.j(k.b.b(kVar), d.t.b(0), s4Var);
        kVar.n(xVar);
    }

    public final void D() {
        this.f35426b.D(d.y.f35521d);
    }

    public final void E(int i10, int i11) {
        k kVar = this.f35426b;
        d.z zVar = d.z.f35523d;
        kVar.F(zVar);
        k kVarB = k.b.b(kVar);
        int iD = kVarB.f35536e - kVarB.f35533b[kVarB.f35534c - 1].d();
        int[] iArr = kVarB.f35535d;
        iArr[iD] = i10;
        iArr[iD + 1] = i11;
        kVar.n(zVar);
    }

    public final void F() {
        this.f35426b.D(d.a0.f35450d);
    }

    public final void G(@NotNull Function0<Unit> function0) {
        k kVar = this.f35426b;
        d.b0 b0Var = d.b0.f35454d;
        kVar.F(b0Var);
        k.b.j(k.b.b(kVar), d.t.b(0), function0);
        kVar.n(b0Var);
    }

    public final void H() {
        this.f35426b.D(d.c0.f35458d);
    }

    public final void I(@NotNull s4 s4Var) {
        k kVar = this.f35426b;
        d.d0 d0Var = d.d0.f35462d;
        kVar.F(d0Var);
        k.b.j(k.b.b(kVar), d.t.b(0), s4Var);
        kVar.n(d0Var);
    }

    public final void J(int i10) {
        k kVar = this.f35426b;
        d.f0 f0Var = d.f0.f35472d;
        kVar.F(f0Var);
        k kVarB = k.b.b(kVar);
        kVarB.f35535d[kVarB.f35536e - kVarB.f35533b[kVarB.f35534c - 1].d()] = i10;
        kVar.n(f0Var);
    }

    public final void K(@Nullable Object obj, @NotNull androidx.compose.runtime.g gVar, int i10) {
        k kVar = this.f35426b;
        d.g0 g0Var = d.g0.f35476d;
        kVar.F(g0Var);
        k kVarB = k.b.b(kVar);
        k.b.k(kVarB, d.t.b(0), obj, d.t.b(1), gVar);
        kVarB.f35535d[kVarB.f35536e - kVarB.f35533b[kVarB.f35534c - 1].d()] = i10;
        kVar.n(g0Var);
    }

    public final void L(@Nullable Object obj) {
        k kVar = this.f35426b;
        d.h0 h0Var = d.h0.f35480d;
        kVar.F(h0Var);
        k.b.j(k.b.b(kVar), d.t.b(0), obj);
        kVar.n(h0Var);
    }

    public final <T, V> void M(V v10, @NotNull Function2<? super T, ? super V, Unit> function2) {
        k kVar = this.f35426b;
        d.i0 i0Var = d.i0.f35484d;
        kVar.F(i0Var);
        k kVarB = k.b.b(kVar);
        int iB = d.t.b(0);
        int iB2 = d.t.b(1);
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        k.b.k(kVarB, iB, v10, iB2, (Function2) r1.q(function2, 2));
        kVar.n(i0Var);
    }

    public final void N(@Nullable Object obj, int i10) {
        k kVar = this.f35426b;
        d.j0 j0Var = d.j0.f35488d;
        kVar.F(j0Var);
        k kVarB = k.b.b(kVar);
        k.b.j(kVarB, d.t.b(0), obj);
        kVarB.f35535d[kVarB.f35536e - kVarB.f35533b[kVarB.f35534c - 1].d()] = i10;
        kVar.n(j0Var);
    }

    public final void O(int i10) {
        k kVar = this.f35426b;
        d.k0 k0Var = d.k0.f35492d;
        kVar.F(k0Var);
        k kVarB = k.b.b(kVar);
        kVarB.f35535d[kVarB.f35536e - kVarB.f35533b[kVarB.f35534c - 1].d()] = i10;
        kVar.n(k0Var);
    }

    public final void P(@Nullable Object obj) {
        if (obj instanceof x) {
            this.f35426b.D(d.l0.f35496d);
        }
    }

    @Override // androidx.compose.runtime.changelist.l
    @NotNull
    public String a(@NotNull String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChangeList instance containing ");
        sb2.append(e());
        sb2.append(" operations");
        if (sb2.length() > 0) {
            sb2.append(":\n");
            sb2.append(this.f35426b.a(str));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void c() {
        this.f35426b.i();
    }

    public final void d(@NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable g gVar) {
        this.f35426b.s(iVar, z5Var, l5Var, gVar);
    }

    public final int e() {
        return this.f35426b.w();
    }

    public final boolean f() {
        return this.f35426b.y();
    }

    public final boolean g() {
        return this.f35426b.z();
    }

    public final void h(int i10) {
        k kVar = this.f35426b;
        d.a aVar = d.a.f35448d;
        kVar.F(aVar);
        k kVarB = k.b.b(kVar);
        kVarB.f35535d[kVarB.f35536e - kVarB.f35533b[kVarB.f35534c - 1].d()] = i10;
        kVar.n(aVar);
    }

    public final void i(@NotNull androidx.compose.runtime.g gVar, @Nullable Object obj) {
        k kVar = this.f35426b;
        d.b bVar = d.b.f35452d;
        kVar.F(bVar);
        k.b.k(k.b.b(kVar), d.t.b(0), gVar, d.t.b(1), obj);
        kVar.n(bVar);
    }

    public final void j(@NotNull List<? extends Object> list, @NotNull j0 j0Var) {
        if (!list.isEmpty()) {
            k kVar = this.f35426b;
            d.C0270d c0270d = d.C0270d.f35460d;
            kVar.F(c0270d);
            k.b.k(k.b.b(kVar), d.t.b(1), list, d.t.b(0), j0Var);
            kVar.n(c0270d);
        }
    }

    public final void k(@Nullable h3 h3Var, @NotNull p0 p0Var, @NotNull i3 i3Var, @NotNull i3 i3Var2) {
        k kVar = this.f35426b;
        d.e eVar = d.e.f35464d;
        kVar.F(eVar);
        k.b.l(k.b.b(kVar), d.t.b(0), h3Var, d.t.b(1), p0Var, d.t.b(3), i3Var2, d.t.b(2), i3Var);
        kVar.n(eVar);
    }

    public final void l() {
        this.f35426b.D(d.f.f35470d);
    }

    public final void m(@NotNull j0 j0Var, @NotNull androidx.compose.runtime.g gVar) {
        k kVar = this.f35426b;
        d.g gVar2 = d.g.f35474d;
        kVar.F(gVar2);
        k.b.k(k.b.b(kVar), d.t.b(0), j0Var, d.t.b(1), gVar);
        kVar.n(gVar2);
    }

    public final void n(@NotNull Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        k kVar = this.f35426b;
        d.h hVar = d.h.f35478d;
        kVar.F(hVar);
        k.b.j(k.b.b(kVar), d.t.b(0), objArr);
        kVar.n(hVar);
    }

    public final void o(@NotNull Function1<? super o0, Unit> function1, @NotNull o0 o0Var) {
        k kVar = this.f35426b;
        d.i iVar = d.i.f35482d;
        kVar.F(iVar);
        k.b.k(k.b.b(kVar), d.t.b(0), function1, d.t.b(1), o0Var);
        kVar.n(iVar);
    }

    public final void p() {
        this.f35426b.D(d.j.f35486d);
    }

    public final void q() {
        this.f35426b.D(d.k.f35490d);
    }

    public final void r(@NotNull s4 s4Var) {
        k kVar = this.f35426b;
        d.l lVar = d.l.f35494d;
        kVar.F(lVar);
        k.b.j(k.b.b(kVar), d.t.b(0), s4Var);
        kVar.n(lVar);
    }

    public final void s(@NotNull androidx.compose.runtime.g gVar) {
        k kVar = this.f35426b;
        d.m mVar = d.m.f35498d;
        kVar.F(mVar);
        k.b.j(k.b.b(kVar), d.t.b(0), gVar);
        kVar.n(mVar);
    }

    public final void t() {
        this.f35426b.D(d.n.f35500d);
    }

    public final void u(@NotNull a aVar, @Nullable j0 j0Var) {
        if (aVar.g()) {
            k kVar = this.f35426b;
            d.c cVar = d.c.f35456d;
            kVar.F(cVar);
            k.b.k(k.b.b(kVar), d.t.b(0), aVar, d.t.b(1), j0Var);
            kVar.n(cVar);
        }
    }

    public final void w(@NotNull androidx.compose.runtime.g gVar, @NotNull w5 w5Var) {
        k kVar = this.f35426b;
        d.p pVar = d.p.f35504d;
        kVar.F(pVar);
        k.b.k(k.b.b(kVar), d.t.b(0), gVar, d.t.b(1), w5Var);
        kVar.n(pVar);
    }

    public final void x(@NotNull androidx.compose.runtime.g gVar, @NotNull w5 w5Var, @NotNull c cVar) {
        k kVar = this.f35426b;
        d.q qVar = d.q.f35506d;
        kVar.F(qVar);
        k.b.m(k.b.b(kVar), d.t.b(0), gVar, d.t.b(1), w5Var, d.t.b(2), cVar);
        kVar.n(qVar);
    }

    public final void y(int i10) {
        k kVar = this.f35426b;
        d.r rVar = d.r.f35508d;
        kVar.F(rVar);
        k kVarB = k.b.b(kVar);
        kVarB.f35535d[kVarB.f35536e - kVarB.f35533b[kVarB.f35534c - 1].d()] = i10;
        kVar.n(rVar);
    }

    public final void z(int i10, int i11, int i12) {
        k kVar = this.f35426b;
        d.s sVar = d.s.f35510d;
        kVar.F(sVar);
        k kVarB = k.b.b(kVar);
        int iD = kVarB.f35536e - kVarB.f35533b[kVarB.f35534c - 1].d();
        int[] iArr = kVarB.f35535d;
        iArr[iD + 1] = i10;
        iArr[iD] = i11;
        iArr[iD + 2] = i12;
        kVar.n(sVar);
    }
}
