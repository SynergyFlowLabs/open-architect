package androidx.compose.material3.internal;

import androidx.compose.runtime.w6;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ float f29128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0<T> f29129d;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.t$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
        static final class C0232a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f29130a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0<T> f29131b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f29132c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0232a(d0<T> d0Var, float f10, kotlin.coroutines.d<? super C0232a> dVar) {
                super(2, dVar);
                this.f29131b = d0Var;
                this.f29132c = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0232a(this.f29131b, this.f29132c, dVar);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f29130a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    d0<T> d0Var = this.f29131b;
                    float f10 = this.f29132c;
                    this.f29130a = 1;
                    if (d0Var.Q(f10, this) == objL) {
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
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0232a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0<T> d0Var, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f29129d = d0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(s0Var, f10.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f29126a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.k.f((kotlinx.coroutines.s0) this.f29127b, null, null, new C0232a(this.f29129d, this.f29128c, null), 3, null);
            return Unit.f312394a;
        }

        public final Object k(kotlinx.coroutines.s0 s0Var, float f10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f29129d, dVar);
            aVar.f29127b = s0Var;
            aVar.f29128c = f10;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {682}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements pj.o<r, b2<T>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f29136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0<T> f29137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f29138f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d0<T> d0Var, float f10, kotlin.coroutines.d<? super b> dVar) {
            super(4, dVar);
            this.f29137e = d0Var;
            this.f29138f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(r rVar, kotlin.jvm.internal.i1.e eVar, float f10, float f11) {
            rVar.a(f10, f11);
            eVar.f312748a = f10;
            return Unit.f312394a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f29133a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final r rVar = (r) this.f29134b;
                float fC = ((b2) this.f29135c).c(this.f29136d);
                if (!Float.isNaN(fC)) {
                    final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
                    float fC2 = Float.isNaN(this.f29137e.C()) ? 0.0f : this.f29137e.C();
                    eVar.f312748a = fC2;
                    float f10 = this.f29138f;
                    androidx.compose.animation.core.o<Float> oVarInvoke = this.f29137e.v().invoke();
                    Function2 function2 = new Function2() { // from class: androidx.compose.material3.internal.u
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t.b.n(rVar, eVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f29134b = null;
                    this.f29135c = null;
                    this.f29133a = 1;
                    if (androidx.compose.animation.core.f3.l(fC2, fC, f10, oVarInvoke, function2, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.o
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r rVar, b2<T> b2Var, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(this.f29137e, this.f29138f, dVar);
            bVar.f29134b = rVar;
            bVar.f29135c = b2Var;
            bVar.f29136d = t10;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.h.f44115p}, m = "restartable", n = {}, s = {})
    static final class c<I> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29140b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29139a = obj;
            this.f29140b |= Integer.MIN_VALUE;
            return t.j(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {708}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<I> f29143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<I, kotlin.coroutines.d<? super Unit>, Object> f29144d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> f29145a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f29146b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<I, kotlin.coroutines.d<? super Unit>, Object> f29147c;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.t$d$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {715}, m = "invokeSuspend", n = {}, s = {})
            static final class C0233a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29148a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<I, kotlin.coroutines.d<? super Unit>, Object> f29149b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ I f29150c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f29151d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0233a(Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, I i10, kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super C0233a> dVar) {
                    super(2, dVar);
                    this.f29149b = function2;
                    this.f29150c = i10;
                    this.f29151d = s0Var;
                    int i11 = 4 ^ 2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0233a(this.f29149b, this.f29150c, this.f29151d, dVar);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f29148a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Function2<I, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f29149b;
                        I i11 = this.f29150c;
                        this.f29148a = 1;
                        if (function2.invoke(i11, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    kotlinx.coroutines.t0.d(this.f29151d, new q());
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0233a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0}, l = {711}, m = "emit", n = {"latestInputs"}, s = {"L$0"})
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f29152a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f29153b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f29154c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a<T> f29155d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f29156e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.f29155d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f29154c = obj;
                    this.f29156e |= Integer.MIN_VALUE;
                    return this.f29155d.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> hVar, kotlinx.coroutines.s0 s0Var, Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
                this.f29145a = hVar;
                this.f29146b = s0Var;
                this.f29147c = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(I i10, kotlin.coroutines.d<? super Unit> dVar) {
                b bVar;
                Object obj;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i11 = bVar.f29156e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bVar.f29156e = i11 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, dVar);
                    }
                } else {
                    bVar = new b(this, dVar);
                }
                Object obj2 = bVar.f29154c;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i12 = bVar.f29156e;
                if (i12 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.p2 p2Var = this.f29145a.f312751a;
                    if (p2Var != null) {
                        p2Var.e(new q());
                        bVar.f29152a = i10;
                        bVar.f29153b = p2Var;
                        bVar.f29156e = 1;
                        if (p2Var.d1(bVar) == objL) {
                            obj = i10;
                            obj = i10;
                            return objL;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = bVar.f29152a;
                    ResultKt.m(obj2);
                    obj = obj3;
                }
                obj = i10;
                obj = i10;
                obj = i10;
                kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> hVar = this.f29145a;
                kotlinx.coroutines.s0 s0Var = this.f29146b;
                hVar.f312751a = (T) kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new C0233a(this.f29147c, obj, s0Var, null), 1, null);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<? extends I> function0, Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f29143c = function0;
            this.f29144d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f29143c, this.f29144d, dVar);
            dVar2.f29142b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f29141a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f29142b;
                kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
                kotlinx.coroutines.flow.i iVarY = w6.y(this.f29143c);
                a aVar = new a(hVar, s0Var, this.f29144d);
                this.f29141a = 1;
                if (iVarY.collect(aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e<T> extends kotlin.coroutines.jvm.internal.o implements pj.o<r, b2<T>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f29160d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(4, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f29157a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            r rVar = (r) this.f29158b;
            float fC = ((b2) this.f29159c).c(this.f29160d);
            if (!Float.isNaN(fC)) {
                r.b(rVar, fC, 0.0f, 2, null);
            }
            return Unit.f312394a;
        }

        @Override // pj.o
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r rVar, b2<T> b2Var, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            e eVar = new e(dVar);
            eVar.f29158b = rVar;
            eVar.f29159c = b2Var;
            eVar.f29160d = t10;
            return eVar.invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final <T> b2<T> a(@NotNull Function1<? super c2<T>, Unit> function1) {
        c2 c2Var = new c2();
        function1.invoke(c2Var);
        return new y2(c2Var.b());
    }

    @NotNull
    public static final <T> androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull d0<T> d0Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, boolean z10, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar) {
        return androidx.compose.foundation.gestures.x2.i(a0Var, d0Var.A(), q3Var, z10, jVar, d0Var.H(), null, new a(d0Var, null), z11, 32, null);
    }

    public static /* synthetic */ androidx.compose.ui.a0 e(androidx.compose.ui.a0 a0Var, d0 d0Var, androidx.compose.foundation.gestures.q3 q3Var, boolean z10, boolean z11, androidx.compose.foundation.interaction.j jVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            jVar = null;
        }
        return d(a0Var, d0Var, q3Var, z12, z13, jVar);
    }

    @Nullable
    public static final <T> Object f(@NotNull d0<T> d0Var, T t10, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = d0.p(d0Var, t10, null, new b(d0Var, f10, null), dVar, 2, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    public static /* synthetic */ Object g(d0 d0Var, Object obj, float f10, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = d0Var.B();
        }
        return f(d0Var, obj, f10, dVar);
    }

    @NotNull
    public static final <T> androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @NotNull d0<T> d0Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends b2<T>, ? extends T>> function2) {
        return a0Var.B2(new DraggableAnchorsElement(d0Var, function2, q3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> y2<T> i() {
        return new y2<>(MapsKt.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final <I> Object j(Function0<? extends I> function0, Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f29140b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f29140b = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f29139a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f29140b;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                d dVar2 = new d(function0, function2, null);
                cVar.f29140b = 1;
                if (kotlinx.coroutines.t0.g(dVar2, cVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
        } catch (q unused) {
        }
        return Unit.f312394a;
    }

    @Nullable
    public static final <T> Object k(@NotNull d0<T> d0Var, T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = d0.p(d0Var, t10, null, new e(null), dVar, 2, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }
}
