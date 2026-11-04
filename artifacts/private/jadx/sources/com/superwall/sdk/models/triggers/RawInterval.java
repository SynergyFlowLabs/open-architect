package com.superwall.sdk.models.triggers;

import com.superwall.sdk.models.triggers.RawInterval;
import java.lang.annotation.Annotation;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class RawInterval {

    @Nullable
    private final Integer minutes;

    @NotNull
    private final IntervalType type;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {IntervalType.Companion.serializer(), null};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RawInterval> serializer() {
            return RawInterval$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    public enum IntervalType {
        MINUTES,
        INFINITY;

        private static final /* synthetic */ a $ENTRIES = c.c(values());

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: bg.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawInterval.IntervalType._init_$_anonymous_();
            }
        });

        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) IntervalType.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer<IntervalType> serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return l0.a("com.superwall.sdk.models.triggers.RawInterval.IntervalType", values(), new String[]{"MINUTES", "INFINITY"}, new Annotation[][]{null, null}, null);
        }

        @NotNull
        public static a<IntervalType> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ RawInterval(int i10, IntervalType intervalType, Integer num, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, RawInterval$$serializer.INSTANCE.getDescriptor());
        }
        this.type = intervalType;
        if ((i10 & 2) == 0) {
            this.minutes = null;
        } else {
            this.minutes = num;
        }
    }

    public static /* synthetic */ RawInterval copy$default(RawInterval rawInterval, IntervalType intervalType, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            intervalType = rawInterval.type;
        }
        if ((i10 & 2) != 0) {
            num = rawInterval.minutes;
        }
        return rawInterval.copy(intervalType, num);
    }

    @a0("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(RawInterval rawInterval, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], rawInterval.type);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && rawInterval.minutes == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, y0.f316055a, rawInterval.minutes);
    }

    @NotNull
    public final IntervalType component1() {
        return this.type;
    }

    @Nullable
    public final Integer component2() {
        return this.minutes;
    }

    @NotNull
    public final RawInterval copy(@NotNull IntervalType type, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new RawInterval(type, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawInterval)) {
            return false;
        }
        RawInterval rawInterval = (RawInterval) obj;
        return this.type == rawInterval.type && Intrinsics.areEqual(this.minutes, rawInterval.minutes);
    }

    @Nullable
    public final Integer getMinutes() {
        return this.minutes;
    }

    @NotNull
    public final IntervalType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Integer num = this.minutes;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "RawInterval(type=" + this.type + ", minutes=" + this.minutes + ")";
    }

    public RawInterval(@NotNull IntervalType type, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.minutes = num;
    }

    public /* synthetic */ RawInterval(IntervalType intervalType, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(intervalType, (i10 & 2) != 0 ? null : num);
    }
}
