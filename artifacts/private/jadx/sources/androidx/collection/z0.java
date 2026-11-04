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
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,885:1\n256#1,4:886\n226#1,7:890\n237#1,3:898\n240#1,9:902\n260#1:911\n256#1,4:912\n226#1,7:916\n237#1,3:924\n240#1,9:928\n260#1:937\n226#1,7:940\n237#1,3:948\n240#1,9:952\n256#1,4:961\n226#1,7:965\n237#1,3:973\n240#1,9:977\n260#1:986\n256#1,4:987\n226#1,7:991\n237#1,3:999\n240#1,9:1003\n260#1:1012\n256#1,4:1013\n226#1,7:1017\n237#1,3:1025\n240#1,9:1029\n260#1:1038\n426#1:1039\n427#1:1043\n429#1,2:1045\n431#1,3:1048\n434#1:1054\n435#1:1058\n436#1:1060\n437#1,4:1063\n443#1:1068\n444#1,8:1070\n256#1,4:1078\n226#1,7:1082\n237#1,3:1090\n240#1,9:1094\n260#1:1103\n256#1,4:1104\n226#1,7:1108\n237#1,3:1116\n240#1,9:1120\n260#1:1129\n256#1,4:1130\n226#1,7:1134\n237#1,3:1142\n240#1,9:1146\n260#1:1155\n256#1,4:1156\n226#1,7:1160\n237#1,3:1168\n240#1,9:1172\n260#1:1181\n256#1,4:1182\n226#1,7:1186\n237#1,3:1194\n240#1,9:1198\n260#1:1207\n351#1,11:1224\n256#1,4:1235\n226#1,7:1239\n237#1,3:1247\n240#1,2:1251\n362#1,10:1253\n243#1,6:1263\n260#1:1269\n372#1,2:1270\n351#1,11:1272\n256#1,4:1283\n226#1,7:1287\n237#1,3:1295\n240#1,2:1299\n362#1,10:1301\n243#1,6:1311\n260#1:1317\n372#1,2:1318\n351#1,11:1320\n256#1,4:1331\n226#1,7:1335\n237#1,3:1343\n240#1,2:1347\n362#1,10:1349\n243#1,6:1359\n260#1:1365\n372#1,2:1366\n351#1,11:1368\n256#1,4:1379\n226#1,7:1383\n237#1,3:1391\n240#1,2:1395\n362#1,10:1397\n243#1,6:1407\n260#1:1413\n372#1,2:1414\n351#1,11:1416\n256#1,4:1427\n226#1,7:1431\n237#1,3:1439\n240#1,2:1443\n362#1,10:1445\n243#1,6:1455\n260#1:1461\n372#1,2:1462\n1399#2:897\n1270#2:901\n1399#2:923\n1270#2:927\n1399#2:938\n1270#2:939\n1399#2:947\n1270#2:951\n1399#2:972\n1270#2:976\n1399#2:998\n1270#2:1002\n1399#2:1024\n1270#2:1028\n1179#2:1044\n1175#2:1047\n1372#2,3:1051\n1386#2,3:1055\n1312#2:1059\n1303#2:1061\n1297#2:1062\n1309#2:1067\n1393#2:1069\n1399#2:1089\n1270#2:1093\n1399#2:1115\n1270#2:1119\n1399#2:1141\n1270#2:1145\n1399#2:1167\n1270#2:1171\n1399#2:1193\n1270#2:1197\n1179#2:1211\n1175#2:1212\n1372#2,3:1213\n1386#2,3:1216\n1312#2:1219\n1303#2:1220\n1297#2:1221\n1309#2:1222\n1393#2:1223\n1399#2:1246\n1270#2:1250\n1399#2:1294\n1270#2:1298\n1399#2:1342\n1270#2:1346\n1399#2:1390\n1270#2:1394\n1399#2:1438\n1270#2:1442\n881#3,3:1040\n881#3,3:1208\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n*L\n198#1:886,4\n198#1:890,7\n198#1:898,3\n198#1:902,9\n198#1:911\n219#1:912,4\n219#1:916,7\n219#1:924,3\n219#1:928,9\n219#1:937\n259#1:940,7\n259#1:948,3\n259#1:952,9\n270#1:961,4\n270#1:965,7\n270#1:973,3\n270#1:977,9\n270#1:986\n282#1:987,4\n282#1:991,7\n282#1:999,3\n282#1:1003,9\n282#1:1012\n299#1:1013,4\n299#1:1017,7\n299#1:1025,3\n299#1:1029,9\n299#1:1038\n308#1:1039\n308#1:1043\n308#1:1045,2\n308#1:1048,3\n308#1:1054\n308#1:1058\n308#1:1060\n308#1:1063,4\n308#1:1068\n308#1:1070,8\n328#1:1078,4\n328#1:1082,7\n328#1:1090,3\n328#1:1094,9\n328#1:1103\n361#1:1104,4\n361#1:1108,7\n361#1:1116,3\n361#1:1120,9\n361#1:1129\n361#1:1130,4\n361#1:1134,7\n361#1:1142,3\n361#1:1146,9\n361#1:1155\n382#1:1156,4\n382#1:1160,7\n382#1:1168,3\n382#1:1172,9\n382#1:1181\n406#1:1182,4\n406#1:1186,7\n406#1:1194,3\n406#1:1198,9\n406#1:1207\n-1#1:1224,11\n-1#1:1235,4\n-1#1:1239,7\n-1#1:1247,3\n-1#1:1251,2\n-1#1:1253,10\n-1#1:1263,6\n-1#1:1269\n-1#1:1270,2\n-1#1:1272,11\n-1#1:1283,4\n-1#1:1287,7\n-1#1:1295,3\n-1#1:1299,2\n-1#1:1301,10\n-1#1:1311,6\n-1#1:1317\n-1#1:1318,2\n-1#1:1320,11\n-1#1:1331,4\n-1#1:1335,7\n-1#1:1343,3\n-1#1:1347,2\n-1#1:1349,10\n-1#1:1359,6\n-1#1:1365\n-1#1:1366,2\n-1#1:1368,11\n-1#1:1379,4\n-1#1:1383,7\n-1#1:1391,3\n-1#1:1395,2\n-1#1:1397,10\n-1#1:1407,6\n-1#1:1413\n-1#1:1414,2\n-1#1:1416,11\n-1#1:1427,4\n-1#1:1431,7\n-1#1:1439,3\n-1#1:1443,2\n-1#1:1445,10\n-1#1:1455,6\n-1#1:1461\n-1#1:1462,2\n198#1:897\n198#1:901\n219#1:923\n219#1:927\n232#1:938\n239#1:939\n259#1:947\n259#1:951\n270#1:972\n270#1:976\n282#1:998\n282#1:1002\n299#1:1024\n299#1:1028\n308#1:1044\n308#1:1047\n308#1:1051,3\n308#1:1055,3\n308#1:1059\n308#1:1061\n308#1:1062\n308#1:1067\n308#1:1069\n328#1:1089\n328#1:1093\n361#1:1115\n361#1:1119\n361#1:1141\n361#1:1145\n382#1:1167\n382#1:1171\n406#1:1193\n406#1:1197\n427#1:1211\n430#1:1212\n433#1:1213,3\n434#1:1216,3\n435#1:1219\n436#1:1220\n436#1:1221\n440#1:1222\n443#1:1223\n-1#1:1246\n-1#1:1250\n-1#1:1294\n-1#1:1298\n-1#1:1342\n-1#1:1346\n-1#1:1390\n-1#1:1394\n-1#1:1438\n-1#1:1442\n308#1:1040,3\n426#1:1208,3\n*E\n"})
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public int f12531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public int f12532d;

    public /* synthetic */ z0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String D(z0 z0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return z0Var.w(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[DONT_INVERT, PHI: r11
      0x00c5: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:28:0x007c, B:42:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[LOOP:0: B:27:0x0066->B:44:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca A[SYNTHETIC] */
    public static /* synthetic */ String E(z0 z0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 transform, int i11, Object obj) {
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
        long[] jArr = z0Var.f12530b;
        long[] jArr2 = z0Var.f12529a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            long j10 = jArr2[i13];
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
                        long j11 = jArr[(i13 << 3) + i17];
                        if (i14 == i12) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i14 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append((CharSequence) transform.invoke(Long.valueOf(j11)));
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

    /* JADX WARN: Code duplicated, block: B:19:0x007d A[DONT_INVERT, PHI: r8
      0x007d: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x003c, B:18:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x007f A[LOOP:0: B:5:0x002e->B:20:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String A(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        long j11 = jArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
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

    /* JADX WARN: Code duplicated, block: B:19:0x007d A[DONT_INVERT, PHI: r9
      0x007d: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x003c, B:18:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x007f A[LOOP:0: B:5:0x0029->B:20:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String B(@NotNull CharSequence separator, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        long j11 = jArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
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

    /* JADX WARN: Code duplicated, block: B:19:0x006f A[DONT_INVERT, PHI: r8
      0x006f: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x002c, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[LOOP:0: B:5:0x001e->B:20:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String C(@NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        long j11 = jArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
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
        return this.f12532d == 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[LOOP:0: B:5:0x0013->B:18:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[SYNTHETIC] */
    public final boolean a(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 5 << 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128 && !predicate.invoke(Long.valueOf(jArr[(i11 << 3) + i13])).booleanValue()) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i12 == 8) {
                        if (i11 != length) {
                            i11++;
                        }
                    }
                } else if (i11 != length) {
                    i11++;
                }
            }
        }
        return true;
    }

    public final boolean b() {
        return this.f12532d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[LOOP:0: B:5:0x0012->B:19:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0063 A[SYNTHETIC] */
    public final boolean c(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && predicate.invoke(Long.valueOf(jArr[(i10 << 3) + i12])).booleanValue()) {
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

    public final boolean d(long j10) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    @androidx.annotation.g0(from = 0)
    public final int e() {
        return this.f12532d;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x001d->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (z0Var.f12532d != this.f12532d) {
            return false;
        }
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !z0Var.d(jArr[(i10 << 3) + i12])) {
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
    public final int f(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
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
                    if ((255 & j10) < 128 && predicate.invoke(Long.valueOf(jArr[(i10 << 3) + i13])).booleanValue()) {
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

    public final int g(long j10) {
        int iHashCode = Long.hashCode(j10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12531c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f12529a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * b3.f12151k) ^ j11;
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f12530b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b A[LOOP:0: B:5:0x000d->B:18:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x004e A[SYNTHETIC] */
    public final long h() {
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            return jArr[(i10 << 3) + i12];
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
        throw new NoSuchElementException("The LongSet is empty");
    }

    public int hashCode() {
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
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
                        iHashCode += Long.hashCode(jArr[(i10 << 3) + i12]);
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

    /* JADX WARN: Code duplicated, block: B:16:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0064 A[LOOP:0: B:5:0x0015->B:17:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[SYNTHETIC] */
    public final long i(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            long j11 = jArr[(i10 << 3) + i12];
                            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                                return j11;
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

    /* JADX WARN: Code duplicated, block: B:14:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005a A[LOOP:0: B:5:0x0014->B:15:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0014->B:15:0x005a], SYNTHETIC] */
    public final void j(@NotNull Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
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

    @kotlin.a1
    public final void k(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12529a;
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
        return this.f12531c;
    }

    @androidx.annotation.g0(from = 0)
    public final int o() {
        return this.f12532d;
    }

    public final boolean p() {
        return this.f12532d == 0;
    }

    public final boolean q() {
        return this.f12532d != 0;
    }

    @oj.j
    @NotNull
    public final String r() {
        return D(this, null, null, null, 0, null, 31, null);
    }

    @oj.j
    @NotNull
    public final String s(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        int i10 = (2 << 0) << 0;
        return D(this, separator, null, null, 0, null, 30, null);
    }

    @oj.j
    @NotNull
    public final String t(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        int i10 = (0 | 0) << 0;
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
        int i11;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            long j10 = jArr2[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j10) < 128) {
                        long j11 = jArr[(i12 << 3) + i15];
                        if (i13 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i13 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(j11);
                        i13++;
                    }
                    j10 >>= 8;
                    i15++;
                    i12 = i12;
                }
                int i16 = i12;
                if (i14 == 8) {
                    i11 = i16;
                }
                sb2.append(postfix);
                break;
            }
            i11 = i12;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i12 = i11 + 1;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    @NotNull
    public final String x(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
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
                char c10 = '\b';
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j10 & 255) < 128) {
                        long j11 = jArr[(i11 << 3) + i14];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
                        i12++;
                    }
                    j10 >>= c10;
                    i14++;
                    c10 = c10;
                }
                if (i13 == c10) {
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
    public final String y(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
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
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        long j11 = jArr[(i11 << 3) + i14];
                        if (i12 == i10) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
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

    /* JADX WARN: Code duplicated, block: B:19:0x0084 A[DONT_INVERT, PHI: r9
      0x0084: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0045, B:18:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0086 A[LOOP:0: B:5:0x0037->B:20:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String z(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12530b;
        long[] jArr2 = this.f12529a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        long j11 = jArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
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

    private z0() {
        this.f12529a = b3.f12145e;
        this.f12530b = a1.d();
    }
}
