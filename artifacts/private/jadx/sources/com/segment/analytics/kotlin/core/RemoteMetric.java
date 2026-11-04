package com.segment.analytics.kotlin.core;

import java.util.Map;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class RemoteMetric {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f266681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f266682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f266683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f266684e;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<RemoteMetric> serializer() {
            return RemoteMetric$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
    public /* synthetic */ RemoteMetric(int i10, String str, String str2, int i11, Map map, Map map2, v2 v2Var) {
        if (15 != (i10 & 15)) {
            g2.b(i10, 15, RemoteMetric$$serializer.INSTANCE.getDescriptor());
        }
        this.f266680a = str;
        this.f266681b = str2;
        this.f266682c = i11;
        this.f266683d = map;
        if ((i10 & 16) == 0) {
            this.f266684e = null;
        } else {
            this.f266684e = map2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteMetric g(RemoteMetric remoteMetric, String str, String str2, int i10, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = remoteMetric.f266680a;
        }
        if ((i11 & 2) != 0) {
            str2 = remoteMetric.f266681b;
        }
        if ((i11 & 4) != 0) {
            i10 = remoteMetric.f266682c;
        }
        if ((i11 & 8) != 0) {
            map = remoteMetric.f266683d;
        }
        if ((i11 & 16) != 0) {
            map2 = remoteMetric.f266684e;
        }
        Map map3 = map2;
        int i12 = i10;
        return remoteMetric.f(str, str2, i12, map, map3);
    }

    @oj.n
    public static final void n(@NotNull RemoteMetric self, @NotNull kotlinx.serialization.encoding.e output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.f266680a);
        output.encodeStringElement(serialDesc, 1, self.f266681b);
        output.encodeIntElement(serialDesc, 2, self.f266682c);
        b3 b3Var = b3.f315897a;
        output.encodeSerializableElement(serialDesc, 3, new e1(b3Var, b3Var), self.f266683d);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.f266684e == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, new e1(b3Var, b3Var), self.f266684e);
    }

    @NotNull
    public final String a() {
        return this.f266680a;
    }

    @NotNull
    public final String b() {
        return this.f266681b;
    }

    public final int c() {
        return this.f266682c;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.f266683d;
    }

    @Nullable
    public final Map<String, String> e() {
        return this.f266684e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteMetric)) {
            return false;
        }
        RemoteMetric remoteMetric = (RemoteMetric) obj;
        return Intrinsics.areEqual(this.f266680a, remoteMetric.f266680a) && Intrinsics.areEqual(this.f266681b, remoteMetric.f266681b) && this.f266682c == remoteMetric.f266682c && Intrinsics.areEqual(this.f266683d, remoteMetric.f266683d) && Intrinsics.areEqual(this.f266684e, remoteMetric.f266684e);
    }

    @NotNull
    public final RemoteMetric f(@NotNull String type, @NotNull String metric, int i10, @NotNull Map<String, String> tags, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new RemoteMetric(type, metric, i10, tags, map);
    }

    @Nullable
    public final Map<String, String> h() {
        return this.f266684e;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f266680a.hashCode() * 31) + this.f266681b.hashCode()) * 31) + Integer.hashCode(this.f266682c)) * 31) + this.f266683d.hashCode()) * 31;
        Map<String, String> map = this.f266684e;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public final String i() {
        return this.f266681b;
    }

    @NotNull
    public final Map<String, String> j() {
        return this.f266683d;
    }

    @NotNull
    public final String k() {
        return this.f266680a;
    }

    public final int l() {
        return this.f266682c;
    }

    public final void m(int i10) {
        this.f266682c = i10;
    }

    @NotNull
    public String toString() {
        return "RemoteMetric(type=" + this.f266680a + ", metric=" + this.f266681b + ", value=" + this.f266682c + ", tags=" + this.f266683d + ", log=" + this.f266684e + ')';
    }

    public RemoteMetric(@NotNull String type, @NotNull String metric, int i10, @NotNull Map<String, String> tags, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f266680a = type;
        this.f266681b = metric;
        this.f266682c = i10;
        this.f266683d = tags;
        this.f266684e = map;
    }

    public /* synthetic */ RemoteMetric(String str, String str2, int i10, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, map, (i11 & 16) != 0 ? null : map2);
    }
}
