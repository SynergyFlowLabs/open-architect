package androidx.collection;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 6 IntSet.kt\nandroidx/collection/IntSetKt\n+ 7 IntSet.kt\nandroidx/collection/IntSet\n+ 8 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,1017:1\n757#1,2:1173\n757#1,2:1186\n59#2,5:1018\n1#3:1023\n1254#4,6:1024\n1399#4:1040\n1270#4:1044\n1179#4:1060\n1175#4:1063\n1372#4,3:1068\n1386#4,3:1072\n1312#4:1076\n1303#4:1078\n1297#4:1079\n1309#4:1084\n1393#4:1086\n1179#4:1100\n1175#4:1103\n1372#4,3:1108\n1386#4,3:1112\n1312#4:1116\n1303#4:1118\n1297#4:1119\n1309#4:1124\n1393#4:1126\n1399#4:1141\n1270#4:1145\n1399#4:1166\n1270#4:1170\n1230#4:1189\n1254#4,6:1190\n1242#4:1196\n1241#4,4:1197\n1254#4,6:1201\n1175#4:1210\n1179#4:1211\n1372#4,3:1212\n1386#4,3:1215\n1312#4:1218\n1303#4:1219\n1297#4:1220\n1309#4:1221\n1393#4:1222\n1265#4:1223\n1220#4:1224\n1262#4:1225\n1220#4:1226\n1230#4:1227\n1254#4,6:1228\n1242#4:1234\n1241#4,4:1235\n1372#4,3:1239\n1399#4:1242\n1297#4:1243\n1144#4,14:1244\n1220#4:1258\n1175#4:1262\n1179#4:1263\n1254#4,6:1264\n1220#4:1270\n1179#4:1271\n1254#4,6:1272\n1254#4,6:1278\n1179#4:1284\n1254#4,6:1285\n1268#4:1291\n1220#4:1292\n1175#4:1296\n1179#4:1297\n1230#4:1298\n1254#4,6:1299\n1242#4:1305\n1241#4,4:1306\n382#5,4:1030\n354#5,6:1034\n364#5,3:1041\n367#5,9:1045\n386#5:1054\n577#5:1055\n578#5:1059\n580#5,2:1061\n582#5,4:1064\n586#5:1071\n587#5:1075\n588#5:1077\n589#5,4:1080\n595#5:1085\n596#5,8:1087\n577#5:1095\n578#5:1099\n580#5,2:1101\n582#5,4:1104\n586#5:1111\n587#5:1115\n588#5:1117\n589#5,4:1120\n595#5:1125\n596#5,8:1127\n354#5,6:1135\n364#5,3:1142\n367#5,9:1146\n880#6,3:1056\n880#6,3:1096\n880#6,3:1207\n880#6,3:1259\n880#6,3:1293\n255#7,4:1155\n225#7,7:1159\n236#7,3:1167\n239#7,2:1171\n242#7,6:1175\n259#7:1181\n237#8,4:1182\n242#8:1188\n*S KotlinDebug\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n*L\n769#1:1173,2\n774#1:1186,2\n637#1:1018,5\n665#1:1024,6\n712#1:1040\n712#1:1044\n723#1:1060\n723#1:1063\n723#1:1068,3\n723#1:1072,3\n723#1:1076\n723#1:1078\n723#1:1079\n723#1:1084\n723#1:1086\n735#1:1100\n735#1:1103\n735#1:1108,3\n735#1:1112,3\n735#1:1116\n735#1:1118\n735#1:1119\n735#1:1124\n735#1:1126\n747#1:1141\n747#1:1145\n769#1:1166\n769#1:1170\n783#1:1189\n783#1:1190,6\n783#1:1196\n783#1:1197,4\n795#1:1201,6\n809#1:1210\n810#1:1211\n817#1:1212,3\n818#1:1215,3\n819#1:1218\n820#1:1219\n820#1:1220\n824#1:1221\n827#1:1222\n836#1:1223\n836#1:1224\n842#1:1225\n842#1:1226\n843#1:1227\n843#1:1228,6\n843#1:1234\n843#1:1235,4\n858#1:1239,3\n859#1:1242\n861#1:1243\n907#1:1244,14\n913#1:1258\n928#1:1262\n939#1:1263\n940#1:1264,6\n950#1:1270\n953#1:1271\n954#1:1272,6\n955#1:1278,6\n965#1:1284\n966#1:1285,6\n1005#1:1291\n1005#1:1292\n1008#1:1296\n1010#1:1297\n1010#1:1298\n1010#1:1299,6\n1010#1:1305\n1010#1:1306,4\n712#1:1030,4\n712#1:1034,6\n712#1:1041,3\n712#1:1045,9\n712#1:1054\n723#1:1055\n723#1:1059\n723#1:1061,2\n723#1:1064,4\n723#1:1071\n723#1:1075\n723#1:1077\n723#1:1080,4\n723#1:1085\n723#1:1087,8\n735#1:1095\n735#1:1099\n735#1:1101,2\n735#1:1104,4\n735#1:1111\n735#1:1115\n735#1:1117\n735#1:1120,4\n735#1:1125\n735#1:1127,8\n747#1:1135,6\n747#1:1142,3\n747#1:1146,9\n723#1:1056,3\n735#1:1096,3\n808#1:1207,3\n927#1:1259,3\n1007#1:1293,3\n769#1:1155,4\n769#1:1159,7\n769#1:1167,3\n769#1:1171,2\n769#1:1175,6\n769#1:1181\n774#1:1182,4\n774#1:1188\n*E\n"})
public final class t1<V> extends j0<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12458f;

    public t1() {
        this(0, 1, null);
    }

    private final int R(int i10) {
        int iHashCode = Integer.hashCode(i10) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f12304d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f12301a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            long j12 = j10 ^ (j11 * b3.f12151k);
            long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                int i21 = i19;
                if (this.f12302b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iS = S(i12);
                if (this.f12458f == 0 && ((this.f12301a[iS >> 3] >> ((iS & 7) << 3)) & 255) != 254) {
                    O();
                    iS = S(i12);
                }
                this.f12305e++;
                int i23 = this.f12458f;
                long[] jArr2 = this.f12301a;
                int i24 = iS >> 3;
                long j14 = jArr2[i24];
                int i25 = (iS & 7) << 3;
                this.f12458f = i23 - (((j14 >> i25) & 255) == 128 ? i22 : 0);
                int i26 = this.f12304d;
                long j15 = ((~(255 << i25)) & j14) | (j11 << i25);
                jArr2[i24] = j15;
                jArr2[(((iS - 7) & i26) + (i26 & 7)) >> 3] = j15;
                return iS;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int S(int i10) {
        int i11 = this.f12304d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12301a;
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

    private final void U() {
        this.f12458f = b3.p(o()) - this.f12305e;
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
        this.f12301a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        U();
    }

    private final void W(int i10) {
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12304d = iMax;
        V(iMax);
        this.f12302b = new int[iMax];
        this.f12303c = new Object[iMax];
    }

    public final void O() {
        if (this.f12304d <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(this.f12305e) * 32), kotlin.y1.n(kotlin.y1.n(this.f12304d) * 25)) > 0) {
            i0(b3.x(this.f12304d));
        } else {
            Q();
        }
    }

    public final void P() {
        this.f12305e = 0;
        long[] jArr = this.f12301a;
        if (jArr != b3.f12145e) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12301a;
            int i10 = this.f12304d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        ArraysKt.fill(this.f12303c, (Object) null, 0, this.f12304d);
        U();
    }

    public final void Q() {
        long[] jArr = this.f12301a;
        int i10 = this.f12304d;
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
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
                int iHashCode = Integer.hashCode(iArr[i15]) * b3.f12150j;
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iS = S(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iS - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i21] & j11) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iS >> 3;
                    long j13 = jArr[i22];
                    int i23 = (iS & 7) << 3;
                    if (((j13 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j13 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        iArr[iS] = iArr[i15];
                        iArr[i15] = i21;
                        objArr[iS] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j13 & (~(255 << i23)));
                        int i24 = iArr[iS];
                        iArr[iS] = iArr[i15];
                        iArr[i15] = i24;
                        Object obj = objArr[iS];
                        objArr[iS] = objArr[i15];
                        objArr[i15] = obj;
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

    public final V T(int i10, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V vN = n(i10);
        if (vN != null) {
            return vN;
        }
        V vInvoke = defaultValue.invoke();
        j0(i10, vInvoke);
        return vInvoke;
    }

    public final void X(int i10) {
        e0(i10);
    }

    public final void Y(@NotNull f0 keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.f12215a;
        int i10 = keys.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            e0(iArr[i11]);
        }
    }

    public final void Z(@NotNull l0 keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.f12340b;
        long[] jArr = keys.f12339a;
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
                        e0(iArr[(i10 << 3) + i12]);
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

    public final void a0(@NotNull int[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (int i10 : keys) {
            e0(i10);
        }
    }

    public final void b0(@NotNull j0<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        d0(from);
    }

    @Nullable
    public final V c0(int i10, V v10) {
        int iR = R(i10);
        Object[] objArr = this.f12303c;
        V v11 = (V) objArr[iR];
        this.f12302b[iR] = i10;
        objArr[iR] = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(@NotNull j0<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        int[] iArr = from.f12302b;
        Object[] objArr = from.f12303c;
        long[] jArr = from.f12301a;
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
                        j0(iArr[i13], objArr[i13]);
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

    @Nullable
    public final V e0(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12304d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f12301a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f12302b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return h0(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final boolean f0(int i10, V v10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12304d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f12301a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f12302b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros < 0 || !Intrinsics.areEqual(this.f12303c[iNumberOfTrailingZeros], v10)) {
            return false;
        }
        h0(iNumberOfTrailingZeros);
        return true;
    }

    public final void g0(@NotNull Function2<? super Integer, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12301a;
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
                        if (predicate.invoke(Integer.valueOf(this.f12302b[i13]), this.f12303c[i13]).booleanValue()) {
                            h0(i13);
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
    @Nullable
    public final V h0(int i10) {
        this.f12305e--;
        long[] jArr = this.f12301a;
        int i11 = this.f12304d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        Object[] objArr = this.f12303c;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        return v10;
    }

    public final void i0(int i10) {
        t1<V> t1Var = this;
        long[] jArr = t1Var.f12301a;
        int[] iArr = t1Var.f12302b;
        Object[] objArr = t1Var.f12303c;
        int i11 = t1Var.f12304d;
        W(i10);
        long[] jArr2 = t1Var.f12301a;
        int[] iArr2 = t1Var.f12302b;
        Object[] objArr2 = t1Var.f12303c;
        int i12 = t1Var.f12304d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * b3.f12150j;
                int i15 = iHashCode ^ (iHashCode << 16);
                int iS = t1Var.S(i15 >>> 7);
                long j10 = i15 & 127;
                int i16 = iS >> 3;
                int i17 = (iS & 7) << 3;
                long j11 = (jArr2[i16] & (~(255 << i17))) | (j10 << i17);
                jArr2[i16] = j11;
                jArr2[(((iS - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[iS] = i14;
                objArr2[iS] = objArr[i13];
            }
            i13++;
            t1Var = this;
            jArr = jArr;
        }
    }

    public final void j0(int i10, V v10) {
        int iR = R(i10);
        this.f12302b[iR] = i10;
        this.f12303c[iR] = v10;
    }

    public final int k0() {
        int i10 = this.f12304d;
        int iY = b3.y(b3.A(this.f12305e));
        if (iY >= i10) {
            return 0;
        }
        i0(iY);
        return i10 - this.f12304d;
    }

    public /* synthetic */ t1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public t1(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            t.f.c("Capacity must be a positive value.");
        }
        W(b3.A(i10));
    }
}
