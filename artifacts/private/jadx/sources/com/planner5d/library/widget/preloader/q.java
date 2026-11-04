package com.planner5d.library.widget.preloader;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.m0;
import androidx.compose.material3.d4;
import androidx.compose.material3.e4;
import androidx.compose.material3.m4;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.text.a1;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import com.planner5d.library.widget.c1;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    @SourceDebugExtension({"SMAP\nPreloaderBoxV3View.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderBoxV3View.kt\ncom/planner5d/library/widget/preloader/PreloaderBoxV3ViewKt$PreloaderBoxV3View$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,93:1\n113#2:94\n113#2:95\n*S KotlinDebug\n*F\n+ 1 PreloaderBoxV3View.kt\ncom/planner5d/library/widget/preloader/PreloaderBoxV3ViewKt$PreloaderBoxV3View$1\n*L\n51#1:94\n57#1:95\n*E\n"})
    static final class a implements pj.n<m0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f258566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f258567b;

        a(String str, String str2) {
            this.f258566a = str;
            this.f258567b = str2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(m0 Card, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i10 & 17) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1567186466, i10, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3View.<anonymous> (PreloaderBoxV3View.kt:38)");
            }
            float fB = u0.f.b(c1.f.Dd, c0Var, 0);
            float fB2 = u0.f.b(c1.f.f251328wd, c0Var, 0);
            String str = this.f258566a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarV = d5.v(aVar, fB2, fB, fB2, 0.0f, 8, null);
            long jA = u0.a.a(c1.e.f250830vl, c0Var, 0);
            ab.b bVar = ab.b.f589a;
            long jB = bVar.b(c0Var, ab.b.f591c);
            v0.a aVar2 = v0.f41742b;
            v0 v0VarC = aVar2.c();
            androidx.compose.ui.text.font.y yVarA = bVar.a();
            cb.a aVar3 = cb.a.f82538a;
            float fB3 = u0.f.b(c1.f.Ad, c0Var, 0);
            int i11 = cb.a.f82539b;
            long jB2 = aVar3.b(fB3, c0Var, i11 << 3);
            androidx.compose.ui.text.style.v.a aVar4 = androidx.compose.ui.text.style.v.f42256b;
            q50.t(str, a0VarV, jA, null, jB, null, v0VarC, yVarA, 0L, null, null, jB2, aVar4.c(), false, 1, 0, null, new y3(0L, 0L, (v0) null, (q0) null, (r0) null, (androidx.compose.ui.text.font.y) null, (String) null, androidx.compose.ui.unit.a0.m(0), (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (androidx.compose.ui.text.style.s) null, (a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, 16777087, (DefaultConstructorMarker) null), c0Var, 1572864, 12607872, 108328);
            String str2 = this.f258567b;
            if (str2 == null || StringsKt.w3(str2)) {
                c0Var.E(1435932973);
                l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(19)), c0Var, 6);
                c0Var.A();
            } else {
                c0Var.E(1436026376);
                q50.t(this.f258567b, d5.u(aVar, fB2, u0.f.b(c1.f.Ed, c0Var, 0), fB2, androidx.compose.ui.unit.h.r(17)), u0.a.a(c1.e.Ye, c0Var, 0), null, aVar3.a(c1.f.f251196p3, c0Var, i11 << 3), null, aVar2.k(), bVar.a(), 0L, null, null, aVar3.b(fB, c0Var, i11 << 3), aVar4.c(), false, 1, 0, null, new y3(0L, 0L, (v0) null, (q0) null, (r0) null, (androidx.compose.ui.text.font.y) null, (String) null, androidx.compose.ui.unit.a0.m(0), (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (androidx.compose.ui.text.style.s) null, (a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, 16777087, (DefaultConstructorMarker) null), c0Var, 1572864, 12607872, 108328);
                c0Var.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@NotNull final String title, @Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        String str2;
        int i14;
        androidx.compose.ui.a0 a0Var3;
        String str3;
        androidx.compose.runtime.c0 c0Var2;
        final String str4;
        final androidx.compose.ui.a0 a0Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(title, "title");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(514564052);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(title) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    str2 = str;
                    if (c0VarR.D(str2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & com.planner5d.library.engine.input.f.b.F1) == 146 || !c0VarR.d()) {
                    if (i15 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(514564052, i12, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3View (PreloaderBoxV3View.kt:30)");
                    }
                    long jA = u0.a.a(c1.e.f250580l1, c0VarR, 0);
                    a0Var2 = a0Var3;
                    m4.g(a0Var2, androidx.compose.foundation.shape.o.h(u0.f.b(c1.f.Rc, c0VarR, 0)), new d4(jA, jA, jA, jA, null), e4.f27241a.c(u0.f.b(c1.f.f251063hd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, e4.f27242b << 18, 62), null, androidx.compose.runtime.internal.w.e(1567186466, true, new a(title, str3), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 16);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str4 = str3;
                } else {
                    c0VarR.u();
                    str4 = str2;
                    c0Var2 = c0VarR;
                }
                a0Var4 = a0Var2;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.widget.preloader.o
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return q.e(title, a0Var4, str4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            str2 = str;
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) == 146) {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(514564052, i12, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3View (PreloaderBoxV3View.kt:30)");
                }
                long jA2 = u0.a.a(c1.e.f250580l1, c0VarR, 0);
                a0Var2 = a0Var3;
                m4.g(a0Var2, androidx.compose.foundation.shape.o.h(u0.f.b(c1.f.Rc, c0VarR, 0)), new d4(jA2, jA2, jA2, jA2, null), e4.f27241a.c(u0.f.b(c1.f.f251063hd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, e4.f27242b << 18, 62), null, androidx.compose.runtime.internal.w.e(1567186466, true, new a(title, str3), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 16);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str4 = str3;
            } else {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(514564052, i12, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3View (PreloaderBoxV3View.kt:30)");
                }
                long jA3 = u0.a.a(c1.e.f250580l1, c0VarR, 0);
                a0Var2 = a0Var3;
                m4.g(a0Var2, androidx.compose.foundation.shape.o.h(u0.f.b(c1.f.Rc, c0VarR, 0)), new d4(jA3, jA3, jA3, jA3, null), e4.f27241a.c(u0.f.b(c1.f.f251063hd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, e4.f27242b << 18, 62), null, androidx.compose.runtime.internal.w.e(1567186466, true, new a(title, str3), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 16);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str4 = str3;
            }
            a0Var4 = a0Var2;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.widget.preloader.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return q.e(title, a0Var4, str4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                str2 = str;
                if (c0VarR.D(str2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) == 146) {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(514564052, i12, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3View (PreloaderBoxV3View.kt:30)");
                }
                long jA4 = u0.a.a(c1.e.f250580l1, c0VarR, 0);
                a0Var2 = a0Var3;
                m4.g(a0Var2, androidx.compose.foundation.shape.o.h(u0.f.b(c1.f.Rc, c0VarR, 0)), new d4(jA4, jA4, jA4, jA4, null), e4.f27241a.c(u0.f.b(c1.f.f251063hd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, e4.f27242b << 18, 62), null, androidx.compose.runtime.internal.w.e(1567186466, true, new a(title, str3), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 16);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str4 = str3;
            } else {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(514564052, i12, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3View (PreloaderBoxV3View.kt:30)");
                }
                long jA5 = u0.a.a(c1.e.f250580l1, c0VarR, 0);
                a0Var2 = a0Var3;
                m4.g(a0Var2, androidx.compose.foundation.shape.o.h(u0.f.b(c1.f.Rc, c0VarR, 0)), new d4(jA5, jA5, jA5, jA5, null), e4.f27241a.c(u0.f.b(c1.f.f251063hd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, e4.f27242b << 18, 62), null, androidx.compose.runtime.internal.w.e(1567186466, true, new a(title, str3), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 16);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str4 = str3;
            }
            a0Var4 = a0Var2;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.widget.preloader.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return q.e(title, a0Var4, str4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        str2 = str;
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) == 146) {
            if (i15 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(514564052, i12, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3View (PreloaderBoxV3View.kt:30)");
            }
            long jA6 = u0.a.a(c1.e.f250580l1, c0VarR, 0);
            a0Var2 = a0Var3;
            m4.g(a0Var2, androidx.compose.foundation.shape.o.h(u0.f.b(c1.f.Rc, c0VarR, 0)), new d4(jA6, jA6, jA6, jA6, null), e4.f27241a.c(u0.f.b(c1.f.f251063hd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, e4.f27242b << 18, 62), null, androidx.compose.runtime.internal.w.e(1567186466, true, new a(title, str3), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 16);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str4 = str3;
        } else {
            if (i15 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(514564052, i12, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3View (PreloaderBoxV3View.kt:30)");
            }
            long jA7 = u0.a.a(c1.e.f250580l1, c0VarR, 0);
            a0Var2 = a0Var3;
            m4.g(a0Var2, androidx.compose.foundation.shape.o.h(u0.f.b(c1.f.Rc, c0VarR, 0)), new d4(jA7, jA7, jA7, jA7, null), e4.f27241a.c(u0.f.b(c1.f.f251063hd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, e4.f27242b << 18, 62), null, androidx.compose.runtime.internal.w.e(1567186466, true, new a(title, str3), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 16);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str4 = str3;
        }
        a0Var4 = a0Var2;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.widget.preloader.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.e(title, a0Var4, str4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, androidx.compose.ui.a0 a0Var, String str2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(str, a0Var, str2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(widthDp = 390)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void f(androidx.compose.runtime.c0 c0Var, final int i10) throws IOException {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1049816317);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1049816317, i10, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3ViewPreview (PreloaderBoxV3View.kt:71)");
            }
            cb.c.b("ZhtCzUWrigcr6Us44jMy4l", "498:52707", com.planner5d.library.widget.preloader.a.f258516a.a(), c0VarR, 438);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.widget.preloader.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.g(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(int i10, androidx.compose.runtime.c0 c0Var, int i11) throws IOException {
        f(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(widthDp = 390)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void h(androidx.compose.runtime.c0 c0Var, final int i10) throws IOException {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-72662373);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-72662373, i10, -1, "com.planner5d.library.widget.preloader.PreloaderBoxV3ViewPreviewWithSubtitle (PreloaderBoxV3View.kt:82)");
            }
            cb.c.b("ZhtCzUWrigcr6Us44jMy4l", "498:52294", com.planner5d.library.widget.preloader.a.f258516a.b(), c0VarR, 438);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.widget.preloader.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.i(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(int i10, androidx.compose.runtime.c0 c0Var, int i11) throws IOException {
        h(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
