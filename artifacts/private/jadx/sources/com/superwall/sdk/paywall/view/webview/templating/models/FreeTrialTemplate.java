package com.superwall.sdk.paywall.view.webview.templating.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class FreeTrialTemplate {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String eventName;

    @Nullable
    private final String prefix;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<FreeTrialTemplate> serializer() {
            return FreeTrialTemplate$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FreeTrialTemplate(int i10, String str, String str2, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, FreeTrialTemplate$$serializer.INSTANCE.getDescriptor());
        }
        this.eventName = str;
        if ((i10 & 2) == 0) {
            this.prefix = null;
        } else {
            this.prefix = str2;
        }
    }

    public static /* synthetic */ FreeTrialTemplate copy$default(FreeTrialTemplate freeTrialTemplate, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = freeTrialTemplate.eventName;
        }
        if ((i10 & 2) != 0) {
            str2 = freeTrialTemplate.prefix;
        }
        return freeTrialTemplate.copy(str, str2);
    }

    @a0("event_name")
    public static /* synthetic */ void getEventName$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(FreeTrialTemplate freeTrialTemplate, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, freeTrialTemplate.eventName);
        int i10 = 6 | 1;
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && freeTrialTemplate.prefix == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, freeTrialTemplate.prefix);
    }

    @NotNull
    public final String component1() {
        return this.eventName;
    }

    @Nullable
    public final String component2() {
        return this.prefix;
    }

    @NotNull
    public final FreeTrialTemplate copy(@NotNull String eventName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new FreeTrialTemplate(eventName, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeTrialTemplate)) {
            return false;
        }
        FreeTrialTemplate freeTrialTemplate = (FreeTrialTemplate) obj;
        return Intrinsics.areEqual(this.eventName, freeTrialTemplate.eventName) && Intrinsics.areEqual(this.prefix, freeTrialTemplate.prefix);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @Nullable
    public final String getPrefix() {
        return this.prefix;
    }

    public int hashCode() {
        int iHashCode = this.eventName.hashCode() * 31;
        String str = this.prefix;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "FreeTrialTemplate(eventName=" + this.eventName + ", prefix=" + this.prefix + ")";
    }

    public FreeTrialTemplate(@NotNull String eventName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.prefix = str;
    }

    public /* synthetic */ FreeTrialTemplate(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
