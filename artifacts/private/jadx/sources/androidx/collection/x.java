package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,886:1\n257#1,4:887\n227#1,7:891\n238#1,3:899\n241#1,9:903\n261#1:912\n257#1,4:913\n227#1,7:917\n238#1,3:925\n241#1,9:929\n261#1:938\n227#1,7:941\n238#1,3:949\n241#1,9:953\n257#1,4:962\n227#1,7:966\n238#1,3:974\n241#1,9:978\n261#1:987\n257#1,4:988\n227#1,7:992\n238#1,3:1000\n241#1,9:1004\n261#1:1013\n257#1,4:1014\n227#1,7:1018\n238#1,3:1026\n241#1,9:1030\n261#1:1039\n427#1:1040\n428#1:1044\n430#1,2:1046\n432#1,3:1049\n435#1:1055\n436#1:1059\n437#1:1061\n438#1,4:1064\n444#1:1069\n445#1,8:1071\n257#1,4:1079\n227#1,7:1083\n238#1,3:1091\n241#1,9:1095\n261#1:1104\n257#1,4:1105\n227#1,7:1109\n238#1,3:1117\n241#1,9:1121\n261#1:1130\n257#1,4:1131\n227#1,7:1135\n238#1,3:1143\n241#1,9:1147\n261#1:1156\n257#1,4:1157\n227#1,7:1161\n238#1,3:1169\n241#1,9:1173\n261#1:1182\n257#1,4:1183\n227#1,7:1187\n238#1,3:1195\n241#1,9:1199\n261#1:1208\n352#1,11:1225\n257#1,4:1236\n227#1,7:1240\n238#1,3:1248\n241#1,2:1252\n363#1,10:1254\n244#1,6:1264\n261#1:1270\n373#1,2:1271\n352#1,11:1273\n257#1,4:1284\n227#1,7:1288\n238#1,3:1296\n241#1,2:1300\n363#1,10:1302\n244#1,6:1312\n261#1:1318\n373#1,2:1319\n352#1,11:1321\n257#1,4:1332\n227#1,7:1336\n238#1,3:1344\n241#1,2:1348\n363#1,10:1350\n244#1,6:1360\n261#1:1366\n373#1,2:1367\n352#1,11:1369\n257#1,4:1380\n227#1,7:1384\n238#1,3:1392\n241#1,2:1396\n363#1,10:1398\n244#1,6:1408\n261#1:1414\n373#1,2:1415\n352#1,11:1417\n257#1,4:1428\n227#1,7:1432\n238#1,3:1440\n241#1,2:1444\n363#1,10:1446\n244#1,6:1456\n261#1:1462\n373#1,2:1463\n1399#2:898\n1270#2:902\n1399#2:924\n1270#2:928\n1399#2:939\n1270#2:940\n1399#2:948\n1270#2:952\n1399#2:973\n1270#2:977\n1399#2:999\n1270#2:1003\n1399#2:1025\n1270#2:1029\n1179#2:1045\n1175#2:1048\n1372#2,3:1052\n1386#2,3:1056\n1312#2:1060\n1303#2:1062\n1297#2:1063\n1309#2:1068\n1393#2:1070\n1399#2:1090\n1270#2:1094\n1399#2:1116\n1270#2:1120\n1399#2:1142\n1270#2:1146\n1399#2:1168\n1270#2:1172\n1399#2:1194\n1270#2:1198\n1179#2:1212\n1175#2:1213\n1372#2,3:1214\n1386#2,3:1217\n1312#2:1220\n1303#2:1221\n1297#2:1222\n1309#2:1223\n1393#2:1224\n1399#2:1247\n1270#2:1251\n1399#2:1295\n1270#2:1299\n1399#2:1343\n1270#2:1347\n1399#2:1391\n1270#2:1395\n1399#2:1439\n1270#2:1443\n882#3,3:1041\n882#3,3:1209\n*S KotlinDebug\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSet\n*L\n199#1:887,4\n199#1:891,7\n199#1:899,3\n199#1:903,9\n199#1:912\n220#1:913,4\n220#1:917,7\n220#1:925,3\n220#1:929,9\n220#1:938\n260#1:941,7\n260#1:949,3\n260#1:953,9\n271#1:962,4\n271#1:966,7\n271#1:974,3\n271#1:978,9\n271#1:987\n283#1:988,4\n283#1:992,7\n283#1:1000,3\n283#1:1004,9\n283#1:1013\n300#1:1014,4\n300#1:1018,7\n300#1:1026,3\n300#1:1030,9\n300#1:1039\n309#1:1040\n309#1:1044\n309#1:1046,2\n309#1:1049,3\n309#1:1055\n309#1:1059\n309#1:1061\n309#1:1064,4\n309#1:1069\n309#1:1071,8\n329#1:1079,4\n329#1:1083,7\n329#1:1091,3\n329#1:1095,9\n329#1:1104\n362#1:1105,4\n362#1:1109,7\n362#1:1117,3\n362#1:1121,9\n362#1:1130\n362#1:1131,4\n362#1:1135,7\n362#1:1143,3\n362#1:1147,9\n362#1:1156\n383#1:1157,4\n383#1:1161,7\n383#1:1169,3\n383#1:1173,9\n383#1:1182\n407#1:1183,4\n407#1:1187,7\n407#1:1195,3\n407#1:1199,9\n407#1:1208\n-1#1:1225,11\n-1#1:1236,4\n-1#1:1240,7\n-1#1:1248,3\n-1#1:1252,2\n-1#1:1254,10\n-1#1:1264,6\n-1#1:1270\n-1#1:1271,2\n-1#1:1273,11\n-1#1:1284,4\n-1#1:1288,7\n-1#1:1296,3\n-1#1:1300,2\n-1#1:1302,10\n-1#1:1312,6\n-1#1:1318\n-1#1:1319,2\n-1#1:1321,11\n-1#1:1332,4\n-1#1:1336,7\n-1#1:1344,3\n-1#1:1348,2\n-1#1:1350,10\n-1#1:1360,6\n-1#1:1366\n-1#1:1367,2\n-1#1:1369,11\n-1#1:1380,4\n-1#1:1384,7\n-1#1:1392,3\n-1#1:1396,2\n-1#1:1398,10\n-1#1:1408,6\n-1#1:1414\n-1#1:1415,2\n-1#1:1417,11\n-1#1:1428,4\n-1#1:1432,7\n-1#1:1440,3\n-1#1:1444,2\n-1#1:1446,10\n-1#1:1456,6\n-1#1:1462\n-1#1:1463,2\n199#1:898\n199#1:902\n220#1:924\n220#1:928\n233#1:939\n240#1:940\n260#1:948\n260#1:952\n271#1:973\n271#1:977\n283#1:999\n283#1:1003\n300#1:1025\n300#1:1029\n309#1:1045\n309#1:1048\n309#1:1052,3\n309#1:1056,3\n309#1:1060\n309#1:1062\n309#1:1063\n309#1:1068\n309#1:1070\n329#1:1090\n329#1:1094\n362#1:1116\n362#1:1120\n362#1:1142\n362#1:1146\n383#1:1168\n383#1:1172\n407#1:1194\n407#1:1198\n428#1:1212\n431#1:1213\n434#1:1214,3\n435#1:1217,3\n436#1:1220\n437#1:1221\n437#1:1222\n441#1:1223\n444#1:1224\n-1#1:1247\n-1#1:1251\n-1#1:1295\n-1#1:1299\n-1#1:1343\n-1#1:1347\n-1#1:1391\n-1#1:1395\n-1#1:1439\n-1#1:1443\n309#1:1041,3\n427#1:1209,3\n*E\n"})
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public float[] f12506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public int f12507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public int f12508d;

    public /* synthetic */ x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String D(x xVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return xVar.w(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[DONT_INVERT, PHI: r11
      0x00bd: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:28:0x0074, B:42:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[LOOP:0: B:27:0x0063->B:44:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2 A[SYNTHETIC] */
    public static /* synthetic */ String E(x xVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 transform, int i11, Object obj) {
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
        float[] fArr = xVar.f12506b;
        long[] jArr = xVar.f12505a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            long j10 = jArr[i13];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i13 == length) {
                    sb2.append(postfix);
                    break;
                }
                i13++;
            } else {
                int i15 = 8;
                int i16 = 8 - ((~(i13 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j10 & 255) < 128) {
                        float f10 = fArr[(i13 << 3) + i17];
                        if (i14 == i12) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i14 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append((CharSequence) transform.invoke(Float.valueOf(f10)));
                        i14++;
                    }
                    j10 >>= i15;
                    i17++;
                    i15 = i15;
                }
                if (i16 == i15) {
                    if (i13 == length) {
                        i13++;
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

    @kotlin.a1
    public static /* synthetic */ void m() {
    }

    @kotlin.a1
    public static /* synthetic */ void n() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f A[DONT_INVERT, PHI: r8
      0x007f: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x003d, B:18:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0081 A[LOOP:0: B:5:0x002f->B:20:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0084 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String A(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
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
                        float f10 = fArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10)));
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

    /* JADX WARN: Code duplicated, block: B:19:0x007f A[DONT_INVERT, PHI: r9
      0x007f: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x003e, B:18:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0081 A[LOOP:0: B:5:0x002b->B:20:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0084 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String B(@NotNull CharSequence separator, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
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
                        float f10 = fArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10)));
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

    /* JADX WARN: Code duplicated, block: B:19:0x0077 A[DONT_INVERT, PHI: r8
      0x0077: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:6:0x0036, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0079 A[LOOP:0: B:5:0x0023->B:20:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007c A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String C(@NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
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
                        float f10 = fArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10)));
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

    public final boolean F() {
        return this.f12508d == 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[LOOP:0: B:5:0x0014->B:19:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x006b A[SYNTHETIC] */
    public final boolean a(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !predicate.invoke(Float.valueOf(fArr[(i10 << 3) + i12])).booleanValue()) {
                            return false;
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
        return true;
    }

    public final boolean b() {
        return this.f12508d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[LOOP:0: B:5:0x0014->B:18:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[SYNTHETIC] */
    public final boolean c(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && predicate.invoke(Float.valueOf(fArr[(i10 << 3) + i12])).booleanValue()) {
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

    public final boolean d(float f10) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    @androidx.annotation.g0(from = 0)
    public final int e() {
        return this.f12508d;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005d A[LOOP:0: B:14:0x001d->B:26:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0060 A[SYNTHETIC] */
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f12508d != this.f12508d) {
            return false;
        }
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !xVar.d(fArr[(i10 << 3) + i12])) {
                            return false;
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
        return true;
    }

    @androidx.annotation.g0(from = 0)
    public final int f(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
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
                    if ((255 & j10) < 128 && predicate.invoke(Float.valueOf(fArr[(i10 << 3) + i13])).booleanValue()) {
                        i11++;
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

    public final int g(float f10) {
        int iHashCode = Float.hashCode(f10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12507c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f12505a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f12506b[iNumberOfTrailingZeros] == f10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[LOOP:0: B:5:0x000c->B:18:0x0049, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x004d A[SYNTHETIC] */
    public final float h() {
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            return fArr[(i10 << 3) + i12];
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
        throw new NoSuchElementException("The FloatSet is empty");
    }

    public int hashCode() {
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
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
                        iHashCode += Float.hashCode(fArr[(i10 << 3) + i12]);
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

    /* JADX WARN: Code duplicated, block: B:16:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x006b A[LOOP:0: B:5:0x0013->B:17:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x006f A[SYNTHETIC] */
    public final float i(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            float f10 = fArr[(i10 << 3) + i12];
                            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                                return f10;
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
        throw new NoSuchElementException("Could not find a match");
    }

    public final void j(@NotNull Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
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
                        block.invoke(Float.valueOf(fArr[(i10 << 3) + i12]));
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
        long[] jArr = this.f12505a;
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

    @androidx.annotation.g0(from = 0)
    public final int l() {
        return this.f12507c;
    }

    @androidx.annotation.g0(from = 0)
    public final int o() {
        return this.f12508d;
    }

    public final boolean p() {
        return this.f12508d == 0;
    }

    public final boolean q() {
        return this.f12508d != 0;
    }

    @oj.j
    @NotNull
    public final String r() {
        boolean z10 = true & false;
        return D(this, null, null, null, 0, null, 31, null);
    }

    @oj.j
    @NotNull
    public final String s(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return D(this, separator, null, null, 0, null, 30, null);
    }

    @oj.j
    @NotNull
    public final String t(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return D(this, separator, prefix, null, 0, null, 28, null);
    }

    @NotNull
    public String toString() {
        return D(this, null, "[", "]", 0, null, 25, null);
    }

    @oj.j
    @NotNull
    public final String u(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return D(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @oj.j
    @NotNull
    public final String v(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return D(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @oj.j
    @NotNull
    public final String w(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        float f10 = fArr[(i11 << 3) + i14];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(f10);
                        i12++;
                    }
                    j10 >>= 8;
                }
                if (i13 == 8) {
                }
                sb2.append(postfix);
                break;
            }
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    @NotNull
    public final String x(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        float f10 = fArr[(i11 << 3) + i15];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10)));
                        i12++;
                    }
                    j10 >>= i13;
                    i15++;
                    i13 = i13;
                }
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    @NotNull
    public final String y(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        float f10 = fArr[(i11 << 3) + i14];
                        if (i12 == i10) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10)));
                        i12++;
                    }
                    j10 >>= 8;
                }
                if (i13 == 8) {
                }
                sb2.append(postfix);
                break;
            }
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0086 A[DONT_INVERT, PHI: r9
      0x0086: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0043, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0088 A[LOOP:0: B:5:0x0035->B:20:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x008b A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String z(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f12506b;
        long[] jArr = this.f12505a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
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
                        float f10 = fArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10)));
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append(postfix);
                break;
            }
            if (i10 == length) {
                sb2.append(postfix);
                break;
            }
            i10++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private x() {
        this.f12505a = b3.f12145e;
        this.f12506b = y.i();
    }
}
