package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.y1;
import androidx.compose.ui.layout.z0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import androidx.compose.ui.unit.w;
import androidx.media3.exoplayer.a5;
import com.rabbitmq.client.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,955:1\n32#2:956\n80#3:957\n1282#4,6:958\n1282#4,6:968\n1282#4,6:974\n1282#4,6:980\n1282#4,6:986\n1282#4,6:992\n1282#4,6:998\n1282#4,6:1004\n1282#4,6:1010\n1282#4,6:1046\n75#5:964\n75#5:965\n75#5:966\n75#5:967\n80#6,6:1016\n87#6,3:1031\n90#6,2:1040\n94#6:1045\n80#6,6:1052\n87#6,3:1067\n90#6,2:1076\n94#6:1081\n391#7,9:1022\n400#7,3:1042\n391#7,9:1058\n400#7,3:1078\n4360#8,6:1034\n4360#8,6:1070\n85#9:1082\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n123#1:956\n123#1:957\n271#1:958,6\n305#1:968,6\n306#1:974,6\n333#1:980,6\n348#1:986,6\n357#1:992,6\n369#1:998,6\n382#1:1004,6\n390#1:1010,6\n432#1:1046,6\n299#1:964\n300#1:965\n301#1:966\n302#1:967\n379#1:1016,6\n379#1:1031,3\n379#1:1040,2\n379#1:1045\n432#1:1052,6\n432#1:1067,3\n432#1:1076,2\n432#1:1081\n379#1:1022,9\n379#1:1042,3\n432#1:1058,9\n432#1:1078,3\n379#1:1034,6\n432#1:1070,6\n304#1:1082\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f42875a = 262144;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m4<String> f42876b = a1.k(null, a.f42877a, 1, null);

    static final class a extends l0 implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42877a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    static final class b extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f42878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f42879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t f42881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<c0, Integer, Unit> f42882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f42883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f42884g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, long j10, Function0<Unit> function0, t tVar, Function2<? super c0, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f42878a = eVar;
            this.f42879b = j10;
            this.f42880c = function0;
            this.f42881d = tVar;
            this.f42882e = function2;
            this.f42883f = i10;
            this.f42884g = i11;
        }

        public final void c(c0 c0Var, int i10) {
            c.c(this.f42878a, this.f42879b, this.f42880c, this.f42881d, this.f42882e, c0Var, t4.a(this.f42883f | 1), this.f42884g);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.c$c, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,955:1\n66#2,5:956\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1\n*L\n341#1:956,5\n*E\n"})
    static final class C0349c extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f42885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f42887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f42888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f42889e;

        /* JADX INFO: renamed from: androidx.compose.ui.window.c$c$a */
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1\n*L\n1#1,69:1\n342#2,4:70\n*E\n"})
        public static final class a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f42890a;

            public a(n nVar) {
                this.f42890a = nVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f42890a.disposeComposition();
                this.f42890a.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0349c(n nVar, Function0<Unit> function0, t tVar, String str, w wVar) {
            super(1);
            this.f42885a = nVar;
            this.f42886b = function0;
            this.f42887c = tVar;
            this.f42888d = str;
            this.f42889e = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(v1 v1Var) {
            this.f42885a.p();
            this.f42885a.r(this.f42886b, this.f42887c, this.f42888d, this.f42889e);
            return new a(this.f42885a);
        }
    }

    static final class d extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f42891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f42893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f42894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f42895e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar, Function0<Unit> function0, t tVar, String str, w wVar) {
            super(0);
            this.f42891a = nVar;
            this.f42892b = function0;
            this.f42893c = tVar;
            this.f42894d = str;
            this.f42895e = wVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f42891a.r(this.f42892b, this.f42893c, this.f42894d, this.f42895e);
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,955:1\n66#2,5:956\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1\n*L\n360#1:956,5\n*E\n"})
    static final class e extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f42896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f42897b;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1\n*L\n1#1,69:1\n360#2:70\n*E\n"})
        public static final class a implements u1 {
            @Override // androidx.compose.runtime.u1
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n nVar, s sVar) {
            super(1);
            this.f42896a = nVar;
            this.f42897b = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(v1 v1Var) {
            this.f42896a.setPositionProvider(this.f42897b);
            this.f42896a.v();
            return new a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", i = {0}, l = {371}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f42898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f42900c;

        static final class a extends l0 implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f42901a = new a();

            a() {
                super(1);
            }

            public final void c(long j10) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                c(l10.longValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n nVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f42900c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f42900c, dVar);
            fVar.f42899b = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002f  */
        /* JADX WARN: Code duplicated, block: B:13:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0039 -> B:15:0x003d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r3 = 2
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f42898a
                r2 = 4
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L16
                java.lang.Object r1 = r4.f42899b
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                kotlin.ResultKt.m(r5)
                goto L3d
            L16:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                r3 = 6
                throw r4
            L1f:
                r3 = 6
                kotlin.ResultKt.m(r5)
                java.lang.Object r5 = r4.f42899b
                kotlinx.coroutines.s0 r5 = (kotlinx.coroutines.s0) r5
                r1 = r5
            L28:
                boolean r5 = kotlinx.coroutines.t0.k(r1)
                r3 = 5
                if (r5 == 0) goto L45
                androidx.compose.ui.window.c$f$a r5 = androidx.compose.ui.window.c.f.a.f42901a
                r4.f42899b = r1
                r4.f42898a = r2
                java.lang.Object r5 = androidx.compose.ui.platform.n2.a(r5, r4)
                if (r5 != r0) goto L3d
                r3 = 1
                return r0
            L3d:
                r3 = 4
                androidx.compose.ui.window.n r5 = r4.f42900c
                r3 = 0
                r5.n()
                goto L28
            L45:
                kotlin.Unit r4 = kotlin.Unit.f312394a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class g extends l0 implements Function1<g0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f42902a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(n nVar) {
            super(1);
            this.f42902a = nVar;
        }

        public final void c(g0 g0Var) {
            g0 g0VarG0 = g0Var.g0();
            Intrinsics.checkNotNull(g0VarG0);
            this.f42902a.t(g0VarG0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g0 g0Var) {
            c(g0Var);
            return Unit.f312394a;
        }
    }

    static final class h implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f42903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f42904b;

        static final class a extends l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f42905a = new a();

            a() {
                super(1);
            }

            public final void c(i2.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        h(n nVar, w wVar) {
            this.f42903a = nVar;
            this.f42904b = wVar;
        }

        @Override // androidx.compose.ui.layout.a1
        public final b1 a(c1 c1Var, List<? extends z0> list, long j10) {
            this.f42903a.setParentLayoutDirection(this.f42904b);
            return c1.h6(c1Var, 0, 0, null, a.f42905a, 4, null);
        }
    }

    static final class i extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f42906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f42908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<c0, Integer, Unit> f42909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f42910e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f42911f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(s sVar, Function0<Unit> function0, t tVar, Function2<? super c0, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f42906a = sVar;
            this.f42907b = function0;
            this.f42908c = tVar;
            this.f42909d = function2;
            this.f42910e = i10;
            this.f42911f = i11;
        }

        public final void c(c0 c0Var, int i10) {
            c.a(this.f42906a, this.f42907b, this.f42908c, this.f42909d, c0Var, t4.a(this.f42910e | 1), this.f42911f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class j extends l0 implements Function0<UUID> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f42912a = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,955:1\n1282#2,6:956\n1282#2,6:962\n1282#2,6:970\n431#3,2:968\n458#3:1006\n80#4,6:976\n87#4,3:991\n90#4,2:1000\n94#4:1005\n391#5,9:982\n400#5,3:1002\n4360#6,6:994\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n*L\n319#1:956,6\n321#1:962,6\n318#1:970,6\n318#1:968,2\n318#1:1006\n318#1:976,6\n318#1:991,3\n318#1:1000,2\n318#1:1005\n318#1:982,9\n318#1:1002,3\n318#1:994,6\n*E\n"})
    static final class k extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f42913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n7<Function2<c0, Integer, Unit>> f42914b;

        static final class a extends l0 implements Function1<e0, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f42915a = new a();

            a() {
                super(1);
            }

            public final void c(e0 e0Var) {
                b0.i1(e0Var);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(e0 e0Var) {
                c(e0Var);
                return Unit.f312394a;
            }
        }

        static final class b extends l0 implements Function1<androidx.compose.ui.unit.u, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f42916a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(n nVar) {
                super(1);
                this.f42916a = nVar;
            }

            public final void c(long j10) {
                this.f42916a.m5setPopupContentSizefhxjrPA(androidx.compose.ui.unit.u.b(j10));
                this.f42916a.v();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.unit.u uVar) {
                c(uVar.q());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(n nVar, n7<? extends Function2<? super c0, ? super Integer, Unit>> n7Var) {
            super(2);
            this.f42913a = nVar;
            this.f42914b = n7Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-297523940, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:317)");
            }
            a0.a aVar = a0.E;
            Object objI0 = c0Var.i0();
            c0.a aVar2 = c0.f35327a;
            if (objI0 == aVar2.a()) {
                objI0 = a.f42915a;
                c0Var.Y(objI0);
            }
            a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null);
            boolean zK0 = c0Var.k0(this.f42913a);
            n nVar = this.f42913a;
            Object objI1 = c0Var.i0();
            if (zK0 || objI1 == aVar2.a()) {
                objI1 = new b(nVar);
                c0Var.Y(objI1);
            }
            a0 a0VarA = androidx.compose.ui.draw.a.a(y1.a(a0VarF, (Function1) objI1), this.f42913a.getCanCalculatePosition() ? 1.0f : 0.0f);
            Function2 function2B = c.b(this.f42914b);
            Object objI2 = c0Var.i0();
            if (objI2 == aVar2.a()) {
                objI2 = m.f42920a;
                c0Var.Y(objI2);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI2;
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1Var, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B2);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            function2B.invoke(c0Var, 0);
            c0Var.o();
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class l extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<c0, Integer, Unit> f42918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f42919c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(String str, Function2<? super c0, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f42917a = str;
            this.f42918b = function2;
            this.f42919c = i10;
        }

        public final void c(c0 c0Var, int i10) {
            c.d(this.f42917a, this.f42918b, c0Var, t4.a(this.f42919c | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,955:1\n151#2,2:956\n35#2,5:958\n153#2:963\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1\n*L\n443#1:956,2\n443#1:958,5\n443#1:963\n*E\n"})
    public static final class m implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f42920a = new m();

        static final class a extends l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f42921a = new a();

            public a() {
                super(1);
            }

            public final void c(i2.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        static final class b extends l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i2 f42922a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i2 i2Var) {
                super(1);
                this.f42922a = i2Var;
            }

            public final void c(i2.a aVar) {
                i2.a.e0(aVar, this.f42922a, 0, 0, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.window.c$m$c, reason: collision with other inner class name */
        static final class C0350c extends l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<i2> f42923a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0350c(List<? extends i2> list) {
                super(1);
                this.f42923a = list;
            }

            public final void c(i2.a aVar) {
                int lastIndex = CollectionsKt.getLastIndex(this.f42923a);
                if (lastIndex < 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    int i11 = 2 & 0;
                    i2.a aVar2 = aVar;
                    i2.a.e0(aVar2, this.f42923a.get(i10), 0, 0, 0.0f, 4, null);
                    if (i10 == lastIndex) {
                        return;
                    }
                    i10++;
                    aVar = aVar2;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        @Override // androidx.compose.ui.layout.a1
        public final b1 a(c1 c1Var, List<? extends z0> list, long j10) {
            int size = list.size();
            if (size == 0) {
                int i10 = 7 >> 0;
                return c1.h6(c1Var, 0, 0, null, a.f42921a, 4, null);
            }
            if (size == 1) {
                i2 i2VarP0 = list.get(0).P0(j10);
                return c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new b(i2VarP0), 4, null);
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            int iMax = 0;
            int iMax2 = 0;
            for (int i11 = 0; i11 < size2; i11++) {
                i2 i2VarP1 = list.get(i11).P0(j10);
                iMax = Math.max(iMax, i2VarP1.h1());
                iMax2 = Math.max(iMax2, i2VarP1.c1());
                arrayList.add(i2VarP1);
            }
            return c1.h6(c1Var, iMax, iMax2, null, new C0350c(arrayList), 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0205  */
    /* JADX WARN: Code duplicated, block: B:104:0x020b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0222  */
    /* JADX WARN: Code duplicated, block: B:109:0x0228  */
    /* JADX WARN: Code duplicated, block: B:112:0x0242  */
    /* JADX WARN: Code duplicated, block: B:114:0x0248  */
    /* JADX WARN: Code duplicated, block: B:117:0x0269  */
    /* JADX WARN: Code duplicated, block: B:119:0x026f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0295  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:139:0x0305  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152  */
    /* JADX WARN: Code duplicated, block: B:70:0x0166  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    /* JADX WARN: Code duplicated, block: B:80:0x018d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01af  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01da  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fd  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@NotNull s sVar, @Nullable Function0<Unit> function0, @Nullable t tVar, @NotNull Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, int i10, int i11) {
        int i12;
        Function0<Unit> function1;
        int i13;
        t tVar2;
        int i14;
        int i15;
        boolean z10;
        Function0<Unit> function3;
        t tVar3;
        s5 s5VarT;
        Function0<Unit> function4;
        t tVar4;
        View view;
        androidx.compose.ui.unit.d dVar;
        String str;
        w wVar;
        p0 p0VarY;
        n7 n7VarW;
        Object objI0;
        c0.a aVar;
        UUID uuid;
        Object objI1;
        String str2;
        boolean z11;
        char c10;
        n nVar;
        int i16;
        boolean z12;
        int i17;
        boolean z13;
        boolean zD;
        Object objI2;
        boolean z14;
        boolean z15;
        boolean zD2;
        Object objI3;
        int i18;
        boolean z16;
        boolean z17;
        Object objI4;
        boolean zK0;
        Object objI5;
        boolean zK1;
        Object objI6;
        boolean zK2;
        Object objI7;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        s sVar2 = sVar;
        c0 c0VarR = c0Var.R(-1772091631);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(sVar2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                function1 = function0;
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    tVar2 = tVar;
                    if (c0VarR.D(tVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i13 != 0) {
                        tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        tVar4 = tVar2;
                    }
                    if (m0.l0()) {
                        m0.A0(-1772091631, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:297)");
                    }
                    view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                    str = (String) c0VarR.W(f42876b);
                    wVar = (w) c0VarR.W(q1.u());
                    p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
                    n7VarW = w6.w(function2, c0VarR, (i12 >> 9) & 14);
                    Object[] objArr = new Object[0];
                    objI0 = c0VarR.i0();
                    aVar = c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = j.f42912a;
                        c0VarR.Y(objI0);
                    }
                    uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr, (Function0) objI0, c0VarR, 48);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        str2 = str;
                        c10 = 256;
                        n nVar2 = new n(function4, tVar4, str2, view, dVar, sVar2, uuid, null, 128, null);
                        sVar2 = sVar2;
                        z11 = true;
                        nVar2.o(p0VarY, androidx.compose.runtime.internal.w.c(-297523940, true, new k(nVar2, n7VarW)));
                        c0VarR.Y(nVar2);
                        objI1 = nVar2;
                    } else {
                        str2 = str;
                        z11 = true;
                        c10 = 256;
                    }
                    nVar = (n) objI1;
                    boolean zK3 = c0VarR.k0(nVar);
                    i16 = i12 & com.planner5d.library.engine.input.f.b.B;
                    if (i16 == 32) {
                        z12 = z11;
                    } else {
                        z12 = false;
                    }
                    boolean z18 = zK3 | z12;
                    i17 = i12 & 896;
                    if (i17 == c10) {
                        z13 = z11;
                    } else {
                        z13 = false;
                    }
                    zD = z18 | z13 | c0VarR.D(str2) | c0VarR.K(wVar.ordinal());
                    objI2 = c0VarR.i0();
                    if (zD || objI2 == aVar.a()) {
                        objI2 = new C0349c(nVar, function4, tVar4, str2, wVar);
                        c0VarR.Y(objI2);
                    }
                    b2.d(nVar, (Function1) objI2, c0VarR, 0);
                    boolean zK4 = c0VarR.k0(nVar);
                    if (i16 == 32) {
                        z14 = z11;
                    } else {
                        z14 = false;
                    }
                    boolean z19 = zK4 | z14;
                    if (i17 == c10) {
                        z15 = z11;
                    } else {
                        z15 = false;
                    }
                    zD2 = z19 | z15 | c0VarR.D(str2) | c0VarR.K(wVar.ordinal());
                    objI3 = c0VarR.i0();
                    if (zD2 || objI3 == aVar.a()) {
                        objI3 = new d(nVar, function4, tVar4, str2, wVar);
                        c0VarR.Y(objI3);
                    }
                    b2.m((Function0) objI3, c0VarR, 0);
                    boolean zK5 = c0VarR.k0(nVar);
                    i18 = i12 & 14;
                    if (i18 == 4) {
                        z16 = z11;
                    } else {
                        z16 = false;
                    }
                    z17 = zK5 | z16;
                    objI4 = c0VarR.i0();
                    if (z17 || objI4 == aVar.a()) {
                        objI4 = new e(nVar, sVar2);
                        c0VarR.Y(objI4);
                    }
                    b2.d(sVar2, (Function1) objI4, c0VarR, i18);
                    zK0 = c0VarR.k0(nVar);
                    objI5 = c0VarR.i0();
                    if (zK0 || objI5 == aVar.a()) {
                        objI5 = new f(nVar, null);
                        c0VarR.Y(objI5);
                    }
                    b2.i(nVar, (Function2) objI5, c0VarR, 0);
                    a0.a aVar2 = a0.E;
                    zK1 = c0VarR.k0(nVar);
                    objI6 = c0VarR.i0();
                    if (zK1 || objI6 == aVar.a()) {
                        objI6 = new g(nVar);
                        c0VarR.Y(objI6);
                    }
                    a0 a0VarA = androidx.compose.ui.layout.q1.a(aVar2, (Function1) objI6);
                    zK2 = c0VarR.k0(nVar) | c0VarR.K(wVar.ordinal());
                    objI7 = c0VarR.i0();
                    if (zK2 || objI7 == aVar.a()) {
                        objI7 = new h(nVar, wVar);
                        c0VarR.Y(objI7);
                    }
                    androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI7;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    function0A = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1Var, aVar3.e());
                    y7.n(c0VarD, b1VarK, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar3.f());
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function3 = function4;
                    tVar3 = tVar4;
                } else {
                    c0VarR.u();
                    function3 = function1;
                    tVar3 = tVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new i(sVar2, function3, tVar3, function2, i10, i11));
                }
            }
            i12 |= a5.S0;
            tVar2 = tVar;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                if (i13 != 0) {
                    tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    tVar4 = tVar2;
                }
                if (m0.l0()) {
                    m0.A0(-1772091631, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:297)");
                }
                view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                str = (String) c0VarR.W(f42876b);
                wVar = (w) c0VarR.W(q1.u());
                p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
                n7VarW = w6.w(function2, c0VarR, (i12 >> 9) & 14);
                Object[] objArr2 = new Object[0];
                objI0 = c0VarR.i0();
                aVar = c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = j.f42912a;
                    c0VarR.Y(objI0);
                }
                uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr2, (Function0) objI0, c0VarR, 48);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    str2 = str;
                    c10 = 256;
                    n nVar3 = new n(function4, tVar4, str2, view, dVar, sVar2, uuid, null, 128, null);
                    sVar2 = sVar2;
                    z11 = true;
                    nVar3.o(p0VarY, androidx.compose.runtime.internal.w.c(-297523940, true, new k(nVar3, n7VarW)));
                    c0VarR.Y(nVar3);
                    objI1 = nVar3;
                } else {
                    str2 = str;
                    z11 = true;
                    c10 = 256;
                }
                nVar = (n) objI1;
                boolean zK6 = c0VarR.k0(nVar);
                i16 = i12 & com.planner5d.library.engine.input.f.b.B;
                if (i16 == 32) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                boolean z110 = zK6 | z12;
                i17 = i12 & 896;
                if (i17 == c10) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                zD = z110 | z13 | c0VarR.D(str2) | c0VarR.K(wVar.ordinal());
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new C0349c(nVar, function4, tVar4, str2, wVar);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new C0349c(nVar, function4, tVar4, str2, wVar);
                    c0VarR.Y(objI2);
                }
                b2.d(nVar, (Function1) objI2, c0VarR, 0);
                boolean zK7 = c0VarR.k0(nVar);
                if (i16 == 32) {
                    z14 = z11;
                } else {
                    z14 = false;
                }
                boolean z111 = zK7 | z14;
                if (i17 == c10) {
                    z15 = z11;
                } else {
                    z15 = false;
                }
                zD2 = z111 | z15 | c0VarR.D(str2) | c0VarR.K(wVar.ordinal());
                objI3 = c0VarR.i0();
                if (zD2) {
                    objI3 = new d(nVar, function4, tVar4, str2, wVar);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new d(nVar, function4, tVar4, str2, wVar);
                    c0VarR.Y(objI3);
                }
                b2.m((Function0) objI3, c0VarR, 0);
                boolean zK8 = c0VarR.k0(nVar);
                i18 = i12 & 14;
                if (i18 == 4) {
                    z16 = z11;
                } else {
                    z16 = false;
                }
                z17 = zK8 | z16;
                objI4 = c0VarR.i0();
                if (z17) {
                    objI4 = new e(nVar, sVar2);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new e(nVar, sVar2);
                    c0VarR.Y(objI4);
                }
                b2.d(sVar2, (Function1) objI4, c0VarR, i18);
                zK0 = c0VarR.k0(nVar);
                objI5 = c0VarR.i0();
                if (zK0) {
                    objI5 = new f(nVar, null);
                    c0VarR.Y(objI5);
                } else {
                    objI5 = new f(nVar, null);
                    c0VarR.Y(objI5);
                }
                b2.i(nVar, (Function2) objI5, c0VarR, 0);
                a0.a aVar4 = a0.E;
                zK1 = c0VarR.k0(nVar);
                objI6 = c0VarR.i0();
                if (zK1) {
                    objI6 = new g(nVar);
                    c0VarR.Y(objI6);
                } else {
                    objI6 = new g(nVar);
                    c0VarR.Y(objI6);
                }
                a0 a0VarA2 = androidx.compose.ui.layout.q1.a(aVar4, (Function1) objI6);
                zK2 = c0VarR.k0(nVar) | c0VarR.K(wVar.ordinal());
                objI7 = c0VarR.i0();
                if (zK2) {
                    objI7 = new h(nVar, wVar);
                    c0VarR.Y(objI7);
                } else {
                    objI7 = new h(nVar, wVar);
                    c0VarR.Y(objI7);
                }
                androidx.compose.ui.layout.a1 a1Var2 = (androidx.compose.ui.layout.a1) objI7;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarA2);
                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                function0A = aVar5.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1Var2, aVar5.e());
                y7.n(c0VarD, b1VarK2, aVar5.g());
                function2B = aVar5.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN2, aVar5.f());
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function3 = function4;
                tVar3 = tVar4;
            } else {
                c0VarR.u();
                function3 = function1;
                tVar3 = tVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new i(sVar2, function3, tVar3, function2, i10, i11));
            }
        }
        i12 |= 48;
        function1 = function0;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                tVar2 = tVar;
                if (c0VarR.D(tVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                if (i13 != 0) {
                    tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    tVar4 = tVar2;
                }
                if (m0.l0()) {
                    m0.A0(-1772091631, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:297)");
                }
                view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                str = (String) c0VarR.W(f42876b);
                wVar = (w) c0VarR.W(q1.u());
                p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
                n7VarW = w6.w(function2, c0VarR, (i12 >> 9) & 14);
                Object[] objArr3 = new Object[0];
                objI0 = c0VarR.i0();
                aVar = c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = j.f42912a;
                    c0VarR.Y(objI0);
                }
                uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr3, (Function0) objI0, c0VarR, 48);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    str2 = str;
                    c10 = 256;
                    n nVar4 = new n(function4, tVar4, str2, view, dVar, sVar2, uuid, null, 128, null);
                    sVar2 = sVar2;
                    z11 = true;
                    nVar4.o(p0VarY, androidx.compose.runtime.internal.w.c(-297523940, true, new k(nVar4, n7VarW)));
                    c0VarR.Y(nVar4);
                    objI1 = nVar4;
                } else {
                    str2 = str;
                    z11 = true;
                    c10 = 256;
                }
                nVar = (n) objI1;
                boolean zK9 = c0VarR.k0(nVar);
                i16 = i12 & com.planner5d.library.engine.input.f.b.B;
                if (i16 == 32) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                boolean z112 = zK9 | z12;
                i17 = i12 & 896;
                if (i17 == c10) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                zD = z112 | z13 | c0VarR.D(str2) | c0VarR.K(wVar.ordinal());
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new C0349c(nVar, function4, tVar4, str2, wVar);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new C0349c(nVar, function4, tVar4, str2, wVar);
                    c0VarR.Y(objI2);
                }
                b2.d(nVar, (Function1) objI2, c0VarR, 0);
                boolean zK10 = c0VarR.k0(nVar);
                if (i16 == 32) {
                    z14 = z11;
                } else {
                    z14 = false;
                }
                boolean z113 = zK10 | z14;
                if (i17 == c10) {
                    z15 = z11;
                } else {
                    z15 = false;
                }
                zD2 = z113 | z15 | c0VarR.D(str2) | c0VarR.K(wVar.ordinal());
                objI3 = c0VarR.i0();
                if (zD2) {
                    objI3 = new d(nVar, function4, tVar4, str2, wVar);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new d(nVar, function4, tVar4, str2, wVar);
                    c0VarR.Y(objI3);
                }
                b2.m((Function0) objI3, c0VarR, 0);
                boolean zK11 = c0VarR.k0(nVar);
                i18 = i12 & 14;
                if (i18 == 4) {
                    z16 = z11;
                } else {
                    z16 = false;
                }
                z17 = zK11 | z16;
                objI4 = c0VarR.i0();
                if (z17) {
                    objI4 = new e(nVar, sVar2);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new e(nVar, sVar2);
                    c0VarR.Y(objI4);
                }
                b2.d(sVar2, (Function1) objI4, c0VarR, i18);
                zK0 = c0VarR.k0(nVar);
                objI5 = c0VarR.i0();
                if (zK0) {
                    objI5 = new f(nVar, null);
                    c0VarR.Y(objI5);
                } else {
                    objI5 = new f(nVar, null);
                    c0VarR.Y(objI5);
                }
                b2.i(nVar, (Function2) objI5, c0VarR, 0);
                a0.a aVar6 = a0.E;
                zK1 = c0VarR.k0(nVar);
                objI6 = c0VarR.i0();
                if (zK1) {
                    objI6 = new g(nVar);
                    c0VarR.Y(objI6);
                } else {
                    objI6 = new g(nVar);
                    c0VarR.Y(objI6);
                }
                a0 a0VarA3 = androidx.compose.ui.layout.q1.a(aVar6, (Function1) objI6);
                zK2 = c0VarR.k0(nVar) | c0VarR.K(wVar.ordinal());
                objI7 = c0VarR.i0();
                if (zK2) {
                    objI7 = new h(nVar, wVar);
                    c0VarR.Y(objI7);
                } else {
                    objI7 = new h(nVar, wVar);
                    c0VarR.Y(objI7);
                }
                androidx.compose.ui.layout.a1 a1Var3 = (androidx.compose.ui.layout.a1) objI7;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarA3);
                androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                function0A = aVar7.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1Var3, aVar7.e());
                y7.n(c0VarD, b1VarK3, aVar7.g());
                function2B = aVar7.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN3, aVar7.f());
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function3 = function4;
                tVar3 = tVar4;
            } else {
                c0VarR.u();
                function3 = function1;
                tVar3 = tVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new i(sVar2, function3, tVar3, function2, i10, i11));
            }
        }
        i12 |= a5.S0;
        tVar2 = tVar;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.k0(function2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i19 != 0) {
                function4 = null;
            } else {
                function4 = function1;
            }
            if (i13 != 0) {
                tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
            } else {
                tVar4 = tVar2;
            }
            if (m0.l0()) {
                m0.A0(-1772091631, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:297)");
            }
            view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
            dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
            str = (String) c0VarR.W(f42876b);
            wVar = (w) c0VarR.W(q1.u());
            p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
            n7VarW = w6.w(function2, c0VarR, (i12 >> 9) & 14);
            Object[] objArr4 = new Object[0];
            objI0 = c0VarR.i0();
            aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = j.f42912a;
                c0VarR.Y(objI0);
            }
            uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr4, (Function0) objI0, c0VarR, 48);
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                str2 = str;
                c10 = 256;
                n nVar5 = new n(function4, tVar4, str2, view, dVar, sVar2, uuid, null, 128, null);
                sVar2 = sVar2;
                z11 = true;
                nVar5.o(p0VarY, androidx.compose.runtime.internal.w.c(-297523940, true, new k(nVar5, n7VarW)));
                c0VarR.Y(nVar5);
                objI1 = nVar5;
            } else {
                str2 = str;
                z11 = true;
                c10 = 256;
            }
            nVar = (n) objI1;
            boolean zK12 = c0VarR.k0(nVar);
            i16 = i12 & com.planner5d.library.engine.input.f.b.B;
            if (i16 == 32) {
                z12 = z11;
            } else {
                z12 = false;
            }
            boolean z114 = zK12 | z12;
            i17 = i12 & 896;
            if (i17 == c10) {
                z13 = z11;
            } else {
                z13 = false;
            }
            zD = z114 | z13 | c0VarR.D(str2) | c0VarR.K(wVar.ordinal());
            objI2 = c0VarR.i0();
            if (zD) {
                objI2 = new C0349c(nVar, function4, tVar4, str2, wVar);
                c0VarR.Y(objI2);
            } else {
                objI2 = new C0349c(nVar, function4, tVar4, str2, wVar);
                c0VarR.Y(objI2);
            }
            b2.d(nVar, (Function1) objI2, c0VarR, 0);
            boolean zK13 = c0VarR.k0(nVar);
            if (i16 == 32) {
                z14 = z11;
            } else {
                z14 = false;
            }
            boolean z115 = zK13 | z14;
            if (i17 == c10) {
                z15 = z11;
            } else {
                z15 = false;
            }
            zD2 = z115 | z15 | c0VarR.D(str2) | c0VarR.K(wVar.ordinal());
            objI3 = c0VarR.i0();
            if (zD2) {
                objI3 = new d(nVar, function4, tVar4, str2, wVar);
                c0VarR.Y(objI3);
            } else {
                objI3 = new d(nVar, function4, tVar4, str2, wVar);
                c0VarR.Y(objI3);
            }
            b2.m((Function0) objI3, c0VarR, 0);
            boolean zK14 = c0VarR.k0(nVar);
            i18 = i12 & 14;
            if (i18 == 4) {
                z16 = z11;
            } else {
                z16 = false;
            }
            z17 = zK14 | z16;
            objI4 = c0VarR.i0();
            if (z17) {
                objI4 = new e(nVar, sVar2);
                c0VarR.Y(objI4);
            } else {
                objI4 = new e(nVar, sVar2);
                c0VarR.Y(objI4);
            }
            b2.d(sVar2, (Function1) objI4, c0VarR, i18);
            zK0 = c0VarR.k0(nVar);
            objI5 = c0VarR.i0();
            if (zK0) {
                objI5 = new f(nVar, null);
                c0VarR.Y(objI5);
            } else {
                objI5 = new f(nVar, null);
                c0VarR.Y(objI5);
            }
            b2.i(nVar, (Function2) objI5, c0VarR, 0);
            a0.a aVar8 = a0.E;
            zK1 = c0VarR.k0(nVar);
            objI6 = c0VarR.i0();
            if (zK1) {
                objI6 = new g(nVar);
                c0VarR.Y(objI6);
            } else {
                objI6 = new g(nVar);
                c0VarR.Y(objI6);
            }
            a0 a0VarA4 = androidx.compose.ui.layout.q1.a(aVar8, (Function1) objI6);
            zK2 = c0VarR.k0(nVar) | c0VarR.K(wVar.ordinal());
            objI7 = c0VarR.i0();
            if (zK2) {
                objI7 = new h(nVar, wVar);
                c0VarR.Y(objI7);
            } else {
                objI7 = new h(nVar, wVar);
                c0VarR.Y(objI7);
            }
            androidx.compose.ui.layout.a1 a1Var4 = (androidx.compose.ui.layout.a1) objI7;
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
            a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarA4);
            androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
            function0A = aVar9.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1Var4, aVar9.e());
            y7.n(c0VarD, b1VarK4, aVar9.g());
            function2B = aVar9.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN4, aVar9.f());
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
            function3 = function4;
            tVar3 = tVar4;
        } else {
            c0VarR.u();
            function3 = function1;
            tVar3 = tVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new i(sVar2, function3, tVar3, function2, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<c0, Integer, Unit> b(n7<? extends Function2<? super c0, ? super Integer, Unit>> n7Var) {
        return (Function2) n7Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:90:0x011d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0137  */
    /* JADX WARN: Code duplicated, block: B:95:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x014b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(@Nullable androidx.compose.ui.e eVar, long j10, @Nullable Function0<Unit> function0, @Nullable t tVar, @NotNull Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, int i10, int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        long j11;
        int i13;
        Function0<Unit> function1;
        int i14;
        int i15;
        t tVar2;
        int i16;
        Function2<? super c0, ? super Integer, Unit> function3;
        int i17;
        boolean z10;
        androidx.compose.ui.e eVarC;
        long jF;
        Function0<Unit> function4;
        t tVar3;
        s5 s5VarT;
        DefaultConstructorMarker defaultConstructorMarker;
        Function0<Unit> function5;
        t tVar4;
        boolean z11;
        boolean z12;
        Object objI0;
        c0 c0VarR = c0Var.R(71005054);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (c0VarR.D(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                j11 = j10;
                i12 |= c0VarR.L(j11) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    function1 = function0;
                    if (c0VarR.k0(function1)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        tVar2 = tVar;
                        if (c0VarR.D(tVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        if ((i10 & 24576) == 0) {
                            function3 = function2;
                            if (c0VarR.k0(function3)) {
                                i17 = 16384;
                            } else {
                                i17 = 8192;
                            }
                            i12 |= i17;
                        }
                        if ((i12 & 9363) != 9362) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i18 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                            } else {
                                eVarC = eVar2;
                            }
                            if (i19 != 0) {
                                long j12 = 0;
                                jF = androidx.compose.ui.unit.q.f((j12 & k0.f265952a) | (j12 << 32));
                            } else {
                                jF = j11;
                            }
                            defaultConstructorMarker = null;
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i15 != 0) {
                                tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                            } else {
                                tVar4 = tVar2;
                            }
                            if (m0.l0()) {
                                m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                            }
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                            objI0 = c0VarR.i0();
                            if (z12 || objI0 == c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                                c0VarR.Y(objI0);
                            }
                            a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                            if (m0.l0()) {
                                m0.z0();
                            }
                            function4 = function5;
                            tVar3 = tVar4;
                        } else {
                            c0VarR.u();
                            eVarC = eVar2;
                            jF = j11;
                            function4 = function1;
                            tVar3 = tVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                        }
                    }
                    i12 |= 24576;
                    function3 = function2;
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i18 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i19 != 0) {
                            long j13 = 0;
                            jF = androidx.compose.ui.unit.q.f((j13 & k0.f265952a) | (j13 << 32));
                        } else {
                            jF = j11;
                        }
                        defaultConstructorMarker = null;
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i15 != 0) {
                            tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            tVar4 = tVar2;
                        }
                        if (m0.l0()) {
                            m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                            c0VarR.Y(objI0);
                        }
                        a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function4 = function5;
                        tVar3 = tVar4;
                    } else {
                        c0VarR.u();
                        eVarC = eVar2;
                        jF = j11;
                        function4 = function1;
                        tVar3 = tVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                    }
                }
                i12 |= 3072;
                tVar2 = tVar;
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i18 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i19 != 0) {
                            long j14 = 0;
                            jF = androidx.compose.ui.unit.q.f((j14 & k0.f265952a) | (j14 << 32));
                        } else {
                            jF = j11;
                        }
                        defaultConstructorMarker = null;
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i15 != 0) {
                            tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            tVar4 = tVar2;
                        }
                        if (m0.l0()) {
                            m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                            c0VarR.Y(objI0);
                        }
                        a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function4 = function5;
                        tVar3 = tVar4;
                    } else {
                        c0VarR.u();
                        eVarC = eVar2;
                        jF = j11;
                        function4 = function1;
                        tVar3 = tVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                    }
                }
                i12 |= 24576;
                function3 = function2;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i19 != 0) {
                        long j15 = 0;
                        jF = androidx.compose.ui.unit.q.f((j15 & k0.f265952a) | (j15 << 32));
                    } else {
                        jF = j11;
                    }
                    defaultConstructorMarker = null;
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i15 != 0) {
                        tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        tVar4 = tVar2;
                    }
                    if (m0.l0()) {
                        m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    }
                    a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function4 = function5;
                    tVar3 = tVar4;
                } else {
                    c0VarR.u();
                    eVarC = eVar2;
                    jF = j11;
                    function4 = function1;
                    tVar3 = tVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                }
            }
            i12 |= a5.S0;
            function1 = function0;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    tVar2 = tVar;
                    if (c0VarR.D(tVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i18 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i19 != 0) {
                            long j16 = 0;
                            jF = androidx.compose.ui.unit.q.f((j16 & k0.f265952a) | (j16 << 32));
                        } else {
                            jF = j11;
                        }
                        defaultConstructorMarker = null;
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i15 != 0) {
                            tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            tVar4 = tVar2;
                        }
                        if (m0.l0()) {
                            m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                            c0VarR.Y(objI0);
                        }
                        a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function4 = function5;
                        tVar3 = tVar4;
                    } else {
                        c0VarR.u();
                        eVarC = eVar2;
                        jF = j11;
                        function4 = function1;
                        tVar3 = tVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                    }
                }
                i12 |= 24576;
                function3 = function2;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i19 != 0) {
                        long j17 = 0;
                        jF = androidx.compose.ui.unit.q.f((j17 & k0.f265952a) | (j17 << 32));
                    } else {
                        jF = j11;
                    }
                    defaultConstructorMarker = null;
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i15 != 0) {
                        tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        tVar4 = tVar2;
                    }
                    if (m0.l0()) {
                        m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    }
                    a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function4 = function5;
                    tVar3 = tVar4;
                } else {
                    c0VarR.u();
                    eVarC = eVar2;
                    jF = j11;
                    function4 = function1;
                    tVar3 = tVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                }
            }
            i12 |= 3072;
            tVar2 = tVar;
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i19 != 0) {
                        long j18 = 0;
                        jF = androidx.compose.ui.unit.q.f((j18 & k0.f265952a) | (j18 << 32));
                    } else {
                        jF = j11;
                    }
                    defaultConstructorMarker = null;
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i15 != 0) {
                        tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        tVar4 = tVar2;
                    }
                    if (m0.l0()) {
                        m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    }
                    a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function4 = function5;
                    tVar3 = tVar4;
                } else {
                    c0VarR.u();
                    eVarC = eVar2;
                    jF = j11;
                    function4 = function1;
                    tVar3 = tVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                }
            }
            i12 |= 24576;
            function3 = function2;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                } else {
                    eVarC = eVar2;
                }
                if (i19 != 0) {
                    long j19 = 0;
                    jF = androidx.compose.ui.unit.q.f((j19 & k0.f265952a) | (j19 << 32));
                } else {
                    jF = j11;
                }
                defaultConstructorMarker = null;
                if (i13 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i15 != 0) {
                    tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    tVar4 = tVar2;
                }
                if (m0.l0()) {
                    m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                    c0VarR.Y(objI0);
                }
                a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                if (m0.l0()) {
                    m0.z0();
                }
                function4 = function5;
                tVar3 = tVar4;
            } else {
                c0VarR.u();
                eVarC = eVar2;
                jF = j11;
                function4 = function1;
                tVar3 = tVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
            }
        }
        i12 |= 48;
        j11 = j10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                function1 = function0;
                if (c0VarR.k0(function1)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    tVar2 = tVar;
                    if (c0VarR.D(tVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i18 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i19 != 0) {
                            long j110 = 0;
                            jF = androidx.compose.ui.unit.q.f((j110 & k0.f265952a) | (j110 << 32));
                        } else {
                            jF = j11;
                        }
                        defaultConstructorMarker = null;
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i15 != 0) {
                            tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            tVar4 = tVar2;
                        }
                        if (m0.l0()) {
                            m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                            c0VarR.Y(objI0);
                        }
                        a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function4 = function5;
                        tVar3 = tVar4;
                    } else {
                        c0VarR.u();
                        eVarC = eVar2;
                        jF = j11;
                        function4 = function1;
                        tVar3 = tVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                    }
                }
                i12 |= 24576;
                function3 = function2;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i19 != 0) {
                        long j111 = 0;
                        jF = androidx.compose.ui.unit.q.f((j111 & k0.f265952a) | (j111 << 32));
                    } else {
                        jF = j11;
                    }
                    defaultConstructorMarker = null;
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i15 != 0) {
                        tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        tVar4 = tVar2;
                    }
                    if (m0.l0()) {
                        m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    }
                    a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function4 = function5;
                    tVar3 = tVar4;
                } else {
                    c0VarR.u();
                    eVarC = eVar2;
                    jF = j11;
                    function4 = function1;
                    tVar3 = tVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                }
            }
            i12 |= 3072;
            tVar2 = tVar;
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i19 != 0) {
                        long j112 = 0;
                        jF = androidx.compose.ui.unit.q.f((j112 & k0.f265952a) | (j112 << 32));
                    } else {
                        jF = j11;
                    }
                    defaultConstructorMarker = null;
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i15 != 0) {
                        tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        tVar4 = tVar2;
                    }
                    if (m0.l0()) {
                        m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    }
                    a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function4 = function5;
                    tVar3 = tVar4;
                } else {
                    c0VarR.u();
                    eVarC = eVar2;
                    jF = j11;
                    function4 = function1;
                    tVar3 = tVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                }
            }
            i12 |= 24576;
            function3 = function2;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                } else {
                    eVarC = eVar2;
                }
                if (i19 != 0) {
                    long j113 = 0;
                    jF = androidx.compose.ui.unit.q.f((j113 & k0.f265952a) | (j113 << 32));
                } else {
                    jF = j11;
                }
                defaultConstructorMarker = null;
                if (i13 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i15 != 0) {
                    tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    tVar4 = tVar2;
                }
                if (m0.l0()) {
                    m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                    c0VarR.Y(objI0);
                }
                a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                if (m0.l0()) {
                    m0.z0();
                }
                function4 = function5;
                tVar3 = tVar4;
            } else {
                c0VarR.u();
                eVarC = eVar2;
                jF = j11;
                function4 = function1;
                tVar3 = tVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
            }
        }
        i12 |= a5.S0;
        function1 = function0;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                tVar2 = tVar;
                if (c0VarR.D(tVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i19 != 0) {
                        long j114 = 0;
                        jF = androidx.compose.ui.unit.q.f((j114 & k0.f265952a) | (j114 << 32));
                    } else {
                        jF = j11;
                    }
                    defaultConstructorMarker = null;
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i15 != 0) {
                        tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        tVar4 = tVar2;
                    }
                    if (m0.l0()) {
                        m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                        c0VarR.Y(objI0);
                    }
                    a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function4 = function5;
                    tVar3 = tVar4;
                } else {
                    c0VarR.u();
                    eVarC = eVar2;
                    jF = j11;
                    function4 = function1;
                    tVar3 = tVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
                }
            }
            i12 |= 24576;
            function3 = function2;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                } else {
                    eVarC = eVar2;
                }
                if (i19 != 0) {
                    long j115 = 0;
                    jF = androidx.compose.ui.unit.q.f((j115 & k0.f265952a) | (j115 << 32));
                } else {
                    jF = j11;
                }
                defaultConstructorMarker = null;
                if (i13 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i15 != 0) {
                    tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    tVar4 = tVar2;
                }
                if (m0.l0()) {
                    m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                    c0VarR.Y(objI0);
                }
                a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                if (m0.l0()) {
                    m0.z0();
                }
                function4 = function5;
                tVar3 = tVar4;
            } else {
                c0VarR.u();
                eVarC = eVar2;
                jF = j11;
                function4 = function1;
                tVar3 = tVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
            }
        }
        i12 |= 3072;
        tVar2 = tVar;
        if ((i11 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                } else {
                    eVarC = eVar2;
                }
                if (i19 != 0) {
                    long j116 = 0;
                    jF = androidx.compose.ui.unit.q.f((j116 & k0.f265952a) | (j116 << 32));
                } else {
                    jF = j11;
                }
                defaultConstructorMarker = null;
                if (i13 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i15 != 0) {
                    tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    tVar4 = tVar2;
                }
                if (m0.l0()) {
                    m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                    c0VarR.Y(objI0);
                }
                a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
                if (m0.l0()) {
                    m0.z0();
                }
                function4 = function5;
                tVar3 = tVar4;
            } else {
                c0VarR.u();
                eVarC = eVar2;
                jF = j11;
                function4 = function1;
                tVar3 = tVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
            }
        }
        i12 |= 24576;
        function3 = function2;
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i18 != 0) {
                eVarC = androidx.compose.ui.e.f37317a.C();
            } else {
                eVarC = eVar2;
            }
            if (i19 != 0) {
                long j117 = 0;
                jF = androidx.compose.ui.unit.q.f((j117 & k0.f265952a) | (j117 << 32));
            } else {
                jF = j11;
            }
            defaultConstructorMarker = null;
            if (i13 != 0) {
                function5 = null;
            } else {
                function5 = function1;
            }
            if (i15 != 0) {
                tVar4 = new t(false, false, false, false, 15, (DefaultConstructorMarker) null);
            } else {
                tVar4 = tVar2;
            }
            if (m0.l0()) {
                m0.A0(71005054, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
            }
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | z11;
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                c0VarR.Y(objI0);
            } else {
                objI0 = new androidx.compose.ui.window.a(eVarC, jF, defaultConstructorMarker);
                c0VarR.Y(objI0);
            }
            a((androidx.compose.ui.window.a) objI0, function5, tVar4, function3, c0VarR, (i12 >> 3) & 8176, 0);
            if (m0.l0()) {
                m0.z0();
            }
            function4 = function5;
            tVar3 = tVar4;
        } else {
            c0VarR.u();
            eVarC = eVar2;
            jF = j11;
            function4 = function1;
            tVar3 = tVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(eVarC, jF, function4, tVar3, function2, i10, i11));
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void d(@NotNull String str, @NotNull Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, int i10) {
        int i11;
        c0 c0VarR = c0Var.R(1357513789);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(1357513789, i11, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:422)");
            }
            a1.e(f42876b.f(str), function2, c0VarR, (i11 & com.planner5d.library.engine.input.f.b.B) | n4.f36267i);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new l(str, function2, i10));
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void e(a0 a0Var, Function2<? super c0, ? super Integer, Unit> function2, c0 c0Var, int i10) {
        Object objI0 = c0Var.i0();
        if (objI0 == c0.f35327a.a()) {
            objI0 = m.f42920a;
            c0Var.Y(objI0);
        }
        androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
        int i11 = ((i10 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i10 >> 3) & 14) | a5.S0;
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
        a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        int i12 = ((i11 << 6) & 896) | 6;
        if (c0Var.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var.q();
        if (c0Var.P()) {
            c0Var.q0(function0A);
        } else {
            c0Var.l();
        }
        c0 c0VarD = y7.d(c0Var);
        y7.n(c0VarD, a1Var, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        function2.invoke(c0Var, Integer.valueOf((i12 >> 6) & 14));
        c0Var.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(boolean z10, u uVar, boolean z11) {
        int i10 = !z10 ? 262152 : 262144;
        if (uVar == u.SecureOn) {
            i10 |= 8192;
        }
        return !z11 ? i10 | 512 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(t tVar, boolean z10) {
        if (tVar.g() && z10) {
            return tVar.e() | 8192;
        }
        return (!tVar.g() || z10) ? tVar.e() : tVar.e() & (-8193);
    }

    @NotNull
    public static final m4<String> l() {
        return f42876b;
    }

    public static final boolean m(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    @lm.n
    public static final boolean n(@NotNull View view, @Nullable String str) {
        return (view instanceof n) && (str == null || Intrinsics.areEqual(str, ((n) view).getTestTag()));
    }

    public static /* synthetic */ boolean o(View view, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return n(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.s p(Rect rect) {
        return new androidx.compose.ui.unit.s(rect.left, rect.top, rect.right, rect.bottom);
    }
}
