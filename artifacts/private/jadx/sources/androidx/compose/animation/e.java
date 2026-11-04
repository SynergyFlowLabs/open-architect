package androidx.compose.animation;

import androidx.collection.b3;
import androidx.collection.k2;
import androidx.compose.animation.core.j5;
import androidx.compose.animation.core.l3;
import androidx.compose.animation.core.q2;
import androidx.compose.animation.core.w3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.i2;
import androidx.media3.exoplayer.a5;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,959:1\n1282#2,6:960\n1282#2,6:966\n1282#2,6:972\n1282#2,6:978\n1282#2,6:985\n1282#2,6:991\n1282#2,6:997\n1282#2,6:1015\n1282#2,6:1021\n75#3:984\n360#4,7:1003\n35#5,5:1010\n35#5,5:1054\n80#6,6:1027\n87#6,3:1042\n90#6,2:1051\n94#6:1061\n391#7,9:1033\n400#7:1053\n401#7,2:1059\n4360#8,6:1045\n30#9:1062\n80#10:1063\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n132#1:960,6\n139#1:966,6\n766#1:972,6\n772#1:978,6\n777#1:985,6\n781#1:991,6\n782#1:997,6\n868#1:1015,6\n875#1:1021,6\n775#1:984\n808#1:1003,7\n817#1:1010,5\n873#1:1054,5\n870#1:1027,6\n870#1:1042,3\n870#1:1051,2\n870#1:1061\n870#1:1033,9\n870#1:1053\n870#1:1059,2\n870#1:1045,6\n703#1:1062\n703#1:1063\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f13442a;

    /* JADX INFO: Add missing generic type declarations: [S] */
    static final class a<S> extends kotlin.jvm.internal.l0 implements Function1<i<S>, x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13443a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final x invoke(i<S> iVar) {
            int i10 = 2 << 0;
            return e.f(b0.o(androidx.compose.animation.core.p.t(220, 90, null, 4, null), 0.0f, 2, null).c(b0.u(androidx.compose.animation.core.p.t(220, 90, null, 4, null), 0.92f, 0L, 4, null)), b0.q(androidx.compose.animation.core.p.t(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    static final class b<S> extends kotlin.jvm.internal.l0 implements Function1<S, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13444a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s10) {
            return s10;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f13445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<i<S>, x> f13447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f13449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<S, Object> f13450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.o<androidx.compose.animation.g, S, androidx.compose.runtime.c0, Integer, Unit> f13451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13452h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13453i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(S s10, androidx.compose.ui.a0 a0Var, Function1<? super i<S>, x> function1, androidx.compose.ui.e eVar, String str, Function1<? super S, ? extends Object> function2, pj.o<? super androidx.compose.animation.g, ? super S, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, int i10, int i11) {
            super(2);
            this.f13445a = s10;
            this.f13446b = a0Var;
            this.f13447c = function1;
            this.f13448d = eVar;
            this.f13449e = str;
            this.f13450f = function2;
            this.f13451g = oVar;
            this.f13452h = i10;
            this.f13453i = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            e.b(this.f13445a, this.f13446b, this.f13447c, this.f13448d, this.f13449e, this.f13450f, this.f13451g, c0Var, t4.a(this.f13452h | 1), this.f13453i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    static final class d<S> extends kotlin.jvm.internal.l0 implements Function1<i<S>, x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f13454a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final x invoke(i<S> iVar) {
            int i10 = 1 >> 0;
            int i11 = 0 << 0;
            return e.f(b0.o(androidx.compose.animation.core.p.t(220, 90, null, 4, null), 0.0f, 2, null).c(b0.u(androidx.compose.animation.core.p.t(220, 90, null, 4, null), 0.92f, 0L, 4, null)), b0.q(androidx.compose.animation.core.p.t(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: androidx.compose.animation.e$e, reason: collision with other inner class name */
    static final class C0062e<S> extends kotlin.jvm.internal.l0 implements Function1<S, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0062e f13455a = new C0062e();

        C0062e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s10) {
            return s10;
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1282#2,6:960\n1282#2,6:966\n1282#2,6:972\n1282#2,6:978\n1282#2,6:985\n1282#2,6:991\n1#3:984\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n*L\n819#1:960,6\n823#1:966,6\n830#1:972,6\n841#1:978,6\n837#1:985,6\n848#1:991,6\n*E\n"})
    static final class f extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<S> f13456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f13457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<i<S>, x> f13458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f13459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<S> f13460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.o<androidx.compose.animation.g, S, androidx.compose.runtime.c0, Integer, Unit> f13461f;

        static final class a extends kotlin.jvm.internal.l0 implements pj.n<androidx.compose.ui.layout.c1, androidx.compose.ui.layout.z0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f13462a;

            /* JADX INFO: renamed from: androidx.compose.animation.e$f$a$a, reason: collision with other inner class name */
            static final class C0063a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ i2 f13463a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ x f13464b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0063a(i2 i2Var, x xVar) {
                    super(1);
                    this.f13463a = i2Var;
                    this.f13464b = xVar;
                }

                public final void c(i2.a aVar) {
                    aVar.N(this.f13463a, 0, 0, this.f13464b.d());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                    c(aVar);
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar) {
                super(3);
                this.f13462a = xVar;
            }

            public final androidx.compose.ui.layout.b1 c(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
                i2 i2VarP0 = z0Var.P0(j10);
                int i10 = 3 >> 4;
                return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new C0063a(i2VarP0, this.f13462a), 4, null);
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.b1 invoke(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
                return c(c1Var, z0Var, bVar.x());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [S] */
        static final class b<S> extends kotlin.jvm.internal.l0 implements Function1<S, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ S f13465a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(S s10) {
                super(1);
                this.f13465a = s10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(S s10) {
                return Boolean.valueOf(Intrinsics.areEqual(s10, this.f13465a));
            }
        }

        static final class c extends kotlin.jvm.internal.l0 implements Function2<z, z, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0 f13466a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(f0 f0Var) {
                super(2);
                this.f13466a = f0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(z zVar, z zVar2) {
                z zVar3 = z.PostExit;
                return Boolean.valueOf(zVar == zVar3 && zVar2 == zVar3 && !this.f13466a.c().l());
            }
        }

        @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1282#2,6:960\n1282#2,6:966\n1#3:972\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5\n*L\n855#1:960,6\n863#1:966,6\n*E\n"})
        static final class d extends kotlin.jvm.internal.l0 implements pj.n<l, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<S> f13467a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ S f13468b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f13469c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.o<androidx.compose.animation.g, S, androidx.compose.runtime.c0, Integer, Unit> f13470d;

            @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,959:1\n66#2,5:960\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1\n*L\n856#1:960,5\n*E\n"})
            static final class a extends kotlin.jvm.internal.l0 implements Function1<v1, u1> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ SnapshotStateList<S> f13471a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ S f13472b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f13473c;

                /* JADX INFO: renamed from: androidx.compose.animation.e$f$d$a$a, reason: collision with other inner class name */
                @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1\n*L\n1#1,69:1\n857#2,3:70\n*E\n"})
                public static final class C0064a implements u1 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SnapshotStateList f13474a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Object f13475b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ AnimatedContentTransitionScopeImpl f13476c;

                    public C0064a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                        this.f13474a = snapshotStateList;
                        this.f13475b = obj;
                        this.f13476c = animatedContentTransitionScopeImpl;
                    }

                    @Override // androidx.compose.runtime.u1
                    public void dispose() {
                        this.f13474a.remove(this.f13475b);
                        this.f13476c.w().l0(this.f13475b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SnapshotStateList<S> snapshotStateList, S s10, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
                    super(1);
                    this.f13471a = snapshotStateList;
                    this.f13472b = s10;
                    this.f13473c = animatedContentTransitionScopeImpl;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final u1 invoke(v1 v1Var) {
                    return new C0064a(this.f13471a, this.f13472b, this.f13473c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(SnapshotStateList<S> snapshotStateList, S s10, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, pj.o<? super androidx.compose.animation.g, ? super S, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
                super(3);
                this.f13467a = snapshotStateList;
                this.f13468b = s10;
                this.f13469c = animatedContentTransitionScopeImpl;
                this.f13470d = oVar;
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
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v10 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.animation.l r8, androidx.compose.runtime.c0 r9, int r10) {
                /*
                    Method dump skipped, instruction units count: 209
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.e.f.d.c(androidx.compose.animation.l, androidx.compose.runtime.c0, int):void");
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(l lVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                c(lVar, c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(l3<S> l3Var, S s10, Function1<? super i<S>, x> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, SnapshotStateList<S> snapshotStateList, pj.o<? super androidx.compose.animation.g, ? super S, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
            super(2);
            this.f13456a = l3Var;
            this.f13457b = s10;
            this.f13458c = function1;
            this.f13459d = animatedContentTransitionScopeImpl;
            this.f13460e = snapshotStateList;
            this.f13461f = oVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-23915175, i10, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
            }
            Function1<i<S>, x> function1 = this.f13458c;
            l3.b bVar = this.f13459d;
            x xVarI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (xVarI0 == aVar.a()) {
                xVarI0 = function1.invoke(bVar);
                c0Var.Y(xVarI0);
            }
            x xVar = (x) xVarI0;
            boolean zG = c0Var.G(Intrinsics.areEqual(this.f13456a.w().j(), this.f13457b));
            l3<S> l3Var = this.f13456a;
            S s10 = this.f13457b;
            Function1<i<S>, x> function2 = this.f13458c;
            l3.b bVar2 = this.f13459d;
            Object objI0 = c0Var.i0();
            if (zG || objI0 == aVar.a()) {
                objI0 = Intrinsics.areEqual(l3Var.w().j(), s10) ? f0.f13493a.b() : function2.invoke(bVar2).a();
                c0Var.Y(objI0);
            }
            f0 f0Var = (f0) objI0;
            S s11 = this.f13457b;
            l3<S> l3Var2 = this.f13456a;
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.areEqual(s11, l3Var2.y()));
                c0Var.Y(objI1);
            }
            AnimatedContentTransitionScopeImpl.a aVar2 = (AnimatedContentTransitionScopeImpl.a) objI1;
            d0 d0VarC = xVar.c();
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            boolean zK0 = c0Var.k0(xVar);
            Object objI2 = c0Var.i0();
            if (zK0 || objI2 == aVar.a()) {
                objI2 = new a(xVar);
                c0Var.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.q0.a(aVar3, (pj.n) objI2);
            aVar2.b(Intrinsics.areEqual(this.f13457b, this.f13456a.y()));
            androidx.compose.ui.a0 a0VarB2 = a0VarA.B2(aVar2);
            l3<S> l3Var3 = this.f13456a;
            boolean zK1 = c0Var.k0(this.f13457b);
            S s12 = this.f13457b;
            Object objI3 = c0Var.i0();
            if (zK1 || objI3 == aVar.a()) {
                objI3 = new b(s12);
                c0Var.Y(objI3);
            }
            Function1 function3 = (Function1) objI3;
            boolean zD = c0Var.D(f0Var);
            Object objI4 = c0Var.i0();
            if (zD || objI4 == aVar.a()) {
                objI4 = new c(f0Var);
                c0Var.Y(objI4);
            }
            k.a(l3Var3, function3, a0VarB2, d0VarC, f0Var, (Function2) objI4, null, androidx.compose.runtime.internal.w.e(-143346359, true, new d(this.f13460e, this.f13457b, this.f13459d, this.f13461f), c0Var, 54), c0Var, 12582912, 64);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<S> f13477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<i<S>, x> f13479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<S, Object> f13481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.o<androidx.compose.animation.g, S, androidx.compose.runtime.c0, Integer, Unit> f13482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13484h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(l3<S> l3Var, androidx.compose.ui.a0 a0Var, Function1<? super i<S>, x> function1, androidx.compose.ui.e eVar, Function1<? super S, ? extends Object> function2, pj.o<? super androidx.compose.animation.g, ? super S, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, int i10, int i11) {
            super(2);
            this.f13477a = l3Var;
            this.f13478b = a0Var;
            this.f13479c = function1;
            this.f13480d = eVar;
            this.f13481e = function2;
            this.f13482f = oVar;
            this.f13483g = i10;
            this.f13484h = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            e.a(this.f13477a, this.f13478b, this.f13479c, this.f13480d, this.f13481e, this.f13482f, c0Var, t4.a(this.f13483g | 1), this.f13484h);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, q2<androidx.compose.ui.unit.u>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f13485a = new h();

        h() {
            super(2);
        }

        public final q2<androidx.compose.ui.unit.u> c(long j10, long j11) {
            return androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ q2<androidx.compose.ui.unit.u> invoke(androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.u uVar2) {
            return c(uVar.q(), uVar2.q());
        }
    }

    static {
        long j10 = Integer.MIN_VALUE;
        f13442a = androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:104:0x0140  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:113:0x0165  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code duplicated, block: B:117:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:122:0x018b  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:146:0x0215 A[LOOP:0: B:141:0x01f8->B:146:0x0215, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x021c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0224  */
    /* JADX WARN: Code duplicated, block: B:153:0x0237  */
    /* JADX WARN: Code duplicated, block: B:157:0x0250  */
    /* JADX WARN: Code duplicated, block: B:159:0x0260 A[LOOP:2: B:158:0x025e->B:159:0x0260, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:168:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:174:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:175:0x0301  */
    /* JADX WARN: Code duplicated, block: B:178:0x0320  */
    /* JADX WARN: Code duplicated, block: B:180:0x032e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0350  */
    /* JADX WARN: Code duplicated, block: B:185:0x0366  */
    /* JADX WARN: Code duplicated, block: B:186:0x0370  */
    /* JADX WARN: Code duplicated, block: B:190:0x0394  */
    /* JADX WARN: Code duplicated, block: B:193:0x039b  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:198:0x021a A[EDGE_INSN: B:198:0x021a->B:148:0x021a BREAK  A[LOOP:0: B:141:0x01f8->B:146:0x0215], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <S> void a(@NotNull l3<S> l3Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function1<? super i<S>, x> function1, @Nullable androidx.compose.ui.e eVar, @Nullable Function1<? super S, ? extends Object> function2, @NotNull pj.o<? super androidx.compose.animation.g, ? super S, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        Function1<? super i<S>, x> function3;
        int i14;
        int i15;
        androidx.compose.ui.e eVarC;
        int i16;
        int i17;
        Function1<? super S, ? extends Object> function4;
        int i18;
        pj.o<? super androidx.compose.animation.g, ? super S, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar2;
        int i19;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        Function1<? super i<S>, x> function5;
        androidx.compose.ui.e eVar2;
        Function1<? super S, ? extends Object> function6;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.unit.w wVar;
        int i20;
        boolean z11;
        Object objI0;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        boolean z12;
        Object objI1;
        SnapshotStateList snapshotStateList;
        boolean z13;
        Object objI2;
        k2 k2Var;
        int size;
        int i21;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2;
        SnapshotStateList snapshotStateList2;
        int i22;
        boolean zD;
        x xVarI0;
        Object objI3;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int size2;
        int i23;
        Function2 function7;
        Iterator<T> it;
        int i24;
        Object objI4;
        Object objI5;
        l3<S> l3Var2 = l3Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(511725103);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(l3Var2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 1;
        if (i25 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 2;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    function3 = function1;
                    if (c0VarR.k0(function3)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 4;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        eVarC = eVar;
                        if (c0VarR.D(eVarC)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 8;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            function4 = function2;
                            if (c0VarR.k0(function4)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 16) != 0) {
                            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                oVar2 = oVar;
                                if (c0VarR.k0(oVar2)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                                i12 |= i19;
                            }
                            if ((74899 & i12) != 74898) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i12 & 1)) {
                                if (i25 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    objI5 = c0VarR.i0();
                                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI5 = d.f13454a;
                                        c0VarR.Y(objI5);
                                    }
                                    function5 = (Function1) objI5;
                                } else {
                                    function5 = function3;
                                }
                                if (i15 != 0) {
                                    eVarC = androidx.compose.ui.e.f37317a.C();
                                }
                                if (i17 != 0) {
                                    objI4 = c0VarR.i0();
                                    if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI4 = C0062e.f13455a;
                                        c0VarR.Y(objI4);
                                    }
                                    function4 = (Function1) objI4;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                                }
                                wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                                i20 = i12 & 14;
                                if (i20 == 4) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objI0 = c0VarR.i0();
                                if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                    c0VarR.Y(objI0);
                                }
                                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                                if (i20 == 4) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objI1 = c0VarR.i0();
                                if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = w6.h(l3Var2.p());
                                    c0VarR.Y(objI1);
                                }
                                snapshotStateList = (SnapshotStateList) objI1;
                                if (i20 == 4) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objI2 = c0VarR.i0();
                                if (z13 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI2 = b3.u();
                                    c0VarR.Y(objI2);
                                }
                                k2Var = (k2) objI2;
                                if (!snapshotStateList.contains(l3Var2.p())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                }
                                if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                    if (snapshotStateList.size() == 1 || !Intrinsics.areEqual(snapshotStateList.get(0), l3Var2.p())) {
                                        snapshotStateList.clear();
                                        snapshotStateList.add(l3Var2.p());
                                    }
                                    if (k2Var.v() == 1 || k2Var.g(l3Var2.p())) {
                                        k2Var.K();
                                    }
                                    animatedContentTransitionScopeImpl.B(eVarC);
                                    animatedContentTransitionScopeImpl.C(wVar);
                                }
                                if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y()) && !snapshotStateList.contains(l3Var2.y())) {
                                    it = snapshotStateList.iterator();
                                    i24 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            i24 = -1;
                                            break;
                                        } else if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                            break;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    if (i24 == -1) {
                                        snapshotStateList.add(l3Var2.y());
                                    } else {
                                        snapshotStateList.set(i24, l3Var2.y());
                                        Unit unit = Unit.f312394a;
                                    }
                                }
                                if (k2Var.g(l3Var2.y()) || !k2Var.g(l3Var2.p())) {
                                    c0VarR.E(1966468977);
                                    k2Var.K();
                                    size = snapshotStateList.size();
                                    i21 = 0;
                                    while (i21 < size) {
                                        int i26 = i21;
                                        T t10 = snapshotStateList.get(i26);
                                        SnapshotStateList snapshotStateList3 = snapshotStateList;
                                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl;
                                        k2Var.q0(t10, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t10, function5, animatedContentTransitionScopeImpl3, snapshotStateList3, oVar2), c0VarR, 54));
                                        i21 = i26 + 1;
                                        l3Var2 = l3Var;
                                        oVar2 = oVar;
                                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl3;
                                        size = size;
                                        snapshotStateList = snapshotStateList3;
                                    }
                                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                    snapshotStateList2 = snapshotStateList;
                                    i22 = 0;
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(1969054067);
                                    c0VarR.A();
                                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                    snapshotStateList2 = snapshotStateList;
                                    i22 = 0;
                                }
                                zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                                xVarI0 = c0VarR.i0();
                                if (zD || xVarI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                    c0VarR.Y(xVarI0);
                                }
                                androidx.compose.ui.a0 a0VarB2 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                                objI3 = c0VarR.i0();
                                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                                    c0VarR.Y(objI3);
                                }
                                androidx.compose.animation.f fVar = (androidx.compose.animation.f) objI3;
                                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB2);
                                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                                function0A = aVar.a();
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
                                y7.n(c0VarD, fVar, aVar.e());
                                y7.n(c0VarD, b1VarK, aVar.g());
                                function2B = aVar.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar.f());
                                c0VarR.E(-860173498);
                                size2 = snapshotStateList2.size();
                                for (i23 = i22; i23 < size2; i23++) {
                                    a0.c cVar = (Object) snapshotStateList2.get(i23);
                                    c0VarR.m0(-2026002954, function4.invoke(cVar));
                                    function7 = (Function2) k2Var.p(cVar);
                                    if (function7 == null) {
                                        c0VarR.E(1618454323);
                                        c0VarR.A();
                                    } else {
                                        c0VarR.E(-2026001778);
                                        function7.invoke(c0VarR, Integer.valueOf(i22));
                                        c0VarR.A();
                                        Unit unit2 = Unit.f312394a;
                                    }
                                    c0VarR.v0();
                                }
                                c0VarR.A();
                                c0VarR.o();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                                function5 = function3;
                            }
                            eVar2 = eVarC;
                            function6 = function4;
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                            }
                        }
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        oVar2 = oVar;
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                objI5 = c0VarR.i0();
                                if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI5 = d.f13454a;
                                    c0VarR.Y(objI5);
                                }
                                function5 = (Function1) objI5;
                            } else {
                                function5 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                            }
                            if (i17 != 0) {
                                objI4 = c0VarR.i0();
                                if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI4 = C0062e.f13455a;
                                    c0VarR.Y(objI4);
                                }
                                function4 = (Function1) objI4;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                            i20 = i12 & 14;
                            if (i20 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            }
                            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                            if (i20 == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z12) {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            }
                            snapshotStateList = (SnapshotStateList) objI1;
                            if (i20 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z13) {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            }
                            k2Var = (k2) objI2;
                            if (!snapshotStateList.contains(l3Var2.p())) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                if (snapshotStateList.size() == 1) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                } else {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                }
                                if (k2Var.v() == 1) {
                                    k2Var.K();
                                } else {
                                    k2Var.K();
                                }
                                animatedContentTransitionScopeImpl.B(eVarC);
                                animatedContentTransitionScopeImpl.C(wVar);
                            }
                            if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                it = snapshotStateList.iterator();
                                i24 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        i24 = -1;
                                        break;
                                    } else {
                                        if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                    }
                                }
                                if (i24 == -1) {
                                    snapshotStateList.add(l3Var2.y());
                                } else {
                                    snapshotStateList.set(i24, l3Var2.y());
                                    Unit unit3 = Unit.f312394a;
                                }
                            }
                            if (k2Var.g(l3Var2.y())) {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i27 = i21;
                                    T t11 = snapshotStateList.get(i27);
                                    SnapshotStateList snapshotStateList4 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t11, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11, function5, animatedContentTransitionScopeImpl4, snapshotStateList4, oVar2), c0VarR, 54));
                                    i21 = i27 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl4;
                                    size = size;
                                    snapshotStateList = snapshotStateList4;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            } else {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i28 = i21;
                                    T t12 = snapshotStateList.get(i28);
                                    SnapshotStateList snapshotStateList5 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t12, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t12, function5, animatedContentTransitionScopeImpl5, snapshotStateList5, oVar2), c0VarR, 54));
                                    i21 = i28 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl5;
                                    size = size;
                                    snapshotStateList = snapshotStateList5;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            }
                            zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                            xVarI0 = c0VarR.i0();
                            if (zD) {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            } else {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            }
                            androidx.compose.ui.a0 a0VarB3 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(objI3);
                            }
                            androidx.compose.animation.f fVar2 = (androidx.compose.animation.f) objI3;
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB3);
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
                            y7.n(c0VarD, fVar2, aVar2.e());
                            y7.n(c0VarD, b1VarK2, aVar2.g());
                            function2B = aVar2.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN2, aVar2.f());
                            c0VarR.E(-860173498);
                            size2 = snapshotStateList2.size();
                            while (i23 < size2) {
                                a0.c cVar2 = (Object) snapshotStateList2.get(i23);
                                c0VarR.m0(-2026002954, function4.invoke(cVar2));
                                function7 = (Function2) k2Var.p(cVar2);
                                if (function7 == null) {
                                    c0VarR.E(1618454323);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(-2026001778);
                                    function7.invoke(c0VarR, Integer.valueOf(i22));
                                    c0VarR.A();
                                    Unit unit4 = Unit.f312394a;
                                }
                                c0VarR.v0();
                            }
                            c0VarR.A();
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            function5 = function3;
                        }
                        eVar2 = eVarC;
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 24576;
                    function4 = function2;
                    if ((i11 & 16) != 0) {
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                objI5 = c0VarR.i0();
                                if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI5 = d.f13454a;
                                    c0VarR.Y(objI5);
                                }
                                function5 = (Function1) objI5;
                            } else {
                                function5 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                            }
                            if (i17 != 0) {
                                objI4 = c0VarR.i0();
                                if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI4 = C0062e.f13455a;
                                    c0VarR.Y(objI4);
                                }
                                function4 = (Function1) objI4;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                            i20 = i12 & 14;
                            if (i20 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            }
                            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                            if (i20 == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z12) {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            }
                            snapshotStateList = (SnapshotStateList) objI1;
                            if (i20 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z13) {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            }
                            k2Var = (k2) objI2;
                            if (!snapshotStateList.contains(l3Var2.p())) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                if (snapshotStateList.size() == 1) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                } else {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                }
                                if (k2Var.v() == 1) {
                                    k2Var.K();
                                } else {
                                    k2Var.K();
                                }
                                animatedContentTransitionScopeImpl.B(eVarC);
                                animatedContentTransitionScopeImpl.C(wVar);
                            }
                            if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                it = snapshotStateList.iterator();
                                i24 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        i24 = -1;
                                        break;
                                    } else {
                                        if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                    }
                                }
                                if (i24 == -1) {
                                    snapshotStateList.add(l3Var2.y());
                                } else {
                                    snapshotStateList.set(i24, l3Var2.y());
                                    Unit unit5 = Unit.f312394a;
                                }
                            }
                            if (k2Var.g(l3Var2.y())) {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i29 = i21;
                                    T t13 = snapshotStateList.get(i29);
                                    SnapshotStateList snapshotStateList6 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t13, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t13, function5, animatedContentTransitionScopeImpl6, snapshotStateList6, oVar2), c0VarR, 54));
                                    i21 = i29 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl6;
                                    size = size;
                                    snapshotStateList = snapshotStateList6;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            } else {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i210 = i21;
                                    T t14 = snapshotStateList.get(i210);
                                    SnapshotStateList snapshotStateList7 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl7 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t14, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t14, function5, animatedContentTransitionScopeImpl7, snapshotStateList7, oVar2), c0VarR, 54));
                                    i21 = i210 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl7;
                                    size = size;
                                    snapshotStateList = snapshotStateList7;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            }
                            zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                            xVarI0 = c0VarR.i0();
                            if (zD) {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            } else {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            }
                            androidx.compose.ui.a0 a0VarB4 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(objI3);
                            }
                            androidx.compose.animation.f fVar3 = (androidx.compose.animation.f) objI3;
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB4);
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
                            y7.n(c0VarD, fVar3, aVar3.e());
                            y7.n(c0VarD, b1VarK3, aVar3.g());
                            function2B = aVar3.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN3, aVar3.f());
                            c0VarR.E(-860173498);
                            size2 = snapshotStateList2.size();
                            while (i23 < size2) {
                                a0.c cVar3 = (Object) snapshotStateList2.get(i23);
                                c0VarR.m0(-2026002954, function4.invoke(cVar3));
                                function7 = (Function2) k2Var.p(cVar3);
                                if (function7 == null) {
                                    c0VarR.E(1618454323);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(-2026001778);
                                    function7.invoke(c0VarR, Integer.valueOf(i22));
                                    c0VarR.A();
                                    Unit unit6 = Unit.f312394a;
                                }
                                c0VarR.v0();
                            }
                            c0VarR.A();
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            function5 = function3;
                        }
                        eVar2 = eVarC;
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    oVar2 = oVar;
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit7 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i211 = i21;
                                T t15 = snapshotStateList.get(i211);
                                SnapshotStateList snapshotStateList8 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl8 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t15, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t15, function5, animatedContentTransitionScopeImpl8, snapshotStateList8, oVar2), c0VarR, 54));
                                i21 = i211 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl8;
                                size = size;
                                snapshotStateList = snapshotStateList8;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i212 = i21;
                                T t16 = snapshotStateList.get(i212);
                                SnapshotStateList snapshotStateList9 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl9 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t16, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t16, function5, animatedContentTransitionScopeImpl9, snapshotStateList9, oVar2), c0VarR, 54));
                                i21 = i212 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl9;
                                size = size;
                                snapshotStateList = snapshotStateList9;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB5 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar4 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarB5);
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
                        y7.n(c0VarD, fVar4, aVar4.e());
                        y7.n(c0VarD, b1VarK4, aVar4.g());
                        function2B = aVar4.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN4, aVar4.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar4 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar4));
                            function7 = (Function2) k2Var.p(cVar4);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit8 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 3072;
                eVarC = eVar;
                i17 = i11 & 8;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 16) != 0) {
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                objI5 = c0VarR.i0();
                                if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI5 = d.f13454a;
                                    c0VarR.Y(objI5);
                                }
                                function5 = (Function1) objI5;
                            } else {
                                function5 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                            }
                            if (i17 != 0) {
                                objI4 = c0VarR.i0();
                                if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI4 = C0062e.f13455a;
                                    c0VarR.Y(objI4);
                                }
                                function4 = (Function1) objI4;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                            i20 = i12 & 14;
                            if (i20 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            }
                            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                            if (i20 == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z12) {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            }
                            snapshotStateList = (SnapshotStateList) objI1;
                            if (i20 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z13) {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            }
                            k2Var = (k2) objI2;
                            if (!snapshotStateList.contains(l3Var2.p())) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                if (snapshotStateList.size() == 1) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                } else {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                }
                                if (k2Var.v() == 1) {
                                    k2Var.K();
                                } else {
                                    k2Var.K();
                                }
                                animatedContentTransitionScopeImpl.B(eVarC);
                                animatedContentTransitionScopeImpl.C(wVar);
                            }
                            if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                it = snapshotStateList.iterator();
                                i24 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        i24 = -1;
                                        break;
                                    } else {
                                        if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                    }
                                }
                                if (i24 == -1) {
                                    snapshotStateList.add(l3Var2.y());
                                } else {
                                    snapshotStateList.set(i24, l3Var2.y());
                                    Unit unit9 = Unit.f312394a;
                                }
                            }
                            if (k2Var.g(l3Var2.y())) {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i213 = i21;
                                    T t17 = snapshotStateList.get(i213);
                                    SnapshotStateList snapshotStateList10 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl10 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t17, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t17, function5, animatedContentTransitionScopeImpl10, snapshotStateList10, oVar2), c0VarR, 54));
                                    i21 = i213 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl10;
                                    size = size;
                                    snapshotStateList = snapshotStateList10;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            } else {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i214 = i21;
                                    T t18 = snapshotStateList.get(i214);
                                    SnapshotStateList snapshotStateList11 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t18, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t18, function5, animatedContentTransitionScopeImpl11, snapshotStateList11, oVar2), c0VarR, 54));
                                    i21 = i214 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11;
                                    size = size;
                                    snapshotStateList = snapshotStateList11;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            }
                            zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                            xVarI0 = c0VarR.i0();
                            if (zD) {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            } else {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            }
                            androidx.compose.ui.a0 a0VarB6 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(objI3);
                            }
                            androidx.compose.animation.f fVar5 = (androidx.compose.animation.f) objI3;
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                            androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarB6);
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
                            y7.n(c0VarD, fVar5, aVar5.e());
                            y7.n(c0VarD, b1VarK5, aVar5.g());
                            function2B = aVar5.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN5, aVar5.f());
                            c0VarR.E(-860173498);
                            size2 = snapshotStateList2.size();
                            while (i23 < size2) {
                                a0.c cVar5 = (Object) snapshotStateList2.get(i23);
                                c0VarR.m0(-2026002954, function4.invoke(cVar5));
                                function7 = (Function2) k2Var.p(cVar5);
                                if (function7 == null) {
                                    c0VarR.E(1618454323);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(-2026001778);
                                    function7.invoke(c0VarR, Integer.valueOf(i22));
                                    c0VarR.A();
                                    Unit unit10 = Unit.f312394a;
                                }
                                c0VarR.v0();
                            }
                            c0VarR.A();
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            function5 = function3;
                        }
                        eVar2 = eVarC;
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    oVar2 = oVar;
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit11 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i215 = i21;
                                T t19 = snapshotStateList.get(i215);
                                SnapshotStateList snapshotStateList12 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl12 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t19, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t19, function5, animatedContentTransitionScopeImpl12, snapshotStateList12, oVar2), c0VarR, 54));
                                i21 = i215 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl12;
                                size = size;
                                snapshotStateList = snapshotStateList12;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i216 = i21;
                                T t110 = snapshotStateList.get(i216);
                                SnapshotStateList snapshotStateList13 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl13 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t110, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t110, function5, animatedContentTransitionScopeImpl13, snapshotStateList13, oVar2), c0VarR, 54));
                                i21 = i216 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl13;
                                size = size;
                                snapshotStateList = snapshotStateList13;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB7 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar6 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarB7);
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
                        y7.n(c0VarD, fVar6, aVar6.e());
                        y7.n(c0VarD, b1VarK6, aVar6.g());
                        function2B = aVar6.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN6, aVar6.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar6 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar6));
                            function7 = (Function2) k2Var.p(cVar6);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit12 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 24576;
                function4 = function2;
                if ((i11 & 16) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit13 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i217 = i21;
                                T t111 = snapshotStateList.get(i217);
                                SnapshotStateList snapshotStateList14 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl14 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t111, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111, function5, animatedContentTransitionScopeImpl14, snapshotStateList14, oVar2), c0VarR, 54));
                                i21 = i217 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl14;
                                size = size;
                                snapshotStateList = snapshotStateList14;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i218 = i21;
                                T t112 = snapshotStateList.get(i218);
                                SnapshotStateList snapshotStateList15 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl15 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t112, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t112, function5, animatedContentTransitionScopeImpl15, snapshotStateList15, oVar2), c0VarR, 54));
                                i21 = i218 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl15;
                                size = size;
                                snapshotStateList = snapshotStateList15;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB8 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar7 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarB8);
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
                        y7.n(c0VarD, fVar7, aVar7.e());
                        y7.n(c0VarD, b1VarK7, aVar7.g());
                        function2B = aVar7.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN7, aVar7.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar7 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar7));
                            function7 = (Function2) k2Var.p(cVar7);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit14 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                oVar2 = oVar;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit15 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i219 = i21;
                            T t113 = snapshotStateList.get(i219);
                            SnapshotStateList snapshotStateList16 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl16 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t113, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t113, function5, animatedContentTransitionScopeImpl16, snapshotStateList16, oVar2), c0VarR, 54));
                            i21 = i219 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl16;
                            size = size;
                            snapshotStateList = snapshotStateList16;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i2110 = i21;
                            T t114 = snapshotStateList.get(i2110);
                            SnapshotStateList snapshotStateList17 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl17 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t114, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t114, function5, animatedContentTransitionScopeImpl17, snapshotStateList17, oVar2), c0VarR, 54));
                            i21 = i2110 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl17;
                            size = size;
                            snapshotStateList = snapshotStateList17;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB9 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar8 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarB9);
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
                    y7.n(c0VarD, fVar8, aVar8.e());
                    y7.n(c0VarD, b1VarK8, aVar8.g());
                    function2B = aVar8.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN8, aVar8.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar8 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar8));
                        function7 = (Function2) k2Var.p(cVar8);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit16 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= a5.S0;
            function3 = function1;
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    eVarC = eVar;
                    if (c0VarR.D(eVarC)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 8;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 16) != 0) {
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                objI5 = c0VarR.i0();
                                if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI5 = d.f13454a;
                                    c0VarR.Y(objI5);
                                }
                                function5 = (Function1) objI5;
                            } else {
                                function5 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                            }
                            if (i17 != 0) {
                                objI4 = c0VarR.i0();
                                if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI4 = C0062e.f13455a;
                                    c0VarR.Y(objI4);
                                }
                                function4 = (Function1) objI4;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                            i20 = i12 & 14;
                            if (i20 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            }
                            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                            if (i20 == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z12) {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            }
                            snapshotStateList = (SnapshotStateList) objI1;
                            if (i20 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z13) {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            }
                            k2Var = (k2) objI2;
                            if (!snapshotStateList.contains(l3Var2.p())) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                if (snapshotStateList.size() == 1) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                } else {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                }
                                if (k2Var.v() == 1) {
                                    k2Var.K();
                                } else {
                                    k2Var.K();
                                }
                                animatedContentTransitionScopeImpl.B(eVarC);
                                animatedContentTransitionScopeImpl.C(wVar);
                            }
                            if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                it = snapshotStateList.iterator();
                                i24 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        i24 = -1;
                                        break;
                                    } else {
                                        if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                    }
                                }
                                if (i24 == -1) {
                                    snapshotStateList.add(l3Var2.y());
                                } else {
                                    snapshotStateList.set(i24, l3Var2.y());
                                    Unit unit17 = Unit.f312394a;
                                }
                            }
                            if (k2Var.g(l3Var2.y())) {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i2111 = i21;
                                    T t115 = snapshotStateList.get(i2111);
                                    SnapshotStateList snapshotStateList18 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl18 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t115, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t115, function5, animatedContentTransitionScopeImpl18, snapshotStateList18, oVar2), c0VarR, 54));
                                    i21 = i2111 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl18;
                                    size = size;
                                    snapshotStateList = snapshotStateList18;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            } else {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i2112 = i21;
                                    T t116 = snapshotStateList.get(i2112);
                                    SnapshotStateList snapshotStateList19 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl19 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t116, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t116, function5, animatedContentTransitionScopeImpl19, snapshotStateList19, oVar2), c0VarR, 54));
                                    i21 = i2112 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl19;
                                    size = size;
                                    snapshotStateList = snapshotStateList19;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            }
                            zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                            xVarI0 = c0VarR.i0();
                            if (zD) {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            } else {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            }
                            androidx.compose.ui.a0 a0VarB10 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(objI3);
                            }
                            androidx.compose.animation.f fVar9 = (androidx.compose.animation.f) objI3;
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                            androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarB10);
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
                            y7.n(c0VarD, fVar9, aVar9.e());
                            y7.n(c0VarD, b1VarK9, aVar9.g());
                            function2B = aVar9.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN9, aVar9.f());
                            c0VarR.E(-860173498);
                            size2 = snapshotStateList2.size();
                            while (i23 < size2) {
                                a0.c cVar9 = (Object) snapshotStateList2.get(i23);
                                c0VarR.m0(-2026002954, function4.invoke(cVar9));
                                function7 = (Function2) k2Var.p(cVar9);
                                if (function7 == null) {
                                    c0VarR.E(1618454323);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(-2026001778);
                                    function7.invoke(c0VarR, Integer.valueOf(i22));
                                    c0VarR.A();
                                    Unit unit18 = Unit.f312394a;
                                }
                                c0VarR.v0();
                            }
                            c0VarR.A();
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            function5 = function3;
                        }
                        eVar2 = eVarC;
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    oVar2 = oVar;
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit19 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i2113 = i21;
                                T t117 = snapshotStateList.get(i2113);
                                SnapshotStateList snapshotStateList110 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl110 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t117, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t117, function5, animatedContentTransitionScopeImpl110, snapshotStateList110, oVar2), c0VarR, 54));
                                i21 = i2113 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl110;
                                size = size;
                                snapshotStateList = snapshotStateList110;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i2114 = i21;
                                T t118 = snapshotStateList.get(i2114);
                                SnapshotStateList snapshotStateList111 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t118, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t118, function5, animatedContentTransitionScopeImpl111, snapshotStateList111, oVar2), c0VarR, 54));
                                i21 = i2114 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111;
                                size = size;
                                snapshotStateList = snapshotStateList111;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB11 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar10 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarB11);
                        androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                        function0A = aVar10.a();
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
                        y7.n(c0VarD, fVar10, aVar10.e());
                        y7.n(c0VarD, b1VarK10, aVar10.g());
                        function2B = aVar10.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN10, aVar10.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar10 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar10));
                            function7 = (Function2) k2Var.p(cVar10);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit110 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 24576;
                function4 = function2;
                if ((i11 & 16) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit111 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i2115 = i21;
                                T t119 = snapshotStateList.get(i2115);
                                SnapshotStateList snapshotStateList112 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl112 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t119, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t119, function5, animatedContentTransitionScopeImpl112, snapshotStateList112, oVar2), c0VarR, 54));
                                i21 = i2115 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl112;
                                size = size;
                                snapshotStateList = snapshotStateList112;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i2116 = i21;
                                T t1110 = snapshotStateList.get(i2116);
                                SnapshotStateList snapshotStateList113 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl113 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t1110, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1110, function5, animatedContentTransitionScopeImpl113, snapshotStateList113, oVar2), c0VarR, 54));
                                i21 = i2116 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl113;
                                size = size;
                                snapshotStateList = snapshotStateList113;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB12 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar11 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarB12);
                        androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                        function0A = aVar11.a();
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
                        y7.n(c0VarD, fVar11, aVar11.e());
                        y7.n(c0VarD, b1VarK11, aVar11.g());
                        function2B = aVar11.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN11, aVar11.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar11 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar11));
                            function7 = (Function2) k2Var.p(cVar11);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit112 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                oVar2 = oVar;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit113 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i2117 = i21;
                            T t1111 = snapshotStateList.get(i2117);
                            SnapshotStateList snapshotStateList114 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl114 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1111, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111, function5, animatedContentTransitionScopeImpl114, snapshotStateList114, oVar2), c0VarR, 54));
                            i21 = i2117 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl114;
                            size = size;
                            snapshotStateList = snapshotStateList114;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i2118 = i21;
                            T t1112 = snapshotStateList.get(i2118);
                            SnapshotStateList snapshotStateList115 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl115 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1112, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1112, function5, animatedContentTransitionScopeImpl115, snapshotStateList115, oVar2), c0VarR, 54));
                            i21 = i2118 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl115;
                            size = size;
                            snapshotStateList = snapshotStateList115;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB13 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar12 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarB13);
                    androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                    function0A = aVar12.a();
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
                    y7.n(c0VarD, fVar12, aVar12.e());
                    y7.n(c0VarD, b1VarK12, aVar12.g());
                    function2B = aVar12.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN12, aVar12.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar12 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar12));
                        function7 = (Function2) k2Var.p(cVar12);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit114 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= 3072;
            eVarC = eVar;
            i17 = i11 & 8;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit115 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i2119 = i21;
                                T t1113 = snapshotStateList.get(i2119);
                                SnapshotStateList snapshotStateList116 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl116 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t1113, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1113, function5, animatedContentTransitionScopeImpl116, snapshotStateList116, oVar2), c0VarR, 54));
                                i21 = i2119 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl116;
                                size = size;
                                snapshotStateList = snapshotStateList116;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i21110 = i21;
                                T t1114 = snapshotStateList.get(i21110);
                                SnapshotStateList snapshotStateList117 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl117 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t1114, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1114, function5, animatedContentTransitionScopeImpl117, snapshotStateList117, oVar2), c0VarR, 54));
                                i21 = i21110 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl117;
                                size = size;
                                snapshotStateList = snapshotStateList117;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB14 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar13 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarB14);
                        androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                        function0A = aVar13.a();
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
                        y7.n(c0VarD, fVar13, aVar13.e());
                        y7.n(c0VarD, b1VarK13, aVar13.g());
                        function2B = aVar13.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN13, aVar13.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar13 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar13));
                            function7 = (Function2) k2Var.p(cVar13);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit116 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                oVar2 = oVar;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit117 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i21111 = i21;
                            T t1115 = snapshotStateList.get(i21111);
                            SnapshotStateList snapshotStateList118 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl118 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1115, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1115, function5, animatedContentTransitionScopeImpl118, snapshotStateList118, oVar2), c0VarR, 54));
                            i21 = i21111 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl118;
                            size = size;
                            snapshotStateList = snapshotStateList118;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i21112 = i21;
                            T t1116 = snapshotStateList.get(i21112);
                            SnapshotStateList snapshotStateList119 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl119 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1116, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1116, function5, animatedContentTransitionScopeImpl119, snapshotStateList119, oVar2), c0VarR, 54));
                            i21 = i21112 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl119;
                            size = size;
                            snapshotStateList = snapshotStateList119;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB15 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar14 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarB15);
                    androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                    function0A = aVar14.a();
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
                    y7.n(c0VarD, fVar14, aVar14.e());
                    y7.n(c0VarD, b1VarK14, aVar14.g());
                    function2B = aVar14.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN14, aVar14.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar14 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar14));
                        function7 = (Function2) k2Var.p(cVar14);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit118 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= 24576;
            function4 = function2;
            if ((i11 & 16) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    oVar2 = oVar;
                    if (c0VarR.k0(oVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit119 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i21113 = i21;
                            T t1117 = snapshotStateList.get(i21113);
                            SnapshotStateList snapshotStateList1110 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1110 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1117, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1117, function5, animatedContentTransitionScopeImpl1110, snapshotStateList1110, oVar2), c0VarR, 54));
                            i21 = i21113 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1110;
                            size = size;
                            snapshotStateList = snapshotStateList1110;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i21114 = i21;
                            T t1118 = snapshotStateList.get(i21114);
                            SnapshotStateList snapshotStateList1111 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1111 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1118, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1118, function5, animatedContentTransitionScopeImpl1111, snapshotStateList1111, oVar2), c0VarR, 54));
                            i21 = i21114 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1111;
                            size = size;
                            snapshotStateList = snapshotStateList1111;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB16 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar15 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarB16);
                    androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                    function0A = aVar15.a();
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
                    y7.n(c0VarD, fVar15, aVar15.e());
                    y7.n(c0VarD, b1VarK15, aVar15.g());
                    function2B = aVar15.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN15, aVar15.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar15 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar15));
                        function7 = (Function2) k2Var.p(cVar15);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit1110 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            oVar2 = oVar;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = d.f13454a;
                        c0VarR.Y(objI5);
                    }
                    function5 = (Function1) objI5;
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                }
                if (i17 != 0) {
                    objI4 = c0VarR.i0();
                    if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI4 = C0062e.f13455a;
                        c0VarR.Y(objI4);
                    }
                    function4 = (Function1) objI4;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                i20 = i12 & 14;
                if (i20 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                }
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                if (i20 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                } else {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                }
                snapshotStateList = (SnapshotStateList) objI1;
                if (i20 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = c0VarR.i0();
                if (z13) {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                } else {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                }
                k2Var = (k2) objI2;
                if (!snapshotStateList.contains(l3Var2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(l3Var2.p());
                }
                if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (k2Var.v() == 1) {
                        k2Var.K();
                    } else {
                        k2Var.K();
                    }
                    animatedContentTransitionScopeImpl.B(eVarC);
                    animatedContentTransitionScopeImpl.C(wVar);
                }
                if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    it = snapshotStateList.iterator();
                    i24 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i24 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                break;
                                break;
                            }
                            i24++;
                        }
                    }
                    if (i24 == -1) {
                        snapshotStateList.add(l3Var2.y());
                    } else {
                        snapshotStateList.set(i24, l3Var2.y());
                        Unit unit1111 = Unit.f312394a;
                    }
                }
                if (k2Var.g(l3Var2.y())) {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i21115 = i21;
                        T t1119 = snapshotStateList.get(i21115);
                        SnapshotStateList snapshotStateList1112 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1112 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t1119, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1119, function5, animatedContentTransitionScopeImpl1112, snapshotStateList1112, oVar2), c0VarR, 54));
                        i21 = i21115 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1112;
                        size = size;
                        snapshotStateList = snapshotStateList1112;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i21116 = i21;
                        T t11110 = snapshotStateList.get(i21116);
                        SnapshotStateList snapshotStateList1113 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1113 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t11110, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11110, function5, animatedContentTransitionScopeImpl1113, snapshotStateList1113, oVar2), c0VarR, 54));
                        i21 = i21116 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1113;
                        size = size;
                        snapshotStateList = snapshotStateList1113;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                }
                zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                xVarI0 = c0VarR.i0();
                if (zD) {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                } else {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                }
                androidx.compose.ui.a0 a0VarB17 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                objI3 = c0VarR.i0();
                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(objI3);
                }
                androidx.compose.animation.f fVar16 = (androidx.compose.animation.f) objI3;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarB17);
                androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                function0A = aVar16.a();
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
                y7.n(c0VarD, fVar16, aVar16.e());
                y7.n(c0VarD, b1VarK16, aVar16.g());
                function2B = aVar16.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN16, aVar16.f());
                c0VarR.E(-860173498);
                size2 = snapshotStateList2.size();
                while (i23 < size2) {
                    a0.c cVar16 = (Object) snapshotStateList2.get(i23);
                    c0VarR.m0(-2026002954, function4.invoke(cVar16));
                    function7 = (Function2) k2Var.p(cVar16);
                    if (function7 == null) {
                        c0VarR.E(1618454323);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2026001778);
                        function7.invoke(c0VarR, Integer.valueOf(i22));
                        c0VarR.A();
                        Unit unit1112 = Unit.f312394a;
                    }
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                function5 = function3;
            }
            eVar2 = eVarC;
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 2;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                function3 = function1;
                if (c0VarR.k0(function3)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    eVarC = eVar;
                    if (c0VarR.D(eVarC)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 8;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 16) != 0) {
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                objI5 = c0VarR.i0();
                                if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI5 = d.f13454a;
                                    c0VarR.Y(objI5);
                                }
                                function5 = (Function1) objI5;
                            } else {
                                function5 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                            }
                            if (i17 != 0) {
                                objI4 = c0VarR.i0();
                                if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI4 = C0062e.f13455a;
                                    c0VarR.Y(objI4);
                                }
                                function4 = (Function1) objI4;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                            i20 = i12 & 14;
                            if (i20 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                                c0VarR.Y(objI0);
                            }
                            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                            if (i20 == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z12) {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = w6.h(l3Var2.p());
                                c0VarR.Y(objI1);
                            }
                            snapshotStateList = (SnapshotStateList) objI1;
                            if (i20 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z13) {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = b3.u();
                                c0VarR.Y(objI2);
                            }
                            k2Var = (k2) objI2;
                            if (!snapshotStateList.contains(l3Var2.p())) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                if (snapshotStateList.size() == 1) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                } else {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(l3Var2.p());
                                }
                                if (k2Var.v() == 1) {
                                    k2Var.K();
                                } else {
                                    k2Var.K();
                                }
                                animatedContentTransitionScopeImpl.B(eVarC);
                                animatedContentTransitionScopeImpl.C(wVar);
                            }
                            if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                                it = snapshotStateList.iterator();
                                i24 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        i24 = -1;
                                        break;
                                    } else {
                                        if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                    }
                                }
                                if (i24 == -1) {
                                    snapshotStateList.add(l3Var2.y());
                                } else {
                                    snapshotStateList.set(i24, l3Var2.y());
                                    Unit unit1113 = Unit.f312394a;
                                }
                            }
                            if (k2Var.g(l3Var2.y())) {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i21117 = i21;
                                    T t11111 = snapshotStateList.get(i21117);
                                    SnapshotStateList snapshotStateList1114 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1114 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t11111, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11111, function5, animatedContentTransitionScopeImpl1114, snapshotStateList1114, oVar2), c0VarR, 54));
                                    i21 = i21117 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1114;
                                    size = size;
                                    snapshotStateList = snapshotStateList1114;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            } else {
                                c0VarR.E(1966468977);
                                k2Var.K();
                                size = snapshotStateList.size();
                                i21 = 0;
                                while (i21 < size) {
                                    int i21118 = i21;
                                    T t11112 = snapshotStateList.get(i21118);
                                    SnapshotStateList snapshotStateList1115 = snapshotStateList;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1115 = animatedContentTransitionScopeImpl;
                                    k2Var.q0(t11112, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11112, function5, animatedContentTransitionScopeImpl1115, snapshotStateList1115, oVar2), c0VarR, 54));
                                    i21 = i21118 + 1;
                                    l3Var2 = l3Var;
                                    oVar2 = oVar;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1115;
                                    size = size;
                                    snapshotStateList = snapshotStateList1115;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i22 = 0;
                                c0VarR.A();
                            }
                            zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                            xVarI0 = c0VarR.i0();
                            if (zD) {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            } else {
                                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(xVarI0);
                            }
                            androidx.compose.ui.a0 a0VarB18 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                                c0VarR.Y(objI3);
                            }
                            androidx.compose.animation.f fVar17 = (androidx.compose.animation.f) objI3;
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                            androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarB18);
                            androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                            function0A = aVar17.a();
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
                            y7.n(c0VarD, fVar17, aVar17.e());
                            y7.n(c0VarD, b1VarK17, aVar17.g());
                            function2B = aVar17.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN17, aVar17.f());
                            c0VarR.E(-860173498);
                            size2 = snapshotStateList2.size();
                            while (i23 < size2) {
                                a0.c cVar17 = (Object) snapshotStateList2.get(i23);
                                c0VarR.m0(-2026002954, function4.invoke(cVar17));
                                function7 = (Function2) k2Var.p(cVar17);
                                if (function7 == null) {
                                    c0VarR.E(1618454323);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(-2026001778);
                                    function7.invoke(c0VarR, Integer.valueOf(i22));
                                    c0VarR.A();
                                    Unit unit1114 = Unit.f312394a;
                                }
                                c0VarR.v0();
                            }
                            c0VarR.A();
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            function5 = function3;
                        }
                        eVar2 = eVarC;
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    oVar2 = oVar;
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit1115 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i21119 = i21;
                                T t11113 = snapshotStateList.get(i21119);
                                SnapshotStateList snapshotStateList1116 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1116 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t11113, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11113, function5, animatedContentTransitionScopeImpl1116, snapshotStateList1116, oVar2), c0VarR, 54));
                                i21 = i21119 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1116;
                                size = size;
                                snapshotStateList = snapshotStateList1116;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i211110 = i21;
                                T t11114 = snapshotStateList.get(i211110);
                                SnapshotStateList snapshotStateList1117 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1117 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t11114, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11114, function5, animatedContentTransitionScopeImpl1117, snapshotStateList1117, oVar2), c0VarR, 54));
                                i21 = i211110 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1117;
                                size = size;
                                snapshotStateList = snapshotStateList1117;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB19 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar18 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarB19);
                        androidx.compose.ui.node.g.a aVar18 = androidx.compose.ui.node.g.I;
                        function0A = aVar18.a();
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
                        y7.n(c0VarD, fVar18, aVar18.e());
                        y7.n(c0VarD, b1VarK18, aVar18.g());
                        function2B = aVar18.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN18, aVar18.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar18 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar18));
                            function7 = (Function2) k2Var.p(cVar18);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit1116 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 24576;
                function4 = function2;
                if ((i11 & 16) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit1117 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i211111 = i21;
                                T t11115 = snapshotStateList.get(i211111);
                                SnapshotStateList snapshotStateList1118 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1118 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t11115, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11115, function5, animatedContentTransitionScopeImpl1118, snapshotStateList1118, oVar2), c0VarR, 54));
                                i21 = i211111 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1118;
                                size = size;
                                snapshotStateList = snapshotStateList1118;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i211112 = i21;
                                T t11116 = snapshotStateList.get(i211112);
                                SnapshotStateList snapshotStateList1119 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1119 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t11116, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11116, function5, animatedContentTransitionScopeImpl1119, snapshotStateList1119, oVar2), c0VarR, 54));
                                i21 = i211112 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1119;
                                size = size;
                                snapshotStateList = snapshotStateList1119;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB110 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar19 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarB110);
                        androidx.compose.ui.node.g.a aVar19 = androidx.compose.ui.node.g.I;
                        function0A = aVar19.a();
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
                        y7.n(c0VarD, fVar19, aVar19.e());
                        y7.n(c0VarD, b1VarK19, aVar19.g());
                        function2B = aVar19.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN19, aVar19.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar19 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar19));
                            function7 = (Function2) k2Var.p(cVar19);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit1118 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                oVar2 = oVar;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit1119 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i211113 = i21;
                            T t11117 = snapshotStateList.get(i211113);
                            SnapshotStateList snapshotStateList11110 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11110 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t11117, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11117, function5, animatedContentTransitionScopeImpl11110, snapshotStateList11110, oVar2), c0VarR, 54));
                            i21 = i211113 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11110;
                            size = size;
                            snapshotStateList = snapshotStateList11110;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i211114 = i21;
                            T t11118 = snapshotStateList.get(i211114);
                            SnapshotStateList snapshotStateList11111 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11111 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t11118, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11118, function5, animatedContentTransitionScopeImpl11111, snapshotStateList11111, oVar2), c0VarR, 54));
                            i21 = i211114 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11111;
                            size = size;
                            snapshotStateList = snapshotStateList11111;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB111 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar110 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarB111);
                    androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
                    function0A = aVar110.a();
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
                    y7.n(c0VarD, fVar110, aVar110.e());
                    y7.n(c0VarD, b1VarK110, aVar110.g());
                    function2B = aVar110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN110, aVar110.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar110 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar110));
                        function7 = (Function2) k2Var.p(cVar110);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit11110 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= 3072;
            eVarC = eVar;
            i17 = i11 & 8;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit11111 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i211115 = i21;
                                T t11119 = snapshotStateList.get(i211115);
                                SnapshotStateList snapshotStateList11112 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11112 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t11119, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11119, function5, animatedContentTransitionScopeImpl11112, snapshotStateList11112, oVar2), c0VarR, 54));
                                i21 = i211115 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11112;
                                size = size;
                                snapshotStateList = snapshotStateList11112;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i211116 = i21;
                                T t111110 = snapshotStateList.get(i211116);
                                SnapshotStateList snapshotStateList11113 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11113 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t111110, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111110, function5, animatedContentTransitionScopeImpl11113, snapshotStateList11113, oVar2), c0VarR, 54));
                                i21 = i211116 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11113;
                                size = size;
                                snapshotStateList = snapshotStateList11113;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB112 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar111 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarB112);
                        androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                        function0A = aVar111.a();
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
                        y7.n(c0VarD, fVar111, aVar111.e());
                        y7.n(c0VarD, b1VarK111, aVar111.g());
                        function2B = aVar111.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN111, aVar111.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar111 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar111));
                            function7 = (Function2) k2Var.p(cVar111);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit11112 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                oVar2 = oVar;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit11113 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i211117 = i21;
                            T t111111 = snapshotStateList.get(i211117);
                            SnapshotStateList snapshotStateList11114 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11114 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t111111, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111111, function5, animatedContentTransitionScopeImpl11114, snapshotStateList11114, oVar2), c0VarR, 54));
                            i21 = i211117 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11114;
                            size = size;
                            snapshotStateList = snapshotStateList11114;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i211118 = i21;
                            T t111112 = snapshotStateList.get(i211118);
                            SnapshotStateList snapshotStateList11115 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11115 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t111112, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111112, function5, animatedContentTransitionScopeImpl11115, snapshotStateList11115, oVar2), c0VarR, 54));
                            i21 = i211118 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11115;
                            size = size;
                            snapshotStateList = snapshotStateList11115;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB113 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar112 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarB113);
                    androidx.compose.ui.node.g.a aVar112 = androidx.compose.ui.node.g.I;
                    function0A = aVar112.a();
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
                    y7.n(c0VarD, fVar112, aVar112.e());
                    y7.n(c0VarD, b1VarK112, aVar112.g());
                    function2B = aVar112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN112, aVar112.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar112 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar112));
                        function7 = (Function2) k2Var.p(cVar112);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit11114 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= 24576;
            function4 = function2;
            if ((i11 & 16) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    oVar2 = oVar;
                    if (c0VarR.k0(oVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit11115 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i211119 = i21;
                            T t111113 = snapshotStateList.get(i211119);
                            SnapshotStateList snapshotStateList11116 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11116 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t111113, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111113, function5, animatedContentTransitionScopeImpl11116, snapshotStateList11116, oVar2), c0VarR, 54));
                            i21 = i211119 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11116;
                            size = size;
                            snapshotStateList = snapshotStateList11116;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i2111110 = i21;
                            T t111114 = snapshotStateList.get(i2111110);
                            SnapshotStateList snapshotStateList11117 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11117 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t111114, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111114, function5, animatedContentTransitionScopeImpl11117, snapshotStateList11117, oVar2), c0VarR, 54));
                            i21 = i2111110 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11117;
                            size = size;
                            snapshotStateList = snapshotStateList11117;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB114 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar113 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarB114);
                    androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
                    function0A = aVar113.a();
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
                    y7.n(c0VarD, fVar113, aVar113.e());
                    y7.n(c0VarD, b1VarK113, aVar113.g());
                    function2B = aVar113.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN113, aVar113.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar113 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar113));
                        function7 = (Function2) k2Var.p(cVar113);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit11116 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            oVar2 = oVar;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = d.f13454a;
                        c0VarR.Y(objI5);
                    }
                    function5 = (Function1) objI5;
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                }
                if (i17 != 0) {
                    objI4 = c0VarR.i0();
                    if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI4 = C0062e.f13455a;
                        c0VarR.Y(objI4);
                    }
                    function4 = (Function1) objI4;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                i20 = i12 & 14;
                if (i20 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                }
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                if (i20 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                } else {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                }
                snapshotStateList = (SnapshotStateList) objI1;
                if (i20 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = c0VarR.i0();
                if (z13) {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                } else {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                }
                k2Var = (k2) objI2;
                if (!snapshotStateList.contains(l3Var2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(l3Var2.p());
                }
                if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (k2Var.v() == 1) {
                        k2Var.K();
                    } else {
                        k2Var.K();
                    }
                    animatedContentTransitionScopeImpl.B(eVarC);
                    animatedContentTransitionScopeImpl.C(wVar);
                }
                if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    it = snapshotStateList.iterator();
                    i24 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i24 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                break;
                                break;
                            }
                            i24++;
                        }
                    }
                    if (i24 == -1) {
                        snapshotStateList.add(l3Var2.y());
                    } else {
                        snapshotStateList.set(i24, l3Var2.y());
                        Unit unit11117 = Unit.f312394a;
                    }
                }
                if (k2Var.g(l3Var2.y())) {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i2111111 = i21;
                        T t111115 = snapshotStateList.get(i2111111);
                        SnapshotStateList snapshotStateList11118 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11118 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t111115, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111115, function5, animatedContentTransitionScopeImpl11118, snapshotStateList11118, oVar2), c0VarR, 54));
                        i21 = i2111111 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11118;
                        size = size;
                        snapshotStateList = snapshotStateList11118;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i2111112 = i21;
                        T t111116 = snapshotStateList.get(i2111112);
                        SnapshotStateList snapshotStateList11119 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl11119 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t111116, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111116, function5, animatedContentTransitionScopeImpl11119, snapshotStateList11119, oVar2), c0VarR, 54));
                        i21 = i2111112 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11119;
                        size = size;
                        snapshotStateList = snapshotStateList11119;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                }
                zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                xVarI0 = c0VarR.i0();
                if (zD) {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                } else {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                }
                androidx.compose.ui.a0 a0VarB115 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                objI3 = c0VarR.i0();
                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(objI3);
                }
                androidx.compose.animation.f fVar114 = (androidx.compose.animation.f) objI3;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarB115);
                androidx.compose.ui.node.g.a aVar114 = androidx.compose.ui.node.g.I;
                function0A = aVar114.a();
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
                y7.n(c0VarD, fVar114, aVar114.e());
                y7.n(c0VarD, b1VarK114, aVar114.g());
                function2B = aVar114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN114, aVar114.f());
                c0VarR.E(-860173498);
                size2 = snapshotStateList2.size();
                while (i23 < size2) {
                    a0.c cVar114 = (Object) snapshotStateList2.get(i23);
                    c0VarR.m0(-2026002954, function4.invoke(cVar114));
                    function7 = (Function2) k2Var.p(cVar114);
                    if (function7 == null) {
                        c0VarR.E(1618454323);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2026001778);
                        function7.invoke(c0VarR, Integer.valueOf(i22));
                        c0VarR.A();
                        Unit unit11118 = Unit.f312394a;
                    }
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                function5 = function3;
            }
            eVar2 = eVarC;
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        function3 = function1;
        i15 = i11 & 4;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                eVarC = eVar;
                if (c0VarR.D(eVarC)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 8;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = d.f13454a;
                                c0VarR.Y(objI5);
                            }
                            function5 = (Function1) objI5;
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        }
                        if (i17 != 0) {
                            objI4 = c0VarR.i0();
                            if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI4 = C0062e.f13455a;
                                c0VarR.Y(objI4);
                            }
                            function4 = (Function1) objI4;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                        i20 = i12 & 14;
                        if (i20 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                            c0VarR.Y(objI0);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = w6.h(l3Var2.p());
                            c0VarR.Y(objI1);
                        }
                        snapshotStateList = (SnapshotStateList) objI1;
                        if (i20 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z13) {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = b3.u();
                            c0VarR.Y(objI2);
                        }
                        k2Var = (k2) objI2;
                        if (!snapshotStateList.contains(l3Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(l3Var2.p());
                            }
                            if (k2Var.v() == 1) {
                                k2Var.K();
                            } else {
                                k2Var.K();
                            }
                            animatedContentTransitionScopeImpl.B(eVarC);
                            animatedContentTransitionScopeImpl.C(wVar);
                        }
                        if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                            it = snapshotStateList.iterator();
                            i24 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i24 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                        break;
                                        break;
                                    }
                                    i24++;
                                }
                            }
                            if (i24 == -1) {
                                snapshotStateList.add(l3Var2.y());
                            } else {
                                snapshotStateList.set(i24, l3Var2.y());
                                Unit unit11119 = Unit.f312394a;
                            }
                        }
                        if (k2Var.g(l3Var2.y())) {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i2111113 = i21;
                                T t111117 = snapshotStateList.get(i2111113);
                                SnapshotStateList snapshotStateList111110 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111110 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t111117, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111117, function5, animatedContentTransitionScopeImpl111110, snapshotStateList111110, oVar2), c0VarR, 54));
                                i21 = i2111113 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111110;
                                size = size;
                                snapshotStateList = snapshotStateList111110;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1966468977);
                            k2Var.K();
                            size = snapshotStateList.size();
                            i21 = 0;
                            while (i21 < size) {
                                int i2111114 = i21;
                                T t111118 = snapshotStateList.get(i2111114);
                                SnapshotStateList snapshotStateList111111 = snapshotStateList;
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111111 = animatedContentTransitionScopeImpl;
                                k2Var.q0(t111118, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111118, function5, animatedContentTransitionScopeImpl111111, snapshotStateList111111, oVar2), c0VarR, 54));
                                i21 = i2111114 + 1;
                                l3Var2 = l3Var;
                                oVar2 = oVar;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111111;
                                size = size;
                                snapshotStateList = snapshotStateList111111;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i22 = 0;
                            c0VarR.A();
                        }
                        zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                        xVarI0 = c0VarR.i0();
                        if (zD) {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        } else {
                            xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(xVarI0);
                        }
                        androidx.compose.ui.a0 a0VarB116 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.animation.f fVar115 = (androidx.compose.animation.f) objI3;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.runtime.b1 b1VarK115 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarB116);
                        androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                        function0A = aVar115.a();
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
                        y7.n(c0VarD, fVar115, aVar115.e());
                        y7.n(c0VarD, b1VarK115, aVar115.g());
                        function2B = aVar115.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN115, aVar115.f());
                        c0VarR.E(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i23 < size2) {
                            a0.c cVar115 = (Object) snapshotStateList2.get(i23);
                            c0VarR.m0(-2026002954, function4.invoke(cVar115));
                            function7 = (Function2) k2Var.p(cVar115);
                            if (function7 == null) {
                                c0VarR.E(1618454323);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2026001778);
                                function7.invoke(c0VarR, Integer.valueOf(i22));
                                c0VarR.A();
                                Unit unit111110 = Unit.f312394a;
                            }
                            c0VarR.v0();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        function5 = function3;
                    }
                    eVar2 = eVarC;
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                oVar2 = oVar;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit111111 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i2111115 = i21;
                            T t111119 = snapshotStateList.get(i2111115);
                            SnapshotStateList snapshotStateList111112 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111112 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t111119, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t111119, function5, animatedContentTransitionScopeImpl111112, snapshotStateList111112, oVar2), c0VarR, 54));
                            i21 = i2111115 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111112;
                            size = size;
                            snapshotStateList = snapshotStateList111112;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i2111116 = i21;
                            T t1111110 = snapshotStateList.get(i2111116);
                            SnapshotStateList snapshotStateList111113 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111113 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1111110, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111110, function5, animatedContentTransitionScopeImpl111113, snapshotStateList111113, oVar2), c0VarR, 54));
                            i21 = i2111116 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111113;
                            size = size;
                            snapshotStateList = snapshotStateList111113;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB117 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar116 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarB117);
                    androidx.compose.ui.node.g.a aVar116 = androidx.compose.ui.node.g.I;
                    function0A = aVar116.a();
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
                    y7.n(c0VarD, fVar116, aVar116.e());
                    y7.n(c0VarD, b1VarK116, aVar116.g());
                    function2B = aVar116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN116, aVar116.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar116 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar116));
                        function7 = (Function2) k2Var.p(cVar116);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit111112 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= 24576;
            function4 = function2;
            if ((i11 & 16) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    oVar2 = oVar;
                    if (c0VarR.k0(oVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit111113 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i2111117 = i21;
                            T t1111111 = snapshotStateList.get(i2111117);
                            SnapshotStateList snapshotStateList111114 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111114 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1111111, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111111, function5, animatedContentTransitionScopeImpl111114, snapshotStateList111114, oVar2), c0VarR, 54));
                            i21 = i2111117 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111114;
                            size = size;
                            snapshotStateList = snapshotStateList111114;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i2111118 = i21;
                            T t1111112 = snapshotStateList.get(i2111118);
                            SnapshotStateList snapshotStateList111115 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111115 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1111112, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111112, function5, animatedContentTransitionScopeImpl111115, snapshotStateList111115, oVar2), c0VarR, 54));
                            i21 = i2111118 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111115;
                            size = size;
                            snapshotStateList = snapshotStateList111115;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB118 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar117 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarB118);
                    androidx.compose.ui.node.g.a aVar117 = androidx.compose.ui.node.g.I;
                    function0A = aVar117.a();
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
                    y7.n(c0VarD, fVar117, aVar117.e());
                    y7.n(c0VarD, b1VarK117, aVar117.g());
                    function2B = aVar117.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN117, aVar117.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar117 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar117));
                        function7 = (Function2) k2Var.p(cVar117);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit111114 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            oVar2 = oVar;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = d.f13454a;
                        c0VarR.Y(objI5);
                    }
                    function5 = (Function1) objI5;
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                }
                if (i17 != 0) {
                    objI4 = c0VarR.i0();
                    if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI4 = C0062e.f13455a;
                        c0VarR.Y(objI4);
                    }
                    function4 = (Function1) objI4;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                i20 = i12 & 14;
                if (i20 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                }
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                if (i20 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                } else {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                }
                snapshotStateList = (SnapshotStateList) objI1;
                if (i20 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = c0VarR.i0();
                if (z13) {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                } else {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                }
                k2Var = (k2) objI2;
                if (!snapshotStateList.contains(l3Var2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(l3Var2.p());
                }
                if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (k2Var.v() == 1) {
                        k2Var.K();
                    } else {
                        k2Var.K();
                    }
                    animatedContentTransitionScopeImpl.B(eVarC);
                    animatedContentTransitionScopeImpl.C(wVar);
                }
                if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    it = snapshotStateList.iterator();
                    i24 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i24 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                break;
                                break;
                            }
                            i24++;
                        }
                    }
                    if (i24 == -1) {
                        snapshotStateList.add(l3Var2.y());
                    } else {
                        snapshotStateList.set(i24, l3Var2.y());
                        Unit unit111115 = Unit.f312394a;
                    }
                }
                if (k2Var.g(l3Var2.y())) {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i2111119 = i21;
                        T t1111113 = snapshotStateList.get(i2111119);
                        SnapshotStateList snapshotStateList111116 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111116 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t1111113, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111113, function5, animatedContentTransitionScopeImpl111116, snapshotStateList111116, oVar2), c0VarR, 54));
                        i21 = i2111119 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111116;
                        size = size;
                        snapshotStateList = snapshotStateList111116;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i21111110 = i21;
                        T t1111114 = snapshotStateList.get(i21111110);
                        SnapshotStateList snapshotStateList111117 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111117 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t1111114, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111114, function5, animatedContentTransitionScopeImpl111117, snapshotStateList111117, oVar2), c0VarR, 54));
                        i21 = i21111110 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111117;
                        size = size;
                        snapshotStateList = snapshotStateList111117;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                }
                zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                xVarI0 = c0VarR.i0();
                if (zD) {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                } else {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                }
                androidx.compose.ui.a0 a0VarB119 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                objI3 = c0VarR.i0();
                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(objI3);
                }
                androidx.compose.animation.f fVar118 = (androidx.compose.animation.f) objI3;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                androidx.compose.runtime.b1 b1VarK118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarB119);
                androidx.compose.ui.node.g.a aVar118 = androidx.compose.ui.node.g.I;
                function0A = aVar118.a();
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
                y7.n(c0VarD, fVar118, aVar118.e());
                y7.n(c0VarD, b1VarK118, aVar118.g());
                function2B = aVar118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN118, aVar118.f());
                c0VarR.E(-860173498);
                size2 = snapshotStateList2.size();
                while (i23 < size2) {
                    a0.c cVar118 = (Object) snapshotStateList2.get(i23);
                    c0VarR.m0(-2026002954, function4.invoke(cVar118));
                    function7 = (Function2) k2Var.p(cVar118);
                    if (function7 == null) {
                        c0VarR.E(1618454323);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2026001778);
                        function7.invoke(c0VarR, Integer.valueOf(i22));
                        c0VarR.A();
                        Unit unit111116 = Unit.f312394a;
                    }
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                function5 = function3;
            }
            eVar2 = eVarC;
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
            }
        }
        i12 |= 3072;
        eVarC = eVar;
        i17 = i11 & 8;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                function4 = function2;
                if (c0VarR.k0(function4)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    oVar2 = oVar;
                    if (c0VarR.k0(oVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = d.f13454a;
                            c0VarR.Y(objI5);
                        }
                        function5 = (Function1) objI5;
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    }
                    if (i17 != 0) {
                        objI4 = c0VarR.i0();
                        if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI4 = C0062e.f13455a;
                            c0VarR.Y(objI4);
                        }
                        function4 = (Function1) objI4;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    i20 = i12 & 14;
                    if (i20 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                        c0VarR.Y(objI0);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                    if (i20 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = w6.h(l3Var2.p());
                        c0VarR.Y(objI1);
                    }
                    snapshotStateList = (SnapshotStateList) objI1;
                    if (i20 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z13) {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = b3.u();
                        c0VarR.Y(objI2);
                    }
                    k2Var = (k2) objI2;
                    if (!snapshotStateList.contains(l3Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(l3Var2.p());
                        }
                        if (k2Var.v() == 1) {
                            k2Var.K();
                        } else {
                            k2Var.K();
                        }
                        animatedContentTransitionScopeImpl.B(eVarC);
                        animatedContentTransitionScopeImpl.C(wVar);
                    }
                    if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                        it = snapshotStateList.iterator();
                        i24 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i24 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                    break;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i24 == -1) {
                            snapshotStateList.add(l3Var2.y());
                        } else {
                            snapshotStateList.set(i24, l3Var2.y());
                            Unit unit111117 = Unit.f312394a;
                        }
                    }
                    if (k2Var.g(l3Var2.y())) {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i21111111 = i21;
                            T t1111115 = snapshotStateList.get(i21111111);
                            SnapshotStateList snapshotStateList111118 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111118 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1111115, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111115, function5, animatedContentTransitionScopeImpl111118, snapshotStateList111118, oVar2), c0VarR, 54));
                            i21 = i21111111 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111118;
                            size = size;
                            snapshotStateList = snapshotStateList111118;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1966468977);
                        k2Var.K();
                        size = snapshotStateList.size();
                        i21 = 0;
                        while (i21 < size) {
                            int i21111112 = i21;
                            T t1111116 = snapshotStateList.get(i21111112);
                            SnapshotStateList snapshotStateList111119 = snapshotStateList;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl111119 = animatedContentTransitionScopeImpl;
                            k2Var.q0(t1111116, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111116, function5, animatedContentTransitionScopeImpl111119, snapshotStateList111119, oVar2), c0VarR, 54));
                            i21 = i21111112 + 1;
                            l3Var2 = l3Var;
                            oVar2 = oVar;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111119;
                            size = size;
                            snapshotStateList = snapshotStateList111119;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i22 = 0;
                        c0VarR.A();
                    }
                    zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                    xVarI0 = c0VarR.i0();
                    if (zD) {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    } else {
                        xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(xVarI0);
                    }
                    androidx.compose.ui.a0 a0VarB1110 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.animation.f fVar119 = (androidx.compose.animation.f) objI3;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.runtime.b1 b1VarK119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0VarB1110);
                    androidx.compose.ui.node.g.a aVar119 = androidx.compose.ui.node.g.I;
                    function0A = aVar119.a();
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
                    y7.n(c0VarD, fVar119, aVar119.e());
                    y7.n(c0VarD, b1VarK119, aVar119.g());
                    function2B = aVar119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN119, aVar119.f());
                    c0VarR.E(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i23 < size2) {
                        a0.c cVar119 = (Object) snapshotStateList2.get(i23);
                        c0VarR.m0(-2026002954, function4.invoke(cVar119));
                        function7 = (Function2) k2Var.p(cVar119);
                        if (function7 == null) {
                            c0VarR.E(1618454323);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2026001778);
                            function7.invoke(c0VarR, Integer.valueOf(i22));
                            c0VarR.A();
                            Unit unit111118 = Unit.f312394a;
                        }
                        c0VarR.v0();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function5 = function3;
                }
                eVar2 = eVarC;
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            oVar2 = oVar;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = d.f13454a;
                        c0VarR.Y(objI5);
                    }
                    function5 = (Function1) objI5;
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                }
                if (i17 != 0) {
                    objI4 = c0VarR.i0();
                    if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI4 = C0062e.f13455a;
                        c0VarR.Y(objI4);
                    }
                    function4 = (Function1) objI4;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                i20 = i12 & 14;
                if (i20 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                }
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                if (i20 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                } else {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                }
                snapshotStateList = (SnapshotStateList) objI1;
                if (i20 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = c0VarR.i0();
                if (z13) {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                } else {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                }
                k2Var = (k2) objI2;
                if (!snapshotStateList.contains(l3Var2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(l3Var2.p());
                }
                if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (k2Var.v() == 1) {
                        k2Var.K();
                    } else {
                        k2Var.K();
                    }
                    animatedContentTransitionScopeImpl.B(eVarC);
                    animatedContentTransitionScopeImpl.C(wVar);
                }
                if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    it = snapshotStateList.iterator();
                    i24 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i24 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                break;
                                break;
                            }
                            i24++;
                        }
                    }
                    if (i24 == -1) {
                        snapshotStateList.add(l3Var2.y());
                    } else {
                        snapshotStateList.set(i24, l3Var2.y());
                        Unit unit111119 = Unit.f312394a;
                    }
                }
                if (k2Var.g(l3Var2.y())) {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i21111113 = i21;
                        T t1111117 = snapshotStateList.get(i21111113);
                        SnapshotStateList snapshotStateList1111110 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1111110 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t1111117, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111117, function5, animatedContentTransitionScopeImpl1111110, snapshotStateList1111110, oVar2), c0VarR, 54));
                        i21 = i21111113 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1111110;
                        size = size;
                        snapshotStateList = snapshotStateList1111110;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i21111114 = i21;
                        T t1111118 = snapshotStateList.get(i21111114);
                        SnapshotStateList snapshotStateList1111111 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1111111 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t1111118, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111118, function5, animatedContentTransitionScopeImpl1111111, snapshotStateList1111111, oVar2), c0VarR, 54));
                        i21 = i21111114 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1111111;
                        size = size;
                        snapshotStateList = snapshotStateList1111111;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                }
                zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                xVarI0 = c0VarR.i0();
                if (zD) {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                } else {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                }
                androidx.compose.ui.a0 a0VarB1111 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                objI3 = c0VarR.i0();
                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(objI3);
                }
                androidx.compose.animation.f fVar1110 = (androidx.compose.animation.f) objI3;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                androidx.compose.runtime.b1 b1VarK1110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarB1111);
                androidx.compose.ui.node.g.a aVar1110 = androidx.compose.ui.node.g.I;
                function0A = aVar1110.a();
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
                y7.n(c0VarD, fVar1110, aVar1110.e());
                y7.n(c0VarD, b1VarK1110, aVar1110.g());
                function2B = aVar1110.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1110, aVar1110.f());
                c0VarR.E(-860173498);
                size2 = snapshotStateList2.size();
                while (i23 < size2) {
                    a0.c cVar1110 = (Object) snapshotStateList2.get(i23);
                    c0VarR.m0(-2026002954, function4.invoke(cVar1110));
                    function7 = (Function2) k2Var.p(cVar1110);
                    if (function7 == null) {
                        c0VarR.E(1618454323);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2026001778);
                        function7.invoke(c0VarR, Integer.valueOf(i22));
                        c0VarR.A();
                        Unit unit1111110 = Unit.f312394a;
                    }
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                function5 = function3;
            }
            eVar2 = eVarC;
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
            }
        }
        i12 |= 24576;
        function4 = function2;
        if ((i11 & 16) != 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                oVar2 = oVar;
                if (c0VarR.k0(oVar2)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = d.f13454a;
                        c0VarR.Y(objI5);
                    }
                    function5 = (Function1) objI5;
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                }
                if (i17 != 0) {
                    objI4 = c0VarR.i0();
                    if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI4 = C0062e.f13455a;
                        c0VarR.Y(objI4);
                    }
                    function4 = (Function1) objI4;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                i20 = i12 & 14;
                if (i20 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                    c0VarR.Y(objI0);
                }
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
                if (i20 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                } else {
                    objI1 = w6.h(l3Var2.p());
                    c0VarR.Y(objI1);
                }
                snapshotStateList = (SnapshotStateList) objI1;
                if (i20 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = c0VarR.i0();
                if (z13) {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                } else {
                    objI2 = b3.u();
                    c0VarR.Y(objI2);
                }
                k2Var = (k2) objI2;
                if (!snapshotStateList.contains(l3Var2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(l3Var2.p());
                }
                if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(l3Var2.p());
                    }
                    if (k2Var.v() == 1) {
                        k2Var.K();
                    } else {
                        k2Var.K();
                    }
                    animatedContentTransitionScopeImpl.B(eVarC);
                    animatedContentTransitionScopeImpl.C(wVar);
                }
                if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                    it = snapshotStateList.iterator();
                    i24 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i24 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                                break;
                                break;
                            }
                            i24++;
                        }
                    }
                    if (i24 == -1) {
                        snapshotStateList.add(l3Var2.y());
                    } else {
                        snapshotStateList.set(i24, l3Var2.y());
                        Unit unit1111111 = Unit.f312394a;
                    }
                }
                if (k2Var.g(l3Var2.y())) {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i21111115 = i21;
                        T t1111119 = snapshotStateList.get(i21111115);
                        SnapshotStateList snapshotStateList1111112 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1111112 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t1111119, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t1111119, function5, animatedContentTransitionScopeImpl1111112, snapshotStateList1111112, oVar2), c0VarR, 54));
                        i21 = i21111115 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1111112;
                        size = size;
                        snapshotStateList = snapshotStateList1111112;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1966468977);
                    k2Var.K();
                    size = snapshotStateList.size();
                    i21 = 0;
                    while (i21 < size) {
                        int i21111116 = i21;
                        T t11111110 = snapshotStateList.get(i21111116);
                        SnapshotStateList snapshotStateList1111113 = snapshotStateList;
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1111113 = animatedContentTransitionScopeImpl;
                        k2Var.q0(t11111110, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11111110, function5, animatedContentTransitionScopeImpl1111113, snapshotStateList1111113, oVar2), c0VarR, 54));
                        i21 = i21111116 + 1;
                        l3Var2 = l3Var;
                        oVar2 = oVar;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1111113;
                        size = size;
                        snapshotStateList = snapshotStateList1111113;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i22 = 0;
                    c0VarR.A();
                }
                zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
                xVarI0 = c0VarR.i0();
                if (zD) {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                } else {
                    xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(xVarI0);
                }
                androidx.compose.ui.a0 a0VarB1112 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
                objI3 = c0VarR.i0();
                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                    c0VarR.Y(objI3);
                }
                androidx.compose.animation.f fVar1111 = (androidx.compose.animation.f) objI3;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                androidx.compose.runtime.b1 b1VarK1111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarB1112);
                androidx.compose.ui.node.g.a aVar1111 = androidx.compose.ui.node.g.I;
                function0A = aVar1111.a();
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
                y7.n(c0VarD, fVar1111, aVar1111.e());
                y7.n(c0VarD, b1VarK1111, aVar1111.g());
                function2B = aVar1111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1111, aVar1111.f());
                c0VarR.E(-860173498);
                size2 = snapshotStateList2.size();
                while (i23 < size2) {
                    a0.c cVar1111 = (Object) snapshotStateList2.get(i23);
                    c0VarR.m0(-2026002954, function4.invoke(cVar1111));
                    function7 = (Function2) k2Var.p(cVar1111);
                    if (function7 == null) {
                        c0VarR.E(1618454323);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2026001778);
                        function7.invoke(c0VarR, Integer.valueOf(i22));
                        c0VarR.A();
                        Unit unit1111112 = Unit.f312394a;
                    }
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                function5 = function3;
            }
            eVar2 = eVarC;
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        oVar2 = oVar;
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i25 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                objI5 = c0VarR.i0();
                if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI5 = d.f13454a;
                    c0VarR.Y(objI5);
                }
                function5 = (Function1) objI5;
            } else {
                function5 = function3;
            }
            if (i15 != 0) {
                eVarC = androidx.compose.ui.e.f37317a.C();
            }
            if (i17 != 0) {
                objI4 = c0VarR.i0();
                if (objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI4 = C0062e.f13455a;
                    c0VarR.Y(objI4);
                }
                function4 = (Function1) objI4;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(511725103, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
            }
            wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
            i20 = i12 & 14;
            if (i20 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                c0VarR.Y(objI0);
            } else {
                objI0 = new AnimatedContentTransitionScopeImpl(l3Var2, eVarC, wVar);
                c0VarR.Y(objI0);
            }
            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objI0;
            if (i20 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI1 = c0VarR.i0();
            if (z12) {
                objI1 = w6.h(l3Var2.p());
                c0VarR.Y(objI1);
            } else {
                objI1 = w6.h(l3Var2.p());
                c0VarR.Y(objI1);
            }
            snapshotStateList = (SnapshotStateList) objI1;
            if (i20 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            objI2 = c0VarR.i0();
            if (z13) {
                objI2 = b3.u();
                c0VarR.Y(objI2);
            } else {
                objI2 = b3.u();
                c0VarR.Y(objI2);
            }
            k2Var = (k2) objI2;
            if (!snapshotStateList.contains(l3Var2.p())) {
                snapshotStateList.clear();
                snapshotStateList.add(l3Var2.p());
            }
            if (Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                if (snapshotStateList.size() == 1) {
                    snapshotStateList.clear();
                    snapshotStateList.add(l3Var2.p());
                } else {
                    snapshotStateList.clear();
                    snapshotStateList.add(l3Var2.p());
                }
                if (k2Var.v() == 1) {
                    k2Var.K();
                } else {
                    k2Var.K();
                }
                animatedContentTransitionScopeImpl.B(eVarC);
                animatedContentTransitionScopeImpl.C(wVar);
            }
            if (!Intrinsics.areEqual(l3Var2.p(), l3Var2.y())) {
                it = snapshotStateList.iterator();
                i24 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i24 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(function4.invoke((Object) it.next()), function4.invoke(l3Var2.y()))) {
                            break;
                            break;
                        }
                        i24++;
                    }
                }
                if (i24 == -1) {
                    snapshotStateList.add(l3Var2.y());
                } else {
                    snapshotStateList.set(i24, l3Var2.y());
                    Unit unit1111113 = Unit.f312394a;
                }
            }
            if (k2Var.g(l3Var2.y())) {
                c0VarR.E(1966468977);
                k2Var.K();
                size = snapshotStateList.size();
                i21 = 0;
                while (i21 < size) {
                    int i21111117 = i21;
                    T t11111111 = snapshotStateList.get(i21111117);
                    SnapshotStateList snapshotStateList1111114 = snapshotStateList;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1111114 = animatedContentTransitionScopeImpl;
                    k2Var.q0(t11111111, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11111111, function5, animatedContentTransitionScopeImpl1111114, snapshotStateList1111114, oVar2), c0VarR, 54));
                    i21 = i21111117 + 1;
                    l3Var2 = l3Var;
                    oVar2 = oVar;
                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1111114;
                    size = size;
                    snapshotStateList = snapshotStateList1111114;
                }
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                snapshotStateList2 = snapshotStateList;
                i22 = 0;
                c0VarR.A();
            } else {
                c0VarR.E(1966468977);
                k2Var.K();
                size = snapshotStateList.size();
                i21 = 0;
                while (i21 < size) {
                    int i21111118 = i21;
                    T t11111112 = snapshotStateList.get(i21111118);
                    SnapshotStateList snapshotStateList1111115 = snapshotStateList;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1111115 = animatedContentTransitionScopeImpl;
                    k2Var.q0(t11111112, androidx.compose.runtime.internal.w.e(-23915175, true, new f(l3Var2, t11111112, function5, animatedContentTransitionScopeImpl1111115, snapshotStateList1111115, oVar2), c0VarR, 54));
                    i21 = i21111118 + 1;
                    l3Var2 = l3Var;
                    oVar2 = oVar;
                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1111115;
                    size = size;
                    snapshotStateList = snapshotStateList1111115;
                }
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                snapshotStateList2 = snapshotStateList;
                i22 = 0;
                c0VarR.A();
            }
            zD = c0VarR.D(l3Var.w()) | c0VarR.D(animatedContentTransitionScopeImpl2);
            xVarI0 = c0VarR.i0();
            if (zD) {
                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                c0VarR.Y(xVarI0);
            } else {
                xVarI0 = function5.invoke(animatedContentTransitionScopeImpl2);
                c0VarR.Y(xVarI0);
            }
            androidx.compose.ui.a0 a0VarB1113 = a0Var4.B2(animatedContentTransitionScopeImpl2.p((x) xVarI0, c0VarR, i22));
            objI3 = c0VarR.i0();
            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = new androidx.compose.animation.f(animatedContentTransitionScopeImpl2);
                c0VarR.Y(objI3);
            }
            androidx.compose.animation.f fVar1112 = (androidx.compose.animation.f) objI3;
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
            androidx.compose.runtime.b1 b1VarK1112 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, a0VarB1113);
            androidx.compose.ui.node.g.a aVar1112 = androidx.compose.ui.node.g.I;
            function0A = aVar1112.a();
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
            y7.n(c0VarD, fVar1112, aVar1112.e());
            y7.n(c0VarD, b1VarK1112, aVar1112.g());
            function2B = aVar1112.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1112, aVar1112.f());
            c0VarR.E(-860173498);
            size2 = snapshotStateList2.size();
            while (i23 < size2) {
                a0.c cVar1112 = (Object) snapshotStateList2.get(i23);
                c0VarR.m0(-2026002954, function4.invoke(cVar1112));
                function7 = (Function2) k2Var.p(cVar1112);
                if (function7 == null) {
                    c0VarR.E(1618454323);
                    c0VarR.A();
                } else {
                    c0VarR.E(-2026001778);
                    function7.invoke(c0VarR, Integer.valueOf(i22));
                    c0VarR.A();
                    Unit unit1111114 = Unit.f312394a;
                }
                c0VarR.v0();
            }
            c0VarR.A();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            function5 = function3;
        }
        eVar2 = eVarC;
        function6 = function4;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new g(l3Var, a0Var3, function5, eVar2, function6, oVar, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0131  */
    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x017f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0189  */
    /* JADX WARN: Code duplicated, block: B:119:0x019d  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    @androidx.compose.runtime.o
    public static final <S> void b(S s10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function1<? super i<S>, x> function1, @Nullable androidx.compose.ui.e eVar, @Nullable String str, @Nullable Function1<? super S, ? extends Object> function2, @NotNull pj.o<? super androidx.compose.animation.g, ? super S, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        int i13;
        Function1<? super i<S>, x> function3;
        int i14;
        int i15;
        androidx.compose.ui.e eVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        Function1<? super S, ? extends Object> function4;
        int i20;
        pj.o<? super androidx.compose.animation.g, ? super S, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar2;
        int i21;
        boolean z10;
        androidx.compose.ui.a0 a0Var2;
        String str2;
        Function1<? super i<S>, x> function5;
        androidx.compose.ui.e eVar3;
        Function1<? super S, ? extends Object> function6;
        s5 s5VarT;
        int i22;
        androidx.compose.ui.a0 a0Var3;
        Function1<? super i<S>, x> function7;
        int i23;
        androidx.compose.ui.e eVarC;
        String str3;
        Object objI0;
        Object objI1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1501828832);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(s10) : c0VarR.k0(s10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.D(a0Var) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    function3 = function1;
                    if (c0VarR.k0(function3)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        eVar2 = eVar;
                        if (c0VarR.D(eVar2)) {
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
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            if ((196608 & i10) == 0) {
                                function4 = function2;
                                if (c0VarR.k0(function4)) {
                                    i20 = 131072;
                                } else {
                                    i20 = 65536;
                                }
                                i12 |= i20;
                            }
                            if ((i11 & 64) != 0) {
                                if ((i10 & 1572864) == 0) {
                                    oVar2 = oVar;
                                    if (c0VarR.k0(oVar2)) {
                                        i21 = 1048576;
                                    } else {
                                        i21 = 524288;
                                    }
                                    i12 |= i21;
                                }
                                if ((i12 & 599187) != 599186) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (c0VarR.h(z10, i12 & 1)) {
                                    if (i24 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                        i22 = i17;
                                    } else {
                                        i22 = i17;
                                        a0Var3 = a0Var;
                                    }
                                    if (i13 != 0) {
                                        objI1 = c0VarR.i0();
                                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                            objI1 = a.f13443a;
                                            c0VarR.Y(objI1);
                                        }
                                        function7 = (Function1) objI1;
                                    } else {
                                        function7 = function3;
                                    }
                                    if (i15 != 0) {
                                        eVarC = androidx.compose.ui.e.f37317a.C();
                                        i23 = i19;
                                    } else {
                                        i23 = i19;
                                        eVarC = eVar2;
                                    }
                                    if (i22 != 0) {
                                        str3 = "AnimatedContent";
                                    } else {
                                        str3 = str;
                                    }
                                    if (i23 != 0) {
                                        objI0 = c0VarR.i0();
                                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                            objI0 = b.f13444a;
                                            c0VarR.Y(objI0);
                                        }
                                        function4 = (Function1) objI0;
                                    }
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                    }
                                    l3 l3VarJ = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                                    int i25 = i12 & 8176;
                                    int i26 = i12 >> 3;
                                    a(l3VarJ, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i25 | (57344 & i26) | (i26 & 458752), 0);
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    str2 = str3;
                                    a0Var2 = a0Var3;
                                    function5 = function7;
                                    eVar3 = eVarC;
                                } else {
                                    c0VarR.u();
                                    a0Var2 = a0Var;
                                    str2 = str;
                                    function5 = function3;
                                    eVar3 = eVar2;
                                }
                                function6 = function4;
                                s5VarT = c0VarR.T();
                                if (s5VarT != null) {
                                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                                }
                            }
                            i12 |= 1572864;
                            oVar2 = oVar;
                            if ((i12 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i12 & 1)) {
                                if (i24 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                    i22 = i17;
                                } else {
                                    i22 = i17;
                                    a0Var3 = a0Var;
                                }
                                if (i13 != 0) {
                                    objI1 = c0VarR.i0();
                                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = a.f13443a;
                                        c0VarR.Y(objI1);
                                    }
                                    function7 = (Function1) objI1;
                                } else {
                                    function7 = function3;
                                }
                                if (i15 != 0) {
                                    eVarC = androidx.compose.ui.e.f37317a.C();
                                    i23 = i19;
                                } else {
                                    i23 = i19;
                                    eVarC = eVar2;
                                }
                                if (i22 != 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str;
                                }
                                if (i23 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = b.f13444a;
                                        c0VarR.Y(objI0);
                                    }
                                    function4 = (Function1) objI0;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                l3 l3VarJ2 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                                int i27 = i12 & 8176;
                                int i28 = i12 >> 3;
                                a(l3VarJ2, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i27 | (57344 & i28) | (i28 & 458752), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                str2 = str3;
                                a0Var2 = a0Var3;
                                function5 = function7;
                                eVar3 = eVarC;
                            } else {
                                c0VarR.u();
                                a0Var2 = a0Var;
                                str2 = str;
                                function5 = function3;
                                eVar3 = eVar2;
                            }
                            function6 = function4;
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                            }
                        }
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        function4 = function2;
                        if ((i11 & 64) != 0) {
                            if ((i10 & 1572864) == 0) {
                                oVar2 = oVar;
                                if (c0VarR.k0(oVar2)) {
                                    i21 = 1048576;
                                } else {
                                    i21 = 524288;
                                }
                                i12 |= i21;
                            }
                            if ((i12 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i12 & 1)) {
                                if (i24 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                    i22 = i17;
                                } else {
                                    i22 = i17;
                                    a0Var3 = a0Var;
                                }
                                if (i13 != 0) {
                                    objI1 = c0VarR.i0();
                                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = a.f13443a;
                                        c0VarR.Y(objI1);
                                    }
                                    function7 = (Function1) objI1;
                                } else {
                                    function7 = function3;
                                }
                                if (i15 != 0) {
                                    eVarC = androidx.compose.ui.e.f37317a.C();
                                    i23 = i19;
                                } else {
                                    i23 = i19;
                                    eVarC = eVar2;
                                }
                                if (i22 != 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str;
                                }
                                if (i23 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = b.f13444a;
                                        c0VarR.Y(objI0);
                                    }
                                    function4 = (Function1) objI0;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                l3 l3VarJ3 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                                int i29 = i12 & 8176;
                                int i210 = i12 >> 3;
                                a(l3VarJ3, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i29 | (57344 & i210) | (i210 & 458752), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                str2 = str3;
                                a0Var2 = a0Var3;
                                function5 = function7;
                                eVar3 = eVarC;
                            } else {
                                c0VarR.u();
                                a0Var2 = a0Var;
                                str2 = str;
                                function5 = function3;
                                eVar3 = eVar2;
                            }
                            function6 = function4;
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                            }
                        }
                        i12 |= 1572864;
                        oVar2 = oVar;
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ4 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i211 = i12 & 8176;
                            int i212 = i12 >> 3;
                            a(l3VarJ4, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211 | (57344 & i212) | (i212 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 24576;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((196608 & i10) == 0) {
                            function4 = function2;
                            if (c0VarR.k0(function4)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 1572864) == 0) {
                                oVar2 = oVar;
                                if (c0VarR.k0(oVar2)) {
                                    i21 = 1048576;
                                } else {
                                    i21 = 524288;
                                }
                                i12 |= i21;
                            }
                            if ((i12 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i12 & 1)) {
                                if (i24 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                    i22 = i17;
                                } else {
                                    i22 = i17;
                                    a0Var3 = a0Var;
                                }
                                if (i13 != 0) {
                                    objI1 = c0VarR.i0();
                                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = a.f13443a;
                                        c0VarR.Y(objI1);
                                    }
                                    function7 = (Function1) objI1;
                                } else {
                                    function7 = function3;
                                }
                                if (i15 != 0) {
                                    eVarC = androidx.compose.ui.e.f37317a.C();
                                    i23 = i19;
                                } else {
                                    i23 = i19;
                                    eVarC = eVar2;
                                }
                                if (i22 != 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str;
                                }
                                if (i23 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = b.f13444a;
                                        c0VarR.Y(objI0);
                                    }
                                    function4 = (Function1) objI0;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                l3 l3VarJ5 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                                int i213 = i12 & 8176;
                                int i214 = i12 >> 3;
                                a(l3VarJ5, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i213 | (57344 & i214) | (i214 & 458752), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                str2 = str3;
                                a0Var2 = a0Var3;
                                function5 = function7;
                                eVar3 = eVarC;
                            } else {
                                c0VarR.u();
                                a0Var2 = a0Var;
                                str2 = str;
                                function5 = function3;
                                eVar3 = eVar2;
                            }
                            function6 = function4;
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                            }
                        }
                        i12 |= 1572864;
                        oVar2 = oVar;
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ6 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i215 = i12 & 8176;
                            int i216 = i12 >> 3;
                            a(l3VarJ6, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i215 | (57344 & i216) | (i216 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function4 = function2;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ7 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i217 = i12 & 8176;
                            int i218 = i12 >> 3;
                            a(l3VarJ7, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i217 | (57344 & i218) | (i218 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ8 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i219 = i12 & 8176;
                        int i2110 = i12 >> 3;
                        a(l3VarJ8, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i219 | (57344 & i2110) | (i2110 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 3072;
                eVar2 = eVar;
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
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((196608 & i10) == 0) {
                            function4 = function2;
                            if (c0VarR.k0(function4)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 1572864) == 0) {
                                oVar2 = oVar;
                                if (c0VarR.k0(oVar2)) {
                                    i21 = 1048576;
                                } else {
                                    i21 = 524288;
                                }
                                i12 |= i21;
                            }
                            if ((i12 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i12 & 1)) {
                                if (i24 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                    i22 = i17;
                                } else {
                                    i22 = i17;
                                    a0Var3 = a0Var;
                                }
                                if (i13 != 0) {
                                    objI1 = c0VarR.i0();
                                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = a.f13443a;
                                        c0VarR.Y(objI1);
                                    }
                                    function7 = (Function1) objI1;
                                } else {
                                    function7 = function3;
                                }
                                if (i15 != 0) {
                                    eVarC = androidx.compose.ui.e.f37317a.C();
                                    i23 = i19;
                                } else {
                                    i23 = i19;
                                    eVarC = eVar2;
                                }
                                if (i22 != 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str;
                                }
                                if (i23 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = b.f13444a;
                                        c0VarR.Y(objI0);
                                    }
                                    function4 = (Function1) objI0;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                l3 l3VarJ9 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                                int i2111 = i12 & 8176;
                                int i2112 = i12 >> 3;
                                a(l3VarJ9, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111 | (57344 & i2112) | (i2112 & 458752), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                str2 = str3;
                                a0Var2 = a0Var3;
                                function5 = function7;
                                eVar3 = eVarC;
                            } else {
                                c0VarR.u();
                                a0Var2 = a0Var;
                                str2 = str;
                                function5 = function3;
                                eVar3 = eVar2;
                            }
                            function6 = function4;
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                            }
                        }
                        i12 |= 1572864;
                        oVar2 = oVar;
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ10 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i2113 = i12 & 8176;
                            int i2114 = i12 >> 3;
                            a(l3VarJ10, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2113 | (57344 & i2114) | (i2114 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function4 = function2;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ11 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i2115 = i12 & 8176;
                            int i2116 = i12 >> 3;
                            a(l3VarJ11, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2115 | (57344 & i2116) | (i2116 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ12 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i2117 = i12 & 8176;
                        int i2118 = i12 >> 3;
                        a(l3VarJ12, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2117 | (57344 & i2118) | (i2118 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 24576;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ13 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i2119 = i12 & 8176;
                            int i21110 = i12 >> 3;
                            a(l3VarJ13, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2119 | (57344 & i21110) | (i21110 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ14 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i21111 = i12 & 8176;
                        int i21112 = i12 >> 3;
                        a(l3VarJ14, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111 | (57344 & i21112) | (i21112 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function2;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ15 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i21113 = i12 & 8176;
                        int i21114 = i12 >> 3;
                        a(l3VarJ15, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21113 | (57344 & i21114) | (i21114 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ16 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i21115 = i12 & 8176;
                    int i21116 = i12 >> 3;
                    a(l3VarJ16, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21115 | (57344 & i21116) | (i21116 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= a5.S0;
            function3 = function1;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    eVar2 = eVar;
                    if (c0VarR.D(eVar2)) {
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
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((196608 & i10) == 0) {
                            function4 = function2;
                            if (c0VarR.k0(function4)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 1572864) == 0) {
                                oVar2 = oVar;
                                if (c0VarR.k0(oVar2)) {
                                    i21 = 1048576;
                                } else {
                                    i21 = 524288;
                                }
                                i12 |= i21;
                            }
                            if ((i12 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i12 & 1)) {
                                if (i24 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                    i22 = i17;
                                } else {
                                    i22 = i17;
                                    a0Var3 = a0Var;
                                }
                                if (i13 != 0) {
                                    objI1 = c0VarR.i0();
                                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = a.f13443a;
                                        c0VarR.Y(objI1);
                                    }
                                    function7 = (Function1) objI1;
                                } else {
                                    function7 = function3;
                                }
                                if (i15 != 0) {
                                    eVarC = androidx.compose.ui.e.f37317a.C();
                                    i23 = i19;
                                } else {
                                    i23 = i19;
                                    eVarC = eVar2;
                                }
                                if (i22 != 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str;
                                }
                                if (i23 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = b.f13444a;
                                        c0VarR.Y(objI0);
                                    }
                                    function4 = (Function1) objI0;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                l3 l3VarJ17 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                                int i21117 = i12 & 8176;
                                int i21118 = i12 >> 3;
                                a(l3VarJ17, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21117 | (57344 & i21118) | (i21118 & 458752), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                str2 = str3;
                                a0Var2 = a0Var3;
                                function5 = function7;
                                eVar3 = eVarC;
                            } else {
                                c0VarR.u();
                                a0Var2 = a0Var;
                                str2 = str;
                                function5 = function3;
                                eVar3 = eVar2;
                            }
                            function6 = function4;
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                            }
                        }
                        i12 |= 1572864;
                        oVar2 = oVar;
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ18 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i21119 = i12 & 8176;
                            int i211110 = i12 >> 3;
                            a(l3VarJ18, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21119 | (57344 & i211110) | (i211110 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function4 = function2;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ19 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i211111 = i12 & 8176;
                            int i211112 = i12 >> 3;
                            a(l3VarJ19, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111 | (57344 & i211112) | (i211112 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ110 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i211113 = i12 & 8176;
                        int i211114 = i12 >> 3;
                        a(l3VarJ110, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211113 | (57344 & i211114) | (i211114 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 24576;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ111 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i211115 = i12 & 8176;
                            int i211116 = i12 >> 3;
                            a(l3VarJ111, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211115 | (57344 & i211116) | (i211116 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ112 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i211117 = i12 & 8176;
                        int i211118 = i12 >> 3;
                        a(l3VarJ112, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211117 | (57344 & i211118) | (i211118 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function2;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ113 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i211119 = i12 & 8176;
                        int i2111110 = i12 >> 3;
                        a(l3VarJ113, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211119 | (57344 & i2111110) | (i2111110 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ114 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i2111111 = i12 & 8176;
                    int i2111112 = i12 >> 3;
                    a(l3VarJ114, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111 | (57344 & i2111112) | (i2111112 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 3072;
            eVar2 = eVar;
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
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ115 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i2111113 = i12 & 8176;
                            int i2111114 = i12 >> 3;
                            a(l3VarJ115, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111113 | (57344 & i2111114) | (i2111114 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ116 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i2111115 = i12 & 8176;
                        int i2111116 = i12 >> 3;
                        a(l3VarJ116, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111115 | (57344 & i2111116) | (i2111116 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function2;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ117 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i2111117 = i12 & 8176;
                        int i2111118 = i12 >> 3;
                        a(l3VarJ117, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111117 | (57344 & i2111118) | (i2111118 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ118 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i2111119 = i12 & 8176;
                    int i21111110 = i12 >> 3;
                    a(l3VarJ118, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111119 | (57344 & i21111110) | (i21111110 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 24576;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ119 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i21111111 = i12 & 8176;
                        int i21111112 = i12 >> 3;
                        a(l3VarJ119, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111 | (57344 & i21111112) | (i21111112 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ1110 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i21111113 = i12 & 8176;
                    int i21111114 = i12 >> 3;
                    a(l3VarJ1110, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111113 | (57344 & i21111114) | (i21111114 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function2;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    oVar2 = oVar;
                    if (c0VarR.k0(oVar2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ1111 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i21111115 = i12 & 8176;
                    int i21111116 = i12 >> 3;
                    a(l3VarJ1111, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111115 | (57344 & i21111116) | (i21111116 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 1572864;
            oVar2 = oVar;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i24 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                    i22 = i17;
                } else {
                    i22 = i17;
                    a0Var3 = a0Var;
                }
                if (i13 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = a.f13443a;
                        c0VarR.Y(objI1);
                    }
                    function7 = (Function1) objI1;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                    i23 = i19;
                } else {
                    i23 = i19;
                    eVarC = eVar2;
                }
                if (i22 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i23 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b.f13444a;
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                l3 l3VarJ1112 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                int i21111117 = i12 & 8176;
                int i21111118 = i12 >> 3;
                a(l3VarJ1112, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111117 | (57344 & i21111118) | (i21111118 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var2 = a0Var3;
                function5 = function7;
                eVar3 = eVarC;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                str2 = str;
                function5 = function3;
                eVar3 = eVar2;
            }
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                function3 = function1;
                if (c0VarR.k0(function3)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    eVar2 = eVar;
                    if (c0VarR.D(eVar2)) {
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
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((196608 & i10) == 0) {
                            function4 = function2;
                            if (c0VarR.k0(function4)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 1572864) == 0) {
                                oVar2 = oVar;
                                if (c0VarR.k0(oVar2)) {
                                    i21 = 1048576;
                                } else {
                                    i21 = 524288;
                                }
                                i12 |= i21;
                            }
                            if ((i12 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i12 & 1)) {
                                if (i24 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                    i22 = i17;
                                } else {
                                    i22 = i17;
                                    a0Var3 = a0Var;
                                }
                                if (i13 != 0) {
                                    objI1 = c0VarR.i0();
                                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = a.f13443a;
                                        c0VarR.Y(objI1);
                                    }
                                    function7 = (Function1) objI1;
                                } else {
                                    function7 = function3;
                                }
                                if (i15 != 0) {
                                    eVarC = androidx.compose.ui.e.f37317a.C();
                                    i23 = i19;
                                } else {
                                    i23 = i19;
                                    eVarC = eVar2;
                                }
                                if (i22 != 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str;
                                }
                                if (i23 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = b.f13444a;
                                        c0VarR.Y(objI0);
                                    }
                                    function4 = (Function1) objI0;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                l3 l3VarJ1113 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                                int i21111119 = i12 & 8176;
                                int i211111110 = i12 >> 3;
                                a(l3VarJ1113, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111119 | (57344 & i211111110) | (i211111110 & 458752), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                str2 = str3;
                                a0Var2 = a0Var3;
                                function5 = function7;
                                eVar3 = eVarC;
                            } else {
                                c0VarR.u();
                                a0Var2 = a0Var;
                                str2 = str;
                                function5 = function3;
                                eVar3 = eVar2;
                            }
                            function6 = function4;
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                            }
                        }
                        i12 |= 1572864;
                        oVar2 = oVar;
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ1114 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i211111111 = i12 & 8176;
                            int i211111112 = i12 >> 3;
                            a(l3VarJ1114, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111111 | (57344 & i211111112) | (i211111112 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function4 = function2;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ1115 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i211111113 = i12 & 8176;
                            int i211111114 = i12 >> 3;
                            a(l3VarJ1115, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111113 | (57344 & i211111114) | (i211111114 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ1116 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i211111115 = i12 & 8176;
                        int i211111116 = i12 >> 3;
                        a(l3VarJ1116, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111115 | (57344 & i211111116) | (i211111116 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 24576;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ1117 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i211111117 = i12 & 8176;
                            int i211111118 = i12 >> 3;
                            a(l3VarJ1117, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111117 | (57344 & i211111118) | (i211111118 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ1118 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i211111119 = i12 & 8176;
                        int i2111111110 = i12 >> 3;
                        a(l3VarJ1118, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111119 | (57344 & i2111111110) | (i2111111110 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function2;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ1119 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i2111111111 = i12 & 8176;
                        int i2111111112 = i12 >> 3;
                        a(l3VarJ1119, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111111 | (57344 & i2111111112) | (i2111111112 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ11110 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i2111111113 = i12 & 8176;
                    int i2111111114 = i12 >> 3;
                    a(l3VarJ11110, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111113 | (57344 & i2111111114) | (i2111111114 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 3072;
            eVar2 = eVar;
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
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ11111 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i2111111115 = i12 & 8176;
                            int i2111111116 = i12 >> 3;
                            a(l3VarJ11111, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111115 | (57344 & i2111111116) | (i2111111116 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ11112 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i2111111117 = i12 & 8176;
                        int i2111111118 = i12 >> 3;
                        a(l3VarJ11112, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111117 | (57344 & i2111111118) | (i2111111118 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function2;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ11113 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i2111111119 = i12 & 8176;
                        int i21111111110 = i12 >> 3;
                        a(l3VarJ11113, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111119 | (57344 & i21111111110) | (i21111111110 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ11114 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i21111111111 = i12 & 8176;
                    int i21111111112 = i12 >> 3;
                    a(l3VarJ11114, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111111 | (57344 & i21111111112) | (i21111111112 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 24576;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ11115 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i21111111113 = i12 & 8176;
                        int i21111111114 = i12 >> 3;
                        a(l3VarJ11115, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111113 | (57344 & i21111111114) | (i21111111114 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ11116 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i21111111115 = i12 & 8176;
                    int i21111111116 = i12 >> 3;
                    a(l3VarJ11116, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111115 | (57344 & i21111111116) | (i21111111116 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function2;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    oVar2 = oVar;
                    if (c0VarR.k0(oVar2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ11117 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i21111111117 = i12 & 8176;
                    int i21111111118 = i12 >> 3;
                    a(l3VarJ11117, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111117 | (57344 & i21111111118) | (i21111111118 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 1572864;
            oVar2 = oVar;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i24 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                    i22 = i17;
                } else {
                    i22 = i17;
                    a0Var3 = a0Var;
                }
                if (i13 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = a.f13443a;
                        c0VarR.Y(objI1);
                    }
                    function7 = (Function1) objI1;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                    i23 = i19;
                } else {
                    i23 = i19;
                    eVarC = eVar2;
                }
                if (i22 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i23 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b.f13444a;
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                l3 l3VarJ11118 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                int i21111111119 = i12 & 8176;
                int i211111111110 = i12 >> 3;
                a(l3VarJ11118, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111119 | (57344 & i211111111110) | (i211111111110 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var2 = a0Var3;
                function5 = function7;
                eVar3 = eVarC;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                str2 = str;
                function5 = function3;
                eVar3 = eVar2;
            }
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
            }
        }
        i12 |= a5.S0;
        function3 = function1;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                eVar2 = eVar;
                if (c0VarR.D(eVar2)) {
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
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            oVar2 = oVar;
                            if (c0VarR.k0(oVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i24 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                                i22 = i17;
                            } else {
                                i22 = i17;
                                a0Var3 = a0Var;
                            }
                            if (i13 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = a.f13443a;
                                    c0VarR.Y(objI1);
                                }
                                function7 = (Function1) objI1;
                            } else {
                                function7 = function3;
                            }
                            if (i15 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                                i23 = i19;
                            } else {
                                i23 = i19;
                                eVarC = eVar2;
                            }
                            if (i22 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i23 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = b.f13444a;
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            l3 l3VarJ11119 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                            int i211111111111 = i12 & 8176;
                            int i211111111112 = i12 >> 3;
                            a(l3VarJ11119, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111111111 | (57344 & i211111111112) | (i211111111112 & 458752), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str2 = str3;
                            a0Var2 = a0Var3;
                            function5 = function7;
                            eVar3 = eVarC;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            str2 = str;
                            function5 = function3;
                            eVar3 = eVar2;
                        }
                        function6 = function4;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                        }
                    }
                    i12 |= 1572864;
                    oVar2 = oVar;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ111110 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i211111111113 = i12 & 8176;
                        int i211111111114 = i12 >> 3;
                        a(l3VarJ111110, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111111113 | (57344 & i211111111114) | (i211111111114 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function2;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ111111 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i211111111115 = i12 & 8176;
                        int i211111111116 = i12 >> 3;
                        a(l3VarJ111111, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111111115 | (57344 & i211111111116) | (i211111111116 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ111112 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i211111111117 = i12 & 8176;
                    int i211111111118 = i12 >> 3;
                    a(l3VarJ111112, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111111117 | (57344 & i211111111118) | (i211111111118 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 24576;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ111113 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i211111111119 = i12 & 8176;
                        int i2111111111110 = i12 >> 3;
                        a(l3VarJ111113, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111111119 | (57344 & i2111111111110) | (i2111111111110 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ111114 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i2111111111111 = i12 & 8176;
                    int i2111111111112 = i12 >> 3;
                    a(l3VarJ111114, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111111111 | (57344 & i2111111111112) | (i2111111111112 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function2;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    oVar2 = oVar;
                    if (c0VarR.k0(oVar2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ111115 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i2111111111113 = i12 & 8176;
                    int i2111111111114 = i12 >> 3;
                    a(l3VarJ111115, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111111113 | (57344 & i2111111111114) | (i2111111111114 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 1572864;
            oVar2 = oVar;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i24 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                    i22 = i17;
                } else {
                    i22 = i17;
                    a0Var3 = a0Var;
                }
                if (i13 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = a.f13443a;
                        c0VarR.Y(objI1);
                    }
                    function7 = (Function1) objI1;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                    i23 = i19;
                } else {
                    i23 = i19;
                    eVarC = eVar2;
                }
                if (i22 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i23 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b.f13444a;
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                l3 l3VarJ111116 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                int i2111111111115 = i12 & 8176;
                int i2111111111116 = i12 >> 3;
                a(l3VarJ111116, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111111115 | (57344 & i2111111111116) | (i2111111111116 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var2 = a0Var3;
                function5 = function7;
                eVar3 = eVarC;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                str2 = str;
                function5 = function3;
                eVar3 = eVar2;
            }
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
            }
        }
        i12 |= 3072;
        eVar2 = eVar;
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
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        oVar2 = oVar;
                        if (c0VarR.k0(oVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                            i22 = i17;
                        } else {
                            i22 = i17;
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = a.f13443a;
                                c0VarR.Y(objI1);
                            }
                            function7 = (Function1) objI1;
                        } else {
                            function7 = function3;
                        }
                        if (i15 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                            i23 = i19;
                        } else {
                            i23 = i19;
                            eVarC = eVar2;
                        }
                        if (i22 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i23 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b.f13444a;
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        l3 l3VarJ111117 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                        int i2111111111117 = i12 & 8176;
                        int i2111111111118 = i12 >> 3;
                        a(l3VarJ111117, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111111117 | (57344 & i2111111111118) | (i2111111111118 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str2 = str3;
                        a0Var2 = a0Var3;
                        function5 = function7;
                        eVar3 = eVarC;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        str2 = str;
                        function5 = function3;
                        eVar3 = eVar2;
                    }
                    function6 = function4;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                    }
                }
                i12 |= 1572864;
                oVar2 = oVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ111118 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i2111111111119 = i12 & 8176;
                    int i21111111111110 = i12 >> 3;
                    a(l3VarJ111118, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i2111111111119 | (57344 & i21111111111110) | (i21111111111110 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function2;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    oVar2 = oVar;
                    if (c0VarR.k0(oVar2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ111119 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i21111111111111 = i12 & 8176;
                    int i21111111111112 = i12 >> 3;
                    a(l3VarJ111119, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111111111 | (57344 & i21111111111112) | (i21111111111112 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 1572864;
            oVar2 = oVar;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i24 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                    i22 = i17;
                } else {
                    i22 = i17;
                    a0Var3 = a0Var;
                }
                if (i13 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = a.f13443a;
                        c0VarR.Y(objI1);
                    }
                    function7 = (Function1) objI1;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                    i23 = i19;
                } else {
                    i23 = i19;
                    eVarC = eVar2;
                }
                if (i22 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i23 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b.f13444a;
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                l3 l3VarJ1111110 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                int i21111111111113 = i12 & 8176;
                int i21111111111114 = i12 >> 3;
                a(l3VarJ1111110, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111111113 | (57344 & i21111111111114) | (i21111111111114 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var2 = a0Var3;
                function5 = function7;
                eVar3 = eVarC;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                str2 = str;
                function5 = function3;
                eVar3 = eVar2;
            }
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
            }
        }
        i12 |= 24576;
        i19 = i11 & 32;
        if (i19 != 0) {
            if ((196608 & i10) == 0) {
                function4 = function2;
                if (c0VarR.k0(function4)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    oVar2 = oVar;
                    if (c0VarR.k0(oVar2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                        i22 = i17;
                    } else {
                        i22 = i17;
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = a.f13443a;
                            c0VarR.Y(objI1);
                        }
                        function7 = (Function1) objI1;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                        i23 = i19;
                    } else {
                        i23 = i19;
                        eVarC = eVar2;
                    }
                    if (i22 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i23 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b.f13444a;
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    l3 l3VarJ1111111 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                    int i21111111111115 = i12 & 8176;
                    int i21111111111116 = i12 >> 3;
                    a(l3VarJ1111111, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111111115 | (57344 & i21111111111116) | (i21111111111116 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str2 = str3;
                    a0Var2 = a0Var3;
                    function5 = function7;
                    eVar3 = eVarC;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    str2 = str;
                    function5 = function3;
                    eVar3 = eVar2;
                }
                function6 = function4;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
                }
            }
            i12 |= 1572864;
            oVar2 = oVar;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i24 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                    i22 = i17;
                } else {
                    i22 = i17;
                    a0Var3 = a0Var;
                }
                if (i13 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = a.f13443a;
                        c0VarR.Y(objI1);
                    }
                    function7 = (Function1) objI1;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                    i23 = i19;
                } else {
                    i23 = i19;
                    eVarC = eVar2;
                }
                if (i22 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i23 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b.f13444a;
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                l3 l3VarJ1111112 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                int i21111111111117 = i12 & 8176;
                int i21111111111118 = i12 >> 3;
                a(l3VarJ1111112, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111111117 | (57344 & i21111111111118) | (i21111111111118 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var2 = a0Var3;
                function5 = function7;
                eVar3 = eVarC;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                str2 = str;
                function5 = function3;
                eVar3 = eVar2;
            }
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function4 = function2;
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                oVar2 = oVar;
                if (c0VarR.k0(oVar2)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i24 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                    i22 = i17;
                } else {
                    i22 = i17;
                    a0Var3 = a0Var;
                }
                if (i13 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = a.f13443a;
                        c0VarR.Y(objI1);
                    }
                    function7 = (Function1) objI1;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                    i23 = i19;
                } else {
                    i23 = i19;
                    eVarC = eVar2;
                }
                if (i22 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i23 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b.f13444a;
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                l3 l3VarJ1111113 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
                int i21111111111119 = i12 & 8176;
                int i211111111111110 = i12 >> 3;
                a(l3VarJ1111113, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i21111111111119 | (57344 & i211111111111110) | (i211111111111110 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str2 = str3;
                a0Var2 = a0Var3;
                function5 = function7;
                eVar3 = eVarC;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                str2 = str;
                function5 = function3;
                eVar3 = eVar2;
            }
            function6 = function4;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
            }
        }
        i12 |= 1572864;
        oVar2 = oVar;
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i24 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
                i22 = i17;
            } else {
                i22 = i17;
                a0Var3 = a0Var;
            }
            if (i13 != 0) {
                objI1 = c0VarR.i0();
                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = a.f13443a;
                    c0VarR.Y(objI1);
                }
                function7 = (Function1) objI1;
            } else {
                function7 = function3;
            }
            if (i15 != 0) {
                eVarC = androidx.compose.ui.e.f37317a.C();
                i23 = i19;
            } else {
                i23 = i19;
                eVarC = eVar2;
            }
            if (i22 != 0) {
                str3 = "AnimatedContent";
            } else {
                str3 = str;
            }
            if (i23 != 0) {
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b.f13444a;
                    c0VarR.Y(objI0);
                }
                function4 = (Function1) objI0;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1501828832, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
            }
            l3 l3VarJ1111114 = w3.J(s10, str3, c0VarR, (i12 & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), 0);
            int i211111111111111 = i12 & 8176;
            int i211111111111112 = i12 >> 3;
            a(l3VarJ1111114, a0Var3, function7, eVarC, function4, oVar2, c0VarR, i211111111111111 | (57344 & i211111111111112) | (i211111111111112 & 458752), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str2 = str3;
            a0Var2 = a0Var3;
            function5 = function7;
            eVar3 = eVarC;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            str2 = str;
            function5 = function3;
            eVar3 = eVar2;
        }
        function6 = function4;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new c(s10, a0Var2, function5, eVar3, str2, function6, oVar, i10, i11));
        }
    }

    @NotNull
    public static final g1 c(boolean z10, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, ? extends androidx.compose.animation.core.y0<androidx.compose.ui.unit.u>> function2) {
        return new h1(z10, function2);
    }

    public static /* synthetic */ g1 d(boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            function2 = h.f13485a;
        }
        return c(z10, function2);
    }

    @NotNull
    public static final x f(@NotNull d0 d0Var, @NotNull f0 f0Var) {
        return new x(d0Var, f0Var, 0.0f, null, 12, null);
    }

    @h0
    @kotlin.l(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @kotlin.b1(expression = "togetherWith(exit)", imports = {}))
    @NotNull
    public static final x g(@NotNull d0 d0Var, @NotNull f0 f0Var) {
        return new x(d0Var, f0Var, 0.0f, null, 12, null);
    }
}
