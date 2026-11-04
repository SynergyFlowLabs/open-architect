package androidx.collection;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,886:1\n59#2,5:887\n1#3:892\n1254#4,6:893\n1399#4:912\n1270#4:916\n1179#4:932\n1175#4:935\n1372#4,3:939\n1386#4,3:943\n1312#4:947\n1303#4:949\n1297#4:950\n1309#4:955\n1393#4:957\n1179#4:971\n1175#4:974\n1372#4,3:978\n1386#4,3:982\n1312#4:986\n1303#4:988\n1297#4:989\n1309#4:994\n1393#4:996\n1399#4:1018\n1270#4:1022\n1230#4:1033\n1254#4,6:1034\n1242#4:1040\n1241#4,4:1041\n1254#4,6:1045\n1175#4:1054\n1179#4:1055\n1372#4,3:1056\n1386#4,3:1059\n1312#4:1062\n1303#4:1063\n1297#4:1064\n1309#4:1065\n1393#4:1066\n1265#4:1067\n1220#4:1068\n1262#4:1069\n1220#4:1070\n1230#4:1071\n1254#4,6:1072\n1242#4:1078\n1241#4,4:1079\n1372#4,3:1083\n1399#4:1086\n1297#4:1087\n1144#4,14:1088\n1220#4:1102\n1175#4:1106\n1179#4:1107\n1254#4,6:1108\n1220#4:1114\n1179#4:1115\n1254#4,6:1116\n1254#4,6:1122\n1179#4:1128\n1254#4,6:1129\n1268#4:1135\n1220#4:1136\n1175#4:1140\n1179#4:1141\n1230#4:1142\n1254#4,6:1143\n1242#4:1149\n1241#4,4:1150\n13344#5,2:899\n13344#5,2:1005\n257#6,4:901\n227#6,7:905\n238#6,3:913\n241#6,9:917\n261#6:926\n427#6:927\n428#6:931\n430#6,2:933\n432#6,3:936\n435#6:942\n436#6:946\n437#6:948\n438#6,4:951\n444#6:956\n445#6,8:958\n427#6:966\n428#6:970\n430#6,2:972\n432#6,3:975\n435#6:981\n436#6:985\n437#6:987\n438#6,4:990\n444#6:995\n445#6,8:997\n257#6,4:1007\n227#6,7:1011\n238#6,3:1019\n241#6,9:1023\n261#6:1032\n882#7,3:928\n882#7,3:967\n882#7,3:1051\n882#7,3:1103\n882#7,3:1137\n*S KotlinDebug\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n*L\n479#1:887,5\n506#1:893,6\n579#1:912\n579#1:916\n590#1:932\n590#1:935\n590#1:939,3\n590#1:943,3\n590#1:947\n590#1:949\n590#1:950\n590#1:955\n590#1:957\n604#1:971\n604#1:974\n604#1:978,3\n604#1:982,3\n604#1:986\n604#1:988\n604#1:989\n604#1:994\n604#1:996\n649#1:1018\n649#1:1022\n657#1:1033\n657#1:1034,6\n657#1:1040\n657#1:1041,4\n665#1:1045,6\n678#1:1054\n679#1:1055\n686#1:1056,3\n687#1:1059,3\n688#1:1062\n689#1:1063\n689#1:1064\n693#1:1065\n696#1:1066\n705#1:1067\n705#1:1068\n711#1:1069\n711#1:1070\n712#1:1071\n712#1:1072,6\n712#1:1078\n712#1:1079,4\n726#1:1083,3\n727#1:1086\n729#1:1087\n775#1:1088,14\n781#1:1102\n796#1:1106\n807#1:1107\n808#1:1108,6\n818#1:1114\n821#1:1115\n822#1:1116,6\n823#1:1122,6\n830#1:1128\n831#1:1129,6\n864#1:1135\n864#1:1136\n867#1:1140\n869#1:1141\n869#1:1142\n869#1:1143,6\n869#1:1149\n869#1:1150,4\n557#1:899,2\n628#1:1005,2\n579#1:901,4\n579#1:905,7\n579#1:913,3\n579#1:917,9\n579#1:926\n590#1:927\n590#1:931\n590#1:933,2\n590#1:936,3\n590#1:942\n590#1:946\n590#1:948\n590#1:951,4\n590#1:956\n590#1:958,8\n604#1:966\n604#1:970\n604#1:972,2\n604#1:975,3\n604#1:981\n604#1:985\n604#1:987\n604#1:990,4\n604#1:995\n604#1:997,8\n649#1:1007,4\n649#1:1011,7\n649#1:1019,3\n649#1:1023,9\n649#1:1032\n590#1:928,3\n604#1:967,3\n677#1:1051,3\n795#1:1103,3\n866#1:1137,3\n*E\n"})
public final class o1 extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12415e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o1() {
        this(0, 1, null);
        int i10 = 3 | 0;
    }

    private final int M(float f10) {
        int iHashCode = Float.hashCode(f10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12507c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12505a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * b3.f12151k);
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f12506b[iNumberOfTrailingZeros] == f10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iN = N(i11);
                if (this.f12415e == 0 && ((this.f12505a[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    J();
                    iN = N(i11);
                }
                this.f12508d++;
                int i19 = this.f12415e;
                long[] jArr2 = this.f12505a;
                int i20 = iN >> 3;
                long j14 = jArr2[i20];
                int i21 = (iN & 7) << 3;
                this.f12415e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f12507c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iN - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iN;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int N(int i10) {
        int i11 = this.f12507c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12505a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void O() {
        this.f12415e = b3.p(l()) - this.f12508d;
    }

    private final void P(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = b3.f12145e;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.f12505a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        O();
    }

    private final void Q(int i10) {
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12507c = iMax;
        P(iMax);
        this.f12506b = new float[iMax];
    }

    private final void a0(int i10) {
        this.f12508d--;
        long[] jArr = this.f12505a;
        int i11 = this.f12507c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final boolean G(float f10) {
        int i10 = this.f12508d;
        this.f12506b[M(f10)] = f10;
        return this.f12508d != i10;
    }

    public final boolean H(@NotNull x elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12508d;
        V(elements);
        return i10 != this.f12508d;
    }

    public final boolean I(@NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12508d;
        W(elements);
        return i10 != this.f12508d;
    }

    public final void J() {
        if (this.f12507c <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(this.f12508d) * 32), kotlin.y1.n(kotlin.y1.n(this.f12507c) * 25)) > 0) {
            b0(b3.x(this.f12507c));
        } else {
            L();
        }
    }

    public final void K() {
        this.f12508d = 0;
        long[] jArr = this.f12505a;
        if (jArr != b3.f12145e) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12505a;
            int i10 = this.f12507c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        O();
    }

    public final void L() {
        long[] jArr = this.f12505a;
        int i10 = this.f12507c;
        float[] fArr = this.f12506b;
        int i11 = (i10 + 7) >> 3;
        char c10 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = jArr[i12] & (-9187201950435737472L);
            jArr[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i13 = lastIndex - 1;
        long j11 = 72057594037927935L;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i14 = 0;
        while (i14 != i10) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j12 = (jArr[i15] >> i16) & 255;
            if (j12 != 128 && j12 == 254) {
                int iHashCode = Float.hashCode(fArr[i14]) * b3.f12150j;
                int i17 = iHashCode ^ (iHashCode << 16);
                int i18 = i17 >>> 7;
                int iN = N(i18);
                int i19 = i18 & i10;
                char c11 = c10;
                if (((iN - i19) & i10) / 8 == ((i14 - i19) & i10) / 8) {
                    jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[c11] & j11) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                } else {
                    int i20 = iN >> 3;
                    long j13 = jArr[i20];
                    int i21 = (iN & 7) << 3;
                    if (((j13 >> i21) & 255) == 128) {
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j13 & (~(255 << i21)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        fArr[iN] = fArr[i14];
                        fArr[i14] = 0.0f;
                    } else {
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j13 & (~(255 << i21)));
                        float f10 = fArr[iN];
                        fArr[iN] = fArr[i14];
                        fArr[i14] = f10;
                        i14--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[c11] & j11) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                    j11 = j11;
                }
            } else {
                i14++;
            }
        }
        O();
    }

    public final void R(float f10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Float.hashCode(f10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12507c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12505a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f12506b[iNumberOfTrailingZeros] == f10) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i14 += 8;
                i13 = (i13 + i14) & i12;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            a0(iNumberOfTrailingZeros);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0057 A[LOOP:0: B:5:0x0011->B:15:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005b A[EDGE_INSN: B:19:0x005b->B:16:0x005b BREAK  A[LOOP:0: B:5:0x0011->B:15:0x0057], SYNTHETIC] */
    public final void S(@NotNull x elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        float[] fArr = elements.f12506b;
        long[] jArr = elements.f12505a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            R(fArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }

    public final void T(@NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (float f10 : elements) {
            R(f10);
        }
    }

    public final void U(float f10) {
        this.f12506b[M(f10)] = f10;
    }

    public final void V(@NotNull x elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        float[] fArr = elements.f12506b;
        long[] jArr = elements.f12505a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        U(fArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void W(@NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (float f10 : elements) {
            U(f10);
        }
    }

    public final boolean X(float f10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Float.hashCode(f10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12507c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12505a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f12506b[iNumberOfTrailingZeros] == f10) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            a0(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final boolean Y(@NotNull x elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12508d;
        S(elements);
        if (i10 == this.f12508d) {
            return false;
        }
        int i11 = 2 ^ 1;
        return true;
    }

    public final boolean Z(@NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12508d;
        T(elements);
        return i10 != this.f12508d;
    }

    public final void b0(int i10) {
        long[] jArr = this.f12505a;
        float[] fArr = this.f12506b;
        int i11 = this.f12507c;
        Q(i10);
        long[] jArr2 = this.f12505a;
        float[] fArr2 = this.f12506b;
        int i12 = this.f12507c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                float f10 = fArr[i13];
                int iHashCode = Float.hashCode(f10) * b3.f12150j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iN = N(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iN >> 3;
                int i16 = (iN & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iN - 7) & i12) + (i12 & 7)) >> 3] = j11;
                fArr2[iN] = f10;
            }
        }
    }

    @androidx.annotation.g0(from = 0)
    public final int c0() {
        int i10 = this.f12507c;
        int iY = b3.y(b3.A(this.f12508d));
        if (iY >= i10) {
            return 0;
        }
        b0(iY);
        return i10 - this.f12507c;
    }

    public o1(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            t.f.c("Capacity must be a positive value.");
        }
        Q(b3.A(i10));
    }

    public /* synthetic */ o1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
