package androidx.compose.ui.spatial;

import androidx.compose.runtime.internal.w0;
import com.rabbitmq.client.k0;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.h0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import pj.n;
import pj.o;
import pj.p;
import pj.q;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 3 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n*L\n1#1,1024:1\n102#1,8:1025\n837#2:1033\n837#2:1034\n853#2:1035\n926#2:1036\n854#2:1037\n926#2:1038\n855#2:1039\n926#2:1040\n856#2,3:1041\n860#2:1044\n884#2,2:1045\n860#2:1047\n860#2:1048\n837#2:1049\n837#2:1050\n873#2:1051\n860#2:1052\n878#2,2:1053\n880#2:1056\n860#2:1057\n837#2:1058\n837#2:1059\n873#2:1060\n893#2:1061\n895#2:1062\n868#2:1063\n853#2:1064\n926#2:1065\n854#2:1066\n926#2:1067\n855#2:1068\n926#2:1069\n856#2,3:1070\n860#2:1073\n862#2:1074\n865#2:1075\n862#2:1076\n893#2,3:1077\n837#2:1080\n893#2,3:1081\n837#2:1084\n873#2:1085\n865#2:1086\n868#2:1087\n860#2:1088\n873#2:1089\n860#2:1090\n893#2:1091\n895#2:1092\n893#2:1093\n895#2:1094\n860#2:1095\n860#2:1096\n860#2:1097\n860#2:1098\n837#2:1099\n837#2:1100\n916#2,2:1101\n860#2:1103\n837#2:1104\n837#2:1105\n889#2:1106\n916#2,2:1107\n860#2:1109\n860#2:1110\n893#2:1111\n895#2:1112\n893#2:1113\n895#2:1114\n837#2:1115\n916#2,2:1116\n860#2:1118\n916#2,2:1119\n893#2:1121\n895#2:1122\n893#2:1123\n895#2:1124\n860#2:1125\n893#2:1126\n895#2:1127\n893#2:1128\n895#2:1129\n860#2:1130\n893#2:1131\n895#2:1132\n893#2:1133\n895#2:1134\n893#2:1135\n895#2:1136\n893#2:1137\n895#2:1138\n860#2:1139\n875#2:1140\n891#2:1141\n860#2:1142\n860#2:1143\n862#2:1144\n893#2:1145\n895#2:1146\n893#2:1147\n895#2:1148\n545#3:1055\n*S KotlinDebug\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n148#1:1025,8\n151#1:1033\n152#1:1034\n154#1:1035\n154#1:1036\n154#1:1037\n154#1:1038\n154#1:1039\n154#1:1040\n154#1:1041,3\n176#1:1044\n183#1:1045,2\n205#1:1047\n234#1:1048\n235#1:1049\n236#1:1050\n237#1:1051\n260#1:1052\n261#1:1053,2\n261#1:1056\n284#1:1057\n286#1:1058\n287#1:1059\n288#1:1060\n289#1:1061\n290#1:1062\n292#1:1063\n305#1:1064\n305#1:1065\n305#1:1066\n305#1:1067\n305#1:1068\n305#1:1069\n305#1:1070,3\n344#1:1073\n345#1:1074\n346#1:1075\n352#1:1076\n355#1:1077,3\n355#1:1080\n357#1:1081,3\n357#1:1084\n358#1:1085\n359#1:1086\n363#1:1087\n379#1:1088\n380#1:1089\n396#1:1090\n400#1:1091\n401#1:1092\n402#1:1093\n403#1:1094\n421#1:1095\n440#1:1096\n462#1:1097\n479#1:1098\n492#1:1099\n493#1:1100\n501#1:1101,2\n505#1:1103\n517#1:1104\n518#1:1105\n525#1:1106\n529#1:1107,2\n533#1:1109\n550#1:1110\n551#1:1111\n552#1:1112\n553#1:1113\n554#1:1114\n566#1:1115\n574#1:1116,2\n576#1:1118\n605#1:1119,2\n607#1:1121\n608#1:1122\n609#1:1123\n610#1:1124\n611#1:1125\n643#1:1126\n644#1:1127\n645#1:1128\n646#1:1129\n688#1:1130\n689#1:1131\n690#1:1132\n691#1:1133\n692#1:1134\n723#1:1135\n724#1:1136\n725#1:1137\n726#1:1138\n736#1:1139\n773#1:1140\n785#1:1141\n788#1:1142\n803#1:1143\n804#1:1144\n805#1:1145\n806#1:1146\n807#1:1147\n808#1:1148\n261#1:1055\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41233d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f41234a = new long[192];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f41235b = new long[192];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public int f41236c;

    private final void A(long j10, int i10, int i11) {
        int i12;
        char c10;
        char c11;
        long[] jArr = this.f41234a;
        long[] jArr2 = this.f41235b;
        int iN = n();
        jArr2[0] = j10;
        int i13 = 1;
        while (i13 > 0) {
            i13--;
            long j11 = jArr2[i13];
            int i14 = e.f41245c;
            int i15 = ((int) j11) & e.f41245c;
            char c12 = 26;
            int i16 = ((int) (j11 >> 26)) & e.f41245c;
            char c13 = '4';
            int i17 = ((int) (j11 >> 52)) & 511;
            int i18 = i17 == 511 ? iN : i17 + i16;
            if (i16 < 0) {
                return;
            }
            while (i16 < jArr.length - 2 && i16 < i18) {
                int i19 = i16 + 2;
                long j12 = jArr[i19];
                if ((((int) (j12 >> c12)) & i14) == i15) {
                    long j13 = jArr[i16];
                    int i20 = i16 + 1;
                    i12 = i14;
                    c10 = c12;
                    long j14 = jArr[i20];
                    c11 = c13;
                    jArr[i16] = (((long) (((int) j13) + i11)) & k0.f265952a) | (((long) (((int) (j13 >> 32)) + i10)) << 32);
                    jArr[i20] = (((long) (((int) j14) + i11)) & k0.f265952a) | (((long) (((int) (j14 >> 32)) + i10)) << 32);
                    jArr[i19] = h0.f315065r | j12;
                    if ((((int) (j12 >> c11)) & 511) > 0) {
                        jArr2[i13] = (e.f41247e & j12) | (((long) ((i16 + 3) & i12)) << c10);
                        i13++;
                    }
                } else {
                    i12 = i14;
                    c10 = c12;
                    c11 = c13;
                }
                i16 += 3;
                i14 = i12;
                c12 = c10;
                c13 = c11;
            }
        }
    }

    private final int a() {
        long[] jArr = this.f41234a;
        int i10 = this.f41236c;
        int i11 = i10 + 3;
        this.f41236c = i11;
        int length = jArr.length;
        if (length <= i11) {
            w(length, i10, jArr);
        }
        return i10;
    }

    private final void w(int i10, int i11, long[] jArr) {
        int iMax = Math.max(i10 * 2, i11 + 3);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.f41234a = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.f41235b, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf2, "copyOf(...)");
        this.f41235b = jArrCopyOf2;
    }

    public final boolean B(int i10, @NotNull o<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> oVar) {
        int i11 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i12 = this.f41236c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & e.f41245c) == i11) {
                long j10 = jArr[i13];
                long j11 = jArr[i13 + 1];
                oVar.invoke(Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                return true;
            }
        }
        return false;
    }

    public final boolean C(int i10, @NotNull Function2<? super Long, ? super Long, Unit> function2) {
        int i11 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i12 = this.f41236c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & e.f41245c) == i11) {
                boolean z10 = true & true;
                function2.invoke(Long.valueOf(jArr[i13]), Long.valueOf(jArr[i13 + 1]));
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long[] jArr = this.f41234a;
        int i10 = this.f41236c;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            jArr[i12] = jArr[i12] & (-2305843009213693953L);
        }
    }

    public final boolean c(int i10) {
        int i11 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i12 = this.f41236c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & e.f41245c) == i11) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        long[] jArr = this.f41234a;
        int i10 = this.f41236c;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11];
            long j11 = jArr[i11 + 1];
            long j12 = jArr[i11 + 2];
            sb2.append("id=" + (((int) j12) & e.f41245c) + ", rect=[" + ((int) (j10 >> 32)) + AbstractJsonLexerKt.COMMA + ((int) j10) + AbstractJsonLexerKt.COMMA + ((int) (j11 >> 32)) + AbstractJsonLexerKt.COMMA + ((int) j11) + "], parent=" + (((int) (j12 >> 26)) & e.f41245c));
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void e() {
        long[] jArr = this.f41234a;
        int i10 = this.f41236c;
        long[] jArr2 = this.f41235b;
        int i11 = 0;
        for (int i12 = 0; i12 < jArr.length - 2 && i11 < jArr2.length - 2 && i12 < i10; i12 += 3) {
            int i13 = i12 + 2;
            if (jArr[i13] != e.f41251i) {
                jArr2[i11] = jArr[i12];
                jArr2[i11 + 1] = jArr[i12 + 1];
                jArr2[i11 + 2] = jArr[i13];
                i11 += 3;
            }
        }
        this.f41236c = i11;
        this.f41234a = jArr2;
        this.f41235b = jArr;
    }

    public final void f(int i10, int i11, int i12, int i13, int i14, int i15, @NotNull q<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> qVar) {
        int[] iArrU = u(i10, i12, i13, i14, i15);
        long[] jArr = this.f41234a;
        int i16 = 1;
        int i17 = 0;
        int i18 = 0;
        while (i17 <= i11) {
            int iMin = Integer.MAX_VALUE;
            int i19 = 0;
            while (i19 < iArrU.length) {
                int i20 = iArrU[i19];
                if (i20 > i16) {
                    iMin = Math.min(iMin, i20);
                }
                if (i20 == i16) {
                    int i21 = i19 * 3;
                    long j10 = jArr[i21];
                    long j11 = jArr[i21 + 1];
                    qVar.H(Integer.valueOf(i20), Integer.valueOf(((int) jArr[i21 + 2]) & e.f41245c), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                    i18++;
                    if (i18 == i11) {
                        return;
                    }
                }
                i19++;
                i16 = i16;
            }
            i17++;
            i16 = iMin;
        }
    }

    public final int g(int i10, int i11, int i12, int i13, int i14) {
        long[] jArr = this.f41234a;
        int i15 = this.f41236c;
        int i16 = Integer.MAX_VALUE;
        int i17 = -1;
        for (int i18 = 0; i18 < jArr.length - 2 && i18 < i15; i18 += 3) {
            long j10 = jArr[i18];
            int i19 = i18 + 1;
            long j11 = jArr[i19];
            int iA = e.a(i10, i11, i12, i13, i14, (int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11);
            boolean z10 = (iA < i16) & (iA > 0);
            if (z10) {
                i16 = iA;
            }
            if (z10) {
                i17 = i19;
            }
        }
        if (i17 < 0 || i17 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i17]) & e.f41245c;
    }

    public final void h(int i10, int i11, int i12, int i13, @NotNull Function1<? super Integer, Unit> function1) {
        long j10 = (((long) i10) << 32) | (((long) i11) & k0.f265952a);
        long j11 = (((long) i12) << 32) | (((long) i13) & k0.f265952a);
        long[] jArr = this.f41234a;
        int i14 = this.f41236c;
        for (int i15 = 0; i15 < jArr.length - 2 && i15 < i14; i15 += 3) {
            long j12 = jArr[i15 + 2];
            if ((((int) (j12 >> 63)) & 1) != 0) {
                if (((((j11 - jArr[i15]) - n0.d.f332692g) | ((jArr[i15 + 1] - j10) - n0.d.f332692g)) & (-9223372034707292160L)) == 0) {
                    function1.invoke(Integer.valueOf(((int) j12) & e.f41245c));
                }
            }
        }
    }

    public final void i(int i10, @NotNull p<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> pVar) {
        long[] jArr = this.f41234a;
        int i11 = this.f41236c;
        long j10 = jArr[i10];
        long j11 = jArr[i10 + 1];
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if (i12 != i10) {
                long j12 = jArr[i12];
                long j13 = jArr[i12 + 1];
                if (((((j11 - j12) - n0.d.f332692g) | ((j13 - j10) - n0.d.f332692g)) & (-9223372034707292160L)) == 0) {
                    pVar.invoke(Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12), Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) j13), Integer.valueOf(((int) jArr[i12 + 2]) & e.f41245c));
                }
            }
        }
    }

    public final void j(int i10, int i11, int i12, int i13, @NotNull Function1<? super Integer, Unit> function1) {
        long j10 = (((long) i10) << 32) | (((long) i11) & k0.f265952a);
        long j11 = (((long) i12) << 32) | (((long) i13) & k0.f265952a);
        long[] jArr = this.f41234a;
        int i14 = this.f41236c;
        for (int i15 = 0; i15 < jArr.length - 2 && i15 < i14; i15 += 3) {
            if (((((j11 - jArr[i15]) - n0.d.f332692g) | ((jArr[i15 + 1] - j10) - n0.d.f332692g)) & (-9223372034707292160L)) == 0) {
                function1.invoke(Integer.valueOf(((int) jArr[i15 + 2]) & e.f41245c));
            }
        }
    }

    public final void k(int i10, int i11, @NotNull Function1<? super Integer, Unit> function1) {
        long j10 = (((long) i11) & k0.f265952a) | (((long) i10) << 32);
        long[] jArr = this.f41234a;
        int i12 = this.f41236c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if (((((j10 - jArr[i13]) - n0.d.f332692g) | ((jArr[i13 + 1] - j10) - n0.d.f332692g)) & (-9223372034707292160L)) == 0) {
                function1.invoke(Integer.valueOf(((int) jArr[i13 + 2]) & e.f41245c));
            }
        }
    }

    public final void l(@NotNull p<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> pVar) {
        long[] jArr = this.f41234a;
        int i10 = this.f41236c;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11];
            long j11 = jArr[i11 + 1];
            pVar.invoke(Integer.valueOf(((int) jArr[i11 + 2]) & e.f41245c), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
        }
    }

    public final void m(@NotNull n<? super Integer, ? super Long, ? super Long, Unit> nVar) {
        long[] jArr = this.f41234a;
        int i10 = this.f41236c;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11 + 2];
            if ((((int) (j10 >> 61)) & 1) != 0) {
                nVar.invoke(Integer.valueOf(((int) j10) & e.f41245c), Long.valueOf(jArr[i11]), Long.valueOf(jArr[i11 + 1]));
            }
        }
    }

    public final int n() {
        return this.f41236c / 3;
    }

    public final int o(int i10) {
        int i11 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i12 = this.f41236c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & e.f41245c) == i11) {
                return i13;
            }
        }
        return -1;
    }

    public final void p(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        long[] jArr = this.f41234a;
        int i16 = this.f41236c;
        int i17 = i16 + 3;
        this.f41236c = i17;
        int length = jArr.length;
        if (length <= i17) {
            w(length, i16, jArr);
        }
        long[] jArr2 = this.f41234a;
        jArr2[i16] = (((long) i11) << 32) | (((long) i12) & k0.f265952a);
        jArr2[i16 + 1] = (((long) i13) << 32) | (((long) i14) & k0.f265952a);
        long j10 = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) 0) << 52);
        int i18 = i15 & e.f41245c;
        jArr2[i16 + 2] = j10 | (((long) i18) << 26) | ((long) (i10 & e.f41245c));
        if (i15 < 0) {
            return;
        }
        for (int i19 = i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j11 = jArr2[i20];
            if ((((int) j11) & e.f41245c) == i18) {
                jArr2[i20] = (j11 & e.f41248f) | (((long) ((i16 - i19) & 511)) << 52);
                return;
            }
        }
    }

    public final void r(int i10) {
        int i11 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i12 = this.f41236c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            long j10 = jArr[i14];
            if ((((int) j10) & e.f41245c) == i11) {
                jArr[i14] = h0.f315065r | j10;
                return;
            }
        }
    }

    public final long s(int i10) {
        int i11 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i12 = this.f41236c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            long j10 = jArr[i13 + 2];
            if ((((int) j10) & e.f41245c) == i11) {
                return j10;
            }
        }
        return e.f41251i;
    }

    public final boolean t(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i16 = this.f41236c;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j10 = jArr[i18];
            if ((((int) j10) & e.f41245c) == i15) {
                long j11 = jArr[i17];
                jArr[i17] = (((long) i12) & k0.f265952a) | (((long) i11) << 32);
                int i19 = i17;
                jArr[i17 + 1] = (((long) i14) & k0.f265952a) | (((long) i13) << 32);
                jArr[i18] = h0.f315065r | j10;
                int i20 = i11 - ((int) (j11 >> 32));
                int i21 = i12 - ((int) j11);
                if ((i20 != 0) | (i21 != 0)) {
                    A((e.f41247e & j10) | (((long) ((i19 + 3) & e.f41245c)) << 26), i20, i21);
                }
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final int[] u(int i10, int i11, int i12, int i13, int i14) {
        long[] jArr = this.f41234a;
        int i15 = this.f41236c / 3;
        int[] iArr = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i16 * 3;
            if (i17 < 0 || i17 >= jArr.length - 1) {
                break;
            }
            long j10 = jArr[i17];
            long j11 = jArr[i17 + 1];
            iArr[i16] = e.a(i10, i11, i12, i13, i14, (int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11);
        }
        return iArr;
    }

    public final boolean v(int i10) {
        int i11 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i12 = this.f41236c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            if ((((int) jArr[i14]) & e.f41245c) == i11) {
                jArr[i13] = -1;
                jArr[i13 + 1] = -1;
                jArr[i14] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean x(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i16 = this.f41236c;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j10 = jArr[i18];
            if ((((int) j10) & e.f41245c) == i15) {
                jArr[i17] = (((long) i11) << 32) | (((long) i12) & k0.f265952a);
                jArr[i17 + 1] = (((long) i13) << 32) | (k0.f265952a & ((long) i14));
                jArr[i18] = h0.f315065r | j10;
                return true;
            }
        }
        return false;
    }

    public final boolean y(int i10, boolean z10, boolean z11) {
        int i11 = i10 & e.f41245c;
        long[] jArr = this.f41234a;
        int i12 = this.f41236c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            long j10 = jArr[i14];
            if ((((int) j10) & e.f41245c) == i11) {
                jArr[i14] = (4611686018427387903L & j10) | ((z10 ? 1L : 0L) * 4611686018427387904L) | ((z11 ? 1L : 0L) * Long.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final void z(int i10, int i11, int i12) {
        A((((long) (this.f41236c & 511)) << 52) | (((long) 0) << 26) | ((long) (i10 & e.f41245c)), i11, i12);
    }
}
