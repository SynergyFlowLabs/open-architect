package androidx.compose.foundation.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,584:1\n1282#2,6:585\n1282#2,6:591\n1282#2,6:597\n1282#2,6:603\n1282#2,6:609\n1282#2,6:615\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n*L\n81#1:585,6\n83#1:591,6\n156#1:597,6\n158#1:603,6\n386#1:609,6\n426#1:615,6\n*E\n"})
public final class b1 {

    static final class a implements pj.o<Integer, z2, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<w0, Integer, androidx.compose.runtime.c0, Integer, Unit> f15925a;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.o<? super w0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
            this.f15925a = oVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(int i10, z2 z2Var, androidx.compose.runtime.c0 c0Var, int i11) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(620176540, i11, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:173)");
            }
            this.f15925a.invoke(new x0(z2Var.a(), z2Var.d(), z2Var.b(), z2Var.c(), null), Integer.valueOf(i10), c0Var, Integer.valueOf((i11 << 3) & com.planner5d.library.engine.input.f.b.B));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, z2 z2Var, androidx.compose.runtime.c0 c0Var, Integer num2) {
            c(num.intValue(), z2Var, c0Var, num2.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements pj.o<Integer, z2, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<i1, Integer, androidx.compose.runtime.c0, Integer, Unit> f15926a;

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.o<? super i1, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
            this.f15926a = oVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(int i10, z2 z2Var, androidx.compose.runtime.c0 c0Var, int i11) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1677845586, i11, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:98)");
            }
            this.f15926a.invoke(new j1(z2Var.a(), z2Var.d(), z2Var.c(), z2Var.b(), null), Integer.valueOf(i10), c0Var, Integer.valueOf((i11 << 3) & com.planner5d.library.engine.input.f.b.B));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, z2 z2Var, androidx.compose.runtime.c0 c0Var, Integer num2) {
            c(num.intValue(), z2Var, c0Var, num2.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x013b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x0157  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x016a  */
    /* JADX WARN: Code duplicated, block: B:116:0x016c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0176  */
    /* JADX WARN: Code duplicated, block: B:122:0x017b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0182  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019b  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:147:0x021b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0229  */
    /* JADX WARN: Code duplicated, block: B:153:0x023e  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    @kotlin.l(message = "ContextualFlowLayouts are no longer maintained")
    @androidx.compose.runtime.o
    @u1
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(final int i10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable q.m mVar, @Nullable q.e eVar, @Nullable androidx.compose.ui.e.b bVar, int i11, int i12, @Nullable t0 t0Var, @NotNull final pj.o<? super w0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.a0 a0Var2;
        int i16;
        q.m mVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.ui.e.b bVarU;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z10;
        final q.e eVar2;
        final int i29;
        final t0 t0Var2;
        final q.m mVar3;
        final int i30;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.e.b bVar2;
        androidx.compose.runtime.s5 s5VarT;
        q.m mVarY;
        int i31;
        q.e eVarW;
        int i32;
        int i33;
        t0 t0VarI;
        int i34;
        boolean z11;
        Object objI0;
        y2 y2Var;
        boolean z12;
        Object objI1;
        Object obj;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1986851536);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c0VarR.K(i10) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i35 = i14 & 2;
        if (i35 == 0) {
            if ((i13 & 48) == 0) {
                a0Var2 = a0Var;
                i15 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & androidx.media3.exoplayer.a5.S0) == 0) {
                    mVar2 = mVar;
                    if (c0VarR.D(mVar2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c0VarR.D(eVar)) {
                            i19 = 2048;
                        } else {
                            i19 = 1024;
                        }
                        i15 |= i19;
                    }
                    i20 = i14 & 16;
                    if (i20 != 0) {
                        if ((i13 & 24576) == 0) {
                            bVarU = bVar;
                            if (c0VarR.D(bVarU)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i15 |= i21;
                        }
                        i22 = i14 & 32;
                        if (i22 != 0) {
                            i15 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.K(i11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i15 |= i23;
                        }
                        i24 = i14 & 64;
                        if (i24 != 0) {
                            i15 |= 1572864;
                        } else if ((i13 & 1572864) == 0) {
                            if (c0VarR.K(i12)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 128;
                        if (i26 != 0) {
                            i15 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            if (c0VarR.D(t0Var)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i15 |= i27;
                        }
                        if ((i14 & 256) != 0) {
                            i15 |= 100663296;
                        } else if ((i13 & 100663296) == 0) {
                            if (c0VarR.k0(oVar)) {
                                i28 = 67108864;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i15 |= i28;
                        }
                        if ((38347923 & i15) != 38347922) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i15 & 1)) {
                            if (i35 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                mVarY = q.f16330a.y();
                            } else {
                                mVarY = mVar2;
                            }
                            if (i18 != 0) {
                                eVarW = q.f16330a.w();
                                i31 = i20;
                            } else {
                                i31 = i20;
                                eVarW = eVar;
                            }
                            if (i31 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            }
                            if (i22 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i11;
                            }
                            if (i24 != 0) {
                                i33 = Integer.MAX_VALUE;
                            } else {
                                i33 = i12;
                            }
                            if (i26 != 0) {
                                t0VarI = t0.f16415g.i();
                            } else {
                                t0VarI = t0Var;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                            }
                            i34 = 29360128 & i15;
                            if (i34 == 8388608) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = t0VarI.b();
                                c0VarR.Y(objI0);
                            }
                            y2Var = (y2) objI0;
                            if (i34 == 8388608) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                obj = objI1;
                                ArrayList arrayList = new ArrayList();
                                t0VarI.a(y2Var, arrayList);
                                c0VarR.Y(arrayList);
                                obj = arrayList;
                            }
                            obj = objI1;
                            int i36 = i15 >> 6;
                            androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i36 & 57344) | (i36 & 14) | 100663296 | (i36 & com.planner5d.library.engine.input.f.b.B) | (i36 & 896) | (i36 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            t0Var2 = t0VarI;
                            mVar3 = mVarY;
                            eVar2 = eVarW;
                            i29 = i32;
                            i30 = i33;
                        } else {
                            c0VarR.u();
                            eVar2 = eVar;
                            i29 = i11;
                            t0Var2 = t0Var;
                            mVar3 = mVar2;
                            i30 = i12;
                        }
                        a0Var3 = a0Var2;
                        bVar2 = bVarU;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 24576;
                    bVarU = bVar;
                    i22 = i14 & 32;
                    if (i22 != 0) {
                        i15 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i15 |= i23;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c0VarR.K(i12)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c0VarR.D(t0Var)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i14 & 256) != 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c0VarR.k0(oVar)) {
                            i28 = 67108864;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i15 |= i28;
                    }
                    if ((38347923 & i15) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i15 & 1)) {
                        if (i35 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar2;
                        }
                        if (i18 != 0) {
                            eVarW = q.f16330a.w();
                            i31 = i20;
                        } else {
                            i31 = i20;
                            eVarW = eVar;
                        }
                        if (i31 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        }
                        if (i22 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i11;
                        }
                        if (i24 != 0) {
                            i33 = Integer.MAX_VALUE;
                        } else {
                            i33 = i12;
                        }
                        if (i26 != 0) {
                            t0VarI = t0.f16415g.i();
                        } else {
                            t0VarI = t0Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                        }
                        i34 = 29360128 & i15;
                        if (i34 == 8388608) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = t0VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = t0VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        if (i34 == 8388608) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            obj = objI1;
                            ArrayList arrayList2 = new ArrayList();
                            t0VarI.a(y2Var, arrayList2);
                            c0VarR.Y(arrayList2);
                            obj = arrayList2;
                        } else {
                            obj = objI1;
                            ArrayList arrayList3 = new ArrayList();
                            t0VarI.a(y2Var, arrayList3);
                            c0VarR.Y(arrayList3);
                            obj = arrayList3;
                        }
                        obj = objI1;
                        int i37 = i15 >> 6;
                        androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i37 & 57344) | (i37 & 14) | 100663296 | (i37 & com.planner5d.library.engine.input.f.b.B) | (i37 & 896) | (i37 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        t0Var2 = t0VarI;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        i29 = i32;
                        i30 = i33;
                    } else {
                        c0VarR.u();
                        eVar2 = eVar;
                        i29 = i11;
                        t0Var2 = t0Var;
                        mVar3 = mVar2;
                        i30 = i12;
                    }
                    a0Var3 = a0Var2;
                    bVar2 = bVarU;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i15 |= 3072;
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((i13 & 24576) == 0) {
                        bVarU = bVar;
                        if (c0VarR.D(bVarU)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i15 |= i21;
                    }
                    i22 = i14 & 32;
                    if (i22 != 0) {
                        i15 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i15 |= i23;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c0VarR.K(i12)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c0VarR.D(t0Var)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i14 & 256) != 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c0VarR.k0(oVar)) {
                            i28 = 67108864;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i15 |= i28;
                    }
                    if ((38347923 & i15) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i15 & 1)) {
                        if (i35 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar2;
                        }
                        if (i18 != 0) {
                            eVarW = q.f16330a.w();
                            i31 = i20;
                        } else {
                            i31 = i20;
                            eVarW = eVar;
                        }
                        if (i31 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        }
                        if (i22 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i11;
                        }
                        if (i24 != 0) {
                            i33 = Integer.MAX_VALUE;
                        } else {
                            i33 = i12;
                        }
                        if (i26 != 0) {
                            t0VarI = t0.f16415g.i();
                        } else {
                            t0VarI = t0Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                        }
                        i34 = 29360128 & i15;
                        if (i34 == 8388608) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = t0VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = t0VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        if (i34 == 8388608) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            obj = objI1;
                            ArrayList arrayList4 = new ArrayList();
                            t0VarI.a(y2Var, arrayList4);
                            c0VarR.Y(arrayList4);
                            obj = arrayList4;
                        } else {
                            obj = objI1;
                            ArrayList arrayList5 = new ArrayList();
                            t0VarI.a(y2Var, arrayList5);
                            c0VarR.Y(arrayList5);
                            obj = arrayList5;
                        }
                        obj = objI1;
                        int i38 = i15 >> 6;
                        androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i38 & 57344) | (i38 & 14) | 100663296 | (i38 & com.planner5d.library.engine.input.f.b.B) | (i38 & 896) | (i38 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        t0Var2 = t0VarI;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        i29 = i32;
                        i30 = i33;
                    } else {
                        c0VarR.u();
                        eVar2 = eVar;
                        i29 = i11;
                        t0Var2 = t0Var;
                        mVar3 = mVar2;
                        i30 = i12;
                    }
                    a0Var3 = a0Var2;
                    bVar2 = bVarU;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i15 |= 24576;
                bVarU = bVar;
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(t0Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i18 != 0) {
                        eVarW = q.f16330a.w();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        eVarW = eVar;
                    }
                    if (i31 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        t0VarI = t0.f16415g.i();
                    } else {
                        t0VarI = t0Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList6 = new ArrayList();
                        t0VarI.a(y2Var, arrayList6);
                        c0VarR.Y(arrayList6);
                        obj = arrayList6;
                    } else {
                        obj = objI1;
                        ArrayList arrayList7 = new ArrayList();
                        t0VarI.a(y2Var, arrayList7);
                        c0VarR.Y(arrayList7);
                        obj = arrayList7;
                    }
                    obj = objI1;
                    int i39 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i39 & 57344) | (i39 & 14) | 100663296 | (i39 & com.planner5d.library.engine.input.f.b.B) | (i39 & 896) | (i39 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    t0Var2 = t0VarI;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    eVar2 = eVar;
                    i29 = i11;
                    t0Var2 = t0Var;
                    mVar3 = mVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                bVar2 = bVarU;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= androidx.media3.exoplayer.a5.S0;
            mVar2 = mVar;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c0VarR.D(eVar)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((i13 & 24576) == 0) {
                        bVarU = bVar;
                        if (c0VarR.D(bVarU)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i15 |= i21;
                    }
                    i22 = i14 & 32;
                    if (i22 != 0) {
                        i15 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i15 |= i23;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c0VarR.K(i12)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c0VarR.D(t0Var)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i14 & 256) != 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c0VarR.k0(oVar)) {
                            i28 = 67108864;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i15 |= i28;
                    }
                    if ((38347923 & i15) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i15 & 1)) {
                        if (i35 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar2;
                        }
                        if (i18 != 0) {
                            eVarW = q.f16330a.w();
                            i31 = i20;
                        } else {
                            i31 = i20;
                            eVarW = eVar;
                        }
                        if (i31 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        }
                        if (i22 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i11;
                        }
                        if (i24 != 0) {
                            i33 = Integer.MAX_VALUE;
                        } else {
                            i33 = i12;
                        }
                        if (i26 != 0) {
                            t0VarI = t0.f16415g.i();
                        } else {
                            t0VarI = t0Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                        }
                        i34 = 29360128 & i15;
                        if (i34 == 8388608) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = t0VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = t0VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        if (i34 == 8388608) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            obj = objI1;
                            ArrayList arrayList8 = new ArrayList();
                            t0VarI.a(y2Var, arrayList8);
                            c0VarR.Y(arrayList8);
                            obj = arrayList8;
                        } else {
                            obj = objI1;
                            ArrayList arrayList9 = new ArrayList();
                            t0VarI.a(y2Var, arrayList9);
                            c0VarR.Y(arrayList9);
                            obj = arrayList9;
                        }
                        obj = objI1;
                        int i310 = i15 >> 6;
                        androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i310 & 57344) | (i310 & 14) | 100663296 | (i310 & com.planner5d.library.engine.input.f.b.B) | (i310 & 896) | (i310 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        t0Var2 = t0VarI;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        i29 = i32;
                        i30 = i33;
                    } else {
                        c0VarR.u();
                        eVar2 = eVar;
                        i29 = i11;
                        t0Var2 = t0Var;
                        mVar3 = mVar2;
                        i30 = i12;
                    }
                    a0Var3 = a0Var2;
                    bVar2 = bVarU;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i15 |= 24576;
                bVarU = bVar;
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(t0Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i18 != 0) {
                        eVarW = q.f16330a.w();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        eVarW = eVar;
                    }
                    if (i31 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        t0VarI = t0.f16415g.i();
                    } else {
                        t0VarI = t0Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList10 = new ArrayList();
                        t0VarI.a(y2Var, arrayList10);
                        c0VarR.Y(arrayList10);
                        obj = arrayList10;
                    } else {
                        obj = objI1;
                        ArrayList arrayList11 = new ArrayList();
                        t0VarI.a(y2Var, arrayList11);
                        c0VarR.Y(arrayList11);
                        obj = arrayList11;
                    }
                    obj = objI1;
                    int i311 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i311 & 57344) | (i311 & 14) | 100663296 | (i311 & com.planner5d.library.engine.input.f.b.B) | (i311 & 896) | (i311 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    t0Var2 = t0VarI;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    eVar2 = eVar;
                    i29 = i11;
                    t0Var2 = t0Var;
                    mVar3 = mVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                bVar2 = bVarU;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((i13 & 24576) == 0) {
                    bVarU = bVar;
                    if (c0VarR.D(bVarU)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i15 |= i21;
                }
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(t0Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i18 != 0) {
                        eVarW = q.f16330a.w();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        eVarW = eVar;
                    }
                    if (i31 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        t0VarI = t0.f16415g.i();
                    } else {
                        t0VarI = t0Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList12 = new ArrayList();
                        t0VarI.a(y2Var, arrayList12);
                        c0VarR.Y(arrayList12);
                        obj = arrayList12;
                    } else {
                        obj = objI1;
                        ArrayList arrayList13 = new ArrayList();
                        t0VarI.a(y2Var, arrayList13);
                        c0VarR.Y(arrayList13);
                        obj = arrayList13;
                    }
                    obj = objI1;
                    int i312 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i312 & 57344) | (i312 & 14) | 100663296 | (i312 & com.planner5d.library.engine.input.f.b.B) | (i312 & 896) | (i312 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    t0Var2 = t0VarI;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    eVar2 = eVar;
                    i29 = i11;
                    t0Var2 = t0Var;
                    mVar3 = mVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                bVar2 = bVarU;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            bVarU = bVar;
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c0VarR.K(i12)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c0VarR.D(t0Var)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0VarR.k0(oVar)) {
                    i28 = 67108864;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i28;
            }
            if ((38347923 & i15) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i15 & 1)) {
                if (i35 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar2;
                }
                if (i18 != 0) {
                    eVarW = q.f16330a.w();
                    i31 = i20;
                } else {
                    i31 = i20;
                    eVarW = eVar;
                }
                if (i31 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                }
                if (i22 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i11;
                }
                if (i24 != 0) {
                    i33 = Integer.MAX_VALUE;
                } else {
                    i33 = i12;
                }
                if (i26 != 0) {
                    t0VarI = t0.f16415g.i();
                } else {
                    t0VarI = t0Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                }
                i34 = 29360128 & i15;
                if (i34 == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = t0VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = t0VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                if (i34 == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    obj = objI1;
                    ArrayList arrayList14 = new ArrayList();
                    t0VarI.a(y2Var, arrayList14);
                    c0VarR.Y(arrayList14);
                    obj = arrayList14;
                } else {
                    obj = objI1;
                    ArrayList arrayList15 = new ArrayList();
                    t0VarI.a(y2Var, arrayList15);
                    c0VarR.Y(arrayList15);
                    obj = arrayList15;
                }
                obj = objI1;
                int i313 = i15 >> 6;
                androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i313 & 57344) | (i313 & 14) | 100663296 | (i313 & com.planner5d.library.engine.input.f.b.B) | (i313 & 896) | (i313 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                t0Var2 = t0VarI;
                mVar3 = mVarY;
                eVar2 = eVarW;
                i29 = i32;
                i30 = i33;
            } else {
                c0VarR.u();
                eVar2 = eVar;
                i29 = i11;
                t0Var2 = t0Var;
                mVar3 = mVar2;
                i30 = i12;
            }
            a0Var3 = a0Var2;
            bVar2 = bVarU;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        a0Var2 = a0Var;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & androidx.media3.exoplayer.a5.S0) == 0) {
                mVar2 = mVar;
                if (c0VarR.D(mVar2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c0VarR.D(eVar)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((i13 & 24576) == 0) {
                        bVarU = bVar;
                        if (c0VarR.D(bVarU)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i15 |= i21;
                    }
                    i22 = i14 & 32;
                    if (i22 != 0) {
                        i15 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i15 |= i23;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c0VarR.K(i12)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c0VarR.D(t0Var)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i14 & 256) != 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c0VarR.k0(oVar)) {
                            i28 = 67108864;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i15 |= i28;
                    }
                    if ((38347923 & i15) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i15 & 1)) {
                        if (i35 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar2;
                        }
                        if (i18 != 0) {
                            eVarW = q.f16330a.w();
                            i31 = i20;
                        } else {
                            i31 = i20;
                            eVarW = eVar;
                        }
                        if (i31 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        }
                        if (i22 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i11;
                        }
                        if (i24 != 0) {
                            i33 = Integer.MAX_VALUE;
                        } else {
                            i33 = i12;
                        }
                        if (i26 != 0) {
                            t0VarI = t0.f16415g.i();
                        } else {
                            t0VarI = t0Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                        }
                        i34 = 29360128 & i15;
                        if (i34 == 8388608) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = t0VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = t0VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        if (i34 == 8388608) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            obj = objI1;
                            ArrayList arrayList16 = new ArrayList();
                            t0VarI.a(y2Var, arrayList16);
                            c0VarR.Y(arrayList16);
                            obj = arrayList16;
                        } else {
                            obj = objI1;
                            ArrayList arrayList17 = new ArrayList();
                            t0VarI.a(y2Var, arrayList17);
                            c0VarR.Y(arrayList17);
                            obj = arrayList17;
                        }
                        obj = objI1;
                        int i314 = i15 >> 6;
                        androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i314 & 57344) | (i314 & 14) | 100663296 | (i314 & com.planner5d.library.engine.input.f.b.B) | (i314 & 896) | (i314 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        t0Var2 = t0VarI;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        i29 = i32;
                        i30 = i33;
                    } else {
                        c0VarR.u();
                        eVar2 = eVar;
                        i29 = i11;
                        t0Var2 = t0Var;
                        mVar3 = mVar2;
                        i30 = i12;
                    }
                    a0Var3 = a0Var2;
                    bVar2 = bVarU;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i15 |= 24576;
                bVarU = bVar;
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(t0Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i18 != 0) {
                        eVarW = q.f16330a.w();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        eVarW = eVar;
                    }
                    if (i31 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        t0VarI = t0.f16415g.i();
                    } else {
                        t0VarI = t0Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList18 = new ArrayList();
                        t0VarI.a(y2Var, arrayList18);
                        c0VarR.Y(arrayList18);
                        obj = arrayList18;
                    } else {
                        obj = objI1;
                        ArrayList arrayList19 = new ArrayList();
                        t0VarI.a(y2Var, arrayList19);
                        c0VarR.Y(arrayList19);
                        obj = arrayList19;
                    }
                    obj = objI1;
                    int i315 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i315 & 57344) | (i315 & 14) | 100663296 | (i315 & com.planner5d.library.engine.input.f.b.B) | (i315 & 896) | (i315 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    t0Var2 = t0VarI;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    eVar2 = eVar;
                    i29 = i11;
                    t0Var2 = t0Var;
                    mVar3 = mVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                bVar2 = bVarU;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((i13 & 24576) == 0) {
                    bVarU = bVar;
                    if (c0VarR.D(bVarU)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i15 |= i21;
                }
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(t0Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i18 != 0) {
                        eVarW = q.f16330a.w();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        eVarW = eVar;
                    }
                    if (i31 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        t0VarI = t0.f16415g.i();
                    } else {
                        t0VarI = t0Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList110 = new ArrayList();
                        t0VarI.a(y2Var, arrayList110);
                        c0VarR.Y(arrayList110);
                        obj = arrayList110;
                    } else {
                        obj = objI1;
                        ArrayList arrayList111 = new ArrayList();
                        t0VarI.a(y2Var, arrayList111);
                        c0VarR.Y(arrayList111);
                        obj = arrayList111;
                    }
                    obj = objI1;
                    int i316 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i316 & 57344) | (i316 & 14) | 100663296 | (i316 & com.planner5d.library.engine.input.f.b.B) | (i316 & 896) | (i316 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    t0Var2 = t0VarI;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    eVar2 = eVar;
                    i29 = i11;
                    t0Var2 = t0Var;
                    mVar3 = mVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                bVar2 = bVarU;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            bVarU = bVar;
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c0VarR.K(i12)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c0VarR.D(t0Var)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0VarR.k0(oVar)) {
                    i28 = 67108864;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i28;
            }
            if ((38347923 & i15) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i15 & 1)) {
                if (i35 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar2;
                }
                if (i18 != 0) {
                    eVarW = q.f16330a.w();
                    i31 = i20;
                } else {
                    i31 = i20;
                    eVarW = eVar;
                }
                if (i31 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                }
                if (i22 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i11;
                }
                if (i24 != 0) {
                    i33 = Integer.MAX_VALUE;
                } else {
                    i33 = i12;
                }
                if (i26 != 0) {
                    t0VarI = t0.f16415g.i();
                } else {
                    t0VarI = t0Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                }
                i34 = 29360128 & i15;
                if (i34 == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = t0VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = t0VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                if (i34 == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    obj = objI1;
                    ArrayList arrayList112 = new ArrayList();
                    t0VarI.a(y2Var, arrayList112);
                    c0VarR.Y(arrayList112);
                    obj = arrayList112;
                } else {
                    obj = objI1;
                    ArrayList arrayList113 = new ArrayList();
                    t0VarI.a(y2Var, arrayList113);
                    c0VarR.Y(arrayList113);
                    obj = arrayList113;
                }
                obj = objI1;
                int i317 = i15 >> 6;
                androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i317 & 57344) | (i317 & 14) | 100663296 | (i317 & com.planner5d.library.engine.input.f.b.B) | (i317 & 896) | (i317 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                t0Var2 = t0VarI;
                mVar3 = mVarY;
                eVar2 = eVarW;
                i29 = i32;
                i30 = i33;
            } else {
                c0VarR.u();
                eVar2 = eVar;
                i29 = i11;
                t0Var2 = t0Var;
                mVar3 = mVar2;
                i30 = i12;
            }
            a0Var3 = a0Var2;
            bVar2 = bVarU;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= androidx.media3.exoplayer.a5.S0;
        mVar2 = mVar;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                if (c0VarR.D(eVar)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((i13 & 24576) == 0) {
                    bVarU = bVar;
                    if (c0VarR.D(bVarU)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i15 |= i21;
                }
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(t0Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i18 != 0) {
                        eVarW = q.f16330a.w();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        eVarW = eVar;
                    }
                    if (i31 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        t0VarI = t0.f16415g.i();
                    } else {
                        t0VarI = t0Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = t0VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList114 = new ArrayList();
                        t0VarI.a(y2Var, arrayList114);
                        c0VarR.Y(arrayList114);
                        obj = arrayList114;
                    } else {
                        obj = objI1;
                        ArrayList arrayList115 = new ArrayList();
                        t0VarI.a(y2Var, arrayList115);
                        c0VarR.Y(arrayList115);
                        obj = arrayList115;
                    }
                    obj = objI1;
                    int i318 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i318 & 57344) | (i318 & 14) | 100663296 | (i318 & com.planner5d.library.engine.input.f.b.B) | (i318 & 896) | (i318 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    t0Var2 = t0VarI;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    eVar2 = eVar;
                    i29 = i11;
                    t0Var2 = t0Var;
                    mVar3 = mVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                bVar2 = bVarU;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            bVarU = bVar;
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c0VarR.K(i12)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c0VarR.D(t0Var)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0VarR.k0(oVar)) {
                    i28 = 67108864;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i28;
            }
            if ((38347923 & i15) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i15 & 1)) {
                if (i35 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar2;
                }
                if (i18 != 0) {
                    eVarW = q.f16330a.w();
                    i31 = i20;
                } else {
                    i31 = i20;
                    eVarW = eVar;
                }
                if (i31 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                }
                if (i22 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i11;
                }
                if (i24 != 0) {
                    i33 = Integer.MAX_VALUE;
                } else {
                    i33 = i12;
                }
                if (i26 != 0) {
                    t0VarI = t0.f16415g.i();
                } else {
                    t0VarI = t0Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                }
                i34 = 29360128 & i15;
                if (i34 == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = t0VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = t0VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                if (i34 == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    obj = objI1;
                    ArrayList arrayList116 = new ArrayList();
                    t0VarI.a(y2Var, arrayList116);
                    c0VarR.Y(arrayList116);
                    obj = arrayList116;
                } else {
                    obj = objI1;
                    ArrayList arrayList117 = new ArrayList();
                    t0VarI.a(y2Var, arrayList117);
                    c0VarR.Y(arrayList117);
                    obj = arrayList117;
                }
                obj = objI1;
                int i319 = i15 >> 6;
                androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i319 & 57344) | (i319 & 14) | 100663296 | (i319 & com.planner5d.library.engine.input.f.b.B) | (i319 & 896) | (i319 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                t0Var2 = t0VarI;
                mVar3 = mVarY;
                eVar2 = eVarW;
                i29 = i32;
                i30 = i33;
            } else {
                c0VarR.u();
                eVar2 = eVar;
                i29 = i11;
                t0Var2 = t0Var;
                mVar3 = mVar2;
                i30 = i12;
            }
            a0Var3 = a0Var2;
            bVar2 = bVarU;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        i20 = i14 & 16;
        if (i20 != 0) {
            if ((i13 & 24576) == 0) {
                bVarU = bVar;
                if (c0VarR.D(bVarU)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i15 |= i21;
            }
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c0VarR.K(i12)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c0VarR.D(t0Var)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0VarR.k0(oVar)) {
                    i28 = 67108864;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i28;
            }
            if ((38347923 & i15) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i15 & 1)) {
                if (i35 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar2;
                }
                if (i18 != 0) {
                    eVarW = q.f16330a.w();
                    i31 = i20;
                } else {
                    i31 = i20;
                    eVarW = eVar;
                }
                if (i31 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                }
                if (i22 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i11;
                }
                if (i24 != 0) {
                    i33 = Integer.MAX_VALUE;
                } else {
                    i33 = i12;
                }
                if (i26 != 0) {
                    t0VarI = t0.f16415g.i();
                } else {
                    t0VarI = t0Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                }
                i34 = 29360128 & i15;
                if (i34 == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = t0VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = t0VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                if (i34 == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    obj = objI1;
                    ArrayList arrayList118 = new ArrayList();
                    t0VarI.a(y2Var, arrayList118);
                    c0VarR.Y(arrayList118);
                    obj = arrayList118;
                } else {
                    obj = objI1;
                    ArrayList arrayList119 = new ArrayList();
                    t0VarI.a(y2Var, arrayList119);
                    c0VarR.Y(arrayList119);
                    obj = arrayList119;
                }
                obj = objI1;
                int i3110 = i15 >> 6;
                androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i3110 & 57344) | (i3110 & 14) | 100663296 | (i3110 & com.planner5d.library.engine.input.f.b.B) | (i3110 & 896) | (i3110 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                t0Var2 = t0VarI;
                mVar3 = mVarY;
                eVar2 = eVarW;
                i29 = i32;
                i30 = i33;
            } else {
                c0VarR.u();
                eVar2 = eVar;
                i29 = i11;
                t0Var2 = t0Var;
                mVar3 = mVar2;
                i30 = i12;
            }
            a0Var3 = a0Var2;
            bVar2 = bVarU;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        bVarU = bVar;
        i22 = i14 & 32;
        if (i22 != 0) {
            i15 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.K(i11)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i15 |= i23;
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c0VarR.K(i12)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c0VarR.D(t0Var)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        if ((i14 & 256) != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c0VarR.k0(oVar)) {
                i28 = 67108864;
            } else {
                i28 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i15 |= i28;
        }
        if ((38347923 & i15) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i15 & 1)) {
            if (i35 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i16 != 0) {
                mVarY = q.f16330a.y();
            } else {
                mVarY = mVar2;
            }
            if (i18 != 0) {
                eVarW = q.f16330a.w();
                i31 = i20;
            } else {
                i31 = i20;
                eVarW = eVar;
            }
            if (i31 != 0) {
                bVarU = androidx.compose.ui.e.f37317a.u();
            }
            if (i22 != 0) {
                i32 = Integer.MAX_VALUE;
            } else {
                i32 = i11;
            }
            if (i24 != 0) {
                i33 = Integer.MAX_VALUE;
            } else {
                i33 = i12;
            }
            if (i26 != 0) {
                t0VarI = t0.f16415g.i();
            } else {
                t0VarI = t0Var;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1986851536, i15, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
            }
            i34 = 29360128 & i15;
            if (i34 == 8388608) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = t0VarI.b();
                c0VarR.Y(objI0);
            } else {
                objI0 = t0VarI.b();
                c0VarR.Y(objI0);
            }
            y2Var = (y2) objI0;
            if (i34 == 8388608) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI1 = c0VarR.i0();
            if (z12) {
                obj = objI1;
                ArrayList arrayList1110 = new ArrayList();
                t0VarI.a(y2Var, arrayList1110);
                c0VarR.Y(arrayList1110);
                obj = arrayList1110;
            } else {
                obj = objI1;
                ArrayList arrayList1111 = new ArrayList();
                t0VarI.a(y2Var, arrayList1111);
                c0VarR.Y(arrayList1111);
                obj = arrayList1111;
            }
            obj = objI1;
            int i3111 = i15 >> 6;
            androidx.compose.ui.layout.z2.a(a0Var2, g(mVarY, eVarW, bVarU, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(620176540, true, new a(oVar), c0VarR, 54), c0VarR, (i3111 & 57344) | (i3111 & 14) | 100663296 | (i3111 & com.planner5d.library.engine.input.f.b.B) | (i3111 & 896) | (i3111 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            t0Var2 = t0VarI;
            mVar3 = mVarY;
            eVar2 = eVarW;
            i29 = i32;
            i30 = i33;
        } else {
            c0VarR.u();
            eVar2 = eVar;
            i29 = i11;
            t0Var2 = t0Var;
            mVar3 = mVar2;
            i30 = i12;
        }
        a0Var3 = a0Var2;
        bVar2 = bVarU;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.a1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return b1.d(i10, a0Var3, mVar3, eVar2, bVar2, i29, i30, t0Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(int i10, androidx.compose.ui.a0 a0Var, q.m mVar, q.e eVar, androidx.compose.ui.e.b bVar, int i11, int i12, t0 t0Var, pj.o oVar, int i13, int i14, androidx.compose.runtime.c0 c0Var, int i15) {
        c(i10, a0Var, mVar, eVar, bVar, i11, i12, t0Var, oVar, c0Var, androidx.compose.runtime.t4.a(i13 | 1), i14);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x013b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0143  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:116:0x0167  */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0171  */
    /* JADX WARN: Code duplicated, block: B:122:0x0176  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0185  */
    /* JADX WARN: Code duplicated, block: B:129:0x0194  */
    /* JADX WARN: Code duplicated, block: B:130:0x0196  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:147:0x0219  */
    /* JADX WARN: Code duplicated, block: B:150:0x0226  */
    /* JADX WARN: Code duplicated, block: B:153:0x023b  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    @kotlin.l(message = "ContextualFlowLayouts are no longer maintained")
    @androidx.compose.runtime.o
    @u1
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(final int i10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable q.e eVar, @Nullable q.m mVar, @Nullable androidx.compose.ui.e.c cVar, int i11, int i12, @Nullable f1 f1Var, @NotNull final pj.o<? super i1, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.a0 a0Var2;
        int i16;
        q.e eVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.ui.e.c cVarW;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z10;
        final q.m mVar2;
        final int i29;
        final f1 f1Var2;
        final q.e eVar3;
        final int i30;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.e.c cVar2;
        androidx.compose.runtime.s5 s5VarT;
        q.e eVarW;
        int i31;
        q.m mVarY;
        int i32;
        int i33;
        f1 f1VarI;
        int i34;
        boolean z11;
        Object objI0;
        y2 y2Var;
        boolean z12;
        Object objI1;
        Object obj;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-294153140);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c0VarR.K(i10) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i35 = i14 & 2;
        if (i35 == 0) {
            if ((i13 & 48) == 0) {
                a0Var2 = a0Var;
                i15 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & androidx.media3.exoplayer.a5.S0) == 0) {
                    eVar2 = eVar;
                    if (c0VarR.D(eVar2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c0VarR.D(mVar)) {
                            i19 = 2048;
                        } else {
                            i19 = 1024;
                        }
                        i15 |= i19;
                    }
                    i20 = i14 & 16;
                    if (i20 != 0) {
                        if ((i13 & 24576) == 0) {
                            cVarW = cVar;
                            if (c0VarR.D(cVarW)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i15 |= i21;
                        }
                        i22 = i14 & 32;
                        if (i22 != 0) {
                            i15 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.K(i11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i15 |= i23;
                        }
                        i24 = i14 & 64;
                        if (i24 != 0) {
                            i15 |= 1572864;
                        } else if ((i13 & 1572864) == 0) {
                            if (c0VarR.K(i12)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 128;
                        if (i26 != 0) {
                            i15 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            if (c0VarR.D(f1Var)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i15 |= i27;
                        }
                        if ((i14 & 256) != 0) {
                            i15 |= 100663296;
                        } else if ((i13 & 100663296) == 0) {
                            if (c0VarR.k0(oVar)) {
                                i28 = 67108864;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i15 |= i28;
                        }
                        if ((38347923 & i15) != 38347922) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i15 & 1)) {
                            if (i35 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                eVarW = q.f16330a.w();
                            } else {
                                eVarW = eVar2;
                            }
                            if (i18 != 0) {
                                mVarY = q.f16330a.y();
                                i31 = i20;
                            } else {
                                i31 = i20;
                                mVarY = mVar;
                            }
                            if (i31 != 0) {
                                cVarW = androidx.compose.ui.e.f37317a.w();
                            }
                            if (i22 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i11;
                            }
                            if (i24 != 0) {
                                i33 = Integer.MAX_VALUE;
                            } else {
                                i33 = i12;
                            }
                            if (i26 != 0) {
                                f1VarI = f1.f16001g.i();
                            } else {
                                f1VarI = f1Var;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                            }
                            i34 = 29360128 & i15;
                            if (i34 == 8388608) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = f1VarI.b();
                                c0VarR.Y(objI0);
                            }
                            y2Var = (y2) objI0;
                            if (i34 == 8388608) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                obj = objI1;
                                ArrayList arrayList = new ArrayList();
                                f1VarI.a(y2Var, arrayList);
                                c0VarR.Y(arrayList);
                                obj = arrayList;
                            }
                            obj = objI1;
                            int i36 = i15 >> 6;
                            androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i36 & 57344) | (i36 & 14) | 100663296 | (i36 & com.planner5d.library.engine.input.f.b.B) | (i36 & 896) | (i36 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            f1Var2 = f1VarI;
                            eVar3 = eVarW;
                            mVar2 = mVarY;
                            i29 = i32;
                            i30 = i33;
                        } else {
                            c0VarR.u();
                            mVar2 = mVar;
                            i29 = i11;
                            f1Var2 = f1Var;
                            eVar3 = eVar2;
                            i30 = i12;
                        }
                        a0Var3 = a0Var2;
                        cVar2 = cVarW;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 24576;
                    cVarW = cVar;
                    i22 = i14 & 32;
                    if (i22 != 0) {
                        i15 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i15 |= i23;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c0VarR.K(i12)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c0VarR.D(f1Var)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i14 & 256) != 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c0VarR.k0(oVar)) {
                            i28 = 67108864;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i15 |= i28;
                    }
                    if ((38347923 & i15) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i15 & 1)) {
                        if (i35 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar2;
                        }
                        if (i18 != 0) {
                            mVarY = q.f16330a.y();
                            i31 = i20;
                        } else {
                            i31 = i20;
                            mVarY = mVar;
                        }
                        if (i31 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                        }
                        if (i22 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i11;
                        }
                        if (i24 != 0) {
                            i33 = Integer.MAX_VALUE;
                        } else {
                            i33 = i12;
                        }
                        if (i26 != 0) {
                            f1VarI = f1.f16001g.i();
                        } else {
                            f1VarI = f1Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                        }
                        i34 = 29360128 & i15;
                        if (i34 == 8388608) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = f1VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = f1VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        if (i34 == 8388608) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            obj = objI1;
                            ArrayList arrayList2 = new ArrayList();
                            f1VarI.a(y2Var, arrayList2);
                            c0VarR.Y(arrayList2);
                            obj = arrayList2;
                        } else {
                            obj = objI1;
                            ArrayList arrayList3 = new ArrayList();
                            f1VarI.a(y2Var, arrayList3);
                            c0VarR.Y(arrayList3);
                            obj = arrayList3;
                        }
                        obj = objI1;
                        int i37 = i15 >> 6;
                        androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i37 & 57344) | (i37 & 14) | 100663296 | (i37 & com.planner5d.library.engine.input.f.b.B) | (i37 & 896) | (i37 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f1Var2 = f1VarI;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        i29 = i32;
                        i30 = i33;
                    } else {
                        c0VarR.u();
                        mVar2 = mVar;
                        i29 = i11;
                        f1Var2 = f1Var;
                        eVar3 = eVar2;
                        i30 = i12;
                    }
                    a0Var3 = a0Var2;
                    cVar2 = cVarW;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i15 |= 3072;
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((i13 & 24576) == 0) {
                        cVarW = cVar;
                        if (c0VarR.D(cVarW)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i15 |= i21;
                    }
                    i22 = i14 & 32;
                    if (i22 != 0) {
                        i15 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i15 |= i23;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c0VarR.K(i12)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c0VarR.D(f1Var)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i14 & 256) != 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c0VarR.k0(oVar)) {
                            i28 = 67108864;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i15 |= i28;
                    }
                    if ((38347923 & i15) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i15 & 1)) {
                        if (i35 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar2;
                        }
                        if (i18 != 0) {
                            mVarY = q.f16330a.y();
                            i31 = i20;
                        } else {
                            i31 = i20;
                            mVarY = mVar;
                        }
                        if (i31 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                        }
                        if (i22 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i11;
                        }
                        if (i24 != 0) {
                            i33 = Integer.MAX_VALUE;
                        } else {
                            i33 = i12;
                        }
                        if (i26 != 0) {
                            f1VarI = f1.f16001g.i();
                        } else {
                            f1VarI = f1Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                        }
                        i34 = 29360128 & i15;
                        if (i34 == 8388608) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = f1VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = f1VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        if (i34 == 8388608) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            obj = objI1;
                            ArrayList arrayList4 = new ArrayList();
                            f1VarI.a(y2Var, arrayList4);
                            c0VarR.Y(arrayList4);
                            obj = arrayList4;
                        } else {
                            obj = objI1;
                            ArrayList arrayList5 = new ArrayList();
                            f1VarI.a(y2Var, arrayList5);
                            c0VarR.Y(arrayList5);
                            obj = arrayList5;
                        }
                        obj = objI1;
                        int i38 = i15 >> 6;
                        androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i38 & 57344) | (i38 & 14) | 100663296 | (i38 & com.planner5d.library.engine.input.f.b.B) | (i38 & 896) | (i38 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f1Var2 = f1VarI;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        i29 = i32;
                        i30 = i33;
                    } else {
                        c0VarR.u();
                        mVar2 = mVar;
                        i29 = i11;
                        f1Var2 = f1Var;
                        eVar3 = eVar2;
                        i30 = i12;
                    }
                    a0Var3 = a0Var2;
                    cVar2 = cVarW;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i15 |= 24576;
                cVarW = cVar;
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(f1Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i18 != 0) {
                        mVarY = q.f16330a.y();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        mVarY = mVar;
                    }
                    if (i31 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        f1VarI = f1.f16001g.i();
                    } else {
                        f1VarI = f1Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList6 = new ArrayList();
                        f1VarI.a(y2Var, arrayList6);
                        c0VarR.Y(arrayList6);
                        obj = arrayList6;
                    } else {
                        obj = objI1;
                        ArrayList arrayList7 = new ArrayList();
                        f1VarI.a(y2Var, arrayList7);
                        c0VarR.Y(arrayList7);
                        obj = arrayList7;
                    }
                    obj = objI1;
                    int i39 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i39 & 57344) | (i39 & 14) | 100663296 | (i39 & com.planner5d.library.engine.input.f.b.B) | (i39 & 896) | (i39 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f1Var2 = f1VarI;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    mVar2 = mVar;
                    i29 = i11;
                    f1Var2 = f1Var;
                    eVar3 = eVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                cVar2 = cVarW;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= androidx.media3.exoplayer.a5.S0;
            eVar2 = eVar;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c0VarR.D(mVar)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((i13 & 24576) == 0) {
                        cVarW = cVar;
                        if (c0VarR.D(cVarW)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i15 |= i21;
                    }
                    i22 = i14 & 32;
                    if (i22 != 0) {
                        i15 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i15 |= i23;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c0VarR.K(i12)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c0VarR.D(f1Var)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i14 & 256) != 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c0VarR.k0(oVar)) {
                            i28 = 67108864;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i15 |= i28;
                    }
                    if ((38347923 & i15) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i15 & 1)) {
                        if (i35 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar2;
                        }
                        if (i18 != 0) {
                            mVarY = q.f16330a.y();
                            i31 = i20;
                        } else {
                            i31 = i20;
                            mVarY = mVar;
                        }
                        if (i31 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                        }
                        if (i22 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i11;
                        }
                        if (i24 != 0) {
                            i33 = Integer.MAX_VALUE;
                        } else {
                            i33 = i12;
                        }
                        if (i26 != 0) {
                            f1VarI = f1.f16001g.i();
                        } else {
                            f1VarI = f1Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                        }
                        i34 = 29360128 & i15;
                        if (i34 == 8388608) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = f1VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = f1VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        if (i34 == 8388608) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            obj = objI1;
                            ArrayList arrayList8 = new ArrayList();
                            f1VarI.a(y2Var, arrayList8);
                            c0VarR.Y(arrayList8);
                            obj = arrayList8;
                        } else {
                            obj = objI1;
                            ArrayList arrayList9 = new ArrayList();
                            f1VarI.a(y2Var, arrayList9);
                            c0VarR.Y(arrayList9);
                            obj = arrayList9;
                        }
                        obj = objI1;
                        int i310 = i15 >> 6;
                        androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i310 & 57344) | (i310 & 14) | 100663296 | (i310 & com.planner5d.library.engine.input.f.b.B) | (i310 & 896) | (i310 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f1Var2 = f1VarI;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        i29 = i32;
                        i30 = i33;
                    } else {
                        c0VarR.u();
                        mVar2 = mVar;
                        i29 = i11;
                        f1Var2 = f1Var;
                        eVar3 = eVar2;
                        i30 = i12;
                    }
                    a0Var3 = a0Var2;
                    cVar2 = cVarW;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i15 |= 24576;
                cVarW = cVar;
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(f1Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i18 != 0) {
                        mVarY = q.f16330a.y();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        mVarY = mVar;
                    }
                    if (i31 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        f1VarI = f1.f16001g.i();
                    } else {
                        f1VarI = f1Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList10 = new ArrayList();
                        f1VarI.a(y2Var, arrayList10);
                        c0VarR.Y(arrayList10);
                        obj = arrayList10;
                    } else {
                        obj = objI1;
                        ArrayList arrayList11 = new ArrayList();
                        f1VarI.a(y2Var, arrayList11);
                        c0VarR.Y(arrayList11);
                        obj = arrayList11;
                    }
                    obj = objI1;
                    int i311 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i311 & 57344) | (i311 & 14) | 100663296 | (i311 & com.planner5d.library.engine.input.f.b.B) | (i311 & 896) | (i311 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f1Var2 = f1VarI;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    mVar2 = mVar;
                    i29 = i11;
                    f1Var2 = f1Var;
                    eVar3 = eVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                cVar2 = cVarW;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((i13 & 24576) == 0) {
                    cVarW = cVar;
                    if (c0VarR.D(cVarW)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i15 |= i21;
                }
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(f1Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i18 != 0) {
                        mVarY = q.f16330a.y();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        mVarY = mVar;
                    }
                    if (i31 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        f1VarI = f1.f16001g.i();
                    } else {
                        f1VarI = f1Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList12 = new ArrayList();
                        f1VarI.a(y2Var, arrayList12);
                        c0VarR.Y(arrayList12);
                        obj = arrayList12;
                    } else {
                        obj = objI1;
                        ArrayList arrayList13 = new ArrayList();
                        f1VarI.a(y2Var, arrayList13);
                        c0VarR.Y(arrayList13);
                        obj = arrayList13;
                    }
                    obj = objI1;
                    int i312 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i312 & 57344) | (i312 & 14) | 100663296 | (i312 & com.planner5d.library.engine.input.f.b.B) | (i312 & 896) | (i312 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f1Var2 = f1VarI;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    mVar2 = mVar;
                    i29 = i11;
                    f1Var2 = f1Var;
                    eVar3 = eVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                cVar2 = cVarW;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            cVarW = cVar;
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c0VarR.K(i12)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c0VarR.D(f1Var)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0VarR.k0(oVar)) {
                    i28 = 67108864;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i28;
            }
            if ((38347923 & i15) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i15 & 1)) {
                if (i35 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar2;
                }
                if (i18 != 0) {
                    mVarY = q.f16330a.y();
                    i31 = i20;
                } else {
                    i31 = i20;
                    mVarY = mVar;
                }
                if (i31 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                }
                if (i22 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i11;
                }
                if (i24 != 0) {
                    i33 = Integer.MAX_VALUE;
                } else {
                    i33 = i12;
                }
                if (i26 != 0) {
                    f1VarI = f1.f16001g.i();
                } else {
                    f1VarI = f1Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                }
                i34 = 29360128 & i15;
                if (i34 == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = f1VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = f1VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                if (i34 == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    obj = objI1;
                    ArrayList arrayList14 = new ArrayList();
                    f1VarI.a(y2Var, arrayList14);
                    c0VarR.Y(arrayList14);
                    obj = arrayList14;
                } else {
                    obj = objI1;
                    ArrayList arrayList15 = new ArrayList();
                    f1VarI.a(y2Var, arrayList15);
                    c0VarR.Y(arrayList15);
                    obj = arrayList15;
                }
                obj = objI1;
                int i313 = i15 >> 6;
                androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i313 & 57344) | (i313 & 14) | 100663296 | (i313 & com.planner5d.library.engine.input.f.b.B) | (i313 & 896) | (i313 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f1Var2 = f1VarI;
                eVar3 = eVarW;
                mVar2 = mVarY;
                i29 = i32;
                i30 = i33;
            } else {
                c0VarR.u();
                mVar2 = mVar;
                i29 = i11;
                f1Var2 = f1Var;
                eVar3 = eVar2;
                i30 = i12;
            }
            a0Var3 = a0Var2;
            cVar2 = cVarW;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        a0Var2 = a0Var;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & androidx.media3.exoplayer.a5.S0) == 0) {
                eVar2 = eVar;
                if (c0VarR.D(eVar2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c0VarR.D(mVar)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((i13 & 24576) == 0) {
                        cVarW = cVar;
                        if (c0VarR.D(cVarW)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i15 |= i21;
                    }
                    i22 = i14 & 32;
                    if (i22 != 0) {
                        i15 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i15 |= i23;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c0VarR.K(i12)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c0VarR.D(f1Var)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i14 & 256) != 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c0VarR.k0(oVar)) {
                            i28 = 67108864;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i15 |= i28;
                    }
                    if ((38347923 & i15) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i15 & 1)) {
                        if (i35 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar2;
                        }
                        if (i18 != 0) {
                            mVarY = q.f16330a.y();
                            i31 = i20;
                        } else {
                            i31 = i20;
                            mVarY = mVar;
                        }
                        if (i31 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                        }
                        if (i22 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i11;
                        }
                        if (i24 != 0) {
                            i33 = Integer.MAX_VALUE;
                        } else {
                            i33 = i12;
                        }
                        if (i26 != 0) {
                            f1VarI = f1.f16001g.i();
                        } else {
                            f1VarI = f1Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                        }
                        i34 = 29360128 & i15;
                        if (i34 == 8388608) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = f1VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = f1VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        if (i34 == 8388608) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z12) {
                            obj = objI1;
                            ArrayList arrayList16 = new ArrayList();
                            f1VarI.a(y2Var, arrayList16);
                            c0VarR.Y(arrayList16);
                            obj = arrayList16;
                        } else {
                            obj = objI1;
                            ArrayList arrayList17 = new ArrayList();
                            f1VarI.a(y2Var, arrayList17);
                            c0VarR.Y(arrayList17);
                            obj = arrayList17;
                        }
                        obj = objI1;
                        int i314 = i15 >> 6;
                        androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i314 & 57344) | (i314 & 14) | 100663296 | (i314 & com.planner5d.library.engine.input.f.b.B) | (i314 & 896) | (i314 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f1Var2 = f1VarI;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        i29 = i32;
                        i30 = i33;
                    } else {
                        c0VarR.u();
                        mVar2 = mVar;
                        i29 = i11;
                        f1Var2 = f1Var;
                        eVar3 = eVar2;
                        i30 = i12;
                    }
                    a0Var3 = a0Var2;
                    cVar2 = cVarW;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i15 |= 24576;
                cVarW = cVar;
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(f1Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i18 != 0) {
                        mVarY = q.f16330a.y();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        mVarY = mVar;
                    }
                    if (i31 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        f1VarI = f1.f16001g.i();
                    } else {
                        f1VarI = f1Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList18 = new ArrayList();
                        f1VarI.a(y2Var, arrayList18);
                        c0VarR.Y(arrayList18);
                        obj = arrayList18;
                    } else {
                        obj = objI1;
                        ArrayList arrayList19 = new ArrayList();
                        f1VarI.a(y2Var, arrayList19);
                        c0VarR.Y(arrayList19);
                        obj = arrayList19;
                    }
                    obj = objI1;
                    int i315 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i315 & 57344) | (i315 & 14) | 100663296 | (i315 & com.planner5d.library.engine.input.f.b.B) | (i315 & 896) | (i315 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f1Var2 = f1VarI;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    mVar2 = mVar;
                    i29 = i11;
                    f1Var2 = f1Var;
                    eVar3 = eVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                cVar2 = cVarW;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((i13 & 24576) == 0) {
                    cVarW = cVar;
                    if (c0VarR.D(cVarW)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i15 |= i21;
                }
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(f1Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i18 != 0) {
                        mVarY = q.f16330a.y();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        mVarY = mVar;
                    }
                    if (i31 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        f1VarI = f1.f16001g.i();
                    } else {
                        f1VarI = f1Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList110 = new ArrayList();
                        f1VarI.a(y2Var, arrayList110);
                        c0VarR.Y(arrayList110);
                        obj = arrayList110;
                    } else {
                        obj = objI1;
                        ArrayList arrayList111 = new ArrayList();
                        f1VarI.a(y2Var, arrayList111);
                        c0VarR.Y(arrayList111);
                        obj = arrayList111;
                    }
                    obj = objI1;
                    int i316 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i316 & 57344) | (i316 & 14) | 100663296 | (i316 & com.planner5d.library.engine.input.f.b.B) | (i316 & 896) | (i316 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f1Var2 = f1VarI;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    mVar2 = mVar;
                    i29 = i11;
                    f1Var2 = f1Var;
                    eVar3 = eVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                cVar2 = cVarW;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            cVarW = cVar;
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c0VarR.K(i12)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c0VarR.D(f1Var)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0VarR.k0(oVar)) {
                    i28 = 67108864;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i28;
            }
            if ((38347923 & i15) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i15 & 1)) {
                if (i35 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar2;
                }
                if (i18 != 0) {
                    mVarY = q.f16330a.y();
                    i31 = i20;
                } else {
                    i31 = i20;
                    mVarY = mVar;
                }
                if (i31 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                }
                if (i22 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i11;
                }
                if (i24 != 0) {
                    i33 = Integer.MAX_VALUE;
                } else {
                    i33 = i12;
                }
                if (i26 != 0) {
                    f1VarI = f1.f16001g.i();
                } else {
                    f1VarI = f1Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                }
                i34 = 29360128 & i15;
                if (i34 == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = f1VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = f1VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                if (i34 == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    obj = objI1;
                    ArrayList arrayList112 = new ArrayList();
                    f1VarI.a(y2Var, arrayList112);
                    c0VarR.Y(arrayList112);
                    obj = arrayList112;
                } else {
                    obj = objI1;
                    ArrayList arrayList113 = new ArrayList();
                    f1VarI.a(y2Var, arrayList113);
                    c0VarR.Y(arrayList113);
                    obj = arrayList113;
                }
                obj = objI1;
                int i317 = i15 >> 6;
                androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i317 & 57344) | (i317 & 14) | 100663296 | (i317 & com.planner5d.library.engine.input.f.b.B) | (i317 & 896) | (i317 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f1Var2 = f1VarI;
                eVar3 = eVarW;
                mVar2 = mVarY;
                i29 = i32;
                i30 = i33;
            } else {
                c0VarR.u();
                mVar2 = mVar;
                i29 = i11;
                f1Var2 = f1Var;
                eVar3 = eVar2;
                i30 = i12;
            }
            a0Var3 = a0Var2;
            cVar2 = cVarW;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= androidx.media3.exoplayer.a5.S0;
        eVar2 = eVar;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                if (c0VarR.D(mVar)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((i13 & 24576) == 0) {
                    cVarW = cVar;
                    if (c0VarR.D(cVarW)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i15 |= i21;
                }
                i22 = i14 & 32;
                if (i22 != 0) {
                    i15 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c0VarR.K(i12)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c0VarR.D(f1Var)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0VarR.k0(oVar)) {
                        i28 = 67108864;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i28;
                }
                if ((38347923 & i15) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i15 & 1)) {
                    if (i35 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i18 != 0) {
                        mVarY = q.f16330a.y();
                        i31 = i20;
                    } else {
                        i31 = i20;
                        mVarY = mVar;
                    }
                    if (i31 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i22 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i11;
                    }
                    if (i24 != 0) {
                        i33 = Integer.MAX_VALUE;
                    } else {
                        i33 = i12;
                    }
                    if (i26 != 0) {
                        f1VarI = f1.f16001g.i();
                    } else {
                        f1VarI = f1Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                    }
                    i34 = 29360128 & i15;
                    if (i34 == 8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = f1VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    if (i34 == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12) {
                        obj = objI1;
                        ArrayList arrayList114 = new ArrayList();
                        f1VarI.a(y2Var, arrayList114);
                        c0VarR.Y(arrayList114);
                        obj = arrayList114;
                    } else {
                        obj = objI1;
                        ArrayList arrayList115 = new ArrayList();
                        f1VarI.a(y2Var, arrayList115);
                        c0VarR.Y(arrayList115);
                        obj = arrayList115;
                    }
                    obj = objI1;
                    int i318 = i15 >> 6;
                    androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i318 & 57344) | (i318 & 14) | 100663296 | (i318 & com.planner5d.library.engine.input.f.b.B) | (i318 & 896) | (i318 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f1Var2 = f1VarI;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    i29 = i32;
                    i30 = i33;
                } else {
                    c0VarR.u();
                    mVar2 = mVar;
                    i29 = i11;
                    f1Var2 = f1Var;
                    eVar3 = eVar2;
                    i30 = i12;
                }
                a0Var3 = a0Var2;
                cVar2 = cVarW;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            cVarW = cVar;
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c0VarR.K(i12)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c0VarR.D(f1Var)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0VarR.k0(oVar)) {
                    i28 = 67108864;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i28;
            }
            if ((38347923 & i15) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i15 & 1)) {
                if (i35 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar2;
                }
                if (i18 != 0) {
                    mVarY = q.f16330a.y();
                    i31 = i20;
                } else {
                    i31 = i20;
                    mVarY = mVar;
                }
                if (i31 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                }
                if (i22 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i11;
                }
                if (i24 != 0) {
                    i33 = Integer.MAX_VALUE;
                } else {
                    i33 = i12;
                }
                if (i26 != 0) {
                    f1VarI = f1.f16001g.i();
                } else {
                    f1VarI = f1Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                }
                i34 = 29360128 & i15;
                if (i34 == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = f1VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = f1VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                if (i34 == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    obj = objI1;
                    ArrayList arrayList116 = new ArrayList();
                    f1VarI.a(y2Var, arrayList116);
                    c0VarR.Y(arrayList116);
                    obj = arrayList116;
                } else {
                    obj = objI1;
                    ArrayList arrayList117 = new ArrayList();
                    f1VarI.a(y2Var, arrayList117);
                    c0VarR.Y(arrayList117);
                    obj = arrayList117;
                }
                obj = objI1;
                int i319 = i15 >> 6;
                androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i319 & 57344) | (i319 & 14) | 100663296 | (i319 & com.planner5d.library.engine.input.f.b.B) | (i319 & 896) | (i319 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f1Var2 = f1VarI;
                eVar3 = eVarW;
                mVar2 = mVarY;
                i29 = i32;
                i30 = i33;
            } else {
                c0VarR.u();
                mVar2 = mVar;
                i29 = i11;
                f1Var2 = f1Var;
                eVar3 = eVar2;
                i30 = i12;
            }
            a0Var3 = a0Var2;
            cVar2 = cVarW;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        i20 = i14 & 16;
        if (i20 != 0) {
            if ((i13 & 24576) == 0) {
                cVarW = cVar;
                if (c0VarR.D(cVarW)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i15 |= i21;
            }
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c0VarR.K(i12)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c0VarR.D(f1Var)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0VarR.k0(oVar)) {
                    i28 = 67108864;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i28;
            }
            if ((38347923 & i15) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i15 & 1)) {
                if (i35 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar2;
                }
                if (i18 != 0) {
                    mVarY = q.f16330a.y();
                    i31 = i20;
                } else {
                    i31 = i20;
                    mVarY = mVar;
                }
                if (i31 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                }
                if (i22 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i11;
                }
                if (i24 != 0) {
                    i33 = Integer.MAX_VALUE;
                } else {
                    i33 = i12;
                }
                if (i26 != 0) {
                    f1VarI = f1.f16001g.i();
                } else {
                    f1VarI = f1Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                }
                i34 = 29360128 & i15;
                if (i34 == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = f1VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = f1VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                if (i34 == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    obj = objI1;
                    ArrayList arrayList118 = new ArrayList();
                    f1VarI.a(y2Var, arrayList118);
                    c0VarR.Y(arrayList118);
                    obj = arrayList118;
                } else {
                    obj = objI1;
                    ArrayList arrayList119 = new ArrayList();
                    f1VarI.a(y2Var, arrayList119);
                    c0VarR.Y(arrayList119);
                    obj = arrayList119;
                }
                obj = objI1;
                int i3110 = i15 >> 6;
                androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i3110 & 57344) | (i3110 & 14) | 100663296 | (i3110 & com.planner5d.library.engine.input.f.b.B) | (i3110 & 896) | (i3110 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f1Var2 = f1VarI;
                eVar3 = eVarW;
                mVar2 = mVarY;
                i29 = i32;
                i30 = i33;
            } else {
                c0VarR.u();
                mVar2 = mVar;
                i29 = i11;
                f1Var2 = f1Var;
                eVar3 = eVar2;
                i30 = i12;
            }
            a0Var3 = a0Var2;
            cVar2 = cVarW;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        cVarW = cVar;
        i22 = i14 & 32;
        if (i22 != 0) {
            i15 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i13 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.K(i11)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i15 |= i23;
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c0VarR.K(i12)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c0VarR.D(f1Var)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        if ((i14 & 256) != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c0VarR.k0(oVar)) {
                i28 = 67108864;
            } else {
                i28 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i15 |= i28;
        }
        if ((38347923 & i15) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i15 & 1)) {
            if (i35 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i16 != 0) {
                eVarW = q.f16330a.w();
            } else {
                eVarW = eVar2;
            }
            if (i18 != 0) {
                mVarY = q.f16330a.y();
                i31 = i20;
            } else {
                i31 = i20;
                mVarY = mVar;
            }
            if (i31 != 0) {
                cVarW = androidx.compose.ui.e.f37317a.w();
            }
            if (i22 != 0) {
                i32 = Integer.MAX_VALUE;
            } else {
                i32 = i11;
            }
            if (i24 != 0) {
                i33 = Integer.MAX_VALUE;
            } else {
                i33 = i12;
            }
            if (i26 != 0) {
                f1VarI = f1.f16001g.i();
            } else {
                f1VarI = f1Var;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-294153140, i15, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
            }
            i34 = 29360128 & i15;
            if (i34 == 8388608) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = f1VarI.b();
                c0VarR.Y(objI0);
            } else {
                objI0 = f1VarI.b();
                c0VarR.Y(objI0);
            }
            y2Var = (y2) objI0;
            if (i34 == 8388608) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI1 = c0VarR.i0();
            if (z12) {
                obj = objI1;
                ArrayList arrayList1110 = new ArrayList();
                f1VarI.a(y2Var, arrayList1110);
                c0VarR.Y(arrayList1110);
                obj = arrayList1110;
            } else {
                obj = objI1;
                ArrayList arrayList1111 = new ArrayList();
                f1VarI.a(y2Var, arrayList1111);
                c0VarR.Y(arrayList1111);
                obj = arrayList1111;
            }
            obj = objI1;
            int i3111 = i15 >> 6;
            androidx.compose.ui.layout.z2.a(a0Var2, h(eVarW, mVarY, cVarW, i32, i33, y2Var, i10, (List) obj, androidx.compose.runtime.internal.w.e(-1677845586, true, new b(oVar), c0VarR, 54), c0VarR, (i3111 & 57344) | (i3111 & 14) | 100663296 | (i3111 & com.planner5d.library.engine.input.f.b.B) | (i3111 & 896) | (i3111 & 7168) | ((i15 << 18) & 3670016)), c0VarR, (i15 >> 3) & 14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f1Var2 = f1VarI;
            eVar3 = eVarW;
            mVar2 = mVarY;
            i29 = i32;
            i30 = i33;
        } else {
            c0VarR.u();
            mVar2 = mVar;
            i29 = i11;
            f1Var2 = f1Var;
            eVar3 = eVar2;
            i30 = i12;
        }
        a0Var3 = a0Var2;
        cVar2 = cVarW;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.z0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return b1.f(i10, a0Var3, eVar3, mVar2, cVar2, i29, i30, f1Var2, oVar, i13, i14, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(int i10, androidx.compose.ui.a0 a0Var, q.e eVar, q.m mVar, androidx.compose.ui.e.c cVar, int i11, int i12, f1 f1Var, pj.o oVar, int i13, int i14, androidx.compose.runtime.c0 c0Var, int i15) {
        e(i10, a0Var, eVar, mVar, cVar, i11, i12, f1Var, oVar, c0Var, androidx.compose.runtime.t4.a(i13 | 1), i14);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[PHI: r4
      0x0074: PHI (r4v17 int) = (r4v15 int), (r4v18 int) binds: [B:36:0x0072, B:32:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0117  */
    @androidx.compose.runtime.o
    @NotNull
    public static final Function2<androidx.compose.ui.layout.b3, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> g(@NotNull q.m mVar, @NotNull q.e eVar, @NotNull androidx.compose.ui.e.b bVar, int i10, int i11, @NotNull y2 y2Var, int i12, @NotNull List<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> list, @NotNull pj.o<? super Integer, ? super z2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i13) {
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-676633639, i13, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:424)");
        }
        boolean z13 = ((((i13 & 14) ^ 6) > 4 && c0Var.D(mVar)) || (i13 & 6) == 4) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(eVar)) || (i13 & 48) == 32) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.D(bVar)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
        if (((i13 & 7168) ^ 3072) > 2048) {
            i14 = i10;
            if (c0Var.K(i14)) {
                z10 = true;
            }
            boolean zD = z13 | z10 | ((((57344 & i13) ^ 24576) <= 16384 && c0Var.K(i11)) || (i13 & 24576) == 16384) | c0Var.D(y2Var) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c0Var.K(i12)) || (i13 & 1572864) == 1048576);
            if (((234881024 & i13) ^ 100663296) > 67108864 || !c0Var.D(oVar)) {
                z11 = (i13 & 100663296) == 67108864;
            }
            z12 = zD | z11;
            objI0 = c0Var.i0();
            if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new g3(false, eVar, mVar, mVar.a(), k1.f16162a.i(bVar), eVar.a(), i12, i11, i14, y2Var, list, oVar, null).G();
                c0Var.Y(objI0);
            }
            Function2<androidx.compose.ui.layout.b3, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> function2 = (Function2) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return function2;
        }
        i14 = i10;
        if ((i13 & 3072) == 2048) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zD2 = z13 | z10 | ((((57344 & i13) ^ 24576) <= 16384 && c0Var.K(i11)) || (i13 & 24576) == 16384) | c0Var.D(y2Var) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c0Var.K(i12)) || (i13 & 1572864) == 1048576);
        if (((234881024 & i13) ^ 100663296) > 67108864) {
        }
        if ((i13 & 100663296) == 67108864) {
        }
        z12 = zD2 | z11;
        objI0 = c0Var.i0();
        if (z12) {
            objI0 = new g3(false, eVar, mVar, mVar.a(), k1.f16162a.i(bVar), eVar.a(), i12, i11, i14, y2Var, list, oVar, null).G();
            c0Var.Y(objI0);
        } else {
            objI0 = new g3(false, eVar, mVar, mVar.a(), k1.f16162a.i(bVar), eVar.a(), i12, i11, i14, y2Var, list, oVar, null).G();
            c0Var.Y(objI0);
        }
        Function2<androidx.compose.ui.layout.b3, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> function3 = (Function2) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return function3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b A[PHI: r4
      0x007b: PHI (r4v19 int) = (r4v17 int), (r4v21 int) binds: [B:36:0x0079, B:32:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x0119  */
    @androidx.compose.runtime.o
    @NotNull
    public static final Function2<androidx.compose.ui.layout.b3, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> h(@NotNull q.e eVar, @NotNull q.m mVar, @NotNull androidx.compose.ui.e.c cVar, int i10, int i11, @NotNull y2 y2Var, int i12, @NotNull List<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> list, @NotNull pj.o<? super Integer, ? super z2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i13) {
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(962906403, i13, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:384)");
        }
        boolean z13 = ((((i13 & 14) ^ 6) > 4 && c0Var.D(eVar)) || (i13 & 6) == 4) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(mVar)) || (i13 & 48) == 32) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.D(cVar)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
        if (((i13 & 7168) ^ 3072) > 2048) {
            i14 = i10;
            if (c0Var.K(i14)) {
                z10 = true;
            }
            boolean zD = z13 | z10 | ((((57344 & i13) ^ 24576) <= 16384 && c0Var.K(i11)) || (i13 & 24576) == 16384) | c0Var.D(y2Var) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c0Var.K(i12)) || (i13 & 1572864) == 1048576);
            if (((234881024 & i13) ^ 100663296) > 67108864 || !c0Var.D(oVar)) {
                z11 = (i13 & 100663296) == 67108864;
            }
            z12 = zD | z11;
            objI0 = c0Var.i0();
            if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new g3(true, eVar, mVar, eVar.a(), k1.f16162a.j(cVar), mVar.a(), i12, i11, i14, y2Var, list, oVar, null).G();
                c0Var.Y(objI0);
            }
            Function2<androidx.compose.ui.layout.b3, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> function2 = (Function2) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return function2;
        }
        i14 = i10;
        if ((i13 & 3072) == 2048) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zD2 = z13 | z10 | ((((57344 & i13) ^ 24576) <= 16384 && c0Var.K(i11)) || (i13 & 24576) == 16384) | c0Var.D(y2Var) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c0Var.K(i12)) || (i13 & 1572864) == 1048576);
        if (((234881024 & i13) ^ 100663296) > 67108864) {
        }
        if ((i13 & 100663296) == 67108864) {
        }
        z12 = zD2 | z11;
        objI0 = c0Var.i0();
        if (z12) {
            objI0 = new g3(true, eVar, mVar, eVar.a(), k1.f16162a.j(cVar), mVar.a(), i12, i11, i14, y2Var, list, oVar, null).G();
            c0Var.Y(objI0);
        } else {
            objI0 = new g3(true, eVar, mVar, eVar.a(), k1.f16162a.j(cVar), mVar.a(), i12, i11, i14, y2Var, list, oVar, null).G();
            c0Var.Y(objI0);
        }
        Function2<androidx.compose.ui.layout.b3, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> function3 = (Function2) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return function3;
    }
}
