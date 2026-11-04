package androidx.compose.material3;

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
@SourceDebugExtension({"SMAP\nLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,143:1\n1282#2,6:144\n1282#2,6:150\n1282#2,6:156\n1282#2,6:162\n1282#2,6:168\n*S KotlinDebug\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n*L\n72#1:144,6\n77#1:150,6\n80#1:156,6\n81#1:162,6\n111#1:168,6\n*E\n"})
public final class aj {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", f = "Label.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f26077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n90 f26078c;

        /* JADX INFO: renamed from: androidx.compose.material3.aj$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", f = "Label.kt", i = {}, l = {me.relex.circleindicator.a.f332619e}, m = "invokeSuspend", n = {}, s = {})
        static final class C0209a extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.foundation.interaction.g, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26079a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26080b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n90 f26081c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0209a(n90 n90Var, kotlin.coroutines.d<? super C0209a> dVar) {
                super(2, dVar);
                this.f26081c = n90Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0209a c0209a = new C0209a(this.f26081c, dVar);
                c0209a.f26080b = obj;
                return c0209a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f26079a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.foundation.interaction.g gVar = (androidx.compose.foundation.interaction.g) this.f26080b;
                    if ((gVar instanceof androidx.compose.foundation.interaction.l.b) || (gVar instanceof androidx.compose.foundation.interaction.a.b) || (gVar instanceof androidx.compose.foundation.interaction.e.a)) {
                        n90 n90Var = this.f26081c;
                        androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.UserInput;
                        this.f26079a = 1;
                        if (n90Var.c(q3Var, this) == objL) {
                            return objL;
                        }
                    } else if ((gVar instanceof androidx.compose.foundation.interaction.l.c) || (gVar instanceof androidx.compose.foundation.interaction.a.c) || (gVar instanceof androidx.compose.foundation.interaction.e.b)) {
                        this.f26081c.dismiss();
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
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0209a) create(gVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.j jVar, n90 n90Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f26077b = jVar;
            this.f26078c = n90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f26077b, this.f26078c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f26076a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f26077b.c();
                C0209a c0209a = new C0209a(this.f26078c, null);
                this.f26076a = 1;
                if (kotlinx.coroutines.flow.k.C(iVarC, c0209a, this) == objL) {
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

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<k90, androidx.compose.runtime.c0, Integer, Unit> f26082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m90 f26083b;

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super k90, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, m90 m90Var) {
            this.f26082a = nVar;
            this.f26083b = m90Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1572484206, i10, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:88)");
            }
            this.f26082a.invoke(this.f26083b, c0Var, 6);
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

    @SourceDebugExtension({"SMAP\nLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt$Label$wrappedContent$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,143:1\n70#2:144\n67#2,9:145\n77#2:184\n79#3,6:154\n86#3,3:169\n89#3,2:178\n93#3:183\n347#4,9:160\n356#4,3:180\n4206#5,6:172\n*S KotlinDebug\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt$Label$wrappedContent$1\n*L\n84#1:144\n84#1:145,9\n84#1:184\n84#1:154,6\n84#1:169,3\n84#1:178,2\n84#1:183\n84#1:160,9\n84#1:180,3\n84#1:172,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<androidx.compose.runtime.n3<androidx.compose.ui.layout.g0>> f26084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26085b;

        /* JADX WARN: Multi-variable type inference failed */
        c(kotlin.jvm.internal.i1.h<androidx.compose.runtime.n3<androidx.compose.ui.layout.g0>> hVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f26084a = hVar;
            this.f26085b = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(kotlin.jvm.internal.i1.h hVar, androidx.compose.ui.layout.g0 g0Var) {
            ((androidx.compose.runtime.n3) hVar.f312751a).setValue(g0Var);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10;
            if ((i10 & 3) != 2) {
                z10 = true;
                int i11 = 5 << 1;
            } else {
                z10 = false;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-44123786, i10, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:83)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            final kotlin.jvm.internal.i1.h<androidx.compose.runtime.n3<androidx.compose.ui.layout.g0>> hVar = this.f26084a;
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.q1.a(aVar, new Function1() { // from class: androidx.compose.material3.bj
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return aj.c.f(hVar, (androidx.compose.ui.layout.g0) obj);
                }
            });
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f26085b;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
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

    @androidx.compose.runtime.o
    private static final void d(final boolean z10, final n90 n90Var, final androidx.compose.foundation.interaction.j jVar, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-627258109);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c0VarR.D(n90Var) : c0VarR.k0(n90Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(jVar) ? 256 : 128;
        }
        boolean z11 = false;
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-627258109, i11, -1, "androidx.compose.material3.HandleInteractions (Label.kt:108)");
            }
            if (z10) {
                c0VarR.E(756598818);
                boolean z12 = (i11 & 896) == 256;
                if ((i11 & com.planner5d.library.engine.input.f.b.B) == 32 || ((i11 & 64) != 0 && c0VarR.k0(n90Var))) {
                    z11 = true;
                }
                boolean z13 = z12 | z11;
                Object objI0 = c0VarR.i0();
                if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new a(jVar, n90Var, null);
                    c0VarR.Y(objI0);
                }
                androidx.compose.runtime.b2.i(jVar, (Function2) objI0, c0VarR, (i11 >> 6) & 14);
                c0VarR.A();
            } else {
                c0VarR.E(757210975);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return aj.e(z10, n90Var, jVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(boolean z10, n90 n90Var, androidx.compose.foundation.interaction.j jVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d(z10, n90Var, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x012d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0155  */
    /* JADX WARN: Code duplicated, block: B:94:0x016b  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c4  */
    /* JADX WARN: Type inference failed for: r8v11, types: [T, androidx.compose.runtime.n3] */
    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void f(@NotNull final pj.n<? super k90, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z10, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        androidx.compose.foundation.interaction.j jVar2;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.foundation.interaction.j jVar3;
        final boolean z13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.interaction.j jVar4;
        boolean z14;
        androidx.compose.foundation.interaction.j jVar5;
        androidx.compose.ui.window.s sVarO;
        n90 n90VarY;
        final kotlin.jvm.internal.i1.h hVar;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        Object objI1;
        Object objI2;
        Object objI3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-458575864);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-458575864, i12, -1, "androidx.compose.material3.Label (Label.kt:69)");
                        }
                        if (jVar4 == null) {
                            c0VarR.E(857748595);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            jVar5 = (androidx.compose.foundation.interaction.j) objI3;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1690236644);
                            c0VarR.A();
                            jVar5 = jVar4;
                        }
                        sVarO = u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2);
                        if (z14) {
                            c0VarR.E(857995293);
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new cj(false, false, 3, null);
                                c0VarR.Y(objI2);
                            }
                            n90VarY = (cj) objI2;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1690246656);
                            n90VarY = androidx.compose.material3.internal.f1.y(false, false, new androidx.compose.foundation.s3(), c0VarR, 0, 3);
                            c0VarR.A();
                        }
                        n90 n90Var = n90VarY;
                        hVar = new kotlin.jvm.internal.i1.h();
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        hVar.f312751a = (androidx.compose.runtime.n3) objI0;
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = new m90(new Function0() { // from class: androidx.compose.material3.yi
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return aj.g(hVar);
                                }
                            }, sVarO);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.material3.internal.f1.i(sVarO, androidx.compose.runtime.internal.w.e(-1572484206, true, new b(nVar, (m90) objI1), c0VarR, 54), n90Var, a0Var4, null, false, false, false, androidx.compose.runtime.internal.w.e(-44123786, true, new c(hVar, function2), c0VarR, 54), c0VarR, ((i12 << 6) & 7168) | 102432816, 144);
                        c0VarR = c0VarR;
                        d(!z14, n90Var, jVar5, c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        jVar3 = jVar4;
                        z13 = z14;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        jVar3 = jVar2;
                        z13 = z11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.zi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return aj.h(nVar, a0Var3, jVar3, z13, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                z11 = z10;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-458575864, i12, -1, "androidx.compose.material3.Label (Label.kt:69)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(857748595);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        jVar5 = (androidx.compose.foundation.interaction.j) objI3;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1690236644);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    sVarO = u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2);
                    if (z14) {
                        c0VarR.E(857995293);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new cj(false, false, 3, null);
                            c0VarR.Y(objI2);
                        }
                        n90VarY = (cj) objI2;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1690246656);
                        n90VarY = androidx.compose.material3.internal.f1.y(false, false, new androidx.compose.foundation.s3(), c0VarR, 0, 3);
                        c0VarR.A();
                    }
                    n90 n90Var2 = n90VarY;
                    hVar = new kotlin.jvm.internal.i1.h();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    hVar.f312751a = (androidx.compose.runtime.n3) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new m90(new Function0() { // from class: androidx.compose.material3.yi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return aj.g(hVar);
                            }
                        }, sVarO);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.material3.internal.f1.i(sVarO, androidx.compose.runtime.internal.w.e(-1572484206, true, new b(nVar, (m90) objI1), c0VarR, 54), n90Var2, a0Var4, null, false, false, false, androidx.compose.runtime.internal.w.e(-44123786, true, new c(hVar, function2), c0VarR, 54), c0VarR, ((i12 << 6) & 7168) | 102432816, 144);
                    c0VarR = c0VarR;
                    d(!z14, n90Var2, jVar5, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar3 = jVar4;
                    z13 = z14;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    jVar3 = jVar2;
                    z13 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.zi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.h(nVar, a0Var3, jVar3, z13, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            jVar2 = jVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-458575864, i12, -1, "androidx.compose.material3.Label (Label.kt:69)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(857748595);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        jVar5 = (androidx.compose.foundation.interaction.j) objI3;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1690236644);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    sVarO = u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2);
                    if (z14) {
                        c0VarR.E(857995293);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new cj(false, false, 3, null);
                            c0VarR.Y(objI2);
                        }
                        n90VarY = (cj) objI2;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1690246656);
                        n90VarY = androidx.compose.material3.internal.f1.y(false, false, new androidx.compose.foundation.s3(), c0VarR, 0, 3);
                        c0VarR.A();
                    }
                    n90 n90Var3 = n90VarY;
                    hVar = new kotlin.jvm.internal.i1.h();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    hVar.f312751a = (androidx.compose.runtime.n3) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new m90(new Function0() { // from class: androidx.compose.material3.yi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return aj.g(hVar);
                            }
                        }, sVarO);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.material3.internal.f1.i(sVarO, androidx.compose.runtime.internal.w.e(-1572484206, true, new b(nVar, (m90) objI1), c0VarR, 54), n90Var3, a0Var4, null, false, false, false, androidx.compose.runtime.internal.w.e(-44123786, true, new c(hVar, function2), c0VarR, 54), c0VarR, ((i12 << 6) & 7168) | 102432816, 144);
                    c0VarR = c0VarR;
                    d(!z14, n90Var3, jVar5, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar3 = jVar4;
                    z13 = z14;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    jVar3 = jVar2;
                    z13 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.zi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.h(nVar, a0Var3, jVar3, z13, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-458575864, i12, -1, "androidx.compose.material3.Label (Label.kt:69)");
                }
                if (jVar4 == null) {
                    c0VarR.E(857748595);
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI3);
                    }
                    jVar5 = (androidx.compose.foundation.interaction.j) objI3;
                    c0VarR.A();
                } else {
                    c0VarR.E(1690236644);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                sVarO = u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2);
                if (z14) {
                    c0VarR.E(857995293);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new cj(false, false, 3, null);
                        c0VarR.Y(objI2);
                    }
                    n90VarY = (cj) objI2;
                    c0VarR.A();
                } else {
                    c0VarR.E(1690246656);
                    n90VarY = androidx.compose.material3.internal.f1.y(false, false, new androidx.compose.foundation.s3(), c0VarR, 0, 3);
                    c0VarR.A();
                }
                n90 n90Var4 = n90VarY;
                hVar = new kotlin.jvm.internal.i1.h();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                    c0VarR.Y(objI0);
                }
                hVar.f312751a = (androidx.compose.runtime.n3) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new m90(new Function0() { // from class: androidx.compose.material3.yi
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return aj.g(hVar);
                        }
                    }, sVarO);
                    c0VarR.Y(objI1);
                }
                androidx.compose.material3.internal.f1.i(sVarO, androidx.compose.runtime.internal.w.e(-1572484206, true, new b(nVar, (m90) objI1), c0VarR, 54), n90Var4, a0Var4, null, false, false, false, androidx.compose.runtime.internal.w.e(-44123786, true, new c(hVar, function2), c0VarR, 54), c0VarR, ((i12 << 6) & 7168) | 102432816, 144);
                c0VarR = c0VarR;
                d(!z14, n90Var4, jVar5, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar3 = jVar4;
                z13 = z14;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                jVar3 = jVar2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.zi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.h(nVar, a0Var3, jVar3, z13, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-458575864, i12, -1, "androidx.compose.material3.Label (Label.kt:69)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(857748595);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        jVar5 = (androidx.compose.foundation.interaction.j) objI3;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1690236644);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    sVarO = u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2);
                    if (z14) {
                        c0VarR.E(857995293);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new cj(false, false, 3, null);
                            c0VarR.Y(objI2);
                        }
                        n90VarY = (cj) objI2;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1690246656);
                        n90VarY = androidx.compose.material3.internal.f1.y(false, false, new androidx.compose.foundation.s3(), c0VarR, 0, 3);
                        c0VarR.A();
                    }
                    n90 n90Var5 = n90VarY;
                    hVar = new kotlin.jvm.internal.i1.h();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    hVar.f312751a = (androidx.compose.runtime.n3) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new m90(new Function0() { // from class: androidx.compose.material3.yi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return aj.g(hVar);
                            }
                        }, sVarO);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.material3.internal.f1.i(sVarO, androidx.compose.runtime.internal.w.e(-1572484206, true, new b(nVar, (m90) objI1), c0VarR, 54), n90Var5, a0Var4, null, false, false, false, androidx.compose.runtime.internal.w.e(-44123786, true, new c(hVar, function2), c0VarR, 54), c0VarR, ((i12 << 6) & 7168) | 102432816, 144);
                    c0VarR = c0VarR;
                    d(!z14, n90Var5, jVar5, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar3 = jVar4;
                    z13 = z14;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    jVar3 = jVar2;
                    z13 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.zi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.h(nVar, a0Var3, jVar3, z13, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-458575864, i12, -1, "androidx.compose.material3.Label (Label.kt:69)");
                }
                if (jVar4 == null) {
                    c0VarR.E(857748595);
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI3);
                    }
                    jVar5 = (androidx.compose.foundation.interaction.j) objI3;
                    c0VarR.A();
                } else {
                    c0VarR.E(1690236644);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                sVarO = u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2);
                if (z14) {
                    c0VarR.E(857995293);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new cj(false, false, 3, null);
                        c0VarR.Y(objI2);
                    }
                    n90VarY = (cj) objI2;
                    c0VarR.A();
                } else {
                    c0VarR.E(1690246656);
                    n90VarY = androidx.compose.material3.internal.f1.y(false, false, new androidx.compose.foundation.s3(), c0VarR, 0, 3);
                    c0VarR.A();
                }
                n90 n90Var6 = n90VarY;
                hVar = new kotlin.jvm.internal.i1.h();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                    c0VarR.Y(objI0);
                }
                hVar.f312751a = (androidx.compose.runtime.n3) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new m90(new Function0() { // from class: androidx.compose.material3.yi
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return aj.g(hVar);
                        }
                    }, sVarO);
                    c0VarR.Y(objI1);
                }
                androidx.compose.material3.internal.f1.i(sVarO, androidx.compose.runtime.internal.w.e(-1572484206, true, new b(nVar, (m90) objI1), c0VarR, 54), n90Var6, a0Var4, null, false, false, false, androidx.compose.runtime.internal.w.e(-44123786, true, new c(hVar, function2), c0VarR, 54), c0VarR, ((i12 << 6) & 7168) | 102432816, 144);
                c0VarR = c0VarR;
                d(!z14, n90Var6, jVar5, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar3 = jVar4;
                z13 = z14;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                jVar3 = jVar2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.zi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.h(nVar, a0Var3, jVar3, z13, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        jVar2 = jVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-458575864, i12, -1, "androidx.compose.material3.Label (Label.kt:69)");
                }
                if (jVar4 == null) {
                    c0VarR.E(857748595);
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI3);
                    }
                    jVar5 = (androidx.compose.foundation.interaction.j) objI3;
                    c0VarR.A();
                } else {
                    c0VarR.E(1690236644);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                sVarO = u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2);
                if (z14) {
                    c0VarR.E(857995293);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new cj(false, false, 3, null);
                        c0VarR.Y(objI2);
                    }
                    n90VarY = (cj) objI2;
                    c0VarR.A();
                } else {
                    c0VarR.E(1690246656);
                    n90VarY = androidx.compose.material3.internal.f1.y(false, false, new androidx.compose.foundation.s3(), c0VarR, 0, 3);
                    c0VarR.A();
                }
                n90 n90Var7 = n90VarY;
                hVar = new kotlin.jvm.internal.i1.h();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                    c0VarR.Y(objI0);
                }
                hVar.f312751a = (androidx.compose.runtime.n3) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new m90(new Function0() { // from class: androidx.compose.material3.yi
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return aj.g(hVar);
                        }
                    }, sVarO);
                    c0VarR.Y(objI1);
                }
                androidx.compose.material3.internal.f1.i(sVarO, androidx.compose.runtime.internal.w.e(-1572484206, true, new b(nVar, (m90) objI1), c0VarR, 54), n90Var7, a0Var4, null, false, false, false, androidx.compose.runtime.internal.w.e(-44123786, true, new c(hVar, function2), c0VarR, 54), c0VarR, ((i12 << 6) & 7168) | 102432816, 144);
                c0VarR = c0VarR;
                d(!z14, n90Var7, jVar5, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar3 = jVar4;
                z13 = z14;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                jVar3 = jVar2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.zi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.h(nVar, a0Var3, jVar3, z13, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.k0(function2)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((i12 & 9363) != 9362) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i18 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                jVar4 = null;
            } else {
                jVar4 = jVar2;
            }
            if (i15 != 0) {
                z14 = false;
            } else {
                z14 = z11;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-458575864, i12, -1, "androidx.compose.material3.Label (Label.kt:69)");
            }
            if (jVar4 == null) {
                c0VarR.E(857748595);
                objI3 = c0VarR.i0();
                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI3 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI3);
                }
                jVar5 = (androidx.compose.foundation.interaction.j) objI3;
                c0VarR.A();
            } else {
                c0VarR.E(1690236644);
                c0VarR.A();
                jVar5 = jVar4;
            }
            sVarO = u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2);
            if (z14) {
                c0VarR.E(857995293);
                objI2 = c0VarR.i0();
                if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI2 = new cj(false, false, 3, null);
                    c0VarR.Y(objI2);
                }
                n90VarY = (cj) objI2;
                c0VarR.A();
            } else {
                c0VarR.E(1690246656);
                n90VarY = androidx.compose.material3.internal.f1.y(false, false, new androidx.compose.foundation.s3(), c0VarR, 0, 3);
                c0VarR.A();
            }
            n90 n90Var8 = n90VarY;
            hVar = new kotlin.jvm.internal.i1.h();
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                c0VarR.Y(objI0);
            }
            hVar.f312751a = (androidx.compose.runtime.n3) objI0;
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new m90(new Function0() { // from class: androidx.compose.material3.yi
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return aj.g(hVar);
                    }
                }, sVarO);
                c0VarR.Y(objI1);
            }
            androidx.compose.material3.internal.f1.i(sVarO, androidx.compose.runtime.internal.w.e(-1572484206, true, new b(nVar, (m90) objI1), c0VarR, 54), n90Var8, a0Var4, null, false, false, false, androidx.compose.runtime.internal.w.e(-44123786, true, new c(hVar, function2), c0VarR, 54), c0VarR, ((i12 << 6) & 7168) | 102432816, 144);
            c0VarR = c0VarR;
            d(!z14, n90Var8, jVar5, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            jVar3 = jVar4;
            z13 = z14;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            jVar3 = jVar2;
            z13 = z11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.zi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return aj.h(nVar, a0Var3, jVar3, z13, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.g0 g(kotlin.jvm.internal.i1.h hVar) {
        return (androidx.compose.ui.layout.g0) ((androidx.compose.runtime.n3) hVar.f312751a).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(pj.n nVar, androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, boolean z10, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(nVar, a0Var, jVar, z10, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
