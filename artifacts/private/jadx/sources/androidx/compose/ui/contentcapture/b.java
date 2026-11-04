package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.l1;
import androidx.collection.j0;
import androidx.collection.k0;
import androidx.collection.k2;
import androidx.collection.t1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.x1;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.w3;
import androidx.compose.ui.platform.x3;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.d0;
import androidx.compose.ui.semantics.o;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.semantics.y;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.text.o3;
import androidx.compose.ui.text.p3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.a0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.channels.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 8 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,665:1\n405#1,4:813\n409#1,5:818\n390#2,3:666\n354#2,6:669\n364#2,3:676\n367#2,2:680\n425#2:682\n370#2,6:683\n393#2:689\n425#2:693\n425#2:694\n390#2,3:701\n354#2,6:704\n364#2,3:711\n367#2,2:715\n370#2,6:770\n393#2:776\n382#2,4:782\n354#2,6:786\n364#2,3:793\n367#2,9:797\n386#2:806\n425#2:817\n397#2,3:833\n354#2,6:836\n364#2,3:843\n367#2,9:847\n400#2:856\n397#2,3:857\n354#2,6:860\n364#2,3:867\n367#2,9:871\n400#2:880\n397#2,3:881\n354#2,6:884\n364#2,3:891\n367#2,9:895\n400#2:904\n1399#3:675\n1270#3:679\n1399#3:710\n1270#3:714\n1399#3:731\n1270#3:735\n1399#3:755\n1270#3:759\n1399#3:792\n1270#3:796\n1399#3:842\n1270#3:846\n1399#3:866\n1270#3:870\n1399#3:890\n1270#3:894\n35#4,3:690\n39#4:700\n35#4,5:823\n35#4,5:828\n78#5,5:695\n78#5,5:717\n78#5,5:777\n365#6,3:722\n329#6,6:725\n339#6,3:732\n342#6,9:736\n368#6:745\n365#6,3:746\n329#6,6:749\n339#6,3:756\n342#6,9:760\n368#6:769\n57#7,6:807\n27#8,3:905\n27#8,5:908\n31#8:913\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n*L\n397#1:813,4\n397#1:818,5\n225#1:666,3\n225#1:669,6\n225#1:676,3\n225#1:680,2\n226#1:682\n225#1:683,6\n225#1:689\n244#1:693\n245#1:694\n260#1:701,3\n260#1:704,6\n260#1:711,3\n260#1:715,2\n260#1:770,6\n260#1:776\n315#1:782,4\n315#1:786,6\n315#1:793,3\n315#1:797,9\n315#1:806\n398#1:817\n522#1:833,3\n522#1:836,6\n522#1:843,3\n522#1:847,9\n522#1:856\n531#1:857,3\n531#1:860,6\n531#1:867,3\n531#1:871,9\n531#1:880\n540#1:881,3\n540#1:884,6\n540#1:891,3\n540#1:895,9\n540#1:904\n225#1:675\n225#1:679\n260#1:710\n260#1:714\n271#1:731\n271#1:735\n281#1:755\n281#1:759\n315#1:792\n315#1:796\n522#1:842\n522#1:846\n531#1:866\n531#1:870\n540#1:890\n540#1:894\n242#1:690,3\n242#1:700\n451#1:823,5\n486#1:828,5\n248#1:695,5\n265#1:717,5\n308#1:777,5\n271#1:722,3\n271#1:725,6\n271#1:732,3\n271#1:736,9\n271#1:745\n281#1:746,3\n281#1:749,6\n281#1:756,3\n281#1:760,9\n281#1:769\n389#1:807,6\n134#1:905,3\n143#1:908,5\n134#1:913\n*E\n"})
public final class b implements n, DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final a f37077s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f37078t = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f37079v = "android.view.contentcapture.EventTimestamp";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f37080w = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f37081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Function0<? extends androidx.compose.ui.platform.coreshims.b> f37082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.platform.coreshims.b f37083c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f37091k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private w3 f37093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37094n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<l> f37084d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37085e = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private EnumC0279b f37086f = EnumC0279b.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37087g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final p<Unit> f37088h = s.d(1, null, null, 6, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Handler f37089i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private j0<w> f37090j = k0.d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private t1<w3> f37092l = k0.j();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Runnable f37095o = new Runnable() { // from class: androidx.compose.ui.contentcapture.a
        @Override // java.lang.Runnable
        public final void run() {
            b.j(this.f37076a);
        }
    };

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.contentcapture.b$b, reason: collision with other inner class name */
    private enum EnumC0279b {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f37099d = kotlin.enums.c.c(k());

        static {
            int i10 = 5 & 0;
        }

        @NotNull
        public static kotlin.enums.a<EnumC0279b> l() {
            return f37099d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(31)
    @SourceDebugExtension({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,665:1\n13437#2,2:666\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n*L\n559#1:666,2\n*E\n"})
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f37100a = new c();

        private c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void b(b bVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            w wVarN;
            u uVarB;
            androidx.compose.ui.semantics.a aVar;
            Function1 function1;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                long jKeyAt = longSparseArray.keyAt(i10);
                ViewTranslationResponse viewTranslationResponseA = androidx.compose.ui.contentcapture.c.a(longSparseArray.get(jKeyAt));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (wVarN = bVar.o().n((int) jKeyAt)) != null && (uVarB = wVarN.b()) != null && (aVar = (androidx.compose.ui.semantics.a) o.a(uVarB.F(), androidx.compose.ui.semantics.n.f41142a.C())) != null && (function1 = (Function1) aVar.a()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(b bVar, LongSparseArray longSparseArray) {
            f37100a.b(bVar, longSparseArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @androidx.annotation.w0(31)
        public final void c(@NotNull b bVar, @NotNull long[] jArr, @NotNull int[] iArr, @NotNull Consumer<ViewTranslationRequest> consumer) {
            u uVarB;
            String strR;
            for (long j10 : jArr) {
                w wVarN = bVar.o().n((int) j10);
                if (wVarN != null && (uVarB = wVarN.b()) != null) {
                    j.a();
                    ViewTranslationRequest.Builder builderA = i.a(bVar.r().getAutofillId(), uVarB.s());
                    List list = (List) o.a(uVarB.F(), z.f41190a.L());
                    if (list != null && (strR = androidx.compose.ui.util.d.r(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builderA.setValue("android:text", TranslationRequestValue.forText(new androidx.compose.ui.text.f(strR, null, 2, 0 == true ? 1 : 0)));
                        consumer.accept(builderA.build());
                    }
                }
            }
        }

        @androidx.annotation.w0(31)
        public final void d(@NotNull final b bVar, @NotNull final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(bVar, longSparseArray);
            } else {
                bVar.r().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c.e(bVar, longSparseArray);
                    }
                });
            }
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37101a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37101a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", i = {}, l = {187, 196}, m = "boundsUpdatesEventLoop$ui_release", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37103b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f37105d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37103b = obj;
            this.f37105d |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    static final class f extends l0 implements Function2<Integer, u, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w3 f37106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f37107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(w3 w3Var, b bVar) {
            super(2);
            this.f37106a = w3Var;
            this.f37107b = bVar;
        }

        public final void c(int i10, u uVar) {
            if (!this.f37106a.a().d(uVar.s())) {
                this.f37107b.M(i10, uVar);
                this.f37107b.w();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, u uVar) {
            c(num.intValue(), uVar);
            return Unit.f312394a;
        }
    }

    static final class g extends l0 implements Function2<Integer, u, Unit> {
        g() {
            super(2);
        }

        public final void c(int i10, u uVar) {
            b.this.M(i10, uVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, u uVar) {
            c(num.intValue(), uVar);
            return Unit.f312394a;
        }
    }

    public b(@NotNull AndroidComposeView androidComposeView, @NotNull Function0<? extends androidx.compose.ui.platform.coreshims.b> function0) {
        this.f37081a = androidComposeView;
        this.f37082b = function0;
        this.f37093m = new w3(androidComposeView.getSemanticsOwner().e(), k0.d());
    }

    private final void E(u uVar, w3 w3Var) {
        l(uVar, new f(w3Var, this));
        List<u> listB = uVar.B();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar2 = listB.get(i10);
            if (o().e(uVar2.s()) && this.f37092l.e(uVar2.s())) {
                w3 w3VarN = this.f37092l.n(uVar2.s());
                if (w3VarN == null) {
                    s0.a.j("node not present in pruned tree before this change");
                    throw new a0();
                }
                E(uVar2, w3VarN);
            }
        }
    }

    private final void F() {
        t1<w3> t1Var = this.f37092l;
        int[] iArr = t1Var.f12302b;
        long[] jArr = t1Var.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = iArr[(i10 << 3) + i12];
                        if (!o().e(i13)) {
                            g(i13);
                            w();
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void G(int i10, String str) {
        androidx.compose.ui.platform.coreshims.b bVar = this.f37083c;
        if (bVar == null) {
            return;
        }
        AutofillId autofillIdB = bVar.b(i10);
        if (autofillIdB != null) {
            bVar.f(autofillIdB, str);
        } else {
            s0.a.j("Invalid content capture ID");
            throw new a0();
        }
    }

    private final void K() {
        androidx.compose.ui.semantics.a aVar;
        Function1 function1;
        j0<w> j0VarO = o();
        Object[] objArr = j0VarO.f12303c;
        long[] jArr = j0VarO.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        SemanticsConfiguration semanticsConfigurationF = ((w) objArr[(i10 << 3) + i12]).b().F();
                        if (Intrinsics.areEqual(o.a(semanticsConfigurationF, z.f41190a.x()), Boolean.FALSE) && (aVar = (androidx.compose.ui.semantics.a) o.a(semanticsConfigurationF, androidx.compose.ui.semantics.n.f41142a.D())) != null && (function1 = (Function1) aVar.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final androidx.compose.ui.platform.coreshims.d L(u uVar, int i10) {
        androidx.compose.ui.platform.coreshims.a aVarA;
        AutofillId autofillIdA;
        String strE;
        androidx.compose.ui.platform.coreshims.b bVar = this.f37083c;
        if (bVar == null || (aVarA = androidx.compose.ui.platform.coreshims.c.a(this.f37081a)) == null) {
            return null;
        }
        u uVarX = uVar.x();
        if (uVarX != null) {
            autofillIdA = bVar.b(uVarX.s());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = aVarA.a();
        }
        androidx.compose.ui.platform.coreshims.d dVarC = bVar.c(autofillIdA, uVar.s());
        if (dVarC == null) {
            return null;
        }
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        z zVar = z.f41190a;
        if (semanticsConfigurationF.i(zVar.D())) {
            return null;
        }
        Bundle bundleA = dVarC.a();
        if (bundleA != null) {
            bundleA.putLong(f37079v, this.f37091k);
            bundleA.putInt(f37080w, i10);
        }
        String str = (String) o.a(semanticsConfigurationF, zVar.K());
        if (str != null) {
            dVarC.e(uVar.s(), null, null, str);
        }
        if (((Boolean) o.a(semanticsConfigurationF, zVar.y())) != null) {
            dVarC.b("android.widget.ViewGroup");
        }
        List list = (List) o.a(semanticsConfigurationF, zVar.L());
        if (list != null) {
            dVarC.b("android.widget.TextView");
            dVarC.f(androidx.compose.ui.util.d.r(list, "\n", null, null, 0, null, null, 62, null));
        }
        androidx.compose.ui.text.f fVar = (androidx.compose.ui.text.f) o.a(semanticsConfigurationF, zVar.g());
        if (fVar != null) {
            dVarC.b(androidx.compose.ui.platform.s.T);
            dVarC.f(fVar);
        }
        List list2 = (List) o.a(semanticsConfigurationF, zVar.d());
        if (list2 != null) {
            dVarC.c(androidx.compose.ui.util.d.r(list2, "\n", null, null, 0, null, null, 62, null));
        }
        androidx.compose.ui.semantics.j jVar = (androidx.compose.ui.semantics.j) o.a(semanticsConfigurationF, zVar.F());
        if (jVar != null && (strE = x3.e(jVar.p())) != null) {
            dVarC.b(strE);
        }
        p3 p3VarC = x3.c(semanticsConfigurationF);
        if (p3VarC != null) {
            o3 o3VarL = p3VarC.l();
            dVarC.g(androidx.compose.ui.unit.z.n(o3VarL.m().x()) * o3VarL.d().getDensity() * o3VarL.d().m0(), 0, 0, 0);
        }
        n0.j jVarL = uVar.l();
        dVarC.d((int) jVarL.t(), (int) jVarL.B(), 0, 0, (int) (jVarL.x() - jVarL.t()), (int) (jVarL.j() - jVarL.B()));
        return dVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i10, u uVar) {
        if (u()) {
            P(uVar);
            f(uVar.s(), L(uVar, i10));
            l(uVar, new g());
        }
    }

    private final void N(u uVar) {
        if (u()) {
            g(uVar.s());
            List<u> listB = uVar.B();
            int size = listB.size();
            boolean z10 = true & false;
            for (int i10 = 0; i10 < size; i10++) {
                N(listB.get(i10));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0064 A[LOOP:0: B:5:0x0017->B:15:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[EDGE_INSN: B:19:0x0067->B:16:0x0067 BREAK  A[LOOP:0: B:5:0x0017->B:15:0x0064], SYNTHETIC] */
    private final void O() {
        this.f37092l.P();
        j0<w> j0VarO = o();
        int[] iArr = j0VarO.f12302b;
        Object[] objArr = j0VarO.f12303c;
        long[] jArr = j0VarO.f12301a;
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
                            this.f37092l.j0(iArr[i13], new w3(((w) objArr[i13]).b(), o()));
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
        this.f37093m = new w3(this.f37081a.getSemanticsOwner().e(), o());
    }

    private final void P(u uVar) {
        androidx.compose.ui.semantics.a aVar;
        Function1 function1;
        Function1 function2;
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        Boolean bool = (Boolean) o.a(semanticsConfigurationF, z.f41190a.x());
        if (this.f37086f == EnumC0279b.SHOW_ORIGINAL && Intrinsics.areEqual(bool, Boolean.TRUE)) {
            androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) o.a(semanticsConfigurationF, androidx.compose.ui.semantics.n.f41142a.D());
            if (aVar2 != null && (function2 = (Function1) aVar2.a()) != null) {
            }
        } else if (this.f37086f == EnumC0279b.SHOW_TRANSLATED && Intrinsics.areEqual(bool, Boolean.FALSE) && (aVar = (androidx.compose.ui.semantics.a) o.a(semanticsConfigurationF, androidx.compose.ui.semantics.n.f41142a.D())) != null && (function1 = (Function1) aVar.a()) != null) {
        }
    }

    private final void f(int i10, androidx.compose.ui.platform.coreshims.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f37084d.add(new l(i10, this.f37091k, m.VIEW_APPEAR, dVar));
    }

    private final void g(int i10) {
        this.f37084d.add(new l(i10, this.f37091k, m.VIEW_DISAPPEAR, null));
    }

    private final void h(j0<w> j0Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        u uVar;
        int i11;
        u uVar2;
        long j12;
        int i12;
        long[] jArr3;
        j0<w> j0Var2 = j0Var;
        int[] iArr3 = j0Var2.f12302b;
        long[] jArr4 = j0Var2.f12301a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr4[i13];
            char c11 = 7;
            long j14 = -9187201950435737472L;
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j13 & 255) < 128) {
                        int i17 = iArr3[(i13 << 3) + i16];
                        c10 = c11;
                        w3 w3VarN = this.f37092l.n(i17);
                        w wVarN = j0Var2.n(i17);
                        u uVarB = wVarN != null ? wVarN.b() : null;
                        if (uVarB == null) {
                            s0.a.j("no value for specified key");
                            throw new a0();
                        }
                        if (w3VarN == null) {
                            k2<d0<?>, Object> k2VarT = uVarB.F().t();
                            j11 = j14;
                            Object[] objArr = k2VarT.f12131b;
                            long[] jArr5 = k2VarT.f12130a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i18 = 0;
                                int i19 = i14;
                                while (true) {
                                    long j15 = jArr5[i18];
                                    iArr2 = iArr3;
                                    if ((((~j15) << c10) & j15 & j11) != j11) {
                                        int i20 = 8 - ((~(i18 - length2)) >>> 31);
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            if ((j15 & 255) < 128) {
                                                i12 = i21;
                                                d0 d0Var = (d0) objArr[(i18 << 3) + i21];
                                                z zVar = z.f41190a;
                                                jArr3 = jArr4;
                                                if (Intrinsics.areEqual(d0Var, zVar.L())) {
                                                    List list = (List) o.a(uVarB.F(), zVar.L());
                                                    G(uVarB.s(), String.valueOf(list != null ? (androidx.compose.ui.text.f) CollectionsKt.firstOrNull(list) : null));
                                                }
                                            } else {
                                                i12 = i21;
                                                jArr3 = jArr4;
                                            }
                                            j15 >>= i19;
                                            i21 = i12 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i20 != i19) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i19 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j11 = j14;
                            k2<d0<?>, Object> k2VarT2 = uVarB.F().t();
                            Object[] objArr2 = k2VarT2.f12131b;
                            long[] jArr6 = k2VarT2.f12130a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j16 = jArr6[i22];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j16) << c10) & j16 & j11) != j11) {
                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            if ((j16 & 255) < 128) {
                                                i11 = i24;
                                                d0 d0Var2 = (d0) objArr3[(i22 << 3) + i24];
                                                z zVar2 = z.f41190a;
                                                uVar2 = uVarB;
                                                if (Intrinsics.areEqual(d0Var2, zVar2.L())) {
                                                    List list2 = (List) o.a(w3VarN.b(), zVar2.L());
                                                    androidx.compose.ui.text.f fVar = list2 != null ? (androidx.compose.ui.text.f) CollectionsKt.firstOrNull(list2) : null;
                                                    j12 = j13;
                                                    List list3 = (List) o.a(uVar2.F(), zVar2.L());
                                                    androidx.compose.ui.text.f fVar2 = list3 != null ? (androidx.compose.ui.text.f) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.areEqual(fVar, fVar2)) {
                                                        G(uVar2.s(), String.valueOf(fVar2));
                                                    }
                                                }
                                                j16 >>= 8;
                                                i24 = i11 + 1;
                                                uVarB = uVar2;
                                                j13 = j12;
                                            } else {
                                                i11 = i24;
                                                uVar2 = uVarB;
                                            }
                                            j12 = j13;
                                            j16 >>= 8;
                                            i24 = i11 + 1;
                                            uVarB = uVar2;
                                            j13 = j12;
                                        }
                                        uVar = uVarB;
                                        j10 = j13;
                                        if (i23 != 8) {
                                            break;
                                        }
                                    } else {
                                        uVar = uVarB;
                                        j10 = j13;
                                    }
                                    if (i22 == length3) {
                                        break;
                                    }
                                    i22++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    uVarB = uVar;
                                    j13 = j10;
                                }
                            }
                            i10 = 8;
                        }
                        j10 = j13;
                        i10 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j10 = j13;
                        c10 = c11;
                        j11 = j14;
                        i10 = i14;
                    }
                    j13 = j10 >> i10;
                    i16++;
                    j0Var2 = j0Var;
                    i14 = i10;
                    c11 = c10;
                    j14 = j11;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i15 != i14) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            j0Var2 = j0Var;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void i() {
        androidx.compose.ui.semantics.a aVar;
        Function0 function0;
        j0<w> j0VarO = o();
        Object[] objArr = j0VarO.f12303c;
        long[] jArr = j0VarO.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        SemanticsConfiguration semanticsConfigurationF = ((w) objArr[(i10 << 3) + i12]).b().F();
                        if (o.a(semanticsConfigurationF, z.f41190a.x()) != null && (aVar = (androidx.compose.ui.semantics.a) o.a(semanticsConfigurationF, androidx.compose.ui.semantics.n.f41142a.a())) != null && (function0 = (Function0) aVar.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(b bVar) {
        if (bVar.u()) {
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                x1.d(bVar.f37081a, false, 1, null);
                bVar.F();
                Trace.beginSection("ContentCapture:sendAppearEvents");
                try {
                    bVar.E(bVar.f37081a.getSemanticsOwner().e(), bVar.f37093m);
                    Unit unit = Unit.f312394a;
                    Trace.endSection();
                    bVar.h(bVar.o());
                    bVar.O();
                    bVar.f37094n = false;
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
    }

    private final <T> void k(List<? extends T> list, Function2<? super Integer, ? super T, Unit> function2, Function1<? super T, Boolean> function1) {
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (function1.invoke(t10).booleanValue()) {
                function2.invoke(Integer.valueOf(i10), t10);
                i10++;
            }
        }
    }

    private final void l(u uVar, Function2<? super Integer, ? super u, Unit> function2) {
        List<u> listB = uVar.B();
        int size = listB.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            u uVar2 = listB.get(i11);
            if (o().e(uVar2.s())) {
                function2.invoke(Integer.valueOf(i10), uVar2);
                i10++;
            }
        }
    }

    @l1
    public static /* synthetic */ void n() {
    }

    private final void s() {
        androidx.compose.ui.semantics.a aVar;
        Function1 function1;
        j0<w> j0VarO = o();
        Object[] objArr = j0VarO.f12303c;
        long[] jArr = j0VarO.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        SemanticsConfiguration semanticsConfigurationF = ((w) objArr[(i10 << 3) + i12]).b().F();
                        if (Intrinsics.areEqual(o.a(semanticsConfigurationF, z.f41190a.x()), Boolean.TRUE) && (aVar = (androidx.compose.ui.semantics.a) o.a(semanticsConfigurationF, androidx.compose.ui.semantics.n.f41142a.D())) != null && (function1 = (Function1) aVar.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void v() {
        androidx.compose.ui.platform.coreshims.b bVar = this.f37083c;
        if (bVar != null && !this.f37084d.isEmpty()) {
            List<l> list = this.f37084d;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                l lVar = list.get(i10);
                int i11 = d.f37101a[lVar.j().ordinal()];
                if (i11 == 1) {
                    androidx.compose.ui.platform.coreshims.d dVarH = lVar.h();
                    if (dVarH != null) {
                        bVar.d(dVarH.h());
                    }
                } else {
                    if (i11 != 2) {
                        throw new kotlin.k0();
                    }
                    AutofillId autofillIdB = bVar.b(lVar.g());
                    if (autofillIdB != null) {
                        bVar.e(autofillIdB);
                    }
                }
            }
            bVar.a();
            this.f37084d.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        this.f37088h.p(Unit.f312394a);
    }

    public final void A() {
        this.f37087g = true;
        if (u()) {
            w();
        }
    }

    public final void B() {
        this.f37087g = true;
        if (!u() || this.f37094n) {
            return;
        }
        this.f37094n = true;
        this.f37089i.post(this.f37095o);
    }

    public final void C() {
        this.f37086f = EnumC0279b.SHOW_TRANSLATED;
        K();
    }

    @androidx.annotation.w0(31)
    public final void D(@NotNull b bVar, @NotNull LongSparseArray<ViewTranslationResponse> longSparseArray) {
        c.f37100a.d(bVar, longSparseArray);
    }

    public final void H(@Nullable androidx.compose.ui.platform.coreshims.b bVar) {
        this.f37083c = bVar;
    }

    public final void I(@NotNull j0<w> j0Var) {
        this.f37090j = j0Var;
    }

    public final void J(@NotNull Function0<? extends androidx.compose.ui.platform.coreshims.b> function0) {
        this.f37082b = function0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (kotlinx.coroutines.d1.b(r5, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0093 -> B:13:0x0033). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.contentcapture.b.e
            if (r0 == 0) goto L14
            r0 = r10
            r0 = r10
            androidx.compose.ui.contentcapture.b$e r0 = (androidx.compose.ui.contentcapture.b.e) r0
            int r1 = r0.f37105d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f37105d = r1
            goto L1a
        L14:
            androidx.compose.ui.contentcapture.b$e r0 = new androidx.compose.ui.contentcapture.b$e
            r8 = 3
            r0.<init>(r10)
        L1a:
            java.lang.Object r10 = r0.f37103b
            r8 = 6
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r8 = 2
            int r2 = r0.f37105d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L35
            java.lang.Object r2 = r0.f37102a
            kotlinx.coroutines.channels.r r2 = (kotlinx.coroutines.channels.r) r2
            kotlin.ResultKt.m(r10)
        L33:
            r10 = r2
            goto L51
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 5
            r9.<init>(r10)
            throw r9
        L3e:
            r8 = 2
            java.lang.Object r2 = r0.f37102a
            kotlinx.coroutines.channels.r r2 = (kotlinx.coroutines.channels.r) r2
            kotlin.ResultKt.m(r10)
            goto L62
        L47:
            r8 = 2
            kotlin.ResultKt.m(r10)
            kotlinx.coroutines.channels.p<kotlin.Unit> r10 = r9.f37088h
            kotlinx.coroutines.channels.r r10 = r10.iterator()
        L51:
            r8 = 0
            r0.f37102a = r10
            r0.f37105d = r4
            r8 = 4
            java.lang.Object r2 = r10.c(r0)
            if (r2 != r1) goto L5e
            goto L95
        L5e:
            r7 = r2
            r7 = r2
            r2 = r10
            r10 = r7
        L62:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L97
            r2.next()
            boolean r10 = r9.u()
            r8 = 2
            if (r10 == 0) goto L77
            r9.v()
        L77:
            boolean r10 = r9.f37094n
            if (r10 != 0) goto L85
            r9.f37094n = r4
            android.os.Handler r10 = r9.f37089i
            java.lang.Runnable r5 = r9.f37095o
            r8 = 3
            r10.post(r5)
        L85:
            long r5 = r9.f37085e
            r8 = 5
            r0.f37102a = r2
            r8 = 5
            r0.f37105d = r3
            r8 = 0
            java.lang.Object r10 = kotlinx.coroutines.d1.b(r5, r0)
            r8 = 2
            if (r10 != r1) goto L33
        L95:
            r8 = 5
            return r1
        L97:
            kotlin.Unit r9 = kotlin.Unit.f312394a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.b.d(kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final androidx.compose.ui.platform.coreshims.b m() {
        return this.f37083c;
    }

    @NotNull
    public final j0<w> o() {
        if (this.f37087g) {
            this.f37087g = false;
            this.f37090j = y.g(this.f37081a.getSemanticsOwner(), -1);
            this.f37091k = System.currentTimeMillis();
        }
        return this.f37090j;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull o0 o0Var) {
        this.f37083c = this.f37082b.invoke();
        M(-1, this.f37081a.getSemanticsOwner().e());
        v();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull o0 o0Var) {
        N(this.f37081a.getSemanticsOwner().e());
        v();
        this.f37083c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view) {
        this.f37089i.removeCallbacks(this.f37095o);
        this.f37083c = null;
    }

    @NotNull
    public final Handler p() {
        return this.f37089i;
    }

    @NotNull
    public final Function0<androidx.compose.ui.platform.coreshims.b> q() {
        return this.f37082b;
    }

    @NotNull
    public final AndroidComposeView r() {
        return this.f37081a;
    }

    public final boolean u() {
        if (!n.G.a() || this.f37083c == null) {
            return false;
        }
        int i10 = 1 >> 1;
        return true;
    }

    public final void x() {
        this.f37086f = EnumC0279b.SHOW_ORIGINAL;
        i();
    }

    @androidx.annotation.w0(31)
    public final void y(@NotNull long[] jArr, @NotNull int[] iArr, @NotNull Consumer<ViewTranslationRequest> consumer) {
        c.f37100a.c(this, jArr, iArr, consumer);
    }

    public final void z() {
        this.f37086f = EnumC0279b.SHOW_ORIGINAL;
        s();
    }
}
