package androidx.savedstate;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSavedState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,46:1\n126#2:47\n153#2,3:48\n37#3,2:51\n1#4:53\n106#5:54\n106#5:55\n*S KotlinDebug\n*F\n+ 1 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n*L\n35#1:47\n35#1:48,3\n35#1:51,2\n37#1:54\n44#1:55\n*E\n"})
final /* synthetic */ class e {

    public static final class a implements Function1<n, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75142a = new a();

        public final void c(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
            c(nVar.O());
            return Unit.f312394a;
        }
    }

    public static final class b implements Function1<n, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f75143a = new b();

        public final void c(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
            c(nVar.O());
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final Bundle a(@NotNull Bundle initialState, @NotNull Function1<? super n, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(n.a(n.c(bundle)));
        return bundle;
    }

    @NotNull
    public static final Bundle b(@NotNull Map<String, ? extends Object> initialState, @NotNull Function1<? super n, Unit> builderAction) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry<String, ? extends Object> entry : initialState.entrySet()) {
                arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(n.a(n.c(bundleB)));
        return bundleB;
    }

    public static /* synthetic */ Bundle c(Bundle initialState, Function1 builderAction, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            builderAction = b.f75143a;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(n.a(n.c(bundle)));
        return bundle;
    }

    public static /* synthetic */ Bundle d(Map initialState, Function1 builderAction, int i10, Object obj) {
        Pair[] pairArr;
        if ((i10 & 1) != 0) {
            initialState = MapsKt.emptyMap();
        }
        if ((i10 & 2) != 0) {
            builderAction = a.f75142a;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry entry : initialState.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(n.a(n.c(bundleB)));
        return bundleB;
    }
}
