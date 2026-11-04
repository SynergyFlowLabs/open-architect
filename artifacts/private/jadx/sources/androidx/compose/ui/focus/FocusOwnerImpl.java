package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.b2;
import androidx.collection.g2;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.x1;
import androidx.compose.ui.platform.t2;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 ObjectList.kt\nandroidx/collection/ObjectList\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,503:1\n420#1:579\n421#1:599\n423#1:645\n409#1:719\n410#1:794\n411#1:800\n412#1,2:847\n414#1:895\n415#1:901\n420#1:903\n421#1:923\n423#1:969\n409#1:971\n410#1:1046\n411#1:1052\n412#1,2:1099\n414#1:1147\n415#1:1153\n420#1:1155\n421#1:1175\n423#1:1221\n409#1:1223\n410#1:1298\n411#1:1304\n412#1,2:1351\n414#1:1399\n415#1:1405\n420#1:1407\n421#1:1427\n423#1:1473\n409#1:1475\n410#1:1550\n411#1:1556\n412#1,2:1603\n414#1:1651\n415#1:1657\n118#2:504\n130#2:578\n130#2:646\n130#2:718\n142#2:902\n142#2:970\n134#2:1154\n134#2:1222\n159#2:1406\n159#2:1474\n118#2:1902\n130#2:1903\n118#2:1923\n248#3,5:505\n91#3:510\n92#3,8:515\n450#3,6:523\n460#3,2:530\n462#3,8:535\n470#3,9:546\n479#3,8:558\n101#3,7:566\n252#3:580\n91#3:581\n92#3,8:586\n450#3,5:594\n455#3:600\n460#3,2:602\n462#3,8:607\n470#3,9:618\n479#3,8:630\n101#3,7:638\n278#3:647\n248#3,5:648\n91#3:653\n92#3,8:658\n450#3,5:666\n279#3:671\n455#3:672\n460#3,2:674\n462#3,8:679\n470#3,9:690\n479#3,8:702\n101#3,7:710\n281#3:717\n269#3,2:720\n248#3,5:722\n91#3:727\n92#3,8:732\n450#3,5:740\n271#3,3:745\n455#3:748\n460#3,2:750\n462#3,8:755\n470#3,9:766\n479#3,8:778\n101#3,7:786\n274#3:793\n450#3,12:801\n462#3,8:816\n470#3,9:827\n479#3,8:839\n450#3,12:849\n462#3,8:864\n470#3,9:875\n479#3,8:887\n252#3:904\n91#3:905\n92#3,8:910\n450#3,5:918\n455#3:924\n460#3,2:926\n462#3,8:931\n470#3,9:942\n479#3,8:954\n101#3,7:962\n269#3,2:972\n248#3,5:974\n91#3:979\n92#3,8:984\n450#3,5:992\n271#3,3:997\n455#3:1000\n460#3,2:1002\n462#3,8:1007\n470#3,9:1018\n479#3,8:1030\n101#3,7:1038\n274#3:1045\n450#3,12:1053\n462#3,8:1068\n470#3,9:1079\n479#3,8:1091\n450#3,12:1101\n462#3,8:1116\n470#3,9:1127\n479#3,8:1139\n252#3:1156\n91#3:1157\n92#3,8:1162\n450#3,5:1170\n455#3:1176\n460#3,2:1178\n462#3,8:1183\n470#3,9:1194\n479#3,8:1206\n101#3,7:1214\n269#3,2:1224\n248#3,5:1226\n91#3:1231\n92#3,8:1236\n450#3,5:1244\n271#3,3:1249\n455#3:1252\n460#3,2:1254\n462#3,8:1259\n470#3,9:1270\n479#3,8:1282\n101#3,7:1290\n274#3:1297\n450#3,12:1305\n462#3,8:1320\n470#3,9:1331\n479#3,8:1343\n450#3,12:1353\n462#3,8:1368\n470#3,9:1379\n479#3,8:1391\n252#3:1408\n91#3:1409\n92#3,8:1414\n450#3,5:1422\n455#3:1428\n460#3,2:1430\n462#3,8:1435\n470#3,9:1446\n479#3,8:1458\n101#3,7:1466\n269#3,2:1476\n248#3,5:1478\n91#3:1483\n92#3,8:1488\n450#3,5:1496\n271#3,3:1501\n455#3:1504\n460#3,2:1506\n462#3,8:1511\n470#3,9:1522\n479#3,8:1534\n101#3,7:1542\n274#3:1549\n450#3,12:1557\n462#3,8:1572\n470#3,9:1583\n479#3,8:1595\n450#3,12:1605\n462#3,8:1620\n470#3,9:1631\n479#3,8:1643\n269#3,2:1658\n248#3,5:1660\n91#3:1665\n92#3,8:1670\n450#3,5:1678\n271#3,3:1683\n455#3:1686\n460#3,2:1688\n462#3,8:1693\n470#3,9:1704\n479#3,8:1716\n101#3,7:1724\n274#3:1731\n450#3,6:1737\n460#3,2:1744\n462#3,8:1749\n470#3,9:1760\n479#3,8:1772\n450#3,6:1780\n460#3,2:1787\n462#3,8:1792\n470#3,9:1803\n479#3,8:1815\n252#3:1828\n91#3:1829\n92#3,8:1834\n450#3,6:1842\n460#3,2:1849\n462#3,8:1854\n470#3,9:1865\n479#3,8:1877\n101#3,7:1885\n203#3,8:1905\n211#3,6:1917\n218#3,3:1925\n57#4,4:511\n57#4,4:582\n57#4,4:654\n57#4,4:728\n57#4,4:906\n57#4,4:980\n57#4,4:1158\n57#4,4:1232\n57#4,4:1410\n57#4,4:1484\n57#4,4:1666\n57#4,4:1830\n103#4,4:1898\n57#4,4:1913\n247#5:529\n247#5:601\n247#5:673\n247#5:749\n247#5:925\n247#5:1001\n247#5:1177\n247#5:1253\n247#5:1429\n247#5:1505\n247#5:1687\n247#5:1743\n247#5:1786\n247#5:1848\n247#5:1924\n240#6,3:532\n243#6,3:555\n240#6,3:604\n243#6,3:627\n240#6,3:676\n243#6,3:699\n240#6,3:752\n243#6,3:775\n240#6,3:813\n243#6,3:836\n240#6,3:861\n243#6,3:884\n240#6,3:928\n243#6,3:951\n240#6,3:1004\n243#6,3:1027\n240#6,3:1065\n243#6,3:1088\n240#6,3:1113\n243#6,3:1136\n240#6,3:1180\n243#6,3:1203\n240#6,3:1256\n243#6,3:1279\n240#6,3:1317\n243#6,3:1340\n240#6,3:1365\n243#6,3:1388\n240#6,3:1432\n243#6,3:1455\n240#6,3:1508\n243#6,3:1531\n240#6,3:1569\n243#6,3:1592\n240#6,3:1617\n243#6,3:1640\n240#6,3:1690\n243#6,3:1713\n240#6,3:1746\n243#6,3:1769\n240#6,3:1789\n243#6,3:1812\n240#6,3:1851\n243#6,3:1874\n1107#7:543\n1085#7,2:544\n1107#7:615\n1085#7,2:616\n1107#7:687\n1085#7,2:688\n1107#7:763\n1085#7,2:764\n1107#7:824\n1085#7,2:825\n1107#7:872\n1085#7,2:873\n1107#7:939\n1085#7,2:940\n1107#7:1015\n1085#7,2:1016\n1107#7:1076\n1085#7,2:1077\n1107#7:1124\n1085#7,2:1125\n1107#7:1191\n1085#7,2:1192\n1107#7:1267\n1085#7,2:1268\n1107#7:1328\n1085#7,2:1329\n1107#7:1376\n1085#7,2:1377\n1107#7:1443\n1085#7,2:1444\n1107#7:1519\n1085#7,2:1520\n1107#7:1580\n1085#7,2:1581\n1107#7:1628\n1085#7,2:1629\n1107#7:1701\n1085#7,2:1702\n1107#7:1757\n1085#7,2:1758\n1107#7:1800\n1085#7,2:1801\n1107#7:1862\n1085#7,2:1863\n27#8,5:573\n53#9,5:795\n35#9,5:896\n53#9,5:1047\n35#9,5:1148\n53#9,5:1299\n35#9,5:1400\n53#9,5:1551\n35#9,5:1652\n53#9,5:1732\n35#9,5:1823\n287#10,6:1892\n54#11:1904\n1#12:1928\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n303#1:579\n303#1:599\n303#1:645\n306#1:719\n306#1:794\n306#1:800\n306#1:847,2\n306#1:895\n306#1:901\n329#1:903\n329#1:923\n329#1:969\n331#1:971\n331#1:1046\n331#1:1052\n331#1:1099,2\n331#1:1147\n331#1:1153\n354#1:1155\n354#1:1175\n354#1:1221\n356#1:1223\n356#1:1298\n356#1:1304\n356#1:1351,2\n356#1:1399\n356#1:1405\n380#1:1407\n380#1:1427\n380#1:1473\n381#1:1475\n381#1:1550\n381#1:1556\n381#1:1603,2\n381#1:1651\n381#1:1657\n201#1:504\n303#1:578\n304#1:646\n307#1:718\n329#1:902\n332#1:970\n354#1:1154\n357#1:1222\n380#1:1406\n382#1:1474\n460#1:1902\n460#1:1903\n461#1:1923\n201#1:505,5\n201#1:510\n201#1:515,8\n201#1:523,6\n201#1:530,2\n201#1:535,8\n201#1:546,9\n201#1:558,8\n201#1:566,7\n303#1:580\n303#1:581\n303#1:586,8\n303#1:594,5\n303#1:600\n303#1:602,2\n303#1:607,8\n303#1:618,9\n303#1:630,8\n303#1:638,7\n304#1:647\n304#1:648,5\n304#1:653\n304#1:658,8\n304#1:666,5\n304#1:671\n304#1:672\n304#1:674,2\n304#1:679,8\n304#1:690,9\n304#1:702,8\n304#1:710,7\n304#1:717\n306#1:720,2\n306#1:722,5\n306#1:727\n306#1:732,8\n306#1:740,5\n306#1:745,3\n306#1:748\n306#1:750,2\n306#1:755,8\n306#1:766,9\n306#1:778,8\n306#1:786,7\n306#1:793\n306#1:801,12\n306#1:816,8\n306#1:827,9\n306#1:839,8\n306#1:849,12\n306#1:864,8\n306#1:875,9\n306#1:887,8\n329#1:904\n329#1:905\n329#1:910,8\n329#1:918,5\n329#1:924\n329#1:926,2\n329#1:931,8\n329#1:942,9\n329#1:954,8\n329#1:962,7\n331#1:972,2\n331#1:974,5\n331#1:979\n331#1:984,8\n331#1:992,5\n331#1:997,3\n331#1:1000\n331#1:1002,2\n331#1:1007,8\n331#1:1018,9\n331#1:1030,8\n331#1:1038,7\n331#1:1045\n331#1:1053,12\n331#1:1068,8\n331#1:1079,9\n331#1:1091,8\n331#1:1101,12\n331#1:1116,8\n331#1:1127,9\n331#1:1139,8\n354#1:1156\n354#1:1157\n354#1:1162,8\n354#1:1170,5\n354#1:1176\n354#1:1178,2\n354#1:1183,8\n354#1:1194,9\n354#1:1206,8\n354#1:1214,7\n356#1:1224,2\n356#1:1226,5\n356#1:1231\n356#1:1236,8\n356#1:1244,5\n356#1:1249,3\n356#1:1252\n356#1:1254,2\n356#1:1259,8\n356#1:1270,9\n356#1:1282,8\n356#1:1290,7\n356#1:1297\n356#1:1305,12\n356#1:1320,8\n356#1:1331,9\n356#1:1343,8\n356#1:1353,12\n356#1:1368,8\n356#1:1379,9\n356#1:1391,8\n380#1:1408\n380#1:1409\n380#1:1414,8\n380#1:1422,5\n380#1:1428\n380#1:1430,2\n380#1:1435,8\n380#1:1446,9\n380#1:1458,8\n380#1:1466,7\n381#1:1476,2\n381#1:1478,5\n381#1:1483\n381#1:1488,8\n381#1:1496,5\n381#1:1501,3\n381#1:1504\n381#1:1506,2\n381#1:1511,8\n381#1:1522,9\n381#1:1534,8\n381#1:1542,7\n381#1:1549\n381#1:1557,12\n381#1:1572,8\n381#1:1583,9\n381#1:1595,8\n381#1:1605,12\n381#1:1620,8\n381#1:1631,9\n381#1:1643,8\n409#1:1658,2\n409#1:1660,5\n409#1:1665\n409#1:1670,8\n409#1:1678,5\n409#1:1683,3\n409#1:1686\n409#1:1688,2\n409#1:1693,8\n409#1:1704,9\n409#1:1716,8\n409#1:1724,7\n409#1:1731\n411#1:1737,6\n411#1:1744,2\n411#1:1749,8\n411#1:1760,9\n411#1:1772,8\n413#1:1780,6\n413#1:1787,2\n413#1:1792,8\n413#1:1803,9\n413#1:1815,8\n420#1:1828\n420#1:1829\n420#1:1834,8\n420#1:1842,6\n420#1:1849,2\n420#1:1854,8\n420#1:1865,9\n420#1:1877,8\n420#1:1885,7\n460#1:1905,8\n460#1:1917,6\n460#1:1925,3\n201#1:511,4\n303#1:582,4\n304#1:654,4\n306#1:728,4\n329#1:906,4\n331#1:980,4\n354#1:1158,4\n356#1:1232,4\n380#1:1410,4\n381#1:1484,4\n409#1:1666,4\n420#1:1830,4\n452#1:1898,4\n460#1:1913,4\n201#1:529\n303#1:601\n304#1:673\n306#1:749\n329#1:925\n331#1:1001\n354#1:1177\n356#1:1253\n380#1:1429\n381#1:1505\n409#1:1687\n411#1:1743\n413#1:1786\n420#1:1848\n461#1:1924\n201#1:532,3\n201#1:555,3\n303#1:604,3\n303#1:627,3\n304#1:676,3\n304#1:699,3\n306#1:752,3\n306#1:775,3\n306#1:813,3\n306#1:836,3\n306#1:861,3\n306#1:884,3\n329#1:928,3\n329#1:951,3\n331#1:1004,3\n331#1:1027,3\n331#1:1065,3\n331#1:1088,3\n331#1:1113,3\n331#1:1136,3\n354#1:1180,3\n354#1:1203,3\n356#1:1256,3\n356#1:1279,3\n356#1:1317,3\n356#1:1340,3\n356#1:1365,3\n356#1:1388,3\n380#1:1432,3\n380#1:1455,3\n381#1:1508,3\n381#1:1531,3\n381#1:1569,3\n381#1:1592,3\n381#1:1617,3\n381#1:1640,3\n409#1:1690,3\n409#1:1713,3\n411#1:1746,3\n411#1:1769,3\n413#1:1789,3\n413#1:1812,3\n420#1:1851,3\n420#1:1874,3\n201#1:543\n201#1:544,2\n303#1:615\n303#1:616,2\n304#1:687\n304#1:688,2\n306#1:763\n306#1:764,2\n306#1:824\n306#1:825,2\n306#1:872\n306#1:873,2\n329#1:939\n329#1:940,2\n331#1:1015\n331#1:1016,2\n331#1:1076\n331#1:1077,2\n331#1:1124\n331#1:1125,2\n354#1:1191\n354#1:1192,2\n356#1:1267\n356#1:1268,2\n356#1:1328\n356#1:1329,2\n356#1:1376\n356#1:1377,2\n380#1:1443\n380#1:1444,2\n381#1:1519\n381#1:1520,2\n381#1:1580\n381#1:1581,2\n381#1:1628\n381#1:1629,2\n409#1:1701\n409#1:1702,2\n411#1:1757\n411#1:1758,2\n413#1:1800\n413#1:1801,2\n420#1:1862\n420#1:1863,2\n292#1:573,5\n306#1:795,5\n306#1:896,5\n331#1:1047,5\n331#1:1148,5\n356#1:1299,5\n356#1:1400,5\n381#1:1551,5\n381#1:1652,5\n410#1:1732,5\n414#1:1823,5\n446#1:1892,6\n460#1:1904\n*E\n"})
public final class FocusOwnerImpl implements w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f37339j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1 f37340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x1 f37341b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final o f37343d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private b2 f37345f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private FocusTargetNode f37347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37348i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private FocusTargetNode f37342c = new FocusTargetNode(w0.f37469b.b(), null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f37344e = new e1<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.e1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.e1
        public int hashCode() {
            return this.f37356c.E().hashCode();
        }

        @Override // androidx.compose.ui.node.e1
        public void j(t2 t2Var) {
            t2Var.d("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.e1
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode a() {
            return this.f37356c.E();
        }

        @Override // androidx.compose.ui.node.e1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void k(FocusTargetNode focusTargetNode) {
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final g2<p> f37346g = new g2<>(1);

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37349a;

        static {
            int[] iArr = new int[androidx.compose.ui.focus.c.values().length];
            try {
                iArr[androidx.compose.ui.focus.c.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.focus.c.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.focus.c.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.focus.c.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37349a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f37350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f37351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<FocusTargetNode, Boolean> f37352c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f37350a = focusTargetNode;
            this.f37351b = focusOwnerImpl;
            this.f37352c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            if (Intrinsics.areEqual(focusTargetNode, this.f37350a)) {
                zBooleanValue = false;
            } else {
                if (Intrinsics.areEqual(focusTargetNode, this.f37351b.E())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = this.f37352c.invoke(focusTargetNode).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<Boolean> f37353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37354b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i1.h<Boolean> hVar, int i10) {
            super(1);
            this.f37353a = hVar;
            this.f37354b = i10;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Boolean] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f37353a.f312751a = Boolean.valueOf(focusTargetNode.K4(this.f37354b));
            return this.f37353a.f312751a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37355a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f37355a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.K4(this.f37355a));
        }
    }

    public FocusOwnerImpl(@NotNull a1 a1Var, @NotNull x1 x1Var) {
        this.f37340a = a1Var;
        this.f37341b = x1Var;
        this.f37343d = new o(this, x1Var);
    }

    private final boolean B(boolean z10, boolean z11) {
        androidx.compose.ui.node.i1 i1VarA0;
        if (j() == null) {
            return true;
        }
        if (p() && !z10) {
            return false;
        }
        FocusTargetNode focusTargetNodeJ = j();
        r(null);
        if (z11 && focusTargetNodeJ != null) {
            focusTargetNodeJ.z9(p() ? q0.Captured : q0.Active, q0.Inactive);
            int iB = m1.b(1024);
            if (!focusTargetNodeJ.w().a9()) {
                s0.a.i("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.a0.d dVarW8 = focusTargetNodeJ.w().W8();
            androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(focusTargetNodeJ);
            while (l0VarU != null) {
                if ((l0VarU.A0().l().N8() & iB) != 0) {
                    while (dVarW8 != null) {
                        if ((dVarW8.T8() & iB) != 0) {
                            androidx.compose.ui.a0.d dVarN = dVarW8;
                            androidx.compose.runtime.collection.d dVar = null;
                            while (dVarN != null) {
                                if (dVarN instanceof FocusTargetNode) {
                                    ((FocusTargetNode) dVarN).z9(q0.ActiveParent, q0.Inactive);
                                } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                    int i10 = 0;
                                    for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                        if ((dVarY9.T8() & iB) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                dVarN = dVarY9;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                                }
                                                if (dVarN != null) {
                                                    dVar.d(dVarN);
                                                    dVarN = null;
                                                }
                                                dVar.d(dVarY9);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                dVarN = androidx.compose.ui.node.k.n(dVar);
                            }
                        }
                        dVarW8 = dVarW8.W8();
                    }
                }
                l0VarU = l0VarU.J0();
                dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
            }
        }
        return true;
    }

    static /* synthetic */ boolean C(FocusOwnerImpl focusOwnerImpl, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return focusOwnerImpl.B(z10, z11);
    }

    private final FocusTargetNode D() {
        return v0.b(this.f37342c);
    }

    private final androidx.compose.ui.a0.d F(androidx.compose.ui.node.j jVar) {
        int iB = m1.b(1024) | m1.b(8192);
        if (!jVar.w().a9()) {
            s0.a.i("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = jVar.w();
        androidx.compose.ui.a0.d dVar = null;
        if ((dVarW.N8() & iB) != 0) {
            for (androidx.compose.ui.a0.d dVarO8 = dVarW.O8(); dVarO8 != null; dVarO8 = dVarO8.O8()) {
                if ((dVarO8.T8() & iB) != 0) {
                    if ((m1.b(1024) & dVarO8.T8()) != 0) {
                        return dVar;
                    }
                    dVar = dVarO8;
                }
            }
        }
        return dVar;
    }

    private final /* synthetic */ <T> T G(androidx.compose.ui.node.j jVar, int i10) {
        androidx.compose.ui.node.i1 i1VarA0;
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.node.j jVarW = jVar.w();
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(jVar);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (jVarW != null) {
                    if ((((androidx.compose.ui.a0.d) jVarW).T8() & i10) != 0) {
                        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                        return (T) jVarW;
                    }
                    jVarW = (T) ((androidx.compose.ui.a0.d) jVarW).W8();
                }
            }
            l0VarU = l0VarU.J0();
            jVarW = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? (T) null : (T) i1VarA0.q();
        }
        return null;
    }

    private final /* synthetic */ <T extends androidx.compose.ui.node.j> void I(androidx.compose.ui.node.j jVar, int i10, Function1<? super T, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function2) {
        int size;
        androidx.compose.ui.node.i1 i1VarA0;
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = jVar.w().W8();
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(jVar);
        ArrayList arrayList = null;
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & i10) != 0) {
                        for (androidx.compose.ui.a0.d dVarN = dVarW8; dVarN != null; dVarN = androidx.compose.ui.node.k.n(null)) {
                            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(dVarN);
                        }
                    }
                    dVarW8 = dVarW8.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
        if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
            while (true) {
                int i11 = size - 1;
                function1.invoke((Object) arrayList.get(size));
                if (i11 < 0) {
                    break;
                } else {
                    size = i11;
                }
            }
        }
        for (androidx.compose.ui.a0.d dVarW = jVar.w(); dVarW != null; dVarW = androidx.compose.ui.node.k.n(null)) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            function1.invoke(dVarW);
        }
        function0.invoke();
        for (androidx.compose.ui.a0.d dVarW2 = jVar.w(); dVarW2 != null; dVarW2 = androidx.compose.ui.node.k.n(null)) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            function2.invoke(dVarW2);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                function2.invoke((Object) arrayList.get(i12));
            }
        }
    }

    private final boolean J(KeyEvent keyEvent) {
        long jA = androidx.compose.ui.input.key.e.a(keyEvent);
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.a aVar = androidx.compose.ui.input.key.d.f38913b;
        if (androidx.compose.ui.input.key.d.g(iB, aVar.a())) {
            b2 b2Var = this.f37345f;
            if (b2Var == null) {
                int i10 = 7 & 3;
                b2Var = new b2(3);
                this.f37345f = b2Var;
            }
            b2Var.U(jA);
        } else if (androidx.compose.ui.input.key.d.g(iB, aVar.b())) {
            b2 b2Var2 = this.f37345f;
            if (b2Var2 == null || !b2Var2.d(jA)) {
                return false;
            }
            b2 b2Var3 = this.f37345f;
            if (b2Var3 != null) {
                b2Var3.X(jA);
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.q
    public void A(boolean z10) {
        q(z10, true, true, f.f37408b.c());
    }

    @NotNull
    public final FocusTargetNode E() {
        return this.f37342c;
    }

    public final void H(@NotNull FocusTargetNode focusTargetNode) {
        this.f37342c = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.w
    @NotNull
    public androidx.compose.ui.a0 a() {
        return this.f37344e;
    }

    @Override // androidx.compose.ui.focus.w
    public boolean b(@Nullable f fVar, @Nullable n0.j jVar) {
        return this.f37340a.b(fVar, jVar);
    }

    @Override // androidx.compose.ui.focus.w
    public void c() {
        this.f37340a.c();
    }

    @Override // androidx.compose.ui.focus.w
    @NotNull
    public g2<p> d() {
        return this.f37346g;
    }

    @Override // androidx.compose.ui.focus.w
    public void f(boolean z10) {
        if (!((z10 && j() == null) ? false : true)) {
            s0.a.g("Cannot capture focus when the active focus target node is unset");
        }
        this.f37348i = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.w
    public boolean h(@org.jetbrains.annotations.NotNull android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.h(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.ui.focus.w
    @Nullable
    public Boolean i(int i10, @Nullable n0.j jVar, @NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode focusTargetNodeD = D();
        if (focusTargetNodeD != null) {
            g0 g0VarA = v0.a(focusTargetNodeD, i10, this.f37341b.getLayoutDirection());
            g0.a aVar = g0.f37418b;
            if (Intrinsics.areEqual(g0VarA, aVar.b())) {
                return null;
            }
            if (Intrinsics.areEqual(g0VarA, aVar.d())) {
                FocusTargetNode focusTargetNodeD2 = D();
                if (focusTargetNodeD2 != null) {
                    return function1.invoke(focusTargetNodeD2);
                }
                return null;
            }
            if (!Intrinsics.areEqual(g0VarA, aVar.c())) {
                return Boolean.valueOf(g0VarA.f(function1));
            }
        } else {
            focusTargetNodeD = null;
        }
        return v0.e(this.f37342c, i10, this.f37341b.getLayoutDirection(), jVar, new b(focusTargetNodeD, this, function1));
    }

    @Override // androidx.compose.ui.focus.w
    @Nullable
    public FocusTargetNode j() {
        return this.f37347h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.w
    public boolean l(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.indirect.c r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.l(androidx.compose.ui.input.indirect.c, kotlin.jvm.functions.Function0):boolean");
    }

    @Override // androidx.compose.ui.focus.w
    public void m() {
        this.f37343d.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.w
    public boolean n(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.rotary.d r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.n(androidx.compose.ui.input.rotary.d, kotlin.jvm.functions.Function0):boolean");
    }

    @Override // androidx.compose.ui.focus.w
    public boolean p() {
        return this.f37348i;
    }

    @Override // androidx.compose.ui.focus.w
    public boolean q(boolean z10, boolean z11, boolean z12, int i10) {
        boolean zB;
        if (z10) {
            zB = B(z10, z11);
        } else {
            int i11 = a.f37349a[u0.h(this.f37342c, i10).ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                zB = false;
            } else {
                if (i11 != 4) {
                    throw new kotlin.k0();
                }
                zB = B(z10, z11);
            }
        }
        if (zB && z12) {
            c();
        }
        return zB;
    }

    @Override // androidx.compose.ui.focus.w
    public void r(@Nullable FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.f37347h;
        this.f37347h = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            f(false);
        }
        if (androidx.compose.ui.k.f39200c) {
            g2<p> g2VarD = d();
            Object[] objArr = g2VarD.f12449a;
            int i10 = g2VarD.f12450b;
            for (int i11 = 0; i11 < i10; i11++) {
                ((p) objArr[i11]).a(focusTargetNode2, focusTargetNode);
            }
        }
    }

    @Override // androidx.compose.ui.focus.w
    public void s(@NotNull j jVar) {
        this.f37343d.f(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.q
    public boolean t(int i10) {
        if (androidx.compose.ui.k.f39201d && this.f37340a.z(i10)) {
            return true;
        }
        i1.h hVar = new i1.h();
        hVar.f312751a = Boolean.FALSE;
        FocusTargetNode focusTargetNodeJ = j();
        Boolean boolI = i(i10, this.f37340a.getEmbeddedViewFocusRect(), new c(hVar, i10));
        if (Intrinsics.areEqual(boolI, Boolean.TRUE) && focusTargetNodeJ != j()) {
            return true;
        }
        if (boolI != null && hVar.f312751a != 0) {
            if (boolI.booleanValue() && ((Boolean) hVar.f312751a).booleanValue()) {
                return true;
            }
            if (x.a(i10)) {
                return q(false, true, false, i10) && z(i10, null);
            }
            if (!androidx.compose.ui.k.f39201d && this.f37340a.z(i10)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.w
    public void u(@NotNull FocusTargetNode focusTargetNode) {
        this.f37343d.g(focusTargetNode);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0189 A[Catch: all -> 0x0399, TryCatch #0 {all -> 0x0399, blocks: (B:3:0x000b, B:5:0x0014, B:8:0x001f, B:12:0x0029, B:15:0x0037, B:112:0x0191, B:114:0x019f, B:115:0x01a2, B:117:0x01b2, B:120:0x01c3, B:124:0x01ce, B:127:0x01d4, B:128:0x01d9, B:148:0x021d, B:129:0x01dd, B:131:0x01e4, B:133:0x01e8, B:135:0x01f3, B:137:0x01fa, B:139:0x01fe, B:141:0x0204, B:143:0x020d, B:144:0x0212, B:145:0x0215, B:149:0x0222, B:150:0x0227, B:152:0x022d, B:154:0x0233, B:157:0x023f, B:159:0x0247, B:166:0x025e, B:167:0x0260, B:168:0x0270, B:170:0x0274, B:172:0x0278, B:199:0x02d7, B:176:0x0284, B:178:0x028d, B:180:0x0293, B:182:0x029c, B:184:0x02a3, B:186:0x02a7, B:187:0x02ac, B:189:0x02b2, B:190:0x02b9, B:192:0x02c1, B:193:0x02c6, B:195:0x02cc, B:196:0x02cf, B:200:0x02e2, B:204:0x02f2, B:205:0x0302, B:207:0x0306, B:209:0x030a, B:236:0x036a, B:213:0x0316, B:215:0x031f, B:217:0x0325, B:219:0x032f, B:221:0x0336, B:223:0x033a, B:224:0x033f, B:226:0x0345, B:227:0x034c, B:229:0x0354, B:230:0x0359, B:232:0x035f, B:233:0x0362, B:238:0x0377, B:240:0x037e, B:245:0x0391, B:246:0x0393, B:18:0x003f, B:20:0x004d, B:21:0x0050, B:23:0x005a, B:26:0x006b, B:30:0x0077, B:61:0x00da, B:63:0x00de, B:33:0x007d, B:35:0x0084, B:37:0x0088, B:39:0x0092, B:41:0x0099, B:43:0x009d, B:45:0x00a3, B:47:0x00ac, B:48:0x00b0, B:49:0x00b3, B:52:0x00bb, B:53:0x00c0, B:54:0x00c5, B:56:0x00cb, B:58:0x00d1, B:64:0x00e4, B:66:0x00f4, B:67:0x00f7, B:69:0x0105, B:72:0x0116, B:76:0x0122, B:107:0x0185, B:109:0x0189, B:79:0x0128, B:81:0x012f, B:83:0x0133, B:85:0x013d, B:87:0x0144, B:89:0x0148, B:91:0x014e, B:93:0x0157, B:94:0x015c, B:95:0x015f, B:98:0x0167, B:99:0x016c, B:100:0x0171, B:102:0x0177, B:104:0x017d), top: B:252:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:110:0x018e  */
    /* JADX WARN: Code duplicated, block: B:331:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4 A[Catch: all -> 0x0399, TryCatch #0 {all -> 0x0399, blocks: (B:3:0x000b, B:5:0x0014, B:8:0x001f, B:12:0x0029, B:15:0x0037, B:112:0x0191, B:114:0x019f, B:115:0x01a2, B:117:0x01b2, B:120:0x01c3, B:124:0x01ce, B:127:0x01d4, B:128:0x01d9, B:148:0x021d, B:129:0x01dd, B:131:0x01e4, B:133:0x01e8, B:135:0x01f3, B:137:0x01fa, B:139:0x01fe, B:141:0x0204, B:143:0x020d, B:144:0x0212, B:145:0x0215, B:149:0x0222, B:150:0x0227, B:152:0x022d, B:154:0x0233, B:157:0x023f, B:159:0x0247, B:166:0x025e, B:167:0x0260, B:168:0x0270, B:170:0x0274, B:172:0x0278, B:199:0x02d7, B:176:0x0284, B:178:0x028d, B:180:0x0293, B:182:0x029c, B:184:0x02a3, B:186:0x02a7, B:187:0x02ac, B:189:0x02b2, B:190:0x02b9, B:192:0x02c1, B:193:0x02c6, B:195:0x02cc, B:196:0x02cf, B:200:0x02e2, B:204:0x02f2, B:205:0x0302, B:207:0x0306, B:209:0x030a, B:236:0x036a, B:213:0x0316, B:215:0x031f, B:217:0x0325, B:219:0x032f, B:221:0x0336, B:223:0x033a, B:224:0x033f, B:226:0x0345, B:227:0x034c, B:229:0x0354, B:230:0x0359, B:232:0x035f, B:233:0x0362, B:238:0x0377, B:240:0x037e, B:245:0x0391, B:246:0x0393, B:18:0x003f, B:20:0x004d, B:21:0x0050, B:23:0x005a, B:26:0x006b, B:30:0x0077, B:61:0x00da, B:63:0x00de, B:33:0x007d, B:35:0x0084, B:37:0x0088, B:39:0x0092, B:41:0x0099, B:43:0x009d, B:45:0x00a3, B:47:0x00ac, B:48:0x00b0, B:49:0x00b3, B:52:0x00bb, B:53:0x00c0, B:54:0x00c5, B:56:0x00cb, B:58:0x00d1, B:64:0x00e4, B:66:0x00f4, B:67:0x00f7, B:69:0x0105, B:72:0x0116, B:76:0x0122, B:107:0x0185, B:109:0x0189, B:79:0x0128, B:81:0x012f, B:83:0x0133, B:85:0x013d, B:87:0x0144, B:89:0x0148, B:91:0x014e, B:93:0x0157, B:94:0x015c, B:95:0x015f, B:98:0x0167, B:99:0x016c, B:100:0x0171, B:102:0x0177, B:104:0x017d), top: B:252:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4 A[Catch: all -> 0x0399, TryCatch #0 {all -> 0x0399, blocks: (B:3:0x000b, B:5:0x0014, B:8:0x001f, B:12:0x0029, B:15:0x0037, B:112:0x0191, B:114:0x019f, B:115:0x01a2, B:117:0x01b2, B:120:0x01c3, B:124:0x01ce, B:127:0x01d4, B:128:0x01d9, B:148:0x021d, B:129:0x01dd, B:131:0x01e4, B:133:0x01e8, B:135:0x01f3, B:137:0x01fa, B:139:0x01fe, B:141:0x0204, B:143:0x020d, B:144:0x0212, B:145:0x0215, B:149:0x0222, B:150:0x0227, B:152:0x022d, B:154:0x0233, B:157:0x023f, B:159:0x0247, B:166:0x025e, B:167:0x0260, B:168:0x0270, B:170:0x0274, B:172:0x0278, B:199:0x02d7, B:176:0x0284, B:178:0x028d, B:180:0x0293, B:182:0x029c, B:184:0x02a3, B:186:0x02a7, B:187:0x02ac, B:189:0x02b2, B:190:0x02b9, B:192:0x02c1, B:193:0x02c6, B:195:0x02cc, B:196:0x02cf, B:200:0x02e2, B:204:0x02f2, B:205:0x0302, B:207:0x0306, B:209:0x030a, B:236:0x036a, B:213:0x0316, B:215:0x031f, B:217:0x0325, B:219:0x032f, B:221:0x0336, B:223:0x033a, B:224:0x033f, B:226:0x0345, B:227:0x034c, B:229:0x0354, B:230:0x0359, B:232:0x035f, B:233:0x0362, B:238:0x0377, B:240:0x037e, B:245:0x0391, B:246:0x0393, B:18:0x003f, B:20:0x004d, B:21:0x0050, B:23:0x005a, B:26:0x006b, B:30:0x0077, B:61:0x00da, B:63:0x00de, B:33:0x007d, B:35:0x0084, B:37:0x0088, B:39:0x0092, B:41:0x0099, B:43:0x009d, B:45:0x00a3, B:47:0x00ac, B:48:0x00b0, B:49:0x00b3, B:52:0x00bb, B:53:0x00c0, B:54:0x00c5, B:56:0x00cb, B:58:0x00d1, B:64:0x00e4, B:66:0x00f4, B:67:0x00f7, B:69:0x0105, B:72:0x0116, B:76:0x0122, B:107:0x0185, B:109:0x0189, B:79:0x0128, B:81:0x012f, B:83:0x0133, B:85:0x013d, B:87:0x0144, B:89:0x0148, B:91:0x014e, B:93:0x0157, B:94:0x015c, B:95:0x015f, B:98:0x0167, B:99:0x016c, B:100:0x0171, B:102:0x0177, B:104:0x017d), top: B:252:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0105 A[Catch: all -> 0x0399, TryCatch #0 {all -> 0x0399, blocks: (B:3:0x000b, B:5:0x0014, B:8:0x001f, B:12:0x0029, B:15:0x0037, B:112:0x0191, B:114:0x019f, B:115:0x01a2, B:117:0x01b2, B:120:0x01c3, B:124:0x01ce, B:127:0x01d4, B:128:0x01d9, B:148:0x021d, B:129:0x01dd, B:131:0x01e4, B:133:0x01e8, B:135:0x01f3, B:137:0x01fa, B:139:0x01fe, B:141:0x0204, B:143:0x020d, B:144:0x0212, B:145:0x0215, B:149:0x0222, B:150:0x0227, B:152:0x022d, B:154:0x0233, B:157:0x023f, B:159:0x0247, B:166:0x025e, B:167:0x0260, B:168:0x0270, B:170:0x0274, B:172:0x0278, B:199:0x02d7, B:176:0x0284, B:178:0x028d, B:180:0x0293, B:182:0x029c, B:184:0x02a3, B:186:0x02a7, B:187:0x02ac, B:189:0x02b2, B:190:0x02b9, B:192:0x02c1, B:193:0x02c6, B:195:0x02cc, B:196:0x02cf, B:200:0x02e2, B:204:0x02f2, B:205:0x0302, B:207:0x0306, B:209:0x030a, B:236:0x036a, B:213:0x0316, B:215:0x031f, B:217:0x0325, B:219:0x032f, B:221:0x0336, B:223:0x033a, B:224:0x033f, B:226:0x0345, B:227:0x034c, B:229:0x0354, B:230:0x0359, B:232:0x035f, B:233:0x0362, B:238:0x0377, B:240:0x037e, B:245:0x0391, B:246:0x0393, B:18:0x003f, B:20:0x004d, B:21:0x0050, B:23:0x005a, B:26:0x006b, B:30:0x0077, B:61:0x00da, B:63:0x00de, B:33:0x007d, B:35:0x0084, B:37:0x0088, B:39:0x0092, B:41:0x0099, B:43:0x009d, B:45:0x00a3, B:47:0x00ac, B:48:0x00b0, B:49:0x00b3, B:52:0x00bb, B:53:0x00c0, B:54:0x00c5, B:56:0x00cb, B:58:0x00d1, B:64:0x00e4, B:66:0x00f4, B:67:0x00f7, B:69:0x0105, B:72:0x0116, B:76:0x0122, B:107:0x0185, B:109:0x0189, B:79:0x0128, B:81:0x012f, B:83:0x0133, B:85:0x013d, B:87:0x0144, B:89:0x0148, B:91:0x014e, B:93:0x0157, B:94:0x015c, B:95:0x015f, B:98:0x0167, B:99:0x016c, B:100:0x0171, B:102:0x0177, B:104:0x017d), top: B:252:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0114 A[ADDED_TO_REGION, LOOP:15: B:71:0x0114->B:99:0x016c, LOOP_START, PHI: r9
      0x0114: PHI (r9v11 androidx.compose.ui.a0$d) = (r9v4 androidx.compose.ui.a0$d), (r9v12 androidx.compose.ui.a0$d) binds: [B:70:0x0112, B:99:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0116 A[Catch: all -> 0x0399, TryCatch #0 {all -> 0x0399, blocks: (B:3:0x000b, B:5:0x0014, B:8:0x001f, B:12:0x0029, B:15:0x0037, B:112:0x0191, B:114:0x019f, B:115:0x01a2, B:117:0x01b2, B:120:0x01c3, B:124:0x01ce, B:127:0x01d4, B:128:0x01d9, B:148:0x021d, B:129:0x01dd, B:131:0x01e4, B:133:0x01e8, B:135:0x01f3, B:137:0x01fa, B:139:0x01fe, B:141:0x0204, B:143:0x020d, B:144:0x0212, B:145:0x0215, B:149:0x0222, B:150:0x0227, B:152:0x022d, B:154:0x0233, B:157:0x023f, B:159:0x0247, B:166:0x025e, B:167:0x0260, B:168:0x0270, B:170:0x0274, B:172:0x0278, B:199:0x02d7, B:176:0x0284, B:178:0x028d, B:180:0x0293, B:182:0x029c, B:184:0x02a3, B:186:0x02a7, B:187:0x02ac, B:189:0x02b2, B:190:0x02b9, B:192:0x02c1, B:193:0x02c6, B:195:0x02cc, B:196:0x02cf, B:200:0x02e2, B:204:0x02f2, B:205:0x0302, B:207:0x0306, B:209:0x030a, B:236:0x036a, B:213:0x0316, B:215:0x031f, B:217:0x0325, B:219:0x032f, B:221:0x0336, B:223:0x033a, B:224:0x033f, B:226:0x0345, B:227:0x034c, B:229:0x0354, B:230:0x0359, B:232:0x035f, B:233:0x0362, B:238:0x0377, B:240:0x037e, B:245:0x0391, B:246:0x0393, B:18:0x003f, B:20:0x004d, B:21:0x0050, B:23:0x005a, B:26:0x006b, B:30:0x0077, B:61:0x00da, B:63:0x00de, B:33:0x007d, B:35:0x0084, B:37:0x0088, B:39:0x0092, B:41:0x0099, B:43:0x009d, B:45:0x00a3, B:47:0x00ac, B:48:0x00b0, B:49:0x00b3, B:52:0x00bb, B:53:0x00c0, B:54:0x00c5, B:56:0x00cb, B:58:0x00d1, B:64:0x00e4, B:66:0x00f4, B:67:0x00f7, B:69:0x0105, B:72:0x0116, B:76:0x0122, B:107:0x0185, B:109:0x0189, B:79:0x0128, B:81:0x012f, B:83:0x0133, B:85:0x013d, B:87:0x0144, B:89:0x0148, B:91:0x014e, B:93:0x0157, B:94:0x015c, B:95:0x015f, B:98:0x0167, B:99:0x016c, B:100:0x0171, B:102:0x0177, B:104:0x017d), top: B:252:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122 A[Catch: all -> 0x0399, TryCatch #0 {all -> 0x0399, blocks: (B:3:0x000b, B:5:0x0014, B:8:0x001f, B:12:0x0029, B:15:0x0037, B:112:0x0191, B:114:0x019f, B:115:0x01a2, B:117:0x01b2, B:120:0x01c3, B:124:0x01ce, B:127:0x01d4, B:128:0x01d9, B:148:0x021d, B:129:0x01dd, B:131:0x01e4, B:133:0x01e8, B:135:0x01f3, B:137:0x01fa, B:139:0x01fe, B:141:0x0204, B:143:0x020d, B:144:0x0212, B:145:0x0215, B:149:0x0222, B:150:0x0227, B:152:0x022d, B:154:0x0233, B:157:0x023f, B:159:0x0247, B:166:0x025e, B:167:0x0260, B:168:0x0270, B:170:0x0274, B:172:0x0278, B:199:0x02d7, B:176:0x0284, B:178:0x028d, B:180:0x0293, B:182:0x029c, B:184:0x02a3, B:186:0x02a7, B:187:0x02ac, B:189:0x02b2, B:190:0x02b9, B:192:0x02c1, B:193:0x02c6, B:195:0x02cc, B:196:0x02cf, B:200:0x02e2, B:204:0x02f2, B:205:0x0302, B:207:0x0306, B:209:0x030a, B:236:0x036a, B:213:0x0316, B:215:0x031f, B:217:0x0325, B:219:0x032f, B:221:0x0336, B:223:0x033a, B:224:0x033f, B:226:0x0345, B:227:0x034c, B:229:0x0354, B:230:0x0359, B:232:0x035f, B:233:0x0362, B:238:0x0377, B:240:0x037e, B:245:0x0391, B:246:0x0393, B:18:0x003f, B:20:0x004d, B:21:0x0050, B:23:0x005a, B:26:0x006b, B:30:0x0077, B:61:0x00da, B:63:0x00de, B:33:0x007d, B:35:0x0084, B:37:0x0088, B:39:0x0092, B:41:0x0099, B:43:0x009d, B:45:0x00a3, B:47:0x00ac, B:48:0x00b0, B:49:0x00b3, B:52:0x00bb, B:53:0x00c0, B:54:0x00c5, B:56:0x00cb, B:58:0x00d1, B:64:0x00e4, B:66:0x00f4, B:67:0x00f7, B:69:0x0105, B:72:0x0116, B:76:0x0122, B:107:0x0185, B:109:0x0189, B:79:0x0128, B:81:0x012f, B:83:0x0133, B:85:0x013d, B:87:0x0144, B:89:0x0148, B:91:0x014e, B:93:0x0157, B:94:0x015c, B:95:0x015f, B:98:0x0167, B:99:0x016c, B:100:0x0171, B:102:0x0177, B:104:0x017d), top: B:252:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0128 A[Catch: all -> 0x0399, TryCatch #0 {all -> 0x0399, blocks: (B:3:0x000b, B:5:0x0014, B:8:0x001f, B:12:0x0029, B:15:0x0037, B:112:0x0191, B:114:0x019f, B:115:0x01a2, B:117:0x01b2, B:120:0x01c3, B:124:0x01ce, B:127:0x01d4, B:128:0x01d9, B:148:0x021d, B:129:0x01dd, B:131:0x01e4, B:133:0x01e8, B:135:0x01f3, B:137:0x01fa, B:139:0x01fe, B:141:0x0204, B:143:0x020d, B:144:0x0212, B:145:0x0215, B:149:0x0222, B:150:0x0227, B:152:0x022d, B:154:0x0233, B:157:0x023f, B:159:0x0247, B:166:0x025e, B:167:0x0260, B:168:0x0270, B:170:0x0274, B:172:0x0278, B:199:0x02d7, B:176:0x0284, B:178:0x028d, B:180:0x0293, B:182:0x029c, B:184:0x02a3, B:186:0x02a7, B:187:0x02ac, B:189:0x02b2, B:190:0x02b9, B:192:0x02c1, B:193:0x02c6, B:195:0x02cc, B:196:0x02cf, B:200:0x02e2, B:204:0x02f2, B:205:0x0302, B:207:0x0306, B:209:0x030a, B:236:0x036a, B:213:0x0316, B:215:0x031f, B:217:0x0325, B:219:0x032f, B:221:0x0336, B:223:0x033a, B:224:0x033f, B:226:0x0345, B:227:0x034c, B:229:0x0354, B:230:0x0359, B:232:0x035f, B:233:0x0362, B:238:0x0377, B:240:0x037e, B:245:0x0391, B:246:0x0393, B:18:0x003f, B:20:0x004d, B:21:0x0050, B:23:0x005a, B:26:0x006b, B:30:0x0077, B:61:0x00da, B:63:0x00de, B:33:0x007d, B:35:0x0084, B:37:0x0088, B:39:0x0092, B:41:0x0099, B:43:0x009d, B:45:0x00a3, B:47:0x00ac, B:48:0x00b0, B:49:0x00b3, B:52:0x00bb, B:53:0x00c0, B:54:0x00c5, B:56:0x00cb, B:58:0x00d1, B:64:0x00e4, B:66:0x00f4, B:67:0x00f7, B:69:0x0105, B:72:0x0116, B:76:0x0122, B:107:0x0185, B:109:0x0189, B:79:0x0128, B:81:0x012f, B:83:0x0133, B:85:0x013d, B:87:0x0144, B:89:0x0148, B:91:0x014e, B:93:0x0157, B:94:0x015c, B:95:0x015f, B:98:0x0167, B:99:0x016c, B:100:0x0171, B:102:0x0177, B:104:0x017d), top: B:252:0x000b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v33, types: [T, androidx.compose.runtime.collection.d] */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r12v24, types: [T, androidx.compose.runtime.collection.d] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v28, types: [T, androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v35, types: [T, androidx.compose.ui.a0$d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [T, androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v48, types: [T, androidx.compose.ui.a0$d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.w
    public boolean v(@org.jetbrains.annotations.NotNull android.view.KeyEvent r17, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.v(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    @Override // androidx.compose.ui.focus.w
    @NotNull
    public p0 w() {
        return this.f37342c.c5();
    }

    @Override // androidx.compose.ui.focus.w
    @Nullable
    public n0.j x() {
        FocusTargetNode focusTargetNodeD = D();
        if (focusTargetNodeD != null) {
            return v0.d(focusTargetNodeD);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.w
    public void y() {
        u0.d(this.f37342c, true, true);
    }

    @Override // androidx.compose.ui.focus.w
    public boolean z(int i10, @Nullable n0.j jVar) {
        Boolean boolI = i(i10, jVar, new d(i10));
        if (boolI != null) {
            return boolI.booleanValue();
        }
        return false;
    }
}
