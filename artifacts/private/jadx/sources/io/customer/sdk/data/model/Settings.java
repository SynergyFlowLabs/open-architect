package io.customer.sdk.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
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
public final class Settings {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f288519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f288520b;

    @l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements p0<Settings> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f288521a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f288521a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.customer.sdk.data.model.Settings", aVar, 2);
            pluginGeneratedSerialDescriptor.i("writeKey", false);
            pluginGeneratedSerialDescriptor.i("apiHost", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.e
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Settings deserialize(@NotNull Decoder decoder) {
            String strDecodeStringElement;
            String strDecodeStringElement2;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            v2 v2Var = null;
            if (dVarBeginStructure.c()) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strDecodeStringElement = null;
                String strDecodeStringElement3 = null;
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
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i11 |= 2;
                    }
                }
                strDecodeStringElement2 = strDecodeStringElement3;
                i10 = i11;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new Settings(i10, strDecodeStringElement, strDecodeStringElement2, v2Var);
        }

        @Override // kotlinx.serialization.d0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull Settings value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
            Settings.g(value, eVarBeginStructure, serialDescriptor);
            eVarBeginStructure.endStructure(serialDescriptor);
        }

        @Override // kotlinx.serialization.internal.p0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            b3 b3Var = b3.f315897a;
            return new KSerializer[]{b3Var, b3Var};
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
        public final KSerializer<Settings> serializer() {
            return a.f288521a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Settings(int i10, String str, String str2, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, a.f288521a.getDescriptor());
        }
        this.f288519a = str;
        this.f288520b = str2;
    }

    public static /* synthetic */ Settings d(Settings settings, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = settings.f288519a;
        }
        if ((i10 & 2) != 0) {
            str2 = settings.f288520b;
        }
        return settings.c(str, str2);
    }

    @oj.n
    public static final /* synthetic */ void g(Settings settings, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, settings.f288519a);
        eVar.encodeStringElement(serialDescriptor, 1, settings.f288520b);
    }

    @NotNull
    public final String a() {
        return this.f288519a;
    }

    @NotNull
    public final String b() {
        return this.f288520b;
    }

    @NotNull
    public final Settings c(@NotNull String writeKey, @NotNull String apiHost) {
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        return new Settings(writeKey, apiHost);
    }

    @NotNull
    public final String e() {
        return this.f288520b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) obj;
        return Intrinsics.areEqual(this.f288519a, settings.f288519a) && Intrinsics.areEqual(this.f288520b, settings.f288520b);
    }

    @NotNull
    public final String f() {
        return this.f288519a;
    }

    public int hashCode() {
        return (this.f288519a.hashCode() * 31) + this.f288520b.hashCode();
    }

    @NotNull
    public String toString() {
        return "Settings(writeKey=" + this.f288519a + ", apiHost=" + this.f288520b + ")";
    }

    public Settings(@NotNull String writeKey, @NotNull String apiHost) {
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        this.f288519a = writeKey;
        this.f288520b = apiHost;
    }
}
