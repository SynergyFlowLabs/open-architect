package com.superwall.sdk.models.triggers;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Trigger {

    @NotNull
    private String eventName;

    @NotNull
    private List<TriggerRule> rules;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new kotlinx.serialization.internal.f(TriggerRule$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Trigger> serializer() {
            return Trigger$$serializer.INSTANCE;
        }

        @NotNull
        public final Trigger stub() {
            return new Trigger("an_event", CollectionsKt.emptyList());
        }

        private Companion() {
        }
    }

    public /* synthetic */ Trigger(int i10, String str, List list, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, Trigger$$serializer.INSTANCE.getDescriptor());
        }
        this.eventName = str;
        this.rules = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Trigger copy$default(Trigger trigger, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = trigger.eventName;
        }
        if ((i10 & 2) != 0) {
            list = trigger.rules;
        }
        return trigger.copy(str, list);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Trigger trigger, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, trigger.eventName);
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], trigger.rules);
    }

    @NotNull
    public final String component1() {
        return this.eventName;
    }

    @NotNull
    public final List<TriggerRule> component2() {
        return this.rules;
    }

    @NotNull
    public final Trigger copy(@NotNull String eventName, @NotNull List<TriggerRule> rules) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(rules, "rules");
        return new Trigger(eventName, rules);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trigger)) {
            return false;
        }
        Trigger trigger = (Trigger) obj;
        return Intrinsics.areEqual(this.eventName, trigger.eventName) && Intrinsics.areEqual(this.rules, trigger.rules);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final List<TriggerRule> getRules() {
        return this.rules;
    }

    public int hashCode() {
        return (this.eventName.hashCode() * 31) + this.rules.hashCode();
    }

    public final void setEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final void setRules(@NotNull List<TriggerRule> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.rules = list;
    }

    @NotNull
    public String toString() {
        return "Trigger(eventName=" + this.eventName + ", rules=" + this.rules + ")";
    }

    public Trigger(@NotNull String eventName, @NotNull List<TriggerRule> rules) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.eventName = eventName;
        this.rules = rules;
    }
}
