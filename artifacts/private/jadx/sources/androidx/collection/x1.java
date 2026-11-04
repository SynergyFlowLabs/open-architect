package androidx.collection;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/MutableLongIntMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 LongIntMap.kt\nandroidx/collection/LongIntMap\n+ 6 LongSet.kt\nandroidx/collection/LongSet\n+ 7 LongList.kt\nandroidx/collection/LongList\n+ 8 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1034:1\n59#2,5:1035\n1#3:1040\n1254#4,6:1041\n1399#4:1057\n1270#4:1061\n1399#4:1078\n1270#4:1082\n1399#4:1103\n1270#4:1107\n1230#4:1124\n1254#4,6:1125\n1242#4:1131\n1241#4,4:1132\n1254#4,6:1136\n1175#4:1145\n1179#4:1146\n1372#4,3:1147\n1386#4,3:1150\n1312#4:1153\n1303#4:1154\n1297#4:1155\n1309#4:1156\n1393#4:1157\n1265#4:1158\n1220#4:1159\n1262#4:1160\n1220#4:1161\n1230#4:1162\n1254#4,6:1163\n1242#4:1169\n1241#4,4:1170\n1372#4,3:1174\n1399#4:1177\n1297#4:1178\n1144#4,14:1179\n1220#4:1193\n1175#4:1197\n1179#4:1198\n1254#4,6:1199\n1220#4:1205\n1179#4:1206\n1254#4,6:1207\n1254#4,6:1213\n1179#4:1219\n1254#4,6:1220\n1268#4:1226\n1220#4:1227\n1175#4:1231\n1179#4:1232\n1230#4:1233\n1254#4,6:1234\n1242#4:1240\n1241#4,4:1241\n387#5,4:1047\n359#5,6:1051\n369#5,3:1058\n372#5,9:1062\n391#5:1071\n359#5,6:1072\n369#5,3:1079\n372#5,9:1083\n256#6,4:1092\n226#6,7:1096\n237#6,3:1104\n240#6,9:1108\n260#6:1117\n237#7,6:1118\n881#8,3:1142\n881#8,3:1194\n881#8,3:1228\n*S KotlinDebug\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/MutableLongIntMap\n*L\n639#1:1035,5\n667#1:1041,6\n739#1:1057\n739#1:1061\n770#1:1078\n770#1:1082\n791#1:1103\n791#1:1107\n805#1:1124\n805#1:1125,6\n805#1:1131\n805#1:1132,4\n813#1:1136,6\n826#1:1145\n827#1:1146\n834#1:1147,3\n835#1:1150,3\n836#1:1153\n837#1:1154\n837#1:1155\n841#1:1156\n844#1:1157\n853#1:1158\n853#1:1159\n859#1:1160\n859#1:1161\n860#1:1162\n860#1:1163,6\n860#1:1169\n860#1:1170,4\n875#1:1174,3\n876#1:1177\n878#1:1178\n924#1:1179,14\n930#1:1193\n945#1:1197\n956#1:1198\n957#1:1199,6\n967#1:1205\n970#1:1206\n971#1:1207,6\n972#1:1213,6\n982#1:1219\n983#1:1220,6\n1022#1:1226\n1022#1:1227\n1025#1:1231\n1027#1:1232\n1027#1:1233\n1027#1:1234,6\n1027#1:1240\n1027#1:1241,4\n739#1:1047,4\n739#1:1051,6\n739#1:1058,3\n739#1:1062,9\n739#1:1071\n770#1:1072,6\n770#1:1079,3\n770#1:1083,9\n791#1:1092,4\n791#1:1096,7\n791#1:1104,3\n791#1:1108,9\n791#1:1117\n796#1:1118,6\n825#1:1142,3\n944#1:1194,3\n1024#1:1228,3\n*E\n"})
public final class x1 extends q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12514f;

    public x1() {
        this(0, 1, null);
    }

    private final int R(int i10) {
        int i11 = this.f12433d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12430a;
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

    private final int S(long j10) {
        int iHashCode = Long.hashCode(j10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12433d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12430a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * b3.f12151k);
            for (long j14 = (~j13) & (j13 - b3.f12151k) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f12431b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iR = R(i11);
                if (this.f12514f == 0 && ((this.f12430a[iR >> 3] >> ((iR & 7) << 3)) & 255) != 254) {
                    O();
                    iR = R(i11);
                }
                this.f12434e++;
                int i19 = this.f12514f;
                long[] jArr2 = this.f12430a;
                int i20 = iR >> 3;
                long j15 = jArr2[i20];
                int i21 = (iR & 7) << 3;
                this.f12514f = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f12433d;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iR - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return ~iR;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final void U() {
        this.f12514f = b3.p(o()) - this.f12434e;
    }

    private final void V(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = b3.f12145e;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.f12430a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        U();
    }

    private final void W(int i10) {
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12433d = iMax;
        V(iMax);
        this.f12431b = new long[iMax];
        this.f12432c = new int[iMax];
    }

    public final void O() {
        if (this.f12433d <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(this.f12434e) * 32), kotlin.y1.n(kotlin.y1.n(this.f12433d) * 25)) > 0) {
            j0(b3.x(this.f12433d));
        } else {
            Q();
        }
    }

    public final void P() {
        this.f12434e = 0;
        long[] jArr = this.f12430a;
        if (jArr != b3.f12145e) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12430a;
            int i10 = this.f12433d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        U();
    }

    public final void Q() {
        long[] jArr = this.f12430a;
        int i10 = this.f12433d;
        long[] jArr2 = this.f12431b;
        int[] iArr = this.f12432c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i14 = lastIndex - 1;
        long j11 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j12 = (jArr[i16] >> i17) & 255;
            if (j12 != 128 && j12 == 254) {
                int iHashCode = Long.hashCode(jArr2[i15]) * b3.f12150j;
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iR = R(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iR - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i21] & j11) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iR >> 3;
                    long j13 = jArr[i22];
                    int i23 = (iR & 7) << 3;
                    if (((j13 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j13 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        jArr2[iR] = jArr2[i15];
                        jArr2[i15] = 0;
                        iArr[iR] = iArr[i15];
                        iArr[i15] = i21;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j13 & (~(255 << i23)));
                        long j14 = jArr2[iR];
                        jArr2[iR] = jArr2[i15];
                        jArr2[i15] = j14;
                        int i24 = iArr[iR];
                        iArr[iR] = iArr[i15];
                        iArr[i15] = i24;
                        i15--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i21] & j11) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                    j11 = j11;
                }
            } else {
                i15++;
            }
        }
        U();
    }

    public final int T(long j10, @NotNull Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int i10 = i(j10);
        if (i10 >= 0) {
            return this.f12432c[i10];
        }
        int iIntValue = defaultValue.invoke().intValue();
        d0(j10, iIntValue);
        return iIntValue;
    }

    public final void X(long j10) {
        f0(j10);
    }

    public final void Y(@NotNull s0 keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.f12446a;
        int i10 = keys.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            f0(jArr[i11]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[LOOP:0: B:5:0x0018->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c A[EDGE_INSN: B:20:0x005c->B:17:0x005c BREAK  A[LOOP:0: B:5:0x0018->B:16:0x0059], SYNTHETIC] */
    public final void Z(@NotNull z0 keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.f12530b;
        long[] jArr2 = keys.f12529a;
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
                            f0(jArr[(i10 << 3) + i12]);
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

    public final void a0(@NotNull long[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (long j10 : keys) {
            f0(j10);
        }
    }

    public final void b0(@NotNull q0 from) {
        Intrinsics.checkNotNullParameter(from, "from");
        e0(from);
    }

    public final int c0(long j10, int i10, int i11) {
        int iS = S(j10);
        if (iS < 0) {
            iS = ~iS;
        } else {
            i11 = this.f12432c[iS];
        }
        this.f12431b[iS] = j10;
        this.f12432c[iS] = i10;
        return i11;
    }

    public final void d0(long j10, int i10) {
        k0(j10, i10);
    }

    public final void e0(@NotNull q0 from) {
        Intrinsics.checkNotNullParameter(from, "from");
        long[] jArr = from.f12431b;
        int[] iArr = from.f12432c;
        long[] jArr2 = from.f12430a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        k0(jArr[i13], iArr[i13]);
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

    public final void f0(long j10) {
        int i10 = i(j10);
        if (i10 >= 0) {
            i0(i10);
        }
    }

    public final boolean g0(long j10, int i10) {
        int i11 = i(j10);
        if (i11 < 0 || this.f12432c[i11] != i10) {
            return false;
        }
        i0(i11);
        int i12 = 0 >> 1;
        return true;
    }

    public final void h0(@NotNull Function2<? super Long, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12430a;
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
                        int i13 = (i10 << 3) + i12;
                        if (predicate.invoke(Long.valueOf(this.f12431b[i13]), Integer.valueOf(this.f12432c[i13])).booleanValue()) {
                            i0(i13);
                        }
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

    @kotlin.a1
    public final void i0(int i10) {
        this.f12434e--;
        long[] jArr = this.f12430a;
        int i11 = this.f12433d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final void j0(int i10) {
        x1 x1Var = this;
        long[] jArr = x1Var.f12430a;
        long[] jArr2 = x1Var.f12431b;
        int[] iArr = x1Var.f12432c;
        int i11 = x1Var.f12433d;
        W(i10);
        long[] jArr3 = x1Var.f12430a;
        long[] jArr4 = x1Var.f12431b;
        int[] iArr2 = x1Var.f12432c;
        int i12 = x1Var.f12433d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int iHashCode = Long.hashCode(j10) * b3.f12150j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iR = x1Var.R(i14 >>> 7);
                long j11 = i14 & 127;
                int i15 = iR >> 3;
                int i16 = (iR & 7) << 3;
                long j12 = (jArr3[i15] & (~(255 << i16))) | (j11 << i16);
                jArr3[i15] = j12;
                jArr3[(((iR - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr4[iR] = j10;
                iArr2[iR] = iArr[i13];
            }
            i13++;
            x1Var = this;
            jArr = jArr;
        }
    }

    public final void k0(long j10, int i10) {
        int iS = S(j10);
        if (iS < 0) {
            iS = ~iS;
        }
        this.f12431b[iS] = j10;
        this.f12432c[iS] = i10;
    }

    public final int l0() {
        int i10 = this.f12433d;
        int iY = b3.y(b3.A(this.f12434e));
        if (iY >= i10) {
            return 0;
        }
        j0(iY);
        return i10 - this.f12433d;
    }

    public x1(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            t.f.c("Capacity must be a positive value.");
        }
        W(b3.A(i10));
    }

    public /* synthetic */ x1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
