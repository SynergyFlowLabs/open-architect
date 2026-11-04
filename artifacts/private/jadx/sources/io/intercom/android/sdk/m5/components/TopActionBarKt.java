package io.intercom.android.sdk.m5.components;

import android.app.Activity;
import android.view.Window;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.u7;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ei;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTopActionBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopActionBar.kt\nio/intercom/android/sdk/m5/components/TopActionBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,240:1\n75#2:241\n87#3:242\n83#3,10:243\n87#3:330\n84#3,9:331\n94#3:413\n94#3:422\n80#4,6:253\n87#4,3:268\n90#4,2:277\n80#4,6:298\n87#4,3:313\n90#4,2:322\n80#4,6:340\n87#4,3:355\n90#4,2:364\n80#4,6:378\n87#4,3:393\n90#4,2:402\n94#4:408\n94#4:412\n94#4:417\n94#4:421\n391#5,9:259\n400#5:279\n391#5,9:304\n400#5:324\n391#5,9:346\n400#5:366\n391#5,9:384\n400#5:404\n401#5,2:406\n401#5,2:410\n401#5,2:415\n401#5,2:419\n4360#6,6:271\n4360#6,6:316\n4360#6,6:358\n4360#6,6:396\n113#7:280\n113#7:281\n113#7:325\n113#7:326\n113#7:327\n113#7:328\n113#7:329\n113#7:405\n113#7:414\n1282#8,6:282\n99#9:288\n96#9,9:289\n99#9:367\n95#9,10:368\n106#9:409\n106#9:418\n*S KotlinDebug\n*F\n+ 1 TopActionBar.kt\nio/intercom/android/sdk/m5/components/TopActionBarKt\n*L\n58#1:241\n63#1:242\n63#1:243,10\n103#1:330\n103#1:331,9\n103#1:413\n63#1:422\n63#1:253,6\n63#1:268,3\n63#1:277,2\n64#1:298,6\n64#1:313,3\n64#1:322,2\n103#1:340,6\n103#1:355,3\n103#1:364,2\n113#1:378,6\n113#1:393,3\n113#1:402,2\n113#1:408\n103#1:412\n64#1:417\n63#1:421\n63#1:259,9\n63#1:279\n64#1:304,9\n64#1:324\n103#1:346,9\n103#1:366\n113#1:384,9\n113#1:404\n113#1:406,2\n103#1:410,2\n64#1:415,2\n63#1:419,2\n63#1:271,6\n64#1:316,6\n103#1:358,6\n113#1:396,6\n69#1:280\n70#1:281\n74#1:325\n87#1:326\n92#1:327\n99#1:328\n102#1:329\n120#1:405\n133#1:414\n71#1:282,6\n64#1:288\n64#1:289,9\n113#1:367\n113#1:368,10\n113#1:409\n64#1:418\n*E\n"})
public final class TopActionBarKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:109:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160  */
    /* JADX WARN: Code duplicated, block: B:115:0x0164  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:118:0x0173  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x018a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0191  */
    /* JADX WARN: Code duplicated, block: B:128:0x0195  */
    /* JADX WARN: Code duplicated, block: B:130:0x019f  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x0233 A[PHI: r0 r1 r4 r6 r7 r9 r10 r11 r15 r30 r31 r64 r66 r67
      0x0233: PHI (r0v50 java.lang.String) = (r0v21 java.lang.String), (r0v52 java.lang.String) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r1v18 androidx.compose.ui.a0) = (r1v6 androidx.compose.ui.a0), (r1v24 androidx.compose.ui.a0) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r4v50 java.lang.String) = (r4v9 java.lang.String), (r4v51 java.lang.String) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r6v23 java.lang.Integer) = (r6v2 java.lang.Integer), (r6v1 java.lang.Integer) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r7v34 long) = (r7v9 long), (r7v35 long) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r9v13 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r9v4 kotlin.jvm.functions.Function0<kotlin.Unit>), (r9v15 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r10v39 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r10v2 kotlin.jvm.functions.Function0<kotlin.Unit>), (r10v1 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r11v16 boolean) = (r11v2 boolean), (r11v18 boolean) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r15v22 long) = (r15v2 long), (r15v23 long) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r30v2 java.lang.Integer) = (r30v0 java.lang.Integer), (r30v3 java.lang.Integer) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r31v2 java.util.List<io.intercom.android.sdk.m5.components.avatar.AvatarWrapper>) = 
      (r31v0 java.util.List<io.intercom.android.sdk.m5.components.avatar.AvatarWrapper>)
      (r31v3 java.util.List<io.intercom.android.sdk.m5.components.avatar.AvatarWrapper>)
     binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r64v2 long) = (r64v0 long), (r64v3 long) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r66v2 int) = (r66v0 int), (r66v4 int) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r67v2 int) = (r67v0 int), (r67v3 int) binds: [B:199:0x02d0, B:160:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x023b  */
    /* JADX WARN: Code duplicated, block: B:164:0x023e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0242  */
    /* JADX WARN: Code duplicated, block: B:168:0x0247  */
    /* JADX WARN: Code duplicated, block: B:169:0x0249  */
    /* JADX WARN: Code duplicated, block: B:171:0x024f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0252  */
    /* JADX WARN: Code duplicated, block: B:174:0x0257  */
    /* JADX WARN: Code duplicated, block: B:176:0x025d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0262  */
    /* JADX WARN: Code duplicated, block: B:181:0x026e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0270  */
    /* JADX WARN: Code duplicated, block: B:185:0x0276  */
    /* JADX WARN: Code duplicated, block: B:186:0x0287  */
    /* JADX WARN: Code duplicated, block: B:189:0x028d  */
    /* JADX WARN: Code duplicated, block: B:190:0x029f  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:194:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:196:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:197:0x02be  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:211:0x0330  */
    /* JADX WARN: Code duplicated, block: B:214:0x033c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0340  */
    /* JADX WARN: Code duplicated, block: B:218:0x0361  */
    /* JADX WARN: Code duplicated, block: B:220:0x036f  */
    /* JADX WARN: Code duplicated, block: B:223:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:224:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:227:0x03da  */
    /* JADX WARN: Code duplicated, block: B:229:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:232:0x042a  */
    /* JADX WARN: Code duplicated, block: B:235:0x0436  */
    /* JADX WARN: Code duplicated, block: B:236:0x043a  */
    /* JADX WARN: Code duplicated, block: B:239:0x0459  */
    /* JADX WARN: Code duplicated, block: B:241:0x0467  */
    /* JADX WARN: Code duplicated, block: B:244:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:249:0x04de  */
    /* JADX WARN: Code duplicated, block: B:250:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:253:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:254:0x0542  */
    /* JADX WARN: Code duplicated, block: B:256:0x054b  */
    /* JADX WARN: Code duplicated, block: B:257:0x0589  */
    /* JADX WARN: Code duplicated, block: B:260:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:263:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:264:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:267:0x0611  */
    /* JADX WARN: Code duplicated, block: B:269:0x061f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:272:0x0705  */
    /* JADX WARN: Code duplicated, block: B:274:0x070b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:294:0x0844  */
    /* JADX WARN: Code duplicated, block: B:295:0x0847  */
    /* JADX WARN: Code duplicated, block: B:298:0x086b  */
    /* JADX WARN: Code duplicated, block: B:302:0x0898  */
    /* JADX WARN: Code duplicated, block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TopActionBar-NpQZenA, reason: not valid java name */
    public static final void m172TopActionBarNpQZenA(@Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @Nullable String str2, @androidx.annotation.v @Nullable Integer num, @Nullable List<AvatarWrapper> list, @Nullable Function0<Unit> function0, @androidx.annotation.v @Nullable Integer num2, boolean z10, long j10, long j11, long j12, @Nullable Function0<Unit> function1, @Nullable pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        String str3;
        int i14;
        int i15;
        int i16;
        Integer num3;
        int i17;
        int i18;
        int i19;
        Function0<Unit> function2;
        int i20;
        final Integer numValueOf;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i30;
        int i31;
        androidx.compose.ui.a0 a0Var3;
        String str4;
        List<AvatarWrapper> listEmptyList;
        boolean z11;
        long jM704getHeader0d7_KjU;
        long jM711getOnHeader0d7_KjU;
        long jM711getOnHeader0d7_KjU2;
        Function0<Unit> function3;
        int i32;
        String str5;
        int i33;
        List<AvatarWrapper> list2;
        Integer num4;
        final long j13;
        long j14;
        final Function0<Unit> function4;
        String str6;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        Activity activity;
        final Window window;
        androidx.compose.ui.a0.a aVar;
        String str7;
        int iHashCode;
        String str8;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function0<Unit> function5;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z12;
        Object objI0;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        y5 y5Var;
        Function0<Unit> function6;
        float fR;
        boolean z13;
        int iHashCode3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        androidx.compose.runtime.c0 c0Var2;
        long j15;
        int i34;
        int i35;
        String str9;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar5;
        final pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar6;
        androidx.compose.runtime.c0 c0Var3;
        final String str10;
        final long j16;
        final Integer num5;
        final List<AvatarWrapper> list3;
        final androidx.compose.ui.a0 a0Var4;
        final long j17;
        final Function0<Unit> function7;
        final String str11;
        final long j18;
        final Function0<Unit> function8;
        final boolean z14;
        final Integer num6;
        int i36;
        s5 s5VarT;
        int i37;
        int i38;
        int i39;
        int i40;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1160200926);
        int i41 = i12 & 1;
        if (i41 != 0) {
            i13 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i13 = i10;
        }
        int i42 = i12 & 2;
        if (i42 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                str3 = str;
                i13 |= c0VarR.D(str3) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i10 & 896) == 0) {
                    if (c0VarR.D(str2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i10 & 7168) == 0) {
                        num3 = num;
                        if (c0VarR.D(num3)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        i13 |= 8192;
                    }
                    i19 = i12 & 32;
                    if (i19 != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                        function2 = function0;
                    } else {
                        function2 = function0;
                        if ((i10 & 458752) == 0) {
                            if (c0VarR.k0(function2)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i13 |= i20;
                        }
                    }
                    if ((i10 & 3670016) == 0) {
                        numValueOf = num2;
                        if ((i12 & 64) == 0 || !c0VarR.D(numValueOf)) {
                            i40 = 524288;
                        } else {
                            i40 = 1048576;
                        }
                        i13 |= i40;
                    } else {
                        numValueOf = num2;
                    }
                    i21 = i12 & 128;
                    if (i21 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (c0VarR.G(z10)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i13 |= i22;
                    }
                    if ((i10 & 234881024) == 0) {
                        if ((i12 & 256) == 0) {
                            i23 = i41;
                            if (c0VarR.L(j10)) {
                                i39 = 67108864;
                            }
                            i13 |= i39;
                        } else {
                            i23 = i41;
                        }
                        i39 = com.google.api.client.googleapis.media.a.f115410j;
                        i13 |= i39;
                    } else {
                        i23 = i41;
                    }
                    if ((i10 & 1879048192) != 0) {
                        if ((i12 & 512) == 0 || !c0VarR.L(j11)) {
                            i38 = 268435456;
                        } else {
                            i38 = 536870912;
                        }
                        i13 |= i38;
                    }
                    if ((i11 & 14) == 0) {
                        if ((i12 & 1024) == 0 || !c0VarR.L(j12)) {
                            i37 = 2;
                        } else {
                            i37 = 4;
                        }
                        i24 = i37 | i11;
                    } else {
                        i24 = i11;
                    }
                    i25 = i24;
                    i26 = i12 & 2048;
                    if (i26 != 0) {
                        i27 = i25 | 48;
                    } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                        if (c0VarR.k0(function1)) {
                            i28 = 32;
                        } else {
                            i28 = 16;
                        }
                        i27 = i25 | i28;
                    } else {
                        i27 = i25;
                    }
                    i29 = i12 & 4096;
                    if (i29 != 0) {
                        if ((i11 & 896) == 0) {
                            nVar2 = nVar;
                            if (c0VarR.k0(nVar2)) {
                                i30 = 256;
                            } else {
                                i30 = 128;
                            }
                            i27 |= i30;
                        }
                        if (i18 == 16) {
                            i31 = i29;
                            if ((1533916891 & i13) != 306783378 && (i27 & 731) == 146 && c0VarR.d()) {
                                c0VarR.u();
                                z14 = z10;
                                function7 = function1;
                                c0Var3 = c0VarR;
                                nVar6 = nVar2;
                                a0Var4 = a0Var2;
                                str11 = str3;
                                num5 = num3;
                                str10 = str2;
                                list3 = list;
                                j17 = j11;
                                j16 = j12;
                                num6 = numValueOf;
                                function8 = function2;
                                j18 = j10;
                            }
                            s5VarT = c0Var3.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i31 = i29;
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i42 != 0) {
                                str3 = "";
                            }
                            if (i14 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if (i16 != 0) {
                                num3 = null;
                            }
                            if (i18 != 0) {
                                listEmptyList = CollectionsKt.emptyList();
                            } else {
                                listEmptyList = list;
                            }
                            if (i19 != 0) {
                                function2 = null;
                            }
                            if ((i12 & 64) != 0) {
                                numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                                i13 &= -3670017;
                            }
                            if (i21 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i12 & 256) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                                i13 &= -234881025;
                            } else {
                                jM704getHeader0d7_KjU = j10;
                            }
                            if ((i12 & 512) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                                i13 = (-1879048193) & i13;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                                i27 &= -15;
                            } else {
                                jM711getOnHeader0d7_KjU2 = j12;
                            }
                            if (i26 != 0) {
                                function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function3 = function1;
                            }
                            i32 = i27;
                            str5 = str4;
                            i33 = i13;
                            list2 = listEmptyList;
                            num4 = num3;
                            j13 = jM711getOnHeader0d7_KjU;
                            j14 = jM711getOnHeader0d7_KjU2;
                            function4 = function3;
                            str6 = str3;
                            if (i31 != 0) {
                                nVar3 = null;
                            }
                            c0VarR.Z();
                            activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                            if (activity != null) {
                                window = activity.getWindow();
                            } else {
                                window = null;
                            }
                            c0VarR.E(-1152542544);
                            if (window != null) {
                                androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                                    }
                                }, c0VarR, 0);
                                Unit unit = Unit.f312394a;
                            }
                            c0VarR.A();
                            aVar = androidx.compose.ui.a0.E;
                            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                            androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                            str7 = str5;
                            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0VarR, 0);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
                            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                            str8 = str6;
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
                            function5 = function2;
                            y7.n(c0VarD, a1VarB, aVar3.e());
                            y7.n(c0VarD, b1VarK, aVar3.g());
                            function2B = aVar3.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar3.f());
                            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                            long j19 = jM704getHeader0d7_KjU;
                            float f10 = 4;
                            androidx.compose.ui.a0 a0VarV = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j19, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f10), 0.0f, 11, null);
                            c0VarR.E(369281761);
                            if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.i1.j(a0VarV, false, null, null, null, (Function0) objI0, 15, null);
                            androidx.compose.ui.layout.a1 a1VarE = u5.e(qVar.w(), aVar2.q(), c0VarR, 48);
                            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarJ);
                            function0A2 = aVar3.a();
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
                            y7.n(c0VarD2, a1VarE, aVar3.e());
                            y7.n(c0VarD2, b1VarK2, aVar3.g());
                            function2B2 = aVar3.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN2, aVar3.f());
                            y5Var = y5.f16577a;
                            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
                            c0VarR.E(-1851697424);
                            if (function5 != null || numValueOf == null) {
                                function6 = function5;
                            } else {
                                ei.D(function5, null, false, null, null, null, androidx.compose.runtime.internal.w.e(-1893533585, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$TopActionBar$3$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num7) {
                                        invoke(c0Var4, num7.intValue());
                                        return Unit.f312394a;
                                    }

                                    @androidx.compose.runtime.o
                                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                    public final void invoke(androidx.compose.runtime.c0 c0Var4, int i43) {
                                        if ((i43 & 11) == 2 && c0Var4.d()) {
                                            c0Var4.u();
                                        } else {
                                            ni.o(u0.e.c(numValueOf.intValue(), c0Var4, 0), u0.i.d(io.intercom.android.sdk.R.string.intercom_navigation_back, c0Var4, 0), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j13, c0Var4, 392, 0);
                                        }
                                    }
                                }, c0VarR, 54), c0VarR, ((i33 >> 15) & 14) | 1572864, 62);
                                function6 = function5;
                            }
                            c0VarR.A();
                            if (function6 != null) {
                                fR = androidx.compose.ui.unit.h.r(8);
                            } else {
                                fR = androidx.compose.ui.unit.h.r(16);
                            }
                            long j20 = j13;
                            if (list2.size() == 1) {
                                c0VarR.E(-1567458464);
                                l6.a(i6.B(aVar, fR), c0VarR, 0);
                                boolean z15 = z11;
                                AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z15, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                                z13 = z15;
                                c0VarR.A();
                            } else {
                                z13 = z11;
                                if (list2.size() > 1) {
                                    c0VarR.E(-1567156741);
                                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                                    AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(-1566946282);
                                    c0VarR.A();
                                }
                            }
                            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                            androidx.compose.ui.a0 a0VarQ = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                            androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar2.u(), c0VarR, 48);
                            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarQ);
                            function0A3 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A3);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD3 = y7.d(c0VarR);
                            y7.n(c0VarD3, a1VarB2, aVar3.e());
                            y7.n(c0VarD3, b1VarK3, aVar3.g());
                            function2B3 = aVar3.b();
                            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                                c0VarD3.Y(Integer.valueOf(iHashCode3));
                                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                            }
                            y7.n(c0VarD3, a0VarN3, aVar3.f());
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i43 = IntercomTheme.$stable;
                            y3 y3VarM = y3.m(intercomTheme.getTypography(c0VarR, i43).getType03(), j20, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                            androidx.compose.ui.text.style.j.a aVar4 = androidx.compose.ui.text.style.j.f42206b;
                            int iF = aVar4.f();
                            androidx.compose.ui.text.style.v.a aVar5 = androidx.compose.ui.text.style.v.f42256b;
                            Function0<Unit> function9 = function4;
                            nVar4 = nVar3;
                            Integer num7 = numValueOf;
                            androidx.compose.ui.a0 a0Var5 = a0Var3;
                            q50.t(str8, null, j20, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF), 0L, aVar5.c(), false, 1, 0, null, y3VarM, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                            c0VarR.E(1212142532);
                            if (str7 != null || str7.length() == 0) {
                                c0Var2 = c0VarR;
                                j15 = j14;
                                i34 = 6;
                                i35 = 0;
                                str9 = str7;
                            } else {
                                androidx.compose.ui.layout.a1 a1VarE2 = u5.e(qVar.w(), aVar2.q(), c0VarR, 48);
                                int iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, aVar);
                                Function0<androidx.compose.ui.node.g> function0A4 = aVar3.a();
                                if (c0VarR.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0VarR.q();
                                if (c0VarR.P()) {
                                    c0VarR.q0(function0A4);
                                } else {
                                    c0VarR.l();
                                }
                                androidx.compose.runtime.c0 c0VarD4 = y7.d(c0VarR);
                                y7.n(c0VarD4, a1VarE2, aVar3.e());
                                y7.n(c0VarD4, b1VarK4, aVar3.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar3.b();
                                if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                                }
                                y7.n(c0VarD4, a0VarN4, aVar3.f());
                                c0VarR.E(559058220);
                                if (num4 == null) {
                                    c0Var2 = c0VarR;
                                    j15 = j14;
                                    i36 = 6;
                                } else {
                                    long j21 = j14;
                                    ni.o(u0.e.c(num4.intValue(), c0VarR, (i33 >> 9) & 14), null, null, j21, c0VarR, ((i32 << 9) & 7168) | 56, 4);
                                    j15 = j21;
                                    c0Var2 = c0VarR;
                                    i36 = 6;
                                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                                    Unit unit2 = Unit.f312394a;
                                }
                                c0Var2.A();
                                str9 = str7;
                                i34 = i36;
                                i35 = 0;
                                q50.t(str9, null, j15, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar4.f()), 0L, aVar5.c(), false, 1, 0, null, intercomTheme.getTypography(c0Var2, i43).getType05(), c0Var2, ((i33 >> 6) & 14) | ((i32 << 6) & 896), 24960, 109562);
                                c0Var2.o();
                            }
                            c0Var2.A();
                            c0Var2.o();
                            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                            c0Var2.E(-1851613512);
                            if (nVar4 == null) {
                                nVar5 = nVar4;
                            } else {
                                nVar5 = nVar4;
                                nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                                Unit unit3 = Unit.f312394a;
                            }
                            c0Var2.A();
                            c0Var2.o();
                            c0Var2.E(369372238);
                            if (!StringsKt.w3(str8)) {
                                IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                            }
                            c0Var2.A();
                            c0Var2.o();
                            nVar6 = nVar5;
                            c0Var3 = c0Var2;
                            str10 = str9;
                            j16 = j15;
                            num5 = num4;
                            list3 = list2;
                            a0Var4 = a0Var5;
                            j17 = j20;
                            function7 = function9;
                            str11 = str8;
                            j18 = j19;
                            function8 = function6;
                            z14 = z13;
                            num6 = num7;
                            s5VarT = c0Var3.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        c0VarR.u();
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                        }
                        if ((i12 & 256) != 0) {
                            i13 &= -234881025;
                        }
                        if ((i12 & 512) != 0) {
                            i13 &= -1879048193;
                        }
                        if ((i12 & 1024) != 0) {
                            i27 &= -15;
                        }
                        list2 = list;
                        z11 = z10;
                        jM704getHeader0d7_KjU = j10;
                        j14 = j12;
                        function4 = function1;
                        i32 = i27;
                        a0Var3 = a0Var2;
                        i33 = i13;
                        str6 = str3;
                        num4 = num3;
                        str5 = str2;
                        j13 = j11;
                        nVar3 = nVar;
                        c0VarR.Z();
                        activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                        if (activity != null) {
                            window = activity.getWindow();
                        } else {
                            window = null;
                        }
                        c0VarR.E(-1152542544);
                        if (window != null) {
                            androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                                }
                            }, c0VarR, 0);
                            Unit unit4 = Unit.f312394a;
                        }
                        c0VarR.A();
                        aVar = androidx.compose.ui.a0.E;
                        androidx.compose.foundation.layout.q qVar2 = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY2 = qVar2.y();
                        androidx.compose.ui.e.a aVar6 = androidx.compose.ui.e.f37317a;
                        str7 = str5;
                        androidx.compose.ui.layout.a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(mVarY2, aVar6.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, aVar);
                        androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                        str8 = str6;
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
                        function5 = function2;
                        y7.n(c0VarD, a1VarB3, aVar7.e());
                        y7.n(c0VarD, b1VarK5, aVar7.g());
                        function2B = aVar7.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN5, aVar7.f());
                        androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                        long j110 = jM704getHeader0d7_KjU;
                        float f11 = 4;
                        androidx.compose.ui.a0 a0VarV2 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j110, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f11), 0.0f, 11, null);
                        c0VarR.E(369281761);
                        if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarJ2 = androidx.compose.foundation.i1.j(a0VarV2, false, null, null, null, (Function0) objI0, 15, null);
                        androidx.compose.ui.layout.a1 a1VarE3 = u5.e(qVar2.w(), aVar6.q(), c0VarR, 48);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarJ2);
                        function0A2 = aVar7.a();
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
                        y7.n(c0VarD2, a1VarE3, aVar7.e());
                        y7.n(c0VarD2, b1VarK6, aVar7.g());
                        function2B2 = aVar7.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN6, aVar7.f());
                        y5Var = y5.f16577a;
                        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f11)), c0VarR, 6);
                        c0VarR.E(-1851697424);
                        if (function5 != null) {
                            function6 = function5;
                        } else {
                            function6 = function5;
                        }
                        c0VarR.A();
                        if (function6 != null) {
                            fR = androidx.compose.ui.unit.h.r(8);
                        } else {
                            fR = androidx.compose.ui.unit.h.r(16);
                        }
                        long j22 = j13;
                        if (list2.size() == 1) {
                            c0VarR.E(-1567458464);
                            l6.a(i6.B(aVar, fR), c0VarR, 0);
                            boolean z16 = z11;
                            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z16, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                            z13 = z16;
                            c0VarR.A();
                        } else {
                            z13 = z11;
                            if (list2.size() > 1) {
                                c0VarR.E(-1567156741);
                                l6.a(i6.B(aVar, fR), c0VarR, 0);
                                AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-1566946282);
                                c0VarR.A();
                            }
                        }
                        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        androidx.compose.ui.a0 a0VarQ2 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                        androidx.compose.ui.layout.a1 a1VarB4 = androidx.compose.foundation.layout.j0.b(qVar2.y(), aVar6.u(), c0VarR, 48);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarQ2);
                        function0A3 = aVar7.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A3);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD3 = y7.d(c0VarR);
                        y7.n(c0VarD3, a1VarB4, aVar7.e());
                        y7.n(c0VarD3, b1VarK7, aVar7.g());
                        function2B3 = aVar7.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN7, aVar7.f());
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i44 = IntercomTheme.$stable;
                        y3 y3VarM2 = y3.m(intercomTheme2.getTypography(c0VarR, i44).getType03(), j22, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                        androidx.compose.ui.text.style.j.a aVar8 = androidx.compose.ui.text.style.j.f42206b;
                        int iF2 = aVar8.f();
                        androidx.compose.ui.text.style.v.a aVar9 = androidx.compose.ui.text.style.v.f42256b;
                        Function0<Unit> function10 = function4;
                        nVar4 = nVar3;
                        Integer num8 = numValueOf;
                        androidx.compose.ui.a0 a0Var6 = a0Var3;
                        q50.t(str8, null, j22, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF2), 0L, aVar9.c(), false, 1, 0, null, y3VarM2, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                        c0VarR.E(1212142532);
                        if (str7 != null) {
                            c0Var2 = c0VarR;
                            j15 = j14;
                            i34 = 6;
                            i35 = 0;
                            str9 = str7;
                        } else {
                            c0Var2 = c0VarR;
                            j15 = j14;
                            i34 = 6;
                            i35 = 0;
                            str9 = str7;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                        c0Var2.E(-1851613512);
                        if (nVar4 == null) {
                            nVar5 = nVar4;
                        } else {
                            nVar5 = nVar4;
                            nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                            Unit unit5 = Unit.f312394a;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.E(369372238);
                        if (!StringsKt.w3(str8)) {
                            IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                        }
                        c0Var2.A();
                        c0Var2.o();
                        nVar6 = nVar5;
                        c0Var3 = c0Var2;
                        str10 = str9;
                        j16 = j15;
                        num5 = num4;
                        list3 = list2;
                        a0Var4 = a0Var6;
                        j17 = j22;
                        function7 = function10;
                        str11 = str8;
                        j18 = j110;
                        function8 = function6;
                        z14 = z13;
                        num6 = num8;
                        s5VarT = c0Var3.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= a5.S0;
                    nVar2 = nVar;
                    if (i18 == 16) {
                        i31 = i29;
                        if ((1533916891 & i13) != 306783378) {
                        }
                        s5VarT = c0Var3.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i31 = i29;
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i42 != 0) {
                            str3 = "";
                        }
                        if (i14 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i16 != 0) {
                            num3 = null;
                        }
                        if (i18 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                            i13 &= -3670017;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 256) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                            i13 &= -234881025;
                        } else {
                            jM704getHeader0d7_KjU = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i13 = (-1879048193) & i13;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i27 &= -15;
                        } else {
                            jM711getOnHeader0d7_KjU2 = j12;
                        }
                        if (i26 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        i32 = i27;
                        str5 = str4;
                        i33 = i13;
                        list2 = listEmptyList;
                        num4 = num3;
                        j13 = jM711getOnHeader0d7_KjU;
                        j14 = jM711getOnHeader0d7_KjU2;
                        function4 = function3;
                        str6 = str3;
                        if (i31 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i42 != 0) {
                            str3 = "";
                        }
                        if (i14 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i16 != 0) {
                            num3 = null;
                        }
                        if (i18 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                            i13 &= -3670017;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 256) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                            i13 &= -234881025;
                        } else {
                            jM704getHeader0d7_KjU = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i13 = (-1879048193) & i13;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i27 &= -15;
                        } else {
                            jM711getOnHeader0d7_KjU2 = j12;
                        }
                        if (i26 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        i32 = i27;
                        str5 = str4;
                        i33 = i13;
                        list2 = listEmptyList;
                        num4 = num3;
                        j13 = jM711getOnHeader0d7_KjU;
                        j14 = jM711getOnHeader0d7_KjU2;
                        function4 = function3;
                        str6 = str3;
                        if (i31 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                    }
                    c0VarR.Z();
                    activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c0VarR.E(-1152542544);
                    if (window != null) {
                        androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                            }
                        }, c0VarR, 0);
                        Unit unit6 = Unit.f312394a;
                    }
                    c0VarR.A();
                    aVar = androidx.compose.ui.a0.E;
                    androidx.compose.foundation.layout.q qVar3 = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY3 = qVar3.y();
                    androidx.compose.ui.e.a aVar10 = androidx.compose.ui.e.f37317a;
                    str7 = str5;
                    androidx.compose.ui.layout.a1 a1VarB5 = androidx.compose.foundation.layout.j0.b(mVarY3, aVar10.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, aVar);
                    androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                    str8 = str6;
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
                    function5 = function2;
                    y7.n(c0VarD, a1VarB5, aVar11.e());
                    y7.n(c0VarD, b1VarK8, aVar11.g());
                    function2B = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN8, aVar11.f());
                    androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
                    long j111 = jM704getHeader0d7_KjU;
                    float f12 = 4;
                    androidx.compose.ui.a0 a0VarV3 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j111, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f12), 0.0f, 11, null);
                    c0VarR.E(369281761);
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ3 = androidx.compose.foundation.i1.j(a0VarV3, false, null, null, null, (Function0) objI0, 15, null);
                    androidx.compose.ui.layout.a1 a1VarE4 = u5.e(qVar3.w(), aVar10.q(), c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarJ3);
                    function0A2 = aVar11.a();
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
                    y7.n(c0VarD2, a1VarE4, aVar11.e());
                    y7.n(c0VarD2, b1VarK9, aVar11.g());
                    function2B2 = aVar11.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN9, aVar11.f());
                    y5Var = y5.f16577a;
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f12)), c0VarR, 6);
                    c0VarR.E(-1851697424);
                    if (function5 != null) {
                        function6 = function5;
                    } else {
                        function6 = function5;
                    }
                    c0VarR.A();
                    if (function6 != null) {
                        fR = androidx.compose.ui.unit.h.r(8);
                    } else {
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    long j23 = j13;
                    if (list2.size() == 1) {
                        c0VarR.E(-1567458464);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        boolean z17 = z11;
                        AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z17, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                        z13 = z17;
                        c0VarR.A();
                    } else {
                        z13 = z11;
                        if (list2.size() > 1) {
                            c0VarR.E(-1567156741);
                            l6.a(i6.B(aVar, fR), c0VarR, 0);
                            AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1566946282);
                            c0VarR.A();
                        }
                    }
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    androidx.compose.ui.a0 a0VarQ3 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarB6 = androidx.compose.foundation.layout.j0.b(qVar3.y(), aVar10.u(), c0VarR, 48);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarQ3);
                    function0A3 = aVar11.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = y7.d(c0VarR);
                    y7.n(c0VarD3, a1VarB6, aVar11.e());
                    y7.n(c0VarD3, b1VarK10, aVar11.g());
                    function2B3 = aVar11.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN10, aVar11.f());
                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                    int i45 = IntercomTheme.$stable;
                    y3 y3VarM3 = y3.m(intercomTheme3.getTypography(c0VarR, i45).getType03(), j23, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    androidx.compose.ui.text.style.j.a aVar12 = androidx.compose.ui.text.style.j.f42206b;
                    int iF3 = aVar12.f();
                    androidx.compose.ui.text.style.v.a aVar13 = androidx.compose.ui.text.style.v.f42256b;
                    Function0<Unit> function11 = function4;
                    nVar4 = nVar3;
                    Integer num9 = numValueOf;
                    androidx.compose.ui.a0 a0Var7 = a0Var3;
                    q50.t(str8, null, j23, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF3), 0L, aVar13.c(), false, 1, 0, null, y3VarM3, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                    c0VarR.E(1212142532);
                    if (str7 != null) {
                        c0Var2 = c0VarR;
                        j15 = j14;
                        i34 = 6;
                        i35 = 0;
                        str9 = str7;
                    } else {
                        c0Var2 = c0VarR;
                        j15 = j14;
                        i34 = 6;
                        i35 = 0;
                        str9 = str7;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                    c0Var2.E(-1851613512);
                    if (nVar4 == null) {
                        nVar5 = nVar4;
                    } else {
                        nVar5 = nVar4;
                        nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                        Unit unit7 = Unit.f312394a;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(369372238);
                    if (!StringsKt.w3(str8)) {
                        IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                    }
                    c0Var2.A();
                    c0Var2.o();
                    nVar6 = nVar5;
                    c0Var3 = c0Var2;
                    str10 = str9;
                    j16 = j15;
                    num5 = num4;
                    list3 = list2;
                    a0Var4 = a0Var7;
                    j17 = j23;
                    function7 = function11;
                    str11 = str8;
                    j18 = j111;
                    function8 = function6;
                    z14 = z13;
                    num6 = num9;
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 3072;
                num3 = num;
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= 8192;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    function2 = function0;
                } else {
                    function2 = function0;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.k0(function2)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i13 |= i20;
                    }
                }
                if ((i10 & 3670016) == 0) {
                    numValueOf = num2;
                    if ((i12 & 64) == 0) {
                        i40 = 524288;
                    } else {
                        i40 = 524288;
                    }
                    i13 |= i40;
                } else {
                    numValueOf = num2;
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c0VarR.G(z10)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i12 & 256) == 0) {
                        i23 = i41;
                        if (c0VarR.L(j10)) {
                            i39 = 67108864;
                        }
                        i13 |= i39;
                    } else {
                        i23 = i41;
                    }
                    i39 = com.google.api.client.googleapis.media.a.f115410j;
                    i13 |= i39;
                } else {
                    i23 = i41;
                }
                if ((i10 & 1879048192) != 0) {
                    if ((i12 & 512) == 0) {
                        i38 = 268435456;
                    } else {
                        i38 = 268435456;
                    }
                    i13 |= i38;
                }
                if ((i11 & 14) == 0) {
                    if ((i12 & 1024) == 0) {
                        i37 = 2;
                    } else {
                        i37 = 2;
                    }
                    i24 = i37 | i11;
                } else {
                    i24 = i11;
                }
                i25 = i24;
                i26 = i12 & 2048;
                if (i26 != 0) {
                    i27 = i25 | 48;
                } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                    if (c0VarR.k0(function1)) {
                        i28 = 32;
                    } else {
                        i28 = 16;
                    }
                    i27 = i25 | i28;
                } else {
                    i27 = i25;
                }
                i29 = i12 & 4096;
                if (i29 != 0) {
                    if ((i11 & 896) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i30 = 256;
                        } else {
                            i30 = 128;
                        }
                        i27 |= i30;
                    }
                    if (i18 == 16) {
                        i31 = i29;
                        if ((1533916891 & i13) != 306783378) {
                        }
                        s5VarT = c0Var3.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i31 = i29;
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i42 != 0) {
                            str3 = "";
                        }
                        if (i14 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i16 != 0) {
                            num3 = null;
                        }
                        if (i18 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                            i13 &= -3670017;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 256) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                            i13 &= -234881025;
                        } else {
                            jM704getHeader0d7_KjU = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i13 = (-1879048193) & i13;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i27 &= -15;
                        } else {
                            jM711getOnHeader0d7_KjU2 = j12;
                        }
                        if (i26 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        i32 = i27;
                        str5 = str4;
                        i33 = i13;
                        list2 = listEmptyList;
                        num4 = num3;
                        j13 = jM711getOnHeader0d7_KjU;
                        j14 = jM711getOnHeader0d7_KjU2;
                        function4 = function3;
                        str6 = str3;
                        if (i31 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i42 != 0) {
                            str3 = "";
                        }
                        if (i14 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i16 != 0) {
                            num3 = null;
                        }
                        if (i18 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                            i13 &= -3670017;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 256) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                            i13 &= -234881025;
                        } else {
                            jM704getHeader0d7_KjU = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i13 = (-1879048193) & i13;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i27 &= -15;
                        } else {
                            jM711getOnHeader0d7_KjU2 = j12;
                        }
                        if (i26 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        i32 = i27;
                        str5 = str4;
                        i33 = i13;
                        list2 = listEmptyList;
                        num4 = num3;
                        j13 = jM711getOnHeader0d7_KjU;
                        j14 = jM711getOnHeader0d7_KjU2;
                        function4 = function3;
                        str6 = str3;
                        if (i31 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                    }
                    c0VarR.Z();
                    activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c0VarR.E(-1152542544);
                    if (window != null) {
                        androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                            }
                        }, c0VarR, 0);
                        Unit unit8 = Unit.f312394a;
                    }
                    c0VarR.A();
                    aVar = androidx.compose.ui.a0.E;
                    androidx.compose.foundation.layout.q qVar4 = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY4 = qVar4.y();
                    androidx.compose.ui.e.a aVar14 = androidx.compose.ui.e.f37317a;
                    str7 = str5;
                    androidx.compose.ui.layout.a1 a1VarB7 = androidx.compose.foundation.layout.j0.b(mVarY4, aVar14.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, aVar);
                    androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                    str8 = str6;
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
                    function5 = function2;
                    y7.n(c0VarD, a1VarB7, aVar15.e());
                    y7.n(c0VarD, b1VarK11, aVar15.g());
                    function2B = aVar15.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11, aVar15.f());
                    androidx.compose.foundation.layout.n0 n0Var4 = androidx.compose.foundation.layout.n0.f16227a;
                    long j112 = jM704getHeader0d7_KjU;
                    float f13 = 4;
                    androidx.compose.ui.a0 a0VarV4 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j112, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f13), 0.0f, 11, null);
                    c0VarR.E(369281761);
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ4 = androidx.compose.foundation.i1.j(a0VarV4, false, null, null, null, (Function0) objI0, 15, null);
                    androidx.compose.ui.layout.a1 a1VarE5 = u5.e(qVar4.w(), aVar14.q(), c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarJ4);
                    function0A2 = aVar15.a();
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
                    y7.n(c0VarD2, a1VarE5, aVar15.e());
                    y7.n(c0VarD2, b1VarK12, aVar15.g());
                    function2B2 = aVar15.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN12, aVar15.f());
                    y5Var = y5.f16577a;
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f13)), c0VarR, 6);
                    c0VarR.E(-1851697424);
                    if (function5 != null) {
                        function6 = function5;
                    } else {
                        function6 = function5;
                    }
                    c0VarR.A();
                    if (function6 != null) {
                        fR = androidx.compose.ui.unit.h.r(8);
                    } else {
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    long j24 = j13;
                    if (list2.size() == 1) {
                        c0VarR.E(-1567458464);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        boolean z18 = z11;
                        AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z18, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                        z13 = z18;
                        c0VarR.A();
                    } else {
                        z13 = z11;
                        if (list2.size() > 1) {
                            c0VarR.E(-1567156741);
                            l6.a(i6.B(aVar, fR), c0VarR, 0);
                            AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1566946282);
                            c0VarR.A();
                        }
                    }
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    androidx.compose.ui.a0 a0VarQ4 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarB8 = androidx.compose.foundation.layout.j0.b(qVar4.y(), aVar14.u(), c0VarR, 48);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarQ4);
                    function0A3 = aVar15.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = y7.d(c0VarR);
                    y7.n(c0VarD3, a1VarB8, aVar15.e());
                    y7.n(c0VarD3, b1VarK13, aVar15.g());
                    function2B3 = aVar15.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN13, aVar15.f());
                    IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                    int i46 = IntercomTheme.$stable;
                    y3 y3VarM4 = y3.m(intercomTheme4.getTypography(c0VarR, i46).getType03(), j24, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    androidx.compose.ui.text.style.j.a aVar16 = androidx.compose.ui.text.style.j.f42206b;
                    int iF4 = aVar16.f();
                    androidx.compose.ui.text.style.v.a aVar17 = androidx.compose.ui.text.style.v.f42256b;
                    Function0<Unit> function12 = function4;
                    nVar4 = nVar3;
                    Integer num10 = numValueOf;
                    androidx.compose.ui.a0 a0Var8 = a0Var3;
                    q50.t(str8, null, j24, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF4), 0L, aVar17.c(), false, 1, 0, null, y3VarM4, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                    c0VarR.E(1212142532);
                    if (str7 != null) {
                        c0Var2 = c0VarR;
                        j15 = j14;
                        i34 = 6;
                        i35 = 0;
                        str9 = str7;
                    } else {
                        c0Var2 = c0VarR;
                        j15 = j14;
                        i34 = 6;
                        i35 = 0;
                        str9 = str7;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                    c0Var2.E(-1851613512);
                    if (nVar4 == null) {
                        nVar5 = nVar4;
                    } else {
                        nVar5 = nVar4;
                        nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                        Unit unit9 = Unit.f312394a;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(369372238);
                    if (!StringsKt.w3(str8)) {
                        IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                    }
                    c0Var2.A();
                    c0Var2.o();
                    nVar6 = nVar5;
                    c0Var3 = c0Var2;
                    str10 = str9;
                    j16 = j15;
                    num5 = num4;
                    list3 = list2;
                    a0Var4 = a0Var8;
                    j17 = j24;
                    function7 = function12;
                    str11 = str8;
                    j18 = j112;
                    function8 = function6;
                    z14 = z13;
                    num6 = num10;
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= a5.S0;
                nVar2 = nVar;
                if (i18 == 16) {
                    i31 = i29;
                    if ((1533916891 & i13) != 306783378) {
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i31 = i29;
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                }
                c0VarR.Z();
                activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c0VarR.E(-1152542544);
                if (window != null) {
                    androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                        }
                    }, c0VarR, 0);
                    Unit unit10 = Unit.f312394a;
                }
                c0VarR.A();
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.q qVar5 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY5 = qVar5.y();
                androidx.compose.ui.e.a aVar18 = androidx.compose.ui.e.f37317a;
                str7 = str5;
                androidx.compose.ui.layout.a1 a1VarB9 = androidx.compose.foundation.layout.j0.b(mVarY5, aVar18.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, aVar);
                androidx.compose.ui.node.g.a aVar19 = androidx.compose.ui.node.g.I;
                str8 = str6;
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
                function5 = function2;
                y7.n(c0VarD, a1VarB9, aVar19.e());
                y7.n(c0VarD, b1VarK14, aVar19.g());
                function2B = aVar19.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN14, aVar19.f());
                androidx.compose.foundation.layout.n0 n0Var5 = androidx.compose.foundation.layout.n0.f16227a;
                long j113 = jM704getHeader0d7_KjU;
                float f14 = 4;
                androidx.compose.ui.a0 a0VarV5 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j113, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f14), 0.0f, 11, null);
                c0VarR.E(369281761);
                if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ5 = androidx.compose.foundation.i1.j(a0VarV5, false, null, null, null, (Function0) objI0, 15, null);
                androidx.compose.ui.layout.a1 a1VarE6 = u5.e(qVar5.w(), aVar18.q(), c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarJ5);
                function0A2 = aVar19.a();
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
                y7.n(c0VarD2, a1VarE6, aVar19.e());
                y7.n(c0VarD2, b1VarK15, aVar19.g());
                function2B2 = aVar19.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN15, aVar19.f());
                y5Var = y5.f16577a;
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f14)), c0VarR, 6);
                c0VarR.E(-1851697424);
                if (function5 != null) {
                    function6 = function5;
                } else {
                    function6 = function5;
                }
                c0VarR.A();
                if (function6 != null) {
                    fR = androidx.compose.ui.unit.h.r(8);
                } else {
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                long j25 = j13;
                if (list2.size() == 1) {
                    c0VarR.E(-1567458464);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    boolean z19 = z11;
                    AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z19, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                    z13 = z19;
                    c0VarR.A();
                } else {
                    z13 = z11;
                    if (list2.size() > 1) {
                        c0VarR.E(-1567156741);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1566946282);
                        c0VarR.A();
                    }
                }
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.ui.a0 a0VarQ5 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarB10 = androidx.compose.foundation.layout.j0.b(qVar5.y(), aVar18.u(), c0VarR, 48);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarQ5);
                function0A3 = aVar19.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarB10, aVar19.e());
                y7.n(c0VarD3, b1VarK16, aVar19.g());
                function2B3 = aVar19.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN16, aVar19.f());
                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                int i47 = IntercomTheme.$stable;
                y3 y3VarM5 = y3.m(intercomTheme5.getTypography(c0VarR, i47).getType03(), j25, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                androidx.compose.ui.text.style.j.a aVar110 = androidx.compose.ui.text.style.j.f42206b;
                int iF5 = aVar110.f();
                androidx.compose.ui.text.style.v.a aVar111 = androidx.compose.ui.text.style.v.f42256b;
                Function0<Unit> function13 = function4;
                nVar4 = nVar3;
                Integer num11 = numValueOf;
                androidx.compose.ui.a0 a0Var9 = a0Var3;
                q50.t(str8, null, j25, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF5), 0L, aVar111.c(), false, 1, 0, null, y3VarM5, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                c0VarR.E(1212142532);
                if (str7 != null) {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                } else {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                }
                c0Var2.A();
                c0Var2.o();
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                c0Var2.E(-1851613512);
                if (nVar4 == null) {
                    nVar5 = nVar4;
                } else {
                    nVar5 = nVar4;
                    nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                    Unit unit11 = Unit.f312394a;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(369372238);
                if (!StringsKt.w3(str8)) {
                    IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                }
                c0Var2.A();
                c0Var2.o();
                nVar6 = nVar5;
                c0Var3 = c0Var2;
                str10 = str9;
                j16 = j15;
                num5 = num4;
                list3 = list2;
                a0Var4 = a0Var9;
                j17 = j25;
                function7 = function13;
                str11 = str8;
                j18 = j113;
                function8 = function6;
                z14 = z13;
                num6 = num11;
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= a5.S0;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 7168) == 0) {
                    num3 = num;
                    if (c0VarR.D(num3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= 8192;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    function2 = function0;
                } else {
                    function2 = function0;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.k0(function2)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i13 |= i20;
                    }
                }
                if ((i10 & 3670016) == 0) {
                    numValueOf = num2;
                    if ((i12 & 64) == 0) {
                        i40 = 524288;
                    } else {
                        i40 = 524288;
                    }
                    i13 |= i40;
                } else {
                    numValueOf = num2;
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c0VarR.G(z10)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i12 & 256) == 0) {
                        i23 = i41;
                        if (c0VarR.L(j10)) {
                            i39 = 67108864;
                        }
                        i13 |= i39;
                    } else {
                        i23 = i41;
                    }
                    i39 = com.google.api.client.googleapis.media.a.f115410j;
                    i13 |= i39;
                } else {
                    i23 = i41;
                }
                if ((i10 & 1879048192) != 0) {
                    if ((i12 & 512) == 0) {
                        i38 = 268435456;
                    } else {
                        i38 = 268435456;
                    }
                    i13 |= i38;
                }
                if ((i11 & 14) == 0) {
                    if ((i12 & 1024) == 0) {
                        i37 = 2;
                    } else {
                        i37 = 2;
                    }
                    i24 = i37 | i11;
                } else {
                    i24 = i11;
                }
                i25 = i24;
                i26 = i12 & 2048;
                if (i26 != 0) {
                    i27 = i25 | 48;
                } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                    if (c0VarR.k0(function1)) {
                        i28 = 32;
                    } else {
                        i28 = 16;
                    }
                    i27 = i25 | i28;
                } else {
                    i27 = i25;
                }
                i29 = i12 & 4096;
                if (i29 != 0) {
                    if ((i11 & 896) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i30 = 256;
                        } else {
                            i30 = 128;
                        }
                        i27 |= i30;
                    }
                    if (i18 == 16) {
                        i31 = i29;
                        if ((1533916891 & i13) != 306783378) {
                        }
                        s5VarT = c0Var3.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i31 = i29;
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i42 != 0) {
                            str3 = "";
                        }
                        if (i14 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i16 != 0) {
                            num3 = null;
                        }
                        if (i18 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                            i13 &= -3670017;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 256) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                            i13 &= -234881025;
                        } else {
                            jM704getHeader0d7_KjU = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i13 = (-1879048193) & i13;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i27 &= -15;
                        } else {
                            jM711getOnHeader0d7_KjU2 = j12;
                        }
                        if (i26 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        i32 = i27;
                        str5 = str4;
                        i33 = i13;
                        list2 = listEmptyList;
                        num4 = num3;
                        j13 = jM711getOnHeader0d7_KjU;
                        j14 = jM711getOnHeader0d7_KjU2;
                        function4 = function3;
                        str6 = str3;
                        if (i31 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i42 != 0) {
                            str3 = "";
                        }
                        if (i14 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i16 != 0) {
                            num3 = null;
                        }
                        if (i18 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                            i13 &= -3670017;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 256) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                            i13 &= -234881025;
                        } else {
                            jM704getHeader0d7_KjU = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i13 = (-1879048193) & i13;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i27 &= -15;
                        } else {
                            jM711getOnHeader0d7_KjU2 = j12;
                        }
                        if (i26 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        i32 = i27;
                        str5 = str4;
                        i33 = i13;
                        list2 = listEmptyList;
                        num4 = num3;
                        j13 = jM711getOnHeader0d7_KjU;
                        j14 = jM711getOnHeader0d7_KjU2;
                        function4 = function3;
                        str6 = str3;
                        if (i31 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                    }
                    c0VarR.Z();
                    activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c0VarR.E(-1152542544);
                    if (window != null) {
                        androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                            }
                        }, c0VarR, 0);
                        Unit unit12 = Unit.f312394a;
                    }
                    c0VarR.A();
                    aVar = androidx.compose.ui.a0.E;
                    androidx.compose.foundation.layout.q qVar6 = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY6 = qVar6.y();
                    androidx.compose.ui.e.a aVar112 = androidx.compose.ui.e.f37317a;
                    str7 = str5;
                    androidx.compose.ui.layout.a1 a1VarB11 = androidx.compose.foundation.layout.j0.b(mVarY6, aVar112.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, aVar);
                    androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
                    str8 = str6;
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
                    function5 = function2;
                    y7.n(c0VarD, a1VarB11, aVar113.e());
                    y7.n(c0VarD, b1VarK17, aVar113.g());
                    function2B = aVar113.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN17, aVar113.f());
                    androidx.compose.foundation.layout.n0 n0Var6 = androidx.compose.foundation.layout.n0.f16227a;
                    long j114 = jM704getHeader0d7_KjU;
                    float f15 = 4;
                    androidx.compose.ui.a0 a0VarV6 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j114, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f15), 0.0f, 11, null);
                    c0VarR.E(369281761);
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ6 = androidx.compose.foundation.i1.j(a0VarV6, false, null, null, null, (Function0) objI0, 15, null);
                    androidx.compose.ui.layout.a1 a1VarE7 = u5.e(qVar6.w(), aVar112.q(), c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarJ6);
                    function0A2 = aVar113.a();
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
                    y7.n(c0VarD2, a1VarE7, aVar113.e());
                    y7.n(c0VarD2, b1VarK18, aVar113.g());
                    function2B2 = aVar113.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN18, aVar113.f());
                    y5Var = y5.f16577a;
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f15)), c0VarR, 6);
                    c0VarR.E(-1851697424);
                    if (function5 != null) {
                        function6 = function5;
                    } else {
                        function6 = function5;
                    }
                    c0VarR.A();
                    if (function6 != null) {
                        fR = androidx.compose.ui.unit.h.r(8);
                    } else {
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    long j26 = j13;
                    if (list2.size() == 1) {
                        c0VarR.E(-1567458464);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        boolean z110 = z11;
                        AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z110, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                        z13 = z110;
                        c0VarR.A();
                    } else {
                        z13 = z11;
                        if (list2.size() > 1) {
                            c0VarR.E(-1567156741);
                            l6.a(i6.B(aVar, fR), c0VarR, 0);
                            AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1566946282);
                            c0VarR.A();
                        }
                    }
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    androidx.compose.ui.a0 a0VarQ6 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarB12 = androidx.compose.foundation.layout.j0.b(qVar6.y(), aVar112.u(), c0VarR, 48);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarQ6);
                    function0A3 = aVar113.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = y7.d(c0VarR);
                    y7.n(c0VarD3, a1VarB12, aVar113.e());
                    y7.n(c0VarD3, b1VarK19, aVar113.g());
                    function2B3 = aVar113.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN19, aVar113.f());
                    IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                    int i48 = IntercomTheme.$stable;
                    y3 y3VarM6 = y3.m(intercomTheme6.getTypography(c0VarR, i48).getType03(), j26, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    androidx.compose.ui.text.style.j.a aVar114 = androidx.compose.ui.text.style.j.f42206b;
                    int iF6 = aVar114.f();
                    androidx.compose.ui.text.style.v.a aVar115 = androidx.compose.ui.text.style.v.f42256b;
                    Function0<Unit> function14 = function4;
                    nVar4 = nVar3;
                    Integer num12 = numValueOf;
                    androidx.compose.ui.a0 a0Var10 = a0Var3;
                    q50.t(str8, null, j26, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF6), 0L, aVar115.c(), false, 1, 0, null, y3VarM6, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                    c0VarR.E(1212142532);
                    if (str7 != null) {
                        c0Var2 = c0VarR;
                        j15 = j14;
                        i34 = 6;
                        i35 = 0;
                        str9 = str7;
                    } else {
                        c0Var2 = c0VarR;
                        j15 = j14;
                        i34 = 6;
                        i35 = 0;
                        str9 = str7;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                    c0Var2.E(-1851613512);
                    if (nVar4 == null) {
                        nVar5 = nVar4;
                    } else {
                        nVar5 = nVar4;
                        nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                        Unit unit13 = Unit.f312394a;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(369372238);
                    if (!StringsKt.w3(str8)) {
                        IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                    }
                    c0Var2.A();
                    c0Var2.o();
                    nVar6 = nVar5;
                    c0Var3 = c0Var2;
                    str10 = str9;
                    j16 = j15;
                    num5 = num4;
                    list3 = list2;
                    a0Var4 = a0Var10;
                    j17 = j26;
                    function7 = function14;
                    str11 = str8;
                    j18 = j114;
                    function8 = function6;
                    z14 = z13;
                    num6 = num12;
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= a5.S0;
                nVar2 = nVar;
                if (i18 == 16) {
                    i31 = i29;
                    if ((1533916891 & i13) != 306783378) {
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i31 = i29;
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                }
                c0VarR.Z();
                activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c0VarR.E(-1152542544);
                if (window != null) {
                    androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                        }
                    }, c0VarR, 0);
                    Unit unit14 = Unit.f312394a;
                }
                c0VarR.A();
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.q qVar7 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY7 = qVar7.y();
                androidx.compose.ui.e.a aVar116 = androidx.compose.ui.e.f37317a;
                str7 = str5;
                androidx.compose.ui.layout.a1 a1VarB13 = androidx.compose.foundation.layout.j0.b(mVarY7, aVar116.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, aVar);
                androidx.compose.ui.node.g.a aVar117 = androidx.compose.ui.node.g.I;
                str8 = str6;
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
                function5 = function2;
                y7.n(c0VarD, a1VarB13, aVar117.e());
                y7.n(c0VarD, b1VarK110, aVar117.g());
                function2B = aVar117.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN110, aVar117.f());
                androidx.compose.foundation.layout.n0 n0Var7 = androidx.compose.foundation.layout.n0.f16227a;
                long j115 = jM704getHeader0d7_KjU;
                float f16 = 4;
                androidx.compose.ui.a0 a0VarV7 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j115, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f16), 0.0f, 11, null);
                c0VarR.E(369281761);
                if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ7 = androidx.compose.foundation.i1.j(a0VarV7, false, null, null, null, (Function0) objI0, 15, null);
                androidx.compose.ui.layout.a1 a1VarE8 = u5.e(qVar7.w(), aVar116.q(), c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarJ7);
                function0A2 = aVar117.a();
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
                y7.n(c0VarD2, a1VarE8, aVar117.e());
                y7.n(c0VarD2, b1VarK111, aVar117.g());
                function2B2 = aVar117.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111, aVar117.f());
                y5Var = y5.f16577a;
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f16)), c0VarR, 6);
                c0VarR.E(-1851697424);
                if (function5 != null) {
                    function6 = function5;
                } else {
                    function6 = function5;
                }
                c0VarR.A();
                if (function6 != null) {
                    fR = androidx.compose.ui.unit.h.r(8);
                } else {
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                long j27 = j13;
                if (list2.size() == 1) {
                    c0VarR.E(-1567458464);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    boolean z111 = z11;
                    AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z111, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                    z13 = z111;
                    c0VarR.A();
                } else {
                    z13 = z11;
                    if (list2.size() > 1) {
                        c0VarR.E(-1567156741);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1566946282);
                        c0VarR.A();
                    }
                }
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.ui.a0 a0VarQ7 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarB14 = androidx.compose.foundation.layout.j0.b(qVar7.y(), aVar116.u(), c0VarR, 48);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarQ7);
                function0A3 = aVar117.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarB14, aVar117.e());
                y7.n(c0VarD3, b1VarK112, aVar117.g());
                function2B3 = aVar117.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN112, aVar117.f());
                IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                int i49 = IntercomTheme.$stable;
                y3 y3VarM7 = y3.m(intercomTheme7.getTypography(c0VarR, i49).getType03(), j27, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                androidx.compose.ui.text.style.j.a aVar118 = androidx.compose.ui.text.style.j.f42206b;
                int iF7 = aVar118.f();
                androidx.compose.ui.text.style.v.a aVar119 = androidx.compose.ui.text.style.v.f42256b;
                Function0<Unit> function15 = function4;
                nVar4 = nVar3;
                Integer num13 = numValueOf;
                androidx.compose.ui.a0 a0Var11 = a0Var3;
                q50.t(str8, null, j27, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF7), 0L, aVar119.c(), false, 1, 0, null, y3VarM7, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                c0VarR.E(1212142532);
                if (str7 != null) {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                } else {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                }
                c0Var2.A();
                c0Var2.o();
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                c0Var2.E(-1851613512);
                if (nVar4 == null) {
                    nVar5 = nVar4;
                } else {
                    nVar5 = nVar4;
                    nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                    Unit unit15 = Unit.f312394a;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(369372238);
                if (!StringsKt.w3(str8)) {
                    IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                }
                c0Var2.A();
                c0Var2.o();
                nVar6 = nVar5;
                c0Var3 = c0Var2;
                str10 = str9;
                j16 = j15;
                num5 = num4;
                list3 = list2;
                a0Var4 = a0Var11;
                j17 = j27;
                function7 = function15;
                str11 = str8;
                j18 = j115;
                function8 = function6;
                z14 = z13;
                num6 = num13;
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            num3 = num;
            i18 = i12 & 16;
            if (i18 != 0) {
                i13 |= 8192;
            }
            i19 = i12 & 32;
            if (i19 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                function2 = function0;
            } else {
                function2 = function0;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i13 |= i20;
                }
            }
            if ((i10 & 3670016) == 0) {
                numValueOf = num2;
                if ((i12 & 64) == 0) {
                    i40 = 524288;
                } else {
                    i40 = 524288;
                }
                i13 |= i40;
            } else {
                numValueOf = num2;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c0VarR.G(z10)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
            if ((i10 & 234881024) == 0) {
                if ((i12 & 256) == 0) {
                    i23 = i41;
                    if (c0VarR.L(j10)) {
                        i39 = 67108864;
                    }
                    i13 |= i39;
                } else {
                    i23 = i41;
                }
                i39 = com.google.api.client.googleapis.media.a.f115410j;
                i13 |= i39;
            } else {
                i23 = i41;
            }
            if ((i10 & 1879048192) != 0) {
                if ((i12 & 512) == 0) {
                    i38 = 268435456;
                } else {
                    i38 = 268435456;
                }
                i13 |= i38;
            }
            if ((i11 & 14) == 0) {
                if ((i12 & 1024) == 0) {
                    i37 = 2;
                } else {
                    i37 = 2;
                }
                i24 = i37 | i11;
            } else {
                i24 = i11;
            }
            i25 = i24;
            i26 = i12 & 2048;
            if (i26 != 0) {
                i27 = i25 | 48;
            } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                if (c0VarR.k0(function1)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i27 = i25 | i28;
            } else {
                i27 = i25;
            }
            i29 = i12 & 4096;
            if (i29 != 0) {
                if ((i11 & 896) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i30 = 256;
                    } else {
                        i30 = 128;
                    }
                    i27 |= i30;
                }
                if (i18 == 16) {
                    i31 = i29;
                    if ((1533916891 & i13) != 306783378) {
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i31 = i29;
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                }
                c0VarR.Z();
                activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c0VarR.E(-1152542544);
                if (window != null) {
                    androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                        }
                    }, c0VarR, 0);
                    Unit unit16 = Unit.f312394a;
                }
                c0VarR.A();
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.q qVar8 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY8 = qVar8.y();
                androidx.compose.ui.e.a aVar1110 = androidx.compose.ui.e.f37317a;
                str7 = str5;
                androidx.compose.ui.layout.a1 a1VarB15 = androidx.compose.foundation.layout.j0.b(mVarY8, aVar1110.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, aVar);
                androidx.compose.ui.node.g.a aVar1111 = androidx.compose.ui.node.g.I;
                str8 = str6;
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
                function5 = function2;
                y7.n(c0VarD, a1VarB15, aVar1111.e());
                y7.n(c0VarD, b1VarK113, aVar1111.g());
                function2B = aVar1111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN113, aVar1111.f());
                androidx.compose.foundation.layout.n0 n0Var8 = androidx.compose.foundation.layout.n0.f16227a;
                long j116 = jM704getHeader0d7_KjU;
                float f17 = 4;
                androidx.compose.ui.a0 a0VarV8 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j116, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f17), 0.0f, 11, null);
                c0VarR.E(369281761);
                if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ8 = androidx.compose.foundation.i1.j(a0VarV8, false, null, null, null, (Function0) objI0, 15, null);
                androidx.compose.ui.layout.a1 a1VarE9 = u5.e(qVar8.w(), aVar1110.q(), c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarJ8);
                function0A2 = aVar1111.a();
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
                y7.n(c0VarD2, a1VarE9, aVar1111.e());
                y7.n(c0VarD2, b1VarK114, aVar1111.g());
                function2B2 = aVar1111.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN114, aVar1111.f());
                y5Var = y5.f16577a;
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f17)), c0VarR, 6);
                c0VarR.E(-1851697424);
                if (function5 != null) {
                    function6 = function5;
                } else {
                    function6 = function5;
                }
                c0VarR.A();
                if (function6 != null) {
                    fR = androidx.compose.ui.unit.h.r(8);
                } else {
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                long j28 = j13;
                if (list2.size() == 1) {
                    c0VarR.E(-1567458464);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    boolean z112 = z11;
                    AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z112, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                    z13 = z112;
                    c0VarR.A();
                } else {
                    z13 = z11;
                    if (list2.size() > 1) {
                        c0VarR.E(-1567156741);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1566946282);
                        c0VarR.A();
                    }
                }
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.ui.a0 a0VarQ8 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarB16 = androidx.compose.foundation.layout.j0.b(qVar8.y(), aVar1110.u(), c0VarR, 48);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarQ8);
                function0A3 = aVar1111.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarB16, aVar1111.e());
                y7.n(c0VarD3, b1VarK115, aVar1111.g());
                function2B3 = aVar1111.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN115, aVar1111.f());
                IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                int i410 = IntercomTheme.$stable;
                y3 y3VarM8 = y3.m(intercomTheme8.getTypography(c0VarR, i410).getType03(), j28, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                androidx.compose.ui.text.style.j.a aVar1112 = androidx.compose.ui.text.style.j.f42206b;
                int iF8 = aVar1112.f();
                androidx.compose.ui.text.style.v.a aVar1113 = androidx.compose.ui.text.style.v.f42256b;
                Function0<Unit> function16 = function4;
                nVar4 = nVar3;
                Integer num14 = numValueOf;
                androidx.compose.ui.a0 a0Var12 = a0Var3;
                q50.t(str8, null, j28, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF8), 0L, aVar1113.c(), false, 1, 0, null, y3VarM8, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                c0VarR.E(1212142532);
                if (str7 != null) {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                } else {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                }
                c0Var2.A();
                c0Var2.o();
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                c0Var2.E(-1851613512);
                if (nVar4 == null) {
                    nVar5 = nVar4;
                } else {
                    nVar5 = nVar4;
                    nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                    Unit unit17 = Unit.f312394a;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(369372238);
                if (!StringsKt.w3(str8)) {
                    IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                }
                c0Var2.A();
                c0Var2.o();
                nVar6 = nVar5;
                c0Var3 = c0Var2;
                str10 = str9;
                j16 = j15;
                num5 = num4;
                list3 = list2;
                a0Var4 = a0Var12;
                j17 = j28;
                function7 = function16;
                str11 = str8;
                j18 = j116;
                function8 = function6;
                z14 = z13;
                num6 = num14;
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= a5.S0;
            nVar2 = nVar;
            if (i18 == 16) {
                i31 = i29;
                if ((1533916891 & i13) != 306783378) {
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i31 = i29;
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i42 != 0) {
                    str3 = "";
                }
                if (i14 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                    i13 &= -3670017;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i12 & 256) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                    i13 &= -234881025;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((i12 & 512) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i13 = (-1879048193) & i13;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if ((i12 & 1024) != 0) {
                    jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i27 &= -15;
                } else {
                    jM711getOnHeader0d7_KjU2 = j12;
                }
                if (i26 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                i32 = i27;
                str5 = str4;
                i33 = i13;
                list2 = listEmptyList;
                num4 = num3;
                j13 = jM711getOnHeader0d7_KjU;
                j14 = jM711getOnHeader0d7_KjU2;
                function4 = function3;
                str6 = str3;
                if (i31 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
            } else {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i42 != 0) {
                    str3 = "";
                }
                if (i14 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                    i13 &= -3670017;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i12 & 256) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                    i13 &= -234881025;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((i12 & 512) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i13 = (-1879048193) & i13;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if ((i12 & 1024) != 0) {
                    jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i27 &= -15;
                } else {
                    jM711getOnHeader0d7_KjU2 = j12;
                }
                if (i26 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                i32 = i27;
                str5 = str4;
                i33 = i13;
                list2 = listEmptyList;
                num4 = num3;
                j13 = jM711getOnHeader0d7_KjU;
                j14 = jM711getOnHeader0d7_KjU2;
                function4 = function3;
                str6 = str3;
                if (i31 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
            }
            c0VarR.Z();
            activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            c0VarR.E(-1152542544);
            if (window != null) {
                androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                    }
                }, c0VarR, 0);
                Unit unit18 = Unit.f312394a;
            }
            c0VarR.A();
            aVar = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.q qVar9 = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY9 = qVar9.y();
            androidx.compose.ui.e.a aVar1114 = androidx.compose.ui.e.f37317a;
            str7 = str5;
            androidx.compose.ui.layout.a1 a1VarB17 = androidx.compose.foundation.layout.j0.b(mVarY9, aVar1114.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK116 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar1115 = androidx.compose.ui.node.g.I;
            str8 = str6;
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
            function5 = function2;
            y7.n(c0VarD, a1VarB17, aVar1115.e());
            y7.n(c0VarD, b1VarK116, aVar1115.g());
            function2B = aVar1115.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN116, aVar1115.f());
            androidx.compose.foundation.layout.n0 n0Var9 = androidx.compose.foundation.layout.n0.f16227a;
            long j117 = jM704getHeader0d7_KjU;
            float f18 = 4;
            androidx.compose.ui.a0 a0VarV9 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j117, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f18), 0.0f, 11, null);
            c0VarR.E(369281761);
            if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarJ9 = androidx.compose.foundation.i1.j(a0VarV9, false, null, null, null, (Function0) objI0, 15, null);
            androidx.compose.ui.layout.a1 a1VarE10 = u5.e(qVar9.w(), aVar1114.q(), c0VarR, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK117 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarJ9);
            function0A2 = aVar1115.a();
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
            y7.n(c0VarD2, a1VarE10, aVar1115.e());
            y7.n(c0VarD2, b1VarK117, aVar1115.g());
            function2B2 = aVar1115.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN117, aVar1115.f());
            y5Var = y5.f16577a;
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f18)), c0VarR, 6);
            c0VarR.E(-1851697424);
            if (function5 != null) {
                function6 = function5;
            } else {
                function6 = function5;
            }
            c0VarR.A();
            if (function6 != null) {
                fR = androidx.compose.ui.unit.h.r(8);
            } else {
                fR = androidx.compose.ui.unit.h.r(16);
            }
            long j29 = j13;
            if (list2.size() == 1) {
                c0VarR.E(-1567458464);
                l6.a(i6.B(aVar, fR), c0VarR, 0);
                boolean z113 = z11;
                AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z113, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                z13 = z113;
                c0VarR.A();
            } else {
                z13 = z11;
                if (list2.size() > 1) {
                    c0VarR.E(-1567156741);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1566946282);
                    c0VarR.A();
                }
            }
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            androidx.compose.ui.a0 a0VarQ9 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
            androidx.compose.ui.layout.a1 a1VarB18 = androidx.compose.foundation.layout.j0.b(qVar9.y(), aVar1114.u(), c0VarR, 48);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK118 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarQ9);
            function0A3 = aVar1115.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            c0VarD3 = y7.d(c0VarR);
            y7.n(c0VarD3, a1VarB18, aVar1115.e());
            y7.n(c0VarD3, b1VarK118, aVar1115.g());
            function2B3 = aVar1115.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN118, aVar1115.f());
            IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
            int i411 = IntercomTheme.$stable;
            y3 y3VarM9 = y3.m(intercomTheme9.getTypography(c0VarR, i411).getType03(), j29, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            androidx.compose.ui.text.style.j.a aVar1116 = androidx.compose.ui.text.style.j.f42206b;
            int iF9 = aVar1116.f();
            androidx.compose.ui.text.style.v.a aVar1117 = androidx.compose.ui.text.style.v.f42256b;
            Function0<Unit> function17 = function4;
            nVar4 = nVar3;
            Integer num15 = numValueOf;
            androidx.compose.ui.a0 a0Var13 = a0Var3;
            q50.t(str8, null, j29, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF9), 0L, aVar1117.c(), false, 1, 0, null, y3VarM9, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
            c0VarR.E(1212142532);
            if (str7 != null) {
                c0Var2 = c0VarR;
                j15 = j14;
                i34 = 6;
                i35 = 0;
                str9 = str7;
            } else {
                c0Var2 = c0VarR;
                j15 = j14;
                i34 = 6;
                i35 = 0;
                str9 = str7;
            }
            c0Var2.A();
            c0Var2.o();
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
            c0Var2.E(-1851613512);
            if (nVar4 == null) {
                nVar5 = nVar4;
            } else {
                nVar5 = nVar4;
                nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                Unit unit19 = Unit.f312394a;
            }
            c0Var2.A();
            c0Var2.o();
            c0Var2.E(369372238);
            if (!StringsKt.w3(str8)) {
                IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
            }
            c0Var2.A();
            c0Var2.o();
            nVar6 = nVar5;
            c0Var3 = c0Var2;
            str10 = str9;
            j16 = j15;
            num5 = num4;
            list3 = list2;
            a0Var4 = a0Var13;
            j17 = j29;
            function7 = function17;
            str11 = str8;
            j18 = j117;
            function8 = function6;
            z14 = z13;
            num6 = num15;
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        str3 = str;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i10 & 896) == 0) {
                if (c0VarR.D(str2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 7168) == 0) {
                    num3 = num;
                    if (c0VarR.D(num3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= 8192;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    function2 = function0;
                } else {
                    function2 = function0;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.k0(function2)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i13 |= i20;
                    }
                }
                if ((i10 & 3670016) == 0) {
                    numValueOf = num2;
                    if ((i12 & 64) == 0) {
                        i40 = 524288;
                    } else {
                        i40 = 524288;
                    }
                    i13 |= i40;
                } else {
                    numValueOf = num2;
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c0VarR.G(z10)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i12 & 256) == 0) {
                        i23 = i41;
                        if (c0VarR.L(j10)) {
                            i39 = 67108864;
                        }
                        i13 |= i39;
                    } else {
                        i23 = i41;
                    }
                    i39 = com.google.api.client.googleapis.media.a.f115410j;
                    i13 |= i39;
                } else {
                    i23 = i41;
                }
                if ((i10 & 1879048192) != 0) {
                    if ((i12 & 512) == 0) {
                        i38 = 268435456;
                    } else {
                        i38 = 268435456;
                    }
                    i13 |= i38;
                }
                if ((i11 & 14) == 0) {
                    if ((i12 & 1024) == 0) {
                        i37 = 2;
                    } else {
                        i37 = 2;
                    }
                    i24 = i37 | i11;
                } else {
                    i24 = i11;
                }
                i25 = i24;
                i26 = i12 & 2048;
                if (i26 != 0) {
                    i27 = i25 | 48;
                } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                    if (c0VarR.k0(function1)) {
                        i28 = 32;
                    } else {
                        i28 = 16;
                    }
                    i27 = i25 | i28;
                } else {
                    i27 = i25;
                }
                i29 = i12 & 4096;
                if (i29 != 0) {
                    if ((i11 & 896) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i30 = 256;
                        } else {
                            i30 = 128;
                        }
                        i27 |= i30;
                    }
                    if (i18 == 16) {
                        i31 = i29;
                        if ((1533916891 & i13) != 306783378) {
                        }
                        s5VarT = c0Var3.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i31 = i29;
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i42 != 0) {
                            str3 = "";
                        }
                        if (i14 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i16 != 0) {
                            num3 = null;
                        }
                        if (i18 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                            i13 &= -3670017;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 256) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                            i13 &= -234881025;
                        } else {
                            jM704getHeader0d7_KjU = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i13 = (-1879048193) & i13;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i27 &= -15;
                        } else {
                            jM711getOnHeader0d7_KjU2 = j12;
                        }
                        if (i26 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        i32 = i27;
                        str5 = str4;
                        i33 = i13;
                        list2 = listEmptyList;
                        num4 = num3;
                        j13 = jM711getOnHeader0d7_KjU;
                        j14 = jM711getOnHeader0d7_KjU2;
                        function4 = function3;
                        str6 = str3;
                        if (i31 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i42 != 0) {
                            str3 = "";
                        }
                        if (i14 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i16 != 0) {
                            num3 = null;
                        }
                        if (i18 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                            i13 &= -3670017;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 256) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                            i13 &= -234881025;
                        } else {
                            jM704getHeader0d7_KjU = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i13 = (-1879048193) & i13;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                            i27 &= -15;
                        } else {
                            jM711getOnHeader0d7_KjU2 = j12;
                        }
                        if (i26 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        i32 = i27;
                        str5 = str4;
                        i33 = i13;
                        list2 = listEmptyList;
                        num4 = num3;
                        j13 = jM711getOnHeader0d7_KjU;
                        j14 = jM711getOnHeader0d7_KjU2;
                        function4 = function3;
                        str6 = str3;
                        if (i31 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                    }
                    c0VarR.Z();
                    activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c0VarR.E(-1152542544);
                    if (window != null) {
                        androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                            }
                        }, c0VarR, 0);
                        Unit unit110 = Unit.f312394a;
                    }
                    c0VarR.A();
                    aVar = androidx.compose.ui.a0.E;
                    androidx.compose.foundation.layout.q qVar10 = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY10 = qVar10.y();
                    androidx.compose.ui.e.a aVar1118 = androidx.compose.ui.e.f37317a;
                    str7 = str5;
                    androidx.compose.ui.layout.a1 a1VarB19 = androidx.compose.foundation.layout.j0.b(mVarY10, aVar1118.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, aVar);
                    androidx.compose.ui.node.g.a aVar1119 = androidx.compose.ui.node.g.I;
                    str8 = str6;
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
                    function5 = function2;
                    y7.n(c0VarD, a1VarB19, aVar1119.e());
                    y7.n(c0VarD, b1VarK119, aVar1119.g());
                    function2B = aVar1119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN119, aVar1119.f());
                    androidx.compose.foundation.layout.n0 n0Var10 = androidx.compose.foundation.layout.n0.f16227a;
                    long j118 = jM704getHeader0d7_KjU;
                    float f19 = 4;
                    androidx.compose.ui.a0 a0VarV10 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j118, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f19), 0.0f, 11, null);
                    c0VarR.E(369281761);
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ10 = androidx.compose.foundation.i1.j(a0VarV10, false, null, null, null, (Function0) objI0, 15, null);
                    androidx.compose.ui.layout.a1 a1VarE11 = u5.e(qVar10.w(), aVar1118.q(), c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK1110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarJ10);
                    function0A2 = aVar1119.a();
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
                    y7.n(c0VarD2, a1VarE11, aVar1119.e());
                    y7.n(c0VarD2, b1VarK1110, aVar1119.g());
                    function2B2 = aVar1119.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1110, aVar1119.f());
                    y5Var = y5.f16577a;
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f19)), c0VarR, 6);
                    c0VarR.E(-1851697424);
                    if (function5 != null) {
                        function6 = function5;
                    } else {
                        function6 = function5;
                    }
                    c0VarR.A();
                    if (function6 != null) {
                        fR = androidx.compose.ui.unit.h.r(8);
                    } else {
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    long j210 = j13;
                    if (list2.size() == 1) {
                        c0VarR.E(-1567458464);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        boolean z114 = z11;
                        AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z114, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                        z13 = z114;
                        c0VarR.A();
                    } else {
                        z13 = z11;
                        if (list2.size() > 1) {
                            c0VarR.E(-1567156741);
                            l6.a(i6.B(aVar, fR), c0VarR, 0);
                            AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1566946282);
                            c0VarR.A();
                        }
                    }
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    androidx.compose.ui.a0 a0VarQ10 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarB110 = androidx.compose.foundation.layout.j0.b(qVar10.y(), aVar1118.u(), c0VarR, 48);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK1111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarQ10);
                    function0A3 = aVar1119.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = y7.d(c0VarR);
                    y7.n(c0VarD3, a1VarB110, aVar1119.e());
                    y7.n(c0VarD3, b1VarK1111, aVar1119.g());
                    function2B3 = aVar1119.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1111, aVar1119.f());
                    IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                    int i412 = IntercomTheme.$stable;
                    y3 y3VarM10 = y3.m(intercomTheme10.getTypography(c0VarR, i412).getType03(), j210, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    androidx.compose.ui.text.style.j.a aVar11110 = androidx.compose.ui.text.style.j.f42206b;
                    int iF10 = aVar11110.f();
                    androidx.compose.ui.text.style.v.a aVar11111 = androidx.compose.ui.text.style.v.f42256b;
                    Function0<Unit> function18 = function4;
                    nVar4 = nVar3;
                    Integer num16 = numValueOf;
                    androidx.compose.ui.a0 a0Var14 = a0Var3;
                    q50.t(str8, null, j210, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF10), 0L, aVar11111.c(), false, 1, 0, null, y3VarM10, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                    c0VarR.E(1212142532);
                    if (str7 != null) {
                        c0Var2 = c0VarR;
                        j15 = j14;
                        i34 = 6;
                        i35 = 0;
                        str9 = str7;
                    } else {
                        c0Var2 = c0VarR;
                        j15 = j14;
                        i34 = 6;
                        i35 = 0;
                        str9 = str7;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                    c0Var2.E(-1851613512);
                    if (nVar4 == null) {
                        nVar5 = nVar4;
                    } else {
                        nVar5 = nVar4;
                        nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                        Unit unit111 = Unit.f312394a;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(369372238);
                    if (!StringsKt.w3(str8)) {
                        IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                    }
                    c0Var2.A();
                    c0Var2.o();
                    nVar6 = nVar5;
                    c0Var3 = c0Var2;
                    str10 = str9;
                    j16 = j15;
                    num5 = num4;
                    list3 = list2;
                    a0Var4 = a0Var14;
                    j17 = j210;
                    function7 = function18;
                    str11 = str8;
                    j18 = j118;
                    function8 = function6;
                    z14 = z13;
                    num6 = num16;
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= a5.S0;
                nVar2 = nVar;
                if (i18 == 16) {
                    i31 = i29;
                    if ((1533916891 & i13) != 306783378) {
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i31 = i29;
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                }
                c0VarR.Z();
                activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c0VarR.E(-1152542544);
                if (window != null) {
                    androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                        }
                    }, c0VarR, 0);
                    Unit unit112 = Unit.f312394a;
                }
                c0VarR.A();
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.q qVar11 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY11 = qVar11.y();
                androidx.compose.ui.e.a aVar11112 = androidx.compose.ui.e.f37317a;
                str7 = str5;
                androidx.compose.ui.layout.a1 a1VarB111 = androidx.compose.foundation.layout.j0.b(mVarY11, aVar11112.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, aVar);
                androidx.compose.ui.node.g.a aVar11113 = androidx.compose.ui.node.g.I;
                str8 = str6;
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
                function5 = function2;
                y7.n(c0VarD, a1VarB111, aVar11113.e());
                y7.n(c0VarD, b1VarK1112, aVar11113.g());
                function2B = aVar11113.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1112, aVar11113.f());
                androidx.compose.foundation.layout.n0 n0Var11 = androidx.compose.foundation.layout.n0.f16227a;
                long j119 = jM704getHeader0d7_KjU;
                float f110 = 4;
                androidx.compose.ui.a0 a0VarV11 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j119, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f110), 0.0f, 11, null);
                c0VarR.E(369281761);
                if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ11 = androidx.compose.foundation.i1.j(a0VarV11, false, null, null, null, (Function0) objI0, 15, null);
                androidx.compose.ui.layout.a1 a1VarE12 = u5.e(qVar11.w(), aVar11112.q(), c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1113 = androidx.compose.ui.m.n(c0VarR, a0VarJ11);
                function0A2 = aVar11113.a();
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
                y7.n(c0VarD2, a1VarE12, aVar11113.e());
                y7.n(c0VarD2, b1VarK1113, aVar11113.g());
                function2B2 = aVar11113.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN1113, aVar11113.f());
                y5Var = y5.f16577a;
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f110)), c0VarR, 6);
                c0VarR.E(-1851697424);
                if (function5 != null) {
                    function6 = function5;
                } else {
                    function6 = function5;
                }
                c0VarR.A();
                if (function6 != null) {
                    fR = androidx.compose.ui.unit.h.r(8);
                } else {
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                long j211 = j13;
                if (list2.size() == 1) {
                    c0VarR.E(-1567458464);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    boolean z115 = z11;
                    AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z115, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                    z13 = z115;
                    c0VarR.A();
                } else {
                    z13 = z11;
                    if (list2.size() > 1) {
                        c0VarR.E(-1567156741);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1566946282);
                        c0VarR.A();
                    }
                }
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.ui.a0 a0VarQ11 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarB112 = androidx.compose.foundation.layout.j0.b(qVar11.y(), aVar11112.u(), c0VarR, 48);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1114 = androidx.compose.ui.m.n(c0VarR, a0VarQ11);
                function0A3 = aVar11113.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarB112, aVar11113.e());
                y7.n(c0VarD3, b1VarK1114, aVar11113.g());
                function2B3 = aVar11113.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN1114, aVar11113.f());
                IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                int i413 = IntercomTheme.$stable;
                y3 y3VarM11 = y3.m(intercomTheme11.getTypography(c0VarR, i413).getType03(), j211, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                androidx.compose.ui.text.style.j.a aVar11114 = androidx.compose.ui.text.style.j.f42206b;
                int iF11 = aVar11114.f();
                androidx.compose.ui.text.style.v.a aVar11115 = androidx.compose.ui.text.style.v.f42256b;
                Function0<Unit> function19 = function4;
                nVar4 = nVar3;
                Integer num17 = numValueOf;
                androidx.compose.ui.a0 a0Var15 = a0Var3;
                q50.t(str8, null, j211, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF11), 0L, aVar11115.c(), false, 1, 0, null, y3VarM11, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                c0VarR.E(1212142532);
                if (str7 != null) {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                } else {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                }
                c0Var2.A();
                c0Var2.o();
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                c0Var2.E(-1851613512);
                if (nVar4 == null) {
                    nVar5 = nVar4;
                } else {
                    nVar5 = nVar4;
                    nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                    Unit unit113 = Unit.f312394a;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(369372238);
                if (!StringsKt.w3(str8)) {
                    IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                }
                c0Var2.A();
                c0Var2.o();
                nVar6 = nVar5;
                c0Var3 = c0Var2;
                str10 = str9;
                j16 = j15;
                num5 = num4;
                list3 = list2;
                a0Var4 = a0Var15;
                j17 = j211;
                function7 = function19;
                str11 = str8;
                j18 = j119;
                function8 = function6;
                z14 = z13;
                num6 = num17;
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            num3 = num;
            i18 = i12 & 16;
            if (i18 != 0) {
                i13 |= 8192;
            }
            i19 = i12 & 32;
            if (i19 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                function2 = function0;
            } else {
                function2 = function0;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i13 |= i20;
                }
            }
            if ((i10 & 3670016) == 0) {
                numValueOf = num2;
                if ((i12 & 64) == 0) {
                    i40 = 524288;
                } else {
                    i40 = 524288;
                }
                i13 |= i40;
            } else {
                numValueOf = num2;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c0VarR.G(z10)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
            if ((i10 & 234881024) == 0) {
                if ((i12 & 256) == 0) {
                    i23 = i41;
                    if (c0VarR.L(j10)) {
                        i39 = 67108864;
                    }
                    i13 |= i39;
                } else {
                    i23 = i41;
                }
                i39 = com.google.api.client.googleapis.media.a.f115410j;
                i13 |= i39;
            } else {
                i23 = i41;
            }
            if ((i10 & 1879048192) != 0) {
                if ((i12 & 512) == 0) {
                    i38 = 268435456;
                } else {
                    i38 = 268435456;
                }
                i13 |= i38;
            }
            if ((i11 & 14) == 0) {
                if ((i12 & 1024) == 0) {
                    i37 = 2;
                } else {
                    i37 = 2;
                }
                i24 = i37 | i11;
            } else {
                i24 = i11;
            }
            i25 = i24;
            i26 = i12 & 2048;
            if (i26 != 0) {
                i27 = i25 | 48;
            } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                if (c0VarR.k0(function1)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i27 = i25 | i28;
            } else {
                i27 = i25;
            }
            i29 = i12 & 4096;
            if (i29 != 0) {
                if ((i11 & 896) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i30 = 256;
                    } else {
                        i30 = 128;
                    }
                    i27 |= i30;
                }
                if (i18 == 16) {
                    i31 = i29;
                    if ((1533916891 & i13) != 306783378) {
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i31 = i29;
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                }
                c0VarR.Z();
                activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c0VarR.E(-1152542544);
                if (window != null) {
                    androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                        }
                    }, c0VarR, 0);
                    Unit unit114 = Unit.f312394a;
                }
                c0VarR.A();
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.q qVar12 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY12 = qVar12.y();
                androidx.compose.ui.e.a aVar11116 = androidx.compose.ui.e.f37317a;
                str7 = str5;
                androidx.compose.ui.layout.a1 a1VarB113 = androidx.compose.foundation.layout.j0.b(mVarY12, aVar11116.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1115 = androidx.compose.ui.m.n(c0VarR, aVar);
                androidx.compose.ui.node.g.a aVar11117 = androidx.compose.ui.node.g.I;
                str8 = str6;
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
                function5 = function2;
                y7.n(c0VarD, a1VarB113, aVar11117.e());
                y7.n(c0VarD, b1VarK1115, aVar11117.g());
                function2B = aVar11117.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1115, aVar11117.f());
                androidx.compose.foundation.layout.n0 n0Var12 = androidx.compose.foundation.layout.n0.f16227a;
                long j1110 = jM704getHeader0d7_KjU;
                float f111 = 4;
                androidx.compose.ui.a0 a0VarV12 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j1110, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f111), 0.0f, 11, null);
                c0VarR.E(369281761);
                if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ12 = androidx.compose.foundation.i1.j(a0VarV12, false, null, null, null, (Function0) objI0, 15, null);
                androidx.compose.ui.layout.a1 a1VarE13 = u5.e(qVar12.w(), aVar11116.q(), c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1116 = androidx.compose.ui.m.n(c0VarR, a0VarJ12);
                function0A2 = aVar11117.a();
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
                y7.n(c0VarD2, a1VarE13, aVar11117.e());
                y7.n(c0VarD2, b1VarK1116, aVar11117.g());
                function2B2 = aVar11117.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN1116, aVar11117.f());
                y5Var = y5.f16577a;
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f111)), c0VarR, 6);
                c0VarR.E(-1851697424);
                if (function5 != null) {
                    function6 = function5;
                } else {
                    function6 = function5;
                }
                c0VarR.A();
                if (function6 != null) {
                    fR = androidx.compose.ui.unit.h.r(8);
                } else {
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                long j212 = j13;
                if (list2.size() == 1) {
                    c0VarR.E(-1567458464);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    boolean z116 = z11;
                    AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z116, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                    z13 = z116;
                    c0VarR.A();
                } else {
                    z13 = z11;
                    if (list2.size() > 1) {
                        c0VarR.E(-1567156741);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1566946282);
                        c0VarR.A();
                    }
                }
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.ui.a0 a0VarQ12 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarB114 = androidx.compose.foundation.layout.j0.b(qVar12.y(), aVar11116.u(), c0VarR, 48);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1117 = androidx.compose.ui.m.n(c0VarR, a0VarQ12);
                function0A3 = aVar11117.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarB114, aVar11117.e());
                y7.n(c0VarD3, b1VarK1117, aVar11117.g());
                function2B3 = aVar11117.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN1117, aVar11117.f());
                IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                int i414 = IntercomTheme.$stable;
                y3 y3VarM12 = y3.m(intercomTheme12.getTypography(c0VarR, i414).getType03(), j212, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                androidx.compose.ui.text.style.j.a aVar11118 = androidx.compose.ui.text.style.j.f42206b;
                int iF12 = aVar11118.f();
                androidx.compose.ui.text.style.v.a aVar11119 = androidx.compose.ui.text.style.v.f42256b;
                Function0<Unit> function110 = function4;
                nVar4 = nVar3;
                Integer num18 = numValueOf;
                androidx.compose.ui.a0 a0Var16 = a0Var3;
                q50.t(str8, null, j212, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF12), 0L, aVar11119.c(), false, 1, 0, null, y3VarM12, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                c0VarR.E(1212142532);
                if (str7 != null) {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                } else {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                }
                c0Var2.A();
                c0Var2.o();
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                c0Var2.E(-1851613512);
                if (nVar4 == null) {
                    nVar5 = nVar4;
                } else {
                    nVar5 = nVar4;
                    nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                    Unit unit115 = Unit.f312394a;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(369372238);
                if (!StringsKt.w3(str8)) {
                    IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                }
                c0Var2.A();
                c0Var2.o();
                nVar6 = nVar5;
                c0Var3 = c0Var2;
                str10 = str9;
                j16 = j15;
                num5 = num4;
                list3 = list2;
                a0Var4 = a0Var16;
                j17 = j212;
                function7 = function110;
                str11 = str8;
                j18 = j1110;
                function8 = function6;
                z14 = z13;
                num6 = num18;
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= a5.S0;
            nVar2 = nVar;
            if (i18 == 16) {
                i31 = i29;
                if ((1533916891 & i13) != 306783378) {
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i31 = i29;
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i42 != 0) {
                    str3 = "";
                }
                if (i14 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                    i13 &= -3670017;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i12 & 256) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                    i13 &= -234881025;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((i12 & 512) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i13 = (-1879048193) & i13;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if ((i12 & 1024) != 0) {
                    jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i27 &= -15;
                } else {
                    jM711getOnHeader0d7_KjU2 = j12;
                }
                if (i26 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                i32 = i27;
                str5 = str4;
                i33 = i13;
                list2 = listEmptyList;
                num4 = num3;
                j13 = jM711getOnHeader0d7_KjU;
                j14 = jM711getOnHeader0d7_KjU2;
                function4 = function3;
                str6 = str3;
                if (i31 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
            } else {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i42 != 0) {
                    str3 = "";
                }
                if (i14 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                    i13 &= -3670017;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i12 & 256) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                    i13 &= -234881025;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((i12 & 512) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i13 = (-1879048193) & i13;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if ((i12 & 1024) != 0) {
                    jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i27 &= -15;
                } else {
                    jM711getOnHeader0d7_KjU2 = j12;
                }
                if (i26 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                i32 = i27;
                str5 = str4;
                i33 = i13;
                list2 = listEmptyList;
                num4 = num3;
                j13 = jM711getOnHeader0d7_KjU;
                j14 = jM711getOnHeader0d7_KjU2;
                function4 = function3;
                str6 = str3;
                if (i31 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
            }
            c0VarR.Z();
            activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            c0VarR.E(-1152542544);
            if (window != null) {
                androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                    }
                }, c0VarR, 0);
                Unit unit116 = Unit.f312394a;
            }
            c0VarR.A();
            aVar = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.q qVar13 = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY13 = qVar13.y();
            androidx.compose.ui.e.a aVar111110 = androidx.compose.ui.e.f37317a;
            str7 = str5;
            androidx.compose.ui.layout.a1 a1VarB115 = androidx.compose.foundation.layout.j0.b(mVarY13, aVar111110.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK1118 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1118 = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar111111 = androidx.compose.ui.node.g.I;
            str8 = str6;
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
            function5 = function2;
            y7.n(c0VarD, a1VarB115, aVar111111.e());
            y7.n(c0VarD, b1VarK1118, aVar111111.g());
            function2B = aVar111111.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1118, aVar111111.f());
            androidx.compose.foundation.layout.n0 n0Var13 = androidx.compose.foundation.layout.n0.f16227a;
            long j1111 = jM704getHeader0d7_KjU;
            float f112 = 4;
            androidx.compose.ui.a0 a0VarV13 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j1111, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f112), 0.0f, 11, null);
            c0VarR.E(369281761);
            if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarJ13 = androidx.compose.foundation.i1.j(a0VarV13, false, null, null, null, (Function0) objI0, 15, null);
            androidx.compose.ui.layout.a1 a1VarE14 = u5.e(qVar13.w(), aVar111110.q(), c0VarR, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK1119 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1119 = androidx.compose.ui.m.n(c0VarR, a0VarJ13);
            function0A2 = aVar111111.a();
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
            y7.n(c0VarD2, a1VarE14, aVar111111.e());
            y7.n(c0VarD2, b1VarK1119, aVar111111.g());
            function2B2 = aVar111111.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN1119, aVar111111.f());
            y5Var = y5.f16577a;
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f112)), c0VarR, 6);
            c0VarR.E(-1851697424);
            if (function5 != null) {
                function6 = function5;
            } else {
                function6 = function5;
            }
            c0VarR.A();
            if (function6 != null) {
                fR = androidx.compose.ui.unit.h.r(8);
            } else {
                fR = androidx.compose.ui.unit.h.r(16);
            }
            long j213 = j13;
            if (list2.size() == 1) {
                c0VarR.E(-1567458464);
                l6.a(i6.B(aVar, fR), c0VarR, 0);
                boolean z117 = z11;
                AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z117, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                z13 = z117;
                c0VarR.A();
            } else {
                z13 = z11;
                if (list2.size() > 1) {
                    c0VarR.E(-1567156741);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1566946282);
                    c0VarR.A();
                }
            }
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            androidx.compose.ui.a0 a0VarQ13 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
            androidx.compose.ui.layout.a1 a1VarB116 = androidx.compose.foundation.layout.j0.b(qVar13.y(), aVar111110.u(), c0VarR, 48);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK11110 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN11110 = androidx.compose.ui.m.n(c0VarR, a0VarQ13);
            function0A3 = aVar111111.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            c0VarD3 = y7.d(c0VarR);
            y7.n(c0VarD3, a1VarB116, aVar111111.e());
            y7.n(c0VarD3, b1VarK11110, aVar111111.g());
            function2B3 = aVar111111.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN11110, aVar111111.f());
            IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
            int i415 = IntercomTheme.$stable;
            y3 y3VarM13 = y3.m(intercomTheme13.getTypography(c0VarR, i415).getType03(), j213, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            androidx.compose.ui.text.style.j.a aVar111112 = androidx.compose.ui.text.style.j.f42206b;
            int iF13 = aVar111112.f();
            androidx.compose.ui.text.style.v.a aVar111113 = androidx.compose.ui.text.style.v.f42256b;
            Function0<Unit> function111 = function4;
            nVar4 = nVar3;
            Integer num19 = numValueOf;
            androidx.compose.ui.a0 a0Var17 = a0Var3;
            q50.t(str8, null, j213, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF13), 0L, aVar111113.c(), false, 1, 0, null, y3VarM13, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
            c0VarR.E(1212142532);
            if (str7 != null) {
                c0Var2 = c0VarR;
                j15 = j14;
                i34 = 6;
                i35 = 0;
                str9 = str7;
            } else {
                c0Var2 = c0VarR;
                j15 = j14;
                i34 = 6;
                i35 = 0;
                str9 = str7;
            }
            c0Var2.A();
            c0Var2.o();
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
            c0Var2.E(-1851613512);
            if (nVar4 == null) {
                nVar5 = nVar4;
            } else {
                nVar5 = nVar4;
                nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                Unit unit117 = Unit.f312394a;
            }
            c0Var2.A();
            c0Var2.o();
            c0Var2.E(369372238);
            if (!StringsKt.w3(str8)) {
                IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
            }
            c0Var2.A();
            c0Var2.o();
            nVar6 = nVar5;
            c0Var3 = c0Var2;
            str10 = str9;
            j16 = j15;
            num5 = num4;
            list3 = list2;
            a0Var4 = a0Var17;
            j17 = j213;
            function7 = function111;
            str11 = str8;
            j18 = j1111;
            function8 = function6;
            z14 = z13;
            num6 = num19;
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= a5.S0;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i10 & 7168) == 0) {
                num3 = num;
                if (c0VarR.D(num3)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                i13 |= 8192;
            }
            i19 = i12 & 32;
            if (i19 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                function2 = function0;
            } else {
                function2 = function0;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i13 |= i20;
                }
            }
            if ((i10 & 3670016) == 0) {
                numValueOf = num2;
                if ((i12 & 64) == 0) {
                    i40 = 524288;
                } else {
                    i40 = 524288;
                }
                i13 |= i40;
            } else {
                numValueOf = num2;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c0VarR.G(z10)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
            if ((i10 & 234881024) == 0) {
                if ((i12 & 256) == 0) {
                    i23 = i41;
                    if (c0VarR.L(j10)) {
                        i39 = 67108864;
                    }
                    i13 |= i39;
                } else {
                    i23 = i41;
                }
                i39 = com.google.api.client.googleapis.media.a.f115410j;
                i13 |= i39;
            } else {
                i23 = i41;
            }
            if ((i10 & 1879048192) != 0) {
                if ((i12 & 512) == 0) {
                    i38 = 268435456;
                } else {
                    i38 = 268435456;
                }
                i13 |= i38;
            }
            if ((i11 & 14) == 0) {
                if ((i12 & 1024) == 0) {
                    i37 = 2;
                } else {
                    i37 = 2;
                }
                i24 = i37 | i11;
            } else {
                i24 = i11;
            }
            i25 = i24;
            i26 = i12 & 2048;
            if (i26 != 0) {
                i27 = i25 | 48;
            } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                if (c0VarR.k0(function1)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i27 = i25 | i28;
            } else {
                i27 = i25;
            }
            i29 = i12 & 4096;
            if (i29 != 0) {
                if ((i11 & 896) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i30 = 256;
                    } else {
                        i30 = 128;
                    }
                    i27 |= i30;
                }
                if (i18 == 16) {
                    i31 = i29;
                    if ((1533916891 & i13) != 306783378) {
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i31 = i29;
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i42 != 0) {
                        str3 = "";
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                        i13 &= -3670017;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 256) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                        i13 &= -234881025;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i13 = (-1879048193) & i13;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                        i27 &= -15;
                    } else {
                        jM711getOnHeader0d7_KjU2 = j12;
                    }
                    if (i26 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    i32 = i27;
                    str5 = str4;
                    i33 = i13;
                    list2 = listEmptyList;
                    num4 = num3;
                    j13 = jM711getOnHeader0d7_KjU;
                    j14 = jM711getOnHeader0d7_KjU2;
                    function4 = function3;
                    str6 = str3;
                    if (i31 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                }
                c0VarR.Z();
                activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c0VarR.E(-1152542544);
                if (window != null) {
                    androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                        }
                    }, c0VarR, 0);
                    Unit unit118 = Unit.f312394a;
                }
                c0VarR.A();
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.q qVar14 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY14 = qVar14.y();
                androidx.compose.ui.e.a aVar111114 = androidx.compose.ui.e.f37317a;
                str7 = str5;
                androidx.compose.ui.layout.a1 a1VarB117 = androidx.compose.foundation.layout.j0.b(mVarY14, aVar111114.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK11111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111 = androidx.compose.ui.m.n(c0VarR, aVar);
                androidx.compose.ui.node.g.a aVar111115 = androidx.compose.ui.node.g.I;
                str8 = str6;
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
                function5 = function2;
                y7.n(c0VarD, a1VarB117, aVar111115.e());
                y7.n(c0VarD, b1VarK11111, aVar111115.g());
                function2B = aVar111115.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111, aVar111115.f());
                androidx.compose.foundation.layout.n0 n0Var14 = androidx.compose.foundation.layout.n0.f16227a;
                long j1112 = jM704getHeader0d7_KjU;
                float f113 = 4;
                androidx.compose.ui.a0 a0VarV14 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j1112, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f113), 0.0f, 11, null);
                c0VarR.E(369281761);
                if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ14 = androidx.compose.foundation.i1.j(a0VarV14, false, null, null, null, (Function0) objI0, 15, null);
                androidx.compose.ui.layout.a1 a1VarE15 = u5.e(qVar14.w(), aVar111114.q(), c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK11112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11112 = androidx.compose.ui.m.n(c0VarR, a0VarJ14);
                function0A2 = aVar111115.a();
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
                y7.n(c0VarD2, a1VarE15, aVar111115.e());
                y7.n(c0VarD2, b1VarK11112, aVar111115.g());
                function2B2 = aVar111115.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11112, aVar111115.f());
                y5Var = y5.f16577a;
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f113)), c0VarR, 6);
                c0VarR.E(-1851697424);
                if (function5 != null) {
                    function6 = function5;
                } else {
                    function6 = function5;
                }
                c0VarR.A();
                if (function6 != null) {
                    fR = androidx.compose.ui.unit.h.r(8);
                } else {
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                long j214 = j13;
                if (list2.size() == 1) {
                    c0VarR.E(-1567458464);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    boolean z118 = z11;
                    AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z118, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                    z13 = z118;
                    c0VarR.A();
                } else {
                    z13 = z11;
                    if (list2.size() > 1) {
                        c0VarR.E(-1567156741);
                        l6.a(i6.B(aVar, fR), c0VarR, 0);
                        AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1566946282);
                        c0VarR.A();
                    }
                }
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.ui.a0 a0VarQ14 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarB118 = androidx.compose.foundation.layout.j0.b(qVar14.y(), aVar111114.u(), c0VarR, 48);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK11113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11113 = androidx.compose.ui.m.n(c0VarR, a0VarQ14);
                function0A3 = aVar111115.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarB118, aVar111115.e());
                y7.n(c0VarD3, b1VarK11113, aVar111115.g());
                function2B3 = aVar111115.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN11113, aVar111115.f());
                IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                int i416 = IntercomTheme.$stable;
                y3 y3VarM14 = y3.m(intercomTheme14.getTypography(c0VarR, i416).getType03(), j214, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                androidx.compose.ui.text.style.j.a aVar111116 = androidx.compose.ui.text.style.j.f42206b;
                int iF14 = aVar111116.f();
                androidx.compose.ui.text.style.v.a aVar111117 = androidx.compose.ui.text.style.v.f42256b;
                Function0<Unit> function112 = function4;
                nVar4 = nVar3;
                Integer num110 = numValueOf;
                androidx.compose.ui.a0 a0Var18 = a0Var3;
                q50.t(str8, null, j214, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF14), 0L, aVar111117.c(), false, 1, 0, null, y3VarM14, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
                c0VarR.E(1212142532);
                if (str7 != null) {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                } else {
                    c0Var2 = c0VarR;
                    j15 = j14;
                    i34 = 6;
                    i35 = 0;
                    str9 = str7;
                }
                c0Var2.A();
                c0Var2.o();
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
                c0Var2.E(-1851613512);
                if (nVar4 == null) {
                    nVar5 = nVar4;
                } else {
                    nVar5 = nVar4;
                    nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                    Unit unit119 = Unit.f312394a;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(369372238);
                if (!StringsKt.w3(str8)) {
                    IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
                }
                c0Var2.A();
                c0Var2.o();
                nVar6 = nVar5;
                c0Var3 = c0Var2;
                str10 = str9;
                j16 = j15;
                num5 = num4;
                list3 = list2;
                a0Var4 = a0Var18;
                j17 = j214;
                function7 = function112;
                str11 = str8;
                j18 = j1112;
                function8 = function6;
                z14 = z13;
                num6 = num110;
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= a5.S0;
            nVar2 = nVar;
            if (i18 == 16) {
                i31 = i29;
                if ((1533916891 & i13) != 306783378) {
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i31 = i29;
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i42 != 0) {
                    str3 = "";
                }
                if (i14 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                    i13 &= -3670017;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i12 & 256) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                    i13 &= -234881025;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((i12 & 512) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i13 = (-1879048193) & i13;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if ((i12 & 1024) != 0) {
                    jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i27 &= -15;
                } else {
                    jM711getOnHeader0d7_KjU2 = j12;
                }
                if (i26 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                i32 = i27;
                str5 = str4;
                i33 = i13;
                list2 = listEmptyList;
                num4 = num3;
                j13 = jM711getOnHeader0d7_KjU;
                j14 = jM711getOnHeader0d7_KjU2;
                function4 = function3;
                str6 = str3;
                if (i31 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
            } else {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i42 != 0) {
                    str3 = "";
                }
                if (i14 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                    i13 &= -3670017;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i12 & 256) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                    i13 &= -234881025;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((i12 & 512) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i13 = (-1879048193) & i13;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if ((i12 & 1024) != 0) {
                    jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i27 &= -15;
                } else {
                    jM711getOnHeader0d7_KjU2 = j12;
                }
                if (i26 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                i32 = i27;
                str5 = str4;
                i33 = i13;
                list2 = listEmptyList;
                num4 = num3;
                j13 = jM711getOnHeader0d7_KjU;
                j14 = jM711getOnHeader0d7_KjU2;
                function4 = function3;
                str6 = str3;
                if (i31 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
            }
            c0VarR.Z();
            activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            c0VarR.E(-1152542544);
            if (window != null) {
                androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                    }
                }, c0VarR, 0);
                Unit unit1110 = Unit.f312394a;
            }
            c0VarR.A();
            aVar = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.q qVar15 = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY15 = qVar15.y();
            androidx.compose.ui.e.a aVar111118 = androidx.compose.ui.e.f37317a;
            str7 = str5;
            androidx.compose.ui.layout.a1 a1VarB119 = androidx.compose.foundation.layout.j0.b(mVarY15, aVar111118.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK11114 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN11114 = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar111119 = androidx.compose.ui.node.g.I;
            str8 = str6;
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
            function5 = function2;
            y7.n(c0VarD, a1VarB119, aVar111119.e());
            y7.n(c0VarD, b1VarK11114, aVar111119.g());
            function2B = aVar111119.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN11114, aVar111119.f());
            androidx.compose.foundation.layout.n0 n0Var15 = androidx.compose.foundation.layout.n0.f16227a;
            long j1113 = jM704getHeader0d7_KjU;
            float f114 = 4;
            androidx.compose.ui.a0 a0VarV15 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j1113, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f114), 0.0f, 11, null);
            c0VarR.E(369281761);
            if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarJ15 = androidx.compose.foundation.i1.j(a0VarV15, false, null, null, null, (Function0) objI0, 15, null);
            androidx.compose.ui.layout.a1 a1VarE16 = u5.e(qVar15.w(), aVar111118.q(), c0VarR, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK11115 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN11115 = androidx.compose.ui.m.n(c0VarR, a0VarJ15);
            function0A2 = aVar111119.a();
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
            y7.n(c0VarD2, a1VarE16, aVar111119.e());
            y7.n(c0VarD2, b1VarK11115, aVar111119.g());
            function2B2 = aVar111119.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN11115, aVar111119.f());
            y5Var = y5.f16577a;
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f114)), c0VarR, 6);
            c0VarR.E(-1851697424);
            if (function5 != null) {
                function6 = function5;
            } else {
                function6 = function5;
            }
            c0VarR.A();
            if (function6 != null) {
                fR = androidx.compose.ui.unit.h.r(8);
            } else {
                fR = androidx.compose.ui.unit.h.r(16);
            }
            long j215 = j13;
            if (list2.size() == 1) {
                c0VarR.E(-1567458464);
                l6.a(i6.B(aVar, fR), c0VarR, 0);
                boolean z119 = z11;
                AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z119, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                z13 = z119;
                c0VarR.A();
            } else {
                z13 = z11;
                if (list2.size() > 1) {
                    c0VarR.E(-1567156741);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1566946282);
                    c0VarR.A();
                }
            }
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            androidx.compose.ui.a0 a0VarQ15 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
            androidx.compose.ui.layout.a1 a1VarB1110 = androidx.compose.foundation.layout.j0.b(qVar15.y(), aVar111118.u(), c0VarR, 48);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK11116 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN11116 = androidx.compose.ui.m.n(c0VarR, a0VarQ15);
            function0A3 = aVar111119.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            c0VarD3 = y7.d(c0VarR);
            y7.n(c0VarD3, a1VarB1110, aVar111119.e());
            y7.n(c0VarD3, b1VarK11116, aVar111119.g());
            function2B3 = aVar111119.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN11116, aVar111119.f());
            IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
            int i417 = IntercomTheme.$stable;
            y3 y3VarM15 = y3.m(intercomTheme15.getTypography(c0VarR, i417).getType03(), j215, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            androidx.compose.ui.text.style.j.a aVar1111110 = androidx.compose.ui.text.style.j.f42206b;
            int iF15 = aVar1111110.f();
            androidx.compose.ui.text.style.v.a aVar1111111 = androidx.compose.ui.text.style.v.f42256b;
            Function0<Unit> function113 = function4;
            nVar4 = nVar3;
            Integer num111 = numValueOf;
            androidx.compose.ui.a0 a0Var19 = a0Var3;
            q50.t(str8, null, j215, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF15), 0L, aVar1111111.c(), false, 1, 0, null, y3VarM15, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
            c0VarR.E(1212142532);
            if (str7 != null) {
                c0Var2 = c0VarR;
                j15 = j14;
                i34 = 6;
                i35 = 0;
                str9 = str7;
            } else {
                c0Var2 = c0VarR;
                j15 = j14;
                i34 = 6;
                i35 = 0;
                str9 = str7;
            }
            c0Var2.A();
            c0Var2.o();
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
            c0Var2.E(-1851613512);
            if (nVar4 == null) {
                nVar5 = nVar4;
            } else {
                nVar5 = nVar4;
                nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                Unit unit1111 = Unit.f312394a;
            }
            c0Var2.A();
            c0Var2.o();
            c0Var2.E(369372238);
            if (!StringsKt.w3(str8)) {
                IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
            }
            c0Var2.A();
            c0Var2.o();
            nVar6 = nVar5;
            c0Var3 = c0Var2;
            str10 = str9;
            j16 = j15;
            num5 = num4;
            list3 = list2;
            a0Var4 = a0Var19;
            j17 = j215;
            function7 = function113;
            str11 = str8;
            j18 = j1113;
            function8 = function6;
            z14 = z13;
            num6 = num111;
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        num3 = num;
        i18 = i12 & 16;
        if (i18 != 0) {
            i13 |= 8192;
        }
        i19 = i12 & 32;
        if (i19 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            function2 = function0;
        } else {
            function2 = function0;
            if ((i10 & 458752) == 0) {
                if (c0VarR.k0(function2)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i13 |= i20;
            }
        }
        if ((i10 & 3670016) == 0) {
            numValueOf = num2;
            if ((i12 & 64) == 0) {
                i40 = 524288;
            } else {
                i40 = 524288;
            }
            i13 |= i40;
        } else {
            numValueOf = num2;
        }
        i21 = i12 & 128;
        if (i21 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (c0VarR.G(z10)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i13 |= i22;
        }
        if ((i10 & 234881024) == 0) {
            if ((i12 & 256) == 0) {
                i23 = i41;
                if (c0VarR.L(j10)) {
                    i39 = 67108864;
                }
                i13 |= i39;
            } else {
                i23 = i41;
            }
            i39 = com.google.api.client.googleapis.media.a.f115410j;
            i13 |= i39;
        } else {
            i23 = i41;
        }
        if ((i10 & 1879048192) != 0) {
            if ((i12 & 512) == 0) {
                i38 = 268435456;
            } else {
                i38 = 268435456;
            }
            i13 |= i38;
        }
        if ((i11 & 14) == 0) {
            if ((i12 & 1024) == 0) {
                i37 = 2;
            } else {
                i37 = 2;
            }
            i24 = i37 | i11;
        } else {
            i24 = i11;
        }
        i25 = i24;
        i26 = i12 & 2048;
        if (i26 != 0) {
            i27 = i25 | 48;
        } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            if (c0VarR.k0(function1)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i27 = i25 | i28;
        } else {
            i27 = i25;
        }
        i29 = i12 & 4096;
        if (i29 != 0) {
            if ((i11 & 896) == 0) {
                nVar2 = nVar;
                if (c0VarR.k0(nVar2)) {
                    i30 = 256;
                } else {
                    i30 = 128;
                }
                i27 |= i30;
            }
            if (i18 == 16) {
                i31 = i29;
                if ((1533916891 & i13) != 306783378) {
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i31 = i29;
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i42 != 0) {
                    str3 = "";
                }
                if (i14 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                    i13 &= -3670017;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i12 & 256) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                    i13 &= -234881025;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((i12 & 512) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i13 = (-1879048193) & i13;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if ((i12 & 1024) != 0) {
                    jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i27 &= -15;
                } else {
                    jM711getOnHeader0d7_KjU2 = j12;
                }
                if (i26 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                i32 = i27;
                str5 = str4;
                i33 = i13;
                list2 = listEmptyList;
                num4 = num3;
                j13 = jM711getOnHeader0d7_KjU;
                j14 = jM711getOnHeader0d7_KjU2;
                function4 = function3;
                str6 = str3;
                if (i31 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
            } else {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i42 != 0) {
                    str3 = "";
                }
                if (i14 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                    i13 &= -3670017;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i12 & 256) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                    i13 &= -234881025;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((i12 & 512) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i13 = (-1879048193) & i13;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if ((i12 & 1024) != 0) {
                    jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                    i27 &= -15;
                } else {
                    jM711getOnHeader0d7_KjU2 = j12;
                }
                if (i26 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                i32 = i27;
                str5 = str4;
                i33 = i13;
                list2 = listEmptyList;
                num4 = num3;
                j13 = jM711getOnHeader0d7_KjU;
                j14 = jM711getOnHeader0d7_KjU2;
                function4 = function3;
                str6 = str3;
                if (i31 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
            }
            c0VarR.Z();
            activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            c0VarR.E(-1152542544);
            if (window != null) {
                androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                    }
                }, c0VarR, 0);
                Unit unit1112 = Unit.f312394a;
            }
            c0VarR.A();
            aVar = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.q qVar16 = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY16 = qVar16.y();
            androidx.compose.ui.e.a aVar1111112 = androidx.compose.ui.e.f37317a;
            str7 = str5;
            androidx.compose.ui.layout.a1 a1VarB1111 = androidx.compose.foundation.layout.j0.b(mVarY16, aVar1111112.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK11117 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN11117 = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar1111113 = androidx.compose.ui.node.g.I;
            str8 = str6;
            function0A = aVar1111113.a();
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
            function5 = function2;
            y7.n(c0VarD, a1VarB1111, aVar1111113.e());
            y7.n(c0VarD, b1VarK11117, aVar1111113.g());
            function2B = aVar1111113.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN11117, aVar1111113.f());
            androidx.compose.foundation.layout.n0 n0Var16 = androidx.compose.foundation.layout.n0.f16227a;
            long j1114 = jM704getHeader0d7_KjU;
            float f115 = 4;
            androidx.compose.ui.a0 a0VarV16 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j1114, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f115), 0.0f, 11, null);
            c0VarR.E(369281761);
            if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarJ16 = androidx.compose.foundation.i1.j(a0VarV16, false, null, null, null, (Function0) objI0, 15, null);
            androidx.compose.ui.layout.a1 a1VarE17 = u5.e(qVar16.w(), aVar1111112.q(), c0VarR, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK11118 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN11118 = androidx.compose.ui.m.n(c0VarR, a0VarJ16);
            function0A2 = aVar1111113.a();
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
            y7.n(c0VarD2, a1VarE17, aVar1111113.e());
            y7.n(c0VarD2, b1VarK11118, aVar1111113.g());
            function2B2 = aVar1111113.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN11118, aVar1111113.f());
            y5Var = y5.f16577a;
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f115)), c0VarR, 6);
            c0VarR.E(-1851697424);
            if (function5 != null) {
                function6 = function5;
            } else {
                function6 = function5;
            }
            c0VarR.A();
            if (function6 != null) {
                fR = androidx.compose.ui.unit.h.r(8);
            } else {
                fR = androidx.compose.ui.unit.h.r(16);
            }
            long j216 = j13;
            if (list2.size() == 1) {
                c0VarR.E(-1567458464);
                l6.a(i6.B(aVar, fR), c0VarR, 0);
                boolean z1110 = z11;
                AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z1110, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
                z13 = z1110;
                c0VarR.A();
            } else {
                z13 = z11;
                if (list2.size() > 1) {
                    c0VarR.E(-1567156741);
                    l6.a(i6.B(aVar, fR), c0VarR, 0);
                    AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1566946282);
                    c0VarR.A();
                }
            }
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            androidx.compose.ui.a0 a0VarQ16 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
            androidx.compose.ui.layout.a1 a1VarB1112 = androidx.compose.foundation.layout.j0.b(qVar16.y(), aVar1111112.u(), c0VarR, 48);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK11119 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN11119 = androidx.compose.ui.m.n(c0VarR, a0VarQ16);
            function0A3 = aVar1111113.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            c0VarD3 = y7.d(c0VarR);
            y7.n(c0VarD3, a1VarB1112, aVar1111113.e());
            y7.n(c0VarD3, b1VarK11119, aVar1111113.g());
            function2B3 = aVar1111113.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN11119, aVar1111113.f());
            IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
            int i418 = IntercomTheme.$stable;
            y3 y3VarM16 = y3.m(intercomTheme16.getTypography(c0VarR, i418).getType03(), j216, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            androidx.compose.ui.text.style.j.a aVar1111114 = androidx.compose.ui.text.style.j.f42206b;
            int iF16 = aVar1111114.f();
            androidx.compose.ui.text.style.v.a aVar1111115 = androidx.compose.ui.text.style.v.f42256b;
            Function0<Unit> function114 = function4;
            nVar4 = nVar3;
            Integer num112 = numValueOf;
            androidx.compose.ui.a0 a0Var110 = a0Var3;
            q50.t(str8, null, j216, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF16), 0L, aVar1111115.c(), false, 1, 0, null, y3VarM16, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
            c0VarR.E(1212142532);
            if (str7 != null) {
                c0Var2 = c0VarR;
                j15 = j14;
                i34 = 6;
                i35 = 0;
                str9 = str7;
            } else {
                c0Var2 = c0VarR;
                j15 = j14;
                i34 = 6;
                i35 = 0;
                str9 = str7;
            }
            c0Var2.A();
            c0Var2.o();
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
            c0Var2.E(-1851613512);
            if (nVar4 == null) {
                nVar5 = nVar4;
            } else {
                nVar5 = nVar4;
                nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
                Unit unit1113 = Unit.f312394a;
            }
            c0Var2.A();
            c0Var2.o();
            c0Var2.E(369372238);
            if (!StringsKt.w3(str8)) {
                IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
            }
            c0Var2.A();
            c0Var2.o();
            nVar6 = nVar5;
            c0Var3 = c0Var2;
            str10 = str9;
            j16 = j15;
            num5 = num4;
            list3 = list2;
            a0Var4 = a0Var110;
            j17 = j216;
            function7 = function114;
            str11 = str8;
            j18 = j1114;
            function8 = function6;
            z14 = z13;
            num6 = num112;
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i27 |= a5.S0;
        nVar2 = nVar;
        if (i18 == 16) {
            i31 = i29;
            if ((1533916891 & i13) != 306783378) {
            }
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i31 = i29;
        c0VarR.l0();
        if ((i10 & 1) != 0) {
            if (i23 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i42 != 0) {
                str3 = "";
            }
            if (i14 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i16 != 0) {
                num3 = null;
            }
            if (i18 != 0) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list;
            }
            if (i19 != 0) {
                function2 = null;
            }
            if ((i12 & 64) != 0) {
                numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                i13 &= -3670017;
            }
            if (i21 != 0) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if ((i12 & 256) != 0) {
                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                i13 &= -234881025;
            } else {
                jM704getHeader0d7_KjU = j10;
            }
            if ((i12 & 512) != 0) {
                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                i13 = (-1879048193) & i13;
            } else {
                jM711getOnHeader0d7_KjU = j11;
            }
            if ((i12 & 1024) != 0) {
                jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                i27 &= -15;
            } else {
                jM711getOnHeader0d7_KjU2 = j12;
            }
            if (i26 != 0) {
                function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function3 = function1;
            }
            i32 = i27;
            str5 = str4;
            i33 = i13;
            list2 = listEmptyList;
            num4 = num3;
            j13 = jM711getOnHeader0d7_KjU;
            j14 = jM711getOnHeader0d7_KjU2;
            function4 = function3;
            str6 = str3;
            if (i31 != 0) {
                nVar3 = null;
            } else {
                nVar3 = nVar;
            }
        } else {
            if (i23 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i42 != 0) {
                str3 = "";
            }
            if (i14 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i16 != 0) {
                num3 = null;
            }
            if (i18 != 0) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list;
            }
            if (i19 != 0) {
                function2 = null;
            }
            if ((i12 & 64) != 0) {
                numValueOf = Integer.valueOf(R.drawable.intercom_ic_back);
                i13 &= -3670017;
            }
            if (i21 != 0) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if ((i12 & 256) != 0) {
                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU();
                i13 &= -234881025;
            } else {
                jM704getHeader0d7_KjU = j10;
            }
            if ((i12 & 512) != 0) {
                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                i13 = (-1879048193) & i13;
            } else {
                jM711getOnHeader0d7_KjU = j11;
            }
            if ((i12 & 1024) != 0) {
                jM711getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU();
                i27 &= -15;
            } else {
                jM711getOnHeader0d7_KjU2 = j12;
            }
            if (i26 != 0) {
                function3 = new Function0() { // from class: io.intercom.android.sdk.m5.components.m3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function3 = function1;
            }
            i32 = i27;
            str5 = str4;
            i33 = i13;
            list2 = listEmptyList;
            num4 = num3;
            j13 = jM711getOnHeader0d7_KjU;
            j14 = jM711getOnHeader0d7_KjU2;
            function4 = function3;
            str6 = str3;
            if (i31 != 0) {
                nVar3 = null;
            } else {
                nVar3 = nVar;
            }
        }
        c0VarR.Z();
        activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        c0VarR.E(-1152542544);
        if (window != null) {
            androidx.compose.runtime.b2.m(new Function0() { // from class: io.intercom.android.sdk.m5.components.n3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j13);
                }
            }, c0VarR, 0);
            Unit unit1114 = Unit.f312394a;
        }
        c0VarR.A();
        aVar = androidx.compose.ui.a0.E;
        androidx.compose.foundation.layout.q qVar17 = androidx.compose.foundation.layout.q.f16330a;
        androidx.compose.foundation.layout.q.m mVarY17 = qVar17.y();
        androidx.compose.ui.e.a aVar1111116 = androidx.compose.ui.e.f37317a;
        str7 = str5;
        androidx.compose.ui.layout.a1 a1VarB1113 = androidx.compose.foundation.layout.j0.b(mVarY17, aVar1111116.u(), c0VarR, 0);
        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK111110 = c0VarR.k();
        androidx.compose.ui.a0 a0VarN111110 = androidx.compose.ui.m.n(c0VarR, aVar);
        androidx.compose.ui.node.g.a aVar1111117 = androidx.compose.ui.node.g.I;
        str8 = str6;
        function0A = aVar1111117.a();
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
        function5 = function2;
        y7.n(c0VarD, a1VarB1113, aVar1111117.e());
        y7.n(c0VarD, b1VarK111110, aVar1111117.g());
        function2B = aVar1111117.b();
        if (c0VarD.P()) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        } else {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN111110, aVar1111117.f());
        androidx.compose.foundation.layout.n0 n0Var17 = androidx.compose.foundation.layout.n0.f16227a;
        long j1115 = jM704getHeader0d7_KjU;
        float f116 = 4;
        androidx.compose.ui.a0 a0VarV17 = d5.v(i6.i(u7.i(androidx.compose.foundation.v.d(i6.h(a0Var3, 0.0f, 1, null), j1115, null, 2, null)), androidx.compose.ui.unit.h.r(56)), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f116), 0.0f, 11, null);
        c0VarR.E(369281761);
        if ((i32 & com.planner5d.library.engine.input.f.b.B) == 32) {
            z12 = true;
        } else {
            z12 = false;
        }
        objI0 = c0VarR.i0();
        if (z12) {
            objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                }
            };
            c0VarR.Y(objI0);
        } else {
            objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.o3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(function4);
                }
            };
            c0VarR.Y(objI0);
        }
        c0VarR.A();
        androidx.compose.ui.a0 a0VarJ17 = androidx.compose.foundation.i1.j(a0VarV17, false, null, null, null, (Function0) objI0, 15, null);
        androidx.compose.ui.layout.a1 a1VarE18 = u5.e(qVar17.w(), aVar1111116.q(), c0VarR, 48);
        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK111111 = c0VarR.k();
        androidx.compose.ui.a0 a0VarN111111 = androidx.compose.ui.m.n(c0VarR, a0VarJ17);
        function0A2 = aVar1111117.a();
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
        y7.n(c0VarD2, a1VarE18, aVar1111117.e());
        y7.n(c0VarD2, b1VarK111111, aVar1111117.g());
        function2B2 = aVar1111117.b();
        if (c0VarD2.P()) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        } else {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN111111, aVar1111117.f());
        y5Var = y5.f16577a;
        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f116)), c0VarR, 6);
        c0VarR.E(-1851697424);
        if (function5 != null) {
            function6 = function5;
        } else {
            function6 = function5;
        }
        c0VarR.A();
        if (function6 != null) {
            fR = androidx.compose.ui.unit.h.r(8);
        } else {
            fR = androidx.compose.ui.unit.h.r(16);
        }
        long j217 = j13;
        if (list2.size() == 1) {
            c0VarR.E(-1567458464);
            l6.a(i6.B(aVar, fR), c0VarR, 0);
            boolean z1111 = z11;
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z1111, 0L, null, c0VarR, ((i33 >> 12) & 7168) | 70, 52);
            z13 = z1111;
            c0VarR.A();
        } else {
            z13 = z11;
            if (list2.size() > 1) {
                c0VarR.E(-1567156741);
                l6.a(i6.B(aVar, fR), c0VarR, 0);
                AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
                c0VarR.A();
            } else {
                c0VarR.E(-1566946282);
                c0VarR.A();
            }
        }
        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
        androidx.compose.ui.a0 a0VarQ17 = x5.q(y5Var, aVar, 1.0f, false, 2, null);
        androidx.compose.ui.layout.a1 a1VarB1114 = androidx.compose.foundation.layout.j0.b(qVar17.y(), aVar1111116.u(), c0VarR, 48);
        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK111112 = c0VarR.k();
        androidx.compose.ui.a0 a0VarN111112 = androidx.compose.ui.m.n(c0VarR, a0VarQ17);
        function0A3 = aVar1111117.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A3);
        } else {
            c0VarR.l();
        }
        c0VarD3 = y7.d(c0VarR);
        y7.n(c0VarD3, a1VarB1114, aVar1111117.e());
        y7.n(c0VarD3, b1VarK111112, aVar1111117.g());
        function2B3 = aVar1111117.b();
        if (c0VarD3.P()) {
            c0VarD3.Y(Integer.valueOf(iHashCode3));
            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
        } else {
            c0VarD3.Y(Integer.valueOf(iHashCode3));
            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
        }
        y7.n(c0VarD3, a0VarN111112, aVar1111117.f());
        IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
        int i419 = IntercomTheme.$stable;
        y3 y3VarM17 = y3.m(intercomTheme17.getTypography(c0VarR, i419).getType03(), j217, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        androidx.compose.ui.text.style.j.a aVar1111118 = androidx.compose.ui.text.style.j.f42206b;
        int iF17 = aVar1111118.f();
        androidx.compose.ui.text.style.v.a aVar1111119 = androidx.compose.ui.text.style.v.f42256b;
        Function0<Unit> function115 = function4;
        nVar4 = nVar3;
        Integer num113 = numValueOf;
        androidx.compose.ui.a0 a0Var111 = a0Var3;
        q50.t(str8, null, j217, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iF17), 0L, aVar1111119.c(), false, 1, 0, null, y3VarM17, c0VarR, ((i33 >> 3) & 14) | ((i33 >> 21) & 896), 24960, 109562);
        c0VarR.E(1212142532);
        if (str7 != null) {
            c0Var2 = c0VarR;
            j15 = j14;
            i34 = 6;
            i35 = 0;
            str9 = str7;
        } else {
            c0Var2 = c0VarR;
            j15 = j14;
            i34 = 6;
            i35 = 0;
            str9 = str7;
        }
        c0Var2.A();
        c0Var2.o();
        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, i34);
        c0Var2.E(-1851613512);
        if (nVar4 == null) {
            nVar5 = nVar4;
        } else {
            nVar5 = nVar4;
            nVar5.invoke(y5Var, c0Var2, Integer.valueOf(i34 | ((i32 >> 3) & com.planner5d.library.engine.input.f.b.B)));
            Unit unit1115 = Unit.f312394a;
        }
        c0Var2.A();
        c0Var2.o();
        c0Var2.E(369372238);
        if (!StringsKt.w3(str8)) {
            IntercomDividerKt.IntercomDivider(null, c0Var2, i35, 1);
        }
        c0Var2.A();
        c0Var2.o();
        nVar6 = nVar5;
        c0Var3 = c0Var2;
        str10 = str9;
        j16 = j15;
        num5 = num4;
        list3 = list2;
        a0Var4 = a0Var111;
        j17 = j217;
        function7 = function115;
        str11 = str8;
        j18 = j1115;
        function8 = function6;
        z14 = z13;
        num6 = num113;
        s5VarT = c0Var3.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(a0Var4, str11, str10, num5, list3, function8, num6, z14, j18, j17, j16, function7, nVar6, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TopActionBarAvatarPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-876643721);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m161getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.s3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopActionBarKt.TopActionBarAvatarPreview$lambda$11(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarAvatarPreview$lambda$11(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TopActionBarAvatarPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TopActionBarBackButtonPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1611748073);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 5 << 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m165getLambda5$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.l3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopActionBarKt.TopActionBarBackButtonPreview$lambda$15(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarBackButtonPreview$lambda$15(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TopActionBarBackButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TopActionBarEndContentPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1992822204);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 3 & 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m169getLambda9$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.i3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopActionBarKt.TopActionBarEndContentPreview$lambda$17(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarEndContentPreview$lambda$17(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TopActionBarEndContentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TopActionBarGroupChatPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(86306281);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 0 << 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m162getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.r3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopActionBarKt.TopActionBarGroupChatPreview$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarGroupChatPreview$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TopActionBarGroupChatPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TopActionBarMultipleAvatarsPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1436789380);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m164getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.j3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopActionBarKt.TopActionBarMultipleAvatarsPreview$lambda$14(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarMultipleAvatarsPreview$lambda$14(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TopActionBarMultipleAvatarsPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TopActionBarTeamReplyTimePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(500144364);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m163getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.q3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopActionBarKt.TopActionBarTeamReplyTimePreview$lambda$13(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarTeamReplyTimePreview$lambda$13(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TopActionBarTeamReplyTimePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TopActionBarTitlePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1648201034);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m166getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.k3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopActionBarKt.TopActionBarTitlePreview$lambda$16(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarTitlePreview$lambda$16(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TopActionBarTitlePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBar_NpQZenA$lambda$10(androidx.compose.ui.a0 a0Var, String str, String str2, Integer num, List list, Function0 function0, Integer num2, boolean z10, long j10, long j11, long j12, Function0 function1, pj.n nVar, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        m172TopActionBarNpQZenA(a0Var, str, str2, num, list, function0, num2, z10, j10, j11, j12, function1, nVar, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBar_NpQZenA$lambda$2$lambda$1(Window it, long j10) {
        Intrinsics.checkNotNullParameter(it, "$it");
        androidx.core.view.k2.a(it, it.getDecorView()).i(ColorExtensionsKt.m735isDarkColor8_81llA(j10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.f312394a;
    }
}
