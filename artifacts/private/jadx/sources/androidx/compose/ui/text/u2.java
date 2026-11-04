package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,528:1\n65#1,2:530\n93#1:533\n65#1,2:548\n93#1:553\n93#1:555\n93#1:557\n93#1:559\n65#1,2:561\n65#1,2:564\n65#1,2:567\n65#1,2:570\n65#1,2:573\n65#1,2:576\n93#1:579\n93#1:581\n93#1:583\n93#1:585\n65#1,2:587\n93#1:590\n65#1,2:592\n93#1:595\n93#1:597\n65#1,2:599\n65#1,2:602\n65#1,2:605\n65#1,2:608\n65#1,2:611\n93#1:614\n65#1,2:616\n65#1,2:619\n65#1,2:622\n65#1,2:625\n93#1:628\n93#1:630\n93#1:632\n65#1,2:634\n65#1,2:637\n65#1,2:640\n65#1,2:643\n65#1,2:646\n65#1,2:649\n65#1,2:652\n65#1,2:655\n65#1,2:658\n65#1,2:661\n65#1,2:664\n65#1,2:667\n65#1,2:670\n93#1:673\n65#1,2:675\n65#1,2:678\n93#1:681\n93#1:683\n93#1:690\n65#1,2:709\n93#1:714\n93#1:716\n93#1:718\n1#2:529\n1#2:532\n1#2:534\n1#2:550\n1#2:554\n1#2:556\n1#2:558\n1#2:560\n1#2:563\n1#2:566\n1#2:569\n1#2:572\n1#2:575\n1#2:578\n1#2:580\n1#2:582\n1#2:584\n1#2:586\n1#2:589\n1#2:591\n1#2:594\n1#2:596\n1#2:598\n1#2:601\n1#2:604\n1#2:607\n1#2:610\n1#2:613\n1#2:615\n1#2:618\n1#2:621\n1#2:624\n1#2:627\n1#2:629\n1#2:631\n1#2:633\n1#2:636\n1#2:639\n1#2:642\n1#2:645\n1#2:648\n1#2:651\n1#2:654\n1#2:657\n1#2:660\n1#2:663\n1#2:666\n1#2:669\n1#2:672\n1#2:674\n1#2:677\n1#2:680\n1#2:682\n1#2:684\n1#2:691\n1#2:711\n1#2:715\n1#2:717\n1#2:719\n151#3,2:535\n35#3,5:537\n153#3:542\n151#3,2:543\n35#3,3:545\n39#3:551\n153#3:552\n151#3,2:696\n35#3,5:698\n153#3:703\n151#3,2:704\n35#3,3:706\n39#3:712\n153#3:713\n65#4:685\n69#4:688\n60#5:686\n70#5:689\n53#5,3:693\n22#6:687\n30#7:692\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n*L\n103#1:530,2\n104#1:533\n114#1:548,2\n164#1:553\n165#1:555\n166#1:557\n167#1:559\n171#1:561,2\n175#1:564,2\n179#1:567,2\n183#1:570,2\n187#1:573,2\n191#1:576,2\n195#1:579\n210#1:581\n215#1:583\n223#1:585\n224#1:587,2\n235#1:590\n236#1:592,2\n263#1:595\n264#1:597\n265#1:599,2\n266#1:602,2\n267#1:605,2\n268#1:608,2\n269#1:611,2\n270#1:614\n271#1:616,2\n299#1:619,2\n300#1:622,2\n301#1:625,2\n302#1:628\n303#1:630\n305#1:632\n306#1:634,2\n307#1:637,2\n308#1:640,2\n309#1:643,2\n310#1:646,2\n311#1:649,2\n312#1:652,2\n329#1:655,2\n330#1:658,2\n331#1:661,2\n332#1:664,2\n369#1:667,2\n370#1:670,2\n395#1:673\n414#1:675,2\n415#1:678,2\n416#1:681\n459#1:683\n481#1:690\n494#1:709,2\n516#1:714\n517#1:716\n518#1:718\n103#1:532\n104#1:534\n114#1:550\n164#1:554\n165#1:556\n166#1:558\n167#1:560\n171#1:563\n175#1:566\n179#1:569\n183#1:572\n187#1:575\n191#1:578\n195#1:580\n210#1:582\n215#1:584\n223#1:586\n224#1:589\n235#1:591\n236#1:594\n263#1:596\n264#1:598\n265#1:601\n266#1:604\n267#1:607\n268#1:610\n269#1:613\n270#1:615\n271#1:618\n299#1:621\n300#1:624\n301#1:627\n302#1:629\n303#1:631\n305#1:633\n306#1:636\n307#1:639\n308#1:642\n309#1:645\n310#1:648\n311#1:651\n312#1:654\n329#1:657\n330#1:660\n331#1:663\n332#1:666\n369#1:669\n370#1:672\n395#1:674\n414#1:677\n415#1:680\n416#1:682\n459#1:684\n481#1:691\n494#1:711\n516#1:715\n517#1:717\n518#1:719\n110#1:535,2\n110#1:537,5\n110#1:542\n113#1:543,2\n113#1:545,3\n113#1:551\n113#1:552\n491#1:696,2\n491#1:698,5\n491#1:703\n494#1:704,2\n494#1:706,3\n494#1:712\n494#1:713\n473#1:685\n473#1:688\n473#1:686\n473#1:689\n481#1:693,3\n473#1:687\n481#1:692\n*E\n"})
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<f, Object> f42284a = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.c1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.S((androidx.compose.runtime.saveable.g0) obj, (f) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.e1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.T(obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<List<f.e<? extends Object>>, Object> f42285b = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.q1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.V((androidx.compose.runtime.saveable.g0) obj, (List) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.c2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.U(obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<f.e<? extends Object>, Object> f42286c = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.h2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.W((androidx.compose.runtime.saveable.g0) obj, (f.e) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.i2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.X(obj);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<c4, Object> f42287d = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.k2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.J0((androidx.compose.runtime.saveable.g0) obj, (c4) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.l2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.K0(obj);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<b4, Object> f42288e = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.m2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.H0((androidx.compose.runtime.saveable.g0) obj, (b4) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.n2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.I0(obj);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<b0.b, Object> f42289f = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.n1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.g0((androidx.compose.runtime.saveable.g0) obj, (b0.b) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.y1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.h0(obj);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<b0.a, Object> f42290g = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.j2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.a0((androidx.compose.runtime.saveable.g0) obj, (b0.a) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.o2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.b0(obj);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<t0, Object> f42291h = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.p2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.p0((androidx.compose.runtime.saveable.g0) obj, (t0) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.q2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.q0(obj);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<c3, Object> f42292i = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.r2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.t0((androidx.compose.runtime.saveable.g0) obj, (c3) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.s2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.u0(obj);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<q3, Object> f42293j = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.t2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.B0((androidx.compose.runtime.saveable.g0) obj, (q3) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.d1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.C0(obj);
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.k, Object> f42294k = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.f1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.v0((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.text.style.k) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.g1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.w0(obj);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.q, Object> f42295l = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.h1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.x0((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.text.style.q) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.i1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.y0(obj);
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.s, Object> f42296m = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.j1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.z0((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.text.style.s) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.k1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.A0(obj);
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.font.v0, Object> f42297n = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.l1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.c0((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.text.font.v0) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.m1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.d0(obj);
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.a, Object> f42298o = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.o1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.Y((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.text.style.a) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.p1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.Z(obj);
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<w3, Object> f42299p = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.r1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.D0((androidx.compose.runtime.saveable.g0) obj, (w3) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.s1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.E0(obj);
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.graphics.o3, Object> f42300q = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.t1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.r0((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.graphics.o3) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.u1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.s0(obj);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final m0<androidx.compose.ui.graphics.q0, Object> f42301r = m0(a.f42307a, b.f42308a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final m0<androidx.compose.ui.unit.z, Object> f42302s = m0(new Function2() { // from class: androidx.compose.ui.text.v1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.F0((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.unit.z) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.w1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.G0(obj);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final m0<n0.g, Object> f42303t = m0(new Function2() { // from class: androidx.compose.ui.text.x1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.n0((androidx.compose.runtime.saveable.g0) obj, (n0.g) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.z1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.o0(obj);
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<y0.f, Object> f42304u = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.a2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.i0((androidx.compose.runtime.saveable.g0) obj, (y0.f) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.b2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.j0(obj);
        }
    });

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<y0.e, Object> f42305v = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.d2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.k0((androidx.compose.runtime.saveable.g0) obj, (y0.e) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.e2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.l0(obj);
        }
    });

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.h, Object> f42306w = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.f2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u2.e0((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.text.style.h) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.g2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u2.f0(obj);
        }
    });

    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ColorSaver$1\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,528:1\n640#2:529\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ColorSaver$1\n*L\n427#1:529\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.saveable.g0, androidx.compose.ui.graphics.q0, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42307a = new a();

        a() {
        }

        public final Object c(androidx.compose.runtime.saveable.g0 g0Var, long j10) {
            return j10 == 16 ? Boolean.FALSE : Integer.valueOf(androidx.compose.ui.graphics.s0.t(j10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.graphics.q0 q0Var) {
            return c(g0Var, q0Var.M());
        }
    }

    static final class b implements Function1<Object, androidx.compose.ui.graphics.q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f42308a = new b();

        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.graphics.q0 invoke(Object obj) {
            if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                return androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.u());
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.s0.b(((Integer) obj).intValue()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    public static final class c<Original, Saveable> implements m0<Original, Saveable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.saveable.g0, Original, Saveable> f42309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Saveable, Original> f42310b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super androidx.compose.runtime.saveable.g0, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.f42309a = function2;
            this.f42310b = function1;
        }

        @Override // androidx.compose.runtime.saveable.c0
        public Saveable a(androidx.compose.runtime.saveable.g0 g0Var, Original original) {
            return this.f42309a.invoke(g0Var, original);
        }

        @Override // androidx.compose.runtime.saveable.c0
        public Original b(Saveable saveable) {
            return this.f42310b.invoke(saveable);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42311a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.Clickable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o.String.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f42311a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.style.s A0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        androidx.compose.ui.unit.z.a aVar = androidx.compose.ui.unit.z.f42728b;
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.unit.z, Object> c0VarX0 = X0(aVar);
        Boolean bool = Boolean.FALSE;
        androidx.compose.ui.unit.z zVarB = null;
        androidx.compose.ui.unit.z zVarB2 = ((!Intrinsics.areEqual(obj2, bool) || (c0VarX0 instanceof m0)) && obj2 != null) ? c0VarX0.b(obj2) : null;
        Intrinsics.checkNotNull(zVarB2);
        long jW = zVarB2.w();
        Object obj3 = list.get(1);
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.unit.z, Object> c0VarX1 = X0(aVar);
        if ((!Intrinsics.areEqual(obj3, bool) || (c0VarX1 instanceof m0)) && obj3 != null) {
            zVarB = c0VarX1.b(obj3);
        }
        Intrinsics.checkNotNull(zVarB);
        return new androidx.compose.ui.text.style.s(jW, zVarB.w(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object B0(androidx.compose.runtime.saveable.g0 g0Var, q3 q3Var) {
        c3 c3VarD = q3Var.d();
        androidx.compose.runtime.saveable.c0<c3, Object> c0Var = f42292i;
        return CollectionsKt.arrayListOf(h1(c3VarD, c0Var, g0Var), h1(q3Var.a(), c0Var, g0Var), h1(q3Var.b(), c0Var, g0Var), h1(q3Var.c(), c0Var, g0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q3 C0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        androidx.compose.runtime.saveable.c0<c3, Object> c0Var = f42292i;
        Boolean bool = Boolean.FALSE;
        c3 c3VarB = null;
        c3 c3VarB2 = ((!Intrinsics.areEqual(obj2, bool) || (c0Var instanceof m0)) && obj2 != null) ? c0Var.b(obj2) : null;
        Object obj3 = list.get(1);
        c3 c3VarB3 = ((!Intrinsics.areEqual(obj3, bool) || (c0Var instanceof m0)) && obj3 != null) ? c0Var.b(obj3) : null;
        Object obj4 = list.get(2);
        c3 c3VarB4 = ((!Intrinsics.areEqual(obj4, bool) || (c0Var instanceof m0)) && obj4 != null) ? c0Var.b(obj4) : null;
        Object obj5 = list.get(3);
        if ((!Intrinsics.areEqual(obj5, bool) || (c0Var instanceof m0)) && obj5 != null) {
            c3VarB = c0Var.b(obj5);
        }
        return new q3(c3VarB2, c3VarB3, c3VarB4, c3VarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object D0(androidx.compose.runtime.saveable.g0 g0Var, w3 w3Var) {
        return CollectionsKt.arrayListOf(g1(Integer.valueOf(w3.n(w3Var.r()))), g1(Integer.valueOf(w3.i(w3Var.r()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w3 E0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.checkNotNull(num2);
        return w3.b(x3.b(iIntValue, num2.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object F0(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.unit.z zVar) {
        return zVar == null ? false : androidx.compose.ui.unit.z.j(zVar.w(), androidx.compose.ui.unit.z.f42728b.b()) ? Boolean.FALSE : CollectionsKt.arrayListOf(g1(Float.valueOf(androidx.compose.ui.unit.z.n(zVar.w()))), g1(androidx.compose.ui.unit.b0.d(androidx.compose.ui.unit.z.m(zVar.w()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.z G0(Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
            return androidx.compose.ui.unit.z.c(androidx.compose.ui.unit.z.f42728b.b());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        int i10 = 6 << 0;
        Float f10 = obj2 != null ? (Float) obj2 : null;
        Intrinsics.checkNotNull(f10);
        float fFloatValue = f10.floatValue();
        Object obj3 = list.get(1);
        androidx.compose.ui.unit.b0 b0Var = obj3 != null ? (androidx.compose.ui.unit.b0) obj3 : null;
        Intrinsics.checkNotNull(b0Var);
        return androidx.compose.ui.unit.z.c(androidx.compose.ui.unit.a0.a(fFloatValue, b0Var.j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object H0(androidx.compose.runtime.saveable.g0 g0Var, b4 b4Var) {
        return g1(b4Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b4 I0(Object obj) {
        String str = obj != null ? (String) obj : null;
        Intrinsics.checkNotNull(str);
        return new b4(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object J0(androidx.compose.runtime.saveable.g0 g0Var, c4 c4Var) {
        return g1(c4Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c4 K0(Object obj) {
        String str = obj != null ? (String) obj : null;
        Intrinsics.checkNotNull(str);
        return new c4(str);
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<f, Object> L0() {
        return f42284a;
    }

    private static /* synthetic */ void M0() {
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<t0, Object> N0() {
        return f42291h;
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.graphics.q0, Object> O0(@NotNull androidx.compose.ui.graphics.q0.a aVar) {
        return f42301r;
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.graphics.o3, Object> P0(@NotNull androidx.compose.ui.graphics.o3.a aVar) {
        return f42300q;
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<w3, Object> Q0(@NotNull w3.a aVar) {
        return f42299p;
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.font.v0, Object> R0(@NotNull androidx.compose.ui.text.font.v0.a aVar) {
        return f42297n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object S(androidx.compose.runtime.saveable.g0 g0Var, f fVar) {
        return CollectionsKt.arrayListOf(g1(fVar.m()), h1(fVar.d(), f42285b, g0Var));
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.a, Object> S0(@NotNull androidx.compose.ui.text.style.a.C0339a c0339a) {
        return f42298o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f T(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(1);
        androidx.compose.runtime.saveable.c0<List<f.e<? extends Object>>, Object> c0Var = f42285b;
        List<f.e<? extends Object>> listB = ((!Intrinsics.areEqual(obj2, Boolean.FALSE) || (c0Var instanceof m0)) && obj2 != null) ? c0Var.b(obj2) : null;
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        Intrinsics.checkNotNull(str);
        return new f(listB, str);
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.h, Object> T0(@NotNull androidx.compose.ui.text.style.h.b bVar) {
        return f42306w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List U(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            androidx.compose.runtime.saveable.c0<f.e<? extends Object>, Object> c0Var = f42286c;
            f.e<? extends Object> eVarB = null;
            if ((!Intrinsics.areEqual(obj2, Boolean.FALSE) || (c0Var instanceof m0)) && obj2 != null) {
                eVarB = c0Var.b(obj2);
            }
            Intrinsics.checkNotNull(eVarB);
            arrayList.add(eVarB);
        }
        return arrayList;
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.k, Object> U0(@NotNull androidx.compose.ui.text.style.k.a aVar) {
        return f42294k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object V(androidx.compose.runtime.saveable.g0 g0Var, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(h1((f.e) list.get(i10), f42286c, g0Var));
        }
        return arrayList;
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.q, Object> V0(@NotNull androidx.compose.ui.text.style.q.a aVar) {
        return f42295l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object W(androidx.compose.runtime.saveable.g0 g0Var, f.e eVar) {
        o oVar;
        Object objH1;
        Object objH = eVar.h();
        if (objH instanceof t0) {
            oVar = o.Paragraph;
        } else if (objH instanceof c3) {
            oVar = o.Span;
        } else if (objH instanceof c4) {
            oVar = o.VerbatimTts;
        } else if (objH instanceof b4) {
            oVar = o.Url;
        } else if (objH instanceof b0.b) {
            oVar = o.Link;
        } else if (objH instanceof b0.a) {
            oVar = o.Clickable;
        } else {
            if (!(objH instanceof f3)) {
                throw new UnsupportedOperationException();
            }
            oVar = o.String;
        }
        switch (d.f42311a[oVar.ordinal()]) {
            case 1:
                Object objH2 = eVar.h();
                Intrinsics.checkNotNull(objH2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                objH1 = h1((t0) objH2, f42291h, g0Var);
                break;
            case 2:
                Object objH3 = eVar.h();
                Intrinsics.checkNotNull(objH3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                objH1 = h1((c3) objH3, f42292i, g0Var);
                break;
            case 3:
                Object objH4 = eVar.h();
                Intrinsics.checkNotNull(objH4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                objH1 = h1((c4) objH4, f42287d, g0Var);
                break;
            case 4:
                Object objH5 = eVar.h();
                Intrinsics.checkNotNull(objH5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                objH1 = h1((b4) objH5, f42288e, g0Var);
                break;
            case 5:
                Object objH6 = eVar.h();
                Intrinsics.checkNotNull(objH6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                objH1 = h1((b0.b) objH6, f42289f, g0Var);
                break;
            case 6:
                Object objH7 = eVar.h();
                Intrinsics.checkNotNull(objH7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                objH1 = h1((b0.a) objH7, f42290g, g0Var);
                break;
            case 7:
                Object objH8 = eVar.h();
                Intrinsics.checkNotNull(objH8, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                objH1 = g1(((f3) objH8).h());
                break;
            default:
                throw new kotlin.k0();
        }
        return CollectionsKt.arrayListOf(g1(oVar), objH1, g1(Integer.valueOf(eVar.i())), g1(Integer.valueOf(eVar.g())), g1(eVar.j()));
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.s, Object> W0(@NotNull androidx.compose.ui.text.style.s.a aVar) {
        return f42296m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f.e X(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        t0 t0VarB = null;
        aVarB = null;
        b0.a aVarB = null;
        bVarB = null;
        b0.b bVarB = null;
        b4VarB = null;
        b4 b4VarB = null;
        c4VarB = null;
        c4 c4VarB = null;
        c3VarB = null;
        c3 c3VarB = null;
        t0VarB = null;
        o oVar = obj2 != null ? (o) obj2 : null;
        Intrinsics.checkNotNull(oVar);
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        Intrinsics.checkNotNull(str);
        switch (d.f42311a[oVar.ordinal()]) {
            case 1:
                Object obj6 = list.get(1);
                androidx.compose.runtime.saveable.c0<t0, Object> c0Var = f42291h;
                if ((!Intrinsics.areEqual(obj6, Boolean.FALSE) || (c0Var instanceof m0)) && obj6 != null) {
                    t0VarB = c0Var.b(obj6);
                }
                Intrinsics.checkNotNull(t0VarB);
                return new f.e(t0VarB, iIntValue, iIntValue2, str);
            case 2:
                Object obj7 = list.get(1);
                androidx.compose.runtime.saveable.c0<c3, Object> c0Var2 = f42292i;
                if ((!Intrinsics.areEqual(obj7, Boolean.FALSE) || (c0Var2 instanceof m0)) && obj7 != null) {
                    c3VarB = c0Var2.b(obj7);
                }
                Intrinsics.checkNotNull(c3VarB);
                return new f.e(c3VarB, iIntValue, iIntValue2, str);
            case 3:
                Object obj8 = list.get(1);
                androidx.compose.runtime.saveable.c0<c4, Object> c0Var3 = f42287d;
                if ((!Intrinsics.areEqual(obj8, Boolean.FALSE) || (c0Var3 instanceof m0)) && obj8 != null) {
                    c4VarB = c0Var3.b(obj8);
                }
                Intrinsics.checkNotNull(c4VarB);
                return new f.e(c4VarB, iIntValue, iIntValue2, str);
            case 4:
                Object obj9 = list.get(1);
                androidx.compose.runtime.saveable.c0<b4, Object> c0Var4 = f42288e;
                if ((!Intrinsics.areEqual(obj9, Boolean.FALSE) || (c0Var4 instanceof m0)) && obj9 != null) {
                    b4VarB = c0Var4.b(obj9);
                }
                Intrinsics.checkNotNull(b4VarB);
                return new f.e(b4VarB, iIntValue, iIntValue2, str);
            case 5:
                Object obj10 = list.get(1);
                androidx.compose.runtime.saveable.c0<b0.b, Object> c0Var5 = f42289f;
                if ((!Intrinsics.areEqual(obj10, Boolean.FALSE) || (c0Var5 instanceof m0)) && obj10 != null) {
                    bVarB = c0Var5.b(obj10);
                }
                Intrinsics.checkNotNull(bVarB);
                return new f.e(bVarB, iIntValue, iIntValue2, str);
            case 6:
                Object obj11 = list.get(1);
                androidx.compose.runtime.saveable.c0<b0.a, Object> c0Var6 = f42290g;
                if ((!Intrinsics.areEqual(obj11, Boolean.FALSE) || (c0Var6 instanceof m0)) && obj11 != null) {
                    aVarB = c0Var6.b(obj11);
                }
                Intrinsics.checkNotNull(aVarB);
                return new f.e(aVarB, iIntValue, iIntValue2, str);
            case 7:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                Intrinsics.checkNotNull(str2);
                return new f.e(f3.a(f3.b(str2)), iIntValue, iIntValue2, str);
            default:
                throw new kotlin.k0();
        }
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.unit.z, Object> X0(@NotNull androidx.compose.ui.unit.z.a aVar) {
        return f42302s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Y(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.text.style.a aVar) {
        return Float.valueOf(aVar.k());
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<n0.g, Object> Y0(@NotNull n0.g.a aVar) {
        return f42303t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.style.a Z(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
        return androidx.compose.ui.text.style.a.d(androidx.compose.ui.text.style.a.e(((Float) obj).floatValue()));
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<y0.e, Object> Z0(@NotNull y0.e.a aVar) {
        return f42305v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a0(androidx.compose.runtime.saveable.g0 g0Var, b0.a aVar) {
        return CollectionsKt.arrayListOf(g1(aVar.e()), h1(aVar.b(), f42293j, g0Var));
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<y0.f, Object> a1(@NotNull y0.f.a aVar) {
        return f42304u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0.a b0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        String str = obj2 != null ? (String) obj2 : null;
        Intrinsics.checkNotNull(str);
        Object obj3 = list.get(1);
        androidx.compose.runtime.saveable.c0<q3, Object> c0Var = f42293j;
        return new b0.a(str, ((!Intrinsics.areEqual(obj3, Boolean.FALSE) || (c0Var instanceof m0)) && obj3 != null) ? c0Var.b(obj3) : null, null);
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<c3, Object> b1() {
        return f42292i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c0(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.text.font.v0 v0Var) {
        return Integer.valueOf(v0Var.O());
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<q3, Object> c1() {
        return f42293j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.font.v0 d0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return new androidx.compose.ui.text.font.v0(((Integer) obj).intValue());
    }

    private static /* synthetic */ void d1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e0(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.text.style.h hVar) {
        return CollectionsKt.arrayListOf(g1(androidx.compose.ui.text.style.h.a.e(hVar.d())), g1(androidx.compose.ui.text.style.h.d.e(hVar.f())), g1(androidx.compose.ui.text.style.h.c.c(hVar.e())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result e1(Object obj) {
        if (obj == 0) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(1, "Result");
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.style.h f0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        androidx.compose.ui.text.style.h.a aVar = obj2 != null ? (androidx.compose.ui.text.style.h.a) obj2 : null;
        Intrinsics.checkNotNull(aVar);
        float fK = aVar.k();
        Object obj3 = list.get(1);
        androidx.compose.ui.text.style.h.d dVar = obj3 != null ? (androidx.compose.ui.text.style.h.d) obj3 : null;
        Intrinsics.checkNotNull(dVar);
        int iM = dVar.m();
        Object obj4 = list.get(2);
        androidx.compose.ui.text.style.h.c cVar = obj4 != null ? (androidx.compose.ui.text.style.h.c) obj4 : null;
        Intrinsics.checkNotNull(cVar);
        return new androidx.compose.ui.text.style.h(fK, iM, cVar.i(), null);
    }

    public static final /* synthetic */ <T extends androidx.compose.runtime.saveable.c0<Original, Saveable>, Original, Saveable, Result> Result f1(Saveable saveable, T t10) {
        if ((!Intrinsics.areEqual(saveable, Boolean.FALSE) || (t10 instanceof m0)) && saveable != null) {
            Result result = (Result) t10.b(saveable);
            Intrinsics.reifiedOperationMarker(1, "Result");
            return result;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g0(androidx.compose.runtime.saveable.g0 g0Var, b0.b bVar) {
        return CollectionsKt.arrayListOf(g1(bVar.e()), h1(bVar.b(), f42293j, g0Var));
    }

    @Nullable
    public static final <T> T g1(@Nullable T t10) {
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0.b h0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        q3 q3VarB = null;
        String str = obj2 != null ? (String) obj2 : null;
        Intrinsics.checkNotNull(str);
        Object obj3 = list.get(1);
        androidx.compose.runtime.saveable.c0<q3, Object> c0Var = f42293j;
        if ((!Intrinsics.areEqual(obj3, Boolean.FALSE) || (c0Var instanceof m0)) && obj3 != null) {
            q3VarB = c0Var.b(obj3);
        }
        return new b0.b(str, q3VarB, null, 4, null);
    }

    @NotNull
    public static final <T extends androidx.compose.runtime.saveable.c0<Original, Saveable>, Original, Saveable> Object h1(@Nullable Original original, @NotNull T t10, @NotNull androidx.compose.runtime.saveable.g0 g0Var) {
        Object objA;
        if (original != null && (objA = t10.a(g0Var, original)) != null) {
            return objA;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i0(androidx.compose.runtime.saveable.g0 g0Var, y0.f fVar) {
        List<y0.e> listL = fVar.l();
        ArrayList arrayList = new ArrayList(listL.size());
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(h1(listL.get(i10), Z0(y0.e.f390671b), g0Var));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0.f j0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            androidx.compose.runtime.saveable.c0<y0.e, Object> c0VarZ0 = Z0(y0.e.f390671b);
            y0.e eVarB = null;
            if ((!Intrinsics.areEqual(obj2, Boolean.FALSE) || (c0VarZ0 instanceof m0)) && obj2 != null) {
                eVarB = c0VarZ0.b(obj2);
            }
            Intrinsics.checkNotNull(eVarB);
            arrayList.add(eVarB);
        }
        return new y0.f(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k0(androidx.compose.runtime.saveable.g0 g0Var, y0.e eVar) {
        return eVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0.e l0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        return new y0.e((String) obj);
    }

    private static final <Original, Saveable> m0<Original, Saveable> m0(Function2<? super androidx.compose.runtime.saveable.g0, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
        return new c(function2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object n0(androidx.compose.runtime.saveable.g0 g0Var, n0.g gVar) {
        return gVar == null ? false : n0.g.l(gVar.B(), n0.g.f332700b.c()) ? Boolean.FALSE : CollectionsKt.arrayListOf(g1(Float.valueOf(Float.intBitsToFloat((int) (gVar.B() >> 32)))), g1(Float.valueOf(Float.intBitsToFloat((int) (gVar.B() & com.rabbitmq.client.k0.f265952a)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.g o0(Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
            return n0.g.d(n0.g.f332700b.c());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f10 = obj2 != null ? (Float) obj2 : null;
        Intrinsics.checkNotNull(f10);
        float fFloatValue = f10.floatValue();
        Object obj3 = list.get(1);
        Float f11 = obj3 != null ? (Float) obj3 : null;
        Intrinsics.checkNotNull(f11);
        return n0.g.d(n0.g.g((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f11.floatValue())) & com.rabbitmq.client.k0.f265952a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p0(androidx.compose.runtime.saveable.g0 g0Var, t0 t0Var) {
        return CollectionsKt.arrayListOf(g1(androidx.compose.ui.text.style.j.h(t0Var.v())), g1(androidx.compose.ui.text.style.l.g(t0Var.y())), h1(androidx.compose.ui.unit.z.c(t0Var.q()), X0(androidx.compose.ui.unit.z.f42728b), g0Var), h1(t0Var.z(), W0(androidx.compose.ui.text.style.s.f42240c), g0Var), h1(t0Var.s(), b3.m(x0.f42336c), g0Var), h1(t0Var.r(), T0(androidx.compose.ui.text.style.h.f42178d), g0Var), h1(androidx.compose.ui.text.style.f.e(t0Var.p()), b3.n(androidx.compose.ui.text.style.f.f42154b), g0Var), g1(androidx.compose.ui.text.style.e.d(t0Var.m())), h1(t0Var.A(), b3.o(androidx.compose.ui.text.style.u.f42245c), g0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 q0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        androidx.compose.ui.text.style.u uVarB = null;
        androidx.compose.ui.text.style.j jVar = obj2 != null ? (androidx.compose.ui.text.style.j) obj2 : null;
        Intrinsics.checkNotNull(jVar);
        int iN = jVar.n();
        Object obj3 = list.get(1);
        androidx.compose.ui.text.style.l lVar = obj3 != null ? (androidx.compose.ui.text.style.l) obj3 : null;
        Intrinsics.checkNotNull(lVar);
        int iM = lVar.m();
        Object obj4 = list.get(2);
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.unit.z, Object> c0VarX0 = X0(androidx.compose.ui.unit.z.f42728b);
        Boolean bool = Boolean.FALSE;
        androidx.compose.ui.unit.z zVarB = ((!Intrinsics.areEqual(obj4, bool) || (c0VarX0 instanceof m0)) && obj4 != null) ? c0VarX0.b(obj4) : null;
        Intrinsics.checkNotNull(zVarB);
        long jW = zVarB.w();
        Object obj5 = list.get(3);
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.s, Object> c0VarW0 = W0(androidx.compose.ui.text.style.s.f42240c);
        androidx.compose.ui.text.style.s sVarB = ((!Intrinsics.areEqual(obj5, bool) || (c0VarW0 instanceof m0)) && obj5 != null) ? c0VarW0.b(obj5) : null;
        Object obj6 = list.get(4);
        androidx.compose.runtime.saveable.c0<x0, Object> c0VarM = b3.m(x0.f42336c);
        x0 x0VarB = ((!Intrinsics.areEqual(obj6, bool) || (c0VarM instanceof m0)) && obj6 != null) ? c0VarM.b(obj6) : null;
        Object obj7 = list.get(5);
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.h, Object> c0VarT0 = T0(androidx.compose.ui.text.style.h.f42178d);
        androidx.compose.ui.text.style.h hVarB = ((!Intrinsics.areEqual(obj7, bool) || (c0VarT0 instanceof m0)) && obj7 != null) ? c0VarT0.b(obj7) : null;
        Object obj8 = list.get(6);
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.f, Object> c0VarN = b3.n(androidx.compose.ui.text.style.f.f42154b);
        androidx.compose.ui.text.style.f fVarB = ((!Intrinsics.areEqual(obj8, bool) || (c0VarN instanceof m0)) && obj8 != null) ? c0VarN.b(obj8) : null;
        Intrinsics.checkNotNull(fVarB);
        int iQ = fVarB.q();
        int i10 = 3 | 7;
        Object obj9 = list.get(7);
        androidx.compose.ui.text.style.e eVar = obj9 != null ? (androidx.compose.ui.text.style.e) obj9 : null;
        Intrinsics.checkNotNull(eVar);
        int iJ = eVar.j();
        Object obj10 = list.get(8);
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.u, Object> c0VarO = b3.o(androidx.compose.ui.text.style.u.f42245c);
        if ((!Intrinsics.areEqual(obj10, bool) || (c0VarO instanceof m0)) && obj10 != null) {
            uVarB = c0VarO.b(obj10);
        }
        return new t0(iN, iM, jW, sVarB, x0VarB, hVarB, iQ, iJ, uVarB, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r0(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.graphics.o3 o3Var) {
        return CollectionsKt.arrayListOf(h1(androidx.compose.ui.graphics.q0.n(o3Var.f()), O0(androidx.compose.ui.graphics.q0.f38131b), g0Var), h1(n0.g.d(o3Var.h()), Y0(n0.g.f332700b), g0Var), g1(Float.valueOf(o3Var.d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.graphics.o3 s0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.graphics.q0, Object> c0VarO0 = O0(androidx.compose.ui.graphics.q0.f38131b);
        Boolean bool = Boolean.FALSE;
        androidx.compose.ui.graphics.q0 q0VarB = ((!Intrinsics.areEqual(obj2, bool) || (c0VarO0 instanceof m0)) && obj2 != null) ? c0VarO0.b(obj2) : null;
        Intrinsics.checkNotNull(q0VarB);
        long jM = q0VarB.M();
        Object obj3 = list.get(1);
        androidx.compose.runtime.saveable.c0<n0.g, Object> c0VarY0 = Y0(n0.g.f332700b);
        n0.g gVarB = ((!Intrinsics.areEqual(obj3, bool) || (c0VarY0 instanceof m0)) && obj3 != null) ? c0VarY0.b(obj3) : null;
        Intrinsics.checkNotNull(gVarB);
        long jB = gVarB.B();
        Object obj4 = list.get(2);
        Float f10 = obj4 != null ? (Float) obj4 : null;
        Intrinsics.checkNotNull(f10);
        return new androidx.compose.ui.graphics.o3(jM, jB, f10.floatValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t0(androidx.compose.runtime.saveable.g0 g0Var, c3 c3Var) {
        androidx.compose.ui.graphics.q0 q0VarN = androidx.compose.ui.graphics.q0.n(c3Var.m());
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        Object objH1 = h1(q0VarN, O0(aVar), g0Var);
        androidx.compose.ui.unit.z zVarC = androidx.compose.ui.unit.z.c(c3Var.q());
        androidx.compose.ui.unit.z.a aVar2 = androidx.compose.ui.unit.z.f42728b;
        return CollectionsKt.arrayListOf(objH1, h1(zVarC, X0(aVar2), g0Var), h1(c3Var.t(), R0(androidx.compose.ui.text.font.v0.f41742b), g0Var), g1(c3Var.r()), g1(c3Var.s()), g1(-1), g1(c3Var.p()), h1(androidx.compose.ui.unit.z.c(c3Var.u()), X0(aVar2), g0Var), h1(c3Var.k(), S0(androidx.compose.ui.text.style.a.f42141b), g0Var), h1(c3Var.A(), V0(androidx.compose.ui.text.style.q.f42235c), g0Var), h1(c3Var.v(), a1(y0.f.f390674c), g0Var), h1(androidx.compose.ui.graphics.q0.n(c3Var.j()), O0(aVar), g0Var), h1(c3Var.y(), U0(androidx.compose.ui.text.style.k.f42215b), g0Var), h1(c3Var.x(), P0(androidx.compose.ui.graphics.o3.f38091d), g0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 androidx.compose.ui.text.c3, still in use, count: 2, list:
          (r1v1 androidx.compose.ui.text.c3) from 0x00d9: MOVE (r16v2 androidx.compose.ui.text.c3) = (r1v1 androidx.compose.ui.text.c3)
          (r1v1 androidx.compose.ui.text.c3) from 0x00d1: MOVE (r16v7 androidx.compose.ui.text.c3) = (r1v1 androidx.compose.ui.text.c3)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final androidx.compose.ui.text.c3 u0(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.u2.u0(java.lang.Object):androidx.compose.ui.text.c3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object v0(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.text.style.k kVar) {
        return Integer.valueOf(kVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.style.k w0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return new androidx.compose.ui.text.style.k(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object x0(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.text.style.q qVar) {
        return CollectionsKt.arrayListOf(Float.valueOf(qVar.d()), Float.valueOf(qVar.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.style.q y0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        List list = (List) obj;
        return new androidx.compose.ui.text.style.q(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object z0(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.text.style.s sVar) {
        androidx.compose.ui.unit.z zVarC = androidx.compose.ui.unit.z.c(sVar.d());
        androidx.compose.ui.unit.z.a aVar = androidx.compose.ui.unit.z.f42728b;
        return CollectionsKt.arrayListOf(h1(zVarC, X0(aVar), g0Var), h1(androidx.compose.ui.unit.z.c(sVar.e()), X0(aVar), g0Var));
    }
}
