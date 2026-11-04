package io.ktor.client.plugins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@io.ktor.utils.io.r0
@SourceDebugExtension({"SMAP\nHttpTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutConfig\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,314:1\n21#2:315\n65#3,18:316\n*S KotlinDebug\n*F\n+ 1 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutConfig\n*L\n118#1:315\n118#1:316,18\n*E\n"})
public final class f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f294790d = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f294791e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<f1> f294792f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Long f294793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Long f294794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Long f294795c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final io.ktor.util.a<f1> a() {
            return f1.f294792f;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.s sVarA = null;
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(f1.class);
        try {
            sVarA = kotlin.jvm.internal.j1.A(f1.class);
        } catch (Throwable unused) {
        }
        f294792f = new io.ktor.util.a<>("TimeoutConfiguration", new ri.b(dVarD, sVarA));
    }

    public /* synthetic */ f1(Long l10, Long l11, Long l12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? null : l12);
    }

    private final Long b(Long l10) {
        if (l10 == null || l10.longValue() > 0) {
            return l10;
        }
        throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
    }

    @Nullable
    public final Long c() {
        return this.f294794b;
    }

    @Nullable
    public final Long d() {
        return this.f294793a;
    }

    @Nullable
    public final Long e() {
        return this.f294795c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f1.class != obj.getClass()) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.areEqual(this.f294793a, f1Var.f294793a) && Intrinsics.areEqual(this.f294794b, f1Var.f294794b) && Intrinsics.areEqual(this.f294795c, f1Var.f294795c);
    }

    public final void f(@Nullable Long l10) {
        this.f294794b = b(l10);
    }

    public final void g(@Nullable Long l10) {
        this.f294793a = b(l10);
    }

    public final void h(@Nullable Long l10) {
        this.f294795c = b(l10);
    }

    public int hashCode() {
        Long l10 = this.f294793a;
        int iHashCode = (l10 != null ? l10.hashCode() : 0) * 31;
        Long l11 = this.f294794b;
        int iHashCode2 = (iHashCode + (l11 != null ? l11.hashCode() : 0)) * 31;
        Long l12 = this.f294795c;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    public f1(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        this.f294793a = 0L;
        this.f294794b = 0L;
        this.f294795c = 0L;
        g(l10);
        f(l11);
        h(l12);
    }
}
