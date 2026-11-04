package androidx.compose.foundation.pager;

import androidx.compose.foundation.c5;
import androidx.compose.foundation.gestures.e3;
import androidx.compose.foundation.gestures.e5;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.lazy.layout.l2;
import androidx.compose.foundation.lazy.layout.q1;
import androidx.compose.foundation.lazy.layout.r1;
import androidx.compose.foundation.x3;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.exoplayer.a5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,410:1\n113#2:411\n97#3,4:412\n1282#4,6:416\n1282#4,3:429\n1285#4,3:433\n1282#4,6:436\n1282#4,6:442\n1282#4,6:449\n1282#4,6:455\n607#5:422\n604#5,6:423\n605#6:432\n75#7:448\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n*L\n88#1:411\n104#1:412,4\n110#1:416,6\n114#1:429,3\n114#1:433,3\n130#1:436,6\n136#1:442,6\n140#1:449,6\n262#1:455,6\n114#1:422\n114#1:423,6\n114#1:432\n138#1:448\n*E\n"})
public final class k {

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f18335a;

        /* JADX INFO: renamed from: androidx.compose.foundation.pager.k$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
        static final class C0118a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f18336a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f18337b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i1 f18338c;

            /* JADX INFO: renamed from: androidx.compose.foundation.pager.k$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", i = {0, 1, 1, 1}, l = {288, 292}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "downEvent", "upEventOrCancellation"}, s = {"L$0", "L$0", "L$1", "L$2"})
            @SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,410:1\n88#2:411\n35#2,5:412\n89#2:417\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n*L\n293#1:411\n293#1:412,5\n293#1:417\n*E\n"})
            static final class C0119a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f18339a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f18340b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f18341c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f18342d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ i1 f18343e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0119a(i1 i1Var, kotlin.coroutines.d<? super C0119a> dVar) {
                    super(2, dVar);
                    this.f18343e = i1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C0119a c0119a = new C0119a(this.f18343e, dVar);
                    c0119a.f18342d = obj;
                    return c0119a;
                }

                /* JADX WARN: Code duplicated, block: B:24:0x008c  */
                /* JADX WARN: Code duplicated, block: B:27:0x009a A[LOOP:0: B:22:0x0089->B:27:0x009a, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:31:0x009d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:32:0x0061 A[EDGE_INSN: B:32:0x0061->B:15:0x0061 BREAK  A[LOOP:0: B:22:0x0089->B:27:0x009a], SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:21:0x0079). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.a
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r11.f18341c
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L34
                        if (r1 == r4) goto L2b
                        r10 = 1
                        if (r1 != r2) goto L22
                        java.lang.Object r1 = r11.f18340b
                        androidx.compose.ui.input.pointer.c0 r1 = (androidx.compose.ui.input.pointer.c0) r1
                        java.lang.Object r4 = r11.f18339a
                        androidx.compose.ui.input.pointer.c0 r4 = (androidx.compose.ui.input.pointer.c0) r4
                        r10 = 4
                        java.lang.Object r5 = r11.f18342d
                        androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.c) r5
                        r10 = 7
                        kotlin.ResultKt.m(r12)
                        goto L79
                    L22:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r10 = 4
                        r11.<init>(r12)
                        throw r11
                    L2b:
                        java.lang.Object r1 = r11.f18342d
                        androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                        r10 = 6
                        kotlin.ResultKt.m(r12)
                        goto L4d
                    L34:
                        kotlin.ResultKt.m(r12)
                        java.lang.Object r12 = r11.f18342d
                        r1 = r12
                        androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                        r10 = 7
                        androidx.compose.ui.input.pointer.s r12 = androidx.compose.ui.input.pointer.s.Initial
                        r10 = 0
                        r11.f18342d = r1
                        r10 = 0
                        r11.f18341c = r4
                        java.lang.Object r12 = androidx.compose.foundation.gestures.c5.e(r1, r3, r12, r11)
                        r10 = 5
                        if (r12 != r0) goto L4d
                        goto L77
                    L4d:
                        r10 = 2
                        androidx.compose.ui.input.pointer.c0 r12 = (androidx.compose.ui.input.pointer.c0) r12
                        androidx.compose.foundation.pager.i1 r4 = r11.f18343e
                        n0.g$a r5 = n0.g.f332700b
                        long r5 = r5.e()
                        r10 = 2
                        r4.J0(r5)
                        r10 = 3
                        r4 = 0
                        r5 = r1
                        r1 = r4
                        r4 = r12
                    L61:
                        r10 = 5
                        if (r1 != 0) goto Laa
                        androidx.compose.ui.input.pointer.s r12 = androidx.compose.ui.input.pointer.s.Initial
                        r11.f18342d = r5
                        r11.f18339a = r4
                        r10 = 3
                        r11.f18340b = r1
                        r10 = 7
                        r11.f18341c = r2
                        java.lang.Object r12 = r5.I6(r12, r11)
                        r10 = 0
                        if (r12 != r0) goto L79
                    L77:
                        r10 = 1
                        return r0
                    L79:
                        androidx.compose.ui.input.pointer.q r12 = (androidx.compose.ui.input.pointer.q) r12
                        java.util.List r6 = r12.e()
                        r7 = r6
                        r10 = 3
                        java.util.Collection r7 = (java.util.Collection) r7
                        int r7 = r7.size()
                        r10 = 2
                        r8 = r3
                    L89:
                        r10 = 0
                        if (r8 >= r7) goto L9d
                        java.lang.Object r9 = r6.get(r8)
                        r10 = 1
                        androidx.compose.ui.input.pointer.c0 r9 = (androidx.compose.ui.input.pointer.c0) r9
                        boolean r9 = androidx.compose.ui.input.pointer.r.d(r9)
                        if (r9 != 0) goto L9a
                        goto L61
                    L9a:
                        int r8 = r8 + 1
                        goto L89
                    L9d:
                        java.util.List r12 = r12.e()
                        java.lang.Object r12 = r12.get(r3)
                        r1 = r12
                        r1 = r12
                        androidx.compose.ui.input.pointer.c0 r1 = (androidx.compose.ui.input.pointer.c0) r1
                        goto L61
                    Laa:
                        r10 = 6
                        androidx.compose.foundation.pager.i1 r11 = r11.f18343e
                        r10 = 6
                        long r0 = r1.u()
                        long r2 = r4.u()
                        long r0 = n0.g.v(r0, r2)
                        r11.J0(r0)
                        r10 = 0
                        kotlin.Unit r11 = kotlin.Unit.f312394a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.k.a.C0118a.C0119a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0119a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0118a(androidx.compose.ui.input.pointer.l0 l0Var, i1 i1Var, kotlin.coroutines.d<? super C0118a> dVar) {
                super(2, dVar);
                this.f18337b = l0Var;
                this.f18338c = i1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0118a(this.f18337b, this.f18338c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f18336a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f18337b;
                    C0119a c0119a = new C0119a(this.f18338c, null);
                    this.f18336a = 1;
                    if (e3.e(l0Var, c0119a, this) == objL) {
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
                return ((C0118a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(i1 i1Var) {
            this.f18335a = i1Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG = kotlinx.coroutines.t0.g(new C0118a(l0Var, this.f18335a, null), dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0164  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0186  */
    /* JADX WARN: Code duplicated, block: B:133:0x018a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0194  */
    /* JADX WARN: Code duplicated, block: B:139:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:153:0x01be  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:160:0x01da  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:164:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x0205  */
    /* JADX WARN: Code duplicated, block: B:176:0x020b  */
    /* JADX WARN: Code duplicated, block: B:177:0x020e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0220  */
    /* JADX WARN: Code duplicated, block: B:185:0x022c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0238  */
    /* JADX WARN: Code duplicated, block: B:190:0x023a  */
    /* JADX WARN: Code duplicated, block: B:192:0x023e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0245  */
    /* JADX WARN: Code duplicated, block: B:196:0x024d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0257  */
    /* JADX WARN: Code duplicated, block: B:199:0x025c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0260  */
    /* JADX WARN: Code duplicated, block: B:204:0x027a  */
    /* JADX WARN: Code duplicated, block: B:205:0x027f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0286  */
    /* JADX WARN: Code duplicated, block: B:210:0x028e  */
    /* JADX WARN: Code duplicated, block: B:213:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:216:0x02da  */
    /* JADX WARN: Code duplicated, block: B:217:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:220:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:222:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:225:0x034d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0352  */
    /* JADX WARN: Code duplicated, block: B:229:0x035b  */
    /* JADX WARN: Code duplicated, block: B:230:0x035e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0367  */
    /* JADX WARN: Code duplicated, block: B:234:0x036a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0372  */
    /* JADX WARN: Code duplicated, block: B:241:0x037e  */
    /* JADX WARN: Code duplicated, block: B:244:0x039c  */
    /* JADX WARN: Code duplicated, block: B:245:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:248:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:253:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:254:0x03de  */
    /* JADX WARN: Code duplicated, block: B:257:0x0424  */
    /* JADX WARN: Code duplicated, block: B:258:0x0427  */
    /* JADX WARN: Code duplicated, block: B:261:0x046b  */
    /* JADX WARN: Code duplicated, block: B:263:0x0471  */
    /* JADX WARN: Code duplicated, block: B:266:0x0480  */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    /* JADX WARN: Instruction removed from duplicated block: B:201:0x0260, please report this as an issue */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void f(@NotNull final androidx.compose.ui.a0 a0Var, @NotNull i1 i1Var, @NotNull final g5 g5Var, final boolean z10, @NotNull final q3 q3Var, @NotNull final e5 e5Var, final boolean z11, @Nullable final x3 x3Var, int i10, float f10, @NotNull final p pVar, @NotNull androidx.compose.ui.input.nestedscroll.a aVar, @Nullable final Function1<? super Integer, ? extends Object> function1, @NotNull final androidx.compose.ui.e.b bVar, @NotNull final androidx.compose.ui.e.c cVar, @NotNull final androidx.compose.foundation.gestures.snapping.o oVar, @NotNull final pj.o<? super v0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z12;
        androidx.compose.ui.input.nestedscroll.a aVar2;
        androidx.compose.runtime.c0 c0Var2;
        final float f11;
        final int i34;
        s5 s5VarT;
        int i35;
        float fR;
        boolean z13;
        int i36;
        boolean z14;
        Object objI0;
        int i37;
        int i38;
        int i39;
        Object objI1;
        androidx.compose.runtime.c0.a aVar3;
        boolean z15;
        Object objI2;
        q3 q3Var2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objI3;
        androidx.compose.foundation.gestures.m0 m0Var;
        boolean z20;
        boolean zD;
        Object objI4;
        androidx.compose.ui.a0 a0VarB;
        boolean z21;
        final i1 i1Var2 = i1Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-572816025);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (c0VarR.D(a0Var) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= c0VarR.D(i1Var2) ? 32 : 16;
        }
        if ((i13 & 4) == 0) {
            if ((i11 & a5.S0) == 0) {
                i14 |= c0VarR.D(g5Var) ? 256 : 128;
            }
            if ((i13 & 8) != 0) {
                i14 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (c0VarR.G(z10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i14 |= i15;
            }
            if ((i13 & 16) != 0) {
                i14 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (c0VarR.K(q3Var.ordinal())) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i14 |= i16;
            }
            if ((i13 & 32) != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(e5Var)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i14 |= i17;
            }
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.G(z11)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i14 |= i18;
            }
            if ((i13 & 128) != 0) {
                if ((12582912 & i11) == 0) {
                    if (c0VarR.D(x3Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i14 |= i19;
                }
                i20 = i13 & 256;
                if (i20 != 0) {
                    i14 |= 100663296;
                    i21 = i10;
                } else {
                    i21 = i10;
                    if ((i11 & 100663296) == 0) {
                        if (c0VarR.K(i21)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i14 |= i22;
                    }
                }
                i23 = i13 & 512;
                if (i23 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c0VarR.I(f10)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i14 |= i24;
                }
                if ((i13 & 1024) != 0) {
                    i25 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c0VarR.D(pVar)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i12 | i26;
                } else {
                    i25 = i12;
                }
                if ((i13 & 2048) != 0) {
                    i25 |= 48;
                } else if ((i12 & 48) == 0) {
                    if (c0VarR.k0(aVar)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i25 |= i27;
                }
                i28 = i25;
                if ((i13 & 4096) != 0) {
                    if ((i12 & a5.S0) == 0) {
                        i28 |= c0VarR.k0(function1) ? 256 : 128;
                    }
                    if ((i13 & 8192) != 0) {
                        if ((i12 & 3072) == 0) {
                            i28 |= c0VarR.D(bVar) ? 2048 : 1024;
                        }
                        if ((i13 & 16384) != 0) {
                            if ((i12 & 24576) == 0) {
                                i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                            }
                            if ((i13 & 32768) != 0) {
                                i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                            } else {
                                i29 = i28;
                                if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                    if (c0VarR.D(oVar)) {
                                        i31 = 131072;
                                    } else {
                                        i31 = 65536;
                                    }
                                    i30 = i29 | i31;
                                } else {
                                    i30 = i29;
                                }
                            }
                            if ((i13 & 65536) != 0) {
                                i30 |= 1572864;
                            } else if ((i12 & 1572864) == 0) {
                                if (c0VarR.k0(oVar2)) {
                                    i32 = 1048576;
                                } else {
                                    i32 = 524288;
                                }
                                i30 |= i32;
                            }
                            i33 = i30;
                            if ((i14 & 306783379) == 306783378 || (599187 & i33) != 599186) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (c0VarR.h(z12, i14 & 1)) {
                                if (i20 != 0) {
                                    i35 = 0;
                                } else {
                                    i35 = i21;
                                }
                                if (i23 != 0) {
                                    fR = androidx.compose.ui.unit.h.r(0);
                                } else {
                                    fR = f10;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                                }
                                if (i35 >= 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (!z13) {
                                    androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                                }
                                i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                                if (i36 == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                objI0 = c0VarR.i0();
                                if (z14 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Integer.valueOf(k.g(i1Var2));
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                int i40 = i14 >> 3;
                                i37 = i40 & 14;
                                int i41 = i33 >> 15;
                                i38 = i14;
                                i39 = i35;
                                Function0<l0> function0K = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                                objI1 = c0VarR.i0();
                                aVar3 = androidx.compose.runtime.c0.f35327a;
                                if (objI1 == aVar3.a()) {
                                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                    c0VarR.Y(objI1);
                                }
                                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI1;
                                if (i36 == 32) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                objI2 = c0VarR.i0();
                                if (z15 || objI2 == aVar3.a()) {
                                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Integer.valueOf(k.h(i1Var2));
                                        }
                                    };
                                    c0VarR.Y(objI2);
                                }
                                int i42 = i38 >> 9;
                                int i43 = i33 << 15;
                                androidx.compose.foundation.lazy.layout.v0 v0VarA = t0.a(function0K, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var, (Function0) objI2, c0VarR, (i38 & 65520) | (i42 & 458752) | (i42 & 3670016) | ((i33 << 21) & 29360128) | (i43 & 234881024) | (i43 & 1879048192), i41 & 14);
                                float f12 = fR;
                                q3Var2 = q3.Vertical;
                                if (q3Var == q3Var2) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                q1 q1VarA = a1.a(i1Var2, z16, c0VarR, i37);
                                if (i36 == 32) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if ((i38 & 458752) == 131072) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z19 = z18 | z17;
                                objI3 = c0VarR.i0();
                                if (z19 || objI3 == aVar3.a()) {
                                    objI3 = new o1(e5Var, i1Var2);
                                    c0VarR.Y(objI3);
                                }
                                o1 o1Var = (o1) objI3;
                                m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                                if (i36 == 32) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                zD = z20 | c0VarR.D(m0Var);
                                objI4 = c0VarR.i0();
                                if (zD || objI4 == aVar3.a()) {
                                    objI4 = new s(i1Var2, m0Var);
                                    c0VarR.Y(objI4);
                                }
                                s sVar = (s) objI4;
                                if (z11) {
                                    c0VarR.E(-853761213);
                                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(-853331429);
                                    c0VarR.A();
                                    a0VarB = androidx.compose.ui.a0.E;
                                }
                                androidx.compose.ui.a0 a0VarC = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K, q1VarA, q3Var, z11, z10, c0VarR, (i40 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                                if (q3Var == q3Var2) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                androidx.compose.ui.a0 a0VarA = c5.a(g0.t(a0VarC, i1Var2, z21, s0Var, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var, i1Var2.L(), false, x3Var, sVar);
                                i1Var2 = i1Var2;
                                aVar2 = aVar;
                                androidx.compose.foundation.lazy.layout.u0.c(function0K, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA, c0VarR, 0, 0);
                                c0Var2 = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                f11 = f12;
                                i34 = i39;
                            } else {
                                aVar2 = aVar;
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                f11 = f10;
                                i34 = i21;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                final androidx.compose.ui.input.nestedscroll.a aVar4 = aVar2;
                                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar4, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i28 |= 24576;
                        if ((i13 & 32768) != 0) {
                            i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                        } else {
                            i29 = i28;
                            if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                if (c0VarR.D(oVar)) {
                                    i31 = 131072;
                                } else {
                                    i31 = 65536;
                                }
                                i30 = i29 | i31;
                            } else {
                                i30 = i29;
                            }
                        }
                        if ((i13 & 65536) != 0) {
                            i30 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(oVar2)) {
                                i32 = 1048576;
                            } else {
                                i32 = 524288;
                            }
                            i30 |= i32;
                        }
                        i33 = i30;
                        if ((i14 & 306783379) == 306783378) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (c0VarR.h(z12, i14 & 1)) {
                            if (i20 != 0) {
                                i35 = 0;
                            } else {
                                i35 = i21;
                            }
                            if (i23 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f10;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                            }
                            if (i35 >= 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                            }
                            i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                            if (i36 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z14) {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            int i44 = i14 >> 3;
                            i37 = i44 & 14;
                            int i45 = i33 >> 15;
                            i38 = i14;
                            i39 = i35;
                            Function0<l0> function0K2 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i45 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                            objI1 = c0VarR.i0();
                            aVar3 = androidx.compose.runtime.c0.f35327a;
                            if (objI1 == aVar3.a()) {
                                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI1);
                            }
                            kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) objI1;
                            if (i36 == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z15) {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            int i46 = i38 >> 9;
                            int i47 = i33 << 15;
                            androidx.compose.foundation.lazy.layout.v0 v0VarA2 = t0.a(function0K2, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var2, (Function0) objI2, c0VarR, (i38 & 65520) | (i46 & 458752) | (i46 & 3670016) | ((i33 << 21) & 29360128) | (i47 & 234881024) | (i47 & 1879048192), i45 & 14);
                            float f13 = fR;
                            q3Var2 = q3.Vertical;
                            if (q3Var == q3Var2) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            q1 q1VarA2 = a1.a(i1Var2, z16, c0VarR, i37);
                            if (i36 == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i38 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objI3 = c0VarR.i0();
                            if (z19) {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            } else {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            }
                            o1 o1Var2 = (o1) objI3;
                            m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                            if (i36 == 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            zD = z20 | c0VarR.D(m0Var);
                            objI4 = c0VarR.i0();
                            if (zD) {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            } else {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            }
                            s sVar2 = (s) objI4;
                            if (z11) {
                                c0VarR.E(-853761213);
                                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-853331429);
                                c0VarR.A();
                                a0VarB = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.ui.a0 a0VarC2 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K2, q1VarA2, q3Var, z11, z10, c0VarR, (i44 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                            if (q3Var == q3Var2) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            androidx.compose.ui.a0 a0VarA2 = c5.a(g0.t(a0VarC2, i1Var2, z21, s0Var2, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var2, i1Var2.L(), false, x3Var, sVar2);
                            i1Var2 = i1Var2;
                            aVar2 = aVar;
                            androidx.compose.foundation.lazy.layout.u0.c(function0K2, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA2, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA2, c0VarR, 0, 0);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            f11 = f13;
                            i34 = i39;
                        } else {
                            aVar2 = aVar;
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            f11 = f10;
                            i34 = i21;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            final androidx.compose.ui.input.nestedscroll.a aVar5 = aVar2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar5, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i28 |= 3072;
                    if ((i13 & 16384) != 0) {
                        if ((i12 & 24576) == 0) {
                            i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                        }
                        if ((i13 & 32768) != 0) {
                            i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                        } else {
                            i29 = i28;
                            if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                if (c0VarR.D(oVar)) {
                                    i31 = 131072;
                                } else {
                                    i31 = 65536;
                                }
                                i30 = i29 | i31;
                            } else {
                                i30 = i29;
                            }
                        }
                        if ((i13 & 65536) != 0) {
                            i30 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(oVar2)) {
                                i32 = 1048576;
                            } else {
                                i32 = 524288;
                            }
                            i30 |= i32;
                        }
                        i33 = i30;
                        if ((i14 & 306783379) == 306783378) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (c0VarR.h(z12, i14 & 1)) {
                            if (i20 != 0) {
                                i35 = 0;
                            } else {
                                i35 = i21;
                            }
                            if (i23 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f10;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                            }
                            if (i35 >= 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                            }
                            i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                            if (i36 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z14) {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            int i48 = i14 >> 3;
                            i37 = i48 & 14;
                            int i49 = i33 >> 15;
                            i38 = i14;
                            i39 = i35;
                            Function0<l0> function0K3 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i49 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                            objI1 = c0VarR.i0();
                            aVar3 = androidx.compose.runtime.c0.f35327a;
                            if (objI1 == aVar3.a()) {
                                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI1);
                            }
                            kotlinx.coroutines.s0 s0Var3 = (kotlinx.coroutines.s0) objI1;
                            if (i36 == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z15) {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            int i410 = i38 >> 9;
                            int i411 = i33 << 15;
                            androidx.compose.foundation.lazy.layout.v0 v0VarA3 = t0.a(function0K3, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var3, (Function0) objI2, c0VarR, (i38 & 65520) | (i410 & 458752) | (i410 & 3670016) | ((i33 << 21) & 29360128) | (i411 & 234881024) | (i411 & 1879048192), i49 & 14);
                            float f14 = fR;
                            q3Var2 = q3.Vertical;
                            if (q3Var == q3Var2) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            q1 q1VarA3 = a1.a(i1Var2, z16, c0VarR, i37);
                            if (i36 == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i38 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objI3 = c0VarR.i0();
                            if (z19) {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            } else {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            }
                            o1 o1Var3 = (o1) objI3;
                            m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                            if (i36 == 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            zD = z20 | c0VarR.D(m0Var);
                            objI4 = c0VarR.i0();
                            if (zD) {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            } else {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            }
                            s sVar3 = (s) objI4;
                            if (z11) {
                                c0VarR.E(-853761213);
                                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-853331429);
                                c0VarR.A();
                                a0VarB = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.ui.a0 a0VarC3 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K3, q1VarA3, q3Var, z11, z10, c0VarR, (i48 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                            if (q3Var == q3Var2) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            androidx.compose.ui.a0 a0VarA3 = c5.a(g0.t(a0VarC3, i1Var2, z21, s0Var3, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var3, i1Var2.L(), false, x3Var, sVar3);
                            i1Var2 = i1Var2;
                            aVar2 = aVar;
                            androidx.compose.foundation.lazy.layout.u0.c(function0K3, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA3, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA3, c0VarR, 0, 0);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            f11 = f14;
                            i34 = i39;
                        } else {
                            aVar2 = aVar;
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            f11 = f10;
                            i34 = i21;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            final androidx.compose.ui.input.nestedscroll.a aVar6 = aVar2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar6, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i28 |= 24576;
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i412 = i14 >> 3;
                        i37 = i412 & 14;
                        int i413 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K4 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i413 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var4 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i414 = i38 >> 9;
                        int i415 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA4 = t0.a(function0K4, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var4, (Function0) objI2, c0VarR, (i38 & 65520) | (i414 & 458752) | (i414 & 3670016) | ((i33 << 21) & 29360128) | (i415 & 234881024) | (i415 & 1879048192), i413 & 14);
                        float f15 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA4 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var4 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar4 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC4 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K4, q1VarA4, q3Var, z11, z10, c0VarR, (i412 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA4 = c5.a(g0.t(a0VarC4, i1Var2, z21, s0Var4, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var4, i1Var2.L(), false, x3Var, sVar4);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K4, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA4, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA4, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f15;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar7 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar7, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= a5.S0;
                if ((i13 & 8192) != 0) {
                    if ((i12 & 3072) == 0) {
                        i28 |= c0VarR.D(bVar) ? 2048 : 1024;
                    }
                    if ((i13 & 16384) != 0) {
                        if ((i12 & 24576) == 0) {
                            i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                        }
                        if ((i13 & 32768) != 0) {
                            i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                        } else {
                            i29 = i28;
                            if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                if (c0VarR.D(oVar)) {
                                    i31 = 131072;
                                } else {
                                    i31 = 65536;
                                }
                                i30 = i29 | i31;
                            } else {
                                i30 = i29;
                            }
                        }
                        if ((i13 & 65536) != 0) {
                            i30 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(oVar2)) {
                                i32 = 1048576;
                            } else {
                                i32 = 524288;
                            }
                            i30 |= i32;
                        }
                        i33 = i30;
                        if ((i14 & 306783379) == 306783378) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (c0VarR.h(z12, i14 & 1)) {
                            if (i20 != 0) {
                                i35 = 0;
                            } else {
                                i35 = i21;
                            }
                            if (i23 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f10;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                            }
                            if (i35 >= 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                            }
                            i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                            if (i36 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z14) {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            int i416 = i14 >> 3;
                            i37 = i416 & 14;
                            int i417 = i33 >> 15;
                            i38 = i14;
                            i39 = i35;
                            Function0<l0> function0K5 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i417 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                            objI1 = c0VarR.i0();
                            aVar3 = androidx.compose.runtime.c0.f35327a;
                            if (objI1 == aVar3.a()) {
                                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI1);
                            }
                            kotlinx.coroutines.s0 s0Var5 = (kotlinx.coroutines.s0) objI1;
                            if (i36 == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z15) {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            int i418 = i38 >> 9;
                            int i419 = i33 << 15;
                            androidx.compose.foundation.lazy.layout.v0 v0VarA5 = t0.a(function0K5, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var5, (Function0) objI2, c0VarR, (i38 & 65520) | (i418 & 458752) | (i418 & 3670016) | ((i33 << 21) & 29360128) | (i419 & 234881024) | (i419 & 1879048192), i417 & 14);
                            float f16 = fR;
                            q3Var2 = q3.Vertical;
                            if (q3Var == q3Var2) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            q1 q1VarA5 = a1.a(i1Var2, z16, c0VarR, i37);
                            if (i36 == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i38 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objI3 = c0VarR.i0();
                            if (z19) {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            } else {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            }
                            o1 o1Var5 = (o1) objI3;
                            m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                            if (i36 == 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            zD = z20 | c0VarR.D(m0Var);
                            objI4 = c0VarR.i0();
                            if (zD) {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            } else {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            }
                            s sVar5 = (s) objI4;
                            if (z11) {
                                c0VarR.E(-853761213);
                                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-853331429);
                                c0VarR.A();
                                a0VarB = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.ui.a0 a0VarC5 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K5, q1VarA5, q3Var, z11, z10, c0VarR, (i416 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                            if (q3Var == q3Var2) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            androidx.compose.ui.a0 a0VarA5 = c5.a(g0.t(a0VarC5, i1Var2, z21, s0Var5, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var5, i1Var2.L(), false, x3Var, sVar5);
                            i1Var2 = i1Var2;
                            aVar2 = aVar;
                            androidx.compose.foundation.lazy.layout.u0.c(function0K5, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA5, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA5, c0VarR, 0, 0);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            f11 = f16;
                            i34 = i39;
                        } else {
                            aVar2 = aVar;
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            f11 = f10;
                            i34 = i21;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            final androidx.compose.ui.input.nestedscroll.a aVar8 = aVar2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar8, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i28 |= 24576;
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i4110 = i14 >> 3;
                        i37 = i4110 & 14;
                        int i4111 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K6 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4111 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var6 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i4112 = i38 >> 9;
                        int i4113 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA6 = t0.a(function0K6, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var6, (Function0) objI2, c0VarR, (i38 & 65520) | (i4112 & 458752) | (i4112 & 3670016) | ((i33 << 21) & 29360128) | (i4113 & 234881024) | (i4113 & 1879048192), i4111 & 14);
                        float f17 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA6 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var6 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar6 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC6 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K6, q1VarA6, q3Var, z11, z10, c0VarR, (i4110 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA6 = c5.a(g0.t(a0VarC6, i1Var2, z21, s0Var6, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var6, i1Var2.L(), false, x3Var, sVar6);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K6, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA6, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA6, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f17;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar9 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar9, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= 3072;
                if ((i13 & 16384) != 0) {
                    if ((i12 & 24576) == 0) {
                        i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                    }
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i4114 = i14 >> 3;
                        i37 = i4114 & 14;
                        int i4115 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K7 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4115 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var7 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i4116 = i38 >> 9;
                        int i4117 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA7 = t0.a(function0K7, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var7, (Function0) objI2, c0VarR, (i38 & 65520) | (i4116 & 458752) | (i4116 & 3670016) | ((i33 << 21) & 29360128) | (i4117 & 234881024) | (i4117 & 1879048192), i4115 & 14);
                        float f18 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA7 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var7 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar7 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC7 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K7, q1VarA7, q3Var, z11, z10, c0VarR, (i4114 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA7 = c5.a(g0.t(a0VarC7, i1Var2, z21, s0Var7, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var7, i1Var2.L(), false, x3Var, sVar7);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K7, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA7, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA7, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f18;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar10 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar10, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= 24576;
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i4118 = i14 >> 3;
                    i37 = i4118 & 14;
                    int i4119 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K8 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4119 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var8 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i41110 = i38 >> 9;
                    int i41111 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA8 = t0.a(function0K8, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var8, (Function0) objI2, c0VarR, (i38 & 65520) | (i41110 & 458752) | (i41110 & 3670016) | ((i33 << 21) & 29360128) | (i41111 & 234881024) | (i41111 & 1879048192), i4119 & 14);
                    float f19 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA8 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var8 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar8 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC8 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K8, q1VarA8, q3Var, z11, z10, c0VarR, (i4118 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA8 = c5.a(g0.t(a0VarC8, i1Var2, z21, s0Var8, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var8, i1Var2.L(), false, x3Var, sVar8);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K8, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA8, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA8, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f19;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar11 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar11, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 12582912;
            i20 = i13 & 256;
            if (i20 != 0) {
                i14 |= 100663296;
                i21 = i10;
            } else {
                i21 = i10;
                if ((i11 & 100663296) == 0) {
                    if (c0VarR.K(i21)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i14 |= i22;
                }
            }
            i23 = i13 & 512;
            if (i23 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c0VarR.I(f10)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i14 |= i24;
            }
            if ((i13 & 1024) != 0) {
                i25 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c0VarR.D(pVar)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i12 | i26;
            } else {
                i25 = i12;
            }
            if ((i13 & 2048) != 0) {
                i25 |= 48;
            } else if ((i12 & 48) == 0) {
                if (c0VarR.k0(aVar)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i25 |= i27;
            }
            i28 = i25;
            if ((i13 & 4096) != 0) {
                if ((i12 & a5.S0) == 0) {
                    i28 |= c0VarR.k0(function1) ? 256 : 128;
                }
                if ((i13 & 8192) != 0) {
                    if ((i12 & 3072) == 0) {
                        i28 |= c0VarR.D(bVar) ? 2048 : 1024;
                    }
                    if ((i13 & 16384) != 0) {
                        if ((i12 & 24576) == 0) {
                            i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                        }
                        if ((i13 & 32768) != 0) {
                            i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                        } else {
                            i29 = i28;
                            if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                if (c0VarR.D(oVar)) {
                                    i31 = 131072;
                                } else {
                                    i31 = 65536;
                                }
                                i30 = i29 | i31;
                            } else {
                                i30 = i29;
                            }
                        }
                        if ((i13 & 65536) != 0) {
                            i30 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(oVar2)) {
                                i32 = 1048576;
                            } else {
                                i32 = 524288;
                            }
                            i30 |= i32;
                        }
                        i33 = i30;
                        if ((i14 & 306783379) == 306783378) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (c0VarR.h(z12, i14 & 1)) {
                            if (i20 != 0) {
                                i35 = 0;
                            } else {
                                i35 = i21;
                            }
                            if (i23 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f10;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                            }
                            if (i35 >= 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                            }
                            i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                            if (i36 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z14) {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            int i41112 = i14 >> 3;
                            i37 = i41112 & 14;
                            int i41113 = i33 >> 15;
                            i38 = i14;
                            i39 = i35;
                            Function0<l0> function0K9 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41113 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                            objI1 = c0VarR.i0();
                            aVar3 = androidx.compose.runtime.c0.f35327a;
                            if (objI1 == aVar3.a()) {
                                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI1);
                            }
                            kotlinx.coroutines.s0 s0Var9 = (kotlinx.coroutines.s0) objI1;
                            if (i36 == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z15) {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            int i41114 = i38 >> 9;
                            int i41115 = i33 << 15;
                            androidx.compose.foundation.lazy.layout.v0 v0VarA9 = t0.a(function0K9, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var9, (Function0) objI2, c0VarR, (i38 & 65520) | (i41114 & 458752) | (i41114 & 3670016) | ((i33 << 21) & 29360128) | (i41115 & 234881024) | (i41115 & 1879048192), i41113 & 14);
                            float f110 = fR;
                            q3Var2 = q3.Vertical;
                            if (q3Var == q3Var2) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            q1 q1VarA9 = a1.a(i1Var2, z16, c0VarR, i37);
                            if (i36 == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i38 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objI3 = c0VarR.i0();
                            if (z19) {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            } else {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            }
                            o1 o1Var9 = (o1) objI3;
                            m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                            if (i36 == 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            zD = z20 | c0VarR.D(m0Var);
                            objI4 = c0VarR.i0();
                            if (zD) {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            } else {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            }
                            s sVar9 = (s) objI4;
                            if (z11) {
                                c0VarR.E(-853761213);
                                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-853331429);
                                c0VarR.A();
                                a0VarB = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.ui.a0 a0VarC9 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K9, q1VarA9, q3Var, z11, z10, c0VarR, (i41112 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                            if (q3Var == q3Var2) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            androidx.compose.ui.a0 a0VarA9 = c5.a(g0.t(a0VarC9, i1Var2, z21, s0Var9, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var9, i1Var2.L(), false, x3Var, sVar9);
                            i1Var2 = i1Var2;
                            aVar2 = aVar;
                            androidx.compose.foundation.lazy.layout.u0.c(function0K9, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA9, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA9, c0VarR, 0, 0);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            f11 = f110;
                            i34 = i39;
                        } else {
                            aVar2 = aVar;
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            f11 = f10;
                            i34 = i21;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            final androidx.compose.ui.input.nestedscroll.a aVar12 = aVar2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar12, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i28 |= 24576;
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i41116 = i14 >> 3;
                        i37 = i41116 & 14;
                        int i41117 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K10 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41117 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var10 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i41118 = i38 >> 9;
                        int i41119 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA10 = t0.a(function0K10, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var10, (Function0) objI2, c0VarR, (i38 & 65520) | (i41118 & 458752) | (i41118 & 3670016) | ((i33 << 21) & 29360128) | (i41119 & 234881024) | (i41119 & 1879048192), i41117 & 14);
                        float f111 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA10 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var10 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar10 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC10 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K10, q1VarA10, q3Var, z11, z10, c0VarR, (i41116 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA10 = c5.a(g0.t(a0VarC10, i1Var2, z21, s0Var10, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var10, i1Var2.L(), false, x3Var, sVar10);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K10, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA10, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA10, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f111;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar13 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar13, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= 3072;
                if ((i13 & 16384) != 0) {
                    if ((i12 & 24576) == 0) {
                        i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                    }
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i411110 = i14 >> 3;
                        i37 = i411110 & 14;
                        int i411111 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K11 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i411111 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var11 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i411112 = i38 >> 9;
                        int i411113 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA11 = t0.a(function0K11, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var11, (Function0) objI2, c0VarR, (i38 & 65520) | (i411112 & 458752) | (i411112 & 3670016) | ((i33 << 21) & 29360128) | (i411113 & 234881024) | (i411113 & 1879048192), i411111 & 14);
                        float f112 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA11 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var11 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar11 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC11 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K11, q1VarA11, q3Var, z11, z10, c0VarR, (i411110 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA11 = c5.a(g0.t(a0VarC11, i1Var2, z21, s0Var11, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var11, i1Var2.L(), false, x3Var, sVar11);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K11, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA11, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA11, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f112;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar14 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar14, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= 24576;
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i411114 = i14 >> 3;
                    i37 = i411114 & 14;
                    int i411115 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K12 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i411115 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var12 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i411116 = i38 >> 9;
                    int i411117 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA12 = t0.a(function0K12, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var12, (Function0) objI2, c0VarR, (i38 & 65520) | (i411116 & 458752) | (i411116 & 3670016) | ((i33 << 21) & 29360128) | (i411117 & 234881024) | (i411117 & 1879048192), i411115 & 14);
                    float f113 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA12 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var12 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar12 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC12 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K12, q1VarA12, q3Var, z11, z10, c0VarR, (i411114 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA12 = c5.a(g0.t(a0VarC12, i1Var2, z21, s0Var12, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var12, i1Var2.L(), false, x3Var, sVar12);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K12, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA12, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA12, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f113;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar15 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar15, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 |= a5.S0;
            if ((i13 & 8192) != 0) {
                if ((i12 & 3072) == 0) {
                    i28 |= c0VarR.D(bVar) ? 2048 : 1024;
                }
                if ((i13 & 16384) != 0) {
                    if ((i12 & 24576) == 0) {
                        i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                    }
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i411118 = i14 >> 3;
                        i37 = i411118 & 14;
                        int i411119 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K13 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i411119 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var13 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i4111110 = i38 >> 9;
                        int i4111111 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA13 = t0.a(function0K13, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var13, (Function0) objI2, c0VarR, (i38 & 65520) | (i4111110 & 458752) | (i4111110 & 3670016) | ((i33 << 21) & 29360128) | (i4111111 & 234881024) | (i4111111 & 1879048192), i411119 & 14);
                        float f114 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA13 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var13 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar13 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC13 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K13, q1VarA13, q3Var, z11, z10, c0VarR, (i411118 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA13 = c5.a(g0.t(a0VarC13, i1Var2, z21, s0Var13, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var13, i1Var2.L(), false, x3Var, sVar13);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K13, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA13, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA13, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f114;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar16 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar16, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= 24576;
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i4111112 = i14 >> 3;
                    i37 = i4111112 & 14;
                    int i4111113 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K14 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4111113 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var14 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i4111114 = i38 >> 9;
                    int i4111115 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA14 = t0.a(function0K14, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var14, (Function0) objI2, c0VarR, (i38 & 65520) | (i4111114 & 458752) | (i4111114 & 3670016) | ((i33 << 21) & 29360128) | (i4111115 & 234881024) | (i4111115 & 1879048192), i4111113 & 14);
                    float f115 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA14 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var14 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar14 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC14 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K14, q1VarA14, q3Var, z11, z10, c0VarR, (i4111112 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA14 = c5.a(g0.t(a0VarC14, i1Var2, z21, s0Var14, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var14, i1Var2.L(), false, x3Var, sVar14);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K14, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA14, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA14, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f115;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar17 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar17, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 |= 3072;
            if ((i13 & 16384) != 0) {
                if ((i12 & 24576) == 0) {
                    i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                }
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i4111116 = i14 >> 3;
                    i37 = i4111116 & 14;
                    int i4111117 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K15 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4111117 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var15 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i4111118 = i38 >> 9;
                    int i4111119 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA15 = t0.a(function0K15, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var15, (Function0) objI2, c0VarR, (i38 & 65520) | (i4111118 & 458752) | (i4111118 & 3670016) | ((i33 << 21) & 29360128) | (i4111119 & 234881024) | (i4111119 & 1879048192), i4111117 & 14);
                    float f116 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA15 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var15 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar15 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC15 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K15, q1VarA15, q3Var, z11, z10, c0VarR, (i4111116 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA15 = c5.a(g0.t(a0VarC15, i1Var2, z21, s0Var15, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var15, i1Var2.L(), false, x3Var, sVar15);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K15, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA15, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA15, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f116;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar18 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar18, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 |= 24576;
            if ((i13 & 32768) != 0) {
                i30 = i28 | androidx.profileinstaller.n.c.f73814m;
            } else {
                i29 = i28;
                if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(oVar)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 = i29 | i31;
                } else {
                    i30 = i29;
                }
            }
            if ((i13 & 65536) != 0) {
                i30 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(oVar2)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i30 |= i32;
            }
            i33 = i30;
            if ((i14 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i14 & 1)) {
                if (i20 != 0) {
                    i35 = 0;
                } else {
                    i35 = i21;
                }
                if (i23 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f10;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                }
                if (i35 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                }
                i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                if (i36 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i41111110 = i14 >> 3;
                i37 = i41111110 & 14;
                int i41111111 = i33 >> 15;
                i38 = i14;
                i39 = i35;
                Function0<l0> function0K16 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41111111 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                objI1 = c0VarR.i0();
                aVar3 = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar3.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                kotlinx.coroutines.s0 s0Var16 = (kotlinx.coroutines.s0) objI1;
                if (i36 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objI2 = c0VarR.i0();
                if (z15) {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                int i41111112 = i38 >> 9;
                int i41111113 = i33 << 15;
                androidx.compose.foundation.lazy.layout.v0 v0VarA16 = t0.a(function0K16, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var16, (Function0) objI2, c0VarR, (i38 & 65520) | (i41111112 & 458752) | (i41111112 & 3670016) | ((i33 << 21) & 29360128) | (i41111113 & 234881024) | (i41111113 & 1879048192), i41111111 & 14);
                float f117 = fR;
                q3Var2 = q3.Vertical;
                if (q3Var == q3Var2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                q1 q1VarA16 = a1.a(i1Var2, z16, c0VarR, i37);
                if (i36 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i38 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI3 = c0VarR.i0();
                if (z19) {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                }
                o1 o1Var16 = (o1) objI3;
                m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                if (i36 == 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                zD = z20 | c0VarR.D(m0Var);
                objI4 = c0VarR.i0();
                if (zD) {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                }
                s sVar16 = (s) objI4;
                if (z11) {
                    c0VarR.E(-853761213);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                    c0VarR.A();
                } else {
                    c0VarR.E(-853331429);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarC16 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K16, q1VarA16, q3Var, z11, z10, c0VarR, (i41111110 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                if (q3Var == q3Var2) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                androidx.compose.ui.a0 a0VarA16 = c5.a(g0.t(a0VarC16, i1Var2, z21, s0Var16, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var16, i1Var2.L(), false, x3Var, sVar16);
                i1Var2 = i1Var2;
                aVar2 = aVar;
                androidx.compose.foundation.lazy.layout.u0.c(function0K16, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA16, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA16, c0VarR, 0, 0);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f11 = f117;
                i34 = i39;
            } else {
                aVar2 = aVar;
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                i34 = i21;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final androidx.compose.ui.input.nestedscroll.a aVar19 = aVar2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar19, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= a5.S0;
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (c0VarR.G(z10)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i14 |= i15;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (c0VarR.K(q3Var.ordinal())) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i14 |= i16;
        }
        if ((i13 & 32) != 0) {
            i14 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.D(e5Var)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i14 |= i17;
        }
        if ((i13 & 64) != 0) {
            i14 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c0VarR.G(z11)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i14 |= i18;
        }
        if ((i13 & 128) != 0) {
            if ((12582912 & i11) == 0) {
                if (c0VarR.D(x3Var)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i14 |= i19;
            }
            i20 = i13 & 256;
            if (i20 != 0) {
                i14 |= 100663296;
                i21 = i10;
            } else {
                i21 = i10;
                if ((i11 & 100663296) == 0) {
                    if (c0VarR.K(i21)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i14 |= i22;
                }
            }
            i23 = i13 & 512;
            if (i23 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c0VarR.I(f10)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i14 |= i24;
            }
            if ((i13 & 1024) != 0) {
                i25 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c0VarR.D(pVar)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i12 | i26;
            } else {
                i25 = i12;
            }
            if ((i13 & 2048) != 0) {
                i25 |= 48;
            } else if ((i12 & 48) == 0) {
                if (c0VarR.k0(aVar)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i25 |= i27;
            }
            i28 = i25;
            if ((i13 & 4096) != 0) {
                if ((i12 & a5.S0) == 0) {
                    i28 |= c0VarR.k0(function1) ? 256 : 128;
                }
                if ((i13 & 8192) != 0) {
                    if ((i12 & 3072) == 0) {
                        i28 |= c0VarR.D(bVar) ? 2048 : 1024;
                    }
                    if ((i13 & 16384) != 0) {
                        if ((i12 & 24576) == 0) {
                            i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                        }
                        if ((i13 & 32768) != 0) {
                            i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                        } else {
                            i29 = i28;
                            if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                if (c0VarR.D(oVar)) {
                                    i31 = 131072;
                                } else {
                                    i31 = 65536;
                                }
                                i30 = i29 | i31;
                            } else {
                                i30 = i29;
                            }
                        }
                        if ((i13 & 65536) != 0) {
                            i30 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(oVar2)) {
                                i32 = 1048576;
                            } else {
                                i32 = 524288;
                            }
                            i30 |= i32;
                        }
                        i33 = i30;
                        if ((i14 & 306783379) == 306783378) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (c0VarR.h(z12, i14 & 1)) {
                            if (i20 != 0) {
                                i35 = 0;
                            } else {
                                i35 = i21;
                            }
                            if (i23 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f10;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                            }
                            if (i35 >= 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                            }
                            i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                            if (i36 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z14) {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.g(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            int i41111114 = i14 >> 3;
                            i37 = i41111114 & 14;
                            int i41111115 = i33 >> 15;
                            i38 = i14;
                            i39 = i35;
                            Function0<l0> function0K17 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41111115 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                            objI1 = c0VarR.i0();
                            aVar3 = androidx.compose.runtime.c0.f35327a;
                            if (objI1 == aVar3.a()) {
                                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI1);
                            }
                            kotlinx.coroutines.s0 s0Var17 = (kotlinx.coroutines.s0) objI1;
                            if (i36 == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z15) {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Integer.valueOf(k.h(i1Var2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            int i41111116 = i38 >> 9;
                            int i41111117 = i33 << 15;
                            androidx.compose.foundation.lazy.layout.v0 v0VarA17 = t0.a(function0K17, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var17, (Function0) objI2, c0VarR, (i38 & 65520) | (i41111116 & 458752) | (i41111116 & 3670016) | ((i33 << 21) & 29360128) | (i41111117 & 234881024) | (i41111117 & 1879048192), i41111115 & 14);
                            float f118 = fR;
                            q3Var2 = q3.Vertical;
                            if (q3Var == q3Var2) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            q1 q1VarA17 = a1.a(i1Var2, z16, c0VarR, i37);
                            if (i36 == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i38 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objI3 = c0VarR.i0();
                            if (z19) {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            } else {
                                objI3 = new o1(e5Var, i1Var2);
                                c0VarR.Y(objI3);
                            }
                            o1 o1Var17 = (o1) objI3;
                            m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                            if (i36 == 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            zD = z20 | c0VarR.D(m0Var);
                            objI4 = c0VarR.i0();
                            if (zD) {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            } else {
                                objI4 = new s(i1Var2, m0Var);
                                c0VarR.Y(objI4);
                            }
                            s sVar17 = (s) objI4;
                            if (z11) {
                                c0VarR.E(-853761213);
                                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-853331429);
                                c0VarR.A();
                                a0VarB = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.ui.a0 a0VarC17 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K17, q1VarA17, q3Var, z11, z10, c0VarR, (i41111114 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                            if (q3Var == q3Var2) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            androidx.compose.ui.a0 a0VarA17 = c5.a(g0.t(a0VarC17, i1Var2, z21, s0Var17, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var17, i1Var2.L(), false, x3Var, sVar17);
                            i1Var2 = i1Var2;
                            aVar2 = aVar;
                            androidx.compose.foundation.lazy.layout.u0.c(function0K17, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA17, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA17, c0VarR, 0, 0);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            f11 = f118;
                            i34 = i39;
                        } else {
                            aVar2 = aVar;
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            f11 = f10;
                            i34 = i21;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            final androidx.compose.ui.input.nestedscroll.a aVar110 = aVar2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar110, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i28 |= 24576;
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i41111118 = i14 >> 3;
                        i37 = i41111118 & 14;
                        int i41111119 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K18 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41111119 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var18 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i411111110 = i38 >> 9;
                        int i411111111 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA18 = t0.a(function0K18, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var18, (Function0) objI2, c0VarR, (i38 & 65520) | (i411111110 & 458752) | (i411111110 & 3670016) | ((i33 << 21) & 29360128) | (i411111111 & 234881024) | (i411111111 & 1879048192), i41111119 & 14);
                        float f119 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA18 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var18 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar18 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC18 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K18, q1VarA18, q3Var, z11, z10, c0VarR, (i41111118 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA18 = c5.a(g0.t(a0VarC18, i1Var2, z21, s0Var18, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var18, i1Var2.L(), false, x3Var, sVar18);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K18, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA18, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA18, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f119;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar111 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar111, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= 3072;
                if ((i13 & 16384) != 0) {
                    if ((i12 & 24576) == 0) {
                        i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                    }
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i411111112 = i14 >> 3;
                        i37 = i411111112 & 14;
                        int i411111113 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K19 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i411111113 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var19 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i411111114 = i38 >> 9;
                        int i411111115 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA19 = t0.a(function0K19, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var19, (Function0) objI2, c0VarR, (i38 & 65520) | (i411111114 & 458752) | (i411111114 & 3670016) | ((i33 << 21) & 29360128) | (i411111115 & 234881024) | (i411111115 & 1879048192), i411111113 & 14);
                        float f1110 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA19 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var19 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar19 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC19 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K19, q1VarA19, q3Var, z11, z10, c0VarR, (i411111112 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA19 = c5.a(g0.t(a0VarC19, i1Var2, z21, s0Var19, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var19, i1Var2.L(), false, x3Var, sVar19);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K19, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA19, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA19, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f1110;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar112 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar112, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= 24576;
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i411111116 = i14 >> 3;
                    i37 = i411111116 & 14;
                    int i411111117 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K110 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i411111117 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var110 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i411111118 = i38 >> 9;
                    int i411111119 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA110 = t0.a(function0K110, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var110, (Function0) objI2, c0VarR, (i38 & 65520) | (i411111118 & 458752) | (i411111118 & 3670016) | ((i33 << 21) & 29360128) | (i411111119 & 234881024) | (i411111119 & 1879048192), i411111117 & 14);
                    float f1111 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA110 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var110 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar110 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC110 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K110, q1VarA110, q3Var, z11, z10, c0VarR, (i411111116 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA110 = c5.a(g0.t(a0VarC110, i1Var2, z21, s0Var110, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var110, i1Var2.L(), false, x3Var, sVar110);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K110, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA110, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA110, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f1111;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar113 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar113, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 |= a5.S0;
            if ((i13 & 8192) != 0) {
                if ((i12 & 3072) == 0) {
                    i28 |= c0VarR.D(bVar) ? 2048 : 1024;
                }
                if ((i13 & 16384) != 0) {
                    if ((i12 & 24576) == 0) {
                        i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                    }
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i4111111110 = i14 >> 3;
                        i37 = i4111111110 & 14;
                        int i4111111111 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K111 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4111111111 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var111 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i4111111112 = i38 >> 9;
                        int i4111111113 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA111 = t0.a(function0K111, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var111, (Function0) objI2, c0VarR, (i38 & 65520) | (i4111111112 & 458752) | (i4111111112 & 3670016) | ((i33 << 21) & 29360128) | (i4111111113 & 234881024) | (i4111111113 & 1879048192), i4111111111 & 14);
                        float f1112 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA111 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var111 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar111 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC111 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K111, q1VarA111, q3Var, z11, z10, c0VarR, (i4111111110 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA111 = c5.a(g0.t(a0VarC111, i1Var2, z21, s0Var111, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var111, i1Var2.L(), false, x3Var, sVar111);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K111, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA111, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA111, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f1112;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar114 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar114, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= 24576;
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i4111111114 = i14 >> 3;
                    i37 = i4111111114 & 14;
                    int i4111111115 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K112 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4111111115 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var112 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i4111111116 = i38 >> 9;
                    int i4111111117 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA112 = t0.a(function0K112, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var112, (Function0) objI2, c0VarR, (i38 & 65520) | (i4111111116 & 458752) | (i4111111116 & 3670016) | ((i33 << 21) & 29360128) | (i4111111117 & 234881024) | (i4111111117 & 1879048192), i4111111115 & 14);
                    float f1113 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA112 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var112 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar112 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC112 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K112, q1VarA112, q3Var, z11, z10, c0VarR, (i4111111114 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA112 = c5.a(g0.t(a0VarC112, i1Var2, z21, s0Var112, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var112, i1Var2.L(), false, x3Var, sVar112);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K112, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA112, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA112, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f1113;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar115 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar115, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 |= 3072;
            if ((i13 & 16384) != 0) {
                if ((i12 & 24576) == 0) {
                    i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                }
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i4111111118 = i14 >> 3;
                    i37 = i4111111118 & 14;
                    int i4111111119 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K113 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4111111119 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var113 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i41111111110 = i38 >> 9;
                    int i41111111111 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA113 = t0.a(function0K113, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var113, (Function0) objI2, c0VarR, (i38 & 65520) | (i41111111110 & 458752) | (i41111111110 & 3670016) | ((i33 << 21) & 29360128) | (i41111111111 & 234881024) | (i41111111111 & 1879048192), i4111111119 & 14);
                    float f1114 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA113 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var113 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar113 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC113 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K113, q1VarA113, q3Var, z11, z10, c0VarR, (i4111111118 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA113 = c5.a(g0.t(a0VarC113, i1Var2, z21, s0Var113, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var113, i1Var2.L(), false, x3Var, sVar113);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K113, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA113, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA113, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f1114;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar116 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar116, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 |= 24576;
            if ((i13 & 32768) != 0) {
                i30 = i28 | androidx.profileinstaller.n.c.f73814m;
            } else {
                i29 = i28;
                if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(oVar)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 = i29 | i31;
                } else {
                    i30 = i29;
                }
            }
            if ((i13 & 65536) != 0) {
                i30 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(oVar2)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i30 |= i32;
            }
            i33 = i30;
            if ((i14 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i14 & 1)) {
                if (i20 != 0) {
                    i35 = 0;
                } else {
                    i35 = i21;
                }
                if (i23 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f10;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                }
                if (i35 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                }
                i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                if (i36 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i41111111112 = i14 >> 3;
                i37 = i41111111112 & 14;
                int i41111111113 = i33 >> 15;
                i38 = i14;
                i39 = i35;
                Function0<l0> function0K114 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41111111113 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                objI1 = c0VarR.i0();
                aVar3 = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar3.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                kotlinx.coroutines.s0 s0Var114 = (kotlinx.coroutines.s0) objI1;
                if (i36 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objI2 = c0VarR.i0();
                if (z15) {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                int i41111111114 = i38 >> 9;
                int i41111111115 = i33 << 15;
                androidx.compose.foundation.lazy.layout.v0 v0VarA114 = t0.a(function0K114, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var114, (Function0) objI2, c0VarR, (i38 & 65520) | (i41111111114 & 458752) | (i41111111114 & 3670016) | ((i33 << 21) & 29360128) | (i41111111115 & 234881024) | (i41111111115 & 1879048192), i41111111113 & 14);
                float f1115 = fR;
                q3Var2 = q3.Vertical;
                if (q3Var == q3Var2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                q1 q1VarA114 = a1.a(i1Var2, z16, c0VarR, i37);
                if (i36 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i38 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI3 = c0VarR.i0();
                if (z19) {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                }
                o1 o1Var114 = (o1) objI3;
                m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                if (i36 == 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                zD = z20 | c0VarR.D(m0Var);
                objI4 = c0VarR.i0();
                if (zD) {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                }
                s sVar114 = (s) objI4;
                if (z11) {
                    c0VarR.E(-853761213);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                    c0VarR.A();
                } else {
                    c0VarR.E(-853331429);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarC114 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K114, q1VarA114, q3Var, z11, z10, c0VarR, (i41111111112 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                if (q3Var == q3Var2) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                androidx.compose.ui.a0 a0VarA114 = c5.a(g0.t(a0VarC114, i1Var2, z21, s0Var114, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var114, i1Var2.L(), false, x3Var, sVar114);
                i1Var2 = i1Var2;
                aVar2 = aVar;
                androidx.compose.foundation.lazy.layout.u0.c(function0K114, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA114, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA114, c0VarR, 0, 0);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f11 = f1115;
                i34 = i39;
            } else {
                aVar2 = aVar;
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                i34 = i21;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final androidx.compose.ui.input.nestedscroll.a aVar117 = aVar2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar117, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 12582912;
        i20 = i13 & 256;
        if (i20 != 0) {
            i14 |= 100663296;
            i21 = i10;
        } else {
            i21 = i10;
            if ((i11 & 100663296) == 0) {
                if (c0VarR.K(i21)) {
                    i22 = 67108864;
                } else {
                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i14 |= i22;
            }
        }
        i23 = i13 & 512;
        if (i23 != 0) {
            i14 |= 805306368;
        } else if ((i11 & 805306368) == 0) {
            if (c0VarR.I(f10)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i14 |= i24;
        }
        if ((i13 & 1024) != 0) {
            i25 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            if (c0VarR.D(pVar)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i25 = i12 | i26;
        } else {
            i25 = i12;
        }
        if ((i13 & 2048) != 0) {
            i25 |= 48;
        } else if ((i12 & 48) == 0) {
            if (c0VarR.k0(aVar)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i25 |= i27;
        }
        i28 = i25;
        if ((i13 & 4096) != 0) {
            if ((i12 & a5.S0) == 0) {
                i28 |= c0VarR.k0(function1) ? 256 : 128;
            }
            if ((i13 & 8192) != 0) {
                if ((i12 & 3072) == 0) {
                    i28 |= c0VarR.D(bVar) ? 2048 : 1024;
                }
                if ((i13 & 16384) != 0) {
                    if ((i12 & 24576) == 0) {
                        i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                    }
                    if ((i13 & 32768) != 0) {
                        i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                    } else {
                        i29 = i28;
                        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(oVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 = i29 | i31;
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i13 & 65536) != 0) {
                        i30 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(oVar2)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i30 |= i32;
                    }
                    i33 = i30;
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        if (i20 != 0) {
                            i35 = 0;
                        } else {
                            i35 = i21;
                        }
                        if (i23 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                        }
                        if (i35 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                        }
                        i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                        if (i36 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.g(i1Var2));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i41111111116 = i14 >> 3;
                        i37 = i41111111116 & 14;
                        int i41111111117 = i33 >> 15;
                        i38 = i14;
                        i39 = i35;
                        Function0<l0> function0K115 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41111111117 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                        objI1 = c0VarR.i0();
                        aVar3 = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar3.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        kotlinx.coroutines.s0 s0Var115 = (kotlinx.coroutines.s0) objI1;
                        if (i36 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(k.h(i1Var2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        int i41111111118 = i38 >> 9;
                        int i41111111119 = i33 << 15;
                        androidx.compose.foundation.lazy.layout.v0 v0VarA115 = t0.a(function0K115, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var115, (Function0) objI2, c0VarR, (i38 & 65520) | (i41111111118 & 458752) | (i41111111118 & 3670016) | ((i33 << 21) & 29360128) | (i41111111119 & 234881024) | (i41111111119 & 1879048192), i41111111117 & 14);
                        float f1116 = fR;
                        q3Var2 = q3.Vertical;
                        if (q3Var == q3Var2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q1 q1VarA115 = a1.a(i1Var2, z16, c0VarR, i37);
                        if (i36 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i38 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objI3 = c0VarR.i0();
                        if (z19) {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new o1(e5Var, i1Var2);
                            c0VarR.Y(objI3);
                        }
                        o1 o1Var115 = (o1) objI3;
                        m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                        if (i36 == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zD = z20 | c0VarR.D(m0Var);
                        objI4 = c0VarR.i0();
                        if (zD) {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new s(i1Var2, m0Var);
                            c0VarR.Y(objI4);
                        }
                        s sVar115 = (s) objI4;
                        if (z11) {
                            c0VarR.E(-853761213);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-853331429);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarC115 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K115, q1VarA115, q3Var, z11, z10, c0VarR, (i41111111116 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                        if (q3Var == q3Var2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0 a0VarA115 = c5.a(g0.t(a0VarC115, i1Var2, z21, s0Var115, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var115, i1Var2.L(), false, x3Var, sVar115);
                        i1Var2 = i1Var2;
                        aVar2 = aVar;
                        androidx.compose.foundation.lazy.layout.u0.c(function0K115, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA115, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA115, c0VarR, 0, 0);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f11 = f1116;
                        i34 = i39;
                    } else {
                        aVar2 = aVar;
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        i34 = i21;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.input.nestedscroll.a aVar118 = aVar2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar118, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 |= 24576;
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i411111111110 = i14 >> 3;
                    i37 = i411111111110 & 14;
                    int i411111111111 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K116 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i411111111111 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var116 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i411111111112 = i38 >> 9;
                    int i411111111113 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA116 = t0.a(function0K116, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var116, (Function0) objI2, c0VarR, (i38 & 65520) | (i411111111112 & 458752) | (i411111111112 & 3670016) | ((i33 << 21) & 29360128) | (i411111111113 & 234881024) | (i411111111113 & 1879048192), i411111111111 & 14);
                    float f1117 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA116 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var116 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar116 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC116 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K116, q1VarA116, q3Var, z11, z10, c0VarR, (i411111111110 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA116 = c5.a(g0.t(a0VarC116, i1Var2, z21, s0Var116, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var116, i1Var2.L(), false, x3Var, sVar116);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K116, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA116, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA116, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f1117;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar119 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar119, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 |= 3072;
            if ((i13 & 16384) != 0) {
                if ((i12 & 24576) == 0) {
                    i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                }
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i411111111114 = i14 >> 3;
                    i37 = i411111111114 & 14;
                    int i411111111115 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K117 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i411111111115 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var117 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i411111111116 = i38 >> 9;
                    int i411111111117 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA117 = t0.a(function0K117, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var117, (Function0) objI2, c0VarR, (i38 & 65520) | (i411111111116 & 458752) | (i411111111116 & 3670016) | ((i33 << 21) & 29360128) | (i411111111117 & 234881024) | (i411111111117 & 1879048192), i411111111115 & 14);
                    float f1118 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA117 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var117 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar117 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC117 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K117, q1VarA117, q3Var, z11, z10, c0VarR, (i411111111114 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA117 = c5.a(g0.t(a0VarC117, i1Var2, z21, s0Var117, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var117, i1Var2.L(), false, x3Var, sVar117);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K117, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA117, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA117, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f1118;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar1110 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar1110, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 |= 24576;
            if ((i13 & 32768) != 0) {
                i30 = i28 | androidx.profileinstaller.n.c.f73814m;
            } else {
                i29 = i28;
                if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(oVar)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 = i29 | i31;
                } else {
                    i30 = i29;
                }
            }
            if ((i13 & 65536) != 0) {
                i30 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(oVar2)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i30 |= i32;
            }
            i33 = i30;
            if ((i14 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i14 & 1)) {
                if (i20 != 0) {
                    i35 = 0;
                } else {
                    i35 = i21;
                }
                if (i23 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f10;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                }
                if (i35 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                }
                i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                if (i36 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i411111111118 = i14 >> 3;
                i37 = i411111111118 & 14;
                int i411111111119 = i33 >> 15;
                i38 = i14;
                i39 = i35;
                Function0<l0> function0K118 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i411111111119 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                objI1 = c0VarR.i0();
                aVar3 = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar3.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                kotlinx.coroutines.s0 s0Var118 = (kotlinx.coroutines.s0) objI1;
                if (i36 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objI2 = c0VarR.i0();
                if (z15) {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                int i4111111111110 = i38 >> 9;
                int i4111111111111 = i33 << 15;
                androidx.compose.foundation.lazy.layout.v0 v0VarA118 = t0.a(function0K118, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var118, (Function0) objI2, c0VarR, (i38 & 65520) | (i4111111111110 & 458752) | (i4111111111110 & 3670016) | ((i33 << 21) & 29360128) | (i4111111111111 & 234881024) | (i4111111111111 & 1879048192), i411111111119 & 14);
                float f1119 = fR;
                q3Var2 = q3.Vertical;
                if (q3Var == q3Var2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                q1 q1VarA118 = a1.a(i1Var2, z16, c0VarR, i37);
                if (i36 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i38 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI3 = c0VarR.i0();
                if (z19) {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                }
                o1 o1Var118 = (o1) objI3;
                m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                if (i36 == 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                zD = z20 | c0VarR.D(m0Var);
                objI4 = c0VarR.i0();
                if (zD) {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                }
                s sVar118 = (s) objI4;
                if (z11) {
                    c0VarR.E(-853761213);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                    c0VarR.A();
                } else {
                    c0VarR.E(-853331429);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarC118 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K118, q1VarA118, q3Var, z11, z10, c0VarR, (i411111111118 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                if (q3Var == q3Var2) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                androidx.compose.ui.a0 a0VarA118 = c5.a(g0.t(a0VarC118, i1Var2, z21, s0Var118, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var118, i1Var2.L(), false, x3Var, sVar118);
                i1Var2 = i1Var2;
                aVar2 = aVar;
                androidx.compose.foundation.lazy.layout.u0.c(function0K118, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA118, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA118, c0VarR, 0, 0);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f11 = f1119;
                i34 = i39;
            } else {
                aVar2 = aVar;
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                i34 = i21;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final androidx.compose.ui.input.nestedscroll.a aVar1111 = aVar2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar1111, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i28 |= a5.S0;
        if ((i13 & 8192) != 0) {
            if ((i12 & 3072) == 0) {
                i28 |= c0VarR.D(bVar) ? 2048 : 1024;
            }
            if ((i13 & 16384) != 0) {
                if ((i12 & 24576) == 0) {
                    i28 |= c0VarR.D(cVar) ? 16384 : 8192;
                }
                if ((i13 & 32768) != 0) {
                    i30 = i28 | androidx.profileinstaller.n.c.f73814m;
                } else {
                    i29 = i28;
                    if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(oVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 = i29 | i31;
                    } else {
                        i30 = i29;
                    }
                }
                if ((i13 & 65536) != 0) {
                    i30 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(oVar2)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i30 |= i32;
                }
                i33 = i30;
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    if (i20 != 0) {
                        i35 = 0;
                    } else {
                        i35 = i21;
                    }
                    if (i23 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                    }
                    if (i35 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                    }
                    i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                    if (i36 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.g(i1Var2));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i4111111111112 = i14 >> 3;
                    i37 = i4111111111112 & 14;
                    int i4111111111113 = i33 >> 15;
                    i38 = i14;
                    i39 = i35;
                    Function0<l0> function0K119 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4111111111113 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                    objI1 = c0VarR.i0();
                    aVar3 = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar3.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    kotlinx.coroutines.s0 s0Var119 = (kotlinx.coroutines.s0) objI1;
                    if (i36 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(k.h(i1Var2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    int i4111111111114 = i38 >> 9;
                    int i4111111111115 = i33 << 15;
                    androidx.compose.foundation.lazy.layout.v0 v0VarA119 = t0.a(function0K119, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var119, (Function0) objI2, c0VarR, (i38 & 65520) | (i4111111111114 & 458752) | (i4111111111114 & 3670016) | ((i33 << 21) & 29360128) | (i4111111111115 & 234881024) | (i4111111111115 & 1879048192), i4111111111113 & 14);
                    float f11110 = fR;
                    q3Var2 = q3.Vertical;
                    if (q3Var == q3Var2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1 q1VarA119 = a1.a(i1Var2, z16, c0VarR, i37);
                    if (i36 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i38 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objI3 = c0VarR.i0();
                    if (z19) {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new o1(e5Var, i1Var2);
                        c0VarR.Y(objI3);
                    }
                    o1 o1Var119 = (o1) objI3;
                    m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                    if (i36 == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zD = z20 | c0VarR.D(m0Var);
                    objI4 = c0VarR.i0();
                    if (zD) {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new s(i1Var2, m0Var);
                        c0VarR.Y(objI4);
                    }
                    s sVar119 = (s) objI4;
                    if (z11) {
                        c0VarR.E(-853761213);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-853331429);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarC119 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K119, q1VarA119, q3Var, z11, z10, c0VarR, (i4111111111112 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                    if (q3Var == q3Var2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0 a0VarA119 = c5.a(g0.t(a0VarC119, i1Var2, z21, s0Var119, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var119, i1Var2.L(), false, x3Var, sVar119);
                    i1Var2 = i1Var2;
                    aVar2 = aVar;
                    androidx.compose.foundation.lazy.layout.u0.c(function0K119, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA119, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA119, c0VarR, 0, 0);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f11 = f11110;
                    i34 = i39;
                } else {
                    aVar2 = aVar;
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    i34 = i21;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.input.nestedscroll.a aVar1112 = aVar2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar1112, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 |= 24576;
            if ((i13 & 32768) != 0) {
                i30 = i28 | androidx.profileinstaller.n.c.f73814m;
            } else {
                i29 = i28;
                if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(oVar)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 = i29 | i31;
                } else {
                    i30 = i29;
                }
            }
            if ((i13 & 65536) != 0) {
                i30 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(oVar2)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i30 |= i32;
            }
            i33 = i30;
            if ((i14 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i14 & 1)) {
                if (i20 != 0) {
                    i35 = 0;
                } else {
                    i35 = i21;
                }
                if (i23 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f10;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                }
                if (i35 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                }
                i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                if (i36 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i4111111111116 = i14 >> 3;
                i37 = i4111111111116 & 14;
                int i4111111111117 = i33 >> 15;
                i38 = i14;
                i39 = i35;
                Function0<l0> function0K1110 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i4111111111117 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                objI1 = c0VarR.i0();
                aVar3 = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar3.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                kotlinx.coroutines.s0 s0Var1110 = (kotlinx.coroutines.s0) objI1;
                if (i36 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objI2 = c0VarR.i0();
                if (z15) {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                int i4111111111118 = i38 >> 9;
                int i4111111111119 = i33 << 15;
                androidx.compose.foundation.lazy.layout.v0 v0VarA1110 = t0.a(function0K1110, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var1110, (Function0) objI2, c0VarR, (i38 & 65520) | (i4111111111118 & 458752) | (i4111111111118 & 3670016) | ((i33 << 21) & 29360128) | (i4111111111119 & 234881024) | (i4111111111119 & 1879048192), i4111111111117 & 14);
                float f11111 = fR;
                q3Var2 = q3.Vertical;
                if (q3Var == q3Var2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                q1 q1VarA1110 = a1.a(i1Var2, z16, c0VarR, i37);
                if (i36 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i38 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI3 = c0VarR.i0();
                if (z19) {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                }
                o1 o1Var1110 = (o1) objI3;
                m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                if (i36 == 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                zD = z20 | c0VarR.D(m0Var);
                objI4 = c0VarR.i0();
                if (zD) {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                }
                s sVar1110 = (s) objI4;
                if (z11) {
                    c0VarR.E(-853761213);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                    c0VarR.A();
                } else {
                    c0VarR.E(-853331429);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarC1110 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K1110, q1VarA1110, q3Var, z11, z10, c0VarR, (i4111111111116 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                if (q3Var == q3Var2) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                androidx.compose.ui.a0 a0VarA1110 = c5.a(g0.t(a0VarC1110, i1Var2, z21, s0Var1110, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var1110, i1Var2.L(), false, x3Var, sVar1110);
                i1Var2 = i1Var2;
                aVar2 = aVar;
                androidx.compose.foundation.lazy.layout.u0.c(function0K1110, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA1110, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA1110, c0VarR, 0, 0);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f11 = f11111;
                i34 = i39;
            } else {
                aVar2 = aVar;
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                i34 = i21;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final androidx.compose.ui.input.nestedscroll.a aVar1113 = aVar2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar1113, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i28 |= 3072;
        if ((i13 & 16384) != 0) {
            if ((i12 & 24576) == 0) {
                i28 |= c0VarR.D(cVar) ? 16384 : 8192;
            }
            if ((i13 & 32768) != 0) {
                i30 = i28 | androidx.profileinstaller.n.c.f73814m;
            } else {
                i29 = i28;
                if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(oVar)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 = i29 | i31;
                } else {
                    i30 = i29;
                }
            }
            if ((i13 & 65536) != 0) {
                i30 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(oVar2)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i30 |= i32;
            }
            i33 = i30;
            if ((i14 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i14 & 1)) {
                if (i20 != 0) {
                    i35 = 0;
                } else {
                    i35 = i21;
                }
                if (i23 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f10;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                }
                if (i35 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                }
                i36 = i14 & com.planner5d.library.engine.input.f.b.B;
                if (i36 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i41111111111110 = i14 >> 3;
                i37 = i41111111111110 & 14;
                int i41111111111111 = i33 >> 15;
                i38 = i14;
                i39 = i35;
                Function0<l0> function0K1111 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41111111111111 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
                objI1 = c0VarR.i0();
                aVar3 = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar3.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                kotlinx.coroutines.s0 s0Var1111 = (kotlinx.coroutines.s0) objI1;
                if (i36 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objI2 = c0VarR.i0();
                if (z15) {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                int i41111111111112 = i38 >> 9;
                int i41111111111113 = i33 << 15;
                androidx.compose.foundation.lazy.layout.v0 v0VarA1111 = t0.a(function0K1111, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var1111, (Function0) objI2, c0VarR, (i38 & 65520) | (i41111111111112 & 458752) | (i41111111111112 & 3670016) | ((i33 << 21) & 29360128) | (i41111111111113 & 234881024) | (i41111111111113 & 1879048192), i41111111111111 & 14);
                float f11112 = fR;
                q3Var2 = q3.Vertical;
                if (q3Var == q3Var2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                q1 q1VarA1111 = a1.a(i1Var2, z16, c0VarR, i37);
                if (i36 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i38 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objI3 = c0VarR.i0();
                if (z19) {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new o1(e5Var, i1Var2);
                    c0VarR.Y(objI3);
                }
                o1 o1Var1111 = (o1) objI3;
                m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
                if (i36 == 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                zD = z20 | c0VarR.D(m0Var);
                objI4 = c0VarR.i0();
                if (zD) {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new s(i1Var2, m0Var);
                    c0VarR.Y(objI4);
                }
                s sVar1111 = (s) objI4;
                if (z11) {
                    c0VarR.E(-853761213);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                    c0VarR.A();
                } else {
                    c0VarR.E(-853331429);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarC1111 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K1111, q1VarA1111, q3Var, z11, z10, c0VarR, (i41111111111110 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                if (q3Var == q3Var2) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                androidx.compose.ui.a0 a0VarA1111 = c5.a(g0.t(a0VarC1111, i1Var2, z21, s0Var1111, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var1111, i1Var2.L(), false, x3Var, sVar1111);
                i1Var2 = i1Var2;
                aVar2 = aVar;
                androidx.compose.foundation.lazy.layout.u0.c(function0K1111, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA1111, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA1111, c0VarR, 0, 0);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f11 = f11112;
                i34 = i39;
            } else {
                aVar2 = aVar;
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                i34 = i21;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final androidx.compose.ui.input.nestedscroll.a aVar1114 = aVar2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar1114, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i28 |= 24576;
        if ((i13 & 32768) != 0) {
            i30 = i28 | androidx.profileinstaller.n.c.f73814m;
        } else {
            i29 = i28;
            if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(oVar)) {
                    i31 = 131072;
                } else {
                    i31 = 65536;
                }
                i30 = i29 | i31;
            } else {
                i30 = i29;
            }
        }
        if ((i13 & 65536) != 0) {
            i30 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (c0VarR.k0(oVar2)) {
                i32 = 1048576;
            } else {
                i32 = 524288;
            }
            i30 |= i32;
        }
        i33 = i30;
        if ((i14 & 306783379) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (c0VarR.h(z12, i14 & 1)) {
            if (i20 != 0) {
                i35 = 0;
            } else {
                i35 = i21;
            }
            if (i23 != 0) {
                fR = androidx.compose.ui.unit.h.r(0);
            } else {
                fR = f10;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-572816025, i14, i33, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
            }
            if (i35 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                androidx.compose.foundation.internal.e.g("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
            }
            i36 = i14 & com.planner5d.library.engine.input.f.b.B;
            if (i36 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objI0 = c0VarR.i0();
            if (z14) {
                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(k.g(i1Var2));
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: androidx.compose.foundation.pager.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(k.g(i1Var2));
                    }
                };
                c0VarR.Y(objI0);
            }
            int i41111111111114 = i14 >> 3;
            i37 = i41111111111114 & 14;
            int i41111111111115 = i33 >> 15;
            i38 = i14;
            i39 = i35;
            Function0<l0> function0K1112 = k(i1Var2, oVar2, function1, (Function0) objI0, c0VarR, i37 | (i41111111111115 & com.planner5d.library.engine.input.f.b.B) | (i33 & 896));
            objI1 = c0VarR.i0();
            aVar3 = androidx.compose.runtime.c0.f35327a;
            if (objI1 == aVar3.a()) {
                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            kotlinx.coroutines.s0 s0Var1112 = (kotlinx.coroutines.s0) objI1;
            if (i36 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objI2 = c0VarR.i0();
            if (z15) {
                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(k.h(i1Var2));
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function0() { // from class: androidx.compose.foundation.pager.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(k.h(i1Var2));
                    }
                };
                c0VarR.Y(objI2);
            }
            int i41111111111116 = i38 >> 9;
            int i41111111111117 = i33 << 15;
            androidx.compose.foundation.lazy.layout.v0 v0VarA1112 = t0.a(function0K1112, i1Var2, g5Var, z10, q3Var, i39, fR, pVar, bVar, cVar, oVar, s0Var1112, (Function0) objI2, c0VarR, (i38 & 65520) | (i41111111111116 & 458752) | (i41111111111116 & 3670016) | ((i33 << 21) & 29360128) | (i41111111111117 & 234881024) | (i41111111111117 & 1879048192), i41111111111115 & 14);
            float f11113 = fR;
            q3Var2 = q3.Vertical;
            if (q3Var == q3Var2) {
                z16 = true;
            } else {
                z16 = false;
            }
            q1 q1VarA1112 = a1.a(i1Var2, z16, c0VarR, i37);
            if (i36 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((i38 & 458752) == 131072) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | z17;
            objI3 = c0VarR.i0();
            if (z19) {
                objI3 = new o1(e5Var, i1Var2);
                c0VarR.Y(objI3);
            } else {
                objI3 = new o1(e5Var, i1Var2);
                c0VarR.Y(objI3);
            }
            o1 o1Var1112 = (o1) objI3;
            m0Var = (androidx.compose.foundation.gestures.m0) c0VarR.W(androidx.compose.foundation.gestures.o0.c());
            if (i36 == 32) {
                z20 = true;
            } else {
                z20 = false;
            }
            zD = z20 | c0VarR.D(m0Var);
            objI4 = c0VarR.i0();
            if (zD) {
                objI4 = new s(i1Var2, m0Var);
                c0VarR.Y(objI4);
            } else {
                objI4 = new s(i1Var2, m0Var);
                c0VarR.Y(objI4);
            }
            s sVar1112 = (s) objI4;
            if (z11) {
                c0VarR.E(-853761213);
                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, q.a(i1Var2, i39, c0VarR, i37 | ((i38 >> 21) & com.planner5d.library.engine.input.f.b.B)), i1Var2.D(), z10, q3Var);
                c0VarR.A();
            } else {
                c0VarR.E(-853331429);
                c0VarR.A();
                a0VarB = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarC1112 = r1.c(a0Var.B2(i1Var2.h0()).B2(i1Var2.C()), function0K1112, q1VarA1112, q3Var, z11, z10, c0VarR, (i41111111111114 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
            if (q3Var == q3Var2) {
                z21 = true;
            } else {
                z21 = false;
            }
            androidx.compose.ui.a0 a0VarA1112 = c5.a(g0.t(a0VarC1112, i1Var2, z21, s0Var1112, z11).B2(a0VarB), i1Var2, q3Var, z11, z10, o1Var1112, i1Var2.L(), false, x3Var, sVar1112);
            i1Var2 = i1Var2;
            aVar2 = aVar;
            androidx.compose.foundation.lazy.layout.u0.c(function0K1112, androidx.compose.ui.input.nestedscroll.c.b(j(a0VarA1112, i1Var2), aVar2, null, 2, null), i1Var2.c0(), v0VarA1112, c0VarR, 0, 0);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f11 = f11113;
            i34 = i39;
        } else {
            aVar2 = aVar;
            c0Var2 = c0VarR;
            c0Var2.u();
            f11 = f10;
            i34 = i21;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final androidx.compose.ui.input.nestedscroll.a aVar1115 = aVar2;
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k.i(a0Var, i1Var2, g5Var, z10, q3Var, e5Var, z11, x3Var, i34, f11, pVar, aVar1115, function1, bVar, cVar, oVar, oVar2, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(i1 i1Var) {
        return i1Var.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(i1 i1Var) {
        return i1Var.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.a0 a0Var, i1 i1Var, g5 g5Var, boolean z10, q3 q3Var, e5 e5Var, boolean z11, x3 x3Var, int i10, float f10, p pVar, androidx.compose.ui.input.nestedscroll.a aVar, Function1 function1, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, androidx.compose.foundation.gestures.snapping.o oVar, pj.o oVar2, int i11, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        f(a0Var, i1Var, g5Var, z10, q3Var, e5Var, z11, x3Var, i10, f10, pVar, aVar, function1, bVar, cVar, oVar, oVar2, c0Var, t4.a(i11 | 1), t4.a(i12), i13);
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.a0 j(androidx.compose.ui.a0 a0Var, i1 i1Var) {
        return a0Var.B2(androidx.compose.ui.input.pointer.w0.e(androidx.compose.ui.a0.E, i1Var, new a(i1Var)));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    private static final Function0<l0> k(final i1 i1Var, pj.o<? super v0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, Function1<? super Integer, ? extends Object> function1, final Function0<Integer> function0, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1052364153, i10, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:258)");
        }
        final n7 n7VarW = w6.w(oVar, c0Var, (i10 >> 3) & 14);
        final n7 n7VarW2 = w6.w(function1, c0Var, (i10 >> 6) & 14);
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.D(i1Var)) || (i10 & 6) == 4) | c0Var.D(n7VarW) | c0Var.D(n7VarW2) | ((((i10 & 7168) ^ 3072) > 2048 && c0Var.D(function0)) || (i10 & 3072) == 2048);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            final n7 n7VarD = w6.d(w6.v(), new Function0() { // from class: androidx.compose.foundation.pager.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k.l(n7VarW, n7VarW2, function0);
                }
            });
            objI0 = new kotlin.jvm.internal.c1(w6.d(w6.v(), new Function0() { // from class: androidx.compose.foundation.pager.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k.m(n7VarD, i1Var);
                }
            })) { // from class: androidx.compose.foundation.pager.k.b
                @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                public Object get() {
                    return ((n7) this.receiver).getValue();
                }
            };
            c0Var.Y(objI0);
        }
        kotlin.reflect.p pVar = (kotlin.reflect.p) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 l(n7 n7Var, n7 n7Var2, Function0 function0) {
        return new j0((pj.o) n7Var.getValue(), (Function1) n7Var2.getValue(), ((Number) function0.invoke()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 m(n7 n7Var, i1 i1Var) {
        j0 j0Var = (j0) n7Var.getValue();
        return new l0(i1Var, j0Var, new l2(i1Var.R(), j0Var));
    }
}
