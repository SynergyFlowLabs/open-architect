package androidx.collection;

import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nObjectFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/MutableObjectFloatMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1051:1\n59#2,5:1052\n1#3:1057\n1254#4,6:1058\n1399#4:1074\n1270#4:1078\n1399#4:1095\n1270#4:1099\n1399#4:1119\n1270#4:1123\n1230#4:1134\n1254#4,6:1135\n1242#4:1141\n1241#4,4:1142\n1254#4,6:1146\n1165#4,3:1152\n1175#4:1155\n1179#4:1156\n1372#4,3:1157\n1386#4,3:1160\n1312#4:1163\n1303#4:1164\n1297#4:1165\n1309#4:1166\n1393#4:1167\n1265#4:1168\n1220#4:1169\n1262#4:1170\n1220#4:1171\n1230#4:1172\n1254#4,6:1173\n1242#4:1179\n1241#4,4:1180\n1372#4,3:1184\n1399#4:1187\n1297#4:1188\n1144#4,14:1189\n1220#4:1203\n1165#4,3:1204\n1175#4:1207\n1179#4:1208\n1254#4,6:1209\n1220#4:1215\n1179#4:1216\n1254#4,6:1217\n1254#4,6:1223\n1179#4:1229\n1254#4,6:1230\n1268#4:1236\n1220#4:1237\n1165#4,3:1238\n1175#4:1241\n1179#4:1242\n1230#4:1243\n1254#4,6:1244\n1242#4:1250\n1241#4,4:1251\n395#5,4:1064\n367#5,6:1068\n377#5,3:1075\n380#5,9:1079\n399#5:1088\n367#5,6:1089\n377#5,3:1096\n380#5,9:1100\n231#6,3:1109\n200#6,7:1112\n211#6,3:1120\n214#6,9:1124\n234#6:1133\n*S KotlinDebug\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/MutableObjectFloatMap\n*L\n647#1:1052,5\n675#1:1058,6\n744#1:1074\n744#1:1078\n775#1:1095\n775#1:1099\n811#1:1119\n811#1:1123\n820#1:1134\n820#1:1135,6\n820#1:1141\n820#1:1142,4\n829#1:1146,6\n842#1:1152,3\n843#1:1155\n844#1:1156\n851#1:1157,3\n852#1:1160,3\n853#1:1163\n854#1:1164\n854#1:1165\n858#1:1166\n861#1:1167\n870#1:1168\n870#1:1169\n876#1:1170\n876#1:1171\n877#1:1172\n877#1:1173,6\n877#1:1179\n877#1:1180,4\n892#1:1184,3\n893#1:1187\n895#1:1188\n941#1:1189,14\n947#1:1203\n961#1:1204,3\n962#1:1207\n973#1:1208\n974#1:1209,6\n984#1:1215\n987#1:1216\n988#1:1217,6\n989#1:1223,6\n999#1:1229\n1000#1:1230,6\n1039#1:1236\n1039#1:1237\n1041#1:1238,3\n1042#1:1241\n1044#1:1242\n1044#1:1243\n1044#1:1244,6\n1044#1:1250\n1044#1:1251,4\n744#1:1064,4\n744#1:1068,6\n744#1:1075,3\n744#1:1079,9\n744#1:1088\n775#1:1089,6\n775#1:1096,3\n775#1:1100,9\n811#1:1109,3\n811#1:1112,7\n811#1:1120,3\n811#1:1124,9\n811#1:1133\n*E\n"})
public final class e2<K> extends o2<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12199f;

    public e2() {
        this(0, 1, null);
    }

    private final int R(int i10) {
        int i11 = this.f12419d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12416a;
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

    private final int S(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12419d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12416a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * b3.f12151k);
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.f12417b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iR = R(i11);
                if (this.f12199f == 0 && ((this.f12416a[iR >> 3] >> ((iR & 7) << 3)) & 255) != 254) {
                    O();
                    iR = R(i11);
                }
                this.f12420e++;
                int i19 = this.f12199f;
                long[] jArr2 = this.f12416a;
                int i20 = iR >> 3;
                long j14 = jArr2[i20];
                int i21 = (iR & 7) << 3;
                this.f12199f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f12419d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iR - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iR;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final void U() {
        this.f12199f = b3.p(o()) - this.f12420e;
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
        this.f12416a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        U();
    }

    private final void W(int i10) {
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12419d = iMax;
        V(iMax);
        this.f12417b = new Object[iMax];
        this.f12418c = new float[iMax];
    }

    public final void O() {
        if (this.f12419d <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(this.f12420e) * 32), kotlin.y1.n(kotlin.y1.n(this.f12419d) * 25)) > 0) {
            k0(b3.x(this.f12419d));
        } else {
            Q();
        }
    }

    public final void P() {
        this.f12420e = 0;
        long[] jArr = this.f12416a;
        if (jArr != b3.f12145e) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12416a;
            int i10 = this.f12419d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        ArraysKt.fill(this.f12417b, (Object) null, 0, this.f12419d);
        U();
    }

    public final void Q() {
        long[] jArr = this.f12416a;
        int i10 = this.f12419d;
        Object[] objArr = this.f12417b;
        float[] fArr = this.f12418c;
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
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * b3.f12150j;
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
                        objArr[iR] = objArr[i15];
                        objArr[i15] = null;
                        fArr[iR] = fArr[i15];
                        fArr[i15] = 0.0f;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j13 & (~(255 << i23)));
                        Object obj2 = objArr[iR];
                        objArr[iR] = objArr[i15];
                        objArr[i15] = obj2;
                        float f10 = fArr[iR];
                        fArr[iR] = fArr[i15];
                        fArr[i15] = f10;
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

    public final float T(K k10, @NotNull Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int i10 = i(k10);
        if (i10 >= 0) {
            return this.f12418c[i10];
        }
        float fFloatValue = defaultValue.invoke().floatValue();
        l0(k10, fFloatValue);
        return fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(@NotNull c3<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.f12171b;
        long[] jArr = keys.f12170a;
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
                        g0(objArr[(i10 << 3) + i12]);
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

    public final void Y(@NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            g0(it.next());
        }
    }

    public final void Z(K k10) {
        g0(k10);
    }

    public final void a0(@NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            g0(it.next());
        }
    }

    public final void b0(@NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k10 : keys) {
            g0(k10);
        }
    }

    public final void c0(@NotNull o2<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        f0(from);
    }

    public final float d0(K k10, float f10, float f11) {
        int iS = S(k10);
        if (iS < 0) {
            iS = ~iS;
        } else {
            f11 = this.f12418c[iS];
        }
        this.f12417b[iS] = k10;
        this.f12418c[iS] = f10;
        return f11;
    }

    public final void e0(K k10, float f10) {
        l0(k10, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(@NotNull o2<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.f12417b;
        float[] fArr = from.f12418c;
        long[] jArr = from.f12416a;
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
                        l0(objArr[i13], fArr[i13]);
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

    public final void g0(K k10) {
        int i10 = i(k10);
        if (i10 >= 0) {
            j0(i10);
        }
    }

    public final boolean h0(K k10, float f10) {
        int i10 = i(k10);
        if (i10 < 0 || this.f12418c[i10] != f10) {
            return false;
        }
        j0(i10);
        return true;
    }

    public final void i0(@NotNull Function2<? super K, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12416a;
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
                        if (predicate.invoke(this.f12417b[i13], Float.valueOf(this.f12418c[i13])).booleanValue()) {
                            j0(i13);
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
    public final void j0(int i10) {
        this.f12420e--;
        long[] jArr = this.f12416a;
        int i11 = this.f12419d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f12417b[i10] = null;
    }

    public final void k0(int i10) {
        int i11;
        long[] jArr = this.f12416a;
        Object[] objArr = this.f12417b;
        float[] fArr = this.f12418c;
        int i12 = this.f12419d;
        W(i10);
        long[] jArr2 = this.f12416a;
        Object[] objArr2 = this.f12417b;
        float[] fArr2 = this.f12418c;
        int i13 = this.f12419d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * b3.f12150j;
                int i15 = iHashCode ^ (iHashCode << 16);
                int iR = R(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iR >> 3;
                int i17 = (iR & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iR - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr2[iR] = obj;
                fArr2[iR] = fArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void l0(K k10, float f10) {
        int iS = S(k10);
        if (iS < 0) {
            iS = ~iS;
        }
        this.f12417b[iS] = k10;
        this.f12418c[iS] = f10;
    }

    public final int m0() {
        int i10 = this.f12419d;
        int iY = b3.y(b3.A(this.f12420e));
        if (iY >= i10) {
            return 0;
        }
        k0(iY);
        return i10 - this.f12419d;
    }

    public /* synthetic */ e2(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public e2(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            t.f.c("Capacity must be a positive value.");
        }
        W(b3.A(i10));
    }
}
