package io.ktor.http;

import io.ktor.util.date.GMTDate;
import java.io.Serializable;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.b0
public final class Cookie implements Serializable {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oj.f
    @NotNull
    private static final kotlin.f0<KSerializer<Object>>[] f295422k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f295424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c0 f295425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Integer f295426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final GMTDate f295427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f295428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f295429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f295430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f295431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f295432j;

    @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements kotlinx.serialization.internal.p0<Cookie> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f295433a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f295433a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.http.Cookie", aVar, 10);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("value", false);
            pluginGeneratedSerialDescriptor.i(io.sentry.rrweb.j.b.f306741f, true);
            pluginGeneratedSerialDescriptor.i("maxAge", true);
            pluginGeneratedSerialDescriptor.i("expires", true);
            pluginGeneratedSerialDescriptor.i("domain", true);
            pluginGeneratedSerialDescriptor.i("path", true);
            pluginGeneratedSerialDescriptor.i("secure", true);
            pluginGeneratedSerialDescriptor.i("httpOnly", true);
            pluginGeneratedSerialDescriptor.i("extensions", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.e
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Cookie deserialize(@NotNull Decoder decoder) {
            boolean z10;
            Map map;
            String str;
            String str2;
            GMTDate gMTDate;
            Integer num;
            c0 c0Var;
            boolean z11;
            int i10;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            kotlin.f0[] f0VarArr = Cookie.f295422k;
            int i11 = 7;
            if (dVarBeginStructure.c()) {
                String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                c0 c0Var2 = (c0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.e) f0VarArr[2].getValue(), null);
                Integer num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.y0.f316055a, null);
                GMTDate gMTDate2 = (GMTDate) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GMTDate.a.f296572a, null);
                kotlinx.serialization.internal.b3 b3Var = kotlinx.serialization.internal.b3.f315897a;
                String str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b3Var, null);
                String str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b3Var, null);
                boolean zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                boolean zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.e) f0VarArr[9].getValue(), null);
                str3 = strDecodeStringElement;
                z10 = zDecodeBooleanElement;
                str2 = str6;
                str = str5;
                num = num2;
                z11 = zDecodeBooleanElement2;
                gMTDate = gMTDate2;
                i10 = 1023;
                c0Var = c0Var2;
                str4 = strDecodeStringElement2;
            } else {
                int i12 = 2;
                boolean z12 = true;
                boolean zDecodeBooleanElement3 = false;
                int i13 = 0;
                Map map2 = null;
                String str7 = null;
                String str8 = null;
                GMTDate gMTDate3 = null;
                Integer num3 = null;
                String strDecodeStringElement3 = null;
                String strDecodeStringElement4 = null;
                boolean zDecodeBooleanElement4 = false;
                c0 c0Var3 = null;
                while (z12) {
                    int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z12 = false;
                            i11 = 7;
                            i12 = 2;
                            break;
                        case 0:
                            strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                            i13 |= 1;
                            i11 = 7;
                            i12 = 2;
                            break;
                        case 1:
                            strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i13 |= 2;
                            i11 = 7;
                            break;
                        case 2:
                            c0Var3 = (c0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i12, (kotlinx.serialization.e) f0VarArr[i12].getValue(), c0Var3);
                            i13 |= 4;
                            i11 = 7;
                            break;
                        case 3:
                            num3 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.y0.f316055a, num3);
                            i13 |= 8;
                            i11 = 7;
                            break;
                        case 4:
                            gMTDate3 = (GMTDate) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GMTDate.a.f296572a, gMTDate3);
                            i13 |= 16;
                            i11 = 7;
                            break;
                        case 5:
                            str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.b3.f315897a, str7);
                            i13 |= 32;
                            i11 = 7;
                            break;
                        case 6:
                            str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.b3.f315897a, str8);
                            i13 |= 64;
                            i11 = 7;
                            break;
                        case 7:
                            zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, i11);
                            i13 |= 128;
                            break;
                        case 8:
                            zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                            i13 |= 256;
                            break;
                        case 9:
                            map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.e) f0VarArr[9].getValue(), map2);
                            i13 |= 512;
                            break;
                        default:
                            throw new kotlinx.serialization.t0(iDecodeElementIndex);
                    }
                }
                z10 = zDecodeBooleanElement3;
                map = map2;
                str = str7;
                str2 = str8;
                gMTDate = gMTDate3;
                num = num3;
                c0Var = c0Var3;
                z11 = zDecodeBooleanElement4;
                i10 = i13;
                str3 = strDecodeStringElement3;
                str4 = strDecodeStringElement4;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new Cookie(i10, str3, str4, c0Var, num, gMTDate, str, str2, z10, z11, map, (kotlinx.serialization.internal.v2) null);
        }

        @Override // kotlinx.serialization.d0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull Cookie value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
            Cookie.A(value, eVarBeginStructure, serialDescriptor);
            eVarBeginStructure.endStructure(serialDescriptor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.serialization.internal.p0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            kotlin.f0[] f0VarArr = Cookie.f295422k;
            kotlinx.serialization.internal.b3 b3Var = kotlinx.serialization.internal.b3.f315897a;
            kotlinx.serialization.internal.i iVar = kotlinx.serialization.internal.i.f315935a;
            return new KSerializer[]{b3Var, b3Var, f0VarArr[2].getValue(), hk.a.v(kotlinx.serialization.internal.y0.f316055a), hk.a.v(GMTDate.a.f296572a), hk.a.v(b3Var), hk.a.v(b3Var), iVar, iVar, f0VarArr[9].getValue()};
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
        public final KSerializer<Cookie> serializer() {
            return a.f295433a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.j0 j0Var = kotlin.j0.PUBLICATION;
        f295422k = new kotlin.f0[]{null, null, kotlin.g0.b(j0Var, new Function0() { // from class: io.ktor.http.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Cookie.c();
            }
        }), null, null, null, null, null, null, kotlin.g0.b(j0Var, new Function0() { // from class: io.ktor.http.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Cookie.d();
            }
        })};
    }

    public /* synthetic */ Cookie(int i10, String str, String str2, c0 c0Var, Integer num, GMTDate gMTDate, String str3, String str4, boolean z10, boolean z11, Map map, kotlinx.serialization.internal.v2 v2Var) {
        if (3 != (i10 & 3)) {
            kotlinx.serialization.internal.g2.b(i10, 3, a.f295433a.getDescriptor());
        }
        this.f295423a = str;
        this.f295424b = str2;
        if ((i10 & 4) == 0) {
            this.f295425c = c0.URI_ENCODING;
        } else {
            this.f295425c = c0Var;
        }
        if ((i10 & 8) == 0) {
            this.f295426d = null;
        } else {
            this.f295426d = num;
        }
        if ((i10 & 16) == 0) {
            this.f295427e = null;
        } else {
            this.f295427e = gMTDate;
        }
        if ((i10 & 32) == 0) {
            this.f295428f = null;
        } else {
            this.f295428f = str3;
        }
        if ((i10 & 64) == 0) {
            this.f295429g = null;
        } else {
            this.f295429g = str4;
        }
        if ((i10 & 128) == 0) {
            this.f295430h = false;
        } else {
            this.f295430h = z10;
        }
        if ((i10 & 256) == 0) {
            this.f295431i = false;
        } else {
            this.f295431i = z11;
        }
        if ((i10 & 512) == 0) {
            this.f295432j = MapsKt.emptyMap();
        } else {
            this.f295432j = map;
        }
    }

    @oj.n
    public static final /* synthetic */ void A(Cookie cookie, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        kotlin.f0<KSerializer<Object>>[] f0VarArr = f295422k;
        eVar.encodeStringElement(serialDescriptor, 0, cookie.f295423a);
        eVar.encodeStringElement(serialDescriptor, 1, cookie.f295424b);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || cookie.f295425c != c0.URI_ENCODING) {
            eVar.encodeSerializableElement(serialDescriptor, 2, f0VarArr[2].getValue(), cookie.f295425c);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || cookie.f295426d != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.y0.f316055a, cookie.f295426d);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 4) || cookie.f295427e != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 4, GMTDate.a.f296572a, cookie.f295427e);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 5) || cookie.f295428f != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.b3.f315897a, cookie.f295428f);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 6) || cookie.f295429g != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.b3.f315897a, cookie.f295429g);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 7) || cookie.f295430h) {
            eVar.encodeBooleanElement(serialDescriptor, 7, cookie.f295430h);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 8) || cookie.f295431i) {
            eVar.encodeBooleanElement(serialDescriptor, 8, cookie.f295431i);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.areEqual(cookie.f295432j, MapsKt.emptyMap())) {
            return;
        }
        eVar.encodeSerializableElement(serialDescriptor, 9, f0VarArr[9].getValue(), cookie.f295432j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer c() {
        return kotlinx.serialization.internal.l0.c("io.ktor.http.CookieEncoding", c0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer d() {
        kotlinx.serialization.internal.b3 b3Var = kotlinx.serialization.internal.b3.f315897a;
        return new kotlinx.serialization.internal.e1(b3Var, hk.a.v(b3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cookie q(Cookie cookie, String str, String str2, c0 c0Var, Integer num, GMTDate gMTDate, String str3, String str4, boolean z10, boolean z11, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cookie.f295423a;
        }
        if ((i10 & 2) != 0) {
            str2 = cookie.f295424b;
        }
        if ((i10 & 4) != 0) {
            c0Var = cookie.f295425c;
        }
        if ((i10 & 8) != 0) {
            num = cookie.f295426d;
        }
        if ((i10 & 16) != 0) {
            gMTDate = cookie.f295427e;
        }
        if ((i10 & 32) != 0) {
            str3 = cookie.f295428f;
        }
        if ((i10 & 64) != 0) {
            str4 = cookie.f295429g;
        }
        if ((i10 & 128) != 0) {
            z10 = cookie.f295430h;
        }
        if ((i10 & 256) != 0) {
            z11 = cookie.f295431i;
        }
        if ((i10 & 512) != 0) {
            map = cookie.f295432j;
        }
        boolean z12 = z11;
        Map map2 = map;
        String str5 = str4;
        boolean z13 = z10;
        GMTDate gMTDate2 = gMTDate;
        String str6 = str3;
        return cookie.p(str, str2, c0Var, num, gMTDate2, str6, str5, z13, z12, map2);
    }

    private final Object writeReplace() {
        return io.ktor.utils.io.p0.b(d0.f295781a, this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return Intrinsics.areEqual(this.f295423a, cookie.f295423a) && Intrinsics.areEqual(this.f295424b, cookie.f295424b) && this.f295425c == cookie.f295425c && Intrinsics.areEqual(this.f295426d, cookie.f295426d) && Intrinsics.areEqual(this.f295427e, cookie.f295427e) && Intrinsics.areEqual(this.f295428f, cookie.f295428f) && Intrinsics.areEqual(this.f295429g, cookie.f295429g) && this.f295430h == cookie.f295430h && this.f295431i == cookie.f295431i && Intrinsics.areEqual(this.f295432j, cookie.f295432j);
    }

    @NotNull
    public final String f() {
        return this.f295423a;
    }

    @NotNull
    public final Map<String, String> g() {
        return this.f295432j;
    }

    @NotNull
    public final String getName() {
        return this.f295423a;
    }

    @NotNull
    public final String h() {
        return this.f295424b;
    }

    public int hashCode() {
        int iHashCode = ((((this.f295423a.hashCode() * 31) + this.f295424b.hashCode()) * 31) + this.f295425c.hashCode()) * 31;
        Integer num = this.f295426d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        GMTDate gMTDate = this.f295427e;
        int iHashCode3 = (iHashCode2 + (gMTDate == null ? 0 : gMTDate.hashCode())) * 31;
        String str = this.f295428f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f295429g;
        return ((((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f295430h)) * 31) + Boolean.hashCode(this.f295431i)) * 31) + this.f295432j.hashCode();
    }

    @NotNull
    public final c0 i() {
        return this.f295425c;
    }

    @Nullable
    public final Integer j() {
        return this.f295426d;
    }

    @Nullable
    public final GMTDate k() {
        return this.f295427e;
    }

    @Nullable
    public final String l() {
        return this.f295428f;
    }

    @Nullable
    public final String m() {
        return this.f295429g;
    }

    public final boolean n() {
        return this.f295430h;
    }

    public final boolean o() {
        return this.f295431i;
    }

    @NotNull
    public final Cookie p(@NotNull String name, @NotNull String value, @NotNull c0 encoding, @Nullable Integer num, @Nullable GMTDate gMTDate, @Nullable String str, @Nullable String str2, boolean z10, boolean z11, @NotNull Map<String, String> extensions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return new Cookie(name, value, encoding, num, gMTDate, str, str2, z10, z11, extensions);
    }

    @Nullable
    public final String r() {
        return this.f295428f;
    }

    @NotNull
    public final c0 s() {
        return this.f295425c;
    }

    @Nullable
    public final GMTDate t() {
        return this.f295427e;
    }

    @NotNull
    public String toString() {
        return "Cookie(name=" + this.f295423a + ", value=" + this.f295424b + ", encoding=" + this.f295425c + ", maxAge=" + this.f295426d + ", expires=" + this.f295427e + ", domain=" + this.f295428f + ", path=" + this.f295429g + ", secure=" + this.f295430h + ", httpOnly=" + this.f295431i + ", extensions=" + this.f295432j + ')';
    }

    @NotNull
    public final Map<String, String> u() {
        return this.f295432j;
    }

    public final boolean v() {
        return this.f295431i;
    }

    @oj.i(name = "getMaxAgeInt")
    @Nullable
    public final Integer w() {
        return this.f295426d;
    }

    @Nullable
    public final String x() {
        return this.f295429g;
    }

    public final boolean y() {
        return this.f295430h;
    }

    @NotNull
    public final String z() {
        return this.f295424b;
    }

    public Cookie(@NotNull String name, @NotNull String value, @NotNull c0 encoding, @Nullable Integer num, @Nullable GMTDate gMTDate, @Nullable String str, @Nullable String str2, boolean z10, boolean z11, @NotNull Map<String, String> extensions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f295423a = name;
        this.f295424b = value;
        this.f295425c = encoding;
        this.f295426d = num;
        this.f295427e = gMTDate;
        this.f295428f = str;
        this.f295429g = str2;
        this.f295430h = z10;
        this.f295431i = z11;
        this.f295432j = extensions;
    }

    public /* synthetic */ Cookie(String str, String str2, c0 c0Var, Integer num, GMTDate gMTDate, String str3, String str4, boolean z10, boolean z11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? c0.URI_ENCODING : c0Var, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : gMTDate, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? MapsKt.emptyMap() : map);
    }
}
