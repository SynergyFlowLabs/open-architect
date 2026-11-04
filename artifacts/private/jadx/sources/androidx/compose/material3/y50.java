package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nTimePickerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePickerDialog.kt\nandroidx/compose/material3/TimePickerDialogDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n*L\n1#1,336:1\n113#2:337\n113#2:340\n240#3:338\n243#3:339\n*S KotlinDebug\n*F\n+ 1 TimePickerDialog.kt\nandroidx/compose/material3/TimePickerDialogDefaults\n*L\n297#1:337\n250#1:340\n302#1:338\n304#1:339\n*E\n"})
public final class y50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y50 f34707a = new y50();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f34708b = androidx.compose.ui.unit.h.r(300);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34709c = 0;

    @SourceDebugExtension({"SMAP\nTimePickerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePickerDialog.kt\nandroidx/compose/material3/TimePickerDialogDefaults$DisplayModeToggle$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n*L\n1#1,336:1\n249#2:337\n246#2:338\n*S KotlinDebug\n*F\n+ 1 TimePickerDialog.kt\nandroidx/compose/material3/TimePickerDialogDefaults$DisplayModeToggle$1\n*L\n279#1:337\n281#1:338\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34710a;

        a(int i10) {
            this.f34710a = i10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            int iB;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-698026161, i10, -1, "androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle.<anonymous> (TimePickerDialog.kt:266)");
            }
            int i11 = this.f34710a;
            e60.a aVar = e60.f27282b;
            androidx.compose.ui.graphics.vector.d dVarA = e60.f(i11, aVar.b()) ? androidx.compose.material3.internal.p2.c.f29076a.a() : androidx.compose.material3.internal.p2.c.f29076a.b();
            if (e60.f(this.f34710a, aVar.b())) {
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                iB = androidx.compose.material3.internal.l3.b(ps.b.f31845j0);
            } else {
                androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                iB = androidx.compose.material3.internal.l3.b(ps.b.f31843i0);
            }
            ni.p(dVarA, androidx.compose.material3.internal.m3.b(iB, c0Var, 0), null, 0L, c0Var, 0, 12);
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

    private y50() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(y50 y50Var, Function0 function0, int i10, androidx.compose.ui.a0 a0Var, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        y50Var.c(function0, i10, a0Var, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(y50 y50Var, int i10, androidx.compose.ui.a0 a0Var, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        y50Var.e(i10, a0Var, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void c(@NotNull final Function0<Unit> function0, final int i10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        Function0<Unit> function1;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1283607635);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i11 & 6) == 0) {
                i13 = (c0VarR.k0(function1) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= c0VarR.K(i10) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 == 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i13 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1283607635, i13, -1, "androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle (TimePickerDialog.kt:264)");
                }
                ei.D(function1, a0Var4, false, null, null, null, androidx.compose.runtime.internal.w.e(-698026161, true, new a(i10), c0VarR, 54), c0VarR, (i13 & 14) | 1572864 | ((i13 >> 3) & com.planner5d.library.engine.input.f.b.B), 60);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.x50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return y50.d(this.f34388a, function0, i10, a0Var3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        if ((i13 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            if (i14 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1283607635, i13, -1, "androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle (TimePickerDialog.kt:264)");
            }
            ei.D(function1, a0Var4, false, null, null, null, androidx.compose.runtime.internal.w.e(-698026161, true, new a(i10), c0VarR, 54), c0VarR, (i13 & 14) | 1572864 | ((i13 >> 3) & com.planner5d.library.engine.input.f.b.B), 60);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.x50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y50.d(this.f34388a, function0, i10, a0Var3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void e(final int i10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int iB;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1546564986);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = i11 | (c0VarR.K(i10) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i13 & 19) != 18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1546564986, i13, -1, "androidx.compose.material3.TimePickerDialogDefaults.Title (TimePickerDialog.kt:294)");
                }
                androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(a0Var4, 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(20), 7, null);
                androidx.compose.ui.a0 a0Var5 = a0Var4;
                androidx.compose.ui.text.y3 y3VarY = pj.f31758a.e(c0VarR, 6).y();
                if (e60.f(i10, e60.f27282b.b())) {
                    androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                    iB = androidx.compose.material3.internal.l3.b(ps.b.W);
                } else {
                    androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                    iB = androidx.compose.material3.internal.l3.b(ps.b.U);
                }
                c0Var2 = c0VarR;
                q50.t(androidx.compose.material3.internal.m3.b(iB, c0VarR, 0), a0VarV, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3VarY, c0Var2, 0, 0, 131068);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.w50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return y50.f(this.f34156a, i10, a0Var3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            if (i14 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1546564986, i13, -1, "androidx.compose.material3.TimePickerDialogDefaults.Title (TimePickerDialog.kt:294)");
            }
            androidx.compose.ui.a0 a0VarV2 = androidx.compose.foundation.layout.d5.v(a0Var4, 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(20), 7, null);
            androidx.compose.ui.a0 a0Var6 = a0Var4;
            androidx.compose.ui.text.y3 y3VarY2 = pj.f31758a.e(c0VarR, 6).y();
            if (e60.f(i10, e60.f27282b.b())) {
                androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                iB = androidx.compose.material3.internal.l3.b(ps.b.W);
            } else {
                androidx.compose.material3.internal.l3.a aVar4 = androidx.compose.material3.internal.l3.f29010b;
                iB = androidx.compose.material3.internal.l3.b(ps.b.U);
            }
            c0Var2 = c0VarR;
            q50.t(androidx.compose.material3.internal.m3.b(iB, c0VarR, 0), a0VarV2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3VarY2, c0Var2, 0, 0, 131068);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var6;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.w50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y50.f(this.f34156a, i10, a0Var3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-443775449, i10, -1, "androidx.compose.material3.TimePickerDialogDefaults.<get-containerColor> (TimePickerDialog.kt:242)");
        }
        long jR = o6.r(d0.y.f269322a.f(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float h() {
        return f34708b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1241096723, i10, -1, "androidx.compose.material3.TimePickerDialogDefaults.<get-shape> (TimePickerDialog.kt:246)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.y.f269322a.h(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }
}
