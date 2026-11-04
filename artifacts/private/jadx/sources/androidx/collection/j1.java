package androidx.collection;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatList.kt\nandroidx/collection/FloatList\n+ 8 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1036:1\n59#2,5:1037\n1#3:1042\n1254#4,6:1043\n1399#4:1059\n1270#4:1063\n1399#4:1080\n1270#4:1084\n1399#4:1105\n1270#4:1109\n1230#4:1126\n1254#4,6:1127\n1242#4:1133\n1241#4,4:1134\n1254#4,6:1138\n1175#4:1147\n1179#4:1148\n1372#4,3:1149\n1386#4,3:1152\n1312#4:1155\n1303#4:1156\n1297#4:1157\n1309#4:1158\n1393#4:1159\n1265#4:1160\n1220#4:1161\n1262#4:1162\n1220#4:1163\n1230#4:1164\n1254#4,6:1165\n1242#4:1171\n1241#4,4:1172\n1372#4,3:1176\n1399#4:1179\n1297#4:1180\n1144#4,14:1181\n1220#4:1195\n1175#4:1199\n1179#4:1200\n1254#4,6:1201\n1220#4:1207\n1179#4:1208\n1254#4,6:1209\n1254#4,6:1215\n1179#4:1221\n1254#4,6:1222\n1268#4:1228\n1220#4:1229\n1175#4:1233\n1179#4:1234\n1230#4:1235\n1254#4,6:1236\n1242#4:1242\n1241#4,4:1243\n389#5,4:1049\n361#5,6:1053\n371#5,3:1060\n374#5,9:1064\n393#5:1073\n361#5,6:1074\n371#5,3:1081\n374#5,9:1085\n257#6,4:1094\n227#6,7:1098\n238#6,3:1106\n241#6,9:1110\n261#6:1119\n237#7,6:1120\n882#8,3:1144\n882#8,3:1196\n882#8,3:1230\n*S KotlinDebug\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n*L\n641#1:1037,5\n669#1:1043,6\n741#1:1059\n741#1:1063\n772#1:1080\n772#1:1084\n793#1:1105\n793#1:1109\n807#1:1126\n807#1:1127,6\n807#1:1133\n807#1:1134,4\n815#1:1138,6\n828#1:1147\n829#1:1148\n836#1:1149,3\n837#1:1152,3\n838#1:1155\n839#1:1156\n839#1:1157\n843#1:1158\n846#1:1159\n855#1:1160\n855#1:1161\n861#1:1162\n861#1:1163\n862#1:1164\n862#1:1165,6\n862#1:1171\n862#1:1172,4\n877#1:1176,3\n878#1:1179\n880#1:1180\n926#1:1181,14\n932#1:1195\n947#1:1199\n958#1:1200\n959#1:1201,6\n969#1:1207\n972#1:1208\n973#1:1209,6\n974#1:1215,6\n984#1:1221\n985#1:1222,6\n1024#1:1228\n1024#1:1229\n1027#1:1233\n1029#1:1234\n1029#1:1235\n1029#1:1236,6\n1029#1:1242\n1029#1:1243,4\n741#1:1049,4\n741#1:1053,6\n741#1:1060,3\n741#1:1064,9\n741#1:1073\n772#1:1074,6\n772#1:1081,3\n772#1:1085,9\n793#1:1094,4\n793#1:1098,7\n793#1:1106,3\n793#1:1110,9\n793#1:1119\n798#1:1120,6\n827#1:1144,3\n946#1:1196,3\n1026#1:1230,3\n*E\n"})
public final class j1 extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12306f;

    public j1() {
        this(0, 1, null);
    }

    private final int R(int i10) {
        int i11 = this.f12351d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12348a;
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

    private final int S(float f10) {
        int iHashCode = Float.hashCode(f10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12351d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12348a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * b3.f12151k);
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f12349b[iNumberOfTrailingZeros] == f10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iR = R(i11);
                if (this.f12306f == 0 && ((this.f12348a[iR >> 3] >> ((iR & 7) << 3)) & 255) != 254) {
                    O();
                    iR = R(i11);
                }
                this.f12352e++;
                int i19 = this.f12306f;
                long[] jArr2 = this.f12348a;
                int i20 = iR >> 3;
                long j14 = jArr2[i20];
                int i21 = (iR & 7) << 3;
                this.f12306f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f12351d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iR - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iR;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final void U() {
        this.f12306f = b3.p(o()) - this.f12352e;
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
        this.f12348a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        U();
    }

    private final void W(int i10) {
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12351d = iMax;
        V(iMax);
        this.f12349b = new float[iMax];
        this.f12350c = new float[iMax];
    }

    public final void O() {
        if (this.f12351d <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(this.f12352e) * 32), kotlin.y1.n(kotlin.y1.n(this.f12351d) * 25)) > 0) {
            j0(b3.x(this.f12351d));
        } else {
            Q();
        }
    }

    public final void P() {
        this.f12352e = 0;
        long[] jArr = this.f12348a;
        if (jArr != b3.f12145e) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12348a;
            int i10 = this.f12351d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        U();
    }

    public final void Q() {
        long[] jArr = this.f12348a;
        int i10 = this.f12351d;
        float[] fArr = this.f12349b;
        float[] fArr2 = this.f12350c;
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
                int iR = R(i18);
                int i19 = i18 & i10;
                char c11 = c10;
                if (((iR - i19) & i10) / 8 == ((i14 - i19) & i10) / 8) {
                    jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[c11] & j11) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                } else {
                    int i20 = iR >> 3;
                    long j13 = jArr[i20];
                    int i21 = (iR & 7) << 3;
                    if (((j13 >> i21) & 255) == 128) {
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j13 & (~(255 << i21)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        fArr[iR] = fArr[i14];
                        fArr[i14] = 0.0f;
                        fArr2[iR] = fArr2[i14];
                        fArr2[i14] = 0.0f;
                    } else {
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j13 & (~(255 << i21)));
                        float f10 = fArr[iR];
                        fArr[iR] = fArr[i14];
                        fArr[i14] = f10;
                        float f11 = fArr2[iR];
                        fArr2[iR] = fArr2[i14];
                        fArr2[i14] = f11;
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
        U();
    }

    public final float T(float f10, @NotNull Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int i10 = i(f10);
        if (i10 >= 0) {
            return this.f12350c[i10];
        }
        float fFloatValue = defaultValue.invoke().floatValue();
        d0(f10, fFloatValue);
        return fFloatValue;
    }

    public final void X(float f10) {
        f0(f10);
    }

    public final void Y(@NotNull r keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        float[] fArr = keys.f12441a;
        int i10 = keys.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            f0(fArr[i11]);
        }
    }

    public final void Z(@NotNull x keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        float[] fArr = keys.f12506b;
        long[] jArr = keys.f12505a;
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
                        f0(fArr[(i10 << 3) + i12]);
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

    public final void a0(@NotNull float[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (float f10 : keys) {
            f0(f10);
        }
    }

    public final void b0(@NotNull m from) {
        Intrinsics.checkNotNullParameter(from, "from");
        e0(from);
    }

    public final float c0(float f10, float f11, float f12) {
        int iS = S(f10);
        if (iS < 0) {
            iS = ~iS;
        } else {
            f12 = this.f12350c[iS];
        }
        this.f12349b[iS] = f10;
        this.f12350c[iS] = f11;
        return f12;
    }

    public final void d0(float f10, float f11) {
        k0(f10, f11);
    }

    public final void e0(@NotNull m from) {
        Intrinsics.checkNotNullParameter(from, "from");
        float[] fArr = from.f12349b;
        float[] fArr2 = from.f12350c;
        long[] jArr = from.f12348a;
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
                        k0(fArr[i13], fArr2[i13]);
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

    public final void f0(float f10) {
        int i10 = i(f10);
        if (i10 >= 0) {
            i0(i10);
        }
    }

    public final boolean g0(float f10, float f11) {
        int i10 = i(f10);
        if (i10 < 0 || this.f12350c[i10] != f11) {
            return false;
        }
        i0(i10);
        return true;
    }

    public final void h0(@NotNull Function2<? super Float, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12348a;
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
                        if (predicate.invoke(Float.valueOf(this.f12349b[i13]), Float.valueOf(this.f12350c[i13])).booleanValue()) {
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
        this.f12352e--;
        long[] jArr = this.f12348a;
        int i11 = this.f12351d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final void j0(int i10) {
        j1 j1Var = this;
        long[] jArr = j1Var.f12348a;
        float[] fArr = j1Var.f12349b;
        float[] fArr2 = j1Var.f12350c;
        int i11 = j1Var.f12351d;
        W(i10);
        long[] jArr2 = j1Var.f12348a;
        float[] fArr3 = j1Var.f12349b;
        float[] fArr4 = j1Var.f12350c;
        int i12 = j1Var.f12351d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                float f10 = fArr[i13];
                int iHashCode = Float.hashCode(f10) * b3.f12150j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iR = j1Var.R(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iR >> 3;
                int i16 = (iR & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iR - 7) & i12) + (i12 & 7)) >> 3] = j11;
                fArr3[iR] = f10;
                fArr4[iR] = fArr2[i13];
            }
            i13++;
            j1Var = this;
            jArr = jArr;
        }
    }

    public final void k0(float f10, float f11) {
        int iS = S(f10);
        if (iS < 0) {
            iS = ~iS;
        }
        this.f12349b[iS] = f10;
        this.f12350c[iS] = f11;
    }

    public final int l0() {
        int i10 = this.f12351d;
        int iY = b3.y(b3.A(this.f12352e));
        if (iY >= i10) {
            return 0;
        }
        j0(iY);
        return i10 - this.f12351d;
    }

    public j1(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            t.f.c("Capacity must be a positive value.");
        }
        W(b3.A(i10));
    }

    public /* synthetic */ j1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
