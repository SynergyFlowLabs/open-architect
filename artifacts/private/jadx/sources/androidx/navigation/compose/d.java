package androidx.navigation.compose;

import androidx.navigation.e2;
import androidx.navigation.o2;
import androidx.navigation.q3;
import androidx.navigation.r3;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@q3.b("navigation")
public final class d extends o2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f70654g = 8;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a extends e2 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f70655o = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> f70656j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> f70657k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> f70658l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> f70659m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> f70660n;

        public a(@NotNull q3<? extends e2> q3Var) {
            super(q3Var);
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> A1() {
            return this.f70660n;
        }

        public final void B1(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1) {
            this.f70656j = function1;
        }

        public final void C1(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function1) {
            this.f70657k = function1;
        }

        public final void D1(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1) {
            this.f70658l = function1;
        }

        public final void F1(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function1) {
            this.f70659m = function1;
        }

        public final void G1(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function1) {
            this.f70660n = function1;
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> v1() {
            return this.f70656j;
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> x1() {
            return this.f70657k;
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> y1() {
            return this.f70658l;
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> z1() {
            return this.f70659m;
        }
    }

    public d(@NotNull r3 r3Var) {
        super(r3Var);
    }

    @Override // androidx.navigation.o2, androidx.navigation.q3
    @NotNull
    /* JADX INFO: renamed from: r */
    public e2 c() {
        return new a(this);
    }
}
