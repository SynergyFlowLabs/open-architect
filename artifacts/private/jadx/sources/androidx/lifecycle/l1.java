package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSavedStateHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.android.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,229:1\n1#2:230\n381#3,7:231\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.android.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n115#1:231,7\n*E\n"})
public final class l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f52428c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, b<?>> f52429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private k2.c f52430b;

    @SourceDebugExtension({"SMAP\nSavedStateHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.android.kt\nandroidx/lifecycle/SavedStateHandle$Companion\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,229:1\n90#2:230\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.android.kt\nandroidx/lifecycle/SavedStateHandle$Companion\n*L\n217#1:230\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public final l1 a(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new l1();
            }
            ClassLoader classLoader = l1.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            bundle.setClassLoader(classLoader);
            return new l1(androidx.savedstate.f.E0(androidx.savedstate.f.b(bundle)));
        }

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public final boolean b(@Nullable Object obj) {
            return k2.d.a(obj);
        }

        private a() {
        }
    }

    public l1(@NotNull Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f52429a = new LinkedHashMap();
        this.f52430b = new k2.c(initialState);
    }

    @oj.n
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final l1 d(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        return f52428c.a(bundle, bundle2);
    }

    private final <T> c1<T> h(String str, boolean z10, T t10) {
        b<?> bVar;
        if (this.f52430b.e().containsKey(str)) {
            throw new IllegalArgumentException(p1.b(str).toString());
        }
        Map<String, b<?>> map = this.f52429a;
        b<?> bVar2 = map.get(str);
        if (bVar2 == null) {
            if (this.f52430b.g().containsKey(str)) {
                bVar = new b<>(this, str, this.f52430b.g().get(str));
            } else if (z10) {
                this.f52430b.g().put(str, t10);
                bVar = new b<>(this, str, t10);
            } else {
                bVar = new b<>(this, str);
            }
            bVar2 = bVar;
            map.put(str, bVar2);
        }
        return bVar2;
    }

    @androidx.annotation.l0
    public final void b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f52430b.b(key);
    }

    @androidx.annotation.l0
    public final boolean c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f52430b.c(key);
    }

    @androidx.annotation.l0
    @Nullable
    public final <T> T e(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.f52430b.d(key);
    }

    @androidx.annotation.l0
    @NotNull
    public final <T> c1<T> f(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c1<T> c1VarH = h(key, false, null);
        Intrinsics.checkNotNull(c1VarH, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return c1VarH;
    }

    @androidx.annotation.l0
    @NotNull
    public final <T> c1<T> g(@NotNull String key, T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return h(key, true, t10);
    }

    @androidx.annotation.l0
    @NotNull
    public final <T> kotlinx.coroutines.flow.k0<T> i(@NotNull String key, T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f52429a.containsKey(key)) {
            throw new IllegalArgumentException(p1.b(key).toString());
        }
        return this.f52430b.f(key, t10);
    }

    @androidx.annotation.l0
    @NotNull
    public final <T> kotlinx.coroutines.flow.z0<T> j(@NotNull String key, T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f52430b.e().containsKey(key) ? kotlinx.coroutines.flow.k.n(this.f52430b.f(key, t10)) : this.f52430b.i(key, t10);
    }

    @androidx.annotation.l0
    @NotNull
    public final Set<String> k() {
        return SetsKt.plus((Set) this.f52430b.j(), (Iterable) this.f52429a.keySet());
    }

    @androidx.annotation.l0
    @Nullable
    public final <T> T l(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = (T) this.f52430b.k(key);
        b<?> bVarRemove = this.f52429a.remove(key);
        if (bVarRemove != null) {
            bVarRemove.s();
        }
        return t10;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final androidx.savedstate.j.b m() {
        return this.f52430b.h();
    }

    @androidx.annotation.l0
    public final <T> void n(@NotNull String key, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (f52428c.b(t10)) {
            b<?> bVar = this.f52429a.get(key);
            b<?> bVar2 = bVar instanceof c1 ? bVar : null;
            if (bVar2 != null) {
                bVar2.r(t10);
            }
            this.f52430b.n(key, t10);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        Intrinsics.checkNotNull(t10);
        sb2.append(t10.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @androidx.annotation.l0
    public final void o(@NotNull String key, @NotNull androidx.savedstate.j.b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f52430b.o(key, provider);
    }

    public static final class b<T> extends c1<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private String f52431m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        private l1 f52432n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@Nullable l1 l1Var, @NotNull String key, T t10) {
            super(t10);
            Intrinsics.checkNotNullParameter(key, "key");
            this.f52431m = key;
            this.f52432n = l1Var;
        }

        @Override // androidx.lifecycle.c1, androidx.lifecycle.w0
        public void r(T t10) {
            k2.c cVar;
            l1 l1Var = this.f52432n;
            if (l1Var != null && (cVar = l1Var.f52430b) != null) {
                cVar.n(this.f52431m, t10);
            }
            super.r(t10);
        }

        public final void s() {
            this.f52432n = null;
        }

        public b(@Nullable l1 l1Var, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f52431m = key;
            this.f52432n = l1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l1() {
        this.f52429a = new LinkedHashMap();
        this.f52430b = new k2.c(null, 1, 0 == true ? 1 : 0);
    }
}
