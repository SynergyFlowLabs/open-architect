package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.saveable.v;
import androidx.compose.runtime.saveable.y;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.h0;
import androidx.compose.ui.node.r2;
import androidx.compose.ui.node.x1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.unit.w;
import androidx.lifecycle.compose.d0;
import androidx.lifecycle.o0;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,392:1\n75#2:393\n75#2:394\n75#2:395\n75#2:396\n75#2:419\n75#2:420\n75#2:421\n316#3,11:397\n282#3,11:408\n1282#4,6:422\n4360#5,6:428\n91#6,5:434\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n203#1:393\n204#1:394\n211#1:395\n212#1:396\n255#1:419\n257#1:420\n258#1:421\n215#1:397,11\n233#1:408,11\n260#1:422,6\n294#1:428,6\n300#1:434,5\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<View, Unit> f42797a = h.f42815a;

    static final class a extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Context, T> f42798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f42799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f42800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f42801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f42802e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Context, ? extends T> function1, a0 a0Var, Function1<? super T, Unit> function2, int i10, int i11) {
            super(2);
            this.f42798a = function1;
            this.f42799b = a0Var;
            this.f42800c = function2;
            this.f42801d = i10;
            this.f42802e = i11;
        }

        public final void c(c0 c0Var, int i10) {
            e.a(this.f42798a, this.f42799b, this.f42800c, c0Var, t4.a(this.f42801d | 1), this.f42802e);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends l0 implements Function2<androidx.compose.ui.node.l0, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f42803a = new b();

        b() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, Function1<? super T, Unit> function1) {
            e.f(l0Var).setResetBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, Object obj) {
            c(l0Var, (Function1) obj);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class c<T> extends l0 implements Function2<androidx.compose.ui.node.l0, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f42804a = new c();

        c() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, Function1<? super T, Unit> function1) {
            e.f(l0Var).setUpdateBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, Object obj) {
            c(l0Var, (Function1) obj);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class d<T> extends l0 implements Function2<androidx.compose.ui.node.l0, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f42805a = new d();

        d() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, Function1<? super T, Unit> function1) {
            e.f(l0Var).setReleaseBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, Object obj) {
            c(l0Var, (Function1) obj);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.e$e, reason: collision with other inner class name */
    static final class C0347e<T> extends l0 implements Function2<androidx.compose.ui.node.l0, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0347e f42806a = new C0347e();

        C0347e() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, Function1<? super T, Unit> function1) {
            e.f(l0Var).setUpdateBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, Object obj) {
            c(l0Var, (Function1) obj);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class f<T> extends l0 implements Function2<androidx.compose.ui.node.l0, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f42807a = new f();

        f() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, Function1<? super T, Unit> function1) {
            e.f(l0Var).setReleaseBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, Object obj) {
            c(l0Var, (Function1) obj);
            return Unit.f312394a;
        }
    }

    static final class g extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Context, T> f42808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f42809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f42810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f42811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f42812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f42813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f42814g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super Context, ? extends T> function1, a0 a0Var, Function1<? super T, Unit> function2, Function1<? super T, Unit> function3, Function1<? super T, Unit> function4, int i10, int i11) {
            super(2);
            this.f42808a = function1;
            this.f42809b = a0Var;
            this.f42810c = function2;
            this.f42811d = function3;
            this.f42812e = function4;
            this.f42813f = i10;
            this.f42814g = i11;
        }

        public final void c(c0 c0Var, int i10) {
            e.b(this.f42808a, this.f42809b, this.f42810c, this.f42811d, this.f42812e, c0Var, t4.a(this.f42813f | 1), this.f42814g);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class h extends l0 implements Function1<View, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f42815a = new h();

        h() {
            super(1);
        }

        public final void c(View view) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            c(view);
            return Unit.f312394a;
        }
    }

    static final class i extends l0 implements Function0<androidx.compose.ui.node.l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f42816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Context, T> f42817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0 f42818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f42819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f42820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f42821f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Context context, Function1<? super Context, ? extends T> function1, p0 p0Var, v vVar, int i10, View view) {
            super(0);
            this.f42816a = context;
            this.f42817b = function1;
            this.f42818c = p0Var;
            this.f42819d = vVar;
            this.f42820e = i10;
            this.f42821f = view;
            int i11 = 1 << 0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.node.l0 invoke() {
            Context context = this.f42816a;
            Function1<Context, T> function1 = this.f42817b;
            p0 p0Var = this.f42818c;
            v vVar = this.f42819d;
            int i10 = this.f42820e;
            KeyEvent.Callback callback = this.f42821f;
            Intrinsics.checkNotNull(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            return new androidx.compose.ui.viewinterop.k(context, function1, p0Var, vVar, i10, (x1) callback).getLayoutNode();
        }
    }

    static final class j extends l0 implements Function2<androidx.compose.ui.node.l0, a0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f42822a = new j();

        j() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, a0 a0Var) {
            e.f(l0Var).setModifier(a0Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, a0 a0Var) {
            c(l0Var, a0Var);
            return Unit.f312394a;
        }
    }

    static final class k extends l0 implements Function2<androidx.compose.ui.node.l0, androidx.compose.ui.unit.d, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f42823a = new k();

        k() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, androidx.compose.ui.unit.d dVar) {
            e.f(l0Var).setDensity(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, androidx.compose.ui.unit.d dVar) {
            c(l0Var, dVar);
            return Unit.f312394a;
        }
    }

    static final class l extends l0 implements Function2<androidx.compose.ui.node.l0, o0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f42824a = new l();

        l() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, o0 o0Var) {
            e.f(l0Var).setLifecycleOwner(o0Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, o0 o0Var) {
            c(l0Var, o0Var);
            return Unit.f312394a;
        }
    }

    static final class m extends l0 implements Function2<androidx.compose.ui.node.l0, androidx.savedstate.m, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f42825a = new m();

        m() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, androidx.savedstate.m mVar) {
            e.f(l0Var).setSavedStateRegistryOwner(mVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, androidx.savedstate.m mVar) {
            c(l0Var, mVar);
            return Unit.f312394a;
        }
    }

    static final class n extends l0 implements Function2<androidx.compose.ui.node.l0, w, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f42826a = new n();

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f42827a;

            static {
                int[] iArr = new int[w.values().length];
                try {
                    iArr[w.Ltr.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[w.Rtl.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f42827a = iArr;
            }
        }

        n() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, w wVar) {
            androidx.compose.ui.viewinterop.k kVarF = e.f(l0Var);
            int i10 = a.f42827a[wVar.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 0;
            } else if (i10 != 2) {
                throw new k0();
            }
            kVarF.setLayoutDirection(i11);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, w wVar) {
            c(l0Var, wVar);
            return Unit.f312394a;
        }
    }

    @o
    @h0
    public static final <T extends View> void a(@NotNull Function1<? super Context, ? extends T> function1, @Nullable a0 a0Var, @Nullable Function1<? super T, Unit> function2, @Nullable c0 c0Var, int i10, int i11) {
        int i12;
        a0 a0Var2;
        Function1<? super T, Unit> function3;
        c0 c0VarR = c0Var.R(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            a0 a0Var3 = a0Var;
            Function1<? super T, Unit> function4 = i14 != 0 ? f42797a : function2;
            if (m0.l0()) {
                m0.A0(-1783766393, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            b(function1, a0Var3, null, f42797a, function4, c0VarR, (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B) | (57344 & (i12 << 6)), 4);
            if (m0.l0()) {
                m0.z0();
            }
            a0Var2 = a0Var3;
            function3 = function4;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            function3 = function2;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new a(function1, a0Var2, function3, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01af  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x0116  */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136  */
    /* JADX WARN: Code duplicated, block: B:83:0x013a  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:90:0x017a  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:95:0x019e  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a4  */
    @o
    @h0
    public static final <T extends View> void b(@NotNull Function1<? super Context, ? extends T> function1, @Nullable a0 a0Var, @Nullable Function1<? super T, Unit> function2, @Nullable Function1<? super T, Unit> function3, @Nullable Function1<? super T, Unit> function4, @Nullable c0 c0Var, int i10, int i11) {
        int i12;
        a0 a0Var2;
        int i13;
        Function1<? super T, Unit> function5;
        int i14;
        int i15;
        Function1<? super T, Unit> function6;
        int i16;
        int i17;
        Function1<? super T, Unit> function7;
        int i18;
        boolean z10;
        a0 a0Var3;
        Function1<? super T, Unit> function8;
        Function1<? super T, Unit> function9;
        s5 s5VarT;
        int iHashCode;
        a0 a0VarN;
        androidx.compose.ui.unit.d dVar;
        w wVar;
        b1 b1VarK;
        o0 o0Var;
        androidx.savedstate.m mVar;
        Function0<androidx.compose.ui.node.l0> function0D;
        Function0<androidx.compose.ui.node.l0> function0D2;
        c0 c0VarR = c0Var.R(-180024211);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        function6 = function3;
                        if (c0VarR.k0(function6)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            function7 = function4;
                            if (c0VarR.k0(function7)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i12 & 9363) != 9362) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i19 != 0) {
                                a0Var3 = a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = f42797a;
                            }
                            if (i17 != 0) {
                                function7 = f42797a;
                            }
                            if (m0.l0()) {
                                m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                            }
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                            dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                            wVar = (w) c0VarR.W(q1.u());
                            b1VarK = c0VarR.k();
                            o0Var = (o0) c0VarR.W(d0.c());
                            mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                            if (function5 != null) {
                                c0VarR.E(1313943160);
                                function0D2 = d(function1, c0VarR, i12 & 14);
                                if (!(c0VarR.S() instanceof r2)) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0VarR.q();
                                if (c0VarR.P()) {
                                    c0VarR.q0(function0D2);
                                } else {
                                    c0VarR.l();
                                }
                                c0 c0VarD = y7.d(c0VarR);
                                g(c0VarD, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                                y7.n(c0VarD, function5, b.f42803a);
                                y7.n(c0VarD, function7, c.f42804a);
                                y7.n(c0VarD, function6, d.f42805a);
                                c0VarR.o();
                                c0VarR.A();
                            } else {
                                c0VarR.E(1314800527);
                                function0D = d(function1, c0VarR, i12 & 14);
                                if (!(c0VarR.S() instanceof r2)) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0VarR.V();
                                if (c0VarR.P()) {
                                    c0VarR.q0(function0D);
                                } else {
                                    c0VarR.l();
                                }
                                c0 c0VarD2 = y7.d(c0VarR);
                                g(c0VarD2, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                                y7.n(c0VarD2, function7, C0347e.f42806a);
                                y7.n(c0VarD2, function6, f.f42807a);
                                c0VarR.o();
                                c0VarR.A();
                            }
                            if (m0.l0()) {
                                m0.z0();
                            }
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        function8 = function5;
                        function9 = function7;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                        }
                    }
                    i12 |= 24576;
                    function7 = function4;
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i19 != 0) {
                            a0Var3 = a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = f42797a;
                        }
                        if (i17 != 0) {
                            function7 = f42797a;
                        }
                        if (m0.l0()) {
                            m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                        dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                        wVar = (w) c0VarR.W(q1.u());
                        b1VarK = c0VarR.k();
                        o0Var = (o0) c0VarR.W(d0.c());
                        mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                        if (function5 != null) {
                            c0VarR.E(1313943160);
                            function0D2 = d(function1, c0VarR, i12 & 14);
                            if (!(c0VarR.S() instanceof r2)) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0D2);
                            } else {
                                c0VarR.l();
                            }
                            c0 c0VarD3 = y7.d(c0VarR);
                            g(c0VarD3, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                            y7.n(c0VarD3, function5, b.f42803a);
                            y7.n(c0VarD3, function7, c.f42804a);
                            y7.n(c0VarD3, function6, d.f42805a);
                            c0VarR.o();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1314800527);
                            function0D = d(function1, c0VarR, i12 & 14);
                            if (!(c0VarR.S() instanceof r2)) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.V();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0D);
                            } else {
                                c0VarR.l();
                            }
                            c0 c0VarD4 = y7.d(c0VarR);
                            g(c0VarD4, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                            y7.n(c0VarD4, function7, C0347e.f42806a);
                            y7.n(c0VarD4, function6, f.f42807a);
                            c0VarR.o();
                            c0VarR.A();
                        }
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    function8 = function5;
                    function9 = function7;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                    }
                }
                i12 |= 3072;
                function6 = function3;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function7 = function4;
                        if (c0VarR.k0(function7)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i19 != 0) {
                            a0Var3 = a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = f42797a;
                        }
                        if (i17 != 0) {
                            function7 = f42797a;
                        }
                        if (m0.l0()) {
                            m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                        dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                        wVar = (w) c0VarR.W(q1.u());
                        b1VarK = c0VarR.k();
                        o0Var = (o0) c0VarR.W(d0.c());
                        mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                        if (function5 != null) {
                            c0VarR.E(1313943160);
                            function0D2 = d(function1, c0VarR, i12 & 14);
                            if (!(c0VarR.S() instanceof r2)) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0D2);
                            } else {
                                c0VarR.l();
                            }
                            c0 c0VarD5 = y7.d(c0VarR);
                            g(c0VarD5, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                            y7.n(c0VarD5, function5, b.f42803a);
                            y7.n(c0VarD5, function7, c.f42804a);
                            y7.n(c0VarD5, function6, d.f42805a);
                            c0VarR.o();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1314800527);
                            function0D = d(function1, c0VarR, i12 & 14);
                            if (!(c0VarR.S() instanceof r2)) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.V();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0D);
                            } else {
                                c0VarR.l();
                            }
                            c0 c0VarD6 = y7.d(c0VarR);
                            g(c0VarD6, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                            y7.n(c0VarD6, function7, C0347e.f42806a);
                            y7.n(c0VarD6, function6, f.f42807a);
                            c0VarR.o();
                            c0VarR.A();
                        }
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    function8 = function5;
                    function9 = function7;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                    }
                }
                i12 |= 24576;
                function7 = function4;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        a0Var3 = a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = f42797a;
                    }
                    if (i17 != 0) {
                        function7 = f42797a;
                    }
                    if (m0.l0()) {
                        m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                    wVar = (w) c0VarR.W(q1.u());
                    b1VarK = c0VarR.k();
                    o0Var = (o0) c0VarR.W(d0.c());
                    mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                    if (function5 != null) {
                        c0VarR.E(1313943160);
                        function0D2 = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D2);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD7 = y7.d(c0VarR);
                        g(c0VarD7, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD7, function5, b.f42803a);
                        y7.n(c0VarD7, function7, c.f42804a);
                        y7.n(c0VarD7, function6, d.f42805a);
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1314800527);
                        function0D = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.V();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD8 = y7.d(c0VarR);
                        g(c0VarD8, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD8, function7, C0347e.f42806a);
                        y7.n(c0VarD8, function6, f.f42807a);
                        c0VarR.o();
                        c0VarR.A();
                    }
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                function8 = function5;
                function9 = function7;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                }
            }
            i12 |= a5.S0;
            function5 = function2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function6 = function3;
                    if (c0VarR.k0(function6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function7 = function4;
                        if (c0VarR.k0(function7)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i19 != 0) {
                            a0Var3 = a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = f42797a;
                        }
                        if (i17 != 0) {
                            function7 = f42797a;
                        }
                        if (m0.l0()) {
                            m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                        dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                        wVar = (w) c0VarR.W(q1.u());
                        b1VarK = c0VarR.k();
                        o0Var = (o0) c0VarR.W(d0.c());
                        mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                        if (function5 != null) {
                            c0VarR.E(1313943160);
                            function0D2 = d(function1, c0VarR, i12 & 14);
                            if (!(c0VarR.S() instanceof r2)) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0D2);
                            } else {
                                c0VarR.l();
                            }
                            c0 c0VarD9 = y7.d(c0VarR);
                            g(c0VarD9, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                            y7.n(c0VarD9, function5, b.f42803a);
                            y7.n(c0VarD9, function7, c.f42804a);
                            y7.n(c0VarD9, function6, d.f42805a);
                            c0VarR.o();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1314800527);
                            function0D = d(function1, c0VarR, i12 & 14);
                            if (!(c0VarR.S() instanceof r2)) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.V();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0D);
                            } else {
                                c0VarR.l();
                            }
                            c0 c0VarD10 = y7.d(c0VarR);
                            g(c0VarD10, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                            y7.n(c0VarD10, function7, C0347e.f42806a);
                            y7.n(c0VarD10, function6, f.f42807a);
                            c0VarR.o();
                            c0VarR.A();
                        }
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    function8 = function5;
                    function9 = function7;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                    }
                }
                i12 |= 24576;
                function7 = function4;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        a0Var3 = a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = f42797a;
                    }
                    if (i17 != 0) {
                        function7 = f42797a;
                    }
                    if (m0.l0()) {
                        m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                    wVar = (w) c0VarR.W(q1.u());
                    b1VarK = c0VarR.k();
                    o0Var = (o0) c0VarR.W(d0.c());
                    mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                    if (function5 != null) {
                        c0VarR.E(1313943160);
                        function0D2 = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D2);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD11 = y7.d(c0VarR);
                        g(c0VarD11, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD11, function5, b.f42803a);
                        y7.n(c0VarD11, function7, c.f42804a);
                        y7.n(c0VarD11, function6, d.f42805a);
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1314800527);
                        function0D = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.V();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD12 = y7.d(c0VarR);
                        g(c0VarD12, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD12, function7, C0347e.f42806a);
                        y7.n(c0VarD12, function6, f.f42807a);
                        c0VarR.o();
                        c0VarR.A();
                    }
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                function8 = function5;
                function9 = function7;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                }
            }
            i12 |= 3072;
            function6 = function3;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function7 = function4;
                    if (c0VarR.k0(function7)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        a0Var3 = a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = f42797a;
                    }
                    if (i17 != 0) {
                        function7 = f42797a;
                    }
                    if (m0.l0()) {
                        m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                    wVar = (w) c0VarR.W(q1.u());
                    b1VarK = c0VarR.k();
                    o0Var = (o0) c0VarR.W(d0.c());
                    mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                    if (function5 != null) {
                        c0VarR.E(1313943160);
                        function0D2 = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D2);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD13 = y7.d(c0VarR);
                        g(c0VarD13, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD13, function5, b.f42803a);
                        y7.n(c0VarD13, function7, c.f42804a);
                        y7.n(c0VarD13, function6, d.f42805a);
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1314800527);
                        function0D = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.V();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD14 = y7.d(c0VarR);
                        g(c0VarD14, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD14, function7, C0347e.f42806a);
                        y7.n(c0VarD14, function6, f.f42807a);
                        c0VarR.o();
                        c0VarR.A();
                    }
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                function8 = function5;
                function9 = function7;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                }
            }
            i12 |= 24576;
            function7 = function4;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    function6 = f42797a;
                }
                if (i17 != 0) {
                    function7 = f42797a;
                }
                if (m0.l0()) {
                    m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                wVar = (w) c0VarR.W(q1.u());
                b1VarK = c0VarR.k();
                o0Var = (o0) c0VarR.W(d0.c());
                mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                if (function5 != null) {
                    c0VarR.E(1313943160);
                    function0D2 = d(function1, c0VarR, i12 & 14);
                    if (!(c0VarR.S() instanceof r2)) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0D2);
                    } else {
                        c0VarR.l();
                    }
                    c0 c0VarD15 = y7.d(c0VarR);
                    g(c0VarD15, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                    y7.n(c0VarD15, function5, b.f42803a);
                    y7.n(c0VarD15, function7, c.f42804a);
                    y7.n(c0VarD15, function6, d.f42805a);
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    c0VarR.E(1314800527);
                    function0D = d(function1, c0VarR, i12 & 14);
                    if (!(c0VarR.S() instanceof r2)) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.V();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0D);
                    } else {
                        c0VarR.l();
                    }
                    c0 c0VarD16 = y7.d(c0VarR);
                    g(c0VarD16, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                    y7.n(c0VarD16, function7, C0347e.f42806a);
                    y7.n(c0VarD16, function6, f.f42807a);
                    c0VarR.o();
                    c0VarR.A();
                }
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            function8 = function5;
            function9 = function7;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                function5 = function2;
                if (c0VarR.k0(function5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function6 = function3;
                    if (c0VarR.k0(function6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function7 = function4;
                        if (c0VarR.k0(function7)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i19 != 0) {
                            a0Var3 = a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = f42797a;
                        }
                        if (i17 != 0) {
                            function7 = f42797a;
                        }
                        if (m0.l0()) {
                            m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                        dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                        wVar = (w) c0VarR.W(q1.u());
                        b1VarK = c0VarR.k();
                        o0Var = (o0) c0VarR.W(d0.c());
                        mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                        if (function5 != null) {
                            c0VarR.E(1313943160);
                            function0D2 = d(function1, c0VarR, i12 & 14);
                            if (!(c0VarR.S() instanceof r2)) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0D2);
                            } else {
                                c0VarR.l();
                            }
                            c0 c0VarD17 = y7.d(c0VarR);
                            g(c0VarD17, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                            y7.n(c0VarD17, function5, b.f42803a);
                            y7.n(c0VarD17, function7, c.f42804a);
                            y7.n(c0VarD17, function6, d.f42805a);
                            c0VarR.o();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1314800527);
                            function0D = d(function1, c0VarR, i12 & 14);
                            if (!(c0VarR.S() instanceof r2)) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.V();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0D);
                            } else {
                                c0VarR.l();
                            }
                            c0 c0VarD18 = y7.d(c0VarR);
                            g(c0VarD18, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                            y7.n(c0VarD18, function7, C0347e.f42806a);
                            y7.n(c0VarD18, function6, f.f42807a);
                            c0VarR.o();
                            c0VarR.A();
                        }
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    function8 = function5;
                    function9 = function7;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                    }
                }
                i12 |= 24576;
                function7 = function4;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        a0Var3 = a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = f42797a;
                    }
                    if (i17 != 0) {
                        function7 = f42797a;
                    }
                    if (m0.l0()) {
                        m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                    wVar = (w) c0VarR.W(q1.u());
                    b1VarK = c0VarR.k();
                    o0Var = (o0) c0VarR.W(d0.c());
                    mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                    if (function5 != null) {
                        c0VarR.E(1313943160);
                        function0D2 = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D2);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD19 = y7.d(c0VarR);
                        g(c0VarD19, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD19, function5, b.f42803a);
                        y7.n(c0VarD19, function7, c.f42804a);
                        y7.n(c0VarD19, function6, d.f42805a);
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1314800527);
                        function0D = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.V();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD110 = y7.d(c0VarR);
                        g(c0VarD110, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD110, function7, C0347e.f42806a);
                        y7.n(c0VarD110, function6, f.f42807a);
                        c0VarR.o();
                        c0VarR.A();
                    }
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                function8 = function5;
                function9 = function7;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                }
            }
            i12 |= 3072;
            function6 = function3;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function7 = function4;
                    if (c0VarR.k0(function7)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        a0Var3 = a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = f42797a;
                    }
                    if (i17 != 0) {
                        function7 = f42797a;
                    }
                    if (m0.l0()) {
                        m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                    wVar = (w) c0VarR.W(q1.u());
                    b1VarK = c0VarR.k();
                    o0Var = (o0) c0VarR.W(d0.c());
                    mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                    if (function5 != null) {
                        c0VarR.E(1313943160);
                        function0D2 = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D2);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD111 = y7.d(c0VarR);
                        g(c0VarD111, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD111, function5, b.f42803a);
                        y7.n(c0VarD111, function7, c.f42804a);
                        y7.n(c0VarD111, function6, d.f42805a);
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1314800527);
                        function0D = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.V();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD112 = y7.d(c0VarR);
                        g(c0VarD112, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD112, function7, C0347e.f42806a);
                        y7.n(c0VarD112, function6, f.f42807a);
                        c0VarR.o();
                        c0VarR.A();
                    }
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                function8 = function5;
                function9 = function7;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                }
            }
            i12 |= 24576;
            function7 = function4;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    function6 = f42797a;
                }
                if (i17 != 0) {
                    function7 = f42797a;
                }
                if (m0.l0()) {
                    m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                wVar = (w) c0VarR.W(q1.u());
                b1VarK = c0VarR.k();
                o0Var = (o0) c0VarR.W(d0.c());
                mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                if (function5 != null) {
                    c0VarR.E(1313943160);
                    function0D2 = d(function1, c0VarR, i12 & 14);
                    if (!(c0VarR.S() instanceof r2)) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0D2);
                    } else {
                        c0VarR.l();
                    }
                    c0 c0VarD113 = y7.d(c0VarR);
                    g(c0VarD113, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                    y7.n(c0VarD113, function5, b.f42803a);
                    y7.n(c0VarD113, function7, c.f42804a);
                    y7.n(c0VarD113, function6, d.f42805a);
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    c0VarR.E(1314800527);
                    function0D = d(function1, c0VarR, i12 & 14);
                    if (!(c0VarR.S() instanceof r2)) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.V();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0D);
                    } else {
                        c0VarR.l();
                    }
                    c0 c0VarD114 = y7.d(c0VarR);
                    g(c0VarD114, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                    y7.n(c0VarD114, function7, C0347e.f42806a);
                    y7.n(c0VarD114, function6, f.f42807a);
                    c0VarR.o();
                    c0VarR.A();
                }
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            function8 = function5;
            function9 = function7;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
            }
        }
        i12 |= a5.S0;
        function5 = function2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                function6 = function3;
                if (c0VarR.k0(function6)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function7 = function4;
                    if (c0VarR.k0(function7)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        a0Var3 = a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = f42797a;
                    }
                    if (i17 != 0) {
                        function7 = f42797a;
                    }
                    if (m0.l0()) {
                        m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                    wVar = (w) c0VarR.W(q1.u());
                    b1VarK = c0VarR.k();
                    o0Var = (o0) c0VarR.W(d0.c());
                    mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                    if (function5 != null) {
                        c0VarR.E(1313943160);
                        function0D2 = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D2);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD115 = y7.d(c0VarR);
                        g(c0VarD115, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD115, function5, b.f42803a);
                        y7.n(c0VarD115, function7, c.f42804a);
                        y7.n(c0VarD115, function6, d.f42805a);
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1314800527);
                        function0D = d(function1, c0VarR, i12 & 14);
                        if (!(c0VarR.S() instanceof r2)) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.V();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0D);
                        } else {
                            c0VarR.l();
                        }
                        c0 c0VarD116 = y7.d(c0VarR);
                        g(c0VarD116, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                        y7.n(c0VarD116, function7, C0347e.f42806a);
                        y7.n(c0VarD116, function6, f.f42807a);
                        c0VarR.o();
                        c0VarR.A();
                    }
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                function8 = function5;
                function9 = function7;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
                }
            }
            i12 |= 24576;
            function7 = function4;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    function6 = f42797a;
                }
                if (i17 != 0) {
                    function7 = f42797a;
                }
                if (m0.l0()) {
                    m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                wVar = (w) c0VarR.W(q1.u());
                b1VarK = c0VarR.k();
                o0Var = (o0) c0VarR.W(d0.c());
                mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                if (function5 != null) {
                    c0VarR.E(1313943160);
                    function0D2 = d(function1, c0VarR, i12 & 14);
                    if (!(c0VarR.S() instanceof r2)) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0D2);
                    } else {
                        c0VarR.l();
                    }
                    c0 c0VarD117 = y7.d(c0VarR);
                    g(c0VarD117, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                    y7.n(c0VarD117, function5, b.f42803a);
                    y7.n(c0VarD117, function7, c.f42804a);
                    y7.n(c0VarD117, function6, d.f42805a);
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    c0VarR.E(1314800527);
                    function0D = d(function1, c0VarR, i12 & 14);
                    if (!(c0VarR.S() instanceof r2)) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.V();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0D);
                    } else {
                        c0VarR.l();
                    }
                    c0 c0VarD118 = y7.d(c0VarR);
                    g(c0VarD118, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                    y7.n(c0VarD118, function7, C0347e.f42806a);
                    y7.n(c0VarD118, function6, f.f42807a);
                    c0VarR.o();
                    c0VarR.A();
                }
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            function8 = function5;
            function9 = function7;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
            }
        }
        i12 |= 3072;
        function6 = function3;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                function7 = function4;
                if (c0VarR.k0(function7)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    function6 = f42797a;
                }
                if (i17 != 0) {
                    function7 = f42797a;
                }
                if (m0.l0()) {
                    m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                wVar = (w) c0VarR.W(q1.u());
                b1VarK = c0VarR.k();
                o0Var = (o0) c0VarR.W(d0.c());
                mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
                if (function5 != null) {
                    c0VarR.E(1313943160);
                    function0D2 = d(function1, c0VarR, i12 & 14);
                    if (!(c0VarR.S() instanceof r2)) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0D2);
                    } else {
                        c0VarR.l();
                    }
                    c0 c0VarD119 = y7.d(c0VarR);
                    g(c0VarD119, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                    y7.n(c0VarD119, function5, b.f42803a);
                    y7.n(c0VarD119, function7, c.f42804a);
                    y7.n(c0VarD119, function6, d.f42805a);
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    c0VarR.E(1314800527);
                    function0D = d(function1, c0VarR, i12 & 14);
                    if (!(c0VarR.S() instanceof r2)) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.V();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0D);
                    } else {
                        c0VarR.l();
                    }
                    c0 c0VarD1110 = y7.d(c0VarR);
                    g(c0VarD1110, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                    y7.n(c0VarD1110, function7, C0347e.f42806a);
                    y7.n(c0VarD1110, function6, f.f42807a);
                    c0VarR.o();
                    c0VarR.A();
                }
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            function8 = function5;
            function9 = function7;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
            }
        }
        i12 |= 24576;
        function7 = function4;
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i19 != 0) {
                a0Var3 = a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                function5 = null;
            }
            if (i15 != 0) {
                function6 = f42797a;
            }
            if (i17 != 0) {
                function7 = f42797a;
            }
            if (m0.l0()) {
                m0.A0(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
            }
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            a0VarN = androidx.compose.ui.m.n(c0VarR, androidx.compose.ui.viewinterop.f.e(a0Var3));
            dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
            wVar = (w) c0VarR.W(q1.u());
            b1VarK = c0VarR.k();
            o0Var = (o0) c0VarR.W(d0.c());
            mVar = (androidx.savedstate.m) c0VarR.W(s3.b.c());
            if (function5 != null) {
                c0VarR.E(1313943160);
                function0D2 = d(function1, c0VarR, i12 & 14);
                if (!(c0VarR.S() instanceof r2)) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0D2);
                } else {
                    c0VarR.l();
                }
                c0 c0VarD1111 = y7.d(c0VarR);
                g(c0VarD1111, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                y7.n(c0VarD1111, function5, b.f42803a);
                y7.n(c0VarD1111, function7, c.f42804a);
                y7.n(c0VarD1111, function6, d.f42805a);
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(1314800527);
                function0D = d(function1, c0VarR, i12 & 14);
                if (!(c0VarR.S() instanceof r2)) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.V();
                if (c0VarR.P()) {
                    c0VarR.q0(function0D);
                } else {
                    c0VarR.l();
                }
                c0 c0VarD1112 = y7.d(c0VarR);
                g(c0VarD1112, a0VarN, iHashCode, dVar, o0Var, mVar, wVar, b1VarK);
                y7.n(c0VarD1112, function7, C0347e.f42806a);
                y7.n(c0VarD1112, function6, f.f42807a);
                c0VarR.o();
                c0VarR.A();
            }
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        function8 = function5;
        function9 = function7;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new g(function1, a0Var3, function8, function6, function9, i10, i11));
        }
    }

    @o
    private static final <T extends View> Function0<androidx.compose.ui.node.l0> d(Function1<? super Context, ? extends T> function1, c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(2030558801, i10, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        p0 p0VarY = androidx.compose.runtime.v.y(c0Var, 0);
        v vVar = (v) c0Var.W(y.g());
        View view = (View) c0Var.W(AndroidCompositionLocals_androidKt.m());
        boolean zK0 = c0Var.k0(context) | ((((i10 & 14) ^ 6) > 4 && c0Var.D(function1)) || (i10 & 6) == 4) | c0Var.k0(p0VarY) | c0Var.k0(vVar) | c0Var.K(iHashCode) | c0Var.k0(view);
        Object objI0 = c0Var.i0();
        if (zK0 || objI0 == c0.f35327a.a()) {
            Object iVar = new i(context, function1, p0VarY, vVar, iHashCode, view);
            c0Var.Y(iVar);
            objI0 = iVar;
        }
        Function0<androidx.compose.ui.node.l0> function0 = (Function0) objI0;
        if (m0.l0()) {
            m0.z0();
        }
        return function0;
    }

    @NotNull
    public static final Function1<View, Unit> e() {
        return f42797a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> androidx.compose.ui.viewinterop.k<T> f(androidx.compose.ui.node.l0 l0Var) {
        androidx.compose.ui.viewinterop.b bVarH0 = l0Var.h0();
        if (bVarH0 != null) {
            return (androidx.compose.ui.viewinterop.k) bVarH0;
        }
        s0.a.j("Required value was null.");
        throw new kotlin.a0();
    }

    private static final <T extends View> void g(c0 c0Var, a0 a0Var, int i10, androidx.compose.ui.unit.d dVar, o0 o0Var, androidx.savedstate.m mVar, w wVar, b1 b1Var) {
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        y7.n(c0Var, b1Var, aVar.g());
        y7.n(c0Var, a0Var, j.f42822a);
        y7.n(c0Var, dVar, k.f42823a);
        y7.n(c0Var, o0Var, l.f42824a);
        y7.n(c0Var, mVar, m.f42825a);
        y7.n(c0Var, wVar, n.f42826a);
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (!c0Var.P() && Intrinsics.areEqual(c0Var.i0(), Integer.valueOf(i10))) {
            return;
        }
        c0Var.Y(Integer.valueOf(i10));
        c0Var.f(Integer.valueOf(i10), function2B);
    }
}
