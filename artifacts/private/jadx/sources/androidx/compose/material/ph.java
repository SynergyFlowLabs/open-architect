package androidx.compose.material;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,881:1\n1282#2,6:882\n1282#2,6:888\n1282#2,6:894\n1282#2,6:900\n1282#2,6:906\n1282#2,6:912\n110#3:918\n774#4:919\n865#4,2:920\n774#4:935\n865#4,2:936\n295#4,2:951\n168#5,13:922\n503#5,13:938\n66#6,5:953\n113#7:958\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n466#1:882,6\n474#1:888,6\n499#1:894,6\n506#1:900,6\n507#1:906,6\n512#1:912,6\n573#1:918\n733#1:919\n733#1:920,2\n734#1:935\n734#1:936,2\n791#1:951,2\n733#1:922,13\n734#1:938,13\n517#1:953,5\n567#1:958\n*E\n"})
public final class ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f24230a = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.";

    @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,881:1\n30#2:882\n30#2:886\n30#2:890\n53#3,3:883\n53#3,3:887\n53#3,3:891\n70#3:895\n69#4:894\n22#5:896\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1\n*L\n857#1:882\n868#1:886\n872#1:890\n857#1:883,3\n868#1:887,3\n872#1:891,3\n874#1:895\n874#1:894\n874#1:896\n*E\n"})
    public static final class a implements androidx.compose.ui.input.nestedscroll.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xh<T> f24231a;

        /* JADX INFO: renamed from: androidx.compose.material.ph$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", i = {0}, l = {868}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
        static final class C0189a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f24232a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f24233b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f24235d;

            C0189a(kotlin.coroutines.d<? super C0189a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f24233b = obj;
                this.f24235d |= Integer.MIN_VALUE;
                return a.this.B0(0L, 0L, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", i = {0}, l = {859}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f24236a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f24237b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f24239d;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f24237b = obj;
                this.f24239d |= Integer.MIN_VALUE;
                return a.this.a4(0L, this);
            }
        }

        a(xh<T> xhVar) {
            this.f24231a = xhVar;
        }

        private final float a(long j10) {
            return Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        }

        private final long b(float f10) {
            return n0.g.g((((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(0.0f) << 32));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            C0189a c0189a;
            if (dVar instanceof C0189a) {
                c0189a = (C0189a) dVar;
                int i10 = c0189a.f24235d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0189a.f24235d = i10 - Integer.MIN_VALUE;
                } else {
                    c0189a = new C0189a(dVar);
                }
            } else {
                c0189a = new C0189a(dVar);
            }
            Object obj = c0189a.f24233b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c0189a.f24235d;
            if (i11 == 0) {
                ResultKt.m(obj);
                xh<T> xhVar = this.f24231a;
                float fL = androidx.compose.ui.unit.c0.l(j11);
                float fN = androidx.compose.ui.unit.c0.n(j11);
                float fA = a(n0.g.g((((long) Float.floatToRawIntBits(fL)) << 32) | (((long) Float.floatToRawIntBits(fN)) & com.rabbitmq.client.k0.f265952a)));
                c0189a.f24232a = j11;
                c0189a.f24235d = 1;
                if (xhVar.L(fA, c0189a) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = c0189a.f24232a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j11);
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
        @Override // androidx.compose.ui.input.nestedscroll.a
        public long G7(long j10, int i10) {
            float fA = a(j10);
            return (fA >= 0.0f || !androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) ? n0.g.f332700b.e() : b(this.f24231a.K(fA));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object a4(long j10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i10 = bVar.f24239d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f24239d = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f24237b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = bVar.f24239d;
            if (i11 == 0) {
                ResultKt.m(obj);
                float fL = androidx.compose.ui.unit.c0.l(j10);
                float fN = androidx.compose.ui.unit.c0.n(j10);
                float fA = a(n0.g.g((((long) Float.floatToRawIntBits(fL)) << 32) | (((long) Float.floatToRawIntBits(fN)) & com.rabbitmq.client.k0.f265952a)));
                if (fA >= 0.0f || this.f24231a.z().getValue().floatValue() <= this.f24231a.y()) {
                    j10 = androidx.compose.ui.unit.c0.f42681b.a();
                } else {
                    xh<T> xhVar = this.f24231a;
                    bVar.f24236a = j10;
                    bVar.f24239d = 1;
                    if (xhVar.L(fA, bVar) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = bVar.f24236a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j10);
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
        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            return androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h()) ? b(this.f24231a.K(a(j11))) : n0.g.f332700b.e();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1$1", f = "Swipeable.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f24241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ xh<T> f24242c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T t10, xh<T> xhVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f24241b = t10;
            this.f24242c = xhVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f24241b, this.f24242c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24240a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (!Intrinsics.areEqual(this.f24241b, this.f24242c.t())) {
                    xh<T> xhVar = this.f24242c;
                    T t10 = this.f24241b;
                    this.f24240a = 1;
                    int i11 = 1 >> 2;
                    if (xh.n(xhVar, t10, null, this, 2, null) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n1#1,69:1\n517#2:70\n*E\n"})
    public static final class c implements androidx.compose.runtime.u1 {
        @Override // androidx.compose.runtime.u1
        public void dispose() {
        }
    }

    @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,881:1\n1#2:882\n75#3:883\n1282#4,6:884\n1282#4,6:890\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3\n*L\n590#1:883\n592#1:884,6\n611#1:890,6\n*E\n"})
    static final class d implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map<Float, T> f24243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xh<T> f24244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ sd f24245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, T, zk> f24246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f24247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.q3 f24248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f24249g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24250h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f24251i;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.e.f44049r}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,881:1\n1#2:882\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ xh<T> f24253b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map<Float, T> f24254c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ sd f24255d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.unit.d f24256e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<T, T, zk> f24257f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f24258g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(xh<T> xhVar, Map<Float, ? extends T> map, sd sdVar, androidx.compose.ui.unit.d dVar, Function2<? super T, ? super T, ? extends zk> function2, float f10, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f24253b = xhVar;
                this.f24254c = map;
                this.f24255d = sdVar;
                this.f24256e = dVar;
                this.f24257f = function2;
                this.f24258g = f10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float m(Map map, Function2 function2, androidx.compose.ui.unit.d dVar, float f10, float f11) {
                return ((zk) function2.invoke(MapsKt.getValue(map, Float.valueOf(f10)), MapsKt.getValue(map, Float.valueOf(f11)))).a(dVar, f10, f11);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f24253b, this.f24254c, this.f24255d, this.f24256e, this.f24257f, this.f24258g, dVar);
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
                int i10 = this.f24252a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Map mapQ = this.f24253b.q();
                    this.f24253b.N(this.f24254c);
                    this.f24253b.S(this.f24255d);
                    xh<T> xhVar = this.f24253b;
                    final Map<Float, T> map = this.f24254c;
                    final Function2<T, T, zk> function2 = this.f24257f;
                    final androidx.compose.ui.unit.d dVar = this.f24256e;
                    xhVar.T(new Function2() { // from class: androidx.compose.material.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return Float.valueOf(ph.d.a.m(map, function2, dVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
                        }
                    });
                    this.f24253b.U(this.f24256e.S7(this.f24258g));
                    xh<T> xhVar2 = this.f24253b;
                    Object obj2 = this.f24254c;
                    this.f24252a = 1;
                    if (xhVar2.M(mapQ, obj2, this) == objL) {
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
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24259a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f24260b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ float f24261c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ xh<T> f24262d;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1$1", f = "Swipeable.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.e.A}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f24263a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ xh<T> f24264b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f24265c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(xh<T> xhVar, float f10, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f24264b = xhVar;
                    this.f24265c = f10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new a(this.f24264b, this.f24265c, dVar);
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
                    int i10 = this.f24263a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        xh<T> xhVar = this.f24264b;
                        float f10 = this.f24265c;
                        this.f24263a = 1;
                        if (xhVar.L(f10, this) == objL) {
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
                    return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(xh<T> xhVar, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.f24262d = xhVar;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
                return k(s0Var, f10.floatValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f24259a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                kotlinx.coroutines.k.f((kotlinx.coroutines.s0) this.f24260b, null, null, new a(this.f24262d, this.f24261c, null), 3, null);
                return Unit.f312394a;
            }

            public final Object k(kotlinx.coroutines.s0 s0Var, float f10, kotlin.coroutines.d<? super Unit> dVar) {
                b bVar = new b(this.f24262d, dVar);
                bVar.f24260b = s0Var;
                bVar.f24261c = f10;
                return bVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Map<Float, ? extends T> map, xh<T> xhVar, sd sdVar, Function2<? super T, ? super T, ? extends zk> function2, float f10, androidx.compose.foundation.gestures.q3 q3Var, boolean z10, androidx.compose.foundation.interaction.j jVar, boolean z11) {
            this.f24243a = map;
            this.f24244b = xhVar;
            this.f24245c = sdVar;
            this.f24246d = function2;
            this.f24247e = f10;
            this.f24248f = q3Var;
            this.f24249g = z10;
            this.f24250h = jVar;
            this.f24251i = z11;
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
        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(43594985);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(43594985, i10, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)");
            }
            if (this.f24243a.isEmpty()) {
                throw new IllegalArgumentException("You must have at least one anchor.");
            }
            if (CollectionsKt.distinct(this.f24243a.values()).size() != this.f24243a.size()) {
                throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
            }
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            this.f24244b.p(this.f24243a);
            Object obj = this.f24243a;
            Object obj2 = this.f24244b;
            boolean zD = c0Var.D(obj2) | c0Var.k0(this.f24243a) | c0Var.D(this.f24245c) | c0Var.D(this.f24246d) | c0Var.D(dVar) | c0Var.I(this.f24247e);
            xh<T> xhVar = this.f24244b;
            Map<Float, T> map = this.f24243a;
            sd sdVar = this.f24245c;
            Function2<T, T, zk> function2 = this.f24246d;
            float f10 = this.f24247e;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                Object aVar = new a(xhVar, map, sdVar, dVar, function2, f10, null);
                c0Var.Y(aVar);
                objI0 = aVar;
            }
            androidx.compose.runtime.b2.h(obj, obj2, (Function2) objI0, c0Var, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            boolean zI = this.f24244b.I();
            androidx.compose.foundation.gestures.a3 a3VarW = this.f24244b.w();
            androidx.compose.foundation.gestures.q3 q3Var = this.f24248f;
            boolean z10 = this.f24249g;
            androidx.compose.foundation.interaction.j jVar = this.f24250h;
            boolean zD2 = c0Var.D(this.f24244b);
            xh<T> xhVar2 = this.f24244b;
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new b(xhVar2, null);
                c0Var.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarI = androidx.compose.foundation.gestures.x2.i(aVar2, a3VarW, q3Var, z10, jVar, zI, null, (pj.n) objI1, this.f24251i, 32, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarI;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n1#1,110:1\n574#2,11:111\n*E\n"})
    public static final class e extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xh f24266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f24267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.q3 f24268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f24269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f24270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2 f24272g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ sd f24273h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f24274i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xh xhVar, Map map, androidx.compose.foundation.gestures.q3 q3Var, boolean z10, boolean z11, androidx.compose.foundation.interaction.j jVar, Function2 function2, sd sdVar, float f10) {
            super(1);
            this.f24266a = xhVar;
            this.f24267b = map;
            this.f24268c = q3Var;
            this.f24269d = z10;
            this.f24270e = z11;
            this.f24271f = jVar;
            this.f24272g = function2;
            this.f24273h = sdVar;
            this.f24274i = f10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("swipeable");
            t2Var.b().c("state", this.f24266a);
            t2Var.b().c("anchors", this.f24267b);
            t2Var.b().c(io.sentry.protocol.e.c.f306223k, this.f24268c);
            t2Var.b().c("enabled", Boolean.valueOf(this.f24269d));
            t2Var.b().c("reverseDirection", Boolean.valueOf(this.f24270e));
            t2Var.b().c("interactionSource", this.f24271f);
            t2Var.b().c("thresholds", this.f24272g);
            t2Var.b().c("resistance", this.f24273h);
            t2Var.b().c("velocityThreshold", androidx.compose.ui.unit.h.o(this.f24274i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f10, float f11, Set<Float> set, Function2<? super Float, ? super Float, Float> function2, float f12, float f13) {
        List<Float> listJ = j(f10, set);
        int size = listJ.size();
        if (size == 0) {
            return f11;
        }
        if (size == 1) {
            return listJ.get(0).floatValue();
        }
        float fFloatValue = listJ.get(0).floatValue();
        float fFloatValue2 = listJ.get(1).floatValue();
        return (f11 > f10 ? f12 > (-f13) && f10 > function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue)).floatValue() : f12 >= f13 || f10 >= function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue()) ? fFloatValue2 : fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> j(float f10, Set<Float> set) {
        Object obj;
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= ((double) f10) + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Object obj3 = null;
        int i10 = 1;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            float fFloatValue = ((Number) obj).floatValue();
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i11 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i11);
                    float fFloatValue2 = ((Number) obj4).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                        obj = obj4;
                        fFloatValue = fFloatValue2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            obj = null;
        }
        Float f11 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : set2) {
            if (((Number) obj5).floatValue() >= ((double) f10) - 0.001d) {
                arrayList2.add(obj5);
            }
        }
        if (!arrayList2.isEmpty()) {
            Object obj6 = arrayList2.get(0);
            float fFloatValue3 = ((Number) obj6).floatValue();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj7 = arrayList2.get(i10);
                    float fFloatValue4 = ((Number) obj7).floatValue();
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        obj6 = obj7;
                        fFloatValue3 = fFloatValue4;
                    }
                    if (i10 == lastIndex2) {
                        break;
                    }
                    i10++;
                }
            }
            obj3 = obj6;
        }
        Float f12 = (Float) obj3;
        if (f11 == null) {
            return CollectionsKt.listOfNotNull(f12);
        }
        if (f12 != null && !Intrinsics.areEqual(f11, f12)) {
            return CollectionsKt.listOf((Object[]) new Float[]{f11, f12});
        }
        return CollectionsKt.listOf(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float k(Map<Float, ? extends T> map, T t10) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), t10));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    @NotNull
    public static final <T> androidx.compose.ui.input.nestedscroll.a l(@NotNull xh<T> xhVar) {
        return new a(xhVar);
    }

    @u7
    public static /* synthetic */ void m(xh xhVar) {
    }

    @kotlin.l(message = f24230a)
    @NotNull
    @androidx.compose.runtime.o
    @u7
    public static final <T> xh<T> n(@NotNull final T t10, @Nullable final androidx.compose.animation.core.o<Float> oVar, @Nullable final Function1<? super T, Boolean> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = jh.f23346a.a();
        }
        if ((i11 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.kh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ph.o(obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1237755169, i10, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:466)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<xh<T>, T> c0VarC = xh.f25547q.c(oVar, function1);
        boolean z10 = true;
        boolean zK0 = ((((i10 & 14) ^ 6) > 4 && c0Var.k0(t10)) || (i10 & 6) == 4) | c0Var.k0(oVar);
        if ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 || !c0Var.D(function1)) && (i10 & androidx.media3.exoplayer.a5.S0) != 256) {
            z10 = false;
        }
        boolean z11 = zK0 | z10;
        Object objI1 = c0Var.i0();
        if (z11 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.material.lh
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ph.p(t10, oVar, function1);
                }
            };
            c0Var.Y(objI1);
        }
        xh<T> xhVar = (xh) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return xhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xh p(Object obj, androidx.compose.animation.core.o oVar, Function1 function1) {
        return new xh(obj, oVar, function1);
    }

    @kotlin.l(message = f24230a)
    @NotNull
    @androidx.compose.runtime.o
    @u7
    public static final <T> xh<T> q(@NotNull final T t10, @NotNull final Function1<? super T, Unit> function1, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            oVar = jh.f23346a.a();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1156387078, i10, -1, "androidx.compose.material.rememberSwipeableStateFor (Swipeable.kt:497)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = new xh(t10, oVar, new Function1() { // from class: androidx.compose.material.mh
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ph.s(obj));
                }
            });
            c0Var.Y(objI0);
        }
        final xh<T> xhVar = (xh) objI0;
        Object objI1 = c0Var.i0();
        if (objI1 == aVar.a()) {
            objI1 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
            c0Var.Y(objI1);
        }
        final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI1;
        Object value = n3Var.getValue();
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = (i12 > 4 && c0Var.k0(t10)) || (i10 & 6) == 4;
        Object objI2 = c0Var.i0();
        if (z10 || objI2 == aVar.a()) {
            objI2 = new b(t10, xhVar, null);
            c0Var.Y(objI2);
        }
        int i13 = i10 & 8;
        androidx.compose.runtime.b2.h(t10, value, (Function2) objI2, c0Var, i10 & 14);
        T t11 = xhVar.t();
        boolean z11 = ((i12 > 4 && c0Var.k0(t10)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(function1)) || (i10 & 48) == 32);
        Object objI3 = c0Var.i0();
        if (z11 || objI3 == aVar.a()) {
            objI3 = new Function1() { // from class: androidx.compose.material.nh
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ph.r(t10, xhVar, function1, n3Var, (androidx.compose.runtime.v1) obj);
                }
            };
            c0Var.Y(objI3);
        }
        androidx.compose.runtime.b2.d(t11, (Function1) objI3, c0Var, i13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return xhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 r(Object obj, xh xhVar, Function1 function1, androidx.compose.runtime.n3 n3Var, androidx.compose.runtime.v1 v1Var) {
        if (!Intrinsics.areEqual(obj, xhVar.t())) {
            function1.invoke(xhVar.t());
            n3Var.setValue(Boolean.valueOf(!((Boolean) n3Var.getValue()).booleanValue()));
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(Object obj) {
        return true;
    }

    @u7
    @kotlin.l(message = f24230a)
    @NotNull
    public static final <T> androidx.compose.ui.a0 t(@NotNull androidx.compose.ui.a0 a0Var, @NotNull xh<T> xhVar, @NotNull Map<Float, ? extends T> map, @NotNull androidx.compose.foundation.gestures.q3 q3Var, boolean z10, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull Function2<? super T, ? super T, ? extends zk> function2, @Nullable sd sdVar, float f10) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new e(xhVar, map, q3Var, z10, z11, jVar, function2, sdVar, f10) : androidx.compose.ui.platform.r2.b(), new d(map, xhVar, sdVar, function2, f10, q3Var, z10, jVar, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 v(Object obj, Object obj2) {
        return new t8(androidx.compose.ui.unit.h.r(56), null);
    }
}
