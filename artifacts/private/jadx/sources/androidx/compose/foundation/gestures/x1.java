package androidx.compose.foundation.gestures;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1089:1\n831#1,17:1090\n848#1,4:1114\n852#1,9:1124\n861#1,11:1134\n790#1,4:1145\n794#1,2:1156\n796#1,8:1164\n831#1,17:1172\n848#1,4:1196\n852#1,9:1206\n861#1:1216\n862#1,10:1220\n831#1,17:1230\n848#1,4:1254\n852#1,9:1264\n861#1:1274\n862#1,10:1278\n746#1,7:1288\n790#1,4:1295\n794#1,2:1306\n796#1,7:1314\n753#1,6:1321\n759#1:1330\n754#1,8:1333\n803#1:1341\n762#1:1342\n751#1:1343\n764#1,10:1344\n790#1,4:1354\n794#1,2:1365\n796#1,7:1373\n803#1:1383\n831#1,17:1384\n848#1,4:1408\n852#1,9:1418\n861#1:1428\n862#1,10:1432\n831#1,17:1442\n848#1,4:1466\n852#1,9:1476\n861#1:1486\n862#1,10:1490\n746#1,7:1500\n790#1,4:1507\n794#1,2:1518\n796#1,7:1526\n753#1,6:1533\n759#1:1542\n754#1,8:1545\n803#1:1553\n762#1:1554\n751#1:1555\n764#1,10:1556\n790#1,4:1566\n794#1,2:1577\n796#1,7:1585\n803#1:1595\n790#1,4:1596\n794#1,2:1607\n796#1,7:1615\n803#1:1628\n790#1,4:1629\n794#1,2:1640\n796#1,7:1648\n803#1:1661\n118#2:1107\n35#2,5:1108\n119#2:1113\n35#2,5:1118\n119#2:1123\n118#2:1149\n35#2,5:1150\n119#2:1155\n35#2,5:1158\n119#2:1163\n118#2:1189\n35#2,5:1190\n119#2:1195\n35#2,5:1200\n119#2:1205\n118#2:1247\n35#2,5:1248\n119#2:1253\n35#2,5:1258\n119#2:1263\n118#2:1299\n35#2,5:1300\n119#2:1305\n35#2,5:1308\n119#2:1313\n118#2:1358\n35#2,5:1359\n119#2:1364\n35#2,5:1367\n119#2:1372\n118#2:1401\n35#2,5:1402\n119#2:1407\n35#2,5:1412\n119#2:1417\n118#2:1459\n35#2,5:1460\n119#2:1465\n35#2,5:1470\n119#2:1475\n118#2:1511\n35#2,5:1512\n119#2:1517\n35#2,5:1520\n119#2:1525\n118#2:1570\n35#2,5:1571\n119#2:1576\n35#2,5:1579\n119#2:1584\n118#2:1600\n35#2,5:1601\n119#2:1606\n35#2,5:1609\n119#2:1614\n118#2:1633\n35#2,5:1634\n119#2:1639\n35#2,5:1642\n119#2:1647\n118#2:1662\n35#2,5:1663\n119#2:1668\n118#2:1669\n35#2,5:1670\n119#2:1675\n118#2:1676\n35#2,5:1677\n119#2:1682\n118#2:1683\n35#2,5:1684\n119#2:1689\n118#2:1691\n35#2,5:1692\n119#2:1697\n118#2:1698\n35#2,5:1699\n119#2:1704\n118#2:1705\n35#2,5:1706\n119#2:1711\n118#2:1712\n35#2,5:1713\n119#2:1718\n118#2:1719\n35#2,5:1720\n119#2:1725\n118#2:1726\n35#2,5:1727\n119#2:1732\n103#2:1734\n35#2,5:1735\n104#2:1740\n118#2:1741\n35#2,5:1742\n119#2:1747\n118#2:1748\n35#2,5:1749\n119#2:1754\n273#3:1133\n273#3:1215\n273#3:1273\n273#3:1427\n273#3:1485\n273#3:1690\n273#3:1733\n69#4:1217\n69#4:1275\n69#4:1327\n65#4:1331\n69#4:1380\n65#4:1429\n65#4:1487\n69#4:1539\n65#4:1543\n65#4:1592\n69#4:1622\n65#4:1625\n69#4:1655\n65#4:1658\n70#5:1218\n70#5:1276\n70#5:1328\n60#5:1332\n70#5:1381\n60#5:1430\n60#5:1488\n70#5:1540\n60#5:1544\n60#5:1593\n70#5:1623\n60#5:1626\n70#5:1656\n60#5:1659\n22#6:1219\n22#6:1277\n22#6:1329\n22#6:1382\n22#6:1431\n22#6:1489\n22#6:1541\n22#6:1594\n22#6:1624\n22#6:1627\n22#6:1657\n22#6:1660\n118#7:1755\n113#7:1756\n63#8:1757\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n81#1:1090,17\n81#1:1114,4\n81#1:1124,9\n81#1:1134,11\n144#1:1145,4\n144#1:1156,2\n144#1:1164,8\n414#1:1172,17\n414#1:1196,4\n414#1:1206,9\n414#1:1216\n414#1:1220,10\n444#1:1230,17\n444#1:1254,4\n444#1:1264,9\n444#1:1274\n444#1:1278,10\n471#1:1288,7\n471#1:1295,4\n471#1:1306,2\n471#1:1314,7\n471#1:1321,6\n471#1:1330\n471#1:1333,8\n471#1:1341\n471#1:1342\n471#1:1343\n471#1:1344,10\n500#1:1354,4\n500#1:1365,2\n500#1:1373,7\n500#1:1383\n586#1:1384,17\n586#1:1408,4\n586#1:1418,9\n586#1:1428\n586#1:1432,10\n616#1:1442,17\n616#1:1466,4\n616#1:1476,9\n616#1:1486\n616#1:1490,10\n640#1:1500,7\n640#1:1507,4\n640#1:1518,2\n640#1:1526,7\n640#1:1533,6\n640#1:1542\n640#1:1545,8\n640#1:1553\n640#1:1554\n640#1:1555\n640#1:1556,10\n669#1:1566,4\n669#1:1577,2\n669#1:1585,7\n669#1:1595\n752#1:1596,4\n752#1:1607,2\n752#1:1615,7\n752#1:1628\n752#1:1629,4\n752#1:1640,2\n752#1:1648,7\n752#1:1661\n81#1:1107\n81#1:1108,5\n81#1:1113\n81#1:1118,5\n81#1:1123\n144#1:1149\n144#1:1150,5\n144#1:1155\n144#1:1158,5\n144#1:1163\n414#1:1189\n414#1:1190,5\n414#1:1195\n414#1:1200,5\n414#1:1205\n444#1:1247\n444#1:1248,5\n444#1:1253\n444#1:1258,5\n444#1:1263\n471#1:1299\n471#1:1300,5\n471#1:1305\n471#1:1308,5\n471#1:1313\n500#1:1358\n500#1:1359,5\n500#1:1364\n500#1:1367,5\n500#1:1372\n586#1:1401\n586#1:1402,5\n586#1:1407\n586#1:1412,5\n586#1:1417\n616#1:1459\n616#1:1460,5\n616#1:1465\n616#1:1470,5\n616#1:1475\n640#1:1511\n640#1:1512,5\n640#1:1517\n640#1:1520,5\n640#1:1525\n669#1:1570\n669#1:1571,5\n669#1:1576\n669#1:1579,5\n669#1:1584\n752#1:1600\n752#1:1601,5\n752#1:1606\n752#1:1609,5\n752#1:1614\n752#1:1633\n752#1:1634,5\n752#1:1639\n752#1:1642,5\n752#1:1647\n793#1:1662\n793#1:1663,5\n793#1:1668\n795#1:1669\n795#1:1670,5\n795#1:1675\n847#1:1676\n847#1:1677,5\n847#1:1682\n851#1:1683\n851#1:1684,5\n851#1:1689\n847#1:1691\n847#1:1692,5\n847#1:1697\n851#1:1698\n851#1:1699,5\n851#1:1704\n847#1:1705\n847#1:1706,5\n847#1:1711\n851#1:1712\n851#1:1713,5\n851#1:1718\n896#1:1719\n896#1:1720,5\n896#1:1725\n898#1:1726\n898#1:1727,5\n898#1:1732\n911#1:1734\n911#1:1735,5\n911#1:1740\n1004#1:1741\n1004#1:1742,5\n1004#1:1747\n1069#1:1748\n1069#1:1749,5\n1069#1:1754\n81#1:1133\n414#1:1215\n444#1:1273\n586#1:1427\n616#1:1485\n860#1:1690\n907#1:1733\n417#1:1217\n447#1:1275\n471#1:1327\n471#1:1331\n500#1:1380\n589#1:1429\n619#1:1487\n640#1:1539\n640#1:1543\n669#1:1592\n758#1:1622\n759#1:1625\n758#1:1655\n759#1:1658\n417#1:1218\n447#1:1276\n471#1:1328\n471#1:1332\n500#1:1381\n589#1:1430\n619#1:1488\n640#1:1540\n640#1:1544\n669#1:1593\n758#1:1623\n759#1:1626\n758#1:1656\n759#1:1659\n417#1:1219\n447#1:1277\n471#1:1329\n500#1:1382\n589#1:1431\n619#1:1489\n640#1:1541\n669#1:1594\n758#1:1624\n759#1:1627\n758#1:1657\n759#1:1660\n1075#1:1755\n1076#1:1756\n1077#1:1757\n*E\n"})
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f15231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f15232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f15233c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {895}, m = "awaitAllPointersUpWithSlopDetection", n = {"$this$awaitAllPointersUpWithSlopDetection", "pass", "pointer", "touchSlopDetector", "pointerSlopReached", "touchSlop"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "F$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f15239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15240g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15241h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15240g = obj;
            this.f15241h |= Integer.MIN_VALUE;
            return x1.u(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {1092}, m = "awaitDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f15244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15245d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15244c = obj;
            this.f15245d |= Integer.MIN_VALUE;
            return x1.w(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {1092}, m = "awaitHorizontalDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f15248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15249d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15248c = obj;
            this.f15249d |= Integer.MIN_VALUE;
            int i10 = 6 | 0;
            return x1.y(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1105, 1145}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f15255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15256g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15257h;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15256g = obj;
            this.f15257h |= Integer.MIN_VALUE;
            return x1.z(null, 0L, 0, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1105, 1145}, m = "awaitHorizontalTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f15263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15265h;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15264g = obj;
            this.f15265h |= Integer.MIN_VALUE;
            return x1.A(null, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0}, l = {1012}, m = "awaitLongPressOrCancellation-rnUCldI", n = {"initialDown", "longPress", "deepPress"}, s = {"L$0", "L$1", "L$2"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f15269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15270e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15269d = obj;
            this.f15270e |= Integer.MIN_VALUE;
            return x1.B(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {1015, 1037}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", androidx.core.app.w.I0, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1089:1\n88#2:1090\n35#2,5:1091\n89#2:1096\n103#2:1097\n35#2,5:1098\n104#2:1103\n103#2:1104\n35#2,5:1105\n104#2:1110\n118#2:1111\n35#2,5:1112\n119#2:1117\n118#2:1118\n35#2,5:1119\n119#2:1124\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n1016#1:1090\n1016#1:1091,5\n1016#1:1096\n1022#1:1097\n1022#1:1098,5\n1022#1:1103\n1038#1:1104\n1038#1:1105,5\n1038#1:1110\n1042#1:1111\n1042#1:1112,5\n1042#1:1117\n1052#1:1118\n1052#1:1119,5\n1052#1:1124\n*E\n"})
    static final class g extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f15272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f15274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.a f15275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<androidx.compose.ui.input.pointer.c0> f15276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<androidx.compose.ui.input.pointer.c0> f15277g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.jvm.internal.i1.a aVar, kotlin.jvm.internal.i1.h<androidx.compose.ui.input.pointer.c0> hVar, kotlin.jvm.internal.i1.h<androidx.compose.ui.input.pointer.c0> hVar2, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f15275e = aVar;
            this.f15276f = hVar;
            this.f15277g = hVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f15275e, this.f15276f, this.f15277g, dVar);
            gVar.f15274d = obj;
            return gVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0066  */
        /* JADX WARN: Code duplicated, block: B:20:0x0073 A[LOOP:2: B:16:0x0064->B:20:0x0073, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:72:0x0076 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x0077 A[EDGE_INSN: B:73:0x0077->B:22:0x0077 BREAK  A[LOOP:2: B:16:0x0064->B:20:0x0073], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v10, types: [T, androidx.compose.ui.input.pointer.c0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c1 -> B:38:0x00c4). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {846, 869}, m = "awaitPointerSlopOrCancellation-6ksA65w", n = {"$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "touchSlop", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "dragEvent", "touchSlop"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f15283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15285h;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15284g = obj;
            this.f15285h |= Integer.MIN_VALUE;
            return x1.C(null, 0L, 0, null, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1105, 1142}, m = "awaitTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f15291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15293h;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15292g = obj;
            this.f15293h |= Integer.MIN_VALUE;
            return x1.F(null, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {1092}, m = "awaitVerticalDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f15296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15297d;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15296c = obj;
            this.f15297d |= Integer.MIN_VALUE;
            return x1.G(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1105, 1145}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f15303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15304g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15305h;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15304g = obj;
            this.f15305h |= Integer.MIN_VALUE;
            boolean z10 = true;
            return x1.H(null, 0L, 0, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1105, 1145}, m = "awaitVerticalTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f15311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15312g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15313h;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15312g = obj;
            this.f15313h |= Integer.MIN_VALUE;
            return x1.I(null, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7}, l = {com.planner5d.library.engine.input.f.b.S1, 255, 1105, 1142, 282, 1181, 1219, 1231}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "drag", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$13\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1089:1\n831#2,17:1090\n848#2,4:1114\n852#2,9:1124\n861#2,11:1134\n838#2,10:1173\n848#2,4:1190\n852#2,9:1201\n861#2,11:1211\n746#2,7:1222\n790#2,4:1229\n794#2,2:1240\n796#2,7:1248\n753#2,6:1255\n759#2:1264\n754#2,8:1267\n803#2:1275\n762#2:1276\n751#2:1277\n764#2,10:1278\n118#3:1107\n35#3,5:1108\n119#3:1113\n35#3,5:1118\n119#3:1123\n103#3:1145\n35#3,5:1146\n104#3:1151\n103#3:1152\n35#3,5:1153\n104#3:1158\n103#3:1159\n35#3,5:1160\n104#3:1165\n103#3:1166\n35#3,5:1167\n104#3:1172\n118#3:1183\n35#3,5:1184\n119#3:1189\n118#3:1194\n35#3,5:1195\n119#3:1200\n118#3:1233\n35#3,5:1234\n119#3:1239\n35#3,5:1242\n119#3:1247\n273#4:1133\n273#4:1210\n69#5:1261\n65#5:1265\n70#6:1262\n60#6:1266\n22#7:1263\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$13\n*L\n261#1:1090,17\n261#1:1114,4\n261#1:1124,9\n261#1:1134,11\n295#1:1173,10\n295#1:1190,4\n295#1:1201,9\n295#1:1211,11\n312#1:1222,7\n312#1:1229,4\n312#1:1240,2\n312#1:1248,7\n312#1:1255,6\n312#1:1264\n312#1:1267,8\n312#1:1275\n312#1:1276\n312#1:1277\n312#1:1278,10\n261#1:1107\n261#1:1108,5\n261#1:1113\n261#1:1118,5\n261#1:1123\n276#1:1145\n276#1:1146,5\n276#1:1151\n284#1:1152\n284#1:1153,5\n284#1:1158\n284#1:1159\n284#1:1160,5\n284#1:1165\n288#1:1166\n288#1:1167,5\n288#1:1172\n295#1:1183\n295#1:1184,5\n295#1:1189\n295#1:1194\n295#1:1195,5\n295#1:1200\n312#1:1233\n312#1:1234,5\n312#1:1239\n312#1:1242,5\n312#1:1247\n261#1:1133\n295#1:1210\n312#1:1261\n312#1:1265\n312#1:1262\n312#1:1266\n312#1:1263\n*E\n"})
    static final class m extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f15320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f15321h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f15322i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f15323j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f15324k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f15325l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ q3 f15326m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.ui.input.pointer.c0, androidx.compose.ui.input.pointer.c0, n0.g, Unit> f15327n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.ui.input.pointer.c0, n0.g, Unit> f15328o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15329s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.input.pointer.c0, Unit> f15330t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(Function0<Boolean> function0, kotlin.jvm.internal.i1.g gVar, q3 q3Var, pj.n<? super androidx.compose.ui.input.pointer.c0, ? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> nVar, Function2<? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> function2, Function0<Unit> function1, Function1<? super androidx.compose.ui.input.pointer.c0, Unit> function3, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f15324k = function0;
            this.f15325l = gVar;
            this.f15326m = q3Var;
            this.f15327n = nVar;
            this.f15328o = function2;
            this.f15329s = function1;
            this.f15330t = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            m mVar = new m(this.f15324k, this.f15325l, this.f15326m, this.f15327n, this.f15328o, this.f15329s, this.f15330t, dVar);
            mVar.f15323j = obj;
            return mVar;
        }

        /* JADX WARN: Code duplicated, block: B:242:0x0237 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0214  */
        /* JADX WARN: Code duplicated, block: B:38:0x022d A[LOOP:8: B:34:0x0212->B:38:0x022d, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v23 */
        /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v37 */
        /* JADX WARN: Type inference failed for: r0v55 */
        /* JADX WARN: Type inference failed for: r0v56 */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.ui.input.pointer.s, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v11, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v13 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v23 */
        /* JADX WARN: Type inference failed for: r7v24, types: [androidx.compose.ui.input.pointer.c0] */
        /* JADX WARN: Type inference failed for: r7v25 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v37 */
        /* JADX WARN: Type inference failed for: r7v46 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v53, types: [androidx.compose.ui.input.pointer.c0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v56 */
        /* JADX WARN: Type inference failed for: r7v72 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x03b4 -> B:113:0x03b6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0429 -> B:113:0x03b6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0480 -> B:81:0x02e8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0488 -> B:115:0x03cf). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x04a8 -> B:155:0x04aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x04bc -> B:81:0x02e8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x051f -> B:174:0x0522). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01d0 -> B:74:0x02c8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x023d -> B:43:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0290 -> B:74:0x02c8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x02b9 -> B:71:0x02be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x035e -> B:89:0x030d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 1540
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {362, 363, 368}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1089:1\n35#2,5:1090\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n374#1:1090,5\n*E\n"})
    static final class n extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f15333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.ui.input.pointer.c0, n0.g, Unit> f15336f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(Function1<? super n0.g, Unit> function1, Function0<Unit> function0, Function0<Unit> function2, Function2<? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> function3, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f15333c = function1;
            this.f15334d = function0;
            this.f15335e = function2;
            this.f15336f = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(Function2 function2, androidx.compose.ui.input.pointer.c0 c0Var) {
            function2.invoke(c0Var, n0.g.d(androidx.compose.ui.input.pointer.r.k(c0Var)));
            c0Var.a();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            n nVar = new n(this.f15333c, this.f15334d, this.f15335e, this.f15336f, dVar);
            nVar.f15332b = obj;
            return nVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0074  */
        /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: CancellationException -> 0x00cd, PHI: r1 r8 r13
          0x0075: PHI (r1v7 androidx.compose.ui.input.pointer.c) = (r1v4 androidx.compose.ui.input.pointer.c), (r1v8 androidx.compose.ui.input.pointer.c) binds: [B:16:0x0036, B:28:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x0075: PHI (r8v7 androidx.compose.foundation.gestures.x1$n) = (r8v3 androidx.compose.foundation.gestures.x1$n), (r8v8 androidx.compose.foundation.gestures.x1$n) binds: [B:16:0x0036, B:28:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x0075: PHI (r13v9 java.lang.Object) = (r13v0 java.lang.Object), (r13v14 java.lang.Object) binds: [B:16:0x0036, B:28:0x0072] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {CancellationException -> 0x00cd, blocks: (B:36:0x009f, B:38:0x00a9, B:40:0x00bc, B:42:0x00c9, B:45:0x00d1, B:46:0x00d4, B:47:0x00da, B:30:0x0075, B:32:0x0079, B:27:0x0062, B:23:0x0058), top: B:55:0x0058 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: CancellationException -> 0x00cd, TryCatch #1 {CancellationException -> 0x00cd, blocks: (B:36:0x009f, B:38:0x00a9, B:40:0x00bc, B:42:0x00c9, B:45:0x00d1, B:46:0x00d4, B:47:0x00da, B:30:0x0075, B:32:0x0079, B:27:0x0062, B:23:0x0058), top: B:55:0x0058 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x009d  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a9 A[Catch: CancellationException -> 0x00cd, TryCatch #1 {CancellationException -> 0x00cd, blocks: (B:36:0x009f, B:38:0x00a9, B:40:0x00bc, B:42:0x00c9, B:45:0x00d1, B:46:0x00d4, B:47:0x00da, B:30:0x0075, B:32:0x0079, B:27:0x0062, B:23:0x0058), top: B:55:0x0058 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00bc A[Catch: CancellationException -> 0x00cd, TryCatch #1 {CancellationException -> 0x00cd, blocks: (B:36:0x009f, B:38:0x00a9, B:40:0x00bc, B:42:0x00c9, B:45:0x00d1, B:46:0x00d4, B:47:0x00da, B:30:0x0075, B:32:0x0079, B:27:0x0062, B:23:0x0058), top: B:55:0x0058 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00c9 A[Catch: CancellationException -> 0x00cd, TryCatch #1 {CancellationException -> 0x00cd, blocks: (B:36:0x009f, B:38:0x00a9, B:40:0x00bc, B:42:0x00c9, B:45:0x00d1, B:46:0x00d4, B:47:0x00da, B:30:0x0075, B:32:0x0079, B:27:0x0062, B:23:0x0058), top: B:55:0x0058 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00da A[Catch: CancellationException -> 0x00cd, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00cd, blocks: (B:36:0x009f, B:38:0x00a9, B:40:0x00bc, B:42:0x00c9, B:45:0x00d1, B:46:0x00d4, B:47:0x00da, B:30:0x0075, B:32:0x0079, B:27:0x0062, B:23:0x0058), top: B:55:0x0058 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x00d1 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CancellationException cancellationException;
            n nVar;
            androidx.compose.ui.input.pointer.c cVar;
            androidx.compose.ui.input.pointer.c cVar2;
            List<androidx.compose.ui.input.pointer.c0> listE;
            int size;
            int i10;
            androidx.compose.ui.input.pointer.c0 c0Var;
            androidx.compose.ui.input.pointer.c0 c0Var2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f15331a;
            int i12 = 2 << 1;
            if (i11 != 0) {
                try {
                    if (i11 == 1) {
                        cVar = (androidx.compose.ui.input.pointer.c) this.f15332b;
                        ResultKt.m(obj);
                        nVar = this;
                        long jS = ((androidx.compose.ui.input.pointer.c0) obj).s();
                        nVar.f15332b = cVar;
                        nVar.f15331a = 2;
                        obj = x1.B(cVar, jS, nVar);
                        if (obj == objL) {
                            c0Var2 = (androidx.compose.ui.input.pointer.c0) obj;
                            if (c0Var2 != null) {
                                nVar.f15333c.invoke(n0.g.d(c0Var2.u()));
                                long jS2 = c0Var2.s();
                                final Function2<androidx.compose.ui.input.pointer.c0, n0.g, Unit> function2 = nVar.f15336f;
                                Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.y1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return x1.n.n(function2, (androidx.compose.ui.input.pointer.c0) obj2);
                                    }
                                };
                                nVar.f15332b = cVar;
                                nVar.f15331a = 3;
                                obj = x1.o0(cVar, jS2, function1, nVar);
                                if (obj != objL) {
                                    cVar2 = cVar;
                                }
                            }
                        }
                        return objL;
                    }
                    if (i11 == 2) {
                        cVar = (androidx.compose.ui.input.pointer.c) this.f15332b;
                        ResultKt.m(obj);
                        nVar = this;
                        c0Var2 = (androidx.compose.ui.input.pointer.c0) obj;
                        if (c0Var2 != null) {
                            nVar.f15333c.invoke(n0.g.d(c0Var2.u()));
                            long jS3 = c0Var2.s();
                            final Function2 function3 = nVar.f15336f;
                            Function1 function4 = new Function1() { // from class: androidx.compose.foundation.gestures.y1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return x1.n.n(function3, (androidx.compose.ui.input.pointer.c0) obj2);
                                }
                            };
                            nVar.f15332b = cVar;
                            nVar.f15331a = 3;
                            obj = x1.o0(cVar, jS3, function4, nVar);
                            if (obj != objL) {
                                cVar2 = cVar;
                            }
                            return objL;
                        }
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar2 = (androidx.compose.ui.input.pointer.c) this.f15332b;
                        ResultKt.m(obj);
                        nVar = this;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        listE = cVar2.J6().e();
                        size = listE.size();
                        for (i10 = 0; i10 < size; i10++) {
                            c0Var = listE.get(i10);
                            if (androidx.compose.ui.input.pointer.r.d(c0Var)) {
                                c0Var.a();
                            }
                        }
                        nVar.f15334d.invoke();
                    } else {
                        nVar.f15335e.invoke();
                    }
                } catch (CancellationException e10) {
                    cancellationException = e10;
                    nVar = this;
                    nVar.f15335e.invoke();
                    throw cancellationException;
                }
            } else {
                ResultKt.m(obj);
                androidx.compose.ui.input.pointer.c cVar3 = (androidx.compose.ui.input.pointer.c) this.f15332b;
                try {
                    this.f15332b = cVar3;
                    this.f15331a = 1;
                    nVar = this;
                    try {
                        obj = c5.g(cVar3, false, null, nVar, 2, null);
                        if (obj != objL) {
                            cVar = cVar3;
                            long jS4 = ((androidx.compose.ui.input.pointer.c0) obj).s();
                            nVar.f15332b = cVar;
                            nVar.f15331a = 2;
                            obj = x1.B(cVar, jS4, nVar);
                            if (obj == objL) {
                                c0Var2 = (androidx.compose.ui.input.pointer.c0) obj;
                                if (c0Var2 != null) {
                                    nVar.f15333c.invoke(n0.g.d(c0Var2.u()));
                                    long jS5 = c0Var2.s();
                                    final Function2 function5 = nVar.f15336f;
                                    Function1 function6 = new Function1() { // from class: androidx.compose.foundation.gestures.y1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return x1.n.n(function5, (androidx.compose.ui.input.pointer.c0) obj2);
                                        }
                                    };
                                    nVar.f15332b = cVar;
                                    nVar.f15331a = 3;
                                    obj = x1.o0(cVar, jS5, function6, nVar);
                                    if (obj != objL) {
                                        cVar2 = cVar;
                                        if (((Boolean) obj).booleanValue()) {
                                            listE = cVar2.J6().e();
                                            size = listE.size();
                                            while (i10 < size) {
                                                c0Var = listE.get(i10);
                                                if (androidx.compose.ui.input.pointer.r.d(c0Var)) {
                                                    c0Var.a();
                                                }
                                            }
                                            nVar.f15334d.invoke();
                                        } else {
                                            nVar.f15335e.invoke();
                                        }
                                    }
                                }
                            }
                        }
                        return objL;
                    } catch (CancellationException e11) {
                        e = e11;
                        cancellationException = e;
                        nVar.f15335e.invoke();
                        throw cancellationException;
                    }
                } catch (CancellationException e12) {
                    e = e12;
                    nVar = this;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {androidx.constraintlayout.core.motion.utils.v.h.f44114o, 708, 716}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1089:1\n65#2:1090\n60#3:1091\n22#4:1092\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5\n*L\n717#1:1090\n717#1:1091\n717#1:1092\n*E\n"})
    static final class o extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f15338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f15339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f15340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.ui.input.pointer.c0, Float, Unit> f15341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15343g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(Function1<? super n0.g, Unit> function1, Function2<? super androidx.compose.ui.input.pointer.c0, ? super Float, Unit> function2, Function0<Unit> function0, Function0<Unit> function3, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.f15340d = function1;
            this.f15341e = function2;
            this.f15342f = function0;
            this.f15343g = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(kotlin.jvm.internal.i1.e eVar, androidx.compose.ui.input.pointer.c0 c0Var, float f10) {
            c0Var.a();
            eVar.f312748a = f10;
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function2 function2, androidx.compose.ui.input.pointer.c0 c0Var) {
            function2.invoke(c0Var, Float.valueOf(Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.r.k(c0Var) >> 32))));
            c0Var.a();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            o oVar = new o(this.f15340d, this.f15341e, this.f15342f, this.f15343g, dVar);
            oVar.f15339c = obj;
            return oVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
        
            if (r14 == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {536, 539, 547}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$5\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1089:1\n69#2:1090\n70#3:1091\n22#4:1092\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$5\n*L\n548#1:1090\n548#1:1091\n548#1:1092\n*E\n"})
    static final class p extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f15345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f15346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f15347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.ui.input.pointer.c0, Float, Unit> f15348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15350g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(Function1<? super n0.g, Unit> function1, Function2<? super androidx.compose.ui.input.pointer.c0, ? super Float, Unit> function2, Function0<Unit> function0, Function0<Unit> function3, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f15347d = function1;
            this.f15348e = function2;
            this.f15349f = function0;
            this.f15350g = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(kotlin.jvm.internal.i1.e eVar, androidx.compose.ui.input.pointer.c0 c0Var, float f10) {
            c0Var.a();
            eVar.f312748a = f10;
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function2 function2, androidx.compose.ui.input.pointer.c0 c0Var) {
            function2.invoke(c0Var, Float.valueOf(Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.r.k(c0Var) & com.rabbitmq.client.k0.f265952a))));
            c0Var.a();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            p pVar = new p(this.f15347d, this.f15348e, this.f15349f, this.f15350g, dVar);
            pVar.f15346c = obj;
            return pVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0088  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
        
            if (r14 == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "drag-jO51t88", n = {"$this$drag_u2djO51t88", "onDrag"}, s = {"L$0", "L$1"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f15353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15354d;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15353c = obj;
            this.f15354d |= Integer.MIN_VALUE;
            return x1.o0(null, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {1092}, m = "drag-VnAYq1g", n = {"$this$drag_u2dVnAYq1g", "onDrag", io.sentry.protocol.e.c.f306223k, "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15360f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15361g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15362h;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15361g = obj;
            this.f15362h |= Integer.MIN_VALUE;
            return x1.m0(null, 0L, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0}, l = {1099}, m = "horizontalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class s extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f15369g;

        s(kotlin.coroutines.d<? super s> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15368f = obj;
            this.f15369g |= Integer.MIN_VALUE;
            return x1.p0(null, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0}, l = {1099}, m = "verticalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f15376g;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15375f = obj;
            this.f15376g |= Integer.MIN_VALUE;
            return x1.s0(null, 0L, null, this);
        }
    }

    static {
        float fR = androidx.compose.ui.unit.h.r((float) 0.125d);
        f15231a = fR;
        float fR2 = androidx.compose.ui.unit.h.r(18);
        f15232b = fR2;
        f15233c = fR / fR2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fa A[LOOP:0: B:25:0x00df->B:29:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0104 A[EDGE_INSN: B:67:0x0104->B:31:0x0104 BREAK  A[LOOP:0: B:25:0x00df->B:29:0x00fa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0191 -> B:61:0x0199). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object A(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r21, long r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.c0, ? super java.lang.Float, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r25) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.A(androidx.compose.ui.input.pointer.c, long, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [kotlin.jvm.internal.i1$h] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.input.pointer.c0, java.lang.Object] */
    @Nullable
    public static final Object B(@NotNull androidx.compose.ui.input.pointer.c cVar, long j10, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> dVar) {
        f fVar;
        androidx.compose.ui.input.pointer.c0 c0Var;
        kotlin.jvm.internal.i1.a aVar;
        Object obj;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f15270e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f15270e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj2 = fVar.f15269d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f15270e;
        int i12 = 4 | 1;
        try {
            if (i11 == 0) {
                ResultKt.m(obj2);
                if (q0(cVar.J6(), j10)) {
                    return null;
                }
                List<androidx.compose.ui.input.pointer.c0> listE = cVar.J6().e();
                int size = listE.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        c0Var = null;
                        break;
                    }
                    c0Var = listE.get(i13);
                    if (androidx.compose.ui.input.pointer.b0.d(c0Var.s(), j10)) {
                        break;
                    }
                    i13++;
                }
                androidx.compose.ui.input.pointer.c0 c0Var2 = c0Var;
                if (c0Var2 == 0) {
                    return null;
                }
                kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
                kotlin.jvm.internal.i1.h hVar2 = new kotlin.jvm.internal.i1.h();
                hVar2.f312751a = c0Var2;
                long j11 = cVar.getViewConfiguration().j();
                kotlin.jvm.internal.i1.a aVar2 = new kotlin.jvm.internal.i1.a();
                g gVar = new g(aVar2, hVar2, hVar, null);
                fVar.f15266a = c0Var2;
                fVar.f15267b = hVar;
                fVar.f15268c = aVar2;
                fVar.f15270e = 1;
                if (cVar.Y1(j11, gVar, fVar) == objL) {
                    return objL;
                }
                aVar = aVar2;
                j10 = hVar;
                obj = c0Var2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (kotlin.jvm.internal.i1.a) fVar.f15268c;
                kotlin.jvm.internal.i1.h hVar3 = (kotlin.jvm.internal.i1.h) fVar.f15267b;
                androidx.compose.ui.input.pointer.c0 c0Var3 = (androidx.compose.ui.input.pointer.c0) fVar.f15266a;
                ResultKt.m(obj2);
                j10 = hVar3;
                obj = c0Var3;
            }
            if (!aVar.f312744a) {
                return null;
            }
            androidx.compose.ui.input.pointer.c0 c0Var4 = (androidx.compose.ui.input.pointer.c0) j10.f312751a;
            return c0Var4 == null ? obj : c0Var4;
        } catch (androidx.compose.ui.input.pointer.t unused) {
            Object obj3 = (androidx.compose.ui.input.pointer.c0) j10.f312751a;
            return obj3 == null ? obj : obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x0104 A[LOOP:0: B:25:0x00e3->B:29:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0112 A[EDGE_INSN: B:68:0x0112->B:31:0x0112 BREAK  A[LOOP:0: B:25:0x00e3->B:29:0x0104], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0198 -> B:62:0x019f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object C(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r19, long r20, int r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.q3 r23, long r24, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.c0, ? super n0.g, kotlin.Unit> r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r27) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.C(androidx.compose.ui.input.pointer.c, long, int, androidx.compose.foundation.gestures.q3, long, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object D(androidx.compose.ui.input.pointer.c cVar, long j10, int i10, q3 q3Var, long j11, Function2<? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> function2, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> dVar) {
        int i11;
        androidx.compose.ui.input.pointer.q qVar;
        androidx.compose.ui.input.pointer.c0 c0Var;
        androidx.compose.ui.input.pointer.c0 c0Var2;
        if (q0(cVar.J6(), j10)) {
            return null;
        }
        float fR0 = r0(cVar.getViewConfiguration(), i10);
        kotlin.jvm.internal.i1.g gVar = new kotlin.jvm.internal.i1.g();
        gVar.f312750a = j10;
        h5 h5Var = new h5(q3Var, j11, null);
        while (true) {
            int i12 = 0;
            kotlin.jvm.internal.h0.e(0);
            int i13 = 1;
            Object objD1 = androidx.compose.ui.input.pointer.c.d1(cVar, null, dVar, 1, null);
            kotlin.jvm.internal.h0.e(1);
            androidx.compose.ui.input.pointer.q qVar2 = (androidx.compose.ui.input.pointer.q) objD1;
            List<androidx.compose.ui.input.pointer.c0> listE = qVar2.e();
            int size = listE.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    i11 = i13;
                    qVar = qVar2;
                    c0Var = null;
                    break;
                }
                c0Var = listE.get(i14);
                i11 = i13;
                qVar = qVar2;
                if (Boolean.valueOf(androidx.compose.ui.input.pointer.b0.d(c0Var.s(), gVar.f312750a)).booleanValue()) {
                    break;
                }
                i14++;
                i13 = i11;
                qVar2 = qVar;
            }
            androidx.compose.ui.input.pointer.c0 c0Var3 = c0Var;
            if (c0Var3 == null || c0Var3.F()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.r.e(c0Var3)) {
                List<androidx.compose.ui.input.pointer.c0> listE2 = qVar.e();
                int size2 = listE2.size();
                while (true) {
                    if (i12 >= size2) {
                        c0Var2 = null;
                        break;
                    }
                    c0Var2 = listE2.get(i12);
                    if (Boolean.valueOf(c0Var2.w()).booleanValue()) {
                        break;
                    }
                    i12++;
                }
                androidx.compose.ui.input.pointer.c0 c0Var4 = c0Var2;
                if (c0Var4 == null) {
                    return null;
                }
                gVar.f312750a = c0Var4.s();
            } else {
                long jA = h5Var.a(c0Var3, fR0);
                if ((9223372034707292159L & jA) != n0.d.f332689d) {
                    function2.invoke(c0Var3, n0.g.d(jA));
                    if (c0Var3.F()) {
                        return c0Var3;
                    }
                    h5Var.f();
                } else {
                    androidx.compose.ui.input.pointer.s sVar = androidx.compose.ui.input.pointer.s.Final;
                    kotlin.jvm.internal.h0.e(0);
                    cVar.I6(sVar, dVar);
                    kotlin.jvm.internal.h0.e(i11);
                    if (c0Var3.F()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Object E(androidx.compose.ui.input.pointer.c cVar, long j10, int i10, q3 q3Var, long j11, Function2 function2, kotlin.coroutines.d dVar, int i11, Object obj) {
        androidx.compose.ui.input.pointer.c0 c0Var;
        androidx.compose.ui.input.pointer.c0 c0Var2;
        long jE = (i11 & 8) != 0 ? n0.g.f332700b.e() : j11;
        long jS = j10;
        if (q0(cVar.J6(), jS)) {
            return null;
        }
        float fR0 = r0(cVar.getViewConfiguration(), i10);
        h5 h5Var = new h5(q3Var, jE, null);
        while (true) {
            int i12 = 0;
            kotlin.jvm.internal.h0.e(0);
            Object objD1 = androidx.compose.ui.input.pointer.c.d1(cVar, null, dVar, 1, null);
            kotlin.jvm.internal.h0.e(1);
            androidx.compose.ui.input.pointer.q qVar = (androidx.compose.ui.input.pointer.q) objD1;
            List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
            int size = listE.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    c0Var = null;
                    break;
                }
                c0Var = listE.get(i13);
                if (androidx.compose.ui.input.pointer.b0.d(c0Var.s(), jS)) {
                    break;
                }
                i13++;
            }
            androidx.compose.ui.input.pointer.c0 c0Var3 = c0Var;
            if (c0Var3 == null || c0Var3.F()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.r.e(c0Var3)) {
                List<androidx.compose.ui.input.pointer.c0> listE2 = qVar.e();
                int size2 = listE2.size();
                while (true) {
                    if (i12 >= size2) {
                        c0Var2 = null;
                        break;
                    }
                    c0Var2 = listE2.get(i12);
                    if (c0Var2.w()) {
                        break;
                    }
                    i12++;
                }
                androidx.compose.ui.input.pointer.c0 c0Var4 = c0Var2;
                if (c0Var4 == null) {
                    return null;
                }
                jS = c0Var4.s();
            } else {
                long jA = h5Var.a(c0Var3, fR0);
                if ((9223372034707292159L & jA) != n0.d.f332689d) {
                    function2.invoke(c0Var3, n0.g.d(jA));
                    if (c0Var3.F()) {
                        return c0Var3;
                    }
                    h5Var.f();
                } else {
                    androidx.compose.ui.input.pointer.s sVar = androidx.compose.ui.input.pointer.s.Final;
                    kotlin.jvm.internal.h0.e(0);
                    cVar.I6(sVar, dVar);
                    kotlin.jvm.internal.h0.e(1);
                    if (c0Var3.F()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f9 A[LOOP:0: B:25:0x00de->B:29:0x00f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0105 A[EDGE_INSN: B:68:0x0105->B:31:0x0105 BREAK  A[LOOP:0: B:25:0x00de->B:29:0x00f9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x018e -> B:62:0x0195). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object F(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r19, long r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.c0, ? super n0.g, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r23) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.F(androidx.compose.ui.input.pointer.c, long, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[LOOP:0: B:23:0x0081->B:27:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x009d A[EDGE_INSN: B:56:0x009d->B:29:0x009d BREAK  A[LOOP:0: B:23:0x0081->B:27:0x0098], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0069 -> B:22:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object G(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r20) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.G(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00de  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fb A[LOOP:0: B:25:0x00dc->B:29:0x00fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0107 A[EDGE_INSN: B:67:0x0107->B:31:0x0107 BREAK  A[LOOP:0: B:25:0x00dc->B:29:0x00fb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0196 -> B:61:0x019e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object H(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r21, long r22, int r24, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.c0, ? super java.lang.Float, kotlin.Unit> r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r26) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.H(androidx.compose.ui.input.pointer.c, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ff A[LOOP:0: B:25:0x00de->B:29:0x00ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x010b A[EDGE_INSN: B:67:0x010b->B:31:0x010b BREAK  A[LOOP:0: B:25:0x00de->B:29:0x00ff], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x019c -> B:61:0x01a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object I(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r21, long r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.c0, ? super java.lang.Float, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r25) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.I(androidx.compose.ui.input.pointer.c, long, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public static final Object J(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @Nullable q3 q3Var, @NotNull pj.n<? super androidx.compose.ui.input.pointer.c0, ? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> nVar, @NotNull Function1<? super androidx.compose.ui.input.pointer.c0, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Boolean> function2, @NotNull Function2<? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = e3.e(l0Var, new m(function2, new kotlin.jvm.internal.i1.g(), q3Var, nVar, function3, function0, function1, null), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    @Nullable
    public static final Object K(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull final Function1<? super n0.g, Unit> function1, @NotNull final Function0<Unit> function0, @NotNull Function0<Unit> function2, @NotNull Function2<? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ = J(l0Var, null, new pj.n() { // from class: androidx.compose.foundation.gestures.q1
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return x1.R(function1, (androidx.compose.ui.input.pointer.c0) obj, (androidx.compose.ui.input.pointer.c0) obj2, (n0.g) obj3);
            }
        }, new Function1() { // from class: androidx.compose.foundation.gestures.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x1.S(function0, (androidx.compose.ui.input.pointer.c0) obj);
            }
        }, function2, new Function0() { // from class: androidx.compose.foundation.gestures.s1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(x1.T());
            }
        }, function3, dVar);
        return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
    }

    public static /* synthetic */ Object L(androidx.compose.ui.input.pointer.l0 l0Var, q3 q3Var, pj.n nVar, Function1 function1, Function0 function0, Function0 function2, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nVar = new pj.n() { // from class: androidx.compose.foundation.gestures.t1
                @Override // pj.n
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return x1.U((androidx.compose.ui.input.pointer.c0) obj2, (androidx.compose.ui.input.pointer.c0) obj3, (n0.g) obj4);
                }
            };
        }
        pj.n nVar2 = nVar;
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.u1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return x1.V((androidx.compose.ui.input.pointer.c0) obj2);
                }
            };
        }
        Function1 function4 = function1;
        if ((i10 & 8) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.v1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.W();
                }
            };
        }
        Function0 function5 = function0;
        if ((i10 & 16) != 0) {
            function2 = new Function0() { // from class: androidx.compose.foundation.gestures.w1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(x1.O());
                }
            };
        }
        return J(l0Var, q3Var, nVar2, function4, function5, function2, function3, dVar);
    }

    public static /* synthetic */ Object M(androidx.compose.ui.input.pointer.l0 l0Var, Function1 function1, Function0 function0, Function0 function2, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return x1.N((n0.g) obj2);
                }
            };
        }
        if ((i10 & 2) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.j1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.P();
                }
            };
        }
        if ((i10 & 4) != 0) {
            function2 = new Function0() { // from class: androidx.compose.foundation.gestures.k1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.Q();
                }
            };
        }
        Function0 function4 = function2;
        return K(l0Var, function1, function0, function4, function3, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(n0.g gVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Function1 function1, androidx.compose.ui.input.pointer.c0 c0Var, androidx.compose.ui.input.pointer.c0 c0Var2, n0.g gVar) {
        function1.invoke(n0.g.d(c0Var2.u()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Function0 function0, androidx.compose.ui.input.pointer.c0 c0Var) {
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(androidx.compose.ui.input.pointer.c0 c0Var, androidx.compose.ui.input.pointer.c0 c0Var2, n0.g gVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(androidx.compose.ui.input.pointer.c0 c0Var) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W() {
        return Unit.f312394a;
    }

    @Nullable
    public static final Object X(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull Function1<? super n0.g, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function2, @NotNull Function2<? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 5 << 0;
        Object objE = e3.e(l0Var, new n(function1, function0, function2, function3, null), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    public static /* synthetic */ Object Y(androidx.compose.ui.input.pointer.l0 l0Var, Function1 function1, Function0 function0, Function0 function2, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.f1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return x1.Z((n0.g) obj2);
                }
            };
        }
        if ((i10 & 2) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.g1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.a0();
                }
            };
        }
        if ((i10 & 4) != 0) {
            function2 = new Function0() { // from class: androidx.compose.foundation.gestures.h1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.b0();
                }
            };
        }
        Function0 function4 = function2;
        return X(l0Var, function1, function0, function4, function3, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(n0.g gVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0() {
        return Unit.f312394a;
    }

    @Nullable
    public static final Object c0(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull Function1<? super n0.g, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function2, @NotNull Function2<? super androidx.compose.ui.input.pointer.c0, ? super Float, Unit> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = e3.e(l0Var, new o(function1, function3, function0, function2, null), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    public static /* synthetic */ Object d0(androidx.compose.ui.input.pointer.l0 l0Var, Function1 function1, Function0 function0, Function0 function2, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return x1.e0((n0.g) obj2);
                }
            };
        }
        if ((i10 & 2) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.f0();
                }
            };
        }
        if ((i10 & 4) != 0) {
            function2 = new Function0() { // from class: androidx.compose.foundation.gestures.p1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.g0();
                }
            };
        }
        Function0 function4 = function2;
        return c0(l0Var, function1, function0, function4, function3, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(n0.g gVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0() {
        return Unit.f312394a;
    }

    @Nullable
    public static final Object h0(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull Function1<? super n0.g, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function2, @NotNull Function2<? super androidx.compose.ui.input.pointer.c0, ? super Float, Unit> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = e3.e(l0Var, new p(function1, function3, function0, function2, null), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    public static /* synthetic */ Object i0(androidx.compose.ui.input.pointer.l0 l0Var, Function1 function1, Function0 function0, Function0 function2, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return x1.j0((n0.g) obj2);
                }
            };
        }
        if ((i10 & 2) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.m1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.k0();
                }
            };
        }
        if ((i10 & 4) != 0) {
            function2 = new Function0() { // from class: androidx.compose.foundation.gestures.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.l0();
                }
            };
        }
        Function0 function4 = function2;
        return h0(l0Var, function1, function0, function4, function3, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(n0.g gVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0() {
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c6 A[LOOP:0: B:24:0x00ab->B:28:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0 A[EDGE_INSN: B:69:0x00d0->B:30:0x00d0 BREAK  A[LOOP:0: B:24:0x00ab->B:28:0x00c6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0097 -> B:23:0x009d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object m0(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r19, long r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.c0, kotlin.Unit> r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.q3 r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.c0, java.lang.Boolean> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r25) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.m0(androidx.compose.ui.input.pointer.c, long, kotlin.jvm.functions.Function1, androidx.compose.foundation.gestures.q3, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object n0(androidx.compose.ui.input.pointer.c cVar, long j10, Function1<? super androidx.compose.ui.input.pointer.c0, Unit> function1, q3 q3Var, Function1<? super androidx.compose.ui.input.pointer.c0, Boolean> function2, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> dVar) {
        androidx.compose.ui.input.pointer.c0 c0Var;
        androidx.compose.ui.input.pointer.c0 c0Var2;
        androidx.compose.ui.input.pointer.c0 c0Var3;
        float fIntBitsToFloat;
        long jS = j10;
        if (q0(cVar.J6(), jS)) {
            return null;
        }
        while (true) {
            kotlin.jvm.internal.i1.g gVar = new kotlin.jvm.internal.i1.g();
            gVar.f312750a = jS;
            while (true) {
                int i10 = 0;
                kotlin.jvm.internal.h0.e(0);
                Object objD1 = androidx.compose.ui.input.pointer.c.d1(cVar, null, dVar, 1, null);
                kotlin.jvm.internal.h0.e(1);
                androidx.compose.ui.input.pointer.q qVar = (androidx.compose.ui.input.pointer.q) objD1;
                List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
                int size = listE.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        c0Var = null;
                        break;
                    }
                    c0Var = listE.get(i11);
                    if (Boolean.valueOf(androidx.compose.ui.input.pointer.b0.d(c0Var.s(), gVar.f312750a)).booleanValue()) {
                        break;
                    }
                    i11++;
                }
                c0Var2 = c0Var;
                if (c0Var2 == null) {
                    c0Var2 = null;
                    break;
                }
                if (androidx.compose.ui.input.pointer.r.e(c0Var2)) {
                    List<androidx.compose.ui.input.pointer.c0> listE2 = qVar.e();
                    int size2 = listE2.size();
                    while (true) {
                        if (i10 >= size2) {
                            c0Var3 = null;
                            break;
                        }
                        c0Var3 = listE2.get(i10);
                        if (Boolean.valueOf(c0Var3.w()).booleanValue()) {
                            break;
                        }
                        i10++;
                    }
                    androidx.compose.ui.input.pointer.c0 c0Var4 = c0Var3;
                    if (c0Var4 == null) {
                        break;
                    }
                    gVar.f312750a = c0Var4.s();
                } else {
                    long jM = androidx.compose.ui.input.pointer.r.m(c0Var2);
                    if (q3Var == null) {
                        fIntBitsToFloat = n0.g.m(jM);
                    } else {
                        fIntBitsToFloat = q3Var == q3.Vertical ? Float.intBitsToFloat((int) (jM & com.rabbitmq.client.k0.f265952a)) : Float.intBitsToFloat((int) (jM >> 32));
                    }
                    if (Boolean.valueOf((fIntBitsToFloat == 0.0f ? 1 : 0) ^ 1).booleanValue()) {
                        break;
                    }
                }
            }
            if (c0Var2 == null || function2.invoke(c0Var2).booleanValue()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.r.e(c0Var2)) {
                return c0Var2;
            }
            function1.invoke(c0Var2);
            jS = c0Var2.s();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object o0(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r5, long r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.c0, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Boolean> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.x1.q
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.x1$q r0 = (androidx.compose.foundation.gestures.x1.q) r0
            int r1 = r0.f15354d
            r4 = 2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f15354d = r1
            goto L1a
        L14:
            androidx.compose.foundation.gestures.x1$q r0 = new androidx.compose.foundation.gestures.x1$q
            r4 = 5
            r0.<init>(r9)
        L1a:
            r4 = 5
            java.lang.Object r9 = r0.f15353c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r4 = 1
            int r2 = r0.f15354d
            r4 = 7
            r3 = 1
            r4 = 5
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L3e
            r4 = 5
            java.lang.Object r5 = r0.f15352b
            r4 = 5
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r4 = 0
            java.lang.Object r6 = r0.f15351a
            androidx.compose.ui.input.pointer.c r6 = (androidx.compose.ui.input.pointer.c) r6
            kotlin.ResultKt.m(r9)
            r8 = r5
            r5 = r6
            r5 = r6
            r4 = 7
            goto L5d
        L3e:
            r4 = 7
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "t aoolue b vc//ekiirunmeefsto/e/ ol/ on/hwiur tr/e/"
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 3
            r5.<init>(r6)
            throw r5
        L4a:
            r4 = 6
            kotlin.ResultKt.m(r9)
        L4e:
            r4 = 4
            r0.f15351a = r5
            r0.f15352b = r8
            r0.f15354d = r3
            java.lang.Object r9 = w(r5, r6, r0)
            r4 = 3
            if (r9 != r1) goto L5d
            return r1
        L5d:
            androidx.compose.ui.input.pointer.c0 r9 = (androidx.compose.ui.input.pointer.c0) r9
            if (r9 != 0) goto L69
            r5 = 0
            r4 = r5
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            r4 = 0
            return r5
        L69:
            boolean r6 = androidx.compose.ui.input.pointer.r.e(r9)
            if (r6 == 0) goto L75
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            r4 = 7
            return r5
        L75:
            r8.invoke(r9)
            r4 = 1
            long r6 = r9.s()
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.o0(androidx.compose.ui.input.pointer.c, long, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4 A[LOOP:0: B:24:0x009c->B:28:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[EDGE_INSN: B:75:0x00be->B:30:0x00be BREAK  A[LOOP:0: B:24:0x009c->B:28:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:23:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object p0(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r17, long r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.c0, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.p0(androidx.compose.ui.input.pointer.c, long, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q0(androidx.compose.ui.input.pointer.q qVar, long j10) {
        androidx.compose.ui.input.pointer.c0 c0Var;
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c0Var = null;
                break;
            }
            c0Var = listE.get(i10);
            if (androidx.compose.ui.input.pointer.b0.d(c0Var.s(), j10)) {
                break;
            }
            i10++;
        }
        androidx.compose.ui.input.pointer.c0 c0Var2 = c0Var;
        if (c0Var2 != null && c0Var2.w()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float r0(@NotNull androidx.compose.ui.platform.o4 o4Var, int i10) {
        return androidx.compose.ui.input.pointer.r0.i(i10, androidx.compose.ui.input.pointer.r0.f39113b.b()) ? o4Var.g() * f15233c : o4Var.g();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6 A[LOOP:0: B:24:0x009c->B:28:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0 A[EDGE_INSN: B:75:0x00c0->B:30:0x00c0 BREAK  A[LOOP:0: B:24:0x009c->B:28:0x00b6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:23:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object s0(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r17, long r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.c0, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.s0(androidx.compose.ui.input.pointer.c, long, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d2 A[LOOP:0: B:24:0x00b5->B:28:0x00d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a2 -> B:23:0x00a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object u(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r18, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c0 r19, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.s r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.u(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.c0, androidx.compose.ui.input.pointer.s, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object v(androidx.compose.ui.input.pointer.c cVar, androidx.compose.ui.input.pointer.c0 c0Var, androidx.compose.ui.input.pointer.s sVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            sVar = androidx.compose.ui.input.pointer.s.Main;
        }
        return u(cVar, c0Var, sVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094 A[LOOP:0: B:23:0x007e->B:27:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0098 A[EDGE_INSN: B:54:0x0098->B:29:0x0098 BREAK  A[LOOP:0: B:23:0x007e->B:27:0x0094], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006a -> B:22:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object w(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r20) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.w(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object x(androidx.compose.ui.input.pointer.c cVar, long j10, Function1<? super androidx.compose.ui.input.pointer.c0, Boolean> function1, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> dVar) {
        androidx.compose.ui.input.pointer.c0 c0Var;
        kotlin.jvm.internal.i1.g gVar = new kotlin.jvm.internal.i1.g();
        gVar.f312750a = j10;
        while (true) {
            kotlin.jvm.internal.h0.e(0);
            androidx.compose.ui.input.pointer.c0 c0Var2 = null;
            Object objD1 = androidx.compose.ui.input.pointer.c.d1(cVar, null, dVar, 1, null);
            kotlin.jvm.internal.h0.e(1);
            androidx.compose.ui.input.pointer.q qVar = (androidx.compose.ui.input.pointer.q) objD1;
            List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
            int size = listE.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    c0Var = null;
                    break;
                }
                c0Var = listE.get(i10);
                if (Boolean.valueOf(androidx.compose.ui.input.pointer.b0.d(c0Var.s(), gVar.f312750a)).booleanValue()) {
                    break;
                }
                i10++;
            }
            androidx.compose.ui.input.pointer.c0 c0Var3 = c0Var;
            if (c0Var3 == null) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.r.e(c0Var3)) {
                List<androidx.compose.ui.input.pointer.c0> listE2 = qVar.e();
                int size2 = listE2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    androidx.compose.ui.input.pointer.c0 c0Var4 = listE2.get(i11);
                    if (Boolean.valueOf(c0Var4.w()).booleanValue()) {
                        c0Var2 = c0Var4;
                        break;
                    }
                }
                androidx.compose.ui.input.pointer.c0 c0Var5 = c0Var2;
                if (c0Var5 == null) {
                    return c0Var3;
                }
                gVar.f312750a = c0Var5.s();
            } else if (function1.invoke(c0Var3).booleanValue()) {
                return c0Var3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[LOOP:0: B:23:0x0082->B:27:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x009c A[EDGE_INSN: B:56:0x009c->B:29:0x009c BREAK  A[LOOP:0: B:23:0x0082->B:27:0x0098], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006d -> B:22:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object y(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r20) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.y(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00db  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f8 A[LOOP:0: B:25:0x00d9->B:29:0x00f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0104 A[EDGE_INSN: B:67:0x0104->B:31:0x0104 BREAK  A[LOOP:0: B:25:0x00d9->B:29:0x00f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0195 -> B:61:0x019e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object z(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r21, long r22, int r24, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.c0, ? super java.lang.Float, kotlin.Unit> r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r26) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x1.z(androidx.compose.ui.input.pointer.c, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }
}
