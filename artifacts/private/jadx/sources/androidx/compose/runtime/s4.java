package androidx.compose.runtime;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 6 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n*L\n1#1,442:1\n405#1:443\n409#1,8:444\n405#1:452\n409#1,8:453\n405#1:461\n409#1,8:462\n405#1:470\n409#1,8:471\n405#1:479\n409#1,8:480\n405#1:488\n409#1,8:489\n405#1:497\n409#1,8:498\n405#1:506\n409#1,8:507\n405#1:515\n409#1,8:516\n405#1:524\n409#1,8:525\n405#1:533\n409#1,8:534\n1#2:542\n256#3,2:543\n231#3,3:545\n200#3,7:548\n211#3,3:556\n214#3,9:560\n234#3:569\n258#3:570\n1399#4:555\n1270#4:559\n1399#4:581\n1270#4:585\n1399#4:607\n1270#4:611\n1399#4:630\n1270#4:634\n395#5,4:571\n367#5,6:575\n377#5,3:582\n380#5,9:586\n399#5:595\n423#5:596\n395#5,4:597\n367#5,6:601\n377#5,3:608\n380#5,9:612\n399#5:621\n424#5:622\n367#5,6:624\n377#5,3:631\n380#5,2:635\n383#5,6:641\n775#6:623\n777#6,4:637\n781#6:647\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n114#1:443\n116#1:444,8\n124#1:452\n126#1:453,8\n134#1:461\n136#1:462,8\n141#1:470\n143#1:471,8\n148#1:479\n150#1:480,8\n160#1:488\n162#1:489,8\n170#1:497\n172#1:498,8\n181#1:506\n183#1:507,8\n248#1:515\n250#1:516,8\n259#1:524\n261#1:525,8\n266#1:533\n268#1:534,8\n339#1:543,2\n339#1:545,3\n339#1:548,7\n339#1:556,3\n339#1:560,9\n339#1:569\n339#1:570\n339#1:555\n339#1:559\n361#1:581\n361#1:585\n381#1:607\n381#1:611\n388#1:630\n388#1:634\n361#1:571,4\n361#1:575,6\n361#1:582,3\n361#1:586,9\n361#1:595\n381#1:596\n381#1:597,4\n381#1:601,6\n381#1:608,3\n381#1:612,9\n381#1:621\n381#1:622\n388#1:624,6\n388#1:631,3\n388#1:635,2\n388#1:641,6\n388#1:623\n388#1:637,4\n388#1:647\n*E\n"})
public final class s4 implements s5, q4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f36369h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f36370i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private u4 f36371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private g f36373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function2<? super c0, ? super Integer, Unit> f36374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.collection.f2<Object> f36376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.collection.k2<q1<?>, Object> f36377g;

    @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,442:1\n34#2,5:443\n91#2:448\n34#2,5:449\n92#2:454\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n425#1:443,5\n436#1:448\n436#1:449,5\n436#1:454\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull z5 z5Var, @NotNull List<g> list, @NotNull u4 u4Var) {
            List<g> list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objU1 = z5Var.u1(list.get(i10), 0);
                s4 s4Var = objU1 instanceof s4 ? (s4) objU1 : null;
                if (s4Var != null) {
                    s4Var.c(u4Var);
                }
            }
        }

        public final boolean b(@NotNull w5 w5Var, @NotNull List<g> list) {
            List<g> list2 = list;
            if (!list2.isEmpty()) {
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = list.get(i10);
                    if (w5Var.b0(gVar) && (w5Var.p0(w5Var.k(gVar), 0) instanceof s4)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    public s4(@Nullable u4 u4Var) {
        this.f36371a = u4Var;
    }

    private final void I(int i10, boolean z10) {
        int i11 = this.f36372b;
        this.f36372b = z10 ? i10 | i11 : (~i10) & i11;
    }

    private final void N(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 32 : i10 & (-33);
    }

    private final void R(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 16 : i10 & (-17);
    }

    private final boolean d(q1<?> q1Var, androidx.collection.k2<q1<?>, Object> k2Var) {
        Intrinsics.checkNotNull(q1Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        u6<?> u6VarC = q1Var.c();
        if (u6VarC == null) {
            u6VarC = w6.z();
        }
        return !u6VarC.b(q1Var.D().d(), k2Var.p(q1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[LOOP:0: B:11:0x0022->B:35:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[EDGE_INSN: B:39:0x0090->B:36:0x0090 BREAK  A[LOOP:0: B:11:0x0022->B:35:0x008d], SYNTHETIC] */
    public static final Unit g(s4 s4Var, int i10, androidx.collection.f2 f2Var, o0 o0Var) {
        int i11;
        if (s4Var.f36375e == i10 && Intrinsics.areEqual(f2Var, s4Var.f36376f) && (o0Var instanceof s0)) {
            long[] jArr = f2Var.f12436a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i12 != length) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((255 & j10) < 128) {
                                int i16 = (i12 << 3) + i15;
                                Object obj = f2Var.f12437b[i16];
                                boolean z10 = f2Var.f12438c[i16] != i10;
                                if (z10) {
                                    s0 s0Var = (s0) o0Var;
                                    s0Var.q0(obj, s4Var);
                                    i11 = i13;
                                    if (obj instanceof q1) {
                                        s0Var.p0((q1) obj);
                                        androidx.collection.k2<q1<?>, Object> k2Var = s4Var.f36377g;
                                        if (k2Var != null) {
                                            k2Var.l0((q1<?>) obj);
                                        }
                                    }
                                } else {
                                    i11 = i13;
                                }
                                if (z10) {
                                    f2Var.j0(i16);
                                }
                            } else {
                                i11 = i13;
                            }
                            j10 >>= i11;
                            i15++;
                            i13 = i11;
                        }
                        if (i14 != i13) {
                            break;
                        }
                        if (i12 != length) {
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        return Unit.f312394a;
    }

    private final boolean l(int i10) {
        return (this.f36372b & i10) != 0;
    }

    private final boolean q() {
        return (this.f36372b & 32) != 0;
    }

    public final void A(@NotNull q1<?> q1Var, @Nullable Object obj) {
        androidx.collection.k2<q1<?>, Object> k2Var = this.f36377g;
        if (k2Var == null) {
            k2Var = new androidx.collection.k2<>(0, 1, null);
            this.f36377g = k2Var;
        }
        k2Var.q0(q1Var, obj);
    }

    public final boolean B(@NotNull Object obj) {
        int i10 = 0;
        if (q()) {
            return false;
        }
        androidx.collection.f2<Object> f2Var = this.f36376f;
        int i11 = 1;
        if (f2Var == null) {
            f2Var = new androidx.collection.f2<>(i10, i11, null);
            this.f36376f = f2Var;
        }
        return f2Var.d0(obj, this.f36375e, -1) == this.f36375e;
    }

    public final void C() {
        u4 u4Var = this.f36371a;
        if (u4Var != null) {
            u4Var.c(this);
        }
        this.f36371a = null;
        this.f36376f = null;
        this.f36377g = null;
        this.f36374d = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void D() {
        androidx.collection.f2<Object> f2Var;
        u4 u4Var = this.f36371a;
        if (u4Var == null || (f2Var = this.f36376f) == null) {
            return;
        }
        N(true);
        try {
            Object[] objArr = f2Var.f12437b;
            int[] iArr = f2Var.f12438c;
            long[] jArr = f2Var.f12436a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                int i14 = iArr[i13];
                                u4Var.a(obj);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } finally {
            N(false);
        }
    }

    public final void E() {
        if (t()) {
            return;
        }
        R(true);
    }

    public final void F(@Nullable g gVar) {
        this.f36373c = gVar;
    }

    public final void G(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 2 : i10 & (-3);
    }

    public final void H(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 4 : i10 & (-5);
    }

    public final void J(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 64 : i10 & (-65);
    }

    public final void K(@Nullable u4 u4Var) {
        this.f36371a = u4Var;
    }

    public final void L(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 256 : i10 & (-257);
    }

    public final void M(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 8 : i10 & (-9);
    }

    public final void O(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 1024 : i10 & (-1025);
    }

    public final void P(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 512 : i10 & (-513);
    }

    public final void Q(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 128 : i10 & (-129);
    }

    public final void S(boolean z10) {
        int i10 = this.f36372b;
        this.f36372b = z10 ? i10 | 1 : i10 & (-2);
    }

    public final void T(int i10) {
        this.f36375e = i10;
        R(false);
    }

    @Override // androidx.compose.runtime.s5
    public void a(@NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        this.f36374d = function2;
    }

    public final void c(@NotNull u4 u4Var) {
        this.f36371a = u4Var;
    }

    public final void e(@NotNull c0 c0Var) {
        Function2<? super c0, ? super Integer, Unit> function2 = this.f36374d;
        if (function2 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        function2.invoke(c0Var, 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005d A[LOOP:0: B:9:0x001f->B:22:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[SYNTHETIC] */
    @Nullable
    public final Function1<o0, Unit> f(final int i10) {
        final androidx.collection.f2<Object> f2Var = this.f36376f;
        if (f2Var != null && !u()) {
            Object[] objArr = f2Var.f12437b;
            int[] iArr = f2Var.f12438c;
            long[] jArr = f2Var.f12436a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j10) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                if (iArr[i14] != i10) {
                                    return new Function1() { // from class: androidx.compose.runtime.r4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return s4.g(this.f36333a, i10, f2Var, (o0) obj2);
                                        }
                                    };
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i12 == 8) {
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    } else if (i11 != length) {
                        i11++;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public final g h() {
        return this.f36373c;
    }

    public final boolean i() {
        return this.f36374d != null;
    }

    @Override // androidx.compose.runtime.q4
    public void invalidate() {
        u4 u4Var = this.f36371a;
        if (u4Var != null) {
            u4Var.g(this, null);
        }
    }

    public final boolean j() {
        return (this.f36372b & 2) != 0;
    }

    public final boolean k() {
        return (this.f36372b & 4) != 0;
    }

    public final boolean m() {
        return (this.f36372b & 64) != 0;
    }

    @Nullable
    public final u4 n() {
        return this.f36371a;
    }

    public final boolean o() {
        return (this.f36372b & 256) != 0;
    }

    public final boolean p() {
        return (this.f36372b & 8) != 0;
    }

    public final boolean r() {
        return (this.f36372b & 1024) != 0;
    }

    public final boolean s() {
        return (this.f36372b & 512) != 0;
    }

    public final boolean t() {
        return (this.f36372b & 128) != 0;
    }

    public final boolean u() {
        return (this.f36372b & 16) != 0;
    }

    public final boolean v() {
        return (this.f36372b & 1) != 0;
    }

    public final boolean w() {
        if (this.f36371a != null) {
            g gVar = this.f36373c;
            if (gVar != null ? gVar.b() : false) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final u2 x(@Nullable Object obj) {
        u2 u2VarG;
        u4 u4Var = this.f36371a;
        return (u4Var == null || (u2VarG = u4Var.g(this, obj)) == null) ? u2.IGNORED : u2VarG;
    }

    public final boolean y() {
        return this.f36377g != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[LOOP:0: B:19:0x002f->B:33:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0076 A[EDGE_INSN: B:36:0x0076->B:34:0x0076 BREAK  A[LOOP:0: B:19:0x002f->B:33:0x0073], SYNTHETIC] */
    public final boolean z(@Nullable Object obj) {
        androidx.collection.k2<q1<?>, Object> k2Var;
        if (obj == null || (k2Var = this.f36377g) == null) {
            return true;
        }
        if (obj instanceof q1) {
            return d((q1) obj, k2Var);
        }
        if (!(obj instanceof androidx.collection.c3)) {
            return true;
        }
        androidx.collection.c3 c3Var = (androidx.collection.c3) obj;
        if (c3Var.s()) {
            Object[] objArr = c3Var.f12171b;
            long[] jArr = c3Var.f12170a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj2 = objArr[(i10 << 3) + i12];
                                if (!(obj2 instanceof q1) || d((q1) obj2, k2Var)) {
                                    return true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                        if (i10 != length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return false;
    }
}
