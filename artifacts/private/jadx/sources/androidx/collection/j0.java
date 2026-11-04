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
@SourceDebugExtension({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 2 IntSet.kt\nandroidx/collection/IntSetKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1017:1\n577#1:1018\n578#1:1022\n580#1,2:1024\n582#1,4:1027\n586#1:1034\n587#1:1038\n588#1:1040\n589#1,4:1043\n595#1:1048\n596#1,8:1050\n577#1:1058\n578#1:1062\n580#1,2:1064\n582#1,4:1067\n586#1:1074\n587#1:1078\n588#1:1080\n589#1,4:1083\n595#1:1088\n596#1,8:1090\n354#1,6:1100\n364#1,3:1107\n367#1,9:1111\n354#1,6:1120\n364#1,3:1127\n367#1,9:1131\n354#1,6:1140\n364#1,3:1147\n367#1,9:1151\n382#1,4:1160\n354#1,6:1164\n364#1,3:1171\n367#1,9:1175\n386#1:1184\n382#1,4:1185\n354#1,6:1189\n364#1,3:1196\n367#1,9:1200\n386#1:1209\n382#1,4:1210\n354#1,6:1214\n364#1,3:1221\n367#1,9:1225\n386#1:1234\n577#1:1235\n578#1:1239\n580#1,2:1241\n582#1,4:1244\n586#1:1251\n587#1:1255\n588#1:1257\n589#1,4:1260\n595#1:1265\n596#1,8:1267\n397#1,3:1275\n354#1,6:1278\n364#1,3:1285\n367#1,9:1289\n400#1:1298\n382#1,4:1299\n354#1,6:1303\n364#1,3:1310\n367#1,9:1314\n386#1:1323\n382#1,4:1324\n354#1,6:1328\n364#1,3:1335\n367#1,9:1339\n386#1:1348\n382#1,4:1349\n354#1,6:1353\n364#1,3:1360\n367#1,9:1364\n386#1:1373\n382#1,4:1374\n354#1,6:1378\n364#1,3:1385\n367#1,9:1389\n386#1:1398\n382#1,4:1399\n354#1,6:1403\n364#1,3:1410\n367#1,9:1414\n386#1:1423\n382#1,4:1424\n354#1,6:1428\n364#1,3:1435\n367#1,9:1439\n386#1:1448\n479#1,11:1465\n382#1,4:1476\n354#1,6:1480\n364#1,3:1487\n367#1,2:1491\n490#1,10:1493\n370#1,6:1503\n386#1:1509\n500#1,2:1510\n479#1,11:1512\n382#1,4:1523\n354#1,6:1527\n364#1,3:1534\n367#1,2:1538\n490#1,10:1540\n370#1,6:1550\n386#1:1556\n500#1,2:1557\n479#1,11:1559\n382#1,4:1570\n354#1,6:1574\n364#1,3:1581\n367#1,2:1585\n490#1,10:1587\n370#1,6:1597\n386#1:1603\n500#1,2:1604\n479#1,11:1606\n382#1,4:1617\n354#1,6:1621\n364#1,3:1628\n367#1,2:1632\n490#1,10:1634\n370#1,6:1644\n386#1:1650\n500#1,2:1651\n479#1,11:1653\n382#1,4:1664\n354#1,6:1668\n364#1,3:1675\n367#1,2:1679\n490#1,10:1681\n370#1,6:1691\n386#1:1697\n500#1,2:1698\n880#2,3:1019\n880#2,3:1059\n880#2,3:1236\n880#2,3:1449\n1179#3:1023\n1175#3:1026\n1372#3,3:1031\n1386#3,3:1035\n1312#3:1039\n1303#3:1041\n1297#3:1042\n1309#3:1047\n1393#3:1049\n1179#3:1063\n1175#3:1066\n1372#3,3:1071\n1386#3,3:1075\n1312#3:1079\n1303#3:1081\n1297#3:1082\n1309#3:1087\n1393#3:1089\n1399#3:1098\n1270#3:1099\n1399#3:1106\n1270#3:1110\n1399#3:1126\n1270#3:1130\n1399#3:1146\n1270#3:1150\n1399#3:1170\n1270#3:1174\n1399#3:1195\n1270#3:1199\n1399#3:1220\n1270#3:1224\n1179#3:1240\n1175#3:1243\n1372#3,3:1248\n1386#3,3:1252\n1312#3:1256\n1303#3:1258\n1297#3:1259\n1309#3:1264\n1393#3:1266\n1399#3:1284\n1270#3:1288\n1399#3:1309\n1270#3:1313\n1399#3:1334\n1270#3:1338\n1399#3:1359\n1270#3:1363\n1399#3:1384\n1270#3:1388\n1399#3:1409\n1270#3:1413\n1399#3:1434\n1270#3:1438\n1179#3:1452\n1175#3:1453\n1372#3,3:1454\n1386#3,3:1457\n1312#3:1460\n1303#3:1461\n1297#3:1462\n1309#3:1463\n1393#3:1464\n1399#3:1486\n1270#3:1490\n1399#3:1533\n1270#3:1537\n1399#3:1580\n1270#3:1584\n1399#3:1627\n1270#3:1631\n1399#3:1674\n1270#3:1678\n*S KotlinDebug\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n324#1:1018\n324#1:1022\n324#1:1024,2\n324#1:1027,4\n324#1:1034\n324#1:1038\n324#1:1040\n324#1:1043,4\n324#1:1048\n324#1:1050,8\n333#1:1058\n333#1:1062\n333#1:1064,2\n333#1:1067,4\n333#1:1074\n333#1:1078\n333#1:1080\n333#1:1083,4\n333#1:1088\n333#1:1090,8\n385#1:1100,6\n385#1:1107,3\n385#1:1111,9\n392#1:1120,6\n392#1:1127,3\n392#1:1131,9\n399#1:1140,6\n399#1:1147,3\n399#1:1151,9\n404#1:1160,4\n404#1:1164,6\n404#1:1171,3\n404#1:1175,9\n404#1:1184\n410#1:1185,4\n410#1:1189,6\n410#1:1196,3\n410#1:1200,9\n410#1:1209\n420#1:1210,4\n420#1:1214,6\n420#1:1221,3\n420#1:1225,9\n420#1:1234\n428#1:1235\n428#1:1239\n428#1:1241,2\n428#1:1244,4\n428#1:1251\n428#1:1255\n428#1:1257\n428#1:1260,4\n428#1:1265\n428#1:1267,8\n432#1:1275,3\n432#1:1278,6\n432#1:1285,3\n432#1:1289,9\n432#1:1298\n454#1:1299,4\n454#1:1303,6\n454#1:1310,3\n454#1:1314,9\n454#1:1323\n489#1:1324,4\n489#1:1328,6\n489#1:1335,3\n489#1:1339,9\n489#1:1348\n489#1:1349,4\n489#1:1353,6\n489#1:1360,3\n489#1:1364,9\n489#1:1373\n510#1:1374,4\n510#1:1378,6\n510#1:1385,3\n510#1:1389,9\n510#1:1398\n534#1:1399,4\n534#1:1403,6\n534#1:1410,3\n534#1:1414,9\n534#1:1423\n559#1:1424,4\n559#1:1428,6\n559#1:1435,3\n559#1:1439,9\n559#1:1448\n-1#1:1465,11\n-1#1:1476,4\n-1#1:1480,6\n-1#1:1487,3\n-1#1:1491,2\n-1#1:1493,10\n-1#1:1503,6\n-1#1:1509\n-1#1:1510,2\n-1#1:1512,11\n-1#1:1523,4\n-1#1:1527,6\n-1#1:1534,3\n-1#1:1538,2\n-1#1:1540,10\n-1#1:1550,6\n-1#1:1556\n-1#1:1557,2\n-1#1:1559,11\n-1#1:1570,4\n-1#1:1574,6\n-1#1:1581,3\n-1#1:1585,2\n-1#1:1587,10\n-1#1:1597,6\n-1#1:1603\n-1#1:1604,2\n-1#1:1606,11\n-1#1:1617,4\n-1#1:1621,6\n-1#1:1628,3\n-1#1:1632,2\n-1#1:1634,10\n-1#1:1644,6\n-1#1:1650\n-1#1:1651,2\n-1#1:1653,11\n-1#1:1664,4\n-1#1:1668,6\n-1#1:1675,3\n-1#1:1679,2\n-1#1:1681,10\n-1#1:1691,6\n-1#1:1697\n-1#1:1698,2\n324#1:1019,3\n333#1:1059,3\n428#1:1236,3\n577#1:1449,3\n324#1:1023\n324#1:1026\n324#1:1031,3\n324#1:1035,3\n324#1:1039\n324#1:1041\n324#1:1042\n324#1:1047\n324#1:1049\n333#1:1063\n333#1:1066\n333#1:1071,3\n333#1:1075,3\n333#1:1079\n333#1:1081\n333#1:1082\n333#1:1087\n333#1:1089\n359#1:1098\n366#1:1099\n385#1:1106\n385#1:1110\n392#1:1126\n392#1:1130\n399#1:1146\n399#1:1150\n404#1:1170\n404#1:1174\n410#1:1195\n410#1:1199\n420#1:1220\n420#1:1224\n428#1:1240\n428#1:1243\n428#1:1248,3\n428#1:1252,3\n428#1:1256\n428#1:1258\n428#1:1259\n428#1:1264\n428#1:1266\n432#1:1284\n432#1:1288\n454#1:1309\n454#1:1313\n489#1:1334\n489#1:1338\n489#1:1359\n489#1:1363\n510#1:1384\n510#1:1388\n534#1:1409\n534#1:1413\n559#1:1434\n559#1:1438\n578#1:1452\n581#1:1453\n585#1:1454,3\n586#1:1457,3\n587#1:1460\n588#1:1461\n588#1:1462\n592#1:1463\n595#1:1464\n-1#1:1486\n-1#1:1490\n-1#1:1533\n-1#1:1537\n-1#1:1580\n-1#1:1584\n-1#1:1627\n-1#1:1631\n-1#1:1674\n-1#1:1678\n*E\n"})
public abstract class j0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public int[] f12302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f12303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public int f12304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public int f12305e;

    public /* synthetic */ j0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String L(j0 j0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return j0Var.E(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String M(j0 j0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function2 transform, int i11, Object obj) {
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
        int[] iArr = j0Var.f12302b;
        Object[] objArr = j0Var.f12303c;
        long[] jArr2 = j0Var.f12301a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            long j10 = jArr2[i13];
            int i15 = i13;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j10 & 255) < 128) {
                        int i19 = (i15 << 3) + i18;
                        int i20 = iArr[i19];
                        Object obj2 = objArr[i19];
                        if (i14 == i12) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i14 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append((CharSequence) transform.invoke(Integer.valueOf(i20), obj2));
                        i14++;
                    }
                    j10 >>= i16;
                    i18++;
                    i16 = i16;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                if (i17 == i16) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr2;
            if (i15 == length) {
                sb2.append(postfix);
                break;
            }
            i13 = i15 + 1;
            jArr2 = jArr;
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
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr2 = this.f12301a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr2[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        int i17 = iArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(i17);
                        sb2.append('=');
                        sb2.append(obj);
                        i12++;
                    }
                    j10 >>= i13;
                    i15++;
                    i13 = i13;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr2;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            jArr2 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    @NotNull
    public final String F(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @NotNull Function2<? super Integer, ? super V, ? extends CharSequence> transform) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr2 = this.f12301a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr2[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        int i17 = iArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Integer.valueOf(i17), obj));
                        i12++;
                    }
                    j10 >>= i13;
                    i15++;
                    i13 = i13;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr2;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            jArr2 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    @NotNull
    public final String G(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function2<? super Integer, ? super V, ? extends CharSequence> transform) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr2 = this.f12301a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr2[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        int i17 = iArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == i10) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Integer.valueOf(i17), obj));
                        i12++;
                    }
                    j10 >>= i13;
                    i15++;
                    i13 = i13;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr2;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            jArr2 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f A[DONT_INVERT, PHI: r10
      0x008f: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0041, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0091 A[LOOP:0: B:5:0x0033->B:22:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String H(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function2<? super Integer, ? super V, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
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
                        int i16 = iArr[i15];
                        Object obj = objArr[i15];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Integer.valueOf(i16), obj));
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

    /* JADX WARN: Code duplicated, block: B:19:0x0088 A[DONT_INVERT, PHI: r9
      0x0088: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0045, B:18:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x008a A[LOOP:0: B:5:0x0032->B:20:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x008d A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String I(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function2<? super Integer, ? super V, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        int i15 = iArr[i14];
                        Object obj = objArr[i14];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Integer.valueOf(i15), obj));
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
            if (i10 == length) {
                sb2.append((CharSequence) "");
                break;
            }
            i10++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0093 A[DONT_INVERT, PHI: r10
      0x0093: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0040, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0095 A[LOOP:0: B:5:0x002d->B:22:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0098 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String J(@NotNull CharSequence separator, @NotNull Function2<? super Integer, ? super V, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
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
                    if ((j10 & 255) < 128) {
                        int i14 = (i10 << 3) + i13;
                        int i15 = iArr[i14];
                        Object obj = objArr[i14];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Integer.valueOf(i15), obj));
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

    /* JADX WARN: Code duplicated, block: B:19:0x0079 A[DONT_INVERT, PHI: r9
      0x0079: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0032, B:18:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x007b A[LOOP:0: B:5:0x0024->B:20:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String K(@NotNull Function2<? super Integer, ? super V, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        int i15 = iArr[i14];
                        Object obj = objArr[i14];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(Integer.valueOf(i15), obj));
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
            if (i10 == length) {
                sb2.append((CharSequence) "");
                break;
            }
            i10++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean N() {
        return this.f12305e == 0;
    }

    public final boolean a(@NotNull Function2<? super Integer, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!predicate.invoke(Integer.valueOf(iArr[i13]), objArr[i13]).booleanValue()) {
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
        return this.f12305e != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005e A[LOOP:0: B:5:0x0013->B:18:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[SYNTHETIC] */
    public final boolean c(@NotNull Function2<? super Integer, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (predicate.invoke(Integer.valueOf(iArr[i13]), objArr[i13]).booleanValue()) {
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

    public final boolean d(int i10) {
        return e(i10);
    }

    public final boolean e(int i10) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x007b A[LOOP:0: B:14:0x0027->B:33:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x007e A[EDGE_INSN: B:35:0x007e->B:34:0x007e BREAK  A[LOOP:0: B:14:0x0027->B:33:0x007b], SYNTHETIC] */
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (j0Var.t() != t()) {
            return false;
        }
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
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
                            int i13 = (i10 << 3) + i12;
                            int i14 = iArr[i13];
                            Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (j0Var.n(i14) != null || !j0Var.e(i14)) {
                                    return false;
                                }
                            } else if (!Intrinsics.areEqual(obj2, j0Var.n(i14))) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[LOOP:0: B:5:0x000f->B:19:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[SYNTHETIC] */
    public final boolean f(V v10) {
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && Intrinsics.areEqual(v10, objArr[(i10 << 3) + i12])) {
                            return true;
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

    public final int g() {
        return t();
    }

    public final int h(@NotNull Function2<? super Integer, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        if (predicate.invoke(Integer.valueOf(iArr[i14]), objArr[i14]).booleanValue()) {
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
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        int i14 = iArr[i13];
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i14);
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

    public final int i(int i10) {
        int iHashCode = Integer.hashCode(i10) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12304d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12301a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f12302b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final void j(@NotNull Function2<? super Integer, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
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
                        block.invoke(Integer.valueOf(iArr[i13]), objArr[i13]);
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

    public final void l(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.f12302b;
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
                        block.invoke(Integer.valueOf(iArr[(i10 << 3) + i12]));
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

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:5:0x0012->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[EDGE_INSN: B:20:0x0056->B:17:0x0056 BREAK  A[LOOP:0: B:5:0x0012->B:16:0x0053], SYNTHETIC] */
    public final void m(@NotNull Function1<? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
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
                            block.invoke(objArr[(i10 << 3) + i12]);
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

    @Nullable
    public final V n(int i10) {
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
                int i18 = 5 ^ (-1);
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.f12303c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int o() {
        return this.f12304d;
    }

    public final V r(int i10, V v10) {
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
        return iNumberOfTrailingZeros >= 0 ? (V) this.f12303c[iNumberOfTrailingZeros] : v10;
    }

    public final V s(int i10, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V vN = n(i10);
        if (vN == null) {
            vN = defaultValue.invoke();
        }
        return vN;
    }

    public final int t() {
        return this.f12305e;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079 A[DONT_INVERT, PHI: r8
      0x0079: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0034, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x007b A[LOOP:0: B:9:0x0026->B:24:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[EDGE_INSN: B:28:0x007e->B:25:0x007e BREAK  A[LOOP:0: B:9:0x0026->B:24:0x007b], SYNTHETIC] */
    @NotNull
    public String toString() {
        if (x()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int[] iArr = this.f12302b;
        Object[] objArr = this.f12303c;
        long[] jArr = this.f12301a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            Object obj = objArr[i14];
                            sb2.append(i15);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i11++;
                            if (i11 < this.f12305e) {
                                sb2.append(AbstractJsonLexerKt.COMMA);
                                sb2.append(' ');
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean x() {
        if (this.f12305e != 0) {
            return false;
        }
        boolean z10 = true | true;
        return true;
    }

    public final boolean y() {
        return this.f12305e != 0;
    }

    @oj.j
    @NotNull
    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }

    private j0() {
        this.f12301a = b3.f12145e;
        this.f12302b = m0.d();
        this.f12303c = t.a.f376160c;
    }
}
