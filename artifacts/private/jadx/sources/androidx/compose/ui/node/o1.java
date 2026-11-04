package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o1 f39936a = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39937b = 0;

    public interface a {
        @NotNull
        androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.g gVar, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10);
    }

    private static final class b implements androidx.compose.ui.layout.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.layout.y f39938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final d f39939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final e f39940c;

        public b(@NotNull androidx.compose.ui.layout.y yVar, @NotNull d dVar, @NotNull e eVar) {
            this.f39938a = yVar;
            this.f39939b = dVar;
            this.f39940c = eVar;
        }

        @Override // androidx.compose.ui.layout.y
        public int D0(int i10) {
            return this.f39938a.D0(i10);
        }

        @Override // androidx.compose.ui.layout.y
        public int L0(int i10) {
            return this.f39938a.L0(i10);
        }

        @Override // androidx.compose.ui.layout.y
        public int M0(int i10) {
            return this.f39938a.M0(i10);
        }

        @Override // androidx.compose.ui.layout.z0
        @NotNull
        public androidx.compose.ui.layout.i2 P0(long j10) {
            if (this.f39940c == e.Width) {
                return new c(this.f39939b == d.Max ? this.f39938a.M0(androidx.compose.ui.unit.b.o(j10)) : this.f39938a.L0(androidx.compose.ui.unit.b.o(j10)), androidx.compose.ui.unit.b.i(j10) ? androidx.compose.ui.unit.b.o(j10) : 32767);
            }
            return new c(androidx.compose.ui.unit.b.j(j10) ? androidx.compose.ui.unit.b.p(j10) : 32767, this.f39939b == d.Max ? this.f39938a.p0(androidx.compose.ui.unit.b.p(j10)) : this.f39938a.D0(androidx.compose.ui.unit.b.p(j10)));
        }

        @NotNull
        public final androidx.compose.ui.layout.y a() {
            return this.f39938a;
        }

        @NotNull
        public final d b() {
            return this.f39939b;
        }

        @Override // androidx.compose.ui.layout.y
        @Nullable
        public Object c() {
            return this.f39938a.c();
        }

        @NotNull
        public final e d() {
            return this.f39940c;
        }

        @Override // androidx.compose.ui.layout.y
        public int p0(int i10) {
            return this.f39938a.p0(i10);
        }
    }

    @SourceDebugExtension({"SMAP\nLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/NodeMeasuringIntrinsics$EmptyPlaceable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,398:1\n30#2:399\n80#3:400\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/NodeMeasuringIntrinsics$EmptyPlaceable\n*L\n376#1:399\n376#1:400\n*E\n"})
    private static final class c extends androidx.compose.ui.layout.i2 {
        public c(int i10, int i11) {
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

    private enum d {
        Min,
        Max;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f39944d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f39944d;
        }
    }

    private enum e {
        Width,
        Height;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f39948d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f39948d;
        }
    }

    public interface f {
        @NotNull
        androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10);
    }

    private o1() {
    }

    public final int a(@NotNull a aVar, @NotNull androidx.compose.ui.layout.c cVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return aVar.a(new androidx.compose.ui.layout.d(cVar, cVar.getLayoutDirection()), new b(yVar, d.Max, e.Height), androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(@NotNull f fVar, @NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return fVar.c(new androidx.compose.ui.layout.c0(zVar, zVar.getLayoutDirection()), new b(yVar, d.Max, e.Height), androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int c(@NotNull a aVar, @NotNull androidx.compose.ui.layout.c cVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return aVar.a(new androidx.compose.ui.layout.d(cVar, cVar.getLayoutDirection()), new b(yVar, d.Max, e.Width), androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int d(@NotNull f fVar, @NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        int i11 = 6 ^ 7;
        return fVar.c(new androidx.compose.ui.layout.c0(zVar, zVar.getLayoutDirection()), new b(yVar, d.Max, e.Width), androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int e(@NotNull a aVar, @NotNull androidx.compose.ui.layout.c cVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return aVar.a(new androidx.compose.ui.layout.d(cVar, cVar.getLayoutDirection()), new b(yVar, d.Min, e.Height), androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int f(@NotNull f fVar, @NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return fVar.c(new androidx.compose.ui.layout.c0(zVar, zVar.getLayoutDirection()), new b(yVar, d.Min, e.Height), androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int g(@NotNull a aVar, @NotNull androidx.compose.ui.layout.c cVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        int i11 = 7 ^ 7;
        return aVar.a(new androidx.compose.ui.layout.d(cVar, cVar.getLayoutDirection()), new b(yVar, d.Min, e.Width), androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int h(@NotNull f fVar, @NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return fVar.c(new androidx.compose.ui.layout.c0(zVar, zVar.getLayoutDirection()), new b(yVar, d.Min, e.Width), androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
