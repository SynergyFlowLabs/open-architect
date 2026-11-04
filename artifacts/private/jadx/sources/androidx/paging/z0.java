package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f72792f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final z0 f72793g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0 f72794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0 f72795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0 f72796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f72797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f72798e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final z0 a() {
            return z0.f72793g;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72799a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                boolean z10 = false | true;
                iArr[a1.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72799a = iArr;
        }
    }

    static {
        x0.c.a aVar = x0.c.f72693b;
        f72793g = new z0(aVar.b(), aVar.b(), aVar.b());
    }

    public z0(@NotNull x0 refresh, @NotNull x0 prepend, @NotNull x0 append) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        this.f72794a = refresh;
        this.f72795b = prepend;
        this.f72796c = append;
        boolean z10 = true;
        this.f72797d = (refresh instanceof x0.a) || (append instanceof x0.a) || (prepend instanceof x0.a);
        this.f72798e = (refresh instanceof x0.c) && (append instanceof x0.c) && (prepend instanceof x0.c);
    }

    public static /* synthetic */ z0 f(z0 z0Var, x0 x0Var, x0 x0Var2, x0 x0Var3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x0Var = z0Var.f72794a;
        }
        if ((i10 & 2) != 0) {
            x0Var2 = z0Var.f72795b;
        }
        if ((i10 & 4) != 0) {
            x0Var3 = z0Var.f72796c;
        }
        return z0Var.e(x0Var, x0Var2, x0Var3);
    }

    @NotNull
    public final x0 b() {
        return this.f72794a;
    }

    @NotNull
    public final x0 c() {
        return this.f72795b;
    }

    @NotNull
    public final x0 d() {
        return this.f72796c;
    }

    @NotNull
    public final z0 e(@NotNull x0 refresh, @NotNull x0 prepend, @NotNull x0 append) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        return new z0(refresh, prepend, append);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.areEqual(this.f72794a, z0Var.f72794a) && Intrinsics.areEqual(this.f72795b, z0Var.f72795b) && Intrinsics.areEqual(this.f72796c, z0Var.f72796c);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void g(@NotNull Function2<? super a1, ? super x0, Unit> op) {
        Intrinsics.checkNotNullParameter(op, "op");
        op.invoke(a1.REFRESH, k());
        op.invoke(a1.PREPEND, j());
        op.invoke(a1.APPEND, i());
    }

    @NotNull
    public final x0 h(@NotNull a1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i10 = b.f72799a[loadType.ordinal()];
        if (i10 == 1) {
            return this.f72796c;
        }
        if (i10 == 2) {
            return this.f72795b;
        }
        if (i10 == 3) {
            return this.f72794a;
        }
        throw new kotlin.k0();
    }

    public int hashCode() {
        return (((this.f72794a.hashCode() * 31) + this.f72795b.hashCode()) * 31) + this.f72796c.hashCode();
    }

    @NotNull
    public final x0 i() {
        return this.f72796c;
    }

    @NotNull
    public final x0 j() {
        return this.f72795b;
    }

    @NotNull
    public final x0 k() {
        return this.f72794a;
    }

    @oj.i(name = "hasError")
    public final boolean l() {
        return this.f72797d;
    }

    public final boolean m() {
        return this.f72798e;
    }

    @NotNull
    public final z0 n(@NotNull a1 loadType, @NotNull x0 newState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i10 = b.f72799a[loadType.ordinal()];
        if (i10 == 1) {
            boolean z10 = true | false;
            return f(this, null, null, newState, 3, null);
        }
        if (i10 == 2) {
            return f(this, null, newState, null, 5, null);
        }
        if (i10 == 3) {
            return f(this, newState, null, null, 6, null);
        }
        throw new kotlin.k0();
    }

    @NotNull
    public String toString() {
        return "LoadStates(refresh=" + this.f72794a + ", prepend=" + this.f72795b + ", append=" + this.f72796c + ')';
    }
}
