package io.intercom.android.sdk.ui.component;

import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.t2;
import androidx.compose.foundation.w2;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.preview.ui.PreviewMediaContract;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nMediaPickerButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPickerButton.kt\nio/intercom/android/sdk/ui/component/MediaPickerButtonKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,236:1\n75#2:237\n607#3:238\n604#3,6:239\n1282#4,3:245\n1285#4,3:249\n1282#4,6:252\n1282#4,6:258\n605#5:248\n70#6:264\n67#6,9:265\n77#6:304\n80#7,6:274\n87#7,3:289\n90#7,2:298\n94#7:303\n391#8,9:280\n400#8,3:300\n4360#9,6:292\n*S KotlinDebug\n*F\n+ 1 MediaPickerButton.kt\nio/intercom/android/sdk/ui/component/MediaPickerButtonKt\n*L\n59#1:237\n67#1:238\n67#1:239,6\n67#1:245,3\n67#1:249,3\n70#1:252,6\n99#1:258,6\n67#1:248\n96#1:264\n96#1:265,9\n96#1:304\n96#1:274,6\n96#1:289,3\n96#1:298,2\n96#1:303\n96#1:280,9\n96#1:300,3\n96#1:292,6\n*E\n"})
public final class MediaPickerButtonKt {

    @NotNull
    private static final Set<String> defaultTrustedAudioExtensions;

    @NotNull
    private static final Set<String> defaultTrustedDocumentExtensions;

    @NotNull
    private static final Set<String> defaultTrustedFileExtensions;

    @NotNull
    private static final Set<String> defaultTrustedImageExtensions;

    @NotNull
    private static final Set<String> defaultTrustedVideoExtensions;

    static {
        Set<String> of2 = SetsKt.setOf((Object[]) new String[]{"gif", "jpeg", "jpg", "png", "heic", "dng"});
        defaultTrustedImageExtensions = of2;
        Set<String> of3 = SetsKt.setOf((Object[]) new String[]{io.sentry.rrweb.j.Y, "mov"});
        defaultTrustedVideoExtensions = of3;
        Set<String> of4 = SetsKt.setOf((Object[]) new String[]{"pdf", "txt"});
        defaultTrustedDocumentExtensions = of4;
        Set<String> of5 = SetsKt.setOf((Object[]) new String[]{"oga", "ogg"});
        defaultTrustedAudioExtensions = of5;
        defaultTrustedFileExtensions = SetsKt.plus(SetsKt.plus(SetsKt.plus((Set) of2, (Iterable) of3), (Iterable) of4), (Iterable) of5);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0166  */
    /* JADX WARN: Code duplicated, block: B:115:0x0182  */
    /* JADX WARN: Code duplicated, block: B:116:0x0184  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0191  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:127:0x0211  */
    /* JADX WARN: Code duplicated, block: B:130:0x021d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0221  */
    /* JADX WARN: Code duplicated, block: B:134:0x0242  */
    /* JADX WARN: Code duplicated, block: B:136:0x0250  */
    /* JADX WARN: Code duplicated, block: B:140:0x027f  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x012a A[PHI: r2 r3 r4 r7
      0x012a: PHI (r2v31 int) = (r2v22 int), (r2v33 int) binds: [B:108:0x014b, B:98:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r3v17 androidx.compose.foundation.t2) = (r3v4 androidx.compose.foundation.t2), (r3v3 androidx.compose.foundation.t2) binds: [B:108:0x014b, B:98:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r4v6 java.util.Set<java.lang.String>) = (r4v2 java.util.Set<java.lang.String>), (r4v8 java.util.Set<java.lang.String>) binds: [B:108:0x014b, B:98:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r7v6 io.intercom.android.sdk.ui.component.MediaType) = (r7v3 io.intercom.android.sdk.ui.component.MediaType), (r7v2 io.intercom.android.sdk.ui.component.MediaType) binds: [B:108:0x014b, B:98:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void MediaPickerButton(final int i10, @Nullable t2 t2Var, @Nullable MediaType mediaType, @Nullable Set<String> set, @NotNull final Function1<? super List<? extends Uri>, Unit> onResult, @NotNull final MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, @Nullable Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> content, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        t2 t2Var2;
        MediaType mediaType2;
        int i14;
        int i15;
        int i16;
        int i17;
        final Function0<Unit> function1;
        int i18;
        int i19;
        final Set<String> set2;
        t2 t2Var3;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        boolean z10;
        Object objI1;
        Object objI2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        final t2 t2Var4;
        final MediaType mediaType3;
        final Function0<Unit> function2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(mediaPickerButtonCTAStyle, "mediaPickerButtonCTAStyle");
        Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1770734349);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            if ((i12 & 2) == 0) {
                t2Var2 = t2Var;
                int i20 = c0VarR.D(t2Var2) ? 32 : 16;
                i13 |= i20;
            } else {
                t2Var2 = t2Var;
            }
            i13 |= i20;
        } else {
            t2Var2 = t2Var;
        }
        int i21 = i12 & 4;
        if (i21 == 0) {
            if ((i11 & 896) == 0) {
                mediaType2 = mediaType;
                i13 |= c0VarR.D(mediaType2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                i13 |= 1024;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (c0VarR.k0(onResult)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((458752 & i11) == 0) {
                    if (c0VarR.D(mediaPickerButtonCTAStyle)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    if ((3670016 & i11) == 0) {
                        function1 = function0;
                        if (c0VarR.k0(function1)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 128) != 0) {
                        if ((29360128 & i11) == 0) {
                            if (c0VarR.k0(content)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if (i14 != 8 && (i13 & 23967451) == 4793490 && c0VarR.d()) {
                            c0VarR.u();
                            set2 = set;
                            t2Var4 = t2Var2;
                        } else {
                            c0VarR.l0();
                            if ((i11 & 1) != 0 || c0VarR.y()) {
                                if ((i12 & 2) != 0) {
                                    t2Var2 = (t2) c0VarR.W(w2.c());
                                    i13 &= -113;
                                }
                                if (i21 != 0) {
                                    mediaType2 = MediaType.All;
                                }
                                if (i14 != 0) {
                                    set2 = defaultTrustedFileExtensions;
                                    i13 &= -7169;
                                } else {
                                    set2 = set;
                                }
                                if (i17 != 0) {
                                    t2Var3 = t2Var2;
                                    function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.f312394a;
                                        }
                                    };
                                }
                                c0VarR.Z();
                                objI0 = c0VarR.i0();
                                aVar = androidx.compose.runtime.c0.f35327a;
                                if (objI0 == aVar.a()) {
                                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                    c0VarR.Y(objI0);
                                }
                                final s0 s0Var = (s0) objI0;
                                PreviewMediaContract previewMediaContract = new PreviewMediaContract();
                                c0VarR.E(-2009946895);
                                if ((i13 & 57344) == 16384) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                objI1 = c0VarR.i0();
                                if (z10 || objI1 == aVar.a()) {
                                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                c0VarR.A();
                                final androidx.activity.compose.k kVarA = androidx.activity.compose.d.a(previewMediaContract, (Function1) objI1, c0VarR, 0);
                                final androidx.activity.compose.k kVarA2 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var, onResult, kVarA, mediaPickerButtonCTAStyle, (List) obj);
                                    }
                                }, c0VarR, 8);
                                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                                c0VarR.E(-2009910284);
                                objI2 = c0VarR.i0();
                                if (objI2 == aVar.a()) {
                                    objI2 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI2);
                                }
                                c0VarR.A();
                                androidx.compose.ui.a0 a0VarF = i1.f(aVar2, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA2);
                                    }
                                }, 28, null);
                                a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                                b1 b1VarK = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarF);
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
                                int i22 = i13;
                                y7.n(c0VarD, a1VarK, aVar3.e());
                                y7.n(c0VarD, b1VarK, aVar3.g());
                                function2B = aVar3.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar3.f());
                                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                                content.invoke(c0VarR, Integer.valueOf((i22 >> 21) & 14));
                                c0VarR.o();
                                t2Var4 = t2Var3;
                            } else {
                                c0VarR.u();
                                if ((i12 & 2) != 0) {
                                    i13 &= -113;
                                }
                                if (i14 != 0) {
                                    i13 &= -7169;
                                }
                                set2 = set;
                            }
                            t2Var3 = t2Var2;
                            c0VarR.Z();
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            final s0 s0Var2 = (s0) objI0;
                            PreviewMediaContract previewMediaContract2 = new PreviewMediaContract();
                            c0VarR.E(-2009946895);
                            if ((i13 & 57344) == 16384) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z10) {
                                objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            final androidx.activity.compose.k kVarA3 = androidx.activity.compose.d.a(previewMediaContract2, (Function1) objI1, c0VarR, 0);
                            final androidx.activity.compose.k kVarA4 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var2, onResult, kVarA3, mediaPickerButtonCTAStyle, (List) obj);
                                }
                            }, c0VarR, 8);
                            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                            c0VarR.E(-2009910284);
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            androidx.compose.ui.a0 a0VarF2 = i1.f(aVar4, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA4);
                                }
                            }, 28, null);
                            a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK2 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
                            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                            function0A = aVar5.a();
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
                            int i23 = i13;
                            y7.n(c0VarD, a1VarK2, aVar5.e());
                            y7.n(c0VarD, b1VarK2, aVar5.g());
                            function2B = aVar5.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN2, aVar5.f());
                            androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                            content.invoke(c0VarR, Integer.valueOf((i23 >> 21) & 14));
                            c0VarR.o();
                            t2Var4 = t2Var3;
                        }
                        mediaType3 = mediaType2;
                        function2 = function1;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 = 12582912;
                    i13 |= i19;
                    if (i14 != 8) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        }
                        c0VarR.Z();
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        final s0 s0Var3 = (s0) objI0;
                        PreviewMediaContract previewMediaContract3 = new PreviewMediaContract();
                        c0VarR.E(-2009946895);
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z10) {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        final androidx.activity.compose.k kVarA5 = androidx.activity.compose.d.a(previewMediaContract3, (Function1) objI1, c0VarR, 0);
                        final androidx.activity.compose.k kVarA6 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var3, onResult, kVarA5, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c0VarR, 8);
                        androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                        c0VarR.E(-2009910284);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarF3 = i1.f(aVar6, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA6);
                            }
                        }, 28, null);
                        a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
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
                        int i24 = i13;
                        y7.n(c0VarD, a1VarK3, aVar7.e());
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
                        androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                        content.invoke(c0VarR, Integer.valueOf((i24 >> 21) & 14));
                        c0VarR.o();
                        t2Var4 = t2Var3;
                    } else {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        }
                        c0VarR.Z();
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        final s0 s0Var4 = (s0) objI0;
                        PreviewMediaContract previewMediaContract4 = new PreviewMediaContract();
                        c0VarR.E(-2009946895);
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z10) {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        final androidx.activity.compose.k kVarA7 = androidx.activity.compose.d.a(previewMediaContract4, (Function1) objI1, c0VarR, 0);
                        final androidx.activity.compose.k kVarA8 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var4, onResult, kVarA7, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c0VarR, 8);
                        androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
                        c0VarR.E(-2009910284);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarF4 = i1.f(aVar8, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA8);
                            }
                        }, 28, null);
                        a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK4 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarF4);
                        androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                        function0A = aVar9.a();
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
                        int i25 = i13;
                        y7.n(c0VarD, a1VarK4, aVar9.e());
                        y7.n(c0VarD, b1VarK4, aVar9.g());
                        function2B = aVar9.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN4, aVar9.f());
                        androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                        content.invoke(c0VarR, Integer.valueOf((i25 >> 21) & 14));
                        c0VarR.o();
                        t2Var4 = t2Var3;
                    }
                    mediaType3 = mediaType2;
                    function2 = function1;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 1572864;
                function1 = function0;
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (c0VarR.k0(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if (i14 != 8) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        }
                        c0VarR.Z();
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        final s0 s0Var5 = (s0) objI0;
                        PreviewMediaContract previewMediaContract5 = new PreviewMediaContract();
                        c0VarR.E(-2009946895);
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z10) {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        final androidx.activity.compose.k kVarA9 = androidx.activity.compose.d.a(previewMediaContract5, (Function1) objI1, c0VarR, 0);
                        final androidx.activity.compose.k kVarA10 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var5, onResult, kVarA9, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c0VarR, 8);
                        androidx.compose.ui.a0.a aVar10 = androidx.compose.ui.a0.E;
                        c0VarR.E(-2009910284);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarF5 = i1.f(aVar10, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA10);
                            }
                        }, 28, null);
                        a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarF5);
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
                        int i26 = i13;
                        y7.n(c0VarD, a1VarK5, aVar11.e());
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
                        androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                        content.invoke(c0VarR, Integer.valueOf((i26 >> 21) & 14));
                        c0VarR.o();
                        t2Var4 = t2Var3;
                    } else {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        }
                        c0VarR.Z();
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        final s0 s0Var6 = (s0) objI0;
                        PreviewMediaContract previewMediaContract6 = new PreviewMediaContract();
                        c0VarR.E(-2009946895);
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z10) {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        final androidx.activity.compose.k kVarA11 = androidx.activity.compose.d.a(previewMediaContract6, (Function1) objI1, c0VarR, 0);
                        final androidx.activity.compose.k kVarA12 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var6, onResult, kVarA11, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c0VarR, 8);
                        androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                        c0VarR.E(-2009910284);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarF6 = i1.f(aVar12, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA12);
                            }
                        }, 28, null);
                        a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK6 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarF6);
                        androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                        function0A = aVar13.a();
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
                        int i27 = i13;
                        y7.n(c0VarD, a1VarK6, aVar13.e());
                        y7.n(c0VarD, b1VarK6, aVar13.g());
                        function2B = aVar13.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN6, aVar13.f());
                        androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                        content.invoke(c0VarR, Integer.valueOf((i27 >> 21) & 14));
                        c0VarR.o();
                        t2Var4 = t2Var3;
                    }
                    mediaType3 = mediaType2;
                    function2 = function1;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 = 12582912;
                i13 |= i19;
                if (i14 != 8) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var7 = (s0) objI0;
                    PreviewMediaContract previewMediaContract7 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA13 = androidx.activity.compose.d.a(previewMediaContract7, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA14 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var7, onResult, kVarA13, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar14 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF7 = i1.f(aVar14, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA14);
                        }
                    }, 28, null);
                    a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarF7);
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
                    int i28 = i13;
                    y7.n(c0VarD, a1VarK7, aVar15.e());
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
                    androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i28 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                } else {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var8 = (s0) objI0;
                    PreviewMediaContract previewMediaContract8 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA15 = androidx.activity.compose.d.a(previewMediaContract8, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA16 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var8, onResult, kVarA15, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar16 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF8 = i1.f(aVar16, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA16);
                        }
                    }, 28, null);
                    a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarF8);
                    androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                    function0A = aVar17.a();
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
                    int i29 = i13;
                    y7.n(c0VarD, a1VarK8, aVar17.e());
                    y7.n(c0VarD, b1VarK8, aVar17.g());
                    function2B = aVar17.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN8, aVar17.f());
                    androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i29 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                }
                mediaType3 = mediaType2;
                function2 = function1;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 = androidx.profileinstaller.n.c.f73814m;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                if ((3670016 & i11) == 0) {
                    function1 = function0;
                    if (c0VarR.k0(function1)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (c0VarR.k0(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if (i14 != 8) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        }
                        c0VarR.Z();
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        final s0 s0Var9 = (s0) objI0;
                        PreviewMediaContract previewMediaContract9 = new PreviewMediaContract();
                        c0VarR.E(-2009946895);
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z10) {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        final androidx.activity.compose.k kVarA17 = androidx.activity.compose.d.a(previewMediaContract9, (Function1) objI1, c0VarR, 0);
                        final androidx.activity.compose.k kVarA18 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var9, onResult, kVarA17, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c0VarR, 8);
                        androidx.compose.ui.a0.a aVar18 = androidx.compose.ui.a0.E;
                        c0VarR.E(-2009910284);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarF9 = i1.f(aVar18, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA18);
                            }
                        }, 28, null);
                        a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarF9);
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
                        int i210 = i13;
                        y7.n(c0VarD, a1VarK9, aVar19.e());
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
                        androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                        content.invoke(c0VarR, Integer.valueOf((i210 >> 21) & 14));
                        c0VarR.o();
                        t2Var4 = t2Var3;
                    } else {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        }
                        c0VarR.Z();
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        final s0 s0Var10 = (s0) objI0;
                        PreviewMediaContract previewMediaContract10 = new PreviewMediaContract();
                        c0VarR.E(-2009946895);
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z10) {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        final androidx.activity.compose.k kVarA19 = androidx.activity.compose.d.a(previewMediaContract10, (Function1) objI1, c0VarR, 0);
                        final androidx.activity.compose.k kVarA110 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var10, onResult, kVarA19, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c0VarR, 8);
                        androidx.compose.ui.a0.a aVar110 = androidx.compose.ui.a0.E;
                        c0VarR.E(-2009910284);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarF10 = i1.f(aVar110, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA110);
                            }
                        }, 28, null);
                        a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK10 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarF10);
                        androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                        function0A = aVar111.a();
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
                        int i211 = i13;
                        y7.n(c0VarD, a1VarK10, aVar111.e());
                        y7.n(c0VarD, b1VarK10, aVar111.g());
                        function2B = aVar111.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN10, aVar111.f());
                        androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                        content.invoke(c0VarR, Integer.valueOf((i211 >> 21) & 14));
                        c0VarR.o();
                        t2Var4 = t2Var3;
                    }
                    mediaType3 = mediaType2;
                    function2 = function1;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 = 12582912;
                i13 |= i19;
                if (i14 != 8) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var11 = (s0) objI0;
                    PreviewMediaContract previewMediaContract11 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA111 = androidx.activity.compose.d.a(previewMediaContract11, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA112 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var11, onResult, kVarA111, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar112 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF11 = i1.f(aVar112, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA112);
                        }
                    }, 28, null);
                    a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarF11);
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
                    int i212 = i13;
                    y7.n(c0VarD, a1VarK11, aVar113.e());
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
                    androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i212 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                } else {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var12 = (s0) objI0;
                    PreviewMediaContract previewMediaContract12 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA113 = androidx.activity.compose.d.a(previewMediaContract12, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA114 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var12, onResult, kVarA113, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar114 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF12 = i1.f(aVar114, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA114);
                        }
                    }, 28, null);
                    a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK12 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarF12);
                    androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                    function0A = aVar115.a();
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
                    int i213 = i13;
                    y7.n(c0VarD, a1VarK12, aVar115.e());
                    y7.n(c0VarD, b1VarK12, aVar115.g());
                    function2B = aVar115.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN12, aVar115.f());
                    androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i213 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                }
                mediaType3 = mediaType2;
                function2 = function1;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            function1 = function0;
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (c0VarR.k0(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if (i14 != 8) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var13 = (s0) objI0;
                    PreviewMediaContract previewMediaContract13 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA115 = androidx.activity.compose.d.a(previewMediaContract13, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA116 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var13, onResult, kVarA115, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar116 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF13 = i1.f(aVar116, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA116);
                        }
                    }, 28, null);
                    a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarF13);
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
                    int i214 = i13;
                    y7.n(c0VarD, a1VarK13, aVar117.e());
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
                    androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i214 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                } else {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var14 = (s0) objI0;
                    PreviewMediaContract previewMediaContract14 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA117 = androidx.activity.compose.d.a(previewMediaContract14, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA118 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var14, onResult, kVarA117, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar118 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF14 = i1.f(aVar118, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA118);
                        }
                    }, 28, null);
                    a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK14 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarF14);
                    androidx.compose.ui.node.g.a aVar119 = androidx.compose.ui.node.g.I;
                    function0A = aVar119.a();
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
                    int i215 = i13;
                    y7.n(c0VarD, a1VarK14, aVar119.e());
                    y7.n(c0VarD, b1VarK14, aVar119.g());
                    function2B = aVar119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN14, aVar119.f());
                    androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i215 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                }
                mediaType3 = mediaType2;
                function2 = function1;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 = 12582912;
            i13 |= i19;
            if (i14 != 8) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                }
                c0VarR.Z();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                final s0 s0Var15 = (s0) objI0;
                PreviewMediaContract previewMediaContract15 = new PreviewMediaContract();
                c0VarR.E(-2009946895);
                if ((i13 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI1 = c0VarR.i0();
                if (z10) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                final androidx.activity.compose.k kVarA119 = androidx.activity.compose.d.a(previewMediaContract15, (Function1) objI1, c0VarR, 0);
                final androidx.activity.compose.k kVarA1110 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var15, onResult, kVarA119, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c0VarR, 8);
                androidx.compose.ui.a0.a aVar1110 = androidx.compose.ui.a0.E;
                c0VarR.E(-2009910284);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarF15 = i1.f(aVar1110, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA1110);
                    }
                }, 28, null);
                a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarF15);
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
                int i216 = i13;
                y7.n(c0VarD, a1VarK15, aVar1111.e());
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
                androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0VarR, Integer.valueOf((i216 >> 21) & 14));
                c0VarR.o();
                t2Var4 = t2Var3;
            } else {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                }
                c0VarR.Z();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                final s0 s0Var16 = (s0) objI0;
                PreviewMediaContract previewMediaContract16 = new PreviewMediaContract();
                c0VarR.E(-2009946895);
                if ((i13 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI1 = c0VarR.i0();
                if (z10) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                final androidx.activity.compose.k kVarA1111 = androidx.activity.compose.d.a(previewMediaContract16, (Function1) objI1, c0VarR, 0);
                final androidx.activity.compose.k kVarA1112 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var16, onResult, kVarA1111, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c0VarR, 8);
                androidx.compose.ui.a0.a aVar1112 = androidx.compose.ui.a0.E;
                c0VarR.E(-2009910284);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarF16 = i1.f(aVar1112, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA1112);
                    }
                }, 28, null);
                a1 a1VarK16 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK16 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarF16);
                androidx.compose.ui.node.g.a aVar1113 = androidx.compose.ui.node.g.I;
                function0A = aVar1113.a();
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
                int i217 = i13;
                y7.n(c0VarD, a1VarK16, aVar1113.e());
                y7.n(c0VarD, b1VarK16, aVar1113.g());
                function2B = aVar1113.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN16, aVar1113.f());
                androidx.compose.foundation.layout.d0 d0Var16 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0VarR, Integer.valueOf((i217 >> 21) & 14));
                c0VarR.o();
                t2Var4 = t2Var3;
            }
            mediaType3 = mediaType2;
            function2 = function1;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= a5.S0;
        mediaType2 = mediaType;
        i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 57344) == 0) {
            if (c0VarR.k0(onResult)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        if ((i12 & 32) != 0) {
            if ((458752 & i11) == 0) {
                if (c0VarR.D(mediaPickerButtonCTAStyle)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
            }
            i17 = i12 & 64;
            if (i17 != 0) {
                if ((3670016 & i11) == 0) {
                    function1 = function0;
                    if (c0VarR.k0(function1)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (c0VarR.k0(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if (i14 != 8) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        }
                        c0VarR.Z();
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        final s0 s0Var17 = (s0) objI0;
                        PreviewMediaContract previewMediaContract17 = new PreviewMediaContract();
                        c0VarR.E(-2009946895);
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z10) {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        final androidx.activity.compose.k kVarA1113 = androidx.activity.compose.d.a(previewMediaContract17, (Function1) objI1, c0VarR, 0);
                        final androidx.activity.compose.k kVarA1114 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var17, onResult, kVarA1113, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c0VarR, 8);
                        androidx.compose.ui.a0.a aVar1114 = androidx.compose.ui.a0.E;
                        c0VarR.E(-2009910284);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarF17 = i1.f(aVar1114, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA1114);
                            }
                        }, 28, null);
                        a1 a1VarK17 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK17 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarF17);
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
                        int i218 = i13;
                        y7.n(c0VarD, a1VarK17, aVar1115.e());
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
                        androidx.compose.foundation.layout.d0 d0Var17 = androidx.compose.foundation.layout.d0.f15956a;
                        content.invoke(c0VarR, Integer.valueOf((i218 >> 21) & 14));
                        c0VarR.o();
                        t2Var4 = t2Var3;
                    } else {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                t2Var2 = (t2) c0VarR.W(w2.c());
                                i13 &= -113;
                            }
                            if (i21 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                t2Var3 = t2Var2;
                                function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                t2Var3 = t2Var2;
                            }
                        }
                        c0VarR.Z();
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        final s0 s0Var18 = (s0) objI0;
                        PreviewMediaContract previewMediaContract18 = new PreviewMediaContract();
                        c0VarR.E(-2009946895);
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z10) {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        final androidx.activity.compose.k kVarA1115 = androidx.activity.compose.d.a(previewMediaContract18, (Function1) objI1, c0VarR, 0);
                        final androidx.activity.compose.k kVarA1116 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var18, onResult, kVarA1115, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c0VarR, 8);
                        androidx.compose.ui.a0.a aVar1116 = androidx.compose.ui.a0.E;
                        c0VarR.E(-2009910284);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarF18 = i1.f(aVar1116, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA1116);
                            }
                        }, 28, null);
                        a1 a1VarK18 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK18 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarF18);
                        androidx.compose.ui.node.g.a aVar1117 = androidx.compose.ui.node.g.I;
                        function0A = aVar1117.a();
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
                        int i219 = i13;
                        y7.n(c0VarD, a1VarK18, aVar1117.e());
                        y7.n(c0VarD, b1VarK18, aVar1117.g());
                        function2B = aVar1117.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN18, aVar1117.f());
                        androidx.compose.foundation.layout.d0 d0Var18 = androidx.compose.foundation.layout.d0.f15956a;
                        content.invoke(c0VarR, Integer.valueOf((i219 >> 21) & 14));
                        c0VarR.o();
                        t2Var4 = t2Var3;
                    }
                    mediaType3 = mediaType2;
                    function2 = function1;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 = 12582912;
                i13 |= i19;
                if (i14 != 8) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var19 = (s0) objI0;
                    PreviewMediaContract previewMediaContract19 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA1117 = androidx.activity.compose.d.a(previewMediaContract19, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA1118 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var19, onResult, kVarA1117, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar1118 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF19 = i1.f(aVar1118, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA1118);
                        }
                    }, 28, null);
                    a1 a1VarK19 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK19 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarF19);
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
                    int i2110 = i13;
                    y7.n(c0VarD, a1VarK19, aVar1119.e());
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
                    androidx.compose.foundation.layout.d0 d0Var19 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i2110 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                } else {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var110 = (s0) objI0;
                    PreviewMediaContract previewMediaContract110 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA1119 = androidx.activity.compose.d.a(previewMediaContract110, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA11110 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var110, onResult, kVarA1119, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar11110 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF110 = i1.f(aVar11110, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA11110);
                        }
                    }, 28, null);
                    a1 a1VarK110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarF110);
                    androidx.compose.ui.node.g.a aVar11111 = androidx.compose.ui.node.g.I;
                    function0A = aVar11111.a();
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
                    int i2111 = i13;
                    y7.n(c0VarD, a1VarK110, aVar11111.e());
                    y7.n(c0VarD, b1VarK110, aVar11111.g());
                    function2B = aVar11111.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN110, aVar11111.f());
                    androidx.compose.foundation.layout.d0 d0Var110 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i2111 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                }
                mediaType3 = mediaType2;
                function2 = function1;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            function1 = function0;
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (c0VarR.k0(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if (i14 != 8) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var111 = (s0) objI0;
                    PreviewMediaContract previewMediaContract111 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA11111 = androidx.activity.compose.d.a(previewMediaContract111, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA11112 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var111, onResult, kVarA11111, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar11112 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF111 = i1.f(aVar11112, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA11112);
                        }
                    }, 28, null);
                    a1 a1VarK111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarF111);
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
                    int i2112 = i13;
                    y7.n(c0VarD, a1VarK111, aVar11113.e());
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
                    androidx.compose.foundation.layout.d0 d0Var111 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i2112 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                } else {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var112 = (s0) objI0;
                    PreviewMediaContract previewMediaContract112 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA11113 = androidx.activity.compose.d.a(previewMediaContract112, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA11114 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var112, onResult, kVarA11113, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar11114 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF112 = i1.f(aVar11114, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA11114);
                        }
                    }, 28, null);
                    a1 a1VarK112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarF112);
                    androidx.compose.ui.node.g.a aVar11115 = androidx.compose.ui.node.g.I;
                    function0A = aVar11115.a();
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
                    int i2113 = i13;
                    y7.n(c0VarD, a1VarK112, aVar11115.e());
                    y7.n(c0VarD, b1VarK112, aVar11115.g());
                    function2B = aVar11115.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN112, aVar11115.f());
                    androidx.compose.foundation.layout.d0 d0Var112 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i2113 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                }
                mediaType3 = mediaType2;
                function2 = function1;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 = 12582912;
            i13 |= i19;
            if (i14 != 8) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                }
                c0VarR.Z();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                final s0 s0Var113 = (s0) objI0;
                PreviewMediaContract previewMediaContract113 = new PreviewMediaContract();
                c0VarR.E(-2009946895);
                if ((i13 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI1 = c0VarR.i0();
                if (z10) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                final androidx.activity.compose.k kVarA11115 = androidx.activity.compose.d.a(previewMediaContract113, (Function1) objI1, c0VarR, 0);
                final androidx.activity.compose.k kVarA11116 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var113, onResult, kVarA11115, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c0VarR, 8);
                androidx.compose.ui.a0.a aVar11116 = androidx.compose.ui.a0.E;
                c0VarR.E(-2009910284);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarF113 = i1.f(aVar11116, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA11116);
                    }
                }, 28, null);
                a1 a1VarK113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarF113);
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
                int i2114 = i13;
                y7.n(c0VarD, a1VarK113, aVar11117.e());
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
                androidx.compose.foundation.layout.d0 d0Var113 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0VarR, Integer.valueOf((i2114 >> 21) & 14));
                c0VarR.o();
                t2Var4 = t2Var3;
            } else {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                }
                c0VarR.Z();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                final s0 s0Var114 = (s0) objI0;
                PreviewMediaContract previewMediaContract114 = new PreviewMediaContract();
                c0VarR.E(-2009946895);
                if ((i13 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI1 = c0VarR.i0();
                if (z10) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                final androidx.activity.compose.k kVarA11117 = androidx.activity.compose.d.a(previewMediaContract114, (Function1) objI1, c0VarR, 0);
                final androidx.activity.compose.k kVarA11118 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var114, onResult, kVarA11117, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c0VarR, 8);
                androidx.compose.ui.a0.a aVar11118 = androidx.compose.ui.a0.E;
                c0VarR.E(-2009910284);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarF114 = i1.f(aVar11118, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA11118);
                    }
                }, 28, null);
                a1 a1VarK114 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarF114);
                androidx.compose.ui.node.g.a aVar11119 = androidx.compose.ui.node.g.I;
                function0A = aVar11119.a();
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
                int i2115 = i13;
                y7.n(c0VarD, a1VarK114, aVar11119.e());
                y7.n(c0VarD, b1VarK114, aVar11119.g());
                function2B = aVar11119.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN114, aVar11119.f());
                androidx.compose.foundation.layout.d0 d0Var114 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0VarR, Integer.valueOf((i2115 >> 21) & 14));
                c0VarR.o();
                t2Var4 = t2Var3;
            }
            mediaType3 = mediaType2;
            function2 = function1;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 = androidx.profileinstaller.n.c.f73814m;
        i13 |= i16;
        i17 = i12 & 64;
        if (i17 != 0) {
            if ((3670016 & i11) == 0) {
                function1 = function0;
                if (c0VarR.k0(function1)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (c0VarR.k0(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if (i14 != 8) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var115 = (s0) objI0;
                    PreviewMediaContract previewMediaContract115 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA11119 = androidx.activity.compose.d.a(previewMediaContract115, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA111110 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var115, onResult, kVarA11119, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar111110 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF115 = i1.f(aVar111110, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA111110);
                        }
                    }, 28, null);
                    a1 a1VarK115 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarF115);
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
                    int i2116 = i13;
                    y7.n(c0VarD, a1VarK115, aVar111111.e());
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
                    androidx.compose.foundation.layout.d0 d0Var115 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i2116 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                } else {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            t2Var2 = (t2) c0VarR.W(w2.c());
                            i13 &= -113;
                        }
                        if (i21 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            t2Var3 = t2Var2;
                            function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            t2Var3 = t2Var2;
                        }
                    }
                    c0VarR.Z();
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    final s0 s0Var116 = (s0) objI0;
                    PreviewMediaContract previewMediaContract116 = new PreviewMediaContract();
                    c0VarR.E(-2009946895);
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z10) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    final androidx.activity.compose.k kVarA111111 = androidx.activity.compose.d.a(previewMediaContract116, (Function1) objI1, c0VarR, 0);
                    final androidx.activity.compose.k kVarA111112 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var116, onResult, kVarA111111, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c0VarR, 8);
                    androidx.compose.ui.a0.a aVar111112 = androidx.compose.ui.a0.E;
                    c0VarR.E(-2009910284);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarF116 = i1.f(aVar111112, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA111112);
                        }
                    }, 28, null);
                    a1 a1VarK116 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarF116);
                    androidx.compose.ui.node.g.a aVar111113 = androidx.compose.ui.node.g.I;
                    function0A = aVar111113.a();
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
                    int i2117 = i13;
                    y7.n(c0VarD, a1VarK116, aVar111113.e());
                    y7.n(c0VarD, b1VarK116, aVar111113.g());
                    function2B = aVar111113.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN116, aVar111113.f());
                    androidx.compose.foundation.layout.d0 d0Var116 = androidx.compose.foundation.layout.d0.f15956a;
                    content.invoke(c0VarR, Integer.valueOf((i2117 >> 21) & 14));
                    c0VarR.o();
                    t2Var4 = t2Var3;
                }
                mediaType3 = mediaType2;
                function2 = function1;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 = 12582912;
            i13 |= i19;
            if (i14 != 8) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                }
                c0VarR.Z();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                final s0 s0Var117 = (s0) objI0;
                PreviewMediaContract previewMediaContract117 = new PreviewMediaContract();
                c0VarR.E(-2009946895);
                if ((i13 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI1 = c0VarR.i0();
                if (z10) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                final androidx.activity.compose.k kVarA111113 = androidx.activity.compose.d.a(previewMediaContract117, (Function1) objI1, c0VarR, 0);
                final androidx.activity.compose.k kVarA111114 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var117, onResult, kVarA111113, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c0VarR, 8);
                androidx.compose.ui.a0.a aVar111114 = androidx.compose.ui.a0.E;
                c0VarR.E(-2009910284);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarF117 = i1.f(aVar111114, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA111114);
                    }
                }, 28, null);
                a1 a1VarK117 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarF117);
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
                int i2118 = i13;
                y7.n(c0VarD, a1VarK117, aVar111115.e());
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
                androidx.compose.foundation.layout.d0 d0Var117 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0VarR, Integer.valueOf((i2118 >> 21) & 14));
                c0VarR.o();
                t2Var4 = t2Var3;
            } else {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                }
                c0VarR.Z();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                final s0 s0Var118 = (s0) objI0;
                PreviewMediaContract previewMediaContract118 = new PreviewMediaContract();
                c0VarR.E(-2009946895);
                if ((i13 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI1 = c0VarR.i0();
                if (z10) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                final androidx.activity.compose.k kVarA111115 = androidx.activity.compose.d.a(previewMediaContract118, (Function1) objI1, c0VarR, 0);
                final androidx.activity.compose.k kVarA111116 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var118, onResult, kVarA111115, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c0VarR, 8);
                androidx.compose.ui.a0.a aVar111116 = androidx.compose.ui.a0.E;
                c0VarR.E(-2009910284);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarF118 = i1.f(aVar111116, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA111116);
                    }
                }, 28, null);
                a1 a1VarK118 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarF118);
                androidx.compose.ui.node.g.a aVar111117 = androidx.compose.ui.node.g.I;
                function0A = aVar111117.a();
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
                int i2119 = i13;
                y7.n(c0VarD, a1VarK118, aVar111117.e());
                y7.n(c0VarD, b1VarK118, aVar111117.g());
                function2B = aVar111117.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN118, aVar111117.f());
                androidx.compose.foundation.layout.d0 d0Var118 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0VarR, Integer.valueOf((i2119 >> 21) & 14));
                c0VarR.o();
                t2Var4 = t2Var3;
            }
            mediaType3 = mediaType2;
            function2 = function1;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 1572864;
        function1 = function0;
        if ((i12 & 128) != 0) {
            if ((29360128 & i11) == 0) {
                if (c0VarR.k0(content)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
            }
            if (i14 != 8) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                }
                c0VarR.Z();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                final s0 s0Var119 = (s0) objI0;
                PreviewMediaContract previewMediaContract119 = new PreviewMediaContract();
                c0VarR.E(-2009946895);
                if ((i13 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI1 = c0VarR.i0();
                if (z10) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                final androidx.activity.compose.k kVarA111117 = androidx.activity.compose.d.a(previewMediaContract119, (Function1) objI1, c0VarR, 0);
                final androidx.activity.compose.k kVarA111118 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var119, onResult, kVarA111117, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c0VarR, 8);
                androidx.compose.ui.a0.a aVar111118 = androidx.compose.ui.a0.E;
                c0VarR.E(-2009910284);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarF119 = i1.f(aVar111118, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA111118);
                    }
                }, 28, null);
                a1 a1VarK119 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK119 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0VarF119);
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
                int i21110 = i13;
                y7.n(c0VarD, a1VarK119, aVar111119.e());
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
                androidx.compose.foundation.layout.d0 d0Var119 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0VarR, Integer.valueOf((i21110 >> 21) & 14));
                c0VarR.o();
                t2Var4 = t2Var3;
            } else {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        t2Var2 = (t2) c0VarR.W(w2.c());
                        i13 &= -113;
                    }
                    if (i21 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        t2Var3 = t2Var2;
                        function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        t2Var3 = t2Var2;
                    }
                }
                c0VarR.Z();
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                final s0 s0Var1110 = (s0) objI0;
                PreviewMediaContract previewMediaContract1110 = new PreviewMediaContract();
                c0VarR.E(-2009946895);
                if ((i13 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI1 = c0VarR.i0();
                if (z10) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                final androidx.activity.compose.k kVarA111119 = androidx.activity.compose.d.a(previewMediaContract1110, (Function1) objI1, c0VarR, 0);
                final androidx.activity.compose.k kVarA1111110 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var1110, onResult, kVarA111119, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c0VarR, 8);
                androidx.compose.ui.a0.a aVar1111110 = androidx.compose.ui.a0.E;
                c0VarR.E(-2009910284);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarF1110 = i1.f(aVar1111110, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA1111110);
                    }
                }, 28, null);
                a1 a1VarK1110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarF1110);
                androidx.compose.ui.node.g.a aVar1111111 = androidx.compose.ui.node.g.I;
                function0A = aVar1111111.a();
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
                int i21111 = i13;
                y7.n(c0VarD, a1VarK1110, aVar1111111.e());
                y7.n(c0VarD, b1VarK1110, aVar1111111.g());
                function2B = aVar1111111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1110, aVar1111111.f());
                androidx.compose.foundation.layout.d0 d0Var1110 = androidx.compose.foundation.layout.d0.f15956a;
                content.invoke(c0VarR, Integer.valueOf((i21111 >> 21) & 14));
                c0VarR.o();
                t2Var4 = t2Var3;
            }
            mediaType3 = mediaType2;
            function2 = function1;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 = 12582912;
        i13 |= i19;
        if (i14 != 8) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if ((i12 & 2) != 0) {
                    t2Var2 = (t2) c0VarR.W(w2.c());
                    i13 &= -113;
                }
                if (i21 != 0) {
                    mediaType2 = MediaType.All;
                }
                if (i14 != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i13 &= -7169;
                } else {
                    set2 = set;
                }
                if (i17 != 0) {
                    t2Var3 = t2Var2;
                    function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    t2Var3 = t2Var2;
                }
            } else {
                if ((i12 & 2) != 0) {
                    t2Var2 = (t2) c0VarR.W(w2.c());
                    i13 &= -113;
                }
                if (i21 != 0) {
                    mediaType2 = MediaType.All;
                }
                if (i14 != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i13 &= -7169;
                } else {
                    set2 = set;
                }
                if (i17 != 0) {
                    t2Var3 = t2Var2;
                    function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    t2Var3 = t2Var2;
                }
            }
            c0VarR.Z();
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            final s0 s0Var1111 = (s0) objI0;
            PreviewMediaContract previewMediaContract1111 = new PreviewMediaContract();
            c0VarR.E(-2009946895);
            if ((i13 & 57344) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI1 = c0VarR.i0();
            if (z10) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            final androidx.activity.compose.k kVarA1111111 = androidx.activity.compose.d.a(previewMediaContract1111, (Function1) objI1, c0VarR, 0);
            final androidx.activity.compose.k kVarA1111112 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var1111, onResult, kVarA1111111, mediaPickerButtonCTAStyle, (List) obj);
                }
            }, c0VarR, 8);
            androidx.compose.ui.a0.a aVar1111112 = androidx.compose.ui.a0.E;
            c0VarR.E(-2009910284);
            objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.foundation.interaction.i.a();
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarF1111 = i1.f(aVar1111112, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA1111112);
                }
            }, 28, null);
            a1 a1VarK1111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarF1111);
            androidx.compose.ui.node.g.a aVar1111113 = androidx.compose.ui.node.g.I;
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
            int i21112 = i13;
            y7.n(c0VarD, a1VarK1111, aVar1111113.e());
            y7.n(c0VarD, b1VarK1111, aVar1111113.g());
            function2B = aVar1111113.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1111, aVar1111113.f());
            androidx.compose.foundation.layout.d0 d0Var1111 = androidx.compose.foundation.layout.d0.f15956a;
            content.invoke(c0VarR, Integer.valueOf((i21112 >> 21) & 14));
            c0VarR.o();
            t2Var4 = t2Var3;
        } else {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if ((i12 & 2) != 0) {
                    t2Var2 = (t2) c0VarR.W(w2.c());
                    i13 &= -113;
                }
                if (i21 != 0) {
                    mediaType2 = MediaType.All;
                }
                if (i14 != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i13 &= -7169;
                } else {
                    set2 = set;
                }
                if (i17 != 0) {
                    t2Var3 = t2Var2;
                    function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    t2Var3 = t2Var2;
                }
            } else {
                if ((i12 & 2) != 0) {
                    t2Var2 = (t2) c0VarR.W(w2.c());
                    i13 &= -113;
                }
                if (i21 != 0) {
                    mediaType2 = MediaType.All;
                }
                if (i14 != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i13 &= -7169;
                } else {
                    set2 = set;
                }
                if (i17 != 0) {
                    t2Var3 = t2Var2;
                    function1 = new Function0() { // from class: io.intercom.android.sdk.ui.component.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    t2Var3 = t2Var2;
                }
            }
            c0VarR.Z();
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            final s0 s0Var1112 = (s0) objI0;
            PreviewMediaContract previewMediaContract1112 = new PreviewMediaContract();
            c0VarR.E(-2009946895);
            if ((i13 & 57344) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI1 = c0VarR.i0();
            if (z10) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.ui.component.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(onResult, (List) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            final androidx.activity.compose.k kVarA1111113 = androidx.activity.compose.d.a(previewMediaContract1112, (Function1) objI1, c0VarR, 0);
            final androidx.activity.compose.k kVarA1111114 = androidx.activity.compose.d.a(new IntercomMediaPicker(mediaType2, set2, i10), new Function1() { // from class: io.intercom.android.sdk.ui.component.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MediaPickerButtonKt.MediaPickerButton$lambda$3(s0Var1112, onResult, kVarA1111113, mediaPickerButtonCTAStyle, (List) obj);
                }
            }, c0VarR, 8);
            androidx.compose.ui.a0.a aVar1111114 = androidx.compose.ui.a0.E;
            c0VarR.E(-2009910284);
            objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.foundation.interaction.i.a();
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarF1112 = i1.f(aVar1111114, (androidx.compose.foundation.interaction.j) objI2, t2Var3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaPickerButtonKt.MediaPickerButton$lambda$5(function1, kVarA1111114);
                }
            }, 28, null);
            a1 a1VarK1112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1112 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, a0VarF1112);
            androidx.compose.ui.node.g.a aVar1111115 = androidx.compose.ui.node.g.I;
            function0A = aVar1111115.a();
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
            int i21113 = i13;
            y7.n(c0VarD, a1VarK1112, aVar1111115.e());
            y7.n(c0VarD, b1VarK1112, aVar1111115.g());
            function2B = aVar1111115.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1112, aVar1111115.f());
            androidx.compose.foundation.layout.d0 d0Var1112 = androidx.compose.foundation.layout.d0.f15956a;
            content.invoke(c0VarR, Integer.valueOf((i21113 >> 21) & 14));
            c0VarR.o();
            t2Var4 = t2Var3;
        }
        mediaType3 = mediaType2;
        function2 = function1;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, t2Var4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function2, content, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButton$lambda$2$lambda$1(Function1 onResult, List it) {
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(it, "it");
        onResult.invoke(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButton$lambda$3(s0 scope, Function1 onResult, androidx.activity.compose.k previewLauncher, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, List it) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(previewLauncher, "$previewLauncher");
        Intrinsics.checkNotNullParameter(mediaPickerButtonCTAStyle, "$mediaPickerButtonCTAStyle");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isEmpty()) {
            onResult.invoke(it);
        } else {
            kotlinx.coroutines.k.f(scope, null, null, new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(previewLauncher, it, mediaPickerButtonCTAStyle, null), 3, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButton$lambda$5(Function0 function0, androidx.activity.compose.k pickerLauncher) {
        Intrinsics.checkNotNullParameter(pickerLauncher, "$pickerLauncher");
        function0.invoke();
        pickerLauncher.b("*/*");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButton$lambda$7(int i10, t2 t2Var, MediaType mediaType, Set set, Function1 onResult, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, Function0 function0, Function2 content, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(mediaPickerButtonCTAStyle, "$mediaPickerButtonCTAStyle");
        Intrinsics.checkNotNullParameter(content, "$content");
        MediaPickerButton(i10, t2Var, mediaType, set, onResult, mediaPickerButtonCTAStyle, function0, content, c0Var, t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Light Mode", uiMode = 16), @d1.c(name = "Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void MediaPickerButtonPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-158042907);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            boolean z10 = false & false;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m584getLambda3$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MediaPickerButtonKt.MediaPickerButtonPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButtonPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MediaPickerButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @NotNull
    public static final Set<String> getDefaultTrustedFileExtensions() {
        return defaultTrustedFileExtensions;
    }

    public static final boolean isPhotoPickerAvailable() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }
}
