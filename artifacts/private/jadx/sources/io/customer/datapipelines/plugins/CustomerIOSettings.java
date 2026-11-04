package io.customer.datapipelines.plugins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class CustomerIOSettings {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f288314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f288315b;

    @kotlin.l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements p0<CustomerIOSettings> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f288316a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f288316a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.customer.datapipelines.plugins.CustomerIOSettings", aVar, 2);
            pluginGeneratedSerialDescriptor.i("apiKey", false);
            pluginGeneratedSerialDescriptor.i("apiHost", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.e
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CustomerIOSettings deserialize(@NotNull Decoder decoder) {
            String strDecodeStringElement;
            String str;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            v2 v2Var = null;
            if (dVarBeginStructure.c()) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strDecodeStringElement = null;
                String str2 = null;
                while (z10) {
                    int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z10 = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i11 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new t0(iDecodeElementIndex);
                        }
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, str2);
                        i11 |= 2;
                    }
                }
                str = str2;
                i10 = i11;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new CustomerIOSettings(i10, strDecodeStringElement, str, v2Var);
        }

        @Override // kotlinx.serialization.d0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull CustomerIOSettings value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
            CustomerIOSettings.i(value, eVarBeginStructure, serialDescriptor);
            eVarBeginStructure.endStructure(serialDescriptor);
        }

        @Override // kotlinx.serialization.internal.p0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            b3 b3Var = b3.f315897a;
            return new KSerializer[]{b3Var, hk.a.v(b3Var)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public final KSerializer<CustomerIOSettings> serializer() {
            return a.f288316a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CustomerIOSettings(int i10, String str, String str2, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, a.f288316a.getDescriptor());
        }
        this.f288314a = str;
        if ((i10 & 2) == 0) {
            this.f288315b = null;
        } else {
            this.f288315b = str2;
        }
    }

    public static /* synthetic */ CustomerIOSettings d(CustomerIOSettings customerIOSettings, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerIOSettings.f288314a;
        }
        if ((i10 & 2) != 0) {
            str2 = customerIOSettings.f288315b;
        }
        return customerIOSettings.c(str, str2);
    }

    @oj.n
    public static final /* synthetic */ void i(CustomerIOSettings customerIOSettings, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, customerIOSettings.f288314a);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && customerIOSettings.f288315b == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, customerIOSettings.f288315b);
    }

    @NotNull
    public final String a() {
        return this.f288314a;
    }

    @Nullable
    public final String b() {
        return this.f288315b;
    }

    @NotNull
    public final CustomerIOSettings c(@NotNull String apiKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        return new CustomerIOSettings(apiKey, str);
    }

    @Nullable
    public final String e() {
        return this.f288315b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerIOSettings)) {
            return false;
        }
        CustomerIOSettings customerIOSettings = (CustomerIOSettings) obj;
        return Intrinsics.areEqual(this.f288314a, customerIOSettings.f288314a) && Intrinsics.areEqual(this.f288315b, customerIOSettings.f288315b);
    }

    @NotNull
    public final String f() {
        return this.f288314a;
    }

    public final void g(@Nullable String str) {
        this.f288315b = str;
    }

    public final void h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f288314a = str;
    }

    public int hashCode() {
        int iHashCode = this.f288314a.hashCode() * 31;
        String str = this.f288315b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "CustomerIOSettings(apiKey=" + this.f288314a + ", apiHost=" + this.f288315b + ")";
    }

    public CustomerIOSettings(@NotNull String apiKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f288314a = apiKey;
        this.f288315b = str;
    }

    public /* synthetic */ CustomerIOSettings(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
