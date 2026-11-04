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
@SourceDebugExtension({"SMAP\nLongLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/LongLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1034:1\n359#1,6:1037\n369#1,3:1044\n372#1,9:1048\n359#1,6:1057\n369#1,3:1064\n372#1,9:1068\n359#1,6:1077\n369#1,3:1084\n372#1,9:1088\n387#1,4:1097\n359#1,6:1101\n369#1,3:1108\n372#1,9:1112\n391#1:1121\n387#1,4:1122\n359#1,6:1126\n369#1,3:1133\n372#1,9:1137\n391#1:1146\n387#1,4:1147\n359#1,6:1151\n369#1,3:1158\n372#1,9:1162\n391#1:1171\n402#1,3:1172\n359#1,6:1175\n369#1,3:1182\n372#1,9:1186\n405#1:1195\n387#1,4:1196\n359#1,6:1200\n369#1,3:1207\n372#1,9:1211\n391#1:1220\n387#1,4:1221\n359#1,6:1225\n369#1,3:1232\n372#1,9:1236\n391#1:1245\n387#1,4:1246\n359#1,6:1250\n369#1,3:1257\n372#1,9:1261\n391#1:1270\n387#1,4:1271\n359#1,6:1275\n369#1,3:1282\n372#1,9:1286\n391#1:1295\n387#1,4:1296\n359#1,6:1300\n369#1,3:1307\n372#1,9:1311\n391#1:1320\n387#1,4:1321\n359#1,6:1325\n369#1,3:1332\n372#1,9:1336\n391#1:1345\n484#1,11:1362\n387#1,4:1373\n359#1,6:1377\n369#1,3:1384\n372#1,2:1388\n495#1,10:1390\n375#1,6:1400\n391#1:1406\n505#1,2:1407\n484#1,11:1409\n387#1,4:1420\n359#1,6:1424\n369#1,3:1431\n372#1,2:1435\n495#1,10:1437\n375#1,6:1447\n391#1:1453\n505#1,2:1454\n484#1,11:1456\n387#1,4:1467\n359#1,6:1471\n369#1,3:1478\n372#1,2:1482\n495#1,10:1484\n375#1,6:1494\n391#1:1500\n505#1,2:1501\n484#1,11:1503\n387#1,4:1514\n359#1,6:1518\n369#1,3:1525\n372#1,2:1529\n495#1,10:1531\n375#1,6:1541\n391#1:1547\n505#1,2:1548\n484#1,11:1550\n387#1,4:1561\n359#1,6:1565\n369#1,3:1572\n372#1,2:1576\n495#1,10:1578\n375#1,6:1588\n391#1:1594\n505#1,2:1595\n1399#2:1035\n1270#2:1036\n1399#2:1043\n1270#2:1047\n1399#2:1063\n1270#2:1067\n1399#2:1083\n1270#2:1087\n1399#2:1107\n1270#2:1111\n1399#2:1132\n1270#2:1136\n1399#2:1157\n1270#2:1161\n1399#2:1181\n1270#2:1185\n1399#2:1206\n1270#2:1210\n1399#2:1231\n1270#2:1235\n1399#2:1256\n1270#2:1260\n1399#2:1281\n1270#2:1285\n1399#2:1306\n1270#2:1310\n1399#2:1331\n1270#2:1335\n1179#2:1349\n1175#2:1350\n1372#2,3:1351\n1386#2,3:1354\n1312#2:1357\n1303#2:1358\n1297#2:1359\n1309#2:1360\n1393#2:1361\n1399#2:1383\n1270#2:1387\n1399#2:1430\n1270#2:1434\n1399#2:1477\n1270#2:1481\n1399#2:1524\n1270#2:1528\n1399#2:1571\n1270#2:1575\n881#3,3:1346\n*S KotlinDebug\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/LongLongMap\n*L\n390#1:1037,6\n390#1:1044,3\n390#1:1048,9\n397#1:1057,6\n397#1:1064,3\n397#1:1068,9\n404#1:1077,6\n404#1:1084,3\n404#1:1088,9\n409#1:1097,4\n409#1:1101,6\n409#1:1108,3\n409#1:1112,9\n409#1:1121\n415#1:1122,4\n415#1:1126,6\n415#1:1133,3\n415#1:1137,9\n415#1:1146\n425#1:1147,4\n425#1:1151,6\n425#1:1158,3\n425#1:1162,9\n425#1:1171\n437#1:1172,3\n437#1:1175,6\n437#1:1182,3\n437#1:1186,9\n437#1:1195\n459#1:1196,4\n459#1:1200,6\n459#1:1207,3\n459#1:1211,9\n459#1:1220\n494#1:1221,4\n494#1:1225,6\n494#1:1232,3\n494#1:1236,9\n494#1:1245\n494#1:1246,4\n494#1:1250,6\n494#1:1257,3\n494#1:1261,9\n494#1:1270\n515#1:1271,4\n515#1:1275,6\n515#1:1282,3\n515#1:1286,9\n515#1:1295\n539#1:1296,4\n539#1:1300,6\n539#1:1307,3\n539#1:1311,9\n539#1:1320\n561#1:1321,4\n561#1:1325,6\n561#1:1332,3\n561#1:1336,9\n561#1:1345\n-1#1:1362,11\n-1#1:1373,4\n-1#1:1377,6\n-1#1:1384,3\n-1#1:1388,2\n-1#1:1390,10\n-1#1:1400,6\n-1#1:1406\n-1#1:1407,2\n-1#1:1409,11\n-1#1:1420,4\n-1#1:1424,6\n-1#1:1431,3\n-1#1:1435,2\n-1#1:1437,10\n-1#1:1447,6\n-1#1:1453\n-1#1:1454,2\n-1#1:1456,11\n-1#1:1467,4\n-1#1:1471,6\n-1#1:1478,3\n-1#1:1482,2\n-1#1:1484,10\n-1#1:1494,6\n-1#1:1500\n-1#1:1501,2\n-1#1:1503,11\n-1#1:1514,4\n-1#1:1518,6\n-1#1:1525,3\n-1#1:1529,2\n-1#1:1531,10\n-1#1:1541,6\n-1#1:1547\n-1#1:1548,2\n-1#1:1550,11\n-1#1:1561,4\n-1#1:1565,6\n-1#1:1572,3\n-1#1:1576,2\n-1#1:1578,10\n-1#1:1588,6\n-1#1:1594\n-1#1:1595,2\n364#1:1035\n371#1:1036\n390#1:1043\n390#1:1047\n397#1:1063\n397#1:1067\n404#1:1083\n404#1:1087\n409#1:1107\n409#1:1111\n415#1:1132\n415#1:1136\n425#1:1157\n425#1:1161\n437#1:1181\n437#1:1185\n459#1:1206\n459#1:1210\n494#1:1231\n494#1:1235\n494#1:1256\n494#1:1260\n515#1:1281\n515#1:1285\n539#1:1306\n539#1:1310\n561#1:1331\n561#1:1335\n581#1:1349\n584#1:1350\n588#1:1351,3\n589#1:1354,3\n590#1:1357\n591#1:1358\n591#1:1359\n595#1:1360\n598#1:1361\n-1#1:1383\n-1#1:1387\n-1#1:1430\n-1#1:1434\n-1#1:1477\n-1#1:1481\n-1#1:1524\n-1#1:1528\n-1#1:1571\n-1#1:1575\n580#1:1346,3\n*E\n"})
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public int f12465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public int f12466e;

    public /* synthetic */ u0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String L(u0 u0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return u0Var.E(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String M(u0 u0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function2 transform, int i11, Object obj) {
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
        long[] jArr2 = u0Var.f12463b;
        long[] jArr3 = u0Var.f12464c;
        long[] jArr4 = u0Var.f12462a;
        int length = jArr4.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            long j10 = jArr4[i13];
            int i15 = i13;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                char c10 = '\b';
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j10 & 255) < 128) {
                        int i18 = (i15 << 3) + i17;
                        long j11 = jArr2[i18];
                        long j12 = jArr3[i18];
                        if (i14 == i12) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i14 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append((CharSequence) transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
                        i14++;
                    }
                    j10 >>= c10;
                    i17++;
                    c10 = c10;
                    jArr4 = jArr4;
                }
                jArr = jArr4;
                if (i16 == c10) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr4;
            if (i15 == length) {
                sb2.append(postfix);
                break;
            }
            i13 = i15 + 1;
            jArr4 = jArr;
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
        int i11;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr2 = this.f12463b;
        long[] jArr3 = this.f12464c;
        long[] jArr4 = this.f12462a;
        int length = jArr4.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            long j10 = jArr4[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i12 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j10 & 255) < 128) {
                        int i17 = (i12 << 3) + i16;
                        long j11 = jArr2[i17];
                        long j12 = jArr3[i17];
                        if (i13 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i13 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(j11);
                        sb2.append('=');
                        sb2.append(j12);
                        i13++;
                    }
                    j10 >>= i14;
                    i16++;
                    i12 = i12;
                    jArr4 = jArr4;
                    i14 = i14;
                }
                jArr = jArr4;
                int i18 = i12;
                if (i15 == i14) {
                    i11 = i18;
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr4;
            i11 = i12;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i12 = i11 + 1;
            jArr4 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    @NotNull
    public final String F(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @NotNull Function2<? super Long, ? super Long, ? extends CharSequence> transform) {
        long[] jArr;
        CharSequence separator = charSequence;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr2 = this.f12463b;
        long[] jArr3 = this.f12464c;
        long[] jArr4 = this.f12462a;
        int length = jArr4.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr4[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        long j11 = jArr2[i16];
                        long j12 = jArr3[i16];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
                        i12++;
                    }
                    j10 >>= i13;
                    i15++;
                    separator = charSequence;
                    i13 = i13;
                    jArr4 = jArr4;
                }
                jArr = jArr4;
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr4;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            separator = charSequence;
            jArr4 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    @NotNull
    public final String G(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function2<? super Long, ? super Long, ? extends CharSequence> transform) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr2 = this.f12463b;
        long[] jArr3 = this.f12464c;
        long[] jArr4 = this.f12462a;
        int length = jArr4.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr4[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        long j11 = jArr2[i16];
                        long j12 = jArr3[i16];
                        if (i12 == i10) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
                        i12++;
                    }
                    j10 >>= i13;
                    i15++;
                    i13 = i13;
                    jArr4 = jArr4;
                }
                jArr = jArr4;
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr4;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            jArr4 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0097 A[DONT_INVERT, PHI: r10
      0x0097: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0043, B:20:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0099 A[LOOP:0: B:5:0x0035->B:22:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String H(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function2<? super Long, ? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr3[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i10 == length) {
                    sb2.append(postfix);
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
                        long j11 = jArr[i14];
                        long j12 = jArr2[i14];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
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
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0085 A[DONT_INVERT, PHI: r9
      0x0085: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x003e, B:18:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0087 A[LOOP:0: B:5:0x0030->B:20:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x008a A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String I(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function2<? super Long, ? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr3[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        long j11 = jArr[i14];
                        long j12 = jArr2[i14];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
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

    /* JADX WARN: Code duplicated, block: B:21:0x008f A[DONT_INVERT, PHI: r10
      0x008f: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003b, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0091 A[LOOP:0: B:5:0x002d->B:22:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String J(@NotNull CharSequence separator, @NotNull Function2<? super Long, ? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr3[i10];
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
                        long j11 = jArr[i14];
                        long j12 = jArr2[i14];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
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

    /* JADX WARN: Code duplicated, block: B:19:0x007d A[DONT_INVERT, PHI: r9
      0x007d: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0032, B:18:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x007f A[LOOP:0: B:5:0x0024->B:20:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[SYNTHETIC] */
    @oj.j
    @NotNull
    public final String K(@NotNull Function2<? super Long, ? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr3[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        long j11 = jArr[i14];
                        long j12 = jArr2[i14];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
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
        return this.f12466e == 0;
    }

    public final boolean a(@NotNull Function2<? super Long, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr3[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!predicate.invoke(Long.valueOf(jArr[i13]), Long.valueOf(jArr2[i13])).booleanValue()) {
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
        return this.f12466e != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0069 A[LOOP:0: B:5:0x001a->B:18:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x006c A[SYNTHETIC] */
    public final boolean c(@NotNull Function2<? super Long, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr3[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (predicate.invoke(Long.valueOf(jArr[i13]), Long.valueOf(jArr2[i13])).booleanValue()) {
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

    public final boolean d(long j10) {
        return e(j10);
    }

    public final boolean e(long j10) {
        return i(j10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[LOOP:0: B:14:0x0027->B:28:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x006f A[SYNTHETIC] */
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (u0Var.t() != t()) {
            return false;
        }
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j10 = jArr3[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            long j11 = jArr[i13];
                            long j12 = jArr2[i13];
                            int i14 = u0Var.i(j11);
                            if (i14 < 0 || j12 != u0Var.f12464c[i14]) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[LOOP:0: B:5:0x000b->B:18:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f A[SYNTHETIC] */
    public final boolean f(long j10) {
        long[] jArr = this.f12464c;
        long[] jArr2 = this.f12462a;
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

    public final int h(@NotNull Function2<? super Long, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr3[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        if (predicate.invoke(Long.valueOf(jArr[i14]), Long.valueOf(jArr2[i14])).booleanValue()) {
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
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr3[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        iHashCode += Long.hashCode(jArr[i13]) ^ Long.hashCode(jArr2[i13]);
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
    public final int i(long j10) {
        int iHashCode = Long.hashCode(j10) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12465d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f12462a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * b3.f12151k) ^ j11;
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f12463b[iNumberOfTrailingZeros] == j10) {
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

    public final void j(@NotNull Function2<? super Long, ? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr3[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        block.invoke(Long.valueOf(jArr[i13]), Long.valueOf(jArr2[i13]));
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
        long[] jArr = this.f12462a;
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

    /* JADX WARN: Code duplicated, block: B:14:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0056 A[LOOP:0: B:5:0x0010->B:15:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059 A[EDGE_INSN: B:19:0x0059->B:16:0x0059 BREAK  A[LOOP:0: B:5:0x0010->B:15:0x0056], SYNTHETIC] */
    public final void l(@NotNull Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12462a;
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

    public final void m(@NotNull Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12464c;
        long[] jArr2 = this.f12462a;
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
                        block.invoke(Long.valueOf(jArr[(i10 << 3) + i12]));
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

    public final long n(long j10) {
        int i10 = i(j10);
        if (i10 < 0) {
            t.f.f("Cannot find value for key " + j10);
        }
        return this.f12464c[i10];
    }

    public final int o() {
        return this.f12465d;
    }

    public final long r(long j10, long j11) {
        int i10 = i(j10);
        return i10 >= 0 ? this.f12464c[i10] : j11;
    }

    public final long s(long j10, @NotNull Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int i10 = i(j10);
        return i10 < 0 ? defaultValue.invoke().longValue() : this.f12464c[i10];
    }

    public final int t() {
        return this.f12466e;
    }

    @NotNull
    public String toString() {
        int i10;
        int i11;
        int i12;
        int i13;
        if (x()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        long[] jArr = this.f12463b;
        long[] jArr2 = this.f12464c;
        long[] jArr3 = this.f12462a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                long j10 = jArr3[i14];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i14 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((255 & j10) < 128) {
                            int i19 = (i14 << 3) + i18;
                            i11 = i14;
                            long j11 = jArr[i19];
                            i12 = i16;
                            i13 = i18;
                            long j12 = jArr2[i19];
                            sb2.append(j11);
                            sb2.append("=");
                            sb2.append(j12);
                            i15++;
                            if (i15 < this.f12466e) {
                                sb2.append(AbstractJsonLexerKt.COMMA);
                                sb2.append(' ');
                            }
                        } else {
                            i11 = i14;
                            i12 = i16;
                            i13 = i18;
                        }
                        j10 >>= i12;
                        i18 = i13 + 1;
                        i14 = i11;
                        i16 = i12;
                    }
                    int i20 = i14;
                    if (i17 != i16) {
                        break;
                    }
                    i10 = i20;
                } else {
                    i10 = i14;
                }
                if (i10 == length) {
                    break;
                }
                i14 = i10 + 1;
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean x() {
        return this.f12466e == 0;
    }

    public final boolean y() {
        return this.f12466e != 0;
    }

    @oj.j
    @NotNull
    public final String z() {
        int i10 = (0 >> 0) << 0;
        return L(this, null, null, null, 0, null, 31, null);
    }

    private u0() {
        this.f12462a = b3.f12145e;
        this.f12463b = a1.d();
        this.f12464c = a1.d();
    }
}
