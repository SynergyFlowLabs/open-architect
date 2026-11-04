package androidx.compose.runtime.internal;

import androidx.compose.runtime.e4;
import androidx.compose.runtime.z7;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class p0 extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<androidx.compose.runtime.u0<Object>, z7<Object>> implements e4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f36066f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f36067g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final p0 f36068h;

    @w0(parameters = 0)
    public static final class a extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<androidx.compose.runtime.u0<Object>, z7<Object>> implements e4.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f36069i = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private p0 f36070h;

        public a(@NotNull p0 p0Var) {
            super(p0Var);
            this.f36070h = p0Var;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof androidx.compose.runtime.u0) {
                return l((androidx.compose.runtime.u0) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof z7) {
                return m((z7) obj);
            }
            return false;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof androidx.compose.runtime.u0) {
                return n((androidx.compose.runtime.u0) obj);
            }
            boolean z10 = false | false;
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof androidx.compose.runtime.u0) ? obj2 : q((androidx.compose.runtime.u0) obj, (z7) obj2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, androidx.compose.runtime.external.kotlinx.collections.immutable.h.a
        @NotNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public p0 build2() {
            p0 p0Var;
            if (c() == this.f36070h.f()) {
                p0Var = this.f36070h;
            } else {
                i(new i0.f());
                p0Var = new p0(c(), size());
            }
            this.f36070h = p0Var;
            return p0Var;
        }

        public /* bridge */ boolean l(androidx.compose.runtime.u0<Object> u0Var) {
            return super.containsKey(u0Var);
        }

        public /* bridge */ boolean m(z7<Object> z7Var) {
            return super.containsValue(z7Var);
        }

        public /* bridge */ z7<Object> n(androidx.compose.runtime.u0<Object> u0Var) {
            return (z7) super.get(u0Var);
        }

        public final /* bridge */ z7<Object> o(Object obj) {
            if (obj instanceof androidx.compose.runtime.u0) {
                return n((androidx.compose.runtime.u0) obj);
            }
            return null;
        }

        @NotNull
        public final p0 p() {
            return this.f36070h;
        }

        public /* bridge */ z7<Object> q(androidx.compose.runtime.u0<Object> u0Var, z7<Object> z7Var) {
            return (z7) super.getOrDefault(u0Var, z7Var);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof androidx.compose.runtime.u0) {
                return t((androidx.compose.runtime.u0) obj);
            }
            return null;
        }

        public final /* bridge */ z7<Object> s(Object obj, z7<Object> z7Var) {
            return !(obj instanceof androidx.compose.runtime.u0) ? z7Var : q((androidx.compose.runtime.u0) obj, z7Var);
        }

        public /* bridge */ z7<Object> t(androidx.compose.runtime.u0<Object> u0Var) {
            return (z7) super.remove(u0Var);
        }

        public final /* bridge */ z7<Object> u(Object obj) {
            if (obj instanceof androidx.compose.runtime.u0) {
                return t((androidx.compose.runtime.u0) obj);
            }
            return null;
        }

        public final void v(@NotNull p0 p0Var) {
            this.f36070h = p0Var;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        @NotNull
        public final p0 a() {
            return p0.f36068h;
        }

        private b() {
        }
    }

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u uVarA = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u.f35659e.a();
        Intrinsics.checkNotNull(uVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f36068h = new p0(uVarA, 0);
    }

    public p0(@NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u<androidx.compose.runtime.u0<Object>, z7<Object>> uVar, int i10) {
        super(uVar, i10);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<androidx.compose.runtime.u0<Object>, z7<Object>>> T3() {
        return super.T3();
    }

    @Override // androidx.compose.runtime.b1
    public <T> T a(@NotNull androidx.compose.runtime.u0<T> u0Var) {
        return (T) androidx.compose.runtime.c1.c(this, u0Var);
    }

    @Override // androidx.compose.runtime.e4
    @NotNull
    public e4 b2(@NotNull androidx.compose.runtime.u0<Object> u0Var, @NotNull z7<Object> z7Var) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u.b<androidx.compose.runtime.u0<Object>, z7<Object>> bVarS = f().S(u0Var.hashCode(), u0Var, z7Var, 0);
        return bVarS == null ? this : new p0(bVarS.a(), size() + bVarS.b());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof androidx.compose.runtime.u0) {
            return n((androidx.compose.runtime.u0) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof z7) {
            return o((z7) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof androidx.compose.runtime.u0) {
            return p((androidx.compose.runtime.u0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof androidx.compose.runtime.u0) ? obj2 : s((androidx.compose.runtime.u0) obj, (z7) obj2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a c() {
        return new a(this);
    }

    public /* bridge */ boolean n(androidx.compose.runtime.u0<Object> u0Var) {
        return super.containsKey(u0Var);
    }

    public /* bridge */ boolean o(z7<Object> z7Var) {
        return super.containsValue(z7Var);
    }

    public /* bridge */ z7<Object> p(androidx.compose.runtime.u0<Object> u0Var) {
        return (z7) super.get(u0Var);
    }

    public final /* bridge */ z7<Object> q(Object obj) {
        if (obj instanceof androidx.compose.runtime.u0) {
            return p((androidx.compose.runtime.u0) obj);
        }
        return null;
    }

    public /* bridge */ z7<Object> s(androidx.compose.runtime.u0<Object> u0Var, z7<Object> z7Var) {
        return (z7) super.getOrDefault(u0Var, z7Var);
    }

    public final /* bridge */ z7<Object> t(Object obj, z7<Object> z7Var) {
        return !(obj instanceof androidx.compose.runtime.u0) ? z7Var : s((androidx.compose.runtime.u0) obj, z7Var);
    }
}
