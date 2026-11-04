package androidx.compose.ui.node;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,491:1\n210#1:525\n211#1,10:530\n210#1:548\n211#1,6:553\n450#1,6:559\n460#1,2:566\n462#1,8:571\n470#1,9:582\n479#1,8:594\n218#1,3:602\n203#1,8:605\n211#1,6:617\n450#1,6:623\n460#1,2:630\n462#1,8:635\n470#1,9:646\n479#1,8:658\n218#1,3:666\n223#1:669\n224#1,4:674\n450#1,6:678\n460#1,2:685\n462#1,8:690\n470#1,9:701\n479#1,8:713\n229#1,3:721\n91#1:724\n92#1,8:729\n450#1,6:737\n460#1,2:744\n462#1,8:749\n470#1,9:760\n479#1,8:772\n101#1,7:780\n91#1,9:787\n450#1,12:796\n462#1,8:811\n470#1,9:822\n479#1,8:834\n101#1,7:842\n91#1:849\n92#1,8:854\n450#1,6:864\n460#1,2:871\n462#1,8:876\n470#1,9:887\n479#1,8:899\n101#1,7:907\n248#1,5:914\n91#1:919\n92#1,8:924\n450#1,6:932\n460#1,2:939\n462#1,8:944\n470#1,9:955\n479#1,8:967\n101#1,7:975\n248#1,5:982\n91#1:987\n92#1,8:992\n450#1,6:1000\n460#1,2:1007\n462#1,8:1012\n470#1,9:1023\n479#1,8:1035\n101#1,7:1043\n149#1:1050\n150#1:1055\n151#1,3:1059\n154#1:1063\n155#1,9:1065\n450#1,6:1074\n460#1,2:1081\n462#1,17:1086\n479#1,8:1106\n164#1,6:1114\n149#1,2:1120\n151#1,3:1125\n154#1:1129\n155#1,9:1131\n450#1,12:1140\n462#1,17:1155\n479#1,8:1175\n164#1,6:1183\n450#1,6:1189\n460#1,2:1196\n462#1,8:1201\n470#1,9:1212\n479#1,8:1224\n149#1:1232\n150#1:1237\n151#1,3:1241\n154#1:1245\n155#1,9:1247\n450#1,6:1256\n460#1,2:1263\n462#1,8:1268\n470#1,9:1279\n479#1,8:1291\n164#1,6:1299\n450#1,6:1305\n460#1,2:1312\n462#1,8:1317\n470#1,9:1328\n479#1,8:1340\n149#1,2:1348\n151#1,3:1353\n154#1:1357\n155#1,9:1359\n450#1,6:1368\n460#1,2:1375\n462#1,8:1380\n470#1,9:1391\n479#1,8:1403\n164#1,6:1411\n180#1:1417\n181#1:1422\n182#1,3:1426\n185#1,6:1430\n450#1,6:1436\n460#1,2:1443\n462#1,8:1448\n470#1,9:1459\n479#1,8:1471\n191#1,8:1479\n180#1,2:1487\n182#1,9:1492\n450#1,12:1501\n462#1,8:1516\n470#1,9:1527\n479#1,8:1539\n191#1,8:1547\n180#1:1555\n181#1:1560\n182#1,3:1564\n185#1,6:1568\n450#1,6:1574\n460#1,2:1581\n462#1,8:1586\n470#1,9:1597\n479#1,8:1609\n191#1,8:1617\n180#1,2:1625\n182#1,9:1630\n450#1,12:1639\n462#1,8:1654\n470#1,9:1665\n479#1,8:1677\n191#1,8:1685\n57#2,4:492\n57#2,4:496\n57#2,4:508\n57#2,4:517\n57#2,4:526\n57#2,4:540\n57#2,4:544\n57#2,4:549\n57#2,4:613\n57#2,4:670\n57#2,4:725\n57#2,4:850\n57#2,4:920\n57#2,4:988\n57#2,4:1051\n57#2,4:1233\n57#2,4:1418\n57#2,4:1556\n78#2,5:1693\n78#2,5:1698\n57#2,4:1703\n57#2,4:1708\n448#3,8:500\n519#3:515\n44#3:516\n519#3:524\n519#3:1062\n44#3:1064\n519#3:1128\n44#3:1130\n519#3:1244\n44#3:1246\n519#3:1356\n44#3:1358\n519#3:1429\n519#3:1567\n516#3:1727\n1107#4:512\n1085#4,2:513\n1107#4:521\n1085#4,2:522\n1107#4:579\n1085#4,2:580\n1107#4:643\n1085#4,2:644\n1107#4:698\n1085#4,2:699\n1107#4:757\n1085#4,2:758\n1107#4:819\n1085#4,2:820\n1107#4:884\n1085#4,2:885\n1107#4:952\n1085#4,2:953\n1107#4:1020\n1085#4,2:1021\n1107#4:1056\n1085#4,2:1057\n1107#4:1122\n1085#4,2:1123\n1107#4:1209\n1085#4,2:1210\n1107#4:1238\n1085#4,2:1239\n1107#4:1276\n1085#4,2:1277\n1107#4:1325\n1085#4,2:1326\n1107#4:1350\n1085#4,2:1351\n1107#4:1388\n1085#4,2:1389\n1107#4:1423\n1085#4,2:1424\n1107#4:1456\n1085#4,2:1457\n1107#4:1489\n1085#4,2:1490\n1107#4:1524\n1085#4,2:1525\n1107#4:1561\n1085#4,2:1562\n1107#4:1594\n1085#4,2:1595\n1107#4:1627\n1085#4,2:1628\n1107#4:1662\n1085#4,2:1663\n1107#4:1721\n1085#4,2:1722\n247#5:565\n247#5:629\n247#5:684\n247#5:743\n247#5:862\n247#5:863\n247#5:870\n247#5:938\n247#5:1006\n247#5:1080\n247#5:1195\n247#5:1262\n247#5:1311\n247#5:1374\n247#5:1442\n247#5:1580\n247#5:1713\n247#5:1715\n247#5:1716\n247#5:1720\n240#6,3:568\n243#6,3:591\n240#6,3:632\n243#6,3:655\n240#6,3:687\n243#6,3:710\n240#6,3:746\n243#6,3:769\n240#6,3:808\n243#6,3:831\n240#6,3:873\n243#6,3:896\n240#6,3:941\n243#6,3:964\n240#6,3:1009\n243#6,3:1032\n240#6,3:1083\n243#6,3:1103\n240#6,3:1152\n243#6,3:1172\n240#6,3:1198\n243#6,3:1221\n240#6,3:1265\n243#6,3:1288\n240#6,3:1314\n243#6,3:1337\n240#6,3:1377\n243#6,3:1400\n240#6,3:1445\n243#6,3:1468\n240#6,3:1513\n243#6,3:1536\n240#6,3:1583\n243#6,3:1606\n240#6,3:1651\n243#6,3:1674\n240#6,3:1717\n243#6,3:1724\n82#7:1707\n82#7:1712\n82#7:1714\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n203#1:525\n203#1:530,10\n236#1:548\n236#1:553,6\n236#1:559,6\n236#1:566,2\n236#1:571,8\n236#1:582,9\n236#1:594,8\n236#1:602,3\n241#1:605,8\n241#1:617,6\n241#1:623,6\n241#1:630,2\n241#1:635,8\n241#1:646,9\n241#1:658,8\n241#1:666,3\n246#1:669\n246#1:674,4\n246#1:678,6\n246#1:685,2\n246#1:690,8\n246#1:701,9\n246#1:713,8\n246#1:721,3\n252#1:724\n252#1:729,8\n252#1:737,6\n252#1:744,2\n252#1:749,8\n252#1:760,9\n252#1:772,8\n252#1:780,7\n252#1:787,9\n252#1:796,12\n252#1:811,8\n252#1:822,9\n252#1:834,8\n252#1:842,7\n260#1:849\n260#1:854,8\n263#1:864,6\n263#1:871,2\n263#1:876,8\n263#1:887,9\n263#1:899,8\n260#1:907,7\n270#1:914,5\n270#1:919\n270#1:924,8\n270#1:932,6\n270#1:939,2\n270#1:944,8\n270#1:955,9\n270#1:967,8\n270#1:975,7\n278#1:982,5\n278#1:987\n278#1:992,8\n278#1:1000,6\n278#1:1007,2\n278#1:1012,8\n278#1:1023,9\n278#1:1035,8\n278#1:1043,7\n288#1:1050\n288#1:1055\n288#1:1059,3\n288#1:1063\n288#1:1065,9\n288#1:1074,6\n288#1:1081,2\n288#1:1086,17\n288#1:1106,8\n288#1:1114,6\n288#1:1120,2\n288#1:1125,3\n288#1:1129\n288#1:1131,9\n288#1:1140,12\n288#1:1155,17\n288#1:1175,8\n288#1:1183,6\n295#1:1189,6\n295#1:1196,2\n295#1:1201,8\n295#1:1212,9\n295#1:1224,8\n296#1:1232\n296#1:1237\n296#1:1241,3\n296#1:1245\n296#1:1247,9\n296#1:1256,6\n296#1:1263,2\n296#1:1268,8\n296#1:1279,9\n296#1:1291,8\n296#1:1299,6\n295#1:1305,6\n295#1:1312,2\n295#1:1317,8\n295#1:1328,9\n295#1:1340,8\n296#1:1348,2\n296#1:1353,3\n296#1:1357\n296#1:1359,9\n296#1:1368,6\n296#1:1375,2\n296#1:1380,8\n296#1:1391,9\n296#1:1403,8\n296#1:1411,6\n304#1:1417\n304#1:1422\n304#1:1426,3\n304#1:1430,6\n305#1:1436,6\n305#1:1443,2\n305#1:1448,8\n305#1:1459,9\n305#1:1471,8\n304#1:1479,8\n304#1:1487,2\n304#1:1492,9\n305#1:1501,12\n305#1:1516,8\n305#1:1527,9\n305#1:1539,8\n304#1:1547,8\n314#1:1555\n314#1:1560\n314#1:1564,3\n314#1:1568,6\n315#1:1574,6\n315#1:1581,2\n315#1:1586,8\n315#1:1597,9\n315#1:1609,8\n314#1:1617,8\n314#1:1625,2\n314#1:1630,9\n315#1:1639,12\n315#1:1654,8\n315#1:1665,9\n315#1:1677,8\n314#1:1685,8\n91#1:492,4\n111#1:496,4\n149#1:508,4\n180#1:517,4\n203#1:526,4\n210#1:540,4\n223#1:544,4\n236#1:549,4\n241#1:613,4\n246#1:670,4\n252#1:725,4\n260#1:850,4\n270#1:920,4\n278#1:988,4\n288#1:1051,4\n296#1:1233,4\n304#1:1418,4\n314#1:1556,4\n329#1:1693,5\n337#1:1698,5\n371#1:1703,4\n375#1:1708,4\n141#1:500,8\n153#1:515\n154#1:516\n184#1:524\n288#1:1062\n288#1:1064\n288#1:1128\n288#1:1130\n296#1:1244\n296#1:1246\n296#1:1356\n296#1:1358\n304#1:1429\n314#1:1567\n489#1:1727\n150#1:512\n150#1:513,2\n181#1:521\n181#1:522,2\n236#1:579\n236#1:580,2\n241#1:643\n241#1:644,2\n246#1:698\n246#1:699,2\n252#1:757\n252#1:758,2\n252#1:819\n252#1:820,2\n263#1:884\n263#1:885,2\n270#1:952\n270#1:953,2\n278#1:1020\n278#1:1021,2\n288#1:1056\n288#1:1057,2\n288#1:1122\n288#1:1123,2\n295#1:1209\n295#1:1210,2\n296#1:1238\n296#1:1239,2\n296#1:1276\n296#1:1277,2\n295#1:1325\n295#1:1326,2\n296#1:1350\n296#1:1351,2\n296#1:1388\n296#1:1389,2\n304#1:1423\n304#1:1424,2\n305#1:1456\n305#1:1457,2\n304#1:1489\n304#1:1490,2\n305#1:1524\n305#1:1525,2\n314#1:1561\n314#1:1562,2\n315#1:1594\n315#1:1595,2\n314#1:1627\n314#1:1628,2\n315#1:1662\n315#1:1663,2\n469#1:1721\n469#1:1722,2\n236#1:565\n241#1:629\n246#1:684\n252#1:743\n261#1:862\n262#1:863\n263#1:870\n270#1:938\n278#1:1006\n288#1:1080\n295#1:1195\n296#1:1262\n295#1:1311\n296#1:1374\n305#1:1442\n315#1:1580\n408#1:1713\n415#1:1715\n455#1:1716\n462#1:1720\n236#1:568,3\n236#1:591,3\n241#1:632,3\n241#1:655,3\n246#1:687,3\n246#1:710,3\n252#1:746,3\n252#1:769,3\n252#1:808,3\n252#1:831,3\n263#1:873,3\n263#1:896,3\n270#1:941,3\n270#1:964,3\n278#1:1009,3\n278#1:1032,3\n288#1:1083,3\n288#1:1103,3\n288#1:1152,3\n288#1:1172,3\n295#1:1198,3\n295#1:1221,3\n296#1:1265,3\n296#1:1288,3\n295#1:1314,3\n295#1:1337,3\n296#1:1377,3\n296#1:1400,3\n305#1:1445,3\n305#1:1468,3\n305#1:1513,3\n305#1:1536,3\n315#1:1583,3\n315#1:1606,3\n315#1:1651,3\n315#1:1674,3\n461#1:1717,3\n461#1:1724,3\n374#1:1707\n408#1:1712\n415#1:1714\n*E\n"})
public final class k {
    public static /* synthetic */ void A(j jVar, int i10, boolean z10, Function1 function1, int i11, Object obj) {
        i1 i1VarA0;
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = z10 ? jVar.w() : jVar.w().W8();
        l0 l0VarU = u(jVar);
        while (l0VarU != null) {
            int i12 = 4 >> 0;
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (dVarW != null) {
                    if ((dVarW.T8() & i10) != 0) {
                        for (androidx.compose.ui.a0.d dVarN = dVarW; dVarN != null; dVarN = n(null)) {
                            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                            function1.invoke(dVarN);
                        }
                    }
                    dVarW = dVarW.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
    }

    public static final void B(@NotNull j jVar, int i10, boolean z10, @NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVarO9 = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVarO9.N8() & i10) == 0) {
                c(dVar, dVarO9, z10);
            } else {
                while (dVarO9 != null) {
                    if ((dVarO9.T8() & i10) != 0) {
                        function1.invoke(dVarO9);
                        break;
                    }
                    dVarO9 = dVarO9.O8();
                }
            }
        }
    }

    public static final /* synthetic */ <T> void C(j jVar, int i10, boolean z10, Function1<? super T, Unit> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVarN.N8() & i10) == 0) {
                c(dVar, dVarN, z10);
            } else {
                while (dVarN != null) {
                    if ((dVarN.T8() & i10) != 0) {
                        while (dVarN != null) {
                            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                            function1.invoke(dVarN);
                            dVarN = n(null);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
    }

    public static /* synthetic */ void D(j jVar, int i10, boolean z10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!jVar.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVarN.N8() & i10) == 0) {
                c(dVar, dVarN, z10);
            } else {
                while (dVarN != null) {
                    if ((dVarN.T8() & i10) != 0) {
                        while (dVarN != null) {
                            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                            function1.invoke(dVarN);
                            dVarN = n(null);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
    }

    public static final void E(@NotNull j jVar, int i10, @NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitLocalAncestors called on an unattached node");
        }
        for (androidx.compose.ui.a0.d dVarW8 = jVar.w().W8(); dVarW8 != null; dVarW8 = dVarW8.W8()) {
            if ((dVarW8.T8() & i10) != 0) {
                function1.invoke(dVarW8);
            }
        }
    }

    public static final /* synthetic */ <T> void F(j jVar, int i10, Function1<? super T, Unit> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitLocalAncestors called on an unattached node");
        }
        for (androidx.compose.ui.a0.d dVarW8 = jVar.w().W8(); dVarW8 != null; dVarW8 = dVarW8.W8()) {
            if ((dVarW8.T8() & i10) != 0) {
                for (androidx.compose.ui.a0.d dVarN = dVarW8; dVarN != null; dVarN = n(null)) {
                    Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                    function1.invoke(dVarN);
                }
            }
        }
    }

    public static final void G(@NotNull j jVar, int i10, @NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = jVar.w();
        if ((dVarW.N8() & i10) != 0) {
            for (androidx.compose.ui.a0.d dVarO8 = dVarW.O8(); dVarO8 != null; dVarO8 = dVarO8.O8()) {
                if ((dVarO8.T8() & i10) != 0) {
                    function1.invoke(dVarO8);
                }
            }
        }
    }

    public static final void H(@NotNull j jVar, int i10, boolean z10, @NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = jVar.w();
        if ((dVarW.N8() & i10) != 0) {
            if (!z10) {
                dVarW = dVarW.O8();
            }
            while (dVarW != null) {
                if ((dVarW.T8() & i10) != 0) {
                    function1.invoke(dVarW);
                }
                dVarW = dVarW.O8();
            }
        }
    }

    public static /* synthetic */ void I(j jVar, int i10, boolean z10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!jVar.w().a9()) {
            s0.a.i("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = jVar.w();
        if ((dVarW.N8() & i10) == 0) {
            return;
        }
        if (!z10) {
            dVarW = dVarW.O8();
        }
        while (dVarW != null) {
            if ((dVarW.T8() & i10) != 0) {
                function1.invoke(dVarW);
            }
            dVarW = dVarW.O8();
        }
    }

    public static final /* synthetic */ <T> void J(j jVar, int i10, Function1<? super T, Unit> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = jVar.w();
        if ((dVarW.N8() & i10) != 0) {
            for (androidx.compose.ui.a0.d dVarO8 = dVarW.O8(); dVarO8 != null; dVarO8 = dVarO8.O8()) {
                if ((dVarO8.T8() & i10) != 0) {
                    for (androidx.compose.ui.a0.d dVarN = dVarO8; dVarN != null; dVarN = n(null)) {
                        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                        function1.invoke(dVarN);
                    }
                }
            }
        }
    }

    public static final /* synthetic */ <T> void K(j jVar, int i10, int i11, Function1<? super T, Unit> function1) {
        i1 i1VarA0;
        androidx.compose.ui.a0.d dVarW = jVar.w();
        int i12 = i10 | i11;
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW2 = jVar.w();
        l0 l0VarU = u(jVar);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i12) != 0) {
                while (dVarW2 != null) {
                    if ((dVarW2.T8() & i12) != 0) {
                        if (dVarW2 != dVarW && (dVarW2.T8() & i11) != 0) {
                            return;
                        }
                        if ((dVarW2.T8() & i10) != 0) {
                            for (androidx.compose.ui.a0.d dVarN = dVarW2; dVarN != null; dVarN = n(null)) {
                                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                                function1.invoke(dVarN);
                            }
                        }
                    }
                    dVarW2 = dVarW2.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW2 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
    }

    public static final /* synthetic */ <T> void L(j jVar, int i10, boolean z10, Function1<? super T, Unit> function1) {
        for (androidx.compose.ui.a0.d dVarW = jVar.w(); dVarW != null; dVarW = n(null)) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            function1.invoke(dVarW);
        }
        if (!jVar.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVarN.N8() & i10) == 0) {
                c(dVar, dVarN, z10);
            } else {
                while (dVarN != null) {
                    if ((dVarN.T8() & i10) != 0) {
                        while (dVarN != null) {
                            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                            function1.invoke(dVarN);
                            dVarN = n(null);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
    }

    public static /* synthetic */ void M(j jVar, int i10, boolean z10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        for (androidx.compose.ui.a0.d dVarW = jVar.w(); dVarW != null; dVarW = n(null)) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            function1.invoke(dVarW);
        }
        if (!jVar.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVarN.N8() & i10) == 0) {
                c(dVar, dVarN, z10);
            } else {
                while (dVarN != null) {
                    if ((dVarN.T8() & i10) != 0) {
                        while (dVarN != null) {
                            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                            function1.invoke(dVarN);
                            dVarN = n(null);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
    }

    public static final /* synthetic */ <T> void N(j jVar, int i10, Function1<? super T, Unit> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = jVar.w();
        if ((dVarW.N8() & i10) != 0) {
            while (dVarW != null) {
                if ((dVarW.T8() & i10) != 0) {
                    for (androidx.compose.ui.a0.d dVarN = dVarW; dVarN != null; dVarN = n(null)) {
                        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                        function1.invoke(dVarN);
                    }
                }
                dVarW = dVarW.O8();
            }
        }
    }

    public static final /* synthetic */ <T> void O(j jVar, int i10, boolean z10, Function1<? super T, Unit> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVar2 = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVar2.N8() & i10) != 0) {
                for (androidx.compose.ui.a0.d dVarO9 = dVar2; dVarO9 != null; dVarO9 = dVarO9.O8()) {
                    if ((dVarO9.T8() & i10) != 0) {
                        for (androidx.compose.ui.a0.d dVarN = dVarO9; dVarN != null; dVarN = n(null)) {
                            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                            function1.invoke(dVarN);
                        }
                    }
                }
            }
            c(dVar, dVar2, z10);
        }
    }

    public static /* synthetic */ void P(j jVar, int i10, boolean z10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!jVar.w().a9()) {
            s0.a.i("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVar2 = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVar2.N8() & i10) != 0) {
                for (androidx.compose.ui.a0.d dVarO9 = dVar2; dVarO9 != null; dVarO9 = dVarO9.O8()) {
                    if ((dVarO9.T8() & i10) != 0) {
                        for (androidx.compose.ui.a0.d dVarN = dVarO9; dVarN != null; dVarN = n(null)) {
                            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                            function1.invoke(dVarN);
                        }
                    }
                }
            }
            c(dVar, dVar2, z10);
        }
    }

    public static final void Q(@NotNull j jVar, int i10, boolean z10, @NotNull Function1<? super androidx.compose.ui.a0.d, Boolean> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVar2 = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVar2.N8() & i10) != 0) {
                androidx.compose.ui.a0.d dVarO9 = dVar2;
                while (true) {
                    if (dVarO9 != null) {
                        if ((dVarO9.T8() & i10) != 0 && !function1.invoke(dVarO9).booleanValue()) {
                            break;
                        } else {
                            dVarO9 = dVarO9.O8();
                        }
                    }
                }
            }
            c(dVar, dVar2, z10);
        }
    }

    public static final /* synthetic */ <T> void R(j jVar, int i10, boolean z10, Function1<? super T, Boolean> function1) {
        if (!jVar.w().a9()) {
            s0.a.i("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVar2 = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVar2.N8() & i10) != 0) {
                androidx.compose.ui.a0.d dVarO9 = dVar2;
                while (true) {
                    if (dVarO9 != null) {
                        if ((dVarO9.T8() & i10) != 0) {
                            for (androidx.compose.ui.a0.d dVarN = dVarO9; dVarN != null; dVarN = n(null)) {
                                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                                if (!function1.invoke(dVarN).booleanValue()) {
                                    break;
                                }
                            }
                        }
                        dVarO9 = dVarO9.O8();
                    }
                }
            }
            c(dVar, dVar2, z10);
        }
    }

    public static /* synthetic */ void S(j jVar, int i10, boolean z10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!jVar.w().a9()) {
            s0.a.i("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null) {
            c(dVar, jVar.w(), z10);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVar2 = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVar2.N8() & i10) != 0) {
                androidx.compose.ui.a0.d dVarO9 = dVar2;
                while (true) {
                    if (dVarO9 != null) {
                        if ((dVarO9.T8() & i10) != 0) {
                            for (androidx.compose.ui.a0.d dVarN = dVarO9; dVarN != null; dVarN = n(null)) {
                                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                                if (!((Boolean) function1.invoke(dVarN)).booleanValue()) {
                                    break;
                                }
                            }
                        }
                        dVarO9 = dVarO9.O8();
                    }
                }
            }
            c(dVar, dVar2, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.runtime.collection.d<androidx.compose.ui.a0.d> dVar, androidx.compose.ui.a0.d dVar2, boolean z10) {
        androidx.compose.runtime.collection.d<l0> dVarH = h(u(dVar2), z10);
        int iR = dVarH.R() - 1;
        l0[] l0VarArr = dVarH.f35552a;
        if (iR < l0VarArr.length) {
            while (iR >= 0) {
                dVar.d(l0VarArr[iR].A0().l());
                iR--;
            }
        }
    }

    public static final /* synthetic */ <T> List<T> d(j jVar, int i10) {
        i1 i1VarA0;
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = jVar.w().W8();
        l0 l0VarU = u(jVar);
        ArrayList arrayList = null;
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & i10) != 0) {
                        for (androidx.compose.ui.a0.d dVarN = dVarW8; dVarN != null; dVarN = n(null)) {
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
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final g0 e(@NotNull androidx.compose.ui.a0.d dVar) {
        if ((m1.b(2) & dVar.T8()) != 0) {
            if (dVar instanceof g0) {
                return (g0) dVar;
            }
            if (dVar instanceof m) {
                androidx.compose.ui.a0.d dVarY9 = ((m) dVar).y9();
                while (dVarY9 != 0) {
                    if (dVarY9 instanceof g0) {
                        return (g0) dVarY9;
                    }
                    dVarY9 = (!(dVarY9 instanceof m) || (m1.b(2) & dVarY9.T8()) == 0) ? dVarY9.O8() : ((m) dVarY9).y9();
                }
            }
        }
        return null;
    }

    public static final /* synthetic */ <T> void f(androidx.compose.ui.a0.d dVar, int i10, Function1<? super T, Unit> function1) {
        while (dVar != null) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            function1.invoke(dVar);
            dVar = n(null);
        }
    }

    public static final void g(@NotNull j jVar, long j10) {
        v(jVar).I(j10);
    }

    private static final androidx.compose.runtime.collection.d<l0> h(l0 l0Var, boolean z10) {
        return z10 ? l0Var.O0() : l0Var.Q0();
    }

    public static final boolean i(@NotNull j jVar, int i10) {
        return (jVar.w().N8() & i10) != 0;
    }

    public static final void j(@NotNull j jVar) {
        if (jVar.w().a9()) {
            l0.f1(u(jVar), false, 1, null);
        }
    }

    public static final boolean k(@NotNull j jVar) {
        return jVar.w() == jVar;
    }

    @Nullable
    public static final androidx.compose.ui.a0.d l(@NotNull j jVar, int i10) {
        i1 i1VarA0;
        if (!jVar.w().a9()) {
            s0.a.i("nearestAncestor called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = jVar.w().W8();
        l0 l0VarU = u(jVar);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & i10) != 0) {
                        return dVarW8;
                    }
                    dVarW8 = dVarW8.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
        return null;
    }

    public static final /* synthetic */ <T> T m(j jVar, int i10) {
        i1 i1VarA0;
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        j jVarW8 = jVar.w().W8();
        l0 l0VarU = u(jVar);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (jVarW8 != null) {
                    if ((((androidx.compose.ui.a0.d) jVarW8).T8() & i10) != 0) {
                        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                        return (T) jVarW8;
                    }
                    jVarW8 = (T) ((androidx.compose.ui.a0.d) jVarW8).W8();
                }
            }
            l0VarU = l0VarU.J0();
            jVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? (T) null : (T) i1VarA0.q();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0.d n(androidx.compose.runtime.collection.d<androidx.compose.ui.a0.d> dVar) {
        if (dVar == null || dVar.R() == 0) {
            return null;
        }
        return dVar.r0(dVar.R() - 1);
    }

    public static final void o(@NotNull j jVar) {
        u(jVar).M1();
    }

    @NotNull
    public static final k1 p(@NotNull j jVar, int i10) {
        k1 k1VarP8 = jVar.w().P8();
        Intrinsics.checkNotNull(k1VarP8);
        if (k1VarP8.V4() != jVar || !n1.j(i10)) {
            return k1VarP8;
        }
        k1 k1VarY4 = k1VarP8.Y4();
        Intrinsics.checkNotNull(k1VarY4);
        return k1VarY4;
    }

    @NotNull
    public static final androidx.compose.ui.unit.d q(@NotNull j jVar) {
        return u(jVar).getDensity();
    }

    @NotNull
    public static final androidx.compose.ui.graphics.o1 r(@NotNull j jVar) {
        return v(jVar).getGraphicsContext();
    }

    @NotNull
    public static final androidx.compose.ui.layout.g0 s(@NotNull j jVar) {
        if (!jVar.w().a9()) {
            s0.a.i("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        androidx.compose.ui.layout.g0 g0VarN = p(jVar, m1.b(2)).n();
        if (!g0VarN.I()) {
            s0.a.i("LayoutCoordinates is not attached.");
        }
        return g0VarN;
    }

    @NotNull
    public static final androidx.compose.ui.unit.w t(@NotNull j jVar) {
        return u(jVar).getLayoutDirection();
    }

    @NotNull
    public static final l0 u(@NotNull j jVar) {
        k1 k1VarP8 = jVar.w().P8();
        if (k1VarP8 != null) {
            return k1VarP8.i4();
        }
        s0.a.j("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new kotlin.a0();
    }

    @NotNull
    public static final x1 v(@NotNull j jVar) {
        x1 x1VarI0 = u(jVar).I0();
        if (x1VarI0 != null) {
            return x1VarI0;
        }
        s0.a.j("This node does not have an owner.");
        throw new kotlin.a0();
    }

    @NotNull
    public static final androidx.compose.ui.semantics.p w(@NotNull j jVar) {
        return u(jVar);
    }

    public static final void x(@NotNull j jVar, int i10, boolean z10, @NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        i1 i1VarA0;
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = z10 ? jVar.w() : jVar.w().W8();
        l0 l0VarU = u(jVar);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (dVarW != null) {
                    if ((dVarW.T8() & i10) != 0) {
                        function1.invoke(dVarW);
                    }
                    dVarW = dVarW.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
    }

    public static /* synthetic */ void y(j jVar, int i10, boolean z10, Function1 function1, int i11, Object obj) {
        i1 i1VarA0;
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = z10 ? jVar.w() : jVar.w().W8();
        l0 l0VarU = u(jVar);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (dVarW != null) {
                    if ((dVarW.T8() & i10) != 0) {
                        function1.invoke(dVarW);
                    }
                    dVarW = dVarW.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
    }

    public static final /* synthetic */ <T> void z(j jVar, int i10, boolean z10, Function1<? super T, Unit> function1) {
        i1 i1VarA0;
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW = z10 ? jVar.w() : jVar.w().W8();
        l0 l0VarU = u(jVar);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & i10) != 0) {
                while (dVarW != null) {
                    if ((dVarW.T8() & i10) != 0) {
                        for (androidx.compose.ui.a0.d dVarN = dVarW; dVarN != null; dVarN = n(null)) {
                            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                            function1.invoke(dVarN);
                        }
                    }
                    dVarW = dVarW.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
    }
}
