package io.intercom.android.sdk.tickets;

import android.content.Context;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.ni;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.BoxedTextLayoutKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFIleAttachmentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FIleAttachmentList.kt\nio/intercom/android/sdk/tickets/FIleAttachmentListKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n75#2:147\n113#3:148\n87#4:149\n85#4,8:150\n94#4:190\n80#5,6:158\n87#5,3:173\n90#5,2:182\n94#5:189\n391#6,9:164\n400#6:184\n401#6,2:187\n4360#7,6:176\n1863#8,2:185\n*S KotlinDebug\n*F\n+ 1 FIleAttachmentList.kt\nio/intercom/android/sdk/tickets/FIleAttachmentListKt\n*L\n30#1:147\n33#1:148\n31#1:149\n31#1:150,8\n31#1:190\n31#1:158,6\n31#1:173,3\n31#1:182,2\n31#1:189\n31#1:164,9\n31#1:184\n31#1:187,2\n31#1:176,6\n35#1:185,2\n*E\n"})
public final class FIleAttachmentListKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FailedFileAttached(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String fileName, @NotNull final FileType fileType, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.a0 a0Var2;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(912363521);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(fileName) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(fileType) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
            a0Var2 = a0Var;
        } else {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0Var3 = a0Var;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            m541FileAttachmentvRFhKjU(a0Var3, fileName, fileType, intercomTheme.getColors(c0VarR, i14).m702getError0d7_KjU(), intercomTheme.getColors(c0VarR, i14).m702getError0d7_KjU(), ComposableSingletons$FIleAttachmentListKt.INSTANCE.m524getLambda1$intercom_sdk_base_release(), null, c0VarR, 196608 | (i12 & 14) | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896), 64);
            a0Var2 = a0Var3;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FIleAttachmentListKt.FailedFileAttached$lambda$5(a0Var2, fileName, fileType, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailedFileAttached$lambda$5(androidx.compose.ui.a0 a0Var, String fileName, FileType fileType, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        Intrinsics.checkNotNullParameter(fileType, "$fileType");
        FailedFileAttached(a0Var, fileName, fileType, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:105:0x0155  */
    /* JADX WARN: Code duplicated, block: B:108:0x0168  */
    /* JADX WARN: Code duplicated, block: B:111:0x016d  */
    /* JADX WARN: Code duplicated, block: B:115:0x01af  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x0120 A[PHI: r0 r3 r4 r13 r24
      0x0120: PHI (r0v10 androidx.compose.ui.a0) = (r0v7 androidx.compose.ui.a0), (r0v14 androidx.compose.ui.a0) binds: [B:110:0x016b, B:95:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r3v22 int) = (r3v18 int), (r3v24 int) binds: [B:110:0x016b, B:95:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r4v21 long) = (r4v15 long), (r4v14 long) binds: [B:110:0x016b, B:95:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r13v6 pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>) = 
      (r13v3 pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
      (r13v2 pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:110:0x016b, B:95:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r24v3 long) = (r24v0 long), (r24v4 long) binds: [B:110:0x016b, B:95:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: FileAttachment-vRFhKjU, reason: not valid java name */
    public static final void m541FileAttachmentvRFhKjU(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String fileName, @NotNull final FileType fileType, long j10, long j11, @Nullable pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        final long jW;
        final long jM714getPrimaryText0d7_KjU;
        final pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        int i13;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        int i14;
        androidx.compose.ui.a0 a0Var3;
        long j12;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar5;
        int i15;
        long j13;
        long j14;
        final androidx.compose.ui.a0 a0Var4;
        final pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar6;
        final pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar7;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1921960973);
        int i16 = i11 & 1;
        if (i16 != 0) {
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
            i12 |= c0VarR.D(fileName) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(fileType) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                jW = j10;
                int i17 = c0VarR.L(jW) ? 2048 : 1024;
                i12 |= i17;
            } else {
                jW = j10;
            }
            i12 |= i17;
        } else {
            jW = j10;
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                jM714getPrimaryText0d7_KjU = j11;
                int i18 = c0VarR.L(jM714getPrimaryText0d7_KjU) ? 16384 : 8192;
                i12 |= i18;
            } else {
                jM714getPrimaryText0d7_KjU = j11;
            }
            i12 |= i18;
        } else {
            jM714getPrimaryText0d7_KjU = j11;
        }
        int i19 = i11 & 32;
        if (i19 == 0) {
            if ((i10 & 458752) == 0) {
                nVar3 = nVar;
                i12 |= c0VarR.k0(nVar3) ? 131072 : 65536;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                if ((3670016 & i10) == 0) {
                    nVar4 = nVar2;
                    if (c0VarR.k0(nVar4)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
                if ((i12 & 2995931) == 599186 || !c0VarR.d()) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i16 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                            i12 &= -57345;
                        }
                        if (i19 != 0) {
                            nVar3 = null;
                        }
                        j12 = jM714getPrimaryText0d7_KjU;
                        if (i13 != 0) {
                            nVar5 = null;
                            i15 = i12;
                            j13 = jW;
                            j14 = j12;
                        }
                        c0VarR.Z();
                        androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-344274505, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[FileType.values().length];
                                    try {
                                        iArr[FileType.IMAGE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[FileType.VIDEO.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                                invoke(x5Var, c0Var2, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 BoxedTextLayout, androidx.compose.runtime.c0 c0Var2, int i20) {
                                int i21;
                                Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                                if ((i20 & 14) == 0) {
                                    i20 |= c0Var2.D(BoxedTextLayout) ? 4 : 2;
                                }
                                if ((i20 & 91) == 18 && c0Var2.d()) {
                                    c0Var2.u();
                                    return;
                                }
                                if (nVar3 != null) {
                                    c0Var2.E(1377519035);
                                    nVar3.invoke(BoxedTextLayout, c0Var2, Integer.valueOf(i20 & 14));
                                    c0Var2.A();
                                    return;
                                }
                                c0Var2.E(1377585003);
                                int i22 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                                if (i22 != 1) {
                                    i21 = i22 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                                } else {
                                    i21 = R.drawable.intercom_ic_image;
                                }
                                ni.o(u0.e.c(i21, c0Var2, 0), "Image Icon", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), 0L, c0Var2, 440, 8);
                                c0Var2.A();
                            }
                        }, c0VarR, 54);
                        int i20 = (i15 & 14) | 24576 | (i15 & com.planner5d.library.engine.input.f.b.B);
                        int i21 = i15 >> 3;
                        BoxedTextLayoutKt.m572BoxedTextLayoutY0xEhic(a0Var3, fileName, j13, j14, cVarE, nVar5, c0VarR, (i21 & 458752) | i20 | (i21 & 896) | (i21 & 7168), 0);
                        a0Var4 = a0Var3;
                        nVar6 = nVar5;
                        jM714getPrimaryText0d7_KjU = j14;
                        jW = j13;
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        a0Var3 = a0Var2;
                        j12 = jM714getPrimaryText0d7_KjU;
                    }
                    i15 = i12;
                    j13 = jW;
                    j14 = j12;
                    nVar5 = nVar4;
                    c0VarR.Z();
                    androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(-344274505, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[FileType.values().length];
                                try {
                                    iArr[FileType.IMAGE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[FileType.VIDEO.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                            invoke(x5Var, c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 BoxedTextLayout, androidx.compose.runtime.c0 c0Var2, int i22) {
                            int i23;
                            Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                            if ((i22 & 14) == 0) {
                                i22 |= c0Var2.D(BoxedTextLayout) ? 4 : 2;
                            }
                            if ((i22 & 91) == 18 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            if (nVar3 != null) {
                                c0Var2.E(1377519035);
                                nVar3.invoke(BoxedTextLayout, c0Var2, Integer.valueOf(i22 & 14));
                                c0Var2.A();
                                return;
                            }
                            c0Var2.E(1377585003);
                            int i24 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                            if (i24 != 1) {
                                i23 = i24 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                            } else {
                                i23 = R.drawable.intercom_ic_image;
                            }
                            ni.o(u0.e.c(i23, c0Var2, 0), "Image Icon", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), 0L, c0Var2, 440, 8);
                            c0Var2.A();
                        }
                    }, c0VarR, 54);
                    int i22 = (i15 & 14) | 24576 | (i15 & com.planner5d.library.engine.input.f.b.B);
                    int i23 = i15 >> 3;
                    BoxedTextLayoutKt.m572BoxedTextLayoutY0xEhic(a0Var3, fileName, j13, j14, cVarE2, nVar5, c0VarR, (i23 & 458752) | i22 | (i23 & 896) | (i23 & 7168), 0);
                    a0Var4 = a0Var3;
                    nVar6 = nVar5;
                    jM714getPrimaryText0d7_KjU = j14;
                    jW = j13;
                } else {
                    c0VarR.u();
                    a0Var4 = a0Var2;
                    nVar6 = nVar4;
                }
                nVar7 = nVar3;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$4(a0Var4, fileName, fileType, jW, jM714getPrimaryText0d7_KjU, nVar7, nVar6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            nVar4 = nVar2;
            if ((i12 & 2995931) == 599186) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i19 != 0) {
                        nVar3 = null;
                    }
                    j12 = jM714getPrimaryText0d7_KjU;
                    if (i13 != 0) {
                        nVar5 = null;
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                    } else {
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                        nVar5 = nVar4;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i19 != 0) {
                        nVar3 = null;
                    }
                    j12 = jM714getPrimaryText0d7_KjU;
                    if (i13 != 0) {
                        nVar5 = null;
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                    } else {
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                        nVar5 = nVar4;
                    }
                }
                c0VarR.Z();
                androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-344274505, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(x5Var, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 BoxedTextLayout, androidx.compose.runtime.c0 c0Var2, int i24) {
                        int i25;
                        Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                        if ((i24 & 14) == 0) {
                            i24 |= c0Var2.D(BoxedTextLayout) ? 4 : 2;
                        }
                        if ((i24 & 91) == 18 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        if (nVar3 != null) {
                            c0Var2.E(1377519035);
                            nVar3.invoke(BoxedTextLayout, c0Var2, Integer.valueOf(i24 & 14));
                            c0Var2.A();
                            return;
                        }
                        c0Var2.E(1377585003);
                        int i26 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i26 != 1) {
                            i25 = i26 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                        } else {
                            i25 = R.drawable.intercom_ic_image;
                        }
                        ni.o(u0.e.c(i25, c0Var2, 0), "Image Icon", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), 0L, c0Var2, 440, 8);
                        c0Var2.A();
                    }
                }, c0VarR, 54);
                int i24 = (i15 & 14) | 24576 | (i15 & com.planner5d.library.engine.input.f.b.B);
                int i25 = i15 >> 3;
                BoxedTextLayoutKt.m572BoxedTextLayoutY0xEhic(a0Var3, fileName, j13, j14, cVarE3, nVar5, c0VarR, (i25 & 458752) | i24 | (i25 & 896) | (i25 & 7168), 0);
                a0Var4 = a0Var3;
                nVar6 = nVar5;
                jM714getPrimaryText0d7_KjU = j14;
                jW = j13;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i19 != 0) {
                        nVar3 = null;
                    }
                    j12 = jM714getPrimaryText0d7_KjU;
                    if (i13 != 0) {
                        nVar5 = null;
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                    } else {
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                        nVar5 = nVar4;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i19 != 0) {
                        nVar3 = null;
                    }
                    j12 = jM714getPrimaryText0d7_KjU;
                    if (i13 != 0) {
                        nVar5 = null;
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                    } else {
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                        nVar5 = nVar4;
                    }
                }
                c0VarR.Z();
                androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(-344274505, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(x5Var, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 BoxedTextLayout, androidx.compose.runtime.c0 c0Var2, int i26) {
                        int i27;
                        Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                        if ((i26 & 14) == 0) {
                            i26 |= c0Var2.D(BoxedTextLayout) ? 4 : 2;
                        }
                        if ((i26 & 91) == 18 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        if (nVar3 != null) {
                            c0Var2.E(1377519035);
                            nVar3.invoke(BoxedTextLayout, c0Var2, Integer.valueOf(i26 & 14));
                            c0Var2.A();
                            return;
                        }
                        c0Var2.E(1377585003);
                        int i28 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i28 != 1) {
                            i27 = i28 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                        } else {
                            i27 = R.drawable.intercom_ic_image;
                        }
                        ni.o(u0.e.c(i27, c0Var2, 0), "Image Icon", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), 0L, c0Var2, 440, 8);
                        c0Var2.A();
                    }
                }, c0VarR, 54);
                int i26 = (i15 & 14) | 24576 | (i15 & com.planner5d.library.engine.input.f.b.B);
                int i27 = i15 >> 3;
                BoxedTextLayoutKt.m572BoxedTextLayoutY0xEhic(a0Var3, fileName, j13, j14, cVarE4, nVar5, c0VarR, (i27 & 458752) | i26 | (i27 & 896) | (i27 & 7168), 0);
                a0Var4 = a0Var3;
                nVar6 = nVar5;
                jM714getPrimaryText0d7_KjU = j14;
                jW = j13;
            }
            nVar7 = nVar3;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$4(a0Var4, fileName, fileType, jW, jM714getPrimaryText0d7_KjU, nVar7, nVar6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        nVar3 = nVar;
        i13 = i11 & 64;
        if (i13 != 0) {
            if ((3670016 & i10) == 0) {
                nVar4 = nVar2;
                if (c0VarR.k0(nVar4)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((i12 & 2995931) == 599186) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i19 != 0) {
                        nVar3 = null;
                    }
                    j12 = jM714getPrimaryText0d7_KjU;
                    if (i13 != 0) {
                        nVar5 = null;
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                    } else {
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                        nVar5 = nVar4;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i19 != 0) {
                        nVar3 = null;
                    }
                    j12 = jM714getPrimaryText0d7_KjU;
                    if (i13 != 0) {
                        nVar5 = null;
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                    } else {
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                        nVar5 = nVar4;
                    }
                }
                c0VarR.Z();
                androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(-344274505, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(x5Var, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 BoxedTextLayout, androidx.compose.runtime.c0 c0Var2, int i28) {
                        int i29;
                        Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                        if ((i28 & 14) == 0) {
                            i28 |= c0Var2.D(BoxedTextLayout) ? 4 : 2;
                        }
                        if ((i28 & 91) == 18 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        if (nVar3 != null) {
                            c0Var2.E(1377519035);
                            nVar3.invoke(BoxedTextLayout, c0Var2, Integer.valueOf(i28 & 14));
                            c0Var2.A();
                            return;
                        }
                        c0Var2.E(1377585003);
                        int i210 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i210 != 1) {
                            i29 = i210 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                        } else {
                            i29 = R.drawable.intercom_ic_image;
                        }
                        ni.o(u0.e.c(i29, c0Var2, 0), "Image Icon", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), 0L, c0Var2, 440, 8);
                        c0Var2.A();
                    }
                }, c0VarR, 54);
                int i28 = (i15 & 14) | 24576 | (i15 & com.planner5d.library.engine.input.f.b.B);
                int i29 = i15 >> 3;
                BoxedTextLayoutKt.m572BoxedTextLayoutY0xEhic(a0Var3, fileName, j13, j14, cVarE5, nVar5, c0VarR, (i29 & 458752) | i28 | (i29 & 896) | (i29 & 7168), 0);
                a0Var4 = a0Var3;
                nVar6 = nVar5;
                jM714getPrimaryText0d7_KjU = j14;
                jW = j13;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i19 != 0) {
                        nVar3 = null;
                    }
                    j12 = jM714getPrimaryText0d7_KjU;
                    if (i13 != 0) {
                        nVar5 = null;
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                    } else {
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                        nVar5 = nVar4;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i19 != 0) {
                        nVar3 = null;
                    }
                    j12 = jM714getPrimaryText0d7_KjU;
                    if (i13 != 0) {
                        nVar5 = null;
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                    } else {
                        i15 = i12;
                        j13 = jW;
                        j14 = j12;
                        nVar5 = nVar4;
                    }
                }
                c0VarR.Z();
                androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(-344274505, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(x5Var, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 BoxedTextLayout, androidx.compose.runtime.c0 c0Var2, int i210) {
                        int i211;
                        Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                        if ((i210 & 14) == 0) {
                            i210 |= c0Var2.D(BoxedTextLayout) ? 4 : 2;
                        }
                        if ((i210 & 91) == 18 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        if (nVar3 != null) {
                            c0Var2.E(1377519035);
                            nVar3.invoke(BoxedTextLayout, c0Var2, Integer.valueOf(i210 & 14));
                            c0Var2.A();
                            return;
                        }
                        c0Var2.E(1377585003);
                        int i212 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i212 != 1) {
                            i211 = i212 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                        } else {
                            i211 = R.drawable.intercom_ic_image;
                        }
                        ni.o(u0.e.c(i211, c0Var2, 0), "Image Icon", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), 0L, c0Var2, 440, 8);
                        c0Var2.A();
                    }
                }, c0VarR, 54);
                int i210 = (i15 & 14) | 24576 | (i15 & com.planner5d.library.engine.input.f.b.B);
                int i211 = i15 >> 3;
                BoxedTextLayoutKt.m572BoxedTextLayoutY0xEhic(a0Var3, fileName, j13, j14, cVarE6, nVar5, c0VarR, (i211 & 458752) | i210 | (i211 & 896) | (i211 & 7168), 0);
                a0Var4 = a0Var3;
                nVar6 = nVar5;
                jM714getPrimaryText0d7_KjU = j14;
                jW = j13;
            }
            nVar7 = nVar3;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$4(a0Var4, fileName, fileType, jW, jM714getPrimaryText0d7_KjU, nVar7, nVar6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        nVar4 = nVar2;
        if ((i12 & 2995931) == 599186) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    i12 &= -57345;
                }
                if (i19 != 0) {
                    nVar3 = null;
                }
                j12 = jM714getPrimaryText0d7_KjU;
                if (i13 != 0) {
                    nVar5 = null;
                    i15 = i12;
                    j13 = jW;
                    j14 = j12;
                } else {
                    i15 = i12;
                    j13 = jW;
                    j14 = j12;
                    nVar5 = nVar4;
                }
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    i12 &= -57345;
                }
                if (i19 != 0) {
                    nVar3 = null;
                }
                j12 = jM714getPrimaryText0d7_KjU;
                if (i13 != 0) {
                    nVar5 = null;
                    i15 = i12;
                    j13 = jW;
                    j14 = j12;
                } else {
                    i15 = i12;
                    j13 = jW;
                    j14 = j12;
                    nVar5 = nVar4;
                }
            }
            c0VarR.Z();
            androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(-344274505, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FileType.values().length];
                        try {
                            iArr[FileType.IMAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FileType.VIDEO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(x5Var, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 BoxedTextLayout, androidx.compose.runtime.c0 c0Var2, int i212) {
                    int i213;
                    Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                    if ((i212 & 14) == 0) {
                        i212 |= c0Var2.D(BoxedTextLayout) ? 4 : 2;
                    }
                    if ((i212 & 91) == 18 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    if (nVar3 != null) {
                        c0Var2.E(1377519035);
                        nVar3.invoke(BoxedTextLayout, c0Var2, Integer.valueOf(i212 & 14));
                        c0Var2.A();
                        return;
                    }
                    c0Var2.E(1377585003);
                    int i214 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                    if (i214 != 1) {
                        i213 = i214 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                    } else {
                        i213 = R.drawable.intercom_ic_image;
                    }
                    ni.o(u0.e.c(i213, c0Var2, 0), "Image Icon", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), 0L, c0Var2, 440, 8);
                    c0Var2.A();
                }
            }, c0VarR, 54);
            int i212 = (i15 & 14) | 24576 | (i15 & com.planner5d.library.engine.input.f.b.B);
            int i213 = i15 >> 3;
            BoxedTextLayoutKt.m572BoxedTextLayoutY0xEhic(a0Var3, fileName, j13, j14, cVarE7, nVar5, c0VarR, (i213 & 458752) | i212 | (i213 & 896) | (i213 & 7168), 0);
            a0Var4 = a0Var3;
            nVar6 = nVar5;
            jM714getPrimaryText0d7_KjU = j14;
            jW = j13;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    i12 &= -57345;
                }
                if (i19 != 0) {
                    nVar3 = null;
                }
                j12 = jM714getPrimaryText0d7_KjU;
                if (i13 != 0) {
                    nVar5 = null;
                    i15 = i12;
                    j13 = jW;
                    j14 = j12;
                } else {
                    i15 = i12;
                    j13 = jW;
                    j14 = j12;
                    nVar5 = nVar4;
                }
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    i12 &= -57345;
                }
                if (i19 != 0) {
                    nVar3 = null;
                }
                j12 = jM714getPrimaryText0d7_KjU;
                if (i13 != 0) {
                    nVar5 = null;
                    i15 = i12;
                    j13 = jW;
                    j14 = j12;
                } else {
                    i15 = i12;
                    j13 = jW;
                    j14 = j12;
                    nVar5 = nVar4;
                }
            }
            c0VarR.Z();
            androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(-344274505, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FileType.values().length];
                        try {
                            iArr[FileType.IMAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FileType.VIDEO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(x5Var, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 BoxedTextLayout, androidx.compose.runtime.c0 c0Var2, int i214) {
                    int i215;
                    Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                    if ((i214 & 14) == 0) {
                        i214 |= c0Var2.D(BoxedTextLayout) ? 4 : 2;
                    }
                    if ((i214 & 91) == 18 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    if (nVar3 != null) {
                        c0Var2.E(1377519035);
                        nVar3.invoke(BoxedTextLayout, c0Var2, Integer.valueOf(i214 & 14));
                        c0Var2.A();
                        return;
                    }
                    c0Var2.E(1377585003);
                    int i216 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                    if (i216 != 1) {
                        i215 = i216 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                    } else {
                        i215 = R.drawable.intercom_ic_image;
                    }
                    ni.o(u0.e.c(i215, c0Var2, 0), "Image Icon", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), 0L, c0Var2, 440, 8);
                    c0Var2.A();
                }
            }, c0VarR, 54);
            int i214 = (i15 & 14) | 24576 | (i15 & com.planner5d.library.engine.input.f.b.B);
            int i215 = i15 >> 3;
            BoxedTextLayoutKt.m572BoxedTextLayoutY0xEhic(a0Var3, fileName, j13, j14, cVarE8, nVar5, c0VarR, (i215 & 458752) | i214 | (i215 & 896) | (i215 & 7168), 0);
            a0Var4 = a0Var3;
            nVar6 = nVar5;
            jM714getPrimaryText0d7_KjU = j14;
            jW = j13;
        }
        nVar7 = nVar3;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$4(a0Var4, fileName, fileType, jW, jM714getPrimaryText0d7_KjU, nVar7, nVar6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FileAttachmentList(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<Ticket.TicketAttribute.FilesAttribute.File> files, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(files, "files");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(580044030);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(6)), androidx.compose.ui.e.f37317a.u(), c0VarR, 6);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarB, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        c0VarR.E(-1441890306);
        for (final Ticket.TicketAttribute.FilesAttribute.File file : files) {
            m541FileAttachmentvRFhKjU(i1.j(androidx.compose.ui.a0.E, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.tickets.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FIleAttachmentListKt.FileAttachmentList$lambda$2$lambda$1$lambda$0(file, context);
                }
            }, 15, null), file.getName(), file.getFileType(), 0L, 0L, null, null, c0VarR, 0, 120);
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FIleAttachmentListKt.FileAttachmentList$lambda$3(a0Var2, files, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$2$lambda$1$lambda$0(Ticket.TicketAttribute.FilesAttribute.File file, Context context) {
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(context, "$context");
        LinkOpener.handleUrl(file.getUrl(), context, Injector.get().getApi());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$3(androidx.compose.ui.a0 a0Var, List files, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(files, "$files");
        FileAttachmentList(a0Var, files, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void FileAttachmentListPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-414644973);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FIleAttachmentListKt.INSTANCE.m525getLambda2$intercom_sdk_base_release(), c0VarR, 12582912, 127);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FIleAttachmentListKt.FileAttachmentListPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentListPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FileAttachmentListPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachment_vRFhKjU$lambda$4(androidx.compose.ui.a0 a0Var, String fileName, FileType fileType, long j10, long j11, pj.n nVar, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        Intrinsics.checkNotNullParameter(fileType, "$fileType");
        m541FileAttachmentvRFhKjU(a0Var, fileName, fileType, j10, j11, nVar, nVar2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final FileType getFileType(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (StringsKt.V2(mimeType, "image", false, 2, null)) {
            return FileType.IMAGE;
        }
        return StringsKt.V2(mimeType, "video", false, 2, null) ? FileType.VIDEO : FileType.ATTACHMENT;
    }
}
