package androidx.compose.material3.internal;

import android.view.View;
import androidx.compose.material3.c7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicEdgeToEdgeDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicEdgeToEdgeDialog.android.kt\nandroidx/compose/material3/internal/BasicEdgeToEdgeDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,343:1\n75#2:344\n75#2:345\n75#2:346\n75#2:347\n75#2:348\n1282#3,6:349\n1282#3,6:355\n1282#3,6:361\n1282#3,6:367\n85#4:373\n85#4:374\n85#4:375\n66#5,5:376\n*S KotlinDebug\n*F\n+ 1 BasicEdgeToEdgeDialog.android.kt\nandroidx/compose/material3/internal/BasicEdgeToEdgeDialog_androidKt\n*L\n38#1:344\n40#1:345\n92#1:346\n93#1:347\n94#1:348\n96#1:349,6\n103#1:355,6\n129#1:361,6\n138#1:367,6\n98#1:373\n99#1:374\n100#1:375\n132#1:376,5\n*E\n"})
public final class v0 {

    @SourceDebugExtension({"SMAP\nBasicEdgeToEdgeDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicEdgeToEdgeDialog.android.kt\nandroidx/compose/material3/internal/BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,343:1\n1282#2,6:344\n70#3:350\n67#3,9:351\n77#3:390\n79#4,6:360\n86#4,3:375\n89#4,2:384\n93#4:389\n347#5,9:366\n356#5,3:386\n4206#6,6:378\n*S KotlinDebug\n*F\n+ 1 BasicEdgeToEdgeDialog.android.kt\nandroidx/compose/material3/internal/BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1\n*L\n124#1:344,6\n124#1:350\n124#1:351,9\n124#1:390\n124#1:360,6\n124#1:375,3\n124#1:384,2\n124#1:389\n124#1:366,9\n124#1:386,3\n124#1:378,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f29180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n7<Boolean> f29181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n7<Function0<Unit>> f29182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n7<pj.n<h3, androidx.compose.runtime.c0, Integer, Unit>> f29183d;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.a0 a0Var, n7<Boolean> n7Var, n7<? extends Function0<Unit>> n7Var2, n7<? extends pj.n<? super h3, ? super androidx.compose.runtime.c0, ? super Integer, Unit>> n7Var3) {
            this.f29180a = a0Var;
            this.f29181b = n7Var;
            this.f29182c = n7Var2;
            this.f29183d = n7Var3;
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
                androidx.compose.runtime.m0.A0(-635938462, i10, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog.<anonymous>.<anonymous>.<anonymous> (BasicEdgeToEdgeDialog.android.kt:115)");
            }
            h3 h3VarF = p0.f(c0Var, 0);
            p0.b(h3VarF, v0.k(this.f29181b), v0.j(this.f29182c), c0Var, 0, 0);
            androidx.compose.ui.a0 a0Var = this.f29180a;
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.internal.u0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v0.a.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0Var, false, (Function1) objI0, 1, null);
            n7<pj.n<h3, androidx.compose.runtime.c0, Integer, Unit>> n7Var = this.f29183d;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            v0.i(n7Var).invoke(h3VarF, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BasicEdgeToEdgeDialog.android.kt\nandroidx/compose/material3/internal/BasicEdgeToEdgeDialog_androidKt\n*L\n1#1,69:1\n133#2,3:70\n*E\n"})
    public static final class b implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f29184a;

        public b(z1 z1Var) {
            this.f29184a = z1Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f29184a.dismiss();
            this.f29184a.h();
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29185a;

        static {
            int[] iArr = new int[androidx.compose.ui.window.u.values().length];
            try {
                iArr[androidx.compose.ui.window.u.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.window.u.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.window.u.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29185a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:102:0x0146  */
    /* JADX WARN: Code duplicated, block: B:103:0x0148  */
    /* JADX WARN: Code duplicated, block: B:106:0x0150  */
    /* JADX WARN: Code duplicated, block: B:109:0x015e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0197  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0214  */
    /* JADX WARN: Code duplicated, block: B:124:0x021a  */
    /* JADX WARN: Code duplicated, block: B:127:0x022f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0231  */
    /* JADX WARN: Code duplicated, block: B:131:0x023b  */
    /* JADX WARN: Code duplicated, block: B:132:0x023d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0250  */
    /* JADX WARN: Code duplicated, block: B:137:0x0256  */
    /* JADX WARN: Code duplicated, block: B:143:0x0268  */
    /* JADX WARN: Code duplicated, block: B:145:0x026e  */
    /* JADX WARN: Code duplicated, block: B:151:0x027c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0282  */
    /* JADX WARN: Code duplicated, block: B:156:0x029f  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:96:0x0127  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.window.k kVar, boolean z10, boolean z11, @NotNull final pj.n<? super h3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        androidx.compose.ui.window.k kVar2;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        boolean z14;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.window.k kVar3;
        final boolean z15;
        final boolean z16;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.window.k kVar4;
        int i16;
        androidx.compose.ui.window.k kVar5;
        boolean z17;
        boolean z18;
        View view;
        androidx.compose.ui.unit.d dVar;
        final androidx.compose.ui.unit.w wVar;
        androidx.compose.runtime.p0 p0VarY;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        UUID uuid;
        n7 n7VarW;
        int i17;
        n7 n7VarW2;
        n7 n7VarW3;
        boolean zD;
        boolean z19;
        Object obj;
        final z1 z1Var;
        boolean zK0;
        Object objI1;
        boolean z20;
        int i18;
        boolean z21;
        boolean zK;
        Object objI2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(814581409);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
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
                    kVar2 = kVar;
                    if (c0VarR.D(kVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        z12 = z10;
                        int i20 = c0VarR.G(z12) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        z12 = z10;
                    }
                    i12 |= i20;
                } else {
                    z12 = z10;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        z13 = z11;
                        int i21 = c0VarR.G(z13) ? 16384 : 8192;
                        i12 |= i21;
                    } else {
                        z13 = z11;
                    }
                    i12 |= i21;
                } else {
                    z13 = z11;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                if ((i12 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            kVar4 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 8) != 0) {
                            if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            i12 &= -7169;
                            z12 = z18;
                        }
                        if ((i11 & 16) != 0) {
                            if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            i16 = i12 & (-57345);
                            z13 = z17;
                        } else {
                            i16 = i12;
                        }
                        kVar5 = kVar4;
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        i16 = i12;
                        a0Var4 = a0Var2;
                        kVar5 = kVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(814581409, i16, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog (BasicEdgeToEdgeDialog.android.kt:90)");
                    }
                    view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                    p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
                    Object[] objArr = new Object[0];
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.internal.q0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return v0.f();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr, (Function0) objI0, c0VarR, 48);
                    n7VarW = w6.w(nVar, c0VarR, (i16 >> 15) & 14);
                    i17 = i16 & 14;
                    n7VarW2 = w6.w(function0, c0VarR, i17);
                    n7VarW3 = w6.w(Boolean.valueOf(kVar5.b()), c0VarR, 0);
                    zD = c0VarR.D(view) | c0VarR.D(dVar);
                    Object objI3 = c0VarR.i0();
                    if (!zD || objI3 == aVar.a()) {
                        z1 z1Var2 = new z1(function0, kVar5, view, wVar, dVar, uuid, z12, z13);
                        z19 = true;
                        z1Var2.i(p0VarY, androidx.compose.runtime.internal.w.c(-635938462, true, new a(a0Var4, n7VarW3, n7VarW2, n7VarW)));
                        c0VarR.Y(z1Var2);
                        obj = z1Var2;
                    } else {
                        z19 = true;
                        obj = objI3;
                    }
                    z1Var = (z1) obj;
                    zK0 = c0VarR.k0(z1Var);
                    objI1 = c0VarR.i0();
                    if (zK0 || objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.internal.r0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return v0.l(z1Var, (androidx.compose.runtime.v1) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(z1Var, (Function1) objI1, c0VarR, 0);
                    boolean zK1 = c0VarR.k0(z1Var);
                    if (i17 == 4) {
                        z20 = z19;
                    } else {
                        z20 = false;
                    }
                    boolean z22 = zK1 | z20;
                    i18 = i16;
                    if ((i18 & 896) == 256) {
                        z21 = z19;
                    } else {
                        z21 = false;
                    }
                    zK = z22 | z21 | c0VarR.K(wVar.ordinal()) | (((((i18 & 7168) ^ 3072) > 2048 || !c0VarR.G(z12)) && (i18 & 3072) != 2048) ? false : z19) | (((((57344 & i18) ^ 24576) > 16384 || !c0VarR.G(z13)) && (i18 & 24576) != 16384) ? false : z19);
                    objI2 = c0VarR.i0();
                    if (zK || objI2 == aVar.a()) {
                        final androidx.compose.ui.window.k kVar6 = kVar5;
                        final boolean z23 = z12;
                        final boolean z24 = z13;
                        Function0 function1 = new Function0() { // from class: androidx.compose.material3.internal.s0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return v0.g(z1Var, function0, kVar6, wVar, z23, z24);
                            }
                        };
                        kVar5 = kVar6;
                        c0VarR.Y(function1);
                        objI2 = function1;
                    }
                    androidx.compose.runtime.b2.m((Function0) objI2, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    kVar3 = kVar5;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    kVar3 = kVar2;
                }
                z15 = z12;
                z16 = z13;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.t0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return v0.h(function0, a0Var3, kVar3, z15, z16, nVar, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            kVar2 = kVar;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    z12 = z10;
                    if (c0VarR.G(z12)) {
                    }
                    i12 |= i20;
                } else {
                    z12 = z10;
                }
                i12 |= i20;
            } else {
                z12 = z10;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                    }
                    i12 |= i21;
                } else {
                    z13 = z11;
                }
                i12 |= i21;
            } else {
                z13 = z11;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((i12 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        kVar4 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 8) != 0) {
                        if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        i12 &= -7169;
                        z12 = z18;
                    }
                    if ((i11 & 16) != 0) {
                        if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i16 = i12 & (-57345);
                        z13 = z17;
                    } else {
                        i16 = i12;
                    }
                    kVar5 = kVar4;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        kVar4 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 8) != 0) {
                        if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        i12 &= -7169;
                        z12 = z18;
                    }
                    if ((i11 & 16) != 0) {
                        if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i16 = i12 & (-57345);
                        z13 = z17;
                    } else {
                        i16 = i12;
                    }
                    kVar5 = kVar4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(814581409, i16, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog (BasicEdgeToEdgeDialog.android.kt:90)");
                }
                view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
                Object[] objArr2 = new Object[0];
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.internal.q0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return v0.f();
                        }
                    };
                    c0VarR.Y(objI0);
                }
                uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr2, (Function0) objI0, c0VarR, 48);
                n7VarW = w6.w(nVar, c0VarR, (i16 >> 15) & 14);
                i17 = i16 & 14;
                n7VarW2 = w6.w(function0, c0VarR, i17);
                n7VarW3 = w6.w(Boolean.valueOf(kVar5.b()), c0VarR, 0);
                zD = c0VarR.D(view) | c0VarR.D(dVar);
                Object objI4 = c0VarR.i0();
                if (zD) {
                    z1 z1Var3 = new z1(function0, kVar5, view, wVar, dVar, uuid, z12, z13);
                    z19 = true;
                    z1Var3.i(p0VarY, androidx.compose.runtime.internal.w.c(-635938462, true, new a(a0Var4, n7VarW3, n7VarW2, n7VarW)));
                    c0VarR.Y(z1Var3);
                    obj = z1Var3;
                } else {
                    z1 z1Var4 = new z1(function0, kVar5, view, wVar, dVar, uuid, z12, z13);
                    z19 = true;
                    z1Var4.i(p0VarY, androidx.compose.runtime.internal.w.c(-635938462, true, new a(a0Var4, n7VarW3, n7VarW2, n7VarW)));
                    c0VarR.Y(z1Var4);
                    obj = z1Var4;
                }
                z1Var = (z1) obj;
                zK0 = c0VarR.k0(z1Var);
                objI1 = c0VarR.i0();
                if (zK0) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.internal.r0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v0.l(z1Var, (androidx.compose.runtime.v1) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.internal.r0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v0.l(z1Var, (androidx.compose.runtime.v1) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.d(z1Var, (Function1) objI1, c0VarR, 0);
                boolean zK2 = c0VarR.k0(z1Var);
                if (i17 == 4) {
                    z20 = z19;
                } else {
                    z20 = false;
                }
                boolean z25 = zK2 | z20;
                i18 = i16;
                if ((i18 & 896) == 256) {
                    z21 = z19;
                } else {
                    z21 = false;
                }
                zK = z25 | z21 | c0VarR.K(wVar.ordinal()) | (((((i18 & 7168) ^ 3072) > 2048 || !c0VarR.G(z12)) && (i18 & 3072) != 2048) ? false : z19) | (((((57344 & i18) ^ 24576) > 16384 || !c0VarR.G(z13)) && (i18 & 24576) != 16384) ? false : z19);
                objI2 = c0VarR.i0();
                if (zK) {
                    final androidx.compose.ui.window.k kVar7 = kVar5;
                    final boolean z26 = z12;
                    final boolean z27 = z13;
                    Function0 function2 = new Function0() { // from class: androidx.compose.material3.internal.s0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return v0.g(z1Var, function0, kVar7, wVar, z26, z27);
                        }
                    };
                    kVar5 = kVar7;
                    c0VarR.Y(function2);
                    objI2 = function2;
                } else {
                    final androidx.compose.ui.window.k kVar8 = kVar5;
                    final boolean z28 = z12;
                    final boolean z29 = z13;
                    Function0 function3 = new Function0() { // from class: androidx.compose.material3.internal.s0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return v0.g(z1Var, function0, kVar8, wVar, z28, z29);
                        }
                    };
                    kVar5 = kVar8;
                    c0VarR.Y(function3);
                    objI2 = function3;
                }
                androidx.compose.runtime.b2.m((Function0) objI2, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                kVar3 = kVar5;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                kVar3 = kVar2;
            }
            z15 = z12;
            z16 = z13;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.t0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return v0.h(function0, a0Var3, kVar3, z15, z16, nVar, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                kVar2 = kVar;
                if (c0VarR.D(kVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    z12 = z10;
                    if (c0VarR.G(z12)) {
                    }
                    i12 |= i20;
                } else {
                    z12 = z10;
                }
                i12 |= i20;
            } else {
                z12 = z10;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                    }
                    i12 |= i21;
                } else {
                    z13 = z11;
                }
                i12 |= i21;
            } else {
                z13 = z11;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((i12 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        kVar4 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 8) != 0) {
                        if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        i12 &= -7169;
                        z12 = z18;
                    }
                    if ((i11 & 16) != 0) {
                        if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i16 = i12 & (-57345);
                        z13 = z17;
                    } else {
                        i16 = i12;
                    }
                    kVar5 = kVar4;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        kVar4 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 8) != 0) {
                        if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        i12 &= -7169;
                        z12 = z18;
                    }
                    if ((i11 & 16) != 0) {
                        if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        i16 = i12 & (-57345);
                        z13 = z17;
                    } else {
                        i16 = i12;
                    }
                    kVar5 = kVar4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(814581409, i16, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog (BasicEdgeToEdgeDialog.android.kt:90)");
                }
                view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
                p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
                Object[] objArr3 = new Object[0];
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.internal.q0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return v0.f();
                        }
                    };
                    c0VarR.Y(objI0);
                }
                uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr3, (Function0) objI0, c0VarR, 48);
                n7VarW = w6.w(nVar, c0VarR, (i16 >> 15) & 14);
                i17 = i16 & 14;
                n7VarW2 = w6.w(function0, c0VarR, i17);
                n7VarW3 = w6.w(Boolean.valueOf(kVar5.b()), c0VarR, 0);
                zD = c0VarR.D(view) | c0VarR.D(dVar);
                Object objI5 = c0VarR.i0();
                if (zD) {
                    z1 z1Var5 = new z1(function0, kVar5, view, wVar, dVar, uuid, z12, z13);
                    z19 = true;
                    z1Var5.i(p0VarY, androidx.compose.runtime.internal.w.c(-635938462, true, new a(a0Var4, n7VarW3, n7VarW2, n7VarW)));
                    c0VarR.Y(z1Var5);
                    obj = z1Var5;
                } else {
                    z1 z1Var6 = new z1(function0, kVar5, view, wVar, dVar, uuid, z12, z13);
                    z19 = true;
                    z1Var6.i(p0VarY, androidx.compose.runtime.internal.w.c(-635938462, true, new a(a0Var4, n7VarW3, n7VarW2, n7VarW)));
                    c0VarR.Y(z1Var6);
                    obj = z1Var6;
                }
                z1Var = (z1) obj;
                zK0 = c0VarR.k0(z1Var);
                objI1 = c0VarR.i0();
                if (zK0) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.internal.r0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v0.l(z1Var, (androidx.compose.runtime.v1) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.internal.r0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v0.l(z1Var, (androidx.compose.runtime.v1) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.d(z1Var, (Function1) objI1, c0VarR, 0);
                boolean zK3 = c0VarR.k0(z1Var);
                if (i17 == 4) {
                    z20 = z19;
                } else {
                    z20 = false;
                }
                boolean z210 = zK3 | z20;
                i18 = i16;
                if ((i18 & 896) == 256) {
                    z21 = z19;
                } else {
                    z21 = false;
                }
                zK = z210 | z21 | c0VarR.K(wVar.ordinal()) | (((((i18 & 7168) ^ 3072) > 2048 || !c0VarR.G(z12)) && (i18 & 3072) != 2048) ? false : z19) | (((((57344 & i18) ^ 24576) > 16384 || !c0VarR.G(z13)) && (i18 & 24576) != 16384) ? false : z19);
                objI2 = c0VarR.i0();
                if (zK) {
                    final androidx.compose.ui.window.k kVar9 = kVar5;
                    final boolean z211 = z12;
                    final boolean z212 = z13;
                    Function0 function4 = new Function0() { // from class: androidx.compose.material3.internal.s0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return v0.g(z1Var, function0, kVar9, wVar, z211, z212);
                        }
                    };
                    kVar5 = kVar9;
                    c0VarR.Y(function4);
                    objI2 = function4;
                } else {
                    final androidx.compose.ui.window.k kVar10 = kVar5;
                    final boolean z213 = z12;
                    final boolean z214 = z13;
                    Function0 function5 = new Function0() { // from class: androidx.compose.material3.internal.s0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return v0.g(z1Var, function0, kVar10, wVar, z213, z214);
                        }
                    };
                    kVar5 = kVar10;
                    c0VarR.Y(function5);
                    objI2 = function5;
                }
                androidx.compose.runtime.b2.m((Function0) objI2, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                kVar3 = kVar5;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                kVar3 = kVar2;
            }
            z15 = z12;
            z16 = z13;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.t0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return v0.h(function0, a0Var3, kVar3, z15, z16, nVar, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        kVar2 = kVar;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                z12 = z10;
                if (c0VarR.G(z12)) {
                }
                i12 |= i20;
            } else {
                z12 = z10;
            }
            i12 |= i20;
        } else {
            z12 = z10;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                }
                i12 |= i21;
            } else {
                z13 = z11;
            }
            i12 |= i21;
        } else {
            z13 = z11;
        }
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(nVar)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        if ((i12 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    kVar4 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                } else {
                    kVar4 = kVar2;
                }
                if ((i11 & 8) != 0) {
                    if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    i12 &= -7169;
                    z12 = z18;
                }
                if ((i11 & 16) != 0) {
                    if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i16 = i12 & (-57345);
                    z13 = z17;
                } else {
                    i16 = i12;
                }
                kVar5 = kVar4;
            } else {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    kVar4 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                } else {
                    kVar4 = kVar2;
                }
                if ((i11 & 8) != 0) {
                    if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    i12 &= -7169;
                    z12 = z18;
                }
                if ((i11 & 16) != 0) {
                    if (androidx.compose.ui.graphics.s0.r(((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M()) < 0.5f) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i16 = i12 & (-57345);
                    z13 = z17;
                } else {
                    i16 = i12;
                }
                kVar5 = kVar4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(814581409, i16, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog (BasicEdgeToEdgeDialog.android.kt:90)");
            }
            view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
            dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
            p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
            Object[] objArr4 = new Object[0];
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.internal.q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v0.f();
                    }
                };
                c0VarR.Y(objI0);
            }
            uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr4, (Function0) objI0, c0VarR, 48);
            n7VarW = w6.w(nVar, c0VarR, (i16 >> 15) & 14);
            i17 = i16 & 14;
            n7VarW2 = w6.w(function0, c0VarR, i17);
            n7VarW3 = w6.w(Boolean.valueOf(kVar5.b()), c0VarR, 0);
            zD = c0VarR.D(view) | c0VarR.D(dVar);
            Object objI6 = c0VarR.i0();
            if (zD) {
                z1 z1Var7 = new z1(function0, kVar5, view, wVar, dVar, uuid, z12, z13);
                z19 = true;
                z1Var7.i(p0VarY, androidx.compose.runtime.internal.w.c(-635938462, true, new a(a0Var4, n7VarW3, n7VarW2, n7VarW)));
                c0VarR.Y(z1Var7);
                obj = z1Var7;
            } else {
                z1 z1Var8 = new z1(function0, kVar5, view, wVar, dVar, uuid, z12, z13);
                z19 = true;
                z1Var8.i(p0VarY, androidx.compose.runtime.internal.w.c(-635938462, true, new a(a0Var4, n7VarW3, n7VarW2, n7VarW)));
                c0VarR.Y(z1Var8);
                obj = z1Var8;
            }
            z1Var = (z1) obj;
            zK0 = c0VarR.k0(z1Var);
            objI1 = c0VarR.i0();
            if (zK0) {
                objI1 = new Function1() { // from class: androidx.compose.material3.internal.r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v0.l(z1Var, (androidx.compose.runtime.v1) obj2);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function1() { // from class: androidx.compose.material3.internal.r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v0.l(z1Var, (androidx.compose.runtime.v1) obj2);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.b2.d(z1Var, (Function1) objI1, c0VarR, 0);
            boolean zK4 = c0VarR.k0(z1Var);
            if (i17 == 4) {
                z20 = z19;
            } else {
                z20 = false;
            }
            boolean z215 = zK4 | z20;
            i18 = i16;
            if ((i18 & 896) == 256) {
                z21 = z19;
            } else {
                z21 = false;
            }
            zK = z215 | z21 | c0VarR.K(wVar.ordinal()) | (((((i18 & 7168) ^ 3072) > 2048 || !c0VarR.G(z12)) && (i18 & 3072) != 2048) ? false : z19) | (((((57344 & i18) ^ 24576) > 16384 || !c0VarR.G(z13)) && (i18 & 24576) != 16384) ? false : z19);
            objI2 = c0VarR.i0();
            if (zK) {
                final androidx.compose.ui.window.k kVar11 = kVar5;
                final boolean z216 = z12;
                final boolean z217 = z13;
                Function0 function6 = new Function0() { // from class: androidx.compose.material3.internal.s0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v0.g(z1Var, function0, kVar11, wVar, z216, z217);
                    }
                };
                kVar5 = kVar11;
                c0VarR.Y(function6);
                objI2 = function6;
            } else {
                final androidx.compose.ui.window.k kVar12 = kVar5;
                final boolean z218 = z12;
                final boolean z219 = z13;
                Function0 function7 = new Function0() { // from class: androidx.compose.material3.internal.s0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v0.g(z1Var, function0, kVar12, wVar, z218, z219);
                    }
                };
                kVar5 = kVar12;
                c0VarR.Y(function7);
                objI2 = function7;
            }
            androidx.compose.runtime.b2.m((Function0) objI2, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            kVar3 = kVar5;
            a0Var3 = a0Var4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            kVar3 = kVar2;
        }
        z15 = z12;
        z16 = z13;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.t0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return v0.h(function0, a0Var3, kVar3, z15, z16, nVar, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID f() {
        return UUID.randomUUID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(z1 z1Var, Function0 function0, androidx.compose.ui.window.k kVar, androidx.compose.ui.unit.w wVar, boolean z10, boolean z11) {
        z1Var.l(function0, kVar, wVar, z10, z11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.ui.window.k kVar, boolean z10, boolean z11, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(function0, a0Var, kVar, z10, z11, nVar, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pj.n<h3, androidx.compose.runtime.c0, Integer, Unit> i(n7<? extends pj.n<? super h3, ? super androidx.compose.runtime.c0, ? super Integer, Unit>> n7Var) {
        return (pj.n) n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> j(n7<? extends Function0<Unit>> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 l(z1 z1Var, androidx.compose.runtime.v1 v1Var) {
        z1Var.show();
        return new b(z1Var);
    }

    public static final boolean p(@NotNull androidx.compose.ui.window.u uVar, boolean z10) {
        int i10 = c.f29185a[uVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new kotlin.k0();
    }
}
