package androidx.window.layout;

import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f76403d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.window.core.b f76404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f76405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final m.c f76406c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull androidx.window.core.b bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            if (bounds.f() == 0 && bounds.b() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.c() != 0 && bounds.e() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f76407b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final b f76408c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final b f76409d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f76410a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final b a() {
                return b.f76408c;
            }

            @NotNull
            public final b b() {
                return b.f76409d;
            }

            private a() {
            }
        }

        private b(String str) {
            this.f76410a = str;
        }

        @NotNull
        public String toString() {
            return this.f76410a;
        }
    }

    public n(@NotNull androidx.window.core.b featureBounds, @NotNull b type, @NotNull m.c state) {
        Intrinsics.checkNotNullParameter(featureBounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f76404a = featureBounds;
        this.f76405b = type;
        this.f76406c = state;
        f76403d.a(featureBounds);
    }

    @Override // androidx.window.layout.m
    public boolean a() {
        b bVar = this.f76405b;
        b.a aVar = b.f76407b;
        if (Intrinsics.areEqual(bVar, aVar.b())) {
            return true;
        }
        return Intrinsics.areEqual(this.f76405b, aVar.a()) && Intrinsics.areEqual(getState(), m.c.f76401d);
    }

    @Override // androidx.window.layout.m
    @NotNull
    public m.a b() {
        if (this.f76404a.f() != 0 && this.f76404a.b() != 0) {
            return m.a.f76393d;
        }
        return m.a.f76392c;
    }

    @NotNull
    public final b c() {
        return this.f76405b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(n.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f76404a, nVar.f76404a) && Intrinsics.areEqual(this.f76405b, nVar.f76405b) && Intrinsics.areEqual(getState(), nVar.getState());
    }

    @Override // androidx.window.layout.h
    @NotNull
    public Rect getBounds() {
        return this.f76404a.i();
    }

    @Override // androidx.window.layout.m
    @NotNull
    public m.b getOrientation() {
        return this.f76404a.f() > this.f76404a.b() ? m.b.f76397d : m.b.f76396c;
    }

    @Override // androidx.window.layout.m
    @NotNull
    public m.c getState() {
        return this.f76406c;
    }

    public int hashCode() {
        return (((this.f76404a.hashCode() * 31) + this.f76405b.hashCode()) * 31) + getState().hashCode();
    }

    @NotNull
    public String toString() {
        return ((Object) n.class.getSimpleName()) + " { " + this.f76404a + ", type=" + this.f76405b + ", state=" + getState() + " }";
    }
}
