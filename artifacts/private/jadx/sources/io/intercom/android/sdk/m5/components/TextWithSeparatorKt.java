package io.intercom.android.sdk.m5.components;

import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTextWithSeparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextWithSeparator.kt\nio/intercom/android/sdk/m5/components/TextWithSeparatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,65:1\n1282#2,6:66\n*S KotlinDebug\n*F\n+ 1 TextWithSeparator.kt\nio/intercom/android/sdk/m5/components/TextWithSeparatorKt\n*L\n32#1:66,6\n*E\n"})
public final class TextWithSeparatorKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0145  */
    /* JADX WARN: Code duplicated, block: B:104:0x015d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0168  */
    /* JADX WARN: Code duplicated, block: B:114:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0187  */
    /* JADX WARN: Code duplicated, block: B:116:0x018a  */
    /* JADX WARN: Code duplicated, block: B:118:0x018e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0193  */
    /* JADX WARN: Code duplicated, block: B:122:0x0199  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:145:0x021e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0221  */
    /* JADX WARN: Code duplicated, block: B:149:0x0228  */
    /* JADX WARN: Code duplicated, block: B:150:0x022b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0233  */
    /* JADX WARN: Code duplicated, block: B:155:0x023b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0296  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0137  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: TextWithSeparator-wV1YYcM, reason: not valid java name */
    public static final void m171TextWithSeparatorwV1YYcM(@NotNull final String firstText, @NotNull final String secondText, @Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @Nullable y3 y3Var, long j10, int i10, int i11, @Nullable androidx.compose.ui.text.style.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i12, final int i13) {
        int i14;
        androidx.compose.ui.a0 a0Var2;
        int i15;
        String str2;
        int i16;
        y3 y3Var2;
        int i17;
        int i18;
        long j11;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final androidx.compose.ui.a0 a0Var3;
        String str3;
        y3 type04;
        long jU;
        int iA;
        int i27;
        androidx.compose.ui.text.style.j jVar2;
        int i28;
        y3 y3Var3;
        long j12;
        int i29;
        String str4;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objI0;
        androidx.compose.runtime.c0 c0Var2;
        final String str5;
        final long j13;
        final androidx.compose.ui.text.style.j jVar3;
        final int i30;
        final int i31;
        final y3 y3Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(firstText, "firstText");
        Intrinsics.checkNotNullParameter(secondText, "secondText");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(46249171);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (c0VarR.D(firstText) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i14 |= c0VarR.D(secondText) ? 32 : 16;
        }
        int i32 = i13 & 4;
        if (i32 == 0) {
            if ((i12 & 896) == 0) {
                a0Var2 = a0Var;
                i14 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i12 & 7168) == 0) {
                    str2 = str;
                    if (c0VarR.D(str2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                if ((i12 & 57344) == 0) {
                    if ((i13 & 16) == 0) {
                        y3Var2 = y3Var;
                        int i33 = c0VarR.D(y3Var2) ? 16384 : 8192;
                        i14 |= i33;
                    } else {
                        y3Var2 = y3Var;
                    }
                    i14 |= i33;
                } else {
                    y3Var2 = y3Var;
                }
                i17 = i13 & 32;
                if (i17 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    i18 = 57344;
                    j11 = j10;
                } else {
                    i18 = 57344;
                    j11 = j10;
                    if ((458752 & i12) == 0) {
                        if (c0VarR.L(j11)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i14 |= i19;
                    }
                }
                i20 = i13 & 64;
                if (i20 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (c0VarR.K(i10)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 128;
                if (i22 != 0) {
                    if ((i12 & 29360128) == 0) {
                        int i34 = i14;
                        if (c0VarR.K(i11)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i24 = i34 | i23;
                    }
                    i25 = i13 & 256;
                    if (i25 != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (c0VarR.D(jVar)) {
                                i26 = 67108864;
                            } else {
                                i26 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 |= i26;
                        }
                        if ((i24 & 191739611) == 38347922 || !c0VarR.d()) {
                            c0VarR.l0();
                            if ((i12 & 1) != 0 || c0VarR.y()) {
                                if (i32 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var2;
                                }
                                if (i15 != 0) {
                                    str3 = "•";
                                } else {
                                    str3 = str2;
                                }
                                if ((i13 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                    i24 &= -57345;
                                } else {
                                    type04 = y3Var2;
                                }
                                if (i17 != 0) {
                                    jU = androidx.compose.ui.graphics.q0.f38131b.u();
                                } else {
                                    jU = j11;
                                }
                                if (i20 != 0) {
                                    iA = androidx.compose.ui.text.style.v.f42256b.a();
                                } else {
                                    iA = i10;
                                }
                                if (i22 != 0) {
                                    i27 = Integer.MAX_VALUE;
                                } else {
                                    i27 = i11;
                                }
                                if (i25 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                i28 = i27;
                                y3Var3 = type04;
                                j12 = jU;
                                i29 = iA;
                            } else {
                                c0VarR.u();
                                if ((i13 & 16) != 0) {
                                    i24 &= -57345;
                                }
                                i29 = i10;
                                i28 = i11;
                                jVar2 = jVar;
                                a0Var3 = a0Var2;
                                str3 = str2;
                                j12 = j11;
                                y3Var3 = y3Var2;
                            }
                            c0VarR.Z();
                            if (!StringsKt.w3(firstText) || StringsKt.w3(secondText)) {
                                str4 = "";
                            } else {
                                str4 = ' ' + str3 + ' ';
                            }
                            String str6 = firstText + str4 + secondText;
                            c0VarR.E(598373073);
                            if ((i24 & 14) == 4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z10 | z11;
                            objI0 = c0VarR.i0();
                            if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            int i35 = i24 >> 9;
                            c0Var2 = c0VarR;
                            q50.t(str6, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i35 & 896, (i35 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                            str5 = str3;
                            j13 = j12;
                            jVar3 = jVar2;
                            i30 = i29;
                            i31 = i28;
                            y3Var4 = y3Var3;
                        } else {
                            c0VarR.u();
                            i30 = i10;
                            c0Var2 = c0VarR;
                            a0Var3 = a0Var2;
                            str5 = str2;
                            j13 = j11;
                            y3Var4 = y3Var2;
                            i31 = i11;
                            jVar3 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i24 |= 100663296;
                    if ((i24 & 191739611) == 38347922) {
                        c0VarR.l0();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        } else {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        }
                        c0VarR.Z();
                        if (StringsKt.w3(firstText)) {
                            str4 = "";
                        } else {
                            str4 = "";
                        }
                        String str7 = firstText + str4 + secondText;
                        c0VarR.E(598373073);
                        if ((i24 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z10 | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        int i36 = i24 >> 9;
                        c0Var2 = c0VarR;
                        q50.t(str7, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i36 & 896, (i36 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                        str5 = str3;
                        j13 = j12;
                        jVar3 = jVar2;
                        i30 = i29;
                        i31 = i28;
                        y3Var4 = y3Var3;
                    } else {
                        c0VarR.l0();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        } else {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        }
                        c0VarR.Z();
                        if (StringsKt.w3(firstText)) {
                            str4 = "";
                        } else {
                            str4 = "";
                        }
                        String str8 = firstText + str4 + secondText;
                        c0VarR.E(598373073);
                        if ((i24 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z10 | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        int i37 = i24 >> 9;
                        c0Var2 = c0VarR;
                        q50.t(str8, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i37 & 896, (i37 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                        str5 = str3;
                        j13 = j12;
                        jVar3 = jVar2;
                        i30 = i29;
                        i31 = i28;
                        y3Var4 = y3Var3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 12582912;
                i24 = i14;
                i25 = i13 & 256;
                if (i25 != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (c0VarR.D(jVar)) {
                            i26 = 67108864;
                        } else {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 |= i26;
                    }
                    if ((i24 & 191739611) == 38347922) {
                        c0VarR.l0();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        } else {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        }
                        c0VarR.Z();
                        if (StringsKt.w3(firstText)) {
                            str4 = "";
                        } else {
                            str4 = "";
                        }
                        String str9 = firstText + str4 + secondText;
                        c0VarR.E(598373073);
                        if ((i24 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z10 | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        int i38 = i24 >> 9;
                        c0Var2 = c0VarR;
                        q50.t(str9, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i38 & 896, (i38 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                        str5 = str3;
                        j13 = j12;
                        jVar3 = jVar2;
                        i30 = i29;
                        i31 = i28;
                        y3Var4 = y3Var3;
                    } else {
                        c0VarR.l0();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        } else {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        }
                        c0VarR.Z();
                        if (StringsKt.w3(firstText)) {
                            str4 = "";
                        } else {
                            str4 = "";
                        }
                        String str10 = firstText + str4 + secondText;
                        c0VarR.E(598373073);
                        if ((i24 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z10 | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        int i39 = i24 >> 9;
                        c0Var2 = c0VarR;
                        q50.t(str10, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i39 & 896, (i39 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                        str5 = str3;
                        j13 = j12;
                        jVar3 = jVar2;
                        i30 = i29;
                        i31 = i28;
                        y3Var4 = y3Var3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i24 |= 100663296;
                if ((i24 & 191739611) == 38347922) {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str11 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i310 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str11, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i310 & 896, (i310 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                } else {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str12 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i311 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str12, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i311 & 896, (i311 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            str2 = str;
            if ((i12 & 57344) == 0) {
                if ((i13 & 16) == 0) {
                    y3Var2 = y3Var;
                    if (c0VarR.D(y3Var2)) {
                    }
                    i14 |= i33;
                } else {
                    y3Var2 = y3Var;
                }
                i14 |= i33;
            } else {
                y3Var2 = y3Var;
            }
            i17 = i13 & 32;
            if (i17 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i18 = 57344;
                j11 = j10;
            } else {
                i18 = 57344;
                j11 = j10;
                if ((458752 & i12) == 0) {
                    if (c0VarR.L(j11)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i14 |= i19;
                }
            }
            i20 = i13 & 64;
            if (i20 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (c0VarR.K(i10)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i14 |= i21;
            }
            i22 = i13 & 128;
            if (i22 != 0) {
                if ((i12 & 29360128) == 0) {
                    int i312 = i14;
                    if (c0VarR.K(i11)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i24 = i312 | i23;
                }
                i25 = i13 & 256;
                if (i25 != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (c0VarR.D(jVar)) {
                            i26 = 67108864;
                        } else {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 |= i26;
                    }
                    if ((i24 & 191739611) == 38347922) {
                        c0VarR.l0();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        } else {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        }
                        c0VarR.Z();
                        if (StringsKt.w3(firstText)) {
                            str4 = "";
                        } else {
                            str4 = "";
                        }
                        String str13 = firstText + str4 + secondText;
                        c0VarR.E(598373073);
                        if ((i24 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z10 | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        int i313 = i24 >> 9;
                        c0Var2 = c0VarR;
                        q50.t(str13, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i313 & 896, (i313 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                        str5 = str3;
                        j13 = j12;
                        jVar3 = jVar2;
                        i30 = i29;
                        i31 = i28;
                        y3Var4 = y3Var3;
                    } else {
                        c0VarR.l0();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        } else {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        }
                        c0VarR.Z();
                        if (StringsKt.w3(firstText)) {
                            str4 = "";
                        } else {
                            str4 = "";
                        }
                        String str14 = firstText + str4 + secondText;
                        c0VarR.E(598373073);
                        if ((i24 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z10 | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        int i314 = i24 >> 9;
                        c0Var2 = c0VarR;
                        q50.t(str14, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i314 & 896, (i314 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                        str5 = str3;
                        j13 = j12;
                        jVar3 = jVar2;
                        i30 = i29;
                        i31 = i28;
                        y3Var4 = y3Var3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i24 |= 100663296;
                if ((i24 & 191739611) == 38347922) {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str15 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i315 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str15, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i315 & 896, (i315 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                } else {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str16 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i316 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str16, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i316 & 896, (i316 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 12582912;
            i24 = i14;
            i25 = i13 & 256;
            if (i25 != 0) {
                if ((i12 & 234881024) == 0) {
                    if (c0VarR.D(jVar)) {
                        i26 = 67108864;
                    } else {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 |= i26;
                }
                if ((i24 & 191739611) == 38347922) {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str17 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i317 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str17, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i317 & 896, (i317 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                } else {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str18 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i318 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str18, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i318 & 896, (i318 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i24 |= 100663296;
            if ((i24 & 191739611) == 38347922) {
                c0VarR.l0();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                } else {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                }
                c0VarR.Z();
                if (StringsKt.w3(firstText)) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                String str19 = firstText + str4 + secondText;
                c0VarR.E(598373073);
                if ((i24 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i319 = i24 >> 9;
                c0Var2 = c0VarR;
                q50.t(str19, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i319 & 896, (i319 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                str5 = str3;
                j13 = j12;
                jVar3 = jVar2;
                i30 = i29;
                i31 = i28;
                y3Var4 = y3Var3;
            } else {
                c0VarR.l0();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                } else {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                }
                c0VarR.Z();
                if (StringsKt.w3(firstText)) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                String str110 = firstText + str4 + secondText;
                c0VarR.E(598373073);
                if ((i24 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i3110 = i24 >> 9;
                c0Var2 = c0VarR;
                q50.t(str110, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i3110 & 896, (i3110 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                str5 = str3;
                j13 = j12;
                jVar3 = jVar2;
                i30 = i29;
                i31 = i28;
                y3Var4 = y3Var3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= a5.S0;
        a0Var2 = a0Var;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i12 & 7168) == 0) {
                str2 = str;
                if (c0VarR.D(str2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            if ((i12 & 57344) == 0) {
                if ((i13 & 16) == 0) {
                    y3Var2 = y3Var;
                    if (c0VarR.D(y3Var2)) {
                    }
                    i14 |= i33;
                } else {
                    y3Var2 = y3Var;
                }
                i14 |= i33;
            } else {
                y3Var2 = y3Var;
            }
            i17 = i13 & 32;
            if (i17 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i18 = 57344;
                j11 = j10;
            } else {
                i18 = 57344;
                j11 = j10;
                if ((458752 & i12) == 0) {
                    if (c0VarR.L(j11)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i14 |= i19;
                }
            }
            i20 = i13 & 64;
            if (i20 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (c0VarR.K(i10)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i14 |= i21;
            }
            i22 = i13 & 128;
            if (i22 != 0) {
                if ((i12 & 29360128) == 0) {
                    int i3111 = i14;
                    if (c0VarR.K(i11)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i24 = i3111 | i23;
                }
                i25 = i13 & 256;
                if (i25 != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (c0VarR.D(jVar)) {
                            i26 = 67108864;
                        } else {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 |= i26;
                    }
                    if ((i24 & 191739611) == 38347922) {
                        c0VarR.l0();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        } else {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        }
                        c0VarR.Z();
                        if (StringsKt.w3(firstText)) {
                            str4 = "";
                        } else {
                            str4 = "";
                        }
                        String str111 = firstText + str4 + secondText;
                        c0VarR.E(598373073);
                        if ((i24 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z10 | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        int i3112 = i24 >> 9;
                        c0Var2 = c0VarR;
                        q50.t(str111, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i3112 & 896, (i3112 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                        str5 = str3;
                        j13 = j12;
                        jVar3 = jVar2;
                        i30 = i29;
                        i31 = i28;
                        y3Var4 = y3Var3;
                    } else {
                        c0VarR.l0();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        } else {
                            if (i32 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i15 != 0) {
                                str3 = "•";
                            } else {
                                str3 = str2;
                            }
                            if ((i13 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                                i24 &= -57345;
                            } else {
                                type04 = y3Var2;
                            }
                            if (i17 != 0) {
                                jU = androidx.compose.ui.graphics.q0.f38131b.u();
                            } else {
                                jU = j11;
                            }
                            if (i20 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            } else {
                                iA = i10;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i25 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            i28 = i27;
                            y3Var3 = type04;
                            j12 = jU;
                            i29 = iA;
                        }
                        c0VarR.Z();
                        if (StringsKt.w3(firstText)) {
                            str4 = "";
                        } else {
                            str4 = "";
                        }
                        String str112 = firstText + str4 + secondText;
                        c0VarR.E(598373073);
                        if ((i24 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z10 | z11;
                        objI0 = c0VarR.i0();
                        if (z12) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        int i3113 = i24 >> 9;
                        c0Var2 = c0VarR;
                        q50.t(str112, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i3113 & 896, (i3113 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                        str5 = str3;
                        j13 = j12;
                        jVar3 = jVar2;
                        i30 = i29;
                        i31 = i28;
                        y3Var4 = y3Var3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i24 |= 100663296;
                if ((i24 & 191739611) == 38347922) {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str113 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i3114 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str113, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i3114 & 896, (i3114 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                } else {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str114 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i3115 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str114, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i3115 & 896, (i3115 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 12582912;
            i24 = i14;
            i25 = i13 & 256;
            if (i25 != 0) {
                if ((i12 & 234881024) == 0) {
                    if (c0VarR.D(jVar)) {
                        i26 = 67108864;
                    } else {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 |= i26;
                }
                if ((i24 & 191739611) == 38347922) {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str115 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i3116 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str115, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i3116 & 896, (i3116 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                } else {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str116 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i3117 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str116, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i3117 & 896, (i3117 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i24 |= 100663296;
            if ((i24 & 191739611) == 38347922) {
                c0VarR.l0();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                } else {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                }
                c0VarR.Z();
                if (StringsKt.w3(firstText)) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                String str117 = firstText + str4 + secondText;
                c0VarR.E(598373073);
                if ((i24 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i3118 = i24 >> 9;
                c0Var2 = c0VarR;
                q50.t(str117, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i3118 & 896, (i3118 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                str5 = str3;
                j13 = j12;
                jVar3 = jVar2;
                i30 = i29;
                i31 = i28;
                y3Var4 = y3Var3;
            } else {
                c0VarR.l0();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                } else {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                }
                c0VarR.Z();
                if (StringsKt.w3(firstText)) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                String str118 = firstText + str4 + secondText;
                c0VarR.E(598373073);
                if ((i24 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i3119 = i24 >> 9;
                c0Var2 = c0VarR;
                q50.t(str118, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i3119 & 896, (i3119 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                str5 = str3;
                j13 = j12;
                jVar3 = jVar2;
                i30 = i29;
                i31 = i28;
                y3Var4 = y3Var3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 3072;
        str2 = str;
        if ((i12 & 57344) == 0) {
            if ((i13 & 16) == 0) {
                y3Var2 = y3Var;
                if (c0VarR.D(y3Var2)) {
                }
                i14 |= i33;
            } else {
                y3Var2 = y3Var;
            }
            i14 |= i33;
        } else {
            y3Var2 = y3Var;
        }
        i17 = i13 & 32;
        if (i17 != 0) {
            i14 |= androidx.profileinstaller.n.c.f73814m;
            i18 = 57344;
            j11 = j10;
        } else {
            i18 = 57344;
            j11 = j10;
            if ((458752 & i12) == 0) {
                if (c0VarR.L(j11)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i14 |= i19;
            }
        }
        i20 = i13 & 64;
        if (i20 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (c0VarR.K(i10)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i14 |= i21;
        }
        i22 = i13 & 128;
        if (i22 != 0) {
            if ((i12 & 29360128) == 0) {
                int i31110 = i14;
                if (c0VarR.K(i11)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i24 = i31110 | i23;
            }
            i25 = i13 & 256;
            if (i25 != 0) {
                if ((i12 & 234881024) == 0) {
                    if (c0VarR.D(jVar)) {
                        i26 = 67108864;
                    } else {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 |= i26;
                }
                if ((i24 & 191739611) == 38347922) {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str119 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i31111 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str119, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i31111 & 896, (i31111 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                } else {
                    c0VarR.l0();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    } else {
                        if (i32 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i15 != 0) {
                            str3 = "•";
                        } else {
                            str3 = str2;
                        }
                        if ((i13 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                            i24 &= -57345;
                        } else {
                            type04 = y3Var2;
                        }
                        if (i17 != 0) {
                            jU = androidx.compose.ui.graphics.q0.f38131b.u();
                        } else {
                            jU = j11;
                        }
                        if (i20 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        } else {
                            iA = i10;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i25 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        i28 = i27;
                        y3Var3 = type04;
                        j12 = jU;
                        i29 = iA;
                    }
                    c0VarR.Z();
                    if (StringsKt.w3(firstText)) {
                        str4 = "";
                    } else {
                        str4 = "";
                    }
                    String str1110 = firstText + str4 + secondText;
                    c0VarR.E(598373073);
                    if ((i24 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z10 | z11;
                    objI0 = c0VarR.i0();
                    if (z12) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i31112 = i24 >> 9;
                    c0Var2 = c0VarR;
                    q50.t(str1110, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i31112 & 896, (i31112 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                    str5 = str3;
                    j13 = j12;
                    jVar3 = jVar2;
                    i30 = i29;
                    i31 = i28;
                    y3Var4 = y3Var3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i24 |= 100663296;
            if ((i24 & 191739611) == 38347922) {
                c0VarR.l0();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                } else {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                }
                c0VarR.Z();
                if (StringsKt.w3(firstText)) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                String str1111 = firstText + str4 + secondText;
                c0VarR.E(598373073);
                if ((i24 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i31113 = i24 >> 9;
                c0Var2 = c0VarR;
                q50.t(str1111, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i31113 & 896, (i31113 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                str5 = str3;
                j13 = j12;
                jVar3 = jVar2;
                i30 = i29;
                i31 = i28;
                y3Var4 = y3Var3;
            } else {
                c0VarR.l0();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                } else {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                }
                c0VarR.Z();
                if (StringsKt.w3(firstText)) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                String str1112 = firstText + str4 + secondText;
                c0VarR.E(598373073);
                if ((i24 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i31114 = i24 >> 9;
                c0Var2 = c0VarR;
                q50.t(str1112, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i31114 & 896, (i31114 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                str5 = str3;
                j13 = j12;
                jVar3 = jVar2;
                i30 = i29;
                i31 = i28;
                y3Var4 = y3Var3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 12582912;
        i24 = i14;
        i25 = i13 & 256;
        if (i25 != 0) {
            if ((i12 & 234881024) == 0) {
                if (c0VarR.D(jVar)) {
                    i26 = 67108864;
                } else {
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i24 |= i26;
            }
            if ((i24 & 191739611) == 38347922) {
                c0VarR.l0();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                } else {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                }
                c0VarR.Z();
                if (StringsKt.w3(firstText)) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                String str1113 = firstText + str4 + secondText;
                c0VarR.E(598373073);
                if ((i24 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i31115 = i24 >> 9;
                c0Var2 = c0VarR;
                q50.t(str1113, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i31115 & 896, (i31115 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                str5 = str3;
                j13 = j12;
                jVar3 = jVar2;
                i30 = i29;
                i31 = i28;
                y3Var4 = y3Var3;
            } else {
                c0VarR.l0();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                } else {
                    if (i32 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        str3 = "•";
                    } else {
                        str3 = str2;
                    }
                    if ((i13 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                        i24 &= -57345;
                    } else {
                        type04 = y3Var2;
                    }
                    if (i17 != 0) {
                        jU = androidx.compose.ui.graphics.q0.f38131b.u();
                    } else {
                        jU = j11;
                    }
                    if (i20 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    } else {
                        iA = i10;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i25 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    i28 = i27;
                    y3Var3 = type04;
                    j12 = jU;
                    i29 = iA;
                }
                c0VarR.Z();
                if (StringsKt.w3(firstText)) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                String str1114 = firstText + str4 + secondText;
                c0VarR.E(598373073);
                if ((i24 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11;
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i31116 = i24 >> 9;
                c0Var2 = c0VarR;
                q50.t(str1114, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i31116 & 896, (i31116 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
                str5 = str3;
                j13 = j12;
                jVar3 = jVar2;
                i30 = i29;
                i31 = i28;
                y3Var4 = y3Var3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i24 |= 100663296;
        if ((i24 & 191739611) == 38347922) {
            c0VarR.l0();
            if ((i12 & 1) != 0) {
                if (i32 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    str3 = "•";
                } else {
                    str3 = str2;
                }
                if ((i13 & 16) != 0) {
                    type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                    i24 &= -57345;
                } else {
                    type04 = y3Var2;
                }
                if (i17 != 0) {
                    jU = androidx.compose.ui.graphics.q0.f38131b.u();
                } else {
                    jU = j11;
                }
                if (i20 != 0) {
                    iA = androidx.compose.ui.text.style.v.f42256b.a();
                } else {
                    iA = i10;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i25 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                i28 = i27;
                y3Var3 = type04;
                j12 = jU;
                i29 = iA;
            } else {
                if (i32 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    str3 = "•";
                } else {
                    str3 = str2;
                }
                if ((i13 & 16) != 0) {
                    type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                    i24 &= -57345;
                } else {
                    type04 = y3Var2;
                }
                if (i17 != 0) {
                    jU = androidx.compose.ui.graphics.q0.f38131b.u();
                } else {
                    jU = j11;
                }
                if (i20 != 0) {
                    iA = androidx.compose.ui.text.style.v.f42256b.a();
                } else {
                    iA = i10;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i25 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                i28 = i27;
                y3Var3 = type04;
                j12 = jU;
                i29 = iA;
            }
            c0VarR.Z();
            if (StringsKt.w3(firstText)) {
                str4 = "";
            } else {
                str4 = "";
            }
            String str1115 = firstText + str4 + secondText;
            c0VarR.E(598373073);
            if ((i24 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z10 | z11;
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            int i31117 = i24 >> 9;
            c0Var2 = c0VarR;
            q50.t(str1115, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i31117 & 896, (i31117 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
            str5 = str3;
            j13 = j12;
            jVar3 = jVar2;
            i30 = i29;
            i31 = i28;
            y3Var4 = y3Var3;
        } else {
            c0VarR.l0();
            if ((i12 & 1) != 0) {
                if (i32 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    str3 = "•";
                } else {
                    str3 = str2;
                }
                if ((i13 & 16) != 0) {
                    type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                    i24 &= -57345;
                } else {
                    type04 = y3Var2;
                }
                if (i17 != 0) {
                    jU = androidx.compose.ui.graphics.q0.f38131b.u();
                } else {
                    jU = j11;
                }
                if (i20 != 0) {
                    iA = androidx.compose.ui.text.style.v.f42256b.a();
                } else {
                    iA = i10;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i25 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                i28 = i27;
                y3Var3 = type04;
                j12 = jU;
                i29 = iA;
            } else {
                if (i32 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    str3 = "•";
                } else {
                    str3 = str2;
                }
                if ((i13 & 16) != 0) {
                    type04 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04();
                    i24 &= -57345;
                } else {
                    type04 = y3Var2;
                }
                if (i17 != 0) {
                    jU = androidx.compose.ui.graphics.q0.f38131b.u();
                } else {
                    jU = j11;
                }
                if (i20 != 0) {
                    iA = androidx.compose.ui.text.style.v.f42256b.a();
                } else {
                    iA = i10;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i25 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                i28 = i27;
                y3Var3 = type04;
                j12 = jU;
                i29 = iA;
            }
            c0VarR.Z();
            if (StringsKt.w3(firstText)) {
                str4 = "";
            } else {
                str4 = "";
            }
            String str1116 = firstText + str4 + secondText;
            c0VarR.E(598373073);
            if ((i24 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i24 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z10 | z11;
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.z2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            int i31118 = i24 >> 9;
            c0Var2 = c0VarR;
            q50.t(str1116, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, jVar2, 0L, i29, false, i28, 0, null, y3Var3, c0Var2, i31118 & 896, (i31118 & i18) | ((i24 >> 24) & 14) | ((i24 >> 12) & 896) | ((i24 << 9) & 29360128), 109560);
            str5 = str3;
            j13 = j12;
            jVar3 = jVar2;
            i30 = i29;
            i31 = i28;
            y3Var4 = y3Var3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, a0Var3, str5, y3Var4, j13, i30, i31, jVar3, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void TextWithSeparatorFirstEmptyPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1116705163);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m160getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.d3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextWithSeparatorKt.TextWithSeparatorFirstEmptyPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparatorFirstEmptyPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextWithSeparatorFirstEmptyPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void TextWithSeparatorPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1364601736);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m158getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.b3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextWithSeparatorKt.TextWithSeparatorPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparatorPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextWithSeparatorPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void TextWithSeparatorSecondEmptyPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1899699287);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m159getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.c3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextWithSeparatorKt.TextWithSeparatorSecondEmptyPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparatorSecondEmptyPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextWithSeparatorSecondEmptyPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparator_wV1YYcM$lambda$1$lambda$0(String firstText, String secondText, androidx.compose.ui.semantics.e0 semantics) {
        Intrinsics.checkNotNullParameter(firstText, "$firstText");
        Intrinsics.checkNotNullParameter(secondText, "$secondText");
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.b0.v1(semantics, firstText + ' ' + secondText);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparator_wV1YYcM$lambda$2(String firstText, String secondText, androidx.compose.ui.a0 a0Var, String str, y3 y3Var, long j10, int i10, int i11, androidx.compose.ui.text.style.j jVar, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        Intrinsics.checkNotNullParameter(firstText, "$firstText");
        Intrinsics.checkNotNullParameter(secondText, "$secondText");
        m171TextWithSeparatorwV1YYcM(firstText, secondText, a0Var, str, y3Var, j10, i10, i11, jVar, c0Var, t4.a(i12 | 1), i13);
        return Unit.f312394a;
    }
}
