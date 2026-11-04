package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

import io.intercom.android.sdk.models.AttributeType;
import io.sentry.protocol.z;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlin.y1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.m;
import kotlinx.serialization.p;
import kotlinx.serialization.v;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@m
public interface PassableValue {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @b0
    @a0("bool")
    public static final class BoolValue implements PassableValue {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final boolean value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<BoolValue> serializer() {
                return PassableValue$BoolValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BoolValue(int i10, boolean z10, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PassableValue$BoolValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = z10;
        }

        public static /* synthetic */ BoolValue copy$default(BoolValue boolValue, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = boolValue.value;
            }
            return boolValue.copy(z10);
        }

        public final boolean component1() {
            return this.value;
        }

        @NotNull
        public final BoolValue copy(boolean z10) {
            return new BoolValue(z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BoolValue) && this.value == ((BoolValue) obj).value;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "BoolValue(value=" + this.value + ")";
        }

        public BoolValue(boolean z10) {
            this.value = z10;
        }
    }

    @b0
    @a0("bytes")
    public static final class BytesValue implements PassableValue {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final byte[] value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<BytesValue> serializer() {
                return PassableValue$BytesValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BytesValue(int i10, byte[] bArr, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PassableValue$BytesValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = bArr;
        }

        public static /* synthetic */ BytesValue copy$default(BytesValue bytesValue, byte[] bArr, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bArr = bytesValue.value;
            }
            return bytesValue.copy(bArr);
        }

        @NotNull
        public final byte[] component1() {
            return this.value;
        }

        @NotNull
        public final BytesValue copy(@NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new BytesValue(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BytesValue) && Intrinsics.areEqual(this.value, ((BytesValue) obj).value);
        }

        @NotNull
        public final byte[] getValue() {
            return this.value;
        }

        public int hashCode() {
            return Arrays.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "BytesValue(value=" + Arrays.toString(this.value) + ")";
        }

        public BytesValue(@NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer<PassableValue> serializer() {
            return new v("com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue", j1.d(PassableValue.class), new d[]{j1.d(BoolValue.class), j1.d(BytesValue.class), j1.d(FloatValue.class), j1.d(FunctionValue.class), j1.d(IntValue.class), j1.d(ListValue.class), j1.d(MapValue.class), j1.d(NullValue.class), j1.d(StringValue.class), j1.d(TimestampValue.class), j1.d(UIntValue.class)}, new KSerializer[]{PassableValue$BoolValue$$serializer.INSTANCE, PassableValue$BytesValue$$serializer.INSTANCE, PassableValue$FloatValue$$serializer.INSTANCE, PassableValue$FunctionValue$$serializer.INSTANCE, PassableValue$IntValue$$serializer.INSTANCE, PassableValue$ListValue$$serializer.INSTANCE, PassableValue$MapValue$$serializer.INSTANCE, new z1("Null", NullValue.INSTANCE, new Annotation[0]), PassableValue$StringValue$$serializer.INSTANCE, PassableValue$TimestampValue$$serializer.INSTANCE, PassableValue$UIntValue$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @b0
    @a0("float")
    public static final class FloatValue implements PassableValue {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final double value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<FloatValue> serializer() {
                return PassableValue$FloatValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FloatValue(int i10, double d10, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PassableValue$FloatValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = d10;
        }

        public static /* synthetic */ FloatValue copy$default(FloatValue floatValue, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = floatValue.value;
            }
            return floatValue.copy(d10);
        }

        public final double component1() {
            return this.value;
        }

        @NotNull
        public final FloatValue copy(double d10) {
            return new FloatValue(d10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FloatValue) && Double.compare(this.value, ((FloatValue) obj).value) == 0;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "FloatValue(value=" + this.value + ")";
        }

        public FloatValue(double d10) {
            this.value = d10;
        }
    }

    @b0
    @a0(z.b.f306535b)
    public static final class FunctionValue implements PassableValue {

        @Nullable
        private final PassableValue args;

        @NotNull
        private final String value;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {null, new p(j1.d(PassableValue.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<FunctionValue> serializer() {
                return PassableValue$FunctionValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FunctionValue(int i10, String str, PassableValue passableValue, v2 v2Var) {
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, PassableValue$FunctionValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = str;
            this.args = passableValue;
        }

        public static /* synthetic */ FunctionValue copy$default(FunctionValue functionValue, String str, PassableValue passableValue, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = functionValue.value;
            }
            if ((i10 & 2) != 0) {
                passableValue = functionValue.args;
            }
            return functionValue.copy(str, passableValue);
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(FunctionValue functionValue, e eVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeStringElement(serialDescriptor, 0, functionValue.value);
            eVar.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], functionValue.args);
        }

        @NotNull
        public final String component1() {
            return this.value;
        }

        @Nullable
        public final PassableValue component2() {
            return this.args;
        }

        @NotNull
        public final FunctionValue copy(@NotNull String value, @Nullable PassableValue passableValue) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new FunctionValue(value, passableValue);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FunctionValue)) {
                return false;
            }
            FunctionValue functionValue = (FunctionValue) obj;
            return Intrinsics.areEqual(this.value, functionValue.value) && Intrinsics.areEqual(this.args, functionValue.args);
        }

        @Nullable
        public final PassableValue getArgs() {
            return this.args;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = this.value.hashCode() * 31;
            PassableValue passableValue = this.args;
            return iHashCode + (passableValue == null ? 0 : passableValue.hashCode());
        }

        @NotNull
        public String toString() {
            return "FunctionValue(value=" + this.value + ", args=" + this.args + ")";
        }

        public FunctionValue(@NotNull String value, @Nullable PassableValue passableValue) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.args = passableValue;
        }
    }

    @b0
    @a0("int")
    public static final class IntValue implements PassableValue {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final int value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<IntValue> serializer() {
                return PassableValue$IntValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ IntValue(int i10, int i11, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PassableValue$IntValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = i11;
        }

        public static /* synthetic */ IntValue copy$default(IntValue intValue, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = intValue.value;
            }
            return intValue.copy(i10);
        }

        public final int component1() {
            return this.value;
        }

        @NotNull
        public final IntValue copy(int i10) {
            return new IntValue(i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntValue) && this.value == ((IntValue) obj).value;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "IntValue(value=" + this.value + ")";
        }

        public IntValue(int i10) {
            this.value = i10;
        }
    }

    @b0
    @a0(AttributeType.LIST)
    public static final class ListValue implements PassableValue {

        @NotNull
        private final List<PassableValue> value;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(new v("com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue", j1.d(PassableValue.class), new d[]{j1.d(BoolValue.class), j1.d(BytesValue.class), j1.d(FloatValue.class), j1.d(FunctionValue.class), j1.d(IntValue.class), j1.d(ListValue.class), j1.d(MapValue.class), j1.d(NullValue.class), j1.d(StringValue.class), j1.d(TimestampValue.class), j1.d(UIntValue.class)}, new KSerializer[]{PassableValue$BoolValue$$serializer.INSTANCE, PassableValue$BytesValue$$serializer.INSTANCE, PassableValue$FloatValue$$serializer.INSTANCE, PassableValue$FunctionValue$$serializer.INSTANCE, PassableValue$IntValue$$serializer.INSTANCE, PassableValue$ListValue$$serializer.INSTANCE, PassableValue$MapValue$$serializer.INSTANCE, new z1("Null", NullValue.INSTANCE, new Annotation[0]), PassableValue$StringValue$$serializer.INSTANCE, PassableValue$TimestampValue$$serializer.INSTANCE, PassableValue$UIntValue$$serializer.INSTANCE}, new Annotation[0]))};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<ListValue> serializer() {
                return PassableValue$ListValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ListValue(int i10, List list, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PassableValue$ListValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListValue copy$default(ListValue listValue, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = listValue.value;
            }
            return listValue.copy(list);
        }

        @NotNull
        public final List<PassableValue> component1() {
            return this.value;
        }

        @NotNull
        public final ListValue copy(@NotNull List<? extends PassableValue> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ListValue(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ListValue) && Intrinsics.areEqual(this.value, ((ListValue) obj).value);
        }

        @NotNull
        public final List<PassableValue> getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "ListValue(value=" + this.value + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ListValue(@NotNull List<? extends PassableValue> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    @b0
    @a0("map")
    public static final class MapValue implements PassableValue {

        @NotNull
        private final Map<String, PassableValue> value;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new e1(b3.f315897a, new v("com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue", j1.d(PassableValue.class), new d[]{j1.d(BoolValue.class), j1.d(BytesValue.class), j1.d(FloatValue.class), j1.d(FunctionValue.class), j1.d(IntValue.class), j1.d(ListValue.class), j1.d(MapValue.class), j1.d(NullValue.class), j1.d(StringValue.class), j1.d(TimestampValue.class), j1.d(UIntValue.class)}, new KSerializer[]{PassableValue$BoolValue$$serializer.INSTANCE, PassableValue$BytesValue$$serializer.INSTANCE, PassableValue$FloatValue$$serializer.INSTANCE, PassableValue$FunctionValue$$serializer.INSTANCE, PassableValue$IntValue$$serializer.INSTANCE, PassableValue$ListValue$$serializer.INSTANCE, PassableValue$MapValue$$serializer.INSTANCE, new z1("Null", NullValue.INSTANCE, new Annotation[0]), PassableValue$StringValue$$serializer.INSTANCE, PassableValue$TimestampValue$$serializer.INSTANCE, PassableValue$UIntValue$$serializer.INSTANCE}, new Annotation[0]))};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<MapValue> serializer() {
                return PassableValue$MapValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ MapValue(int i10, Map map, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PassableValue$MapValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MapValue copy$default(MapValue mapValue, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = mapValue.value;
            }
            return mapValue.copy(map);
        }

        @NotNull
        public final Map<String, PassableValue> component1() {
            return this.value;
        }

        @NotNull
        public final MapValue copy(@NotNull Map<String, ? extends PassableValue> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new MapValue(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MapValue) && Intrinsics.areEqual(this.value, ((MapValue) obj).value);
        }

        @NotNull
        public final Map<String, PassableValue> getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "MapValue(value=" + this.value + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MapValue(@NotNull Map<String, ? extends PassableValue> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    @b0
    @a0("Null")
    public static final class NullValue implements PassableValue {

        @NotNull
        public static final NullValue INSTANCE = new NullValue();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: com.superwall.sdk.paywall.presentation.rule_logic.cel.models.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PassableValue.NullValue._init_$_anonymous_();
            }
        });

        private NullValue() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Null", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<NullValue> serializer() {
            return get$cachedSerializer();
        }
    }

    @b0
    @a0(androidx.constraintlayout.core.motion.utils.v.b.f43988e)
    public static final class StringValue implements PassableValue {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<StringValue> serializer() {
                return PassableValue$StringValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ StringValue(int i10, String str, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PassableValue$StringValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = str;
        }

        public static /* synthetic */ StringValue copy$default(StringValue stringValue, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = stringValue.value;
            }
            return stringValue.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.value;
        }

        @NotNull
        public final StringValue copy(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new StringValue(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringValue) && Intrinsics.areEqual(this.value, ((StringValue) obj).value);
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "StringValue(value=" + this.value + ")";
        }

        public StringValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    @b0
    @a0("timestamp")
    public static final class TimestampValue implements PassableValue {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final long value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<TimestampValue> serializer() {
                return PassableValue$TimestampValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ TimestampValue(int i10, long j10, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PassableValue$TimestampValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = j10;
        }

        public static /* synthetic */ TimestampValue copy$default(TimestampValue timestampValue, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = timestampValue.value;
            }
            return timestampValue.copy(j10);
        }

        public final long component1() {
            return this.value;
        }

        @NotNull
        public final TimestampValue copy(long j10) {
            return new TimestampValue(j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimestampValue) && this.value == ((TimestampValue) obj).value;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return Long.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "TimestampValue(value=" + this.value + ")";
        }

        public TimestampValue(long j10) {
            this.value = j10;
        }
    }

    @b0
    @a0("uint")
    public static final class UIntValue implements PassableValue {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final long value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<UIntValue> serializer() {
                return PassableValue$UIntValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ UIntValue(int i10, y1 y1Var, v2 v2Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, y1Var, v2Var);
        }

        /* JADX INFO: renamed from: copy-VKZWuLQ$default, reason: not valid java name */
        public static /* synthetic */ UIntValue m71copyVKZWuLQ$default(UIntValue uIntValue, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = uIntValue.value;
            }
            return uIntValue.m73copyVKZWuLQ(j10);
        }

        /* JADX INFO: renamed from: component1-s-VKNKU, reason: not valid java name */
        public final long m72component1sVKNKU() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-VKZWuLQ, reason: not valid java name */
        public final UIntValue m73copyVKZWuLQ(long j10) {
            return new UIntValue(j10, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UIntValue) && this.value == ((UIntValue) obj).value;
        }

        /* JADX INFO: renamed from: getValue-s-VKNKU, reason: not valid java name */
        public final long m74getValuesVKNKU() {
            return this.value;
        }

        public int hashCode() {
            return y1.H(this.value);
        }

        @NotNull
        public String toString() {
            return "UIntValue(value=" + y1.u0(this.value) + ")";
        }

        public /* synthetic */ UIntValue(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        private /* synthetic */ UIntValue(int i10, y1 y1Var, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PassableValue$UIntValue$$serializer.INSTANCE.getDescriptor());
            }
            this.value = y1Var.z0();
        }

        private UIntValue(long j10) {
            this.value = j10;
        }
    }
}
