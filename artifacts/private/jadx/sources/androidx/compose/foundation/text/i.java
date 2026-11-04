package androidx.compose.foundation.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,81:1\n35#2,5:82\n35#2,3:87\n39#2:129\n1282#3,6:90\n80#4:96\n78#4,8:97\n87#4,3:114\n90#4,2:123\n94#4:128\n391#5,9:105\n400#5,3:125\n4360#6,6:117\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n*L\n47#1:82,5\n69#1:87,3\n69#1:129\n70#1:90,6\n70#1:96\n70#1:97,8\n70#1:114,3\n70#1:123,2\n70#1:128\n70#1:105,9\n70#1:125,3\n70#1:117,6\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Pair<List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>>, List<androidx.compose.ui.text.f.e<pj.n<String, androidx.compose.runtime.c0, Integer, Unit>>>> f19369a = new Pair<>(CollectionsKt.emptyList(), CollectionsKt.emptyList());

    @SourceDebugExtension({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,81:1\n151#2,2:82\n35#2,5:84\n153#2:89\n35#2,5:90\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1\n*L\n71#1:82,2\n71#1:84,5\n71#1:89\n73#1:90,5\n*E\n"})
    static final class a implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19370a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(List list, androidx.compose.ui.layout.i2.a aVar) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list.get(i10), 0, 0, 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).P0(j10));
            }
            return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, new Function1() { // from class: androidx.compose.foundation.text.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.a.g(arrayList, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(@NotNull final androidx.compose.ui.text.f fVar, @NotNull final List<androidx.compose.ui.text.f.e<pj.n<String, androidx.compose.runtime.c0, Integer, Unit>>> list, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1794596951);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(list) ? 32 : 16;
        }
        int i12 = 0;
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1794596951, i11, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            int i13 = 0;
            while (i13 < size) {
                androidx.compose.ui.text.f.e<pj.n<String, androidx.compose.runtime.c0, Integer, Unit>> eVar = list.get(i13);
                pj.n<String, androidx.compose.runtime.c0, Integer, Unit> nVarA = eVar.a();
                int iB = eVar.b();
                int iC = eVar.c();
                Object objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = a.f19370a;
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i12));
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                int i14 = i12;
                androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                nVarA.invoke(fVar.subSequence(iB, iC).m(), c0VarR, Integer.valueOf(i14));
                c0VarR.o();
                i13++;
                i12 = i14;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.c(fVar, list, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.text.f fVar, List list, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        b(fVar, list, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final boolean d(@NotNull androidx.compose.ui.text.f fVar) {
        return fVar.r(q3.f20777a, 0, fVar.m().length());
    }

    @NotNull
    public static final Pair<List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>>, List<androidx.compose.ui.text.f.e<pj.n<String, androidx.compose.runtime.c0, Integer, Unit>>>> e(@NotNull androidx.compose.ui.text.f fVar, @Nullable Map<String, p3> map) {
        if (map != null && !map.isEmpty()) {
            List<androidx.compose.ui.text.f.e<String>> listL = fVar.l(q3.f20777a, 0, fVar.m().length());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = listL.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.text.f.e<String> eVar = listL.get(i10);
                p3 p3Var = map.get(eVar.h());
                if (p3Var != null) {
                    arrayList.add(new androidx.compose.ui.text.f.e(p3Var.b(), eVar.i(), eVar.g()));
                    arrayList2.add(new androidx.compose.ui.text.f.e(p3Var.a(), eVar.i(), eVar.g()));
                }
            }
            return new Pair<>(arrayList, arrayList2);
        }
        return f19369a;
    }
}
