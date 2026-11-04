package com.superwall.sdk.paywall.presentation.internal.request;

import com.superwall.sdk.models.events.EventData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PresentationInfo {

    public static final class ExplicitTrigger extends PresentationInfo {

        @NotNull
        private final EventData eventData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExplicitTrigger(@NotNull EventData eventData) {
            super(null);
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            this.eventData = eventData;
        }

        public static /* synthetic */ ExplicitTrigger copy$default(ExplicitTrigger explicitTrigger, EventData eventData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                eventData = explicitTrigger.eventData;
            }
            return explicitTrigger.copy(eventData);
        }

        @NotNull
        public final EventData component1() {
            return this.eventData;
        }

        @NotNull
        public final ExplicitTrigger copy(@NotNull EventData eventData) {
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            return new ExplicitTrigger(eventData);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExplicitTrigger) && Intrinsics.areEqual(this.eventData, ((ExplicitTrigger) obj).eventData);
        }

        @Override // com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo
        @NotNull
        public EventData getEventData() {
            return this.eventData;
        }

        public int hashCode() {
            return this.eventData.hashCode();
        }

        @NotNull
        public String toString() {
            return "ExplicitTrigger(eventData=" + this.eventData + ")";
        }
    }

    public static final class FromIdentifier extends PresentationInfo {
        private final boolean freeTrialOverride;

        @NotNull
        private final String identifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromIdentifier(@NotNull String identifier, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.identifier = identifier;
            this.freeTrialOverride = z10;
        }

        public static /* synthetic */ FromIdentifier copy$default(FromIdentifier fromIdentifier, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fromIdentifier.identifier;
            }
            if ((i10 & 2) != 0) {
                z10 = fromIdentifier.freeTrialOverride;
            }
            return fromIdentifier.copy(str, z10);
        }

        @NotNull
        public final String component1() {
            return this.identifier;
        }

        public final boolean component2() {
            return this.freeTrialOverride;
        }

        @NotNull
        public final FromIdentifier copy(@NotNull String identifier, boolean z10) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new FromIdentifier(identifier, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FromIdentifier)) {
                return false;
            }
            FromIdentifier fromIdentifier = (FromIdentifier) obj;
            if (Intrinsics.areEqual(this.identifier, fromIdentifier.identifier) && this.freeTrialOverride == fromIdentifier.freeTrialOverride) {
                return true;
            }
            return false;
        }

        @Override // com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo
        @NotNull
        public Boolean getFreeTrialOverride() {
            return Boolean.valueOf(this.freeTrialOverride);
        }

        @Override // com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo
        @NotNull
        public String getIdentifier() {
            return this.identifier;
        }

        public int hashCode() {
            return (this.identifier.hashCode() * 31) + Boolean.hashCode(this.freeTrialOverride);
        }

        @NotNull
        public String toString() {
            return "FromIdentifier(identifier=" + this.identifier + ", freeTrialOverride=" + this.freeTrialOverride + ")";
        }
    }

    public static final class ImplicitTrigger extends PresentationInfo {

        @NotNull
        private final EventData eventData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImplicitTrigger(@NotNull EventData eventData) {
            super(null);
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            this.eventData = eventData;
        }

        public static /* synthetic */ ImplicitTrigger copy$default(ImplicitTrigger implicitTrigger, EventData eventData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                eventData = implicitTrigger.eventData;
            }
            return implicitTrigger.copy(eventData);
        }

        @NotNull
        public final EventData component1() {
            return this.eventData;
        }

        @NotNull
        public final ImplicitTrigger copy(@NotNull EventData eventData) {
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            return new ImplicitTrigger(eventData);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ImplicitTrigger) && Intrinsics.areEqual(this.eventData, ((ImplicitTrigger) obj).eventData)) {
                return true;
            }
            return false;
        }

        @Override // com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo
        @NotNull
        public EventData getEventData() {
            return this.eventData;
        }

        public int hashCode() {
            return this.eventData.hashCode();
        }

        @NotNull
        public String toString() {
            return "ImplicitTrigger(eventData=" + this.eventData + ")";
        }
    }

    public /* synthetic */ PresentationInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public EventData getEventData() {
        if (this instanceof ImplicitTrigger) {
            return ((ImplicitTrigger) this).getEventData();
        }
        if (this instanceof ExplicitTrigger) {
            return ((ExplicitTrigger) this).getEventData();
        }
        return null;
    }

    @Nullable
    public final String getEventName() {
        if (this instanceof ImplicitTrigger) {
            return ((ImplicitTrigger) this).getEventData().getName();
        }
        if (this instanceof ExplicitTrigger) {
            return ((ExplicitTrigger) this).getEventData().getName();
        }
        return null;
    }

    @Nullable
    public Boolean getFreeTrialOverride() {
        if (this instanceof FromIdentifier) {
            return ((FromIdentifier) this).getFreeTrialOverride();
        }
        return null;
    }

    @Nullable
    public String getIdentifier() {
        if (this instanceof FromIdentifier) {
            return ((FromIdentifier) this).getIdentifier();
        }
        return null;
    }

    private PresentationInfo() {
    }
}
