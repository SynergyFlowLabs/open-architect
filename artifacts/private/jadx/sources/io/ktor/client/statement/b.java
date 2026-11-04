package io.ktor.client.statement;

import io.ktor.util.pipeline.j;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends io.ktor.util.pipeline.d<c, Unit> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f295326h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final j f295327i = new j("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final j f295328j = new j("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final j f295329k = new j("After");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f295330g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final j a() {
            return b.f295329k;
        }

        @NotNull
        public final j b() {
            return b.f295327i;
        }

        @NotNull
        public final j c() {
            return b.f295328j;
        }

        private a() {
        }
    }

    public b() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.d
    public boolean j() {
        return this.f295330g;
    }

    public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public b(boolean z10) {
        super(f295327i, f295328j, f295329k);
        this.f295330g = z10;
    }
}
