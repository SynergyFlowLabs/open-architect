package androidx.compose.foundation.gestures;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,456:1\n1282#2,6:457\n97#3,4:463\n97#3,4:467\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n125#1:457,6\n139#1:463,4\n219#1:467,4\n*E\n"})
public final class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final g0 f15005a = new g0(0.0f, n0.g.f332700b.e(), 0.0f, null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", f = "TransformableState.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<g0> f15008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f15009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b1 f15010e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.i1.h<g0> hVar, g0 g0Var, b1 b1Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15008c = hVar;
            this.f15009d = g0Var;
            this.f15010e = b1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Object] */
        public static final Unit n(kotlin.jvm.internal.i1.h hVar, k5 k5Var, androidx.compose.animation.core.n nVar) {
            k5Var.a(((g0) hVar.f312751a).h() == 0.0f ? 1.0f : ((g0) nVar.g()).h() / ((g0) hVar.f312751a).h(), n0.g.v(((g0) nVar.g()).g(), ((g0) hVar.f312751a).g()), ((g0) nVar.g()).f() - ((g0) hVar.f312751a).f());
            hVar.f312751a = nVar.g();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f15008c, this.f15009d, this.f15010e, dVar);
            aVar.f15007b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15006a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final k5 k5Var = (k5) this.f15007b;
                androidx.compose.animation.core.q qVarD = androidx.compose.animation.core.r.d(j0.f14622a, this.f15008c.f312751a, s5.f15005a, 0L, 0L, false, 56, null);
                g0 g0Var = this.f15009d;
                b1 b1Var = this.f15010e;
                final kotlin.jvm.internal.i1.h<g0> hVar = this.f15008c;
                Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.r5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return s5.a.n(hVar, k5Var, (androidx.compose.animation.core.n) obj2);
                    }
                };
                this.f15006a = 1;
                if (androidx.compose.animation.core.f3.D(qVarD, g0Var, b1Var, false, function1, this, 4, null) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f15013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<n0.g> f15015e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.i1.g gVar, long j10, androidx.compose.animation.core.o<n0.g> oVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f15013c = gVar;
            this.f15014d = j10;
            this.f15015e = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(kotlin.jvm.internal.i1.g gVar, k5 k5Var, androidx.compose.animation.core.n nVar) {
            k5.b(k5Var, 0.0f, n0.g.v(((n0.g) nVar.g()).B(), gVar.f312750a), 0.0f, 5, null);
            gVar.f312750a = ((n0.g) nVar.g()).B();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f15013c, this.f15014d, this.f15015e, dVar);
            bVar.f15012b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15011a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final k5 k5Var = (k5) this.f15012b;
                androidx.compose.animation.core.q qVar = new androidx.compose.animation.core.q(androidx.compose.animation.core.t4.R(n0.g.f332700b), n0.g.d(this.f15013c.f312750a), null, 0L, 0L, false, 60, null);
                n0.g gVarD = n0.g.d(this.f15014d);
                androidx.compose.animation.core.o<n0.g> oVar = this.f15015e;
                final kotlin.jvm.internal.i1.g gVar = this.f15013c;
                Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.t5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return s5.b.n(gVar, k5Var, (androidx.compose.animation.core.n) obj2);
                    }
                };
                this.f15011a = 1;
                if (androidx.compose.animation.core.f3.D(qVar, gVarD, oVar, false, function1, this, 4, null) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f15018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f15020e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.jvm.internal.i1.e eVar, float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f15018c = eVar;
            this.f15019d = f10;
            this.f15020e = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(kotlin.jvm.internal.i1.e eVar, k5 k5Var, androidx.compose.animation.core.n nVar) {
            k5.b(k5Var, 0.0f, 0L, ((Number) nVar.g()).floatValue() - eVar.f312748a, 3, null);
            eVar.f312748a = ((Number) nVar.g()).floatValue();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f15018c, this.f15019d, this.f15020e, dVar);
            cVar.f15017b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15016a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final k5 k5Var = (k5) this.f15017b;
                androidx.compose.animation.core.q qVarC = androidx.compose.animation.core.r.c(this.f15018c.f312748a, 0.0f, 0L, 0L, false, 30, null);
                Float fE = kotlin.coroutines.jvm.internal.b.e(this.f15019d);
                androidx.compose.animation.core.o<Float> oVar = this.f15020e;
                final kotlin.jvm.internal.i1.e eVar = this.f15018c;
                Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.u5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return s5.c.n(eVar, k5Var, (androidx.compose.animation.core.n) obj2);
                    }
                };
                this.f15016a = 1;
                if (androidx.compose.animation.core.f3.D(qVarC, fE, oVar, false, function1, this, 4, null) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", i = {}, l = {androidx.media2.widget.f.i.f59777h0}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f15023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f15025e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.i1.e eVar, float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f15023c = eVar;
            this.f15024d = f10;
            this.f15025e = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(kotlin.jvm.internal.i1.e eVar, k5 k5Var, androidx.compose.animation.core.n nVar) {
            k5.b(k5Var, eVar.f312748a == 0.0f ? 1.0f : ((Number) nVar.g()).floatValue() / eVar.f312748a, 0L, 0.0f, 6, null);
            eVar.f312748a = ((Number) nVar.g()).floatValue();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f15023c, this.f15024d, this.f15025e, dVar);
            dVar2.f15022b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15021a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final k5 k5Var = (k5) this.f15022b;
                androidx.compose.animation.core.q qVarC = androidx.compose.animation.core.r.c(this.f15023c.f312748a, 0.0f, 0L, 0L, false, 30, null);
                Float fE = kotlin.coroutines.jvm.internal.b.e(this.f15024d);
                androidx.compose.animation.core.o<Float> oVar = this.f15025e;
                final kotlin.jvm.internal.i1.e eVar = this.f15023c;
                Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.v5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return s5.d.n(eVar, k5Var, (androidx.compose.animation.core.n) obj2);
                    }
                };
                this.f15021a = 1;
                if (androidx.compose.animation.core.f3.D(qVarC, fE, oVar, false, function1, this, 4, null) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$panBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15028c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f15028c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f15028c, dVar);
            eVar.f15027b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15026a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((k5) this.f15027b).a(1.0f, this.f15028c, 0.0f);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f15031c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f15031c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f15031c, dVar);
            fVar.f15030b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15029a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((k5) this.f15030b).a(1.0f, n0.g.f332700b.e(), this.f15031c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15032a;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15032a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f15035c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f10, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f15035c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f15035c, dVar);
            hVar.f15034b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15033a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((k5) this.f15034b).a(this.f15035c, n0.g.f332700b.e(), 0.0f);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final p5 b(@NotNull pj.n<? super Float, ? super n0.g, ? super Float, Unit> nVar) {
        return new a1(nVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.foundation.gestures.g0] */
    @Nullable
    public static final Object d(@NotNull p5 p5Var, float f10, long j10, float f11, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull androidx.compose.animation.core.o<n0.g> oVar2, @NotNull androidx.compose.animation.core.o<Float> oVar3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (!(f10 > 0.0f)) {
            androidx.compose.foundation.internal.e.g("zoom value should be greater than 0");
        }
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        hVar.f312751a = new g0(1.0f, n0.g.f332700b.e(), 0.0f, null);
        Object objA = p5.a(p5Var, null, new a(hVar, new g0(f10, j10, f11, null), new b1(oVar, oVar2, oVar3), null), dVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @Nullable
    public static final Object f(@NotNull p5 p5Var, long j10, @NotNull androidx.compose.animation.core.o<n0.g> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        kotlin.jvm.internal.i1.g gVar = new kotlin.jvm.internal.i1.g();
        gVar.f312750a = n0.g.f332700b.e();
        Object objA = p5.a(p5Var, null, new b(gVar, j10, oVar, null), dVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    public static /* synthetic */ Object g(p5 p5Var, long j10, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = new androidx.compose.animation.core.q2(0.0f, 200.0f, null, 5, null);
        }
        return f(p5Var, j10, oVar, dVar);
    }

    @Nullable
    public static final Object h(@NotNull p5 p5Var, float f10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = p5.a(p5Var, null, new c(new kotlin.jvm.internal.i1.e(), f10, oVar, null), dVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    public static /* synthetic */ Object i(p5 p5Var, float f10, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = new androidx.compose.animation.core.q2(0.0f, 200.0f, null, 5, null);
        }
        return h(p5Var, f10, oVar, dVar);
    }

    @Nullable
    public static final Object j(@NotNull p5 p5Var, float f10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (!(f10 > 0.0f)) {
            androidx.compose.foundation.internal.e.g("zoom value should be greater than 0");
        }
        kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
        eVar.f312748a = 1.0f;
        Object objA = p5.a(p5Var, null, new d(eVar, f10, oVar, null), dVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    public static /* synthetic */ Object k(p5 p5Var, float f10, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = new androidx.compose.animation.core.q2(0.0f, 200.0f, null, 5, null);
        }
        return j(p5Var, f10, oVar, dVar);
    }

    @Nullable
    public static final Object l(@NotNull p5 p5Var, long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = p5.a(p5Var, null, new e(j10, null), dVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final p5 m(@NotNull pj.n<? super Float, ? super n0.g, ? super Float, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1681419281, i10, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:122)");
        }
        final n7 n7VarW = w6.w(nVar, c0Var, i10 & 14);
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = b(new pj.n() { // from class: androidx.compose.foundation.gestures.q5
                @Override // pj.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return s5.n(n7VarW, ((Float) obj).floatValue(), (n0.g) obj2, ((Float) obj3).floatValue());
                }
            });
            c0Var.Y(objI0);
        }
        p5 p5Var = (p5) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return p5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(n7 n7Var, float f10, n0.g gVar, float f11) {
        ((pj.n) n7Var.getValue()).invoke(Float.valueOf(f10), gVar, Float.valueOf(f11));
        return Unit.f312394a;
    }

    @Nullable
    public static final Object o(@NotNull p5 p5Var, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = p5.a(p5Var, null, new f(f10, null), dVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @Nullable
    public static final Object p(@NotNull p5 p5Var, @NotNull androidx.compose.foundation.q3 q3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = p5Var.c(q3Var, new g(null), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    public static /* synthetic */ Object q(p5 p5Var, androidx.compose.foundation.q3 q3Var, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return p(p5Var, q3Var, dVar);
    }

    @Nullable
    public static final Object r(@NotNull p5 p5Var, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = p5.a(p5Var, null, new h(f10, null), dVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }
}
