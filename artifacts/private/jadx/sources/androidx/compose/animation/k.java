package androidx.compose.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.animation.core.w1;
import androidx.compose.animation.core.w3;
import androidx.compose.foundation.layout.x5;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k4;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.i2;
import androidx.media3.exoplayer.a5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,862:1\n1282#2,6:863\n1282#2,6:869\n1282#2,6:875\n1282#2,6:881\n1282#2,6:887\n1282#2,6:893\n1282#2,6:899\n1282#2,6:905\n1282#2,6:913\n1282#2,6:922\n1282#2,6:928\n1282#2,6:934\n1282#2,6:940\n1282#2,6:976\n1768#3,2:911\n1770#3,3:919\n80#4,6:946\n87#4,3:961\n90#4,2:970\n94#4:975\n391#5,9:952\n400#5,3:972\n4360#6,6:964\n85#7:982\n85#7:983\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n133#1:863,6\n207#1:869,6\n280#1:875,6\n379#1:881,6\n451#1:887,6\n525#1:893,6\n683#1:899,6\n695#1:905,6\n724#1:913,6\n734#1:922,6\n750#1:928,6\n759#1:934,6\n770#1:940,6\n846#1:976,6\n724#1:911,2\n724#1:919,3\n751#1:946,6\n751#1:961,3\n751#1:970,2\n751#1:975\n751#1:952,9\n751#1:972,3\n751#1:964,6\n728#1:982\n731#1:983\n*E\n"})
public final class k {

    @SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,862:1\n30#2:863\n80#3:864\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1\n*L\n762#1:863\n762#1:864\n*E\n"})
    static final class a extends kotlin.jvm.internal.l0 implements pj.n<androidx.compose.ui.layout.c1, androidx.compose.ui.layout.z0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p0 f13547a;

        /* JADX INFO: renamed from: androidx.compose.animation.k$a$a, reason: collision with other inner class name */
        static final class C0066a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i2 f13548a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0066a(i2 i2Var) {
                super(1);
                this.f13548a = i2Var;
            }

            public final void c(i2.a aVar) {
                i2.a.P(aVar, this.f13548a, 0, 0, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0 p0Var) {
            super(3);
            this.f13547a = p0Var;
        }

        public final androidx.compose.ui.layout.b1 c(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
            i2 i2VarP0 = z0Var.P0(j10);
            p0 p0Var = this.f13547a;
            if (c1Var.P5()) {
                p0Var.a(androidx.compose.ui.unit.u.e((((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a) | (((long) i2VarP0.h1()) << 32)));
            }
            int i10 = 6 << 4;
            return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new C0066a(i2VarP0), 4, null);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.b1 invoke(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
            return c(c1Var, z0Var, bVar.x());
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<T> f13549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f13550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f13552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f13553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<z, z, Boolean> f13554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p0 f13555g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> f13556h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13557i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13558j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(l3<T> l3Var, Function1<? super T, Boolean> function1, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, Function2<? super z, ? super z, Boolean> function2, p0 p0Var, pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13549a = l3Var;
            this.f13550b = function1;
            this.f13551c = a0Var;
            this.f13552d = d0Var;
            this.f13553e = f0Var;
            this.f13554f = function2;
            this.f13555g = p0Var;
            this.f13556h = nVar;
            this.f13557i = i10;
            this.f13558j = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            k.a(this.f13549a, this.f13550b, this.f13551c, this.f13552d, this.f13553e, this.f13554f, this.f13555g, this.f13556h, c0Var, t4.a(this.f13557i | 1), this.f13558j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", i = {}, l = {736}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<k4<Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f13560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l3<z> f13561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n7<Function2<z, z, Boolean>> f13562d;

        static final class a extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l3<z> f13563a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l3<z> l3Var) {
                super(0);
                this.f13563a = l3Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(k.n(this.f13563a));
            }
        }

        static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k4<Boolean> f13564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l3<z> f13565b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n7<Function2<z, z, Boolean>> f13566c;

            /* JADX WARN: Multi-variable type inference failed */
            b(k4<Boolean> k4Var, l3<z> l3Var, n7<? extends Function2<? super z, ? super z, Boolean>> n7Var) {
                this.f13564a = k4Var;
                this.f13565b = l3Var;
                this.f13566c = n7Var;
            }

            public final Object a(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
                this.f13564a.setValue(kotlin.coroutines.jvm.internal.b.a(z10 ? ((Boolean) k.c(this.f13566c).invoke(this.f13565b.p(), this.f13565b.y())).booleanValue() : false));
                return Unit.f312394a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(l3<z> l3Var, n7<? extends Function2<? super z, ? super z, Boolean>> n7Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f13561c = l3Var;
            this.f13562d = n7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f13561c, this.f13562d, dVar);
            cVar.f13560b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(k4<Boolean> k4Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(k4Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13559a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k4 k4Var = (k4) this.f13560b;
                kotlinx.coroutines.flow.i iVarY = w6.y(new a(this.f13561c));
                b bVar = new b(k4Var, this.f13561c, this.f13562d);
                this.f13559a = 1;
                if (iVarY.collect(bVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f13567a = new d();

        d() {
            super(1);
        }

        public final Boolean c(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return c(bool.booleanValue());
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x5 f13568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1<Boolean> f13569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f13571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f13572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f13573f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> f13574g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13575h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13576i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(x5 x5Var, w1<Boolean> w1Var, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, String str, pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13568a = x5Var;
            this.f13569b = w1Var;
            this.f13570c = a0Var;
            this.f13571d = d0Var;
            this.f13572e = f0Var;
            this.f13573f = str;
            this.f13574g = nVar;
            this.f13575h = i10;
            this.f13576i = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            k.h(this.f13568a, this.f13569b, this.f13570c, this.f13571d, this.f13572e, this.f13573f, this.f13574g, c0Var, t4.a(this.f13575h | 1), this.f13576i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f13577a = new f();

        f() {
            super(1);
        }

        public final Boolean c(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return c(bool.booleanValue());
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.m0 f13578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1<Boolean> f13579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f13581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f13582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f13583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> f13584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13586i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.foundation.layout.m0 m0Var, w1<Boolean> w1Var, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, String str, pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13578a = m0Var;
            this.f13579b = w1Var;
            this.f13580c = a0Var;
            this.f13581d = d0Var;
            this.f13582e = f0Var;
            this.f13583f = str;
            this.f13584g = nVar;
            this.f13585h = i10;
            this.f13586i = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            k.f(this.f13578a, this.f13579b, this.f13580c, this.f13581d, this.f13582e, this.f13583f, this.f13584g, c0Var, t4.a(this.f13585h | 1), this.f13586i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<T> f13587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f13588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f13590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f13591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> f13592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13594h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(l3<T> l3Var, Function1<? super T, Boolean> function1, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13587a = l3Var;
            this.f13588b = function1;
            this.f13589c = a0Var;
            this.f13590d = d0Var;
            this.f13591e = f0Var;
            this.f13592f = nVar;
            this.f13593g = i10;
            this.f13594h = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            k.e(this.f13587a, this.f13588b, this.f13589c, this.f13590d, this.f13591e, this.f13592f, c0Var, t4.a(this.f13593g | 1), this.f13594h);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0 f13597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f13598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f13599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> f13600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13602h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(boolean z10, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, String str, pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13595a = z10;
            this.f13596b = a0Var;
            this.f13597c = d0Var;
            this.f13598d = f0Var;
            this.f13599e = str;
            this.f13600f = nVar;
            this.f13601g = i10;
            this.f13602h = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            k.j(this.f13595a, this.f13596b, this.f13597c, this.f13598d, this.f13599e, this.f13600f, c0Var, t4.a(this.f13601g | 1), this.f13602h);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f13603a = new j();

        j() {
            super(1);
        }

        public final Boolean c(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return c(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.k$k, reason: collision with other inner class name */
    static final class C0067k extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x5 f13604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f13607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f13608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f13609f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> f13610g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13611h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13612i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0067k(x5 x5Var, boolean z10, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, String str, pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13604a = x5Var;
            this.f13605b = z10;
            this.f13606c = a0Var;
            this.f13607d = d0Var;
            this.f13608e = f0Var;
            this.f13609f = str;
            this.f13610g = nVar;
            this.f13611h = i10;
            this.f13612i = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            k.i(this.f13604a, this.f13605b, this.f13606c, this.f13607d, this.f13608e, this.f13609f, this.f13610g, c0Var, t4.a(this.f13611h | 1), this.f13612i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class l extends kotlin.jvm.internal.l0 implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f13613a = new l();

        l() {
            super(1);
        }

        public final Boolean c(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return c(bool.booleanValue());
        }
    }

    static final class m extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.m0 f13614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f13617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f13618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f13619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> f13620g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13621h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13622i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(androidx.compose.foundation.layout.m0 m0Var, boolean z10, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, String str, pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13614a = m0Var;
            this.f13615b = z10;
            this.f13616c = a0Var;
            this.f13617d = d0Var;
            this.f13618e = f0Var;
            this.f13619f = str;
            this.f13620g = nVar;
            this.f13621h = i10;
            this.f13622i = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            k.g(this.f13614a, this.f13615b, this.f13616c, this.f13617d, this.f13618e, this.f13619f, this.f13620g, c0Var, t4.a(this.f13621h | 1), this.f13622i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class n extends kotlin.jvm.internal.l0 implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f13623a = new n();

        n() {
            super(1);
        }

        public final Boolean c(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return c(bool.booleanValue());
        }
    }

    static final class o extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w1<Boolean> f13624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0 f13626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f13627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f13628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> f13629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13631h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(w1<Boolean> w1Var, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, String str, pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13624a = w1Var;
            this.f13625b = a0Var;
            this.f13626c = d0Var;
            this.f13627d = f0Var;
            this.f13628e = str;
            this.f13629f = nVar;
            this.f13630g = i10;
            this.f13631h = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            k.d(this.f13624a, this.f13625b, this.f13626c, this.f13627d, this.f13628e, this.f13629f, c0Var, t4.a(this.f13630g | 1), this.f13631h);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class p extends kotlin.jvm.internal.l0 implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f13632a = new p();

        p() {
            super(1);
        }

        public final Boolean c(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return c(bool.booleanValue());
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,862:1\n30#2:863\n80#3:864\n85#3:867\n90#3:870\n61#4:865\n54#4:866\n63#4:868\n59#4:869\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n*L\n689#1:863\n689#1:864\n685#1:867\n685#1:870\n685#1:865\n685#1:866\n685#1:868\n685#1:869\n*E\n"})
    static final class q extends kotlin.jvm.internal.l0 implements pj.n<androidx.compose.ui.layout.c1, androidx.compose.ui.layout.z0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f13633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3<T> f13634b;

        static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i2 f13635a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i2 i2Var) {
                super(1);
                this.f13635a = i2Var;
            }

            public final void c(i2.a aVar) {
                i2.a.P(aVar, this.f13635a, 0, 0, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(Function1<? super T, Boolean> function1, l3<T> l3Var) {
            super(3);
            this.f13633a = function1;
            this.f13634b = l3Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final androidx.compose.ui.layout.b1 c(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
            long jE;
            i2 i2VarP0 = z0Var.P0(j10);
            if (!c1Var.P5() || this.f13633a.invoke((T) this.f13634b.y()).booleanValue()) {
                jE = androidx.compose.ui.unit.u.e((((long) i2VarP0.h1()) << 32) | (((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a));
            } else {
                jE = androidx.compose.ui.unit.u.f42720b.a();
            }
            return androidx.compose.ui.layout.c1.h6(c1Var, (int) (jE >> 32), (int) (jE & com.rabbitmq.client.k0.f265952a), null, new a(i2VarP0), 4, null);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.b1 invoke(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
            return c(c1Var, z0Var, bVar.x());
        }
    }

    static final class r extends kotlin.jvm.internal.l0 implements Function2<z, z, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f13636a = new r();

        r() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z zVar, z zVar2) {
            return Boolean.valueOf(zVar == zVar2 && zVar2 == z.PostExit);
        }
    }

    static final class s extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<T> f13637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f13638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f13640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f13641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> f13642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13643g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(l3<T> l3Var, Function1<? super T, Boolean> function1, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10) {
            super(2);
            this.f13637a = l3Var;
            this.f13638b = function1;
            this.f13639c = a0Var;
            this.f13640d = d0Var;
            this.f13641e = f0Var;
            this.f13642f = nVar;
            this.f13643g = i10;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            k.k(this.f13637a, this.f13638b, this.f13639c, this.f13640d, this.f13641e, this.f13642f, c0Var, t4.a(this.f13643g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <T> void a(@NotNull l3<T> l3Var, @NotNull Function1<? super T, Boolean> function1, @NotNull androidx.compose.ui.a0 a0Var, @NotNull d0 d0Var, @NotNull f0 f0Var, @NotNull Function2<? super z, ? super z, Boolean> function2, @Nullable p0 p0Var, @NotNull pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        f0 f0Var2;
        p0 p0Var2;
        int i13;
        androidx.compose.ui.a0 a0VarA;
        p0 p0Var3 = p0Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1912839215);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(l3Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function1) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.D(d0Var) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
            f0Var2 = f0Var;
        } else {
            f0Var2 = f0Var;
            if ((i10 & 24576) == 0) {
                i12 |= c0VarR.D(f0Var2) ? 16384 : 8192;
            }
        }
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i12 |= c0VarR.k0(function2) ? 131072 : 65536;
        }
        int i14 = i11 & 64;
        int i15 = 1572864;
        if (i14 != 0) {
            i12 |= i15;
        } else if ((i10 & 1572864) == 0) {
            i15 = (i10 & 2097152) == 0 ? c0VarR.D(p0Var3) : c0VarR.k0(p0Var3) ? 1048576 : 524288;
            i12 |= i15;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            i12 |= c0VarR.k0(nVar) ? 8388608 : 4194304;
        }
        int i16 = i12;
        int i17 = 1;
        if (c0VarR.h((4793491 & i16) != 4793490, i16 & 1)) {
            if (i14 != 0) {
                p0Var3 = null;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1912839215, i16, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:715)");
            }
            if (function1.invoke(l3Var.y()).booleanValue() || function1.invoke(l3Var.p()).booleanValue() || l3Var.E() || l3Var.q()) {
                c0VarR.E(-232323267);
                int i18 = i16 & 14;
                int i19 = i18 | 48;
                int i20 = i19 & 14;
                p0 p0Var4 = p0Var3;
                boolean z10 = ((i20 ^ 6) > 4 && c0VarR.D(l3Var)) || (i19 & 6) == 4;
                Object objI0 = c0VarR.i0();
                if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = l3Var.p();
                    c0VarR.Y(objI0);
                }
                if (l3Var.E()) {
                    objI0 = l3Var.p();
                }
                c0VarR.E(1844425648);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:724)");
                }
                int i21 = i16 & okhttp3.internal.ws.g.f334652s;
                z zVarO = o(l3Var, function1, objI0, c0VarR, i21);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0VarR.A();
                T tY = l3Var.y();
                c0VarR.E(1844425648);
                if (androidx.compose.runtime.m0.l0()) {
                    i13 = 0;
                    androidx.compose.runtime.m0.A0(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:724)");
                } else {
                    i13 = 0;
                }
                z zVarO2 = o(l3Var, function1, tY, c0VarR, i21);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0VarR.A();
                int i22 = i13;
                p0Var2 = p0Var4;
                l3 l3VarZ = w3.z(l3Var, zVarO, zVarO2, "EnterExitTransition", c0VarR, i20 | 3072);
                n7 n7VarW = w6.w(function2, c0VarR, (i16 >> 15) & 14);
                Boolean boolInvoke = function2.invoke(l3VarZ.p(), l3VarZ.y());
                boolean zD = c0VarR.D(l3VarZ) | c0VarR.D(n7VarW);
                Object objI1 = c0VarR.i0();
                if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new c(l3VarZ, n7VarW, null);
                    c0VarR.Y(objI1);
                }
                n7 n7VarT = w6.t(boolInvoke, (Function2) objI1, c0VarR, i22);
                if (n(l3VarZ) && b(n7VarT)) {
                    c0VarR.E(-230155437);
                    c0VarR.A();
                } else {
                    c0VarR.E(-231293261);
                    int i23 = i18 == 4 ? 1 : i22;
                    Object objI2 = c0VarR.i0();
                    if (i23 != 0 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new androidx.compose.animation.m(l3VarZ);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.animation.m mVar = (androidx.compose.animation.m) objI2;
                    int i24 = i16 >> 6;
                    androidx.compose.ui.a0 a0VarG = b0.g(l3VarZ, d0Var, f0Var2, null, "Built-in", c0VarR, (i24 & com.planner5d.library.engine.input.f.b.B) | 24576 | (i24 & 896), 4);
                    if (p0Var2 != null) {
                        c0VarR.E(-230873924);
                        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                        if ((3670016 & i16) != 1048576 && ((i16 & 2097152) == 0 || !c0VarR.k0(p0Var2))) {
                            i17 = i22;
                        }
                        Object objI3 = c0VarR.i0();
                        if (i17 != 0 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new a(p0Var2);
                            c0VarR.Y(objI3);
                        }
                        a0VarA = androidx.compose.ui.layout.q0.a(aVar, (pj.n) objI3);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-7429769);
                        c0VarR.A();
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB2 = a0Var.B2(a0VarG.B2(a0VarA));
                    Object objI4 = c0VarR.i0();
                    if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI4 = new androidx.compose.animation.j(mVar);
                        c0VarR.Y(objI4);
                    }
                    androidx.compose.animation.j jVar = (androidx.compose.animation.j) objI4;
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB2);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, jVar, aVar2.e());
                    y7.n(c0VarD, b1VarK, aVar2.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar2.f());
                    nVar.invoke(mVar, c0VarR, Integer.valueOf((i16 >> 18) & com.planner5d.library.engine.input.f.b.B));
                    c0VarR.o();
                    c0VarR.A();
                }
                c0VarR.A();
            } else {
                c0VarR.E(-230149485);
                c0VarR.A();
                p0Var2 = p0Var3;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            p0Var2 = p0Var3;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(l3Var, function1, a0Var, d0Var, f0Var, function2, p0Var2, nVar, i10, i11));
        }
    }

    private static final boolean b(n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<z, z, Boolean> c(n7<? extends Function2<? super z, ? super z, Boolean>> n7Var) {
        return (Function2) n7Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0189  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0122  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0171  */
    /* JADX WARN: Code duplicated, block: B:99:0x017a  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void d(@NotNull w1<Boolean> w1Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable d0 d0Var, @Nullable f0 f0Var, @Nullable String str, @NotNull pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        d0 d0Var2;
        int i14;
        int i15;
        f0 f0Var2;
        int i16;
        int i17;
        int i18;
        pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i19;
        boolean z10;
        String str2;
        androidx.compose.ui.a0 a0Var3;
        d0 d0Var3;
        f0 f0Var3;
        s5 s5VarT;
        int i20;
        androidx.compose.ui.a0 a0Var4;
        d0 d0VarC;
        f0 f0VarD;
        String str3;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(657024243);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(w1Var) : c0VarR.k0(w1Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    d0Var2 = d0Var;
                    if (c0VarR.D(d0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        f0Var2 = f0Var;
                        if (c0VarR.D(f0Var2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c0VarR.D(str)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= androidx.profileinstaller.n.c.f73814m;
                            nVar2 = nVar;
                        } else {
                            nVar2 = nVar;
                            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                if (c0VarR.k0(nVar2)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                                i12 |= i19;
                            }
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i21 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                                i20 = i17;
                            } else {
                                i20 = i17;
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                            } else {
                                d0VarC = d0Var2;
                            }
                            if (i15 != 0) {
                                f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                            } else {
                                f0VarD = f0Var2;
                            }
                            if (i20 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                            }
                            l3 l3VarG = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = n.f13623a;
                                c0VarR.Y(objI0);
                            }
                            Function1 function1 = (Function1) objI0;
                            int i22 = i12 << 3;
                            k(l3VarG, function1, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i22 & 57344) | (i22 & 896) | 48 | (i22 & 7168) | (i12 & 458752));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var3 = a0Var4;
                            d0Var3 = d0VarC;
                            f0Var3 = f0VarD;
                        } else {
                            c0VarR.u();
                            str2 = str;
                            a0Var3 = a0Var2;
                            d0Var3 = d0Var2;
                            f0Var3 = f0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                        }
                    }
                    i12 |= 24576;
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i20 = i17;
                        } else {
                            i20 = i17;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                        } else {
                            d0VarC = d0Var2;
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i20 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                        }
                        l3 l3VarG2 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = n.f13623a;
                            c0VarR.Y(objI0);
                        }
                        Function1 function2 = (Function1) objI0;
                        int i23 = i12 << 3;
                        k(l3VarG2, function2, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168) | (i12 & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var3 = d0VarC;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        str2 = str;
                        a0Var3 = a0Var2;
                        d0Var3 = d0Var2;
                        f0Var3 = f0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 3072;
                f0Var2 = f0Var;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i20 = i17;
                        } else {
                            i20 = i17;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                        } else {
                            d0VarC = d0Var2;
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i20 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                        }
                        l3 l3VarG3 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = n.f13623a;
                            c0VarR.Y(objI0);
                        }
                        Function1 function3 = (Function1) objI0;
                        int i24 = i12 << 3;
                        k(l3VarG3, function3, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i12 & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var3 = d0VarC;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        str2 = str;
                        a0Var3 = a0Var2;
                        d0Var3 = d0Var2;
                        f0Var3 = f0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                    }
                    l3 l3VarG4 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = n.f13623a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function4 = (Function1) objI0;
                    int i25 = i12 << 3;
                    k(l3VarG4, function4, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= a5.S0;
            d0Var2 = d0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i20 = i17;
                        } else {
                            i20 = i17;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                        } else {
                            d0VarC = d0Var2;
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i20 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                        }
                        l3 l3VarG5 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = n.f13623a;
                            c0VarR.Y(objI0);
                        }
                        Function1 function5 = (Function1) objI0;
                        int i26 = i12 << 3;
                        k(l3VarG5, function5, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168) | (i12 & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var3 = d0VarC;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        str2 = str;
                        a0Var3 = a0Var2;
                        d0Var3 = d0Var2;
                        f0Var3 = f0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                    }
                    l3 l3VarG6 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = n.f13623a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function6 = (Function1) objI0;
                    int i27 = i12 << 3;
                    k(l3VarG6, function6, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                    }
                    l3 l3VarG7 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = n.f13623a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function7 = (Function1) objI0;
                    int i28 = i12 << 3;
                    k(l3VarG7, function7, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i20 = i17;
                } else {
                    i20 = i17;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i20 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                }
                l3 l3VarG8 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = n.f13623a;
                    c0VarR.Y(objI0);
                }
                Function1 function8 = (Function1) objI0;
                int i29 = i12 << 3;
                k(l3VarG8, function8, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168) | (i12 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var3 = d0VarC;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                str2 = str;
                a0Var3 = a0Var2;
                d0Var3 = d0Var2;
                f0Var3 = f0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                d0Var2 = d0Var;
                if (c0VarR.D(d0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i20 = i17;
                        } else {
                            i20 = i17;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                        } else {
                            d0VarC = d0Var2;
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i20 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                        }
                        l3 l3VarG9 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = n.f13623a;
                            c0VarR.Y(objI0);
                        }
                        Function1 function9 = (Function1) objI0;
                        int i210 = i12 << 3;
                        k(l3VarG9, function9, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168) | (i12 & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var3 = d0VarC;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        str2 = str;
                        a0Var3 = a0Var2;
                        d0Var3 = d0Var2;
                        f0Var3 = f0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                    }
                    l3 l3VarG10 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = n.f13623a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function10 = (Function1) objI0;
                    int i211 = i12 << 3;
                    k(l3VarG10, function10, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                    }
                    l3 l3VarG11 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = n.f13623a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function11 = (Function1) objI0;
                    int i212 = i12 << 3;
                    k(l3VarG11, function11, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i20 = i17;
                } else {
                    i20 = i17;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i20 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                }
                l3 l3VarG12 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = n.f13623a;
                    c0VarR.Y(objI0);
                }
                Function1 function12 = (Function1) objI0;
                int i213 = i12 << 3;
                k(l3VarG12, function12, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168) | (i12 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var3 = d0VarC;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                str2 = str;
                a0Var3 = a0Var2;
                d0Var3 = d0Var2;
                f0Var3 = f0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        d0Var2 = d0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                f0Var2 = f0Var;
                if (c0VarR.D(f0Var2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                    }
                    l3 l3VarG13 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = n.f13623a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function13 = (Function1) objI0;
                    int i214 = i12 << 3;
                    k(l3VarG13, function13, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i20 = i17;
                } else {
                    i20 = i17;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i20 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                }
                l3 l3VarG14 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = n.f13623a;
                    c0VarR.Y(objI0);
                }
                Function1 function14 = (Function1) objI0;
                int i215 = i12 << 3;
                k(l3VarG14, function14, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168) | (i12 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var3 = d0VarC;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                str2 = str;
                a0Var3 = a0Var2;
                d0Var3 = d0Var2;
                f0Var3 = f0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 3072;
        f0Var2 = f0Var;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.D(str)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i20 = i17;
                } else {
                    i20 = i17;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i20 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                }
                l3 l3VarG15 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = n.f13623a;
                    c0VarR.Y(objI0);
                }
                Function1 function15 = (Function1) objI0;
                int i216 = i12 << 3;
                k(l3VarG15, function15, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168) | (i12 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var3 = d0VarC;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                str2 = str;
                a0Var3 = a0Var2;
                d0Var3 = d0Var2;
                f0Var3 = f0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 24576;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
        }
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i21 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
                i20 = i17;
            } else {
                i20 = i17;
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
            } else {
                d0VarC = d0Var2;
            }
            if (i15 != 0) {
                f0VarD = b0.q(null, 0.0f, 3, null).d(b0.A(null, null, false, null, 15, null));
            } else {
                f0VarD = f0Var2;
            }
            if (i20 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(657024243, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
            }
            l3 l3VarG16 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = n.f13623a;
                c0VarR.Y(objI0);
            }
            Function1 function16 = (Function1) objI0;
            int i217 = i12 << 3;
            k(l3VarG16, function16, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i217 & 57344) | (i217 & 896) | 48 | (i217 & 7168) | (i12 & 458752));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str2 = str3;
            a0Var3 = a0Var4;
            d0Var3 = d0VarC;
            f0Var3 = f0VarD;
        } else {
            c0VarR.u();
            str2 = str;
            a0Var3 = a0Var2;
            d0Var3 = d0Var2;
            f0Var3 = f0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new o(w1Var, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    /* JADX WARN: Code duplicated, block: B:87:0x012c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x0140  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final <T> void e(@NotNull l3<T> l3Var, @NotNull Function1<? super T, Boolean> function1, @Nullable androidx.compose.ui.a0 a0Var, @Nullable d0 d0Var, @Nullable f0 f0Var, @NotNull pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        l3<T> l3Var2;
        int i12;
        Function1<? super T, Boolean> function2;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        d0 d0Var2;
        int i14;
        int i15;
        int i16;
        pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i17;
        boolean z10;
        d0 d0Var3;
        f0 f0Var2;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        d0 d0VarC;
        f0 f0VarD;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1699747442);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
            l3Var2 = l3Var;
        } else {
            l3Var2 = l3Var;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.D(l3Var2) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function2) ? 32 : 16;
            }
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    d0Var2 = d0Var;
                    if (c0VarR.D(d0Var2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(f0Var)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i12 |= i17;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                        } else {
                            d0VarC = d0Var2;
                        }
                        if (i15 != 0) {
                            f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1699747442, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                        }
                        d0 d0Var4 = d0VarC;
                        k(l3Var2, function2, a0Var3, d0Var4, f0VarD, nVar2, c0VarR, i12 & 524286);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        d0Var3 = d0Var4;
                        f0Var2 = f0VarD;
                    } else {
                        c0VarR.u();
                        d0Var3 = d0Var2;
                        f0Var2 = f0Var;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new h(l3Var, function1, a0Var2, d0Var3, f0Var2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                if ((i11 & 16) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1699747442, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                    }
                    d0 d0Var5 = d0VarC;
                    k(l3Var2, function2, a0Var3, d0Var5, f0VarD, nVar2, c0VarR, i12 & 524286);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    d0Var3 = d0Var5;
                    f0Var2 = f0VarD;
                } else {
                    c0VarR.u();
                    d0Var3 = d0Var2;
                    f0Var2 = f0Var;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new h(l3Var, function1, a0Var2, d0Var3, f0Var2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            d0Var2 = d0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(f0Var)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1699747442, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                    }
                    d0 d0Var6 = d0VarC;
                    k(l3Var2, function2, a0Var3, d0Var6, f0VarD, nVar2, c0VarR, i12 & 524286);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    d0Var3 = d0Var6;
                    f0Var2 = f0VarD;
                } else {
                    c0VarR.u();
                    d0Var3 = d0Var2;
                    f0Var2 = f0Var;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new h(l3Var, function1, a0Var2, d0Var3, f0Var2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            if ((i11 & 16) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1699747442, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                }
                d0 d0Var7 = d0VarC;
                k(l3Var2, function2, a0Var3, d0Var7, f0VarD, nVar2, c0VarR, i12 & 524286);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                d0Var3 = d0Var7;
                f0Var2 = f0VarD;
            } else {
                c0VarR.u();
                d0Var3 = d0Var2;
                f0Var2 = f0Var;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new h(l3Var, function1, a0Var2, d0Var3, f0Var2, nVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                d0Var2 = d0Var;
                if (c0VarR.D(d0Var2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(f0Var)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1699747442, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                    }
                    d0 d0Var8 = d0VarC;
                    k(l3Var2, function2, a0Var3, d0Var8, f0VarD, nVar2, c0VarR, i12 & 524286);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    d0Var3 = d0Var8;
                    f0Var2 = f0VarD;
                } else {
                    c0VarR.u();
                    d0Var3 = d0Var2;
                    f0Var2 = f0Var;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new h(l3Var, function1, a0Var2, d0Var3, f0Var2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            if ((i11 & 16) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1699747442, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                }
                d0 d0Var9 = d0VarC;
                k(l3Var2, function2, a0Var3, d0Var9, f0VarD, nVar2, c0VarR, i12 & 524286);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                d0Var3 = d0Var9;
                f0Var2 = f0VarD;
            } else {
                c0VarR.u();
                d0Var3 = d0Var2;
                f0Var2 = f0Var;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new h(l3Var, function1, a0Var2, d0Var3, f0Var2, nVar, i10, i11));
            }
        }
        i12 |= 3072;
        d0Var2 = d0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.D(f0Var)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1699747442, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                }
                d0 d0Var10 = d0VarC;
                k(l3Var2, function2, a0Var3, d0Var10, f0VarD, nVar2, c0VarR, i12 & 524286);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                d0Var3 = d0Var10;
                f0Var2 = f0VarD;
            } else {
                c0VarR.u();
                d0Var3 = d0Var2;
                f0Var2 = f0Var;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new h(l3Var, function1, a0Var2, d0Var3, f0Var2, nVar, i10, i11));
            }
        }
        i12 |= 24576;
        if ((i11 & 16) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
        }
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i18 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
            } else {
                d0VarC = d0Var2;
            }
            if (i15 != 0) {
                f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
            } else {
                f0VarD = f0Var;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1699747442, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
            }
            d0 d0Var11 = d0VarC;
            k(l3Var2, function2, a0Var3, d0Var11, f0VarD, nVar2, c0VarR, i12 & 524286);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            d0Var3 = d0Var11;
            f0Var2 = f0VarD;
        } else {
            c0VarR.u();
            d0Var3 = d0Var2;
            f0Var2 = f0Var;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new h(l3Var, function1, a0Var2, d0Var3, f0Var2, nVar, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0185  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114  */
    /* JADX WARN: Code duplicated, block: B:86:0x0118  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x0148  */
    /* JADX WARN: Code duplicated, block: B:96:0x016c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0176  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void f(@NotNull androidx.compose.foundation.layout.m0 m0Var, @NotNull w1<Boolean> w1Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable d0 d0Var, @Nullable f0 f0Var, @Nullable String str, @NotNull pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        d0 d0VarC;
        int i14;
        int i15;
        f0 f0Var2;
        int i16;
        int i17;
        int i18;
        pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i19;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        d0 d0Var2;
        f0 f0Var3;
        String str2;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        f0 f0VarD;
        String str3;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1238803325);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 48) == 0) {
            i12 = ((i10 & 64) == 0 ? c0VarR.D(w1Var) : c0VarR.k0(w1Var) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    d0VarC = d0Var;
                    if (c0VarR.D(d0VarC)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        f0Var2 = f0Var;
                        if (c0VarR.D(f0Var2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            if (c0VarR.D(str)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= 1572864;
                            nVar2 = nVar;
                        } else {
                            nVar2 = nVar;
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.k0(nVar2)) {
                                    i19 = 1048576;
                                } else {
                                    i19 = 524288;
                                }
                                i12 |= i19;
                            }
                        }
                        if ((599185 & i12) != 599184) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                            }
                            if (i15 != 0) {
                                f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                            } else {
                                f0VarD = f0Var2;
                            }
                            if (i17 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                            }
                            int i21 = i12 >> 3;
                            l3 l3VarG = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i21 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = f.f13577a;
                                c0VarR.Y(objI0);
                            }
                            d0 d0Var3 = d0VarC;
                            k(l3VarG, (Function1) objI0, a0Var4, d0Var3, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i21));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var3 = a0Var4;
                            d0Var2 = d0Var3;
                            f0Var3 = f0VarD;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            d0Var2 = d0VarC;
                            f0Var3 = f0Var2;
                            str2 = str;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                        }
                        int i22 = i12 >> 3;
                        l3 l3VarG2 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i22 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = f.f13577a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var4 = d0VarC;
                        k(l3VarG2, (Function1) objI0, a0Var4, d0Var4, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i22));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var4;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                f0Var2 = f0Var;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                        }
                        int i23 = i12 >> 3;
                        l3 l3VarG3 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i23 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = f.f13577a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var5 = d0VarC;
                        k(l3VarG3, (Function1) objI0, a0Var4, d0Var5, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i23));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var5;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                    }
                    int i24 = i12 >> 3;
                    l3 l3VarG4 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i24 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = f.f13577a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var6 = d0VarC;
                    k(l3VarG4, (Function1) objI0, a0Var4, d0Var6, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i24));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var6;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            d0VarC = d0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                        }
                        int i25 = i12 >> 3;
                        l3 l3VarG5 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i25 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = f.f13577a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var7 = d0VarC;
                        k(l3VarG5, (Function1) objI0, a0Var4, d0Var7, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i25));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var7;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                    }
                    int i26 = i12 >> 3;
                    l3 l3VarG6 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i26 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = f.f13577a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var8 = d0VarC;
                    k(l3VarG6, (Function1) objI0, a0Var4, d0Var8, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i26));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var8;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                    }
                    int i27 = i12 >> 3;
                    l3 l3VarG7 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i27 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = f.f13577a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var9 = d0VarC;
                    k(l3VarG7, (Function1) objI0, a0Var4, d0Var9, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i27));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var9;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                }
                int i28 = i12 >> 3;
                l3 l3VarG8 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i28 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = f.f13577a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var10 = d0VarC;
                k(l3VarG8, (Function1) objI0, a0Var4, d0Var10, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i28));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var10;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                d0VarC = d0Var;
                if (c0VarR.D(d0VarC)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                        }
                        int i29 = i12 >> 3;
                        l3 l3VarG9 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i29 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = f.f13577a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var11 = d0VarC;
                        k(l3VarG9, (Function1) objI0, a0Var4, d0Var11, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i29));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var11;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                    }
                    int i210 = i12 >> 3;
                    l3 l3VarG10 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i210 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = f.f13577a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var12 = d0VarC;
                    k(l3VarG10, (Function1) objI0, a0Var4, d0Var12, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i210));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var12;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                    }
                    int i211 = i12 >> 3;
                    l3 l3VarG11 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i211 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = f.f13577a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var13 = d0VarC;
                    k(l3VarG11, (Function1) objI0, a0Var4, d0Var13, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i211));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var13;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                }
                int i212 = i12 >> 3;
                l3 l3VarG12 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i212 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = f.f13577a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var14 = d0VarC;
                k(l3VarG12, (Function1) objI0, a0Var4, d0Var14, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i212));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var14;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 3072;
        d0VarC = d0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                f0Var2 = f0Var;
                if (c0VarR.D(f0Var2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                    }
                    int i213 = i12 >> 3;
                    l3 l3VarG13 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i213 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = f.f13577a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var15 = d0VarC;
                    k(l3VarG13, (Function1) objI0, a0Var4, d0Var15, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i213));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var15;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                }
                int i214 = i12 >> 3;
                l3 l3VarG14 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i214 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = f.f13577a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var16 = d0VarC;
                k(l3VarG14, (Function1) objI0, a0Var4, d0Var16, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i214));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var16;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 24576;
        f0Var2 = f0Var;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                if (c0VarR.D(str)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                }
                int i215 = i12 >> 3;
                l3 l3VarG15 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i215 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = f.f13577a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var17 = d0VarC;
                k(l3VarG15, (Function1) objI0, a0Var4, d0Var17, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i215));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var17;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        if ((i11 & 32) != 0) {
            i12 |= 1572864;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
        }
        if ((599185 & i12) != 599184) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i20 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                d0VarC = b0.m(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
            }
            if (i15 != 0) {
                f0VarD = b0.C(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
            } else {
                f0VarD = f0Var2;
            }
            if (i17 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1238803325, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
            }
            int i216 = i12 >> 3;
            l3 l3VarG16 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i216 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = f.f13577a;
                c0VarR.Y(objI0);
            }
            d0 d0Var18 = d0VarC;
            k(l3VarG16, (Function1) objI0, a0Var4, d0Var18, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i216));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str2 = str3;
            a0Var3 = a0Var4;
            d0Var2 = d0Var18;
            f0Var3 = f0VarD;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            d0Var2 = d0VarC;
            f0Var3 = f0Var2;
            str2 = str;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new g(m0Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0141  */
    /* JADX WARN: Code duplicated, block: B:93:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void g(@NotNull androidx.compose.foundation.layout.m0 m0Var, boolean z10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable d0 d0Var, @Nullable f0 f0Var, @Nullable String str, @NotNull pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        boolean z11;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        d0 d0VarC;
        int i14;
        int i15;
        f0 f0Var2;
        int i16;
        int i17;
        int i18;
        pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i19;
        boolean z12;
        androidx.compose.ui.a0 a0Var3;
        d0 d0Var2;
        f0 f0Var3;
        String str2;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        f0 f0VarD;
        String str3;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1799879339);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 48) == 0) {
                i12 = (c0VarR.G(z11) ? 32 : 16) | i10;
            } else {
                i12 = i10;
            }
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    d0VarC = d0Var;
                    if (c0VarR.D(d0VarC)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        f0Var2 = f0Var;
                        if (c0VarR.D(f0Var2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            if (c0VarR.D(str)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= 1572864;
                            nVar2 = nVar;
                        } else {
                            nVar2 = nVar;
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.k0(nVar2)) {
                                    i19 = 1048576;
                                } else {
                                    i19 = 524288;
                                }
                                i12 |= i19;
                            }
                        }
                        if ((599185 & i12) != 599184) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                            }
                            if (i15 != 0) {
                                f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                            } else {
                                f0VarD = f0Var2;
                            }
                            if (i17 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                            }
                            int i21 = i12 >> 3;
                            l3 l3VarJ = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i21 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = l.f13613a;
                                c0VarR.Y(objI0);
                            }
                            d0 d0Var3 = d0VarC;
                            k(l3VarJ, (Function1) objI0, a0Var4, d0Var3, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i21));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var3 = a0Var4;
                            d0Var2 = d0Var3;
                            f0Var3 = f0VarD;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            d0Var2 = d0VarC;
                            f0Var3 = f0Var2;
                            str2 = str;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                        }
                        int i22 = i12 >> 3;
                        l3 l3VarJ2 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i22 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = l.f13613a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var4 = d0VarC;
                        k(l3VarJ2, (Function1) objI0, a0Var4, d0Var4, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i22));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var4;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                f0Var2 = f0Var;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                        }
                        int i23 = i12 >> 3;
                        l3 l3VarJ3 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i23 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = l.f13613a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var5 = d0VarC;
                        k(l3VarJ3, (Function1) objI0, a0Var4, d0Var5, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i23));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var5;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                    }
                    int i24 = i12 >> 3;
                    l3 l3VarJ4 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i24 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = l.f13613a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var6 = d0VarC;
                    k(l3VarJ4, (Function1) objI0, a0Var4, d0Var6, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i24));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var6;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            d0VarC = d0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                        }
                        int i25 = i12 >> 3;
                        l3 l3VarJ5 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i25 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = l.f13613a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var7 = d0VarC;
                        k(l3VarJ5, (Function1) objI0, a0Var4, d0Var7, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i25));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var7;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                    }
                    int i26 = i12 >> 3;
                    l3 l3VarJ6 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i26 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = l.f13613a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var8 = d0VarC;
                    k(l3VarJ6, (Function1) objI0, a0Var4, d0Var8, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i26));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var8;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                    }
                    int i27 = i12 >> 3;
                    l3 l3VarJ7 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i27 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = l.f13613a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var9 = d0VarC;
                    k(l3VarJ7, (Function1) objI0, a0Var4, d0Var9, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i27));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var9;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                }
                int i28 = i12 >> 3;
                l3 l3VarJ8 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i28 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = l.f13613a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var10 = d0VarC;
                k(l3VarJ8, (Function1) objI0, a0Var4, d0Var10, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i28));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var10;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                d0VarC = d0Var;
                if (c0VarR.D(d0VarC)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                        }
                        int i29 = i12 >> 3;
                        l3 l3VarJ9 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i29 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = l.f13613a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var11 = d0VarC;
                        k(l3VarJ9, (Function1) objI0, a0Var4, d0Var11, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i29));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var11;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                    }
                    int i210 = i12 >> 3;
                    l3 l3VarJ10 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i210 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = l.f13613a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var12 = d0VarC;
                    k(l3VarJ10, (Function1) objI0, a0Var4, d0Var12, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i210));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var12;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                    }
                    int i211 = i12 >> 3;
                    l3 l3VarJ11 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i211 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = l.f13613a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var13 = d0VarC;
                    k(l3VarJ11, (Function1) objI0, a0Var4, d0Var13, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i211));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var13;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                }
                int i212 = i12 >> 3;
                l3 l3VarJ12 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i212 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = l.f13613a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var14 = d0VarC;
                k(l3VarJ12, (Function1) objI0, a0Var4, d0Var14, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i212));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var14;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 3072;
        d0VarC = d0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                f0Var2 = f0Var;
                if (c0VarR.D(f0Var2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                    }
                    int i213 = i12 >> 3;
                    l3 l3VarJ13 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i213 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = l.f13613a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var15 = d0VarC;
                    k(l3VarJ13, (Function1) objI0, a0Var4, d0Var15, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i213));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var15;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                }
                int i214 = i12 >> 3;
                l3 l3VarJ14 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i214 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = l.f13613a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var16 = d0VarC;
                k(l3VarJ14, (Function1) objI0, a0Var4, d0Var16, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i214));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var16;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 24576;
        f0Var2 = f0Var;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                if (c0VarR.D(str)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                }
                int i215 = i12 >> 3;
                l3 l3VarJ15 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i215 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = l.f13613a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var17 = d0VarC;
                k(l3VarJ15, (Function1) objI0, a0Var4, d0Var17, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i215));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var17;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        if ((i11 & 32) != 0) {
            i12 |= 1572864;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
        }
        if ((599185 & i12) != 599184) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i20 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                d0VarC = b0.o(null, 0.0f, 3, null).c(b0.m(null, null, false, null, 15, null));
            }
            if (i15 != 0) {
                f0VarD = b0.q(null, 0.0f, 3, null).d(b0.C(null, null, false, null, 15, null));
            } else {
                f0VarD = f0Var2;
            }
            if (i17 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1799879339, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
            }
            int i216 = i12 >> 3;
            l3 l3VarJ16 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i216 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = l.f13613a;
                c0VarR.Y(objI0);
            }
            d0 d0Var18 = d0VarC;
            k(l3VarJ16, (Function1) objI0, a0Var4, d0Var18, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i216));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str2 = str3;
            a0Var3 = a0Var4;
            d0Var2 = d0Var18;
            f0Var3 = f0VarD;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            d0Var2 = d0VarC;
            f0Var3 = f0Var2;
            str2 = str;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new m(m0Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0183  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:96:0x016a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void h(@NotNull x5 x5Var, @NotNull w1<Boolean> w1Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable d0 d0Var, @Nullable f0 f0Var, @Nullable String str, @NotNull pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        d0 d0VarC;
        int i14;
        int i15;
        f0 f0Var2;
        int i16;
        int i17;
        int i18;
        pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i19;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        d0 d0Var2;
        f0 f0Var3;
        String str2;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        f0 f0VarD;
        String str3;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1763490971);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 48) == 0) {
            i12 = ((i10 & 64) == 0 ? c0VarR.D(w1Var) : c0VarR.k0(w1Var) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    d0VarC = d0Var;
                    if (c0VarR.D(d0VarC)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        f0Var2 = f0Var;
                        if (c0VarR.D(f0Var2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            if (c0VarR.D(str)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= 1572864;
                            nVar2 = nVar;
                        } else {
                            nVar2 = nVar;
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.k0(nVar2)) {
                                    i19 = 1048576;
                                } else {
                                    i19 = 524288;
                                }
                                i12 |= i19;
                            }
                        }
                        if ((599185 & i12) != 599184) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                            }
                            if (i15 != 0) {
                                f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                            } else {
                                f0VarD = f0Var2;
                            }
                            if (i17 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                            }
                            int i21 = i12 >> 3;
                            l3 l3VarG = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i21 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = p.f13632a;
                                c0VarR.Y(objI0);
                            }
                            d0 d0Var3 = d0VarC;
                            k(l3VarG, (Function1) objI0, a0Var4, d0Var3, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i21));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var3 = a0Var4;
                            d0Var2 = d0Var3;
                            f0Var3 = f0VarD;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            d0Var2 = d0VarC;
                            f0Var3 = f0Var2;
                            str2 = str;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i22 = i12 >> 3;
                        l3 l3VarG2 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i22 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = p.f13632a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var4 = d0VarC;
                        k(l3VarG2, (Function1) objI0, a0Var4, d0Var4, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i22));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var4;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                f0Var2 = f0Var;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i23 = i12 >> 3;
                        l3 l3VarG3 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i23 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = p.f13632a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var5 = d0VarC;
                        k(l3VarG3, (Function1) objI0, a0Var4, d0Var5, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i23));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var5;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i24 = i12 >> 3;
                    l3 l3VarG4 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i24 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = p.f13632a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var6 = d0VarC;
                    k(l3VarG4, (Function1) objI0, a0Var4, d0Var6, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i24));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var6;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            d0VarC = d0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i25 = i12 >> 3;
                        l3 l3VarG5 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i25 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = p.f13632a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var7 = d0VarC;
                        k(l3VarG5, (Function1) objI0, a0Var4, d0Var7, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i25));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var7;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i26 = i12 >> 3;
                    l3 l3VarG6 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i26 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = p.f13632a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var8 = d0VarC;
                    k(l3VarG6, (Function1) objI0, a0Var4, d0Var8, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i26));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var8;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i27 = i12 >> 3;
                    l3 l3VarG7 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i27 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = p.f13632a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var9 = d0VarC;
                    k(l3VarG7, (Function1) objI0, a0Var4, d0Var9, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i27));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var9;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i28 = i12 >> 3;
                l3 l3VarG8 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i28 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = p.f13632a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var10 = d0VarC;
                k(l3VarG8, (Function1) objI0, a0Var4, d0Var10, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i28));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var10;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                d0VarC = d0Var;
                if (c0VarR.D(d0VarC)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i29 = i12 >> 3;
                        l3 l3VarG9 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i29 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = p.f13632a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var11 = d0VarC;
                        k(l3VarG9, (Function1) objI0, a0Var4, d0Var11, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i29));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var11;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i210 = i12 >> 3;
                    l3 l3VarG10 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i210 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = p.f13632a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var12 = d0VarC;
                    k(l3VarG10, (Function1) objI0, a0Var4, d0Var12, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i210));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var12;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i211 = i12 >> 3;
                    l3 l3VarG11 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i211 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = p.f13632a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var13 = d0VarC;
                    k(l3VarG11, (Function1) objI0, a0Var4, d0Var13, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i211));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var13;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i212 = i12 >> 3;
                l3 l3VarG12 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i212 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = p.f13632a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var14 = d0VarC;
                k(l3VarG12, (Function1) objI0, a0Var4, d0Var14, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i212));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var14;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 3072;
        d0VarC = d0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                f0Var2 = f0Var;
                if (c0VarR.D(f0Var2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i213 = i12 >> 3;
                    l3 l3VarG13 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i213 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = p.f13632a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var15 = d0VarC;
                    k(l3VarG13, (Function1) objI0, a0Var4, d0Var15, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i213));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var15;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i214 = i12 >> 3;
                l3 l3VarG14 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i214 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = p.f13632a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var16 = d0VarC;
                k(l3VarG14, (Function1) objI0, a0Var4, d0Var16, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i214));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var16;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 24576;
        f0Var2 = f0Var;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                if (c0VarR.D(str)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i215 = i12 >> 3;
                l3 l3VarG15 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i215 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = p.f13632a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var17 = d0VarC;
                k(l3VarG15, (Function1) objI0, a0Var4, d0Var17, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i215));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var17;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        if ((i11 & 32) != 0) {
            i12 |= 1572864;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
        }
        if ((599185 & i12) != 599184) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i20 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                d0VarC = b0.i(null, null, false, null, 15, null).c(b0.o(null, 0.0f, 3, null));
            }
            if (i15 != 0) {
                f0VarD = b0.y(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
            } else {
                f0VarD = f0Var2;
            }
            if (i17 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1763490971, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
            }
            int i216 = i12 >> 3;
            l3 l3VarG16 = w3.G(w1Var, str3, c0VarR, w1.f13348e | (i216 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = p.f13632a;
                c0VarR.Y(objI0);
            }
            d0 d0Var18 = d0VarC;
            k(l3VarG16, (Function1) objI0, a0Var4, d0Var18, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i216));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str2 = str3;
            a0Var3 = a0Var4;
            d0Var2 = d0Var18;
            f0Var3 = f0VarD;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            d0Var2 = d0VarC;
            f0Var3 = f0Var2;
            str2 = str;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new e(x5Var, w1Var, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x010c  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0112  */
    /* JADX WARN: Code duplicated, block: B:87:0x011c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0142  */
    /* JADX WARN: Code duplicated, block: B:93:0x0165  */
    /* JADX WARN: Code duplicated, block: B:95:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x017e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void i(@NotNull x5 x5Var, boolean z10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable d0 d0Var, @Nullable f0 f0Var, @Nullable String str, @NotNull pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        boolean z11;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        d0 d0VarC;
        int i14;
        int i15;
        f0 f0Var2;
        int i16;
        int i17;
        int i18;
        pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i19;
        boolean z12;
        androidx.compose.ui.a0 a0Var3;
        d0 d0Var2;
        f0 f0Var3;
        String str2;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        f0 f0VarD;
        String str3;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(234057107);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 48) == 0) {
                i12 = (c0VarR.G(z11) ? 32 : 16) | i10;
            } else {
                i12 = i10;
            }
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    d0VarC = d0Var;
                    if (c0VarR.D(d0VarC)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        f0Var2 = f0Var;
                        if (c0VarR.D(f0Var2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            if (c0VarR.D(str)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= 1572864;
                            nVar2 = nVar;
                        } else {
                            nVar2 = nVar;
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.k0(nVar2)) {
                                    i19 = 1048576;
                                } else {
                                    i19 = 524288;
                                }
                                i12 |= i19;
                            }
                        }
                        if ((599185 & i12) != 599184) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                            }
                            if (i15 != 0) {
                                f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                            } else {
                                f0VarD = f0Var2;
                            }
                            if (i17 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                            }
                            int i21 = i12 >> 3;
                            l3 l3VarJ = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i21 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = j.f13603a;
                                c0VarR.Y(objI0);
                            }
                            d0 d0Var3 = d0VarC;
                            k(l3VarJ, (Function1) objI0, a0Var4, d0Var3, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i21));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var3 = a0Var4;
                            d0Var2 = d0Var3;
                            f0Var3 = f0VarD;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            d0Var2 = d0VarC;
                            f0Var3 = f0Var2;
                            str2 = str;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                        }
                        int i22 = i12 >> 3;
                        l3 l3VarJ2 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i22 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = j.f13603a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var4 = d0VarC;
                        k(l3VarJ2, (Function1) objI0, a0Var4, d0Var4, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i22));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var4;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                f0Var2 = f0Var;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                        }
                        int i23 = i12 >> 3;
                        l3 l3VarJ3 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i23 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = j.f13603a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var5 = d0VarC;
                        k(l3VarJ3, (Function1) objI0, a0Var4, d0Var5, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i23));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var5;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                    }
                    int i24 = i12 >> 3;
                    l3 l3VarJ4 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i24 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = j.f13603a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var6 = d0VarC;
                    k(l3VarJ4, (Function1) objI0, a0Var4, d0Var6, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i24));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var6;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            d0VarC = d0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                        }
                        int i25 = i12 >> 3;
                        l3 l3VarJ5 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i25 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = j.f13603a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var7 = d0VarC;
                        k(l3VarJ5, (Function1) objI0, a0Var4, d0Var7, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i25));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var7;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                    }
                    int i26 = i12 >> 3;
                    l3 l3VarJ6 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i26 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = j.f13603a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var8 = d0VarC;
                    k(l3VarJ6, (Function1) objI0, a0Var4, d0Var8, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i26));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var8;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                    }
                    int i27 = i12 >> 3;
                    l3 l3VarJ7 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i27 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = j.f13603a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var9 = d0VarC;
                    k(l3VarJ7, (Function1) objI0, a0Var4, d0Var9, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i27));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var9;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                }
                int i28 = i12 >> 3;
                l3 l3VarJ8 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i28 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = j.f13603a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var10 = d0VarC;
                k(l3VarJ8, (Function1) objI0, a0Var4, d0Var10, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i28));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var10;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                d0VarC = d0Var;
                if (c0VarR.D(d0VarC)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((599185 & i12) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                        }
                        if (i15 != 0) {
                            f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i17 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                        }
                        int i29 = i12 >> 3;
                        l3 l3VarJ9 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i29 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = j.f13603a;
                            c0VarR.Y(objI0);
                        }
                        d0 d0Var11 = d0VarC;
                        k(l3VarJ9, (Function1) objI0, a0Var4, d0Var11, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i29));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var2 = d0Var11;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        d0Var2 = d0VarC;
                        f0Var3 = f0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                    }
                    int i210 = i12 >> 3;
                    l3 l3VarJ10 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i210 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = j.f13603a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var12 = d0VarC;
                    k(l3VarJ10, (Function1) objI0, a0Var4, d0Var12, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i210));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var12;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                    }
                    int i211 = i12 >> 3;
                    l3 l3VarJ11 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i211 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = j.f13603a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var13 = d0VarC;
                    k(l3VarJ11, (Function1) objI0, a0Var4, d0Var13, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i211));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var13;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                }
                int i212 = i12 >> 3;
                l3 l3VarJ12 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i212 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = j.f13603a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var14 = d0VarC;
                k(l3VarJ12, (Function1) objI0, a0Var4, d0Var14, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i212));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var14;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 3072;
        d0VarC = d0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                f0Var2 = f0Var;
                if (c0VarR.D(f0Var2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                if ((599185 & i12) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                    }
                    if (i15 != 0) {
                        f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i17 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                    }
                    int i213 = i12 >> 3;
                    l3 l3VarJ13 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i213 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = j.f13603a;
                        c0VarR.Y(objI0);
                    }
                    d0 d0Var15 = d0VarC;
                    k(l3VarJ13, (Function1) objI0, a0Var4, d0Var15, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i213));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var2 = d0Var15;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    d0Var2 = d0VarC;
                    f0Var3 = f0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                }
                int i214 = i12 >> 3;
                l3 l3VarJ14 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i214 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = j.f13603a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var16 = d0VarC;
                k(l3VarJ14, (Function1) objI0, a0Var4, d0Var16, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i214));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var16;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 24576;
        f0Var2 = f0Var;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                if (c0VarR.D(str)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            if ((599185 & i12) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
                }
                if (i15 != 0) {
                    f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i17 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                }
                int i215 = i12 >> 3;
                l3 l3VarJ15 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i215 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = j.f13603a;
                    c0VarR.Y(objI0);
                }
                d0 d0Var17 = d0VarC;
                k(l3VarJ15, (Function1) objI0, a0Var4, d0Var17, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i215));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var2 = d0Var17;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                d0Var2 = d0VarC;
                f0Var3 = f0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        if ((i11 & 32) != 0) {
            i12 |= 1572864;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
        }
        if ((599185 & i12) != 599184) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i20 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                d0VarC = b0.o(null, 0.0f, 3, null).c(b0.i(null, null, false, null, 15, null));
            }
            if (i15 != 0) {
                f0VarD = b0.q(null, 0.0f, 3, null).d(b0.y(null, null, false, null, 15, null));
            } else {
                f0VarD = f0Var2;
            }
            if (i17 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(234057107, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
            }
            int i216 = i12 >> 3;
            l3 l3VarJ16 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i216 & 14) | ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B), 0);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = j.f13603a;
                c0VarR.Y(objI0);
            }
            d0 d0Var18 = d0VarC;
            k(l3VarJ16, (Function1) objI0, a0Var4, d0Var18, f0VarD, nVar2, c0VarR, (i12 & 896) | 48 | (i12 & 7168) | (i12 & 57344) | (458752 & i216));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str2 = str3;
            a0Var3 = a0Var4;
            d0Var2 = d0Var18;
            f0Var3 = f0VarD;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            d0Var2 = d0VarC;
            f0Var3 = f0Var2;
            str2 = str;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new C0067k(x5Var, z11, a0Var3, d0Var2, f0Var3, str2, nVar, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
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
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x011c  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0127  */
    /* JADX WARN: Code duplicated, block: B:91:0x014d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0172  */
    /* JADX WARN: Code duplicated, block: B:96:0x017a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0189  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void j(boolean z10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable d0 d0Var, @Nullable f0 f0Var, @Nullable String str, @NotNull pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        boolean z11;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        d0 d0Var2;
        int i14;
        int i15;
        f0 f0Var2;
        int i16;
        int i17;
        int i18;
        pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i19;
        boolean z12;
        String str2;
        androidx.compose.ui.a0 a0Var3;
        d0 d0Var3;
        f0 f0Var3;
        s5 s5VarT;
        int i20;
        androidx.compose.ui.a0 a0Var4;
        d0 d0VarC;
        f0 f0VarD;
        String str3;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1448730565);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z11 = z10;
        } else if ((i10 & 6) == 0) {
            z11 = z10;
            i12 = (c0VarR.G(z11) ? 4 : 2) | i10;
        } else {
            z11 = z10;
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    d0Var2 = d0Var;
                    if (c0VarR.D(d0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        f0Var2 = f0Var;
                        if (c0VarR.D(f0Var2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c0VarR.D(str)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= androidx.profileinstaller.n.c.f73814m;
                            nVar2 = nVar;
                        } else {
                            nVar2 = nVar;
                            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                if (c0VarR.k0(nVar2)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                                i12 |= i19;
                            }
                        }
                        if ((74899 & i12) != 74898) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            if (i21 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                                i20 = i17;
                            } else {
                                i20 = i17;
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                            } else {
                                d0VarC = d0Var2;
                            }
                            if (i15 != 0) {
                                f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                            } else {
                                f0VarD = f0Var2;
                            }
                            if (i20 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                            }
                            l3 l3VarJ = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = d.f13567a;
                                c0VarR.Y(objI0);
                            }
                            Function1 function1 = (Function1) objI0;
                            int i22 = i12 << 3;
                            k(l3VarJ, function1, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i22 & 57344) | (i22 & 896) | 48 | (i22 & 7168) | (i12 & 458752));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var3 = a0Var4;
                            d0Var3 = d0VarC;
                            f0Var3 = f0VarD;
                        } else {
                            c0VarR.u();
                            str2 = str;
                            a0Var3 = a0Var2;
                            d0Var3 = d0Var2;
                            f0Var3 = f0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                        }
                    }
                    i12 |= 24576;
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i20 = i17;
                        } else {
                            i20 = i17;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                        } else {
                            d0VarC = d0Var2;
                        }
                        if (i15 != 0) {
                            f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i20 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                        }
                        l3 l3VarJ2 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = d.f13567a;
                            c0VarR.Y(objI0);
                        }
                        Function1 function2 = (Function1) objI0;
                        int i23 = i12 << 3;
                        k(l3VarJ2, function2, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168) | (i12 & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var3 = d0VarC;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        str2 = str;
                        a0Var3 = a0Var2;
                        d0Var3 = d0Var2;
                        f0Var3 = f0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 3072;
                f0Var2 = f0Var;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i20 = i17;
                        } else {
                            i20 = i17;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                        } else {
                            d0VarC = d0Var2;
                        }
                        if (i15 != 0) {
                            f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i20 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                        }
                        l3 l3VarJ3 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = d.f13567a;
                            c0VarR.Y(objI0);
                        }
                        Function1 function3 = (Function1) objI0;
                        int i24 = i12 << 3;
                        k(l3VarJ3, function3, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i12 & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var3 = d0VarC;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        str2 = str;
                        a0Var3 = a0Var2;
                        d0Var3 = d0Var2;
                        f0Var3 = f0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                    }
                    l3 l3VarJ4 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = d.f13567a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function4 = (Function1) objI0;
                    int i25 = i12 << 3;
                    k(l3VarJ4, function4, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= a5.S0;
            d0Var2 = d0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i20 = i17;
                        } else {
                            i20 = i17;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                        } else {
                            d0VarC = d0Var2;
                        }
                        if (i15 != 0) {
                            f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i20 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                        }
                        l3 l3VarJ5 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = d.f13567a;
                            c0VarR.Y(objI0);
                        }
                        Function1 function5 = (Function1) objI0;
                        int i26 = i12 << 3;
                        k(l3VarJ5, function5, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168) | (i12 & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var3 = d0VarC;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        str2 = str;
                        a0Var3 = a0Var2;
                        d0Var3 = d0Var2;
                        f0Var3 = f0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                    }
                    l3 l3VarJ6 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = d.f13567a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function6 = (Function1) objI0;
                    int i27 = i12 << 3;
                    k(l3VarJ6, function6, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                    }
                    l3 l3VarJ7 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = d.f13567a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function7 = (Function1) objI0;
                    int i28 = i12 << 3;
                    k(l3VarJ7, function7, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i20 = i17;
                } else {
                    i20 = i17;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i20 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                }
                l3 l3VarJ8 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = d.f13567a;
                    c0VarR.Y(objI0);
                }
                Function1 function8 = (Function1) objI0;
                int i29 = i12 << 3;
                k(l3VarJ8, function8, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168) | (i12 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var3 = d0VarC;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                str2 = str;
                a0Var3 = a0Var2;
                d0Var3 = d0Var2;
                f0Var3 = f0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                d0Var2 = d0Var;
                if (c0VarR.D(d0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    f0Var2 = f0Var;
                    if (c0VarR.D(f0Var2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(str)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i20 = i17;
                        } else {
                            i20 = i17;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                        } else {
                            d0VarC = d0Var2;
                        }
                        if (i15 != 0) {
                            f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i20 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                        }
                        l3 l3VarJ9 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = d.f13567a;
                            c0VarR.Y(objI0);
                        }
                        Function1 function9 = (Function1) objI0;
                        int i210 = i12 << 3;
                        k(l3VarJ9, function9, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168) | (i12 & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        d0Var3 = d0VarC;
                        f0Var3 = f0VarD;
                    } else {
                        c0VarR.u();
                        str2 = str;
                        a0Var3 = a0Var2;
                        d0Var3 = d0Var2;
                        f0Var3 = f0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                    }
                    l3 l3VarJ10 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = d.f13567a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function10 = (Function1) objI0;
                    int i211 = i12 << 3;
                    k(l3VarJ10, function10, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            f0Var2 = f0Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                    }
                    l3 l3VarJ11 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = d.f13567a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function11 = (Function1) objI0;
                    int i212 = i12 << 3;
                    k(l3VarJ11, function11, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i20 = i17;
                } else {
                    i20 = i17;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i20 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                }
                l3 l3VarJ12 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = d.f13567a;
                    c0VarR.Y(objI0);
                }
                Function1 function12 = (Function1) objI0;
                int i213 = i12 << 3;
                k(l3VarJ12, function12, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168) | (i12 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var3 = d0VarC;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                str2 = str;
                a0Var3 = a0Var2;
                d0Var3 = d0Var2;
                f0Var3 = f0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        d0Var2 = d0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                f0Var2 = f0Var;
                if (c0VarR.D(f0Var2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(str)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                    } else {
                        d0VarC = d0Var2;
                    }
                    if (i15 != 0) {
                        f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i20 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                    }
                    l3 l3VarJ13 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = d.f13567a;
                        c0VarR.Y(objI0);
                    }
                    Function1 function13 = (Function1) objI0;
                    int i214 = i12 << 3;
                    k(l3VarJ13, function13, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168) | (i12 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    d0Var3 = d0VarC;
                    f0Var3 = f0VarD;
                } else {
                    c0VarR.u();
                    str2 = str;
                    a0Var3 = a0Var2;
                    d0Var3 = d0Var2;
                    f0Var3 = f0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i20 = i17;
                } else {
                    i20 = i17;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i20 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                }
                l3 l3VarJ14 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = d.f13567a;
                    c0VarR.Y(objI0);
                }
                Function1 function14 = (Function1) objI0;
                int i215 = i12 << 3;
                k(l3VarJ14, function14, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168) | (i12 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var3 = d0VarC;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                str2 = str;
                a0Var3 = a0Var2;
                d0Var3 = d0Var2;
                f0Var3 = f0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 3072;
        f0Var2 = f0Var;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.D(str)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i20 = i17;
                } else {
                    i20 = i17;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
                } else {
                    d0VarC = d0Var2;
                }
                if (i15 != 0) {
                    f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
                } else {
                    f0VarD = f0Var2;
                }
                if (i20 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                }
                l3 l3VarJ15 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = d.f13567a;
                    c0VarR.Y(objI0);
                }
                Function1 function15 = (Function1) objI0;
                int i216 = i12 << 3;
                k(l3VarJ15, function15, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168) | (i12 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                d0Var3 = d0VarC;
                f0Var3 = f0VarD;
            } else {
                c0VarR.u();
                str2 = str;
                a0Var3 = a0Var2;
                d0Var3 = d0Var2;
                f0Var3 = f0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 24576;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
        }
        if ((74899 & i12) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i21 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
                i20 = i17;
            } else {
                i20 = i17;
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                d0VarC = b0.o(null, 0.0f, 3, null).c(b0.k(null, null, false, null, 15, null));
            } else {
                d0VarC = d0Var2;
            }
            if (i15 != 0) {
                f0VarD = b0.A(null, null, false, null, 15, null).d(b0.q(null, 0.0f, 3, null));
            } else {
                f0VarD = f0Var2;
            }
            if (i20 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1448730565, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
            }
            l3 l3VarJ16 = w3.J(Boolean.valueOf(z11), str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = d.f13567a;
                c0VarR.Y(objI0);
            }
            Function1 function16 = (Function1) objI0;
            int i217 = i12 << 3;
            k(l3VarJ16, function16, a0Var4, d0VarC, f0VarD, nVar2, c0VarR, (i217 & 57344) | (i217 & 896) | 48 | (i217 & 7168) | (i12 & 458752));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str2 = str3;
            a0Var3 = a0Var4;
            d0Var3 = d0VarC;
            f0Var3 = f0VarD;
        } else {
            c0VarR.u();
            str2 = str;
            a0Var3 = a0Var2;
            d0Var3 = d0Var2;
            f0Var3 = f0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new i(z11, a0Var3, d0Var3, f0Var3, str2, nVar, i10, i11));
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final <T> void k(@NotNull l3<T> l3Var, @NotNull Function1<? super T, Boolean> function1, @NotNull androidx.compose.ui.a0 a0Var, @NotNull d0 d0Var, @NotNull f0 f0Var, @NotNull pj.n<? super androidx.compose.animation.l, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        f0 f0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1706321816);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(l3Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function1) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(d0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            f0Var2 = f0Var;
            i11 |= c0VarR.D(f0Var2) ? 16384 : 8192;
        } else {
            f0Var2 = f0Var;
        }
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i11 |= c0VarR.k0(nVar) ? 131072 : 65536;
        }
        if (c0VarR.h((74899 & i11) != 74898, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1706321816, i11, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)");
            }
            int i12 = i11 & com.planner5d.library.engine.input.f.b.B;
            int i13 = i11 & 14;
            boolean z10 = (i12 == 32) | (i13 == 4);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new q(function1, l3Var);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.q0.a(a0Var, (pj.n) objI0);
            Object objI1 = c0VarR.i0();
            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = r.f13636a;
                c0VarR.Y(objI1);
            }
            a(l3Var, function1, a0VarA, d0Var, f0Var2, (Function2) objI1, null, nVar, c0VarR, i12 | 196608 | i13 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128), 64);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new s(l3Var, function1, a0Var, d0Var, f0Var, nVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(l3<z> l3Var) {
        z zVarP = l3Var.p();
        z zVar = z.PostExit;
        return zVarP == zVar && l3Var.y() == zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.o
    private static final <T> z o(l3<T> l3Var, Function1<? super T, Boolean> function1, T t10, androidx.compose.runtime.c0 c0Var, int i10) {
        z zVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:833)");
        }
        c0Var.m0(-422486105, l3Var);
        if (l3Var.E()) {
            c0Var.E(-212146657);
            c0Var.A();
            if (function1.invoke(t10).booleanValue()) {
                zVar = z.Visible;
            } else {
                zVar = function1.invoke(l3Var.p()).booleanValue() ? z.PostExit : z.PreEnter;
            }
        } else {
            c0Var.E(-211872524);
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = d7.g(Boolean.FALSE, null, 2, null);
                c0Var.Y(objI0);
            }
            n3 n3Var = (n3) objI0;
            if (function1.invoke(l3Var.p()).booleanValue()) {
                n3Var.setValue(Boolean.TRUE);
            }
            if (function1.invoke(t10).booleanValue()) {
                zVar = z.Visible;
            } else {
                zVar = ((Boolean) n3Var.getValue()).booleanValue() ? z.PostExit : z.PreEnter;
            }
            c0Var.A();
        }
        c0Var.v0();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return zVar;
    }
}
