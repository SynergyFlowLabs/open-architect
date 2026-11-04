package androidx.compose.ui.graphics;

import androidx.compose.runtime.k7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public abstract class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37796b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f37797a;

    @SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,742:1\n1#2:743\n30#3:744\n30#3:748\n30#3:752\n30#3:756\n30#3:760\n30#3:764\n53#4,3:745\n53#4,3:749\n53#4,3:753\n53#4,3:757\n53#4,3:761\n53#4,3:765\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n*L\n150#1:744\n187#1:748\n188#1:752\n219#1:756\n256#1:760\n257#1:764\n150#1:745,3\n187#1:749,3\n188#1:753,3\n219#1:757,3\n256#1:761,3\n257#1:765,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ i0 d(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = x3.f38688b.a();
            }
            return aVar.b(list, f10, f11, i10);
        }

        public static /* synthetic */ i0 e(a aVar, Pair[] pairArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = x3.f38688b.a();
            }
            return aVar.c(pairArr, f10, f11, i10);
        }

        public static /* synthetic */ i0 h(a aVar, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = n0.g.f332700b.e();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = n0.g.f332700b.a();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = x3.f38688b.a();
            }
            return aVar.f(list, j12, j13, i10);
        }

        public static /* synthetic */ i0 i(a aVar, Pair[] pairArr, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = n0.g.f332700b.e();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = n0.g.f332700b.a();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = x3.f38688b.a();
            }
            return aVar.g(pairArr, j12, j13, i10);
        }

        public static /* synthetic */ i0 l(a aVar, List list, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = n0.g.f332700b.c();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = x3.f38688b.a();
            }
            return aVar.j(list, j11, f11, i10);
        }

        public static /* synthetic */ i0 m(a aVar, Pair[] pairArr, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = n0.g.f332700b.c();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = x3.f38688b.a();
            }
            return aVar.k(pairArr, j11, f11, i10);
        }

        public static /* synthetic */ i0 p(a aVar, List list, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = n0.g.f332700b.c();
            }
            return aVar.n(list, j10);
        }

        public static /* synthetic */ i0 q(a aVar, Pair[] pairArr, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = n0.g.f332700b.c();
            }
            return aVar.o(pairArr, j10);
        }

        public static /* synthetic */ i0 t(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = x3.f38688b.a();
            }
            return aVar.r(list, f10, f11, i10);
        }

        public static /* synthetic */ i0 u(a aVar, Pair[] pairArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = x3.f38688b.a();
            }
            return aVar.s(pairArr, f10, f11, i10);
        }

        @k7
        @NotNull
        public final i0 a(@NotNull i0 i0Var, @NotNull i0 i0Var2, int i10) {
            return new g1(j0.b(i0Var), j0.b(i0Var2), i10, null);
        }

        @k7
        @NotNull
        public final i0 b(@NotNull List<q0> list, float f10, float f11, int i10) {
            return f(list, n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a)), i10);
        }

        @k7
        @NotNull
        public final i0 c(@NotNull Pair<Float, q0>[] pairArr, float f10, float f11, int i10) {
            return g((Pair[]) Arrays.copyOf(pairArr, pairArr.length), n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a)), i10);
        }

        @k7
        @NotNull
        public final i0 f(@NotNull List<q0> list, long j10, long j11, int i10) {
            return new b2(list, null, j10, j11, i10, null);
        }

        @k7
        @NotNull
        public final i0 g(@NotNull Pair<Float, q0>[] pairArr, long j10, long j11, int i10) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, q0> pair : pairArr) {
                arrayList.add(q0.n(pair.getSecond().M()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, q0> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new b2(arrayList, arrayList2, j10, j11, i10, null);
        }

        @k7
        @NotNull
        public final i0 j(@NotNull List<q0> list, long j10, float f10, int i10) {
            return new b3(list, null, j10, f10, i10, null);
        }

        @k7
        @NotNull
        public final i0 k(@NotNull Pair<Float, q0>[] pairArr, long j10, float f10, int i10) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, q0> pair : pairArr) {
                arrayList.add(q0.n(pair.getSecond().M()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, q0> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new b3(arrayList, arrayList2, j10, f10, i10, null);
        }

        @k7
        @NotNull
        public final i0 n(@NotNull List<q0> list, long j10) {
            int i10 = 2 ^ 0;
            return new w3(j10, list, null, null);
        }

        @k7
        @NotNull
        public final i0 o(@NotNull Pair<Float, q0>[] pairArr, long j10) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, q0> pair : pairArr) {
                arrayList.add(q0.n(pair.getSecond().M()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, q0> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new w3(j10, arrayList, arrayList2, null);
        }

        @k7
        @NotNull
        public final i0 r(@NotNull List<q0> list, float f10, float f11, int i10) {
            return f(list, n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a)), i10);
        }

        @k7
        @NotNull
        public final i0 s(@NotNull Pair<Float, q0>[] pairArr, float f10, float f11, int i10) {
            return g((Pair[]) Arrays.copyOf(pairArr, pairArr.length), n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a)), i10);
        }

        private a() {
        }
    }

    public /* synthetic */ i0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(long j10, @NotNull h2 h2Var, float f10);

    public long b() {
        return this.f37797a;
    }

    private i0() {
        this.f37797a = n0.n.f332724b.a();
    }
}
