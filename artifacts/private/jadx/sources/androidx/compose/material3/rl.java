package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,655:1\n113#2:656\n75#3:657\n75#3:658\n75#3:659\n1282#4,6:660\n1282#4,3:673\n1285#4,3:677\n1282#4,6:680\n1282#4,6:686\n1282#4,6:692\n607#5:666\n604#5,6:667\n605#6:676\n85#7:698\n66#8,5:699\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n337#1:656\n371#1:657\n372#1:658\n373#1:659\n376#1:660,6\n377#1:673,3\n377#1:677,3\n379#1:680,6\n398#1:686,6\n407#1:692,6\n377#1:666\n377#1:667,6\n377#1:676\n375#1:698\n401#1:699,5\n*E\n"})
public final class rl {

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, androidx.compose.foundation.layout.v6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.v6 f32575a;

        a(androidx.compose.foundation.layout.v6 v6Var) {
            this.f32575a = v6Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final androidx.compose.foundation.layout.v6 c(androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-677688734);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-677688734, i10, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:354)");
            }
            androidx.compose.foundation.layout.v6 v6Var = this.f32575a;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return v6Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ androidx.compose.foundation.layout.v6 invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,655:1\n1282#2,6:656\n70#3:662\n67#3,9:663\n77#3:702\n79#4,6:672\n86#4,3:687\n89#4,2:696\n93#4:701\n347#5,9:678\n356#5,3:698\n4206#6,6:690\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1\n*L\n393#1:656,6\n393#1:662\n393#1:663,9\n393#1:702\n393#1:672,6\n393#1:687,3\n393#1:696,2\n393#1:701\n393#1:678,9\n393#1:698,3\n393#1:690,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function2<androidx.compose.runtime.c0, Integer, Unit>> f32576a;

        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.runtime.n7<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> n7Var) {
            this.f32576a = n7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.m(e0Var);
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
                androidx.compose.runtime.m0.A0(-1051373467, i10, -1, "androidx.compose.material3.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:392)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.sl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return rl.b.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null);
            androidx.compose.runtime.n7<Function2<androidx.compose.runtime.c0, Integer, Unit>> n7Var = this.f32576a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
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
            rl.h(n7Var).invoke(c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n1#1,69:1\n402#2,3:70\n*E\n"})
    public static final class c implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ik f32577a;

        public c(ik ikVar) {
            this.f32577a = ikVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f32577a.dismiss();
            this.f32577a.j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x0139  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0159  */
    /* JADX WARN: Code duplicated, block: B:121:0x0161  */
    /* JADX WARN: Code duplicated, block: B:123:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x016e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0178  */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0180  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0192  */
    /* JADX WARN: Code duplicated, block: B:137:0x0196  */
    /* JADX WARN: Code duplicated, block: B:139:0x019e  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:175:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x021a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0221  */
    /* JADX WARN: Code duplicated, block: B:181:0x022b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0232  */
    /* JADX WARN: Code duplicated, block: B:185:0x023b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0246  */
    /* JADX WARN: Code duplicated, block: B:189:0x024f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0254  */
    /* JADX WARN: Code duplicated, block: B:194:0x0262  */
    /* JADX WARN: Code duplicated, block: B:195:0x0268  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:199:0x027a  */
    /* JADX WARN: Code duplicated, block: B:201:0x027e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0285  */
    /* JADX WARN: Code duplicated, block: B:205:0x028b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0294  */
    /* JADX WARN: Code duplicated, block: B:208:0x0298  */
    /* JADX WARN: Code duplicated, block: B:210:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:213:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:216:0x0312  */
    /* JADX WARN: Code duplicated, block: B:218:0x0328  */
    /* JADX WARN: Code duplicated, block: B:221:0x0347  */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use constructor with contentWindowInsets parameter.", replaceWith = @kotlin.b1(expression = "ModalBottomSheet(onDismissRequest,modifier,sheetState,sheetMaxWidth,shape,containerColor,contentColor,tonalElevation,scrimColor,dragHandle,{ windowInsets },properties,content,)", imports = {}))
    @af
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final /* synthetic */ void f(final Function0 function0, androidx.compose.ui.a0 a0Var, tx txVar, float f10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, long j12, Function2 function2, androidx.compose.foundation.layout.v6 v6Var, ll llVar, final pj.n nVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        tx txVarW;
        int i14;
        int i15;
        androidx.compose.ui.graphics.q3 q3VarH;
        long j13;
        long jG;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final float f12;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j14;
        final androidx.compose.ui.a0 a0Var3;
        final tx txVar2;
        final long j15;
        final float f13;
        final long j16;
        final Function2 function3;
        final androidx.compose.foundation.layout.v6 v6Var2;
        final ll llVar2;
        androidx.compose.runtime.s5 s5VarT;
        float fL;
        long jF;
        float fR;
        long jK;
        Function2 function2A;
        androidx.compose.foundation.layout.v6 v6VarO;
        ll llVarA;
        androidx.compose.ui.graphics.q3 q3Var3;
        float f14;
        char c10;
        float f15;
        androidx.compose.ui.a0 a0Var4;
        long j17;
        Function2 function4;
        tx txVar3;
        long j18;
        int i25;
        int i26;
        int i27;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1342054200);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i28 = i12 & 2;
        if (i28 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    txVarW = txVar;
                    int i29 = c0VarR.D(txVarW) ? 256 : 128;
                    i13 |= i29;
                } else {
                    txVarW = txVar;
                }
                i13 |= i29;
            } else {
                txVarW = txVar;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.I(f10)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i10 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        q3VarH = q3Var;
                        int i30 = c0VarR.D(q3VarH) ? 16384 : 8192;
                        i13 |= i30;
                    } else {
                        q3VarH = q3Var;
                    }
                    i13 |= i30;
                } else {
                    q3VarH = q3Var;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    j13 = j10;
                    if ((i12 & 32) == 0 || !c0VarR.L(j13)) {
                        i27 = 65536;
                    } else {
                        i27 = 131072;
                    }
                    i13 |= i27;
                } else {
                    j13 = j10;
                }
                if ((i10 & 1572864) == 0) {
                    jG = j11;
                    if ((i12 & 64) == 0 || !c0VarR.L(jG)) {
                        i26 = 524288;
                    } else {
                        i26 = 1048576;
                    }
                    i13 |= i26;
                } else {
                    jG = j11;
                }
                i16 = i12 & 128;
                if (i16 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f11)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i12 & 256) == 0 || !c0VarR.L(j12)) {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i25 = 67108864;
                    }
                    i13 |= i25;
                }
                i18 = i12 & 512;
                if (i18 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i13 |= i19;
                    }
                    if ((i11 & 6) == 0) {
                        i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.D(v6Var)) ? 2 : 4);
                    } else {
                        i20 = i11;
                    }
                    i21 = i12 & 2048;
                    if (i21 != 0) {
                        i20 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.D(llVar)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i20 |= i22;
                    }
                    i23 = i20;
                    if ((i12 & 4096) != 0) {
                        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i24 = 256;
                            } else {
                                i24 = 128;
                            }
                            i23 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378 || (i23 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i28 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                    txVarW = cl.W(false, null, c0VarR, 0, 3);
                                }
                                if (i14 != 0) {
                                    fL = x2.f34346a.l();
                                } else {
                                    fL = f10;
                                }
                                if ((i12 & 16) != 0) {
                                    q3VarH = x2.f34346a.h(c0VarR, 6);
                                    i13 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jF = x2.f34346a.f(c0VarR, 6);
                                    i13 &= -458753;
                                } else {
                                    jF = j13;
                                }
                                if ((i12 & 64) != 0) {
                                    jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                    i13 &= -3670017;
                                }
                                if (i16 != 0) {
                                    fR = androidx.compose.ui.unit.h.r(0);
                                } else {
                                    fR = f11;
                                }
                                if ((i12 & 256) != 0) {
                                    jK = x2.f34346a.k(c0VarR, 6);
                                    i13 = (-234881025) & i13;
                                } else {
                                    jK = j12;
                                }
                                if (i18 != 0) {
                                    function2A = t6.f33137a.a();
                                } else {
                                    function2A = function2;
                                }
                                if ((i12 & 1024) != 0) {
                                    v6VarO = x2.f34346a.o(c0VarR, 6);
                                    i23 &= -15;
                                } else {
                                    v6VarO = v6Var;
                                }
                                if (i21 != 0) {
                                    llVarA = ek.f27370a.a();
                                } else {
                                    llVarA = llVar;
                                }
                                j13 = jF;
                                q3Var3 = q3VarH;
                                f14 = fL;
                                c10 = 3;
                                long j19 = jG;
                                f15 = fR;
                                a0Var4 = a0Var2;
                                j17 = jK;
                                function4 = function2A;
                                txVar3 = txVarW;
                                j18 = j19;
                            } else {
                                c0VarR.u();
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    i13 &= -458753;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i12 & 256) != 0) {
                                    i13 &= -234881025;
                                }
                                if ((i12 & 1024) != 0) {
                                    i23 &= -15;
                                }
                                function4 = function2;
                                llVarA = llVar;
                                c10 = 3;
                                q3Var3 = q3VarH;
                                a0Var4 = a0Var2;
                                txVar3 = txVarW;
                                j18 = jG;
                                f14 = f10;
                                f15 = f11;
                                j17 = j12;
                                v6VarO = v6Var;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                            }
                            int i31 = i13 << 3;
                            int i32 = i23 << 3;
                            c0Var2 = c0VarR;
                            cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i31 & 458752) | (i31 & 3670016) | (i31 & 29360128) | (i31 & 234881024) | (i31 & 1879048192), ((i13 >> 27) & 14) | (i32 & 896) | (i32 & 7168), 16);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            f12 = f14;
                            q3Var2 = q3Var3;
                            j15 = j18;
                            function3 = function4;
                            float f16 = f15;
                            v6Var2 = v6VarO;
                            txVar2 = txVar3;
                            j14 = j13;
                            f13 = f16;
                            j16 = j17;
                            llVar2 = llVarA;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            f12 = f10;
                            q3Var2 = q3VarH;
                            j14 = j13;
                            a0Var3 = a0Var2;
                            txVar2 = txVarW;
                            j15 = jG;
                            f13 = f11;
                            j16 = j12;
                            function3 = function2;
                            v6Var2 = v6Var;
                            llVar2 = llVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i23 |= androidx.media3.exoplayer.a5.S0;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = cl.W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            } else {
                                jF = j13;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = t6.f33137a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                v6VarO = x2.f34346a.o(c0VarR, 6);
                                i23 &= -15;
                            } else {
                                v6VarO = v6Var;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            j13 = jF;
                            q3Var3 = q3VarH;
                            f14 = fL;
                            c10 = 3;
                            long j110 = jG;
                            f15 = fR;
                            a0Var4 = a0Var2;
                            j17 = jK;
                            function4 = function2A;
                            txVar3 = txVarW;
                            j18 = j110;
                        } else {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = cl.W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            } else {
                                jF = j13;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = t6.f33137a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                v6VarO = x2.f34346a.o(c0VarR, 6);
                                i23 &= -15;
                            } else {
                                v6VarO = v6Var;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            j13 = jF;
                            q3Var3 = q3VarH;
                            f14 = fL;
                            c10 = 3;
                            long j111 = jG;
                            f15 = fR;
                            a0Var4 = a0Var2;
                            j17 = jK;
                            function4 = function2A;
                            txVar3 = txVarW;
                            j18 = j111;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                        }
                        int i33 = i13 << 3;
                        int i34 = i23 << 3;
                        c0Var2 = c0VarR;
                        cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i33 & 458752) | (i33 & 3670016) | (i33 & 29360128) | (i33 & 234881024) | (i33 & 1879048192), ((i13 >> 27) & 14) | (i34 & 896) | (i34 & 7168), 16);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        f12 = f14;
                        q3Var2 = q3Var3;
                        j15 = j18;
                        function3 = function4;
                        float f17 = f15;
                        v6Var2 = v6VarO;
                        txVar2 = txVar3;
                        j14 = j13;
                        f13 = f17;
                        j16 = j17;
                        llVar2 = llVarA;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f12 = f10;
                        q3Var2 = q3VarH;
                        j14 = j13;
                        a0Var3 = a0Var2;
                        txVar2 = txVarW;
                        j15 = jG;
                        f13 = f11;
                        j16 = j12;
                        function3 = function2;
                        v6Var2 = v6Var;
                        llVar2 = llVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i11 & 6) == 0) {
                    i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.D(v6Var)) ? 2 : 4);
                } else {
                    i20 = i11;
                }
                i21 = i12 & 2048;
                if (i21 != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.D(llVar)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                if ((i12 & 4096) != 0) {
                    if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i24 = 256;
                        } else {
                            i24 = 128;
                        }
                        i23 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = cl.W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            } else {
                                jF = j13;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = t6.f33137a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                v6VarO = x2.f34346a.o(c0VarR, 6);
                                i23 &= -15;
                            } else {
                                v6VarO = v6Var;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            j13 = jF;
                            q3Var3 = q3VarH;
                            f14 = fL;
                            c10 = 3;
                            long j112 = jG;
                            f15 = fR;
                            a0Var4 = a0Var2;
                            j17 = jK;
                            function4 = function2A;
                            txVar3 = txVarW;
                            j18 = j112;
                        } else {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = cl.W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            } else {
                                jF = j13;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = t6.f33137a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                v6VarO = x2.f34346a.o(c0VarR, 6);
                                i23 &= -15;
                            } else {
                                v6VarO = v6Var;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            j13 = jF;
                            q3Var3 = q3VarH;
                            f14 = fL;
                            c10 = 3;
                            long j113 = jG;
                            f15 = fR;
                            a0Var4 = a0Var2;
                            j17 = jK;
                            function4 = function2A;
                            txVar3 = txVarW;
                            j18 = j113;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                        }
                        int i35 = i13 << 3;
                        int i36 = i23 << 3;
                        c0Var2 = c0VarR;
                        cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i35 & 458752) | (i35 & 3670016) | (i35 & 29360128) | (i35 & 234881024) | (i35 & 1879048192), ((i13 >> 27) & 14) | (i36 & 896) | (i36 & 7168), 16);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        f12 = f14;
                        q3Var2 = q3Var3;
                        j15 = j18;
                        function3 = function4;
                        float f18 = f15;
                        v6Var2 = v6VarO;
                        txVar2 = txVar3;
                        j14 = j13;
                        f13 = f18;
                        j16 = j17;
                        llVar2 = llVarA;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f12 = f10;
                        q3Var2 = q3VarH;
                        j14 = j13;
                        a0Var3 = a0Var2;
                        txVar2 = txVarW;
                        j15 = jG;
                        f13 = f11;
                        j16 = j12;
                        function3 = function2;
                        v6Var2 = v6Var;
                        llVar2 = llVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i23 |= androidx.media3.exoplayer.a5.S0;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j114 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j114;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j115 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j115;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                    }
                    int i37 = i13 << 3;
                    int i38 = i23 << 3;
                    c0Var2 = c0VarR;
                    cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i37 & 458752) | (i37 & 3670016) | (i37 & 29360128) | (i37 & 234881024) | (i37 & 1879048192), ((i13 >> 27) & 14) | (i38 & 896) | (i38 & 7168), 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    f12 = f14;
                    q3Var2 = q3Var3;
                    j15 = j18;
                    function3 = function4;
                    float f19 = f15;
                    v6Var2 = v6VarO;
                    txVar2 = txVar3;
                    j14 = j13;
                    f13 = f19;
                    j16 = j17;
                    llVar2 = llVarA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    q3Var2 = q3VarH;
                    j14 = j13;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    j15 = jG;
                    f13 = f11;
                    j16 = j12;
                    function3 = function2;
                    v6Var2 = v6Var;
                    llVar2 = llVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            if ((i10 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    q3VarH = q3Var;
                    if (c0VarR.D(q3VarH)) {
                    }
                    i13 |= i30;
                } else {
                    q3VarH = q3Var;
                }
                i13 |= i30;
            } else {
                q3VarH = q3Var;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                j13 = j10;
                if ((i12 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i13 |= i27;
            } else {
                j13 = j10;
            }
            if ((i10 & 1572864) == 0) {
                jG = j11;
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            } else {
                jG = j11;
            }
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i10 & 100663296) != 0) {
                if ((i12 & 256) == 0) {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i25;
            }
            i18 = i12 & 512;
            if (i18 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                if ((i11 & 6) == 0) {
                    i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.D(v6Var)) ? 2 : 4);
                } else {
                    i20 = i11;
                }
                i21 = i12 & 2048;
                if (i21 != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.D(llVar)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                if ((i12 & 4096) != 0) {
                    if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i24 = 256;
                        } else {
                            i24 = 128;
                        }
                        i23 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = cl.W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            } else {
                                jF = j13;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = t6.f33137a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                v6VarO = x2.f34346a.o(c0VarR, 6);
                                i23 &= -15;
                            } else {
                                v6VarO = v6Var;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            j13 = jF;
                            q3Var3 = q3VarH;
                            f14 = fL;
                            c10 = 3;
                            long j116 = jG;
                            f15 = fR;
                            a0Var4 = a0Var2;
                            j17 = jK;
                            function4 = function2A;
                            txVar3 = txVarW;
                            j18 = j116;
                        } else {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = cl.W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            } else {
                                jF = j13;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = t6.f33137a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                v6VarO = x2.f34346a.o(c0VarR, 6);
                                i23 &= -15;
                            } else {
                                v6VarO = v6Var;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            j13 = jF;
                            q3Var3 = q3VarH;
                            f14 = fL;
                            c10 = 3;
                            long j117 = jG;
                            f15 = fR;
                            a0Var4 = a0Var2;
                            j17 = jK;
                            function4 = function2A;
                            txVar3 = txVarW;
                            j18 = j117;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                        }
                        int i39 = i13 << 3;
                        int i310 = i23 << 3;
                        c0Var2 = c0VarR;
                        cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i39 & 458752) | (i39 & 3670016) | (i39 & 29360128) | (i39 & 234881024) | (i39 & 1879048192), ((i13 >> 27) & 14) | (i310 & 896) | (i310 & 7168), 16);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        f12 = f14;
                        q3Var2 = q3Var3;
                        j15 = j18;
                        function3 = function4;
                        float f110 = f15;
                        v6Var2 = v6VarO;
                        txVar2 = txVar3;
                        j14 = j13;
                        f13 = f110;
                        j16 = j17;
                        llVar2 = llVarA;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f12 = f10;
                        q3Var2 = q3VarH;
                        j14 = j13;
                        a0Var3 = a0Var2;
                        txVar2 = txVarW;
                        j15 = jG;
                        f13 = f11;
                        j16 = j12;
                        function3 = function2;
                        v6Var2 = v6Var;
                        llVar2 = llVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i23 |= androidx.media3.exoplayer.a5.S0;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j118 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j118;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j119 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j119;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                    }
                    int i311 = i13 << 3;
                    int i312 = i23 << 3;
                    c0Var2 = c0VarR;
                    cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i311 & 458752) | (i311 & 3670016) | (i311 & 29360128) | (i311 & 234881024) | (i311 & 1879048192), ((i13 >> 27) & 14) | (i312 & 896) | (i312 & 7168), 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    f12 = f14;
                    q3Var2 = q3Var3;
                    j15 = j18;
                    function3 = function4;
                    float f111 = f15;
                    v6Var2 = v6VarO;
                    txVar2 = txVar3;
                    j14 = j13;
                    f13 = f111;
                    j16 = j17;
                    llVar2 = llVarA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    q3Var2 = q3VarH;
                    j14 = j13;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    j15 = jG;
                    f13 = f11;
                    j16 = j12;
                    function3 = function2;
                    v6Var2 = v6Var;
                    llVar2 = llVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i11 & 6) == 0) {
                i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.D(v6Var)) ? 2 : 4);
            } else {
                i20 = i11;
            }
            i21 = i12 & 2048;
            if (i21 != 0) {
                i20 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.D(llVar)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            if ((i12 & 4096) != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i24 = 256;
                    } else {
                        i24 = 128;
                    }
                    i23 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j1110 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j1110;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j1111 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j1111;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                    }
                    int i313 = i13 << 3;
                    int i314 = i23 << 3;
                    c0Var2 = c0VarR;
                    cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i313 & 458752) | (i313 & 3670016) | (i313 & 29360128) | (i313 & 234881024) | (i313 & 1879048192), ((i13 >> 27) & 14) | (i314 & 896) | (i314 & 7168), 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    f12 = f14;
                    q3Var2 = q3Var3;
                    j15 = j18;
                    function3 = function4;
                    float f112 = f15;
                    v6Var2 = v6VarO;
                    txVar2 = txVar3;
                    j14 = j13;
                    f13 = f112;
                    j16 = j17;
                    llVar2 = llVarA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    q3Var2 = q3VarH;
                    j14 = j13;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    j15 = jG;
                    f13 = f11;
                    j16 = j12;
                    function3 = function2;
                    v6Var2 = v6Var;
                    llVar2 = llVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i23 |= androidx.media3.exoplayer.a5.S0;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = cl.W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    } else {
                        jF = j13;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = t6.f33137a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        v6VarO = x2.f34346a.o(c0VarR, 6);
                        i23 &= -15;
                    } else {
                        v6VarO = v6Var;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    j13 = jF;
                    q3Var3 = q3VarH;
                    f14 = fL;
                    c10 = 3;
                    long j1112 = jG;
                    f15 = fR;
                    a0Var4 = a0Var2;
                    j17 = jK;
                    function4 = function2A;
                    txVar3 = txVarW;
                    j18 = j1112;
                } else {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = cl.W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    } else {
                        jF = j13;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = t6.f33137a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        v6VarO = x2.f34346a.o(c0VarR, 6);
                        i23 &= -15;
                    } else {
                        v6VarO = v6Var;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    j13 = jF;
                    q3Var3 = q3VarH;
                    f14 = fL;
                    c10 = 3;
                    long j1113 = jG;
                    f15 = fR;
                    a0Var4 = a0Var2;
                    j17 = jK;
                    function4 = function2A;
                    txVar3 = txVarW;
                    j18 = j1113;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                }
                int i315 = i13 << 3;
                int i316 = i23 << 3;
                c0Var2 = c0VarR;
                cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i315 & 458752) | (i315 & 3670016) | (i315 & 29360128) | (i315 & 234881024) | (i315 & 1879048192), ((i13 >> 27) & 14) | (i316 & 896) | (i316 & 7168), 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                f12 = f14;
                q3Var2 = q3Var3;
                j15 = j18;
                function3 = function4;
                float f113 = f15;
                v6Var2 = v6VarO;
                txVar2 = txVar3;
                j14 = j13;
                f13 = f113;
                j16 = j17;
                llVar2 = llVarA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f12 = f10;
                q3Var2 = q3VarH;
                j14 = j13;
                a0Var3 = a0Var2;
                txVar2 = txVarW;
                j15 = jG;
                f13 = f11;
                j16 = j12;
                function3 = function2;
                v6Var2 = v6Var;
                llVar2 = llVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                txVarW = txVar;
                if (c0VarR.D(txVarW)) {
                }
                i13 |= i29;
            } else {
                txVarW = txVar;
            }
            i13 |= i29;
        } else {
            txVarW = txVar;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.I(f10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i10 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    q3VarH = q3Var;
                    if (c0VarR.D(q3VarH)) {
                    }
                    i13 |= i30;
                } else {
                    q3VarH = q3Var;
                }
                i13 |= i30;
            } else {
                q3VarH = q3Var;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                j13 = j10;
                if ((i12 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i13 |= i27;
            } else {
                j13 = j10;
            }
            if ((i10 & 1572864) == 0) {
                jG = j11;
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            } else {
                jG = j11;
            }
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i10 & 100663296) != 0) {
                if ((i12 & 256) == 0) {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i25;
            }
            i18 = i12 & 512;
            if (i18 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                if ((i11 & 6) == 0) {
                    i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.D(v6Var)) ? 2 : 4);
                } else {
                    i20 = i11;
                }
                i21 = i12 & 2048;
                if (i21 != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.D(llVar)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                if ((i12 & 4096) != 0) {
                    if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i24 = 256;
                        } else {
                            i24 = 128;
                        }
                        i23 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = cl.W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            } else {
                                jF = j13;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = t6.f33137a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                v6VarO = x2.f34346a.o(c0VarR, 6);
                                i23 &= -15;
                            } else {
                                v6VarO = v6Var;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            j13 = jF;
                            q3Var3 = q3VarH;
                            f14 = fL;
                            c10 = 3;
                            long j1114 = jG;
                            f15 = fR;
                            a0Var4 = a0Var2;
                            j17 = jK;
                            function4 = function2A;
                            txVar3 = txVarW;
                            j18 = j1114;
                        } else {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = cl.W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            } else {
                                jF = j13;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = t6.f33137a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                v6VarO = x2.f34346a.o(c0VarR, 6);
                                i23 &= -15;
                            } else {
                                v6VarO = v6Var;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            j13 = jF;
                            q3Var3 = q3VarH;
                            f14 = fL;
                            c10 = 3;
                            long j1115 = jG;
                            f15 = fR;
                            a0Var4 = a0Var2;
                            j17 = jK;
                            function4 = function2A;
                            txVar3 = txVarW;
                            j18 = j1115;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                        }
                        int i317 = i13 << 3;
                        int i318 = i23 << 3;
                        c0Var2 = c0VarR;
                        cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i317 & 458752) | (i317 & 3670016) | (i317 & 29360128) | (i317 & 234881024) | (i317 & 1879048192), ((i13 >> 27) & 14) | (i318 & 896) | (i318 & 7168), 16);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        f12 = f14;
                        q3Var2 = q3Var3;
                        j15 = j18;
                        function3 = function4;
                        float f114 = f15;
                        v6Var2 = v6VarO;
                        txVar2 = txVar3;
                        j14 = j13;
                        f13 = f114;
                        j16 = j17;
                        llVar2 = llVarA;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f12 = f10;
                        q3Var2 = q3VarH;
                        j14 = j13;
                        a0Var3 = a0Var2;
                        txVar2 = txVarW;
                        j15 = jG;
                        f13 = f11;
                        j16 = j12;
                        function3 = function2;
                        v6Var2 = v6Var;
                        llVar2 = llVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i23 |= androidx.media3.exoplayer.a5.S0;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j1116 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j1116;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j1117 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j1117;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                    }
                    int i319 = i13 << 3;
                    int i3110 = i23 << 3;
                    c0Var2 = c0VarR;
                    cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i319 & 458752) | (i319 & 3670016) | (i319 & 29360128) | (i319 & 234881024) | (i319 & 1879048192), ((i13 >> 27) & 14) | (i3110 & 896) | (i3110 & 7168), 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    f12 = f14;
                    q3Var2 = q3Var3;
                    j15 = j18;
                    function3 = function4;
                    float f115 = f15;
                    v6Var2 = v6VarO;
                    txVar2 = txVar3;
                    j14 = j13;
                    f13 = f115;
                    j16 = j17;
                    llVar2 = llVarA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    q3Var2 = q3VarH;
                    j14 = j13;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    j15 = jG;
                    f13 = f11;
                    j16 = j12;
                    function3 = function2;
                    v6Var2 = v6Var;
                    llVar2 = llVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i11 & 6) == 0) {
                i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.D(v6Var)) ? 2 : 4);
            } else {
                i20 = i11;
            }
            i21 = i12 & 2048;
            if (i21 != 0) {
                i20 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.D(llVar)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            if ((i12 & 4096) != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i24 = 256;
                    } else {
                        i24 = 128;
                    }
                    i23 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j1118 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j1118;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j1119 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j1119;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                    }
                    int i3111 = i13 << 3;
                    int i3112 = i23 << 3;
                    c0Var2 = c0VarR;
                    cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i3111 & 458752) | (i3111 & 3670016) | (i3111 & 29360128) | (i3111 & 234881024) | (i3111 & 1879048192), ((i13 >> 27) & 14) | (i3112 & 896) | (i3112 & 7168), 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    f12 = f14;
                    q3Var2 = q3Var3;
                    j15 = j18;
                    function3 = function4;
                    float f116 = f15;
                    v6Var2 = v6VarO;
                    txVar2 = txVar3;
                    j14 = j13;
                    f13 = f116;
                    j16 = j17;
                    llVar2 = llVarA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    q3Var2 = q3VarH;
                    j14 = j13;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    j15 = jG;
                    f13 = f11;
                    j16 = j12;
                    function3 = function2;
                    v6Var2 = v6Var;
                    llVar2 = llVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i23 |= androidx.media3.exoplayer.a5.S0;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = cl.W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    } else {
                        jF = j13;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = t6.f33137a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        v6VarO = x2.f34346a.o(c0VarR, 6);
                        i23 &= -15;
                    } else {
                        v6VarO = v6Var;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    j13 = jF;
                    q3Var3 = q3VarH;
                    f14 = fL;
                    c10 = 3;
                    long j11110 = jG;
                    f15 = fR;
                    a0Var4 = a0Var2;
                    j17 = jK;
                    function4 = function2A;
                    txVar3 = txVarW;
                    j18 = j11110;
                } else {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = cl.W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    } else {
                        jF = j13;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = t6.f33137a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        v6VarO = x2.f34346a.o(c0VarR, 6);
                        i23 &= -15;
                    } else {
                        v6VarO = v6Var;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    j13 = jF;
                    q3Var3 = q3VarH;
                    f14 = fL;
                    c10 = 3;
                    long j11111 = jG;
                    f15 = fR;
                    a0Var4 = a0Var2;
                    j17 = jK;
                    function4 = function2A;
                    txVar3 = txVarW;
                    j18 = j11111;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                }
                int i3113 = i13 << 3;
                int i3114 = i23 << 3;
                c0Var2 = c0VarR;
                cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i3113 & 458752) | (i3113 & 3670016) | (i3113 & 29360128) | (i3113 & 234881024) | (i3113 & 1879048192), ((i13 >> 27) & 14) | (i3114 & 896) | (i3114 & 7168), 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                f12 = f14;
                q3Var2 = q3Var3;
                j15 = j18;
                function3 = function4;
                float f117 = f15;
                v6Var2 = v6VarO;
                txVar2 = txVar3;
                j14 = j13;
                f13 = f117;
                j16 = j17;
                llVar2 = llVarA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f12 = f10;
                q3Var2 = q3VarH;
                j14 = j13;
                a0Var3 = a0Var2;
                txVar2 = txVarW;
                j15 = jG;
                f13 = f11;
                j16 = j12;
                function3 = function2;
                v6Var2 = v6Var;
                llVar2 = llVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        if ((i10 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                q3VarH = q3Var;
                if (c0VarR.D(q3VarH)) {
                }
                i13 |= i30;
            } else {
                q3VarH = q3Var;
            }
            i13 |= i30;
        } else {
            q3VarH = q3Var;
        }
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            j13 = j10;
            if ((i12 & 32) == 0) {
                i27 = 65536;
            } else {
                i27 = 65536;
            }
            i13 |= i27;
        } else {
            j13 = j10;
        }
        if ((i10 & 1572864) == 0) {
            jG = j11;
            if ((i12 & 64) == 0) {
                i26 = 524288;
            } else {
                i26 = 524288;
            }
            i13 |= i26;
        } else {
            jG = j11;
        }
        i16 = i12 & 128;
        if (i16 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.I(f11)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i13 |= i17;
        }
        if ((i10 & 100663296) != 0) {
            if ((i12 & 256) == 0) {
                i25 = com.google.api.client.googleapis.media.a.f115410j;
            } else {
                i25 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i13 |= i25;
        }
        i18 = i12 & 512;
        if (i18 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function2)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i13 |= i19;
            }
            if ((i11 & 6) == 0) {
                i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.D(v6Var)) ? 2 : 4);
            } else {
                i20 = i11;
            }
            i21 = i12 & 2048;
            if (i21 != 0) {
                i20 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.D(llVar)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            if ((i12 & 4096) != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i24 = 256;
                    } else {
                        i24 = 128;
                    }
                    i23 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j11112 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j11112;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = cl.W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        } else {
                            jF = j13;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = t6.f33137a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            v6VarO = x2.f34346a.o(c0VarR, 6);
                            i23 &= -15;
                        } else {
                            v6VarO = v6Var;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        j13 = jF;
                        q3Var3 = q3VarH;
                        f14 = fL;
                        c10 = 3;
                        long j11113 = jG;
                        f15 = fR;
                        a0Var4 = a0Var2;
                        j17 = jK;
                        function4 = function2A;
                        txVar3 = txVarW;
                        j18 = j11113;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                    }
                    int i3115 = i13 << 3;
                    int i3116 = i23 << 3;
                    c0Var2 = c0VarR;
                    cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i3115 & 458752) | (i3115 & 3670016) | (i3115 & 29360128) | (i3115 & 234881024) | (i3115 & 1879048192), ((i13 >> 27) & 14) | (i3116 & 896) | (i3116 & 7168), 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    f12 = f14;
                    q3Var2 = q3Var3;
                    j15 = j18;
                    function3 = function4;
                    float f118 = f15;
                    v6Var2 = v6VarO;
                    txVar2 = txVar3;
                    j14 = j13;
                    f13 = f118;
                    j16 = j17;
                    llVar2 = llVarA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    q3Var2 = q3VarH;
                    j14 = j13;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    j15 = jG;
                    f13 = f11;
                    j16 = j12;
                    function3 = function2;
                    v6Var2 = v6Var;
                    llVar2 = llVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i23 |= androidx.media3.exoplayer.a5.S0;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = cl.W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    } else {
                        jF = j13;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = t6.f33137a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        v6VarO = x2.f34346a.o(c0VarR, 6);
                        i23 &= -15;
                    } else {
                        v6VarO = v6Var;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    j13 = jF;
                    q3Var3 = q3VarH;
                    f14 = fL;
                    c10 = 3;
                    long j11114 = jG;
                    f15 = fR;
                    a0Var4 = a0Var2;
                    j17 = jK;
                    function4 = function2A;
                    txVar3 = txVarW;
                    j18 = j11114;
                } else {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = cl.W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    } else {
                        jF = j13;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = t6.f33137a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        v6VarO = x2.f34346a.o(c0VarR, 6);
                        i23 &= -15;
                    } else {
                        v6VarO = v6Var;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    j13 = jF;
                    q3Var3 = q3VarH;
                    f14 = fL;
                    c10 = 3;
                    long j11115 = jG;
                    f15 = fR;
                    a0Var4 = a0Var2;
                    j17 = jK;
                    function4 = function2A;
                    txVar3 = txVarW;
                    j18 = j11115;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                }
                int i3117 = i13 << 3;
                int i3118 = i23 << 3;
                c0Var2 = c0VarR;
                cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i3117 & 458752) | (i3117 & 3670016) | (i3117 & 29360128) | (i3117 & 234881024) | (i3117 & 1879048192), ((i13 >> 27) & 14) | (i3118 & 896) | (i3118 & 7168), 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                f12 = f14;
                q3Var2 = q3Var3;
                j15 = j18;
                function3 = function4;
                float f119 = f15;
                v6Var2 = v6VarO;
                txVar2 = txVar3;
                j14 = j13;
                f13 = f119;
                j16 = j17;
                llVar2 = llVarA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f12 = f10;
                q3Var2 = q3VarH;
                j14 = j13;
                a0Var3 = a0Var2;
                txVar2 = txVarW;
                j15 = jG;
                f13 = f11;
                j16 = j12;
                function3 = function2;
                v6Var2 = v6Var;
                llVar2 = llVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        if ((i11 & 6) == 0) {
            i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.D(v6Var)) ? 2 : 4);
        } else {
            i20 = i11;
        }
        i21 = i12 & 2048;
        if (i21 != 0) {
            i20 |= 48;
        } else if ((i11 & 48) != 0) {
            if (c0VarR.D(llVar)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i20 |= i22;
        }
        i23 = i20;
        if ((i12 & 4096) != 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(nVar)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i23 |= i24;
            }
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = cl.W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    } else {
                        jF = j13;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = t6.f33137a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        v6VarO = x2.f34346a.o(c0VarR, 6);
                        i23 &= -15;
                    } else {
                        v6VarO = v6Var;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    j13 = jF;
                    q3Var3 = q3VarH;
                    f14 = fL;
                    c10 = 3;
                    long j11116 = jG;
                    f15 = fR;
                    a0Var4 = a0Var2;
                    j17 = jK;
                    function4 = function2A;
                    txVar3 = txVarW;
                    j18 = j11116;
                } else {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = cl.W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    } else {
                        jF = j13;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = t6.f33137a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        v6VarO = x2.f34346a.o(c0VarR, 6);
                        i23 &= -15;
                    } else {
                        v6VarO = v6Var;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    j13 = jF;
                    q3Var3 = q3VarH;
                    f14 = fL;
                    c10 = 3;
                    long j11117 = jG;
                    f15 = fR;
                    a0Var4 = a0Var2;
                    j17 = jK;
                    function4 = function2A;
                    txVar3 = txVarW;
                    j18 = j11117;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                }
                int i3119 = i13 << 3;
                int i31110 = i23 << 3;
                c0Var2 = c0VarR;
                cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i3119 & 458752) | (i3119 & 3670016) | (i3119 & 29360128) | (i3119 & 234881024) | (i3119 & 1879048192), ((i13 >> 27) & 14) | (i31110 & 896) | (i31110 & 7168), 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                f12 = f14;
                q3Var2 = q3Var3;
                j15 = j18;
                function3 = function4;
                float f1110 = f15;
                v6Var2 = v6VarO;
                txVar2 = txVar3;
                j14 = j13;
                f13 = f1110;
                j16 = j17;
                llVar2 = llVarA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f12 = f10;
                q3Var2 = q3VarH;
                j14 = j13;
                a0Var3 = a0Var2;
                txVar2 = txVarW;
                j15 = jG;
                f13 = f11;
                j16 = j12;
                function3 = function2;
                v6Var2 = v6Var;
                llVar2 = llVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i23 |= androidx.media3.exoplayer.a5.S0;
        if ((i13 & 306783379) == 306783378) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i28 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    txVarW = cl.W(false, null, c0VarR, 0, 3);
                }
                if (i14 != 0) {
                    fL = x2.f34346a.l();
                } else {
                    fL = f10;
                }
                if ((i12 & 16) != 0) {
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jF = x2.f34346a.f(c0VarR, 6);
                    i13 &= -458753;
                } else {
                    jF = j13;
                }
                if ((i12 & 64) != 0) {
                    jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                    i13 &= -3670017;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f11;
                }
                if ((i12 & 256) != 0) {
                    jK = x2.f34346a.k(c0VarR, 6);
                    i13 = (-234881025) & i13;
                } else {
                    jK = j12;
                }
                if (i18 != 0) {
                    function2A = t6.f33137a.a();
                } else {
                    function2A = function2;
                }
                if ((i12 & 1024) != 0) {
                    v6VarO = x2.f34346a.o(c0VarR, 6);
                    i23 &= -15;
                } else {
                    v6VarO = v6Var;
                }
                if (i21 != 0) {
                    llVarA = ek.f27370a.a();
                } else {
                    llVarA = llVar;
                }
                j13 = jF;
                q3Var3 = q3VarH;
                f14 = fL;
                c10 = 3;
                long j11118 = jG;
                f15 = fR;
                a0Var4 = a0Var2;
                j17 = jK;
                function4 = function2A;
                txVar3 = txVarW;
                j18 = j11118;
            } else {
                if (i28 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    txVarW = cl.W(false, null, c0VarR, 0, 3);
                }
                if (i14 != 0) {
                    fL = x2.f34346a.l();
                } else {
                    fL = f10;
                }
                if ((i12 & 16) != 0) {
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jF = x2.f34346a.f(c0VarR, 6);
                    i13 &= -458753;
                } else {
                    jF = j13;
                }
                if ((i12 & 64) != 0) {
                    jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                    i13 &= -3670017;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f11;
                }
                if ((i12 & 256) != 0) {
                    jK = x2.f34346a.k(c0VarR, 6);
                    i13 = (-234881025) & i13;
                } else {
                    jK = j12;
                }
                if (i18 != 0) {
                    function2A = t6.f33137a.a();
                } else {
                    function2A = function2;
                }
                if ((i12 & 1024) != 0) {
                    v6VarO = x2.f34346a.o(c0VarR, 6);
                    i23 &= -15;
                } else {
                    v6VarO = v6Var;
                }
                if (i21 != 0) {
                    llVarA = ek.f27370a.a();
                } else {
                    llVarA = llVar;
                }
                j13 = jF;
                q3Var3 = q3VarH;
                f14 = fL;
                c10 = 3;
                long j11119 = jG;
                f15 = fR;
                a0Var4 = a0Var2;
                j17 = jK;
                function4 = function2A;
                txVar3 = txVarW;
                j18 = j11119;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1342054200, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
            }
            int i31111 = i13 << 3;
            int i31112 = i23 << 3;
            c0Var2 = c0VarR;
            cl.t(function0, a0Var4, txVar3, f14, false, q3Var3, j13, j18, f15, j17, function4, new a(v6VarO), llVarA, nVar, c0Var2, (i13 & 8190) | (i31111 & 458752) | (i31111 & 3670016) | (i31111 & 29360128) | (i31111 & 234881024) | (i31111 & 1879048192), ((i13 >> 27) & 14) | (i31112 & 896) | (i31112 & 7168), 16);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            f12 = f14;
            q3Var2 = q3Var3;
            j15 = j18;
            function3 = function4;
            float f1111 = f15;
            v6Var2 = v6VarO;
            txVar2 = txVar3;
            j14 = j13;
            f13 = f1111;
            j16 = j17;
            llVar2 = llVarA;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            f12 = f10;
            q3Var2 = q3VarH;
            j14 = j13;
            a0Var3 = a0Var2;
            txVar2 = txVarW;
            j15 = jG;
            f13 = f11;
            j16 = j12;
            function3 = function2;
            v6Var2 = v6Var;
            llVar2 = llVar;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ql
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return rl.m(function0, a0Var3, txVar2, f12, q3Var2, j14, j15, f13, j16, function3, v6Var2, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void g(@NotNull final Function0<Unit> function0, final long j10, @NotNull final ll llVar, @NotNull final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        ll llVar2;
        int i12;
        final androidx.compose.ui.unit.w wVar;
        boolean z10;
        Object obj;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(766784632);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.L(j10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            llVar2 = llVar;
            i11 |= c0VarR.D(llVar2) ? 256 : 128;
        } else {
            llVar2 = llVar;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? c0VarR.D(cVar) : c0VarR.k0(cVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(function2) ? 16384 : 8192;
        }
        if (c0VarR.h((i11 & 9363) != 9362, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(766784632, i11, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:369)");
            }
            View view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            androidx.compose.ui.unit.w wVar2 = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
            androidx.compose.runtime.p0 p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
            androidx.compose.runtime.n7 n7VarW = androidx.compose.runtime.w6.w(function2, c0VarR, (i11 >> 12) & 14);
            Object[] objArr = new Object[0];
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return rl.k();
                    }
                };
                c0VarR.Y(objI0);
            }
            UUID uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr, (Function0) objI0, c0VarR, 48);
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI1;
            boolean zD = c0VarR.D(view) | c0VarR.D(dVar);
            Object objI2 = c0VarR.i0();
            if (zD || objI2 == aVar.a()) {
                i12 = 256;
                ik ikVar = new ik(function0, llVar2, j10, view, wVar2, dVar, uuid, cVar, s0Var, null);
                wVar = wVar2;
                z10 = true;
                ikVar.k(p0VarY, androidx.compose.runtime.internal.w.c(-1051373467, true, new b(n7VarW)));
                c0VarR.Y(ikVar);
                obj = ikVar;
            } else {
                wVar = wVar2;
                z10 = true;
                i12 = 256;
                obj = objI2;
            }
            final ik ikVar2 = (ik) obj;
            boolean zK0 = c0VarR.k0(ikVar2);
            Object objI3 = c0VarR.i0();
            if (zK0 || objI3 == aVar.a()) {
                objI3 = new Function1() { // from class: androidx.compose.material3.nl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return rl.l(ikVar2, (androidx.compose.runtime.v1) obj2);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.runtime.b2.d(ikVar2, (Function1) objI3, c0VarR, 0);
            int i13 = i11;
            boolean zK1 = c0VarR.k0(ikVar2) | ((i13 & 14) == 4 ? z10 : false) | ((i13 & 896) == i12 ? z10 : false) | ((i13 & com.planner5d.library.engine.input.f.b.B) == 32 ? z10 : false) | c0VarR.K(wVar.ordinal());
            Object objI4 = c0VarR.i0();
            if (zK1 || objI4 == aVar.a()) {
                objI4 = new Function0() { // from class: androidx.compose.material3.ol
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return rl.i(ikVar2, function0, llVar, j10, wVar);
                    }
                };
                c0VarR.Y(objI4);
            }
            androidx.compose.runtime.b2.m((Function0) objI4, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return rl.j(function0, j10, llVar, cVar, function2, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<androidx.compose.runtime.c0, Integer, Unit> h(androidx.compose.runtime.n7<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> n7Var) {
        return (Function2) n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(ik ikVar, Function0 function0, ll llVar, long j10, androidx.compose.ui.unit.w wVar) {
        ikVar.n(function0, llVar, j10, wVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0, long j10, ll llVar, androidx.compose.animation.core.c cVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        g(function0, j10, llVar, cVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID k() {
        return UUID.randomUUID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 l(ik ikVar, androidx.compose.runtime.v1 v1Var) {
        ikVar.show();
        return new c(ikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function0 function0, androidx.compose.ui.a0 a0Var, tx txVar, float f10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, long j12, Function2 function2, androidx.compose.foundation.layout.v6 v6Var, ll llVar, pj.n nVar, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        f(function0, a0Var, txVar, f10, q3Var, j10, j11, f11, j12, function2, v6Var, llVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    public static final boolean o(long j10) {
        return !androidx.compose.ui.graphics.q0.y(j10, androidx.compose.ui.graphics.q0.f38131b.s()) && ((double) androidx.compose.ui.graphics.s0.r(j10)) <= 0.5d;
    }

    public static final boolean p(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
