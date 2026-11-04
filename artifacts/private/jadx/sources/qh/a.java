package qh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public interface a {

    /* JADX INFO: renamed from: qh.a$a, reason: collision with other inner class name */
    public static final class C2468a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f358985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f358986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f358987c;

        public C2468a(long j10, @NotNull String identifier, @NotNull String token) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(token, "token");
            this.f358985a = j10;
            this.f358986b = identifier;
            this.f358987c = token;
        }

        public static /* synthetic */ C2468a f(C2468a c2468a, long j10, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = c2468a.f358985a;
            }
            if ((i10 & 2) != 0) {
                str = c2468a.f358986b;
            }
            if ((i10 & 4) != 0) {
                str2 = c2468a.f358987c;
            }
            return c2468a.e(j10, str, str2);
        }

        @Override // qh.a
        public long S1() {
            return this.f358985a;
        }

        @Override // qh.a
        @NotNull
        public String a() {
            return this.f358986b;
        }

        public final long b() {
            return this.f358985a;
        }

        @NotNull
        public final String c() {
            return this.f358986b;
        }

        @NotNull
        public final String d() {
            return this.f358987c;
        }

        @NotNull
        public final C2468a e(long j10, @NotNull String identifier, @NotNull String token) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(token, "token");
            return new C2468a(j10, identifier, token);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2468a)) {
                return false;
            }
            C2468a c2468a = (C2468a) obj;
            return this.f358985a == c2468a.f358985a && Intrinsics.areEqual(this.f358986b, c2468a.f358986b) && Intrinsics.areEqual(this.f358987c, c2468a.f358987c);
        }

        @NotNull
        public final String g() {
            return this.f358987c;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f358985a) * 31) + this.f358986b.hashCode()) * 31) + this.f358987c.hashCode();
        }

        @NotNull
        public String toString() {
            return "DeletePushToken(timestamp=" + this.f358985a + ", identifier=" + this.f358986b + ", token=" + this.f358987c + ")";
        }
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f358988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f358989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final JSONObject f358990c;

        public b(long j10, @NotNull String identifier, @NotNull JSONObject attributes) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.f358988a = j10;
            this.f358989b = identifier;
            this.f358990c = attributes;
        }

        public static /* synthetic */ b f(b bVar, long j10, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = bVar.f358988a;
            }
            if ((i10 & 2) != 0) {
                str = bVar.f358989b;
            }
            if ((i10 & 4) != 0) {
                jSONObject = bVar.f358990c;
            }
            return bVar.e(j10, str, jSONObject);
        }

        @Override // qh.a
        public long S1() {
            return this.f358988a;
        }

        @Override // qh.a
        @NotNull
        public String a() {
            return this.f358989b;
        }

        public final long b() {
            return this.f358988a;
        }

        @NotNull
        public final String c() {
            return this.f358989b;
        }

        @NotNull
        public final JSONObject d() {
            return this.f358990c;
        }

        @NotNull
        public final b e(long j10, @NotNull String identifier, @NotNull JSONObject attributes) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return new b(j10, identifier, attributes);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f358988a == bVar.f358988a && Intrinsics.areEqual(this.f358989b, bVar.f358989b) && Intrinsics.areEqual(this.f358990c, bVar.f358990c);
        }

        @NotNull
        public final JSONObject g() {
            return this.f358990c;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f358988a) * 31) + this.f358989b.hashCode()) * 31) + this.f358990c.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdentifyProfile(timestamp=" + this.f358988a + ", identifier=" + this.f358989b + ", attributes=" + this.f358990c + ")";
        }
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f358991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f358992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f358993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f358994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f358995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final JSONObject f358996f;

        public c(long j10, @NotNull String identifier, @NotNull String token, @NotNull String platform, long j11, @NotNull JSONObject attributes) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.f358991a = j10;
            this.f358992b = identifier;
            this.f358993c = token;
            this.f358994d = platform;
            this.f358995e = j11;
            this.f358996f = attributes;
        }

        public static /* synthetic */ c i(c cVar, long j10, String str, String str2, String str3, long j11, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f358991a;
            }
            long j12 = j10;
            if ((i10 & 2) != 0) {
                str = cVar.f358992b;
            }
            String str4 = str;
            if ((i10 & 4) != 0) {
                str2 = cVar.f358993c;
            }
            String str5 = str2;
            if ((i10 & 8) != 0) {
                str3 = cVar.f358994d;
            }
            return cVar.h(j12, str4, str5, str3, (i10 & 16) != 0 ? cVar.f358995e : j11, (i10 & 32) != 0 ? cVar.f358996f : jSONObject);
        }

        @Override // qh.a
        public long S1() {
            return this.f358991a;
        }

        @Override // qh.a
        @NotNull
        public String a() {
            return this.f358992b;
        }

        public final long b() {
            return this.f358991a;
        }

        @NotNull
        public final String c() {
            return this.f358992b;
        }

        @NotNull
        public final String d() {
            return this.f358993c;
        }

        @NotNull
        public final String e() {
            return this.f358994d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f358991a == cVar.f358991a && Intrinsics.areEqual(this.f358992b, cVar.f358992b) && Intrinsics.areEqual(this.f358993c, cVar.f358993c) && Intrinsics.areEqual(this.f358994d, cVar.f358994d) && this.f358995e == cVar.f358995e && Intrinsics.areEqual(this.f358996f, cVar.f358996f);
        }

        public final long f() {
            return this.f358995e;
        }

        @NotNull
        public final JSONObject g() {
            return this.f358996f;
        }

        @NotNull
        public final c h(long j10, @NotNull String identifier, @NotNull String token, @NotNull String platform, long j11, @NotNull JSONObject attributes) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return new c(j10, identifier, token, platform, j11, attributes);
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.f358991a) * 31) + this.f358992b.hashCode()) * 31) + this.f358993c.hashCode()) * 31) + this.f358994d.hashCode()) * 31) + Long.hashCode(this.f358995e)) * 31) + this.f358996f.hashCode();
        }

        @NotNull
        public final JSONObject j() {
            return this.f358996f;
        }

        public final long k() {
            return this.f358995e;
        }

        @NotNull
        public final String l() {
            return this.f358994d;
        }

        @NotNull
        public final String m() {
            return this.f358993c;
        }

        @NotNull
        public String toString() {
            return "RegisterDeviceToken(timestamp=" + this.f358991a + ", identifier=" + this.f358992b + ", token=" + this.f358993c + ", platform=" + this.f358994d + ", lastUsed=" + this.f358995e + ", attributes=" + this.f358996f + ")";
        }
    }

    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f358997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f358998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f358999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f359000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final String f359001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final JSONObject f359002f;

        public d(long j10, @NotNull String identifier, @NotNull String deliveryType, @NotNull String deliveryId, @NotNull String event, @NotNull JSONObject metadata) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(deliveryType, "deliveryType");
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.f358997a = j10;
            this.f358998b = identifier;
            this.f358999c = deliveryType;
            this.f359000d = deliveryId;
            this.f359001e = event;
            this.f359002f = metadata;
        }

        public static /* synthetic */ d i(d dVar, long j10, String str, String str2, String str3, String str4, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = dVar.f358997a;
            }
            long j11 = j10;
            if ((i10 & 2) != 0) {
                str = dVar.f358998b;
            }
            String str5 = str;
            if ((i10 & 4) != 0) {
                str2 = dVar.f358999c;
            }
            String str6 = str2;
            if ((i10 & 8) != 0) {
                str3 = dVar.f359000d;
            }
            String str7 = str3;
            if ((i10 & 16) != 0) {
                str4 = dVar.f359001e;
            }
            String str8 = str4;
            if ((i10 & 32) != 0) {
                jSONObject = dVar.f359002f;
            }
            return dVar.h(j11, str5, str6, str7, str8, jSONObject);
        }

        @Override // qh.a
        public long S1() {
            return this.f358997a;
        }

        @Override // qh.a
        @NotNull
        public String a() {
            return this.f358998b;
        }

        public final long b() {
            return this.f358997a;
        }

        @NotNull
        public final String c() {
            return this.f358998b;
        }

        @NotNull
        public final String d() {
            return this.f358999c;
        }

        @NotNull
        public final String e() {
            return this.f359000d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f358997a == dVar.f358997a && Intrinsics.areEqual(this.f358998b, dVar.f358998b) && Intrinsics.areEqual(this.f358999c, dVar.f358999c) && Intrinsics.areEqual(this.f359000d, dVar.f359000d) && Intrinsics.areEqual(this.f359001e, dVar.f359001e) && Intrinsics.areEqual(this.f359002f, dVar.f359002f);
        }

        @NotNull
        public final String f() {
            return this.f359001e;
        }

        @NotNull
        public final JSONObject g() {
            return this.f359002f;
        }

        @NotNull
        public final d h(long j10, @NotNull String identifier, @NotNull String deliveryType, @NotNull String deliveryId, @NotNull String event, @NotNull JSONObject metadata) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(deliveryType, "deliveryType");
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            return new d(j10, identifier, deliveryType, deliveryId, event, metadata);
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.f358997a) * 31) + this.f358998b.hashCode()) * 31) + this.f358999c.hashCode()) * 31) + this.f359000d.hashCode()) * 31) + this.f359001e.hashCode()) * 31) + this.f359002f.hashCode();
        }

        @NotNull
        public final String j() {
            return this.f359000d;
        }

        @NotNull
        public final String k() {
            return this.f358999c;
        }

        @NotNull
        public final String l() {
            return this.f359001e;
        }

        @NotNull
        public final JSONObject m() {
            return this.f359002f;
        }

        @NotNull
        public String toString() {
            return "TrackDeliveryEvent(timestamp=" + this.f358997a + ", identifier=" + this.f358998b + ", deliveryType=" + this.f358999c + ", deliveryId=" + this.f359000d + ", event=" + this.f359001e + ", metadata=" + this.f359002f + ")";
        }
    }

    public static final class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f359003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f359004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f359005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f359006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final JSONObject f359007e;

        public e(long j10, @NotNull String identifier, @NotNull String event, @NotNull String type, @NotNull JSONObject properties) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(properties, "properties");
            this.f359003a = j10;
            this.f359004b = identifier;
            this.f359005c = event;
            this.f359006d = type;
            this.f359007e = properties;
        }

        public static /* synthetic */ e h(e eVar, long j10, String str, String str2, String str3, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = eVar.f359003a;
            }
            long j11 = j10;
            if ((i10 & 2) != 0) {
                str = eVar.f359004b;
            }
            String str4 = str;
            if ((i10 & 4) != 0) {
                str2 = eVar.f359005c;
            }
            String str5 = str2;
            if ((i10 & 8) != 0) {
                str3 = eVar.f359006d;
            }
            String str6 = str3;
            if ((i10 & 16) != 0) {
                jSONObject = eVar.f359007e;
            }
            return eVar.g(j11, str4, str5, str6, jSONObject);
        }

        @Override // qh.a
        public long S1() {
            return this.f359003a;
        }

        @Override // qh.a
        @NotNull
        public String a() {
            return this.f359004b;
        }

        public final long b() {
            return this.f359003a;
        }

        @NotNull
        public final String c() {
            return this.f359004b;
        }

        @NotNull
        public final String d() {
            return this.f359005c;
        }

        @NotNull
        public final String e() {
            return this.f359006d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f359003a == eVar.f359003a && Intrinsics.areEqual(this.f359004b, eVar.f359004b) && Intrinsics.areEqual(this.f359005c, eVar.f359005c) && Intrinsics.areEqual(this.f359006d, eVar.f359006d) && Intrinsics.areEqual(this.f359007e, eVar.f359007e);
        }

        @NotNull
        public final JSONObject f() {
            return this.f359007e;
        }

        @NotNull
        public final e g(long j10, @NotNull String identifier, @NotNull String event, @NotNull String type, @NotNull JSONObject properties) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(properties, "properties");
            return new e(j10, identifier, event, type, properties);
        }

        public int hashCode() {
            return (((((((Long.hashCode(this.f359003a) * 31) + this.f359004b.hashCode()) * 31) + this.f359005c.hashCode()) * 31) + this.f359006d.hashCode()) * 31) + this.f359007e.hashCode();
        }

        @NotNull
        public final String i() {
            return this.f359005c;
        }

        @NotNull
        public final JSONObject j() {
            return this.f359007e;
        }

        @NotNull
        public final String k() {
            return this.f359006d;
        }

        @NotNull
        public String toString() {
            return "TrackEvent(timestamp=" + this.f359003a + ", identifier=" + this.f359004b + ", event=" + this.f359005c + ", type=" + this.f359006d + ", properties=" + this.f359007e + ")";
        }
    }

    public static final class f implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f359008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f359009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f359010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f359011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final String f359012e;

        public f(long j10, @NotNull String identifier, @NotNull String deliveryId, @NotNull String deviceToken, @NotNull String event) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f359008a = j10;
            this.f359009b = identifier;
            this.f359010c = deliveryId;
            this.f359011d = deviceToken;
            this.f359012e = event;
        }

        public static /* synthetic */ f h(f fVar, long j10, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = fVar.f359008a;
            }
            long j11 = j10;
            if ((i10 & 2) != 0) {
                str = fVar.f359009b;
            }
            String str5 = str;
            if ((i10 & 4) != 0) {
                str2 = fVar.f359010c;
            }
            String str6 = str2;
            if ((i10 & 8) != 0) {
                str3 = fVar.f359011d;
            }
            String str7 = str3;
            if ((i10 & 16) != 0) {
                str4 = fVar.f359012e;
            }
            return fVar.g(j11, str5, str6, str7, str4);
        }

        @Override // qh.a
        public long S1() {
            return this.f359008a;
        }

        @Override // qh.a
        @NotNull
        public String a() {
            return this.f359009b;
        }

        public final long b() {
            return this.f359008a;
        }

        @NotNull
        public final String c() {
            return this.f359009b;
        }

        @NotNull
        public final String d() {
            return this.f359010c;
        }

        @NotNull
        public final String e() {
            return this.f359011d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f359008a == fVar.f359008a && Intrinsics.areEqual(this.f359009b, fVar.f359009b) && Intrinsics.areEqual(this.f359010c, fVar.f359010c) && Intrinsics.areEqual(this.f359011d, fVar.f359011d) && Intrinsics.areEqual(this.f359012e, fVar.f359012e);
        }

        @NotNull
        public final String f() {
            return this.f359012e;
        }

        @NotNull
        public final f g(long j10, @NotNull String identifier, @NotNull String deliveryId, @NotNull String deviceToken, @NotNull String event) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
            Intrinsics.checkNotNullParameter(event, "event");
            return new f(j10, identifier, deliveryId, deviceToken, event);
        }

        public int hashCode() {
            return (((((((Long.hashCode(this.f359008a) * 31) + this.f359009b.hashCode()) * 31) + this.f359010c.hashCode()) * 31) + this.f359011d.hashCode()) * 31) + this.f359012e.hashCode();
        }

        @NotNull
        public final String i() {
            return this.f359010c;
        }

        @NotNull
        public final String j() {
            return this.f359011d;
        }

        @NotNull
        public final String k() {
            return this.f359012e;
        }

        @NotNull
        public String toString() {
            return "TrackPushMetric(timestamp=" + this.f359008a + ", identifier=" + this.f359009b + ", deliveryId=" + this.f359010c + ", deviceToken=" + this.f359011d + ", event=" + this.f359012e + ")";
        }
    }

    long S1();

    @NotNull
    String a();
}
