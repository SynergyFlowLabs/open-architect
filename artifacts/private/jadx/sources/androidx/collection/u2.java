package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1051:1\n367#1,6:1054\n377#1,3:1061\n380#1,9:1065\n367#1,6:1074\n377#1,3:1081\n380#1,9:1085\n367#1,6:1094\n377#1,3:1101\n380#1,9:1105\n395#1,4:1114\n367#1,6:1118\n377#1,3:1125\n380#1,9:1129\n399#1:1138\n395#1,4:1139\n367#1,6:1143\n377#1,3:1150\n380#1,9:1154\n399#1:1163\n395#1,4:1164\n367#1,6:1168\n377#1,3:1175\n380#1,9:1179\n399#1:1188\n410#1,3:1189\n367#1,6:1192\n377#1,3:1199\n380#1,9:1203\n413#1:1212\n395#1,4:1213\n367#1,6:1217\n377#1,3:1224\n380#1,9:1228\n399#1:1237\n395#1,4:1238\n367#1,6:1242\n377#1,3:1249\n380#1,9:1253\n399#1:1262\n395#1,4:1263\n367#1,6:1267\n377#1,3:1274\n380#1,9:1278\n399#1:1287\n395#1,4:1288\n367#1,6:1292\n377#1,3:1299\n380#1,9:1303\n399#1:1312\n395#1,4:1313\n367#1,6:1317\n377#1,3:1324\n380#1,9:1328\n399#1:1337\n395#1,4:1338\n367#1,6:1342\n377#1,3:1349\n380#1,9:1353\n399#1:1362\n492#1,11:1379\n395#1,4:1390\n367#1,6:1394\n377#1,3:1401\n380#1,2:1405\n503#1,10:1407\n383#1,6:1417\n399#1:1423\n513#1,2:1424\n492#1,11:1426\n395#1,4:1437\n367#1,6:1441\n377#1,3:1448\n380#1,2:1452\n503#1,10:1454\n383#1,6:1464\n399#1:1470\n513#1,2:1471\n492#1,11:1473\n395#1,4:1484\n367#1,6:1488\n377#1,3:1495\n380#1,2:1499\n503#1,10:1501\n383#1,6:1511\n399#1:1517\n513#1,2:1518\n492#1,11:1520\n395#1,4:1531\n367#1,6:1535\n377#1,3:1542\n380#1,2:1546\n503#1,10:1548\n383#1,6:1558\n399#1:1564\n513#1,2:1565\n492#1,11:1567\n395#1,4:1578\n367#1,6:1582\n377#1,3:1589\n380#1,2:1593\n503#1,10:1595\n383#1,6:1605\n399#1:1611\n513#1,2:1612\n1399#2:1052\n1270#2:1053\n1399#2:1060\n1270#2:1064\n1399#2:1080\n1270#2:1084\n1399#2:1100\n1270#2:1104\n1399#2:1124\n1270#2:1128\n1399#2:1149\n1270#2:1153\n1399#2:1174\n1270#2:1178\n1399#2:1198\n1270#2:1202\n1399#2:1223\n1270#2:1227\n1399#2:1248\n1270#2:1252\n1399#2:1273\n1270#2:1277\n1399#2:1298\n1270#2:1302\n1399#2:1323\n1270#2:1327\n1399#2:1348\n1270#2:1352\n1165#2,3:1363\n1179#2:1366\n1175#2:1367\n1372#2,3:1368\n1386#2,3:1371\n1312#2:1374\n1303#2:1375\n1297#2:1376\n1309#2:1377\n1393#2:1378\n1399#2:1400\n1270#2:1404\n1399#2:1447\n1270#2:1451\n1399#2:1494\n1270#2:1498\n1399#2:1541\n1270#2:1545\n1399#2:1588\n1270#2:1592\n*S KotlinDebug\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n*L\n398#1:1054,6\n398#1:1061,3\n398#1:1065,9\n405#1:1074,6\n405#1:1081,3\n405#1:1085,9\n412#1:1094,6\n412#1:1101,3\n412#1:1105,9\n417#1:1114,4\n417#1:1118,6\n417#1:1125,3\n417#1:1129,9\n417#1:1138\n423#1:1139,4\n423#1:1143,6\n423#1:1150,3\n423#1:1154,9\n423#1:1163\n433#1:1164,4\n433#1:1168,6\n433#1:1175,3\n433#1:1179,9\n433#1:1188\n445#1:1189,3\n445#1:1192,6\n445#1:1199,3\n445#1:1203,9\n445#1:1212\n467#1:1213,4\n467#1:1217,6\n467#1:1224,3\n467#1:1228,9\n467#1:1237\n502#1:1238,4\n502#1:1242,6\n502#1:1249,3\n502#1:1253,9\n502#1:1262\n502#1:1263,4\n502#1:1267,6\n502#1:1274,3\n502#1:1278,9\n502#1:1287\n523#1:1288,4\n523#1:1292,6\n523#1:1299,3\n523#1:1303,9\n523#1:1312\n549#1:1313,4\n549#1:1317,6\n549#1:1324,3\n549#1:1328,9\n549#1:1337\n571#1:1338,4\n571#1:1342,6\n571#1:1349,3\n571#1:1353,9\n571#1:1362\n-1#1:1379,11\n-1#1:1390,4\n-1#1:1394,6\n-1#1:1401,3\n-1#1:1405,2\n-1#1:1407,10\n-1#1:1417,6\n-1#1:1423\n-1#1:1424,2\n-1#1:1426,11\n-1#1:1437,4\n-1#1:1441,6\n-1#1:1448,3\n-1#1:1452,2\n-1#1:1454,10\n-1#1:1464,6\n-1#1:1470\n-1#1:1471,2\n-1#1:1473,11\n-1#1:1484,4\n-1#1:1488,6\n-1#1:1495,3\n-1#1:1499,2\n-1#1:1501,10\n-1#1:1511,6\n-1#1:1517\n-1#1:1518,2\n-1#1:1520,11\n-1#1:1531,4\n-1#1:1535,6\n-1#1:1542,3\n-1#1:1546,2\n-1#1:1548,10\n-1#1:1558,6\n-1#1:1564\n-1#1:1565,2\n-1#1:1567,11\n-1#1:1578,4\n-1#1:1582,6\n-1#1:1589,3\n-1#1:1593,2\n-1#1:1595,10\n-1#1:1605,6\n-1#1:1611\n-1#1:1612,2\n372#1:1052\n379#1:1053\n398#1:1060\n398#1:1064\n405#1:1080\n405#1:1084\n412#1:1100\n412#1:1104\n417#1:1124\n417#1:1128\n423#1:1149\n423#1:1153\n433#1:1174\n433#1:1178\n445#1:1198\n445#1:1202\n467#1:1223\n467#1:1227\n502#1:1248\n502#1:1252\n502#1:1273\n502#1:1277\n523#1:1298\n523#1:1302\n549#1:1323\n549#1:1327\n571#1:1348\n571#1:1352\n590#1:1363,3\n591#1:1366\n594#1:1367\n598#1:1368,3\n599#1:1371,3\n600#1:1374\n601#1:1375\n601#1:1376\n605#1:1377\n608#1:1378\n-1#1:1400\n-1#1:1404\n-1#1:1447\n-1#1:1451\n-1#1:1494\n-1#1:1498\n-1#1:1541\n-1#1:1545\n-1#1:1588\n-1#1:1592\n*E\n"})
public abstract class u2<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f12469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public int f12471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public int f12472e;

    public /* synthetic */ u2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String L(u2 u2Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return u2Var.E(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String M(u2 u2Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function2 transform, int i11, Object obj) {
        long[] jArr;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence separator = (i11 & 1) != 0 ? ", " : charSequence;
        CharSequence prefix = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence postfix = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        CharSequence truncated = (i11 & 16) != 0 ? "..." : charSequence4;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = u2Var.f12469b;
        long[] jArr2 = u2Var.f12470c;
        long[] jArr3 = u2Var.f12468a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            long j10 = jArr3[i13];
            int i15 = i13;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j10 & 255) < 128) {
                        int i19 = (i15 << 3) + i18;
                        Object obj2 = objArr[i19];
                        long j11 = jArr2[i19];
                        if (i14 == i12) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i14 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append((CharSequence) transform.invoke(obj2, Long.valueOf(j11)));
                        i14++;
                    }
                    j10 >>= i16;
                    i18++;
                    i16 = i16;
                    jArr3 = jArr3;
                }
                jArr = jArr3;
                if (i17 == i16) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr3;
            if (i15 == length) {
                sb2.append(postfix);
                break;
            }
            i13 = i15 + 1;
            jArr3 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @kotlin.a1
    public static /* synthetic */ void p() {
    }

    @kotlin.a1
    public static /* synthetic */ void q() {
    }

    @kotlin.a1
    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void w() {
    }

    @oj.j
    @NotNull
    public final String A(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return L(this, separator, null, null, 0, null, 30, null);
    }

    @oj.j
    @NotNull
    public final String B(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return L(this, separator, prefix, null, 0, null, 28, null);
    }

    @oj.j
    @NotNull
    public final String C(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return L(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @oj.j
    @NotNull
    public final String D(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return L(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @oj.j
    @NotNull
    public final String E(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f12469b;
        long[] jArr2 = this.f12470c;
        long[] jArr3 = this.f12468a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr3[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        Object obj = objArr[i16];
                        long j11 = jArr2[i16];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(obj);
                        sb2.append('=');
                        sb2.append(j11);
                        i12++;
                    }
                    j10 >>= i13;
                    i15++;
                    i13 = i13;
                    jArr3 = jArr3;
                }
                jArr = jArr3;
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr3;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            jArr3 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    @NotNull
    public final String F(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @NotNull Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f12469b;
        long[] jArr2 = this.f12470c;
        long[] jArr3 = this.f12468a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr3[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                char c10 = '\b';
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j10 & 255) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        long j11 = jArr2[i15];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Long.valueOf(j11)));
                        i12++;
                    }
                    j10 >>= c10;
                    i14++;
                    c10 = c10;
                    jArr3 = jArr3;
                }
                jArr = jArr3;
                if (i13 == c10) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr3;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            jArr3 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    @NotNull
    public final String G(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f12469b;
        long[] jArr2 = this.f12470c;
        long[] jArr3 = this.f12468a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr3[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                char c10 = '\b';
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j10 & 255) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        long j11 = jArr2[i15];
                        if (i12 == i10) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Long.valueOf(j11)));
                        i12++;
                    }
                    j10 >>= c10;
                    i14++;
                    c10 = c10;
                    jArr3 = jArr3;
                }
                jArr = jArr3;
                if (i13 == c10) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr3;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            jArr3 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0097 A[DONT_INVERT, PHI: r10
      0x0097: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0047, B:20:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0099 A[LOOP:0: B:5:0x0039->B:22:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String H(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i10 == length) {
                    sb2.append(postfix);
                    break;
                }
                i10++;
            } else {
                int i12 = 8;
                int i13 = 8 - ((~(i10 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j10 & 255) < 128) {
                        int i15 = (i10 << 3) + i14;
                        Object obj = objArr[i15];
                        long j11 = jArr[i15];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Long.valueOf(j11)));
                        i11++;
                    }
                    j10 >>= i12;
                    i14++;
                    i12 = i12;
                }
                if (i13 == i12) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f A[DONT_INVERT, PHI: r9
      0x008f: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0041, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0091 A[LOOP:0: B:5:0x002e->B:22:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String I(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i10 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i10++;
            } else {
                int i12 = 8;
                int i13 = 8 - ((~(i10 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = (i10 << 3) + i14;
                        Object obj = objArr[i15];
                        long j11 = jArr[i15];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Long.valueOf(j11)));
                        i11++;
                    }
                    j10 >>= i12;
                    i14++;
                    i12 = i12;
                }
                if (i13 == i12) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0087 A[DONT_INVERT, PHI: r10
      0x0087: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0039, B:20:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0089 A[LOOP:0: B:5:0x002b->B:22:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008c A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String J(@NotNull CharSequence separator, @NotNull Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i10 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i10++;
            } else {
                int i12 = 8;
                int i13 = 8 - ((~(i10 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j10 & 255) < 128) {
                        int i15 = (i10 << 3) + i14;
                        Object obj = objArr[i15];
                        long j11 = jArr[i15];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Long.valueOf(j11)));
                        i11++;
                    }
                    j10 >>= i12;
                    i14++;
                    i12 = i12;
                }
                if (i13 == i12) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007c A[DONT_INVERT, PHI: r9
      0x007c: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x002e, B:20:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007e A[LOOP:0: B:5:0x0020->B:22:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String K(@NotNull Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i10 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i10++;
            } else {
                char c10 = '\b';
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        long j11 = jArr[i14];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(obj, Long.valueOf(j11)));
                        i11++;
                    }
                    j10 >>= c10;
                    i13++;
                    c10 = c10;
                }
                if (i12 == c10) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean N() {
        return this.f12472e == 0;
    }

    public final boolean a(@NotNull Function2<? super K, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!predicate.invoke(objArr[i13], Long.valueOf(jArr[i13])).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean b() {
        return this.f12472e != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[LOOP:0: B:5:0x0012->B:18:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[SYNTHETIC] */
    public final boolean c(@NotNull Function2<? super K, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (predicate.invoke(objArr[i13], Long.valueOf(jArr[i13])).booleanValue()) {
                                return true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    public final boolean d(K k10) {
        return e(k10);
    }

    public final boolean e(K k10) {
        return i(k10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[LOOP:0: B:14:0x0027->B:28:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x006f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        if (u2Var.t() != t()) {
            return false;
        }
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            long j11 = jArr[i13];
                            int i14 = u2Var.i(obj2);
                            if (i14 < 0 || j11 != u2Var.f12470c[i14]) {
                                break loop0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0044 A[LOOP:0: B:5:0x000c->B:18:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[SYNTHETIC] */
    public final boolean f(long j10) {
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr2[i10];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128 && j10 == jArr[(i10 << 3) + i12]) {
                            return true;
                        }
                        j11 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    public final int g() {
        return t();
    }

    public final int h(@NotNull Function2<? super K, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        if (predicate.invoke(objArr[i14], Long.valueOf(jArr[i14])).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public int hashCode() {
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    @kotlin.a1
    public final int i(K k10) {
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12471d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12468a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12469b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final void j(@NotNull Function2<? super K, ? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
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
                        block.invoke(objArr[i13], Long.valueOf(jArr[i13]));
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
    public final void k(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12468a;
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
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
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

    public final void l(@NotNull Function1<? super K, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12468a;
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
                        block.invoke(objArr[(i10 << 3) + i12]);
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

    /* JADX WARN: Code duplicated, block: B:14:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005c A[LOOP:0: B:5:0x0016->B:15:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[EDGE_INSN: B:19:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0016->B:15:0x005c], SYNTHETIC] */
    public final void m(@NotNull Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
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
                            block.invoke(Long.valueOf(jArr[(i10 << 3) + i12]));
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

    public final long n(K k10) {
        int i10 = i(k10);
        if (i10 < 0) {
            t.f.f("There is no key " + k10 + " in the map");
        }
        return this.f12470c[i10];
    }

    public final int o() {
        return this.f12471d;
    }

    public final long r(K k10, long j10) {
        int i10 = i(k10);
        return i10 >= 0 ? this.f12470c[i10] : j10;
    }

    public final long s(K k10, @NotNull Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int i10 = i(k10);
        return i10 >= 0 ? this.f12470c[i10] : defaultValue.invoke().longValue();
    }

    public final int t() {
        return this.f12472e;
    }

    @NotNull
    public String toString() {
        int i10;
        int i11;
        if (x()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        Object[] objArr = this.f12469b;
        long[] jArr = this.f12470c;
        long[] jArr2 = this.f12468a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = objArr[i16];
                            i11 = i12;
                            long j11 = jArr[i16];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(j11);
                            i13++;
                            if (i13 < this.f12472e) {
                                sb2.append(AbstractJsonLexerKt.COMMA);
                                sb2.append(' ');
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean x() {
        return this.f12472e == 0;
    }

    public final boolean y() {
        return this.f12472e != 0;
    }

    @oj.j
    @NotNull
    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }

    private u2() {
        this.f12468a = b3.f12145e;
        this.f12469b = t.a.f376160c;
        this.f12470c = a1.d();
    }
}
