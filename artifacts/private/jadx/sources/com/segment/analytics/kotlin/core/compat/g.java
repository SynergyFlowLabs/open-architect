package com.segment.analytics.kotlin.core.compat;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.k;
import com.segment.analytics.kotlin.core.l;
import com.segment.analytics.kotlin.core.s;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.s0;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.m0;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJavaAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnalytics.kt\ncom/segment/analytics/kotlin/core/compat/JavaAnalytics\n+ 2 Analytics.kt\ncom/segment/analytics/kotlin/core/Analytics\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n191#2,7:398\n344#2,7:405\n268#2,6:412\n412#2,8:418\n473#2,7:426\n1#3:433\n*S KotlinDebug\n*F\n+ 1 JavaAnalytics.kt\ncom/segment/analytics/kotlin/core/compat/JavaAnalytics\n*L\n73#1:398,7\n112#1:405,7\n165#1:412,6\n218#1:418,8\n263#1:426,7\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.a f266801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sovran.kotlin.e f266802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s f266803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s0 f266804d;

    /* synthetic */ class a extends g0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            int i10 = 6 ^ 0;
        }

        public final void X(@NotNull com.segment.analytics.kotlin.core.platform.e p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((Consumer) this.receiver).accept(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
            X(eVar);
            return Unit.f312394a;
        }
    }

    public g(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f266801a = analytics;
        W(analytics);
    }

    public static /* synthetic */ void C(g gVar, String str, JsonObject jsonObject, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jsonObject = l.b();
        }
        gVar.z(str, jsonObject);
    }

    public static /* synthetic */ void D(g gVar, JsonObject jsonObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jsonObject = l.b();
        }
        gVar.B(jsonObject);
    }

    public static /* synthetic */ void R(g gVar, String str, h hVar, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        gVar.M(str, hVar, str2);
    }

    public static /* synthetic */ void S(g gVar, String str, Map map, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        gVar.O(str, map, str2);
    }

    public static /* synthetic */ void T(g gVar, String str, JsonObject jsonObject, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jsonObject = l.b();
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        gVar.Q(str, jsonObject, str2);
    }

    private final void W(com.segment.analytics.kotlin.core.a aVar) {
        this.f266802b = aVar.a();
        this.f266803c = aVar.w();
        this.f266804d = aVar.c();
    }

    public static /* synthetic */ void b0(g gVar, String str, JsonObject jsonObject, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jsonObject = l.b();
        }
        gVar.a0(str, jsonObject);
    }

    private static Object m(g gVar) {
        return j1.j(new t0(gVar.f266801a, com.segment.analytics.kotlin.core.a.class, "enabled", "getEnabled()Z", 0));
    }

    public static /* synthetic */ void t(g gVar, String str, JsonObject jsonObject, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jsonObject = l.b();
        }
        gVar.s(str, jsonObject);
    }

    public final void A(@NotNull Map<String, ? extends Object> traits) {
        Intrinsics.checkNotNullParameter(traits, "traits");
        this.f266801a.J(traits, new e1(b3.f315897a, m0.d(com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule(), j1.d(Object.class))), null);
    }

    @j
    public final void B(@NotNull JsonObject traits) {
        Intrinsics.checkNotNullParameter(traits, "traits");
        com.segment.analytics.kotlin.core.a.W(this.f266801a, traits, null, 2, null);
    }

    @NotNull
    public final List<String> E() {
        return this.f266801a.X();
    }

    public final void F(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        com.segment.analytics.kotlin.core.a.Z(this.f266801a, event, null, 2, null);
    }

    public final void G() {
        this.f266801a.a0();
    }

    public final void H(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f266801a.b0(filePath);
    }

    @NotNull
    public final g I(@NotNull com.segment.analytics.kotlin.core.platform.e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.f266801a.c0(plugin);
        return this;
    }

    public final void J(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        k.d(this.f266801a, error);
    }

    public final void K() {
        this.f266801a.d0();
    }

    @j
    public final void L(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        T(this, title, null, null, 6, null);
    }

    public final void M(@NotNull String title, @NotNull h serializable, @NotNull String category) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serializable, "serializable");
        Intrinsics.checkNotNullParameter(category, "category");
        com.segment.analytics.kotlin.core.a.m0(this.f266801a, title, serializable.serialize(), category, null, 8, null);
    }

    @j
    public final void N(@NotNull String title, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(properties, "properties");
        int i10 = 4 << 0;
        S(this, title, properties, null, 4, null);
    }

    @j
    public final void O(@NotNull String title, @NotNull Map<String, ? extends Object> properties, @NotNull String category) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f266801a.g0(title, properties, new e1(b3.f315897a, m0.d(com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule(), j1.d(Object.class))), category, null);
    }

    @j
    public final void P(@NotNull String title, @NotNull JsonObject properties) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(properties, "properties");
        int i10 = 3 << 4;
        T(this, title, properties, null, 4, null);
    }

    @j
    public final void Q(@NotNull String title, @NotNull JsonObject properties, @NotNull String category) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(category, "category");
        com.segment.analytics.kotlin.core.a.m0(this.f266801a, title, properties, category, null, 8, null);
    }

    public final void U(boolean z10) {
        this.f266801a.n0(z10);
    }

    @Nullable
    public final Settings V() {
        return this.f266801a.p0();
    }

    @j
    public final void X(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        b0(this, name, null, 2, null);
    }

    public final void Y(@NotNull String name, @NotNull h serializable) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serializable, "serializable");
        com.segment.analytics.kotlin.core.a.z0(this.f266801a, name, serializable.serialize(), null, 4, null);
    }

    public final void Z(@NotNull String name, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f266801a.u0(name, properties, new e1(b3.f315897a, m0.d(com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule(), j1.d(Object.class))), null);
    }

    @NotNull
    public final g a(@NotNull com.segment.analytics.kotlin.core.platform.e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.f266801a.j(plugin);
        return this;
    }

    @j
    public final void a0(@NotNull String name, @NotNull JsonObject properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        int i10 = 6 | 0;
        com.segment.analytics.kotlin.core.a.z0(this.f266801a, name, properties, null, 4, null);
    }

    public final void b(@NotNull String newId) {
        Intrinsics.checkNotNullParameter(newId, "newId");
        com.segment.analytics.kotlin.core.a.l(this.f266801a, newId, null, 2, null);
    }

    @NotNull
    public final String c() {
        return this.f266801a.m();
    }

    @Nullable
    public final JsonObject c0() {
        return this.f266801a.B0();
    }

    public final void d(@NotNull Consumer<? super com.segment.analytics.kotlin.core.platform.e> closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        this.f266801a.o(new a(closure));
    }

    @Nullable
    public final String d0() {
        return this.f266801a.G0();
    }

    public final void e(@NotNull Function1<? super com.segment.analytics.kotlin.core.platform.e, Unit> closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        this.f266801a.o(closure);
    }

    @NotNull
    public final String e0() {
        return this.f266801a.I0();
    }

    @Nullable
    public final com.segment.analytics.kotlin.core.platform.a f(@NotNull String destinationKey) {
        Intrinsics.checkNotNullParameter(destinationKey, "destinationKey");
        return this.f266801a.q(destinationKey);
    }

    @Nullable
    public final <T extends com.segment.analytics.kotlin.core.platform.e> T g(@NotNull Class<T> plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        return (T) this.f266801a.r(oj.b.i(plugin));
    }

    @NotNull
    public final <T extends com.segment.analytics.kotlin.core.platform.e> List<T> h(@NotNull Class<T> plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        return this.f266801a.s(oj.b.i(plugin));
    }

    public final void i() {
        this.f266801a.t();
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.a j() {
        return this.f266801a;
    }

    @NotNull
    public final s0 k() {
        s0 s0Var = this.f266804d;
        if (s0Var != null) {
            return s0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsScope");
        return null;
    }

    public final boolean l() {
        return this.f266801a.v();
    }

    @NotNull
    public final s n() {
        s sVar = this.f266803c;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("storage");
        return null;
    }

    @NotNull
    public final sovran.kotlin.e o() {
        sovran.kotlin.e eVar = this.f266802b;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("store");
        return null;
    }

    @j
    public final void p(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        t(this, groupId, null, 2, null);
    }

    public final void q(@NotNull String groupId, @NotNull h serializable) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(serializable, "serializable");
        com.segment.analytics.kotlin.core.a.G(this.f266801a, groupId, serializable.serialize(), null, 4, null);
    }

    public final void r(@NotNull String groupId, @NotNull Map<String, ? extends Object> traits) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        this.f266801a.B(groupId, traits, new e1(b3.f315897a, m0.d(com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule(), j1.d(Object.class))), null);
    }

    @j
    public final void s(@NotNull String groupId, @NotNull JsonObject traits) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        com.segment.analytics.kotlin.core.a.G(this.f266801a, groupId, traits, null, 4, null);
    }

    @j
    public final void u() {
        D(this, null, 1, null);
    }

    public final void v(@NotNull h serializable) {
        Intrinsics.checkNotNullParameter(serializable, "serializable");
        com.segment.analytics.kotlin.core.a.W(this.f266801a, serializable.serialize(), null, 2, null);
    }

    @j
    public final void w(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        C(this, userId, null, 2, null);
    }

    public final void x(@NotNull String userId, @NotNull h serializable) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(serializable, "serializable");
        com.segment.analytics.kotlin.core.a.V(this.f266801a, userId, serializable.serialize(), null, 4, null);
    }

    public final void y(@NotNull String userId, @NotNull Map<String, ? extends Object> traits) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        this.f266801a.M(userId, traits, new e1(b3.f315897a, m0.d(com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule(), j1.d(Object.class))), null);
    }

    @j
    public final void z(@NotNull String userId, @NotNull JsonObject traits) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        com.segment.analytics.kotlin.core.a.V(this.f266801a, userId, traits, null, 4, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull com.segment.analytics.kotlin.core.f configuration) {
        this(new com.segment.analytics.kotlin.core.a(configuration));
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }
}
