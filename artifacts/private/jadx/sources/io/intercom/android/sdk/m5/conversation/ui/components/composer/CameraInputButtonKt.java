package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.io.File;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCameraInputButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraInputButton.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/CameraInputButtonKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,156:1\n75#2:157\n1282#3,6:158\n1282#3,6:164\n1282#3,6:170\n70#4:176\n67#4,9:177\n77#4:216\n80#5,6:186\n87#5,3:201\n90#5,2:210\n94#5:215\n391#6,9:192\n400#6,3:212\n4360#7,6:204\n85#8:217\n117#8,2:218\n85#8:220\n117#8,2:221\n*S KotlinDebug\n*F\n+ 1 CameraInputButton.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/CameraInputButtonKt\n*L\n46#1:157\n47#1:158,6\n78#1:164,6\n90#1:170,6\n114#1:176\n114#1:177,9\n114#1:216\n114#1:186,6\n114#1:201,3\n114#1:210,2\n114#1:215\n114#1:192,9\n114#1:212,3\n114#1:204,6\n47#1:217\n47#1:218,2\n78#1:220\n78#1:221,2\n*E\n"})
public final class CameraInputButtonKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraInputType.values().length];
            try {
                iArr[CameraInputType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraInputType.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x020e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0275  */
    /* JADX WARN: Code duplicated, block: B:113:0x0281  */
    /* JADX WARN: Code duplicated, block: B:114:0x0285  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x013f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0146  */
    /* JADX WARN: Code duplicated, block: B:91:0x014c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171  */
    /* JADX WARN: Code duplicated, block: B:97:0x018d  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cd  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CameraInputButton(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final CameraInputType cameraInputType, @NotNull final Function1<? super Uri, Unit> onResult, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> content, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        Function0<Unit> function2;
        int i13;
        Function0<Unit> function3;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.a0 a0Var3;
        final Function0<Unit> function4;
        final Context context;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        int i17;
        final String str;
        Object objI1;
        final n3 n3Var;
        int i18;
        ?? r10;
        androidx.compose.runtime.c0 c0Var2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        final Function0<Unit> function5;
        final androidx.compose.ui.a0 a0Var4;
        boolean z10;
        Object objI2;
        final Function0<Unit> function6;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(cameraInputType, "cameraInputType");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2022676727);
        int i19 = i11 & 1;
        if (i19 != 0) {
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
            i12 |= c0VarR.D(cameraInputType) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.k0(onResult) ? 256 : 128;
        }
        int i20 = i11 & 8;
        if (i20 == 0) {
            if ((i10 & 7168) == 0) {
                function2 = function0;
                i12 |= c0VarR.k0(function2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
                    function3 = function1;
                    if (c0VarR.k0(function3)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c0VarR.k0(content)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                    }
                    i16 = i12;
                    if ((i16 & 374491) == 74898 || !c0VarR.d()) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i20 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        }
                        if (i13 != 0) {
                            function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function4 = function3;
                        }
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        c0VarR.E(-845514337);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = d7.g("", null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        final n3 n3Var2 = (n3) objI0;
                        c0VarR.A();
                        i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                        if (i17 == 1) {
                            str = "videos";
                        } else {
                            if (i17 != 2) {
                                throw new kotlin.k0();
                            }
                            str = io.sentry.protocol.d.b.f306176b;
                        }
                        final String str2 = str;
                        final androidx.activity.compose.k kVarA = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var2, (ActivityResult) obj);
                            }
                        }, c0VarR, 8);
                        c0VarR.E(-845473406);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (n3) objI1;
                        c0VarR.A();
                        c0VarR.E(-845471236);
                        if (CameraInputButton$lambda$7(n3Var)) {
                            String string = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                            String strD = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                            String strD2 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_camera);
                            c0VarR.E(-845454121);
                            if ((i16 & 57344) == 16384) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z10 || objI2 == aVar.a()) {
                                objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            r10 = 0;
                            i18 = 8;
                            PermissionDeniedDialogKt.PermissionDeniedDialog(null, string, strD, strD2, numValueOf, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                                }
                            }, c0VarR, 0, 1);
                            c0Var2 = c0VarR;
                        } else {
                            i18 = 8;
                            r10 = 0;
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        function3 = function4;
                        final androidx.activity.compose.k kVarA2 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str2, kVarA, n3Var2, n3Var, ((Boolean) obj).booleanValue());
                            }
                        }, c0Var2, i18);
                        final Function0<Unit> function7 = function2;
                        androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$13(function7, context, kVarA2, cameraInputType, str2, kVarA, n3Var2);
                            }
                        }, 15, null);
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                        androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarJ);
                        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                        function0A = aVar2.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD = y7.d(c0Var2);
                        y7.n(c0VarD, a1VarK, aVar2.e());
                        y7.n(c0VarD, b1VarK, aVar2.g());
                        function2B = aVar2.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar2.f());
                        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                        c0Var2.o();
                        function5 = function7;
                        a0Var4 = a0Var3;
                    } else {
                        c0VarR.u();
                        c0Var2 = c0VarR;
                        a0Var4 = a0Var2;
                        function5 = function2;
                    }
                    function6 = function3;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CameraInputButtonKt.CameraInputButton$lambda$15(a0Var4, cameraInputType, onResult, function5, function6, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 = androidx.profileinstaller.n.c.f73814m;
                i12 |= i15;
                i16 = i12;
                if ((i16 & 374491) == 74898) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function3;
                    }
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    c0VarR.E(-845514337);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g("", null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    final n3 n3Var3 = (n3) objI0;
                    c0VarR.A();
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new kotlin.k0();
                        }
                        str = io.sentry.protocol.d.b.f306176b;
                    }
                    final String str3 = str;
                    final androidx.activity.compose.k kVarA3 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var3, (ActivityResult) obj);
                        }
                    }, c0VarR, 8);
                    c0VarR.E(-845473406);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (n3) objI1;
                    c0VarR.A();
                    c0VarR.E(-845471236);
                    if (CameraInputButton$lambda$7(n3Var)) {
                        String string2 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strD3 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                        String strD4 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                        Integer numValueOf2 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        c0VarR.E(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z10) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        r10 = 0;
                        i18 = 8;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string2, strD3, strD4, numValueOf2, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                            }
                        }, c0VarR, 0, 1);
                        c0Var2 = c0VarR;
                    } else {
                        i18 = 8;
                        r10 = 0;
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    function3 = function4;
                    final androidx.activity.compose.k kVarA4 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str3, kVarA3, n3Var3, n3Var, ((Boolean) obj).booleanValue());
                        }
                    }, c0Var2, i18);
                    final Function0 function8 = function2;
                    androidx.compose.ui.a0 a0VarJ2 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(function8, context, kVarA4, cameraInputType, str3, kVarA3, n3Var3);
                        }
                    }, 15, null);
                    androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarJ2);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    function0A = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarK2, aVar3.e());
                    y7.n(c0VarD, b1VarK2, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN2, aVar3.f());
                    androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                    c0Var2.o();
                    function5 = function8;
                    a0Var4 = a0Var3;
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function3;
                    }
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    c0VarR.E(-845514337);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g("", null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    final n3 n3Var4 = (n3) objI0;
                    c0VarR.A();
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new kotlin.k0();
                        }
                        str = io.sentry.protocol.d.b.f306176b;
                    }
                    final String str4 = str;
                    final androidx.activity.compose.k kVarA5 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var4, (ActivityResult) obj);
                        }
                    }, c0VarR, 8);
                    c0VarR.E(-845473406);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (n3) objI1;
                    c0VarR.A();
                    c0VarR.E(-845471236);
                    if (CameraInputButton$lambda$7(n3Var)) {
                        String string3 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strD5 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                        String strD6 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                        Integer numValueOf3 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        c0VarR.E(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z10) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        r10 = 0;
                        i18 = 8;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string3, strD5, strD6, numValueOf3, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                            }
                        }, c0VarR, 0, 1);
                        c0Var2 = c0VarR;
                    } else {
                        i18 = 8;
                        r10 = 0;
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    function3 = function4;
                    final androidx.activity.compose.k kVarA6 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str4, kVarA5, n3Var4, n3Var, ((Boolean) obj).booleanValue());
                        }
                    }, c0Var2, i18);
                    final Function0 function9 = function2;
                    androidx.compose.ui.a0 a0VarJ3 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(function9, context, kVarA6, cameraInputType, str4, kVarA5, n3Var4);
                        }
                    }, 15, null);
                    androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    androidx.compose.runtime.b1 b1VarK3 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var2, a0VarJ3);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    function0A = aVar4.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarK3, aVar4.e());
                    y7.n(c0VarD, b1VarK3, aVar4.g());
                    function2B = aVar4.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN3, aVar4.f());
                    androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                    c0Var2.o();
                    function5 = function9;
                    a0Var4 = a0Var3;
                }
                function6 = function3;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CameraInputButtonKt.CameraInputButton$lambda$15(a0Var4, cameraInputType, onResult, function5, function6, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function3 = function1;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.k0(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                i16 = i12;
                if ((i16 & 374491) == 74898) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function3;
                    }
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    c0VarR.E(-845514337);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g("", null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    final n3 n3Var5 = (n3) objI0;
                    c0VarR.A();
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new kotlin.k0();
                        }
                        str = io.sentry.protocol.d.b.f306176b;
                    }
                    final String str5 = str;
                    final androidx.activity.compose.k kVarA7 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var5, (ActivityResult) obj);
                        }
                    }, c0VarR, 8);
                    c0VarR.E(-845473406);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (n3) objI1;
                    c0VarR.A();
                    c0VarR.E(-845471236);
                    if (CameraInputButton$lambda$7(n3Var)) {
                        String string4 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strD7 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                        String strD8 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                        Integer numValueOf4 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        c0VarR.E(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z10) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        r10 = 0;
                        i18 = 8;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string4, strD7, strD8, numValueOf4, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                            }
                        }, c0VarR, 0, 1);
                        c0Var2 = c0VarR;
                    } else {
                        i18 = 8;
                        r10 = 0;
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    function3 = function4;
                    final androidx.activity.compose.k kVarA8 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str5, kVarA7, n3Var5, n3Var, ((Boolean) obj).booleanValue());
                        }
                    }, c0Var2, i18);
                    final Function0 function10 = function2;
                    androidx.compose.ui.a0 a0VarJ4 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(function10, context, kVarA8, cameraInputType, str5, kVarA7, n3Var5);
                        }
                    }, 15, null);
                    androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    androidx.compose.runtime.b1 b1VarK4 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var2, a0VarJ4);
                    androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                    function0A = aVar5.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarK4, aVar5.e());
                    y7.n(c0VarD, b1VarK4, aVar5.g());
                    function2B = aVar5.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN4, aVar5.f());
                    androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                    c0Var2.o();
                    function5 = function10;
                    a0Var4 = a0Var3;
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function3;
                    }
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    c0VarR.E(-845514337);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g("", null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    final n3 n3Var6 = (n3) objI0;
                    c0VarR.A();
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new kotlin.k0();
                        }
                        str = io.sentry.protocol.d.b.f306176b;
                    }
                    final String str6 = str;
                    final androidx.activity.compose.k kVarA9 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var6, (ActivityResult) obj);
                        }
                    }, c0VarR, 8);
                    c0VarR.E(-845473406);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (n3) objI1;
                    c0VarR.A();
                    c0VarR.E(-845471236);
                    if (CameraInputButton$lambda$7(n3Var)) {
                        String string5 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strD9 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                        String strD10 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                        Integer numValueOf5 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        c0VarR.E(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z10) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        r10 = 0;
                        i18 = 8;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string5, strD9, strD10, numValueOf5, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                            }
                        }, c0VarR, 0, 1);
                        c0Var2 = c0VarR;
                    } else {
                        i18 = 8;
                        r10 = 0;
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    function3 = function4;
                    final androidx.activity.compose.k kVarA10 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str6, kVarA9, n3Var6, n3Var, ((Boolean) obj).booleanValue());
                        }
                    }, c0Var2, i18);
                    final Function0 function11 = function2;
                    androidx.compose.ui.a0 a0VarJ5 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(function11, context, kVarA10, cameraInputType, str6, kVarA9, n3Var6);
                        }
                    }, 15, null);
                    androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    androidx.compose.runtime.b1 b1VarK5 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0Var2, a0VarJ5);
                    androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                    function0A = aVar6.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarK5, aVar6.e());
                    y7.n(c0VarD, b1VarK5, aVar6.g());
                    function2B = aVar6.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN5, aVar6.f());
                    androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                    c0Var2.o();
                    function5 = function11;
                    a0Var4 = a0Var3;
                }
                function6 = function3;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CameraInputButtonKt.CameraInputButton$lambda$15(a0Var4, cameraInputType, onResult, function5, function6, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i15;
            i16 = i12;
            if ((i16 & 374491) == 74898) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function3;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                c0VarR.E(-845514337);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g("", null, 2, null);
                    c0VarR.Y(objI0);
                }
                final n3 n3Var7 = (n3) objI0;
                c0VarR.A();
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new kotlin.k0();
                    }
                    str = io.sentry.protocol.d.b.f306176b;
                }
                final String str7 = str;
                final androidx.activity.compose.k kVarA11 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var7, (ActivityResult) obj);
                    }
                }, c0VarR, 8);
                c0VarR.E(-845473406);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (n3) objI1;
                c0VarR.A();
                c0VarR.E(-845471236);
                if (CameraInputButton$lambda$7(n3Var)) {
                    String string6 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strD11 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                    String strD12 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                    Integer numValueOf6 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    c0VarR.E(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z10) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    r10 = 0;
                    i18 = 8;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string6, strD11, strD12, numValueOf6, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                        }
                    }, c0VarR, 0, 1);
                    c0Var2 = c0VarR;
                } else {
                    i18 = 8;
                    r10 = 0;
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                function3 = function4;
                final androidx.activity.compose.k kVarA12 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str7, kVarA11, n3Var7, n3Var, ((Boolean) obj).booleanValue());
                    }
                }, c0Var2, i18);
                final Function0 function12 = function2;
                androidx.compose.ui.a0 a0VarJ6 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(function12, context, kVarA12, cameraInputType, str7, kVarA11, n3Var7);
                    }
                }, 15, null);
                androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                androidx.compose.runtime.b1 b1VarK6 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0Var2, a0VarJ6);
                androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                function0A = aVar7.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarK6, aVar7.e());
                y7.n(c0VarD, b1VarK6, aVar7.g());
                function2B = aVar7.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN6, aVar7.f());
                androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                c0Var2.o();
                function5 = function12;
                a0Var4 = a0Var3;
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function3;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                c0VarR.E(-845514337);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g("", null, 2, null);
                    c0VarR.Y(objI0);
                }
                final n3 n3Var8 = (n3) objI0;
                c0VarR.A();
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new kotlin.k0();
                    }
                    str = io.sentry.protocol.d.b.f306176b;
                }
                final String str8 = str;
                final androidx.activity.compose.k kVarA13 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var8, (ActivityResult) obj);
                    }
                }, c0VarR, 8);
                c0VarR.E(-845473406);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (n3) objI1;
                c0VarR.A();
                c0VarR.E(-845471236);
                if (CameraInputButton$lambda$7(n3Var)) {
                    String string7 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strD13 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                    String strD14 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                    Integer numValueOf7 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    c0VarR.E(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z10) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    r10 = 0;
                    i18 = 8;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string7, strD13, strD14, numValueOf7, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                        }
                    }, c0VarR, 0, 1);
                    c0Var2 = c0VarR;
                } else {
                    i18 = 8;
                    r10 = 0;
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                function3 = function4;
                final androidx.activity.compose.k kVarA14 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str8, kVarA13, n3Var8, n3Var, ((Boolean) obj).booleanValue());
                    }
                }, c0Var2, i18);
                final Function0 function13 = function2;
                androidx.compose.ui.a0 a0VarJ7 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(function13, context, kVarA14, cameraInputType, str8, kVarA13, n3Var8);
                    }
                }, 15, null);
                androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                androidx.compose.runtime.b1 b1VarK7 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0Var2, a0VarJ7);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                function0A = aVar8.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarK7, aVar8.e());
                y7.n(c0VarD, b1VarK7, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN7, aVar8.f());
                androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                c0Var2.o();
                function5 = function13;
                a0Var4 = a0Var3;
            }
            function6 = function3;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CameraInputButtonKt.CameraInputButton$lambda$15(a0Var4, cameraInputType, onResult, function5, function6, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function2 = function0;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
                function3 = function1;
                if (c0VarR.k0(function3)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.k0(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                i16 = i12;
                if ((i16 & 374491) == 74898) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function3;
                    }
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    c0VarR.E(-845514337);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g("", null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    final n3 n3Var9 = (n3) objI0;
                    c0VarR.A();
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new kotlin.k0();
                        }
                        str = io.sentry.protocol.d.b.f306176b;
                    }
                    final String str9 = str;
                    final androidx.activity.compose.k kVarA15 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var9, (ActivityResult) obj);
                        }
                    }, c0VarR, 8);
                    c0VarR.E(-845473406);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (n3) objI1;
                    c0VarR.A();
                    c0VarR.E(-845471236);
                    if (CameraInputButton$lambda$7(n3Var)) {
                        String string8 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strD15 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                        String strD16 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                        Integer numValueOf8 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        c0VarR.E(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z10) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        r10 = 0;
                        i18 = 8;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string8, strD15, strD16, numValueOf8, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                            }
                        }, c0VarR, 0, 1);
                        c0Var2 = c0VarR;
                    } else {
                        i18 = 8;
                        r10 = 0;
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    function3 = function4;
                    final androidx.activity.compose.k kVarA16 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str9, kVarA15, n3Var9, n3Var, ((Boolean) obj).booleanValue());
                        }
                    }, c0Var2, i18);
                    final Function0 function14 = function2;
                    androidx.compose.ui.a0 a0VarJ8 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(function14, context, kVarA16, cameraInputType, str9, kVarA15, n3Var9);
                        }
                    }, 15, null);
                    androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    androidx.compose.runtime.b1 b1VarK8 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0Var2, a0VarJ8);
                    androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                    function0A = aVar9.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarK8, aVar9.e());
                    y7.n(c0VarD, b1VarK8, aVar9.g());
                    function2B = aVar9.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN8, aVar9.f());
                    androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                    c0Var2.o();
                    function5 = function14;
                    a0Var4 = a0Var3;
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i20 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function3;
                    }
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    c0VarR.E(-845514337);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g("", null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    final n3 n3Var10 = (n3) objI0;
                    c0VarR.A();
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new kotlin.k0();
                        }
                        str = io.sentry.protocol.d.b.f306176b;
                    }
                    final String str10 = str;
                    final androidx.activity.compose.k kVarA17 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var10, (ActivityResult) obj);
                        }
                    }, c0VarR, 8);
                    c0VarR.E(-845473406);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (n3) objI1;
                    c0VarR.A();
                    c0VarR.E(-845471236);
                    if (CameraInputButton$lambda$7(n3Var)) {
                        String string9 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strD17 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                        String strD18 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                        Integer numValueOf9 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        c0VarR.E(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z10) {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        r10 = 0;
                        i18 = 8;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string9, strD17, strD18, numValueOf9, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                            }
                        }, c0VarR, 0, 1);
                        c0Var2 = c0VarR;
                    } else {
                        i18 = 8;
                        r10 = 0;
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    function3 = function4;
                    final androidx.activity.compose.k kVarA18 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str10, kVarA17, n3Var10, n3Var, ((Boolean) obj).booleanValue());
                        }
                    }, c0Var2, i18);
                    final Function0 function15 = function2;
                    androidx.compose.ui.a0 a0VarJ9 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(function15, context, kVarA18, cameraInputType, str10, kVarA17, n3Var10);
                        }
                    }, 15, null);
                    androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    androidx.compose.runtime.b1 b1VarK9 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0Var2, a0VarJ9);
                    androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                    function0A = aVar10.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarK9, aVar10.e());
                    y7.n(c0VarD, b1VarK9, aVar10.g());
                    function2B = aVar10.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN9, aVar10.f());
                    androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                    c0Var2.o();
                    function5 = function15;
                    a0Var4 = a0Var3;
                }
                function6 = function3;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CameraInputButtonKt.CameraInputButton$lambda$15(a0Var4, cameraInputType, onResult, function5, function6, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i15;
            i16 = i12;
            if ((i16 & 374491) == 74898) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function3;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                c0VarR.E(-845514337);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g("", null, 2, null);
                    c0VarR.Y(objI0);
                }
                final n3 n3Var11 = (n3) objI0;
                c0VarR.A();
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new kotlin.k0();
                    }
                    str = io.sentry.protocol.d.b.f306176b;
                }
                final String str11 = str;
                final androidx.activity.compose.k kVarA19 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var11, (ActivityResult) obj);
                    }
                }, c0VarR, 8);
                c0VarR.E(-845473406);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (n3) objI1;
                c0VarR.A();
                c0VarR.E(-845471236);
                if (CameraInputButton$lambda$7(n3Var)) {
                    String string10 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strD19 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                    String strD110 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                    Integer numValueOf10 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    c0VarR.E(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z10) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    r10 = 0;
                    i18 = 8;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string10, strD19, strD110, numValueOf10, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                        }
                    }, c0VarR, 0, 1);
                    c0Var2 = c0VarR;
                } else {
                    i18 = 8;
                    r10 = 0;
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                function3 = function4;
                final androidx.activity.compose.k kVarA110 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str11, kVarA19, n3Var11, n3Var, ((Boolean) obj).booleanValue());
                    }
                }, c0Var2, i18);
                final Function0 function16 = function2;
                androidx.compose.ui.a0 a0VarJ10 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(function16, context, kVarA110, cameraInputType, str11, kVarA19, n3Var11);
                    }
                }, 15, null);
                androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                androidx.compose.runtime.b1 b1VarK10 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0Var2, a0VarJ10);
                androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                function0A = aVar11.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarK10, aVar11.e());
                y7.n(c0VarD, b1VarK10, aVar11.g());
                function2B = aVar11.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN10, aVar11.f());
                androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                c0Var2.o();
                function5 = function16;
                a0Var4 = a0Var3;
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function3;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                c0VarR.E(-845514337);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g("", null, 2, null);
                    c0VarR.Y(objI0);
                }
                final n3 n3Var12 = (n3) objI0;
                c0VarR.A();
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new kotlin.k0();
                    }
                    str = io.sentry.protocol.d.b.f306176b;
                }
                final String str12 = str;
                final androidx.activity.compose.k kVarA111 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var12, (ActivityResult) obj);
                    }
                }, c0VarR, 8);
                c0VarR.E(-845473406);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (n3) objI1;
                c0VarR.A();
                c0VarR.E(-845471236);
                if (CameraInputButton$lambda$7(n3Var)) {
                    String string11 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strD111 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                    String strD112 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                    Integer numValueOf11 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    c0VarR.E(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z10) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    r10 = 0;
                    i18 = 8;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string11, strD111, strD112, numValueOf11, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                        }
                    }, c0VarR, 0, 1);
                    c0Var2 = c0VarR;
                } else {
                    i18 = 8;
                    r10 = 0;
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                function3 = function4;
                final androidx.activity.compose.k kVarA112 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str12, kVarA111, n3Var12, n3Var, ((Boolean) obj).booleanValue());
                    }
                }, c0Var2, i18);
                final Function0 function17 = function2;
                androidx.compose.ui.a0 a0VarJ11 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(function17, context, kVarA112, cameraInputType, str12, kVarA111, n3Var12);
                    }
                }, 15, null);
                androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                androidx.compose.runtime.b1 b1VarK11 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0Var2, a0VarJ11);
                androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                function0A = aVar12.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarK11, aVar12.e());
                y7.n(c0VarD, b1VarK11, aVar12.g());
                function2B = aVar12.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11, aVar12.f());
                androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                c0Var2.o();
                function5 = function17;
                a0Var4 = a0Var3;
            }
            function6 = function3;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CameraInputButtonKt.CameraInputButton$lambda$15(a0Var4, cameraInputType, onResult, function5, function6, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function3 = function1;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c0VarR.k0(content)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            i16 = i12;
            if ((i16 & 374491) == 74898) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function3;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                c0VarR.E(-845514337);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g("", null, 2, null);
                    c0VarR.Y(objI0);
                }
                final n3 n3Var13 = (n3) objI0;
                c0VarR.A();
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new kotlin.k0();
                    }
                    str = io.sentry.protocol.d.b.f306176b;
                }
                final String str13 = str;
                final androidx.activity.compose.k kVarA113 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var13, (ActivityResult) obj);
                    }
                }, c0VarR, 8);
                c0VarR.E(-845473406);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (n3) objI1;
                c0VarR.A();
                c0VarR.E(-845471236);
                if (CameraInputButton$lambda$7(n3Var)) {
                    String string12 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strD113 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                    String strD114 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                    Integer numValueOf12 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    c0VarR.E(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z10) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    r10 = 0;
                    i18 = 8;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string12, strD113, strD114, numValueOf12, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                        }
                    }, c0VarR, 0, 1);
                    c0Var2 = c0VarR;
                } else {
                    i18 = 8;
                    r10 = 0;
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                function3 = function4;
                final androidx.activity.compose.k kVarA114 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str13, kVarA113, n3Var13, n3Var, ((Boolean) obj).booleanValue());
                    }
                }, c0Var2, i18);
                final Function0 function18 = function2;
                androidx.compose.ui.a0 a0VarJ12 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(function18, context, kVarA114, cameraInputType, str13, kVarA113, n3Var13);
                    }
                }, 15, null);
                androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                androidx.compose.runtime.b1 b1VarK12 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0Var2, a0VarJ12);
                androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                function0A = aVar13.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarK12, aVar13.e());
                y7.n(c0VarD, b1VarK12, aVar13.g());
                function2B = aVar13.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN12, aVar13.f());
                androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                c0Var2.o();
                function5 = function18;
                a0Var4 = a0Var3;
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i20 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function3;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                c0VarR.E(-845514337);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g("", null, 2, null);
                    c0VarR.Y(objI0);
                }
                final n3 n3Var14 = (n3) objI0;
                c0VarR.A();
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new kotlin.k0();
                    }
                    str = io.sentry.protocol.d.b.f306176b;
                }
                final String str14 = str;
                final androidx.activity.compose.k kVarA115 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var14, (ActivityResult) obj);
                    }
                }, c0VarR, 8);
                c0VarR.E(-845473406);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (n3) objI1;
                c0VarR.A();
                c0VarR.E(-845471236);
                if (CameraInputButton$lambda$7(n3Var)) {
                    String string13 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strD115 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                    String strD116 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                    Integer numValueOf13 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    c0VarR.E(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z10) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    r10 = 0;
                    i18 = 8;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string13, strD115, strD116, numValueOf13, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                        }
                    }, c0VarR, 0, 1);
                    c0Var2 = c0VarR;
                } else {
                    i18 = 8;
                    r10 = 0;
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                function3 = function4;
                final androidx.activity.compose.k kVarA116 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str14, kVarA115, n3Var14, n3Var, ((Boolean) obj).booleanValue());
                    }
                }, c0Var2, i18);
                final Function0 function19 = function2;
                androidx.compose.ui.a0 a0VarJ13 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(function19, context, kVarA116, cameraInputType, str14, kVarA115, n3Var14);
                    }
                }, 15, null);
                androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                androidx.compose.runtime.b1 b1VarK13 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0Var2, a0VarJ13);
                androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                function0A = aVar14.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarK13, aVar14.e());
                y7.n(c0VarD, b1VarK13, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN13, aVar14.f());
                androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
                c0Var2.o();
                function5 = function19;
                a0Var4 = a0Var3;
            }
            function6 = function3;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CameraInputButtonKt.CameraInputButton$lambda$15(a0Var4, cameraInputType, onResult, function5, function6, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 = androidx.profileinstaller.n.c.f73814m;
        i12 |= i15;
        i16 = i12;
        if ((i16 & 374491) == 74898) {
            if (i19 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i20 != 0) {
                function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            }
            if (i13 != 0) {
                function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function4 = function3;
            }
            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            c0VarR.E(-845514337);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g("", null, 2, null);
                c0VarR.Y(objI0);
            }
            final n3 n3Var15 = (n3) objI0;
            c0VarR.A();
            i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
            if (i17 == 1) {
                str = "videos";
            } else {
                if (i17 != 2) {
                    throw new kotlin.k0();
                }
                str = io.sentry.protocol.d.b.f306176b;
            }
            final String str15 = str;
            final androidx.activity.compose.k kVarA117 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var15, (ActivityResult) obj);
                }
            }, c0VarR, 8);
            c0VarR.E(-845473406);
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI1);
            }
            n3Var = (n3) objI1;
            c0VarR.A();
            c0VarR.E(-845471236);
            if (CameraInputButton$lambda$7(n3Var)) {
                String string14 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                String strD117 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                String strD118 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                Integer numValueOf14 = Integer.valueOf(R.drawable.intercom_ic_camera);
                c0VarR.E(-845454121);
                if ((i16 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI2 = c0VarR.i0();
                if (z10) {
                    objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                r10 = 0;
                i18 = 8;
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, string14, strD117, strD118, numValueOf14, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                    }
                }, c0VarR, 0, 1);
                c0Var2 = c0VarR;
            } else {
                i18 = 8;
                r10 = 0;
                c0Var2 = c0VarR;
            }
            c0Var2.A();
            function3 = function4;
            final androidx.activity.compose.k kVarA118 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str15, kVarA117, n3Var15, n3Var, ((Boolean) obj).booleanValue());
                }
            }, c0Var2, i18);
            final Function0 function110 = function2;
            androidx.compose.ui.a0 a0VarJ14 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CameraInputButtonKt.CameraInputButton$lambda$13(function110, context, kVarA118, cameraInputType, str15, kVarA117, n3Var15);
                }
            }, 15, null);
            androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
            androidx.compose.runtime.b1 b1VarK14 = c0Var2.k();
            androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0Var2, a0VarJ14);
            androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
            function0A = aVar15.a();
            if (c0Var2.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var2.q();
            if (c0Var2.P()) {
                c0Var2.q0(function0A);
            } else {
                c0Var2.l();
            }
            c0VarD = y7.d(c0Var2);
            y7.n(c0VarD, a1VarK14, aVar15.e());
            y7.n(c0VarD, b1VarK14, aVar15.g());
            function2B = aVar15.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN14, aVar15.f());
            androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
            content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
            c0Var2.o();
            function5 = function110;
            a0Var4 = a0Var3;
        } else {
            if (i19 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i20 != 0) {
                function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            }
            if (i13 != 0) {
                function4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function4 = function3;
            }
            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            c0VarR.E(-845514337);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g("", null, 2, null);
                c0VarR.Y(objI0);
            }
            final n3 n3Var16 = (n3) objI0;
            c0VarR.A();
            i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
            if (i17 == 1) {
                str = "videos";
            } else {
                if (i17 != 2) {
                    throw new kotlin.k0();
                }
                str = io.sentry.protocol.d.b.f306176b;
            }
            final String str16 = str;
            final androidx.activity.compose.k kVarA119 = androidx.activity.compose.d.a(new g.b.m(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraInputButtonKt.CameraInputButton$lambda$5(onResult, context, str, n3Var16, (ActivityResult) obj);
                }
            }, c0VarR, 8);
            c0VarR.E(-845473406);
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI1);
            }
            n3Var = (n3) objI1;
            c0VarR.A();
            c0VarR.E(-845471236);
            if (CameraInputButton$lambda$7(n3Var)) {
                String string15 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                String strD119 = u0.i.d(R.string.intercom_settings, c0VarR, 0);
                String strD1110 = u0.i.d(R.string.intercom_not_now, c0VarR, 0);
                Integer numValueOf15 = Integer.valueOf(R.drawable.intercom_ic_camera);
                c0VarR.E(-845454121);
                if ((i16 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI2 = c0VarR.i0();
                if (z10) {
                    objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(function4, n3Var);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                r10 = 0;
                i18 = 8;
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, string15, strD119, strD1110, numValueOf15, (Function0) objI2, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$11(context, n3Var);
                    }
                }, c0VarR, 0, 1);
                c0Var2 = c0VarR;
            } else {
                i18 = 8;
                r10 = 0;
                c0Var2 = c0VarR;
            }
            c0Var2.A();
            function3 = function4;
            final androidx.activity.compose.k kVarA1110 = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str16, kVarA119, n3Var16, n3Var, ((Boolean) obj).booleanValue());
                }
            }, c0Var2, i18);
            final Function0 function111 = function2;
            androidx.compose.ui.a0 a0VarJ15 = androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CameraInputButtonKt.CameraInputButton$lambda$13(function111, context, kVarA1110, cameraInputType, str16, kVarA119, n3Var16);
                }
            }, 15, null);
            androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), r10);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
            androidx.compose.runtime.b1 b1VarK15 = c0Var2.k();
            androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0Var2, a0VarJ15);
            androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
            function0A = aVar16.a();
            if (c0Var2.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var2.q();
            if (c0Var2.P()) {
                c0Var2.q0(function0A);
            } else {
                c0Var2.l();
            }
            c0VarD = y7.d(c0Var2);
            y7.n(c0VarD, a1VarK15, aVar16.e());
            y7.n(c0VarD, b1VarK15, aVar16.g());
            function2B = aVar16.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN15, aVar16.f());
            androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
            content.invoke(c0Var2, Integer.valueOf((i16 >> 15) & 14));
            c0Var2.o();
            function5 = function111;
            a0Var4 = a0Var3;
        }
        function6 = function3;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CameraInputButtonKt.CameraInputButton$lambda$15(a0Var4, cameraInputType, onResult, function5, function6, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$10$lambda$9(Function0 function0, n3 showDialog$delegate) {
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        CameraInputButton$lambda$8(showDialog$delegate, false);
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$11(Context context, n3 showDialog$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        CameraInputButton$lambda$8(showDialog$delegate, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(io.sentry.protocol.z.b.f306542i, context.getPackageName(), null)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$12(CameraInputType cameraInputType, Context context, String folderName, androidx.activity.compose.k cameraLauncher, n3 latestFileName$delegate, n3 showDialog$delegate, boolean z10) {
        Intrinsics.checkNotNullParameter(cameraInputType, "$cameraInputType");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(folderName, "$folderName");
        Intrinsics.checkNotNullParameter(cameraLauncher, "$cameraLauncher");
        Intrinsics.checkNotNullParameter(latestFileName$delegate, "$latestFileName$delegate");
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        if (z10) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, folderName, cameraLauncher, latestFileName$delegate);
        } else {
            CameraInputButton$lambda$8(showDialog$delegate, true);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$13(Function0 function0, Context context, androidx.activity.compose.k permissionLauncher, CameraInputType cameraInputType, String folderName, androidx.activity.compose.k cameraLauncher, n3 latestFileName$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(permissionLauncher, "$permissionLauncher");
        Intrinsics.checkNotNullParameter(cameraInputType, "$cameraInputType");
        Intrinsics.checkNotNullParameter(folderName, "$folderName");
        Intrinsics.checkNotNullParameter(cameraLauncher, "$cameraLauncher");
        Intrinsics.checkNotNullParameter(latestFileName$delegate, "$latestFileName$delegate");
        function0.invoke();
        if (!hasCameraPermissionInManifest(context) || androidx.core.content.d.a(context, "android.permission.CAMERA") == 0) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, folderName, cameraLauncher, latestFileName$delegate);
        } else {
            permissionLauncher.b("android.permission.CAMERA");
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$15(androidx.compose.ui.a0 a0Var, CameraInputType cameraInputType, Function1 onResult, Function0 function0, Function0 function1, Function2 content, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(cameraInputType, "$cameraInputType");
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(content, "$content");
        CameraInputButton(a0Var, cameraInputType, onResult, function0, function1, content, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final String CameraInputButton$lambda$3(n3<String> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$5(Function1 onResult, Context context, String folderName, n3 latestFileName$delegate, ActivityResult result) {
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(folderName, "$folderName");
        Intrinsics.checkNotNullParameter(latestFileName$delegate, "$latestFileName$delegate");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.b() == -1 && CameraInputButton$lambda$3(latestFileName$delegate).length() > 0) {
            onResult.invoke(getUriByFileName(context, CameraInputButton$lambda$3(latestFileName$delegate), folderName));
        }
        latestFileName$delegate.setValue("");
        return Unit.f312394a;
    }

    private static final boolean CameraInputButton$lambda$7(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    private static final void CameraInputButton$lambda$8(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    private static final void CameraInputButton$launchCameraIntent(CameraInputType cameraInputType, Context context, String str, androidx.activity.compose.k<Intent, ActivityResult> kVar, n3<String> n3Var) {
        String str2;
        Intent intent;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[cameraInputType.ordinal()];
        if (i10 == 1) {
            str2 = ".mp4";
        } else {
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            str2 = ".jpg";
        }
        String str3 = UUID.randomUUID() + str2;
        Uri uriByFileName = getUriByFileName(context, str3, str);
        n3Var.setValue(str3);
        int i11 = iArr[cameraInputType.ordinal()];
        if (i11 == 1) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else {
            if (i11 != 2) {
                throw new kotlin.k0();
            }
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        }
        Intent intentPutExtra = intent.putExtra("output", uriByFileName);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        kVar.b(intentPutExtra);
    }

    private static final Uri getUriByFileName(Context context, String str, String str2) {
        File file = new File(context.getExternalCacheDir(), str2);
        file.mkdir();
        Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), new File(file, str));
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    private static final boolean hasCameraPermissionInManifest(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                return ArraysKt.contains(strArr, "android.permission.CAMERA");
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
