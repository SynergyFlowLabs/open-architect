package androidx.compose.material;

import androidx.compose.runtime.snapshots.SnapshotStateList;
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
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 15 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 16 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,422:1\n1282#2,6:423\n1282#2,6:431\n1282#2,6:438\n1282#2,6:444\n1282#2,6:450\n1282#2,6:494\n1282#2,6:504\n1282#2,6:510\n1282#2,6:516\n1282#2,6:525\n75#3:429\n75#3:437\n75#3:456\n75#3:522\n75#3:523\n1#4:430\n70#5:457\n67#5,9:458\n77#5:503\n79#6,6:467\n86#6,3:482\n89#6,2:491\n93#6:502\n347#7,9:473\n356#7:493\n357#7,2:500\n4206#8,6:485\n49#9:524\n52#9:560\n69#10:531\n69#10:538\n70#11:532\n53#11,3:535\n70#11:539\n53#11,3:542\n80#11:554\n22#12:533\n22#12:540\n30#13:534\n30#13:541\n85#14:545\n117#14,2:546\n85#14:548\n85#14:549\n85#14:550\n85#14:551\n85#14:552\n32#15:553\n113#16:555\n113#16:556\n113#16:557\n113#16:558\n113#16:559\n113#16:561\n113#16:562\n113#16:563\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n102#1:423,6\n109#1:431,6\n112#1:438,6\n127#1:444,6\n136#1:450,6\n182#1:494,6\n221#1:504,6\n223#1:510,6\n244#1:516,6\n260#1:525,6\n104#1:429\n110#1:437\n141#1:456\n248#1:522\n249#1:523\n156#1:457\n156#1:458,9\n156#1:503\n156#1:467,6\n156#1:482,3\n156#1:491,2\n156#1:502\n156#1:473,9\n156#1:493\n156#1:500,2\n156#1:485,6\n249#1:524\n291#1:560\n275#1:531\n276#1:538\n275#1:532\n275#1:535,3\n276#1:539\n276#1:542,3\n260#1:554\n275#1:533\n276#1:540\n275#1:534\n276#1:541\n109#1:545\n109#1:546,2\n125#1:548\n126#1:549\n243#1:550\n247#1:551\n251#1:552\n260#1:553\n282#1:555\n283#1:556\n284#1:557\n286#1:558\n288#1:559\n295#1:561\n296#1:562\n421#1:563\n*E\n"})
public final class ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f23565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f23566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f23567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f23568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f23569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f23570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f23571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f23572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<Float> f23573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f23574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f23575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f23576l = 0.7f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f23577m;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u<Boolean> f23579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Boolean> f23580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function1<Boolean, Unit>> f23581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f23582e;

        /* JADX INFO: renamed from: androidx.compose.material.ki$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C0181a extends kotlin.coroutines.jvm.internal.o implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23583a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f23584b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Boolean> f23585c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Function1<Boolean, Unit>> f23586d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n3<Boolean> f23587e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0181a(androidx.compose.runtime.n7<Boolean> n7Var, androidx.compose.runtime.n7<? extends Function1<? super Boolean, Unit>> n7Var2, androidx.compose.runtime.n3<Boolean> n3Var, kotlin.coroutines.d<? super C0181a> dVar) {
                super(2, dVar);
                this.f23585c = n7Var;
                this.f23586d = n7Var2;
                this.f23587e = n3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0181a c0181a = new C0181a(this.f23585c, this.f23586d, this.f23587e, dVar);
                c0181a.f23584b = ((Boolean) obj).booleanValue();
                return c0181a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
                return invoke(bool.booleanValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f23583a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                boolean z10 = this.f23584b;
                if (ki.k(this.f23585c) != z10) {
                    Function1 function1J = ki.j(this.f23586d);
                    if (function1J != null) {
                        function1J.invoke(kotlin.coroutines.jvm.internal.b.a(z10));
                    }
                    androidx.compose.runtime.n3<Boolean> n3Var = this.f23587e;
                    ki.o(n3Var, !ki.n(n3Var));
                }
                return Unit.f312394a;
            }

            public final Object invoke(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0181a) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(u<Boolean> uVar, androidx.compose.runtime.n7<Boolean> n7Var, androidx.compose.runtime.n7<? extends Function1<? super Boolean, Unit>> n7Var2, androidx.compose.runtime.n3<Boolean> n3Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f23579b = uVar;
            this.f23580c = n7Var;
            this.f23581d = n7Var2;
            this.f23582e = n3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m(u uVar) {
            return ((Boolean) uVar.y()).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f23579b, this.f23580c, this.f23581d, this.f23582e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f23578a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final u<Boolean> uVar = this.f23579b;
                kotlinx.coroutines.flow.i iVarY = androidx.compose.runtime.w6.y(new Function0() { // from class: androidx.compose.material.ji
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(ki.a.m(uVar));
                    }
                });
                C0181a c0181a = new C0181a(this.f23580c, this.f23581d, this.f23582e, null);
                this.f23578a = 1;
                if (kotlinx.coroutines.flow.k.C(iVarY, c0181a, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$Switch$2$1", f = "Switch.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f23589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u<Boolean> f23590c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, u<Boolean> uVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f23589b = z10;
            this.f23590c = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f23589b, this.f23590c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f23588a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (this.f23589b != this.f23590c.y().booleanValue()) {
                    u<Boolean> uVar = this.f23590c;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(this.f23589b);
                    this.f23588a = 1;
                    if (k.g(uVar, boolA, 0.0f, this, 2, null) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f23592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f23593c;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f23594a;

            a(SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList) {
                this.f23594a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f23594a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f23594a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f23594a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
                    this.f23594a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.c) {
                    this.f23594a.remove(((androidx.compose.foundation.interaction.a.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.C0087a) {
                    this.f23594a.remove(((androidx.compose.foundation.interaction.a.C0087a) gVar).a());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.interaction.h hVar, SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f23592b = hVar;
            this.f23593c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f23592b, this.f23593c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f23591a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f23592b.c();
                a aVar = new a(this.f23593c);
                this.f23591a = 1;
                if (iVarC.collect(aVar, this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        float fR = androidx.compose.ui.unit.h.r(34);
        f23565a = fR;
        f23566b = androidx.compose.ui.unit.h.r(14);
        float fR2 = androidx.compose.ui.unit.h.r(20);
        f23567c = fR2;
        f23568d = androidx.compose.ui.unit.h.r(24);
        f23569e = androidx.compose.ui.unit.h.r(2);
        f23570f = fR;
        f23571g = fR2;
        f23572h = androidx.compose.ui.unit.h.r(fR - fR2);
        f23573i = new androidx.compose.animation.core.y3<>(100, 0, null, 6, null);
        f23574j = androidx.compose.ui.unit.h.r(1);
        f23575k = androidx.compose.ui.unit.h.r(6);
        f23577m = androidx.compose.ui.unit.h.r(125);
    }

    private static final void D(androidx.compose.ui.graphics.drawscope.f fVar, long j10, float f10, float f11) {
        float f12 = f11 / 2;
        androidx.compose.ui.graphics.drawscope.f.j2(fVar, j10, n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f12) << 32)), n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f10 - f12) << 32)), f11, androidx.compose.ui.graphics.u3.f38256b.b(), null, 0.0f, null, 0, 480, null);
    }

    public static final float E() {
        return f23567c;
    }

    public static final float F() {
        return f23566b;
    }

    public static final float G() {
        return f23565a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0171  */
    /* JADX WARN: Code duplicated, block: B:102:0x0183  */
    /* JADX WARN: Code duplicated, block: B:104:0x0191  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:115:0x0242  */
    /* JADX WARN: Code duplicated, block: B:117:0x0248  */
    /* JADX WARN: Code duplicated, block: B:122:0x0278  */
    /* JADX WARN: Code duplicated, block: B:123:0x027b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x0291  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0304  */
    /* JADX WARN: Code duplicated, block: B:149:0x0351  */
    /* JADX WARN: Code duplicated, block: B:152:0x035d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0361  */
    /* JADX WARN: Code duplicated, block: B:156:0x0384  */
    /* JADX WARN: Code duplicated, block: B:158:0x0392  */
    /* JADX WARN: Code duplicated, block: B:161:0x03be  */
    /* JADX WARN: Code duplicated, block: B:163:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:171:0x0408  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0157  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9 */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void i(final boolean z10, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable zh zhVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        zh zhVar2;
        int i17;
        boolean z13;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final androidx.compose.foundation.interaction.j jVar3;
        final zh zhVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.runtime.u6 u6Var;
        androidx.compose.ui.a0 a0Var4;
        boolean z15;
        androidx.compose.foundation.interaction.j jVar4;
        int i18;
        androidx.compose.foundation.interaction.j jVar5;
        final float fS7;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        androidx.compose.runtime.n3 n3Var;
        final float fS8;
        boolean zI;
        Object objI1;
        u uVar;
        androidx.compose.runtime.n7 n7VarW;
        int i19;
        androidx.compose.runtime.n7 n7VarW2;
        boolean zD;
        Object objI2;
        u uVar2;
        boolean z16;
        boolean zD2;
        Object objI3;
        Object obj;
        boolean z17;
        androidx.compose.foundation.interaction.j jVar6;
        ?? r10;
        int i20;
        androidx.compose.ui.a0 a0VarA;
        androidx.compose.ui.a0 a0VarH;
        ?? r18;
        final u uVar3;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean zD3;
        Object objI4;
        Object objI5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(25866825);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function1) ? 32 : 16;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            zhVar2 = zhVar;
                            int i22 = c0VarR.D(zhVar2) ? 131072 : 65536;
                            i12 |= i22;
                        } else {
                            zhVar2 = zhVar;
                        }
                        i12 |= i22;
                    } else {
                        zhVar2 = zhVar;
                    }
                    i17 = i12;
                    if ((74899 & i12) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i17 & 1)) {
                        c0VarR.l0();
                        u6Var = null;
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z12;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 32) != 0) {
                                u6Var = null;
                                zh zhVarA = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                                c0VarR = c0VarR;
                                i18 = i17 & (-458753);
                                z12 = z15;
                                zhVar2 = zhVarA;
                                a0Var2 = a0Var4;
                            } else {
                                a0Var2 = a0Var4;
                                z12 = z15;
                                i18 = i17;
                            }
                        } else {
                            c0VarR.u();
                            if ((i11 & 32) != 0) {
                                i18 = i17 & (-458753);
                                jVar4 = jVar2;
                                zhVar2 = zhVar2;
                                u6Var = null;
                            } else {
                                jVar4 = jVar2;
                                i18 = i17;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(25866825, i18, -1, "androidx.compose.material.Switch (Switch.kt:99)");
                        }
                        if (jVar4 == null) {
                            c0VarR.E(1799821714);
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI5);
                            }
                            c0VarR.A();
                            jVar5 = (androidx.compose.foundation.interaction.j) objI5;
                        } else {
                            c0VarR.E(-911773211);
                            c0VarR.A();
                            jVar5 = jVar4;
                        }
                        fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23572h);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, u6Var, 2, u6Var);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI0;
                        fS8 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23577m);
                        zI = c0VarR.I(fS7) | c0VarR.I(fS8);
                        objI1 = c0VarR.i0();
                        if (zI || objI1 == aVar.a()) {
                            final float f10 = 0.0f;
                            objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return ki.p(f10, fS7, (x5) obj2);
                                }
                            }), new Function1() { // from class: androidx.compose.material.ci
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return Float.valueOf(ki.q(((Float) obj2).floatValue()));
                                }
                            }, new Function0() { // from class: androidx.compose.material.di
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ki.r(fS8));
                                }
                            }, f23573i, null, 32, null);
                            c0VarR.Y(objI1);
                        }
                        uVar = (u) objI1;
                        int i23 = i18 >> 3;
                        n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, i23 & 14);
                        i19 = i18 & 14;
                        n7VarW2 = androidx.compose.runtime.w6.w(Boolean.valueOf(z10), c0VarR, i19);
                        zD = c0VarR.D(uVar) | c0VarR.D(n7VarW2) | c0VarR.D(n7VarW);
                        objI2 = c0VarR.i0();
                        if (!zD || objI2 == aVar.a()) {
                            a aVar2 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                            uVar2 = uVar;
                            c0VarR.Y(aVar2);
                            objI2 = aVar2;
                        } else {
                            uVar2 = uVar;
                        }
                        androidx.compose.runtime.b2.i(uVar2, (Function2) objI2, c0VarR, 0);
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        Boolean boolValueOf2 = Boolean.valueOf(n(n3Var));
                        if (i19 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zD2 = z16 | c0VarR.D(uVar2);
                        objI3 = c0VarR.i0();
                        if (!zD2 || objI3 == aVar.a()) {
                            obj = null;
                            objI3 = new b(z10, uVar2, null);
                            c0VarR.Y(objI3);
                        } else {
                            obj = null;
                        }
                        androidx.compose.runtime.b2.h(boolValueOf, boolValueOf2, (Function2) objI3, c0VarR, i19);
                        if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (function1 != null) {
                            z14 = z12;
                            jVar6 = jVar5;
                            r10 = 0;
                            i20 = 2;
                            a0VarA = androidx.compose.foundation.selection.e.a(androidx.compose.ui.a0.E, z10, jVar6, null, z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                        } else {
                            z14 = z12;
                            jVar6 = jVar5;
                            r10 = 0;
                            i20 = 2;
                            a0VarA = androidx.compose.ui.a0.E;
                        }
                        if (function1 != null) {
                            a0VarH = l9.h(androidx.compose.ui.a0.E);
                        } else {
                            a0VarH = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarB2 = a0Var2.B2(a0VarH).B2(a0VarA);
                        androidx.compose.foundation.gestures.q3 q3Var = androidx.compose.foundation.gestures.q3.Horizontal;
                        if (z14 || function1 == null) {
                            r18 = r10;
                        } else {
                            r18 = 1;
                        }
                        int i24 = i20;
                        Object obj2 = obj;
                        androidx.compose.ui.a0 a0VarD = k.d(a0VarB2, uVar2, q3Var, r18, z17, jVar6, false);
                        uVar3 = uVar2;
                        androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0VarD, aVar3.i(), r10, i24, obj2), f23569e), f23570f, f23571g);
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), r10);
                        iJ = androidx.compose.runtime.v.j(c0VarR, r10);
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarQ);
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
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.foundation.interaction.j jVar7 = jVar6;
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar4.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar4.g());
                        function2B = aVar4.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar4.f());
                        androidx.compose.ui.a0 a0Var5 = a0Var2;
                        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        boolean zBooleanValue = ((Boolean) uVar3.F()).booleanValue();
                        zD3 = c0VarR.D(uVar3);
                        objI4 = c0VarR.i0();
                        if (zD3 || objI4 == aVar.a()) {
                            objI4 = new Function0() { // from class: androidx.compose.material.ei
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ki.l(uVar3));
                                }
                            };
                            c0VarR.Y(objI4);
                        }
                        s(d0Var, zBooleanValue, z14, zhVar2, (Function0) objI4, jVar7, c0VarR, (i23 & 896) | 6 | ((i18 >> 6) & 7168));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        zhVar3 = zhVar2;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        jVar3 = jVar2;
                        zhVar3 = zhVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                return ki.m(z10, function1, a0Var3, z14, jVar3, zhVar3, i10, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        zhVar2 = zhVar;
                        if (c0VarR.D(zhVar2)) {
                        }
                        i12 |= i22;
                    } else {
                        zhVar2 = zhVar;
                    }
                    i12 |= i22;
                } else {
                    zhVar2 = zhVar;
                }
                i17 = i12;
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i17 & 1)) {
                    c0VarR.l0();
                    u6Var = null;
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            u6Var = null;
                            zh zhVarA2 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                            c0VarR = c0VarR;
                            i18 = i17 & (-458753);
                            z12 = z15;
                            zhVar2 = zhVarA2;
                            a0Var2 = a0Var4;
                        } else {
                            a0Var2 = a0Var4;
                            z12 = z15;
                            i18 = i17;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            u6Var = null;
                            zh zhVarA3 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                            c0VarR = c0VarR;
                            i18 = i17 & (-458753);
                            z12 = z15;
                            zhVar2 = zhVarA3;
                            a0Var2 = a0Var4;
                        } else {
                            a0Var2 = a0Var4;
                            z12 = z15;
                            i18 = i17;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(25866825, i18, -1, "androidx.compose.material.Switch (Switch.kt:99)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(1799821714);
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI5);
                        }
                        c0VarR.A();
                        jVar5 = (androidx.compose.foundation.interaction.j) objI5;
                    } else {
                        c0VarR.E(-911773211);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23572h);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, u6Var, 2, u6Var);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    fS8 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23577m);
                    zI = c0VarR.I(fS7) | c0VarR.I(fS8);
                    objI1 = c0VarR.i0();
                    if (zI) {
                        final float f11 = 0.0f;
                        objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return ki.p(f11, fS7, (x5) obj3);
                            }
                        }), new Function1() { // from class: androidx.compose.material.ci
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return Float.valueOf(ki.q(((Float) obj3).floatValue()));
                            }
                        }, new Function0() { // from class: androidx.compose.material.di
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.r(fS8));
                            }
                        }, f23573i, null, 32, null);
                        c0VarR.Y(objI1);
                    } else {
                        final float f12 = 0.0f;
                        objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return ki.p(f12, fS7, (x5) obj3);
                            }
                        }), new Function1() { // from class: androidx.compose.material.ci
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return Float.valueOf(ki.q(((Float) obj3).floatValue()));
                            }
                        }, new Function0() { // from class: androidx.compose.material.di
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.r(fS8));
                            }
                        }, f23573i, null, 32, null);
                        c0VarR.Y(objI1);
                    }
                    uVar = (u) objI1;
                    int i25 = i18 >> 3;
                    n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, i25 & 14);
                    i19 = i18 & 14;
                    n7VarW2 = androidx.compose.runtime.w6.w(Boolean.valueOf(z10), c0VarR, i19);
                    zD = c0VarR.D(uVar) | c0VarR.D(n7VarW2) | c0VarR.D(n7VarW);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        a aVar5 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                        uVar2 = uVar;
                        c0VarR.Y(aVar5);
                        objI2 = aVar5;
                    } else {
                        a aVar6 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                        uVar2 = uVar;
                        c0VarR.Y(aVar6);
                        objI2 = aVar6;
                    }
                    androidx.compose.runtime.b2.i(uVar2, (Function2) objI2, c0VarR, 0);
                    Boolean boolValueOf3 = Boolean.valueOf(z10);
                    Boolean boolValueOf4 = Boolean.valueOf(n(n3Var));
                    if (i19 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD2 = z16 | c0VarR.D(uVar2);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        obj = null;
                        objI3 = new b(z10, uVar2, null);
                        c0VarR.Y(objI3);
                    } else {
                        obj = null;
                        objI3 = new b(z10, uVar2, null);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.runtime.b2.h(boolValueOf3, boolValueOf4, (Function2) objI3, c0VarR, i19);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (function1 != null) {
                        z14 = z12;
                        jVar6 = jVar5;
                        r10 = 0;
                        i20 = 2;
                        a0VarA = androidx.compose.foundation.selection.e.a(androidx.compose.ui.a0.E, z10, jVar6, null, z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                    } else {
                        z14 = z12;
                        jVar6 = jVar5;
                        r10 = 0;
                        i20 = 2;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    if (function1 != null) {
                        a0VarH = l9.h(androidx.compose.ui.a0.E);
                    } else {
                        a0VarH = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB3 = a0Var2.B2(a0VarH).B2(a0VarA);
                    androidx.compose.foundation.gestures.q3 q3Var2 = androidx.compose.foundation.gestures.q3.Horizontal;
                    if (z14) {
                        r18 = r10;
                    } else {
                        r18 = r10;
                    }
                    int i26 = i20;
                    Object obj3 = obj;
                    androidx.compose.ui.a0 a0VarD2 = k.d(a0VarB3, uVar2, q3Var2, r18, z17, jVar6, false);
                    uVar3 = uVar2;
                    androidx.compose.ui.e.a aVar7 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.a0 a0VarQ2 = androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0VarD2, aVar7.i(), r10, i26, obj3), f23569e), f23570f, f23571g);
                    androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar7.C(), r10);
                    iJ = androidx.compose.runtime.v.j(c0VarR, r10);
                    androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarQ2);
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.foundation.interaction.j jVar8 = jVar6;
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar8.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar8.g());
                    function2B = aVar8.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar8.f());
                    androidx.compose.ui.a0 a0Var6 = a0Var2;
                    androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                    boolean zBooleanValue2 = ((Boolean) uVar3.F()).booleanValue();
                    zD3 = c0VarR.D(uVar3);
                    objI4 = c0VarR.i0();
                    if (zD3) {
                        objI4 = new Function0() { // from class: androidx.compose.material.ei
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.l(uVar3));
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material.ei
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.l(uVar3));
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    s(d0Var2, zBooleanValue2, z14, zhVar2, (Function0) objI4, jVar8, c0VarR, (i25 & 896) | 6 | ((i18 >> 6) & 7168));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var6;
                    zhVar3 = zhVar2;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    jVar3 = jVar2;
                    zhVar3 = zhVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return ki.m(z10, function1, a0Var3, z14, jVar3, zhVar3, i10, i11, (androidx.compose.runtime.c0) obj4, ((Integer) obj5).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        zhVar2 = zhVar;
                        if (c0VarR.D(zhVar2)) {
                        }
                        i12 |= i22;
                    } else {
                        zhVar2 = zhVar;
                    }
                    i12 |= i22;
                } else {
                    zhVar2 = zhVar;
                }
                i17 = i12;
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i17 & 1)) {
                    c0VarR.l0();
                    u6Var = null;
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            u6Var = null;
                            zh zhVarA4 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                            c0VarR = c0VarR;
                            i18 = i17 & (-458753);
                            z12 = z15;
                            zhVar2 = zhVarA4;
                            a0Var2 = a0Var4;
                        } else {
                            a0Var2 = a0Var4;
                            z12 = z15;
                            i18 = i17;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            u6Var = null;
                            zh zhVarA5 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                            c0VarR = c0VarR;
                            i18 = i17 & (-458753);
                            z12 = z15;
                            zhVar2 = zhVarA5;
                            a0Var2 = a0Var4;
                        } else {
                            a0Var2 = a0Var4;
                            z12 = z15;
                            i18 = i17;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(25866825, i18, -1, "androidx.compose.material.Switch (Switch.kt:99)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(1799821714);
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI5);
                        }
                        c0VarR.A();
                        jVar5 = (androidx.compose.foundation.interaction.j) objI5;
                    } else {
                        c0VarR.E(-911773211);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23572h);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, u6Var, 2, u6Var);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    fS8 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23577m);
                    zI = c0VarR.I(fS7) | c0VarR.I(fS8);
                    objI1 = c0VarR.i0();
                    if (zI) {
                        final float f13 = 0.0f;
                        objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return ki.p(f13, fS7, (x5) obj4);
                            }
                        }), new Function1() { // from class: androidx.compose.material.ci
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return Float.valueOf(ki.q(((Float) obj4).floatValue()));
                            }
                        }, new Function0() { // from class: androidx.compose.material.di
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.r(fS8));
                            }
                        }, f23573i, null, 32, null);
                        c0VarR.Y(objI1);
                    } else {
                        final float f14 = 0.0f;
                        objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return ki.p(f14, fS7, (x5) obj4);
                            }
                        }), new Function1() { // from class: androidx.compose.material.ci
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return Float.valueOf(ki.q(((Float) obj4).floatValue()));
                            }
                        }, new Function0() { // from class: androidx.compose.material.di
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.r(fS8));
                            }
                        }, f23573i, null, 32, null);
                        c0VarR.Y(objI1);
                    }
                    uVar = (u) objI1;
                    int i27 = i18 >> 3;
                    n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, i27 & 14);
                    i19 = i18 & 14;
                    n7VarW2 = androidx.compose.runtime.w6.w(Boolean.valueOf(z10), c0VarR, i19);
                    zD = c0VarR.D(uVar) | c0VarR.D(n7VarW2) | c0VarR.D(n7VarW);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        a aVar9 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                        uVar2 = uVar;
                        c0VarR.Y(aVar9);
                        objI2 = aVar9;
                    } else {
                        a aVar10 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                        uVar2 = uVar;
                        c0VarR.Y(aVar10);
                        objI2 = aVar10;
                    }
                    androidx.compose.runtime.b2.i(uVar2, (Function2) objI2, c0VarR, 0);
                    Boolean boolValueOf5 = Boolean.valueOf(z10);
                    Boolean boolValueOf6 = Boolean.valueOf(n(n3Var));
                    if (i19 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD2 = z16 | c0VarR.D(uVar2);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        obj = null;
                        objI3 = new b(z10, uVar2, null);
                        c0VarR.Y(objI3);
                    } else {
                        obj = null;
                        objI3 = new b(z10, uVar2, null);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.runtime.b2.h(boolValueOf5, boolValueOf6, (Function2) objI3, c0VarR, i19);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (function1 != null) {
                        z14 = z12;
                        jVar6 = jVar5;
                        r10 = 0;
                        i20 = 2;
                        a0VarA = androidx.compose.foundation.selection.e.a(androidx.compose.ui.a0.E, z10, jVar6, null, z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                    } else {
                        z14 = z12;
                        jVar6 = jVar5;
                        r10 = 0;
                        i20 = 2;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    if (function1 != null) {
                        a0VarH = l9.h(androidx.compose.ui.a0.E);
                    } else {
                        a0VarH = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB4 = a0Var2.B2(a0VarH).B2(a0VarA);
                    androidx.compose.foundation.gestures.q3 q3Var3 = androidx.compose.foundation.gestures.q3.Horizontal;
                    if (z14) {
                        r18 = r10;
                    } else {
                        r18 = r10;
                    }
                    int i28 = i20;
                    Object obj4 = obj;
                    androidx.compose.ui.a0 a0VarD3 = k.d(a0VarB4, uVar2, q3Var3, r18, z17, jVar6, false);
                    uVar3 = uVar2;
                    androidx.compose.ui.e.a aVar11 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.a0 a0VarQ3 = androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0VarD3, aVar11.i(), r10, i28, obj4), f23569e), f23570f, f23571g);
                    androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar11.C(), r10);
                    iJ = androidx.compose.runtime.v.j(c0VarR, r10);
                    androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarQ3);
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.foundation.interaction.j jVar9 = jVar6;
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK3, aVar12.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar12.g());
                    function2B = aVar12.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar12.f());
                    androidx.compose.ui.a0 a0Var7 = a0Var2;
                    androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                    boolean zBooleanValue3 = ((Boolean) uVar3.F()).booleanValue();
                    zD3 = c0VarR.D(uVar3);
                    objI4 = c0VarR.i0();
                    if (zD3) {
                        objI4 = new Function0() { // from class: androidx.compose.material.ei
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.l(uVar3));
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material.ei
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.l(uVar3));
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    s(d0Var3, zBooleanValue3, z14, zhVar2, (Function0) objI4, jVar9, c0VarR, (i27 & 896) | 6 | ((i18 >> 6) & 7168));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var7;
                    zhVar3 = zhVar2;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    jVar3 = jVar2;
                    zhVar3 = zhVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            return ki.m(z10, function1, a0Var3, z14, jVar3, zhVar3, i10, i11, (androidx.compose.runtime.c0) obj5, ((Integer) obj6).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    zhVar2 = zhVar;
                    if (c0VarR.D(zhVar2)) {
                    }
                    i12 |= i22;
                } else {
                    zhVar2 = zhVar;
                }
                i12 |= i22;
            } else {
                zhVar2 = zhVar;
            }
            i17 = i12;
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i17 & 1)) {
                c0VarR.l0();
                u6Var = null;
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        u6Var = null;
                        zh zhVarA6 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                        c0VarR = c0VarR;
                        i18 = i17 & (-458753);
                        z12 = z15;
                        zhVar2 = zhVarA6;
                        a0Var2 = a0Var4;
                    } else {
                        a0Var2 = a0Var4;
                        z12 = z15;
                        i18 = i17;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        u6Var = null;
                        zh zhVarA7 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                        c0VarR = c0VarR;
                        i18 = i17 & (-458753);
                        z12 = z15;
                        zhVar2 = zhVarA7;
                        a0Var2 = a0Var4;
                    } else {
                        a0Var2 = a0Var4;
                        z12 = z15;
                        i18 = i17;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(25866825, i18, -1, "androidx.compose.material.Switch (Switch.kt:99)");
                }
                if (jVar4 == null) {
                    c0VarR.E(1799821714);
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI5);
                    }
                    c0VarR.A();
                    jVar5 = (androidx.compose.foundation.interaction.j) objI5;
                } else {
                    c0VarR.E(-911773211);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23572h);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, u6Var, 2, u6Var);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                fS8 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23577m);
                zI = c0VarR.I(fS7) | c0VarR.I(fS8);
                objI1 = c0VarR.i0();
                if (zI) {
                    final float f15 = 0.0f;
                    objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return ki.p(f15, fS7, (x5) obj5);
                        }
                    }), new Function1() { // from class: androidx.compose.material.ci
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return Float.valueOf(ki.q(((Float) obj5).floatValue()));
                        }
                    }, new Function0() { // from class: androidx.compose.material.di
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.r(fS8));
                        }
                    }, f23573i, null, 32, null);
                    c0VarR.Y(objI1);
                } else {
                    final float f16 = 0.0f;
                    objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return ki.p(f16, fS7, (x5) obj5);
                        }
                    }), new Function1() { // from class: androidx.compose.material.ci
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return Float.valueOf(ki.q(((Float) obj5).floatValue()));
                        }
                    }, new Function0() { // from class: androidx.compose.material.di
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.r(fS8));
                        }
                    }, f23573i, null, 32, null);
                    c0VarR.Y(objI1);
                }
                uVar = (u) objI1;
                int i29 = i18 >> 3;
                n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, i29 & 14);
                i19 = i18 & 14;
                n7VarW2 = androidx.compose.runtime.w6.w(Boolean.valueOf(z10), c0VarR, i19);
                zD = c0VarR.D(uVar) | c0VarR.D(n7VarW2) | c0VarR.D(n7VarW);
                objI2 = c0VarR.i0();
                if (zD) {
                    a aVar13 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                    uVar2 = uVar;
                    c0VarR.Y(aVar13);
                    objI2 = aVar13;
                } else {
                    a aVar14 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                    uVar2 = uVar;
                    c0VarR.Y(aVar14);
                    objI2 = aVar14;
                }
                androidx.compose.runtime.b2.i(uVar2, (Function2) objI2, c0VarR, 0);
                Boolean boolValueOf7 = Boolean.valueOf(z10);
                Boolean boolValueOf8 = Boolean.valueOf(n(n3Var));
                if (i19 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD2 = z16 | c0VarR.D(uVar2);
                objI3 = c0VarR.i0();
                if (zD2) {
                    obj = null;
                    objI3 = new b(z10, uVar2, null);
                    c0VarR.Y(objI3);
                } else {
                    obj = null;
                    objI3 = new b(z10, uVar2, null);
                    c0VarR.Y(objI3);
                }
                androidx.compose.runtime.b2.h(boolValueOf7, boolValueOf8, (Function2) objI3, c0VarR, i19);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (function1 != null) {
                    z14 = z12;
                    jVar6 = jVar5;
                    r10 = 0;
                    i20 = 2;
                    a0VarA = androidx.compose.foundation.selection.e.a(androidx.compose.ui.a0.E, z10, jVar6, null, z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                } else {
                    z14 = z12;
                    jVar6 = jVar5;
                    r10 = 0;
                    i20 = 2;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                if (function1 != null) {
                    a0VarH = l9.h(androidx.compose.ui.a0.E);
                } else {
                    a0VarH = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB5 = a0Var2.B2(a0VarH).B2(a0VarA);
                androidx.compose.foundation.gestures.q3 q3Var4 = androidx.compose.foundation.gestures.q3.Horizontal;
                if (z14) {
                    r18 = r10;
                } else {
                    r18 = r10;
                }
                int i210 = i20;
                Object obj5 = obj;
                androidx.compose.ui.a0 a0VarD4 = k.d(a0VarB5, uVar2, q3Var4, r18, z17, jVar6, false);
                uVar3 = uVar2;
                androidx.compose.ui.e.a aVar15 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.a0 a0VarQ4 = androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0VarD4, aVar15.i(), r10, i210, obj5), f23569e), f23570f, f23571g);
                androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar15.C(), r10);
                iJ = androidx.compose.runtime.v.j(c0VarR, r10);
                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarQ4);
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.foundation.interaction.j jVar10 = jVar6;
                androidx.compose.runtime.y7.n(c0VarD, a1VarK4, aVar16.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar16.g());
                function2B = aVar16.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar16.f());
                androidx.compose.ui.a0 a0Var8 = a0Var2;
                androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                boolean zBooleanValue4 = ((Boolean) uVar3.F()).booleanValue();
                zD3 = c0VarR.D(uVar3);
                objI4 = c0VarR.i0();
                if (zD3) {
                    objI4 = new Function0() { // from class: androidx.compose.material.ei
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.l(uVar3));
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material.ei
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.l(uVar3));
                        }
                    };
                    c0VarR.Y(objI4);
                }
                s(d0Var4, zBooleanValue4, z14, zhVar2, (Function0) objI4, jVar10, c0VarR, (i29 & 896) | 6 | ((i18 >> 6) & 7168));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var8;
                zhVar3 = zhVar2;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z14 = z12;
                jVar3 = jVar2;
                zhVar3 = zhVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        return ki.m(z10, function1, a0Var3, z14, jVar3, zhVar3, i10, i11, (androidx.compose.runtime.c0) obj6, ((Integer) obj7).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z11;
                if (c0VarR.G(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        zhVar2 = zhVar;
                        if (c0VarR.D(zhVar2)) {
                        }
                        i12 |= i22;
                    } else {
                        zhVar2 = zhVar;
                    }
                    i12 |= i22;
                } else {
                    zhVar2 = zhVar;
                }
                i17 = i12;
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i17 & 1)) {
                    c0VarR.l0();
                    u6Var = null;
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            u6Var = null;
                            zh zhVarA8 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                            c0VarR = c0VarR;
                            i18 = i17 & (-458753);
                            z12 = z15;
                            zhVar2 = zhVarA8;
                            a0Var2 = a0Var4;
                        } else {
                            a0Var2 = a0Var4;
                            z12 = z15;
                            i18 = i17;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            u6Var = null;
                            zh zhVarA9 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                            c0VarR = c0VarR;
                            i18 = i17 & (-458753);
                            z12 = z15;
                            zhVar2 = zhVarA9;
                            a0Var2 = a0Var4;
                        } else {
                            a0Var2 = a0Var4;
                            z12 = z15;
                            i18 = i17;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(25866825, i18, -1, "androidx.compose.material.Switch (Switch.kt:99)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(1799821714);
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI5);
                        }
                        c0VarR.A();
                        jVar5 = (androidx.compose.foundation.interaction.j) objI5;
                    } else {
                        c0VarR.E(-911773211);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23572h);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, u6Var, 2, u6Var);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    fS8 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23577m);
                    zI = c0VarR.I(fS7) | c0VarR.I(fS8);
                    objI1 = c0VarR.i0();
                    if (zI) {
                        final float f17 = 0.0f;
                        objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                return ki.p(f17, fS7, (x5) obj6);
                            }
                        }), new Function1() { // from class: androidx.compose.material.ci
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                return Float.valueOf(ki.q(((Float) obj6).floatValue()));
                            }
                        }, new Function0() { // from class: androidx.compose.material.di
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.r(fS8));
                            }
                        }, f23573i, null, 32, null);
                        c0VarR.Y(objI1);
                    } else {
                        final float f18 = 0.0f;
                        objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                return ki.p(f18, fS7, (x5) obj6);
                            }
                        }), new Function1() { // from class: androidx.compose.material.ci
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                return Float.valueOf(ki.q(((Float) obj6).floatValue()));
                            }
                        }, new Function0() { // from class: androidx.compose.material.di
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.r(fS8));
                            }
                        }, f23573i, null, 32, null);
                        c0VarR.Y(objI1);
                    }
                    uVar = (u) objI1;
                    int i211 = i18 >> 3;
                    n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, i211 & 14);
                    i19 = i18 & 14;
                    n7VarW2 = androidx.compose.runtime.w6.w(Boolean.valueOf(z10), c0VarR, i19);
                    zD = c0VarR.D(uVar) | c0VarR.D(n7VarW2) | c0VarR.D(n7VarW);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        a aVar17 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                        uVar2 = uVar;
                        c0VarR.Y(aVar17);
                        objI2 = aVar17;
                    } else {
                        a aVar18 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                        uVar2 = uVar;
                        c0VarR.Y(aVar18);
                        objI2 = aVar18;
                    }
                    androidx.compose.runtime.b2.i(uVar2, (Function2) objI2, c0VarR, 0);
                    Boolean boolValueOf9 = Boolean.valueOf(z10);
                    Boolean boolValueOf10 = Boolean.valueOf(n(n3Var));
                    if (i19 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD2 = z16 | c0VarR.D(uVar2);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        obj = null;
                        objI3 = new b(z10, uVar2, null);
                        c0VarR.Y(objI3);
                    } else {
                        obj = null;
                        objI3 = new b(z10, uVar2, null);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.runtime.b2.h(boolValueOf9, boolValueOf10, (Function2) objI3, c0VarR, i19);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (function1 != null) {
                        z14 = z12;
                        jVar6 = jVar5;
                        r10 = 0;
                        i20 = 2;
                        a0VarA = androidx.compose.foundation.selection.e.a(androidx.compose.ui.a0.E, z10, jVar6, null, z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                    } else {
                        z14 = z12;
                        jVar6 = jVar5;
                        r10 = 0;
                        i20 = 2;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    if (function1 != null) {
                        a0VarH = l9.h(androidx.compose.ui.a0.E);
                    } else {
                        a0VarH = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB6 = a0Var2.B2(a0VarH).B2(a0VarA);
                    androidx.compose.foundation.gestures.q3 q3Var5 = androidx.compose.foundation.gestures.q3.Horizontal;
                    if (z14) {
                        r18 = r10;
                    } else {
                        r18 = r10;
                    }
                    int i212 = i20;
                    Object obj6 = obj;
                    androidx.compose.ui.a0 a0VarD5 = k.d(a0VarB6, uVar2, q3Var5, r18, z17, jVar6, false);
                    uVar3 = uVar2;
                    androidx.compose.ui.e.a aVar19 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.a0 a0VarQ5 = androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0VarD5, aVar19.i(), r10, i212, obj6), f23569e), f23570f, f23571g);
                    androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(aVar19.C(), r10);
                    iJ = androidx.compose.runtime.v.j(c0VarR, r10);
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarQ5);
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.foundation.interaction.j jVar11 = jVar6;
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK5, aVar110.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar110.g());
                    function2B = aVar110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar110.f());
                    androidx.compose.ui.a0 a0Var9 = a0Var2;
                    androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                    boolean zBooleanValue5 = ((Boolean) uVar3.F()).booleanValue();
                    zD3 = c0VarR.D(uVar3);
                    objI4 = c0VarR.i0();
                    if (zD3) {
                        objI4 = new Function0() { // from class: androidx.compose.material.ei
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.l(uVar3));
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material.ei
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ki.l(uVar3));
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    s(d0Var5, zBooleanValue5, z14, zhVar2, (Function0) objI4, jVar11, c0VarR, (i211 & 896) | 6 | ((i18 >> 6) & 7168));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var9;
                    zhVar3 = zhVar2;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    jVar3 = jVar2;
                    zhVar3 = zhVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            return ki.m(z10, function1, a0Var3, z14, jVar3, zhVar3, i10, i11, (androidx.compose.runtime.c0) obj7, ((Integer) obj8).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    zhVar2 = zhVar;
                    if (c0VarR.D(zhVar2)) {
                    }
                    i12 |= i22;
                } else {
                    zhVar2 = zhVar;
                }
                i12 |= i22;
            } else {
                zhVar2 = zhVar;
            }
            i17 = i12;
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i17 & 1)) {
                c0VarR.l0();
                u6Var = null;
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        u6Var = null;
                        zh zhVarA10 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                        c0VarR = c0VarR;
                        i18 = i17 & (-458753);
                        z12 = z15;
                        zhVar2 = zhVarA10;
                        a0Var2 = a0Var4;
                    } else {
                        a0Var2 = a0Var4;
                        z12 = z15;
                        i18 = i17;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        u6Var = null;
                        zh zhVarA11 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                        c0VarR = c0VarR;
                        i18 = i17 & (-458753);
                        z12 = z15;
                        zhVar2 = zhVarA11;
                        a0Var2 = a0Var4;
                    } else {
                        a0Var2 = a0Var4;
                        z12 = z15;
                        i18 = i17;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(25866825, i18, -1, "androidx.compose.material.Switch (Switch.kt:99)");
                }
                if (jVar4 == null) {
                    c0VarR.E(1799821714);
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI5);
                    }
                    c0VarR.A();
                    jVar5 = (androidx.compose.foundation.interaction.j) objI5;
                } else {
                    c0VarR.E(-911773211);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23572h);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, u6Var, 2, u6Var);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                fS8 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23577m);
                zI = c0VarR.I(fS7) | c0VarR.I(fS8);
                objI1 = c0VarR.i0();
                if (zI) {
                    final float f19 = 0.0f;
                    objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            return ki.p(f19, fS7, (x5) obj7);
                        }
                    }), new Function1() { // from class: androidx.compose.material.ci
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            return Float.valueOf(ki.q(((Float) obj7).floatValue()));
                        }
                    }, new Function0() { // from class: androidx.compose.material.di
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.r(fS8));
                        }
                    }, f23573i, null, 32, null);
                    c0VarR.Y(objI1);
                } else {
                    final float f110 = 0.0f;
                    objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            return ki.p(f110, fS7, (x5) obj7);
                        }
                    }), new Function1() { // from class: androidx.compose.material.ci
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            return Float.valueOf(ki.q(((Float) obj7).floatValue()));
                        }
                    }, new Function0() { // from class: androidx.compose.material.di
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.r(fS8));
                        }
                    }, f23573i, null, 32, null);
                    c0VarR.Y(objI1);
                }
                uVar = (u) objI1;
                int i213 = i18 >> 3;
                n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, i213 & 14);
                i19 = i18 & 14;
                n7VarW2 = androidx.compose.runtime.w6.w(Boolean.valueOf(z10), c0VarR, i19);
                zD = c0VarR.D(uVar) | c0VarR.D(n7VarW2) | c0VarR.D(n7VarW);
                objI2 = c0VarR.i0();
                if (zD) {
                    a aVar111 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                    uVar2 = uVar;
                    c0VarR.Y(aVar111);
                    objI2 = aVar111;
                } else {
                    a aVar112 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                    uVar2 = uVar;
                    c0VarR.Y(aVar112);
                    objI2 = aVar112;
                }
                androidx.compose.runtime.b2.i(uVar2, (Function2) objI2, c0VarR, 0);
                Boolean boolValueOf11 = Boolean.valueOf(z10);
                Boolean boolValueOf12 = Boolean.valueOf(n(n3Var));
                if (i19 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD2 = z16 | c0VarR.D(uVar2);
                objI3 = c0VarR.i0();
                if (zD2) {
                    obj = null;
                    objI3 = new b(z10, uVar2, null);
                    c0VarR.Y(objI3);
                } else {
                    obj = null;
                    objI3 = new b(z10, uVar2, null);
                    c0VarR.Y(objI3);
                }
                androidx.compose.runtime.b2.h(boolValueOf11, boolValueOf12, (Function2) objI3, c0VarR, i19);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (function1 != null) {
                    z14 = z12;
                    jVar6 = jVar5;
                    r10 = 0;
                    i20 = 2;
                    a0VarA = androidx.compose.foundation.selection.e.a(androidx.compose.ui.a0.E, z10, jVar6, null, z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                } else {
                    z14 = z12;
                    jVar6 = jVar5;
                    r10 = 0;
                    i20 = 2;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                if (function1 != null) {
                    a0VarH = l9.h(androidx.compose.ui.a0.E);
                } else {
                    a0VarH = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB7 = a0Var2.B2(a0VarH).B2(a0VarA);
                androidx.compose.foundation.gestures.q3 q3Var6 = androidx.compose.foundation.gestures.q3.Horizontal;
                if (z14) {
                    r18 = r10;
                } else {
                    r18 = r10;
                }
                int i214 = i20;
                Object obj7 = obj;
                androidx.compose.ui.a0 a0VarD6 = k.d(a0VarB7, uVar2, q3Var6, r18, z17, jVar6, false);
                uVar3 = uVar2;
                androidx.compose.ui.e.a aVar113 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.a0 a0VarQ6 = androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0VarD6, aVar113.i(), r10, i214, obj7), f23569e), f23570f, f23571g);
                androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(aVar113.C(), r10);
                iJ = androidx.compose.runtime.v.j(c0VarR, r10);
                androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarQ6);
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.foundation.interaction.j jVar12 = jVar6;
                androidx.compose.runtime.y7.n(c0VarD, a1VarK6, aVar114.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK6, aVar114.g());
                function2B = aVar114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar114.f());
                androidx.compose.ui.a0 a0Var10 = a0Var2;
                androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                boolean zBooleanValue6 = ((Boolean) uVar3.F()).booleanValue();
                zD3 = c0VarR.D(uVar3);
                objI4 = c0VarR.i0();
                if (zD3) {
                    objI4 = new Function0() { // from class: androidx.compose.material.ei
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.l(uVar3));
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material.ei
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.l(uVar3));
                        }
                    };
                    c0VarR.Y(objI4);
                }
                s(d0Var6, zBooleanValue6, z14, zhVar2, (Function0) objI4, jVar12, c0VarR, (i213 & 896) | 6 | ((i18 >> 6) & 7168));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var10;
                zhVar3 = zhVar2;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z14 = z12;
                jVar3 = jVar2;
                zhVar3 = zhVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj8, Object obj9) {
                        return ki.m(z10, function1, a0Var3, z14, jVar3, zhVar3, i10, i11, (androidx.compose.runtime.c0) obj8, ((Integer) obj9).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    zhVar2 = zhVar;
                    if (c0VarR.D(zhVar2)) {
                    }
                    i12 |= i22;
                } else {
                    zhVar2 = zhVar;
                }
                i12 |= i22;
            } else {
                zhVar2 = zhVar;
            }
            i17 = i12;
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i17 & 1)) {
                c0VarR.l0();
                u6Var = null;
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        u6Var = null;
                        zh zhVarA12 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                        c0VarR = c0VarR;
                        i18 = i17 & (-458753);
                        z12 = z15;
                        zhVar2 = zhVarA12;
                        a0Var2 = a0Var4;
                    } else {
                        a0Var2 = a0Var4;
                        z12 = z15;
                        i18 = i17;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        u6Var = null;
                        zh zhVarA13 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                        c0VarR = c0VarR;
                        i18 = i17 & (-458753);
                        z12 = z15;
                        zhVar2 = zhVarA13;
                        a0Var2 = a0Var4;
                    } else {
                        a0Var2 = a0Var4;
                        z12 = z15;
                        i18 = i17;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(25866825, i18, -1, "androidx.compose.material.Switch (Switch.kt:99)");
                }
                if (jVar4 == null) {
                    c0VarR.E(1799821714);
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI5);
                    }
                    c0VarR.A();
                    jVar5 = (androidx.compose.foundation.interaction.j) objI5;
                } else {
                    c0VarR.E(-911773211);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23572h);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, u6Var, 2, u6Var);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                fS8 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23577m);
                zI = c0VarR.I(fS7) | c0VarR.I(fS8);
                objI1 = c0VarR.i0();
                if (zI) {
                    final float f111 = 0.0f;
                    objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            return ki.p(f111, fS7, (x5) obj8);
                        }
                    }), new Function1() { // from class: androidx.compose.material.ci
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            return Float.valueOf(ki.q(((Float) obj8).floatValue()));
                        }
                    }, new Function0() { // from class: androidx.compose.material.di
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.r(fS8));
                        }
                    }, f23573i, null, 32, null);
                    c0VarR.Y(objI1);
                } else {
                    final float f112 = 0.0f;
                    objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            return ki.p(f112, fS7, (x5) obj8);
                        }
                    }), new Function1() { // from class: androidx.compose.material.ci
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            return Float.valueOf(ki.q(((Float) obj8).floatValue()));
                        }
                    }, new Function0() { // from class: androidx.compose.material.di
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.r(fS8));
                        }
                    }, f23573i, null, 32, null);
                    c0VarR.Y(objI1);
                }
                uVar = (u) objI1;
                int i215 = i18 >> 3;
                n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, i215 & 14);
                i19 = i18 & 14;
                n7VarW2 = androidx.compose.runtime.w6.w(Boolean.valueOf(z10), c0VarR, i19);
                zD = c0VarR.D(uVar) | c0VarR.D(n7VarW2) | c0VarR.D(n7VarW);
                objI2 = c0VarR.i0();
                if (zD) {
                    a aVar115 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                    uVar2 = uVar;
                    c0VarR.Y(aVar115);
                    objI2 = aVar115;
                } else {
                    a aVar116 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                    uVar2 = uVar;
                    c0VarR.Y(aVar116);
                    objI2 = aVar116;
                }
                androidx.compose.runtime.b2.i(uVar2, (Function2) objI2, c0VarR, 0);
                Boolean boolValueOf13 = Boolean.valueOf(z10);
                Boolean boolValueOf14 = Boolean.valueOf(n(n3Var));
                if (i19 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD2 = z16 | c0VarR.D(uVar2);
                objI3 = c0VarR.i0();
                if (zD2) {
                    obj = null;
                    objI3 = new b(z10, uVar2, null);
                    c0VarR.Y(objI3);
                } else {
                    obj = null;
                    objI3 = new b(z10, uVar2, null);
                    c0VarR.Y(objI3);
                }
                androidx.compose.runtime.b2.h(boolValueOf13, boolValueOf14, (Function2) objI3, c0VarR, i19);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (function1 != null) {
                    z14 = z12;
                    jVar6 = jVar5;
                    r10 = 0;
                    i20 = 2;
                    a0VarA = androidx.compose.foundation.selection.e.a(androidx.compose.ui.a0.E, z10, jVar6, null, z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                } else {
                    z14 = z12;
                    jVar6 = jVar5;
                    r10 = 0;
                    i20 = 2;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                if (function1 != null) {
                    a0VarH = l9.h(androidx.compose.ui.a0.E);
                } else {
                    a0VarH = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB8 = a0Var2.B2(a0VarH).B2(a0VarA);
                androidx.compose.foundation.gestures.q3 q3Var7 = androidx.compose.foundation.gestures.q3.Horizontal;
                if (z14) {
                    r18 = r10;
                } else {
                    r18 = r10;
                }
                int i216 = i20;
                Object obj8 = obj;
                androidx.compose.ui.a0 a0VarD7 = k.d(a0VarB8, uVar2, q3Var7, r18, z17, jVar6, false);
                uVar3 = uVar2;
                androidx.compose.ui.e.a aVar117 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.a0 a0VarQ7 = androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0VarD7, aVar117.i(), r10, i216, obj8), f23569e), f23570f, f23571g);
                androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(aVar117.C(), r10);
                iJ = androidx.compose.runtime.v.j(c0VarR, r10);
                androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarQ7);
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.foundation.interaction.j jVar13 = jVar6;
                androidx.compose.runtime.y7.n(c0VarD, a1VarK7, aVar118.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar118.g());
                function2B = aVar118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar118.f());
                androidx.compose.ui.a0 a0Var11 = a0Var2;
                androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                boolean zBooleanValue7 = ((Boolean) uVar3.F()).booleanValue();
                zD3 = c0VarR.D(uVar3);
                objI4 = c0VarR.i0();
                if (zD3) {
                    objI4 = new Function0() { // from class: androidx.compose.material.ei
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.l(uVar3));
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material.ei
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ki.l(uVar3));
                        }
                    };
                    c0VarR.Y(objI4);
                }
                s(d0Var7, zBooleanValue7, z14, zhVar2, (Function0) objI4, jVar13, c0VarR, (i215 & 896) | 6 | ((i18 >> 6) & 7168));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var11;
                zhVar3 = zhVar2;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z14 = z12;
                jVar3 = jVar2;
                zhVar3 = zhVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj9, Object obj10) {
                        return ki.m(z10, function1, a0Var3, z14, jVar3, zhVar3, i10, i11, (androidx.compose.runtime.c0) obj9, ((Integer) obj10).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                zhVar2 = zhVar;
                if (c0VarR.D(zhVar2)) {
                }
                i12 |= i22;
            } else {
                zhVar2 = zhVar;
            }
            i12 |= i22;
        } else {
            zhVar2 = zhVar;
        }
        i17 = i12;
        if ((74899 & i12) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i17 & 1)) {
            c0VarR.l0();
            u6Var = null;
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 32) != 0) {
                    u6Var = null;
                    zh zhVarA14 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                    c0VarR = c0VarR;
                    i18 = i17 & (-458753);
                    z12 = z15;
                    zhVar2 = zhVarA14;
                    a0Var2 = a0Var4;
                } else {
                    a0Var2 = a0Var4;
                    z12 = z15;
                    i18 = i17;
                }
            } else {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 32) != 0) {
                    u6Var = null;
                    zh zhVarA15 = ai.f22088a.a(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                    c0VarR = c0VarR;
                    i18 = i17 & (-458753);
                    z12 = z15;
                    zhVar2 = zhVarA15;
                    a0Var2 = a0Var4;
                } else {
                    a0Var2 = a0Var4;
                    z12 = z15;
                    i18 = i17;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(25866825, i18, -1, "androidx.compose.material.Switch (Switch.kt:99)");
            }
            if (jVar4 == null) {
                c0VarR.E(1799821714);
                objI5 = c0VarR.i0();
                if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI5 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI5);
                }
                c0VarR.A();
                jVar5 = (androidx.compose.foundation.interaction.j) objI5;
            } else {
                c0VarR.E(-911773211);
                c0VarR.A();
                jVar5 = jVar4;
            }
            fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23572h);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, u6Var, 2, u6Var);
                c0VarR.Y(objI0);
            }
            n3Var = (androidx.compose.runtime.n3) objI0;
            fS8 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f23577m);
            zI = c0VarR.I(fS7) | c0VarR.I(fS8);
            objI1 = c0VarR.i0();
            if (zI) {
                final float f113 = 0.0f;
                objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        return ki.p(f113, fS7, (x5) obj9);
                    }
                }), new Function1() { // from class: androidx.compose.material.ci
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        return Float.valueOf(ki.q(((Float) obj9).floatValue()));
                    }
                }, new Function0() { // from class: androidx.compose.material.di
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ki.r(fS8));
                    }
                }, f23573i, null, 32, null);
                c0VarR.Y(objI1);
            } else {
                final float f114 = 0.0f;
                objI1 = new u(Boolean.valueOf(z10), k.a(new Function1() { // from class: androidx.compose.material.bi
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        return ki.p(f114, fS7, (x5) obj9);
                    }
                }), new Function1() { // from class: androidx.compose.material.ci
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        return Float.valueOf(ki.q(((Float) obj9).floatValue()));
                    }
                }, new Function0() { // from class: androidx.compose.material.di
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ki.r(fS8));
                    }
                }, f23573i, null, 32, null);
                c0VarR.Y(objI1);
            }
            uVar = (u) objI1;
            int i217 = i18 >> 3;
            n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, i217 & 14);
            i19 = i18 & 14;
            n7VarW2 = androidx.compose.runtime.w6.w(Boolean.valueOf(z10), c0VarR, i19);
            zD = c0VarR.D(uVar) | c0VarR.D(n7VarW2) | c0VarR.D(n7VarW);
            objI2 = c0VarR.i0();
            if (zD) {
                a aVar119 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                uVar2 = uVar;
                c0VarR.Y(aVar119);
                objI2 = aVar119;
            } else {
                a aVar1110 = new a(uVar, n7VarW2, n7VarW, n3Var, null);
                uVar2 = uVar;
                c0VarR.Y(aVar1110);
                objI2 = aVar1110;
            }
            androidx.compose.runtime.b2.i(uVar2, (Function2) objI2, c0VarR, 0);
            Boolean boolValueOf15 = Boolean.valueOf(z10);
            Boolean boolValueOf16 = Boolean.valueOf(n(n3Var));
            if (i19 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            zD2 = z16 | c0VarR.D(uVar2);
            objI3 = c0VarR.i0();
            if (zD2) {
                obj = null;
                objI3 = new b(z10, uVar2, null);
                c0VarR.Y(objI3);
            } else {
                obj = null;
                objI3 = new b(z10, uVar2, null);
                c0VarR.Y(objI3);
            }
            androidx.compose.runtime.b2.h(boolValueOf15, boolValueOf16, (Function2) objI3, c0VarR, i19);
            if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (function1 != null) {
                z14 = z12;
                jVar6 = jVar5;
                r10 = 0;
                i20 = 2;
                a0VarA = androidx.compose.foundation.selection.e.a(androidx.compose.ui.a0.E, z10, jVar6, null, z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
            } else {
                z14 = z12;
                jVar6 = jVar5;
                r10 = 0;
                i20 = 2;
                a0VarA = androidx.compose.ui.a0.E;
            }
            if (function1 != null) {
                a0VarH = l9.h(androidx.compose.ui.a0.E);
            } else {
                a0VarH = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarB9 = a0Var2.B2(a0VarH).B2(a0VarA);
            androidx.compose.foundation.gestures.q3 q3Var8 = androidx.compose.foundation.gestures.q3.Horizontal;
            if (z14) {
                r18 = r10;
            } else {
                r18 = r10;
            }
            int i218 = i20;
            Object obj9 = obj;
            androidx.compose.ui.a0 a0VarD8 = k.d(a0VarB9, uVar2, q3Var8, r18, z17, jVar6, false);
            uVar3 = uVar2;
            androidx.compose.ui.e.a aVar1111 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.a0 a0VarQ8 = androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0VarD8, aVar1111.i(), r10, i218, obj9), f23569e), f23570f, f23571g);
            androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(aVar1111.C(), r10);
            iJ = androidx.compose.runtime.v.j(c0VarR, r10);
            androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarQ8);
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
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.foundation.interaction.j jVar14 = jVar6;
            androidx.compose.runtime.y7.n(c0VarD, a1VarK8, aVar1112.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK8, aVar1112.g());
            function2B = aVar1112.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN8, aVar1112.f());
            androidx.compose.ui.a0 a0Var12 = a0Var2;
            androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
            boolean zBooleanValue8 = ((Boolean) uVar3.F()).booleanValue();
            zD3 = c0VarR.D(uVar3);
            objI4 = c0VarR.i0();
            if (zD3) {
                objI4 = new Function0() { // from class: androidx.compose.material.ei
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ki.l(uVar3));
                    }
                };
                c0VarR.Y(objI4);
            } else {
                objI4 = new Function0() { // from class: androidx.compose.material.ei
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ki.l(uVar3));
                    }
                };
                c0VarR.Y(objI4);
            }
            s(d0Var8, zBooleanValue8, z14, zhVar2, (Function0) objI4, jVar14, c0VarR, (i217 & 896) | 6 | ((i18 >> 6) & 7168));
            c0Var2 = c0VarR;
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var12;
            zhVar3 = zhVar2;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z14 = z12;
            jVar3 = jVar2;
            zhVar3 = zhVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.fi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    return ki.m(z10, function1, a0Var3, z14, jVar3, zhVar3, i10, i11, (androidx.compose.runtime.c0) obj10, ((Integer) obj11).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Boolean, Unit> j(androidx.compose.runtime.n7<? extends Function1<? super Boolean, Unit>> n7Var) {
        return (Function1) n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(androidx.compose.runtime.n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(u uVar) {
        return uVar.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.foundation.interaction.j jVar, zh zhVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(z10, function1, a0Var, z11, jVar, zhVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(androidx.compose.runtime.n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(androidx.compose.runtime.n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(float f10, float f11, x5 x5Var) {
        x5Var.a(Boolean.FALSE, f10);
        x5Var.a(Boolean.TRUE, f11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float q(float f10) {
        return f10 * 0.7f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float r(float f10) {
        return f10;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void s(final androidx.compose.foundation.layout.c0 c0Var, final boolean z10, final boolean z11, final zh zhVar, final Function0<Float> function0, final androidx.compose.foundation.interaction.h hVar, androidx.compose.runtime.c0 c0Var2, final int i10) {
        int i11;
        boolean z12;
        long jV;
        androidx.compose.runtime.c0 c0VarR = c0Var2.R(70908914);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(c0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(zhVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(function0) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.D(hVar) ? 131072 : 65536;
        }
        int i12 = i11;
        if (c0VarR.h((74899 & i12) != 74898, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(70908914, i12, -1, "androidx.compose.material.SwitchImpl (Switch.kt:219)");
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.w6.g();
                c0VarR.Y(objI0);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objI0;
            boolean z13 = (458752 & i12) == 131072;
            Object objI1 = c0VarR.i0();
            if (z13 || objI1 == aVar.a()) {
                objI1 = new c(hVar, snapshotStateList, null);
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.b2.i(hVar, (Function2) objI1, c0VarR, (i12 >> 15) & 14);
            float f10 = !snapshotStateList.isEmpty() ? f23575k : f23574j;
            int i13 = ((i12 >> 6) & 14) | (i12 & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 3) & 896);
            final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarA = zhVar.a(z11, z10, c0VarR, i13);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.a0 a0VarF = androidx.compose.foundation.layout.i6.f(c0Var.b(aVar2, aVar3.i()), 0.0f, 1, null);
            boolean zD = c0VarR.D(n7VarA);
            Object objI2 = c0VarR.i0();
            if (zD || objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material.gi
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ki.u(n7VarA, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.foundation.f1.e(a0VarF, (Function1) objI2, c0VarR, 0);
            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB = zhVar.b(z11, z10, c0VarR, i13);
            q7 q7Var = (q7) c0VarR.W(t7.h());
            float fR = androidx.compose.ui.unit.h.r(((androidx.compose.ui.unit.h) c0VarR.W(t7.g())).O() + f10);
            if (!androidx.compose.ui.graphics.q0.y(v(n7VarB), x9.f25488a.a(c0VarR, 6).n()) || q7Var == null) {
                z12 = true;
                c0VarR.E(-674731226);
                c0VarR.A();
                jV = v(n7VarB);
            } else {
                c0VarR.E(-674820165);
                z12 = true;
                jV = q7Var.a(v(n7VarB), fR, c0VarR, 0);
                c0VarR.A();
            }
            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = androidx.compose.animation.e1.c(jV, null, null, null, c0VarR, 0, 14);
            c0VarR = c0VarR;
            androidx.compose.ui.a0 a0VarB = c0Var.b(aVar2, aVar3.o());
            boolean z14 = (i12 & 57344) == 16384 ? z12 : false;
            Object objI3 = c0VarR.i0();
            if (z14 || objI3 == aVar.a()) {
                objI3 = new Function1() { // from class: androidx.compose.material.hi
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ki.x(function0, (androidx.compose.ui.unit.d) obj);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.w2.d(androidx.compose.foundation.layout.s4.j(a0VarB, (Function1) objI3), hVar, wd.h(false, f23568d, 0L, 4, null)), f23567c), f10, androidx.compose.foundation.shape.o.k(), false, 0L, 0L, 24, null), w(n7VarC), androidx.compose.foundation.shape.o.k()), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.ii
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ki.y(c0Var, z10, z11, zhVar, function0, hVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long t(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        D(fVar, t(n7Var), fVar.S7(f23565a), fVar.S7(f23566b));
        return Unit.f312394a;
    }

    private static final long v(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    private static final long w(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.q x(Function0 function0, androidx.compose.ui.unit.d dVar) {
        return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) kotlin.math.b.L0(((Number) function0.invoke()).floatValue())) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(androidx.compose.foundation.layout.c0 c0Var, boolean z10, boolean z11, zh zhVar, Function0 function0, androidx.compose.foundation.interaction.h hVar, int i10, androidx.compose.runtime.c0 c0Var2, int i11) {
        s(c0Var, z10, z11, zhVar, function0, hVar, c0Var2, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
