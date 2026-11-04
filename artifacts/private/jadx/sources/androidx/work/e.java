package androidx.work;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f76535i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final e f76536j = new e(null, false, false, false, 15, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "required_network_type")
    @NotNull
    private final w f76537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "requires_charging")
    private final boolean f76538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.room.i(name = "requires_device_idle")
    private final boolean f76539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.room.i(name = "requires_battery_not_low")
    private final boolean f76540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.room.i(name = "requires_storage_not_low")
    private final boolean f76541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.room.i(name = "trigger_content_update_delay")
    private final long f76542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.room.i(name = "trigger_max_content_delay")
    private final long f76543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.room.i(name = "content_uri_triggers")
    @NotNull
    private final Set<c> f76544h;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f76553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f76554b;

        public c(@NotNull Uri uri, boolean z10) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f76553a = uri;
            this.f76554b = z10;
        }

        @NotNull
        public final Uri a() {
            return this.f76553a;
        }

        public final boolean b() {
            return this.f76554b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f76553a, cVar.f76553a) && this.f76554b == cVar.f76554b;
        }

        public int hashCode() {
            return (this.f76553a.hashCode() * 31) + Boolean.hashCode(this.f76554b);
        }
    }

    public /* synthetic */ e(w wVar, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? w.NOT_REQUIRED : wVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    @w0(24)
    public final long a() {
        return this.f76543g;
    }

    @w0(24)
    public final long b() {
        return this.f76542f;
    }

    @w0(24)
    @NotNull
    public final Set<c> c() {
        return this.f76544h;
    }

    @NotNull
    public final w d() {
        return this.f76537a;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public final boolean e() {
        return !this.f76544h.isEmpty();
    }

    @e.a({"NewApi"})
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(e.class, obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f76538b == eVar.f76538b && this.f76539c == eVar.f76539c && this.f76540d == eVar.f76540d && this.f76541e == eVar.f76541e && this.f76542f == eVar.f76542f && this.f76543g == eVar.f76543g && this.f76537a == eVar.f76537a) {
            return Intrinsics.areEqual(this.f76544h, eVar.f76544h);
        }
        return false;
    }

    public final boolean f() {
        return this.f76540d;
    }

    public final boolean g() {
        return this.f76538b;
    }

    @w0(23)
    public final boolean h() {
        return this.f76539c;
    }

    @e.a({"NewApi"})
    public int hashCode() {
        int iHashCode = ((((((((this.f76537a.hashCode() * 31) + (this.f76538b ? 1 : 0)) * 31) + (this.f76539c ? 1 : 0)) * 31) + (this.f76540d ? 1 : 0)) * 31) + (this.f76541e ? 1 : 0)) * 31;
        long j10 = this.f76542f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f76543g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f76544h.hashCode();
    }

    public final boolean i() {
        return this.f76541e;
    }

    @e.a({"NewApi"})
    @NotNull
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f76537a + ", requiresCharging=" + this.f76538b + ", requiresDeviceIdle=" + this.f76539c + ", requiresBatteryNotLow=" + this.f76540d + ", requiresStorageNotLow=" + this.f76541e + ", contentTriggerUpdateDelayMillis=" + this.f76542f + ", contentTriggerMaxDelayMillis=" + this.f76543g + ", contentUriTriggers=" + this.f76544h + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @androidx.room.g0
    @e.a({"NewApi"})
    public e(@NotNull w requiredNetworkType, boolean z10, boolean z11, boolean z12) {
        this(requiredNetworkType, z10, false, z11, z12);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ e(w wVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? w.NOT_REQUIRED : wVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f76545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f76546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private w f76547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f76548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f76549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f76550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f76551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private Set<c> f76552h;

        public a() {
            this.f76547c = w.NOT_REQUIRED;
            this.f76550f = -1L;
            this.f76551g = -1L;
            this.f76552h = new LinkedHashSet();
        }

        @w0(24)
        @NotNull
        public final a a(@NotNull Uri uri, boolean z10) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f76552h.add(new c(uri, z10));
            return this;
        }

        @NotNull
        public final e b() {
            Set set = CollectionsKt.toSet(this.f76552h);
            long j10 = this.f76550f;
            long j11 = this.f76551g;
            return new e(this.f76547c, this.f76545a, this.f76546b, this.f76548d, this.f76549e, j10, j11, set);
        }

        @NotNull
        public final a c(@NotNull w networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.f76547c = networkType;
            return this;
        }

        @NotNull
        public final a d(boolean z10) {
            this.f76548d = z10;
            return this;
        }

        @NotNull
        public final a e(boolean z10) {
            this.f76545a = z10;
            return this;
        }

        @w0(23)
        @NotNull
        public final a f(boolean z10) {
            this.f76546b = z10;
            return this;
        }

        @NotNull
        public final a g(boolean z10) {
            this.f76549e = z10;
            return this;
        }

        @w0(24)
        @NotNull
        public final a h(long j10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f76551g = timeUnit.toMillis(j10);
            return this;
        }

        @w0(26)
        @NotNull
        public final a i(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f76551g = androidx.work.impl.utils.c.a(duration);
            return this;
        }

        @w0(24)
        @NotNull
        public final a j(long j10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f76550f = timeUnit.toMillis(j10);
            return this;
        }

        @w0(26)
        @NotNull
        public final a k(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f76550f = androidx.work.impl.utils.c.a(duration);
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP})
        public a(@NotNull e constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.f76547c = w.NOT_REQUIRED;
            this.f76550f = -1L;
            this.f76551g = -1L;
            this.f76552h = new LinkedHashSet();
            this.f76545a = constraints.g();
            this.f76546b = constraints.h();
            this.f76547c = constraints.d();
            this.f76548d = constraints.f();
            this.f76549e = constraints.i();
            this.f76550f = constraints.b();
            this.f76551g = constraints.a();
            this.f76552h = CollectionsKt.toMutableSet(constraints.c());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @androidx.room.g0
    @e.a({"NewApi"})
    @w0(23)
    public e(@NotNull w requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(requiredNetworkType, z10, z11, z12, z13, -1L, 0L, null, 192, null);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ e(w wVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? w.NOT_REQUIRED : wVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) != 0 ? -1L : j11, (i10 & 128) != 0 ? SetsKt.emptySet() : set);
    }

    @w0(24)
    public e(@NotNull w requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, @NotNull Set<c> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f76537a = requiredNetworkType;
        this.f76538b = z10;
        this.f76539c = z11;
        this.f76540d = z12;
        this.f76541e = z13;
        this.f76542f = j10;
        this.f76543g = j11;
        this.f76544h = contentUriTriggers;
    }

    @e.a({"NewApi"})
    public e(@NotNull e other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f76538b = other.f76538b;
        this.f76539c = other.f76539c;
        this.f76537a = other.f76537a;
        this.f76540d = other.f76540d;
        this.f76541e = other.f76541e;
        this.f76544h = other.f76544h;
        this.f76542f = other.f76542f;
        this.f76543g = other.f76543g;
    }
}
