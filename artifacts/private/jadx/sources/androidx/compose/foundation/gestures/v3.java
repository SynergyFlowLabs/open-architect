package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class v3 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {40}, m = "animateScrollBy", n = {"previousValue"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15177c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15176b = obj;
            this.f15177c |= Integer.MIN_VALUE;
            int i10 = 6 & 0;
            return v3.a(null, 0.0f, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f15180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f15181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f15182e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.jvm.internal.i1.e eVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f15180c = f10;
            this.f15181d = oVar;
            this.f15182e = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(kotlin.jvm.internal.i1.e eVar, z3 z3Var, float f10, float f11) {
            float f12 = eVar.f312748a;
            eVar.f312748a = f12 + z3Var.f(f10 - f12);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f15180c, this.f15181d, this.f15182e, dVar);
            bVar.f15179b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15178a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final z3 z3Var = (z3) this.f15179b;
                float f10 = this.f15180c;
                androidx.compose.animation.core.o<Float> oVar = this.f15181d;
                final kotlin.jvm.internal.i1.e eVar = this.f15182e;
                Function2 function2 = new Function2() { // from class: androidx.compose.foundation.gestures.w3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return v3.b.n(eVar, z3Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.f15178a = 1;
                if (androidx.compose.animation.core.f3.o(0.0f, f10, 0.0f, oVar, function2, this, 4, null) == objL) {
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
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "animateScrollBy-ubNVwUQ", n = {"previousValue"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15185c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15184b = obj;
            this.f15185c |= Integer.MIN_VALUE;
            return v3.c(null, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4", f = "ScrollExtensions.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<t3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<n0.g> f15189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f15190e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, androidx.compose.animation.core.o<n0.g> oVar, kotlin.jvm.internal.i1.g gVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f15188c = j10;
            this.f15189d = oVar;
            this.f15190e = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(kotlin.jvm.internal.i1.g gVar, t3 t3Var, n0.g gVar2, n0.g gVar3) {
            gVar.f312750a = n0.g.w(gVar.f312750a, t3Var.a(n0.g.v(gVar2.B(), gVar.f312750a)));
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f15188c, this.f15189d, this.f15190e, dVar);
            dVar2.f15187b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15186a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final t3 t3Var = (t3) this.f15187b;
                n0.g.a aVar = n0.g.f332700b;
                androidx.compose.animation.core.z3<n0.g, androidx.compose.animation.core.t> z3VarR = androidx.compose.animation.core.t4.R(aVar);
                n0.g gVarD = n0.g.d(aVar.e());
                n0.g gVarD2 = n0.g.d(this.f15188c);
                androidx.compose.animation.core.o<n0.g> oVar = this.f15189d;
                final kotlin.jvm.internal.i1.g gVar = this.f15190e;
                Function2 function2 = new Function2() { // from class: androidx.compose.foundation.gestures.x3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return v3.d.n(gVar, t3Var, (n0.g) obj2, (n0.g) obj3);
                    }
                };
                this.f15186a = 1;
                int i11 = 7 << 0;
                if (androidx.compose.animation.core.f3.q(z3VarR, gVarD, gVarD2, null, oVar, function2, this, 8, null) == objL) {
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
        public final Object invoke(t3 t3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(t3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "scrollBy", n = {"consumed"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15193c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15192b = obj;
            this.f15193c |= Integer.MIN_VALUE;
            return v3.e(null, 0.0f, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f15196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15197d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.jvm.internal.i1.e eVar, float f10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f15196c = eVar;
            this.f15197d = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f15196c, this.f15197d, dVar);
            fVar.f15195b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15194a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            z3 z3Var = (z3) this.f15195b;
            this.f15196c.f312748a = z3Var.f(this.f15197d);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "scrollBy-d-4ec7I", n = {"consumed"}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15200c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15199b = obj;
            this.f15200c |= Integer.MIN_VALUE;
            return v3.f(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<t3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f15203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15204d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(kotlin.jvm.internal.i1.g gVar, long j10, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f15203c = gVar;
            this.f15204d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f15203c, this.f15204d, dVar);
            hVar.f15202b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15201a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            t3 t3Var = (t3) this.f15202b;
            this.f15203c.f312750a = t3Var.a(this.f15204d);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t3 t3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(t3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15205a;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15205a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$4", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<t3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15206a;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15206a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t3 t3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(t3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    public static final Object a(@NotNull v4 v4Var, float f10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        a aVar;
        kotlin.jvm.internal.i1.e eVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f15177c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f15177c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f15176b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f15177c;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlin.jvm.internal.i1.e eVar2 = new kotlin.jvm.internal.i1.e();
            b bVar = new b(f10, oVar, eVar2, null);
            aVar2.f15175a = eVar2;
            aVar2.f15177c = 1;
            if (v4.h(v4Var, null, bVar, aVar2, 1, null) == objL) {
                return objL;
            }
            eVar = eVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (kotlin.jvm.internal.i1.e) aVar2.f15175a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.e(eVar.f312748a);
    }

    public static /* synthetic */ Object b(v4 v4Var, float f10, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);
        }
        return a(v4Var, f10, oVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public static final Object c(@NotNull g4 g4Var, long j10, @NotNull androidx.compose.animation.core.o<n0.g> oVar, @NotNull kotlin.coroutines.d<? super n0.g> dVar) {
        c cVar;
        kotlin.jvm.internal.i1.g gVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f15185c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f15185c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f15184b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f15185c;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlin.jvm.internal.i1.g gVar2 = new kotlin.jvm.internal.i1.g();
            gVar2.f312750a = n0.g.f332700b.e();
            d dVar2 = new d(j10, oVar, gVar2, null);
            cVar2.f15183a = gVar2;
            cVar2.f15185c = 1;
            if (g4.d(g4Var, null, dVar2, cVar2, 1, null) == objL) {
                return objL;
            }
            gVar = gVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (kotlin.jvm.internal.i1.g) cVar2.f15183a;
            ResultKt.m(obj);
        }
        return n0.g.d(gVar.f312750a);
    }

    public static /* synthetic */ Object d(g4 g4Var, long j10, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);
        }
        return c(g4Var, j10, oVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    public static final Object e(@NotNull v4 v4Var, float f10, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        e eVar;
        kotlin.jvm.internal.i1.e eVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f15193c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f15193c = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        e eVar3 = eVar;
        Object obj = eVar3.f15192b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar3.f15193c;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlin.jvm.internal.i1.e eVar4 = new kotlin.jvm.internal.i1.e();
            f fVar = new f(eVar4, f10, null);
            eVar3.f15191a = eVar4;
            eVar3.f15193c = 1;
            if (v4.h(v4Var, null, fVar, eVar3, 1, null) == objL) {
                return objL;
            }
            eVar2 = eVar4;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = (kotlin.jvm.internal.i1.e) eVar3.f15191a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.e(eVar2.f312748a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Nullable
    public static final Object f(@NotNull g4 g4Var, long j10, @NotNull kotlin.coroutines.d<? super n0.g> dVar) {
        g gVar;
        kotlin.jvm.internal.i1.g gVar2;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f15200c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f15200c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        g gVar3 = gVar;
        Object obj = gVar3.f15199b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar3.f15200c;
        int i12 = 4 | 1;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlin.jvm.internal.i1.g gVar4 = new kotlin.jvm.internal.i1.g();
            gVar4.f312750a = n0.g.f332700b.e();
            h hVar = new h(gVar4, j10, null);
            gVar3.f15198a = gVar4;
            gVar3.f15200c = 1;
            if (g4.d(g4Var, null, hVar, gVar3, 1, null) == objL) {
                return objL;
            }
            gVar2 = gVar4;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar2 = (kotlin.jvm.internal.i1.g) gVar3.f15198a;
            ResultKt.m(obj);
        }
        return n0.g.d(gVar2.f312750a);
    }

    @Nullable
    public static final Object g(@NotNull g4 g4Var, @NotNull androidx.compose.foundation.q3 q3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = g4Var.c(q3Var, new j(null), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    @Nullable
    public static final Object h(@NotNull v4 v4Var, @NotNull androidx.compose.foundation.q3 q3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = v4Var.c(q3Var, new i(null), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    public static /* synthetic */ Object i(g4 g4Var, androidx.compose.foundation.q3 q3Var, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return g(g4Var, q3Var, dVar);
    }

    public static /* synthetic */ Object j(v4 v4Var, androidx.compose.foundation.q3 q3Var, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return h(v4Var, q3Var, dVar);
    }
}
