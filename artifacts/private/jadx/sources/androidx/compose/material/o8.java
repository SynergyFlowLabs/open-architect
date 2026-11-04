package androidx.compose.material;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,671:1\n75#2:672\n1282#3,6:673\n1282#3,6:679\n1282#3,6:686\n1282#3,6:692\n1282#3,6:698\n1282#3,6:704\n1282#3,6:710\n1282#3,6:757\n1282#3,6:763\n1#4:685\n70#5:716\n67#5,9:717\n77#5:756\n79#6,6:726\n86#6,3:741\n89#6,2:750\n93#6:755\n347#7,9:732\n356#7,3:752\n4206#8,6:744\n78#9:769\n111#9,2:770\n78#9:772\n111#9,2:773\n54#10:775\n85#11:776\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n*L\n96#1:672\n98#1:673,6\n99#1:679,6\n101#1:686,6\n104#1:692,6\n117#1:698,6\n121#1:704,6\n133#1:710,6\n141#1:757,6\n143#1:763,6\n119#1:716\n119#1:717,9\n119#1:756\n119#1:726,6\n119#1:741,3\n119#1:750,2\n119#1:755\n119#1:732,9\n119#1:752,3\n119#1:744,6\n98#1:769\n98#1:770,2\n99#1:772\n99#1:773,2\n122#1:775\n122#1:776\n*E\n"})
@oj.i(name = "ExposedDropdownMenu_androidKt")
public final class o8 {

    public static final class a extends x7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f24040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l3 f24041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l3 f24042d;

        a(androidx.compose.ui.unit.d dVar, androidx.compose.runtime.l3 l3Var, androidx.compose.runtime.l3 l3Var2) {
            this.f24040b = dVar;
            this.f24041c = l3Var;
            this.f24042d = l3Var2;
        }

        @Override // androidx.compose.material.x7
        public androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, boolean z10) {
            androidx.compose.ui.unit.d dVar = this.f24040b;
            androidx.compose.runtime.l3 l3Var = this.f24041c;
            androidx.compose.runtime.l3 l3Var2 = this.f24042d;
            androidx.compose.ui.a0 a0VarK = androidx.compose.foundation.layout.i6.k(a0Var, 0.0f, dVar.D3(o8.t(l3Var)), 1, null);
            return z10 ? androidx.compose.foundation.layout.i6.B(a0VarK, dVar.D3(o8.k(l3Var2))) : a0VarK;
        }
    }

    static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24043a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {450, 451}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f24045b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24046c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f24046c = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f24046c, dVar);
                aVar.f24045b = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
            
                if (r12 == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r10 = 1
                    int r1 = r11.f24044a
                    r10 = 1
                    r2 = 2
                    r10 = 0
                    r3 = 1
                    if (r1 == 0) goto L2b
                    if (r1 == r3) goto L21
                    if (r1 != r2) goto L18
                    kotlin.ResultKt.m(r12)
                    r7 = r11
                    r7 = r11
                    r10 = 2
                    goto L5a
                L18:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    r10 = 7
                    throw r11
                L21:
                    java.lang.Object r1 = r11.f24045b
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.ResultKt.m(r12)
                    r7 = r11
                    r7 = r11
                    goto L49
                L2b:
                    r10 = 4
                    kotlin.ResultKt.m(r12)
                    java.lang.Object r12 = r11.f24045b
                    r4 = r12
                    r10 = 1
                    androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                    r10 = 2
                    androidx.compose.ui.input.pointer.s r6 = androidx.compose.ui.input.pointer.s.Initial
                    r11.f24045b = r4
                    r11.f24044a = r3
                    r5 = 0
                    r8 = 1
                    r9 = 0
                    r7 = r11
                    java.lang.Object r11 = androidx.compose.foundation.gestures.c5.g(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L48
                    r10 = 3
                    goto L59
                L48:
                    r1 = r4
                L49:
                    androidx.compose.ui.input.pointer.s r11 = androidx.compose.ui.input.pointer.s.Initial
                    r12 = 0
                    r12 = 0
                    r10 = 3
                    r7.f24045b = r12
                    r7.f24044a = r2
                    java.lang.Object r12 = androidx.compose.foundation.gestures.c5.B(r1, r11, r7)
                    r10 = 6
                    if (r12 != r0) goto L5a
                L59:
                    return r0
                L5a:
                    r10 = 4
                    androidx.compose.ui.input.pointer.c0 r12 = (androidx.compose.ui.input.pointer.c0) r12
                    if (r12 == 0) goto L65
                    r10 = 2
                    kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.f24046c
                    r11.invoke()
                L65:
                    kotlin.Unit r11 = kotlin.Unit.f312394a
                    r10 = 0
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.o8.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(Function0<Unit> function0) {
            this.f24043a = function0;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objE = androidx.compose.foundation.gestures.e3.e(l0Var, new a(this.f24043a, null), dVar);
            return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
        }
    }

    private static final void A(androidx.compose.ui.unit.s sVar, androidx.compose.ui.layout.g0 g0Var, int i10, Function1<? super Integer, Unit> function1) {
        if (g0Var == null) {
            return;
        }
        function1.invoke(Integer.valueOf(((int) Math.max(androidx.compose.ui.layout.h0.c(g0Var).B() - sVar.B(), (sVar.j() - sVar.B()) - androidx.compose.ui.layout.h0.c(g0Var).j())) - i10));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x021c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0244  */
    /* JADX WARN: Code duplicated, block: B:107:0x0246  */
    /* JADX WARN: Code duplicated, block: B:112:0x0253  */
    /* JADX WARN: Code duplicated, block: B:117:0x027b  */
    /* JADX WARN: Code duplicated, block: B:120:0x028f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0297  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x0189  */
    /* JADX WARN: Code duplicated, block: B:86:0x018b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0199  */
    /* JADX WARN: Code duplicated, block: B:94:0x01db  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01eb  */
    @androidx.compose.runtime.o
    @u7
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void j(final boolean z10, @NotNull final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, @NotNull final pj.n<? super x7, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.unit.d dVar;
        final fl flVarH;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final androidx.compose.runtime.l3 l3Var;
        Object objI1;
        final androidx.compose.runtime.l3 l3Var2;
        final int iG6;
        Object objI2;
        final androidx.compose.ui.node.f2 f2Var;
        boolean zD;
        Object objI3;
        Object objI4;
        final androidx.compose.ui.focus.g0 g0Var;
        boolean zK0;
        Object obj;
        final fl flVar;
        final int i14;
        final androidx.compose.runtime.l3 l3Var3;
        boolean z12;
        int i15;
        boolean z13;
        boolean z14;
        Object objI5;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z15;
        Object objI6;
        boolean zK1;
        Object objI7;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1337700255);
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
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(nVar)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1337700255, i12, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:94)");
                }
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                flVarH = e8.h(c0VarR, 0);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.e6.b(0);
                    c0VarR.Y(objI0);
                }
                l3Var = (androidx.compose.runtime.l3) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.e6.b(0);
                    c0VarR.Y(objI1);
                }
                l3Var2 = (androidx.compose.runtime.l3) objI1;
                iG6 = dVar.g6(ga.n());
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new androidx.compose.ui.node.f2();
                    c0VarR.Y(objI2);
                }
                f2Var = (androidx.compose.ui.node.f2) objI2;
                zD = c0VarR.D(dVar) | c0VarR.K(t(l3Var2)) | c0VarR.K(k(l3Var));
                objI3 = c0VarR.i0();
                if (zD || objI3 == aVar.a()) {
                    objI3 = new a(dVar, l3Var2, l3Var);
                    c0VarR.Y(objI3);
                }
                a aVar2 = (a) objI3;
                objI4 = c0VarR.i0();
                if (objI4 == aVar.a()) {
                    objI4 = new androidx.compose.ui.focus.g0();
                    c0VarR.Y(objI4);
                }
                g0Var = (androidx.compose.ui.focus.g0) objI4;
                zK0 = c0VarR.k0(f2Var) | c0VarR.k0(flVarH) | c0VarR.K(iG6);
                Object objI8 = c0VarR.i0();
                if (!zK0 || objI8 == aVar.a()) {
                    obj = new Function1() { // from class: androidx.compose.material.f8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return o8.l(f2Var, flVarH, iG6, l3Var, l3Var2, (androidx.compose.ui.layout.g0) obj2);
                        }
                    };
                    flVar = flVarH;
                    i14 = iG6;
                    l3Var3 = l3Var2;
                    c0VarR.Y(obj);
                } else {
                    l3Var3 = l3Var2;
                    obj = objI8;
                    flVar = flVarH;
                    i14 = iG6;
                }
                androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.q1.a(a0Var2, (Function1) obj);
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i15 = i12 & 14;
                int i17 = i12;
                if (i15 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | z12;
                objI5 = c0VarR.i0();
                if (z14 || objI5 == aVar.a()) {
                    objI5 = new Function0() { // from class: androidx.compose.material.g8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o8.n(function1, z10);
                        }
                    };
                    c0VarR.Y(objI5);
                }
                androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.focus.j0.a(x(a0VarA, (Function0) objI5, ug.a(tg.f25008b.d(), c0VarR, 6)), g0Var);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA2);
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.ui.a0 a0Var3 = a0Var2;
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar3.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                nVar.invoke(aVar2, c0VarR, Integer.valueOf((i17 >> 6) & com.planner5d.library.engine.input.f.b.B));
                c0VarR.o();
                if (i15 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objI6 = c0VarR.i0();
                if (z15 || objI6 == aVar.a()) {
                    objI6 = new Function0() { // from class: androidx.compose.material.h8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o8.o(z10, g0Var);
                        }
                    };
                    c0VarR.Y(objI6);
                }
                androidx.compose.runtime.b2.m((Function0) objI6, c0VarR, 0);
                zK1 = c0VarR.k0(flVar) | c0VarR.k0(f2Var) | c0VarR.K(i14);
                objI7 = c0VarR.i0();
                if (zK1 || objI7 == aVar.a()) {
                    objI7 = new Function0() { // from class: androidx.compose.material.i8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o8.q(flVar, f2Var, i14, l3Var3);
                        }
                    };
                    c0VarR.Y(objI7);
                }
                e8.c((Function0) objI7, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var4 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return o8.s(z10, function1, a0Var4, nVar, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.k0(nVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            if (i16 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1337700255, i12, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:94)");
            }
            dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            flVarH = e8.h(c0VarR, 0);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.e6.b(0);
                c0VarR.Y(objI0);
            }
            l3Var = (androidx.compose.runtime.l3) objI0;
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.e6.b(0);
                c0VarR.Y(objI1);
            }
            l3Var2 = (androidx.compose.runtime.l3) objI1;
            iG6 = dVar.g6(ga.n());
            objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = new androidx.compose.ui.node.f2();
                c0VarR.Y(objI2);
            }
            f2Var = (androidx.compose.ui.node.f2) objI2;
            zD = c0VarR.D(dVar) | c0VarR.K(t(l3Var2)) | c0VarR.K(k(l3Var));
            objI3 = c0VarR.i0();
            if (zD) {
                objI3 = new a(dVar, l3Var2, l3Var);
                c0VarR.Y(objI3);
            } else {
                objI3 = new a(dVar, l3Var2, l3Var);
                c0VarR.Y(objI3);
            }
            a aVar4 = (a) objI3;
            objI4 = c0VarR.i0();
            if (objI4 == aVar.a()) {
                objI4 = new androidx.compose.ui.focus.g0();
                c0VarR.Y(objI4);
            }
            g0Var = (androidx.compose.ui.focus.g0) objI4;
            zK0 = c0VarR.k0(f2Var) | c0VarR.k0(flVarH) | c0VarR.K(iG6);
            Object objI9 = c0VarR.i0();
            if (zK0) {
                obj = new Function1() { // from class: androidx.compose.material.f8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return o8.l(f2Var, flVarH, iG6, l3Var, l3Var2, (androidx.compose.ui.layout.g0) obj2);
                    }
                };
                flVar = flVarH;
                i14 = iG6;
                l3Var3 = l3Var2;
                c0VarR.Y(obj);
            } else {
                obj = new Function1() { // from class: androidx.compose.material.f8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return o8.l(f2Var, flVarH, iG6, l3Var, l3Var2, (androidx.compose.ui.layout.g0) obj2);
                    }
                };
                flVar = flVarH;
                i14 = iG6;
                l3Var3 = l3Var2;
                c0VarR.Y(obj);
            }
            androidx.compose.ui.a0 a0VarA3 = androidx.compose.ui.layout.q1.a(a0Var2, (Function1) obj);
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            i15 = i12 & 14;
            int i18 = i12;
            if (i15 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | z12;
            objI5 = c0VarR.i0();
            if (z14) {
                objI5 = new Function0() { // from class: androidx.compose.material.g8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o8.n(function1, z10);
                    }
                };
                c0VarR.Y(objI5);
            } else {
                objI5 = new Function0() { // from class: androidx.compose.material.g8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o8.n(function1, z10);
                    }
                };
                c0VarR.Y(objI5);
            }
            androidx.compose.ui.a0 a0VarA4 = androidx.compose.ui.focus.j0.a(x(a0VarA3, (Function0) objI5, ug.a(tg.f25008b.d(), c0VarR, 6)), g0Var);
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarA4);
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
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.ui.a0 a0Var5 = a0Var2;
            androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar5.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar5.g());
            function2B = aVar5.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar5.f());
            androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
            nVar.invoke(aVar4, c0VarR, Integer.valueOf((i18 >> 6) & com.planner5d.library.engine.input.f.b.B));
            c0VarR.o();
            if (i15 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            objI6 = c0VarR.i0();
            if (z15) {
                objI6 = new Function0() { // from class: androidx.compose.material.h8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o8.o(z10, g0Var);
                    }
                };
                c0VarR.Y(objI6);
            } else {
                objI6 = new Function0() { // from class: androidx.compose.material.h8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o8.o(z10, g0Var);
                    }
                };
                c0VarR.Y(objI6);
            }
            androidx.compose.runtime.b2.m((Function0) objI6, c0VarR, 0);
            zK1 = c0VarR.k0(flVar) | c0VarR.k0(f2Var) | c0VarR.K(i14);
            objI7 = c0VarR.i0();
            if (zK1) {
                objI7 = new Function0() { // from class: androidx.compose.material.i8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o8.q(flVar, f2Var, i14, l3Var3);
                    }
                };
                c0VarR.Y(objI7);
            } else {
                objI7 = new Function0() { // from class: androidx.compose.material.i8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o8.q(flVar, f2Var, i14, l3Var3);
                    }
                };
                c0VarR.Y(objI7);
            }
            e8.c((Function0) objI7, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var5;
        } else {
            c0VarR.u();
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var6 = a0Var2;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.j8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return o8.s(z10, function1, a0Var6, nVar, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(androidx.compose.runtime.l3 l3Var) {
        return l3Var.m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.node.f2 f2Var, fl flVar, int i10, androidx.compose.runtime.l3 l3Var, final androidx.compose.runtime.l3 l3Var2, androidx.compose.ui.layout.g0 g0Var) {
        p(l3Var, (int) (g0Var.a() >> 32));
        f2Var.b(g0Var);
        A(flVar.a(), (androidx.compose.ui.layout.g0) f2Var.a(), i10, new Function1() { // from class: androidx.compose.material.l8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o8.m(l3Var2, ((Integer) obj).intValue());
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.runtime.l3 l3Var, int i10) {
        u(l3Var, i10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(!z10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z10, androidx.compose.ui.focus.g0 g0Var) {
        if (z10) {
            androidx.compose.ui.focus.g0.k(g0Var, 0, 1, null);
        }
        return Unit.f312394a;
    }

    private static final void p(androidx.compose.runtime.l3 l3Var, int i10) {
        l3Var.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(fl flVar, androidx.compose.ui.node.f2 f2Var, int i10, final androidx.compose.runtime.l3 l3Var) {
        A(flVar.a(), (androidx.compose.ui.layout.g0) f2Var.a(), i10, new Function1() { // from class: androidx.compose.material.k8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o8.r(l3Var, ((Integer) obj).intValue());
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.runtime.l3 l3Var, int i10) {
        u(l3Var, i10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(z10, function1, a0Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(androidx.compose.runtime.l3 l3Var) {
        return l3Var.m1();
    }

    private static final void u(androidx.compose.runtime.l3 l3Var, int i10) {
        l3Var.j(i10);
    }

    private static final androidx.compose.ui.a0 x(androidx.compose.ui.a0 a0Var, final Function0<Unit> function0, final String str) {
        int i10 = 6 & 0;
        return androidx.compose.ui.semantics.t.f(androidx.compose.ui.input.pointer.w0.e(a0Var, function0, new b(function0)), false, new Function1() { // from class: androidx.compose.material.n8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o8.y(str, function0, (androidx.compose.ui.semantics.e0) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(String str, final Function0 function0, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.material.m8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(o8.z(function0));
            }
        }, 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(Function0 function0) {
        function0.invoke();
        return true;
    }
}
