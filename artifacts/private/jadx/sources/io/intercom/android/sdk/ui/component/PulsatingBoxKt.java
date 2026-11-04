package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.q3;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPulsatingBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PulsatingBox.kt\nio/intercom/android/sdk/ui/component/PulsatingBoxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,79:1\n1282#2,6:80\n*S KotlinDebug\n*F\n+ 1 PulsatingBox.kt\nio/intercom/android/sdk/ui/component/PulsatingBoxKt\n*L\n33#1:80,6\n*E\n"})
public final class PulsatingBoxKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x019a  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x0127  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: PulsatingBox-FU0evQE, reason: not valid java name */
    public static final void m612PulsatingBoxFU0evQE(@Nullable androidx.compose.ui.a0 a0Var, final float f10, long j10, @Nullable q3 q3Var, boolean z10, @NotNull final pj.n<? super androidx.compose.foundation.layout.c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> content, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        final long jM684getAction0d7_KjU;
        final q3 q3VarC;
        boolean z11;
        int i13;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.ui.a0 a0Var4;
        Object objI0;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var5;
        final q3 q3Var2;
        final long j11;
        final boolean z12;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-63498318);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM684getAction0d7_KjU = j10;
                int i15 = c0VarR.L(jM684getAction0d7_KjU) ? 256 : 128;
                i12 |= i15;
            } else {
                jM684getAction0d7_KjU = j10;
            }
            i12 |= i15;
        } else {
            jM684getAction0d7_KjU = j10;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                q3VarC = q3Var;
                int i16 = c0VarR.D(q3VarC) ? 2048 : 1024;
                i12 |= i16;
            } else {
                q3VarC = q3Var;
            }
            i12 |= i16;
        } else {
            q3VarC = q3Var;
        }
        int i17 = i11 & 16;
        if (i17 == 0) {
            if ((57344 & i10) == 0) {
                z11 = z10;
                i12 |= c0VarR.G(z11) ? 16384 : 8192;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.k0(content)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                }
                if ((374491 & i12) == 74898 || !c0VarR.d()) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i14 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarC = androidx.compose.foundation.shape.o.c(50);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        a0Var4 = a0Var3;
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        i12 = i12;
                        jM684getAction0d7_KjU = jM684getAction0d7_KjU;
                        q3VarC = q3VarC;
                        a0Var4 = a0Var2;
                    }
                    c0VarR.Z();
                    c0VarR.E(-1108114118);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.animation.core.d.b(1.0f, 0.0f, 2, null);
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.animation.core.c cVar = (androidx.compose.animation.core.c) objI0;
                    c0VarR.A();
                    b2.i(Float.valueOf(f10), new PulsatingBoxKt$PulsatingBox$1(cVar, f10, null), c0VarR, ((i12 >> 3) & 14) | 64);
                    final boolean z13 = z11;
                    long j12 = jM684getAction0d7_KjU;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var6 = a0Var4;
                    androidx.compose.foundation.layout.g0.c(a0Var6, androidx.compose.ui.e.f37317a.i(), false, androidx.compose.runtime.internal.w.e(526284572, true, new pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(h0Var, c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var3, int i18) {
                            int i19;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i18 & 14) == 0) {
                                i19 = i18 | (c0Var3.D(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i19 = i18;
                            }
                            if ((i19 & 91) == 18 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            c0Var3.E(1154915079);
                            if (z13) {
                                androidx.compose.foundation.layout.x.b(BoxWithConstraints.b(androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(androidx.compose.ui.draw.v.a(i6.y(androidx.compose.ui.a0.E, BoxWithConstraints.c(), BoxWithConstraints.g()), cVar.v().floatValue()), androidx.compose.ui.unit.h.r(2), q3VarC, false, 0L, 0L, 28, null), jM684getAction0d7_KjU, q3VarC), androidx.compose.ui.e.f37317a.i()), c0Var3, 0);
                            }
                            c0Var3.A();
                            content.invoke(BoxWithConstraints, c0Var3, Integer.valueOf(i19 & 14));
                        }
                    }, c0VarR, 54), c0Var2, (i12 & 14) | 3120, 4);
                    a0Var5 = a0Var6;
                    q3Var2 = q3VarC;
                    j11 = j12;
                } else {
                    c0VarR.u();
                    c0Var2 = c0VarR;
                    a0Var5 = a0Var2;
                    j11 = jM684getAction0d7_KjU;
                    q3Var2 = q3VarC;
                }
                z12 = z11;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.k0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$1(a0Var5, f10, j11, q3Var2, z12, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i13;
            if ((374491 & i12) == 74898) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarC = androidx.compose.foundation.shape.o.c(50);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    a0Var4 = a0Var3;
                } else {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarC = androidx.compose.foundation.shape.o.c(50);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    a0Var4 = a0Var3;
                }
                c0VarR.Z();
                c0VarR.E(-1108114118);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.animation.core.d.b(1.0f, 0.0f, 2, null);
                    c0VarR.Y(objI0);
                }
                final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar2 = (androidx.compose.animation.core.c) objI0;
                c0VarR.A();
                b2.i(Float.valueOf(f10), new PulsatingBoxKt$PulsatingBox$1(cVar2, f10, null), c0VarR, ((i12 >> 3) & 14) | 64);
                final boolean z14 = z11;
                long j13 = jM684getAction0d7_KjU;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var7 = a0Var4;
                androidx.compose.foundation.layout.g0.c(a0Var7, androidx.compose.ui.e.f37317a.i(), false, androidx.compose.runtime.internal.w.e(526284572, true, new pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(h0Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var3, int i18) {
                        int i19;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i18 & 14) == 0) {
                            i19 = i18 | (c0Var3.D(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i19 = i18;
                        }
                        if ((i19 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        c0Var3.E(1154915079);
                        if (z14) {
                            androidx.compose.foundation.layout.x.b(BoxWithConstraints.b(androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(androidx.compose.ui.draw.v.a(i6.y(androidx.compose.ui.a0.E, BoxWithConstraints.c(), BoxWithConstraints.g()), cVar2.v().floatValue()), androidx.compose.ui.unit.h.r(2), q3VarC, false, 0L, 0L, 28, null), jM684getAction0d7_KjU, q3VarC), androidx.compose.ui.e.f37317a.i()), c0Var3, 0);
                        }
                        c0Var3.A();
                        content.invoke(BoxWithConstraints, c0Var3, Integer.valueOf(i19 & 14));
                    }
                }, c0VarR, 54), c0Var2, (i12 & 14) | 3120, 4);
                a0Var5 = a0Var7;
                q3Var2 = q3VarC;
                j11 = j13;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarC = androidx.compose.foundation.shape.o.c(50);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    a0Var4 = a0Var3;
                } else {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarC = androidx.compose.foundation.shape.o.c(50);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    a0Var4 = a0Var3;
                }
                c0VarR.Z();
                c0VarR.E(-1108114118);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.animation.core.d.b(1.0f, 0.0f, 2, null);
                    c0VarR.Y(objI0);
                }
                final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar3 = (androidx.compose.animation.core.c) objI0;
                c0VarR.A();
                b2.i(Float.valueOf(f10), new PulsatingBoxKt$PulsatingBox$1(cVar3, f10, null), c0VarR, ((i12 >> 3) & 14) | 64);
                final boolean z15 = z11;
                long j14 = jM684getAction0d7_KjU;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var8 = a0Var4;
                androidx.compose.foundation.layout.g0.c(a0Var8, androidx.compose.ui.e.f37317a.i(), false, androidx.compose.runtime.internal.w.e(526284572, true, new pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(h0Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var3, int i18) {
                        int i19;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i18 & 14) == 0) {
                            i19 = i18 | (c0Var3.D(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i19 = i18;
                        }
                        if ((i19 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        c0Var3.E(1154915079);
                        if (z15) {
                            androidx.compose.foundation.layout.x.b(BoxWithConstraints.b(androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(androidx.compose.ui.draw.v.a(i6.y(androidx.compose.ui.a0.E, BoxWithConstraints.c(), BoxWithConstraints.g()), cVar3.v().floatValue()), androidx.compose.ui.unit.h.r(2), q3VarC, false, 0L, 0L, 28, null), jM684getAction0d7_KjU, q3VarC), androidx.compose.ui.e.f37317a.i()), c0Var3, 0);
                        }
                        c0Var3.A();
                        content.invoke(BoxWithConstraints, c0Var3, Integer.valueOf(i19 & 14));
                    }
                }, c0VarR, 54), c0Var2, (i12 & 14) | 3120, 4);
                a0Var5 = a0Var8;
                q3Var2 = q3VarC;
                j11 = j14;
            }
            z12 = z11;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.k0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$1(a0Var5, f10, j11, q3Var2, z12, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z11 = z10;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c0VarR.k0(content)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarC = androidx.compose.foundation.shape.o.c(50);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    a0Var4 = a0Var3;
                } else {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarC = androidx.compose.foundation.shape.o.c(50);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    a0Var4 = a0Var3;
                }
                c0VarR.Z();
                c0VarR.E(-1108114118);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.animation.core.d.b(1.0f, 0.0f, 2, null);
                    c0VarR.Y(objI0);
                }
                final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar4 = (androidx.compose.animation.core.c) objI0;
                c0VarR.A();
                b2.i(Float.valueOf(f10), new PulsatingBoxKt$PulsatingBox$1(cVar4, f10, null), c0VarR, ((i12 >> 3) & 14) | 64);
                final boolean z16 = z11;
                long j15 = jM684getAction0d7_KjU;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var9 = a0Var4;
                androidx.compose.foundation.layout.g0.c(a0Var9, androidx.compose.ui.e.f37317a.i(), false, androidx.compose.runtime.internal.w.e(526284572, true, new pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(h0Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var3, int i18) {
                        int i19;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i18 & 14) == 0) {
                            i19 = i18 | (c0Var3.D(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i19 = i18;
                        }
                        if ((i19 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        c0Var3.E(1154915079);
                        if (z16) {
                            androidx.compose.foundation.layout.x.b(BoxWithConstraints.b(androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(androidx.compose.ui.draw.v.a(i6.y(androidx.compose.ui.a0.E, BoxWithConstraints.c(), BoxWithConstraints.g()), cVar4.v().floatValue()), androidx.compose.ui.unit.h.r(2), q3VarC, false, 0L, 0L, 28, null), jM684getAction0d7_KjU, q3VarC), androidx.compose.ui.e.f37317a.i()), c0Var3, 0);
                        }
                        c0Var3.A();
                        content.invoke(BoxWithConstraints, c0Var3, Integer.valueOf(i19 & 14));
                    }
                }, c0VarR, 54), c0Var2, (i12 & 14) | 3120, 4);
                a0Var5 = a0Var9;
                q3Var2 = q3VarC;
                j11 = j15;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarC = androidx.compose.foundation.shape.o.c(50);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    a0Var4 = a0Var3;
                } else {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarC = androidx.compose.foundation.shape.o.c(50);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    a0Var4 = a0Var3;
                }
                c0VarR.Z();
                c0VarR.E(-1108114118);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.animation.core.d.b(1.0f, 0.0f, 2, null);
                    c0VarR.Y(objI0);
                }
                final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar5 = (androidx.compose.animation.core.c) objI0;
                c0VarR.A();
                b2.i(Float.valueOf(f10), new PulsatingBoxKt$PulsatingBox$1(cVar5, f10, null), c0VarR, ((i12 >> 3) & 14) | 64);
                final boolean z17 = z11;
                long j16 = jM684getAction0d7_KjU;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var10 = a0Var4;
                androidx.compose.foundation.layout.g0.c(a0Var10, androidx.compose.ui.e.f37317a.i(), false, androidx.compose.runtime.internal.w.e(526284572, true, new pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(h0Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var3, int i18) {
                        int i19;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i18 & 14) == 0) {
                            i19 = i18 | (c0Var3.D(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i19 = i18;
                        }
                        if ((i19 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        c0Var3.E(1154915079);
                        if (z17) {
                            androidx.compose.foundation.layout.x.b(BoxWithConstraints.b(androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(androidx.compose.ui.draw.v.a(i6.y(androidx.compose.ui.a0.E, BoxWithConstraints.c(), BoxWithConstraints.g()), cVar5.v().floatValue()), androidx.compose.ui.unit.h.r(2), q3VarC, false, 0L, 0L, 28, null), jM684getAction0d7_KjU, q3VarC), androidx.compose.ui.e.f37317a.i()), c0Var3, 0);
                        }
                        c0Var3.A();
                        content.invoke(BoxWithConstraints, c0Var3, Integer.valueOf(i19 & 14));
                    }
                }, c0VarR, 54), c0Var2, (i12 & 14) | 3120, 4);
                a0Var5 = a0Var10;
                q3Var2 = q3VarC;
                j11 = j16;
            }
            z12 = z11;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.k0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$1(a0Var5, f10, j11, q3Var2, z12, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 = androidx.profileinstaller.n.c.f73814m;
        i12 |= i13;
        if ((374491 & i12) == 74898) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarC = androidx.compose.foundation.shape.o.c(50);
                }
                if (i17 != 0) {
                    z11 = true;
                }
                a0Var4 = a0Var3;
            } else {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarC = androidx.compose.foundation.shape.o.c(50);
                }
                if (i17 != 0) {
                    z11 = true;
                }
                a0Var4 = a0Var3;
            }
            c0VarR.Z();
            c0VarR.E(-1108114118);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.animation.core.d.b(1.0f, 0.0f, 2, null);
                c0VarR.Y(objI0);
            }
            final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar6 = (androidx.compose.animation.core.c) objI0;
            c0VarR.A();
            b2.i(Float.valueOf(f10), new PulsatingBoxKt$PulsatingBox$1(cVar6, f10, null), c0VarR, ((i12 >> 3) & 14) | 64);
            final boolean z18 = z11;
            long j17 = jM684getAction0d7_KjU;
            c0Var2 = c0VarR;
            androidx.compose.ui.a0 a0Var11 = a0Var4;
            androidx.compose.foundation.layout.g0.c(a0Var11, androidx.compose.ui.e.f37317a.i(), false, androidx.compose.runtime.internal.w.e(526284572, true, new pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(h0Var, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var3, int i18) {
                    int i19;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i18 & 14) == 0) {
                        i19 = i18 | (c0Var3.D(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i19 = i18;
                    }
                    if ((i19 & 91) == 18 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    c0Var3.E(1154915079);
                    if (z18) {
                        androidx.compose.foundation.layout.x.b(BoxWithConstraints.b(androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(androidx.compose.ui.draw.v.a(i6.y(androidx.compose.ui.a0.E, BoxWithConstraints.c(), BoxWithConstraints.g()), cVar6.v().floatValue()), androidx.compose.ui.unit.h.r(2), q3VarC, false, 0L, 0L, 28, null), jM684getAction0d7_KjU, q3VarC), androidx.compose.ui.e.f37317a.i()), c0Var3, 0);
                    }
                    c0Var3.A();
                    content.invoke(BoxWithConstraints, c0Var3, Integer.valueOf(i19 & 14));
                }
            }, c0VarR, 54), c0Var2, (i12 & 14) | 3120, 4);
            a0Var5 = a0Var11;
            q3Var2 = q3VarC;
            j11 = j17;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarC = androidx.compose.foundation.shape.o.c(50);
                }
                if (i17 != 0) {
                    z11 = true;
                }
                a0Var4 = a0Var3;
            } else {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarC = androidx.compose.foundation.shape.o.c(50);
                }
                if (i17 != 0) {
                    z11 = true;
                }
                a0Var4 = a0Var3;
            }
            c0VarR.Z();
            c0VarR.E(-1108114118);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.animation.core.d.b(1.0f, 0.0f, 2, null);
                c0VarR.Y(objI0);
            }
            final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar7 = (androidx.compose.animation.core.c) objI0;
            c0VarR.A();
            b2.i(Float.valueOf(f10), new PulsatingBoxKt$PulsatingBox$1(cVar7, f10, null), c0VarR, ((i12 >> 3) & 14) | 64);
            final boolean z19 = z11;
            long j18 = jM684getAction0d7_KjU;
            c0Var2 = c0VarR;
            androidx.compose.ui.a0 a0Var12 = a0Var4;
            androidx.compose.foundation.layout.g0.c(a0Var12, androidx.compose.ui.e.f37317a.i(), false, androidx.compose.runtime.internal.w.e(526284572, true, new pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(h0Var, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var3, int i18) {
                    int i19;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i18 & 14) == 0) {
                        i19 = i18 | (c0Var3.D(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i19 = i18;
                    }
                    if ((i19 & 91) == 18 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    c0Var3.E(1154915079);
                    if (z19) {
                        androidx.compose.foundation.layout.x.b(BoxWithConstraints.b(androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(androidx.compose.ui.draw.v.a(i6.y(androidx.compose.ui.a0.E, BoxWithConstraints.c(), BoxWithConstraints.g()), cVar7.v().floatValue()), androidx.compose.ui.unit.h.r(2), q3VarC, false, 0L, 0L, 28, null), jM684getAction0d7_KjU, q3VarC), androidx.compose.ui.e.f37317a.i()), c0Var3, 0);
                    }
                    c0Var3.A();
                    content.invoke(BoxWithConstraints, c0Var3, Integer.valueOf(i19 & 14));
                }
            }, c0VarR, 54), c0Var2, (i12 & 14) | 3120, 4);
            a0Var5 = a0Var12;
            q3Var2 = q3VarC;
            j11 = j18;
        }
        z12 = z11;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$1(a0Var5, f10, j11, q3Var2, z12, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PulsatingBoxPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2057763747);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 5 | 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PulsatingBoxKt.INSTANCE.m587getLambda2$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PulsatingBoxKt.PulsatingBoxPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PulsatingBoxPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PulsatingBoxPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PulsatingBox_FU0evQE$lambda$1(androidx.compose.ui.a0 a0Var, float f10, long j10, q3 q3Var, boolean z10, pj.n content, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(content, "$content");
        m612PulsatingBoxFU0evQE(a0Var, f10, j10, q3Var, z10, content, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
