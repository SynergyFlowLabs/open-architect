package com.superwall.sdk.paywall.view.webview.templating.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class JsonVariables {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String eventName;

    @NotNull
    private final Variables variables;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<JsonVariables> serializer() {
            return JsonVariables$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ JsonVariables(int i10, String str, Variables variables, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, JsonVariables$$serializer.INSTANCE.getDescriptor());
        }
        this.eventName = str;
        this.variables = variables;
    }

    public static /* synthetic */ JsonVariables copy$default(JsonVariables jsonVariables, String str, Variables variables, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jsonVariables.eventName;
        }
        if ((i10 & 2) != 0) {
            variables = jsonVariables.variables;
        }
        return jsonVariables.copy(str, variables);
    }

    @a0("event_name")
    public static /* synthetic */ void getEventName$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(JsonVariables jsonVariables, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, jsonVariables.eventName);
        eVar.encodeSerializableElement(serialDescriptor, 1, Variables$$serializer.INSTANCE, jsonVariables.variables);
    }

    @NotNull
    public final String component1() {
        return this.eventName;
    }

    @NotNull
    public final Variables component2() {
        return this.variables;
    }

    @NotNull
    public final JsonVariables copy(@NotNull String eventName, @NotNull Variables variables) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(variables, "variables");
        return new JsonVariables(eventName, variables);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonVariables)) {
            return false;
        }
        JsonVariables jsonVariables = (JsonVariables) obj;
        return Intrinsics.areEqual(this.eventName, jsonVariables.eventName) && Intrinsics.areEqual(this.variables, jsonVariables.variables);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final Variables getVariables() {
        return this.variables;
    }

    public int hashCode() {
        return (this.eventName.hashCode() * 31) + this.variables.hashCode();
    }

    @NotNull
    public String toString() {
        return "JsonVariables(eventName=" + this.eventName + ", variables=" + this.variables + ")";
    }

    public JsonVariables(@NotNull String eventName, @NotNull Variables variables) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(variables, "variables");
        this.eventName = eventName;
        this.variables = variables;
    }
}
