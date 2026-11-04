package androidx.compose.ui.tooling;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nViewInfoUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfoUtil.android.kt\nandroidx/compose/ui/tooling/ViewInfoUtil_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1368#2:70\n1454#2,2:71\n1368#2:73\n1454#2,5:74\n1456#2,3:79\n1863#2,2:82\n*S KotlinDebug\n*F\n+ 1 ViewInfoUtil.android.kt\nandroidx/compose/ui/tooling/ViewInfoUtil_androidKt\n*L\n24#1:70\n24#1:71,2\n26#1:73\n26#1:74,5\n24#1:79,3\n58#1:82,2\n*E\n"})
public final class k0 {
    private static final List<e0> f(List<e0> list, Function1<? super e0, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : list) {
            List<e0> listF = f(e0Var.l(), function1);
            ArrayList arrayList2 = new ArrayList();
            for (e0 e0Var2 : listF) {
                CollectionsKt.addAll(arrayList2, e0Var2.p() == null ? e0Var2.l() : CollectionsKt.listOf(e0Var2));
            }
            CollectionsKt.addAll(arrayList, function1.invoke(e0Var).booleanValue() ? CollectionsKt.listOf(new e0(e0Var.m(), e0Var.o(), e0Var.k(), e0Var.p(), arrayList2, e0Var.n(), e0Var.q())) : CollectionsKt.listOf(new e0("<root>", -1, androidx.compose.ui.unit.s.f42713e.a(), null, arrayList2, null, null)));
        }
        return arrayList;
    }

    static /* synthetic */ List g(List list, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.ui.tooling.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(k0.h((e0) obj2));
                }
            };
        }
        return f(list, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(e0 e0Var) {
        return true;
    }

    @NotNull
    public static final String i(@NotNull List<e0> list, int i10, @NotNull Function1<? super e0, Boolean> function1) {
        String strG2 = StringsKt.g2(".", i10);
        StringBuilder sb2 = new StringBuilder();
        for (e0 e0Var : CollectionsKt.sortedWith(f(list, function1), kotlin.comparisons.a.h(new Function1() { // from class: androidx.compose.ui.tooling.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k0.l((e0) obj);
            }
        }, new Function1() { // from class: androidx.compose.ui.tooling.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k0.m((e0) obj);
            }
        }, new Function1() { // from class: androidx.compose.ui.tooling.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k0.n((e0) obj);
            }
        }))) {
            if (e0Var.p() != null) {
                sb2.append(strG2 + '|' + e0Var.m() + AbstractJsonLexerKt.COLON + e0Var.o());
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                sb2.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append(strG2 + "|<root>");
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                sb2.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
            String string = StringsKt.E5(i(e0Var.l(), i10 + 1, function1)).toString();
            if (string.length() > 0) {
                sb2.append(string);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                sb2.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String j(List list, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            function1 = new Function1() { // from class: androidx.compose.ui.tooling.i0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(k0.k((e0) obj2));
                }
            };
        }
        return i(list, i10, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(e0 e0Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable l(e0 e0Var) {
        return e0Var.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable m(e0 e0Var) {
        return Integer.valueOf(e0Var.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable n(e0 e0Var) {
        return Integer.valueOf(e0Var.a().size());
    }
}
