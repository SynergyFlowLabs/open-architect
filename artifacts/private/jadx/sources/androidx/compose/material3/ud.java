package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDragHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragHandle.kt\nandroidx/compose/material3/DragHandleKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,347:1\n1282#2,6:348\n1282#2,6:354\n1282#2,6:360\n1282#2,6:366\n1282#2,6:372\n1282#2,6:378\n85#3:384\n85#3:385\n117#3,2:386\n57#4:388\n61#4:395\n60#5:389\n70#5:396\n22#6,5:390\n22#6,5:397\n*S KotlinDebug\n*F\n+ 1 DragHandle.kt\nandroidx/compose/material3/DragHandleKt\n*L\n81#1:348,6\n83#1:354,6\n89#1:360,6\n90#1:366,6\n99#1:372,6\n116#1:378,6\n82#1:384\n83#1:385\n83#1:386,2\n110#1:388\n111#1:395\n110#1:389\n111#1:396\n110#1:390,5\n111#1:397,5\n*E\n"})
public final class ud {

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33569b;

        /* JADX INFO: renamed from: androidx.compose.material3.ud$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DragHandleKt$pressable$1$1", f = "DragHandle.kt", i = {0}, l = {com.facebook.internal.p.f100031o, 343}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        static final class C0256a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f33570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f33571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f33572c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f33573d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0256a(Function0<Unit> function0, Function0<Unit> function1, kotlin.coroutines.d<? super C0256a> dVar) {
                super(2, dVar);
                this.f33572c = function0;
                this.f33573d = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0256a c0256a = new C0256a(this.f33572c, this.f33573d, dVar);
                c0256a.f33571b = obj;
                return c0256a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
            
                if (androidx.compose.foundation.gestures.c5.B(r1, r11, r7) == r0) goto L17;
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
                    int r1 = r11.f33570a
                    r10 = 3
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2b
                    r10 = 7
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L15
                    kotlin.ResultKt.m(r12)
                    r7 = r11
                    goto L61
                L15:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r10 = 7
                    r11.<init>(r12)
                    r10 = 0
                    throw r11
                L1f:
                    java.lang.Object r1 = r11.f33571b
                    r10 = 4
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.ResultKt.m(r12)
                    r7 = r11
                    r7 = r11
                    r10 = 3
                    goto L4a
                L2b:
                    kotlin.ResultKt.m(r12)
                    r10 = 5
                    java.lang.Object r12 = r11.f33571b
                    r4 = r12
                    r10 = 5
                    androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                    androidx.compose.ui.input.pointer.s r6 = androidx.compose.ui.input.pointer.s.Initial
                    r11.f33571b = r4
                    r11.f33570a = r3
                    r5 = 0
                    r8 = 1
                    r9 = 7
                    r9 = 0
                    r7 = r11
                    r7 = r11
                    r10 = 7
                    java.lang.Object r11 = androidx.compose.foundation.gestures.c5.g(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L49
                    goto L5f
                L49:
                    r1 = r4
                L4a:
                    kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.f33572c
                    r11.invoke()
                    androidx.compose.ui.input.pointer.s r11 = androidx.compose.ui.input.pointer.s.Initial
                    r12 = 0
                    r10 = 6
                    r7.f33571b = r12
                    r7.f33570a = r2
                    r10 = 5
                    java.lang.Object r11 = androidx.compose.foundation.gestures.c5.B(r1, r11, r7)
                    r10 = 3
                    if (r11 != r0) goto L61
                L5f:
                    r10 = 3
                    return r0
                L61:
                    kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.f33573d
                    r11.invoke()
                    kotlin.Unit r11 = kotlin.Unit.f312394a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ud.a.C0256a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0256a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(Function0<Unit> function0, Function0<Unit> function1) {
            this.f33568a = function0;
            this.f33569b = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objE = androidx.compose.foundation.gestures.e3.e(l0Var, new C0256a(this.f33568a, this.f33569b, null), dVar);
            return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x015a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0177  */
    /* JADX WARN: Code duplicated, block: B:110:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:149:0x022c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0262  */
    /* JADX WARN: Code duplicated, block: B:154:0x0269  */
    /* JADX WARN: Code duplicated, block: B:157:0x0276  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
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
    public static final void h(@Nullable androidx.compose.ui.a0 a0Var, @Nullable wd wdVar, @Nullable md mdVar, @Nullable vd vdVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        wd wdVar2;
        final md mdVarA;
        final vd vdVarE;
        androidx.compose.foundation.interaction.j jVar2;
        boolean z10;
        boolean z11;
        androidx.compose.ui.a0 a0Var3;
        final wd wdVarG;
        final md mdVar2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.foundation.interaction.j jVar4;
        final androidx.compose.runtime.n7<Boolean> n7VarA;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final androidx.compose.runtime.n3 n3Var;
        Object objI1;
        Object objI2;
        boolean zD;
        Object objI3;
        boolean zD2;
        Object objI4;
        boolean z12;
        Object objI5;
        Object objI6;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1693656835);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                wdVar2 = wdVar;
                int i14 = c0VarR.D(wdVar2) ? 32 : 16;
                i12 |= i14;
            } else {
                wdVar2 = wdVar;
            }
            i12 |= i14;
        } else {
            wdVar2 = wdVar;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                mdVarA = mdVar;
                int i15 = c0VarR.D(mdVarA) ? 256 : 128;
                i12 |= i15;
            } else {
                mdVarA = mdVar;
            }
            i12 |= i15;
        } else {
            mdVarA = mdVar;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                vdVarE = vdVar;
                int i16 = c0VarR.D(vdVarE) ? 2048 : 1024;
                i12 |= i16;
            } else {
                vdVarE = vdVar;
            }
            i12 |= i16;
        } else {
            vdVarE = vdVar;
        }
        int i17 = i11 & 16;
        if (i17 == 0) {
            if ((i10 & 24576) == 0) {
                jVar2 = jVar;
                i12 |= c0VarR.D(jVar2) ? 16384 : 8192;
            }
            z10 = true;
            if ((i12 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i13 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        wdVarG = ma0.f30593a.g();
                        i12 &= -113;
                    } else {
                        wdVarG = wdVar2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        mdVarA = ma0.f30593a.a(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        vdVarE = ma0.f30593a.e(c0VarR, 6);
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    a0Var3 = a0Var2;
                    wdVarG = wdVar2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1693656835, i12, -1, "androidx.compose.material3.VerticalDragHandle (DragHandle.kt:78)");
                }
                if (jVar2 == null) {
                    c0VarR.E(-1544610024);
                    objI6 = c0VarR.i0();
                    if (objI6 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI6 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI6);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI6;
                    c0VarR.A();
                } else {
                    c0VarR.E(-188374113);
                    c0VarR.A();
                    jVar4 = jVar2;
                }
                n7VarA = androidx.compose.foundation.interaction.b.a(jVar4, c0VarR, 0);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.n2.b(wi.j(a0Var3), jVar4, false, 2, null);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.od
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ud.q(n3Var);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function0 function0 = (Function0) objI1;
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.pd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ud.r(n3Var);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarS = s(a0VarB, jVar4, function0, (Function0) objI2);
                zD = c0VarR.D(n7VarA) | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(vdVarE)) || (i12 & 3072) == 2048);
                objI3 = c0VarR.i0();
                if (zD || objI3 == aVar.a()) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.qd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ud.j(vdVarE, n7VarA, n3Var, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.ui.a0 a0VarA = androidx.compose.ui.graphics.q1.a(a0VarS, (Function1) objI3);
                zD2 = c0VarR.D(n7VarA) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0VarR.D(wdVarG)) || (i12 & 48) == 32);
                objI4 = c0VarR.i0();
                if (zD2 || objI4 == aVar.a()) {
                    objI4 = new pj.n() { // from class: androidx.compose.material3.rd
                        @Override // pj.n
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ud.k(wdVarG, n7VarA, n3Var, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                        }
                    };
                    c0VarR.Y(objI4);
                }
                androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.layout.q0.a(a0VarA, (pj.n) objI4);
                boolean zD3 = c0VarR.D(n7VarA);
                if ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 || !c0VarR.D(mdVarA)) && (i12 & androidx.media3.exoplayer.a5.S0) != 256) {
                }
                z12 = zD3 | z10;
                objI5 = c0VarR.i0();
                if (z12 || objI5 == aVar.a()) {
                    objI5 = new Function1() { // from class: androidx.compose.material3.sd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ud.m(mdVarA, n7VarA, n3Var, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI5);
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.foundation.w2.d(androidx.compose.ui.draw.n.b(a0VarA2, (Function1) objI5), jVar4, gt.e(false, 0.0f, 0L, 7, null)), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                wdVarG = wdVar2;
            }
            mdVar2 = mdVarA;
            jVar3 = jVar2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var4 = a0Var3;
                final wd wdVar3 = wdVarG;
                final vd vdVar2 = vdVarE;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.td
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ud.n(a0Var4, wdVar3, mdVar2, vdVar2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        z10 = true;
        if ((i12 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    wdVarG = ma0.f30593a.g();
                    i12 &= -113;
                } else {
                    wdVarG = wdVar2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    mdVarA = ma0.f30593a.a(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    vdVarE = ma0.f30593a.e(c0VarR, 6);
                }
                if (i17 != 0) {
                    jVar2 = null;
                }
            } else {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    wdVarG = ma0.f30593a.g();
                    i12 &= -113;
                } else {
                    wdVarG = wdVar2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    mdVarA = ma0.f30593a.a(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    vdVarE = ma0.f30593a.e(c0VarR, 6);
                }
                if (i17 != 0) {
                    jVar2 = null;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1693656835, i12, -1, "androidx.compose.material3.VerticalDragHandle (DragHandle.kt:78)");
            }
            if (jVar2 == null) {
                c0VarR.E(-1544610024);
                objI6 = c0VarR.i0();
                if (objI6 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI6 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI6);
                }
                jVar4 = (androidx.compose.foundation.interaction.j) objI6;
                c0VarR.A();
            } else {
                c0VarR.E(-188374113);
                c0VarR.A();
                jVar4 = jVar2;
            }
            n7VarA = androidx.compose.foundation.interaction.b.a(jVar4, c0VarR, 0);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI0);
            }
            n3Var = (androidx.compose.runtime.n3) objI0;
            androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.n2.b(wi.j(a0Var3), jVar4, false, 2, null);
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function0() { // from class: androidx.compose.material3.od
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ud.q(n3Var);
                    }
                };
                c0VarR.Y(objI1);
            }
            Function0 function1 = (Function0) objI1;
            objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = new Function0() { // from class: androidx.compose.material3.pd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ud.r(n3Var);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarS2 = s(a0VarB2, jVar4, function1, (Function0) objI2);
            zD = c0VarR.D(n7VarA) | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(vdVarE)) || (i12 & 3072) == 2048);
            objI3 = c0VarR.i0();
            if (zD) {
                objI3 = new Function1() { // from class: androidx.compose.material3.qd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ud.j(vdVarE, n7VarA, n3Var, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI3);
            } else {
                objI3 = new Function1() { // from class: androidx.compose.material3.qd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ud.j(vdVarE, n7VarA, n3Var, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarA3 = androidx.compose.ui.graphics.q1.a(a0VarS2, (Function1) objI3);
            zD2 = c0VarR.D(n7VarA) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0VarR.D(wdVarG)) || (i12 & 48) == 32);
            objI4 = c0VarR.i0();
            if (zD2) {
                objI4 = new pj.n() { // from class: androidx.compose.material3.rd
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ud.k(wdVarG, n7VarA, n3Var, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0VarR.Y(objI4);
            } else {
                objI4 = new pj.n() { // from class: androidx.compose.material3.rd
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ud.k(wdVarG, n7VarA, n3Var, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0VarR.Y(objI4);
            }
            androidx.compose.ui.a0 a0VarA4 = androidx.compose.ui.layout.q0.a(a0VarA3, (pj.n) objI4);
            boolean zD4 = c0VarR.D(n7VarA);
            z10 = ((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 ? false : false;
            z12 = zD4 | z10;
            objI5 = c0VarR.i0();
            if (z12) {
                objI5 = new Function1() { // from class: androidx.compose.material3.sd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ud.m(mdVarA, n7VarA, n3Var, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI5);
            } else {
                objI5 = new Function1() { // from class: androidx.compose.material3.sd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ud.m(mdVarA, n7VarA, n3Var, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI5);
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.w2.d(androidx.compose.ui.draw.n.b(a0VarA4, (Function1) objI5), jVar4, gt.e(false, 0.0f, 0L, 7, null)), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            wdVarG = wdVar2;
        }
        mdVar2 = mdVarA;
        jVar3 = jVar2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var5 = a0Var3;
            final wd wdVar4 = wdVarG;
            final vd vdVar3 = vdVarE;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.td
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ud.n(a0Var5, wdVar4, mdVar2, vdVar3, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean i(androidx.compose.runtime.n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(vd vdVar, androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n3 n3Var, androidx.compose.ui.graphics.r1 r1Var) {
        androidx.compose.ui.graphics.q3 q3VarB;
        if (i(n7Var)) {
            q3VarB = vdVar.a();
        } else {
            q3VarB = o(n3Var) ? vdVar.b() : vdVar.c();
        }
        r1Var.Q3(q3VarB);
        r1Var.O(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 k(wd wdVar, androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n3 n3Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        long jB;
        if (i(n7Var)) {
            jB = wdVar.a();
        } else {
            jB = o(n3Var) ? wdVar.b() : wdVar.c();
        }
        long jK4 = c1Var.k4(jB);
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.f42658b.c(Math.round(Float.intBitsToFloat((int) (jK4 >> 32))), Math.round(Float.intBitsToFloat((int) (jK4 & com.rabbitmq.client.k0.f265952a)))));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.nd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ud.l(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(md mdVar, androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n3 n3Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        long jC;
        if (i(n7Var)) {
            jC = mdVar.b();
        } else {
            jC = o(n3Var) ? mdVar.c() : mdVar.a();
        }
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, jC, 0L, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(androidx.compose.ui.a0 a0Var, wd wdVar, md mdVar, vd vdVar, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(a0Var, wdVar, mdVar, vdVar, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final boolean o(androidx.compose.runtime.n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    private static final void p(androidx.compose.runtime.n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.runtime.n3 n3Var) {
        p(n3Var, true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.runtime.n3 n3Var) {
        p(n3Var, false);
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.a0 s(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, Function0<Unit> function0, Function0<Unit> function1) {
        return androidx.compose.ui.input.pointer.w0.e(a0Var, jVar, new a(function0, function1));
    }
}
