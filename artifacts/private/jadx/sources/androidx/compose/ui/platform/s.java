package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 IntList.kt\nandroidx/collection/IntList\n+ 13 IntList.kt\nandroidx/collection/IntListKt\n+ 14 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 15 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 16 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 17 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 18 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 19 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 20 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 21 IntSet.kt\nandroidx/collection/IntSet\n+ 22 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n1#1,3354:1\n111#2,2:3355\n65#2:3394\n69#2:3397\n65#2:3400\n69#2:3403\n65#2:3506\n69#2:3509\n65#2:3512\n69#2:3515\n397#3,3:3357\n354#3,6:3360\n364#3,3:3367\n367#3,9:3371\n400#3:3380\n425#3:3409\n382#3,4:3594\n354#3,6:3598\n364#3,3:3605\n367#3,9:3609\n386#3:3618\n390#3,3:3619\n354#3,6:3622\n364#3,3:3629\n367#3,2:3633\n370#3,6:3674\n393#3:3680\n425#3:3684\n425#3:3715\n1399#4:3366\n1270#4:3370\n1399#4:3421\n1270#4:3425\n1399#4:3483\n1270#4:3487\n1399#4:3579\n1270#4:3583\n1399#4:3604\n1270#4:3608\n1399#4:3628\n1270#4:3632\n1399#4:3650\n1270#4:3654\n1399#4:3697\n1270#4:3701\n78#5,5:3381\n78#5,5:3635\n30#6:3386\n30#6:3390\n30#6:3498\n30#6:3502\n30#6:3547\n53#7,3:3387\n53#7,3:3391\n60#7:3395\n70#7:3398\n60#7:3401\n70#7:3404\n60#7:3461\n70#7:3464\n53#7,3:3499\n53#7,3:3503\n60#7:3507\n70#7:3510\n60#7:3513\n70#7:3516\n60#7:3519\n70#7:3522\n60#7:3525\n70#7:3528\n60#7:3531\n70#7:3534\n60#7:3537\n70#7:3540\n53#7,3:3548\n22#8:3396\n22#8:3399\n22#8:3402\n22#8:3405\n22#8:3462\n22#8:3465\n22#8:3508\n22#8:3511\n22#8:3514\n22#8:3517\n22#8:3520\n22#8:3523\n22#8:3526\n22#8:3529\n22#8:3532\n22#8:3535\n22#8:3538\n22#8:3541\n35#9,3:3406\n39#9:3410\n35#9,3:3445\n39#9:3449\n71#9,5:3450\n71#9,5:3455\n35#9,5:3466\n35#9,5:3657\n35#9,5:3662\n35#9,3:3681\n39#9:3685\n35#9,3:3712\n39#9:3716\n231#10,3:3411\n200#10,7:3414\n211#10,3:3422\n214#10,2:3426\n217#10,6:3429\n234#10:3435\n231#10,3:3473\n200#10,7:3476\n211#10,3:3484\n214#10,9:3488\n234#10:3497\n1#11:3428\n65#12:3436\n65#12:3437\n237#12,6:3439\n905#13:3438\n438#14:3448\n57#15:3460\n61#15:3463\n37#16,2:3471\n48#17:3518\n53#17:3521\n48#17:3524\n53#17:3527\n48#17:3530\n53#17:3533\n48#17:3536\n53#17:3539\n36#18,5:3542\n90#19:3551\n90#19:3552\n27#20,5:3553\n27#20,5:3558\n27#20,5:3563\n27#20,5:3717\n27#20,5:3722\n255#21,4:3568\n225#21,7:3572\n236#21,3:3580\n239#21,9:3584\n259#21:3593\n255#21,4:3686\n225#21,7:3690\n236#21,3:3698\n239#21,9:3702\n259#21:3711\n357#22,4:3640\n329#22,6:3644\n339#22,3:3651\n342#22,2:3655\n345#22,6:3667\n361#22:3673\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n436#1:3355,2\n559#1:3394\n560#1:3397\n561#1:3400\n562#1:3403\n1869#1:3506\n1870#1:3509\n1871#1:3512\n1872#1:3515\n445#1:3357,3\n445#1:3360,6\n445#1:3367,3\n445#1:3371,9\n445#1:3380\n622#1:3409\n2267#1:3594,4\n2267#1:3598,6\n2267#1:3605,3\n2267#1:3609,9\n2267#1:3618\n2290#1:3619,3\n2290#1:3622,6\n2290#1:3629,3\n2290#1:3633,2\n2290#1:3674,6\n2290#1:3680\n2758#1:3684\n2777#1:3715\n445#1:3366\n445#1:3370\n888#1:3421\n888#1:3425\n1830#1:3483\n1830#1:3487\n2249#1:3579\n2249#1:3583\n2267#1:3604\n2267#1:3608\n2290#1:3628\n2290#1:3632\n2301#1:3650\n2301#1:3654\n2768#1:3697\n2768#1:3701\n515#1:3381,5\n2295#1:3635,5\n553#1:3386\n555#1:3390\n1863#1:3498\n1865#1:3502\n1976#1:3547\n553#1:3387,3\n555#1:3391,3\n559#1:3395\n560#1:3398\n561#1:3401\n562#1:3404\n1477#1:3461\n1512#1:3464\n1863#1:3499,3\n1865#1:3503,3\n1869#1:3507\n1870#1:3510\n1871#1:3513\n1872#1:3516\n1892#1:3519\n1893#1:3522\n1894#1:3525\n1895#1:3528\n1896#1:3531\n1897#1:3534\n1898#1:3537\n1899#1:3540\n1976#1:3548,3\n559#1:3396\n560#1:3399\n561#1:3402\n562#1:3405\n1477#1:3462\n1512#1:3465\n1869#1:3508\n1870#1:3511\n1871#1:3514\n1872#1:3517\n1892#1:3520\n1893#1:3523\n1894#1:3526\n1895#1:3529\n1896#1:3532\n1897#1:3535\n1898#1:3538\n1899#1:3541\n621#1:3406,3\n621#1:3410\n1054#1:3445,3\n1054#1:3449\n1065#1:3450,5\n1072#1:3455,5\n1712#1:3466,5\n2576#1:3657,5\n2578#1:3662,5\n2757#1:3681,3\n2757#1:3685\n2775#1:3712,3\n2775#1:3716\n888#1:3411,3\n888#1:3414,7\n888#1:3422,3\n888#1:3426,2\n888#1:3429,6\n888#1:3435\n1830#1:3473,3\n1830#1:3476,7\n1830#1:3484,3\n1830#1:3488,9\n1830#1:3497\n1034#1:3436\n1037#1:3437\n1051#1:3439,6\n1050#1:3438\n1055#1:3448\n1477#1:3460\n1512#1:3463\n1774#1:3471,2\n1892#1:3518\n1893#1:3521\n1894#1:3524\n1895#1:3527\n1896#1:3530\n1897#1:3533\n1898#1:3536\n1899#1:3539\n1906#1:3542,5\n1991#1:3551\n2205#1:3552\n2231#1:3553,5\n2240#1:3558,5\n2243#1:3563,5\n2071#1:3717,5\n2072#1:3722,5\n2249#1:3568,4\n2249#1:3572,7\n2249#1:3580,3\n2249#1:3584,9\n2249#1:3593\n2768#1:3686,4\n2768#1:3690,7\n2768#1:3698,3\n2768#1:3702,9\n2768#1:3711\n2301#1:3640,4\n2301#1:3644,6\n2301#1:3651,3\n2301#1:3655,2\n2301#1:3667,6\n2301#1:3673\n*E\n"})
public final class s extends androidx.core.view.a {
    public static final int R = Integer.MIN_VALUE;

    @NotNull
    public static final String S = "android.view.View";

    @NotNull
    public static final String T = "android.widget.EditText";

    @NotNull
    public static final String U = "android.widget.TextView";

    @NotNull
    public static final String V = "AccessibilityDelegate";

    @NotNull
    public static final String W = "androidx.compose.ui.semantics.testTag";

    @NotNull
    public static final String X = "androidx.compose.ui.semantics.id";

    @NotNull
    public static final String Y = "androidx.compose.ui.semantics.shapeType";
    public static final int Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f40820a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f40821b0 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final String f40822c0 = "androidx.compose.ui.semantics.shapeRect";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final String f40823d0 = "androidx.compose.ui.semantics.shapeCorners";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final String f40824e0 = "androidx.compose.ui.semantics.shapeRegion";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f40825f0 = 100000;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f40826g0 = -1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f40827h0 = 20;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final long f40828i0 = 1000;

    @Nullable
    private f A;

    @NotNull
    private androidx.collection.j0<androidx.compose.ui.semantics.w> B;

    @NotNull
    private androidx.collection.u1 C;

    @NotNull
    private androidx.collection.q1 D;

    @NotNull
    private androidx.collection.q1 E;

    @NotNull
    private final String F;

    @NotNull
    private final String G;

    @NotNull
    private final androidx.compose.ui.text.platform.e0 H;

    @NotNull
    private androidx.collection.t1<w3> I;

    @NotNull
    private w3 J;
    private boolean K;

    @NotNull
    private final androidx.collection.q1 L;

    @NotNull
    private final Runnable M;

    @NotNull
    private final List<v3> N;

    @NotNull
    private final Function1<v3, Unit> O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40831b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Function1<? super AccessibilityEvent, Boolean> f40832c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AccessibilityManager f40833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f40835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final AccessibilityManager.AccessibilityStateChangeListener f40836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final AccessibilityManager.TouchExplorationStateChangeListener f40837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<AccessibilityServiceInfo> f40838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Boolean f40839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Handler f40840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private e f40841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f40842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f40843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private androidx.core.view.accessibility.j f40844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private androidx.core.view.accessibility.j f40845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f40846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final androidx.collection.t1<androidx.compose.ui.semantics.l> f40847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.collection.t1<androidx.compose.ui.semantics.l> f40848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private androidx.collection.j3<androidx.collection.j3<CharSequence>> f40849t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private androidx.collection.j3<androidx.collection.f2<CharSequence>> f40850u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f40851v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Integer f40852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final androidx.collection.c<androidx.compose.ui.node.l0> f40853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<Unit> f40854y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f40855z;

    @NotNull
    public static final d P = new d(null);
    public static final int Q = 8;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.f0 f40829j0 = androidx.collection.g0.h(androidx.compose.ui.d0.b.f37123a, androidx.compose.ui.d0.b.f37124b, androidx.compose.ui.d0.b.f37135m, androidx.compose.ui.d0.b.f37146x, androidx.compose.ui.d0.b.A, androidx.compose.ui.d0.b.B, androidx.compose.ui.d0.b.C, androidx.compose.ui.d0.b.D, androidx.compose.ui.d0.b.E, androidx.compose.ui.d0.b.F, androidx.compose.ui.d0.b.f37125c, androidx.compose.ui.d0.b.f37126d, androidx.compose.ui.d0.b.f37127e, androidx.compose.ui.d0.b.f37128f, androidx.compose.ui.d0.b.f37129g, androidx.compose.ui.d0.b.f37130h, androidx.compose.ui.d0.b.f37131i, androidx.compose.ui.d0.b.f37132j, androidx.compose.ui.d0.b.f37133k, androidx.compose.ui.d0.b.f37134l, androidx.compose.ui.d0.b.f37136n, androidx.compose.ui.d0.b.f37137o, androidx.compose.ui.d0.b.f37138p, androidx.compose.ui.d0.b.f37139q, androidx.compose.ui.d0.b.f37140r, androidx.compose.ui.d0.b.f37141s, androidx.compose.ui.d0.b.f37142t, androidx.compose.ui.d0.b.f37143u, androidx.compose.ui.d0.b.f37144v, androidx.compose.ui.d0.b.f37145w, androidx.compose.ui.d0.b.f37147y, androidx.compose.ui.d0.b.f37148z);

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = s.this.f40833d;
            s sVar = s.this;
            sVar.f40838i = sVar.f40833d.getEnabledAccessibilityServiceList(-1);
            accessibilityManager.addAccessibilityStateChangeListener(sVar.f40836g);
            accessibilityManager.addTouchExplorationStateChangeListener(sVar.f40837h);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            s.this.f40840k.removeCallbacks(s.this.M);
            AccessibilityManager accessibilityManager = s.this.f40833d;
            s sVar = s.this;
            accessibilityManager.removeAccessibilityStateChangeListener(sVar.f40836g);
            accessibilityManager.removeTouchExplorationStateChangeListener(sVar.f40837h);
        }
    }

    @androidx.annotation.w0(24)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f40857a = new b();

        private b() {
        }

        @oj.n
        public static final void a(@NotNull androidx.core.view.accessibility.j jVar, @NotNull androidx.compose.ui.semantics.u uVar) {
            androidx.compose.ui.semantics.a aVar;
            if (!t.n(uVar) || (aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), androidx.compose.ui.semantics.n.f41142a.z())) == null) {
                return;
            }
            jVar.b(new androidx.core.view.accessibility.j.a(R.id.accessibilityActionSetProgress, aVar.b()));
        }
    }

    @androidx.annotation.w0(29)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f40858a = new c();

        private c() {
        }

        @oj.n
        public static final void a(@NotNull androidx.core.view.accessibility.j jVar, @NotNull androidx.compose.ui.semantics.u uVar) {
            androidx.compose.ui.semantics.j jVar2 = (androidx.compose.ui.semantics.j) androidx.compose.ui.semantics.o.a(uVar.F(), androidx.compose.ui.semantics.z.f41190a.F());
            if (t.n(uVar)) {
                if (jVar2 == null ? false : androidx.compose.ui.semantics.j.m(jVar2.p(), androidx.compose.ui.semantics.j.f41124b.b())) {
                    return;
                }
                SemanticsConfiguration semanticsConfigurationF = uVar.F();
                androidx.compose.ui.semantics.n nVar = androidx.compose.ui.semantics.n.f41142a;
                androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(semanticsConfigurationF, nVar.r());
                if (aVar != null) {
                    jVar.b(new androidx.core.view.accessibility.j.a(R.id.accessibilityActionPageUp, aVar.b()));
                }
                androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.o());
                if (aVar2 != null) {
                    jVar.b(new androidx.core.view.accessibility.j.a(R.id.accessibilityActionPageDown, aVar2.b()));
                }
                androidx.compose.ui.semantics.a aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.p());
                if (aVar3 != null) {
                    jVar.b(new androidx.core.view.accessibility.j.a(R.id.accessibilityActionPageLeft, aVar3.b()));
                }
                androidx.compose.ui.semantics.a aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.q());
                if (aVar4 != null) {
                    jVar.b(new androidx.core.view.accessibility.j.a(R.id.accessibilityActionPageRight, aVar4.b()));
                }
            }
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    private final class e extends androidx.core.view.accessibility.k {
        public e() {
        }

        @Override // androidx.core.view.accessibility.k
        public void a(int i10, @NotNull androidx.core.view.accessibility.j jVar, @NotNull String str, @Nullable Bundle bundle) {
            s.this.C(i10, jVar, str, bundle);
        }

        @Override // androidx.core.view.accessibility.k
        @Nullable
        public androidx.core.view.accessibility.j b(int i10) {
            androidx.core.view.accessibility.j jVarK = s.this.K(i10);
            s sVar = s.this;
            if (sVar.f40846q) {
                if (i10 == sVar.f40842m) {
                    sVar.f40844o = jVarK;
                }
                if (i10 == sVar.f40843n) {
                    sVar.f40845p = jVarK;
                }
            }
            return jVarK;
        }

        @Override // androidx.core.view.accessibility.k
        @Nullable
        public androidx.core.view.accessibility.j d(int i10) {
            if (i10 == 1) {
                if (s.this.f40843n == Integer.MIN_VALUE) {
                    return null;
                }
                return b(s.this.f40843n);
            }
            if (i10 == 2) {
                return b(s.this.f40842m);
            }
            throw new IllegalArgumentException("Unknown focus type: " + i10);
        }

        @Override // androidx.core.view.accessibility.k
        public boolean f(int i10, int i11, @Nullable Bundle bundle) {
            return s.this.r0(i10, i11, bundle);
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.semantics.u f40860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f40862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f40863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f40864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f40865f;

        public f(@NotNull androidx.compose.ui.semantics.u uVar, int i10, int i11, int i12, int i13, long j10) {
            this.f40860a = uVar;
            this.f40861b = i10;
            this.f40862c = i11;
            this.f40863d = i12;
            this.f40864e = i13;
            this.f40865f = j10;
        }

        public final int a() {
            return this.f40861b;
        }

        public final int b() {
            return this.f40863d;
        }

        public final int c() {
            return this.f40862c;
        }

        @NotNull
        public final androidx.compose.ui.semantics.u d() {
            return this.f40860a;
        }

        public final int e() {
            return this.f40864e;
        }

        public final long f() {
            return this.f40865f;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", i = {0, 1}, l = {2096, 2131}, m = "boundsUpdatesEventLoop$ui_release", n = {"subtreeChangedSemanticsNodesIds", "subtreeChangedSemanticsNodesIds"}, s = {"L$0", "L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f40867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40868c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40870e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40868c = obj;
            this.f40870e |= Integer.MIN_VALUE;
            return s.this.E(this);
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function1<AccessibilityEvent, Boolean> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(s.this.h0().getParent().requestSendAccessibilityEvent(s.this.h0(), accessibilityEvent));
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3 f40872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f40873b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(v3 v3Var, s sVar) {
            super(0);
            this.f40872a = v3Var;
            this.f40873b = sVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            androidx.compose.ui.semantics.u uVarB;
            androidx.compose.ui.node.l0 l0VarU;
            androidx.compose.ui.semantics.l lVarB = this.f40872a.b();
            androidx.compose.ui.semantics.l lVarF = this.f40872a.f();
            Float fC = this.f40872a.c();
            Float fD = this.f40872a.d();
            float fFloatValue = (lVarB == null || fC == null) ? 0.0f : lVarB.c().invoke().floatValue() - fC.floatValue();
            float fFloatValue2 = (lVarF == null || fD == null) ? 0.0f : lVarF.c().invoke().floatValue() - fD.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iB0 = this.f40873b.B0(this.f40872a.e());
                androidx.compose.ui.semantics.w wVar = (androidx.compose.ui.semantics.w) this.f40873b.T().n(this.f40873b.f40842m);
                if (wVar != null) {
                    s sVar = this.f40873b;
                    try {
                        androidx.core.view.accessibility.j jVar = sVar.f40844o;
                        if (jVar != null) {
                            jVar.e1(sVar.D(wVar));
                            Unit unit = Unit.f312394a;
                        }
                    } catch (IllegalStateException unused) {
                        Unit unit2 = Unit.f312394a;
                    }
                }
                androidx.compose.ui.semantics.w wVar2 = (androidx.compose.ui.semantics.w) this.f40873b.T().n(this.f40873b.f40843n);
                if (wVar2 != null) {
                    s sVar2 = this.f40873b;
                    try {
                        androidx.core.view.accessibility.j jVar2 = sVar2.f40845p;
                        if (jVar2 != null) {
                            jVar2.e1(sVar2.D(wVar2));
                            Unit unit3 = Unit.f312394a;
                        }
                    } catch (IllegalStateException unused2) {
                        Unit unit4 = Unit.f312394a;
                    }
                }
                this.f40873b.h0().invalidate();
                androidx.compose.ui.semantics.w wVar3 = (androidx.compose.ui.semantics.w) this.f40873b.T().n(iB0);
                if (wVar3 != null && (uVarB = wVar3.b()) != null && (l0VarU = uVarB.u()) != null) {
                    s sVar3 = this.f40873b;
                    if (lVarB != null) {
                        sVar3.f40847r.j0(iB0, lVarB);
                    }
                    if (lVarF != null) {
                        sVar3.f40848s.j0(iB0, lVarF);
                    }
                    sVar3.o0(l0VarU);
                }
            }
            if (lVarB != null) {
                this.f40872a.h(lVarB.c().invoke());
            }
            if (lVarF != null) {
                this.f40872a.i(lVarF.c().invoke());
            }
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function1<v3, Unit> {
        j() {
            super(1);
        }

        public final void c(v3 v3Var) {
            s.this.z0(v3Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(v3 v3Var) {
            c(v3Var);
            return Unit.f312394a;
        }
    }

    static final class k extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.l0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f40875a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.node.l0 l0Var) {
            SemanticsConfiguration semanticsConfigurationQ0 = l0Var.q0();
            boolean z10 = false;
            if (semanticsConfigurationQ0 != null && semanticsConfigurationQ0.v()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,3354:1\n90#2:3355\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1\n*L\n2206#1:3355\n*E\n"})
    static final class l extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.l0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f40876a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.node.l0 l0Var) {
            return Boolean.valueOf(l0Var.A0().s(androidx.compose.ui.node.m1.b(8)));
        }
    }

    public s(@NotNull AndroidComposeView androidComposeView) {
        this.f40830a = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f40833d = accessibilityManager;
        this.f40835f = 100L;
        this.f40836g = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                s.P(this.f40696a, z10);
            }
        };
        this.f40837h = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.q
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                s.b1(this.f40740a, z10);
            }
        };
        this.f40838i = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f40840k = new Handler(Looper.getMainLooper());
        this.f40841l = new e();
        this.f40842m = Integer.MIN_VALUE;
        this.f40843n = Integer.MIN_VALUE;
        this.f40847r = new androidx.collection.t1<>(0, 1, null);
        this.f40848s = new androidx.collection.t1<>(0, 1, null);
        this.f40849t = new androidx.collection.j3<>(0, 1, null);
        this.f40850u = new androidx.collection.j3<>(0, 1, null);
        this.f40851v = -1;
        this.f40853x = new androidx.collection.c<>(0, 1, null);
        this.f40854y = kotlinx.coroutines.channels.s.d(1, null, null, 6, null);
        this.f40855z = true;
        this.B = androidx.collection.k0.d();
        this.C = new androidx.collection.u1(0, 1, null);
        this.D = new androidx.collection.q1(0, 1, null);
        this.E = new androidx.collection.q1(0, 1, null);
        this.F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.H = new androidx.compose.ui.text.platform.e0();
        this.I = androidx.collection.k0.j();
        this.J = new w3(androidComposeView.getSemanticsOwner().e(), androidx.collection.k0.d());
        this.L = androidx.collection.d0.j();
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.M = new Runnable() { // from class: androidx.compose.ui.platform.r
            @Override // java.lang.Runnable
            public final void run() {
                s.A0(this.f40793a);
            }
        };
        this.N = new ArrayList();
        this.O = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(s sVar) {
        Trace.beginSection("measureAndLayout");
        try {
            androidx.compose.ui.node.x1.d(sVar.f40830a, false, 1, null);
            Unit unit = Unit.f312394a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                sVar.H();
                Trace.endSection();
                sVar.K = false;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B0(int i10) {
        if (i10 == this.f40830a.getSemanticsOwner().e().s()) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i10, androidx.core.view.accessibility.j jVar, String str, Bundle bundle) {
        androidx.compose.ui.semantics.u uVarB;
        Region regionY0;
        float[] fArrX0;
        Rect rectV0;
        androidx.compose.ui.text.p3 p3VarC;
        androidx.compose.ui.semantics.w wVarN = T().n(i10);
        if (wVarN == null || (uVarB = wVarN.b()) == null) {
            return;
        }
        String strA0 = a0(uVarB);
        if (Intrinsics.areEqual(str, this.F)) {
            int iR = this.D.r(i10, -1);
            if (iR != -1) {
                jVar.H().putInt(str, iR);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, this.G)) {
            int iR2 = this.E.r(i10, -1);
            if (iR2 != -1) {
                jVar.H().putInt(str, iR2);
                return;
            }
            return;
        }
        if (uVarB.F().i(androidx.compose.ui.semantics.n.f41142a.i()) && bundle != null && Intrinsics.areEqual(str, androidx.core.view.accessibility.j.f48522r0)) {
            int i11 = bundle.getInt(androidx.core.view.accessibility.j.f48524s0, -1);
            int i12 = bundle.getInt(androidx.core.view.accessibility.j.f48526t0, -1);
            if (i12 <= 0 || i11 < 0) {
                return;
            }
            if (i11 < (strA0 != null ? strA0.length() : Integer.MAX_VALUE) && (p3VarC = x3.c(uVarB.F())) != null) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = i11 + i13;
                    if (i14 >= p3VarC.l().n().length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(Z0(uVarB, p3VarC.d(i14)));
                    }
                }
                jVar.H().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
            return;
        }
        SemanticsConfiguration semanticsConfigurationF = uVarB.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        if (semanticsConfigurationF.i(zVar.K()) && bundle != null && Intrinsics.areEqual(str, W)) {
            String str2 = (String) androidx.compose.ui.semantics.o.a(uVarB.F(), zVar.K());
            if (str2 != null) {
                jVar.H().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, X)) {
            jVar.H().putInt(str, uVarB.s());
            return;
        }
        if (Intrinsics.areEqual(str, Y)) {
            androidx.compose.ui.graphics.q3 q3Var = (androidx.compose.ui.graphics.q3) androidx.compose.ui.semantics.o.a(uVarB.F(), zVar.I());
            if (q3Var != null) {
                androidx.compose.ui.graphics.f2 f2VarL = L(q3Var, uVarB);
                if (f2VarL instanceof androidx.compose.ui.graphics.f2.b) {
                    jVar.H().putInt(Y, 0);
                    jVar.H().putParcelable(f40822c0, V0(f2VarL));
                    return;
                } else if (f2VarL instanceof androidx.compose.ui.graphics.f2.c) {
                    jVar.H().putInt(Y, 1);
                    jVar.H().putParcelable(f40822c0, V0(f2VarL));
                    jVar.H().putFloatArray(f40823d0, X0(f2VarL));
                    return;
                } else {
                    if (!(f2VarL instanceof androidx.compose.ui.graphics.f2.a)) {
                        throw new kotlin.k0();
                    }
                    jVar.H().putInt(Y, 2);
                    jVar.H().putParcelable(f40824e0, Y0(f2VarL));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.areEqual(str, f40822c0)) {
            androidx.compose.ui.graphics.q3 q3Var2 = (androidx.compose.ui.graphics.q3) androidx.compose.ui.semantics.o.a(uVarB.F(), zVar.I());
            if (q3Var2 == null || (rectV0 = V0(L(q3Var2, uVarB))) == null) {
                return;
            }
            jVar.H().putParcelable(f40822c0, rectV0);
            return;
        }
        if (Intrinsics.areEqual(str, f40823d0)) {
            androidx.compose.ui.graphics.q3 q3Var3 = (androidx.compose.ui.graphics.q3) androidx.compose.ui.semantics.o.a(uVarB.F(), zVar.I());
            if (q3Var3 == null || (fArrX0 = X0(L(q3Var3, uVarB))) == null) {
                return;
            }
            jVar.H().putFloatArray(f40823d0, fArrX0);
            return;
        }
        if (Intrinsics.areEqual(str, f40824e0)) {
            androidx.compose.ui.graphics.q3 q3Var4 = (androidx.compose.ui.graphics.q3) androidx.compose.ui.semantics.o.a(uVarB.F(), zVar.I());
            if (q3Var4 == null || (regionY0 = Y0(L(q3Var4, uVarB))) == null) {
                return;
            }
            jVar.H().putParcelable(f40824e0, regionY0);
            return;
        }
        androidx.collection.c3<androidx.compose.ui.semantics.d0<?>> c3VarN = uVarB.F().n();
        if (c3VarN == null) {
            return;
        }
        Object[] objArr = c3VarN.f12171b;
        long[] jArr = c3VarN.f12170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j10 = jArr[i15];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j10) < 128) {
                        androidx.compose.ui.semantics.d0 d0Var = (androidx.compose.ui.semantics.d0) objArr[(i15 << 3) + i17];
                        String strA = d0Var.a();
                        if (Intrinsics.areEqual(strA, str)) {
                            Object objA = androidx.compose.ui.semantics.o.a(uVarB.F(), d0Var);
                            if (objA instanceof Serializable) {
                                jVar.H().putSerializable(strA, (Serializable) objA);
                            } else {
                                if (!(objA instanceof Parcelable)) {
                                    throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                jVar.H().putParcelable(strA, (Parcelable) objA);
                            }
                        } else {
                            continue;
                        }
                    }
                    j10 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[LOOP:1: B:15:0x0057->B:28:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x009c A[EDGE_INSN: B:44:0x009c->B:29:0x009c BREAK  A[LOOP:1: B:15:0x0057->B:28:0x0099], SYNTHETIC] */
    private final void C0(androidx.compose.ui.semantics.u uVar, w3 w3Var) {
        androidx.collection.u1 u1VarK = androidx.collection.m0.k();
        List<androidx.compose.ui.semantics.u> listB = uVar.B();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.semantics.u uVar2 = listB.get(i10);
            if (T().e(uVar2.s())) {
                if (!w3Var.a().d(uVar2.s())) {
                    o0(uVar.u());
                    return;
                }
                u1VarK.G(uVar2.s());
            }
        }
        androidx.collection.u1 u1VarA = w3Var.a();
        int[] iArr = u1VarA.f12340b;
        long[] jArr = u1VarA.f12339a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128 && !u1VarK.d(iArr[(i11 << 3) + i13])) {
                            o0(uVar.u());
                            return;
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        List<androidx.compose.ui.semantics.u> listB2 = uVar.B();
        int size2 = listB2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            androidx.compose.ui.semantics.u uVar3 = listB2.get(i14);
            w3 w3VarN = this.I.n(uVar3.s());
            if (w3VarN != null && T().e(uVar3.s())) {
                C0(uVar3, w3VarN);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect D(androidx.compose.ui.semantics.w wVar) {
        androidx.compose.ui.unit.s sVarA = wVar.a();
        AndroidComposeView androidComposeView = this.f40830a;
        float fT = sVarA.t();
        long jK = androidComposeView.K(n0.g.g((((long) Float.floatToRawIntBits(sVarA.B())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fT) << 32)));
        long jK2 = this.f40830a.K(n0.g.g((((long) Float.floatToRawIntBits(sVarA.x())) << 32) | (((long) Float.floatToRawIntBits(sVarA.j())) & com.rabbitmq.client.k0.f265952a)));
        int i10 = (int) (jK >> 32);
        int i11 = (int) (jK2 >> 32);
        int iFloor = (int) Math.floor(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
        int i12 = (int) (jK & com.rabbitmq.client.k0.f265952a);
        float fIntBitsToFloat = Float.intBitsToFloat(i12);
        int i13 = (int) (jK2 & com.rabbitmq.client.k0.f265952a);
        return new Rect(iFloor, (int) Math.floor(Math.min(fIntBitsToFloat, Float.intBitsToFloat(i13))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))));
    }

    private final boolean D0(AccessibilityEvent accessibilityEvent) {
        if (!l0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f40846q = true;
        }
        try {
            boolean zBooleanValue = this.f40832c.invoke(accessibilityEvent).booleanValue();
            this.f40846q = false;
            return zBooleanValue;
        } catch (Throwable th2) {
            this.f40846q = false;
            throw th2;
        }
    }

    private final boolean E0(int i10, int i11, Integer num, List<String> list) {
        if (i10 == Integer.MIN_VALUE || !l0()) {
            return false;
        }
        AccessibilityEvent accessibilityEventJ = J(i10, i11);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(androidx.compose.ui.util.d.r(list, ",", null, null, 0, null, null, 62, null));
        }
        return D0(accessibilityEventJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean F0(s sVar, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return sVar.E0(i10, i11, num, list);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    private final boolean G(androidx.collection.j0<androidx.compose.ui.semantics.w> j0Var, boolean z10, int i10, long j10) {
        androidx.compose.ui.semantics.d0<androidx.compose.ui.semantics.l> d0VarL;
        androidx.compose.ui.semantics.l lVar;
        if (n0.g.l(j10, n0.g.f332700b.c()) || (((9223372034707292159L & j10) + n0.d.f332694i) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z10) {
            d0VarL = androidx.compose.ui.semantics.z.f41190a.Q();
        } else {
            if (z10) {
                throw new kotlin.k0();
            }
            d0VarL = androidx.compose.ui.semantics.z.f41190a.l();
        }
        Object[] objArr = j0Var.f12303c;
        long[] jArr = j0Var.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((j11 & 255) < 128) {
                        androidx.compose.ui.semantics.w wVar = (androidx.compose.ui.semantics.w) objArr[(i11 << 3) + i13];
                        if (androidx.compose.ui.unit.t.f(wVar.a()).f(j10) && (lVar = (androidx.compose.ui.semantics.l) androidx.compose.ui.semantics.o.a(wVar.b().F(), d0VarL)) != null) {
                            int i14 = lVar.b() ? -i10 : i10;
                            if (i10 == 0 && lVar.b()) {
                                i14 = -1;
                            }
                            if (i14 < 0) {
                                if (lVar.c().invoke().floatValue() > 0.0f) {
                                    z11 = true;
                                }
                            } else if (lVar.c().invoke().floatValue() < lVar.a().invoke().floatValue()) {
                                z11 = true;
                            }
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return z11;
                }
            }
            if (i11 == length) {
                return z11;
            }
            i11++;
        }
    }

    private final void G0(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventJ = J(B0(i10), 32);
        accessibilityEventJ.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        D0(accessibilityEventJ);
    }

    private final void H() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (l0()) {
                C0(this.f40830a.getSemanticsOwner().e(), this.J);
            }
            Unit unit = Unit.f312394a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                I0(T());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    f1();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    private final void H0(int i10) {
        f fVar = this.A;
        if (fVar != null) {
            if (i10 != fVar.d().s()) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.f() <= 1000) {
                AccessibilityEvent accessibilityEventJ = J(B0(fVar.d().s()), 131072);
                accessibilityEventJ.setFromIndex(fVar.b());
                accessibilityEventJ.setToIndex(fVar.e());
                accessibilityEventJ.setAction(fVar.a());
                accessibilityEventJ.setMovementGranularity(fVar.c());
                accessibilityEventJ.getText().add(a0(fVar.d()));
                D0(accessibilityEventJ);
            }
        }
        this.A = null;
    }

    private final boolean I(int i10) {
        if (!j0(i10)) {
            return false;
        }
        this.f40842m = Integer.MIN_VALUE;
        this.f40844o = null;
        this.f40830a.invalidate();
        F0(this, i10, 65536, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x055f  */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private final void I0(androidx.collection.j0<androidx.compose.ui.semantics.w> r53) {
        /*
            Method dump skipped, instruction units count: 1841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s.I0(androidx.collection.j0):void");
    }

    @androidx.annotation.l1
    private final AccessibilityEvent J(int i10, int i11) {
        androidx.compose.ui.semantics.w wVarN;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(S);
        accessibilityEventObtain.setPackageName(this.f40830a.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f40830a, i10);
        if (l0() && (wVarN = T().n(i10)) != null) {
            SemanticsConfiguration semanticsConfigurationF = wVarN.b().F();
            androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
            accessibilityEventObtain.setPassword(semanticsConfigurationF.i(zVar.D()));
            androidx.core.view.accessibility.b.i(accessibilityEventObtain, Intrinsics.areEqual(androidx.compose.ui.semantics.o.a(wVarN.b().F(), zVar.w()), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    private final void J0(androidx.compose.ui.node.l0 l0Var, androidx.collection.u1 u1Var) {
        SemanticsConfiguration semanticsConfigurationQ0;
        androidx.compose.ui.node.l0 l0VarP;
        if (l0Var.I() && !this.f40830a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(l0Var)) {
            if (!l0Var.A0().s(androidx.compose.ui.node.m1.b(8))) {
                l0Var = t.p(l0Var, l.f40876a);
            }
            if (l0Var != null && (semanticsConfigurationQ0 = l0Var.q0()) != null) {
                if (!semanticsConfigurationQ0.v() && (l0VarP = t.p(l0Var, k.f40875a)) != null) {
                    l0Var = l0VarP;
                }
                int iK = l0Var.K();
                if (u1Var.G(iK)) {
                    F0(this, B0(iK), 2048, 1, null, 8, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.core.view.accessibility.j K(int i10) {
        androidx.compose.ui.semantics.w wVarN;
        androidx.lifecycle.o0 o0VarA;
        androidx.lifecycle.c0 lifecycle;
        AndroidComposeView.b viewTreeOwners = this.f40830a.getViewTreeOwners();
        if (((viewTreeOwners == null || (o0VarA = viewTreeOwners.a()) == null || (lifecycle = o0VarA.getLifecycle()) == null) ? null : lifecycle.d()) != androidx.lifecycle.c0.b.DESTROYED && (wVarN = T().n(i10)) != null) {
            androidx.compose.ui.semantics.u uVarB = wVarN.b();
            boolean zAreEqual = Intrinsics.areEqual(androidx.compose.ui.semantics.o.a(uVarB.r(), androidx.compose.ui.semantics.z.f41190a.w()), Boolean.TRUE);
            if (zAreEqual && !m0()) {
                return null;
            }
            androidx.core.view.accessibility.j jVarN0 = androidx.core.view.accessibility.j.N0();
            jVarN0.Z0(zAreEqual);
            int i11 = -1;
            if (i10 == -1) {
                ViewParent parentForAccessibility = this.f40830a.getParentForAccessibility();
                jVarN0.P1(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
            } else {
                androidx.compose.ui.semantics.u uVarX = uVarB.x();
                Integer numValueOf = uVarX != null ? Integer.valueOf(uVarX.s()) : null;
                if (numValueOf == null) {
                    s0.a.j("semanticsNode " + i10 + " has null parent");
                    throw new kotlin.a0();
                }
                int iIntValue = numValueOf.intValue();
                if (iIntValue != this.f40830a.getSemanticsOwner().e().s()) {
                    i11 = iIntValue;
                }
                jVarN0.Q1(this.f40830a, i11);
            }
            jVarN0.b2(this.f40830a, i10);
            jVarN0.e1(D(wVarN));
            u0(i10, jVarN0, uVarB);
            return jVarN0;
        }
        return O();
    }

    private final void K0(androidx.compose.ui.node.l0 l0Var) {
        if (l0Var.I() && !this.f40830a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(l0Var)) {
            int iK = l0Var.K();
            androidx.compose.ui.semantics.l lVarN = this.f40847r.n(iK);
            androidx.compose.ui.semantics.l lVarN2 = this.f40848s.n(iK);
            if (lVarN == null && lVarN2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventJ = J(iK, 4096);
            if (lVarN != null) {
                accessibilityEventJ.setScrollX((int) lVarN.c().invoke().floatValue());
                accessibilityEventJ.setMaxScrollX((int) lVarN.a().invoke().floatValue());
            }
            if (lVarN2 != null) {
                accessibilityEventJ.setScrollY((int) lVarN2.c().invoke().floatValue());
                accessibilityEventJ.setMaxScrollY((int) lVarN2.a().invoke().floatValue());
            }
            D0(accessibilityEventJ);
        }
    }

    private final androidx.compose.ui.graphics.f2 L(androidx.compose.ui.graphics.q3 q3Var, androidx.compose.ui.semantics.u uVar) {
        return q3Var.mo0createOutlinePq9zytI(androidx.compose.ui.unit.v.h(uVar.D()), uVar.t().getLayoutDirection(), this.f40830a.getDensity());
    }

    private final AccessibilityEvent M(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = J(i10, 8192);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
    }

    private final boolean M0(androidx.compose.ui.semantics.u uVar, int i10, int i11, boolean z10) {
        String strA0;
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.n nVar = androidx.compose.ui.semantics.n.f41142a;
        if (semanticsConfigurationF.i(nVar.A()) && t.n(uVar)) {
            pj.n nVar2 = (pj.n) ((androidx.compose.ui.semantics.a) uVar.F().m(nVar.A())).a();
            if (nVar2 != null) {
                return ((Boolean) nVar2.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        }
        if ((i10 == i11 && i11 == this.f40851v) || (strA0 = a0(uVar)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > strA0.length()) {
            i10 = -1;
        }
        this.f40851v = i10;
        boolean z11 = strA0.length() > 0;
        D0(M(B0(uVar.s()), z11 ? Integer.valueOf(this.f40851v) : null, z11 ? Integer.valueOf(this.f40851v) : null, z11 ? Integer.valueOf(strA0.length()) : null, strA0));
        H0(uVar.s());
        return true;
    }

    private final void N0(androidx.compose.ui.semantics.u uVar, androidx.core.view.accessibility.j jVar) {
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        if (semanticsConfigurationF.i(zVar.h())) {
            jVar.p1(true);
            jVar.v1((CharSequence) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.h()));
        }
    }

    private final androidx.core.view.accessibility.j O() {
        if (this.f40833d.isEnabled()) {
            return null;
        }
        return androidx.core.view.accessibility.j.N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(s sVar, boolean z10) {
        sVar.f40838i = z10 ? sVar.f40833d.getEnabledAccessibilityServiceList(-1) : CollectionsKt.emptyList();
    }

    private final int R(androidx.compose.ui.semantics.u uVar) {
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        return (semanticsConfigurationF.i(zVar.d()) || !uVar.F().i(zVar.M())) ? this.f40851v : androidx.compose.ui.text.w3.i(((androidx.compose.ui.text.w3) uVar.F().m(zVar.M())).r());
    }

    private final int S(androidx.compose.ui.semantics.u uVar) {
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        return (semanticsConfigurationF.i(zVar.d()) || !uVar.F().i(zVar.M())) ? this.f40851v : androidx.compose.ui.text.w3.n(((androidx.compose.ui.text.w3) uVar.F().m(zVar.M())).r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.collection.j0<androidx.compose.ui.semantics.w> T() {
        if (this.f40855z) {
            this.f40855z = false;
            this.B = androidx.compose.ui.semantics.y.g(this.f40830a.getSemanticsOwner(), -1);
            if (l0()) {
                t.z(this.B, this.D, this.E, this.f40830a.getContext().getResources());
            }
        }
        return this.B;
    }

    private final void U0(androidx.compose.ui.semantics.u uVar, androidx.core.view.accessibility.j jVar) {
        androidx.compose.ui.text.f fVarU = t.u(uVar);
        jVar.d2(fVarU != null ? a1(fVarU) : null);
    }

    private final Rect V0(androidx.compose.ui.graphics.f2 f2Var) {
        if ((f2Var instanceof androidx.compose.ui.graphics.f2.b) || (f2Var instanceof androidx.compose.ui.graphics.f2.c)) {
            return W0(f2Var.a());
        }
        return null;
    }

    private final Rect W0(n0.j jVar) {
        return new Rect((int) jVar.t(), (int) jVar.B(), (int) jVar.x(), (int) jVar.j());
    }

    @androidx.annotation.l1
    public static /* synthetic */ void X() {
    }

    private final float[] X0(androidx.compose.ui.graphics.f2 f2Var) {
        if (!(f2Var instanceof androidx.compose.ui.graphics.f2.c)) {
            return null;
        }
        androidx.compose.ui.graphics.f2.c cVar = (androidx.compose.ui.graphics.f2.c) f2Var;
        int i10 = 2 & 1;
        return new float[]{Float.intBitsToFloat((int) (cVar.b().t() >> 32)), Float.intBitsToFloat((int) (cVar.b().t() & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (cVar.b().u() >> 32)), Float.intBitsToFloat((int) (cVar.b().u() & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (cVar.b().o() >> 32)), Float.intBitsToFloat((int) (cVar.b().o() & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (cVar.b().n() >> 32)), Float.intBitsToFloat((int) (cVar.b().n() & com.rabbitmq.client.k0.f265952a))};
    }

    private final Region Y0(androidx.compose.ui.graphics.f2 f2Var) {
        if (!(f2Var instanceof androidx.compose.ui.graphics.f2.a)) {
            return null;
        }
        androidx.compose.ui.graphics.f2.a aVar = (androidx.compose.ui.graphics.f2.a) f2Var;
        Region region = new Region(W0(aVar.a()));
        Region region2 = new Region();
        androidx.compose.ui.graphics.k2 k2VarB = aVar.b();
        if (!(k2VarB instanceof androidx.compose.ui.graphics.n)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(((androidx.compose.ui.graphics.n) k2VarB).Z(), region);
        return region2;
    }

    private final RectF Z0(androidx.compose.ui.semantics.u uVar, n0.j jVar) {
        if (uVar == null) {
            return null;
        }
        n0.j jVarT = jVar.T(uVar.y());
        n0.j jVarM = uVar.m();
        n0.j jVarK = jVarT.R(jVarM) ? jVarT.K(jVarM) : null;
        if (jVarK == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.f40830a;
        float fT = jVarK.t();
        long jK = androidComposeView.K(n0.g.g((((long) Float.floatToRawIntBits(jVarK.B())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fT)) << 32)));
        AndroidComposeView androidComposeView2 = this.f40830a;
        float fX = jVarK.x();
        long jK2 = androidComposeView2.K(n0.g.g((((long) Float.floatToRawIntBits(jVarK.j())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fX)) << 32)));
        int i10 = (int) (jK >> 32);
        int i11 = (int) (jK2 >> 32);
        float fMin = Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        int i12 = (int) (jK & com.rabbitmq.client.k0.f265952a);
        float fIntBitsToFloat = Float.intBitsToFloat(i12);
        int i13 = (int) (jK2 & com.rabbitmq.client.k0.f265952a);
        return new RectF(fMin, Math.min(fIntBitsToFloat, Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
    }

    private final String a0(androidx.compose.ui.semantics.u uVar) {
        androidx.compose.ui.text.f fVar;
        if (uVar == null) {
            return null;
        }
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        if (semanticsConfigurationF.i(zVar.d())) {
            return androidx.compose.ui.util.d.r((List) uVar.F().m(zVar.d()), ",", null, null, 0, null, null, 62, null);
        }
        if (uVar.F().i(zVar.g())) {
            androidx.compose.ui.text.f fVarG0 = g0(uVar.F());
            if (fVarG0 != null) {
                return fVarG0.m();
            }
            return null;
        }
        List list = (List) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.L());
        if (list == null || (fVar = (androidx.compose.ui.text.f) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return fVar.m();
    }

    private final SpannableString a1(androidx.compose.ui.text.f fVar) {
        return (SpannableString) d1(androidx.compose.ui.text.platform.a.b(fVar, this.f40830a.getDensity(), this.f40830a.getFontFamilyResolver(), this.H), 100000);
    }

    private final androidx.compose.ui.platform.b.f b0(androidx.compose.ui.semantics.u uVar, int i10) {
        String strA0;
        androidx.compose.ui.text.p3 p3VarC;
        if (uVar != null && (strA0 = a0(uVar)) != null && strA0.length() != 0) {
            if (i10 == 1) {
                androidx.compose.ui.platform.b.C0315b c0315bA = androidx.compose.ui.platform.b.C0315b.f40291e.a(this.f40830a.getContext().getResources().getConfiguration().locale);
                c0315bA.e(strA0);
                return c0315bA;
            }
            if (i10 == 2) {
                androidx.compose.ui.platform.b.g gVarA = androidx.compose.ui.platform.b.g.f40312e.a(this.f40830a.getContext().getResources().getConfiguration().locale);
                gVarA.e(strA0);
                return gVarA;
            }
            int i11 = 4 ^ 4;
            if (i10 != 4) {
                if (i10 == 8) {
                    androidx.compose.ui.platform.b.e eVarA = androidx.compose.ui.platform.b.e.f40309d.a();
                    eVarA.e(strA0);
                    return eVarA;
                }
                if (i10 != 16) {
                    return null;
                }
            }
            if (uVar.F().i(androidx.compose.ui.semantics.n.f41142a.i()) && (p3VarC = x3.c(uVar.F())) != null) {
                if (i10 == 4) {
                    androidx.compose.ui.platform.b.c cVarA = androidx.compose.ui.platform.b.c.f40295e.a();
                    cVarA.j(strA0, p3VarC);
                    return cVarA;
                }
                androidx.compose.ui.platform.b.d dVarA = androidx.compose.ui.platform.b.d.f40301g.a();
                dVarA.j(strA0, p3VarC, uVar);
                return dVarA;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(s sVar, boolean z10) {
        sVar.f40838i = sVar.f40833d.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean c1(androidx.compose.ui.semantics.u uVar, int i10, boolean z10, boolean z11) {
        int iS;
        int i11;
        int iS2 = uVar.s();
        Integer num = this.f40852w;
        if (num == null || iS2 != num.intValue()) {
            this.f40851v = -1;
            this.f40852w = Integer.valueOf(uVar.s());
        }
        String strA0 = a0(uVar);
        boolean z12 = false;
        if (strA0 != null && strA0.length() != 0) {
            androidx.compose.ui.platform.b.f fVarB0 = b0(uVar, i10);
            if (fVarB0 == null) {
                return false;
            }
            int iR = R(uVar);
            if (iR == -1) {
                iR = z10 ? 0 : strA0.length();
            }
            int[] iArrA = z10 ? fVarB0.a(iR) : fVarB0.b(iR);
            if (iArrA == null) {
                return false;
            }
            int i12 = iArrA[0];
            z12 = true;
            int i13 = iArrA[1];
            if (z11 && k0(uVar)) {
                iS = S(uVar);
                if (iS == -1) {
                    iS = z10 ? i12 : i13;
                }
                i11 = z10 ? i13 : i12;
            } else {
                iS = z10 ? i13 : i12;
                i11 = iS;
            }
            this.A = new f(uVar, z10 ? 256 : 512, i10, i12, i13, SystemClock.uptimeMillis());
            M0(uVar, iS, i11, true);
        }
        return z12;
    }

    @androidx.annotation.l1
    public static /* synthetic */ void d0() {
    }

    private final <T extends CharSequence> T d1(T t10, @androidx.annotation.g0(from = 1) int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (t10 != null && t10.length() != 0 && t10.length() > i10) {
            int i11 = i10 - 1;
            if (Character.isHighSurrogate(t10.charAt(i11)) && Character.isLowSurrogate(t10.charAt(i10))) {
                i10 = i11;
            }
            T t11 = (T) t10.subSequence(0, i10);
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return t11;
        }
        return t10;
    }

    private final void e1(int i10) {
        int i11 = this.f40831b;
        if (i11 == i10) {
            return;
        }
        this.f40831b = i10;
        F0(this, i10, 128, null, null, 12, null);
        F0(this, i11, 256, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0159 A[LOOP:2: B:39:0x00de->B:54:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0163 A[EDGE_INSN: B:64:0x0163->B:55:0x0163 BREAK  A[LOOP:2: B:39:0x00de->B:54:0x0159], SYNTHETIC] */
    private final void f1() {
        long j10;
        long j11;
        long j12;
        long j13;
        SemanticsConfiguration semanticsConfigurationB;
        androidx.collection.u1 u1Var = new androidx.collection.u1(0, 1, null);
        androidx.collection.u1 u1Var2 = this.C;
        int[] iArr = u1Var2.f12340b;
        long[] jArr = u1Var2.f12339a;
        int length = jArr.length - 2;
        long j14 = 128;
        long j15 = 255;
        char c10 = 7;
        long j16 = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j17 = jArr[i10];
                int[] iArr2 = iArr;
                if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j17 & j15) < j14) {
                            j12 = j14;
                            int i13 = iArr2[(i10 << 3) + i12];
                            androidx.compose.ui.semantics.w wVarN = T().n(i13);
                            androidx.compose.ui.semantics.u uVarB = wVarN != null ? wVarN.b() : null;
                            if (uVarB != null) {
                                j13 = j15;
                                if (!uVarB.F().i(androidx.compose.ui.semantics.z.f41190a.C())) {
                                }
                            } else {
                                j13 = j15;
                            }
                            u1Var.G(i13);
                            w3 w3VarN = this.I.n(i13);
                            G0(i13, 32, (w3VarN == null || (semanticsConfigurationB = w3VarN.b()) == null) ? null : (String) androidx.compose.ui.semantics.o.a(semanticsConfigurationB, androidx.compose.ui.semantics.z.f41190a.C()));
                        } else {
                            j12 = j14;
                            j13 = j15;
                        }
                        j17 >>= 8;
                        i12++;
                        j14 = j12;
                        j15 = j13;
                    }
                    j10 = j14;
                    j11 = j15;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    j10 = j14;
                    j11 = j15;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                iArr = iArr2;
                j14 = j10;
                j15 = j11;
            }
        } else {
            j10 = 128;
            j11 = 255;
        }
        this.C.Y(u1Var);
        this.I.P();
        androidx.collection.j0<androidx.compose.ui.semantics.w> j0VarT = T();
        int[] iArr3 = j0VarT.f12302b;
        Object[] objArr = j0VarT.f12303c;
        long[] jArr2 = j0VarT.f12301a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j18 = jArr2[i14];
                if ((((~j18) << c10) & j18 & j16) != j16) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j18 & j11) < j10) {
                            int i17 = (i14 << 3) + i16;
                            int i18 = iArr3[i17];
                            androidx.compose.ui.semantics.w wVar = (androidx.compose.ui.semantics.w) objArr[i17];
                            SemanticsConfiguration semanticsConfigurationF = wVar.b().F();
                            androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
                            if (semanticsConfigurationF.i(zVar.C()) && this.C.G(i18)) {
                                G0(i18, 16, (String) wVar.b().F().m(zVar.C()));
                            }
                            this.I.j0(i18, new w3(wVar.b(), T()));
                        }
                        j18 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                    if (i14 != length2) {
                        break;
                    }
                    i14++;
                    c10 = 7;
                    j16 = -9187201950435737472L;
                } else if (i14 != length2) {
                    break;
                    break;
                } else {
                    i14++;
                    c10 = 7;
                    j16 = -9187201950435737472L;
                }
            }
        }
        this.J = new w3(this.f40830a.getSemanticsOwner().e(), T());
    }

    private final androidx.compose.ui.text.f g0(SemanticsConfiguration semanticsConfiguration) {
        return (androidx.compose.ui.text.f) androidx.compose.ui.semantics.o.a(semanticsConfiguration, androidx.compose.ui.semantics.z.f41190a.g());
    }

    private final boolean j0(int i10) {
        return this.f40842m == i10;
    }

    private final boolean k0(androidx.compose.ui.semantics.u uVar) {
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        return !semanticsConfigurationF.i(zVar.d()) && uVar.F().i(zVar.g());
    }

    private final boolean m0() {
        Boolean bool = this.f40839j;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return true;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return false;
        }
        return androidx.core.view.accessibility.c.e(this.f40833d);
    }

    private final boolean n0() {
        if (this.f40834e) {
            return true;
        }
        return this.f40833d.isEnabled() && this.f40833d.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(androidx.compose.ui.node.l0 l0Var) {
        if (this.f40853x.add(l0Var)) {
            this.f40854y.p(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01d7 -> B:102:0x01d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:102:0x01d9
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean r0(int r19, int r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 2016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s.r0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean s0(androidx.compose.ui.semantics.l lVar, float f10) {
        return (f10 < 0.0f && lVar.c().invoke().floatValue() > 0.0f) || (f10 > 0.0f && lVar.c().invoke().floatValue() < lVar.a().invoke().floatValue());
    }

    private static final float t0(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x038d  */
    /* JADX WARN: Code duplicated, block: B:237:0x05f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x05f3 A[LOOP:2: B:223:0x05a0->B:238:0x05f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:360:0x05f8 A[EDGE_INSN: B:360:0x05f8->B:239:0x05f8 BREAK  A[LOOP:2: B:223:0x05a0->B:238:0x05f3], SYNTHETIC] */
    private final void u0(int i10, androidx.core.view.accessibility.j jVar, androidx.compose.ui.semantics.u uVar) {
        View viewD;
        String strA;
        boolean z10;
        int iR;
        boolean zBooleanValue;
        androidx.compose.ui.semantics.u uVarB;
        SemanticsConfiguration semanticsConfigurationR;
        Resources resources = this.f40830a.getContext().getResources();
        jVar.j1(S);
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        if (semanticsConfigurationF.i(zVar.g())) {
            jVar.j1(T);
        }
        if (uVar.F().i(zVar.L())) {
            jVar.j1("android.widget.TextView");
        }
        androidx.compose.ui.semantics.j jVar2 = (androidx.compose.ui.semantics.j) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.F());
        if (jVar2 != null) {
            jVar2.p();
            if (uVar.G() || uVar.B().isEmpty()) {
                androidx.compose.ui.semantics.j.a aVar = androidx.compose.ui.semantics.j.f41124b;
                if (androidx.compose.ui.semantics.j.m(jVar2.p(), aVar.h())) {
                    jVar.V1(resources.getString(androidx.compose.ui.d0.c.f37167s));
                } else if (androidx.compose.ui.semantics.j.m(jVar2.p(), aVar.g())) {
                    jVar.V1(resources.getString(androidx.compose.ui.d0.c.f37166r));
                } else {
                    String strE = x3.e(jVar2.p());
                    if (!androidx.compose.ui.semantics.j.m(jVar2.p(), aVar.e()) || uVar.K() || uVar.F().v()) {
                        jVar.j1(strE);
                    }
                }
            }
            Unit unit = Unit.f312394a;
        }
        jVar.N1(this.f40830a.getContext().getPackageName());
        jVar.B1(androidx.compose.ui.semantics.y.k(uVar));
        boolean zM0 = m0();
        List<androidx.compose.ui.semantics.u> listB = uVar.B();
        int size = listB.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.semantics.u uVar2 = listB.get(i12);
            if (T().e(uVar2.s())) {
                androidx.compose.ui.viewinterop.b bVar = this.f40830a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(uVar2.u());
                if (uVar2.s() != -1) {
                    if (bVar != null) {
                        jVar.c(bVar);
                    } else {
                        androidx.compose.ui.semantics.w wVarN = T().n(uVar2.s());
                        boolean zAreEqual = (wVarN == null || (uVarB = wVarN.b()) == null || (semanticsConfigurationR = uVarB.r()) == null) ? false : Intrinsics.areEqual(androidx.compose.ui.semantics.o.a(semanticsConfigurationR, androidx.compose.ui.semantics.z.f41190a.w()), Boolean.TRUE);
                        if (zM0 || !zAreEqual) {
                            jVar.d(this.f40830a, uVar2.s());
                        }
                    }
                    this.L.d0(uVar2.s(), i11);
                    i11++;
                }
            }
        }
        boolean z11 = true;
        if (i10 == this.f40842m) {
            jVar.a1(true);
            jVar.b(androidx.core.view.accessibility.j.a.f48550m);
        } else {
            jVar.a1(false);
            jVar.b(androidx.core.view.accessibility.j.a.f48549l);
        }
        U0(uVar, jVar);
        N0(uVar, jVar);
        jVar.c2(t.t(uVar, resources));
        jVar.h1(t.s(uVar));
        SemanticsConfiguration semanticsConfigurationF2 = uVar.F();
        androidx.compose.ui.semantics.z zVar2 = androidx.compose.ui.semantics.z.f41190a;
        v0.a aVar2 = (v0.a) androidx.compose.ui.semantics.o.a(semanticsConfigurationF2, zVar2.O());
        if (aVar2 != null) {
            if (aVar2 == v0.a.On) {
                jVar.i1(true);
            } else if (aVar2 == v0.a.Off) {
                jVar.i1(false);
            }
            Unit unit2 = Unit.f312394a;
        }
        Boolean bool = (Boolean) androidx.compose.ui.semantics.o.a(uVar.F(), zVar2.H());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (jVar2 == null ? false : androidx.compose.ui.semantics.j.m(jVar2.p(), androidx.compose.ui.semantics.j.f41124b.h())) {
                jVar.Y1(zBooleanValue2);
            } else {
                jVar.i1(zBooleanValue2);
            }
            Unit unit3 = Unit.f312394a;
        }
        if (!uVar.F().v() || uVar.B().isEmpty()) {
            List list = (List) androidx.compose.ui.semantics.o.a(uVar.F(), zVar2.d());
            jVar.o1(list != null ? (String) CollectionsKt.firstOrNull(list) : null);
        }
        String str = (String) androidx.compose.ui.semantics.o.a(uVar.F(), zVar2.K());
        if (str != null) {
            androidx.compose.ui.semantics.u uVarX = uVar;
            while (true) {
                if (uVarX == null) {
                    zBooleanValue = false;
                    break;
                }
                SemanticsConfiguration semanticsConfigurationF3 = uVarX.F();
                androidx.compose.ui.semantics.a0 a0Var = androidx.compose.ui.semantics.a0.f41069a;
                if (semanticsConfigurationF3.i(a0Var.b())) {
                    zBooleanValue = ((Boolean) uVarX.F().m(a0Var.b())).booleanValue();
                    break;
                }
                uVarX = uVarX.x();
            }
            if (zBooleanValue) {
                jVar.o2(str);
            }
        }
        SemanticsConfiguration semanticsConfigurationF4 = uVar.F();
        androidx.compose.ui.semantics.z zVar3 = androidx.compose.ui.semantics.z.f41190a;
        if (((Unit) androidx.compose.ui.semantics.o.a(semanticsConfigurationF4, zVar3.j())) != null) {
            jVar.z1(true);
            Unit unit4 = Unit.f312394a;
        }
        if (i10 != -1 && (iR = this.L.r(uVar.s(), -1)) != -1) {
            jVar.s1(iR);
            Unit unit5 = Unit.f312394a;
        }
        jVar.R1(uVar.F().i(zVar3.D()));
        jVar.t1(uVar.F().i(zVar3.u()));
        Integer num = (Integer) androidx.compose.ui.semantics.o.a(uVar.F(), zVar3.B());
        jVar.J1(num != null ? num.intValue() : -1);
        jVar.u1(t.n(uVar));
        jVar.w1(uVar.F().i(zVar3.i()));
        if (jVar.y0()) {
            jVar.x1(((Boolean) uVar.F().m(zVar3.i())).booleanValue());
            if (jVar.z0()) {
                jVar.a(2);
                this.f40843n = i10;
            } else {
                jVar.a(1);
            }
        }
        jVar.p2(!androidx.compose.ui.semantics.y.i(uVar));
        androidx.compose.ui.semantics.g gVar = (androidx.compose.ui.semantics.g) androidx.compose.ui.semantics.o.a(uVar.F(), zVar3.A());
        if (gVar != null) {
            int i13 = gVar.i();
            androidx.compose.ui.semantics.g.a aVar3 = androidx.compose.ui.semantics.g.f41102b;
            jVar.H1((!androidx.compose.ui.semantics.g.f(i13, aVar3.b()) && androidx.compose.ui.semantics.g.f(i13, aVar3.a())) ? 2 : 1);
            Unit unit6 = Unit.f312394a;
        }
        jVar.k1(false);
        SemanticsConfiguration semanticsConfigurationF5 = uVar.F();
        androidx.compose.ui.semantics.n nVar = androidx.compose.ui.semantics.n.f41142a;
        androidx.compose.ui.semantics.a aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(semanticsConfigurationF5, nVar.l());
        if (aVar4 != null) {
            boolean zAreEqual2 = Intrinsics.areEqual(androidx.compose.ui.semantics.o.a(uVar.F(), zVar3.H()), Boolean.TRUE);
            androidx.compose.ui.semantics.j.a aVar5 = androidx.compose.ui.semantics.j.f41124b;
            if (jVar2 == null ? false : androidx.compose.ui.semantics.j.m(jVar2.p(), aVar5.h())) {
                z10 = true;
            } else if (jVar2 == null ? false : androidx.compose.ui.semantics.j.m(jVar2.p(), aVar5.f())) {
                z10 = true;
            } else {
                z10 = false;
            }
            jVar.k1(!z10 || (z10 && !zAreEqual2));
            if (t.n(uVar) && jVar.s0()) {
                jVar.b(new androidx.core.view.accessibility.j.a(16, aVar4.b()));
            }
            Unit unit7 = Unit.f312394a;
        }
        jVar.I1(false);
        androidx.compose.ui.semantics.a aVar6 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.n());
        if (aVar6 != null) {
            jVar.I1(true);
            if (t.n(uVar)) {
                jVar.b(new androidx.core.view.accessibility.j.a(32, aVar6.b()));
            }
            Unit unit8 = Unit.f312394a;
        }
        androidx.compose.ui.semantics.a aVar7 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.c());
        if (aVar7 != null) {
            jVar.b(new androidx.core.view.accessibility.j.a(16384, aVar7.b()));
            Unit unit9 = Unit.f312394a;
        }
        if (t.n(uVar)) {
            androidx.compose.ui.semantics.a aVar8 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.B());
            if (aVar8 != null) {
                jVar.b(new androidx.core.view.accessibility.j.a(2097152, aVar8.b()));
                Unit unit10 = Unit.f312394a;
            }
            androidx.compose.ui.semantics.a aVar9 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.m());
            if (aVar9 != null) {
                jVar.b(new androidx.core.view.accessibility.j.a(R.id.accessibilityActionImeEnter, aVar9.b()));
                Unit unit11 = Unit.f312394a;
            }
            androidx.compose.ui.semantics.a aVar10 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.e());
            if (aVar10 != null) {
                jVar.b(new androidx.core.view.accessibility.j.a(65536, aVar10.b()));
                Unit unit12 = Unit.f312394a;
            }
            androidx.compose.ui.semantics.a aVar11 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.s());
            if (aVar11 != null) {
                if (jVar.z0() && this.f40830a.getClipboardManager().T3()) {
                    jVar.b(new androidx.core.view.accessibility.j.a(32768, aVar11.b()));
                }
                Unit unit13 = Unit.f312394a;
            }
        }
        String strA0 = a0(uVar);
        if (!(strA0 == null || strA0.length() == 0)) {
            jVar.g2(S(uVar), R(uVar));
            androidx.compose.ui.semantics.a aVar12 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar.A());
            jVar.b(new androidx.core.view.accessibility.j.a(131072, aVar12 != null ? aVar12.b() : null));
            jVar.a(256);
            jVar.a(512);
            jVar.L1(11);
            List list2 = (List) androidx.compose.ui.semantics.o.a(uVar.F(), zVar3.d());
            if ((list2 == null || list2.isEmpty()) && uVar.F().i(nVar.i()) && !t.o(uVar)) {
                jVar.L1(jVar.Q() | 20);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(X);
        CharSequence charSequenceA0 = jVar.a0();
        if (!(charSequenceA0 == null || charSequenceA0.length() == 0) && uVar.F().i(nVar.i())) {
            arrayList.add(androidx.core.view.accessibility.j.f48522r0);
        }
        if (uVar.F().i(zVar3.K())) {
            arrayList.add(W);
        }
        if (uVar.F().i(zVar3.I())) {
            arrayList.add(Y);
            arrayList.add(f40822c0);
            arrayList.add(f40823d0);
            arrayList.add(f40824e0);
        }
        androidx.collection.c3<androidx.compose.ui.semantics.d0<?>> c3VarN = uVar.F().n();
        if (c3VarN != null) {
            Object[] objArr = c3VarN.f12171b;
            long[] jArr = c3VarN.f12170a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j10 = jArr[i14];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if (((j10 & 255) < 128 ? z11 : false) && (strA = ((androidx.compose.ui.semantics.d0) objArr[(i14 << 3) + i16]).a()) != null) {
                                arrayList.add(strA);
                                Unit unit14 = Unit.f312394a;
                            }
                            j10 >>= 8;
                            i16++;
                            z11 = true;
                        }
                        if (i15 != 8) {
                            break;
                        }
                        if (i14 != length) {
                            break;
                        }
                        i14++;
                        z11 = true;
                    } else if (i14 != length) {
                        break;
                        break;
                    } else {
                        i14++;
                        z11 = true;
                    }
                }
            }
            Unit unit15 = Unit.f312394a;
        }
        jVar.b1(arrayList);
        SemanticsConfiguration semanticsConfigurationF6 = uVar.F();
        androidx.compose.ui.semantics.z zVar4 = androidx.compose.ui.semantics.z.f41190a;
        androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.o.a(semanticsConfigurationF6, zVar4.E());
        if (iVar != null) {
            SemanticsConfiguration semanticsConfigurationF7 = uVar.F();
            androidx.compose.ui.semantics.n nVar2 = androidx.compose.ui.semantics.n.f41142a;
            if (semanticsConfigurationF7.i(nVar2.z())) {
                jVar.j1("android.widget.SeekBar");
            } else {
                jVar.j1("android.widget.ProgressBar");
            }
            if (iVar != androidx.compose.ui.semantics.i.f41108d.a()) {
                jVar.T1(androidx.core.view.accessibility.j.h.e(1, iVar.c().u().floatValue(), iVar.c().i().floatValue(), iVar.b()));
            }
            if (uVar.F().i(nVar2.z()) && t.n(uVar)) {
                if (iVar.b() < kotlin.ranges.r.t(iVar.c().i().floatValue(), iVar.c().u().floatValue())) {
                    jVar.b(androidx.core.view.accessibility.j.a.f48555r);
                }
                if (iVar.b() > kotlin.ranges.r.A(iVar.c().u().floatValue(), iVar.c().i().floatValue())) {
                    jVar.b(androidx.core.view.accessibility.j.a.f48556s);
                }
            }
        }
        b.a(jVar, uVar);
        androidx.compose.ui.platform.accessibility.a.d(uVar, jVar);
        androidx.compose.ui.platform.accessibility.a.e(uVar, jVar);
        androidx.compose.ui.semantics.l lVar = (androidx.compose.ui.semantics.l) androidx.compose.ui.semantics.o.a(uVar.F(), zVar4.l());
        SemanticsConfiguration semanticsConfigurationF8 = uVar.F();
        androidx.compose.ui.semantics.n nVar3 = androidx.compose.ui.semantics.n.f41142a;
        androidx.compose.ui.semantics.a aVar13 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(semanticsConfigurationF8, nVar3.w());
        if (lVar != null && aVar13 != null) {
            if (!androidx.compose.ui.platform.accessibility.a.b(uVar)) {
                jVar.j1("android.widget.HorizontalScrollView");
            }
            if (lVar.a().invoke().floatValue() > 0.0f) {
                jVar.X1(true);
            }
            if (t.n(uVar)) {
                if (w0(lVar)) {
                    jVar.b(androidx.core.view.accessibility.j.a.f48555r);
                    jVar.b(!t.v(uVar) ? androidx.core.view.accessibility.j.a.G : androidx.core.view.accessibility.j.a.E);
                }
                if (v0(lVar)) {
                    jVar.b(androidx.core.view.accessibility.j.a.f48556s);
                    jVar.b(!t.v(uVar) ? androidx.core.view.accessibility.j.a.E : androidx.core.view.accessibility.j.a.G);
                }
            }
        }
        androidx.compose.ui.semantics.l lVar2 = (androidx.compose.ui.semantics.l) androidx.compose.ui.semantics.o.a(uVar.F(), zVar4.Q());
        if (lVar2 != null && aVar13 != null) {
            if (!androidx.compose.ui.platform.accessibility.a.b(uVar)) {
                jVar.j1("android.widget.ScrollView");
            }
            if (lVar2.a().invoke().floatValue() > 0.0f) {
                jVar.X1(true);
            }
            if (t.n(uVar)) {
                if (w0(lVar2)) {
                    jVar.b(androidx.core.view.accessibility.j.a.f48555r);
                    jVar.b(androidx.core.view.accessibility.j.a.F);
                }
                if (v0(lVar2)) {
                    jVar.b(androidx.core.view.accessibility.j.a.f48556s);
                    jVar.b(androidx.core.view.accessibility.j.a.D);
                }
            }
        }
        c.a(jVar, uVar);
        jVar.O1((CharSequence) androidx.compose.ui.semantics.o.a(uVar.F(), zVar4.C()));
        if (t.n(uVar)) {
            androidx.compose.ui.semantics.a aVar14 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar3.g());
            if (aVar14 != null) {
                jVar.b(new androidx.core.view.accessibility.j.a(262144, aVar14.b()));
                Unit unit16 = Unit.f312394a;
            }
            androidx.compose.ui.semantics.a aVar15 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar3.b());
            if (aVar15 != null) {
                jVar.b(new androidx.core.view.accessibility.j.a(524288, aVar15.b()));
                Unit unit17 = Unit.f312394a;
            }
            androidx.compose.ui.semantics.a aVar16 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(uVar.F(), nVar3.f());
            if (aVar16 != null) {
                jVar.b(new androidx.core.view.accessibility.j.a(1048576, aVar16.b()));
                Unit unit18 = Unit.f312394a;
            }
            if (uVar.F().i(nVar3.d())) {
                List list3 = (List) uVar.F().m(nVar3.d());
                int size2 = list3.size();
                androidx.collection.f0 f0Var = f40829j0;
                if (size2 >= f0Var.f12216b) {
                    throw new IllegalStateException("Can't have more than " + f0Var.f12216b + " custom actions for one widget");
                }
                androidx.collection.j3<CharSequence> j3Var = new androidx.collection.j3<>(0, 1, null);
                androidx.collection.f2<CharSequence> f2VarD = androidx.collection.r2.d();
                if (this.f40850u.d(i10)) {
                    androidx.collection.f2<CharSequence> f2VarG = this.f40850u.g(i10);
                    androidx.collection.r1 r1Var = new androidx.collection.r1(0, 1, null);
                    int[] iArr = f0Var.f12215a;
                    int i17 = f0Var.f12216b;
                    for (int i18 = 0; i18 < i17; i18++) {
                        r1Var.b0(iArr[i18]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i19 = 0; i19 < size3; i19++) {
                        androidx.compose.ui.semantics.e eVar = (androidx.compose.ui.semantics.e) list3.get(i19);
                        Intrinsics.checkNotNull(f2VarG);
                        if (f2VarG.e(eVar.b())) {
                            int iN = f2VarG.n(eVar.b());
                            j3Var.o(iN, eVar.b());
                            f2VarD.l0(eVar.b(), iN);
                            r1Var.p0(iN);
                            jVar.b(new androidx.core.view.accessibility.j.a(iN, eVar.b()));
                            Unit unit19 = Unit.f312394a;
                        } else {
                            arrayList2.add(eVar);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i20 = 0; i20 < size4; i20++) {
                        androidx.compose.ui.semantics.e eVar2 = (androidx.compose.ui.semantics.e) arrayList2.get(i20);
                        int iW = r1Var.w(i20);
                        j3Var.o(iW, eVar2.b());
                        f2VarD.l0(eVar2.b(), iW);
                        jVar.b(new androidx.core.view.accessibility.j.a(iW, eVar2.b()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i21 = 0; i21 < size5; i21++) {
                        androidx.compose.ui.semantics.e eVar3 = (androidx.compose.ui.semantics.e) list3.get(i21);
                        int iW2 = f40829j0.w(i21);
                        j3Var.o(iW2, eVar3.b());
                        f2VarD.l0(eVar3.b(), iW2);
                        jVar.b(new androidx.core.view.accessibility.j.a(iW2, eVar3.b()));
                    }
                }
                this.f40849t.o(i10, j3Var);
                this.f40850u.o(i10, f2VarD);
            }
        }
        jVar.W1(t.w(uVar, resources));
        int iR2 = this.D.r(i10, -1);
        if (iR2 != -1) {
            View viewD2 = x3.d(this.f40830a.getAndroidViewsHandler$ui_release(), iR2);
            if (viewD2 != null) {
                jVar.l2(viewD2);
            } else {
                jVar.m2(this.f40830a, iR2);
            }
            C(i10, jVar, this.F, null);
        }
        int iR3 = this.E.r(i10, -1);
        if (iR3 != -1 && (viewD = x3.d(this.f40830a.getAndroidViewsHandler$ui_release(), iR3)) != null) {
            jVar.j2(viewD);
            C(i10, jVar, this.G, null);
        }
        String str2 = (String) androidx.compose.ui.semantics.o.a(uVar.F(), androidx.compose.ui.semantics.a0.f41069a.a());
        if (str2 != null) {
            jVar.j1(str2);
            Unit unit20 = Unit.f312394a;
        }
    }

    private static final boolean v0(androidx.compose.ui.semantics.l lVar) {
        if (lVar.c().invoke().floatValue() <= 0.0f || lVar.b()) {
            return lVar.c().invoke().floatValue() < lVar.a().invoke().floatValue() && lVar.b();
        }
        return true;
    }

    private static final boolean w0(androidx.compose.ui.semantics.l lVar) {
        if (lVar.c().invoke().floatValue() >= lVar.a().invoke().floatValue() || lVar.b()) {
            return lVar.c().invoke().floatValue() > 0.0f && lVar.b();
        }
        return true;
    }

    private final boolean x0(int i10, List<v3> list) {
        boolean z10;
        v3 v3VarA = x3.a(list, i10);
        if (v3VarA != null) {
            z10 = false;
        } else {
            v3 v3Var = new v3(i10, this.N, null, null, null, null);
            z10 = true;
            v3VarA = v3Var;
        }
        this.N.add(v3VarA);
        return z10;
    }

    private final boolean y0(int i10) {
        if (!n0() || j0(i10)) {
            return false;
        }
        int i11 = this.f40842m;
        if (i11 != Integer.MIN_VALUE) {
            F0(this, i11, 65536, null, null, 12, null);
        }
        this.f40842m = i10;
        this.f40830a.invalidate();
        int i12 = 1 << 0;
        F0(this, i10, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(v3 v3Var) {
        if (v3Var.H2()) {
            this.f40830a.getSnapshotObserver().i(v3Var, this.O, new i(v3Var, this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:25:0x006b, B:29:0x007c, B:31:0x0085, B:33:0x008f, B:35:0x009a, B:36:0x00ad, B:38:0x00b5, B:39:0x00c0, B:21:0x0055, B:24:0x005e), top: B:46:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008f A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:25:0x006b, B:29:0x007c, B:31:0x0085, B:33:0x008f, B:35:0x009a, B:36:0x00ad, B:38:0x00b5, B:39:0x00c0, B:21:0x0055, B:24:0x005e), top: B:46:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[Catch: all -> 0x003e, LOOP:0: B:34:0x0098->B:35:0x009a, LOOP_END, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:25:0x006b, B:29:0x007c, B:31:0x0085, B:33:0x008f, B:35:0x009a, B:36:0x00ad, B:38:0x00b5, B:39:0x00c0, B:21:0x0055, B:24:0x005e), top: B:46:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:25:0x006b, B:29:0x007c, B:31:0x0085, B:33:0x008f, B:35:0x009a, B:36:0x00ad, B:38:0x00b5, B:39:0x00c0, B:21:0x0055, B:24:0x005e), top: B:46:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        if (kotlinx.coroutines.d1.b(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00df -> B:15:0x003b). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s.E(kotlin.coroutines.d):java.lang.Object");
    }

    public final boolean F(boolean z10, int i10, long j10) {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return G(T(), z10, i10, j10);
        }
        return false;
    }

    public final void L0(boolean z10) {
        this.f40834e = z10;
        this.f40855z = true;
    }

    public final boolean N(@NotNull MotionEvent motionEvent) {
        if (!n0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iI0 = i0(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.f40830a.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            e1(iI0);
            if (iI0 == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.f40831b == Integer.MIN_VALUE) {
            return this.f40830a.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        e1(Integer.MIN_VALUE);
        return true;
    }

    public final void O0(int i10) {
        this.f40831b = i10;
    }

    public final void P0(@NotNull androidx.collection.q1 q1Var) {
        this.E = q1Var;
    }

    public final boolean Q() {
        return this.f40834e;
    }

    public final void Q0(@NotNull androidx.collection.q1 q1Var) {
        this.D = q1Var;
    }

    public final void R0(@NotNull Function1<? super AccessibilityEvent, Boolean> function1) {
        this.f40832c = function1;
    }

    public final void S0(@Nullable Boolean bool) {
        this.f40839j = bool;
    }

    public final void T0(long j10) {
        this.f40835f = j10;
    }

    @NotNull
    public final String U() {
        return this.G;
    }

    @NotNull
    public final String V() {
        return this.F;
    }

    public final int W() {
        return this.f40831b;
    }

    @NotNull
    public final androidx.collection.q1 Y() {
        return this.E;
    }

    @NotNull
    public final androidx.collection.q1 Z() {
        return this.D;
    }

    @NotNull
    public final Function1<AccessibilityEvent, Boolean> c0() {
        return this.f40832c;
    }

    @Nullable
    public final Boolean e0() {
        return this.f40839j;
    }

    public final long f0() {
        return this.f40835f;
    }

    @Override // androidx.core.view.a
    @NotNull
    public androidx.core.view.accessibility.k getAccessibilityNodeProvider(@NotNull View view) {
        return this.f40841l;
    }

    @NotNull
    public final AndroidComposeView h0() {
        return this.f40830a;
    }

    @androidx.annotation.l1
    public final int i0(float f10, float f11) {
        int iB0;
        androidx.compose.ui.node.x1.d(this.f40830a, false, 1, null);
        androidx.compose.ui.node.w wVar = new androidx.compose.ui.node.w();
        androidx.compose.ui.node.l0.U0(this.f40830a.getRoot(), n0.g.g((((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f10) << 32)), wVar, 0, false, 12, null);
        int lastIndex = CollectionsKt.getLastIndex(wVar);
        while (true) {
            iB0 = Integer.MIN_VALUE;
            if (-1 >= lastIndex) {
                break;
            }
            androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(wVar.get(lastIndex));
            if (this.f40830a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(l0VarU) != null) {
                return Integer.MIN_VALUE;
            }
            if (l0VarU.A0().s(androidx.compose.ui.node.m1.b(8))) {
                iB0 = B0(l0VarU.K());
                androidx.compose.ui.semantics.u uVarA = androidx.compose.ui.semantics.v.a(l0VarU, false);
                if (androidx.compose.ui.semantics.y.k(uVarA) && !uVarA.r().i(androidx.compose.ui.semantics.z.f41190a.z())) {
                    break;
                }
            }
            lastIndex--;
        }
        return iB0;
    }

    public final boolean l0() {
        if (this.f40834e) {
            return true;
        }
        return this.f40833d.isEnabled() && !this.f40838i.isEmpty();
    }

    public final void p0(@NotNull androidx.compose.ui.node.l0 l0Var) {
        this.f40855z = true;
        if (l0()) {
            o0(l0Var);
        }
    }

    public final void q0() {
        this.f40855z = true;
        if (!l0() || this.K) {
            return;
        }
        this.K = true;
        this.f40840k.post(this.M);
    }
}
