package com.superwall.sdk.models.config;

import java.util.Map;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class ComputedPropertyRequest {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String eventName;

    @NotNull
    private final ComputedPropertyRequestType type;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ComputedPropertyRequest> serializer() {
            return ComputedPropertyRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0(with = ComputedPropertyRequestTypeSerializer.class)
    public enum ComputedPropertyRequestType {
        MINUTES_SINCE("MINUTES_SINCE"),
        HOURS_SINCE("HOURS_SINCE"),
        DAYS_SINCE("DAYS_SINCE"),
        MONTHS_SINCE("MONTHS_SINCE"),
        YEARS_SINCE("YEARS_SINCE");


        @NotNull
        private final String rawValue;
        private static final /* synthetic */ a $ENTRIES = c.c(values());

        @NotNull
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<ComputedPropertyRequestType> serializer() {
                return ComputedPropertyRequestTypeSerializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ComputedPropertyRequestType.values().length];
                try {
                    iArr[ComputedPropertyRequestType.MINUTES_SINCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ComputedPropertyRequestType.HOURS_SINCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ComputedPropertyRequestType.DAYS_SINCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ComputedPropertyRequestType.MONTHS_SINCE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ComputedPropertyRequestType.YEARS_SINCE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        ComputedPropertyRequestType(String str) {
            this.rawValue = str;
        }

        @NotNull
        public static a<ComputedPropertyRequestType> getEntries() {
            return $ENTRIES;
        }

        @Nullable
        public final Integer dateComponent(@NotNull Map<Integer, Integer> components) {
            Intrinsics.checkNotNullParameter(components, "components");
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return components.get(12);
            }
            if (i10 == 2) {
                return components.get(11);
            }
            if (i10 == 3) {
                return components.get(5);
            }
            if (i10 == 4) {
                return components.get(2);
            }
            if (i10 == 5) {
                return components.get(1);
            }
            throw new k0();
        }

        public final int getCalendarComponent() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return 12;
            }
            if (i10 == 2) {
                return 11;
            }
            if (i10 == 3) {
                return 5;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 5) {
                return 1;
            }
            throw new k0();
        }

        @NotNull
        public final String getPrefix() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "minutesSince_";
            }
            if (i10 == 2) {
                return "hoursSince_";
            }
            if (i10 == 3) {
                return "daysSince_";
            }
            if (i10 == 4) {
                return "monthsSince_";
            }
            if (i10 == 5) {
                return "yearsSince_";
            }
            throw new k0();
        }

        @NotNull
        public final String getRawValue() {
            return this.rawValue;
        }
    }

    @e0(forClass = ComputedPropertyRequestType.class)
    @SourceDebugExtension({"SMAP\nComputedPropertyRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComputedPropertyRequest.kt\ncom/superwall/sdk/models/config/ComputedPropertyRequest$ComputedPropertyRequestTypeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
    public static final class ComputedPropertyRequestTypeSerializer implements KSerializer<ComputedPropertyRequestType> {

        @NotNull
        public static final ComputedPropertyRequestTypeSerializer INSTANCE = new ComputedPropertyRequestTypeSerializer();

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.config.ComputedPropertyRequest.ComputedPropertyRequestType", null, 1);
            int i10 = 1 << 0;
            pluginGeneratedSerialDescriptor.i("rawValue", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private ComputedPropertyRequestTypeSerializer() {
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.e
        @NotNull
        public ComputedPropertyRequestType deserialize(@NotNull Decoder decoder) {
            ComputedPropertyRequestType computedPropertyRequestType;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            String strDecodeString = decoder.decodeString();
            ComputedPropertyRequestType[] computedPropertyRequestTypeArrValues = ComputedPropertyRequestType.values();
            int length = computedPropertyRequestTypeArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    computedPropertyRequestType = null;
                    break;
                }
                computedPropertyRequestType = computedPropertyRequestTypeArrValues[i10];
                if (Intrinsics.areEqual(computedPropertyRequestType.getRawValue(), strDecodeString)) {
                    break;
                }
                i10++;
            }
            if (computedPropertyRequestType != null) {
                return computedPropertyRequestType;
            }
            throw new IllegalArgumentException("Unsupported computed property type.");
        }

        @Override // kotlinx.serialization.d0
        public void serialize(@NotNull Encoder encoder, @NotNull ComputedPropertyRequestType value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeString(value.getRawValue());
        }
    }

    public /* synthetic */ ComputedPropertyRequest(int i10, ComputedPropertyRequestType computedPropertyRequestType, String str, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, ComputedPropertyRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.type = computedPropertyRequestType;
        this.eventName = str;
    }

    public static /* synthetic */ ComputedPropertyRequest copy$default(ComputedPropertyRequest computedPropertyRequest, ComputedPropertyRequestType computedPropertyRequestType, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            computedPropertyRequestType = computedPropertyRequest.type;
        }
        if ((i10 & 2) != 0) {
            str = computedPropertyRequest.eventName;
        }
        return computedPropertyRequest.copy(computedPropertyRequestType, str);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(ComputedPropertyRequest computedPropertyRequest, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeSerializableElement(serialDescriptor, 0, ComputedPropertyRequestTypeSerializer.INSTANCE, computedPropertyRequest.type);
        eVar.encodeStringElement(serialDescriptor, 1, computedPropertyRequest.eventName);
    }

    @NotNull
    public final ComputedPropertyRequestType component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.eventName;
    }

    @NotNull
    public final ComputedPropertyRequest copy(@NotNull ComputedPropertyRequestType type, @NotNull String eventName) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new ComputedPropertyRequest(type, eventName);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComputedPropertyRequest)) {
            return false;
        }
        ComputedPropertyRequest computedPropertyRequest = (ComputedPropertyRequest) obj;
        return this.type == computedPropertyRequest.type && Intrinsics.areEqual(this.eventName, computedPropertyRequest.eventName);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final ComputedPropertyRequestType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.eventName.hashCode();
    }

    @NotNull
    public String toString() {
        return "ComputedPropertyRequest(type=" + this.type + ", eventName=" + this.eventName + ")";
    }

    public ComputedPropertyRequest(@NotNull ComputedPropertyRequestType type, @NotNull String eventName) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.type = type;
        this.eventName = eventName;
    }
}
