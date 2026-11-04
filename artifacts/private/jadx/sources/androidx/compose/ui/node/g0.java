package androidx.compose.ui.node;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface g0 extends j {

    static final class a implements o1.f {
        a() {
        }

        @Override // androidx.compose.ui.node.o1.f
        public final androidx.compose.ui.layout.b1 c(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
            return g0.this.c(c1Var, z0Var, j10);
        }
    }

    static final class b implements o1.f {
        b() {
        }

        @Override // androidx.compose.ui.node.o1.f
        public final androidx.compose.ui.layout.b1 c(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
            return g0.this.c(c1Var, z0Var, j10);
        }
    }

    static final class c implements o1.f {
        c() {
        }

        @Override // androidx.compose.ui.node.o1.f
        public final androidx.compose.ui.layout.b1 c(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
            return g0.this.c(c1Var, z0Var, j10);
        }
    }

    static final class d implements o1.f {
        d() {
        }

        @Override // androidx.compose.ui.node.o1.f
        public final androidx.compose.ui.layout.b1 c(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
            return g0.this.c(c1Var, z0Var, j10);
        }
    }

    default int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return o1.f39936a.h(new d(), zVar, yVar, i10);
    }

    default int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return o1.f39936a.d(new b(), zVar, yVar, i10);
    }

    @NotNull
    androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10);

    default int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return o1.f39936a.b(new a(), zVar, yVar, i10);
    }

    default int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return o1.f39936a.f(new c(), zVar, yVar, i10);
    }
}
