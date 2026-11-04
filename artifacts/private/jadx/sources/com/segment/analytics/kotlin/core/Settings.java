package com.segment.analytics.kotlin.core;

import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Settings {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private JsonObject f266696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private JsonObject f266697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private JsonObject f266698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private JsonObject f266699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private JsonObject f266700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private JsonObject f266701f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Settings> serializer() {
            return Settings$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Settings() {
        this((JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Settings h(Settings settings, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, JsonObject jsonObject5, JsonObject jsonObject6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jsonObject = settings.f266696a;
        }
        if ((i10 & 2) != 0) {
            jsonObject2 = settings.f266697b;
        }
        if ((i10 & 4) != 0) {
            jsonObject3 = settings.f266698c;
        }
        if ((i10 & 8) != 0) {
            jsonObject4 = settings.f266699d;
        }
        if ((i10 & 16) != 0) {
            jsonObject5 = settings.f266700e;
        }
        if ((i10 & 32) != 0) {
            jsonObject6 = settings.f266701f;
        }
        JsonObject jsonObject7 = jsonObject5;
        JsonObject jsonObject8 = jsonObject6;
        return settings.g(jsonObject, jsonObject2, jsonObject3, jsonObject4, jsonObject7, jsonObject8);
    }

    public static /* synthetic */ Object j(Settings settings, String name, kotlinx.serialization.e strategy, int i10, Object obj) {
        JsonObject jsonObjectK;
        if ((i10 & 2) != 0) {
            kotlinx.serialization.modules.f serializersModule = Json.Default.getSerializersModule();
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
            q0.n("kotlinx.serialization.serializer.withModule");
            strategy = m0.o(serializersModule, null);
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        JsonElement jsonElement = (JsonElement) settings.m().get((Object) name);
        if (jsonElement != null && (jsonObjectK = com.segment.analytics.kotlin.core.utilities.o.k(jsonElement)) != null) {
            return com.segment.analytics.kotlin.core.utilities.o.e().decodeFromJsonElement(strategy, jsonObjectK);
        }
        return null;
    }

    @oj.n
    public static final void y(@NotNull Settings self, @NotNull kotlinx.serialization.encoding.e output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.f266696a, l.b())) {
            output.encodeSerializableElement(serialDesc, 0, JsonObjectSerializer.INSTANCE, self.f266696a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.f266697b, l.b())) {
            output.encodeSerializableElement(serialDesc, 1, JsonObjectSerializer.INSTANCE, self.f266697b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.f266698c, l.b())) {
            output.encodeSerializableElement(serialDesc, 2, JsonObjectSerializer.INSTANCE, self.f266698c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.f266699d, l.b())) {
            output.encodeSerializableElement(serialDesc, 3, JsonObjectSerializer.INSTANCE, self.f266699d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.f266700e, l.b())) {
            output.encodeSerializableElement(serialDesc, 4, JsonObjectSerializer.INSTANCE, self.f266700e);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && Intrinsics.areEqual(self.f266701f, l.b())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, JsonObjectSerializer.INSTANCE, self.f266701f);
    }

    @NotNull
    public final JsonObject a() {
        return this.f266696a;
    }

    @NotNull
    public final JsonObject b() {
        return this.f266697b;
    }

    @NotNull
    public final JsonObject c() {
        return this.f266698c;
    }

    @NotNull
    public final JsonObject d() {
        return this.f266699d;
    }

    @NotNull
    public final JsonObject e() {
        return this.f266700e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) obj;
        return Intrinsics.areEqual(this.f266696a, settings.f266696a) && Intrinsics.areEqual(this.f266697b, settings.f266697b) && Intrinsics.areEqual(this.f266698c, settings.f266698c) && Intrinsics.areEqual(this.f266699d, settings.f266699d) && Intrinsics.areEqual(this.f266700e, settings.f266700e) && Intrinsics.areEqual(this.f266701f, settings.f266701f);
    }

    @NotNull
    public final JsonObject f() {
        return this.f266701f;
    }

    @NotNull
    public final Settings g(@NotNull JsonObject integrations, @NotNull JsonObject plan, @NotNull JsonObject edgeFunction, @NotNull JsonObject middlewareSettings, @NotNull JsonObject metrics, @NotNull JsonObject consentSettings) {
        Intrinsics.checkNotNullParameter(integrations, "integrations");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(edgeFunction, "edgeFunction");
        Intrinsics.checkNotNullParameter(middlewareSettings, "middlewareSettings");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(consentSettings, "consentSettings");
        return new Settings(integrations, plan, edgeFunction, middlewareSettings, metrics, consentSettings);
    }

    public int hashCode() {
        return (((((((((this.f266696a.hashCode() * 31) + this.f266697b.hashCode()) * 31) + this.f266698c.hashCode()) * 31) + this.f266699d.hashCode()) * 31) + this.f266700e.hashCode()) * 31) + this.f266701f.hashCode();
    }

    public final /* synthetic */ <T> T i(String name, kotlinx.serialization.e<? extends T> strategy) {
        JsonObject jsonObjectK;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        JsonElement jsonElement = (JsonElement) m().get((Object) name);
        if (jsonElement != null && (jsonObjectK = com.segment.analytics.kotlin.core.utilities.o.k(jsonElement)) != null) {
            return (T) com.segment.analytics.kotlin.core.utilities.o.e().decodeFromJsonElement(strategy, jsonObjectK);
        }
        return null;
    }

    @NotNull
    public final JsonObject k() {
        return this.f266701f;
    }

    @NotNull
    public final JsonObject l() {
        return this.f266698c;
    }

    @NotNull
    public final JsonObject m() {
        return this.f266696a;
    }

    @NotNull
    public final JsonObject n() {
        return this.f266700e;
    }

    @NotNull
    public final JsonObject o() {
        return this.f266699d;
    }

    @NotNull
    public final JsonObject p() {
        return this.f266697b;
    }

    public final boolean q(@NotNull com.segment.analytics.kotlin.core.platform.a plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        return r(plugin.o());
    }

    public final boolean r(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f266696a.containsKey((Object) key);
    }

    public final void s(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266701f = jsonObject;
    }

    public final void t(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266698c = jsonObject;
    }

    @NotNull
    public String toString() {
        return "Settings(integrations=" + this.f266696a + ", plan=" + this.f266697b + ", edgeFunction=" + this.f266698c + ", middlewareSettings=" + this.f266699d + ", metrics=" + this.f266700e + ", consentSettings=" + this.f266701f + ')';
    }

    public final void u(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266696a = jsonObject;
    }

    public final void v(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266700e = jsonObject;
    }

    public final void w(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266699d = jsonObject;
    }

    public final void x(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266697b = jsonObject;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
    public /* synthetic */ Settings(int i10, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, JsonObject jsonObject5, JsonObject jsonObject6, v2 v2Var) {
        this.f266696a = (i10 & 1) == 0 ? l.b() : jsonObject;
        if ((i10 & 2) == 0) {
            this.f266697b = l.b();
        } else {
            this.f266697b = jsonObject2;
        }
        if ((i10 & 4) == 0) {
            this.f266698c = l.b();
        } else {
            this.f266698c = jsonObject3;
        }
        if ((i10 & 8) == 0) {
            this.f266699d = l.b();
        } else {
            this.f266699d = jsonObject4;
        }
        if ((i10 & 16) == 0) {
            this.f266700e = l.b();
        } else {
            this.f266700e = jsonObject5;
        }
        if ((i10 & 32) == 0) {
            this.f266701f = l.b();
        } else {
            this.f266701f = jsonObject6;
        }
    }

    public Settings(@NotNull JsonObject integrations, @NotNull JsonObject plan, @NotNull JsonObject edgeFunction, @NotNull JsonObject middlewareSettings, @NotNull JsonObject metrics, @NotNull JsonObject consentSettings) {
        Intrinsics.checkNotNullParameter(integrations, "integrations");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(edgeFunction, "edgeFunction");
        Intrinsics.checkNotNullParameter(middlewareSettings, "middlewareSettings");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(consentSettings, "consentSettings");
        this.f266696a = integrations;
        this.f266697b = plan;
        this.f266698c = edgeFunction;
        this.f266699d = middlewareSettings;
        this.f266700e = metrics;
        this.f266701f = consentSettings;
    }

    public /* synthetic */ Settings(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, JsonObject jsonObject5, JsonObject jsonObject6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? l.b() : jsonObject, (i10 & 2) != 0 ? l.b() : jsonObject2, (i10 & 4) != 0 ? l.b() : jsonObject3, (i10 & 8) != 0 ? l.b() : jsonObject4, (i10 & 16) != 0 ? l.b() : jsonObject5, (i10 & 32) != 0 ? l.b() : jsonObject6);
    }
}
