package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f335103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f335104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final r0 f335105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Long f335106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Long f335107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Long f335108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Long f335109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Object> f335110h;

    public u() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u b(u uVar, boolean z10, boolean z11, r0 r0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = uVar.f335103a;
        }
        if ((i10 & 2) != 0) {
            z11 = uVar.f335104b;
        }
        if ((i10 & 4) != 0) {
            r0Var = uVar.f335105c;
        }
        if ((i10 & 8) != 0) {
            l10 = uVar.f335106d;
        }
        if ((i10 & 16) != 0) {
            l11 = uVar.f335107e;
        }
        if ((i10 & 32) != 0) {
            l12 = uVar.f335108f;
        }
        if ((i10 & 64) != 0) {
            l13 = uVar.f335109g;
        }
        if ((i10 & 128) != 0) {
            map = uVar.f335110h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return uVar.a(z10, z11, r0Var, l10, l15, l16, l14, map2);
    }

    @NotNull
    public final u a(boolean z10, boolean z11, @Nullable r0 r0Var, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @NotNull Map<kotlin.reflect.d<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new u(z10, z11, r0Var, l10, l11, l12, l13, extras);
    }

    @Nullable
    public final <T> T c(@NotNull kotlin.reflect.d<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = this.f335110h.get(type);
        if (obj == null) {
            return null;
        }
        return (T) kotlin.reflect.e.a(type, obj);
    }

    @Nullable
    public final Long d() {
        return this.f335107e;
    }

    @NotNull
    public final Map<kotlin.reflect.d<?>, Object> e() {
        return this.f335110h;
    }

    @Nullable
    public final Long f() {
        return this.f335109g;
    }

    @Nullable
    public final Long g() {
        return this.f335108f;
    }

    @Nullable
    public final Long h() {
        return this.f335106d;
    }

    @Nullable
    public final r0 i() {
        return this.f335105c;
    }

    public final boolean j() {
        return this.f335104b;
    }

    public final boolean k() {
        return this.f335103a;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f335103a) {
            arrayList.add("isRegularFile");
        }
        if (this.f335104b) {
            arrayList.add("isDirectory");
        }
        if (this.f335106d != null) {
            arrayList.add("byteCount=" + this.f335106d);
        }
        if (this.f335107e != null) {
            arrayList.add("createdAt=" + this.f335107e);
        }
        if (this.f335108f != null) {
            arrayList.add("lastModifiedAt=" + this.f335108f);
        }
        if (this.f335109g != null) {
            arrayList.add("lastAccessedAt=" + this.f335109g);
        }
        if (!this.f335110h.isEmpty()) {
            arrayList.add("extras=" + this.f335110h);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public u(boolean z10, boolean z11, @Nullable r0 r0Var, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @NotNull Map<kotlin.reflect.d<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f335103a = z10;
        this.f335104b = z11;
        this.f335105c = r0Var;
        this.f335106d = l10;
        this.f335107e = l11;
        this.f335108f = l12;
        this.f335109g = l13;
        this.f335110h = MapsKt.toMap(extras);
    }

    public /* synthetic */ u(boolean z10, boolean z11, r0 r0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : r0Var, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? MapsKt.emptyMap() : map);
    }
}
