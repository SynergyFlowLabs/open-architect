package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 11 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 12 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 15 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 16 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 17 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 18 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 19 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 20 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 21 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/ProcessResult\n+ 22 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 23 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 24 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 25 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/LazyWindowInfo\n+ 26 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,3317:1\n1684#1,4:3436\n1684#1,4:3440\n78#2,5:3318\n57#2,4:3337\n78#2,5:3475\n78#2,5:3484\n32#3:3323\n32#3:3448\n80#4:3324\n80#4:3449\n53#4,3:3497\n53#4,3:3514\n60#4:3518\n70#4:3521\n60#4:3524\n70#4:3527\n53#4,3:3529\n60#4:3533\n70#4:3536\n60#4:3538\n70#4:3541\n53#4,3:3544\n53#4,3:3548\n53#4,3:3552\n60#4:3556\n70#4:3559\n53#4,3:3561\n1516#5:3325\n1516#5:3579\n85#6:3326\n117#6,2:3327\n85#6:3407\n117#6,2:3408\n85#6:3410\n85#6:3411\n117#6,2:3412\n85#6:3414\n117#6,2:3415\n94#7:3329\n309#8,6:3330\n180#8:3336\n181#8:3341\n182#8,3:3345\n185#8,6:3349\n315#8:3355\n450#8,6:3356\n460#8,2:3363\n462#8,17:3368\n479#8,8:3388\n316#8:3396\n191#8,8:3397\n317#8:3405\n1107#9:3342\n1085#9,2:3343\n519#10:3348\n424#10,8:3456\n424#10,8:3465\n247#11:3362\n240#12,3:3365\n243#12,3:3385\n1#13:3406\n1#13:3565\n26#14:3417\n26#14:3418\n26#14:3419\n26#14:3420\n22#14:3519\n22#14:3522\n22#14:3525\n22#14:3534\n22#14:3539\n22#14:3542\n22#14:3557\n919#15,2:3421\n919#15,2:3480\n919#15,2:3482\n924#15,2:3491\n924#15,2:3493\n27#16,5:3423\n27#16,5:3428\n27#16,3:3433\n31#16:3444\n27#16,5:3502\n27#16,5:3574\n61#17,3:3445\n41#18,5:3450\n207#19:3455\n207#19:3464\n20#20,2:3473\n20#20,2:3489\n256#21:3495\n260#21:3500\n256#21:3501\n256#21:3512\n256#21:3567\n30#22:3496\n30#22:3513\n30#22:3528\n30#22:3543\n30#22:3547\n30#22:3551\n30#22:3560\n213#23,5:3507\n65#24:3517\n69#24:3520\n65#24:3523\n69#24:3526\n65#24:3532\n69#24:3535\n65#24:3537\n69#24:3540\n65#24:3555\n69#24:3558\n58#25:3564\n59#25:3566\n139#26:3568\n139#26:3569\n139#26:3570\n139#26:3571\n139#26:3572\n139#26:3573\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n1652#1:3436,4\n1653#1:3440,4\n585#1:3318,5\n313#1:3337,4\n2084#1:3475,5\n2114#1:3484,5\n661#1:3323\n1737#1:3448\n661#1:3324\n1737#1:3449\n2204#1:3497,3\n2478#1:3514,3\n2480#1:3518\n2481#1:3521\n2539#1:3524\n2539#1:3527\n2539#1:3529,3\n2545#1:3533\n2545#1:3536\n2550#1:3538\n2551#1:3541\n2552#1:3544,3\n2573#1:3548,3\n2586#1:3552,3\n2589#1:3556\n2589#1:3559\n2589#1:3561,3\n827#1:3325\n2916#1:3579\n261#1:3326\n261#1:3327,2\n682#1:3407\n682#1:3408,2\n691#1:3410\n755#1:3411\n755#1:3412,2\n767#1:3414\n767#1:3415,2\n313#1:3329\n313#1:3330,6\n313#1:3336\n313#1:3341\n313#1:3345,3\n313#1:3349,6\n313#1:3355\n313#1:3356,6\n313#1:3363,2\n313#1:3368,17\n313#1:3388,8\n313#1:3396\n313#1:3397,8\n313#1:3405\n313#1:3342\n313#1:3343,2\n313#1:3348\n2009#1:3456,8\n2015#1:3465,8\n313#1:3362\n313#1:3365,3\n313#1:3385,3\n2598#1:3565\n952#1:3417\n953#1:3418\n954#1:3419\n955#1:3420\n2480#1:3519\n2481#1:3522\n2539#1:3525\n2545#1:3534\n2550#1:3539\n2551#1:3542\n2589#1:3557\n1311#1:3421,2\n2095#1:3480,2\n2096#1:3482,2\n2132#1:3491,2\n2133#1:3493,2\n1556#1:3423,5\n1569#1:3428,5\n1648#1:3433,3\n1648#1:3444\n2281#1:3502,5\n2888#1:3574,5\n1729#1:3445,3\n1906#1:3450,5\n2009#1:3455\n2015#1:3464\n2038#1:3473,2\n2119#1:3489,2\n2197#1:3495\n2251#1:3500\n2255#1:3501\n2434#1:3512\n2696#1:3567\n2204#1:3496\n2478#1:3513\n2539#1:3528\n2552#1:3543\n2573#1:3547\n2586#1:3551\n2589#1:3560\n2423#1:3507,5\n2480#1:3517\n2481#1:3520\n2539#1:3523\n2539#1:3526\n2545#1:3532\n2545#1:3535\n2550#1:3537\n2551#1:3540\n2589#1:3555\n2589#1:3558\n2598#1:3564\n2598#1:3566\n2701#1:3568\n2702#1:3569\n2703#1:3570\n2704#1:3571\n2710#1:3572\n2711#1:3573\n*E\n"})
public final class AndroidComposeView extends ViewGroup implements androidx.compose.ui.node.x1, androidx.compose.ui.focus.a1, u4, androidx.compose.ui.input.pointer.j, DefaultLifecycleObserver, androidx.compose.ui.node.v1 {

    @Nullable
    private static Class<?> A4;

    @Nullable
    private static Method B4;

    @Nullable
    private static Method C4;

    @NotNull
    private static final androidx.collection.g2<AndroidComposeView> D4;

    @Nullable
    private static Runnable E4;

    @Nullable
    private static Method F4;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    @NotNull
    public static final a f40134y4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final int f40135z4 = 8;
    private boolean A3;

    @Nullable
    private t0 B3;

    @Nullable
    private a2 C3;

    @Nullable
    private androidx.compose.ui.unit.b D3;
    private boolean E3;

    @NotNull
    private final androidx.compose.ui.node.y0 F3;
    private long G3;

    @NotNull
    private final androidx.compose.ui.spatial.f H1;

    @NotNull
    private final int[] H3;

    @NotNull
    private final float[] I3;

    @NotNull
    private final float[] J3;

    @NotNull
    private final float[] K3;
    private long L3;
    private boolean M3;
    private long N3;
    private boolean O3;

    @NotNull
    private final androidx.compose.runtime.n3 P3;

    @NotNull
    private final n7 Q3;

    @Nullable
    private Function1<? super b, Unit> R3;

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener S3;

    @NotNull
    private final ViewTreeObserver.OnScrollChangedListener T3;

    @NotNull
    private final ViewTreeObserver.OnTouchModeChangeListener U3;

    @NotNull
    private final androidx.compose.ui.text.input.c1 V3;

    @NotNull
    private final androidx.compose.ui.text.input.a1 W3;

    @NotNull
    private final AtomicReference<androidx.compose.ui.g0.a<Object>> X3;

    @NotNull
    private final z3 Y3;

    @NotNull
    private final androidx.compose.ui.text.font.x.b Z3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f40136a;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f40137a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40138b;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private int f40139b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.n0 f40140c;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f40141c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f40142d;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @NotNull
    private final p0.a f40143d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f40144e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @NotNull
    private final q0.c f40145e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40146f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.modifier.h f40147f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.semantics.f f40148g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.node.g2.a f40149g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    @NotNull
    private final e4 f40150g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final EmptySemanticsElement f40151h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.semantics.x f40152h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    @Nullable
    private MotionEvent f40153h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView$bringIntoViewNode$1 f40154i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.platform.s f40155i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private long f40156i4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.focus.w f40157j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.contentcapture.b f40158j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    @NotNull
    private final v4<androidx.compose.ui.node.w1> f40159j4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private CoroutineContext f40160k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.platform.d f40161k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    @NotNull
    private final androidx.collection.g2<Function0<Unit>> f40162k4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final AndroidDragAndDropManager f40163l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.o1 f40164l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private float f40165l4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final y2 f40166m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.autofill.q f40167m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private float f40168m4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40169n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private final List<androidx.compose.ui.node.w1> f40170n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    @NotNull
    private final t f40171n4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f40172o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private List<androidx.compose.ui.node.w1> f40173o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    @NotNull
    private final Runnable f40174o4;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.l0 f40175p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final androidx.collection.t1<androidx.compose.ui.node.l0> f40176p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.g2 f40177p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f40178p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private boolean f40179p4;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f40180q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f40181q4;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.pointer.k f40182r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    @NotNull
    private final g1 f40183r4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f40184s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.pointer.g0 f40185s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private boolean f40186s4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.l0 f40187t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NotNull
    private Function1<? super Configuration, Unit> f40188t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.scrollcapture.k f40189t4;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.autofill.a f40190u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    @Nullable
    private View f40191u4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final o4 f40192v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.autofill.b f40193v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.pointer.z f40194v4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.x f40195w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private boolean f40196w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private int f40197w4;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.platform.f f40198x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private int f40199x4;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.platform.e f40200y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.z1 f40201z3;

    @SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$Companion\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,3317:1\n32#2:3318\n32#2:3321\n32#2:3325\n919#3,2:3319\n924#3,2:3322\n1#4:3324\n287#5,6:3326\n287#5,6:3332\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$Companion\n*L\n2979#1:3318\n2985#1:3321\n2946#1:3325\n2979#1:3319,2\n2985#1:3322,2\n2948#1:3326,6\n2956#1:3332,6\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(AndroidComposeView androidComposeView) {
            if (AndroidComposeView.E4 == null) {
                Runnable runnable = new Runnable() { // from class: androidx.compose.ui.platform.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.a.f();
                    }
                };
                AndroidComposeView.E4 = runnable;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    try {
                        if (AndroidComposeView.A4 == null) {
                            AndroidComposeView.A4 = Class.forName("android.os.SystemProperties");
                        }
                        if (AndroidComposeView.C4 == null) {
                            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                            Class cls = AndroidComposeView.A4;
                            AndroidComposeView.C4 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        }
                        Method method = AndroidComposeView.C4;
                        if (method != null) {
                            method.invoke(null, runnable);
                        }
                    } catch (Throwable unused) {
                        Unit unit = Unit.f312394a;
                    }
                    StrictMode.setVmPolicy(vmPolicy);
                } catch (Throwable th2) {
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            }
            synchronized (AndroidComposeView.D4) {
                AndroidComposeView.D4.a0(androidComposeView);
                Unit unit2 = Unit.f312394a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f() {
            synchronized (AndroidComposeView.D4) {
                try {
                    int i10 = 0;
                    if (Build.VERSION.SDK_INT < 30) {
                        androidx.collection.g2 g2Var = AndroidComposeView.D4;
                        Object[] objArr = g2Var.f12449a;
                        int i11 = g2Var.f12450b;
                        while (i10 < i11) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i10];
                            boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                            androidComposeView.setShowLayoutBounds(AndroidComposeView.f40134y4.h());
                            if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                androidComposeView.S();
                            }
                            i10++;
                        }
                    } else {
                        androidx.collection.g2 g2Var2 = AndroidComposeView.D4;
                        Object[] objArr2 = g2Var2.f12449a;
                        int i12 = g2Var2.f12450b;
                        while (i10 < i12) {
                            ((AndroidComposeView) objArr2[i10]).S();
                            i10++;
                        }
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean h() {
            try {
                if (AndroidComposeView.A4 == null) {
                    AndroidComposeView.A4 = Class.forName("android.os.SystemProperties");
                }
                if (AndroidComposeView.B4 == null) {
                    Class cls = AndroidComposeView.A4;
                    AndroidComposeView.B4 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.B4;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return Intrinsics.areEqual(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i(AndroidComposeView androidComposeView) {
            synchronized (AndroidComposeView.D4) {
                try {
                    AndroidComposeView.D4.C0(androidComposeView);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @e.a({"BanUncheckedReflection"})
        public final void g(@NotNull ViewTreeObserver viewTreeObserver) {
            try {
                if (AndroidComposeView.F4 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.F4 = declaredMethod;
                }
                Method method = AndroidComposeView.F4;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }

        private a() {
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40202c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.lifecycle.o0 f40203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.savedstate.m f40204b;

        public b(@NotNull androidx.lifecycle.o0 o0Var, @NotNull androidx.savedstate.m mVar) {
            this.f40203a = o0Var;
            this.f40204b = mVar;
        }

        @NotNull
        public final androidx.lifecycle.o0 a() {
            return this.f40203a;
        }

        @NotNull
        public final androidx.savedstate.m b() {
            return this.f40204b;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<q0.a, Boolean> {
        c() {
            super(1);
        }

        public final Boolean c(int i10) {
            boolean zRequestFocusFromTouch;
            q0.a.C2461a c2461a = q0.a.f350233b;
            if (q0.a.f(i10, c2461a.b())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else if (q0.a.f(i10, c2461a.a())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true;
            } else {
                zRequestFocusFromTouch = false;
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(q0.a aVar) {
            return c(aVar.i());
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$addAndroidView$1\n+ 2 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,3317:1\n521#2,3:3318\n524#2,7:3322\n90#3:3321\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$addAndroidView$1\n*L\n1441#1:3318,3\n1441#1:3322,7\n1441#1:3321\n*E\n"})
    public static final class d extends androidx.core.view.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.l0 f40208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f40209c;

        d(androidx.compose.ui.node.l0 l0Var, AndroidComposeView androidComposeView) {
            this.f40208b = l0Var;
            this.f40209c = androidComposeView;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0063  */
        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            if (AndroidComposeView.this.f40155i3.l0()) {
                jVar.p2(false);
            }
            androidx.compose.ui.node.l0 l0VarJ0 = this.f40208b.J0();
            while (true) {
                if (l0VarJ0 == null) {
                    l0VarJ0 = null;
                    break;
                } else if (l0VarJ0.A0().s(androidx.compose.ui.node.m1.b(8))) {
                    break;
                } else {
                    l0VarJ0 = l0VarJ0.J0();
                }
            }
            Integer numValueOf = l0VarJ0 != null ? Integer.valueOf(l0VarJ0.K()) : null;
            if (numValueOf != null) {
                if (numValueOf.intValue() == AndroidComposeView.this.getSemanticsOwner().e().s()) {
                    numValueOf = -1;
                }
            } else {
                numValueOf = -1;
            }
            jVar.Q1(this.f40209c, numValueOf.intValue());
            int iK = this.f40208b.K();
            int iR = AndroidComposeView.this.f40155i3.Z().r(iK, -1);
            if (iR != -1) {
                View viewD = x3.d(AndroidComposeView.this.getAndroidViewsHandler$ui_release(), iR);
                if (viewD != null) {
                    jVar.l2(viewD);
                } else {
                    jVar.m2(this.f40209c, iR);
                }
                AndroidComposeView.this.A0(iK, jVar.q2(), AndroidComposeView.this.f40155i3.V());
            }
            int iR2 = AndroidComposeView.this.f40155i3.Y().r(iK, -1);
            if (iR2 != -1) {
                View viewD2 = x3.d(AndroidComposeView.this.getAndroidViewsHandler$ui_release(), iR2);
                if (viewD2 != null) {
                    jVar.j2(viewD2);
                } else {
                    jVar.k2(this.f40209c, iR2);
                }
                AndroidComposeView.this.A0(iK, jVar.q2(), AndroidComposeView.this.f40155i3.U());
            }
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<Configuration, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f40210a = new e();

        e() {
            super(1);
        }

        public final void c(Configuration configuration) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
            c(configuration);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class f extends kotlin.jvm.internal.g0 implements Function0<androidx.compose.ui.platform.coreshims.b> {
        f(Object obj) {
            super(0, obj, g0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.coreshims.b invoke() {
            return g0.g((View) this.receiver);
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MotionEvent f40212b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(MotionEvent motionEvent) {
            super(0);
            this.f40212b = motionEvent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(this.f40212b));
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyEvent f40214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(KeyEvent keyEvent) {
            super(0);
            this.f40214b = keyEvent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.f40214b));
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.g0 implements pj.n<androidx.compose.ui.draganddrop.k, n0.n, Function1<? super androidx.compose.ui.graphics.drawscope.f, ? extends Unit>, Boolean> {
        i(Object obj) {
            super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        public final Boolean X(androidx.compose.ui.draganddrop.k kVar, long j10, Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).p1(kVar, j10, function1));
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.draganddrop.k kVar, n0.n nVar, Function1<? super androidx.compose.ui.graphics.drawscope.f, ? extends Unit> function1) {
            return X(kVar, nVar.y(), function1);
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<FocusTargetNode> f40215a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(kotlin.jvm.internal.i1.h<FocusTargetNode> hVar) {
            super(1);
            this.f40215a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f40215a.f312751a = focusTargetNode;
            return Boolean.TRUE;
        }
    }

    static final class k extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f40216a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    static final class l extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MotionEvent f40218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(MotionEvent motionEvent) {
            super(0);
            this.f40218b = motionEvent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(this.f40218b));
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3317:1\n1#2:3318\n*E\n"})
    static final class m extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.input.key.c, Boolean> {

        static final class a extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.f f40220a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.f fVar) {
                super(1);
                this.f40220a = fVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.K4(this.f40220a.o()));
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.f f40221a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.focus.f fVar) {
                super(1);
                this.f40221a = fVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.K4(this.f40221a.o()));
            }
        }

        m() {
            super(1);
        }

        public final Boolean c(KeyEvent keyEvent) {
            androidx.compose.ui.focus.f fVarE = androidx.compose.ui.focus.n.e(keyEvent);
            if (fVarE == null || !androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.a())) {
                return Boolean.FALSE;
            }
            Integer numC = androidx.compose.ui.focus.n.c(fVarE.o());
            if (androidx.compose.ui.k.f39201d && AndroidComposeView.this.hasFocus() && numC != null && AndroidComposeView.this.z(fVarE.o())) {
                return Boolean.TRUE;
            }
            n0.j embeddedViewFocusRect = AndroidComposeView.this.getEmbeddedViewFocusRect();
            Boolean boolI = AndroidComposeView.this.getFocusOwner().i(fVarE.o(), embeddedViewFocusRect, new b(fVarE));
            if (boolI != null ? boolI.booleanValue() : true) {
                return Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.x.a(fVarE.o())) {
                return Boolean.FALSE;
            }
            if (numC != null) {
                View viewL0 = AndroidComposeView.this.L0(numC.intValue());
                if (Intrinsics.areEqual(viewL0, AndroidComposeView.this)) {
                    viewL0 = null;
                }
                if (viewL0 != null) {
                    Rect rectB = embeddedViewFocusRect != null ? androidx.compose.ui.graphics.c3.b(embeddedViewFocusRect) : null;
                    if (rectB == null) {
                        throw new IllegalStateException("Invalid rect");
                    }
                    View rootView = AndroidComposeView.this.getRootView();
                    Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) rootView;
                    viewGroup.offsetDescendantRectToMyCoords(AndroidComposeView.this, rectB);
                    viewGroup.offsetRectIntoDescendantCoords(viewL0, rectB);
                    if (androidx.compose.ui.focus.n.b(viewL0, numC, rectB)) {
                        return Boolean.TRUE;
                    }
                }
            }
            if (!AndroidComposeView.this.getFocusOwner().q(false, true, false, fVarE.o())) {
                return Boolean.TRUE;
            }
            Boolean boolI2 = AndroidComposeView.this.getFocusOwner().i(fVarE.o(), null, new a(fVarE));
            return Boolean.valueOf(boolI2 != null ? boolI2.booleanValue() : true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return c(cVar.h());
        }
    }

    static final class n extends kotlin.jvm.internal.l0 implements Function0<androidx.compose.ui.unit.u> {
        n() {
            super(0);
        }

        public final long c() {
            return u0.d(AndroidComposeView.this);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke() {
            return androidx.compose.ui.unit.u.b(c());
        }
    }

    public static final class o implements androidx.compose.ui.input.pointer.z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.compose.ui.input.pointer.x f40223a = androidx.compose.ui.input.pointer.x.f39142a.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.compose.ui.input.pointer.x f40224b;

        o() {
        }

        @Override // androidx.compose.ui.input.pointer.z
        public void a(androidx.compose.ui.input.pointer.x xVar) {
            this.f40224b = xVar;
        }

        @Override // androidx.compose.ui.input.pointer.z
        public void b(androidx.compose.ui.input.pointer.x xVar) {
            if (xVar == null) {
                xVar = androidx.compose.ui.input.pointer.x.f39142a.b();
            }
            this.f40223a = xVar;
            e0.f40429a.a(AndroidComposeView.this, xVar);
        }

        @Override // androidx.compose.ui.input.pointer.z
        public androidx.compose.ui.input.pointer.x c() {
            return this.f40224b;
        }

        @Override // androidx.compose.ui.input.pointer.z
        public androidx.compose.ui.input.pointer.x getIcon() {
            return this.f40223a;
        }
    }

    static final class p extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f40226a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i10) {
            super(1);
            this.f40226a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.K4(this.f40226a));
        }
    }

    static final class q extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f40227a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i10) {
            super(1);
            this.f40227a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.K4(this.f40227a));
        }
    }

    static final class r extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.a f40228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(kotlin.jvm.internal.i1.a aVar, int i10) {
            super(1);
            this.f40228a = aVar;
            this.f40229b = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f40228a.f312744a = true;
            return Boolean.valueOf(focusTargetNode.K4(this.f40229b));
        }
    }

    static final class s extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MotionEvent motionEvent = AndroidComposeView.this.f40153h4;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.f40156i4 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.f40171n4);
                }
            }
        }
    }

    public static final class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.f40153h4;
            if (motionEvent != null) {
                boolean z10 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z10) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked != 1) {
                }
                int i10 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i10 = 2;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.n1(motionEvent, i10, androidComposeView.f40156i4, false);
            }
        }
    }

    static final class u extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.input.rotary.d, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f40232a = new u();

        u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.input.rotary.d dVar) {
            return Boolean.FALSE;
        }
    }

    static final class v extends kotlin.jvm.internal.l0 implements Function1<Function0<? extends Unit>, Unit> {
        v() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Function0 function0) {
            function0.invoke();
        }

        public final void d(final Function0<Unit> function0) {
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                function0.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.v.f(function0);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            d(function0);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", i = {}, l = {734}, m = "textInputSession", n = {}, s = {})
    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40234a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40236c;

        w(kotlin.coroutines.d<? super w> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40234a = obj;
            this.f40236c |= Integer.MIN_VALUE;
            return AndroidComposeView.this.O(null, this);
        }
    }

    static final class x extends kotlin.jvm.internal.l0 implements Function1<kotlinx.coroutines.s0, j0> {
        x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j0 invoke(kotlinx.coroutines.s0 s0Var) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            return new j0(androidComposeView, androidComposeView.getTextInputService(), s0Var);
        }
    }

    static final class y extends kotlin.jvm.internal.l0 implements Function0<b> {
        y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f40134y4 = new a(defaultConstructorMarker);
        D4 = new androidx.collection.g2<>(0, 1, defaultConstructorMarker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.a0, androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1] */
    public AndroidComposeView(@NotNull Context context, @NotNull CoroutineContext coroutineContext) {
        final AndroidComposeView androidComposeView;
        androidx.compose.ui.autofill.b bVar;
        super(context);
        n0.g.a aVar = n0.g.f332700b;
        this.f40136a = aVar.c();
        int i10 = 1;
        this.f40138b = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.f40140c = new androidx.compose.ui.node.n0(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f40142d = w6.k(androidx.compose.ui.unit.a.a(context), w6.v());
        boolean z10 = false;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        boolean z11 = androidx.compose.ui.k.f39208k && Build.VERSION.SDK_INT >= 35;
        this.f40146f = z11;
        androidx.compose.ui.semantics.f fVar = new androidx.compose.ui.semantics.f();
        this.f40148g = fVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(fVar);
        this.f40151h = emptySemanticsElement;
        ?? r10 = new androidx.compose.ui.node.e1<f1>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // androidx.compose.ui.node.e1
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // androidx.compose.ui.node.e1
            public int hashCode() {
                return this.f40205c.hashCode();
            }

            @Override // androidx.compose.ui.node.e1
            public void j(t2 t2Var) {
                t2Var.d("BringIntoViewOnScreen");
            }

            @Override // androidx.compose.ui.node.e1
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public f1 a() {
                return new f1(this.f40205c);
            }

            @Override // androidx.compose.ui.node.e1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public void k(f1 f1Var) {
                f1Var.w9(this.f40205c);
            }
        };
        this.f40154i = r10;
        this.f40157j = new FocusOwnerImpl(this, this);
        this.f40160k = coroutineContext;
        this.f40163l = new AndroidDragAndDropManager(new i(this));
        this.f40166m = new y2();
        androidx.compose.ui.a0 a0Var = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarA = androidx.compose.ui.input.key.f.a(a0Var, new m());
        this.f40172o = a0VarA;
        androidx.compose.ui.a0 a0VarB = androidx.compose.ui.input.rotary.a.b(a0Var, u.f40232a);
        this.f40184s = a0VarB;
        this.f40187t = new androidx.compose.ui.graphics.l0();
        this.f40192v = new p0(ViewConfiguration.get(context));
        androidx.compose.ui.layout.x xVar = new androidx.compose.ui.layout.x(this);
        this.f40195w = xVar;
        androidx.compose.ui.node.l0 l0Var = new androidx.compose.ui.node.l0(z10, objArr5 == true ? 1 : 0, 3, objArr3 == true ? 1 : 0);
        l0Var.i(androidx.compose.ui.layout.r2.f39474c);
        l0Var.e(getDensity());
        l0Var.p(getViewConfiguration());
        l0Var.j((androidx.compose.ui.k.f39203f ? androidx.compose.ui.layout.n3.e(a0Var, xVar) : a0Var).B2(emptySemanticsElement).B2(a0VarB).B2(a0VarA).B2(getFocusOwner().a()).B2(getDragAndDropManager().a()).B2(r10));
        this.f40175p0 = l0Var;
        this.f40176p1 = androidx.collection.k0.j();
        this.H1 = new androidx.compose.ui.spatial.f(getLayoutNodes());
        this.f40177p2 = this;
        this.f40152h3 = new androidx.compose.ui.semantics.x(getRoot(), fVar, getLayoutNodes());
        androidx.compose.ui.platform.s sVar = new androidx.compose.ui.platform.s(this);
        this.f40155i3 = sVar;
        this.f40158j3 = new androidx.compose.ui.contentcapture.b(this, new f(this));
        this.f40161k3 = new androidx.compose.ui.platform.d(context);
        this.f40164l3 = androidx.compose.ui.graphics.h.a(this);
        this.f40167m3 = new androidx.compose.ui.autofill.q();
        this.f40170n3 = new ArrayList();
        this.f40182r3 = new androidx.compose.ui.input.pointer.k();
        this.f40185s3 = new androidx.compose.ui.input.pointer.g0(getRoot());
        this.f40188t3 = e.f40210a;
        this.f40190u3 = B0() ? new androidx.compose.ui.autofill.a(this, getAutofillTree()) : null;
        if (B0()) {
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
            if (autofillManager == null) {
                s0.a.j("Autofill service could not be located.");
                throw new kotlin.a0();
            }
            androidComposeView = this;
            bVar = new androidx.compose.ui.autofill.b(new androidx.compose.ui.autofill.x(autofillManager), getSemanticsOwner(), androidComposeView, getRectManager(), context.getPackageName());
        } else {
            androidComposeView = this;
            bVar = null;
        }
        androidComposeView.f40193v3 = bVar;
        androidComposeView.f40198x3 = new androidx.compose.ui.platform.f(context);
        androidComposeView.f40200y3 = new androidx.compose.ui.platform.e(androidComposeView.getClipboardManager());
        androidComposeView.f40201z3 = new androidx.compose.ui.node.z1(androidComposeView.new v());
        androidComposeView.F3 = new androidx.compose.ui.node.y0(androidComposeView.getRoot());
        long j10 = Integer.MAX_VALUE;
        androidComposeView.G3 = androidx.compose.ui.unit.q.f((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
        androidComposeView.H3 = new int[]{0, 0};
        androidComposeView.I3 = androidx.compose.ui.graphics.c2.c(null, 1, null);
        androidComposeView.J3 = androidx.compose.ui.graphics.c2.c(null, 1, null);
        androidComposeView.K3 = androidx.compose.ui.graphics.c2.c(null, 1, null);
        androidComposeView.L3 = -1L;
        androidComposeView.N3 = aVar.a();
        androidComposeView.O3 = true;
        androidComposeView.P3 = d7.g(null, null, 2, null);
        androidComposeView.Q3 = w6.e(androidComposeView.new y());
        androidComposeView.S3 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.O0(this.f40507a);
            }
        };
        androidComposeView.T3 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.k1(this.f40523a);
            }
        };
        androidComposeView.U3 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z12) {
                AndroidComposeView.q1(this.f40591a, z12);
            }
        };
        androidx.compose.ui.text.input.c1 c1Var = new androidx.compose.ui.text.input.c1(androidComposeView.getView(), androidComposeView);
        androidComposeView.V3 = c1Var;
        androidComposeView.W3 = new androidx.compose.ui.text.input.a1(g0.h().invoke(c1Var));
        androidComposeView.X3 = androidx.compose.ui.g0.b();
        androidComposeView.Y3 = new u1(androidComposeView.getTextInputService());
        androidComposeView.Z3 = new h0(context);
        androidComposeView.f40137a4 = w6.k(androidx.compose.ui.text.font.h0.a(context), w6.v());
        androidComposeView.f40139b4 = androidComposeView.N0(context.getResources().getConfiguration());
        androidx.compose.ui.unit.w wVarF = androidx.compose.ui.focus.n.f(context.getResources().getConfiguration().getLayoutDirection());
        androidComposeView.f40141c4 = d7.g(wVarF == null ? androidx.compose.ui.unit.w.Ltr : wVarF, null, 2, null);
        androidComposeView.f40143d4 = new p0.c(androidComposeView);
        androidComposeView.f40145e4 = new q0.c(androidComposeView.isInTouchMode() ? q0.a.f350233b.b() : q0.a.f350233b.a(), androidComposeView.new c(), objArr2 == true ? 1 : 0);
        androidComposeView.f40147f4 = new androidx.compose.ui.modifier.h(androidComposeView);
        androidComposeView.f40150g4 = new k0(androidComposeView);
        androidComposeView.f40159j4 = new v4<>();
        androidComposeView.f40162k4 = new androidx.collection.g2<>(objArr4 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
        androidComposeView.f40171n4 = androidComposeView.new t();
        androidComposeView.f40174o4 = new Runnable() { // from class: androidx.compose.ui.platform.l
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.l1(this.f40622a);
            }
        };
        androidComposeView.f40181q4 = androidComposeView.new s();
        int i11 = Build.VERSION.SDK_INT;
        androidComposeView.f40183r4 = new i1();
        androidComposeView.addOnAttachStateChangeListener(androidComposeView.f40158j3);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(true);
        f0.f40439a.a(androidComposeView, 1, false);
        androidComposeView.setFocusableInTouchMode(true);
        androidComposeView.setClipChildren(false);
        androidx.core.view.u1.G1(androidComposeView, sVar);
        Function1<u4, Unit> function1A = u4.M.a();
        if (function1A != null) {
            function1A.invoke(androidComposeView);
        }
        androidComposeView.setOnDragListener(androidComposeView.getDragAndDropManager());
        androidComposeView.getRoot().A(androidComposeView);
        androidx.compose.ui.platform.v.f40907a.a(androidComposeView);
        if (z11) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(androidx.compose.ui.d0.b.J, Boolean.TRUE);
            androidComposeView.f40144e = view;
            androidComposeView.addView(view);
        }
        androidComposeView.f40189t4 = i11 >= 31 ? new androidx.compose.ui.scrollcapture.k() : null;
        androidComposeView.f40194v4 = androidComposeView.new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iR;
        if (Intrinsics.areEqual(str, this.f40155i3.V())) {
            int iR2 = this.f40155i3.Z().r(i10, -1);
            if (iR2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iR2);
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(str, this.f40155i3.U()) || (iR = this.f40155i3.Y().r(i10, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iR);
    }

    private final boolean B0() {
        return true;
    }

    private final boolean E0(androidx.compose.ui.node.l0 l0Var) {
        androidx.compose.ui.node.l0 l0VarJ0;
        if (!this.E3 && ((l0VarJ0 = l0Var.J0()) == null || l0VarJ0.d0())) {
            return false;
        }
        return true;
    }

    private final void F0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                F0((ViewGroup) childAt);
            }
        }
    }

    private final int G0(long j10) {
        return (int) kotlin.y1.n(j10 >>> 32);
    }

    private final int H0(long j10) {
        return (int) kotlin.y1.n(j10 & com.rabbitmq.client.k0.f265952a);
    }

    private final long I0(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return a1(0, size);
        }
        if (mode == 0) {
            return a1(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return a1(size, size);
        }
        throw new IllegalStateException();
    }

    private final void J0() {
        if (this.f40180q3) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f40180q3 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View L0(int i10) {
        d2 d2VarA = d2.f40392f.a();
        View viewD = this;
        while (viewD != null) {
            View rootView = getRootView();
            Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewD = d2VarA.d((ViewGroup) rootView, viewD, i10);
            if (viewD != null && !g0.e(this, viewD)) {
                return viewD;
            }
        }
        return null;
    }

    private final View M0(int i10, View view) {
        return null;
    }

    private final int N0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(AndroidComposeView androidComposeView) {
        androidComposeView.r1();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    private final int P0(MotionEvent motionEvent) {
        AndroidComposeView androidComposeView;
        int i10;
        removeCallbacks(this.f40171n4);
        try {
            c1(motionEvent);
            boolean z10 = true;
            this.M3 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f40153h4;
                boolean z11 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null) {
                    try {
                        if (R0(motionEvent, motionEvent2)) {
                            if (W0(motionEvent2)) {
                                this.f40185s3.e();
                            } else if (motionEvent2.getActionMasked() != 10 && z11) {
                                o1(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z12 = motionEvent.getToolType(0) == 3;
                if (z11 || !z12 || actionMasked == 3 || actionMasked == 9 || !X0(motionEvent)) {
                    androidComposeView = this;
                    i10 = 9;
                } else {
                    i10 = 9;
                    androidComposeView = this;
                    o1(androidComposeView, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != 0) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = androidComposeView.f40153h4;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = androidComposeView.f40153h4;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == i10 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            androidComposeView.f40182r3.e(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = androidComposeView.f40153h4;
                        float x10 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = androidComposeView.f40153h4;
                        boolean z13 = (x10 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = androidComposeView.f40153h4;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z10 = false;
                        }
                        if (z13 || z10) {
                            if (pointerId >= 0) {
                                androidComposeView.f40182r3.e(pointerId);
                            }
                            androidComposeView.f40185s3.a();
                        }
                    }
                }
                androidComposeView.f40153h4 = MotionEvent.obtainNoHistory(motionEvent);
                int iM1 = m1(motionEvent);
                Trace.endSection();
                androidComposeView.M3 = false;
                return iM1;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            this.M3 = false;
            throw th4;
        }
    }

    private final boolean Q0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        return getFocusOwner().n(new androidx.compose.ui.input.rotary.d(androidx.core.view.y1.k(viewConfiguration, getContext()) * f10, f10 * androidx.core.view.y1.f(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()), new l(motionEvent));
    }

    private final boolean R0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void S0(androidx.compose.ui.node.l0 l0Var) {
        l0Var.Y0();
        androidx.compose.runtime.collection.d<androidx.compose.ui.node.l0> dVarQ0 = l0Var.Q0();
        androidx.compose.ui.node.l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            S0(l0VarArr[i10]);
        }
    }

    private final void T0(androidx.compose.ui.node.l0 l0Var) {
        androidx.compose.ui.node.y0.R(this.F3, l0Var, false, 2, null);
        androidx.compose.runtime.collection.d<androidx.compose.ui.node.l0> dVarQ0 = l0Var.Q0();
        androidx.compose.ui.node.l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            T0(l0VarArr[i10]);
        }
    }

    private final boolean V0(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & Integer.MAX_VALUE) >= 2139095040 || !b3.f40319a.a(motionEvent, i10);
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    private final boolean W0(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean X0(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    private final boolean Y0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f40153h4) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private final long a1(int i10, int i11) {
        return kotlin.y1.n(kotlin.y1.n(kotlin.y1.n(i10) << 32) | kotlin.y1.n(i11));
    }

    private final void b1() {
        if (!this.M3) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (jCurrentAnimationTimeMillis != this.L3) {
                this.L3 = jCurrentAnimationTimeMillis;
                d1();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.H3);
                int[] iArr = this.H3;
                float f10 = iArr[0];
                float f11 = iArr[1];
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.H3;
                this.N3 = n0.g.g((((long) Float.floatToRawIntBits(f10 - iArr2[0])) << 32) | (((long) Float.floatToRawIntBits(f11 - iArr2[1])) & com.rabbitmq.client.k0.f265952a));
            }
        }
    }

    private final void c1(MotionEvent motionEvent) {
        this.L3 = AnimationUtils.currentAnimationTimeMillis();
        d1();
        float[] fArr = this.J3;
        float x10 = motionEvent.getX();
        long j10 = androidx.compose.ui.graphics.c2.j(fArr, n0.g.g((((long) Float.floatToRawIntBits(motionEvent.getY())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(x10) << 32)));
        this.N3 = n0.g.g((((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (j10 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
    }

    private final void d1() {
        this.f40183r4.a(this, this.J3);
        v2.a(this.J3, this.K3);
    }

    @kotlin.l(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.b1(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @androidx.annotation.l1
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @kotlin.l(message = "Use PlatformTextInputModifierNode instead.")
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final b get_viewTreeOwners() {
        return (b) this.P3.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(Function0 function0) {
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        try {
            function0.invoke();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    private final void i1(androidx.compose.ui.node.l0 l0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (l0Var != null) {
            while (l0Var != null && l0Var.x0() == androidx.compose.ui.node.l0.g.InMeasureBlock && E0(l0Var)) {
                l0Var = l0Var.J0();
            }
            if (l0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void j1(AndroidComposeView androidComposeView, androidx.compose.ui.node.l0 l0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l0Var = null;
        }
        androidComposeView.i1(l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(AndroidComposeView androidComposeView) {
        androidComposeView.r1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l1(AndroidComposeView androidComposeView) {
        androidComposeView.f40179p4 = false;
        MotionEvent motionEvent = androidComposeView.f40153h4;
        Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.m1(motionEvent);
    }

    private final int m1(MotionEvent motionEvent) {
        androidx.compose.ui.input.pointer.f0 f0Var;
        if (this.f40186s4) {
            this.f40186s4 = false;
            this.f40166m.e(androidx.compose.ui.input.pointer.q0.b(motionEvent.getMetaState()));
        }
        androidx.compose.ui.input.pointer.e0 e0VarC = this.f40182r3.c(motionEvent, this);
        if (e0VarC == null) {
            this.f40185s3.e();
            return androidx.compose.ui.input.pointer.h0.a(false, false, false);
        }
        List<androidx.compose.ui.input.pointer.f0> listB = e0VarC.b();
        int size = listB.size() - 1;
        if (size < 0) {
            f0Var = null;
            break;
        }
        while (true) {
            int i10 = size - 1;
            f0Var = listB.get(size);
            if (f0Var.o()) {
                break;
            }
            if (i10 < 0) {
                f0Var = null;
                break;
            }
            size = i10;
        }
        androidx.compose.ui.input.pointer.f0 f0Var2 = f0Var;
        if (f0Var2 != null) {
            this.f40136a = f0Var2.s();
        }
        int iC = this.f40185s3.c(e0VarC, this, X0(motionEvent));
        e0VarC.d(null);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && (iC & 1) == 0) {
            this.f40182r3.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return iC;
        }
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f10 = pointerCoords.x;
            long jK = K(n0.g.g((((long) Float.floatToRawIntBits(pointerCoords.y)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f10)) << 32)));
            pointerCoords.x = Float.intBitsToFloat((int) (jK >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jK & com.rabbitmq.client.k0.f265952a));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        androidx.compose.ui.input.pointer.e0 e0VarC = this.f40182r3.c(motionEventObtain, this);
        Intrinsics.checkNotNull(e0VarC);
        this.f40185s3.c(e0VarC, this, true);
        motionEventObtain.recycle();
    }

    static /* synthetic */ void o1(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        androidComposeView.n1(motionEvent, i10, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p1(androidx.compose.ui.draganddrop.k kVar, long j10, Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        Resources resources = getContext().getResources();
        return androidx.compose.ui.platform.y.f40969a.a(this, kVar, new androidx.compose.ui.draganddrop.a(androidx.compose.ui.unit.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j10, function1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q1(AndroidComposeView androidComposeView, boolean z10) {
        androidComposeView.f40145e4.c(z10 ? q0.a.f350233b.b() : q0.a.f350233b.a());
    }

    private final void r1() {
        getLocationOnScreen(this.H3);
        long j10 = this.G3;
        int iN = androidx.compose.ui.unit.q.n(j10);
        int iP = androidx.compose.ui.unit.q.p(j10);
        int[] iArr = this.H3;
        boolean z10 = false;
        int i10 = iArr[0];
        if (iN != i10 || iP != iArr[1] || this.L3 < 0) {
            this.G3 = androidx.compose.ui.unit.q.f((((long) i10) << 32) | (((long) iArr[1]) & com.rabbitmq.client.k0.f265952a));
            if (iN != Integer.MAX_VALUE && iP != Integer.MAX_VALUE) {
                getRoot().k0().v().o3();
                z10 = true;
            }
        }
        b1();
        View rootView = this.f40191u4;
        if (rootView == null) {
            rootView = getRootView();
            this.f40191u4 = rootView;
        }
        getRectManager().x(this.G3, androidx.compose.ui.unit.r.g(this.N3), this.J3, rootView.getWidth(), rootView.getHeight());
        this.F3.e(z10);
        if (androidx.compose.ui.k.f39199b) {
            getRectManager().e();
        }
    }

    private final void s1() {
        androidx.compose.runtime.n3 n3Var = this.f40166m.f40974b;
        if (n3Var != null) {
            n3Var.setValue(androidx.compose.ui.unit.u.b(u0.d(this)));
        }
    }

    private void setDensity(androidx.compose.ui.unit.d dVar) {
        this.f40142d.setValue(dVar);
    }

    private void setFontFamilyResolver(androidx.compose.ui.text.font.y.b bVar) {
        this.f40137a4.setValue(bVar);
    }

    private void setLayoutDirection(androidx.compose.ui.unit.w wVar) {
        this.f40141c4.setValue(wVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.P3.setValue(bVar);
    }

    @Override // androidx.compose.ui.node.x1
    public void A(@NotNull androidx.compose.ui.node.l0 l0Var, boolean z10, boolean z11) {
        if (z10) {
            if (this.F3.J(l0Var, z11)) {
                j1(this, null, 1, null);
            }
        } else if (this.F3.O(l0Var, z11)) {
            j1(this, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.x1
    public void B() {
        this.f40199x4++;
        getView().setKeepScreenOn(this.f40199x4 > 0);
    }

    @Nullable
    public final Object C0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = this.f40155i3.E(dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.x1
    public long D(long j10) {
        b1();
        return androidx.compose.ui.graphics.c2.j(this.J3, j10);
    }

    @Nullable
    public final Object D0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = this.f40158j3.d(dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.x1
    public void E(@NotNull androidx.compose.ui.node.l0 l0Var, int i10) {
        getLayoutNodes().e0(i10);
        getLayoutNodes().j0(l0Var.K(), l0Var);
    }

    @Override // androidx.compose.ui.node.x1
    public void F() {
        this.f40199x4--;
        getView().setKeepScreenOn(this.f40199x4 > 0);
    }

    @Override // androidx.compose.ui.node.x1
    public void G(@NotNull androidx.compose.ui.node.l0 l0Var) {
        this.f40155i3.p0(l0Var);
        this.f40158j3.A();
    }

    @Override // androidx.compose.ui.node.x1
    public void H(@NotNull androidx.compose.ui.node.l0 l0Var, boolean z10) {
        this.F3.k(l0Var, z10);
    }

    @Override // androidx.compose.ui.node.x1
    public void I(long j10) {
        f40134y4.g(getViewTreeObserver());
    }

    @Override // androidx.compose.ui.node.x1
    public void J(@NotNull androidx.compose.ui.node.l0 l0Var) {
        androidx.compose.ui.autofill.b bVar;
        if (B0() && androidx.compose.ui.k.f39200c && (bVar = this.f40193v3) != null) {
            bVar.k(l0Var);
        }
    }

    @Override // androidx.compose.ui.input.pointer.s0
    public long K(long j10) {
        b1();
        long j11 = androidx.compose.ui.graphics.c2.j(this.J3, j10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (this.N3 >> 32));
        return n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)) + Float.intBitsToFloat((int) (this.N3 & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final void K0(@NotNull androidx.compose.ui.viewinterop.b bVar, @NotNull Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(bVar, canvas);
    }

    @Override // androidx.compose.ui.node.x1
    public void M(@NotNull androidx.compose.ui.node.l0 l0Var) {
        getLayoutNodes().j0(l0Var.K(), l0Var);
    }

    @Override // androidx.compose.ui.node.g2
    public boolean N(@NotNull androidx.compose.ui.input.indirect.c cVar) {
        return androidx.compose.ui.focus.w.e(getFocusOwner(), cVar, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.ui.node.x1
    @Nullable
    public Object O(@NotNull Function2<? super n3, ? super kotlin.coroutines.d<?>, ? extends Object> function2, @NotNull kotlin.coroutines.d<?> dVar) {
        w wVar;
        if (dVar instanceof w) {
            wVar = (w) dVar;
            int i10 = wVar.f40236c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wVar.f40236c = i10 - Integer.MIN_VALUE;
            } else {
                wVar = new w(dVar);
            }
        } else {
            wVar = new w(dVar);
        }
        Object obj = wVar.f40234a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = wVar.f40236c;
        if (i11 == 0) {
            ResultKt.m(obj);
            AtomicReference<androidx.compose.ui.g0.a<Object>> atomicReference = this.X3;
            x xVar = new x();
            wVar.f40236c = 1;
            if (androidx.compose.ui.g0.j(atomicReference, xVar, function2, wVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.node.g2
    public void P(boolean z10) {
        this.f40155i3.L0(z10);
    }

    @Override // androidx.compose.ui.node.x1
    @androidx.annotation.w0(35)
    public void Q(float f10) {
        if (this.f40146f) {
            if (f10 > 0.0f) {
                if (Float.isNaN(this.f40165l4) || f10 > this.f40165l4) {
                    this.f40165l4 = f10;
                    return;
                }
                return;
            }
            if (f10 < 0.0f) {
                if (Float.isNaN(this.f40168m4) || f10 < this.f40168m4) {
                    this.f40168m4 = f10;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.x1
    public void R(@NotNull androidx.compose.ui.node.l0 l0Var) {
        androidx.compose.ui.autofill.b bVar;
        getLayoutNodes().e0(l0Var.K());
        this.F3.B(l0Var);
        g1();
        if (androidx.compose.ui.k.f39199b) {
            getRectManager().t(l0Var);
        }
        if (B0() && androidx.compose.ui.k.f39200c && (bVar = this.f40193v3) != null) {
            bVar.h(l0Var);
        }
    }

    @Override // androidx.compose.ui.platform.u4
    public void S() {
        S0(getRoot());
    }

    @Override // androidx.compose.ui.node.x1
    public void T(@NotNull Function0<Unit> function0) {
        if (!this.f40162k4.d(function0)) {
            this.f40162k4.a0(function0);
        }
    }

    @Override // androidx.compose.ui.node.x1
    public void U() {
        this.f40155i3.q0();
        this.f40158j3.B();
    }

    public final boolean U0() {
        return this.f40146f;
    }

    @Override // androidx.compose.ui.node.x1
    public void V(@NotNull androidx.compose.ui.node.l0 l0Var) {
        androidx.compose.ui.autofill.b bVar;
        if (androidx.compose.ui.k.f39199b) {
            getRectManager().t(l0Var);
        }
        if (B0() && androidx.compose.ui.k.f39200c && (bVar = this.f40193v3) != null) {
            bVar.j(l0Var);
        }
    }

    public final void Z0(@NotNull androidx.compose.ui.node.w1 w1Var, boolean z10) {
        if (!z10) {
            if (!this.f40178p3) {
                this.f40170n3.remove(w1Var);
                List<androidx.compose.ui.node.w1> list = this.f40173o3;
                if (list != null) {
                    list.remove(w1Var);
                }
            }
            return;
        }
        if (!this.f40178p3) {
            this.f40170n3.add(w1Var);
            return;
        }
        List arrayList = this.f40173o3;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f40173o3 = arrayList;
        }
        arrayList.add(w1Var);
    }

    @Override // androidx.compose.ui.node.x1
    public void a(boolean z10) {
        Function0<Unit> function0;
        if (this.F3.p() || this.F3.q()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    function0 = this.f40181q4;
                } finally {
                    Trace.endSection();
                }
            } else {
                function0 = null;
            }
            if (this.F3.w(function0)) {
                requestLayout();
            }
            androidx.compose.ui.node.y0.f(this.F3, false, 1, null);
            J0();
            Unit unit = Unit.f312394a;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public void autofill(@NotNull SparseArray<AutofillValue> sparseArray) {
        androidx.compose.ui.autofill.b bVar;
        if (B0()) {
            if (androidx.compose.ui.k.f39200c && (bVar = this.f40193v3) != null) {
                bVar.m(sparseArray);
            }
            androidx.compose.ui.autofill.a aVar = this.f40190u3;
            if (aVar != null) {
                androidx.compose.ui.autofill.e.a(aVar, sparseArray);
            }
        }
    }

    @Override // androidx.compose.ui.focus.a1
    public boolean b(@Nullable androidx.compose.ui.focus.f fVar, @Nullable n0.j jVar) {
        Integer numC;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((fVar == null || (numC = androidx.compose.ui.focus.n.c(fVar.o())) == null) ? 130 : numC.intValue(), jVar != null ? androidx.compose.ui.graphics.c3.b(jVar) : null);
    }

    @Override // androidx.compose.ui.focus.a1
    public void c() {
        if (isFocused() || (!androidx.compose.ui.k.f39201d && hasFocus())) {
            super.clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f40155i3.F(false, i10, this.f40136a);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f40155i3.F(true, i10, this.f40136a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        if (!isAttachedToWindow()) {
            S0(getRoot());
        }
        View view = null;
        androidx.compose.ui.node.x1.d(this, false, 1, null);
        androidx.compose.runtime.snapshots.m.f36535e.n();
        this.f40178p3 = true;
        try {
            androidx.compose.ui.graphics.l0 l0Var = this.f40187t;
            Canvas canvasS = l0Var.b().S();
            l0Var.b().U(canvas);
            getRoot().N(l0Var.b(), null);
            l0Var.b().U(canvasS);
            if (!this.f40170n3.isEmpty()) {
                int size = this.f40170n3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f40170n3.get(i10).l();
                }
            }
            if (p4.f40719w.c()) {
                int iSave = canvas.save();
                canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(iSave);
            }
            this.f40170n3.clear();
            this.f40178p3 = false;
        } catch (Throwable th2) {
            androidx.compose.ui.node.g2.a aVar = this.f40149g3;
            if (aVar == null) {
                throw th2;
            }
            aVar.a(th2);
        }
        List<androidx.compose.ui.node.w1> list = this.f40173o3;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.f40170n3.addAll(list);
            list.clear();
        }
        if (this.f40146f) {
            y0.a(this, this.f40165l4);
            View view2 = this.f40144e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("frameRateCategoryView");
                view2 = null;
            }
            y0.a(view2, this.f40168m4);
            if (!Float.isNaN(this.f40168m4)) {
                View view3 = this.f40144e;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("frameRateCategoryView");
                    view3 = null;
                }
                view3.invalidate();
                View view4 = this.f40144e;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("frameRateCategoryView");
                } else {
                    view = view4;
                }
                drawChild(canvas, view, getDrawingTime());
            }
            this.f40165l4 = Float.NaN;
            this.f40168m4 = Float.NaN;
        }
        if (androidx.compose.ui.k.f39199b) {
            getRectManager().e();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (this.f40179p4) {
            removeCallbacks(this.f40174o4);
            if (motionEvent.getActionMasked() == 8) {
                this.f40179p4 = false;
            } else {
                this.f40174o4.run();
            }
        }
        if (V0(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return Q0(motionEvent);
            }
            return (P0(motionEvent) & 1) != 0;
        }
        if (motionEvent.isFromSource(2)) {
            motionEvent2 = motionEvent;
        } else {
            float x10 = motionEvent.getX();
            motionEvent2 = motionEvent;
            if (getFocusOwner().l(new androidx.compose.ui.input.indirect.a(n0.g.g((((long) Float.floatToRawIntBits(motionEvent.getY())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(x10)) << 32)), motionEvent.getEventTime(), androidx.compose.ui.input.indirect.b.b(motionEvent.getActionMasked()), motionEvent2, null), new g(motionEvent2))) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent motionEvent) {
        if (this.f40179p4) {
            removeCallbacks(this.f40174o4);
            this.f40174o4.run();
        }
        if (!V0(motionEvent) && isAttachedToWindow()) {
            this.f40155i3.N(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && X0(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.f40153h4;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.f40153h4 = MotionEvent.obtainNoHistory(motionEvent);
                    this.f40179p4 = true;
                    postDelayed(this.f40174o4, 8L);
                    return false;
                }
            } else if (!Y0(motionEvent)) {
                return false;
            }
            if ((P0(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().v(androidx.compose.ui.input.key.c.b(keyEvent), new h(keyEvent));
        }
        this.f40166m.e(androidx.compose.ui.input.pointer.q0.b(keyEvent.getMetaState()));
        if (!androidx.compose.ui.focus.w.g(getFocusOwner(), androidx.compose.ui.input.key.c.b(keyEvent), null, 2, null) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(@NotNull KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().h(androidx.compose.ui.input.key.c.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(@NotNull ViewStructure viewStructure) {
        super.dispatchProvideStructure(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        if (this.f40179p4) {
            removeCallbacks(this.f40174o4);
            MotionEvent motionEvent2 = this.f40153h4;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || R0(motionEvent, motionEvent2)) {
                this.f40174o4.run();
            } else {
                this.f40179p4 = false;
            }
        }
        if (V0(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !Y0(motionEvent))) {
            return false;
        }
        int iP0 = P0(motionEvent);
        if ((iP0 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iP0 & 1) != 0;
    }

    public final boolean e1(@NotNull androidx.compose.ui.node.w1 w1Var) {
        if (this.C3 != null) {
            p4.f40719w.c();
        }
        this.f40159j4.d(w1Var);
        this.f40170n3.remove(w1Var);
        return true;
    }

    @Override // androidx.compose.ui.node.x1
    public void f(@NotNull androidx.compose.ui.node.l0 l0Var) {
        this.F3.N(l0Var);
        j1(this, null, 1, null);
    }

    public final void f1(@NotNull androidx.compose.ui.viewinterop.b bVar) {
        getAndroidViewsHandler$ui_release().removeViewInLayout(bVar);
        HashMap<androidx.compose.ui.node.l0, androidx.compose.ui.viewinterop.b> layoutNodeToHolder = getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        kotlin.jvm.internal.r1.k(layoutNodeToHolder).remove(getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(bVar));
        bVar.setImportantForAccessibility(0);
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public View focusSearch(@Nullable View view, int i10) {
        n0.j jVarA;
        if (view == null || this.F3.o()) {
            return super.focusSearch(view, i10);
        }
        View viewD = d2.f40392f.a().d(this, view, i10);
        if (view != this || (jVarA = getFocusOwner().x()) == null) {
            jVarA = androidx.compose.ui.focus.n.a(view, this);
        }
        androidx.compose.ui.focus.f fVarD = androidx.compose.ui.focus.n.d(i10);
        int iO = fVarD != null ? fVarD.o() : androidx.compose.ui.focus.f.f37408b.a();
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        if (getFocusOwner().i(iO, jVarA, new j(hVar)) != null) {
            if (hVar.f312751a != 0) {
                if (viewD != null) {
                    if (androidx.compose.ui.focus.x.a(iO)) {
                        return super.focusSearch(view, i10);
                    }
                    if (androidx.compose.ui.focus.b1.m(androidx.compose.ui.focus.v0.d((FocusTargetNode) hVar.f312751a), androidx.compose.ui.focus.n.a(viewD, this), jVarA, iO)) {
                    }
                }
                return this;
            }
            if (viewD == null) {
            }
            return viewD;
        }
        return view;
    }

    @Override // androidx.compose.ui.node.x1
    public void g(@NotNull androidx.compose.ui.node.l0 l0Var, int i10) {
        androidx.compose.ui.autofill.b bVar;
        if (B0() && androidx.compose.ui.k.f39200c && (bVar = this.f40193v3) != null) {
            bVar.l(l0Var, i10);
        }
        getRectManager().n(l0Var, true);
    }

    public final void g1() {
        this.f40196w3 = true;
    }

    @NotNull
    public final t0 getAndroidViewsHandler$ui_release() {
        if (this.B3 == null) {
            t0 t0Var = new t0(getContext());
            this.B3 = t0Var;
            addView(t0Var);
            requestLayout();
        }
        t0 t0Var2 = this.B3;
        Intrinsics.checkNotNull(t0Var2);
        return t0Var2;
    }

    @Override // androidx.compose.ui.node.x1
    @Nullable
    public androidx.compose.ui.autofill.h getAutofill() {
        return this.f40190u3;
    }

    @Override // androidx.compose.ui.node.x1
    @Nullable
    public androidx.compose.ui.autofill.m getAutofillManager() {
        return this.f40193v3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.autofill.q getAutofillTree() {
        return this.f40167m3;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.f40188t3;
    }

    @NotNull
    public final androidx.compose.ui.contentcapture.b getContentCaptureManager$ui_release() {
        return this.f40158j3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f40160k;
    }

    @Override // androidx.compose.ui.node.x1, androidx.compose.ui.node.g2
    @NotNull
    public androidx.compose.ui.unit.d getDensity() {
        return (androidx.compose.ui.unit.d) this.f40142d.getValue();
    }

    @Override // androidx.compose.ui.focus.a1
    @Nullable
    public n0.j getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().x();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return androidx.compose.ui.focus.n.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.focus.w getFocusOwner() {
        return this.f40157j;
    }

    @Override // android.view.View
    public void getFocusedRect(@NotNull Rect rect) {
        n0.j embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.t());
            rect.top = Math.round(embeddedViewFocusRect.B());
            rect.right = Math.round(embeddedViewFocusRect.x());
            rect.bottom = Math.round(embeddedViewFocusRect.j());
            return;
        }
        if (Intrinsics.areEqual(getFocusOwner().i(androidx.compose.ui.focus.f.f37408b.a(), null, k.f40216a), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.text.font.y.b getFontFamilyResolver() {
        return (androidx.compose.ui.text.font.y.b) this.f40137a4.getValue();
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.text.font.x.b getFontLoader() {
        return this.Z3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.graphics.o1 getGraphicsContext() {
        return this.f40164l3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public p0.a getHapticFeedBack() {
        return this.f40143d4;
    }

    @Override // androidx.compose.ui.platform.u4
    public boolean getHasPendingMeasureOrLayout() {
        return this.F3.p();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public q0.b getInputModeManager() {
        return this.f40145e4;
    }

    @NotNull
    public final androidx.compose.ui.layout.x getInsetsListener() {
        return this.f40195w;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.L3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return (androidx.compose.ui.unit.w) this.f40141c4.getValue();
    }

    @Override // androidx.compose.ui.node.x1
    public long getMeasureIteration() {
        return this.F3.s();
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.modifier.h getModifierLocalManager() {
        return this.f40147f4;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.layout.i2.a getPlacementScope() {
        return androidx.compose.ui.layout.j2.b(this);
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.input.pointer.z getPointerIconService() {
        return this.f40194v4;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.spatial.f getRectManager() {
        return this.H1;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.node.l0 getRoot() {
        return this.f40175p0;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.node.g2 getRootForTest() {
        return this.f40177p2;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        androidx.compose.ui.scrollcapture.k kVar;
        if (Build.VERSION.SDK_INT < 31 || (kVar = this.f40189t4) == null) {
            return false;
        }
        return kVar.c();
    }

    @Override // androidx.compose.ui.node.x1, androidx.compose.ui.node.g2
    @NotNull
    public androidx.compose.ui.semantics.x getSemanticsOwner() {
        return this.f40152h3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.node.n0 getSharedDrawScope() {
        return this.f40140c;
    }

    @Override // androidx.compose.ui.node.x1
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? x0.f40951a.a(this) : this.A3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.node.z1 getSnapshotObserver() {
        return this.f40201z3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public z3 getSoftwareKeyboardController() {
        return this.Y3;
    }

    @Override // androidx.compose.ui.node.x1, androidx.compose.ui.node.g2
    @NotNull
    public androidx.compose.ui.text.input.a1 getTextInputService() {
        return this.W3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public e4 getTextToolbar() {
        return this.f40150g4;
    }

    @Nullable
    public final androidx.compose.ui.node.g2.a getUncaughtExceptionHandler$ui_release() {
        return this.f40149g3;
    }

    @Override // androidx.compose.ui.platform.u4
    @NotNull
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public o4 getViewConfiguration() {
        return this.f40192v;
    }

    @Nullable
    public final b getViewTreeOwners() {
        return (b) this.Q3.getValue();
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public w4 getWindowInfo() {
        return this.f40166m;
    }

    @Nullable
    public final androidx.compose.ui.autofill.b get_autofillManager$ui_release() {
        return this.f40193v3;
    }

    @Override // androidx.compose.ui.node.x1
    public void h(@NotNull View view) {
        this.f40180q3 = true;
    }

    @Override // androidx.compose.ui.input.pointer.j
    public void j(@NotNull float[] fArr) {
        b1();
        androidx.compose.ui.graphics.c2.w(fArr, this.J3);
        g0.j(fArr, Float.intBitsToFloat((int) (this.N3 >> 32)), Float.intBitsToFloat((int) (this.N3 & com.rabbitmq.client.k0.f265952a)), this.I3);
    }

    @Override // androidx.compose.ui.node.x1
    public void k(@NotNull androidx.compose.ui.node.l0 l0Var) {
        androidx.compose.ui.autofill.b bVar;
        if (B0() && androidx.compose.ui.k.f39200c && (bVar = this.f40193v3) != null) {
            bVar.o(l0Var);
        }
    }

    @Override // androidx.compose.ui.node.x1
    public void l(@NotNull androidx.compose.ui.node.x1.b bVar) {
        this.F3.E(bVar);
        j1(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.g2
    public void m() {
        androidx.compose.ui.node.x1.d(this, false, 1, null);
    }

    @Override // androidx.compose.ui.platform.u4
    public boolean n() {
        androidx.lifecycle.o0 o0VarA;
        androidx.lifecycle.c0 lifecycle;
        b viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (o0VarA = viewTreeOwners.a()) == null || (lifecycle = o0VarA.getLifecycle()) == null) ? null : lifecycle.d()) == androidx.lifecycle.c0.b.RESUMED;
    }

    @Override // androidx.compose.ui.node.v1
    public void o(@NotNull final Function0<Unit> function0) {
        Handler handler = getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new Runnable() { // from class: androidx.compose.ui.platform.m
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.h1(function0);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        androidx.lifecycle.o0 o0VarA;
        androidx.lifecycle.c0 lifecycle;
        androidx.lifecycle.o0 o0VarA2;
        androidx.compose.ui.autofill.a aVar;
        super.onAttachedToWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            setShowLayoutBounds(f40134y4.h());
        }
        if (androidx.compose.ui.k.f39203f) {
            this.f40195w.onViewAttachedToWindow(this);
        }
        f40134y4.e(this);
        this.f40166m.g(hasWindowFocus());
        this.f40166m.f(new n());
        s1();
        T0(getRoot());
        S0(getRoot());
        getSnapshotObserver().k();
        if (B0() && (aVar = this.f40190u3) != null) {
            androidx.compose.ui.autofill.l.f36984a.a(aVar);
        }
        androidx.lifecycle.o0 o0VarA3 = androidx.lifecycle.n2.a(this);
        androidx.savedstate.m mVarA = androidx.savedstate.r.a(this);
        b viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.c0 lifecycle2 = null;
        if (viewTreeOwners == null || (o0VarA3 != null && mVarA != null && (o0VarA3 != viewTreeOwners.a() || mVarA != viewTreeOwners.a()))) {
            if (o0VarA3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (mVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (o0VarA = viewTreeOwners.a()) != null && (lifecycle = o0VarA.getLifecycle()) != null) {
                lifecycle.g(this);
            }
            o0VarA3.getLifecycle().c(this);
            b bVar = new b(o0VarA3, mVarA);
            set_viewTreeOwners(bVar);
            Function1<? super b, Unit> function1 = this.R3;
            if (function1 != null) {
                function1.invoke(bVar);
            }
            this.R3 = null;
        }
        this.f40145e4.c(isInTouchMode() ? q0.a.f350233b.b() : q0.a.f350233b.a());
        b viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (o0VarA2 = viewTreeOwners2.a()) != null) {
            lifecycle2 = o0VarA2.getLifecycle();
        }
        if (lifecycle2 == null) {
            s0.a.j("No lifecycle owner exists");
            throw new kotlin.a0();
        }
        lifecycle2.c(this);
        lifecycle2.c(this.f40158j3);
        getViewTreeObserver().addOnGlobalLayoutListener(this.S3);
        getViewTreeObserver().addOnScrollChangedListener(this.T3);
        getViewTreeObserver().addOnTouchModeChangeListener(this.U3);
        if (i10 >= 31) {
            d0.f40389a.b(this);
        }
        androidx.compose.ui.autofill.b bVar2 = this.f40193v3;
        if (bVar2 != null) {
            getFocusOwner().d().a0(bVar2);
            getSemanticsOwner().b().a0(bVar2);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        j0 j0Var = (j0) androidx.compose.ui.g0.f(this.X3);
        return j0Var == null ? this.V3.s() : j0Var.j();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(androidx.compose.ui.unit.a.a(getContext()));
        s1();
        if (N0(configuration) != this.f40139b4) {
            this.f40139b4 = N0(configuration);
            setFontFamilyResolver(androidx.compose.ui.text.font.h0.a(getContext()));
        }
        this.f40188t3.invoke(configuration);
    }

    @Override // android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo editorInfo) {
        j0 j0Var = (j0) androidx.compose.ui.g0.f(this.X3);
        return j0Var == null ? this.V3.o(editorInfo) : j0Var.i(editorInfo);
    }

    @Override // android.view.View
    @androidx.annotation.w0(31)
    public void onCreateVirtualViewTranslationRequests(@NotNull long[] jArr, @NotNull int[] iArr, @NotNull Consumer<ViewTranslationRequest> consumer) {
        this.f40158j3.y(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.compose.ui.autofill.a aVar;
        androidx.lifecycle.o0 o0VarA;
        super.onDetachedFromWindow();
        if (androidx.compose.ui.k.f39203f) {
            this.f40195w.onViewDetachedFromWindow(this);
        }
        androidx.lifecycle.c0 lifecycle = null;
        if (this.f40146f) {
            View view = this.f40144e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("frameRateCategoryView");
                view = null;
            }
            removeView(view);
        }
        f40134y4.i(this);
        getSnapshotObserver().l();
        this.f40166m.f(null);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (o0VarA = viewTreeOwners.a()) != null) {
            lifecycle = o0VarA.getLifecycle();
        }
        if (lifecycle == null) {
            s0.a.j("No lifecycle owner exists");
            throw new kotlin.a0();
        }
        lifecycle.g(this.f40158j3);
        lifecycle.g(this);
        if (B0() && (aVar = this.f40190u3) != null) {
            androidx.compose.ui.autofill.l.f36984a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.S3);
        getViewTreeObserver().removeOnScrollChangedListener(this.T3);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.U3);
        if (Build.VERSION.SDK_INT >= 31) {
            d0.f40389a.a(this);
        }
        androidx.compose.ui.autofill.b bVar = this.f40193v3;
        if (bVar != null) {
            getSemanticsOwner().b().C0(bVar);
            getFocusOwner().d().C0(bVar);
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, @Nullable Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        getFocusOwner().y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.L3 = 0L;
        this.F3.w(this.f40181q4);
        this.D3 = null;
        r1();
        if (this.B3 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                T0(getRoot());
            }
            long jI0 = I0(i10);
            int iN = (int) kotlin.y1.n(jI0 >>> 32);
            int iN2 = (int) kotlin.y1.n(jI0 & com.rabbitmq.client.k0.f265952a);
            long jI1 = I0(i11);
            long jA = androidx.compose.ui.unit.b.f42658b.a(iN, iN2, (int) kotlin.y1.n(jI1 >>> 32), (int) kotlin.y1.n(com.rabbitmq.client.k0.f265952a & jI1));
            androidx.compose.ui.unit.b bVar = this.D3;
            boolean zG = false;
            if (bVar == null) {
                this.D3 = androidx.compose.ui.unit.b.a(jA);
                this.E3 = false;
            } else {
                if (bVar != null) {
                    zG = androidx.compose.ui.unit.b.g(bVar.x(), jA);
                }
                if (!zG) {
                    this.E3 = true;
                }
            }
            this.F3.U(jA);
            this.F3.z();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this.B3 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Unit unit = Unit.f312394a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@Nullable ViewStructure viewStructure, int i10) {
        androidx.compose.ui.autofill.b bVar;
        if (!B0() || viewStructure == null) {
            return;
        }
        if (androidx.compose.ui.k.f39200c && (bVar = this.f40193v3) != null) {
            bVar.n(viewStructure);
        }
        androidx.compose.ui.autofill.a aVar = this.f40190u3;
        if (aVar != null) {
            androidx.compose.ui.autofill.e.b(aVar, viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @androidx.annotation.w0(24)
    @NotNull
    public PointerIcon onResolvePointerIcon(@NotNull MotionEvent motionEvent, int i10) {
        androidx.compose.ui.input.pointer.x xVarC;
        int toolType = motionEvent.getToolType(i10);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(androidx.core.view.f0.f48711n) || !(toolType == 2 || toolType == 4) || (xVarC = getPointerIconService().c()) == null) ? super.onResolvePointerIcon(motionEvent, i10) : e0.f40429a.b(getContext(), xVarC);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull androidx.lifecycle.o0 o0Var) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(f40134y4.h());
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (this.f40138b) {
            androidx.compose.ui.unit.w wVarF = androidx.compose.ui.focus.n.f(i10);
            if (wVarF == null) {
                wVarF = androidx.compose.ui.unit.w.Ltr;
            }
            setLayoutDirection(wVarF);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(@NotNull Rect rect, @NotNull Point point, @NotNull Consumer<ScrollCaptureTarget> consumer) {
        androidx.compose.ui.scrollcapture.k kVar;
        if (Build.VERSION.SDK_INT < 31 || (kVar = this.f40189t4) == null) {
            return;
        }
        kVar.d(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    @androidx.annotation.w0(31)
    public void onVirtualViewTranslationResponses(@NotNull LongSparseArray<ViewTranslationResponse> longSparseArray) {
        androidx.compose.ui.contentcapture.b bVar = this.f40158j3;
        bVar.D(bVar, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean zH;
        this.f40166m.g(z10);
        int i10 = 2 | 1;
        this.f40186s4 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zH = f40134y4.h())) {
            return;
        }
        setShowLayoutBounds(zH);
        S();
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.node.w1 p(@NotNull Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2, @NotNull Function0<Unit> function0, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        if (cVar != null) {
            return new j2(cVar, null, this, function2, function0);
        }
        androidx.compose.ui.node.w1 w1VarC = this.f40159j4.c();
        if (w1VarC == null) {
            return new j2(getGraphicsContext().b(), getGraphicsContext(), this, function2, function0);
        }
        w1VarC.b(function2, function0);
        return w1VarC;
    }

    @Override // androidx.compose.ui.node.x1
    public void q(@NotNull androidx.compose.ui.node.l0 l0Var, long j10) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.F3.y(l0Var, j10);
            if (!this.F3.p()) {
                androidx.compose.ui.node.y0.f(this.F3, false, 1, null);
                J0();
            }
            if (androidx.compose.ui.k.f39199b) {
                getRectManager().e();
            }
            Unit unit = Unit.f312394a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.compose.ui.node.g2
    public boolean r(@NotNull KeyEvent keyEvent) {
        if (getFocusOwner().h(keyEvent)) {
            return true;
        }
        int i10 = 6 ^ 0;
        return androidx.compose.ui.focus.w.g(getFocusOwner(), keyEvent, null, 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, @Nullable Rect rect) {
        if (!androidx.compose.ui.k.f39201d) {
            if (isFocused()) {
                return true;
            }
            if (getFocusOwner().w().n()) {
                return super.requestFocus(i10, rect);
            }
            androidx.compose.ui.focus.f fVarD = androidx.compose.ui.focus.n.d(i10);
            int iO = fVarD != null ? fVarD.o() : androidx.compose.ui.focus.f.f37408b.b();
            return Intrinsics.areEqual(getFocusOwner().i(iO, rect != null ? androidx.compose.ui.graphics.c3.e(rect) : null, new p(iO)), Boolean.TRUE);
        }
        if (isFocused()) {
            return true;
        }
        if (this.f40169n) {
            return false;
        }
        androidx.compose.ui.focus.f fVarD2 = androidx.compose.ui.focus.n.d(i10);
        int iO2 = fVarD2 != null ? fVarD2.o() : androidx.compose.ui.focus.f.f37408b.b();
        if (hasFocus() && z(iO2)) {
            return true;
        }
        kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
        Boolean boolI = getFocusOwner().i(iO2, rect != null ? androidx.compose.ui.graphics.c3.e(rect) : null, new r(aVar, iO2));
        if (boolI == null) {
            return false;
        }
        if (boolI.booleanValue()) {
            return true;
        }
        if (aVar.f312744a) {
            return false;
        }
        if (rect != null && !hasFocus() && Intrinsics.areEqual(getFocusOwner().i(iO2, null, new q(iO2)), Boolean.TRUE)) {
            return true;
        }
        View viewL0 = L0(i10);
        if (viewL0 != null && viewL0 != this) {
            this.f40169n = true;
            boolean zRequestFocus = viewL0.requestFocus(i10);
            this.f40169n = false;
            return zRequestFocus;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.x1
    public long s(long j10) {
        b1();
        return androidx.compose.ui.graphics.c2.j(this.K3, j10);
    }

    @Override // androidx.compose.ui.node.g2
    public void setAccessibilityEventBatchIntervalMillis(long j10) {
        this.f40155i3.T0(j10);
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        this.f40188t3 = function1;
    }

    public final void setContentCaptureManager$ui_release(@NotNull androidx.compose.ui.contentcapture.b bVar) {
        this.f40158j3 = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7 */
    public void setCoroutineContext(@NotNull CoroutineContext coroutineContext) {
        this.f40160k = coroutineContext;
        androidx.compose.ui.node.j jVarL = getRoot().A0().l();
        if (jVarL instanceof androidx.compose.ui.input.pointer.y0) {
            ((androidx.compose.ui.input.pointer.y0) jVarL).A6();
        }
        int iB = androidx.compose.ui.node.m1.b(16);
        if (!jVarL.w().a9()) {
            s0.a.i("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVarL.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar, jVarL.w(), false);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVar2 = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVar2.N8() & iB) != 0) {
                for (androidx.compose.ui.a0.d dVarO9 = dVar2; dVarO9 != null; dVarO9 = dVarO9.O8()) {
                    if ((dVarO9.T8() & iB) != 0) {
                        androidx.compose.ui.a0.d dVarN = dVarO9;
                        androidx.compose.runtime.collection.d dVar3 = null;
                        while (dVarN != 0) {
                            if (dVarN instanceof androidx.compose.ui.node.d2) {
                                androidx.compose.ui.node.d2 d2Var = (androidx.compose.ui.node.d2) dVarN;
                                if (d2Var instanceof androidx.compose.ui.input.pointer.y0) {
                                    ((androidx.compose.ui.input.pointer.y0) d2Var).A6();
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9();
                                int i10 = 0;
                                dVarN = dVarN;
                                while (dVarY9 != null) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != 0) {
                                                dVar3.d(dVarN);
                                                dVarN = 0;
                                            }
                                            dVar3.d(dVarY9);
                                        }
                                    }
                                    dVarY9 = dVarY9.O8();
                                    dVarN = dVarN;
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar3);
                        }
                    }
                }
            }
            androidx.compose.ui.node.k.c(dVar, dVar2, false);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.L3 = j10;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super b, Unit> function1) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.R3 = function1;
        }
    }

    @Override // androidx.compose.ui.node.x1
    public void setShowLayoutBounds(boolean z10) {
        this.A3 = z10;
    }

    @Override // androidx.compose.ui.node.g2
    public void setUncaughtExceptionHandler(@Nullable androidx.compose.ui.node.g2.a aVar) {
        this.f40149g3 = aVar;
        this.F3.T(aVar);
    }

    public final void setUncaughtExceptionHandler$ui_release(@Nullable androidx.compose.ui.node.g2.a aVar) {
        this.f40149g3 = aVar;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.x1
    public void u(@NotNull androidx.compose.ui.node.l0 l0Var, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            if (this.F3.L(l0Var, z11) && z12) {
                i1(l0Var);
            }
        } else if (this.F3.Q(l0Var, z11) && z12) {
            i1(l0Var);
        }
    }

    @Override // androidx.compose.ui.node.x1
    public void v() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.f40197w4 == 0) {
                androidx.compose.ui.platform.x.f40950a.a(getView(), true);
            }
            this.f40197w4++;
        }
    }

    @Override // androidx.compose.ui.input.pointer.s0
    public long w(long j10) {
        b1();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (this.N3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) - Float.intBitsToFloat((int) (this.N3 & com.rabbitmq.client.k0.f265952a));
        return androidx.compose.ui.graphics.c2.j(this.K3, n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)));
    }

    @Override // androidx.compose.ui.node.x1
    public void x() {
        androidx.compose.ui.autofill.b bVar;
        if (this.f40196w3) {
            getSnapshotObserver().b();
            this.f40196w3 = false;
        }
        t0 t0Var = this.B3;
        if (t0Var != null) {
            F0(t0Var);
        }
        if (B0() && androidx.compose.ui.k.f39200c && (bVar = this.f40193v3) != null) {
            bVar.i();
        }
        while (this.f40162k4.I() && this.f40162k4.y(0) != null) {
            int iC = this.f40162k4.C();
            for (int i10 = 0; i10 < iC; i10++) {
                Function0<Unit> function0Y = this.f40162k4.y(i10);
                this.f40162k4.S0(i10, null);
                if (function0Y != null) {
                    function0Y.invoke();
                }
            }
            this.f40162k4.L0(0, iC);
        }
    }

    @Override // androidx.compose.ui.node.x1
    public void y() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.f40197w4 == 1) {
                androidx.compose.ui.platform.x.f40950a.a(getView(), false);
            }
            this.f40197w4--;
        }
    }

    @Override // androidx.compose.ui.focus.a1
    public boolean z(int i10) {
        t0 t0Var;
        Rect rectB = null;
        if (!androidx.compose.ui.k.f39201d) {
            androidx.compose.ui.focus.f.a aVar = androidx.compose.ui.focus.f.f37408b;
            if (androidx.compose.ui.focus.f.l(i10, aVar.b()) || androidx.compose.ui.focus.f.l(i10, aVar.c())) {
                return false;
            }
            Integer numC = androidx.compose.ui.focus.n.c(i10);
            if (numC == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            n0.j embeddedViewFocusRect = getEmbeddedViewFocusRect();
            rectB = embeddedViewFocusRect != null ? androidx.compose.ui.graphics.c3.b(embeddedViewFocusRect) : null;
            d2 d2VarA = d2.f40392f.a();
            View viewD = rectB == null ? d2VarA.d(this, findFocus(), iIntValue) : d2VarA.f(this, rectB, iIntValue);
            if (viewD != null) {
                return androidx.compose.ui.focus.n.b(viewD, Integer.valueOf(iIntValue), rectB);
            }
            return false;
        }
        androidx.compose.ui.focus.f.a aVar2 = androidx.compose.ui.focus.f.f37408b;
        if (!androidx.compose.ui.focus.f.l(i10, aVar2.b()) && !androidx.compose.ui.focus.f.l(i10, aVar2.c()) && hasFocus() && (t0Var = this.B3) != null) {
            Integer numC2 = androidx.compose.ui.focus.n.c(i10);
            if (numC2 == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            View rootView = getRootView();
            Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) rootView;
            View viewFindFocus = viewGroup.findFocus();
            if (viewFindFocus == null) {
                throw new IllegalStateException("view hasFocus but root can't find it");
            }
            View viewD2 = d2.f40392f.a().d(viewGroup, viewFindFocus, iIntValue2);
            if (!androidx.compose.ui.focus.x.a(i10) || !t0Var.hasFocus()) {
                n0.j embeddedViewFocusRect2 = getEmbeddedViewFocusRect();
                rectB = embeddedViewFocusRect2 != null ? androidx.compose.ui.graphics.c3.b(embeddedViewFocusRect2) : null;
                if (viewD2 != null && rectB != null) {
                    viewGroup.offsetDescendantRectToMyCoords(this, rectB);
                    viewGroup.offsetRectIntoDescendantCoords(viewD2, rectB);
                }
            }
            if (viewD2 == null || viewD2 == viewFindFocus) {
                return false;
            }
            View focusedChild = t0Var.getFocusedChild();
            ViewParent parent = viewD2.getParent();
            while (parent != null && parent != focusedChild) {
                parent = parent.getParent();
            }
            if (parent == null) {
                return false;
            }
            return androidx.compose.ui.focus.n.b(viewD2, Integer.valueOf(iIntValue2), rectB);
        }
        return false;
    }

    public final void z0(@NotNull androidx.compose.ui.viewinterop.b bVar, @NotNull androidx.compose.ui.node.l0 l0Var) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(bVar, l0Var);
        getAndroidViewsHandler$ui_release().addView(bVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(l0Var, bVar);
        bVar.setImportantForAccessibility(1);
        androidx.core.view.u1.G1(bVar, new d(l0Var, this));
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10) {
        Intrinsics.checkNotNull(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i10, layoutParams);
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.platform.d getAccessibilityManager() {
        return this.f40161k3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.platform.e getClipboard() {
        return this.f40200y3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.compose.ui.platform.f getClipboardManager() {
        return this.f40198x3;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.f40163l;
    }

    @Override // androidx.compose.ui.node.x1
    @NotNull
    public androidx.collection.t1<androidx.compose.ui.node.l0> getLayoutNodes() {
        return this.f40176p1;
    }

    @Override // androidx.compose.ui.node.x1
    @Nullable
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        Unit unit = Unit.f312394a;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }
}
