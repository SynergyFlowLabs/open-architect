package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.z3;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    public static final class a implements androidx.compose.foundation.lazy.layout.m1, z3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ z3 f18517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f18518b;

        a(z3 z3Var, i1 i1Var) {
            this.f18518b = i1Var;
            this.f18517a = z3Var;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int a() {
            return this.f18518b.V();
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int c() {
            return this.f18518b.H();
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int d() {
            return ((o) CollectionsKt.last((List) this.f18518b.M().w1())).getIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public void e(int i10, int i11) {
            this.f18518b.L0(i10, i11 / this.f18518b.X(), true);
        }

        @Override // androidx.compose.foundation.gestures.z3
        public float f(float f10) {
            return this.f18517a.f(f10);
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int g(int i10, int i11) {
            return (int) (kotlin.ranges.r.K(y0.a(this.f18518b) + ((long) kotlin.math.b.L0((((i10 - this.f18518b.E()) * this.f18518b.X()) - (this.f18518b.F() * this.f18518b.X())) + i11)), this.f18518b.Q(), this.f18518b.O()) - y0.a(this.f18518b));
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int i() {
            return this.f18518b.I();
        }
    }

    @NotNull
    public static final androidx.compose.foundation.lazy.layout.m1 a(@NotNull i1 i1Var, @NotNull z3 z3Var) {
        return new a(z3Var, i1Var);
    }
}
