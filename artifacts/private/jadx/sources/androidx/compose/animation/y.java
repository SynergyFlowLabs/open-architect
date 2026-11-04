package androidx.compose.animation;

import androidx.collection.b3;
import androidx.collection.k2;
import androidx.compose.animation.core.l3;
import androidx.compose.animation.core.w3;
import androidx.compose.animation.core.z3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import java.util.Iterator;
import java.util.List;
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
@SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,139:1\n1282#2,6:140\n1282#2,3:146\n1285#2,3:150\n1282#2,6:153\n1282#2,6:159\n1#3:149\n360#4,7:165\n35#5,5:172\n35#5,5:214\n70#6:177\n67#6,9:178\n77#6:222\n80#7,6:187\n87#7,3:202\n90#7,2:211\n94#7:221\n391#8,9:193\n400#8:213\n401#8,2:219\n4360#9,6:205\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n101#1:140,6\n104#1:146,3\n104#1:150,3\n105#1:153,6\n110#1:159,6\n117#1:165,7\n124#1:172,5\n136#1:214,5\n135#1:177\n135#1:178,9\n135#1:222\n135#1:187,6\n135#1:202,3\n135#1:211,2\n135#1:221\n135#1:193,9\n135#1:213\n135#1:219,2\n135#1:205,6\n*E\n"})
public final class y {

    static final class a extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f13792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f13794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.n<T, androidx.compose.runtime.c0, Integer, Unit> f13796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13798g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(T t10, androidx.compose.ui.a0 a0Var, androidx.compose.animation.core.y0<Float> y0Var, String str, pj.n<? super T, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13792a = t10;
            this.f13793b = a0Var;
            this.f13794c = y0Var;
            this.f13795d = str;
            this.f13796e = nVar;
            this.f13797f = i10;
            this.f13798g = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            y.b(this.f13792a, this.f13793b, this.f13794c, this.f13795d, this.f13796e, c0Var, t4.a(this.f13797f | 1), this.f13798g);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f13799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f13801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<Object, androidx.compose.runtime.c0, Integer, Unit> f13802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13804f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Object obj, androidx.compose.ui.a0 a0Var, androidx.compose.animation.core.y0<Float> y0Var, pj.n<Object, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13799a = obj;
            this.f13800b = a0Var;
            this.f13801c = y0Var;
            this.f13802d = nVar;
            this.f13803e = i10;
            this.f13804f = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            y.c(this.f13799a, this.f13800b, this.f13801c, this.f13802d, c0Var, t4.a(this.f13803e | 1), this.f13804f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class c<T> extends kotlin.jvm.internal.l0 implements Function1<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f13805a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class d<T> extends kotlin.jvm.internal.l0 implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<T> f13806a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l3<T> l3Var) {
            super(1);
            this.f13806a = l3Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t10) {
            return Boolean.valueOf(!Intrinsics.areEqual(t10, this.f13806a.y()));
        }
    }

    @SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,139:1\n1952#2:140\n1950#2:141\n1839#2,7:142\n1846#2,2:162\n1841#2,19:164\n1282#3,3:149\n1285#3,3:159\n1282#3,6:183\n604#4,7:152\n70#5:189\n67#5,9:190\n77#5:229\n80#6,6:199\n87#6,3:214\n90#6,2:223\n94#6:228\n391#7,9:205\n400#7,3:225\n4360#8,6:217\n85#9:230\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n127#1:140\n127#1:141\n127#1:142,7\n127#1:162,2\n127#1:164,19\n127#1:149,3\n127#1:159,3\n130#1:183,6\n127#1:152,7\n130#1:189\n130#1:190,9\n130#1:229\n130#1:199,6\n130#1:214,3\n130#1:223,2\n130#1:228\n130#1:205,9\n130#1:225,3\n130#1:217,6\n127#1:230\n*E\n"})
    static final class e extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<T> f13807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f13808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f13809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<T, androidx.compose.runtime.c0, Integer, Unit> f13810d;

        static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.r1, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n7<Float> f13811a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n7<Float> n7Var) {
                super(1);
                this.f13811a = n7Var;
            }

            public final void c(androidx.compose.ui.graphics.r1 r1Var) {
                r1Var.setAlpha(e.f(this.f13811a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.r1 r1Var) {
                c(r1Var);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        static final class b<T> extends kotlin.jvm.internal.l0 implements pj.n<l3.b<T>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.y0<Float> f13812a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.animation.core.y0<Float> y0Var) {
                super(3);
                this.f13812a = y0Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final androidx.compose.animation.core.y0<Float> c(l3.b<T> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
                c0Var.E(955869654);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(955869654, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:126)");
                }
                androidx.compose.animation.core.y0<Float> y0Var = this.f13812a;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var.A();
                return y0Var;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
                return c((l3.b) obj, c0Var, num.intValue());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        public static final class c<T> implements Function0<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l3 f13813a;

            public c(l3 l3Var) {
                this.f13813a = l3Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) this.f13813a.y();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        public static final class d<T> implements Function0<l3.b<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l3 f13814a;

            public d(l3 l3Var) {
                this.f13814a = l3Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final l3.b<T> invoke() {
                return this.f13814a.w();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(l3<T> l3Var, androidx.compose.animation.core.y0<Float> y0Var, T t10, pj.n<? super T, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            super(2);
            this.f13807a = l3Var;
            this.f13808b = y0Var;
            this.f13809c = t10;
            this.f13810d = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float f(n7<Float> n7Var) {
            return n7Var.getValue().floatValue();
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
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            Object objP;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-934471669, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
            }
            l3<T> l3Var = this.f13807a;
            b bVar = new b(this.f13808b);
            T t10 = this.f13809c;
            z3<Float, androidx.compose.animation.core.s> z3VarP = androidx.compose.animation.core.t4.P(kotlin.jvm.internal.z.f312833a);
            if (l3Var.E()) {
                c0Var.E(1666853325);
                c0Var.A();
                objP = l3Var.p();
            } else {
                c0Var.E(1666599280);
                boolean zD = c0Var.D(l3Var);
                objP = c0Var.i0();
                if (zD || objP == androidx.compose.runtime.c0.f35327a.a()) {
                    androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                    androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                    Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                    androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                    try {
                        Object objP2 = l3Var.p();
                        aVar.x(mVarG, mVarM, function1L);
                        c0Var.Y(objP2);
                        objP = objP2;
                    } catch (Throwable th2) {
                        aVar.x(mVarG, mVarM, function1L);
                        throw th2;
                    }
                }
                c0Var.A();
            }
            c0Var.E(1378811975);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            float f10 = Intrinsics.areEqual(objP, t10) ? 1.0f : 0.0f;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            Float fValueOf = Float.valueOf(f10);
            boolean zD2 = c0Var.D(l3Var);
            Object objI0 = c0Var.i0();
            if (zD2 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = w6.e(new c(l3Var));
                c0Var.Y(objI0);
            }
            Object value = ((n7) objI0).getValue();
            c0Var.E(1378811975);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            float f11 = Intrinsics.areEqual(value, t10) ? 1.0f : 0.0f;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            Float fValueOf2 = Float.valueOf(f11);
            boolean zD3 = c0Var.D(l3Var);
            Object objI1 = c0Var.i0();
            if (zD3 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = w6.e(new d(l3Var));
                c0Var.Y(objI1);
            }
            n7 n7VarD = w3.D(l3Var, fValueOf, fValueOf2, bVar.invoke(((n7) objI1).getValue(), c0Var, 0), z3VarP, "FloatAnimation", c0Var, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            boolean zD4 = c0Var.D(n7VarD);
            Object objI2 = c0Var.i0();
            if (zD4 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new a(n7VarD);
                c0Var.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.graphics.q1.a(aVar2, (Function1) objI2);
            pj.n<T, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f13810d;
            T t11 = this.f13809c;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            nVar.invoke(t11, c0Var, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<T> f13815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f13817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<T, Object> f13818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.n<T, androidx.compose.runtime.c0, Integer, Unit> f13819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13821g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(l3<T> l3Var, androidx.compose.ui.a0 a0Var, androidx.compose.animation.core.y0<Float> y0Var, Function1<? super T, ? extends Object> function1, pj.n<? super T, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13815a = l3Var;
            this.f13816b = a0Var;
            this.f13817c = y0Var;
            this.f13818d = function1;
            this.f13819e = nVar;
            this.f13820f = i10;
            this.f13821g = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            y.a(this.f13815a, this.f13816b, this.f13817c, this.f13818d, this.f13819e, c0Var, t4.a(this.f13820f | 1), this.f13821g);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0188  */
    /* JADX WARN: Code duplicated, block: B:105:0x019a  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b1 A[LOOP:0: B:103:0x0194->B:108:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d1 A[LOOP:1: B:114:0x01cf->B:115:0x01d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:120:0x021e  */
    /* JADX WARN: Code duplicated, block: B:123:0x022a  */
    /* JADX WARN: Code duplicated, block: B:124:0x022e  */
    /* JADX WARN: Code duplicated, block: B:127:0x024d  */
    /* JADX WARN: Code duplicated, block: B:129:0x025b  */
    /* JADX WARN: Code duplicated, block: B:132:0x027f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0295  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x01b5 A[EDGE_INSN: B:147:0x01b5->B:110:0x01b5 BREAK  A[LOOP:0: B:103:0x0194->B:108:0x01b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e  */
    /* JADX WARN: Code duplicated, block: B:84:0x012a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0143  */
    /* JADX WARN: Code duplicated, block: B:90:0x014e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0151  */
    /* JADX WARN: Code duplicated, block: B:94:0x0158  */
    /* JADX WARN: Code duplicated, block: B:96:0x015e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0175  */
    @h0
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <T> void a(@NotNull l3<T> l3Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable Function1<? super T, ? extends Object> function1, @NotNull pj.n<? super T, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        androidx.compose.animation.core.y0<Float> y0VarT;
        int i14;
        int i15;
        Function1<? super T, ? extends Object> function2;
        int i16;
        int i17;
        boolean z10;
        androidx.compose.animation.core.y0<Float> y0Var2;
        Function1<? super T, ? extends Object> function3;
        s5 s5VarT;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        Object obj;
        SnapshotStateList snapshotStateList;
        Object objI1;
        k2 k2Var;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int size;
        int i18;
        Function2 function4;
        Iterator<T> it;
        int i19;
        int size2;
        int i20;
        boolean z11;
        Object objI2;
        Object objI3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1877370462);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(l3Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 1;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 2;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    y0VarT = y0Var;
                    if (c0VarR.k0(y0VarT)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 4;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        function2 = function1;
                        if (c0VarR.k0(function2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 8) != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                        }
                        if (i15 != 0) {
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = c.f13805a;
                                c0VarR.Y(objI3);
                            }
                            function2 = (Function1) objI3;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1877370462, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        obj = objI0;
                        if (objI0 == aVar.a()) {
                            SnapshotStateList snapshotStateListG = w6.g();
                            snapshotStateListG.add(l3Var.p());
                            c0VarR.Y(snapshotStateListG);
                            obj = snapshotStateListG;
                        }
                        snapshotStateList = (SnapshotStateList) obj;
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = b3.u();
                            c0VarR.Y(objI1);
                        }
                        k2Var = (k2) objI1;
                        if (Intrinsics.areEqual(l3Var.p(), l3Var.y())) {
                            c0VarR.E(321189832);
                            if (snapshotStateList.size() == 1 || !Intrinsics.areEqual(snapshotStateList.get(0), l3Var.y())) {
                                c0VarR.E(321324186);
                                if ((i12 & 14) == 4) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objI2 = c0VarR.i0();
                                if (z11 || objI2 == aVar.a()) {
                                    objI2 = new d(l3Var);
                                    c0VarR.Y(objI2);
                                }
                                CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                                k2Var.K();
                                c0VarR.A();
                            } else {
                                c0VarR.E(321514464);
                                c0VarR.A();
                            }
                            c0VarR.A();
                        } else {
                            c0VarR.E(321520416);
                            c0VarR.A();
                        }
                        if (k2Var.f(l3Var.y())) {
                            c0VarR.E(322323936);
                            c0VarR.A();
                        } else {
                            c0VarR.E(321581083);
                            it = snapshotStateList.iterator();
                            i19 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i19 = -1;
                                    break;
                                } else if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(l3Var.y()))) {
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            if (i19 == -1) {
                                snapshotStateList.add(l3Var.y());
                            } else {
                                snapshotStateList.set(i19, l3Var.y());
                            }
                            k2Var.K();
                            size2 = snapshotStateList.size();
                            for (i20 = 0; i20 < size2; i20++) {
                                T t10 = snapshotStateList.get(i20);
                                k2Var.q0(t10, androidx.compose.runtime.internal.w.e(-934471669, true, new e(l3Var, y0VarT, t10, nVar), c0VarR, 54));
                            }
                            c0VarR.A();
                        }
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
                        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                        function0A = aVar2.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK, aVar2.e());
                        y7.n(c0VarD, b1VarK, aVar2.g());
                        function2B = aVar2.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar2.f());
                        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        c0VarR.E(-1312707512);
                        size = snapshotStateList.size();
                        for (i18 = 0; i18 < size; i18++) {
                            T t11 = snapshotStateList.get(i18);
                            c0VarR.m0(1171574969, function2.invoke(t11));
                            function4 = (Function2) k2Var.p(t11);
                            if (function4 == null) {
                                c0VarR.E(1959122128);
                                c0VarR.A();
                            } else {
                                c0VarR.E(1171576145);
                                function4.invoke(c0VarR, 0);
                                c0VarR.A();
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    y0Var2 = y0VarT;
                    function3 = function2;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new f(l3Var, a0Var2, y0Var2, function3, nVar, i10, i11));
                    }
                }
                i12 |= 3072;
                function2 = function1;
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                    }
                    if (i15 != 0) {
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = c.f13805a;
                            c0VarR.Y(objI3);
                        }
                        function2 = (Function1) objI3;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1877370462, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    obj = objI0;
                    if (objI0 == aVar.a()) {
                        SnapshotStateList snapshotStateListG2 = w6.g();
                        snapshotStateListG2.add(l3Var.p());
                        c0VarR.Y(snapshotStateListG2);
                        obj = snapshotStateListG2;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b3.u();
                        c0VarR.Y(objI1);
                    }
                    k2Var = (k2) objI1;
                    if (Intrinsics.areEqual(l3Var.p(), l3Var.y())) {
                        c0VarR.E(321189832);
                        if (snapshotStateList.size() == 1) {
                            c0VarR.E(321324186);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z11) {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            }
                            CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                            k2Var.K();
                            c0VarR.A();
                        } else {
                            c0VarR.E(321324186);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z11) {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            }
                            CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                            k2Var.K();
                            c0VarR.A();
                        }
                        c0VarR.A();
                    } else {
                        c0VarR.E(321520416);
                        c0VarR.A();
                    }
                    if (k2Var.f(l3Var.y())) {
                        c0VarR.E(321581083);
                        it = snapshotStateList.iterator();
                        i19 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i19 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(l3Var.y()))) {
                                    break;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i19 == -1) {
                            snapshotStateList.add(l3Var.y());
                        } else {
                            snapshotStateList.set(i19, l3Var.y());
                        }
                        k2Var.K();
                        size2 = snapshotStateList.size();
                        while (i20 < size2) {
                            T t12 = snapshotStateList.get(i20);
                            k2Var.q0(t12, androidx.compose.runtime.internal.w.e(-934471669, true, new e(l3Var, y0VarT, t12, nVar), c0VarR, 54));
                        }
                        c0VarR.A();
                    } else {
                        c0VarR.E(322323936);
                        c0VarR.A();
                    }
                    androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    function0A = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK2, aVar3.e());
                    y7.n(c0VarD, b1VarK2, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN2, aVar3.f());
                    androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                    c0VarR.E(-1312707512);
                    size = snapshotStateList.size();
                    while (i18 < size) {
                        T t13 = snapshotStateList.get(i18);
                        c0VarR.m0(1171574969, function2.invoke(t13));
                        function4 = (Function2) k2Var.p(t13);
                        if (function4 == null) {
                            c0VarR.E(1959122128);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1171576145);
                            function4.invoke(c0VarR, 0);
                            c0VarR.A();
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                y0Var2 = y0VarT;
                function3 = function2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new f(l3Var, a0Var2, y0Var2, function3, nVar, i10, i11));
                }
            }
            i12 |= a5.S0;
            y0VarT = y0Var;
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function2 = function1;
                    if (c0VarR.k0(function2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                    }
                    if (i15 != 0) {
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = c.f13805a;
                            c0VarR.Y(objI3);
                        }
                        function2 = (Function1) objI3;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1877370462, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    obj = objI0;
                    if (objI0 == aVar.a()) {
                        SnapshotStateList snapshotStateListG3 = w6.g();
                        snapshotStateListG3.add(l3Var.p());
                        c0VarR.Y(snapshotStateListG3);
                        obj = snapshotStateListG3;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b3.u();
                        c0VarR.Y(objI1);
                    }
                    k2Var = (k2) objI1;
                    if (Intrinsics.areEqual(l3Var.p(), l3Var.y())) {
                        c0VarR.E(321189832);
                        if (snapshotStateList.size() == 1) {
                            c0VarR.E(321324186);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z11) {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            }
                            CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                            k2Var.K();
                            c0VarR.A();
                        } else {
                            c0VarR.E(321324186);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z11) {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            }
                            CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                            k2Var.K();
                            c0VarR.A();
                        }
                        c0VarR.A();
                    } else {
                        c0VarR.E(321520416);
                        c0VarR.A();
                    }
                    if (k2Var.f(l3Var.y())) {
                        c0VarR.E(321581083);
                        it = snapshotStateList.iterator();
                        i19 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i19 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(l3Var.y()))) {
                                    break;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i19 == -1) {
                            snapshotStateList.add(l3Var.y());
                        } else {
                            snapshotStateList.set(i19, l3Var.y());
                        }
                        k2Var.K();
                        size2 = snapshotStateList.size();
                        while (i20 < size2) {
                            T t14 = snapshotStateList.get(i20);
                            k2Var.q0(t14, androidx.compose.runtime.internal.w.e(-934471669, true, new e(l3Var, y0VarT, t14, nVar), c0VarR, 54));
                        }
                        c0VarR.A();
                    } else {
                        c0VarR.E(322323936);
                        c0VarR.A();
                    }
                    androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    function0A = aVar4.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK3, aVar4.e());
                    y7.n(c0VarD, b1VarK3, aVar4.g());
                    function2B = aVar4.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN3, aVar4.f());
                    androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                    c0VarR.E(-1312707512);
                    size = snapshotStateList.size();
                    while (i18 < size) {
                        T t15 = snapshotStateList.get(i18);
                        c0VarR.m0(1171574969, function2.invoke(t15));
                        function4 = (Function2) k2Var.p(t15);
                        if (function4 == null) {
                            c0VarR.E(1959122128);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1171576145);
                            function4.invoke(c0VarR, 0);
                            c0VarR.A();
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                y0Var2 = y0VarT;
                function3 = function2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new f(l3Var, a0Var2, y0Var2, function3, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            function2 = function1;
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(nVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                }
                if (i15 != 0) {
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = c.f13805a;
                        c0VarR.Y(objI3);
                    }
                    function2 = (Function1) objI3;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1877370462, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                obj = objI0;
                if (objI0 == aVar.a()) {
                    SnapshotStateList snapshotStateListG4 = w6.g();
                    snapshotStateListG4.add(l3Var.p());
                    c0VarR.Y(snapshotStateListG4);
                    obj = snapshotStateListG4;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b3.u();
                    c0VarR.Y(objI1);
                }
                k2Var = (k2) objI1;
                if (Intrinsics.areEqual(l3Var.p(), l3Var.y())) {
                    c0VarR.E(321189832);
                    if (snapshotStateList.size() == 1) {
                        c0VarR.E(321324186);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z11) {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        }
                        CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                        k2Var.K();
                        c0VarR.A();
                    } else {
                        c0VarR.E(321324186);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z11) {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        }
                        CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                        k2Var.K();
                        c0VarR.A();
                    }
                    c0VarR.A();
                } else {
                    c0VarR.E(321520416);
                    c0VarR.A();
                }
                if (k2Var.f(l3Var.y())) {
                    c0VarR.E(321581083);
                    it = snapshotStateList.iterator();
                    i19 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(l3Var.y()))) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == -1) {
                        snapshotStateList.add(l3Var.y());
                    } else {
                        snapshotStateList.set(i19, l3Var.y());
                    }
                    k2Var.K();
                    size2 = snapshotStateList.size();
                    while (i20 < size2) {
                        T t16 = snapshotStateList.get(i20);
                        k2Var.q0(t16, androidx.compose.runtime.internal.w.e(-934471669, true, new e(l3Var, y0VarT, t16, nVar), c0VarR, 54));
                    }
                    c0VarR.A();
                } else {
                    c0VarR.E(322323936);
                    c0VarR.A();
                }
                androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                function0A = aVar5.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK4, aVar5.e());
                y7.n(c0VarD, b1VarK4, aVar5.g());
                function2B = aVar5.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN4, aVar5.f());
                androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                c0VarR.E(-1312707512);
                size = snapshotStateList.size();
                while (i18 < size) {
                    T t17 = snapshotStateList.get(i18);
                    c0VarR.m0(1171574969, function2.invoke(t17));
                    function4 = (Function2) k2Var.p(t17);
                    if (function4 == null) {
                        c0VarR.E(1959122128);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1171576145);
                        function4.invoke(c0VarR, 0);
                        c0VarR.A();
                    }
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
            }
            y0Var2 = y0VarT;
            function3 = function2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new f(l3Var, a0Var2, y0Var2, function3, nVar, i10, i11));
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 2;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                y0VarT = y0Var;
                if (c0VarR.k0(y0VarT)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function2 = function1;
                    if (c0VarR.k0(function2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                    }
                    if (i15 != 0) {
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = c.f13805a;
                            c0VarR.Y(objI3);
                        }
                        function2 = (Function1) objI3;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1877370462, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    obj = objI0;
                    if (objI0 == aVar.a()) {
                        SnapshotStateList snapshotStateListG5 = w6.g();
                        snapshotStateListG5.add(l3Var.p());
                        c0VarR.Y(snapshotStateListG5);
                        obj = snapshotStateListG5;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b3.u();
                        c0VarR.Y(objI1);
                    }
                    k2Var = (k2) objI1;
                    if (Intrinsics.areEqual(l3Var.p(), l3Var.y())) {
                        c0VarR.E(321189832);
                        if (snapshotStateList.size() == 1) {
                            c0VarR.E(321324186);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z11) {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            }
                            CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                            k2Var.K();
                            c0VarR.A();
                        } else {
                            c0VarR.E(321324186);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z11) {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new d(l3Var);
                                c0VarR.Y(objI2);
                            }
                            CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                            k2Var.K();
                            c0VarR.A();
                        }
                        c0VarR.A();
                    } else {
                        c0VarR.E(321520416);
                        c0VarR.A();
                    }
                    if (k2Var.f(l3Var.y())) {
                        c0VarR.E(321581083);
                        it = snapshotStateList.iterator();
                        i19 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i19 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(l3Var.y()))) {
                                    break;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i19 == -1) {
                            snapshotStateList.add(l3Var.y());
                        } else {
                            snapshotStateList.set(i19, l3Var.y());
                        }
                        k2Var.K();
                        size2 = snapshotStateList.size();
                        while (i20 < size2) {
                            T t18 = snapshotStateList.get(i20);
                            k2Var.q0(t18, androidx.compose.runtime.internal.w.e(-934471669, true, new e(l3Var, y0VarT, t18, nVar), c0VarR, 54));
                        }
                        c0VarR.A();
                    } else {
                        c0VarR.E(322323936);
                        c0VarR.A();
                    }
                    androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                    androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                    function0A = aVar6.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK5, aVar6.e());
                    y7.n(c0VarD, b1VarK5, aVar6.g());
                    function2B = aVar6.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN5, aVar6.f());
                    androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                    c0VarR.E(-1312707512);
                    size = snapshotStateList.size();
                    while (i18 < size) {
                        T t19 = snapshotStateList.get(i18);
                        c0VarR.m0(1171574969, function2.invoke(t19));
                        function4 = (Function2) k2Var.p(t19);
                        if (function4 == null) {
                            c0VarR.E(1959122128);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1171576145);
                            function4.invoke(c0VarR, 0);
                            c0VarR.A();
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                y0Var2 = y0VarT;
                function3 = function2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new f(l3Var, a0Var2, y0Var2, function3, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            function2 = function1;
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(nVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                }
                if (i15 != 0) {
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = c.f13805a;
                        c0VarR.Y(objI3);
                    }
                    function2 = (Function1) objI3;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1877370462, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                obj = objI0;
                if (objI0 == aVar.a()) {
                    SnapshotStateList snapshotStateListG6 = w6.g();
                    snapshotStateListG6.add(l3Var.p());
                    c0VarR.Y(snapshotStateListG6);
                    obj = snapshotStateListG6;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b3.u();
                    c0VarR.Y(objI1);
                }
                k2Var = (k2) objI1;
                if (Intrinsics.areEqual(l3Var.p(), l3Var.y())) {
                    c0VarR.E(321189832);
                    if (snapshotStateList.size() == 1) {
                        c0VarR.E(321324186);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z11) {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        }
                        CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                        k2Var.K();
                        c0VarR.A();
                    } else {
                        c0VarR.E(321324186);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z11) {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        }
                        CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                        k2Var.K();
                        c0VarR.A();
                    }
                    c0VarR.A();
                } else {
                    c0VarR.E(321520416);
                    c0VarR.A();
                }
                if (k2Var.f(l3Var.y())) {
                    c0VarR.E(321581083);
                    it = snapshotStateList.iterator();
                    i19 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(l3Var.y()))) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == -1) {
                        snapshotStateList.add(l3Var.y());
                    } else {
                        snapshotStateList.set(i19, l3Var.y());
                    }
                    k2Var.K();
                    size2 = snapshotStateList.size();
                    while (i20 < size2) {
                        T t110 = snapshotStateList.get(i20);
                        k2Var.q0(t110, androidx.compose.runtime.internal.w.e(-934471669, true, new e(l3Var, y0VarT, t110, nVar), c0VarR, 54));
                    }
                    c0VarR.A();
                } else {
                    c0VarR.E(322323936);
                    c0VarR.A();
                }
                androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                function0A = aVar7.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK6, aVar7.e());
                y7.n(c0VarD, b1VarK6, aVar7.g());
                function2B = aVar7.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN6, aVar7.f());
                androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                c0VarR.E(-1312707512);
                size = snapshotStateList.size();
                while (i18 < size) {
                    T t111 = snapshotStateList.get(i18);
                    c0VarR.m0(1171574969, function2.invoke(t111));
                    function4 = (Function2) k2Var.p(t111);
                    if (function4 == null) {
                        c0VarR.E(1959122128);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1171576145);
                        function4.invoke(c0VarR, 0);
                        c0VarR.A();
                    }
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
            }
            y0Var2 = y0VarT;
            function3 = function2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new f(l3Var, a0Var2, y0Var2, function3, nVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        y0VarT = y0Var;
        i15 = i11 & 4;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                function2 = function1;
                if (c0VarR.k0(function2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(nVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                }
                if (i15 != 0) {
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = c.f13805a;
                        c0VarR.Y(objI3);
                    }
                    function2 = (Function1) objI3;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1877370462, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                obj = objI0;
                if (objI0 == aVar.a()) {
                    SnapshotStateList snapshotStateListG7 = w6.g();
                    snapshotStateListG7.add(l3Var.p());
                    c0VarR.Y(snapshotStateListG7);
                    obj = snapshotStateListG7;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b3.u();
                    c0VarR.Y(objI1);
                }
                k2Var = (k2) objI1;
                if (Intrinsics.areEqual(l3Var.p(), l3Var.y())) {
                    c0VarR.E(321189832);
                    if (snapshotStateList.size() == 1) {
                        c0VarR.E(321324186);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z11) {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        }
                        CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                        k2Var.K();
                        c0VarR.A();
                    } else {
                        c0VarR.E(321324186);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z11) {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new d(l3Var);
                            c0VarR.Y(objI2);
                        }
                        CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                        k2Var.K();
                        c0VarR.A();
                    }
                    c0VarR.A();
                } else {
                    c0VarR.E(321520416);
                    c0VarR.A();
                }
                if (k2Var.f(l3Var.y())) {
                    c0VarR.E(321581083);
                    it = snapshotStateList.iterator();
                    i19 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(l3Var.y()))) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == -1) {
                        snapshotStateList.add(l3Var.y());
                    } else {
                        snapshotStateList.set(i19, l3Var.y());
                    }
                    k2Var.K();
                    size2 = snapshotStateList.size();
                    while (i20 < size2) {
                        T t112 = snapshotStateList.get(i20);
                        k2Var.q0(t112, androidx.compose.runtime.internal.w.e(-934471669, true, new e(l3Var, y0VarT, t112, nVar), c0VarR, 54));
                    }
                    c0VarR.A();
                } else {
                    c0VarR.E(322323936);
                    c0VarR.A();
                }
                androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                function0A = aVar8.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK7, aVar8.e());
                y7.n(c0VarD, b1VarK7, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN7, aVar8.f());
                androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                c0VarR.E(-1312707512);
                size = snapshotStateList.size();
                while (i18 < size) {
                    T t113 = snapshotStateList.get(i18);
                    c0VarR.m0(1171574969, function2.invoke(t113));
                    function4 = (Function2) k2Var.p(t113);
                    if (function4 == null) {
                        c0VarR.E(1959122128);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1171576145);
                        function4.invoke(c0VarR, 0);
                        c0VarR.A();
                    }
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
            }
            y0Var2 = y0VarT;
            function3 = function2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new f(l3Var, a0Var2, y0Var2, function3, nVar, i10, i11));
            }
        }
        i12 |= 3072;
        function2 = function1;
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.k0(nVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i21 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i13 != 0) {
                y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
            }
            if (i15 != 0) {
                objI3 = c0VarR.i0();
                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI3 = c.f13805a;
                    c0VarR.Y(objI3);
                }
                function2 = (Function1) objI3;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1877370462, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            obj = objI0;
            if (objI0 == aVar.a()) {
                SnapshotStateList snapshotStateListG8 = w6.g();
                snapshotStateListG8.add(l3Var.p());
                c0VarR.Y(snapshotStateListG8);
                obj = snapshotStateListG8;
            }
            snapshotStateList = (SnapshotStateList) obj;
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = b3.u();
                c0VarR.Y(objI1);
            }
            k2Var = (k2) objI1;
            if (Intrinsics.areEqual(l3Var.p(), l3Var.y())) {
                c0VarR.E(321189832);
                if (snapshotStateList.size() == 1) {
                    c0VarR.E(321324186);
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z11) {
                        objI2 = new d(l3Var);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new d(l3Var);
                        c0VarR.Y(objI2);
                    }
                    CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                    k2Var.K();
                    c0VarR.A();
                } else {
                    c0VarR.E(321324186);
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z11) {
                        objI2 = new d(l3Var);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new d(l3Var);
                        c0VarR.Y(objI2);
                    }
                    CollectionsKt.removeAll((List) snapshotStateList, (Function1) objI2);
                    k2Var.K();
                    c0VarR.A();
                }
                c0VarR.A();
            } else {
                c0VarR.E(321520416);
                c0VarR.A();
            }
            if (k2Var.f(l3Var.y())) {
                c0VarR.E(321581083);
                it = snapshotStateList.iterator();
                i19 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i19 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(l3Var.y()))) {
                            break;
                            break;
                        }
                        i19++;
                    }
                }
                if (i19 == -1) {
                    snapshotStateList.add(l3Var.y());
                } else {
                    snapshotStateList.set(i19, l3Var.y());
                }
                k2Var.K();
                size2 = snapshotStateList.size();
                while (i20 < size2) {
                    T t114 = snapshotStateList.get(i20);
                    k2Var.q0(t114, androidx.compose.runtime.internal.w.e(-934471669, true, new e(l3Var, y0VarT, t114, nVar), c0VarR, 54));
                }
                c0VarR.A();
            } else {
                c0VarR.E(322323936);
                c0VarR.A();
            }
            androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0Var2);
            androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
            function0A = aVar9.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK8, aVar9.e());
            y7.n(c0VarD, b1VarK8, aVar9.g());
            function2B = aVar9.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN8, aVar9.f());
            androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
            c0VarR.E(-1312707512);
            size = snapshotStateList.size();
            while (i18 < size) {
                T t115 = snapshotStateList.get(i18);
                c0VarR.m0(1171574969, function2.invoke(t115));
                function4 = (Function2) k2Var.p(t115);
                if (function4 == null) {
                    c0VarR.E(1959122128);
                    c0VarR.A();
                } else {
                    c0VarR.E(1171576145);
                    function4.invoke(c0VarR, 0);
                    c0VarR.A();
                }
                c0VarR.v0();
            }
            c0VarR.A();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        y0Var2 = y0VarT;
        function3 = function2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new f(l3Var, a0Var2, y0Var2, function3, nVar, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:84:0x010f  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    public static final <T> void b(T t10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable String str, @NotNull pj.n<? super T, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        androidx.compose.animation.core.y0<Float> y0Var2;
        int i14;
        int i15;
        int i16;
        pj.n<? super T, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i17;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.animation.core.y0<Float> y0Var3;
        String str2;
        s5 s5VarT;
        int i18;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.animation.core.y0<Float> y0VarT;
        String str3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-513216493);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(t10) : c0VarR.k0(t10) ? 4 : 2) | i10;
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
                    y0Var2 = y0Var;
                    if (c0VarR.k0(y0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c0VarR.D(str)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & 24576) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i17 = 16384;
                            } else {
                                i17 = 8192;
                            }
                            i12 |= i17;
                        }
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i18 = i15;
                        } else {
                            i18 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                        } else {
                            y0VarT = y0Var2;
                        }
                        if (i18 != 0) {
                            str3 = "Crossfade";
                        } else {
                            str3 = str;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-513216493, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        a(w3.J(t10, str3, c0VarR, (i12 & 14) | ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B), 0), a0Var4, y0VarT, null, nVar2, c0VarR, i12 & 58352, 4);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var3 = a0Var4;
                        y0Var3 = y0VarT;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        y0Var3 = y0Var2;
                        str2 = str;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new a(t10, a0Var3, y0Var3, str2, nVar, i10, i11));
                    }
                }
                i12 |= 3072;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i18 = i15;
                    } else {
                        i18 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                    } else {
                        y0VarT = y0Var2;
                    }
                    if (i18 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-513216493, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    a(w3.J(t10, str3, c0VarR, (i12 & 14) | ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B), 0), a0Var4, y0VarT, null, nVar2, c0VarR, i12 & 58352, 4);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    y0Var3 = y0VarT;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    y0Var3 = y0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new a(t10, a0Var3, y0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= a5.S0;
            y0Var2 = y0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(str)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i18 = i15;
                    } else {
                        i18 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                    } else {
                        y0VarT = y0Var2;
                    }
                    if (i18 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-513216493, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    a(w3.J(t10, str3, c0VarR, (i12 & 14) | ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B), 0), a0Var4, y0VarT, null, nVar2, c0VarR, i12 & 58352, 4);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    y0Var3 = y0VarT;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    y0Var3 = y0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new a(t10, a0Var3, y0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i18 = i15;
                } else {
                    i18 = i15;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                } else {
                    y0VarT = y0Var2;
                }
                if (i18 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-513216493, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                a(w3.J(t10, str3, c0VarR, (i12 & 14) | ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B), 0), a0Var4, y0VarT, null, nVar2, c0VarR, i12 & 58352, 4);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                y0Var3 = y0VarT;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                y0Var3 = y0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new a(t10, a0Var3, y0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                y0Var2 = y0Var;
                if (c0VarR.k0(y0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(str)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i18 = i15;
                    } else {
                        i18 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                    } else {
                        y0VarT = y0Var2;
                    }
                    if (i18 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-513216493, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    a(w3.J(t10, str3, c0VarR, (i12 & 14) | ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B), 0), a0Var4, y0VarT, null, nVar2, c0VarR, i12 & 58352, 4);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var3 = a0Var4;
                    y0Var3 = y0VarT;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    y0Var3 = y0Var2;
                    str2 = str;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new a(t10, a0Var3, y0Var3, str2, nVar, i10, i11));
                }
            }
            i12 |= 3072;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i18 = i15;
                } else {
                    i18 = i15;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                } else {
                    y0VarT = y0Var2;
                }
                if (i18 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-513216493, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                a(w3.J(t10, str3, c0VarR, (i12 & 14) | ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B), 0), a0Var4, y0VarT, null, nVar2, c0VarR, i12 & 58352, 4);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                y0Var3 = y0VarT;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                y0Var3 = y0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new a(t10, a0Var3, y0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        y0Var2 = y0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.D(str)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i18 = i15;
                } else {
                    i18 = i15;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
                } else {
                    y0VarT = y0Var2;
                }
                if (i18 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-513216493, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                a(w3.J(t10, str3, c0VarR, (i12 & 14) | ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B), 0), a0Var4, y0VarT, null, nVar2, c0VarR, i12 & 58352, 4);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var3 = a0Var4;
                y0Var3 = y0VarT;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                y0Var3 = y0Var2;
                str2 = str;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new a(t10, a0Var3, y0Var3, str2, nVar, i10, i11));
            }
        }
        i12 |= 3072;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & 24576) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
        }
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i19 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
                i18 = i15;
            } else {
                i18 = i15;
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                y0VarT = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
            } else {
                y0VarT = y0Var2;
            }
            if (i18 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-513216493, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            a(w3.J(t10, str3, c0VarR, (i12 & 14) | ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B), 0), a0Var4, y0VarT, null, nVar2, c0VarR, i12 & 58352, 4);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str2 = str3;
            a0Var3 = a0Var4;
            y0Var3 = y0VarT;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            y0Var3 = y0Var2;
            str2 = str;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new a(t10, a0Var3, y0Var3, str2, nVar, i10, i11));
        }
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    public static final /* synthetic */ void c(Object obj, androidx.compose.ui.a0 a0Var, androidx.compose.animation.core.y0 y0Var, pj.n nVar, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        pj.n nVar2;
        androidx.compose.animation.core.y0 y0Var2;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-160948176);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(obj) : c0VarR.k0(obj) ? 4 : 2) | i10;
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
            i12 |= c0VarR.k0(y0Var) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(nVar) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0Var3 = a0Var;
            if (i14 != 0) {
                y0Var = androidx.compose.animation.core.p.t(0, 0, null, 7, null);
            }
            androidx.compose.animation.core.y0 y0Var3 = y0Var;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-160948176, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:68)");
            }
            a(w3.J(obj, null, c0VarR, i12 & 14, 2), a0Var3, y0Var3, null, nVar, c0VarR, (i12 & 1008) | ((i12 << 3) & 57344), 4);
            nVar2 = nVar;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            y0Var2 = y0Var3;
        } else {
            nVar2 = nVar;
            c0VarR.u();
            y0Var2 = y0Var;
            a0Var2 = a0Var;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(obj, a0Var2, y0Var2, nVar2, i10, i11));
        }
    }
}
