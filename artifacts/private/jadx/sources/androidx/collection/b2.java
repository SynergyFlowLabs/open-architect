package androidx.collection;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 LongSet.kt\nandroidx/collection/LongSet\n+ 7 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,885:1\n59#2,5:886\n1#3:891\n1254#4,6:892\n1399#4:911\n1270#4:915\n1179#4:931\n1175#4:934\n1372#4,3:938\n1386#4,3:942\n1312#4:946\n1303#4:948\n1297#4:949\n1309#4:954\n1393#4:956\n1179#4:970\n1175#4:973\n1372#4,3:977\n1386#4,3:981\n1312#4:985\n1303#4:987\n1297#4:988\n1309#4:993\n1393#4:995\n1399#4:1017\n1270#4:1021\n1230#4:1032\n1254#4,6:1033\n1242#4:1039\n1241#4,4:1040\n1254#4,6:1044\n1175#4:1053\n1179#4:1054\n1372#4,3:1055\n1386#4,3:1058\n1312#4:1061\n1303#4:1062\n1297#4:1063\n1309#4:1064\n1393#4:1065\n1265#4:1066\n1220#4:1067\n1262#4:1068\n1220#4:1069\n1230#4:1070\n1254#4,6:1071\n1242#4:1077\n1241#4,4:1078\n1372#4,3:1082\n1399#4:1085\n1297#4:1086\n1144#4,14:1087\n1220#4:1101\n1175#4:1105\n1179#4:1106\n1254#4,6:1107\n1220#4:1113\n1179#4:1114\n1254#4,6:1115\n1254#4,6:1121\n1179#4:1127\n1254#4,6:1128\n1268#4:1134\n1220#4:1135\n1175#4:1139\n1179#4:1140\n1230#4:1141\n1254#4,6:1142\n1242#4:1148\n1241#4,4:1149\n13337#5,2:898\n13337#5,2:1004\n256#6,4:900\n226#6,7:904\n237#6,3:912\n240#6,9:916\n260#6:925\n426#6:926\n427#6:930\n429#6,2:932\n431#6,3:935\n434#6:941\n435#6:945\n436#6:947\n437#6,4:950\n443#6:955\n444#6,8:957\n426#6:965\n427#6:969\n429#6,2:971\n431#6,3:974\n434#6:980\n435#6:984\n436#6:986\n437#6,4:989\n443#6:994\n444#6,8:996\n256#6,4:1006\n226#6,7:1010\n237#6,3:1018\n240#6,9:1022\n260#6:1031\n881#7,3:927\n881#7,3:966\n881#7,3:1050\n881#7,3:1102\n881#7,3:1136\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n*L\n478#1:886,5\n505#1:892,6\n578#1:911\n578#1:915\n589#1:931\n589#1:934\n589#1:938,3\n589#1:942,3\n589#1:946\n589#1:948\n589#1:949\n589#1:954\n589#1:956\n603#1:970\n603#1:973\n603#1:977,3\n603#1:981,3\n603#1:985\n603#1:987\n603#1:988\n603#1:993\n603#1:995\n648#1:1017\n648#1:1021\n656#1:1032\n656#1:1033,6\n656#1:1039\n656#1:1040,4\n664#1:1044,6\n677#1:1053\n678#1:1054\n685#1:1055,3\n686#1:1058,3\n687#1:1061\n688#1:1062\n688#1:1063\n692#1:1064\n695#1:1065\n704#1:1066\n704#1:1067\n710#1:1068\n710#1:1069\n711#1:1070\n711#1:1071,6\n711#1:1077\n711#1:1078,4\n725#1:1082,3\n726#1:1085\n728#1:1086\n774#1:1087,14\n780#1:1101\n795#1:1105\n806#1:1106\n807#1:1107,6\n817#1:1113\n820#1:1114\n821#1:1115,6\n822#1:1121,6\n829#1:1127\n830#1:1128,6\n863#1:1134\n863#1:1135\n866#1:1139\n868#1:1140\n868#1:1141\n868#1:1142,6\n868#1:1148\n868#1:1149,4\n556#1:898,2\n627#1:1004,2\n578#1:900,4\n578#1:904,7\n578#1:912,3\n578#1:916,9\n578#1:925\n589#1:926\n589#1:930\n589#1:932,2\n589#1:935,3\n589#1:941\n589#1:945\n589#1:947\n589#1:950,4\n589#1:955\n589#1:957,8\n603#1:965\n603#1:969\n603#1:971,2\n603#1:974,3\n603#1:980\n603#1:984\n603#1:986\n603#1:989,4\n603#1:994\n603#1:996,8\n648#1:1006,4\n648#1:1010,7\n648#1:1018,3\n648#1:1022,9\n648#1:1031\n589#1:927,3\n603#1:966,3\n676#1:1050,3\n794#1:1102,3\n865#1:1136,3\n*E\n"})
public final class b2 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12140e;

    public b2() {
        this(0, 1, null);
    }

    private final int M(long j10) {
        int iHashCode = Long.hashCode(j10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12531c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12529a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * b3.f12151k);
            for (long j14 = (~j13) & (j13 - b3.f12151k) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f12530b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iN = N(i11);
                if (this.f12140e == 0 && ((this.f12529a[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    J();
                    iN = N(i11);
                }
                this.f12532d++;
                int i19 = this.f12140e;
                long[] jArr2 = this.f12529a;
                int i20 = iN >> 3;
                long j15 = jArr2[i20];
                int i21 = (iN & 7) << 3;
                this.f12140e = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f12531c;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iN - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return iN;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int N(int i10) {
        int i11 = this.f12531c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12529a;
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
        this.f12140e = b3.p(l()) - this.f12532d;
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
        this.f12529a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        O();
    }

    private final void Q(int i10) {
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12531c = iMax;
        P(iMax);
        this.f12530b = new long[iMax];
    }

    private final void a0(int i10) {
        this.f12532d--;
        long[] jArr = this.f12529a;
        int i11 = this.f12531c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final boolean G(long j10) {
        int i10 = this.f12532d;
        this.f12530b[M(j10)] = j10;
        return this.f12532d != i10;
    }

    public final boolean H(@NotNull z0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12532d;
        V(elements);
        return i10 != this.f12532d;
    }

    public final boolean I(@NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12532d;
        W(elements);
        return i10 != this.f12532d;
    }

    public final void J() {
        if (this.f12531c <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(this.f12532d) * 32), kotlin.y1.n(kotlin.y1.n(this.f12531c) * 25)) > 0) {
            b0(b3.x(this.f12531c));
        } else {
            L();
        }
    }

    public final void K() {
        this.f12532d = 0;
        long[] jArr = this.f12529a;
        if (jArr != b3.f12145e) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12529a;
            int i10 = this.f12531c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        O();
    }

    public final void L() {
        long[] jArr = this.f12529a;
        int i10 = this.f12531c;
        long[] jArr2 = this.f12530b;
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
                int iHashCode = Long.hashCode(jArr2[i14]) * b3.f12150j;
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
                        jArr2[iN] = jArr2[i14];
                        jArr2[i14] = 0;
                    } else {
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j13 & (~(255 << i21)));
                        long j14 = jArr2[iN];
                        jArr2[iN] = jArr2[i14];
                        jArr2[i14] = j14;
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

    public final void R(long j10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12531c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12529a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * b3.f12151k) ^ j11;
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f12530b[iNumberOfTrailingZeros] == j10) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
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

    /* JADX WARN: Code duplicated, block: B:14:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0051 A[LOOP:0: B:5:0x0014->B:15:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0054 A[EDGE_INSN: B:19:0x0054->B:16:0x0054 BREAK  A[LOOP:0: B:5:0x0014->B:15:0x0051], SYNTHETIC] */
    public final void S(@NotNull z0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.f12530b;
        long[] jArr2 = elements.f12529a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0 >> 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            R(jArr[(i11 << 3) + i13]);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
    }

    public final void T(@NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (long j10 : elements) {
            R(j10);
        }
    }

    public final void U(long j10) {
        this.f12530b[M(j10)] = j10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0058 A[LOOP:0: B:5:0x0016->B:15:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005b A[EDGE_INSN: B:19:0x005b->B:16:0x005b BREAK  A[LOOP:0: B:5:0x0016->B:15:0x0058], SYNTHETIC] */
    public final void V(@NotNull z0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.f12530b;
        long[] jArr2 = elements.f12529a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
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
                            U(jArr[(i10 << 3) + i12]);
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

    public final void W(@NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (long j10 : elements) {
            U(j10);
        }
    }

    public final boolean X(long j10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12531c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12529a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * b3.f12151k) ^ j11;
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f12530b[iNumberOfTrailingZeros] == j10) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
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

    public final boolean Y(@NotNull z0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12532d;
        S(elements);
        return i10 != this.f12532d;
    }

    public final boolean Z(@NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12532d;
        T(elements);
        return i10 != this.f12532d;
    }

    public final void b0(int i10) {
        long[] jArr = this.f12529a;
        long[] jArr2 = this.f12530b;
        int i11 = this.f12531c;
        Q(i10);
        long[] jArr3 = this.f12529a;
        long[] jArr4 = this.f12530b;
        int i12 = this.f12531c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int iHashCode = Long.hashCode(j10) * b3.f12150j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iN = N(i14 >>> 7);
                long j11 = i14 & 127;
                int i15 = iN >> 3;
                int i16 = (iN & 7) << 3;
                long j12 = (jArr3[i15] & (~(255 << i16))) | (j11 << i16);
                jArr3[i15] = j12;
                jArr3[(((iN - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr4[iN] = j10;
            }
        }
    }

    @androidx.annotation.g0(from = 0)
    public final int c0() {
        int i10 = this.f12531c;
        int iY = b3.y(b3.A(this.f12532d));
        if (iY >= i10) {
            return 0;
        }
        b0(iY);
        return i10 - this.f12531c;
    }

    public b2(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            t.f.c("Capacity must be a positive value.");
        }
        Q(b3.A(i10));
    }

    public /* synthetic */ b2(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
