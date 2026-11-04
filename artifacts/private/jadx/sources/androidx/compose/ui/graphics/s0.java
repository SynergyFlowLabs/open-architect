package androidx.compose.ui.graphics;

import androidx.compose.runtime.k7;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,659:1\n583#1:986\n583#1:987\n583#1:988\n635#1:1003\n65#2,10:660\n65#2,10:670\n65#2,10:680\n65#2,10:690\n65#2,10:708\n65#2,10:756\n65#2,10:804\n65#2,10:852\n65#2,10:976\n65#2,10:993\n34#3,4:700\n34#3,4:704\n34#3,4:989\n535#4,38:718\n535#4,38:766\n535#4,38:814\n535#4,38:862\n535#4,38:900\n535#4,38:938\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n568#1:986\n569#1:987\n570#1:988\n646#1:1003\n387#1:660,10\n388#1:670,10\n389#1:680,10\n390#1:690,10\n403#1:708,10\n404#1:756,10\n405#1:804,10\n406#1:852,10\n537#1:976,10\n617#1:993,10\n394#1:700,4\n399#1:704,4\n607#1:989,4\n403#1:718,38\n404#1:766,38\n405#1:814,38\n441#1:862,38\n442#1:900,38\n443#1:938,38\n*E\n"})
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f38176a = 16;

    /* JADX WARN: Code duplicated, block: B:100:0x0154  */
    /* JADX WARN: Code duplicated, block: B:101:0x0158  */
    /* JADX WARN: Code duplicated, block: B:103:0x015e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0168  */
    /* JADX WARN: Code duplicated, block: B:110:0x0182  */
    /* JADX WARN: Code duplicated, block: B:114:0x0189  */
    /* JADX WARN: Code duplicated, block: B:117:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0198  */
    /* JADX WARN: Code duplicated, block: B:120:0x019e  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x012f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:91:0x0138  */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0144  */
    /* JADX WARN: Code duplicated, block: B:98:0x014d  */
    @k7
    public static final long a(float f10, float f11, float f12, float f13, @NotNull androidx.compose.ui.graphics.colorspace.c cVar) {
        int i10;
        int i11;
        int i12;
        float f14;
        float fE;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f15;
        float fE2;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        float f16;
        if (cVar.i()) {
            float f17 = f13 < 0.0f ? 0.0f : f13;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i29 = ((int) ((f17 * 255.0f) + 0.5f)) << 24;
            float f18 = f10 < 0.0f ? 0.0f : f10;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            int i30 = i29 | (((int) ((f18 * 255.0f) + 0.5f)) << 16);
            float f19 = f11 < 0.0f ? 0.0f : f11;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            int i31 = i30 | (((int) ((f19 * 255.0f) + 0.5f)) << 8);
            f16 = f12 >= 0.0f ? f12 : 0.0f;
            return q0.t(kotlin.y1.n(kotlin.y1.n(i31 | ((int) (((f16 <= 1.0f ? f16 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        int i32 = 0;
        if (!(cVar.c() == 3)) {
            w1.b("Color only works with ColorSpaces with 3 components");
        }
        int iD = cVar.d();
        if (!(iD != -1)) {
            w1.b("Unknown color space, please use a color space in ColorSpaces");
        }
        float f20 = cVar.f(0);
        float fE3 = cVar.e(0);
        if (f10 >= f20) {
            f20 = f10;
        }
        if (f20 <= fE3) {
            fE3 = f20;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fE3);
        int i33 = iFloatToRawIntBits3 >>> 31;
        int i34 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i35 = iFloatToRawIntBits3 & 8388607;
        if (i34 == 255) {
            i11 = i35 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i34 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else {
                if (i10 > 0) {
                    int i36 = i35 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i36) + 1) | (i33 << 15);
                    } else {
                        i11 = i36;
                    }
                    short s10 = (short) i12;
                    f14 = cVar.f(1);
                    fE = cVar.e(1);
                    if (f11 >= f14) {
                        f14 = f11;
                    }
                    if (f14 <= fE) {
                        fE = f14;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fE);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i16 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                f15 = cVar.f(2);
                                fE2 = cVar.e(2);
                                if (f12 >= f15) {
                                    f15 = f12;
                                }
                                if (f15 <= fE2) {
                                    fE2 = f15;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i26 = i23 != 0 ? 512 : 0;
                                    i32 = 31;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i26 = 0;
                                        i32 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i25 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                            } else {
                                                i26 = i25;
                                                i32 = i24;
                                            }
                                            short s12 = (short) i27;
                                            f16 = f13 >= 0.0f ? f13 : 0.0f;
                                            return q0.t(kotlin.y1.n((((long) iD) & 63) | ((((long) s10) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s11) & okhttp3.internal.ws.g.f334653t) << 32) | ((okhttp3.internal.ws.g.f334653t & ((long) s12)) << 16) | ((((long) ((int) (((f16 <= 1.0f ? f16 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                                        }
                                        if (i24 >= -10) {
                                            i28 = (i23 | 8388608) >> (1 - i24);
                                            if ((i28 & 4096) != 0) {
                                                i28 += 8192;
                                            }
                                            i26 = i28 >> 13;
                                        } else {
                                            i26 = 0;
                                        }
                                    }
                                }
                                i27 = i26 | (i21 << 15) | (i32 << 10);
                                short s13 = (short) i27;
                                if (f13 >= 0.0f) {
                                }
                                return q0.t(kotlin.y1.n((((long) iD) & 63) | ((((long) s10) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s11) & okhttp3.internal.ws.g.f334653t) << 32) | ((okhttp3.internal.ws.g.f334653t & ((long) s13)) << 16) | ((((long) ((int) (((f16 <= 1.0f ? f16 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s14 = (short) i19;
                    f15 = cVar.f(2);
                    fE2 = cVar.e(2);
                    if (f12 >= f15) {
                        f15 = f12;
                    }
                    if (f15 <= fE2) {
                        fE2 = f15;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i26 = i23 != 0 ? 512 : 0;
                        i32 = 31;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i26 = 0;
                            i32 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i26 = i25;
                                    i32 = i24;
                                }
                                short s15 = (short) i27;
                                if (f13 >= 0.0f) {
                                }
                                return q0.t(kotlin.y1.n((((long) iD) & 63) | ((((long) s10) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s14) & okhttp3.internal.ws.g.f334653t) << 32) | ((okhttp3.internal.ws.g.f334653t & ((long) s15)) << 16) | ((((long) ((int) (((f16 <= 1.0f ? f16 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i24 >= -10) {
                                i28 = (i23 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                            } else {
                                i26 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i21 << 15) | (i32 << 10);
                    short s16 = (short) i27;
                    if (f13 >= 0.0f) {
                    }
                    return q0.t(kotlin.y1.n((((long) iD) & 63) | ((((long) s10) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s14) & okhttp3.internal.ws.g.f334653t) << 32) | ((okhttp3.internal.ws.g.f334653t & ((long) s16)) << 16) | ((((long) ((int) (((f16 <= 1.0f ? f16 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i10 >= -10) {
                    int i37 = (i35 | 8388608) >> (1 - i10);
                    if ((i37 & 4096) != 0) {
                        i37 += 8192;
                    }
                    i11 = i37 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i33 << 15) | (i10 << 10);
        short s17 = (short) i12;
        f14 = cVar.f(1);
        fE = cVar.e(1);
        if (f11 >= f14) {
            f14 = f11;
        }
        if (f14 <= fE) {
            fE = f14;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fE);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i16 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s18 = (short) i19;
                    f15 = cVar.f(2);
                    fE2 = cVar.e(2);
                    if (f12 >= f15) {
                        f15 = f12;
                    }
                    if (f15 <= fE2) {
                        fE2 = f15;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i26 = i23 != 0 ? 512 : 0;
                        i32 = 31;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i26 = 0;
                            i32 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i26 = i25;
                                    i32 = i24;
                                }
                                short s19 = (short) i27;
                                if (f13 >= 0.0f) {
                                }
                                return q0.t(kotlin.y1.n((((long) iD) & 63) | ((((long) s17) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s18) & okhttp3.internal.ws.g.f334653t) << 32) | ((okhttp3.internal.ws.g.f334653t & ((long) s19)) << 16) | ((((long) ((int) (((f16 <= 1.0f ? f16 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i24 >= -10) {
                                i28 = (i23 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                            } else {
                                i26 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i21 << 15) | (i32 << 10);
                    short s110 = (short) i27;
                    if (f13 >= 0.0f) {
                    }
                    return q0.t(kotlin.y1.n((((long) iD) & 63) | ((((long) s17) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s18) & okhttp3.internal.ws.g.f334653t) << 32) | ((okhttp3.internal.ws.g.f334653t & ((long) s110)) << 16) | ((((long) ((int) (((f16 <= 1.0f ? f16 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s111 = (short) i19;
        f15 = cVar.f(2);
        fE2 = cVar.e(2);
        if (f12 >= f15) {
            f15 = f12;
        }
        if (f15 <= fE2) {
            fE2 = f15;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i26 = i23 != 0 ? 512 : 0;
            i32 = 31;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i26 = 0;
                i32 = 49;
            } else {
                if (i24 <= 0) {
                    i25 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                    } else {
                        i26 = i25;
                        i32 = i24;
                    }
                    short s112 = (short) i27;
                    if (f13 >= 0.0f) {
                    }
                    return q0.t(kotlin.y1.n((((long) iD) & 63) | ((((long) s17) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s111) & okhttp3.internal.ws.g.f334653t) << 32) | ((okhttp3.internal.ws.g.f334653t & ((long) s112)) << 16) | ((((long) ((int) (((f16 <= 1.0f ? f16 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i24 >= -10) {
                    i28 = (i23 | 8388608) >> (1 - i24);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i26 = i28 >> 13;
                } else {
                    i26 = 0;
                }
            }
        }
        i27 = i26 | (i21 << 15) | (i32 << 10);
        short s113 = (short) i27;
        if (f13 >= 0.0f) {
        }
        return q0.t(kotlin.y1.n((((long) iD) & 63) | ((((long) s17) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s111) & okhttp3.internal.ws.g.f334653t) << 32) | ((okhttp3.internal.ws.g.f334653t & ((long) s113)) << 16) | ((((long) ((int) (((f16 <= 1.0f ? f16 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
    }

    @k7
    public static final long b(@androidx.annotation.l int i10) {
        return q0.t(kotlin.y1.n(kotlin.y1.n(i10) << 32));
    }

    @k7
    public static final long c(@androidx.annotation.g0(from = 0, to = androidx.collection.b3.f12144d) int i10, @androidx.annotation.g0(from = 0, to = androidx.collection.b3.f12144d) int i11, @androidx.annotation.g0(from = 0, to = androidx.collection.b3.f12144d) int i12, @androidx.annotation.g0(from = 0, to = androidx.collection.b3.f12144d) int i13) {
        return b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    @k7
    public static final long d(long j10) {
        return q0.t(kotlin.y1.n(j10 << 32));
    }

    public static /* synthetic */ long e(float f10, float f11, float f12, float f13, androidx.compose.ui.graphics.colorspace.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            cVar = androidx.compose.ui.graphics.colorspace.k.f37611a.K();
        }
        return a(f10, f11, f12, f13, cVar);
    }

    public static /* synthetic */ long f(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return c(i10, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122  */
    @k7
    public static final long g(float f10, float f11, float f12, float f13, @NotNull androidx.compose.ui.graphics.colorspace.c cVar) {
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        if (cVar.i()) {
            return q0.t(kotlin.y1.n(kotlin.y1.n((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f))) << 32));
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f10);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        int i30 = 49;
        int i31 = 0;
        if (i28 == 255) {
            i11 = i29 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i28 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else {
                if (i10 > 0) {
                    int i32 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i32) + 1) | (i27 << 15);
                    } else {
                        i11 = i32;
                    }
                    short s10 = (short) i12;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i16 = 49;
                            i18 = 0;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i24 = i22 - 112;
                                    if (i24 < 31) {
                                        if (i24 <= 0) {
                                            i31 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i25 = (((i24 << 10) | i31) + 1) | (i21 << 15);
                                            } else {
                                                i30 = i24;
                                            }
                                        } else if (i24 >= -10) {
                                            i26 = (i23 | 8388608) >> (1 - i24);
                                            if ((i26 & 4096) != 0) {
                                                i26 += 8192;
                                            }
                                            i30 = 0;
                                            i31 = i26 >> 13;
                                        } else {
                                            i30 = 0;
                                        }
                                    }
                                    return q0.t(kotlin.y1.n(((((long) ((short) i25)) & okhttp3.internal.ws.g.f334653t) << 16) | ((((long) s10) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s11) & okhttp3.internal.ws.g.f334653t) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.d()) & 63)));
                                }
                                i31 = i23 == 0 ? 0 : 512;
                                i30 = 31;
                                i25 = (i21 << 15) | (i30 << 10) | i31;
                                return q0.t(kotlin.y1.n(((((long) ((short) i25)) & okhttp3.internal.ws.g.f334653t) << 16) | ((((long) s10) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s11) & okhttp3.internal.ws.g.f334653t) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.d()) & 63)));
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s12 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i24 = i22 - 112;
                        if (i24 < 31) {
                            if (i24 <= 0) {
                                i31 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i31) + 1) | (i21 << 15);
                                } else {
                                    i30 = i24;
                                }
                            } else if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i30 = 0;
                                i31 = i26 >> 13;
                            } else {
                                i30 = 0;
                            }
                        }
                        return q0.t(kotlin.y1.n(((((long) ((short) i25)) & okhttp3.internal.ws.g.f334653t) << 16) | ((((long) s10) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s12) & okhttp3.internal.ws.g.f334653t) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.d()) & 63)));
                    }
                    i31 = i23 == 0 ? 0 : 512;
                    i30 = 31;
                    i25 = (i21 << 15) | (i30 << 10) | i31;
                    return q0.t(kotlin.y1.n(((((long) ((short) i25)) & okhttp3.internal.ws.g.f334653t) << 16) | ((((long) s10) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s12) & okhttp3.internal.ws.g.f334653t) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.d()) & 63)));
                }
                if (i10 >= -10) {
                    int i33 = (i29 | 8388608) >> (1 - i10);
                    if ((i33 & 4096) != 0) {
                        i33 += 8192;
                    }
                    i11 = i33 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i27 << 15) | (i10 << 10);
        short s13 = (short) i12;
        iFloatToRawIntBits = Float.floatToRawIntBits(f11);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i16 = 49;
                i18 = 0;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s14 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i24 = i22 - 112;
                        if (i24 < 31) {
                            if (i24 <= 0) {
                                i31 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i31) + 1) | (i21 << 15);
                                } else {
                                    i30 = i24;
                                }
                            } else if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i30 = 0;
                                i31 = i26 >> 13;
                            } else {
                                i30 = 0;
                            }
                        }
                        return q0.t(kotlin.y1.n(((((long) ((short) i25)) & okhttp3.internal.ws.g.f334653t) << 16) | ((((long) s13) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s14) & okhttp3.internal.ws.g.f334653t) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.d()) & 63)));
                    }
                    i31 = i23 == 0 ? 0 : 512;
                    i30 = 31;
                    i25 = (i21 << 15) | (i30 << 10) | i31;
                    return q0.t(kotlin.y1.n(((((long) ((short) i25)) & okhttp3.internal.ws.g.f334653t) << 16) | ((((long) s13) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s14) & okhttp3.internal.ws.g.f334653t) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.d()) & 63)));
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s15 = (short) i19;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i24 = i22 - 112;
            if (i24 < 31) {
                if (i24 <= 0) {
                    i31 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i25 = (((i24 << 10) | i31) + 1) | (i21 << 15);
                    } else {
                        i30 = i24;
                    }
                } else if (i24 >= -10) {
                    i26 = (i23 | 8388608) >> (1 - i24);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i30 = 0;
                    i31 = i26 >> 13;
                } else {
                    i30 = 0;
                }
            }
            return q0.t(kotlin.y1.n(((((long) ((short) i25)) & okhttp3.internal.ws.g.f334653t) << 16) | ((((long) s13) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s15) & okhttp3.internal.ws.g.f334653t) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.d()) & 63)));
        }
        i31 = i23 == 0 ? 0 : 512;
        i30 = 31;
        i25 = (i21 << 15) | (i30 << 10) | i31;
        return q0.t(kotlin.y1.n(((((long) ((short) i25)) & okhttp3.internal.ws.g.f334653t) << 16) | ((((long) s13) & okhttp3.internal.ws.g.f334653t) << 48) | ((((long) s15) & okhttp3.internal.ws.g.f334653t) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.d()) & 63)));
    }

    public static /* synthetic */ long h(float f10, float f11, float f12, float f13, androidx.compose.ui.graphics.colorspace.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            cVar = androidx.compose.ui.graphics.colorspace.k.f37611a.K();
        }
        return g(f10, f11, f12, f13, cVar);
    }

    private static final float i(float f10, float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        return ((f10 * f12) + ((f11 * f13) * (1.0f - f12))) / f14;
    }

    @k7
    public static final long j(long j10, long j11) {
        long jU = q0.u(j10, q0.E(j11));
        float fA = q0.A(j11);
        float fA2 = q0.A(jU);
        float f10 = 1.0f - fA2;
        float f11 = (fA * f10) + fA2;
        float f12 = 0.0f;
        float fI = f11 == 0.0f ? 0.0f : ((q0.I(jU) * fA2) + ((q0.I(j11) * fA) * f10)) / f11;
        float fG = f11 == 0.0f ? 0.0f : ((q0.G(jU) * fA2) + ((q0.G(j11) * fA) * f10)) / f11;
        float fC = q0.C(jU);
        float fC2 = q0.C(j11);
        if (f11 != 0.0f) {
            f12 = ((fC * fA2) + ((fC2 * fA) * f10)) / f11;
        }
        return g(fI, fG, f12, f11, q0.E(j11));
    }

    @androidx.annotation.d1(4)
    private static final float[] k(long j10) {
        return new float[]{q0.I(j10), q0.G(j10), q0.C(j10), q0.A(j10)};
    }

    @kotlin.a1
    public static /* synthetic */ void l() {
    }

    public static final boolean m(long j10) {
        return j10 != 16;
    }

    @k7
    public static /* synthetic */ void n(long j10) {
    }

    public static final boolean o(long j10) {
        return j10 == 16;
    }

    @k7
    public static /* synthetic */ void p(long j10) {
    }

    @k7
    public static final long q(long j10, long j11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        androidx.compose.ui.graphics.colorspace.c cVarH = androidx.compose.ui.graphics.colorspace.k.f37611a.H();
        long jU = q0.u(j10, cVarH);
        long jU2 = q0.u(j11, cVarH);
        float fA = q0.A(jU);
        float fI = q0.I(jU);
        float fG = q0.G(jU);
        float fC = q0.C(jU);
        float fA2 = q0.A(jU2);
        float fI2 = q0.I(jU2);
        float fG2 = q0.G(jU2);
        float fC2 = q0.C(jU2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return q0.u(g(androidx.compose.ui.util.e.r(fI, fI2, f10), androidx.compose.ui.util.e.r(fG, fG2, f10), androidx.compose.ui.util.e.r(fC, fC2, f10), androidx.compose.ui.util.e.r(fA, fA2, f10), cVarH), q0.E(j11));
    }

    @k7
    public static final float r(long j10) {
        androidx.compose.ui.graphics.colorspace.c cVarE = q0.E(j10);
        if (!androidx.compose.ui.graphics.colorspace.b.h(cVarE.g(), androidx.compose.ui.graphics.colorspace.b.f37572b.c())) {
            w1.b("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) androidx.compose.ui.graphics.colorspace.b.l(cVarE.g())));
        }
        Intrinsics.checkNotNull(cVarE, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        androidx.compose.ui.graphics.colorspace.n nVarL = ((androidx.compose.ui.graphics.colorspace.j0) cVarE).L();
        float fA = (float) ((nVarL.a(q0.I(j10)) * 0.2126d) + (nVarL.a(q0.G(j10)) * 0.7152d) + (nVarL.a(q0.C(j10)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final long s(long j10, @NotNull Function0<q0> function0) {
        return j10 != 16 ? j10 : function0.invoke().M();
    }

    @androidx.annotation.l
    @k7
    public static final int t(long j10) {
        return (int) kotlin.y1.n(q0.u(j10, androidx.compose.ui.graphics.colorspace.k.f37611a.K()) >>> 32);
    }
}
