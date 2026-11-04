package androidx.compose.material;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 12 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,695:1\n1282#2,6:696\n1282#2,6:702\n1282#2,6:709\n1282#2,6:716\n1282#2,6:725\n1282#2,6:732\n1282#2,6:738\n1282#2,6:783\n1282#2,6:789\n1282#2,6:836\n1282#2,6:842\n1282#2,6:893\n75#3:708\n75#3:715\n75#3:722\n75#3:724\n75#3:744\n1#4:723\n635#5:731\n70#6:745\n66#6,10:746\n70#6:795\n67#6,9:796\n77#6:835\n70#6:848\n67#6,9:849\n77#6:888\n77#6:892\n79#7,6:756\n86#7,3:771\n89#7,2:780\n79#7,6:805\n86#7,3:820\n89#7,2:829\n93#7:834\n79#7,6:858\n86#7,3:873\n89#7,2:882\n93#7:887\n93#7:891\n347#8,9:762\n356#8:782\n347#8,9:811\n356#8,3:831\n347#8,9:864\n356#8,3:884\n357#8,2:889\n4206#9,6:774\n4206#9,6:823\n4206#9,6:876\n85#10:899\n85#10:900\n65#11,10:901\n65#11,10:911\n65#11,10:921\n65#11,10:931\n34#12,6:941\n150#12,3:947\n34#12,6:950\n153#12:956\n34#12,6:957\n113#13:963\n113#13:964\n113#13:965\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n*L\n256#1:696,6\n257#1:702,6\n271#1:709,6\n367#1:716,6\n387#1:725,6\n500#1:732,6\n504#1:738,6\n532#1:783,6\n539#1:789,6\n549#1:836,6\n556#1:842,6\n574#1:893,6\n259#1:708\n366#1:715\n369#1:722\n370#1:724\n528#1:744\n495#1:731\n530#1:745\n530#1:746,10\n531#1:795\n531#1:796,9\n531#1:835\n547#1:848\n547#1:849,9\n547#1:888\n530#1:892\n530#1:756,6\n530#1:771,3\n530#1:780,2\n531#1:805,6\n531#1:820,3\n531#1:829,2\n531#1:834\n547#1:858,6\n547#1:873,3\n547#1:882,2\n547#1:887\n530#1:891\n530#1:762,9\n530#1:782\n531#1:811,9\n531#1:831,3\n547#1:864,9\n547#1:884,3\n530#1:889,2\n530#1:774,6\n531#1:823,6\n547#1:876,6\n497#1:899\n524#1:900\n533#1:901,10\n540#1:911,10\n550#1:921,10\n557#1:931,10\n595#1:941,6\n584#1:947,3\n584#1:950,6\n584#1:956\n588#1:957,6\n635#1:963\n636#1:964\n637#1:965\n*E\n"})
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f23847a = androidx.compose.ui.unit.h.r(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f23848b = androidx.compose.ui.unit.h.r(125);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f23849c = androidx.compose.ui.unit.h.r(56);

    @SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,695:1\n607#2:696\n604#2,6:697\n1282#3,3:703\n1285#3,3:707\n605#4:706\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$2\n*L\n395#1:696\n395#1:697,6\n395#1:703,3\n395#1:707,3\n395#1:706\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f23850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> f23852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f23853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f23854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f23855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ v1 f23856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ u<w1> f23857h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f23858i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f23859j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f23860k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f23861l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f23862m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f23863n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f23864o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23865s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f23866t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> f23867v;

        /* JADX INFO: renamed from: androidx.compose.material.n1$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,695:1\n1282#2,6:696\n113#3:702\n70#4:703\n68#4,8:704\n77#4:742\n79#5,6:712\n86#5,3:727\n89#5,2:736\n93#5:741\n347#6,9:718\n356#6,3:738\n4206#7,6:730\n59#8:743\n59#8:745\n90#9:744\n90#9:746\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$2$1\n*L\n438#1:696,6\n483#1:702\n475#1:703\n475#1:704,8\n475#1:742\n475#1:712,6\n475#1:727,3\n475#1:736,2\n475#1:741\n475#1:718,9\n475#1:738,3\n475#1:730,6\n415#1:743\n416#1:745\n415#1:744\n416#1:746\n*E\n"})
        static final class C0184a implements pj.o<androidx.compose.ui.unit.b, Float, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f23868a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f23869b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f23870c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ v1 f23871d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ u<w1> f23872e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f23873f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.q3 f23874g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f23875h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ long f23876i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ float f23877j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ float f23878k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ float f23879l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ float f23880m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23881n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ long f23882o;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> f23883s;

            /* JADX INFO: renamed from: androidx.compose.material.n1$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
            static final class C0185a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f23884a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ v1 f23885b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0185a(v1 v1Var, kotlin.coroutines.d<? super C0185a> dVar) {
                    super(2, dVar);
                    this.f23885b = v1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0185a(this.f23885b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f23884a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        v1 v1Var = this.f23885b;
                        this.f23884a = 1;
                        if (v1Var.t(this) == objL) {
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
                    return ((C0185a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.material.n1$a$a$b */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f23886a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ v1 f23887b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(v1 v1Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f23887b = v1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f23887b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f23886a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        v1 v1Var = this.f23887b;
                        this.f23886a = 1;
                        if (v1Var.g(this) == objL) {
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
                    return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.material.n1$a$a$c */
            @SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$2$1$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,695:1\n70#2:696\n67#2,9:697\n77#2:742\n79#3,6:706\n86#3,3:721\n89#3,2:730\n93#3:741\n347#4,9:712\n356#4:732\n357#4,2:739\n4206#5,6:724\n1282#6,6:733\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$2$1$3\n*L\n460#1:696\n460#1:697,9\n460#1:742\n460#1:706,6\n460#1:721,3\n460#1:730,2\n460#1:741\n460#1:712,9\n460#1:732\n460#1:739,2\n460#1:724,6\n464#1:733,6\n*E\n"})
            static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ float f23888a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23889b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f23890c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f23891d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ v1 f23892e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f23893f;

                /* JADX INFO: renamed from: androidx.compose.material.n1$a$a$c$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {466}, m = "invokeSuspend", n = {}, s = {})
                static final class C0186a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f23894a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ v1 f23895b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0186a(v1 v1Var, kotlin.coroutines.d<? super C0186a> dVar) {
                        super(2, dVar);
                        this.f23895b = v1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new C0186a(this.f23895b, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f23894a;
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            v1 v1Var = this.f23895b;
                            this.f23894a = 1;
                            if (v1Var.g(this) == objL) {
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
                        return ((C0186a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                c(float f10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, long j10, boolean z10, v1 v1Var, kotlinx.coroutines.s0 s0Var) {
                    this.f23888a = f10;
                    this.f23889b = function2;
                    this.f23890c = j10;
                    this.f23891d = z10;
                    this.f23892e = v1Var;
                    this.f23893f = s0Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(boolean z10, v1 v1Var, kotlinx.coroutines.s0 s0Var) {
                    if (z10 && v1Var.i().invoke(w1.Concealed).booleanValue()) {
                        kotlinx.coroutines.k.f(s0Var, null, null, new C0186a(v1Var, null), 3, null);
                    }
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(356452509, i10, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:459)");
                    }
                    androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.ui.a0.E, 0.0f, 0.0f, 0.0f, this.f23888a, 7, null);
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f23889b;
                    long j10 = this.f23890c;
                    final boolean z10 = this.f23891d;
                    final v1 v1Var = this.f23892e;
                    final kotlinx.coroutines.s0 s0Var = this.f23893f;
                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                    androidx.compose.runtime.b1 b1VarK = c0Var.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
                    androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar.a();
                    if (c0Var.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var.q();
                    if (c0Var.P()) {
                        c0Var.q0(function0A);
                    } else {
                        c0Var.l();
                    }
                    androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    function2.invoke(c0Var, 0);
                    boolean zG = c0Var.G(z10) | c0Var.D(v1Var) | c0Var.k0(s0Var);
                    Object objI0 = c0Var.i0();
                    if (zG || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: androidx.compose.material.o1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return n1.a.C0184a.c.f(z10, v1Var, s0Var);
                            }
                        };
                        c0Var.Y(objI0);
                    }
                    n1.N(j10, (Function0) objI0, v1Var.n() == w1.Revealed, c0Var, 0);
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

            /* JADX INFO: renamed from: androidx.compose.material.n1$a$a$d */
            public /* synthetic */ class d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f23896a;

                static {
                    int[] iArr = new int[w1.values().length];
                    try {
                        iArr[w1.Concealed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[w1.Revealed.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f23896a = iArr;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0184a(float f10, boolean z10, boolean z11, v1 v1Var, u<w1> uVar, kotlinx.coroutines.s0 s0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, float f12, float f13, float f14, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, long j12, pj.n<? super ig, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f23868a = f10;
                this.f23869b = z10;
                this.f23870c = z11;
                this.f23871d = v1Var;
                this.f23872e = uVar;
                this.f23873f = s0Var;
                this.f23874g = q3Var;
                this.f23875h = j10;
                this.f23876i = j11;
                this.f23877j = f11;
                this.f23878k = f12;
                this.f23879l = f13;
                this.f23880m = f14;
                this.f23881n = function2;
                this.f23882o = j12;
                this.f23883s = nVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Pair n(final float f10, v1 v1Var, final kotlin.jvm.internal.i1.e eVar, androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.b bVar) {
                w1 w1Var;
                final float fQ = (int) (uVar.q() & com.rabbitmq.client.k0.f265952a);
                final float fQ2 = ((int) (uVar.q() & com.rabbitmq.client.k0.f265952a)) - f10;
                w5 w5VarA = k.a(new Function1() { // from class: androidx.compose.material.k1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n1.a.C0184a.s(fQ, f10, fQ2, eVar, (x5) obj);
                    }
                });
                int i10 = d.f23896a[v1Var.n().ordinal()];
                if (i10 == 1) {
                    w1Var = w1.Concealed;
                } else {
                    if (i10 != 2) {
                        throw new kotlin.k0();
                    }
                    w1Var = w1.Revealed;
                    if (!w5VarA.d(w1Var)) {
                        w1Var = w1.Concealed;
                    }
                }
                return TuplesKt.to(w5VarA, w1Var);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(float f10, float f11, float f12, kotlin.jvm.internal.i1.e eVar, x5 x5Var) {
                if (f10 == 0.0f || f10 == f11) {
                    x5Var.a(w1.Concealed, f12);
                } else {
                    x5Var.a(w1.Concealed, f11);
                    x5Var.a(w1.Revealed, eVar.f312748a);
                }
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(final v1 v1Var, final kotlinx.coroutines.s0 s0Var, androidx.compose.ui.semantics.e0 e0Var) {
                if (v1Var.o()) {
                    androidx.compose.ui.semantics.b0.h(e0Var, null, new Function0() { // from class: androidx.compose.material.l1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(n1.a.C0184a.x(v1Var, s0Var));
                        }
                    }, 1, null);
                } else {
                    androidx.compose.ui.semantics.b0.s(e0Var, null, new Function0() { // from class: androidx.compose.material.m1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(n1.a.C0184a.y(v1Var, s0Var));
                        }
                    }, 1, null);
                }
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean x(v1 v1Var, kotlinx.coroutines.s0 s0Var) {
                if (v1Var.i().invoke(w1.Revealed).booleanValue()) {
                    kotlinx.coroutines.k.f(s0Var, null, null, new C0185a(v1Var, null), 3, null);
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean y(v1 v1Var, kotlinx.coroutines.s0 s0Var) {
                if (!v1Var.i().invoke(w1.Concealed).booleanValue()) {
                    return true;
                }
                kotlinx.coroutines.k.f(s0Var, null, null, new b(v1Var, null), 3, null);
                return true;
            }

            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.unit.b bVar, Float f10, androidx.compose.runtime.c0 c0Var, Integer num) {
                m(bVar.x(), f10.floatValue(), c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void m(long j10, float f10, androidx.compose.runtime.c0 c0Var, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = i10 | (c0Var.L(j10) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= c0Var.I(f10) ? 32 : 16;
                }
                if (!c0Var.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-323178911, i11, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:398)");
                }
                final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
                float fO = androidx.compose.ui.unit.b.o(j10) - this.f23868a;
                eVar.f312748a = fO;
                if (this.f23869b) {
                    eVar.f312748a = Math.min(fO, f10);
                }
                androidx.compose.ui.a0 a0VarB = this.f23870c ? androidx.compose.ui.input.nestedscroll.c.b(androidx.compose.ui.a0.E, this.f23871d.l(), null, 2, null) : androidx.compose.ui.a0.E;
                u<w1> uVar = this.f23872e;
                androidx.compose.foundation.gestures.q3 q3Var = androidx.compose.foundation.gestures.q3.Vertical;
                final float f11 = this.f23879l;
                final v1 v1Var = this.f23871d;
                androidx.compose.ui.a0 a0VarE = k.e(k.h(a0VarB, uVar, q3Var, new Function2() { // from class: androidx.compose.material.i1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n1.a.C0184a.n(f11, v1Var, eVar, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                }), this.f23872e, q3Var, this.f23870c, false, null, false, 56, null);
                boolean zD = c0Var.D(this.f23871d) | c0Var.k0(this.f23873f);
                final v1 v1Var2 = this.f23871d;
                final kotlinx.coroutines.s0 s0Var = this.f23873f;
                Object objI0 = c0Var.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.j1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n1.a.C0184a.v(v1Var2, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var.Y(objI0);
                }
                ah.e(androidx.compose.ui.semantics.t.f(a0VarE, false, (Function1) objI0, 1, null), this.f23874g, this.f23875h, this.f23876i, null, this.f23877j, androidx.compose.runtime.internal.w.e(356452509, true, new c(this.f23880m, this.f23881n, this.f23882o, this.f23870c, this.f23871d, this.f23873f), c0Var, 54), c0Var, 1572864, 16);
                androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.ui.a0.E, 0.0f, 0.0f, 0.0f, (this.f23871d.p() && eVar.f312748a == ((float) androidx.compose.ui.unit.b.o(j10)) - this.f23868a) ? this.f23878k : androidx.compose.ui.unit.h.r(0), 7, null);
                androidx.compose.ui.e eVarC = androidx.compose.ui.e.f37317a.c();
                pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f23883s;
                v1 v1Var3 = this.f23871d;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarC, false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                nVar.invoke(v1Var3.m(), c0Var, 0);
                c0Var.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.a0 a0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function1<? super androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> function1, float f10, boolean z10, boolean z11, v1 v1Var, u<w1> uVar, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, float f12, float f13, float f14, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, long j12, pj.n<? super ig, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f23850a = a0Var;
            this.f23851b = function2;
            this.f23852c = function1;
            this.f23853d = f10;
            this.f23854e = z10;
            this.f23855f = z11;
            this.f23856g = v1Var;
            this.f23857h = uVar;
            this.f23858i = q3Var;
            this.f23859j = j10;
            this.f23860k = j11;
            this.f23861l = f11;
            this.f23862m = f12;
            this.f23863n = f13;
            this.f23864o = f14;
            this.f23865s = function3;
            this.f23866t = j12;
            this.f23867v = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1243386547, i10, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:394)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
                c0Var.Y(objI0);
            }
            n1.I(androidx.compose.foundation.layout.i6.f(this.f23850a, 0.0f, 1, null), this.f23851b, this.f23852c, androidx.compose.runtime.internal.w.e(-323178911, true, new C0184a(this.f23853d, this.f23854e, this.f23855f, this.f23856g, this.f23857h, (kotlinx.coroutines.s0) objI0, this.f23858i, this.f23859j, this.f23860k, this.f23861l, this.f23862m, this.f23863n, this.f23864o, this.f23865s, this.f23866t, this.f23867v), c0Var, 54), c0Var, 3120);
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

    @SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$backLayer$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,695:1\n87#2:696\n83#2,10:697\n94#2:737\n79#3,6:707\n86#3,3:722\n89#3,2:731\n93#3:736\n347#4,9:713\n356#4,3:733\n4206#5,6:725\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$backLayer$1\n*L\n375#1:696\n375#1:697,10\n375#1:737\n375#1:707,6\n375#1:722,3\n375#1:731,2\n375#1:736\n375#1:713,9\n375#1:733,3\n375#1:725,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f23897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1 f23898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23900d;

        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, v1 v1Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f23897a = z10;
            this.f23898b = v1Var;
            this.f23899c = function2;
            this.f23900d = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(998762775, i10, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:373)");
            }
            if (this.f23897a) {
                c0Var.E(-1391557043);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f23899c;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f23900d;
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
                androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                function2.invoke(c0Var, 0);
                function3.invoke(c0Var, 0);
                c0Var.o();
                c0Var.A();
            } else {
                c0Var.E(-1391423619);
                n1.s(this.f23898b.h().F(), this.f23899c, this.f23900d, c0Var, 0);
                c0Var.A();
            }
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

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<androidx.compose.ui.unit.b, Float, androidx.compose.runtime.c0, Integer, Unit> f23901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.b f23902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f23903c;

        /* JADX WARN: Multi-variable type inference failed */
        c(pj.o<? super androidx.compose.ui.unit.b, ? super Float, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, androidx.compose.ui.unit.b bVar, float f10) {
            this.f23901a = oVar;
            this.f23902b = bVar;
            this.f23903c = f10;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-344317043, i10, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:582)");
            }
            this.f23901a.invoke(this.f23902b, Float.valueOf(this.f23903c), c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,695:1\n30#2:696\n53#3,3:697\n60#3:701\n70#3:704\n65#4:700\n69#4:703\n22#5:702\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1\n*L\n684#1:696\n684#1:697,3\n693#1:701\n693#1:704\n693#1:700\n693#1:703\n693#1:702\n*E\n"})
    public static final class d implements androidx.compose.ui.input.nestedscroll.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u<?> f23904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.q3 f23905b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", i = {0}, l = {679}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f23906a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f23907b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f23909d;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f23907b = obj;
                this.f23909d |= Integer.MIN_VALUE;
                return d.this.B0(0L, 0L, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", i = {0}, l = {670}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f23910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f23911b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f23913d;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f23911b = obj;
                this.f23913d |= Integer.MIN_VALUE;
                return d.this.a4(0L, this);
            }
        }

        d(u<?> uVar, androidx.compose.foundation.gestures.q3 q3Var) {
            this.f23904a = uVar;
            this.f23905b = q3Var;
        }

        @oj.i(name = "offsetToFloat")
        private final float a(long j10) {
            return Float.intBitsToFloat((int) (this.f23905b == androidx.compose.foundation.gestures.q3.Horizontal ? j10 >> 32 : j10 & com.rabbitmq.client.k0.f265952a));
        }

        private final long b(float f10) {
            androidx.compose.foundation.gestures.q3 q3Var = this.f23905b;
            float f11 = q3Var == androidx.compose.foundation.gestures.q3.Horizontal ? f10 : 0.0f;
            if (q3Var != androidx.compose.foundation.gestures.q3.Vertical) {
                f10 = 0.0f;
            }
            return n0.g.g((((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f11)) << 32));
        }

        @oj.i(name = "velocityToFloat")
        private final float c(long j10) {
            return this.f23905b == androidx.compose.foundation.gestures.q3.Horizontal ? androidx.compose.ui.unit.c0.l(j10) : androidx.compose.ui.unit.c0.n(j10);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f23909d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f23909d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f23907b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f23909d;
            if (i11 == 0) {
                ResultKt.m(obj);
                u<?> uVar = this.f23904a;
                float fC = c(j11);
                aVar.f23906a = j11;
                aVar.f23909d = 1;
                if (uVar.Q(fC, aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = aVar.f23906a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j11);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long G7(long j10, int i10) {
            float fA = a(j10);
            return (fA >= 0.0f || !androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) ? n0.g.f332700b.e() : b(this.f23904a.t(fA));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object a4(long j10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i10 = bVar.f23913d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f23913d = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f23911b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = bVar.f23913d;
            if (i11 == 0) {
                ResultKt.m(obj);
                float fC = c(j10);
                float fK = this.f23904a.K();
                if (fC >= 0.0f || fK <= this.f23904a.u().e()) {
                    j10 = androidx.compose.ui.unit.c0.f42681b.a();
                } else {
                    u<?> uVar = this.f23904a;
                    bVar.f23910a = j10;
                    bVar.f23913d = 1;
                    if (uVar.Q(fC, bVar) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = bVar.f23910a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j10);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            return androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h()) ? b(this.f23904a.t(a(j11))) : n0.g.f332700b.e();
        }
    }

    static final class e implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23914a;

        e(Function0<Unit> function0) {
            this.f23914a = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(Function0 function0, n0.g gVar) {
            function0.invoke();
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final Function0<Unit> function0 = this.f23914a;
            Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, null, new Function1() { // from class: androidx.compose.material.p1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.e.b(function0, (n0.g) obj);
                }
            }, dVar, 7, null);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(w1 w1Var, Function2 function2, Function2 function3, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        s(w1Var, function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v30 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v31 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v40 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v42 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r63v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r63v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v29 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r63v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r63v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v4 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void B(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r38, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r39, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r40, @org.jetbrains.annotations.Nullable androidx.compose.ui.a0 r41, @org.jetbrains.annotations.Nullable androidx.compose.material.v1 r42, @org.jetbrains.annotations.Nullable pj.n<? super androidx.compose.material.ig, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r43, boolean r44, float r45, float r46, boolean r47, boolean r48, long r49, long r51, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.q3 r53, float r54, long r55, long r57, long r59, @org.jetbrains.annotations.Nullable androidx.compose.runtime.c0 r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instruction units count: 1415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.n1.B(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.a0, androidx.compose.material.v1, pj.n, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.q3, float, long, long, long, androidx.compose.runtime.c0, int, int, int):void");
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final v1 C(@NotNull w1 w1Var, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull Function1<? super w1, Boolean> function1, @NotNull ig igVar) {
        v1 v1Var = new v1(w1Var, oVar, function1, igVar);
        v1Var.u(dVar);
        return v1Var;
    }

    public static /* synthetic */ v1 D(w1 w1Var, androidx.compose.ui.unit.d dVar, androidx.compose.animation.core.o oVar, Function1 function1, ig igVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            oVar = p0.f24133a.a();
        }
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.material.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(n1.E((w1) obj2));
                }
            };
        }
        if ((i10 & 16) != 0) {
            igVar = new ig();
        }
        return C(w1Var, dVar, oVar, function1, igVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(w1 w1Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.b F(float f10, androidx.compose.ui.unit.b bVar) {
        return androidx.compose.ui.unit.b.a(androidx.compose.ui.unit.c.r(androidx.compose.ui.unit.b.d(bVar.x(), 0, 0, 0, 0, 10, null), 0, -kotlin.math.b.L0(f10), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(Function2 function2, Function2 function3, Function2 function4, androidx.compose.ui.a0 a0Var, v1 v1Var, pj.n nVar, boolean z10, float f10, float f11, boolean z11, boolean z12, long j10, long j11, androidx.compose.ui.graphics.q3 q3Var, float f12, long j12, long j13, long j14, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        B(function2, function3, function4, a0Var, v1Var, nVar, z10, f10, f11, z11, z12, j10, j11, q3Var, f12, j12, j13, j14, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(v1 v1Var, androidx.compose.ui.unit.d dVar) {
        v1Var.u(dVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void I(final androidx.compose.ui.a0 a0Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function1<? super androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> function1, final pj.o<? super androidx.compose.ui.unit.b, ? super Float, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1490100844);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(oVar) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1490100844, i11, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:572)");
            }
            boolean z10 = ((i11 & com.planner5d.library.engine.input.f.b.B) == 32) | ((i11 & 896) == 256) | ((i11 & 7168) == 2048);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function2() { // from class: androidx.compose.material.w0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n1.J(function2, function1, oVar, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.z2.a(a0Var, (Function2) objI0, c0VarR, i11 & 14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.x0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n1.L(a0Var, function2, function1, oVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 J(Function2 function2, Function1 function1, pj.o oVar, androidx.compose.ui.layout.b3 b3Var, androidx.compose.ui.unit.b bVar) {
        final androidx.compose.ui.layout.i2 i2VarP0 = ((androidx.compose.ui.layout.z0) CollectionsKt.first((List) b3Var.S4(o0.Back, function2))).P0(((androidx.compose.ui.unit.b) function1.invoke(bVar)).x());
        List<androidx.compose.ui.layout.z0> listS4 = b3Var.S4(o0.Front, androidx.compose.runtime.internal.w.c(-344317043, true, new c(oVar, bVar, i2VarP0.c1())));
        final ArrayList arrayList = new ArrayList(listS4.size());
        int size = listS4.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(listS4.get(i10).P0(bVar.x()));
        }
        int iMax = Math.max(androidx.compose.ui.unit.b.r(bVar.x()), i2VarP0.h1());
        int iMax2 = Math.max(androidx.compose.ui.unit.b.q(bVar.x()), i2VarP0.c1());
        int size2 = arrayList.size();
        int iMax3 = iMax;
        int iMax4 = iMax2;
        for (int i11 = 0; i11 < size2; i11++) {
            androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) arrayList.get(i11);
            iMax3 = Math.max(iMax3, i2Var.h1());
            iMax4 = Math.max(iMax4, i2Var.c1());
        }
        return androidx.compose.ui.layout.c1.h6(b3Var, iMax3, iMax4, null, new Function1() { // from class: androidx.compose.material.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.K(i2VarP0, arrayList, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(androidx.compose.ui.layout.i2 i2Var, List list, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, 0, 0.0f, 4, null);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list.get(i10), 0, 0, 0.0f, 4, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(androidx.compose.ui.a0 a0Var, Function2 function2, Function1 function1, pj.o oVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        I(a0Var, function2, function1, oVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.input.nestedscroll.a M(@NotNull u<?> uVar, @NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        return new d(uVar, q3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void N(final long j10, final Function0<Unit> function0, final boolean z10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.ui.a0 a0VarE;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-92141505);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-92141505, i11, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:493)");
            }
            if (j10 != 16) {
                c0VarR.E(-503346240);
                int i12 = i11;
                final androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(z10 ? 1.0f : 0.0f, new androidx.compose.animation.core.y3(0, 0, null, 7, null), 0.0f, null, null, c0VarR, 48, 28);
                if (z10) {
                    c0VarR.E(-503180638);
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    Unit unit = Unit.f312394a;
                    boolean z11 = (i12 & com.planner5d.library.engine.input.f.b.B) == 32;
                    Object objI0 = c0VarR.i0();
                    if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new e(function0);
                        c0VarR.Y(objI0);
                    }
                    a0VarE = androidx.compose.ui.input.pointer.w0.e(aVar, unit, (PointerInputEventHandler) objI0);
                    c0VarR.A();
                } else {
                    c0VarR.E(-503080229);
                    c0VarR.A();
                    a0VarE = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null).B2(a0VarE);
                boolean zD = c0VarR.D(n7VarF) | ((i12 & 14) == 4);
                Object objI1 = c0VarR.i0();
                if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material.r0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n1.P(j10, n7VarF, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.foundation.f1.e(a0VarB2, (Function1) objI1, c0VarR, 0);
                c0VarR.A();
            } else {
                c0VarR.E(-502912829);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.s0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n1.Q(j10, function0, z10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float O(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(long j10, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, j10, 0L, 0L, O(n7Var), null, null, 0, 118, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(long j10, Function0 function0, boolean z10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        N(j10, function0, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final v1 W(@NotNull final w1 w1Var, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable Function1<? super w1, Boolean> function1, @Nullable ig igVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = p0.f24133a.a();
        }
        final androidx.compose.animation.core.o<Float> oVar2 = oVar;
        if ((i11 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.t0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(n1.X((w1) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        final Function1<? super w1, Boolean> function2 = function1;
        if ((i11 & 8) != 0) {
            Object objI1 = c0Var.i0();
            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new ig();
                c0Var.Y(objI1);
            }
            igVar = (ig) objI1;
        }
        final ig igVar2 = igVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-862178912, i10, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:257)");
        }
        final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        Object[] objArr = {oVar2, function2, igVar2};
        androidx.compose.runtime.saveable.c0<v1, ?> c0VarC = v1.f25202f.c(oVar2, function2, igVar2, dVar);
        boolean z10 = true;
        boolean z11 = true | false;
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.K(w1Var.ordinal())) || (i10 & 6) == 4) | c0Var.D(dVar) | c0Var.k0(oVar2) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.D(function2)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !c0Var.D(igVar2)) && (i10 & 3072) != 2048) {
            z10 = false;
        }
        boolean z12 = zD | z10;
        Object objI2 = c0Var.i0();
        if (z12 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
            Object obj = new Function0() { // from class: androidx.compose.material.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n1.Y(w1Var, dVar, oVar2, function2, igVar2);
                }
            };
            c0Var.Y(obj);
            objI2 = obj;
        }
        v1 v1Var = (v1) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI2, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(w1 w1Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v1 Y(w1 w1Var, androidx.compose.ui.unit.d dVar, androidx.compose.animation.core.o oVar, Function1 function1, ig igVar) {
        return C(w1Var, dVar, oVar, function1, igVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void s(final w1 w1Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2129748230);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.K(w1Var.ordinal()) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function3) ? 256 : 128;
        }
        int i12 = i11;
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2129748230, i12, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:519)");
            }
            final androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(w1Var == w1.Revealed ? 0.0f : 2.0f, new androidx.compose.animation.core.y3(0, 0, null, 7, null), 0.0f, null, null, c0VarR, 48, 28);
            final float fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23847a);
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            boolean zD = c0VarR.D(n7VarF);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new pj.n() { // from class: androidx.compose.material.z0
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return n1.u(n7VarF, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.q0.a(aVar, (pj.n) objI0);
            boolean zD2 = c0VarR.D(n7VarF) | c0VarR.I(fS7);
            Object objI1 = c0VarR.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n1.w(fS7, n7VarF, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.graphics.q1.a(a0VarA, (Function1) objI1);
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarA2);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK2, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
            function2.invoke(c0VarR, Integer.valueOf((i12 >> 3) & 14));
            c0VarR.o();
            boolean zD3 = c0VarR.D(n7VarF);
            Object objI2 = c0VarR.i0();
            if (zD3 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new pj.n() { // from class: androidx.compose.material.b1
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return n1.x(n7VarF, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarA3 = androidx.compose.ui.layout.q0.a(aVar, (pj.n) objI2);
            boolean zD4 = c0VarR.D(n7VarF) | c0VarR.I(fS7);
            Object objI3 = c0VarR.i0();
            if (zD4 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = new Function1() { // from class: androidx.compose.material.c1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n1.z(fS7, n7VarF, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarA4 = androidx.compose.ui.graphics.q1.a(a0VarA3, (Function1) objI3);
            androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarA4);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD3, a1VarK3, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar3.f());
            function3.invoke(c0VarR, Integer.valueOf((i12 >> 6) & 14));
            c0VarR.o();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.d1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n1.A(w1Var, function2, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float t(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 u(androidx.compose.runtime.n7 n7Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final float fT = t(n7Var) - 1;
        if (fT < 0.0f) {
            fT = 0.0f;
        }
        if (fT > 1.0f) {
            fT = 1.0f;
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.v(i2VarP0, fT, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(androidx.compose.ui.layout.i2 i2Var, float f10, androidx.compose.ui.layout.i2.a aVar) {
        aVar.N(i2Var, 0, 0, f10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(float f10, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.r1 r1Var) {
        float f11 = 1;
        float fT = t(n7Var) - f11;
        if (fT < 0.0f) {
            fT = 0.0f;
        }
        if (fT > 1.0f) {
            fT = 1.0f;
        }
        r1Var.setAlpha(fT);
        r1Var.h((f11 - fT) * f10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 x(androidx.compose.runtime.n7 n7Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final float fT = 1 - t(n7Var);
        if (fT < 0.0f) {
            fT = 0.0f;
        }
        if (fT > 1.0f) {
            fT = 1.0f;
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.y(i2VarP0, fT, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(androidx.compose.ui.layout.i2 i2Var, float f10, androidx.compose.ui.layout.i2.a aVar) {
        aVar.N(i2Var, 0, 0, f10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(float f10, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.r1 r1Var) {
        float f11 = 1;
        float fT = f11 - t(n7Var);
        if (fT < 0.0f) {
            fT = 0.0f;
        }
        if (fT > 1.0f) {
            fT = 1.0f;
        }
        r1Var.setAlpha(fT);
        r1Var.h((f11 - fT) * f10);
        return Unit.f312394a;
    }
}
