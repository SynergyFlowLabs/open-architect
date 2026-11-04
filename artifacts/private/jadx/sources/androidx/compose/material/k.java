package androidx.compose.material;

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
public final class k {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ float f23380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u<T> f23381d;

        /* JADX INFO: renamed from: androidx.compose.material.k$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
        static final class C0176a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23382a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u<T> f23383b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f23384c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0176a(u<T> uVar, float f10, kotlin.coroutines.d<? super C0176a> dVar) {
                super(2, dVar);
                this.f23383b = uVar;
                this.f23384c = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0176a(this.f23383b, this.f23384c, dVar);
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
                int i10 = this.f23382a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    u<T> uVar = this.f23383b;
                    float f10 = this.f23384c;
                    this.f23382a = 1;
                    if (uVar.Q(f10, this) == objL) {
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
                return ((C0176a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u<T> uVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f23381d = uVar;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(s0Var, f10.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23378a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.k.f((kotlinx.coroutines.s0) this.f23379b, null, null, new C0176a(this.f23381d, this.f23380c, null), 3, null);
            return Unit.f312394a;
        }

        public final Object k(kotlinx.coroutines.s0 s0Var, float f10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f23381d, dVar);
            aVar.f23379b = s0Var;
            aVar.f23380c = f10;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {691}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements pj.o<i, w5<T>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f23387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f23388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ u<T> f23389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f23390f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u<T> uVar, float f10, kotlin.coroutines.d<? super b> dVar) {
            super(4, dVar);
            this.f23389e = uVar;
            this.f23390f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(i iVar, kotlin.jvm.internal.i1.e eVar, float f10, float f11) {
            iVar.a(f10, f11);
            eVar.f312748a = f10;
            return Unit.f312394a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f23385a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final i iVar = (i) this.f23386b;
                float fC = ((w5) this.f23387c).c(this.f23388d);
                if (!Float.isNaN(fC)) {
                    final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
                    float fC2 = Float.isNaN(this.f23389e.C()) ? 0.0f : this.f23389e.C();
                    eVar.f312748a = fC2;
                    float f10 = this.f23390f;
                    androidx.compose.animation.core.o<Float> oVarV = this.f23389e.v();
                    Function2 function2 = new Function2() { // from class: androidx.compose.material.l
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return k.b.n(iVar, eVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f23386b = null;
                    this.f23387c = null;
                    this.f23385a = 1;
                    if (androidx.compose.animation.core.f3.l(fC2, fC, f10, oVarV, function2, this) == objL) {
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
        public final Object invoke(i iVar, w5<T> w5Var, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(this.f23389e, this.f23390f, dVar);
            bVar.f23386b = iVar;
            bVar.f23387c = w5Var;
            bVar.f23388d = t10;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {716}, m = "restartable", n = {}, s = {})
    static final class c<I> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23392b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23391a = obj;
            this.f23392b |= Integer.MIN_VALUE;
            return k.j(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {718}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<I> f23395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<I, kotlin.coroutines.d<? super Unit>, Object> f23396d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> f23397a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f23398b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<I, kotlin.coroutines.d<? super Unit>, Object> f23399c;

            /* JADX INFO: renamed from: androidx.compose.material.k$d$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {725}, m = "invokeSuspend", n = {}, s = {})
            static final class C0177a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f23400a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<I, kotlin.coroutines.d<? super Unit>, Object> f23401b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ I f23402c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f23403d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0177a(Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, I i10, kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super C0177a> dVar) {
                    super(2, dVar);
                    this.f23401b = function2;
                    this.f23402c = i10;
                    this.f23403d = s0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0177a(this.f23401b, this.f23402c, this.f23403d, dVar);
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
                    int i10 = this.f23400a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Function2<I, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f23401b;
                        I i11 = this.f23402c;
                        this.f23400a = 1;
                        if (function2.invoke(i11, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    kotlinx.coroutines.t0.d(this.f23403d, new h());
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0177a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0}, l = {721}, m = "emit", n = {"latestInputs"}, s = {"L$0"})
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f23404a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f23405b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f23406c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a<T> f23407d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f23408e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.f23407d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f23406c = obj;
                    this.f23408e |= Integer.MIN_VALUE;
                    return this.f23407d.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> hVar, kotlinx.coroutines.s0 s0Var, Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
                this.f23397a = hVar;
                this.f23398b = s0Var;
                this.f23399c = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0016  */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(I i10, kotlin.coroutines.d<? super Unit> dVar) {
                b bVar;
                Object obj;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i11 = bVar.f23408e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bVar.f23408e = i11 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, dVar);
                    }
                } else {
                    bVar = new b(this, dVar);
                }
                Object obj2 = bVar.f23406c;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i12 = bVar.f23408e;
                if (i12 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.p2 p2Var = this.f23397a.f312751a;
                    if (p2Var != null) {
                        p2Var.e(new h());
                        bVar.f23404a = i10;
                        bVar.f23405b = p2Var;
                        bVar.f23408e = 1;
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
                    Object obj3 = bVar.f23404a;
                    ResultKt.m(obj2);
                    obj = obj3;
                }
                obj = i10;
                obj = i10;
                obj = i10;
                kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> hVar = this.f23397a;
                kotlinx.coroutines.s0 s0Var = this.f23398b;
                hVar.f312751a = (T) kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new C0177a(this.f23399c, obj, s0Var, null), 1, null);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<? extends I> function0, Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f23395c = function0;
            this.f23396d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f23395c, this.f23396d, dVar);
            dVar2.f23394b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f23393a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f23394b;
                kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
                kotlinx.coroutines.flow.i iVarY = androidx.compose.runtime.w6.y(this.f23395c);
                a aVar = new a(hVar, s0Var, this.f23396d);
                this.f23393a = 1;
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e<T> extends kotlin.coroutines.jvm.internal.o implements pj.o<i, w5<T>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f23411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f23412d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(4, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23409a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            i iVar = (i) this.f23410b;
            float fC = ((w5) this.f23411c).c(this.f23412d);
            if (!Float.isNaN(fC)) {
                i.b(iVar, fC, 0.0f, 2, null);
            }
            return Unit.f312394a;
        }

        @Override // pj.o
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i iVar, w5<T> w5Var, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            e eVar = new e(dVar);
            eVar.f23410b = iVar;
            eVar.f23411c = w5Var;
            eVar.f23412d = t10;
            return eVar.invokeSuspend(Unit.f312394a);
        }
    }

    @u7
    @NotNull
    public static final <T> w5<T> a(@NotNull Function1<? super x5<T>, Unit> function1) {
        x5 x5Var = new x5();
        function1.invoke(x5Var);
        return new v9(x5Var.b());
    }

    @u7
    @NotNull
    public static final <T> androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull u<T> uVar, @NotNull androidx.compose.foundation.gestures.q3 q3Var, boolean z10, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z12) {
        return androidx.compose.foundation.gestures.x2.i(a0Var, uVar.A(), q3Var, z10, jVar, z12, null, new a(uVar, null), z11, 32, null);
    }

    public static /* synthetic */ androidx.compose.ui.a0 e(androidx.compose.ui.a0 a0Var, u uVar, androidx.compose.foundation.gestures.q3 q3Var, boolean z10, boolean z11, androidx.compose.foundation.interaction.j jVar, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            jVar = null;
        }
        androidx.compose.foundation.interaction.j jVar2 = jVar;
        if ((i10 & 32) != 0) {
            z12 = uVar.H();
        }
        return d(a0Var, uVar, q3Var, z13, z14, jVar2, z12);
    }

    @u7
    @Nullable
    public static final <T> Object f(@NotNull u<T> uVar, T t10, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = u.p(uVar, t10, null, new b(uVar, f10, null), dVar, 2, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    public static /* synthetic */ Object g(u uVar, Object obj, float f10, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = uVar.B();
        }
        return f(uVar, obj, f10, dVar);
    }

    @u7
    @NotNull
    public static final <T> androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @NotNull u<T> uVar, @NotNull androidx.compose.foundation.gestures.q3 q3Var, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends w5<T>, ? extends T>> function2) {
        return a0Var.B2(new DraggableAnchorsElement(uVar, function2, q3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> v9<T> i() {
        return new v9<>(MapsKt.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final <I> Object j(Function0<? extends I> function0, Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f23392b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f23392b = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f23391a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f23392b;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                d dVar2 = new d(function0, function2, null);
                cVar.f23392b = 1;
                if (kotlinx.coroutines.t0.g(dVar2, cVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
        } catch (h unused) {
        }
        return Unit.f312394a;
    }

    @u7
    @Nullable
    public static final <T> Object k(@NotNull u<T> uVar, T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = u.p(uVar, t10, null, new e(null), dVar, 2, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }
}
