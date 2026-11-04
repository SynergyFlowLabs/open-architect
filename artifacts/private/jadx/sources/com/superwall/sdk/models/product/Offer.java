package com.superwall.sdk.models.product;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Offer {

    @b0
    public static final class Automatic extends Offer {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String type;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Automatic> serializer() {
                return Offer$Automatic$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Automatic() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Automatic copy$default(Automatic automatic, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = automatic.type;
            }
            return automatic.copy(str);
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Automatic automatic, e eVar, SerialDescriptor serialDescriptor) {
            if (!eVar.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.areEqual(automatic.type, "AUTOMATIC")) {
                return;
            }
            eVar.encodeStringElement(serialDescriptor, 0, automatic.type);
        }

        @NotNull
        public final String component1() {
            return this.type;
        }

        @NotNull
        public final Automatic copy(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Automatic(type);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Automatic) && Intrinsics.areEqual(this.type, ((Automatic) obj).type)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "Automatic(type=" + this.type + ")";
        }

        public /* synthetic */ Automatic(int i10, String str, v2 v2Var) {
            super(null);
            if ((i10 & 1) == 0) {
                this.type = "AUTOMATIC";
            } else {
                this.type = str;
            }
        }

        public /* synthetic */ Automatic(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "AUTOMATIC" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Automatic(@NotNull String type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }
    }

    public /* synthetic */ Offer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Offer() {
    }

    @b0
    public static final class Specified extends Offer {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String offerIdentifier;

        @NotNull
        private final String type;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Specified> serializer() {
                return Offer$Specified$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Specified(int i10, String str, String str2, v2 v2Var) {
            super(null);
            if (2 != (i10 & 2)) {
                g2.b(i10, 2, Offer$Specified$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.type = "SPECIFIED";
            } else {
                this.type = str;
            }
            this.offerIdentifier = str2;
        }

        public static /* synthetic */ Specified copy$default(Specified specified, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = specified.type;
            }
            if ((i10 & 2) != 0) {
                str2 = specified.offerIdentifier;
            }
            return specified.copy(str, str2);
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Specified specified, e eVar, SerialDescriptor serialDescriptor) {
            if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.areEqual(specified.type, "SPECIFIED")) {
                eVar.encodeStringElement(serialDescriptor, 0, specified.type);
            }
            eVar.encodeStringElement(serialDescriptor, 1, specified.offerIdentifier);
        }

        @NotNull
        public final String component1() {
            return this.type;
        }

        @NotNull
        public final String component2() {
            return this.offerIdentifier;
        }

        @NotNull
        public final Specified copy(@NotNull String type, @NotNull String offerIdentifier) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(offerIdentifier, "offerIdentifier");
            return new Specified(type, offerIdentifier);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Specified)) {
                return false;
            }
            Specified specified = (Specified) obj;
            return Intrinsics.areEqual(this.type, specified.type) && Intrinsics.areEqual(this.offerIdentifier, specified.offerIdentifier);
        }

        @NotNull
        public final String getOfferIdentifier() {
            return this.offerIdentifier;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.offerIdentifier.hashCode();
        }

        @NotNull
        public String toString() {
            return "Specified(type=" + this.type + ", offerIdentifier=" + this.offerIdentifier + ")";
        }

        public /* synthetic */ Specified(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "SPECIFIED" : str, str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Specified(@NotNull String type, @NotNull String offerIdentifier) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(offerIdentifier, "offerIdentifier");
            this.type = type;
            this.offerIdentifier = offerIdentifier;
        }
    }
}
