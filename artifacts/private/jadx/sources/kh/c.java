package kh;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kh.a f312222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f312223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Map<String, String> f312224c;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @j
        public a(@NotNull kh.a metric, @NotNull String deliveryId) {
            this(metric, deliveryId, null, 4, null);
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a f(a aVar, kh.a aVar2, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar2 = aVar.f312222a;
            }
            if ((i10 & 2) != 0) {
                str = aVar.f312223b;
            }
            if ((i10 & 4) != 0) {
                map = aVar.f312224c;
            }
            return aVar.e(aVar2, str, map);
        }

        @Override // kh.c
        @NotNull
        public String a() {
            return this.f312223b;
        }

        @NotNull
        public final kh.a b() {
            return this.f312222a;
        }

        @NotNull
        public final String c() {
            return this.f312223b;
        }

        @NotNull
        public final Map<String, String> d() {
            return this.f312224c;
        }

        @NotNull
        public final a e(@NotNull kh.a metric, @NotNull String deliveryId, @NotNull Map<String, String> metadata) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            return new a(metric, deliveryId, metadata);
        }

        @Override // kh.c
        @NotNull
        public kh.a e6() {
            return this.f312222a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f312222a == aVar.f312222a && Intrinsics.areEqual(this.f312223b, aVar.f312223b) && Intrinsics.areEqual(this.f312224c, aVar.f312224c);
        }

        @NotNull
        public final Map<String, String> g() {
            return this.f312224c;
        }

        public int hashCode() {
            return (((this.f312222a.hashCode() * 31) + this.f312223b.hashCode()) * 31) + this.f312224c.hashCode();
        }

        @NotNull
        public String toString() {
            return "InApp(metric=" + this.f312222a + ", deliveryId=" + this.f312223b + ", metadata=" + this.f312224c + ")";
        }

        @j
        public a(@NotNull kh.a metric, @NotNull String deliveryId, @NotNull Map<String, String> metadata) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.f312222a = metric;
            this.f312223b = deliveryId;
            this.f312224c = metadata;
        }

        public /* synthetic */ a(kh.a aVar, String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, str, (i10 & 4) != 0 ? MapsKt.emptyMap() : map);
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kh.a f312225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f312226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f312227c;

        public b(@NotNull kh.a metric, @NotNull String deliveryId, @NotNull String deviceToken) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
            this.f312225a = metric;
            this.f312226b = deliveryId;
            this.f312227c = deviceToken;
        }

        public static /* synthetic */ b f(b bVar, kh.a aVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = bVar.f312225a;
            }
            if ((i10 & 2) != 0) {
                str = bVar.f312226b;
            }
            if ((i10 & 4) != 0) {
                str2 = bVar.f312227c;
            }
            return bVar.e(aVar, str, str2);
        }

        @Override // kh.c
        @NotNull
        public String a() {
            return this.f312226b;
        }

        @NotNull
        public final kh.a b() {
            return this.f312225a;
        }

        @NotNull
        public final String c() {
            return this.f312226b;
        }

        @NotNull
        public final String d() {
            return this.f312227c;
        }

        @NotNull
        public final b e(@NotNull kh.a metric, @NotNull String deliveryId, @NotNull String deviceToken) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
            Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
            return new b(metric, deliveryId, deviceToken);
        }

        @Override // kh.c
        @NotNull
        public kh.a e6() {
            return this.f312225a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f312225a == bVar.f312225a && Intrinsics.areEqual(this.f312226b, bVar.f312226b) && Intrinsics.areEqual(this.f312227c, bVar.f312227c);
        }

        @NotNull
        public final String g() {
            return this.f312227c;
        }

        public int hashCode() {
            return (((this.f312225a.hashCode() * 31) + this.f312226b.hashCode()) * 31) + this.f312227c.hashCode();
        }

        @NotNull
        public String toString() {
            return "Push(metric=" + this.f312225a + ", deliveryId=" + this.f312226b + ", deviceToken=" + this.f312227c + ")";
        }
    }

    @NotNull
    String a();

    @NotNull
    kh.a e6();
}
