package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nApproachLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachLayoutModifierNode.kt\nandroidx/compose/ui/layout/ApproachLayoutModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
public interface e extends androidx.compose.ui.node.g0 {

    static final class a implements androidx.compose.ui.node.o1.a {
        a() {
        }

        @Override // androidx.compose.ui.node.o1.a
        public final b1 a(g gVar, z0 z0Var, long j10) {
            return e.this.l2(gVar, z0Var, j10);
        }
    }

    static final class b implements androidx.compose.ui.node.o1.a {
        b() {
        }

        @Override // androidx.compose.ui.node.o1.a
        public final b1 a(g gVar, z0 z0Var, long j10) {
            return e.this.l2(gVar, z0Var, j10);
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f39309a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i2 i2Var) {
            super(1);
            this.f39309a = i2Var;
        }

        public final void c(i2.a aVar) {
            int i10 = 3 ^ 0;
            i2.a.P(aVar, this.f39309a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    static final class d implements androidx.compose.ui.node.o1.a {
        d() {
        }

        @Override // androidx.compose.ui.node.o1.a
        public final b1 a(g gVar, z0 z0Var, long j10) {
            return e.this.l2(gVar, z0Var, j10);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.e$e, reason: collision with other inner class name */
    static final class C0302e implements androidx.compose.ui.node.o1.a {
        C0302e() {
        }

        @Override // androidx.compose.ui.node.o1.a
        public final b1 a(g gVar, z0 z0Var, long j10) {
            return e.this.l2(gVar, z0Var, j10);
        }
    }

    default int B3(@NotNull androidx.compose.ui.layout.c cVar, @NotNull y yVar, int i10) {
        androidx.compose.ui.node.k1 k1VarP8 = w().P8();
        Intrinsics.checkNotNull(k1VarP8);
        androidx.compose.ui.node.v0 v0VarN4 = k1VarP8.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.b2() ? androidx.compose.ui.node.o1.f39936a.e(new d(), cVar, yVar, i10) : yVar.D0(i10);
    }

    boolean G6(long j10);

    default boolean J8(@NotNull i2.a aVar, @NotNull g0 g0Var) {
        return false;
    }

    default int Y2(@NotNull androidx.compose.ui.layout.c cVar, @NotNull y yVar, int i10) {
        androidx.compose.ui.node.k1 k1VarP8 = w().P8();
        Intrinsics.checkNotNull(k1VarP8);
        androidx.compose.ui.node.v0 v0VarN4 = k1VarP8.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.b2() ? androidx.compose.ui.node.o1.f39936a.c(new b(), cVar, yVar, i10) : yVar.M0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    default b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        i2 i2VarP0 = z0Var.P0(j10);
        return c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new c(i2VarP0), 4, null);
    }

    default int c3(@NotNull androidx.compose.ui.layout.c cVar, @NotNull y yVar, int i10) {
        androidx.compose.ui.node.k1 k1VarP8 = w().P8();
        Intrinsics.checkNotNull(k1VarP8);
        androidx.compose.ui.node.v0 v0VarN4 = k1VarP8.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.b2() ? androidx.compose.ui.node.o1.f39936a.a(new a(), cVar, yVar, i10) : yVar.p0(i10);
    }

    @NotNull
    b1 l2(@NotNull g gVar, @NotNull z0 z0Var, long j10);

    default int o6(@NotNull androidx.compose.ui.layout.c cVar, @NotNull y yVar, int i10) {
        androidx.compose.ui.node.k1 k1VarP8 = w().P8();
        Intrinsics.checkNotNull(k1VarP8);
        androidx.compose.ui.node.v0 v0VarN4 = k1VarP8.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.b2() ? androidx.compose.ui.node.o1.f39936a.g(new C0302e(), cVar, yVar, i10) : yVar.L0(i10);
    }
}
