package androidx.compose.foundation.gestures;

import androidx.compose.runtime.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1751:1\n1747#1,4:1753\n1#2:1752\n113#3:1757\n113#3:1758\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n1311#1:1753,4\n1695#1:1757\n1652#1:1758\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f14683d = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f14684e = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSample.kt for example usages.";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f14685f = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f14686g = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f14688i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.input.pointer.c0, Boolean> f14680a = new Function1() { // from class: androidx.compose.foundation.gestures.h
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(k.g((androidx.compose.ui.input.pointer.c0) obj));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<Integer, Float> f14681b = new Function1() { // from class: androidx.compose.foundation.gestures.i
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(k.p(((Integer) obj).intValue()));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f14682c = androidx.compose.ui.unit.h.r(125);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.g0<Float> f14687h = androidx.compose.animation.core.i0.e(new b());

    public static final class a implements androidx.compose.foundation.gestures.snapping.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0<T> f14689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Float> f14690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f14691c;

        /* JADX WARN: Multi-variable type inference failed */
        a(b0<T> b0Var, Function1<? super Float, Float> function1, Function0<Float> function0) {
            this.f14689a = b0Var;
            this.f14690b = function1;
            this.f14691c = function0;
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float a(float f10) {
            float fN = this.f14689a.N();
            return this.f14689a.r().c(k.O(this.f14689a.r(), fN, f10, this.f14690b, this.f14691c)) - fN;
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float b(float f10, float f11) {
            return 0.0f;
        }
    }

    public static final class b implements androidx.compose.animation.core.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f14692a;

        b() {
        }

        @Override // androidx.compose.animation.core.a1
        public float a() {
            return this.f14692a;
        }

        @Override // androidx.compose.animation.core.a1
        public float b(long j10, float f10, float f11) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.a1
        public long c(float f10, float f11) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.a1
        public float d(float f10, float f11) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.a1
        public float e(long j10, float f10, float f11) {
            return 0.0f;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", i = {}, l = {1342}, m = "invokeSuspend", n = {}, s = {})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements pj.o<androidx.compose.foundation.gestures.b, t2<T>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b0<T> f14697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f14698f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b0<T> b0Var, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super c> dVar) {
            super(4, dVar);
            this.f14697e = b0Var;
            this.f14698f = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14693a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.gestures.b bVar = (androidx.compose.foundation.gestures.b) this.f14694b;
                t2 t2Var = (t2) this.f14695c;
                Object obj2 = this.f14696d;
                b0<T> b0Var = this.f14697e;
                float fX = b0Var.x();
                androidx.compose.animation.core.o<Float> oVar = this.f14698f;
                this.f14694b = null;
                this.f14695c = null;
                this.f14693a = 1;
                if (k.H(b0Var, fX, bVar, t2Var, obj2, oVar, this) == objL) {
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

        @Override // pj.o
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.foundation.gestures.b bVar, t2<T> t2Var, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = new c(this.f14697e, this.f14698f, dVar);
            cVar.f14694b = bVar;
            cVar.f14695c = t2Var;
            cVar.f14696d = t10;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {0, 0}, l = {1378}, m = "animateToWithDecay", n = {"remainingVelocity", "velocity"}, s = {"L$0", "F$0"})
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f14699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14702d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14701c = obj;
            this.f14702d |= Integer.MIN_VALUE;
            return k.L(null, null, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", i = {}, l = {1389, 1407, 1431}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2\n+ 2 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n1#1,1751:1\n1747#2,4:1752\n1747#2,4:1756\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2\n*L\n1394#1:1752,4\n1406#1:1756,4\n*E\n"})
    static final class e<T> extends kotlin.coroutines.jvm.internal.o implements pj.o<androidx.compose.foundation.gestures.b, t2<T>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b0<T> f14707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f14708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f14709g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f14710h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.g0<Float> f14711i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b0<T> b0Var, float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.jvm.internal.i1.e eVar, androidx.compose.animation.core.g0<Float> g0Var, kotlin.coroutines.d<? super e> dVar) {
            super(4, dVar);
            this.f14707e = b0Var;
            this.f14708f = f10;
            this.f14709g = oVar;
            this.f14710h = eVar;
            this.f14711i = g0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(float f10, kotlin.jvm.internal.i1.e eVar, androidx.compose.foundation.gestures.b bVar, kotlin.jvm.internal.i1.e eVar2, androidx.compose.animation.core.n nVar) {
            if ((((Number) nVar.g()).floatValue() >= f10 || eVar.f312748a <= f10) && (((Number) nVar.g()).floatValue() <= f10 || eVar.f312748a >= f10)) {
                bVar.a(((Number) nVar.g()).floatValue(), ((Number) nVar.h()).floatValue());
                eVar2.f312748a = ((Number) nVar.h()).floatValue();
                eVar.f312748a = ((Number) nVar.g()).floatValue();
            } else {
                float fN = k.N(((Number) nVar.g()).floatValue(), f10);
                bVar.a(fN, ((Number) nVar.h()).floatValue());
                eVar2.f312748a = Float.isNaN(((Number) nVar.h()).floatValue()) ? 0.0f : ((Number) nVar.h()).floatValue();
                eVar.f312748a = fN;
                nVar.a();
            }
            return Unit.f312394a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
        
            if (androidx.compose.animation.core.f3.z(r1, r1, false, r3, r24, 2, null) == r7) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
        
            if (androidx.compose.foundation.gestures.k.H(r0, r11, r0, r4, r5, r5, r24) == r7) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
        
            if (androidx.compose.foundation.gestures.k.H(r0, r12, r0, r4, r5, r5, r24) == r7) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.k.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.o
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.foundation.gestures.b bVar, t2<T> t2Var, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            e eVar = new e(this.f14707e, this.f14708f, this.f14709g, this.f14710h, this.f14711i, dVar);
            eVar.f14704b = bVar;
            eVar.f14705c = t2Var;
            eVar.f14706d = t10;
            return eVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {1542}, m = "restartable", n = {}, s = {})
    static final class f<I> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f14712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14713b;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14712a = obj;
            this.f14713b |= Integer.MIN_VALUE;
            return k.T(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {1544}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<I> f14716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<I, kotlin.coroutines.d<? super Unit>, Object> f14717d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> f14718a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f14719b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<I, kotlin.coroutines.d<? super Unit>, Object> f14720c;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.k$g$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {1551}, m = "invokeSuspend", n = {}, s = {})
            static final class C0079a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14721a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<I, kotlin.coroutines.d<? super Unit>, Object> f14722b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ I f14723c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f14724d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0079a(Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, I i10, kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super C0079a> dVar) {
                    super(2, dVar);
                    this.f14722b = function2;
                    this.f14723c = i10;
                    this.f14724d = s0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0079a(this.f14722b, this.f14723c, this.f14724d, dVar);
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
                    int i10 = this.f14721a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Function2<I, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f14722b;
                        I i11 = this.f14723c;
                        this.f14721a = 1;
                        if (function2.invoke(i11, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    kotlinx.coroutines.t0.d(this.f14724d, new androidx.compose.foundation.gestures.a());
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0079a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0}, l = {1547}, m = "emit", n = {"latestInputs"}, s = {"L$0"})
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f14725a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f14726b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f14727c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a<T> f14728d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f14729e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.f14728d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f14727c = obj;
                    this.f14729e |= Integer.MIN_VALUE;
                    boolean z10 = false | false;
                    return this.f14728d.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> hVar, kotlinx.coroutines.s0 s0Var, Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
                this.f14718a = hVar;
                this.f14719b = s0Var;
                this.f14720c = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001a  */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(I i10, kotlin.coroutines.d<? super Unit> dVar) {
                b bVar;
                Object obj;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i11 = bVar.f14729e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bVar.f14729e = i11 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, dVar);
                    }
                } else {
                    bVar = new b(this, dVar);
                }
                Object obj2 = bVar.f14727c;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i12 = bVar.f14729e;
                if (i12 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.p2 p2Var = this.f14718a.f312751a;
                    if (p2Var != null) {
                        p2Var.e(new androidx.compose.foundation.gestures.a());
                        bVar.f14725a = i10;
                        bVar.f14726b = p2Var;
                        bVar.f14729e = 1;
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
                    Object obj3 = bVar.f14725a;
                    ResultKt.m(obj2);
                    obj = obj3;
                }
                obj = i10;
                obj = i10;
                obj = i10;
                kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> hVar = this.f14718a;
                kotlinx.coroutines.s0 s0Var = this.f14719b;
                hVar.f312751a = (T) kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new C0079a(this.f14720c, obj, s0Var, null), 1, null);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function0<? extends I> function0, Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f14716c = function0;
            this.f14717d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f14716c, this.f14717d, dVar);
            gVar.f14715b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14714a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f14715b;
                kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
                kotlinx.coroutines.flow.i iVarY = w6.y(this.f14716c);
                a aVar = new a(hVar, s0Var, this.f14717d);
                this.f14714a = 1;
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
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h<T> extends kotlin.coroutines.jvm.internal.o implements pj.o<androidx.compose.foundation.gestures.b, t2<T>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14733d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(4, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f14730a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            androidx.compose.foundation.gestures.b bVar = (androidx.compose.foundation.gestures.b) this.f14731b;
            float fC = ((t2) this.f14732c).c(this.f14733d);
            if (!Float.isNaN(fC)) {
                androidx.compose.foundation.gestures.b.b(bVar, fC, 0.0f, 2, null);
            }
            return Unit.f312394a;
        }

        @Override // pj.o
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.foundation.gestures.b bVar, t2<T> t2Var, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            h hVar = new h(dVar);
            hVar.f14731b = bVar;
            hVar.f14732c = t2Var;
            hVar.f14733d = t10;
            return hVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.l(message = f14685f)
    @NotNull
    public static final <T> androidx.compose.ui.a0 A(@NotNull androidx.compose.ui.a0 a0Var, @NotNull b0<T> b0Var, boolean z10, @NotNull q3 q3Var, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.foundation.x3 x3Var, boolean z12, @Nullable c3 c3Var) {
        return a0Var.B2(new AnchoredDraggableElement(b0Var, q3Var, z11, Boolean.valueOf(z10), jVar, Boolean.valueOf(z12), x3Var, c3Var));
    }

    public static /* synthetic */ androidx.compose.ui.a0 B(androidx.compose.ui.a0 a0Var, b0 b0Var, q3 q3Var, boolean z10, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.x3 x3Var, c3 c3Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return x(a0Var, b0Var, q3Var, z10, (i10 & 8) != 0 ? null : jVar, (i10 & 16) != 0 ? null : x3Var, (i10 & 32) != 0 ? null : c3Var);
    }

    public static /* synthetic */ androidx.compose.ui.a0 C(androidx.compose.ui.a0 a0Var, b0 b0Var, q3 q3Var, boolean z10, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.x3 x3Var, boolean z11, c3 c3Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        androidx.compose.foundation.interaction.j jVar2 = (i10 & 8) != 0 ? null : jVar;
        androidx.compose.foundation.x3 x3Var2 = (i10 & 16) != 0 ? null : x3Var;
        if ((i10 & 32) != 0) {
            z11 = b0Var.J();
        }
        return y(a0Var, b0Var, q3Var, z12, jVar2, x3Var2, z11, (i10 & 64) != 0 ? null : c3Var);
    }

    public static /* synthetic */ androidx.compose.ui.a0 D(androidx.compose.ui.a0 a0Var, b0 b0Var, boolean z10, q3 q3Var, boolean z11, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.x3 x3Var, c3 c3Var, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return z(a0Var, b0Var, z10, q3Var, z11, (i10 & 16) != 0 ? null : jVar, (i10 & 32) != 0 ? null : x3Var, (i10 & 64) != 0 ? null : c3Var);
    }

    public static /* synthetic */ androidx.compose.ui.a0 E(androidx.compose.ui.a0 a0Var, b0 b0Var, boolean z10, q3 q3Var, boolean z11, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.x3 x3Var, boolean z12, c3 c3Var, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return A(a0Var, b0Var, z10, q3Var, z11, (i10 & 16) != 0 ? null : jVar, (i10 & 32) != 0 ? null : x3Var, (i10 & 64) != 0 ? b0Var.J() : z12, (i10 & 128) != 0 ? null : c3Var);
    }

    @NotNull
    public static final <T> e5 F(@NotNull b0<T> b0Var, @NotNull final androidx.compose.ui.unit.d dVar, @NotNull Function1<? super Float, Float> function1, @NotNull androidx.compose.animation.core.o<Float> oVar) {
        return androidx.compose.foundation.gestures.snapping.m.t(h(b0Var, function1, new Function0() { // from class: androidx.compose.foundation.gestures.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(k.G(dVar));
            }
        }), f14687h, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float G(androidx.compose.ui.unit.d dVar) {
        return dVar.S7(androidx.compose.ui.unit.h.r(125));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object H(b0<T> b0Var, float f10, final androidx.compose.foundation.gestures.b bVar, t2<T> t2Var, T t10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super Unit> dVar) {
        float fY;
        Object objL;
        float fC = t2Var.c(t10);
        final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
        if (Float.isNaN(b0Var.y())) {
            fY = 0.0f;
            int i10 = 3 & 0;
        } else {
            fY = b0Var.y();
        }
        eVar.f312748a = fY;
        if (!Float.isNaN(fC)) {
            float f11 = eVar.f312748a;
            if (f11 != fC && (objL = androidx.compose.animation.core.f3.l(f11, fC, f10, oVar, new Function2() { // from class: androidx.compose.foundation.gestures.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k.K(bVar, eVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                }
            }, dVar)) == kotlin.coroutines.intrinsics.b.l()) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    @Nullable
    public static final <T> Object I(@NotNull b0<T> b0Var, T t10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objO = b0.o(b0Var, t10, null, new c(b0Var, oVar, null), dVar, 2, null);
        return objO == kotlin.coroutines.intrinsics.b.l() ? objO : Unit.f312394a;
    }

    public static /* synthetic */ Object J(b0 b0Var, Object obj, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            oVar = b0Var.G() ? b0Var.D() : androidx.compose.foundation.gestures.d.f14520a.f();
        }
        return I(b0Var, obj, oVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(androidx.compose.foundation.gestures.b bVar, kotlin.jvm.internal.i1.e eVar, float f10, float f11) {
        bVar.a(f10, f11);
        eVar.f312748a = f10;
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public static final <T> Object L(@NotNull b0<T> b0Var, T t10, float f10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull androidx.compose.animation.core.g0<Float> g0Var, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        d dVar2;
        float f11;
        kotlin.jvm.internal.i1.e eVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f14702d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f14702d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        d dVar3 = dVar2;
        Object obj = dVar3.f14701c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar3.f14702d;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlin.jvm.internal.i1.e eVar2 = new kotlin.jvm.internal.i1.e();
            eVar2.f312748a = f10;
            e eVar3 = new e(b0Var, f10, oVar, eVar2, g0Var, null);
            dVar3.f14700b = eVar2;
            dVar3.f14699a = f10;
            dVar3.f14702d = 1;
            if (b0.o(b0Var, t10, null, eVar3, dVar3, 2, null) == objL) {
                return objL;
            }
            f11 = f10;
            eVar = eVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f11 = dVar3.f14699a;
            eVar = (kotlin.jvm.internal.i1.e) dVar3.f14700b;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.e(f11 - eVar.f312748a);
    }

    public static /* synthetic */ Object M(b0 b0Var, Object obj, float f10, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            oVar = b0Var.G() ? b0Var.D() : androidx.compose.foundation.gestures.d.f14520a.f();
        }
        androidx.compose.animation.core.o oVar2 = oVar;
        if ((i10 & 8) != 0) {
            g0Var = b0Var.G() ? b0Var.u() : androidx.compose.foundation.gestures.d.f14520a.d();
        }
        return L(b0Var, obj, f10, oVar2, g0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float N(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? kotlin.ranges.r.A(f10, f11) : kotlin.ranges.r.t(f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[RETURN] */
    public static final <T> T O(t2<T> t2Var, float f10, float f11, Function1<? super Float, Float> function1, Function0<Float> function0) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z10 = Math.abs(f11) > 0.0f;
        boolean z11 = z10 && f11 > 0.0f;
        if (!z10) {
            T tB = t2Var.b(f10);
            Intrinsics.checkNotNull(tB);
            return tB;
        }
        if (Math.abs(f11) >= Math.abs(function0.invoke().floatValue())) {
            T tA = t2Var.a(f10, z11);
            Intrinsics.checkNotNull(tA);
            return tA;
        }
        T tA2 = t2Var.a(f10, false);
        Intrinsics.checkNotNull(tA2);
        float fC = t2Var.c(tA2);
        T tA3 = t2Var.a(f10, true);
        Intrinsics.checkNotNull(tA3);
        float fC2 = t2Var.c(tA3);
        float fAbs = Math.abs(function1.invoke(Float.valueOf(Math.abs(fC - fC2))).floatValue());
        if (!z11) {
            fC = fC2;
        }
        boolean z12 = Math.abs(fC - f10) >= fAbs;
        if (z12) {
            if (z11) {
                return tA3;
            }
            return tA2;
        }
        if (z12) {
            throw new kotlin.k0();
        }
        if (z11) {
            return tA2;
        }
        return tA3;
    }

    private static final void P(Function0<String> function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> u0<T> Q() {
        return new u0<>(CollectionsKt.emptyList(), new float[0]);
    }

    public static final <T> void R(@NotNull t2<T> t2Var, @NotNull Function2<? super T, ? super Float, Unit> function2) {
        int size = t2Var.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            T tE = t2Var.e(i10);
            if (tE == null) {
                throw new IllegalArgumentException(("There was no key at index " + i10 + ". Please report a bug.").toString());
            }
            function2.invoke(tE, Float.valueOf(t2Var.g(i10)));
        }
    }

    public static final float S() {
        return f14682c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final <I> Object T(Function0<? extends I> function0, Function2<? super I, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f14713b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f14713b = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f14712a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f14713b;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                g gVar = new g(function0, function2, null);
                fVar.f14713b = 1;
                if (kotlinx.coroutines.t0.g(gVar, fVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
        } catch (androidx.compose.foundation.gestures.a unused) {
        }
        return Unit.f312394a;
    }

    @Nullable
    public static final <T> Object U(@NotNull b0<T> b0Var, T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objO = b0.o(b0Var, t10, null, new h(null), dVar, 2, null);
        return objO == kotlin.coroutines.intrinsics.b.l() ? objO : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(androidx.compose.ui.input.pointer.c0 c0Var) {
        return true;
    }

    private static final <T> androidx.compose.foundation.gestures.snapping.n h(b0<T> b0Var, Function1<? super Float, Float> function1, Function0<Float> function0) {
        return new a(b0Var, function1, function0);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = f14683d)
    @NotNull
    public static final <T> b0<T> i(T t10, @NotNull t2<T> t2Var, @NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull androidx.compose.animation.core.g0<Float> g0Var, @NotNull Function1<? super T, Boolean> function2) {
        b0<T> b0Var = new b0<>(t10, t2Var, function2);
        b0Var.V(function1);
        b0Var.Y(function0);
        b0Var.X(oVar);
        b0Var.R(g0Var);
        return b0Var;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = f14683d)
    @NotNull
    public static final <T> b0<T> j(T t10, @NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull androidx.compose.animation.core.g0<Float> g0Var, @NotNull Function1<? super T, Boolean> function2) {
        b0<T> b0Var = new b0<>(t10, function2);
        b0Var.V(function1);
        b0Var.Y(function0);
        b0Var.X(oVar);
        b0Var.R(g0Var);
        return b0Var;
    }

    public static /* synthetic */ b0 k(Object obj, t2 t2Var, Function1 function1, Function0 function0, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, Function1 function2, int i10, Object obj2) {
        if ((i10 & 64) != 0) {
            function2 = new Function1() { // from class: androidx.compose.foundation.gestures.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(k.n(obj3));
                }
            };
        }
        return i(obj, t2Var, function1, function0, oVar, g0Var, function2);
    }

    public static /* synthetic */ b0 l(Object obj, Function1 function1, Function0 function0, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, Function1 function2, int i10, Object obj2) {
        if ((i10 & 32) != 0) {
            function2 = new Function1() { // from class: androidx.compose.foundation.gestures.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(k.m(obj3));
                }
            };
        }
        return j(obj, function1, function0, oVar, g0Var, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(Object obj) {
        return true;
    }

    @NotNull
    public static final <T> t2<T> o(@NotNull Function1<? super u2<T>, Unit> function1) {
        u2 u2Var = new u2();
        function1.invoke(u2Var);
        return new u0(u2Var.b(), u2Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float p(int i10) {
        return Float.NaN;
    }

    @NotNull
    public static final <T> androidx.compose.ui.a0 x(@NotNull androidx.compose.ui.a0 a0Var, @NotNull b0<T> b0Var, @NotNull q3 q3Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.foundation.x3 x3Var, @Nullable c3 c3Var) {
        return a0Var.B2(new AnchoredDraggableElement(b0Var, q3Var, z10, null, jVar, null, x3Var, c3Var, 32, null));
    }

    @kotlin.l(message = f14685f)
    @NotNull
    public static final <T> androidx.compose.ui.a0 y(@NotNull androidx.compose.ui.a0 a0Var, @NotNull b0<T> b0Var, @NotNull q3 q3Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.foundation.x3 x3Var, boolean z11, @Nullable c3 c3Var) {
        return a0Var.B2(new AnchoredDraggableElement(b0Var, q3Var, z10, null, jVar, Boolean.valueOf(z11), x3Var, c3Var));
    }

    @NotNull
    public static final <T> androidx.compose.ui.a0 z(@NotNull androidx.compose.ui.a0 a0Var, @NotNull b0<T> b0Var, boolean z10, @NotNull q3 q3Var, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.foundation.x3 x3Var, @Nullable c3 c3Var) {
        return a0Var.B2(new AnchoredDraggableElement(b0Var, q3Var, z11, Boolean.valueOf(z10), jVar, null, x3Var, c3Var, 32, null));
    }
}
