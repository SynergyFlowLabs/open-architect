package com.segment.analytics.kotlin.core;

import androidx.media3.extractor.y0;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class v implements sovran.kotlin.c {

    @NotNull
    public static final c Companion = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private com.segment.analytics.kotlin.core.f f267052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Settings f267053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f267054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Set<Integer> f267055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f267056e;

    @SourceDebugExtension({"SMAP\nState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 State.kt\ncom/segment/analytics/kotlin/core/System$AddDestinationToSettingsAction\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n28#2,3:198\n31#2:202\n1#3:201\n*S KotlinDebug\n*F\n+ 1 State.kt\ncom/segment/analytics/kotlin/core/System$AddDestinationToSettingsAction\n*L\n98#1:198,3\n98#1:202\n*E\n"})
    public static final class a implements sovran.kotlin.a<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f267057a;

        public a(@NotNull String destinationKey) {
            Intrinsics.checkNotNullParameter(destinationKey, "destinationKey");
            this.f267057a = destinationKey;
        }

        @NotNull
        public final String b() {
            return this.f267057a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(@NotNull v state) {
            JsonObject jsonObjectM;
            Intrinsics.checkNotNullParameter(state, "state");
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            Settings settingsL = state.l();
            if (settingsL != null && (jsonObjectM = settingsL.m()) != null) {
                com.segment.analytics.kotlin.core.utilities.o.s(jsonObjectBuilder, jsonObjectM);
            }
            JsonElementBuildersKt.put(jsonObjectBuilder, this.f267057a, Boolean.TRUE);
            JsonObject jsonObjectBuild = jsonObjectBuilder.build();
            Settings settingsL2 = state.l();
            return new v(state.h(), settingsL2 != null ? Settings.h(settingsL2, jsonObjectBuild, null, null, null, null, null, 62, null) : null, state.k(), state.j(), state.i());
        }

        public final void d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f267057a = str;
        }
    }

    public static final class b implements sovran.kotlin.a<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Set<Integer> f267058a;

        public b(@NotNull Set<Integer> dispatched) {
            Intrinsics.checkNotNullParameter(dispatched, "dispatched");
            this.f267058a = dispatched;
        }

        @NotNull
        public final Set<Integer> b() {
            return this.f267058a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(@NotNull v state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new v(state.h(), state.l(), state.k(), SetsKt.plus((Set) state.j(), (Iterable) this.f267058a), state.i());
        }

        public final void d(@NotNull Set<Integer> set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.f267058a = set;
        }
    }

    @SourceDebugExtension({"SMAP\nState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 State.kt\ncom/segment/analytics/kotlin/core/System$Companion\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,197:1\n28#2,3:198\n28#2,4:201\n31#2:205\n*S KotlinDebug\n*F\n+ 1 State.kt\ncom/segment/analytics/kotlin/core/System$Companion\n*L\n30#1:198,3\n33#1:201,4\n30#1:205\n*E\n"})
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final v a(@NotNull com.segment.analytics.kotlin.core.f configuration, @NotNull s storage) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(storage, "storage");
            String strD = storage.d(s.b.Settings);
            Settings settingsX = configuration.x();
            if (settingsX == null) {
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder2, "apiKey", configuration.H());
                JsonElementBuildersKt.put(jsonObjectBuilder2, "apiHost", i.f266827c);
                Unit unit = Unit.f312394a;
                jsonObjectBuilder.put("Segment.io", jsonObjectBuilder2.build());
                int i10 = 0 << 0;
                settingsX = new Settings(jsonObjectBuilder.build(), l.b(), l.b(), l.b(), (JsonObject) null, (JsonObject) null, 48, (DefaultConstructorMarker) null);
            }
            if (strD != null && !Intrinsics.areEqual(strD, "") && !Intrinsics.areEqual(strD, "{}")) {
                try {
                    settingsX = (Settings) Json.Default.decodeFromString(Settings.Companion.serializer(), strD);
                } catch (Exception unused) {
                }
            }
            return new v(configuration, settingsX, false, SetsKt.emptySet(), true);
        }

        private c() {
        }
    }

    public static final class d implements sovran.kotlin.a<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f267059a;

        public d(boolean z10) {
            this.f267059a = z10;
        }

        public final boolean b() {
            return this.f267059a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(@NotNull v state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new v(state.h(), state.l(), state.k(), state.j(), this.f267059a);
        }
    }

    public static final class e implements sovran.kotlin.a<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f267060a;

        public e(boolean z10) {
            this.f267060a = z10;
        }

        public final boolean b() {
            return this.f267060a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(@NotNull v state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new v(state.h(), state.l(), this.f267060a, state.j(), state.i());
        }

        public final void d(boolean z10) {
            this.f267060a = z10;
        }
    }

    public static final class f implements sovran.kotlin.a<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Settings f267061a;

        public f(@NotNull Settings settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f267061a = settings;
        }

        @NotNull
        public final Settings b() {
            return this.f267061a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(@NotNull v state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new v(state.h(), this.f267061a, state.k(), state.j(), state.i());
        }

        public final void d(@NotNull Settings settings) {
            Intrinsics.checkNotNullParameter(settings, "<set-?>");
            this.f267061a = settings;
        }
    }

    public v(@NotNull com.segment.analytics.kotlin.core.f configuration, @Nullable Settings settings, boolean z10, @NotNull Set<Integer> initializedPlugins, boolean z11) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initializedPlugins, "initializedPlugins");
        this.f267052a = configuration;
        this.f267053b = settings;
        this.f267054c = z10;
        this.f267055d = initializedPlugins;
        this.f267056e = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v g(v vVar, com.segment.analytics.kotlin.core.f fVar, Settings settings, boolean z10, Set set, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = vVar.f267052a;
        }
        if ((i10 & 2) != 0) {
            settings = vVar.f267053b;
        }
        if ((i10 & 4) != 0) {
            z10 = vVar.f267054c;
        }
        if ((i10 & 8) != 0) {
            set = vVar.f267055d;
        }
        if ((i10 & 16) != 0) {
            z11 = vVar.f267056e;
        }
        boolean z12 = z11;
        boolean z13 = z10;
        return vVar.f(fVar, settings, z13, set, z12);
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.f a() {
        return this.f267052a;
    }

    @Nullable
    public final Settings b() {
        return this.f267053b;
    }

    public final boolean c() {
        return this.f267054c;
    }

    @NotNull
    public final Set<Integer> d() {
        return this.f267055d;
    }

    public final boolean e() {
        return this.f267056e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f267052a, vVar.f267052a) && Intrinsics.areEqual(this.f267053b, vVar.f267053b) && this.f267054c == vVar.f267054c && Intrinsics.areEqual(this.f267055d, vVar.f267055d) && this.f267056e == vVar.f267056e;
    }

    @NotNull
    public final v f(@NotNull com.segment.analytics.kotlin.core.f configuration, @Nullable Settings settings, boolean z10, @NotNull Set<Integer> initializedPlugins, boolean z11) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initializedPlugins, "initializedPlugins");
        return new v(configuration, settings, z10, initializedPlugins, z11);
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.f h() {
        return this.f267052a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f267052a.hashCode() * 31;
        Settings settings = this.f267053b;
        if (settings == null) {
            iHashCode = 0;
            int i10 = 4 & 0;
        } else {
            iHashCode = settings.hashCode();
        }
        int i11 = (iHashCode2 + iHashCode) * 31;
        boolean z10 = this.f267054c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iHashCode3 = (((i11 + r10) * 31) + this.f267055d.hashCode()) * 31;
        boolean z11 = this.f267056e;
        return iHashCode3 + (z11 ? 1 : z11);
    }

    public final boolean i() {
        return this.f267056e;
    }

    @NotNull
    public final Set<Integer> j() {
        return this.f267055d;
    }

    public final boolean k() {
        return this.f267054c;
    }

    @Nullable
    public final Settings l() {
        return this.f267053b;
    }

    public final void m(@NotNull com.segment.analytics.kotlin.core.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f267052a = fVar;
    }

    public final void n(boolean z10) {
        this.f267056e = z10;
    }

    public final void o(@NotNull Set<Integer> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f267055d = set;
    }

    public final void p(boolean z10) {
        this.f267054c = z10;
    }

    public final void q(@Nullable Settings settings) {
        this.f267053b = settings;
    }

    @NotNull
    public String toString() {
        return "System(configuration=" + this.f267052a + ", settings=" + this.f267053b + ", running=" + this.f267054c + ", initializedPlugins=" + this.f267055d + ", enabled=" + this.f267056e + ')';
    }

    public /* synthetic */ v(com.segment.analytics.kotlin.core.f fVar, Settings settings, boolean z10, Set set, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new com.segment.analytics.kotlin.core.f("", null, null, false, false, false, false, 0, 0, null, null, false, null, null, null, null, y0.f69665l, null) : fVar, settings, z10, set, z11);
    }
}
