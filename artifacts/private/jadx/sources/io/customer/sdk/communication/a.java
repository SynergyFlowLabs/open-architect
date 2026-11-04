package io.customer.sdk.communication;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f288485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f288486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Date f288487c;

    /* JADX INFO: renamed from: io.customer.sdk.communication.a$a, reason: collision with other inner class name */
    public static final class C1960a extends a {
        public C1960a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f288488d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String identifier) {
            super(null);
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.f288488d = identifier;
        }

        public static /* synthetic */ b f(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f288488d;
            }
            return bVar.e(str);
        }

        @NotNull
        public final String d() {
            return this.f288488d;
        }

        @NotNull
        public final b e(@NotNull String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new b(identifier);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f288488d, ((b) obj).f288488d);
        }

        @NotNull
        public final String g() {
            return this.f288488d;
        }

        public int hashCode() {
            return this.f288488d.hashCode();
        }

        @NotNull
        public String toString() {
            return "ProfileIdentifiedEvent(identifier=" + this.f288488d + ")";
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f288489d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String token) {
            super(null);
            Intrinsics.checkNotNullParameter(token, "token");
            this.f288489d = token;
        }

        public static /* synthetic */ c f(c cVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f288489d;
            }
            return cVar.e(str);
        }

        @NotNull
        public final String d() {
            return this.f288489d;
        }

        @NotNull
        public final c e(@NotNull String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return new c(token);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f288489d, ((c) obj).f288489d);
        }

        @NotNull
        public final String g() {
            return this.f288489d;
        }

        public int hashCode() {
            return this.f288489d.hashCode();
        }

        @NotNull
        public String toString() {
            return "RegisterDeviceTokenEvent(token=" + this.f288489d + ")";
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final d f288490d = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f288491d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f288491d = name;
        }

        public static /* synthetic */ e f(e eVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = eVar.f288491d;
            }
            return eVar.e(str);
        }

        @NotNull
        public final String d() {
            return this.f288491d;
        }

        @NotNull
        public final e e(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new e(name);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && Intrinsics.areEqual(this.f288491d, ((e) obj).f288491d)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String g() {
            return this.f288491d;
        }

        public int hashCode() {
            return this.f288491d.hashCode();
        }

        @NotNull
        public String toString() {
            return "ScreenViewedEvent(name=" + this.f288491d + ")";
        }
    }

    public static final class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f288495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final kh.a f288496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final String f288497f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull String deliveryId, @NotNull kh.a event, @NotNull String deviceToken) {
            super(null);
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
            this.f288495d = deliveryId;
            this.f288496e = event;
            this.f288497f = deviceToken;
        }

        public static /* synthetic */ g h(g gVar, String str, kh.a aVar, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gVar.f288495d;
            }
            if ((i10 & 2) != 0) {
                aVar = gVar.f288496e;
            }
            if ((i10 & 4) != 0) {
                str2 = gVar.f288497f;
            }
            return gVar.g(str, aVar, str2);
        }

        @NotNull
        public final String d() {
            return this.f288495d;
        }

        @NotNull
        public final kh.a e() {
            return this.f288496e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.areEqual(this.f288495d, gVar.f288495d) && this.f288496e == gVar.f288496e && Intrinsics.areEqual(this.f288497f, gVar.f288497f);
        }

        @NotNull
        public final String f() {
            return this.f288497f;
        }

        @NotNull
        public final g g(@NotNull String deliveryId, @NotNull kh.a event, @NotNull String deviceToken) {
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
            return new g(deliveryId, event, deviceToken);
        }

        public int hashCode() {
            return (((this.f288495d.hashCode() * 31) + this.f288496e.hashCode()) * 31) + this.f288497f.hashCode();
        }

        @NotNull
        public final String i() {
            return this.f288495d;
        }

        @NotNull
        public final String j() {
            return this.f288497f;
        }

        @NotNull
        public final kh.a k() {
            return this.f288496e;
        }

        @NotNull
        public String toString() {
            return "TrackPushMetricEvent(deliveryId=" + this.f288495d + ", event=" + this.f288496e + ", deviceToken=" + this.f288497f + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public Map<String, String> a() {
        return this.f288486b;
    }

    @NotNull
    public String b() {
        return this.f288485a;
    }

    @NotNull
    public Date c() {
        return this.f288487c;
    }

    public static final class f extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f288492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final kh.a f288493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final Map<String, String> f288494f;

        public /* synthetic */ f(String str, kh.a aVar, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, aVar, (i10 & 4) != 0 ? MapsKt.emptyMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ f h(f fVar, String str, kh.a aVar, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fVar.f288492d;
            }
            if ((i10 & 2) != 0) {
                aVar = fVar.f288493e;
            }
            if ((i10 & 4) != 0) {
                map = fVar.f288494f;
            }
            return fVar.g(str, aVar, map);
        }

        @Override // io.customer.sdk.communication.a
        @NotNull
        public Map<String, String> a() {
            return this.f288494f;
        }

        @NotNull
        public final String d() {
            return this.f288492d;
        }

        @NotNull
        public final kh.a e() {
            return this.f288493e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.f288492d, fVar.f288492d) && this.f288493e == fVar.f288493e && Intrinsics.areEqual(this.f288494f, fVar.f288494f);
        }

        @NotNull
        public final Map<String, String> f() {
            return this.f288494f;
        }

        @NotNull
        public final f g(@NotNull String deliveryID, @NotNull kh.a event, @NotNull Map<String, String> params) {
            Intrinsics.checkNotNullParameter(deliveryID, "deliveryID");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(params, "params");
            return new f(deliveryID, event, params);
        }

        public int hashCode() {
            return (((this.f288492d.hashCode() * 31) + this.f288493e.hashCode()) * 31) + this.f288494f.hashCode();
        }

        @NotNull
        public final String i() {
            return this.f288492d;
        }

        @NotNull
        public final kh.a j() {
            return this.f288493e;
        }

        @NotNull
        public String toString() {
            return "TrackInAppMetricEvent(deliveryID=" + this.f288492d + ", event=" + this.f288493e + ", params=" + this.f288494f + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull String deliveryID, @NotNull kh.a event, @NotNull Map<String, String> params) {
            super(null);
            Intrinsics.checkNotNullParameter(deliveryID, "deliveryID");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f288492d = deliveryID;
            this.f288493e = event;
            this.f288494f = params;
        }
    }

    private a() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f288485a = string;
        this.f288486b = MapsKt.emptyMap();
        this.f288487c = new Date();
    }
}
