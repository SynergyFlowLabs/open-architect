package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f1 f39325a = new f1();

    private static final class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final y f39326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final c f39327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final d f39328c;

        public a(@NotNull y yVar, @NotNull c cVar, @NotNull d dVar) {
            this.f39326a = yVar;
            this.f39327b = cVar;
            this.f39328c = dVar;
        }

        @Override // androidx.compose.ui.layout.y
        public int D0(int i10) {
            return this.f39326a.D0(i10);
        }

        @Override // androidx.compose.ui.layout.y
        public int L0(int i10) {
            return this.f39326a.L0(i10);
        }

        @Override // androidx.compose.ui.layout.y
        public int M0(int i10) {
            return this.f39326a.M0(i10);
        }

        @Override // androidx.compose.ui.layout.z0
        @NotNull
        public i2 P0(long j10) {
            if (this.f39328c == d.Width) {
                return new b(this.f39327b == c.Max ? this.f39326a.M0(androidx.compose.ui.unit.b.o(j10)) : this.f39326a.L0(androidx.compose.ui.unit.b.o(j10)), androidx.compose.ui.unit.b.i(j10) ? androidx.compose.ui.unit.b.o(j10) : 32767);
            }
            return new b(androidx.compose.ui.unit.b.j(j10) ? androidx.compose.ui.unit.b.p(j10) : 32767, this.f39327b == c.Max ? this.f39326a.p0(androidx.compose.ui.unit.b.p(j10)) : this.f39326a.D0(androidx.compose.ui.unit.b.p(j10)));
        }

        @NotNull
        public final y a() {
            return this.f39326a;
        }

        @NotNull
        public final c b() {
            return this.f39327b;
        }

        @Override // androidx.compose.ui.layout.y
        @Nullable
        public Object c() {
            return this.f39326a.c();
        }

        @NotNull
        public final d d() {
            return this.f39328c;
        }

        @Override // androidx.compose.ui.layout.y
        public int p0(int i10) {
            return this.f39326a.p0(i10);
        }
    }

    @SourceDebugExtension({"SMAP\nLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifier.kt\nandroidx/compose/ui/layout/MeasuringIntrinsics$EmptyPlaceable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,284:1\n30#2:285\n80#3:286\n*S KotlinDebug\n*F\n+ 1 LayoutModifier.kt\nandroidx/compose/ui/layout/MeasuringIntrinsics$EmptyPlaceable\n*L\n209#1:285\n209#1:286\n*E\n"})
    private static final class b extends i2 {
        public b(int i10, int i11) {
            q1(androidx.compose.ui.unit.u.e((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32)));
        }

        @Override // androidx.compose.ui.layout.e1
        public int M(@NotNull androidx.compose.ui.layout.a aVar) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.i2
        public void p1(long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
        }
    }

    private enum c {
        Min,
        Max;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f39332d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f39332d;
        }
    }

    private enum d {
        Width,
        Height;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f39336d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f39336d;
        }
    }

    private f1() {
    }

    public final int a(@NotNull o0 o0Var, @NotNull z zVar, @NotNull y yVar, int i10) {
        return o0Var.c(new c0(zVar, zVar.getLayoutDirection()), new a(yVar, c.Max, d.Height), androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(@NotNull o0 o0Var, @NotNull z zVar, @NotNull y yVar, int i10) {
        return o0Var.c(new c0(zVar, zVar.getLayoutDirection()), new a(yVar, c.Max, d.Width), androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int c(@NotNull o0 o0Var, @NotNull z zVar, @NotNull y yVar, int i10) {
        return o0Var.c(new c0(zVar, zVar.getLayoutDirection()), new a(yVar, c.Min, d.Height), androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int d(@NotNull o0 o0Var, @NotNull z zVar, @NotNull y yVar, int i10) {
        return o0Var.c(new c0(zVar, zVar.getLayoutDirection()), new a(yVar, c.Min, d.Width), androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
