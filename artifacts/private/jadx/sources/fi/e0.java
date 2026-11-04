package fi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends io.ktor.util.pipeline.d<Object, y> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f275224h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275225i = new io.ktor.util.pipeline.j("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275226j = new io.ktor.util.pipeline.j("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275227k = new io.ktor.util.pipeline.j("Transform");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275228l = new io.ktor.util.pipeline.j("Render");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.pipeline.j f275229m = new io.ktor.util.pipeline.j("Send");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f275230g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final io.ktor.util.pipeline.j a() {
            return e0.f275225i;
        }

        @NotNull
        public final io.ktor.util.pipeline.j b() {
            return e0.f275228l;
        }

        @NotNull
        public final io.ktor.util.pipeline.j c() {
            return e0.f275229m;
        }

        @NotNull
        public final io.ktor.util.pipeline.j d() {
            return e0.f275226j;
        }

        @NotNull
        public final io.ktor.util.pipeline.j e() {
            return e0.f275227k;
        }

        private a() {
        }
    }

    public e0() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.d
    public boolean j() {
        return this.f275230g;
    }

    public /* synthetic */ e0(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public e0(boolean z10) {
        super(f275225i, f275226j, f275227k, f275228l, f275229m);
        this.f275230g = z10;
    }
}
