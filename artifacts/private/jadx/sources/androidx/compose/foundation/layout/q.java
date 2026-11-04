package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,711:1\n702#1,2:717\n705#1,5:722\n702#1,2:727\n705#1,5:732\n702#1,2:740\n705#1,5:746\n702#1,2:754\n705#1,5:760\n702#1,2:768\n705#1,5:774\n702#1,2:782\n705#1,5:788\n113#2:712\n113#2:713\n12862#3,3:714\n13504#3,3:719\n13504#3,3:729\n12862#3,3:737\n13504#3,2:742\n13506#3:745\n12862#3,3:751\n13504#3,2:756\n13506#3:759\n12862#3,3:765\n13504#3,2:770\n13506#3:773\n12862#3,3:779\n13504#3,2:784\n13506#3:787\n13504#3,3:793\n26#4:744\n26#4:758\n26#4:772\n26#4:786\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n614#1:717,2\n614#1:722,5\n622#1:727,2\n622#1:732,5\n636#1:740,2\n636#1:746,5\n651#1:754,2\n651#1:760,5\n675#1:768,2\n675#1:774,5\n695#1:782,2\n695#1:788,5\n339#1:712\n351#1:713\n612#1:714,3\n614#1:719,3\n622#1:729,3\n634#1:737,3\n636#1:742,2\n636#1:745\n648#1:751,3\n651#1:756,2\n651#1:759\n665#1:765,3\n675#1:770,2\n675#1:773\n687#1:779,3\n695#1:784,2\n695#1:787\n703#1:793,3\n637#1:744\n652#1:758\n676#1:772\n696#1:786\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f16330a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final e f16331b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final e f16332c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final m f16333d = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final m f16334e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final f f16335f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final f f16336g = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final f f16337h = new h();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final f f16338i = new g();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f16339j = 0;

    @androidx.compose.runtime.o2
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n554#1:712\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f16340a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final e f16341b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final e f16342c = new C0102a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final e f16343d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final e f16344e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final e f16345f = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final e f16346g = new d();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f16347h = 0;

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.q$a$a, reason: collision with other inner class name */
        public static final class C0102a implements e {
            C0102a() {
            }

            @Override // androidx.compose.foundation.layout.q.e
            public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
                q.f16330a.A(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        public static final class b implements e {
            b() {
            }

            @Override // androidx.compose.foundation.layout.q.e
            public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
                q.f16330a.B(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        public static final class c implements e {
            c() {
            }

            @Override // androidx.compose.foundation.layout.q.e
            public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
                q.f16330a.C(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        public static final class d implements e {
            d() {
            }

            @Override // androidx.compose.foundation.layout.q.e
            public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
                q.f16330a.D(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        public static final class e implements e {
            e() {
            }

            @Override // androidx.compose.foundation.layout.q.e
            public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
                q.f16330a.E(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        public static final class f implements e {
            f() {
            }

            @Override // androidx.compose.foundation.layout.q.e
            public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
                q.f16330a.F(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int e(androidx.compose.ui.e.b bVar, int i10, androidx.compose.ui.unit.w wVar) {
            return bVar.a(0, i10, wVar);
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void g() {
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void i() {
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void k() {
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void m() {
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void o() {
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int u(androidx.compose.ui.e.b bVar, int i10, androidx.compose.ui.unit.w wVar) {
            return bVar.a(0, i10, wVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int v(androidx.compose.ui.e.c cVar, int i10, androidx.compose.ui.unit.w wVar) {
            return cVar.a(0, i10);
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final e d(@NotNull final androidx.compose.ui.e.b bVar) {
            return new j(androidx.compose.ui.unit.h.r(0), false, new Function2() { // from class: androidx.compose.foundation.layout.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(q.a.e(bVar, ((Integer) obj).intValue(), (androidx.compose.ui.unit.w) obj2));
                }
            }, null);
        }

        @NotNull
        public final e f() {
            return f16342c;
        }

        @NotNull
        public final e h() {
            return f16341b;
        }

        @NotNull
        public final e j() {
            return f16343d;
        }

        @NotNull
        public final e l() {
            return f16346g;
        }

        @NotNull
        public final e n() {
            return f16344e;
        }

        @NotNull
        public final e p() {
            return f16345f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @androidx.compose.runtime.k7
        @NotNull
        public final f r(float f10) {
            return new j(f10, false, null, 0 == true ? 1 : 0);
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final e s(float f10, @NotNull final androidx.compose.ui.e.b bVar) {
            return new j(f10, false, new Function2() { // from class: androidx.compose.foundation.layout.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(q.a.u(bVar, ((Integer) obj).intValue(), (androidx.compose.ui.unit.w) obj2));
                }
            }, null);
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final m t(float f10, @NotNull final androidx.compose.ui.e.c cVar) {
            return new j(f10, false, new Function2() { // from class: androidx.compose.foundation.layout.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(q.a.v(cVar, ((Integer) obj).intValue(), (androidx.compose.ui.unit.w) obj2));
                }
            }, null);
        }
    }

    public static final class b implements m {
        b() {
        }

        @Override // androidx.compose.foundation.layout.q.m
        public void arrange(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, int[] iArr2) {
            q.f16330a.C(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n*L\n182#1:712\n*E\n"})
    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16348a = androidx.compose.ui.unit.h.r(0);

        c() {
        }

        @Override // androidx.compose.foundation.layout.q.f, androidx.compose.foundation.layout.q.e, androidx.compose.foundation.layout.q.m
        public float a() {
            return this.f16348a;
        }

        @Override // androidx.compose.foundation.layout.q.m
        public void arrange(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, int[] iArr2) {
            q.f16330a.A(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.q.e
        public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                q.f16330a.A(i10, iArr, iArr2, false);
            } else {
                q.f16330a.A(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    public static final class d implements e {
        d() {
        }

        @Override // androidx.compose.foundation.layout.q.e
        public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                q.f16330a.C(i10, iArr, iArr2, false);
            } else {
                q.f16330a.B(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    @androidx.compose.runtime.k7
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n50#1:712\n*E\n"})
    public interface e {

        public static final class a {
            @Deprecated
            public static float a(@NotNull e eVar) {
                return e.super.a();
            }
        }

        default float a() {
            return androidx.compose.ui.unit.h.r(0);
        }

        void c(@NotNull androidx.compose.ui.unit.d dVar, int i10, @NotNull int[] iArr, @NotNull androidx.compose.ui.unit.w wVar, @NotNull int[] iArr2);
    }

    @androidx.compose.runtime.k7
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n101#1:712\n*E\n"})
    public interface f extends e, m {

        public static final class a {
            @Deprecated
            public static float a(@NotNull f fVar) {
                return f.super.a();
            }
        }

        @Override // androidx.compose.foundation.layout.q.e, androidx.compose.foundation.layout.q.m
        default float a() {
            return androidx.compose.ui.unit.h.r(0);
        }
    }

    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n*L\n265#1:712\n*E\n"})
    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16349a = androidx.compose.ui.unit.h.r(0);

        g() {
        }

        @Override // androidx.compose.foundation.layout.q.f, androidx.compose.foundation.layout.q.e, androidx.compose.foundation.layout.q.m
        public float a() {
            return this.f16349a;
        }

        @Override // androidx.compose.foundation.layout.q.m
        public void arrange(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, int[] iArr2) {
            q.f16330a.D(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.q.e
        public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                q.f16330a.D(i10, iArr, iArr2, false);
            } else {
                q.f16330a.D(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n*L\n237#1:712\n*E\n"})
    public static final class h implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16350a = androidx.compose.ui.unit.h.r(0);

        h() {
        }

        @Override // androidx.compose.foundation.layout.q.f, androidx.compose.foundation.layout.q.e, androidx.compose.foundation.layout.q.m
        public float a() {
            return this.f16350a;
        }

        @Override // androidx.compose.foundation.layout.q.m
        public void arrange(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, int[] iArr2) {
            q.f16330a.E(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.q.e
        public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                q.f16330a.E(i10, iArr, iArr2, false);
            } else {
                q.f16330a.E(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n*L\n210#1:712\n*E\n"})
    public static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16351a = androidx.compose.ui.unit.h.r(0);

        i() {
        }

        @Override // androidx.compose.foundation.layout.q.f, androidx.compose.foundation.layout.q.e, androidx.compose.foundation.layout.q.m
        public float a() {
            return this.f16351a;
        }

        @Override // androidx.compose.foundation.layout.q.m
        public void arrange(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, int[] iArr2) {
            q.f16330a.F(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.q.e
        public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                q.f16330a.F(i10, iArr, iArr2, false);
            } else {
                q.f16330a.F(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    @androidx.compose.runtime.o2
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,711:1\n702#2,2:712\n705#2,5:717\n13504#3,3:714\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n584#1:712,2\n584#1:717,5\n584#1:714,3\n*E\n"})
    public static final class j implements f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f16352e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f16354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Function2<Integer, androidx.compose.ui.unit.w, Integer> f16355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f16356d;

        public /* synthetic */ j(float f10, boolean z10, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, z10, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ j j(j jVar, float f10, boolean z10, Function2 function2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = jVar.f16353a;
            }
            if ((i10 & 2) != 0) {
                z10 = jVar.f16354b;
            }
            if ((i10 & 4) != 0) {
                function2 = jVar.f16355c;
            }
            return jVar.i(f10, z10, function2);
        }

        @Override // androidx.compose.foundation.layout.q.f, androidx.compose.foundation.layout.q.e, androidx.compose.foundation.layout.q.m
        public float a() {
            return this.f16356d;
        }

        @Override // androidx.compose.foundation.layout.q.m
        public void arrange(@NotNull androidx.compose.ui.unit.d dVar, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            c(dVar, i10, iArr, androidx.compose.ui.unit.w.Ltr, iArr2);
        }

        @Override // androidx.compose.foundation.layout.q.e
        public void c(@NotNull androidx.compose.ui.unit.d dVar, int i10, @NotNull int[] iArr, @NotNull androidx.compose.ui.unit.w wVar, @NotNull int[] iArr2) {
            int i11;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iG6 = dVar.g6(this.f16353a);
            boolean z10 = this.f16354b && wVar == androidx.compose.ui.unit.w.Rtl;
            q qVar = q.f16330a;
            if (z10) {
                i11 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i12 = iArr[length];
                    int iMin2 = Math.min(i11, i10 - i12);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iG6, (i10 - iMin2) - i12);
                    i11 = iArr2[length] + i12 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i13 = 0;
                i11 = 0;
                iMin = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr[i13];
                    int iMin3 = Math.min(i11, i10 - i15);
                    iArr2[i14] = iMin3;
                    int iMin4 = Math.min(iG6, (i10 - iMin3) - i15);
                    int i16 = iArr2[i14] + i15 + iMin4;
                    i13++;
                    iMin = iMin4;
                    i11 = i16;
                    i14++;
                }
            }
            int i17 = i11 - iMin;
            Function2<Integer, androidx.compose.ui.unit.w, Integer> function2 = this.f16355c;
            if (function2 != null && i17 < i10) {
                int iIntValue = function2.invoke(Integer.valueOf(i10 - i17), wVar).intValue();
                int length3 = iArr2.length;
                for (int i18 = 0; i18 < length3; i18++) {
                    iArr2[i18] = iArr2[i18] + iIntValue;
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return androidx.compose.ui.unit.h.x(this.f16353a, jVar.f16353a) && this.f16354b == jVar.f16354b && Intrinsics.areEqual(this.f16355c, jVar.f16355c);
        }

        public final float f() {
            return this.f16353a;
        }

        public final boolean g() {
            return this.f16354b;
        }

        @Nullable
        public final Function2<Integer, androidx.compose.ui.unit.w, Integer> h() {
            return this.f16355c;
        }

        public int hashCode() {
            int iD = ((androidx.compose.ui.unit.h.D(this.f16353a) * 31) + Boolean.hashCode(this.f16354b)) * 31;
            Function2<Integer, androidx.compose.ui.unit.w, Integer> function2 = this.f16355c;
            return iD + (function2 == null ? 0 : function2.hashCode());
        }

        @NotNull
        public final j i(float f10, boolean z10, @Nullable Function2<? super Integer, ? super androidx.compose.ui.unit.w, Integer> function2) {
            return new j(f10, z10, function2, null);
        }

        @Nullable
        public final Function2<Integer, androidx.compose.ui.unit.w, Integer> k() {
            return this.f16355c;
        }

        public final boolean l() {
            return this.f16354b;
        }

        public final float m() {
            return this.f16353a;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f16354b ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) androidx.compose.ui.unit.h.M(this.f16353a));
            sb2.append(", ");
            sb2.append(this.f16355c);
            sb2.append(')');
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private j(float f10, boolean z10, Function2<? super Integer, ? super androidx.compose.ui.unit.w, Integer> function2) {
            this.f16353a = f10;
            this.f16354b = z10;
            this.f16355c = function2;
            this.f16356d = f10;
        }
    }

    public static final class k implements e {
        k() {
        }

        @Override // androidx.compose.foundation.layout.q.e
        public void c(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, androidx.compose.ui.unit.w wVar, int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                q.f16330a.B(iArr, iArr2, false);
            } else {
                q.f16330a.C(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    public static final class l implements m {
        l() {
        }

        @Override // androidx.compose.foundation.layout.q.m
        public void arrange(androidx.compose.ui.unit.d dVar, int i10, int[] iArr, int[] iArr2) {
            q.f16330a.B(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    @androidx.compose.runtime.k7
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n78#1:712\n*E\n"})
    public interface m {

        public static final class a {
            @Deprecated
            public static float a(@NotNull m mVar) {
                return m.super.a();
            }
        }

        default float a() {
            return androidx.compose.ui.unit.h.r(0);
        }

        void arrange(@NotNull androidx.compose.ui.unit.d dVar, int i10, @NotNull int[] iArr, @NotNull int[] iArr2);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J(int i10, androidx.compose.ui.unit.w wVar) {
        return androidx.compose.ui.e.f37317a.u().a(0, i10, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int K(androidx.compose.ui.e.b bVar, int i10, androidx.compose.ui.unit.w wVar) {
        return bVar.a(0, i10, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L(androidx.compose.ui.e.c cVar, int i10, androidx.compose.ui.unit.w wVar) {
        return cVar.a(0, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(androidx.compose.ui.e.b bVar, int i10, androidx.compose.ui.unit.w wVar) {
        return bVar.a(0, i10, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(androidx.compose.ui.e.c cVar, int i10, androidx.compose.ui.unit.w wVar) {
        return cVar.a(0, i10);
    }

    private final void j(int[] iArr, boolean z10, Function2<? super Integer, ? super Integer, Unit> function2) {
        if (!z10) {
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                function2.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            } else {
                function2.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void l() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void n() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void p() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void r() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void t() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void v() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void x() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void z() {
    }

    public final void A(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f10);
                f10 += i14;
            }
        } else {
            int length2 = iArr.length;
            int i15 = 0;
            while (i11 < length2) {
                int i16 = iArr[i11];
                iArr2[i15] = Math.round(f10);
                f10 += i16;
                i11++;
                i15++;
            }
        }
    }

    public final void B(@NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i10 = 0;
        if (z10) {
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    break;
                }
                int i11 = iArr[length];
                iArr2[length] = i10;
                i10 += i11;
            }
        } else {
            int length2 = iArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = iArr[i10];
                iArr2[i12] = i13;
                i13 += i14;
                i10++;
                i12++;
            }
        }
    }

    public final void C(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (z10) {
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    break;
                }
                int i15 = iArr[length];
                iArr2[length] = i14;
                i14 += i15;
            }
        } else {
            int length2 = iArr.length;
            int i16 = 0;
            while (i11 < length2) {
                int i17 = iArr[i11];
                iArr2[i16] = i14;
                i14 += i17;
                i11++;
                i16++;
            }
        }
    }

    public final void D(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = !(iArr.length == 0) ? (i10 - i12) / iArr.length : 0.0f;
        float f10 = length / 2;
        if (z10) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
        } else {
            int length3 = iArr.length;
            int i15 = 0;
            while (i11 < length3) {
                int i16 = iArr[i11];
                iArr2[i15] = Math.round(f10);
                f10 += i16 + length;
                i11++;
                i15++;
            }
        }
    }

    public final void E(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(ArraysKt.getLastIndex(iArr), 1);
        float f10 = (z10 && iArr.length == 1) ? fMax : 0.0f;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f10);
                f10 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    public final void F(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f10 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    @androidx.compose.runtime.k7
    @NotNull
    public final f G(float f10) {
        return new j(f10, true, new Function2() { // from class: androidx.compose.foundation.layout.m
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(q.J(((Integer) obj).intValue(), (androidx.compose.ui.unit.w) obj2));
            }
        }, null);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public final e H(float f10, @NotNull final androidx.compose.ui.e.b bVar) {
        return new j(f10, true, new Function2() { // from class: androidx.compose.foundation.layout.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(q.K(bVar, ((Integer) obj).intValue(), (androidx.compose.ui.unit.w) obj2));
            }
        }, null);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public final m I(float f10, @NotNull final androidx.compose.ui.e.c cVar) {
        return new j(f10, false, new Function2() { // from class: androidx.compose.foundation.layout.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(q.L(cVar, ((Integer) obj).intValue(), (androidx.compose.ui.unit.w) obj2));
            }
        }, null);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public final e f(@NotNull final androidx.compose.ui.e.b bVar) {
        return new j(androidx.compose.ui.unit.h.r(0), true, new Function2() { // from class: androidx.compose.foundation.layout.k
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(q.h(bVar, ((Integer) obj).intValue(), (androidx.compose.ui.unit.w) obj2));
            }
        }, null);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public final m g(@NotNull final androidx.compose.ui.e.c cVar) {
        return new j(androidx.compose.ui.unit.h.r(0), false, new Function2() { // from class: androidx.compose.foundation.layout.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(q.i(cVar, ((Integer) obj).intValue(), (androidx.compose.ui.unit.w) obj2));
            }
        }, null);
    }

    @NotNull
    public final m k() {
        return f16334e;
    }

    @NotNull
    public final f m() {
        return f16335f;
    }

    @NotNull
    public final e o() {
        return f16332c;
    }

    @NotNull
    public final f q() {
        return f16338i;
    }

    @NotNull
    public final f s() {
        return f16337h;
    }

    @NotNull
    public final f u() {
        return f16336g;
    }

    @NotNull
    public final e w() {
        return f16331b;
    }

    @NotNull
    public final m y() {
        return f16333d;
    }
}
