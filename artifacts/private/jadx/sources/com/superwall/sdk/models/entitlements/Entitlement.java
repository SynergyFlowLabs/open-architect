package com.superwall.sdk.models.entitlements;

import com.superwall.sdk.models.entitlements.Entitlement;
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
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Entitlement {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267442id;

    @NotNull
    private final Type type;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, Type.Companion.serializer()};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Entitlement> serializer() {
            return Entitlement$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    public enum Type {
        SERVICE_LEVEL("SERVICE_LEVEL");


        @NotNull
        private final String raw;
        private static final /* synthetic */ a $ENTRIES = c.c(values());

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: xf.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Entitlement.Type._init_$_anonymous_();
            }
        });

        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Type.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer<Type> serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        Type(String str) {
            this.raw = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return l0.a("com.superwall.sdk.models.entitlements.Entitlement.Type", values(), new String[]{"SERVICE_LEVEL"}, new Annotation[][]{null}, null);
        }

        @NotNull
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getRaw() {
            return this.raw;
        }
    }

    public /* synthetic */ Entitlement(int i10, String str, Type type, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, Entitlement$$serializer.INSTANCE.getDescriptor());
        }
        this.f267442id = str;
        if ((i10 & 2) == 0) {
            this.type = Type.SERVICE_LEVEL;
        } else {
            this.type = type;
        }
    }

    public static /* synthetic */ Entitlement copy$default(Entitlement entitlement, String str, Type type, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entitlement.f267442id;
        }
        if ((i10 & 2) != 0) {
            type = entitlement.type;
        }
        return entitlement.copy(str, type);
    }

    @a0("identifier")
    public static /* synthetic */ void getId$annotations() {
    }

    @a0("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Entitlement entitlement, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, entitlement.f267442id);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && entitlement.type == Type.SERVICE_LEVEL) {
            return;
        }
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], entitlement.type);
    }

    @NotNull
    public final String component1() {
        return this.f267442id;
    }

    @NotNull
    public final Type component2() {
        return this.type;
    }

    @NotNull
    public final Entitlement copy(@NotNull String id2, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Entitlement(id2, type);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entitlement)) {
            return false;
        }
        Entitlement entitlement = (Entitlement) obj;
        return Intrinsics.areEqual(this.f267442id, entitlement.f267442id) && this.type == entitlement.type;
    }

    @NotNull
    public final String getId() {
        return this.f267442id;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.f267442id.hashCode() * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "Entitlement(id=" + this.f267442id + ", type=" + this.type + ")";
    }

    public Entitlement(@NotNull String id2, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f267442id = id2;
        this.type = type;
    }

    public /* synthetic */ Entitlement(String str, Type type, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? Type.SERVICE_LEVEL : type);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Entitlement(@NotNull String id2) {
        this(id2, Type.SERVICE_LEVEL);
        Intrinsics.checkNotNullParameter(id2, "id");
    }
}
