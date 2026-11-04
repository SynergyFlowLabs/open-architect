package fi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends io.ktor.util.pipeline.d<Object, y> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f275238h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275239i = new io.ktor.util.pipeline.j("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275240j = new io.ktor.util.pipeline.j("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275241k = new io.ktor.util.pipeline.j("Monitoring");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275242l = new io.ktor.util.pipeline.j("Engine");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275243m = new io.ktor.util.pipeline.j("Receive");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f275244g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final io.ktor.util.pipeline.j a() {
            return g0.f275239i;
        }

        @NotNull
        public final io.ktor.util.pipeline.j b() {
            return g0.f275242l;
        }

        @NotNull
        public final io.ktor.util.pipeline.j c() {
            return g0.f275241k;
        }

        @NotNull
        public final io.ktor.util.pipeline.j d() {
            return g0.f275243m;
        }

        @NotNull
        public final io.ktor.util.pipeline.j e() {
            return g0.f275240j;
        }

        private a() {
        }
    }

    public g0() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.d
    public boolean j() {
        return this.f275244g;
    }

    public /* synthetic */ g0(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public g0(boolean z10) {
        super(f275239i, f275240j, f275241k, f275242l, f275243m);
        this.f275244g = z10;
    }
}
