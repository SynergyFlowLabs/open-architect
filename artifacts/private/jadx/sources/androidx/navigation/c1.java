package androidx.navigation;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends androidx.lifecycle.f2 implements i3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f70632b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, androidx.lifecycle.l2> f70633a = new LinkedHashMap();

    @SourceDebugExtension({"SMAP\nNavControllerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n+ 2 ViewModelProviderGet.kt\nandroidx/lifecycle/ViewModelProviderGetKt\n*L\n1#1,81:1\n29#2:82\n*S KotlinDebug\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n*L\n73#1:82\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c1 a(@NotNull androidx.lifecycle.l2 viewModelStore) {
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            return (c1) androidx.lifecycle.j2.b.c(androidx.lifecycle.j2.f52401b, viewModelStore, e1.f70907a, null, 4, null).f(kotlin.jvm.internal.j1.d(c1.class));
        }

        private a() {
        }
    }

    public final void U(@NotNull String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        androidx.lifecycle.l2 l2VarRemove = this.f70633a.remove(backStackEntryId);
        if (l2VarRemove != null) {
            l2VarRemove.a();
        }
    }

    @Override // androidx.lifecycle.f2
    protected void onCleared() {
        Iterator<androidx.lifecycle.l2> it = this.f70633a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f70633a.clear();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(kotlin.text.d0.c(kotlin.u1.n(androidx.navigation.internal.j0.a(this)), 16));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.f70633a.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // androidx.navigation.i3
    @NotNull
    public androidx.lifecycle.l2 y(@NotNull String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        androidx.lifecycle.l2 l2Var = this.f70633a.get(backStackEntryId);
        if (l2Var == null) {
            l2Var = new androidx.lifecycle.l2();
            this.f70633a.put(backStackEntryId, l2Var);
        }
        return l2Var;
    }
}
