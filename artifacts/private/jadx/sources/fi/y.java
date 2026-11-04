package fi;

import io.ktor.http.Url;
import io.ktor.http.g1;
import io.ktor.http.j1;
import io.ktor.http.k2;
import io.ktor.http.v0;
import io.ktor.http.w0;
import io.ktor.http.w2;
import io.ktor.util.w1;
import io.ktor.utils.io.o0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements g1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f275285g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k2 f275286a = new k2(null, null, 0, null, null, null, null, null, false, 511, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private j1 f275287b = j1.f295897b.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w0 f275288c = new w0(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Object f275289d = io.ktor.client.utils.h.f295415b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private p2 f275290e = q3.c(null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.b f275291f = io.ktor.util.d.a(true);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map n() {
        return new LinkedHashMap();
    }

    @Override // io.ktor.http.g1
    @NotNull
    public w0 O() {
        return this.f275288c;
    }

    @NotNull
    public final z b() {
        Url urlB = this.f275286a.b();
        j1 j1Var = this.f275287b;
        v0 v0VarBuild = O().build();
        Object obj = this.f275289d;
        io.ktor.http.content.w wVar = obj instanceof io.ktor.http.content.w ? (io.ktor.http.content.w) obj : null;
        if (wVar != null) {
            return new z(urlB, j1Var, v0VarBuild, wVar, this.f275290e, this.f275291f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f275289d).toString());
    }

    @NotNull
    public final io.ktor.util.b c() {
        return this.f275291f;
    }

    @NotNull
    public final Object d() {
        return this.f275289d;
    }

    @Nullable
    public final ri.b e() {
        return (ri.b) this.f275291f.e(h0.a());
    }

    @Nullable
    public final <T> T f(@NotNull io.ktor.client.engine.h<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f275291f.e(io.ktor.client.engine.i.b());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    @NotNull
    public final p2 g() {
        return this.f275290e;
    }

    @NotNull
    public final j1 h() {
        return this.f275287b;
    }

    @NotNull
    public final k2 i() {
        return this.f275286a;
    }

    public final void j(@NotNull Function1<? super io.ktor.util.b, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(this.f275291f);
    }

    @o0
    public final void k(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f275289d = obj;
    }

    @o0
    public final void l(@Nullable ri.b bVar) {
        if (bVar != null) {
            this.f275291f.a(h0.a(), bVar);
        } else {
            this.f275291f.c(h0.a());
        }
    }

    public final <T> void m(@NotNull io.ktor.client.engine.h<T> key, @NotNull T capability) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(capability, "capability");
        ((Map) this.f275291f.i(io.ktor.client.engine.i.b(), new Function0() { // from class: fi.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.n();
            }
        })).put(key, capability);
    }

    public final void o(@NotNull p2 p2Var) {
        Intrinsics.checkNotNullParameter(p2Var, "<set-?>");
        this.f275290e = p2Var;
    }

    public final void p(@NotNull j1 j1Var) {
        Intrinsics.checkNotNullParameter(j1Var, "<set-?>");
        this.f275287b = j1Var;
    }

    @NotNull
    public final y q(@NotNull y builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f275287b = builder.f275287b;
        this.f275289d = builder.f275289d;
        l(builder.e());
        w2.t(this.f275286a, builder.f275286a);
        k2 k2Var = this.f275286a;
        k2Var.v(k2Var.g());
        w1.e(O(), builder.O());
        io.ktor.util.e.c(this.f275291f, builder.f275291f);
        return this;
    }

    @o0
    @NotNull
    public final y r(@NotNull y builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f275290e = builder.f275290e;
        return q(builder);
    }

    public final void s(@NotNull Function2<? super k2, ? super k2, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        k2 k2Var = this.f275286a;
        block.invoke(k2Var, k2Var);
    }
}
