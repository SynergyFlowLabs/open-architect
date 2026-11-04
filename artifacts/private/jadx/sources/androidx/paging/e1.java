package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private x0 f71826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private x0 f71827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private x0 f71828c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71829a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.PREPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71829a = iArr;
        }
    }

    public e1() {
        x0.c.a aVar = x0.c.f72693b;
        this.f71826a = aVar.b();
        this.f71827b = aVar.b();
        this.f71828c = aVar.b();
    }

    @NotNull
    public final x0 a(@NotNull a1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i10 = a.f71829a[loadType.ordinal()];
        if (i10 == 1) {
            return this.f71826a;
        }
        if (i10 == 2) {
            return this.f71828c;
        }
        if (i10 == 3) {
            return this.f71827b;
        }
        throw new kotlin.k0();
    }

    @NotNull
    public final x0 b() {
        return this.f71828c;
    }

    @NotNull
    public final x0 c() {
        return this.f71827b;
    }

    @NotNull
    public final x0 d() {
        return this.f71826a;
    }

    public final void e(@NotNull z0 states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f71826a = states.k();
        this.f71828c = states.i();
        this.f71827b = states.j();
    }

    public final void f(@NotNull a1 type, @NotNull x0 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        int i10 = a.f71829a[type.ordinal()];
        if (i10 == 1) {
            this.f71826a = state;
        } else if (i10 == 2) {
            this.f71828c = state;
        } else {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            this.f71827b = state;
        }
    }

    public final void g(@NotNull x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<set-?>");
        this.f71828c = x0Var;
    }

    public final void h(@NotNull x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<set-?>");
        this.f71827b = x0Var;
    }

    public final void i(@NotNull x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<set-?>");
        this.f71826a = x0Var;
    }

    @NotNull
    public final z0 j() {
        return new z0(this.f71826a, this.f71827b, this.f71828c);
    }
}
