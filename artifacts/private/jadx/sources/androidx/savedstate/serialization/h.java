package androidx.savedstate.serialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f75193d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final h f75194e = new h(null, 0, false, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.serialization.modules.f f75195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f75196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f75197c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private kotlinx.serialization.modules.f f75198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f75199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f75200c;

        public a(@NotNull h configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f75198a = configuration.c();
            this.f75199b = configuration.b();
            this.f75200c = configuration.a();
        }

        public static /* synthetic */ void c() {
        }

        public static /* synthetic */ void e() {
        }

        @NotNull
        public final h a() {
            return new h(kotlinx.serialization.modules.k.c(i.f75201a, this.f75198a), this.f75200c, this.f75199b, null);
        }

        public final int b() {
            return this.f75200c;
        }

        public final boolean d() {
            return this.f75199b;
        }

        @NotNull
        public final kotlinx.serialization.modules.f f() {
            return this.f75198a;
        }

        public final void g(int i10) {
            this.f75200c = i10;
        }

        public final void h(boolean z10) {
            this.f75199b = z10;
        }

        public final void i(@NotNull kotlinx.serialization.modules.f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            this.f75198a = fVar;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ h(kotlinx.serialization.modules.f fVar, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, i10, z10);
    }

    public final int a() {
        return this.f75196b;
    }

    public final boolean b() {
        return this.f75197c;
    }

    @NotNull
    public final kotlinx.serialization.modules.f c() {
        return this.f75195a;
    }

    private h(kotlinx.serialization.modules.f fVar, int i10, boolean z10) {
        this.f75195a = fVar;
        this.f75196b = i10;
        this.f75197c = z10;
    }

    /* synthetic */ h(kotlinx.serialization.modules.f fVar, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? i.f75201a : fVar, (i11 & 2) != 0 ? 2 : i10, (i11 & 4) != 0 ? false : z10);
    }
}
