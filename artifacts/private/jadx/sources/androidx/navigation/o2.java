package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q3.b("navigation")
@SourceDebugExtension({"SMAP\nNavGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n90#2:135\n106#2:156\n90#2:158\n27#3:136\n46#3:137\n32#3,4:138\n31#3,7:148\n126#4:142\n153#4,3:143\n37#5,2:146\n1#6:155\n1#6:157\n*S KotlinDebug\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n*L\n93#1:135\n94#1:156\n107#1:158\n94#1:136\n94#1:137\n94#1:138,4\n94#1:148,7\n94#1:142\n94#1:143,3\n94#1:146,2\n94#1:155\n*E\n"})
public class o2 extends q3<e2> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f71190e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f71191f = "navigation";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final r3 f71192d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(@NotNull r3 navigatorProvider) {
        super("navigation");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f71192d = navigatorProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, android.os.Bundle] */
    private final void t(n0 n0Var, w2 w2Var, q3.a aVar) {
        Pair[] pairArr;
        y1 y1VarF = n0Var.f();
        Intrinsics.checkNotNull(y1VarF, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        e2 e2Var = (e2) y1VarF;
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        hVar.f312751a = n0Var.b();
        int iY0 = e2Var.Y0();
        String strA1 = e2Var.a1();
        if (iY0 == 0 && strA1 == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + e2Var.A()).toString());
        }
        y1 y1VarJ0 = strA1 != null ? e2Var.J0(strA1, false) : e2Var.P0().g(iY0);
        if (y1VarJ0 == null) {
            throw new IllegalArgumentException("navigation destination " + e2Var.V0() + " is not a direct child of this NavGraph");
        }
        if (strA1 != null) {
            if (!Intrinsics.areEqual(strA1, y1VarJ0.M())) {
                y1.c cVarY = y1VarJ0.Y(strA1);
                Bundle bundleL = cVarY != null ? cVarY.l() : null;
                if (bundleL != null && !androidx.savedstate.f.B0(androidx.savedstate.f.b(bundleL))) {
                    Map mapEmptyMap = MapsKt.emptyMap();
                    if (mapEmptyMap.isEmpty()) {
                        pairArr = new Pair[0];
                    } else {
                        ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                        for (Map.Entry entry : mapEmptyMap.entrySet()) {
                            arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                        }
                        pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    }
                    ?? B = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    Bundle bundleC = androidx.savedstate.n.c(B);
                    androidx.savedstate.n.g(bundleC, bundleL);
                    Bundle bundle = (Bundle) hVar.f312751a;
                    if (bundle != null) {
                        androidx.savedstate.n.g(bundleC, bundle);
                    }
                    hVar.f312751a = B;
                }
            }
            if (!y1VarJ0.u().isEmpty()) {
                List<String> listA = l0.a(y1VarJ0.u(), new Function1() { // from class: androidx.navigation.n2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(o2.u(hVar, (String) obj));
                    }
                });
                if (!listA.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + y1VarJ0 + ". Missing required arguments [" + listA + AbstractJsonLexerKt.END_LIST).toString());
                }
            }
        }
        this.f71192d.f(y1VarJ0.K()).h(CollectionsKt.listOf(e().b(y1VarJ0, y1VarJ0.l((Bundle) hVar.f312751a))), w2Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean u(kotlin.jvm.internal.i1.h hVar, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = hVar.f312751a;
        return t10 == 0 || !androidx.savedstate.f.c(androidx.savedstate.f.b((Bundle) t10), key);
    }

    @Override // androidx.navigation.q3
    public void h(@NotNull List<n0> entries, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator<n0> it = entries.iterator();
        while (it.hasNext()) {
            t(it.next(), w2Var, aVar);
        }
    }

    @Override // androidx.navigation.q3
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e2 c() {
        return new e2(this);
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<List<n0>> s() {
        return e().c();
    }
}
