package io.ktor.client.statement;

import io.ktor.util.pipeline.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends io.ktor.util.pipeline.d<d, io.ktor.client.call.b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f295340h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final j f295341i = new j("Receive");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final j f295342j = new j("Parse");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final j f295343k = new j("Transform");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final j f295344l = new j("State");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final j f295345m = new j("After");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f295346g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final j a() {
            return f.f295345m;
        }

        @NotNull
        public final j b() {
            return f.f295342j;
        }

        @NotNull
        public final j c() {
            return f.f295341i;
        }

        @NotNull
        public final j d() {
            return f.f295344l;
        }

        @NotNull
        public final j e() {
            return f.f295343k;
        }

        private a() {
        }
    }

    public f() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.d
    public boolean j() {
        return this.f295346g;
    }

    public /* synthetic */ f(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public f(boolean z10) {
        super(f295341i, f295342j, f295343k, f295344l, f295345m);
        this.f295346g = z10;
    }
}
