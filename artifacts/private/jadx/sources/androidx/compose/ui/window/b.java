package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.z0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import androidx.compose.ui.unit.w;
import androidx.media3.exoplayer.a5;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
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
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,705:1\n75#2:706\n75#2:707\n75#2:708\n1282#3,6:709\n1282#3,6:715\n1282#3,6:721\n1282#3,6:727\n1282#3,6:733\n1282#3,6:739\n80#4,6:745\n87#4,3:760\n90#4,2:769\n94#4:774\n391#5,9:751\n400#5,3:771\n4360#6,6:763\n85#7:775\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n201#1:706\n202#1:707\n203#1:708\n206#1:709,6\n208#1:715,6\n217#1:721,6\n219#1:727,6\n226#1:733,6\n667#1:739,6\n667#1:745,6\n667#1:760,3\n667#1:769,2\n667#1:774\n667#1:751,9\n667#1:771,3\n667#1:763,6\n205#1:775\n*E\n"})
public final class b {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1", f = "AndroidDialog.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f42853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f42854b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f42854b = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f42854b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f42853a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f42854b.show();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,705:1\n66#2,5:706\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$2$1\n*L\n220#1:706,5\n*E\n"})
    static final class C0348b extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f42855a;

        /* JADX INFO: renamed from: androidx.compose.ui.window.b$b$a */
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$2$1\n*L\n1#1,69:1\n221#2,3:70\n*E\n"})
        public static final class a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f42856a;

            public a(m mVar) {
                this.f42856a = mVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f42856a.dismiss();
                this.f42856a.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0348b(m mVar) {
            super(1);
            this.f42855a = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(v1 v1Var) {
            return new a(this.f42855a);
        }
    }

    static final class c extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f42857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f42859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f42860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m mVar, Function0<Unit> function0, k kVar, w wVar) {
            super(0);
            this.f42857a = mVar;
            this.f42858b = function0;
            this.f42859c = kVar;
            this.f42860d = wVar;
            boolean z10 = true | false;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f42857a.o(this.f42858b, this.f42859c, this.f42860d);
        }
    }

    static final class d extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f42862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<c0, Integer, Unit> f42863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f42864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f42865e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<Unit> function0, k kVar, Function2<? super c0, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f42861a = function0;
            this.f42862b = kVar;
            this.f42863c = function2;
            this.f42864d = i10;
            this.f42865e = i11;
        }

        public final void c(c0 c0Var, int i10) {
            b.a(this.f42861a, this.f42862b, this.f42863c, c0Var, t4.a(this.f42864d | 1), this.f42865e);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$dialog$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,705:1\n1282#2,6:706\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$dialog$1$1$1\n*L\n212#1:706,6\n*E\n"})
    static final class e extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n7<Function2<c0, Integer, Unit>> f42866a;

        static final class a extends l0 implements Function1<e0, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f42867a = new a();

            a() {
                super(1);
            }

            public final void c(e0 e0Var) {
                b0.m(e0Var);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(e0 e0Var) {
                c(e0Var);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(n7<? extends Function2<? super c0, ? super Integer, Unit>> n7Var) {
            super(2);
            this.f42866a = n7Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(346960332, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:211)");
            }
            a0.a aVar = a0.E;
            Object objI0 = c0Var.i0();
            if (objI0 == c0.f35327a.a()) {
                objI0 = a.f42867a;
                c0Var.Y(objI0);
            }
            b.c(androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), b.b(this.f42866a), c0Var, 0, 0);
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

    static final class f extends l0 implements Function0<UUID> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f42868a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,705:1\n151#2,2:706\n35#2,5:708\n153#2:713\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1\n*L\n671#1:706,2\n671#1:708,5\n671#1:713\n*E\n"})
    static final class g implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f42869a = new g();

        @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,705:1\n35#2,5:706\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1$1\n*L\n681#1:706,5\n*E\n"})
        static final class a extends l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<i2> f42870a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends i2> list) {
                super(1);
                this.f42870a = list;
            }

            public final void c(i2.a aVar) {
                List<i2> list = this.f42870a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int i11 = 5 << 0;
                    i2.a.e0(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        g() {
        }

        @Override // androidx.compose.ui.layout.a1
        public final b1 a(c1 c1Var, List<? extends z0> list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int iR = 0;
            int iQ = 0;
            for (int i10 = 0; i10 < size; i10++) {
                i2 i2VarP0 = list.get(i10).P0(j10);
                iR = Math.max(iR, i2VarP0.h1());
                iQ = Math.max(iQ, i2VarP0.c1());
                arrayList.add(i2VarP0);
            }
            if (list.isEmpty()) {
                iR = androidx.compose.ui.unit.b.r(j10);
                iQ = androidx.compose.ui.unit.b.q(j10);
            }
            return c1.h6(c1Var, iR, iQ, null, new a(arrayList), 4, null);
        }
    }

    static final class h extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f42871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<c0, Integer, Unit> f42872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f42873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f42874d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(a0 a0Var, Function2<? super c0, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f42871a = a0Var;
            this.f42872b = function2;
            this.f42873c = i10;
            this.f42874d = i11;
        }

        public final void c(c0 c0Var, int i10) {
            b.c(this.f42871a, this.f42872b, c0Var, t4.a(this.f42873c | 1), this.f42874d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0192  */
    /* JADX WARN: Code duplicated, block: B:84:0x019c  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@NotNull Function0<Unit> function0, @Nullable k kVar, @NotNull Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, int i10, int i11) {
        int i12;
        k kVar2;
        int i13;
        int i14;
        boolean z10;
        k kVar3;
        s5 s5VarT;
        View view;
        androidx.compose.ui.unit.d dVar;
        w wVar;
        p0 p0VarY;
        n7 n7VarW;
        Object objI0;
        c0.a aVar;
        UUID uuid;
        boolean zD;
        Object objI1;
        m mVar;
        boolean zK0;
        Object objI2;
        boolean zK1;
        Object objI3;
        boolean z11;
        boolean zK;
        Object objI4;
        c0 c0VarR = c0Var.R(826668973);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                kVar2 = kVar;
                i12 |= c0VarR.D(kVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= a5.S0;
            } else if ((i10 & a5.S0) == 0) {
                if (c0VarR.k0(function2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i15 != 0) {
                    kVar3 = new k(false, false, false, 7, (DefaultConstructorMarker) null);
                } else {
                    kVar3 = kVar2;
                }
                if (m0.l0()) {
                    m0.A0(826668973, i14, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:199)");
                }
                view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
                wVar = (w) c0VarR.W(q1.u());
                p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
                n7VarW = w6.w(function2, c0VarR, (i14 >> 6) & 14);
                Object[] objArr = new Object[0];
                objI0 = c0VarR.i0();
                aVar = c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = f.f42868a;
                    c0VarR.Y(objI0);
                }
                uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr, (Function0) objI0, c0VarR, 48);
                zD = c0VarR.D(view) | c0VarR.D(dVar);
                objI1 = c0VarR.i0();
                if (zD || objI1 == aVar.a()) {
                    m mVar2 = new m(function0, kVar3, view, wVar, dVar, uuid);
                    mVar2.l(p0VarY, androidx.compose.runtime.internal.w.c(346960332, true, new e(n7VarW)));
                    c0VarR.Y(mVar2);
                    objI1 = mVar2;
                }
                mVar = (m) objI1;
                Unit unit = Unit.f312394a;
                zK0 = c0VarR.k0(mVar);
                objI2 = c0VarR.i0();
                if (zK0 || objI2 == aVar.a()) {
                    objI2 = new a(mVar, null);
                    c0VarR.Y(objI2);
                }
                b2.i(unit, (Function2) objI2, c0VarR, 6);
                zK1 = c0VarR.k0(mVar);
                objI3 = c0VarR.i0();
                if (zK1 || objI3 == aVar.a()) {
                    objI3 = new C0348b(mVar);
                    c0VarR.Y(objI3);
                }
                b2.d(mVar, (Function1) objI3, c0VarR, 0);
                boolean zK2 = c0VarR.k0(mVar);
                if ((i14 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zK = zK2 | z11 | ((i14 & com.planner5d.library.engine.input.f.b.B) == 32) | c0VarR.K(wVar.ordinal());
                objI4 = c0VarR.i0();
                if (zK || objI4 == aVar.a()) {
                    objI4 = new c(mVar, function0, kVar3, wVar);
                    c0VarR.Y(objI4);
                }
                b2.m((Function0) objI4, c0VarR, 0);
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
                kVar3 = kVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new d(function0, kVar3, function2, i10, i11));
            }
        }
        i12 |= 48;
        kVar2 = kVar;
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            if (c0VarR.k0(function2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((i14 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i14 & 1)) {
            if (i15 != 0) {
                kVar3 = new k(false, false, false, 7, (DefaultConstructorMarker) null);
            } else {
                kVar3 = kVar2;
            }
            if (m0.l0()) {
                m0.A0(826668973, i14, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:199)");
            }
            view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
            dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
            wVar = (w) c0VarR.W(q1.u());
            p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
            n7VarW = w6.w(function2, c0VarR, (i14 >> 6) & 14);
            Object[] objArr2 = new Object[0];
            objI0 = c0VarR.i0();
            aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = f.f42868a;
                c0VarR.Y(objI0);
            }
            uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr2, (Function0) objI0, c0VarR, 48);
            zD = c0VarR.D(view) | c0VarR.D(dVar);
            objI1 = c0VarR.i0();
            if (zD) {
                m mVar3 = new m(function0, kVar3, view, wVar, dVar, uuid);
                mVar3.l(p0VarY, androidx.compose.runtime.internal.w.c(346960332, true, new e(n7VarW)));
                c0VarR.Y(mVar3);
                objI1 = mVar3;
            } else {
                m mVar4 = new m(function0, kVar3, view, wVar, dVar, uuid);
                mVar4.l(p0VarY, androidx.compose.runtime.internal.w.c(346960332, true, new e(n7VarW)));
                c0VarR.Y(mVar4);
                objI1 = mVar4;
            }
            mVar = (m) objI1;
            Unit unit2 = Unit.f312394a;
            zK0 = c0VarR.k0(mVar);
            objI2 = c0VarR.i0();
            if (zK0) {
                objI2 = new a(mVar, null);
                c0VarR.Y(objI2);
            } else {
                objI2 = new a(mVar, null);
                c0VarR.Y(objI2);
            }
            b2.i(unit2, (Function2) objI2, c0VarR, 6);
            zK1 = c0VarR.k0(mVar);
            objI3 = c0VarR.i0();
            if (zK1) {
                objI3 = new C0348b(mVar);
                c0VarR.Y(objI3);
            } else {
                objI3 = new C0348b(mVar);
                c0VarR.Y(objI3);
            }
            b2.d(mVar, (Function1) objI3, c0VarR, 0);
            boolean zK3 = c0VarR.k0(mVar);
            if ((i14 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            zK = zK3 | z11 | ((i14 & com.planner5d.library.engine.input.f.b.B) == 32) | c0VarR.K(wVar.ordinal());
            objI4 = c0VarR.i0();
            if (zK) {
                objI4 = new c(mVar, function0, kVar3, wVar);
                c0VarR.Y(objI4);
            } else {
                objI4 = new c(mVar, function0, kVar3, wVar);
                c0VarR.Y(objI4);
            }
            b2.m((Function0) objI4, c0VarR, 0);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
            kVar3 = kVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new d(function0, kVar3, function2, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<c0, Integer, Unit> b(n7<? extends Function2<? super c0, ? super Integer, Unit>> n7Var) {
        return (Function2) n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(a0 a0Var, Function2<? super c0, ? super Integer, Unit> function2, c0 c0Var, int i10, int i11) {
        int i12;
        c0 c0VarR = c0Var.R(1090521195);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            if (m0.l0()) {
                m0.A0(1090521195, i12, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:665)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == c0.f35327a.a()) {
                objI0 = g.f42869a;
                c0VarR.Y(objI0);
            }
            a1 a1Var = (a1) objI0;
            int i14 = ((i12 >> 3) & 14) | a5.S0 | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1Var, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            function2.invoke(c0VarR, Integer.valueOf((i15 >> 6) & 14));
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new h(a0Var, function2, i10, i11));
        }
    }
}
