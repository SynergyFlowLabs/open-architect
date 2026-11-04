package com.planner5d.library.spaces.view.dashboard;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.material3.e4;
import androidx.compose.material3.m4;
import androidx.compose.material3.ni;
import androidx.compose.material3.os;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSpaceCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpaceCard.kt\ncom/planner5d/library/spaces/view/dashboard/SpaceCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,125:1\n113#2:126\n*S KotlinDebug\n*F\n+ 1 SpaceCard.kt\ncom/planner5d/library/spaces/view/dashboard/SpaceCardKt\n*L\n54#1:126\n*E\n"})
public final class k {

    @SourceDebugExtension({"SMAP\nSpaceCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpaceCard.kt\ncom/planner5d/library/spaces/view/dashboard/SpaceCardKt$SpaceCard$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,125:1\n70#2:126\n67#2,9:127\n70#2:163\n67#2,9:164\n77#2:203\n77#2:207\n80#3,6:136\n87#3,3:151\n90#3,2:160\n80#3,6:173\n87#3,3:188\n90#3,2:197\n94#3:202\n94#3:206\n391#4,9:142\n400#4:162\n391#4,9:179\n400#4,3:199\n401#4,2:204\n4360#5,6:154\n4360#5,6:191\n*S KotlinDebug\n*F\n+ 1 SpaceCard.kt\ncom/planner5d/library/spaces/view/dashboard/SpaceCardKt$SpaceCard$1\n*L\n56#1:126\n56#1:127,9\n67#1:163\n67#1:164,9\n67#1:203\n56#1:207\n56#1:136,6\n56#1:151,3\n56#1:160,2\n67#1:173,6\n67#1:188,3\n67#1:197,2\n67#1:202\n56#1:206\n56#1:142,9\n56#1:162\n67#1:179,9\n67#1:199,3\n56#1:204,2\n56#1:154,6\n67#1:191,6\n*E\n"})
    static final class a implements pj.n<m0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f230287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f230288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f230289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f230290d;

        /* JADX INFO: renamed from: com.planner5d.library.spaces.view.dashboard.k$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nSpaceCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpaceCard.kt\ncom/planner5d/library/spaces/view/dashboard/SpaceCardKt$SpaceCard$1$1$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,125:1\n87#2:126\n84#2,9:127\n94#2:167\n80#3,6:136\n87#3,3:151\n90#3,2:160\n94#3:166\n391#4,9:142\n400#4:162\n401#4,2:164\n4360#5,6:154\n113#6:163\n*S KotlinDebug\n*F\n+ 1 SpaceCard.kt\ncom/planner5d/library/spaces/view/dashboard/SpaceCardKt$SpaceCard$1$1$2\n*L\n101#1:126\n101#1:127,9\n101#1:167\n101#1:136,6\n101#1:151,3\n101#1:160,2\n101#1:166\n101#1:142,9\n101#1:162\n101#1:164,2\n101#1:154,6\n113#1:163\n*E\n"})
        static final class C1699a implements pj.n<m0, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f230291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f230292b;

            C1699a(String str, String str2) {
                this.f230291a = str;
                this.f230292b = str2;
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
                    androidx.compose.runtime.m0.A0(-790837229, i10, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard.<anonymous>.<anonymous>.<anonymous> (SpaceCard.kt:100)");
                }
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarU = d5.u(i6.h(aVar, 0.0f, 1, null), bb.e.h(), bb.e.g(), bb.e.h(), bb.e.h());
                String str = this.f230291a;
                String str2 = this.f230292b;
                a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarU);
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
                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
                y7.n(c0VarD, a1VarB, aVar2.e());
                y7.n(c0VarD, b1VarK, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar2.f());
                n0 n0Var = n0.f16227a;
                y3 y3VarD = bb.f.d(c0Var, 0);
                long j10 = bb.d.j();
                androidx.compose.ui.text.style.v.a aVar3 = androidx.compose.ui.text.style.v.f42256b;
                q50.t(str, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, aVar3.c(), false, 1, 0, null, y3VarD, c0Var, 0, 24960, 110586);
                l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(4)), c0Var, 6);
                q50.t(str2, null, bb.d.e(), null, 0L, null, null, null, 0L, null, null, 0L, aVar3.c(), false, 1, 0, null, bb.f.b(c0Var, 0), c0Var, 0, 24960, 110586);
                c0Var.o();
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

        a(String str, boolean z10, String str2, String str3) {
            this.f230287a = str;
            this.f230288b = z10;
            this.f230289c = str2;
            this.f230290d = str3;
        }

        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r15v6 */
        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(m0 Card, androidx.compose.runtime.c0 c0Var, int i10) {
            String str;
            String str2;
            androidx.compose.ui.a0.a aVar;
            Object obj;
            float f10;
            ?? r15;
            androidx.compose.foundation.layout.d0 d0Var;
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i10 & 17) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1632564235, i10, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard.<anonymous> (SpaceCard.kt:55)");
            }
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarF = i6.f(aVar2, 0.0f, 1, null);
            String str3 = this.f230287a;
            boolean z10 = this.f230288b;
            String str4 = this.f230289c;
            String str5 = this.f230290d;
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
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
            y7.n(c0VarD, a1VarK, aVar4.e());
            y7.n(c0VarD, b1VarK, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar4.f());
            androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
            if (str3 == null || z10) {
                str = str5;
                str2 = str4;
                c0Var.E(825927864);
                aVar = aVar2;
                obj = null;
                f10 = 0.0f;
                r15 = 1;
                androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(i6.f(aVar, 0.0f, 1, null), bb.d.f(), null, 2, null);
                a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                b1 b1VarK2 = c0Var.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarD);
                Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A2);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var);
                y7.n(c0VarD2, a1VarK2, aVar4.e());
                y7.n(c0VarD2, b1VarK2, aVar4.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar4.f());
                if (z10) {
                    c0Var.E(796245946);
                    d0Var = d0Var2;
                    os.F(d0Var.b(aVar, aVar3.i()), 0L, 0.0f, 0L, 0, 0.0f, c0Var, 0, 62);
                    c0Var.A();
                } else {
                    d0Var = d0Var2;
                    c0Var.E(796355500);
                    ni.o(u0.e.c(de.b.g.X9, c0Var, 0), "Property image", d5.r(i6.f(aVar, 0.0f, 1, null), bb.e.l()), bb.d.g(), c0Var, 48, 0);
                    c0Var.A();
                }
                c0Var.o();
                c0Var.A();
            } else {
                c0Var.E(825626265);
                str = str5;
                str2 = str4;
                coil.compose.t.b(str3, "Space image", i6.f(aVar2, 0.0f, 1, null), u0.e.c(de.b.g.X9, c0Var, 0), u0.e.c(de.b.g.X9, c0Var, 0), null, null, null, null, null, androidx.compose.ui.layout.l.f39405a.a(), 0.0f, null, 0, false, null, c0Var, 432, 6, 64480);
                c0Var.A();
                aVar = aVar2;
                d0Var = d0Var2;
                obj = null;
                f10 = 0.0f;
                r15 = 1;
            }
            m4.g(d0Var.b(i6.h(aVar, f10, r15, obj), aVar3.c()), androidx.compose.foundation.shape.o.i(bb.e.b(), bb.e.b(), bb.e.j(), bb.e.j()), e4.f27241a.b(bb.d.i(), 0L, 0L, 0L, c0Var, e4.f27242b << 12, 14), null, null, androidx.compose.runtime.internal.w.e(-790837229, r15, new C1699a(str2, str), c0Var, 54), c0Var, androidx.profileinstaller.n.c.f73814m, 24);
            c0Var.o();
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
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x0145  */
    /* JADX WARN: Code duplicated, block: B:87:0x0153  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        String str4;
        int i13;
        String str5;
        int i14;
        int i15;
        String str6;
        int i16;
        int i17;
        boolean z11;
        int i18;
        final androidx.compose.ui.a0 a0Var3;
        String str7;
        String str8;
        androidx.compose.runtime.c0 c0Var2;
        final String str9;
        final String str10;
        final String str11;
        final boolean z12;
        s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-620261059);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                str4 = str;
                i12 |= c0VarR.D(str4) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    str5 = str2;
                    if (c0VarR.D(str5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        str6 = str3;
                        if (c0VarR.D(str6)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            z11 = z10;
                            if (c0VarR.G(z11)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i12 & 9363) == 9362 || !c0VarR.d()) {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i20 != 0) {
                                str7 = null;
                            } else {
                                str7 = str4;
                            }
                            if (i13 != 0) {
                                str8 = "4247 Cloverdale Ave, LA";
                            } else {
                                str8 = str5;
                            }
                            if (i15 != 0) {
                                str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                            }
                            if (i17 != 0) {
                                z11 = false;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                            }
                            boolean z13 = z11;
                            String str12 = str6;
                            m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z13, str8, str12), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            str9 = str7;
                            str10 = str8;
                            str11 = str12;
                            z12 = z13;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            str9 = str4;
                            str10 = str5;
                            str11 = str6;
                            c0Var2 = c0VarR;
                            z12 = z11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    z11 = z10;
                    if ((i12 & 9363) == 9362) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i20 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i13 != 0) {
                            str8 = "4247 Cloverdale Ave, LA";
                        } else {
                            str8 = str5;
                        }
                        if (i15 != 0) {
                            str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                        }
                        if (i17 != 0) {
                            z11 = false;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                        }
                        boolean z14 = z11;
                        String str13 = str6;
                        m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z14, str8, str13), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str9 = str7;
                        str10 = str8;
                        str11 = str13;
                        z12 = z14;
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i20 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i13 != 0) {
                            str8 = "4247 Cloverdale Ave, LA";
                        } else {
                            str8 = str5;
                        }
                        if (i15 != 0) {
                            str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                        }
                        if (i17 != 0) {
                            z11 = false;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                        }
                        boolean z15 = z11;
                        String str14 = str6;
                        m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z15, str8, str14), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str9 = str7;
                        str10 = str8;
                        str11 = str14;
                        z12 = z15;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                str6 = str3;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i20 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i13 != 0) {
                            str8 = "4247 Cloverdale Ave, LA";
                        } else {
                            str8 = str5;
                        }
                        if (i15 != 0) {
                            str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                        }
                        if (i17 != 0) {
                            z11 = false;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                        }
                        boolean z16 = z11;
                        String str15 = str6;
                        m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z16, str8, str15), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str9 = str7;
                        str10 = str8;
                        str11 = str15;
                        z12 = z16;
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i20 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i13 != 0) {
                            str8 = "4247 Cloverdale Ave, LA";
                        } else {
                            str8 = str5;
                        }
                        if (i15 != 0) {
                            str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                        }
                        if (i17 != 0) {
                            z11 = false;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                        }
                        boolean z17 = z11;
                        String str16 = str6;
                        m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z17, str8, str16), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str9 = str7;
                        str10 = str8;
                        str11 = str16;
                        z12 = z17;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z11 = z10;
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z18 = z11;
                    String str17 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z18, str8, str17), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str17;
                    z12 = z18;
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z19 = z11;
                    String str18 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z19, str8, str18), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str18;
                    z12 = z19;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            str5 = str2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    str6 = str3;
                    if (c0VarR.D(str6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i20 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i13 != 0) {
                            str8 = "4247 Cloverdale Ave, LA";
                        } else {
                            str8 = str5;
                        }
                        if (i15 != 0) {
                            str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                        }
                        if (i17 != 0) {
                            z11 = false;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                        }
                        boolean z110 = z11;
                        String str19 = str6;
                        m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z110, str8, str19), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str9 = str7;
                        str10 = str8;
                        str11 = str19;
                        z12 = z110;
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i20 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i13 != 0) {
                            str8 = "4247 Cloverdale Ave, LA";
                        } else {
                            str8 = str5;
                        }
                        if (i15 != 0) {
                            str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                        }
                        if (i17 != 0) {
                            z11 = false;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                        }
                        boolean z111 = z11;
                        String str110 = str6;
                        m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z111, str8, str110), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str9 = str7;
                        str10 = str8;
                        str11 = str110;
                        z12 = z111;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z11 = z10;
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z112 = z11;
                    String str111 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z112, str8, str111), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str111;
                    z12 = z112;
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z113 = z11;
                    String str112 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z113, str8, str112), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str112;
                    z12 = z113;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            str6 = str3;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z114 = z11;
                    String str113 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z114, str8, str113), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str113;
                    z12 = z114;
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z115 = z11;
                    String str114 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z115, str8, str114), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str114;
                    z12 = z115;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            if ((i12 & 9363) == 9362) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (i13 != 0) {
                    str8 = "4247 Cloverdale Ave, LA";
                } else {
                    str8 = str5;
                }
                if (i15 != 0) {
                    str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                }
                if (i17 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                }
                boolean z116 = z11;
                String str115 = str6;
                m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z116, str8, str115), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str9 = str7;
                str10 = str8;
                str11 = str115;
                z12 = z116;
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (i13 != 0) {
                    str8 = "4247 Cloverdale Ave, LA";
                } else {
                    str8 = str5;
                }
                if (i15 != 0) {
                    str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                }
                if (i17 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                }
                boolean z117 = z11;
                String str116 = str6;
                m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z117, str8, str116), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str9 = str7;
                str10 = str8;
                str11 = str116;
                z12 = z117;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        str4 = str;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                str5 = str2;
                if (c0VarR.D(str5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    str6 = str3;
                    if (c0VarR.D(str6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i20 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i13 != 0) {
                            str8 = "4247 Cloverdale Ave, LA";
                        } else {
                            str8 = str5;
                        }
                        if (i15 != 0) {
                            str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                        }
                        if (i17 != 0) {
                            z11 = false;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                        }
                        boolean z118 = z11;
                        String str117 = str6;
                        m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z118, str8, str117), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str9 = str7;
                        str10 = str8;
                        str11 = str117;
                        z12 = z118;
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i20 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i13 != 0) {
                            str8 = "4247 Cloverdale Ave, LA";
                        } else {
                            str8 = str5;
                        }
                        if (i15 != 0) {
                            str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                        }
                        if (i17 != 0) {
                            z11 = false;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                        }
                        boolean z119 = z11;
                        String str118 = str6;
                        m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z119, str8, str118), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        str9 = str7;
                        str10 = str8;
                        str11 = str118;
                        z12 = z119;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z11 = z10;
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z1110 = z11;
                    String str119 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1110, str8, str119), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str119;
                    z12 = z1110;
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z1111 = z11;
                    String str1110 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1111, str8, str1110), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str1110;
                    z12 = z1111;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            str6 = str3;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z1112 = z11;
                    String str1111 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1112, str8, str1111), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str1111;
                    z12 = z1112;
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z1113 = z11;
                    String str1112 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1113, str8, str1112), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str1112;
                    z12 = z1113;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            if ((i12 & 9363) == 9362) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (i13 != 0) {
                    str8 = "4247 Cloverdale Ave, LA";
                } else {
                    str8 = str5;
                }
                if (i15 != 0) {
                    str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                }
                if (i17 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                }
                boolean z1114 = z11;
                String str1113 = str6;
                m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1114, str8, str1113), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str9 = str7;
                str10 = str8;
                str11 = str1113;
                z12 = z1114;
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (i13 != 0) {
                    str8 = "4247 Cloverdale Ave, LA";
                } else {
                    str8 = str5;
                }
                if (i15 != 0) {
                    str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                }
                if (i17 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                }
                boolean z1115 = z11;
                String str1114 = str6;
                m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1115, str8, str1114), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str9 = str7;
                str10 = str8;
                str11 = str1114;
                z12 = z1115;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        str5 = str2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                str6 = str3;
                if (c0VarR.D(str6)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z1116 = z11;
                    String str1115 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1116, str8, str1115), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str1115;
                    z12 = z1116;
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i13 != 0) {
                        str8 = "4247 Cloverdale Ave, LA";
                    } else {
                        str8 = str5;
                    }
                    if (i15 != 0) {
                        str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                    }
                    if (i17 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                    }
                    boolean z1117 = z11;
                    String str1116 = str6;
                    m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1117, str8, str1116), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    str9 = str7;
                    str10 = str8;
                    str11 = str1116;
                    z12 = z1117;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            if ((i12 & 9363) == 9362) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (i13 != 0) {
                    str8 = "4247 Cloverdale Ave, LA";
                } else {
                    str8 = str5;
                }
                if (i15 != 0) {
                    str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                }
                if (i17 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                }
                boolean z1118 = z11;
                String str1117 = str6;
                m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1118, str8, str1117), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str9 = str7;
                str10 = str8;
                str11 = str1117;
                z12 = z1118;
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (i13 != 0) {
                    str8 = "4247 Cloverdale Ave, LA";
                } else {
                    str8 = str5;
                }
                if (i15 != 0) {
                    str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                }
                if (i17 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                }
                boolean z1119 = z11;
                String str1118 = str6;
                m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z1119, str8, str1118), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str9 = str7;
                str10 = str8;
                str11 = str1118;
                z12 = z1119;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        str6 = str3;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i12 & 9363) == 9362) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (i13 != 0) {
                    str8 = "4247 Cloverdale Ave, LA";
                } else {
                    str8 = str5;
                }
                if (i15 != 0) {
                    str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                }
                if (i17 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                }
                boolean z11110 = z11;
                String str1119 = str6;
                m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z11110, str8, str1119), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str9 = str7;
                str10 = str8;
                str11 = str1119;
                z12 = z11110;
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (i13 != 0) {
                    str8 = "4247 Cloverdale Ave, LA";
                } else {
                    str8 = str5;
                }
                if (i15 != 0) {
                    str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
                }
                if (i17 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
                }
                boolean z11111 = z11;
                String str11110 = str6;
                m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z11111, str8, str11110), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                str9 = str7;
                str10 = str8;
                str11 = str11110;
                z12 = z11111;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z11 = z10;
        if ((i12 & 9363) == 9362) {
            if (i19 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i20 != 0) {
                str7 = null;
            } else {
                str7 = str4;
            }
            if (i13 != 0) {
                str8 = "4247 Cloverdale Ave, LA";
            } else {
                str8 = str5;
            }
            if (i15 != 0) {
                str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
            }
            if (i17 != 0) {
                z11 = false;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
            }
            boolean z11112 = z11;
            String str11111 = str6;
            m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z11112, str8, str11111), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str9 = str7;
            str10 = str8;
            str11 = str11111;
            z12 = z11112;
        } else {
            if (i19 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i20 != 0) {
                str7 = null;
            } else {
                str7 = str4;
            }
            if (i13 != 0) {
                str8 = "4247 Cloverdale Ave, LA";
            } else {
                str8 = str5;
            }
            if (i15 != 0) {
                str6 = "3 bathrooms, 2 bedrooms, 4,048 sqft";
            }
            if (i17 != 0) {
                z11 = false;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-620261059, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceCard (SpaceCard.kt:47)");
            }
            boolean z11113 = z11;
            String str11112 = str6;
            m4.g(androidx.compose.foundation.layout.r.b(i6.h(a0Var3, 0.0f, 1, null), 1.9f, false, 2, null), androidx.compose.foundation.shape.o.h(bb.e.a()), null, e4.f27241a.c(androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, (e4.f27242b << 18) | 6, 62), null, androidx.compose.runtime.internal.w.e(1632564235, true, new a(str7, z11113, str8, str11112), c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 20);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            str9 = str7;
            str10 = str8;
            str11 = str11112;
            z12 = z11113;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k.c(a0Var3, str9, str10, str11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.a0 a0Var, String str, String str2, String str3, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(a0Var, str, str2, str3, z10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
