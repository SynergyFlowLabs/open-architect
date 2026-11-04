package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.s5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,214:1\n1282#2,6:215\n1282#2,6:221\n1282#2,6:227\n1282#2,6:233\n1282#2,6:239\n1282#2,6:245\n1282#2,6:252\n1282#2,6:258\n1282#2,6:264\n1282#2,6:270\n1282#2,3:276\n1285#2,3:280\n1282#2,6:283\n1282#2,6:289\n75#3:251\n1#4:279\n85#5:295\n117#5,2:296\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n105#1:215,6\n107#1:221,6\n109#1:227,6\n116#1:233,6\n119#1:239,6\n121#1:245,6\n152#1:252,6\n153#1:258,6\n169#1:264,6\n182#1:270,6\n183#1:276,3\n183#1:280,3\n186#1:283,6\n204#1:289,6\n132#1:251\n105#1:295\n105#1:296,2\n*E\n"})
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<Configuration> f40239a = androidx.compose.runtime.a1.k(null, a.f40245a, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<Context> f40240b = androidx.compose.runtime.a1.m(b.f40246a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<Resources> f40241c = androidx.compose.runtime.a1.l(e.f40249a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<u0.d> f40242d = androidx.compose.runtime.a1.m(c.f40247a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<u0.g> f40243e = androidx.compose.runtime.a1.m(d.f40248a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<View> f40244f = androidx.compose.runtime.a1.m(f.f40250a);

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Configuration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40245a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.n("LocalConfiguration");
            throw new kotlin.a0();
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function0<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40246a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.n("LocalContext");
            throw new kotlin.a0();
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<u0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40247a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u0.d invoke() {
            AndroidCompositionLocals_androidKt.n("LocalImageVectorCache");
            throw new kotlin.a0();
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function0<u0.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f40248a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u0.g invoke() {
            AndroidCompositionLocals_androidKt.n("LocalResourceIdCache");
            throw new kotlin.a0();
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.runtime.v0, Resources> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f40249a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Resources invoke(androidx.compose.runtime.v0 v0Var) {
            v0Var.H0(AndroidCompositionLocals_androidKt.f());
            return ((Context) v0Var.H0(AndroidCompositionLocals_androidKt.g())).getResources();
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function0<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f40250a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.n("LocalView");
            throw new kotlin.a0();
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function1<Configuration, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Configuration> f40251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.runtime.n3<Configuration> n3Var) {
            super(1);
            this.f40251a = n3Var;
        }

        public final void c(Configuration configuration) {
            AndroidCompositionLocals_androidKt.c(this.f40251a, new Configuration(configuration));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
            c(configuration);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,214:1\n66#2,5:215\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1\n*L\n119#1:215,5\n*E\n"})
    static final class h extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.runtime.v1, androidx.compose.runtime.u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x1 f40252a;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1\n*L\n1#1,69:1\n119#2:70\n*E\n"})
        public static final class a implements androidx.compose.runtime.u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x1 f40253a;

            public a(x1 x1Var) {
                this.f40253a = x1Var;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f40253a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(x1 x1Var) {
            super(1);
            this.f40252a = x1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.u1 invoke(androidx.compose.runtime.v1 v1Var) {
            return new a(this.f40252a);
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f40254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f40255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f40256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(AndroidComposeView androidComposeView, o0 o0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            super(2);
            this.f40254a = androidComposeView;
            this.f40255b = o0Var;
            this.f40256c = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10;
            if ((i10 & 3) != 2) {
                z10 = true;
                int i11 = 1 << 1;
            } else {
                z10 = false;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1059770793, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:144)");
            }
            q1.a(this.f40254a, this.f40255b, this.f40256c, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f40257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f40258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40259c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(AndroidComposeView androidComposeView, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f40257a = androidComposeView;
            this.f40258b = function2;
            this.f40259c = i10;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            AndroidCompositionLocals_androidKt.a(this.f40257a, this.f40258b, c0Var, androidx.compose.runtime.t4.a(this.f40259c | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,214:1\n66#2,5:215\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1\n*L\n206#1:215,5\n*E\n"})
    static final class k extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.runtime.v1, androidx.compose.runtime.u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f40260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f40261b;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1\n*L\n1#1,69:1\n206#2:70\n*E\n"})
        public static final class a implements androidx.compose.runtime.u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f40262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f40263b;

            public a(Context context, l lVar) {
                this.f40262a = context;
                this.f40263b = lVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f40262a.getApplicationContext().unregisterComponentCallbacks(this.f40263b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f40260a = context;
            this.f40261b = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.u1 invoke(androidx.compose.runtime.v1 v1Var) {
            this.f40260a.getApplicationContext().registerComponentCallbacks(this.f40261b);
            return new a(this.f40260a, this.f40261b);
        }
    }

    public static final class l implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Configuration f40264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.d f40265b;

        l(Configuration configuration, u0.d dVar) {
            this.f40264a = configuration;
            this.f40265b = dVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f40265b.c(this.f40264a.updateFrom(configuration));
            this.f40264a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        @kotlin.l(message = "This callback is superseded by onTrimMemory")
        public void onLowMemory() {
            this.f40265b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f40265b.a();
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,214:1\n66#2,5:215\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1\n*L\n171#1:215,5\n*E\n"})
    static final class m extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.runtime.v1, androidx.compose.runtime.u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f40266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f40267b;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1\n*L\n1#1,69:1\n171#2:70\n*E\n"})
        public static final class a implements androidx.compose.runtime.u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f40268a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f40269b;

            public a(Context context, n nVar) {
                this.f40268a = context;
                this.f40269b = nVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f40268a.getApplicationContext().unregisterComponentCallbacks(this.f40269b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, n nVar) {
            super(1);
            this.f40266a = context;
            this.f40267b = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.u1 invoke(androidx.compose.runtime.v1 v1Var) {
            this.f40266a.getApplicationContext().registerComponentCallbacks(this.f40267b);
            return new a(this.f40266a, this.f40267b);
        }
    }

    public static final class n implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.g f40270a;

        n(u0.g gVar) {
            this.f40270a = gVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f40270a.a();
        }

        @Override // android.content.ComponentCallbacks
        @kotlin.l(message = "This callback is superseded by onTrimMemory")
        public void onLowMemory() {
            this.f40270a.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f40270a.a();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void a(@NotNull AndroidComposeView androidComposeView, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-520299287);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(androidComposeView) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-520299287, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:99)");
            }
            Context context = androidComposeView.getContext();
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI0;
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new g(n3Var);
                c0VarR.Y(objI1);
            }
            androidComposeView.setConfigurationChangeObserver((Function1) objI1);
            Object objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = new o0(context);
                c0VarR.Y(objI2);
            }
            o0 o0Var = (o0) objI2;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objI3 = c0VarR.i0();
            if (objI3 == aVar.a()) {
                objI3 = z1.b(androidComposeView, viewTreeOwners.b());
                c0VarR.Y(objI3);
            }
            x1 x1Var = (x1) objI3;
            Unit unit = Unit.f312394a;
            boolean zK0 = c0VarR.k0(x1Var);
            Object objI4 = c0VarR.i0();
            if (zK0 || objI4 == aVar.a()) {
                objI4 = new h(x1Var);
                c0VarR.Y(objI4);
            }
            androidx.compose.runtime.b2.d(unit, (Function1) objI4, c0VarR, 6);
            Object objI5 = c0VarR.i0();
            if (objI5 == aVar.a()) {
                objI5 = l2.f40642a.a(context) ? new t1(androidComposeView.getView()) : new f3();
                c0VarR.Y(objI5);
            }
            androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{f40239a.f(b(n3Var)), f40240b.f(context), androidx.lifecycle.compose.d0.c().f(viewTreeOwners.a()), s3.b.c().f(viewTreeOwners.b()), androidx.compose.runtime.saveable.y.g().f(x1Var), f40244f.f(androidComposeView.getView()), f40242d.f(o(context, b(n3Var), c0VarR, 0)), f40243e.f(p(context, c0VarR, 0)), q1.w().f(Boolean.valueOf(((Boolean) c0VarR.W(q1.x())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), q1.s().f((p0.a) objI5)}, androidx.compose.runtime.internal.w.e(1059770793, true, new i(androidComposeView, o0Var, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new j(androidComposeView, function2, i10));
        }
    }

    private static final Configuration b(androidx.compose.runtime.n3<Configuration> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.runtime.n3<Configuration> n3Var, Configuration configuration) {
        n3Var.setValue(configuration);
    }

    @NotNull
    public static final androidx.compose.runtime.m4<Configuration> f() {
        return f40239a;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<Context> g() {
        return f40240b;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<androidx.lifecycle.o0> getLocalLifecycleOwner() {
        return androidx.lifecycle.compose.d0.c();
    }

    @NotNull
    public static final androidx.compose.runtime.m4<androidx.savedstate.m> getLocalSavedStateRegistryOwner() {
        return s3.b.c();
    }

    @NotNull
    public static final androidx.compose.runtime.m4<u0.d> h() {
        return f40242d;
    }

    @kotlin.l(message = "Moved to lifecycle-runtime-compose library in androidx.lifecycle.compose package.", replaceWith = @kotlin.b1(expression = "androidx.lifecycle.compose.LocalLifecycleOwner", imports = {}))
    public static /* synthetic */ void i() {
    }

    @NotNull
    public static final androidx.compose.runtime.m4<u0.g> j() {
        return f40243e;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<Resources> k() {
        return f40241c;
    }

    @kotlin.l(message = "Moved to savedstate-compose library in androidx.savedstate.compose package.", replaceWith = @kotlin.b1(expression = "androidx.savedstate.compose.LocalSavedStateRegistryOwner", imports = {}))
    public static /* synthetic */ void l() {
    }

    @NotNull
    public static final androidx.compose.runtime.m4<View> m() {
        return f40244f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void n(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @androidx.compose.runtime.o
    @k7
    private static final u0.d o(Context context, Configuration configuration, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:180)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = new u0.d();
            c0Var.Y(objI0);
        }
        u0.d dVar = (u0.d) objI0;
        Object objI1 = c0Var.i0();
        Object obj = objI1;
        if (objI1 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            c0Var.Y(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objI2 = c0Var.i0();
        if (objI2 == aVar.a()) {
            objI2 = new l(configuration3, dVar);
            c0Var.Y(objI2);
        }
        l lVar = (l) objI2;
        boolean zK0 = c0Var.k0(context);
        Object objI3 = c0Var.i0();
        if (zK0 || objI3 == aVar.a()) {
            objI3 = new k(context, lVar);
            c0Var.Y(objI3);
        }
        androidx.compose.runtime.b2.d(dVar, (Function1) objI3, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return dVar;
    }

    @androidx.compose.runtime.o
    @k7
    private static final u0.g p(Context context, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:150)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = new u0.g();
            c0Var.Y(objI0);
        }
        u0.g gVar = (u0.g) objI0;
        Object objI1 = c0Var.i0();
        if (objI1 == aVar.a()) {
            objI1 = new n(gVar);
            c0Var.Y(objI1);
        }
        n nVar = (n) objI1;
        boolean zK0 = c0Var.k0(context);
        Object objI2 = c0Var.i0();
        if (zK0 || objI2 == aVar.a()) {
            objI2 = new m(context, nVar);
            c0Var.Y(objI2);
        }
        androidx.compose.runtime.b2.d(gVar, (Function1) objI2, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return gVar;
    }
}
