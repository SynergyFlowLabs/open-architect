package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationKebab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKebab.kt\nio/intercom/android/sdk/m5/conversation/ui/components/ConversationKebabKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,172:1\n99#2:173\n95#2,10:174\n106#2:282\n80#3,6:184\n87#3,3:199\n90#3,2:208\n80#3,6:234\n87#3,3:249\n90#3,2:258\n94#3:277\n94#3:281\n391#4,9:190\n400#4:210\n391#4,9:240\n400#4:260\n401#4,2:275\n401#4,2:279\n4360#5,6:202\n4360#5,6:252\n1#6:211\n1282#7,6:212\n1282#7,6:218\n1282#7,6:261\n1282#7,6:269\n87#8:224\n84#8,9:225\n94#8:278\n113#9:267\n113#9:268\n*S KotlinDebug\n*F\n+ 1 ConversationKebab.kt\nio/intercom/android/sdk/m5/conversation/ui/components/ConversationKebabKt\n*L\n29#1:173\n29#1:174,10\n29#1:282\n29#1:184,6\n29#1:199,3\n29#1:208,2\n68#1:234,6\n68#1:249,3\n68#1:258,2\n68#1:277\n29#1:281\n29#1:190,9\n29#1:210\n68#1:240,9\n68#1:260\n68#1:275,2\n29#1:279,2\n29#1:202,6\n68#1:252,6\n55#1:212,6\n67#1:218,6\n78#1:261,6\n88#1:269,6\n68#1:224\n68#1:225,9\n68#1:278\n86#1:267\n93#1:268\n*E\n"})
public final class ConversationKebabKt {
    /* JADX WARN: Code duplicated, block: B:100:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:101:0x0200  */
    /* JADX WARN: Code duplicated, block: B:104:0x0208  */
    /* JADX WARN: Code duplicated, block: B:106:0x0210  */
    /* JADX WARN: Code duplicated, block: B:108:0x0245  */
    /* JADX WARN: Code duplicated, block: B:110:0x0264  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:125:0x0317  */
    /* JADX WARN: Code duplicated, block: B:126:0x031a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0321  */
    /* JADX WARN: Code duplicated, block: B:131:0x0327  */
    /* JADX WARN: Code duplicated, block: B:134:0x0393  */
    /* JADX WARN: Code duplicated, block: B:139:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:141:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152  */
    /* JADX WARN: Code duplicated, block: B:80:0x0163  */
    /* JADX WARN: Code duplicated, block: B:81:0x0171  */
    /* JADX WARN: Code duplicated, block: B:84:0x0177  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:0x019a  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ec  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: ConversationKebab-cf5BqRc, reason: not valid java name */
    public static final void m227ConversationKebabcf5BqRc(@Nullable List<? extends HeaderMenuItem> list, @Nullable Function1<? super HeaderMenuItem, Unit> function1, long j10, @Nullable Function1<? super MetricData, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function1<? super HeaderMenuItem, Unit> function3;
        int i12;
        long j11;
        int i13;
        int i14;
        Function1<? super MetricData, Unit> function4;
        int i15;
        final List<? extends HeaderMenuItem> listEmptyList;
        Function1<? super HeaderMenuItem, Unit> function5;
        long jA;
        Function1<? super MetricData, Unit> function6;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        Iterator<T> it;
        Object next;
        HeaderMenuItem headerMenuItem;
        HeaderMenuItem.TotalCountIndicator totalCountIndicator;
        String unreadMessagesCount;
        boolean z10;
        List<? extends HeaderMenuItem> list2;
        final Function1<? super HeaderMenuItem, Unit> function7;
        final Function1<? super MetricData, Unit> function8;
        long j12;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final n3 n3Var;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        boolean z11;
        Object objI1;
        Object objI2;
        long j13;
        Function1<? super MetricData, Unit> function9;
        Function1<? super HeaderMenuItem, Unit> function10;
        final List<? extends HeaderMenuItem> list3;
        final Function1<? super HeaderMenuItem, Unit> function11;
        final long j14;
        final Function1<? super MetricData, Unit> function12;
        final HeaderMenuItem headerMenuItem2;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objI3;
        s5 s5VarT;
        s5 s5VarT2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1084184456);
        int iA = c0VarR.a();
        int i16 = i11 & 1;
        int i17 = i16 != 0 ? i10 | 2 : i10;
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                function3 = function1;
                i17 |= c0VarR.k0(function3) ? 32 : 16;
            }
            i12 = i11 & 4;
            if (i12 != 0) {
                if ((i10 & 896) == 0) {
                    j11 = j10;
                    if (c0VarR.L(j11)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i17 |= i13;
                }
                i14 = i11 & 8;
                if (i14 != 0) {
                    if ((i10 & 7168) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i17 |= i15;
                    }
                    if (i16 != 1 && (i17 & 5851) == 1170 && c0VarR.d()) {
                        c0VarR.u();
                        list3 = list;
                        function11 = function3;
                        j14 = j11;
                        function12 = function4;
                    } else {
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i18 != 0) {
                            function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                                }
                            };
                        } else {
                            function5 = function3;
                        }
                        if (i12 != 0) {
                            jA = androidx.compose.ui.graphics.q0.f38131b.a();
                        } else {
                            jA = j11;
                        }
                        if (i14 != 0) {
                            function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                                }
                            };
                        } else {
                            function6 = function4;
                        }
                        androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                        androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0VarR, 48);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar2);
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
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarE, aVar3.e());
                        y7.n(c0VarD, b1VarK, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar3.f());
                        y5 y5Var = y5.f16577a;
                        c0VarR.E(2047867882);
                        it = listEmptyList.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                        headerMenuItem = (HeaderMenuItem) next;
                        if (headerMenuItem != null) {
                            Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                            totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                        } else {
                            totalCountIndicator = null;
                        }
                        if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                            unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                        } else {
                            unreadMessagesCount = null;
                        }
                        z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                        if (listEmptyList.isEmpty()) {
                            c0VarR.E(2048373646);
                            c0VarR.A();
                            c0VarR.j(iA);
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                final Function1<? super HeaderMenuItem, Unit> function13 = function5;
                                final Function1<? super MetricData, Unit> function14 = function6;
                                final long j15 = jA;
                                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function13, j15, function14, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        list2 = listEmptyList;
                        function7 = function5;
                        function8 = function6;
                        j12 = jA;
                        if (list2.size() == 1) {
                            c0VarR.E(2048472753);
                            headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                            String text = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                            int iIcon = icon(headerMenuItem2);
                            boolean enabled = headerMenuItem2.getEnabled();
                            c0VarR.E(-1180838359);
                            if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            boolean zD = z12 | c0VarR.D(headerMenuItem2);
                            if ((i17 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zD | z13;
                            objI3 = c0VarR.i0();
                            if (z14 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                    }
                                };
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text, iIcon, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                            c0VarR.A();
                            function10 = function7;
                            j13 = j12;
                            function9 = function8;
                        } else {
                            String str = unreadMessagesCount;
                            c0VarR.E(2049182219);
                            c0VarR.E(-1180824432);
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = d7.g(Boolean.FALSE, null, 2, null);
                                c0VarR.Y(objI0);
                            }
                            n3Var = (n3) objI0;
                            c0VarR.A();
                            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                            androidx.compose.ui.a0 a0VarJ = i6.J(aVar4, null, false, 3, null);
                            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarJ);
                            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                            function0A2 = aVar5.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A2);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD2 = y7.d(c0VarR);
                            y7.n(c0VarD2, a1VarB, aVar5.e());
                            y7.n(c0VarD2, b1VarK2, aVar5.g());
                            function2B2 = aVar5.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN2, aVar5.f());
                            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                            int i19 = R.drawable.intercom_kebab;
                            boolean z15 = !((Boolean) n3Var.getValue()).booleanValue();
                            c0VarR.E(-1935443118);
                            if ((i17 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z11 || objI1 == aVar.a()) {
                                objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i19, str, z15, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                            androidx.compose.ui.a0 a0VarB = i6.B(aVar4, androidx.compose.ui.unit.h.r(220));
                            boolean zBooleanValue = ((Boolean) n3Var.getValue()).booleanValue();
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i20 = IntercomTheme.$stable;
                            long jM690getBackground0d7_KjU = intercomTheme.getColors(c0VarR, i20).m690getBackground0d7_KjU();
                            androidx.compose.foundation.shape.e eVarM = intercomTheme.getShapes(c0VarR, i20).m();
                            float fR = androidx.compose.ui.unit.h.r(8);
                            c0VarR.E(-1935428387);
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            j13 = j12;
                            function9 = function8;
                            function10 = function7;
                            androidx.compose.material3.r.h(zBooleanValue, (Function0) objI2, a0VarB, 0L, null, null, eVarM, jM690getBackground0d7_KjU, 0.0f, fR, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                            c0VarR = c0VarR;
                            c0VarR.o();
                            c0VarR.A();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        list3 = list2;
                        function11 = function10;
                        j14 = j13;
                        function12 = function9;
                    }
                    s5VarT2 = c0VarR.T();
                    if (s5VarT2 != null) {
                        s5VarT2.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, function11, j14, function12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 3072;
                function4 = function2;
                if (i16 != 1) {
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i12 != 0) {
                        jA = androidx.compose.ui.graphics.q0.f38131b.a();
                    } else {
                        jA = j11;
                    }
                    if (i14 != 0) {
                        function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                            }
                        };
                    } else {
                        function6 = function4;
                    }
                    androidx.compose.ui.e.c cVarQ2 = androidx.compose.ui.e.f37317a.q();
                    androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarE2 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ2, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, aVar6);
                    androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                    function0A = aVar7.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE2, aVar7.e());
                    y7.n(c0VarD, b1VarK3, aVar7.g());
                    function2B = aVar7.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN3, aVar7.f());
                    y5 y5Var2 = y5.f16577a;
                    c0VarR.E(2047867882);
                    it = listEmptyList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (listEmptyList.isEmpty()) {
                        c0VarR.E(2048373646);
                        c0VarR.A();
                        c0VarR.j(iA);
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final Function1 function15 = function5;
                            final Function1 function16 = function6;
                            final long j16 = jA;
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function15, j16, function16, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    list2 = listEmptyList;
                    function7 = function5;
                    function8 = function6;
                    j12 = jA;
                    if (list2.size() == 1) {
                        c0VarR.E(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                        String text2 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                        int iIcon2 = icon(headerMenuItem2);
                        boolean enabled2 = headerMenuItem2.getEnabled();
                        c0VarR.E(-1180838359);
                        if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean zD2 = z12 | c0VarR.D(headerMenuItem2);
                        if ((i17 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zD2 | z13;
                        objI3 = c0VarR.i0();
                        if (z14) {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text2, iIcon2, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled2, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                        c0VarR.A();
                        function10 = function7;
                        j13 = j12;
                        function9 = function8;
                    } else {
                        String str2 = unreadMessagesCount;
                        c0VarR.E(2049182219);
                        c0VarR.E(-1180824432);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (n3) objI0;
                        c0VarR.A();
                        androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.a0 a0VarJ2 = i6.J(aVar8, null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarJ2);
                        androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                        function0A2 = aVar9.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarB2, aVar9.e());
                        y7.n(c0VarD2, b1VarK4, aVar9.g());
                        function2B2 = aVar9.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN4, aVar9.f());
                        androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                        int i110 = R.drawable.intercom_kebab;
                        boolean z16 = !((Boolean) n3Var.getValue()).booleanValue();
                        c0VarR.E(-1935443118);
                        if ((i17 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i110, str2, z16, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.a0 a0VarB2 = i6.B(aVar8, androidx.compose.ui.unit.h.r(220));
                        boolean zBooleanValue2 = ((Boolean) n3Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i21 = IntercomTheme.$stable;
                        long jM690getBackground0d7_KjU2 = intercomTheme2.getColors(c0VarR, i21).m690getBackground0d7_KjU();
                        androidx.compose.foundation.shape.e eVarM2 = intercomTheme2.getShapes(c0VarR, i21).m();
                        float fR2 = androidx.compose.ui.unit.h.r(8);
                        c0VarR.E(-1935428387);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        j13 = j12;
                        function9 = function8;
                        function10 = function7;
                        androidx.compose.material3.r.h(zBooleanValue2, (Function0) objI2, a0VarB2, 0L, null, null, eVarM2, jM690getBackground0d7_KjU2, 0.0f, fR2, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    list3 = list2;
                    function11 = function10;
                    j14 = j13;
                    function12 = function9;
                } else {
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i12 != 0) {
                        jA = androidx.compose.ui.graphics.q0.f38131b.a();
                    } else {
                        jA = j11;
                    }
                    if (i14 != 0) {
                        function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                            }
                        };
                    } else {
                        function6 = function4;
                    }
                    androidx.compose.ui.e.c cVarQ3 = androidx.compose.ui.e.f37317a.q();
                    androidx.compose.ui.a0.a aVar10 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarE3 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ3, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, aVar10);
                    androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                    function0A = aVar11.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE3, aVar11.e());
                    y7.n(c0VarD, b1VarK5, aVar11.g());
                    function2B = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN5, aVar11.f());
                    y5 y5Var3 = y5.f16577a;
                    c0VarR.E(2047867882);
                    it = listEmptyList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (listEmptyList.isEmpty()) {
                        c0VarR.E(2048373646);
                        c0VarR.A();
                        c0VarR.j(iA);
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final Function1 function17 = function5;
                            final Function1 function18 = function6;
                            final long j17 = jA;
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function17, j17, function18, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    list2 = listEmptyList;
                    function7 = function5;
                    function8 = function6;
                    j12 = jA;
                    if (list2.size() == 1) {
                        c0VarR.E(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                        String text3 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                        int iIcon3 = icon(headerMenuItem2);
                        boolean enabled3 = headerMenuItem2.getEnabled();
                        c0VarR.E(-1180838359);
                        if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean zD3 = z12 | c0VarR.D(headerMenuItem2);
                        if ((i17 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zD3 | z13;
                        objI3 = c0VarR.i0();
                        if (z14) {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text3, iIcon3, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled3, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                        c0VarR.A();
                        function10 = function7;
                        j13 = j12;
                        function9 = function8;
                    } else {
                        String str3 = unreadMessagesCount;
                        c0VarR.E(2049182219);
                        c0VarR.E(-1180824432);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (n3) objI0;
                        c0VarR.A();
                        androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.a0 a0VarJ3 = i6.J(aVar12, null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarJ3);
                        androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                        function0A2 = aVar13.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarB3, aVar13.e());
                        y7.n(c0VarD2, b1VarK6, aVar13.g());
                        function2B2 = aVar13.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN6, aVar13.f());
                        androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
                        int i111 = R.drawable.intercom_kebab;
                        boolean z17 = !((Boolean) n3Var.getValue()).booleanValue();
                        c0VarR.E(-1935443118);
                        if ((i17 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i111, str3, z17, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.a0 a0VarB3 = i6.B(aVar12, androidx.compose.ui.unit.h.r(220));
                        boolean zBooleanValue3 = ((Boolean) n3Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        int i22 = IntercomTheme.$stable;
                        long jM690getBackground0d7_KjU3 = intercomTheme3.getColors(c0VarR, i22).m690getBackground0d7_KjU();
                        androidx.compose.foundation.shape.e eVarM3 = intercomTheme3.getShapes(c0VarR, i22).m();
                        float fR3 = androidx.compose.ui.unit.h.r(8);
                        c0VarR.E(-1935428387);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        j13 = j12;
                        function9 = function8;
                        function10 = function7;
                        androidx.compose.material3.r.h(zBooleanValue3, (Function0) objI2, a0VarB3, 0L, null, null, eVarM3, jM690getBackground0d7_KjU3, 0.0f, fR3, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    list3 = list2;
                    function11 = function10;
                    j14 = j13;
                    function12 = function9;
                }
                s5VarT2 = c0VarR.T();
                if (s5VarT2 != null) {
                    s5VarT2.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, function11, j14, function12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= a5.S0;
            j11 = j10;
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i17 |= i15;
                }
                if (i16 != 1) {
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i12 != 0) {
                        jA = androidx.compose.ui.graphics.q0.f38131b.a();
                    } else {
                        jA = j11;
                    }
                    if (i14 != 0) {
                        function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                            }
                        };
                    } else {
                        function6 = function4;
                    }
                    androidx.compose.ui.e.c cVarQ4 = androidx.compose.ui.e.f37317a.q();
                    androidx.compose.ui.a0.a aVar14 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarE4 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ4, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, aVar14);
                    androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                    function0A = aVar15.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE4, aVar15.e());
                    y7.n(c0VarD, b1VarK7, aVar15.g());
                    function2B = aVar15.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN7, aVar15.f());
                    y5 y5Var4 = y5.f16577a;
                    c0VarR.E(2047867882);
                    it = listEmptyList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (listEmptyList.isEmpty()) {
                        c0VarR.E(2048373646);
                        c0VarR.A();
                        c0VarR.j(iA);
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final Function1 function19 = function5;
                            final Function1 function110 = function6;
                            final long j18 = jA;
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function19, j18, function110, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    list2 = listEmptyList;
                    function7 = function5;
                    function8 = function6;
                    j12 = jA;
                    if (list2.size() == 1) {
                        c0VarR.E(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                        String text4 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                        int iIcon4 = icon(headerMenuItem2);
                        boolean enabled4 = headerMenuItem2.getEnabled();
                        c0VarR.E(-1180838359);
                        if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean zD4 = z12 | c0VarR.D(headerMenuItem2);
                        if ((i17 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zD4 | z13;
                        objI3 = c0VarR.i0();
                        if (z14) {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text4, iIcon4, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled4, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                        c0VarR.A();
                        function10 = function7;
                        j13 = j12;
                        function9 = function8;
                    } else {
                        String str4 = unreadMessagesCount;
                        c0VarR.E(2049182219);
                        c0VarR.E(-1180824432);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (n3) objI0;
                        c0VarR.A();
                        androidx.compose.ui.a0.a aVar16 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.a0 a0VarJ4 = i6.J(aVar16, null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarB4 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarJ4);
                        androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                        function0A2 = aVar17.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarB4, aVar17.e());
                        y7.n(c0VarD2, b1VarK8, aVar17.g());
                        function2B2 = aVar17.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN8, aVar17.f());
                        androidx.compose.foundation.layout.n0 n0Var4 = androidx.compose.foundation.layout.n0.f16227a;
                        int i112 = R.drawable.intercom_kebab;
                        boolean z18 = !((Boolean) n3Var.getValue()).booleanValue();
                        c0VarR.E(-1935443118);
                        if ((i17 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i112, str4, z18, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.a0 a0VarB4 = i6.B(aVar16, androidx.compose.ui.unit.h.r(220));
                        boolean zBooleanValue4 = ((Boolean) n3Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        int i23 = IntercomTheme.$stable;
                        long jM690getBackground0d7_KjU4 = intercomTheme4.getColors(c0VarR, i23).m690getBackground0d7_KjU();
                        androidx.compose.foundation.shape.e eVarM4 = intercomTheme4.getShapes(c0VarR, i23).m();
                        float fR4 = androidx.compose.ui.unit.h.r(8);
                        c0VarR.E(-1935428387);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        j13 = j12;
                        function9 = function8;
                        function10 = function7;
                        androidx.compose.material3.r.h(zBooleanValue4, (Function0) objI2, a0VarB4, 0L, null, null, eVarM4, jM690getBackground0d7_KjU4, 0.0f, fR4, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    list3 = list2;
                    function11 = function10;
                    j14 = j13;
                    function12 = function9;
                } else {
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i12 != 0) {
                        jA = androidx.compose.ui.graphics.q0.f38131b.a();
                    } else {
                        jA = j11;
                    }
                    if (i14 != 0) {
                        function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                            }
                        };
                    } else {
                        function6 = function4;
                    }
                    androidx.compose.ui.e.c cVarQ5 = androidx.compose.ui.e.f37317a.q();
                    androidx.compose.ui.a0.a aVar18 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarE5 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ5, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, aVar18);
                    androidx.compose.ui.node.g.a aVar19 = androidx.compose.ui.node.g.I;
                    function0A = aVar19.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE5, aVar19.e());
                    y7.n(c0VarD, b1VarK9, aVar19.g());
                    function2B = aVar19.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN9, aVar19.f());
                    y5 y5Var5 = y5.f16577a;
                    c0VarR.E(2047867882);
                    it = listEmptyList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (listEmptyList.isEmpty()) {
                        c0VarR.E(2048373646);
                        c0VarR.A();
                        c0VarR.j(iA);
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final Function1 function111 = function5;
                            final Function1 function112 = function6;
                            final long j19 = jA;
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function111, j19, function112, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    list2 = listEmptyList;
                    function7 = function5;
                    function8 = function6;
                    j12 = jA;
                    if (list2.size() == 1) {
                        c0VarR.E(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                        String text5 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                        int iIcon5 = icon(headerMenuItem2);
                        boolean enabled5 = headerMenuItem2.getEnabled();
                        c0VarR.E(-1180838359);
                        if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean zD5 = z12 | c0VarR.D(headerMenuItem2);
                        if ((i17 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zD5 | z13;
                        objI3 = c0VarR.i0();
                        if (z14) {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text5, iIcon5, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled5, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                        c0VarR.A();
                        function10 = function7;
                        j13 = j12;
                        function9 = function8;
                    } else {
                        String str5 = unreadMessagesCount;
                        c0VarR.E(2049182219);
                        c0VarR.E(-1180824432);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (n3) objI0;
                        c0VarR.A();
                        androidx.compose.ui.a0.a aVar110 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.a0 a0VarJ5 = i6.J(aVar110, null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarB5 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarJ5);
                        androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                        function0A2 = aVar111.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarB5, aVar111.e());
                        y7.n(c0VarD2, b1VarK10, aVar111.g());
                        function2B2 = aVar111.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN10, aVar111.f());
                        androidx.compose.foundation.layout.n0 n0Var5 = androidx.compose.foundation.layout.n0.f16227a;
                        int i113 = R.drawable.intercom_kebab;
                        boolean z19 = !((Boolean) n3Var.getValue()).booleanValue();
                        c0VarR.E(-1935443118);
                        if ((i17 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i113, str5, z19, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.a0 a0VarB5 = i6.B(aVar110, androidx.compose.ui.unit.h.r(220));
                        boolean zBooleanValue5 = ((Boolean) n3Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        int i24 = IntercomTheme.$stable;
                        long jM690getBackground0d7_KjU5 = intercomTheme5.getColors(c0VarR, i24).m690getBackground0d7_KjU();
                        androidx.compose.foundation.shape.e eVarM5 = intercomTheme5.getShapes(c0VarR, i24).m();
                        float fR5 = androidx.compose.ui.unit.h.r(8);
                        c0VarR.E(-1935428387);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        j13 = j12;
                        function9 = function8;
                        function10 = function7;
                        androidx.compose.material3.r.h(zBooleanValue5, (Function0) objI2, a0VarB5, 0L, null, null, eVarM5, jM690getBackground0d7_KjU5, 0.0f, fR5, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    list3 = list2;
                    function11 = function10;
                    j14 = j13;
                    function12 = function9;
                }
                s5VarT2 = c0VarR.T();
                if (s5VarT2 != null) {
                    s5VarT2.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, function11, j14, function12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            function4 = function2;
            if (i16 != 1) {
                if (i16 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i12 != 0) {
                    jA = androidx.compose.ui.graphics.q0.f38131b.a();
                } else {
                    jA = j11;
                }
                if (i14 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                androidx.compose.ui.e.c cVarQ6 = androidx.compose.ui.e.f37317a.q();
                androidx.compose.ui.a0.a aVar112 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarE6 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ6, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, aVar112);
                androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
                function0A = aVar113.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE6, aVar113.e());
                y7.n(c0VarD, b1VarK11, aVar113.g());
                function2B = aVar113.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11, aVar113.f());
                y5 y5Var6 = y5.f16577a;
                c0VarR.E(2047867882);
                it = listEmptyList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (listEmptyList.isEmpty()) {
                    c0VarR.E(2048373646);
                    c0VarR.A();
                    c0VarR.j(iA);
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Function1 function113 = function5;
                        final Function1 function114 = function6;
                        final long j110 = jA;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function113, j110, function114, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                list2 = listEmptyList;
                function7 = function5;
                function8 = function6;
                j12 = jA;
                if (list2.size() == 1) {
                    c0VarR.E(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                    String text6 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                    int iIcon6 = icon(headerMenuItem2);
                    boolean enabled6 = headerMenuItem2.getEnabled();
                    c0VarR.E(-1180838359);
                    if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zD6 = z12 | c0VarR.D(headerMenuItem2);
                    if ((i17 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zD6 | z13;
                    objI3 = c0VarR.i0();
                    if (z14) {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text6, iIcon6, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled6, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                    c0VarR.A();
                    function10 = function7;
                    j13 = j12;
                    function9 = function8;
                } else {
                    String str6 = unreadMessagesCount;
                    c0VarR.E(2049182219);
                    c0VarR.E(-1180824432);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (n3) objI0;
                    c0VarR.A();
                    androidx.compose.ui.a0.a aVar114 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarJ6 = i6.J(aVar114, null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarB6 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarJ6);
                    androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                    function0A2 = aVar115.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB6, aVar115.e());
                    y7.n(c0VarD2, b1VarK12, aVar115.g());
                    function2B2 = aVar115.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN12, aVar115.f());
                    androidx.compose.foundation.layout.n0 n0Var6 = androidx.compose.foundation.layout.n0.f16227a;
                    int i114 = R.drawable.intercom_kebab;
                    boolean z110 = !((Boolean) n3Var.getValue()).booleanValue();
                    c0VarR.E(-1935443118);
                    if ((i17 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i114, str6, z110, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.a0 a0VarB6 = i6.B(aVar114, androidx.compose.ui.unit.h.r(220));
                    boolean zBooleanValue6 = ((Boolean) n3Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                    int i25 = IntercomTheme.$stable;
                    long jM690getBackground0d7_KjU6 = intercomTheme6.getColors(c0VarR, i25).m690getBackground0d7_KjU();
                    androidx.compose.foundation.shape.e eVarM6 = intercomTheme6.getShapes(c0VarR, i25).m();
                    float fR6 = androidx.compose.ui.unit.h.r(8);
                    c0VarR.E(-1935428387);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    j13 = j12;
                    function9 = function8;
                    function10 = function7;
                    androidx.compose.material3.r.h(zBooleanValue6, (Function0) objI2, a0VarB6, 0L, null, null, eVarM6, jM690getBackground0d7_KjU6, 0.0f, fR6, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                c0VarR.A();
                c0VarR.o();
                list3 = list2;
                function11 = function10;
                j14 = j13;
                function12 = function9;
            } else {
                if (i16 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i12 != 0) {
                    jA = androidx.compose.ui.graphics.q0.f38131b.a();
                } else {
                    jA = j11;
                }
                if (i14 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                androidx.compose.ui.e.c cVarQ7 = androidx.compose.ui.e.f37317a.q();
                androidx.compose.ui.a0.a aVar116 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarE7 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ7, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, aVar116);
                androidx.compose.ui.node.g.a aVar117 = androidx.compose.ui.node.g.I;
                function0A = aVar117.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE7, aVar117.e());
                y7.n(c0VarD, b1VarK13, aVar117.g());
                function2B = aVar117.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN13, aVar117.f());
                y5 y5Var7 = y5.f16577a;
                c0VarR.E(2047867882);
                it = listEmptyList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (listEmptyList.isEmpty()) {
                    c0VarR.E(2048373646);
                    c0VarR.A();
                    c0VarR.j(iA);
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Function1 function115 = function5;
                        final Function1 function116 = function6;
                        final long j111 = jA;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function115, j111, function116, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                list2 = listEmptyList;
                function7 = function5;
                function8 = function6;
                j12 = jA;
                if (list2.size() == 1) {
                    c0VarR.E(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                    String text7 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                    int iIcon7 = icon(headerMenuItem2);
                    boolean enabled7 = headerMenuItem2.getEnabled();
                    c0VarR.E(-1180838359);
                    if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zD7 = z12 | c0VarR.D(headerMenuItem2);
                    if ((i17 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zD7 | z13;
                    objI3 = c0VarR.i0();
                    if (z14) {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text7, iIcon7, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled7, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                    c0VarR.A();
                    function10 = function7;
                    j13 = j12;
                    function9 = function8;
                } else {
                    String str7 = unreadMessagesCount;
                    c0VarR.E(2049182219);
                    c0VarR.E(-1180824432);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (n3) objI0;
                    c0VarR.A();
                    androidx.compose.ui.a0.a aVar118 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarJ7 = i6.J(aVar118, null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarB7 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarJ7);
                    androidx.compose.ui.node.g.a aVar119 = androidx.compose.ui.node.g.I;
                    function0A2 = aVar119.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB7, aVar119.e());
                    y7.n(c0VarD2, b1VarK14, aVar119.g());
                    function2B2 = aVar119.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN14, aVar119.f());
                    androidx.compose.foundation.layout.n0 n0Var7 = androidx.compose.foundation.layout.n0.f16227a;
                    int i115 = R.drawable.intercom_kebab;
                    boolean z111 = !((Boolean) n3Var.getValue()).booleanValue();
                    c0VarR.E(-1935443118);
                    if ((i17 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i115, str7, z111, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.a0 a0VarB7 = i6.B(aVar118, androidx.compose.ui.unit.h.r(220));
                    boolean zBooleanValue7 = ((Boolean) n3Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                    int i26 = IntercomTheme.$stable;
                    long jM690getBackground0d7_KjU7 = intercomTheme7.getColors(c0VarR, i26).m690getBackground0d7_KjU();
                    androidx.compose.foundation.shape.e eVarM7 = intercomTheme7.getShapes(c0VarR, i26).m();
                    float fR7 = androidx.compose.ui.unit.h.r(8);
                    c0VarR.E(-1935428387);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    j13 = j12;
                    function9 = function8;
                    function10 = function7;
                    androidx.compose.material3.r.h(zBooleanValue7, (Function0) objI2, a0VarB7, 0L, null, null, eVarM7, jM690getBackground0d7_KjU7, 0.0f, fR7, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                c0VarR.A();
                c0VarR.o();
                list3 = list2;
                function11 = function10;
                j14 = j13;
                function12 = function9;
            }
            s5VarT2 = c0VarR.T();
            if (s5VarT2 != null) {
                s5VarT2.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, function11, j14, function12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        function3 = function1;
        i12 = i11 & 4;
        if (i12 != 0) {
            if ((i10 & 896) == 0) {
                j11 = j10;
                if (c0VarR.L(j11)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i17 |= i13;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i17 |= i15;
                }
                if (i16 != 1) {
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i12 != 0) {
                        jA = androidx.compose.ui.graphics.q0.f38131b.a();
                    } else {
                        jA = j11;
                    }
                    if (i14 != 0) {
                        function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                            }
                        };
                    } else {
                        function6 = function4;
                    }
                    androidx.compose.ui.e.c cVarQ8 = androidx.compose.ui.e.f37317a.q();
                    androidx.compose.ui.a0.a aVar1110 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarE8 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ8, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, aVar1110);
                    androidx.compose.ui.node.g.a aVar1111 = androidx.compose.ui.node.g.I;
                    function0A = aVar1111.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE8, aVar1111.e());
                    y7.n(c0VarD, b1VarK15, aVar1111.g());
                    function2B = aVar1111.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN15, aVar1111.f());
                    y5 y5Var8 = y5.f16577a;
                    c0VarR.E(2047867882);
                    it = listEmptyList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (listEmptyList.isEmpty()) {
                        c0VarR.E(2048373646);
                        c0VarR.A();
                        c0VarR.j(iA);
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final Function1 function117 = function5;
                            final Function1 function118 = function6;
                            final long j112 = jA;
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function117, j112, function118, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    list2 = listEmptyList;
                    function7 = function5;
                    function8 = function6;
                    j12 = jA;
                    if (list2.size() == 1) {
                        c0VarR.E(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                        String text8 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                        int iIcon8 = icon(headerMenuItem2);
                        boolean enabled8 = headerMenuItem2.getEnabled();
                        c0VarR.E(-1180838359);
                        if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean zD8 = z12 | c0VarR.D(headerMenuItem2);
                        if ((i17 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zD8 | z13;
                        objI3 = c0VarR.i0();
                        if (z14) {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text8, iIcon8, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled8, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                        c0VarR.A();
                        function10 = function7;
                        j13 = j12;
                        function9 = function8;
                    } else {
                        String str8 = unreadMessagesCount;
                        c0VarR.E(2049182219);
                        c0VarR.E(-1180824432);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (n3) objI0;
                        c0VarR.A();
                        androidx.compose.ui.a0.a aVar1112 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.a0 a0VarJ8 = i6.J(aVar1112, null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarB8 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarJ8);
                        androidx.compose.ui.node.g.a aVar1113 = androidx.compose.ui.node.g.I;
                        function0A2 = aVar1113.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarB8, aVar1113.e());
                        y7.n(c0VarD2, b1VarK16, aVar1113.g());
                        function2B2 = aVar1113.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN16, aVar1113.f());
                        androidx.compose.foundation.layout.n0 n0Var8 = androidx.compose.foundation.layout.n0.f16227a;
                        int i116 = R.drawable.intercom_kebab;
                        boolean z112 = !((Boolean) n3Var.getValue()).booleanValue();
                        c0VarR.E(-1935443118);
                        if ((i17 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i116, str8, z112, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.a0 a0VarB8 = i6.B(aVar1112, androidx.compose.ui.unit.h.r(220));
                        boolean zBooleanValue8 = ((Boolean) n3Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        int i27 = IntercomTheme.$stable;
                        long jM690getBackground0d7_KjU8 = intercomTheme8.getColors(c0VarR, i27).m690getBackground0d7_KjU();
                        androidx.compose.foundation.shape.e eVarM8 = intercomTheme8.getShapes(c0VarR, i27).m();
                        float fR8 = androidx.compose.ui.unit.h.r(8);
                        c0VarR.E(-1935428387);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        j13 = j12;
                        function9 = function8;
                        function10 = function7;
                        androidx.compose.material3.r.h(zBooleanValue8, (Function0) objI2, a0VarB8, 0L, null, null, eVarM8, jM690getBackground0d7_KjU8, 0.0f, fR8, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    list3 = list2;
                    function11 = function10;
                    j14 = j13;
                    function12 = function9;
                } else {
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i12 != 0) {
                        jA = androidx.compose.ui.graphics.q0.f38131b.a();
                    } else {
                        jA = j11;
                    }
                    if (i14 != 0) {
                        function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                            }
                        };
                    } else {
                        function6 = function4;
                    }
                    androidx.compose.ui.e.c cVarQ9 = androidx.compose.ui.e.f37317a.q();
                    androidx.compose.ui.a0.a aVar1114 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarE9 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ9, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, aVar1114);
                    androidx.compose.ui.node.g.a aVar1115 = androidx.compose.ui.node.g.I;
                    function0A = aVar1115.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE9, aVar1115.e());
                    y7.n(c0VarD, b1VarK17, aVar1115.g());
                    function2B = aVar1115.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN17, aVar1115.f());
                    y5 y5Var9 = y5.f16577a;
                    c0VarR.E(2047867882);
                    it = listEmptyList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (listEmptyList.isEmpty()) {
                        c0VarR.E(2048373646);
                        c0VarR.A();
                        c0VarR.j(iA);
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final Function1 function119 = function5;
                            final Function1 function1110 = function6;
                            final long j113 = jA;
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function119, j113, function1110, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    list2 = listEmptyList;
                    function7 = function5;
                    function8 = function6;
                    j12 = jA;
                    if (list2.size() == 1) {
                        c0VarR.E(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                        String text9 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                        int iIcon9 = icon(headerMenuItem2);
                        boolean enabled9 = headerMenuItem2.getEnabled();
                        c0VarR.E(-1180838359);
                        if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean zD9 = z12 | c0VarR.D(headerMenuItem2);
                        if ((i17 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zD9 | z13;
                        objI3 = c0VarR.i0();
                        if (z14) {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text9, iIcon9, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled9, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                        c0VarR.A();
                        function10 = function7;
                        j13 = j12;
                        function9 = function8;
                    } else {
                        String str9 = unreadMessagesCount;
                        c0VarR.E(2049182219);
                        c0VarR.E(-1180824432);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (n3) objI0;
                        c0VarR.A();
                        androidx.compose.ui.a0.a aVar1116 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.a0 a0VarJ9 = i6.J(aVar1116, null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarB9 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarJ9);
                        androidx.compose.ui.node.g.a aVar1117 = androidx.compose.ui.node.g.I;
                        function0A2 = aVar1117.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarB9, aVar1117.e());
                        y7.n(c0VarD2, b1VarK18, aVar1117.g());
                        function2B2 = aVar1117.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN18, aVar1117.f());
                        androidx.compose.foundation.layout.n0 n0Var9 = androidx.compose.foundation.layout.n0.f16227a;
                        int i117 = R.drawable.intercom_kebab;
                        boolean z113 = !((Boolean) n3Var.getValue()).booleanValue();
                        c0VarR.E(-1935443118);
                        if ((i17 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i117, str9, z113, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.a0 a0VarB9 = i6.B(aVar1116, androidx.compose.ui.unit.h.r(220));
                        boolean zBooleanValue9 = ((Boolean) n3Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        int i28 = IntercomTheme.$stable;
                        long jM690getBackground0d7_KjU9 = intercomTheme9.getColors(c0VarR, i28).m690getBackground0d7_KjU();
                        androidx.compose.foundation.shape.e eVarM9 = intercomTheme9.getShapes(c0VarR, i28).m();
                        float fR9 = androidx.compose.ui.unit.h.r(8);
                        c0VarR.E(-1935428387);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        j13 = j12;
                        function9 = function8;
                        function10 = function7;
                        androidx.compose.material3.r.h(zBooleanValue9, (Function0) objI2, a0VarB9, 0L, null, null, eVarM9, jM690getBackground0d7_KjU9, 0.0f, fR9, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    list3 = list2;
                    function11 = function10;
                    j14 = j13;
                    function12 = function9;
                }
                s5VarT2 = c0VarR.T();
                if (s5VarT2 != null) {
                    s5VarT2.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, function11, j14, function12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            function4 = function2;
            if (i16 != 1) {
                if (i16 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i12 != 0) {
                    jA = androidx.compose.ui.graphics.q0.f38131b.a();
                } else {
                    jA = j11;
                }
                if (i14 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                androidx.compose.ui.e.c cVarQ10 = androidx.compose.ui.e.f37317a.q();
                androidx.compose.ui.a0.a aVar1118 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarE10 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ10, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, aVar1118);
                androidx.compose.ui.node.g.a aVar1119 = androidx.compose.ui.node.g.I;
                function0A = aVar1119.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE10, aVar1119.e());
                y7.n(c0VarD, b1VarK19, aVar1119.g());
                function2B = aVar1119.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN19, aVar1119.f());
                y5 y5Var10 = y5.f16577a;
                c0VarR.E(2047867882);
                it = listEmptyList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (listEmptyList.isEmpty()) {
                    c0VarR.E(2048373646);
                    c0VarR.A();
                    c0VarR.j(iA);
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Function1 function1111 = function5;
                        final Function1 function1112 = function6;
                        final long j114 = jA;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function1111, j114, function1112, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                list2 = listEmptyList;
                function7 = function5;
                function8 = function6;
                j12 = jA;
                if (list2.size() == 1) {
                    c0VarR.E(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                    String text10 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                    int iIcon10 = icon(headerMenuItem2);
                    boolean enabled10 = headerMenuItem2.getEnabled();
                    c0VarR.E(-1180838359);
                    if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zD10 = z12 | c0VarR.D(headerMenuItem2);
                    if ((i17 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zD10 | z13;
                    objI3 = c0VarR.i0();
                    if (z14) {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text10, iIcon10, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled10, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                    c0VarR.A();
                    function10 = function7;
                    j13 = j12;
                    function9 = function8;
                } else {
                    String str10 = unreadMessagesCount;
                    c0VarR.E(2049182219);
                    c0VarR.E(-1180824432);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (n3) objI0;
                    c0VarR.A();
                    androidx.compose.ui.a0.a aVar11110 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarJ10 = i6.J(aVar11110, null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarB10 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarJ10);
                    androidx.compose.ui.node.g.a aVar11111 = androidx.compose.ui.node.g.I;
                    function0A2 = aVar11111.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB10, aVar11111.e());
                    y7.n(c0VarD2, b1VarK110, aVar11111.g());
                    function2B2 = aVar11111.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN110, aVar11111.f());
                    androidx.compose.foundation.layout.n0 n0Var10 = androidx.compose.foundation.layout.n0.f16227a;
                    int i118 = R.drawable.intercom_kebab;
                    boolean z114 = !((Boolean) n3Var.getValue()).booleanValue();
                    c0VarR.E(-1935443118);
                    if ((i17 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i118, str10, z114, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.a0 a0VarB10 = i6.B(aVar11110, androidx.compose.ui.unit.h.r(220));
                    boolean zBooleanValue10 = ((Boolean) n3Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                    int i29 = IntercomTheme.$stable;
                    long jM690getBackground0d7_KjU10 = intercomTheme10.getColors(c0VarR, i29).m690getBackground0d7_KjU();
                    androidx.compose.foundation.shape.e eVarM10 = intercomTheme10.getShapes(c0VarR, i29).m();
                    float fR10 = androidx.compose.ui.unit.h.r(8);
                    c0VarR.E(-1935428387);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    j13 = j12;
                    function9 = function8;
                    function10 = function7;
                    androidx.compose.material3.r.h(zBooleanValue10, (Function0) objI2, a0VarB10, 0L, null, null, eVarM10, jM690getBackground0d7_KjU10, 0.0f, fR10, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                c0VarR.A();
                c0VarR.o();
                list3 = list2;
                function11 = function10;
                j14 = j13;
                function12 = function9;
            } else {
                if (i16 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i12 != 0) {
                    jA = androidx.compose.ui.graphics.q0.f38131b.a();
                } else {
                    jA = j11;
                }
                if (i14 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                androidx.compose.ui.e.c cVarQ11 = androidx.compose.ui.e.f37317a.q();
                androidx.compose.ui.a0.a aVar11112 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarE11 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ11, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, aVar11112);
                androidx.compose.ui.node.g.a aVar11113 = androidx.compose.ui.node.g.I;
                function0A = aVar11113.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE11, aVar11113.e());
                y7.n(c0VarD, b1VarK111, aVar11113.g());
                function2B = aVar11113.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111, aVar11113.f());
                y5 y5Var11 = y5.f16577a;
                c0VarR.E(2047867882);
                it = listEmptyList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (listEmptyList.isEmpty()) {
                    c0VarR.E(2048373646);
                    c0VarR.A();
                    c0VarR.j(iA);
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Function1 function1113 = function5;
                        final Function1 function1114 = function6;
                        final long j115 = jA;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function1113, j115, function1114, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                list2 = listEmptyList;
                function7 = function5;
                function8 = function6;
                j12 = jA;
                if (list2.size() == 1) {
                    c0VarR.E(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                    String text11 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                    int iIcon11 = icon(headerMenuItem2);
                    boolean enabled11 = headerMenuItem2.getEnabled();
                    c0VarR.E(-1180838359);
                    if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zD11 = z12 | c0VarR.D(headerMenuItem2);
                    if ((i17 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zD11 | z13;
                    objI3 = c0VarR.i0();
                    if (z14) {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text11, iIcon11, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled11, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                    c0VarR.A();
                    function10 = function7;
                    j13 = j12;
                    function9 = function8;
                } else {
                    String str11 = unreadMessagesCount;
                    c0VarR.E(2049182219);
                    c0VarR.E(-1180824432);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (n3) objI0;
                    c0VarR.A();
                    androidx.compose.ui.a0.a aVar11114 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarJ11 = i6.J(aVar11114, null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarB11 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarJ11);
                    androidx.compose.ui.node.g.a aVar11115 = androidx.compose.ui.node.g.I;
                    function0A2 = aVar11115.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB11, aVar11115.e());
                    y7.n(c0VarD2, b1VarK112, aVar11115.g());
                    function2B2 = aVar11115.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN112, aVar11115.f());
                    androidx.compose.foundation.layout.n0 n0Var11 = androidx.compose.foundation.layout.n0.f16227a;
                    int i119 = R.drawable.intercom_kebab;
                    boolean z115 = !((Boolean) n3Var.getValue()).booleanValue();
                    c0VarR.E(-1935443118);
                    if ((i17 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i119, str11, z115, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.a0 a0VarB11 = i6.B(aVar11114, androidx.compose.ui.unit.h.r(220));
                    boolean zBooleanValue11 = ((Boolean) n3Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                    int i210 = IntercomTheme.$stable;
                    long jM690getBackground0d7_KjU11 = intercomTheme11.getColors(c0VarR, i210).m690getBackground0d7_KjU();
                    androidx.compose.foundation.shape.e eVarM11 = intercomTheme11.getShapes(c0VarR, i210).m();
                    float fR11 = androidx.compose.ui.unit.h.r(8);
                    c0VarR.E(-1935428387);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    j13 = j12;
                    function9 = function8;
                    function10 = function7;
                    androidx.compose.material3.r.h(zBooleanValue11, (Function0) objI2, a0VarB11, 0L, null, null, eVarM11, jM690getBackground0d7_KjU11, 0.0f, fR11, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                c0VarR.A();
                c0VarR.o();
                list3 = list2;
                function11 = function10;
                j14 = j13;
                function12 = function9;
            }
            s5VarT2 = c0VarR.T();
            if (s5VarT2 != null) {
                s5VarT2.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, function11, j14, function12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= a5.S0;
        j11 = j10;
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                function4 = function2;
                if (c0VarR.k0(function4)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i17 |= i15;
            }
            if (i16 != 1) {
                if (i16 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i12 != 0) {
                    jA = androidx.compose.ui.graphics.q0.f38131b.a();
                } else {
                    jA = j11;
                }
                if (i14 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                androidx.compose.ui.e.c cVarQ12 = androidx.compose.ui.e.f37317a.q();
                androidx.compose.ui.a0.a aVar11116 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarE12 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ12, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, aVar11116);
                androidx.compose.ui.node.g.a aVar11117 = androidx.compose.ui.node.g.I;
                function0A = aVar11117.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE12, aVar11117.e());
                y7.n(c0VarD, b1VarK113, aVar11117.g());
                function2B = aVar11117.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN113, aVar11117.f());
                y5 y5Var12 = y5.f16577a;
                c0VarR.E(2047867882);
                it = listEmptyList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (listEmptyList.isEmpty()) {
                    c0VarR.E(2048373646);
                    c0VarR.A();
                    c0VarR.j(iA);
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Function1 function1115 = function5;
                        final Function1 function1116 = function6;
                        final long j116 = jA;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function1115, j116, function1116, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                list2 = listEmptyList;
                function7 = function5;
                function8 = function6;
                j12 = jA;
                if (list2.size() == 1) {
                    c0VarR.E(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                    String text12 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                    int iIcon12 = icon(headerMenuItem2);
                    boolean enabled12 = headerMenuItem2.getEnabled();
                    c0VarR.E(-1180838359);
                    if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zD12 = z12 | c0VarR.D(headerMenuItem2);
                    if ((i17 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zD12 | z13;
                    objI3 = c0VarR.i0();
                    if (z14) {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text12, iIcon12, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled12, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                    c0VarR.A();
                    function10 = function7;
                    j13 = j12;
                    function9 = function8;
                } else {
                    String str12 = unreadMessagesCount;
                    c0VarR.E(2049182219);
                    c0VarR.E(-1180824432);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (n3) objI0;
                    c0VarR.A();
                    androidx.compose.ui.a0.a aVar11118 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarJ12 = i6.J(aVar11118, null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarB12 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarJ12);
                    androidx.compose.ui.node.g.a aVar11119 = androidx.compose.ui.node.g.I;
                    function0A2 = aVar11119.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB12, aVar11119.e());
                    y7.n(c0VarD2, b1VarK114, aVar11119.g());
                    function2B2 = aVar11119.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN114, aVar11119.f());
                    androidx.compose.foundation.layout.n0 n0Var12 = androidx.compose.foundation.layout.n0.f16227a;
                    int i1110 = R.drawable.intercom_kebab;
                    boolean z116 = !((Boolean) n3Var.getValue()).booleanValue();
                    c0VarR.E(-1935443118);
                    if ((i17 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i1110, str12, z116, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.a0 a0VarB12 = i6.B(aVar11118, androidx.compose.ui.unit.h.r(220));
                    boolean zBooleanValue12 = ((Boolean) n3Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                    int i211 = IntercomTheme.$stable;
                    long jM690getBackground0d7_KjU12 = intercomTheme12.getColors(c0VarR, i211).m690getBackground0d7_KjU();
                    androidx.compose.foundation.shape.e eVarM12 = intercomTheme12.getShapes(c0VarR, i211).m();
                    float fR12 = androidx.compose.ui.unit.h.r(8);
                    c0VarR.E(-1935428387);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    j13 = j12;
                    function9 = function8;
                    function10 = function7;
                    androidx.compose.material3.r.h(zBooleanValue12, (Function0) objI2, a0VarB12, 0L, null, null, eVarM12, jM690getBackground0d7_KjU12, 0.0f, fR12, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                c0VarR.A();
                c0VarR.o();
                list3 = list2;
                function11 = function10;
                j14 = j13;
                function12 = function9;
            } else {
                if (i16 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i12 != 0) {
                    jA = androidx.compose.ui.graphics.q0.f38131b.a();
                } else {
                    jA = j11;
                }
                if (i14 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                androidx.compose.ui.e.c cVarQ13 = androidx.compose.ui.e.f37317a.q();
                androidx.compose.ui.a0.a aVar111110 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarE13 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ13, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, aVar111110);
                androidx.compose.ui.node.g.a aVar111111 = androidx.compose.ui.node.g.I;
                function0A = aVar111111.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE13, aVar111111.e());
                y7.n(c0VarD, b1VarK115, aVar111111.g());
                function2B = aVar111111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN115, aVar111111.f());
                y5 y5Var13 = y5.f16577a;
                c0VarR.E(2047867882);
                it = listEmptyList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (listEmptyList.isEmpty()) {
                    c0VarR.E(2048373646);
                    c0VarR.A();
                    c0VarR.j(iA);
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Function1 function1117 = function5;
                        final Function1 function1118 = function6;
                        final long j117 = jA;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function1117, j117, function1118, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                list2 = listEmptyList;
                function7 = function5;
                function8 = function6;
                j12 = jA;
                if (list2.size() == 1) {
                    c0VarR.E(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                    String text13 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                    int iIcon13 = icon(headerMenuItem2);
                    boolean enabled13 = headerMenuItem2.getEnabled();
                    c0VarR.E(-1180838359);
                    if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zD13 = z12 | c0VarR.D(headerMenuItem2);
                    if ((i17 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zD13 | z13;
                    objI3 = c0VarR.i0();
                    if (z14) {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text13, iIcon13, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled13, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                    c0VarR.A();
                    function10 = function7;
                    j13 = j12;
                    function9 = function8;
                } else {
                    String str13 = unreadMessagesCount;
                    c0VarR.E(2049182219);
                    c0VarR.E(-1180824432);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (n3) objI0;
                    c0VarR.A();
                    androidx.compose.ui.a0.a aVar111112 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarJ13 = i6.J(aVar111112, null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarB13 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarJ13);
                    androidx.compose.ui.node.g.a aVar111113 = androidx.compose.ui.node.g.I;
                    function0A2 = aVar111113.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB13, aVar111113.e());
                    y7.n(c0VarD2, b1VarK116, aVar111113.g());
                    function2B2 = aVar111113.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN116, aVar111113.f());
                    androidx.compose.foundation.layout.n0 n0Var13 = androidx.compose.foundation.layout.n0.f16227a;
                    int i1111 = R.drawable.intercom_kebab;
                    boolean z117 = !((Boolean) n3Var.getValue()).booleanValue();
                    c0VarR.E(-1935443118);
                    if ((i17 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i1111, str13, z117, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.a0 a0VarB13 = i6.B(aVar111112, androidx.compose.ui.unit.h.r(220));
                    boolean zBooleanValue13 = ((Boolean) n3Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                    int i212 = IntercomTheme.$stable;
                    long jM690getBackground0d7_KjU13 = intercomTheme13.getColors(c0VarR, i212).m690getBackground0d7_KjU();
                    androidx.compose.foundation.shape.e eVarM13 = intercomTheme13.getShapes(c0VarR, i212).m();
                    float fR13 = androidx.compose.ui.unit.h.r(8);
                    c0VarR.E(-1935428387);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    j13 = j12;
                    function9 = function8;
                    function10 = function7;
                    androidx.compose.material3.r.h(zBooleanValue13, (Function0) objI2, a0VarB13, 0L, null, null, eVarM13, jM690getBackground0d7_KjU13, 0.0f, fR13, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                c0VarR.A();
                c0VarR.o();
                list3 = list2;
                function11 = function10;
                j14 = j13;
                function12 = function9;
            }
            s5VarT2 = c0VarR.T();
            if (s5VarT2 != null) {
                s5VarT2.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, function11, j14, function12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        function4 = function2;
        if (i16 != 1) {
            if (i16 != 0) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list;
            }
            if (i18 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            if (i12 != 0) {
                jA = androidx.compose.ui.graphics.q0.f38131b.a();
            } else {
                jA = j11;
            }
            if (i14 != 0) {
                function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                    }
                };
            } else {
                function6 = function4;
            }
            androidx.compose.ui.e.c cVarQ14 = androidx.compose.ui.e.f37317a.q();
            androidx.compose.ui.a0.a aVar111114 = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarE14 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ14, c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK117 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, aVar111114);
            androidx.compose.ui.node.g.a aVar111115 = androidx.compose.ui.node.g.I;
            function0A = aVar111115.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE14, aVar111115.e());
            y7.n(c0VarD, b1VarK117, aVar111115.g());
            function2B = aVar111115.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN117, aVar111115.f());
            y5 y5Var14 = y5.f16577a;
            c0VarR.E(2047867882);
            it = listEmptyList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
            headerMenuItem = (HeaderMenuItem) next;
            if (headerMenuItem != null) {
                Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
            } else {
                totalCountIndicator = null;
            }
            if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
            } else {
                unreadMessagesCount = null;
            }
            z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
            if (listEmptyList.isEmpty()) {
                c0VarR.E(2048373646);
                c0VarR.A();
                c0VarR.j(iA);
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Function1 function1119 = function5;
                    final Function1 function11110 = function6;
                    final long j118 = jA;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function1119, j118, function11110, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            list2 = listEmptyList;
            function7 = function5;
            function8 = function6;
            j12 = jA;
            if (list2.size() == 1) {
                c0VarR.E(2048472753);
                headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                String text14 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                int iIcon14 = icon(headerMenuItem2);
                boolean enabled14 = headerMenuItem2.getEnabled();
                c0VarR.E(-1180838359);
                if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zD14 = z12 | c0VarR.D(headerMenuItem2);
                if ((i17 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zD14 | z13;
                objI3 = c0VarR.i0();
                if (z14) {
                    objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                c0VarR.A();
                HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text14, iIcon14, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled14, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                c0VarR.A();
                function10 = function7;
                j13 = j12;
                function9 = function8;
            } else {
                String str14 = unreadMessagesCount;
                c0VarR.E(2049182219);
                c0VarR.E(-1180824432);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (n3) objI0;
                c0VarR.A();
                androidx.compose.ui.a0.a aVar111116 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarJ14 = i6.J(aVar111116, null, false, 3, null);
                androidx.compose.ui.layout.a1 a1VarB14 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarJ14);
                androidx.compose.ui.node.g.a aVar111117 = androidx.compose.ui.node.g.I;
                function0A2 = aVar111117.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarB14, aVar111117.e());
                y7.n(c0VarD2, b1VarK118, aVar111117.g());
                function2B2 = aVar111117.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN118, aVar111117.f());
                androidx.compose.foundation.layout.n0 n0Var14 = androidx.compose.foundation.layout.n0.f16227a;
                int i1112 = R.drawable.intercom_kebab;
                boolean z118 = !((Boolean) n3Var.getValue()).booleanValue();
                c0VarR.E(-1935443118);
                if ((i17 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI1 = c0VarR.i0();
                if (z11) {
                    objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i1112, str14, z118, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                androidx.compose.ui.a0 a0VarB14 = i6.B(aVar111116, androidx.compose.ui.unit.h.r(220));
                boolean zBooleanValue14 = ((Boolean) n3Var.getValue()).booleanValue();
                IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                int i213 = IntercomTheme.$stable;
                long jM690getBackground0d7_KjU14 = intercomTheme14.getColors(c0VarR, i213).m690getBackground0d7_KjU();
                androidx.compose.foundation.shape.e eVarM14 = intercomTheme14.getShapes(c0VarR, i213).m();
                float fR14 = androidx.compose.ui.unit.h.r(8);
                c0VarR.E(-1935428387);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                j13 = j12;
                function9 = function8;
                function10 = function7;
                androidx.compose.material3.r.h(zBooleanValue14, (Function0) objI2, a0VarB14, 0L, null, null, eVarM14, jM690getBackground0d7_KjU14, 0.0f, fR14, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                c0VarR = c0VarR;
                c0VarR.o();
                c0VarR.A();
            }
            c0VarR.A();
            c0VarR.o();
            list3 = list2;
            function11 = function10;
            j14 = j13;
            function12 = function9;
        } else {
            if (i16 != 0) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list;
            }
            if (i18 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            if (i12 != 0) {
                jA = androidx.compose.ui.graphics.q0.f38131b.a();
            } else {
                jA = j11;
            }
            if (i14 != 0) {
                function6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
                    }
                };
            } else {
                function6 = function4;
            }
            androidx.compose.ui.e.c cVarQ15 = androidx.compose.ui.e.f37317a.q();
            androidx.compose.ui.a0.a aVar111118 = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarE15 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ15, c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK119 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, aVar111118);
            androidx.compose.ui.node.g.a aVar111119 = androidx.compose.ui.node.g.I;
            function0A = aVar111119.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE15, aVar111119.e());
            y7.n(c0VarD, b1VarK119, aVar111119.g());
            function2B = aVar111119.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN119, aVar111119.f());
            y5 y5Var15 = y5.f16577a;
            c0VarR.E(2047867882);
            it = listEmptyList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
            headerMenuItem = (HeaderMenuItem) next;
            if (headerMenuItem != null) {
                Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
            } else {
                totalCountIndicator = null;
            }
            if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
            } else {
                unreadMessagesCount = null;
            }
            z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
            if (listEmptyList.isEmpty()) {
                c0VarR.E(2048373646);
                c0VarR.A();
                c0VarR.j(iA);
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Function1 function11111 = function5;
                    final Function1 function11112 = function6;
                    final long j119 = jA;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(listEmptyList, function11111, j119, function11112, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            list2 = listEmptyList;
            function7 = function5;
            function8 = function6;
            j12 = jA;
            if (list2.size() == 1) {
                c0VarR.E(2048472753);
                headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list2);
                String text15 = headerMenuItem2.getLabel().getText(c0VarR, StringProvider.$stable);
                int iIcon15 = icon(headerMenuItem2);
                boolean enabled15 = headerMenuItem2.getEnabled();
                c0VarR.E(-1180838359);
                if ((i17 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zD15 = z12 | c0VarR.D(headerMenuItem2);
                if ((i17 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zD15 | z13;
                objI3 = c0VarR.i0();
                if (z14) {
                    objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(function7, headerMenuItem2, function8);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                c0VarR.A();
                HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text15, iIcon15, unreadMessagesCount, false, z10, false, (Function0) objI3, enabled15, j12, c0VarR, ((i17 << 21) & 1879048192) | 1572864, 17);
                c0VarR.A();
                function10 = function7;
                j13 = j12;
                function9 = function8;
            } else {
                String str15 = unreadMessagesCount;
                c0VarR.E(2049182219);
                c0VarR.E(-1180824432);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (n3) objI0;
                c0VarR.A();
                androidx.compose.ui.a0.a aVar1111110 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarJ15 = i6.J(aVar1111110, null, false, 3, null);
                androidx.compose.ui.layout.a1 a1VarB15 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarJ15);
                androidx.compose.ui.node.g.a aVar1111111 = androidx.compose.ui.node.g.I;
                function0A2 = aVar1111111.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarB15, aVar1111111.e());
                y7.n(c0VarD2, b1VarK1110, aVar1111111.g());
                function2B2 = aVar1111111.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN1110, aVar1111111.f());
                androidx.compose.foundation.layout.n0 n0Var15 = androidx.compose.foundation.layout.n0.f16227a;
                int i1113 = R.drawable.intercom_kebab;
                boolean z119 = !((Boolean) n3Var.getValue()).booleanValue();
                c0VarR.E(-1935443118);
                if ((i17 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI1 = c0VarR.i0();
                if (z11) {
                    objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3Var, function8);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, "More Menu", i1113, str15, z119, z10, false, (Function0) objI1, true, j12, c0VarR, ((i17 << 21) & 1879048192) | 102236208, 1);
                androidx.compose.ui.a0 a0VarB15 = i6.B(aVar1111110, androidx.compose.ui.unit.h.r(220));
                boolean zBooleanValue15 = ((Boolean) n3Var.getValue()).booleanValue();
                IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                int i214 = IntercomTheme.$stable;
                long jM690getBackground0d7_KjU15 = intercomTheme15.getColors(c0VarR, i214).m690getBackground0d7_KjU();
                androidx.compose.foundation.shape.e eVarM15 = intercomTheme15.getShapes(c0VarR, i214).m();
                float fR15 = androidx.compose.ui.unit.h.r(8);
                c0VarR.E(-1935428387);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3Var);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                j13 = j12;
                function9 = function8;
                function10 = function7;
                androidx.compose.material3.r.h(zBooleanValue15, (Function0) objI2, a0VarB15, 0L, null, null, eVarM15, jM690getBackground0d7_KjU15, 0.0f, fR15, null, androidx.compose.runtime.internal.w.e(1309645384, true, new ConversationKebabKt$ConversationKebab$3$3$3(list2, function7, function8, j13, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
                c0VarR = c0VarR;
                c0VarR.o();
                c0VarR.A();
            }
            c0VarR.A();
            c0VarR.o();
            list3 = list2;
            function11 = function10;
            j14 = j13;
            function12 = function9;
        }
        s5VarT2 = c0VarR.T();
        if (s5VarT2 != null) {
            s5VarT2.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, function11, j14, function12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$0(HeaderMenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$1(MetricData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(n3 isExpanded) {
        Intrinsics.checkNotNullParameter(isExpanded, "$isExpanded");
        isExpanded.setValue(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(n3 isExpanded, Function1 function1) {
        Intrinsics.checkNotNullParameter(isExpanded, "$isExpanded");
        isExpanded.setValue(Boolean.valueOf(!((Boolean) isExpanded.getValue()).booleanValue()));
        function1.invoke(MetricData.MoreMenuClicked.INSTANCE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$13$lambda$4(List list, Function1 function1, long j10, Function1 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        m227ConversationKebabcf5BqRc(list, function1, j10, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(Function1 function1, HeaderMenuItem menuItem, Function1 function2) {
        Intrinsics.checkNotNullParameter(menuItem, "$menuItem");
        function1.invoke(menuItem);
        function2.invoke(metricData(menuItem, false));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$14(List list, Function1 function1, long j10, Function1 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        m227ConversationKebabcf5BqRc(list, function1, j10, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String badgeText(HeaderMenuItem headerMenuItem) {
        if (!(headerMenuItem instanceof HeaderMenuItem.Messages)) {
            return null;
        }
        String unreadMessagesCount = ((HeaderMenuItem.Messages) headerMenuItem).getUnreadMessagesCount();
        if (unreadMessagesCount.length() == 0) {
            return null;
        }
        return unreadMessagesCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int icon(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return R.drawable.intercom_inbox;
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return R.drawable.intercom_send_message_icon;
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return R.drawable.intercom_ticket_detail_icon;
        }
        if (headerMenuItem instanceof HeaderMenuItem.Help) {
            return R.drawable.intercom_help_centre_icon;
        }
        throw new kotlin.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MetricData metricData(HeaderMenuItem headerMenuItem, boolean z10) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return new MetricData.ConversationsInMoreMenuClicked(z10);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return new MetricData.TicketsInMoreMenuClicked(z10);
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return new MetricData.NewConversationInMoreMenuClicked(z10);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Help) {
            return MetricData.HelpInMoreMenuClicked.INSTANCE;
        }
        throw new kotlin.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowUnreadDot(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return ((HeaderMenuItem.Tickets) headerMenuItem).getHasUnreadTickets();
        }
        return false;
    }
}
