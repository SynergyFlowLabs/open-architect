package kotlin.collections.unsigned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.collections.UArraySortingKt;
import kotlin.e1;
import kotlin.e2;
import kotlin.f2;
import kotlin.internal.f;
import kotlin.internal.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.m2;
import kotlin.q1;
import kotlin.r1;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.u;
import kotlin.u0;
import kotlin.u1;
import kotlin.v1;
import kotlin.y1;
import kotlin.z1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10766:1\n3824#1:10816\n3832#1:10817\n3840#1:10818\n3848#1:10819\n3824#1:10820\n3832#1:10821\n3840#1:10822\n3848#1:10823\n3824#1:10824\n3832#1:10825\n3840#1:10826\n3848#1:10827\n3824#1:10884\n3832#1:10885\n3840#1:10886\n3848#1:10887\n3824#1:10888\n3832#1:10889\n3840#1:10890\n3848#1:10891\n3824#1:10892\n3832#1:10893\n3840#1:10894\n3848#1:10895\n3824#1:10896\n3832#1:10897\n3840#1:10898\n3848#1:10899\n3824#1:10900\n3832#1:10901\n3840#1:10902\n3848#1:10903\n3824#1:10904\n3832#1:10905\n3840#1:10906\n3848#1:10907\n3824#1:10908\n3832#1:10909\n3840#1:10910\n3848#1:10911\n3824#1:10912\n3832#1:10913\n3840#1:10914\n3848#1:10915\n3824#1:10916\n3832#1:10917\n3840#1:10918\n3848#1:10919\n3824#1:10920\n3832#1:10921\n3840#1:10922\n3848#1:10923\n3824#1:10924\n3832#1:10925\n3840#1:10926\n3848#1:10927\n3824#1:10928\n3832#1:10929\n3840#1:10930\n3848#1:10931\n3824#1:10932\n3832#1:10933\n3840#1:10934\n3848#1:10935\n3824#1:10936\n3832#1:10937\n3840#1:10938\n3848#1:10939\n3824#1:10940\n3832#1:10941\n3840#1:10942\n3848#1:10943\n3824#1:10944\n3832#1:10945\n3840#1:10946\n3848#1:10947\n3824#1:10948\n3832#1:10949\n3840#1:10950\n3848#1:10951\n3824#1:10952\n3832#1:10953\n3840#1:10954\n3848#1:10955\n3824#1:10956\n3832#1:10957\n3840#1:10958\n3848#1:10959\n3824#1:10960\n3832#1:10961\n3840#1:10962\n3848#1:10963\n3824#1:10964\n3832#1:10965\n3840#1:10966\n3848#1:10967\n3824#1:10968\n3832#1:10969\n3840#1:10970\n3848#1:10971\n3824#1:10972\n3832#1:10973\n3840#1:10974\n3848#1:10975\n3824#1:10976\n3832#1:10977\n3840#1:10978\n3848#1:10979\n3824#1:10980\n3832#1:10981\n3840#1:10982\n3848#1:10983\n3824#1:10984\n3832#1:10985\n3840#1:10986\n3848#1:10987\n3824#1:10988\n3832#1:10989\n3840#1:10990\n3848#1:10991\n3824#1:10992\n3832#1:10993\n3840#1:10994\n3848#1:10995\n3824#1:10996\n3832#1:10997\n3840#1:10998\n3848#1:10999\n3824#1:11000\n3832#1:11001\n3840#1:11002\n3848#1:11003\n3824#1:11004\n3832#1:11005\n3840#1:11006\n3848#1:11007\n3824#1:11008\n3832#1:11009\n3840#1:11010\n3848#1:11011\n3824#1:11012\n3832#1:11013\n3840#1:11014\n3848#1:11015\n3824#1:11016\n3832#1:11017\n3840#1:11018\n3848#1:11019\n3824#1:11020\n3832#1:11021\n3840#1:11022\n3848#1:11023\n3824#1:11024\n3832#1:11025\n3840#1:11026\n3848#1:11027\n3824#1:11028\n3832#1:11029\n3840#1:11030\n3848#1:11031\n3824#1:11032\n3832#1:11033\n3840#1:11034\n3848#1:11035\n1718#2,6:10767\n1730#2,6:10773\n1694#2,6:10779\n1706#2,6:10785\n1826#2,6:10791\n1838#2,6:10797\n1802#2,6:10803\n1814#2,6:10809\n1#3:10815\n381#4,7:10828\n381#4,7:10835\n381#4,7:10842\n381#4,7:10849\n381#4,7:10856\n381#4,7:10863\n381#4,7:10870\n381#4,7:10877\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n1735#1:10816\n1752#1:10817\n1769#1:10818\n1786#1:10819\n2563#1:10820\n2580#1:10821\n2597#1:10822\n2614#1:10823\n2930#1:10824\n2946#1:10825\n2962#1:10826\n2978#1:10827\n5622#1:10884\n5642#1:10885\n5662#1:10886\n5682#1:10887\n5703#1:10888\n5725#1:10889\n5747#1:10890\n5769#1:10891\n5882#1:10892\n5901#1:10893\n5920#1:10894\n5939#1:10895\n5961#1:10896\n5990#1:10897\n6019#1:10898\n6048#1:10899\n6073#1:10900\n6098#1:10901\n6123#1:10902\n6148#1:10903\n6178#1:10904\n6201#1:10905\n6224#1:10906\n6247#1:10907\n6270#1:10908\n6293#1:10909\n6316#1:10910\n6339#1:10911\n6360#1:10912\n6383#1:10913\n6406#1:10914\n6429#1:10915\n6452#1:10916\n6473#1:10917\n6494#1:10918\n6515#1:10919\n6536#1:10920\n6557#1:10921\n6578#1:10922\n6599#1:10923\n6618#1:10924\n6639#1:10925\n6660#1:10926\n6681#1:10927\n6704#1:10928\n6727#1:10929\n6750#1:10930\n6773#1:10931\n6794#1:10932\n6815#1:10933\n6836#1:10934\n6857#1:10935\n6874#1:10936\n6889#1:10937\n6904#1:10938\n6919#1:10939\n6938#1:10940\n6957#1:10941\n6976#1:10942\n6995#1:10943\n7010#1:10944\n7025#1:10945\n7040#1:10946\n7055#1:10947\n7074#1:10948\n7093#1:10949\n7112#1:10950\n7131#1:10951\n7153#1:10952\n7182#1:10953\n7211#1:10954\n7240#1:10955\n7265#1:10956\n7290#1:10957\n7315#1:10958\n7340#1:10959\n7370#1:10960\n7393#1:10961\n7416#1:10962\n7439#1:10963\n7462#1:10964\n7485#1:10965\n7508#1:10966\n7531#1:10967\n7552#1:10968\n7575#1:10969\n7598#1:10970\n7621#1:10971\n7644#1:10972\n7665#1:10973\n7686#1:10974\n7707#1:10975\n7728#1:10976\n7749#1:10977\n7770#1:10978\n7791#1:10979\n7810#1:10980\n7831#1:10981\n7852#1:10982\n7873#1:10983\n7896#1:10984\n7919#1:10985\n7942#1:10986\n7965#1:10987\n7986#1:10988\n8007#1:10989\n8028#1:10990\n8049#1:10991\n8066#1:10992\n8081#1:10993\n8096#1:10994\n8111#1:10995\n8130#1:10996\n8149#1:10997\n8168#1:10998\n8187#1:10999\n8202#1:11000\n8217#1:11001\n8232#1:11002\n8247#1:11003\n8465#1:11004\n8490#1:11005\n8515#1:11006\n8540#1:11007\n8565#1:11008\n8590#1:11009\n8615#1:11010\n8640#1:11011\n8664#1:11012\n8688#1:11013\n8712#1:11014\n8736#1:11015\n8760#1:11016\n8784#1:11017\n8808#1:11018\n8832#1:11019\n8854#1:11020\n8879#1:11021\n8904#1:11022\n8929#1:11023\n8954#1:11024\n8980#1:11025\n9006#1:11026\n9032#1:11027\n9057#1:11028\n9082#1:11029\n9107#1:11030\n9132#1:11031\n9157#1:11032\n9181#1:11033\n9205#1:11034\n9229#1:11035\n841#1:10767,6\n851#1:10773,6\n861#1:10779,6\n871#1:10785,6\n881#1:10791,6\n891#1:10797,6\n901#1:10803,6\n911#1:10809,6\n4840#1:10828,7\n4860#1:10835,7\n4880#1:10842,7\n4900#1:10849,7\n4921#1:10856,7\n4942#1:10863,7\n4963#1:10870,7\n4984#1:10877,7\n*E\n"})
public class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: all-JOV_ifY, reason: not valid java name */
    private static final boolean m956allJOV_ifY(byte[] all, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(all);
        for (int i10 = 0; i10 < iV; i10++) {
            if (!predicate.invoke(q1.c(r1.t(all, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: all-MShoTSo, reason: not valid java name */
    private static final boolean m957allMShoTSo(long[] all, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(all);
        for (int i10 = 0; i10 < iV; i10++) {
            if (!predicate.invoke(y1.c(z1.t(all, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: all-jgv0xPQ, reason: not valid java name */
    private static final boolean m958alljgv0xPQ(int[] all, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(all);
        for (int i10 = 0; i10 < iV; i10++) {
            if (!predicate.invoke(u1.c(v1.t(all, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: all-xTcfx_M, reason: not valid java name */
    private static final boolean m959allxTcfx_M(short[] all, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(all);
        for (int i10 = 0; i10 < iV; i10++) {
            if (!predicate.invoke(e2.c(f2.t(all, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: any--ajY-9A, reason: not valid java name */
    private static final boolean m960anyajY9A(int[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: any-GBYM_sE, reason: not valid java name */
    private static final boolean m961anyGBYM_sE(byte[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: any-JOV_ifY, reason: not valid java name */
    private static final boolean m962anyJOV_ifY(byte[] any, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(any);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(q1.c(r1.t(any, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: any-MShoTSo, reason: not valid java name */
    private static final boolean m963anyMShoTSo(long[] any, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(any);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(y1.c(z1.t(any, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: any-QwZRm1k, reason: not valid java name */
    private static final boolean m964anyQwZRm1k(long[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: any-jgv0xPQ, reason: not valid java name */
    private static final boolean m965anyjgv0xPQ(int[] any, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(any);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(u1.c(v1.t(any, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: any-rL5Bavg, reason: not valid java name */
    private static final boolean m966anyrL5Bavg(short[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: any-xTcfx_M, reason: not valid java name */
    private static final boolean m967anyxTcfx_M(short[] any, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(any);
        int i10 = 7 & 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(e2.c(f2.t(any, i11))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: asByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m968asByteArrayGBYM_sE(byte[] asByteArray) {
        Intrinsics.checkNotNullParameter(asByteArray, "$this$asByteArray");
        return asByteArray;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: asIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m969asIntArrayajY9A(int[] asIntArray) {
        Intrinsics.checkNotNullParameter(asIntArray, "$this$asIntArray");
        return asIntArray;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: asLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m970asLongArrayQwZRm1k(long[] asLongArray) {
        Intrinsics.checkNotNullParameter(asLongArray, "$this$asLongArray");
        return asLongArray;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: asShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m971asShortArrayrL5Bavg(short[] asShortArray) {
        Intrinsics.checkNotNullParameter(asShortArray, "$this$asShortArray");
        return asShortArray;
    }

    @e1(version = "1.3")
    @f
    @u
    private static final byte[] asUByteArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return r1.k(bArr);
    }

    @e1(version = "1.3")
    @f
    @u
    private static final int[] asUIntArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return v1.k(iArr);
    }

    @e1(version = "1.3")
    @f
    @u
    private static final long[] asULongArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return z1.k(jArr);
    }

    @e1(version = "1.3")
    @f
    @u
    private static final short[] asUShortArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return f2.k(sArr);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: associateWith-JOV_ifY, reason: not valid java name */
    private static final <V> Map<q1, V> m972associateWithJOV_ifY(byte[] associateWith, Function1<? super q1, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(r1.v(associateWith)), 16));
        int iV = r1.v(associateWith);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(associateWith, i10);
            linkedHashMap.put(q1.c(bT), valueSelector.invoke(q1.c(bT)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: associateWith-MShoTSo, reason: not valid java name */
    private static final <V> Map<y1, V> m973associateWithMShoTSo(long[] associateWith, Function1<? super y1, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(z1.v(associateWith)), 16));
        int iV = z1.v(associateWith);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(associateWith, i10);
            linkedHashMap.put(y1.c(jT), valueSelector.invoke(y1.c(jT)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: associateWith-jgv0xPQ, reason: not valid java name */
    private static final <V> Map<u1, V> m974associateWithjgv0xPQ(int[] associateWith, Function1<? super u1, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(v1.v(associateWith)), 16));
        int iV = v1.v(associateWith);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(associateWith, i10);
            linkedHashMap.put(u1.c(iT), valueSelector.invoke(u1.c(iT)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: associateWith-xTcfx_M, reason: not valid java name */
    private static final <V> Map<e2, V> m975associateWithxTcfx_M(short[] associateWith, Function1<? super e2, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(f2.v(associateWith)), 16));
        int iV = f2.v(associateWith);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(associateWith, i10);
            linkedHashMap.put(e2.c(sT), valueSelector.invoke(e2.c(sT)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: associateWithTo-4D70W2E, reason: not valid java name */
    private static final <V, M extends Map<? super u1, ? super V>> M m976associateWithTo4D70W2E(int[] associateWithTo, M destination, Function1<? super u1, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iV = v1.v(associateWithTo);
        int i10 = 7 | 0;
        for (int i11 = 0; i11 < iV; i11++) {
            int iT = v1.t(associateWithTo, i11);
            destination.put(u1.c(iT), valueSelector.invoke(u1.c(iT)));
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: associateWithTo-H21X9dk, reason: not valid java name */
    private static final <V, M extends Map<? super q1, ? super V>> M m977associateWithToH21X9dk(byte[] associateWithTo, M destination, Function1<? super q1, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iV = r1.v(associateWithTo);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(associateWithTo, i10);
            destination.put(q1.c(bT), valueSelector.invoke(q1.c(bT)));
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: associateWithTo-X6OPwNk, reason: not valid java name */
    private static final <V, M extends Map<? super y1, ? super V>> M m978associateWithToX6OPwNk(long[] associateWithTo, M destination, Function1<? super y1, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iV = z1.v(associateWithTo);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(associateWithTo, i10);
            destination.put(y1.c(jT), valueSelector.invoke(y1.c(jT)));
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: associateWithTo-ciTST-8, reason: not valid java name */
    private static final <V, M extends Map<? super e2, ? super V>> M m979associateWithTociTST8(short[] associateWithTo, M destination, Function1<? super e2, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iV = f2.v(associateWithTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(associateWithTo, i10);
            destination.put(e2.c(sT), valueSelector.invoke(e2.c(sT)));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component1--ajY-9A, reason: not valid java name */
    private static final int m980component1ajY9A(int[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return v1.t(component1, 0);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component1-GBYM_sE, reason: not valid java name */
    private static final byte m981component1GBYM_sE(byte[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return r1.t(component1, 0);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component1-QwZRm1k, reason: not valid java name */
    private static final long m982component1QwZRm1k(long[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return z1.t(component1, 0);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component1-rL5Bavg, reason: not valid java name */
    private static final short m983component1rL5Bavg(short[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return f2.t(component1, 0);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component2--ajY-9A, reason: not valid java name */
    private static final int m984component2ajY9A(int[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return v1.t(component2, 1);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component2-GBYM_sE, reason: not valid java name */
    private static final byte m985component2GBYM_sE(byte[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return r1.t(component2, 1);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component2-QwZRm1k, reason: not valid java name */
    private static final long m986component2QwZRm1k(long[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return z1.t(component2, 1);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component2-rL5Bavg, reason: not valid java name */
    private static final short m987component2rL5Bavg(short[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return f2.t(component2, 1);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component3--ajY-9A, reason: not valid java name */
    private static final int m988component3ajY9A(int[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return v1.t(component3, 2);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component3-GBYM_sE, reason: not valid java name */
    private static final byte m989component3GBYM_sE(byte[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return r1.t(component3, 2);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component3-QwZRm1k, reason: not valid java name */
    private static final long m990component3QwZRm1k(long[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return z1.t(component3, 2);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component3-rL5Bavg, reason: not valid java name */
    private static final short m991component3rL5Bavg(short[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return f2.t(component3, 2);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component4--ajY-9A, reason: not valid java name */
    private static final int m992component4ajY9A(int[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return v1.t(component4, 3);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component4-GBYM_sE, reason: not valid java name */
    private static final byte m993component4GBYM_sE(byte[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return r1.t(component4, 3);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component4-QwZRm1k, reason: not valid java name */
    private static final long m994component4QwZRm1k(long[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return z1.t(component4, 3);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component4-rL5Bavg, reason: not valid java name */
    private static final short m995component4rL5Bavg(short[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return f2.t(component4, 3);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component5--ajY-9A, reason: not valid java name */
    private static final int m996component5ajY9A(int[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return v1.t(component5, 4);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component5-GBYM_sE, reason: not valid java name */
    private static final byte m997component5GBYM_sE(byte[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return r1.t(component5, 4);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component5-QwZRm1k, reason: not valid java name */
    private static final long m998component5QwZRm1k(long[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return z1.t(component5, 4);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: component5-rL5Bavg, reason: not valid java name */
    private static final short m999component5rL5Bavg(short[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return f2.t(component5, 4);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m1000contentEqualsFGO6Aew(@Nullable short[] sArr, @Nullable short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m1001contentEqualsKJPZfPQ(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m1002contentEqualskV0jMPg(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m1003contentEqualslec5QzE(@Nullable long[] jArr, @Nullable long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m1004contentHashCode2csIQuQ(@Nullable byte[] bArr) {
        if (bArr == null) {
            bArr = null;
            int i10 = 3 << 0;
        }
        return Arrays.hashCode(bArr);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m1005contentHashCodeXUkPCBk(@Nullable int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m1006contentHashCoded6D3K8(@Nullable short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m1007contentHashCodeuLth9ew(@Nullable long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @e1(version = "1.4")
    @u
    @NotNull
    /* JADX INFO: renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m1008contentToString2csIQuQ(@Nullable byte[] bArr) {
        String strJoinToString$default;
        return (bArr == null || (strJoinToString$default = CollectionsKt.joinToString$default(r1.d(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @e1(version = "1.4")
    @u
    @NotNull
    /* JADX INFO: renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m1009contentToStringXUkPCBk(@Nullable int[] iArr) {
        String strJoinToString$default;
        return (iArr == null || (strJoinToString$default = CollectionsKt.joinToString$default(v1.d(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @e1(version = "1.4")
    @u
    @NotNull
    /* JADX INFO: renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m1010contentToStringd6D3K8(@Nullable short[] sArr) {
        String strJoinToString$default;
        return (sArr == null || (strJoinToString$default = CollectionsKt.joinToString$default(f2.d(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @e1(version = "1.4")
    @u
    @NotNull
    /* JADX INFO: renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m1011contentToStringuLth9ew(@Nullable long[] jArr) {
        if (jArr != null) {
            int i10 = 1 << 0;
            String strJoinToString$default = CollectionsKt.joinToString$default(z1.d(jArr), ", ", "[", "]", 0, null, null, 56, null);
            if (strJoinToString$default != null) {
                return strJoinToString$default;
            }
        }
        return AbstractJsonLexerKt.NULL;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyInto--B0-L2c, reason: not valid java name */
    private static final long[] m1012copyIntoB0L2c(long[] copyInto, long[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i10, i11, i12);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto--B0-L2c$default, reason: not valid java name */
    static /* synthetic */ long[] m1013copyIntoB0L2c$default(long[] copyInto, long[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = z1.v(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyInto-9-ak10g, reason: not valid java name */
    private static final short[] m1014copyInto9ak10g(short[] copyInto, short[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i10, i11, i12);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto-9-ak10g$default, reason: not valid java name */
    static /* synthetic */ short[] m1015copyInto9ak10g$default(short[] copyInto, short[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = f2.v(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyInto-FUQE5sA, reason: not valid java name */
    private static final byte[] m1016copyIntoFUQE5sA(byte[] copyInto, byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i10, i11, i12);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto-FUQE5sA$default, reason: not valid java name */
    static /* synthetic */ byte[] m1017copyIntoFUQE5sA$default(byte[] copyInto, byte[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = r1.v(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyInto-sIZ3KeM, reason: not valid java name */
    private static final int[] m1018copyIntosIZ3KeM(int[] copyInto, int[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i10, i11, i12);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto-sIZ3KeM$default, reason: not valid java name */
    static /* synthetic */ int[] m1019copyIntosIZ3KeM$default(int[] copyInto, int[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = v1.v(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOf--ajY-9A, reason: not valid java name */
    private static final int[] m1020copyOfajY9A(int[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return v1.k(iArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOf-GBYM_sE, reason: not valid java name */
    private static final byte[] m1021copyOfGBYM_sE(byte[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return r1.k(bArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOf-PpDY95g, reason: not valid java name */
    private static final byte[] m1022copyOfPpDY95g(byte[] copyOf, int i10) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, i10);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return r1.k(bArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOf-QwZRm1k, reason: not valid java name */
    private static final long[] m1023copyOfQwZRm1k(long[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return z1.k(jArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOf-nggk6HY, reason: not valid java name */
    private static final short[] m1024copyOfnggk6HY(short[] copyOf, int i10) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, i10);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return f2.k(sArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOf-qFRl0hI, reason: not valid java name */
    private static final int[] m1025copyOfqFRl0hI(int[] copyOf, int i10) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, i10);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return v1.k(iArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOf-r7IrZao, reason: not valid java name */
    private static final long[] m1026copyOfr7IrZao(long[] copyOf, int i10) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, i10);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return z1.k(jArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOf-rL5Bavg, reason: not valid java name */
    private static final short[] m1027copyOfrL5Bavg(short[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return f2.k(sArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOfRange--nroSd4, reason: not valid java name */
    private static final long[] m1028copyOfRangenroSd4(long[] copyOfRange, int i10, int i11) {
        long[] jArrCopyOfRange;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        int i12 = 3 >> 1;
        if (m.a(1, 3, 0)) {
            jArrCopyOfRange = ArraysKt.copyOfRange(copyOfRange, i10, i11);
        } else {
            if (i11 > copyOfRange.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + copyOfRange.length);
            }
            jArrCopyOfRange = Arrays.copyOfRange(copyOfRange, i10, i11);
            Intrinsics.checkNotNull(jArrCopyOfRange);
        }
        return z1.k(jArrCopyOfRange);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOfRange-4UcCI2c, reason: not valid java name */
    private static final byte[] m1029copyOfRange4UcCI2c(byte[] copyOfRange, int i10, int i11) {
        byte[] bArrCopyOfRange;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        int i12 = 7 & 0;
        if (m.a(1, 3, 0)) {
            bArrCopyOfRange = ArraysKt.copyOfRange(copyOfRange, i10, i11);
        } else {
            if (i11 > copyOfRange.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + copyOfRange.length);
            }
            bArrCopyOfRange = Arrays.copyOfRange(copyOfRange, i10, i11);
            Intrinsics.checkNotNull(bArrCopyOfRange);
        }
        return r1.k(bArrCopyOfRange);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOfRange-Aa5vz7o, reason: not valid java name */
    private static final short[] m1030copyOfRangeAa5vz7o(short[] copyOfRange, int i10, int i11) {
        short[] sArrCopyOfRange;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        if (m.a(1, 3, 0)) {
            sArrCopyOfRange = ArraysKt.copyOfRange(copyOfRange, i10, i11);
        } else {
            if (i11 > copyOfRange.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + copyOfRange.length);
            }
            sArrCopyOfRange = Arrays.copyOfRange(copyOfRange, i10, i11);
            Intrinsics.checkNotNull(sArrCopyOfRange);
        }
        return f2.k(sArrCopyOfRange);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: copyOfRange-oBK06Vg, reason: not valid java name */
    private static final int[] m1031copyOfRangeoBK06Vg(int[] copyOfRange, int i10, int i11) {
        int[] iArrCopyOfRange;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        if (m.a(1, 3, 0)) {
            iArrCopyOfRange = ArraysKt.copyOfRange(copyOfRange, i10, i11);
        } else {
            if (i11 > copyOfRange.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + copyOfRange.length);
            }
            iArrCopyOfRange = Arrays.copyOfRange(copyOfRange, i10, i11);
            Intrinsics.checkNotNull(iArrCopyOfRange);
        }
        return v1.k(iArrCopyOfRange);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: count-JOV_ifY, reason: not valid java name */
    private static final int m1032countJOV_ifY(byte[] count, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(count);
        int i10 = 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(q1.c(r1.t(count, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: count-MShoTSo, reason: not valid java name */
    private static final int m1033countMShoTSo(long[] count, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(count);
        int i10 = 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(y1.c(z1.t(count, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: count-jgv0xPQ, reason: not valid java name */
    private static final int m1034countjgv0xPQ(int[] count, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(count);
        int i10 = 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(u1.c(v1.t(count, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: count-xTcfx_M, reason: not valid java name */
    private static final int m1035countxTcfx_M(short[] count, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(count);
        int i10 = 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(e2.c(f2.t(count, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<q1> m1036dropPpDY95g(@NotNull byte[] drop, int i10) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m1564takeLastPpDY95g(drop, r.u(r1.v(drop) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<e2> m1037dropnggk6HY(@NotNull short[] drop, int i10) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m1565takeLastnggk6HY(drop, r.u(f2.v(drop) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<u1> m1038dropqFRl0hI(@NotNull int[] drop, int i10) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m1566takeLastqFRl0hI(drop, r.u(v1.v(drop) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<y1> m1039dropr7IrZao(@NotNull long[] drop, int i10) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m1567takeLastr7IrZao(drop, r.u(z1.v(drop) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<q1> m1040dropLastPpDY95g(@NotNull byte[] dropLast, int i10) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m1560takePpDY95g(dropLast, r.u(r1.v(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<e2> m1041dropLastnggk6HY(@NotNull short[] dropLast, int i10) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m1561takenggk6HY(dropLast, r.u(f2.v(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<u1> m1042dropLastqFRl0hI(@NotNull int[] dropLast, int i10) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m1562takeqFRl0hI(dropLast, r.u(v1.v(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<y1> m1043dropLastr7IrZao(@NotNull long[] dropLast, int i10) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m1563taker7IrZao(dropLast, r.u(z1.v(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: dropLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<q1> m1044dropLastWhileJOV_ifY(byte[] dropLastWhile, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(q1.c(r1.t(dropLastWhile, lastIndex))).booleanValue()) {
                return m1560takePpDY95g(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: dropLastWhile-MShoTSo, reason: not valid java name */
    private static final List<y1> m1045dropLastWhileMShoTSo(long[] dropLastWhile, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(y1.c(z1.t(dropLastWhile, lastIndex))).booleanValue()) {
                return m1563taker7IrZao(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: dropLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<u1> m1046dropLastWhilejgv0xPQ(int[] dropLastWhile, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(u1.c(v1.t(dropLastWhile, lastIndex))).booleanValue()) {
                return m1562takeqFRl0hI(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: dropLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<e2> m1047dropLastWhilexTcfx_M(short[] dropLastWhile, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(e2.c(f2.t(dropLastWhile, lastIndex))).booleanValue()) {
                return m1561takenggk6HY(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: dropWhile-JOV_ifY, reason: not valid java name */
    private static final List<q1> m1048dropWhileJOV_ifY(byte[] dropWhile, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = r1.v(dropWhile);
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(dropWhile, i10);
            if (z10) {
                arrayList.add(q1.c(bT));
            } else if (!predicate.invoke(q1.c(bT)).booleanValue()) {
                arrayList.add(q1.c(bT));
                z10 = true;
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: dropWhile-MShoTSo, reason: not valid java name */
    private static final List<y1> m1049dropWhileMShoTSo(long[] dropWhile, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = z1.v(dropWhile);
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(dropWhile, i10);
            if (z10) {
                arrayList.add(y1.c(jT));
            } else if (!predicate.invoke(y1.c(jT)).booleanValue()) {
                arrayList.add(y1.c(jT));
                z10 = true;
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: dropWhile-jgv0xPQ, reason: not valid java name */
    private static final List<u1> m1050dropWhilejgv0xPQ(int[] dropWhile, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = v1.v(dropWhile);
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(dropWhile, i10);
            if (z10) {
                arrayList.add(u1.c(iT));
            } else if (!predicate.invoke(u1.c(iT)).booleanValue()) {
                arrayList.add(u1.c(iT));
                z10 = true;
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: dropWhile-xTcfx_M, reason: not valid java name */
    private static final List<e2> m1051dropWhilexTcfx_M(short[] dropWhile, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = f2.v(dropWhile);
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(dropWhile, i10);
            if (z10) {
                arrayList.add(e2.c(sT));
            } else if (!predicate.invoke(e2.c(sT)).booleanValue()) {
                arrayList.add(e2.c(sT));
                z10 = true;
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAtOrElse-CVVdw08, reason: not valid java name */
    private static final short m1052elementAtOrElseCVVdw08(short[] elementAtOrElse, int i10, Function1<? super Integer, e2> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= f2.v(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).x0() : f2.t(elementAtOrElse, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAtOrElse-QxvSvLU, reason: not valid java name */
    private static final int m1053elementAtOrElseQxvSvLU(int[] elementAtOrElse, int i10, Function1<? super Integer, u1> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= v1.v(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).z0() : v1.t(elementAtOrElse, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAtOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m1054elementAtOrElseXw8i6dc(long[] elementAtOrElse, int i10, Function1<? super Integer, y1> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= z1.v(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).z0() : z1.t(elementAtOrElse, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAtOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m1055elementAtOrElsecOVybQ(byte[] elementAtOrElse, int i10, Function1<? super Integer, q1> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= r1.v(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).x0() : r1.t(elementAtOrElse, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAtOrNull-PpDY95g, reason: not valid java name */
    private static final q1 m1056elementAtOrNullPpDY95g(byte[] elementAtOrNull, int i10) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m1176getOrNullPpDY95g(elementAtOrNull, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAtOrNull-nggk6HY, reason: not valid java name */
    private static final e2 m1057elementAtOrNullnggk6HY(short[] elementAtOrNull, int i10) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m1177getOrNullnggk6HY(elementAtOrNull, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAtOrNull-qFRl0hI, reason: not valid java name */
    private static final u1 m1058elementAtOrNullqFRl0hI(int[] elementAtOrNull, int i10) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m1178getOrNullqFRl0hI(elementAtOrNull, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAtOrNull-r7IrZao, reason: not valid java name */
    private static final y1 m1059elementAtOrNullr7IrZao(long[] elementAtOrNull, int i10) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m1179getOrNullr7IrZao(elementAtOrNull, i10);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m1060fill2fe2U9s(@NotNull int[] fill, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, i10, i11, i12);
    }

    /* JADX INFO: renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m1061fill2fe2U9s$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = v1.v(iArr);
        }
        m1060fill2fe2U9s(iArr, i10, i11, i12);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m1062fillEtDCXyQ(@NotNull short[] fill, short s10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, s10, i10, i11);
    }

    /* JADX INFO: renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m1063fillEtDCXyQ$default(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = f2.v(sArr);
        }
        m1062fillEtDCXyQ(sArr, s10, i10, i11);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m1064fillK6DWlUc(@NotNull long[] fill, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, j10, i10, i11);
    }

    /* JADX INFO: renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m1065fillK6DWlUc$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = z1.v(jArr);
        }
        m1064fillK6DWlUc(jArr, j10, i10, i11);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m1066fillWpHrYlw(@NotNull byte[] fill, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, b10, i10, i11);
    }

    /* JADX INFO: renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m1067fillWpHrYlw$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = r1.v(bArr);
        }
        m1066fillWpHrYlw(bArr, b10, i10, i11);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filter-JOV_ifY, reason: not valid java name */
    private static final List<q1> m1068filterJOV_ifY(byte[] filter, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = r1.v(filter);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(filter, i10);
            if (predicate.invoke(q1.c(bT)).booleanValue()) {
                arrayList.add(q1.c(bT));
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filter-MShoTSo, reason: not valid java name */
    private static final List<y1> m1069filterMShoTSo(long[] filter, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = z1.v(filter);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(filter, i10);
            if (predicate.invoke(y1.c(jT)).booleanValue()) {
                arrayList.add(y1.c(jT));
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filter-jgv0xPQ, reason: not valid java name */
    private static final List<u1> m1070filterjgv0xPQ(int[] filter, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = v1.v(filter);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(filter, i10);
            if (predicate.invoke(u1.c(iT)).booleanValue()) {
                arrayList.add(u1.c(iT));
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filter-xTcfx_M, reason: not valid java name */
    private static final List<e2> m1071filterxTcfx_M(short[] filter, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = f2.v(filter);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(filter, i10);
            if (predicate.invoke(e2.c(sT)).booleanValue()) {
                arrayList.add(e2.c(sT));
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterIndexed-ELGow60, reason: not valid java name */
    private static final List<q1> m1072filterIndexedELGow60(byte[] filterIndexed, Function2<? super Integer, ? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = r1.v(filterIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            byte bT = r1.t(filterIndexed, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), q1.c(bT)).booleanValue()) {
                arrayList.add(q1.c(bT));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterIndexed-WyvcNBI, reason: not valid java name */
    private static final List<u1> m1073filterIndexedWyvcNBI(int[] filterIndexed, Function2<? super Integer, ? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = v1.v(filterIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            int iT = v1.t(filterIndexed, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), u1.c(iT)).booleanValue()) {
                arrayList.add(u1.c(iT));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterIndexed-s8dVfGU, reason: not valid java name */
    private static final List<y1> m1074filterIndexeds8dVfGU(long[] filterIndexed, Function2<? super Integer, ? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = z1.v(filterIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            long jT = z1.t(filterIndexed, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), y1.c(jT)).booleanValue()) {
                arrayList.add(y1.c(jT));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterIndexed-xzaTVY8, reason: not valid java name */
    private static final List<e2> m1075filterIndexedxzaTVY8(short[] filterIndexed, Function2<? super Integer, ? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = f2.v(filterIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            short sT = f2.t(filterIndexed, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), e2.c(sT)).booleanValue()) {
                arrayList.add(e2.c(sT));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterIndexedTo--6EtJGI, reason: not valid java name */
    private static final <C extends Collection<? super u1>> C m1076filterIndexedTo6EtJGI(int[] filterIndexedTo, C destination, Function2<? super Integer, ? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(filterIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            int iT = v1.t(filterIndexedTo, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), u1.c(iT)).booleanValue()) {
                destination.add(u1.c(iT));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <C extends Collection<? super e2>> C m1077filterIndexedToQqktQ3k(short[] filterIndexedTo, C destination, Function2<? super Integer, ? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(filterIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            short sT = f2.t(filterIndexedTo, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), e2.c(sT)).booleanValue()) {
                destination.add(e2.c(sT));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <C extends Collection<? super q1>> C m1078filterIndexedToeNpIKz8(byte[] filterIndexedTo, C destination, Function2<? super Integer, ? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(filterIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            byte bT = r1.t(filterIndexedTo, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), q1.c(bT)).booleanValue()) {
                destination.add(q1.c(bT));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <C extends Collection<? super y1>> C m1079filterIndexedTope2Q0Dw(long[] filterIndexedTo, C destination, Function2<? super Integer, ? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(filterIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            long jT = z1.t(filterIndexedTo, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), y1.c(jT)).booleanValue()) {
                destination.add(y1.c(jT));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterNot-JOV_ifY, reason: not valid java name */
    private static final List<q1> m1080filterNotJOV_ifY(byte[] filterNot, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = r1.v(filterNot);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(filterNot, i10);
            if (!predicate.invoke(q1.c(bT)).booleanValue()) {
                arrayList.add(q1.c(bT));
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterNot-MShoTSo, reason: not valid java name */
    private static final List<y1> m1081filterNotMShoTSo(long[] filterNot, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = z1.v(filterNot);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(filterNot, i10);
            if (!predicate.invoke(y1.c(jT)).booleanValue()) {
                arrayList.add(y1.c(jT));
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterNot-jgv0xPQ, reason: not valid java name */
    private static final List<u1> m1082filterNotjgv0xPQ(int[] filterNot, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = v1.v(filterNot);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(filterNot, i10);
            if (!predicate.invoke(u1.c(iT)).booleanValue()) {
                arrayList.add(u1.c(iT));
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterNot-xTcfx_M, reason: not valid java name */
    private static final List<e2> m1083filterNotxTcfx_M(short[] filterNot, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = f2.v(filterNot);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(filterNot, i10);
            if (!predicate.invoke(e2.c(sT)).booleanValue()) {
                arrayList.add(e2.c(sT));
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterNotTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super y1>> C m1084filterNotToHqK1JgA(long[] filterNotTo, C destination, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(filterNotTo);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(filterNotTo, i10);
            if (!predicate.invoke(y1.c(jT)).booleanValue()) {
                destination.add(y1.c(jT));
            }
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterNotTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super e2>> C m1085filterNotTooEOeDjA(short[] filterNotTo, C destination, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(filterNotTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(filterNotTo, i10);
            if (!predicate.invoke(e2.c(sT)).booleanValue()) {
                destination.add(e2.c(sT));
            }
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterNotTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super u1>> C m1086filterNotTowU5IKMo(int[] filterNotTo, C destination, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(filterNotTo);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(filterNotTo, i10);
            if (!predicate.invoke(u1.c(iT)).booleanValue()) {
                destination.add(u1.c(iT));
            }
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterNotTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super q1>> C m1087filterNotTowzUQCXU(byte[] filterNotTo, C destination, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(filterNotTo);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(filterNotTo, i10);
            if (!predicate.invoke(q1.c(bT)).booleanValue()) {
                destination.add(q1.c(bT));
            }
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super y1>> C m1088filterToHqK1JgA(long[] filterTo, C destination, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(filterTo);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(filterTo, i10);
            if (predicate.invoke(y1.c(jT)).booleanValue()) {
                destination.add(y1.c(jT));
            }
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super e2>> C m1089filterTooEOeDjA(short[] filterTo, C destination, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(filterTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(filterTo, i10);
            if (predicate.invoke(e2.c(sT)).booleanValue()) {
                destination.add(e2.c(sT));
            }
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super u1>> C m1090filterTowU5IKMo(int[] filterTo, C destination, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(filterTo);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(filterTo, i10);
            if (predicate.invoke(u1.c(iT)).booleanValue()) {
                destination.add(u1.c(iT));
            }
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: filterTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super q1>> C m1091filterTowzUQCXU(byte[] filterTo, C destination, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(filterTo);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(filterTo, i10);
            if (predicate.invoke(q1.c(bT)).booleanValue()) {
                destination.add(q1.c(bT));
            }
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: find-JOV_ifY, reason: not valid java name */
    private static final q1 m1092findJOV_ifY(byte[] find, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(find);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(find, i10);
            if (predicate.invoke(q1.c(bT)).booleanValue()) {
                return q1.c(bT);
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: find-MShoTSo, reason: not valid java name */
    private static final y1 m1093findMShoTSo(long[] find, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(find);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(find, i10);
            if (predicate.invoke(y1.c(jT)).booleanValue()) {
                return y1.c(jT);
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: find-jgv0xPQ, reason: not valid java name */
    private static final u1 m1094findjgv0xPQ(int[] find, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(find);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(find, i10);
            if (predicate.invoke(u1.c(iT)).booleanValue()) {
                return u1.c(iT);
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: find-xTcfx_M, reason: not valid java name */
    private static final e2 m1095findxTcfx_M(short[] find, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(find);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(find, i10);
            if (predicate.invoke(e2.c(sT)).booleanValue()) {
                return e2.c(sT);
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: findLast-JOV_ifY, reason: not valid java name */
    private static final q1 m1096findLastJOV_ifY(byte[] findLast, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(findLast) - 1;
        if (iV < 0) {
            return null;
        }
        while (true) {
            int i10 = iV - 1;
            byte bT = r1.t(findLast, iV);
            if (predicate.invoke(q1.c(bT)).booleanValue()) {
                return q1.c(bT);
            }
            if (i10 < 0) {
                return null;
            }
            iV = i10;
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: findLast-MShoTSo, reason: not valid java name */
    private static final y1 m1097findLastMShoTSo(long[] findLast, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(findLast) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                long jT = z1.t(findLast, iV);
                if (predicate.invoke(y1.c(jT)).booleanValue()) {
                    return y1.c(jT);
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: findLast-jgv0xPQ, reason: not valid java name */
    private static final u1 m1098findLastjgv0xPQ(int[] findLast, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(findLast) - 1;
        if (iV < 0) {
            return null;
        }
        while (true) {
            int i10 = iV - 1;
            int iT = v1.t(findLast, iV);
            if (predicate.invoke(u1.c(iT)).booleanValue()) {
                return u1.c(iT);
            }
            if (i10 < 0) {
                return null;
            }
            iV = i10;
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: findLast-xTcfx_M, reason: not valid java name */
    private static final e2 m1099findLastxTcfx_M(short[] findLast, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(findLast) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                short sT = f2.t(findLast, iV);
                if (predicate.invoke(e2.c(sT)).booleanValue()) {
                    return e2.c(sT);
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: first--ajY-9A, reason: not valid java name */
    private static final int m1100firstajY9A(int[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return u1.n(ArraysKt.first(first));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: first-GBYM_sE, reason: not valid java name */
    private static final byte m1101firstGBYM_sE(byte[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return q1.n(ArraysKt.first(first));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: first-JOV_ifY, reason: not valid java name */
    private static final byte m1102firstJOV_ifY(byte[] first, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(first);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(first, i10);
            if (predicate.invoke(q1.c(bT)).booleanValue()) {
                return bT;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: first-MShoTSo, reason: not valid java name */
    private static final long m1103firstMShoTSo(long[] first, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(first);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(first, i10);
            if (predicate.invoke(y1.c(jT)).booleanValue()) {
                return jT;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: first-QwZRm1k, reason: not valid java name */
    private static final long m1104firstQwZRm1k(long[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return y1.n(ArraysKt.first(first));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: first-jgv0xPQ, reason: not valid java name */
    private static final int m1105firstjgv0xPQ(int[] first, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(first);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(first, i10);
            if (predicate.invoke(u1.c(iT)).booleanValue()) {
                return iT;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: first-rL5Bavg, reason: not valid java name */
    private static final short m1106firstrL5Bavg(short[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return e2.n(ArraysKt.first(first));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: first-xTcfx_M, reason: not valid java name */
    private static final short m1107firstxTcfx_M(short[] first, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(first);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(first, i10);
            if (predicate.invoke(e2.c(sT)).booleanValue()) {
                return sT;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final u1 m1108firstOrNullajY9A(@NotNull int[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (v1.B(firstOrNull)) {
            return null;
        }
        return u1.c(v1.t(firstOrNull, 0));
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final q1 m1109firstOrNullGBYM_sE(@NotNull byte[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (r1.B(firstOrNull)) {
            return null;
        }
        return q1.c(r1.t(firstOrNull, 0));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: firstOrNull-JOV_ifY, reason: not valid java name */
    private static final q1 m1110firstOrNullJOV_ifY(byte[] firstOrNull, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(firstOrNull);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(firstOrNull, i10);
            if (predicate.invoke(q1.c(bT)).booleanValue()) {
                return q1.c(bT);
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: firstOrNull-MShoTSo, reason: not valid java name */
    private static final y1 m1111firstOrNullMShoTSo(long[] firstOrNull, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(firstOrNull);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(firstOrNull, i10);
            if (predicate.invoke(y1.c(jT)).booleanValue()) {
                return y1.c(jT);
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final y1 m1112firstOrNullQwZRm1k(@NotNull long[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (z1.B(firstOrNull)) {
            return null;
        }
        return y1.c(z1.t(firstOrNull, 0));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: firstOrNull-jgv0xPQ, reason: not valid java name */
    private static final u1 m1113firstOrNulljgv0xPQ(int[] firstOrNull, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(firstOrNull);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(firstOrNull, i10);
            if (predicate.invoke(u1.c(iT)).booleanValue()) {
                return u1.c(iT);
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final e2 m1114firstOrNullrL5Bavg(@NotNull short[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (f2.B(firstOrNull)) {
            return null;
        }
        return e2.c(f2.t(firstOrNull, 0));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: firstOrNull-xTcfx_M, reason: not valid java name */
    private static final e2 m1115firstOrNullxTcfx_M(short[] firstOrNull, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(firstOrNull);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(firstOrNull, i10);
            if (predicate.invoke(e2.c(sT)).booleanValue()) {
                return e2.c(sT);
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: flatMap-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m1116flatMapJOV_ifY(byte[] flatMap, Function1<? super q1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = r1.v(flatMap);
        for (int i10 = 0; i10 < iV; i10++) {
            CollectionsKt.addAll(arrayList, transform.invoke(q1.c(r1.t(flatMap, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: flatMap-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m1117flatMapMShoTSo(long[] flatMap, Function1<? super y1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = z1.v(flatMap);
        for (int i10 = 0; i10 < iV; i10++) {
            CollectionsKt.addAll(arrayList, transform.invoke(y1.c(z1.t(flatMap, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: flatMap-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m1118flatMapjgv0xPQ(int[] flatMap, Function1<? super u1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = v1.v(flatMap);
        for (int i10 = 0; i10 < iV; i10++) {
            CollectionsKt.addAll(arrayList, transform.invoke(u1.c(v1.t(flatMap, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: flatMap-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m1119flatMapxTcfx_M(short[] flatMap, Function1<? super e2, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = f2.v(flatMap);
        for (int i10 = 0; i10 < iV; i10++) {
            CollectionsKt.addAll(arrayList, transform.invoke(e2.c(f2.t(flatMap, i10))));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: flatMapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m1120flatMapIndexedELGow60(byte[] flatMapIndexed, Function2<? super Integer, ? super q1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = r1.v(flatMapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), q1.c(r1.t(flatMapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: flatMapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m1121flatMapIndexedWyvcNBI(int[] flatMapIndexed, Function2<? super Integer, ? super u1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = v1.v(flatMapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), u1.c(v1.t(flatMapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: flatMapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m1122flatMapIndexeds8dVfGU(long[] flatMapIndexed, Function2<? super Integer, ? super y1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = z1.v(flatMapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), y1.c(z1.t(flatMapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: flatMapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m1123flatMapIndexedxzaTVY8(short[] flatMapIndexed, Function2<? super Integer, ? super e2, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = f2.v(flatMapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), e2.c(f2.t(flatMapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: flatMapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1124flatMapIndexedTo6EtJGI(int[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super u1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = v1.v(flatMapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), u1.c(v1.t(flatMapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: flatMapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1125flatMapIndexedToQqktQ3k(short[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super e2, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = f2.v(flatMapIndexedTo);
        int i10 = 0;
        int i11 = 4 & 0;
        int i12 = 0;
        while (i10 < iV) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i12), e2.c(f2.t(flatMapIndexedTo, i10))));
            i10++;
            i12++;
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: flatMapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1126flatMapIndexedToeNpIKz8(byte[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super q1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = r1.v(flatMapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), q1.c(r1.t(flatMapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: flatMapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1127flatMapIndexedTope2Q0Dw(long[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super y1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = z1.v(flatMapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), y1.c(z1.t(flatMapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: flatMapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1128flatMapToHqK1JgA(long[] flatMapTo, C destination, Function1<? super y1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = z1.v(flatMapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            CollectionsKt.addAll(destination, transform.invoke(y1.c(z1.t(flatMapTo, i10))));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: flatMapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1129flatMapTooEOeDjA(short[] flatMapTo, C destination, Function1<? super e2, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = f2.v(flatMapTo);
        int i10 = 3 >> 0;
        for (int i11 = 0; i11 < iV; i11++) {
            CollectionsKt.addAll(destination, transform.invoke(e2.c(f2.t(flatMapTo, i11))));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: flatMapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1130flatMapTowU5IKMo(int[] flatMapTo, C destination, Function1<? super u1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = v1.v(flatMapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            CollectionsKt.addAll(destination, transform.invoke(u1.c(v1.t(flatMapTo, i10))));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: flatMapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1131flatMapTowzUQCXU(byte[] flatMapTo, C destination, Function1<? super q1, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = r1.v(flatMapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            CollectionsKt.addAll(destination, transform.invoke(q1.c(r1.t(flatMapTo, i10))));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: fold-A8wKCXQ, reason: not valid java name */
    private static final <R> R m1132foldA8wKCXQ(long[] fold, R r10, Function2<? super R, ? super y1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iV = z1.v(fold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, y1.c(z1.t(fold, i10)));
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: fold-yXmHNn8, reason: not valid java name */
    private static final <R> R m1133foldyXmHNn8(byte[] fold, R r10, Function2<? super R, ? super q1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iV = r1.v(fold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, q1.c(r1.t(fold, i10)));
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: fold-zi1B2BA, reason: not valid java name */
    private static final <R> R m1134foldzi1B2BA(int[] fold, R r10, Function2<? super R, ? super u1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iV = v1.v(fold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, u1.c(v1.t(fold, i10)));
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: fold-zww5nb8, reason: not valid java name */
    private static final <R> R m1135foldzww5nb8(short[] fold, R r10, Function2<? super R, ? super e2, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iV = f2.v(fold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, e2.c(f2.t(fold, i10)));
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m1136foldIndexed3iWJZGE(byte[] foldIndexed, R r10, n<? super Integer, ? super R, ? super q1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iV = r1.v(foldIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, q1.c(r1.t(foldIndexed, i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m1137foldIndexedbzxtMww(short[] foldIndexed, R r10, n<? super Integer, ? super R, ? super e2, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iV = f2.v(foldIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, e2.c(f2.t(foldIndexed, i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m1138foldIndexedmwnnOCs(long[] foldIndexed, R r10, n<? super Integer, ? super R, ? super y1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iV = z1.v(foldIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, y1.c(z1.t(foldIndexed, i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m1139foldIndexedyVwIW0Q(int[] foldIndexed, R r10, n<? super Integer, ? super R, ? super u1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iV = v1.v(foldIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, u1.c(v1.t(foldIndexed, i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldRight-A8wKCXQ, reason: not valid java name */
    private static final <R> R m1140foldRightA8wKCXQ(long[] foldRight, R r10, Function2<? super y1, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(y1.c(z1.t(foldRight, lastIndex)), r10);
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldRight-yXmHNn8, reason: not valid java name */
    private static final <R> R m1141foldRightyXmHNn8(byte[] foldRight, R r10, Function2<? super q1, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(q1.c(r1.t(foldRight, lastIndex)), r10);
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldRight-zi1B2BA, reason: not valid java name */
    private static final <R> R m1142foldRightzi1B2BA(int[] foldRight, R r10, Function2<? super u1, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(u1.c(v1.t(foldRight, lastIndex)), r10);
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldRight-zww5nb8, reason: not valid java name */
    private static final <R> R m1143foldRightzww5nb8(short[] foldRight, R r10, Function2<? super e2, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(e2.c(f2.t(foldRight, lastIndex)), r10);
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldRightIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m1144foldRightIndexed3iWJZGE(byte[] foldRightIndexed, R r10, n<? super Integer, ? super q1, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), q1.c(r1.t(foldRightIndexed, lastIndex)), r10);
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldRightIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m1145foldRightIndexedbzxtMww(short[] foldRightIndexed, R r10, n<? super Integer, ? super e2, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), e2.c(f2.t(foldRightIndexed, lastIndex)), r10);
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldRightIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m1146foldRightIndexedmwnnOCs(long[] foldRightIndexed, R r10, n<? super Integer, ? super y1, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), y1.c(z1.t(foldRightIndexed, lastIndex)), r10);
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: foldRightIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m1147foldRightIndexedyVwIW0Q(int[] foldRightIndexed, R r10, n<? super Integer, ? super u1, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), u1.c(v1.t(foldRightIndexed, lastIndex)), r10);
        }
        return r10;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: forEach-JOV_ifY, reason: not valid java name */
    private static final void m1148forEachJOV_ifY(byte[] forEach, Function1<? super q1, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = r1.v(forEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(q1.c(r1.t(forEach, i10)));
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: forEach-MShoTSo, reason: not valid java name */
    private static final void m1149forEachMShoTSo(long[] forEach, Function1<? super y1, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = z1.v(forEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(y1.c(z1.t(forEach, i10)));
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: forEach-jgv0xPQ, reason: not valid java name */
    private static final void m1150forEachjgv0xPQ(int[] forEach, Function1<? super u1, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = v1.v(forEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(u1.c(v1.t(forEach, i10)));
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: forEach-xTcfx_M, reason: not valid java name */
    private static final void m1151forEachxTcfx_M(short[] forEach, Function1<? super e2, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = f2.v(forEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(e2.c(f2.t(forEach, i10)));
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: forEachIndexed-ELGow60, reason: not valid java name */
    private static final void m1152forEachIndexedELGow60(byte[] forEachIndexed, Function2<? super Integer, ? super q1, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = r1.v(forEachIndexed);
        int i10 = 0;
        int i11 = 1 << 0;
        int i12 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i12), q1.c(r1.t(forEachIndexed, i10)));
            i10++;
            i12++;
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: forEachIndexed-WyvcNBI, reason: not valid java name */
    private static final void m1153forEachIndexedWyvcNBI(int[] forEachIndexed, Function2<? super Integer, ? super u1, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = v1.v(forEachIndexed);
        int i10 = 0;
        int i11 = 3 ^ 0;
        int i12 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i12), u1.c(v1.t(forEachIndexed, i10)));
            i10++;
            i12++;
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: forEachIndexed-s8dVfGU, reason: not valid java name */
    private static final void m1154forEachIndexeds8dVfGU(long[] forEachIndexed, Function2<? super Integer, ? super y1, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = z1.v(forEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), y1.c(z1.t(forEachIndexed, i10)));
            i10++;
            i11++;
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: forEachIndexed-xzaTVY8, reason: not valid java name */
    private static final void m1155forEachIndexedxzaTVY8(short[] forEachIndexed, Function2<? super Integer, ? super e2, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = f2.v(forEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), e2.c(f2.t(forEachIndexed, i10)));
            i10++;
            i11++;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final IntRange m1156getIndicesajY9A(@NotNull int[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m1157getIndicesajY9A$annotations(int[] iArr) {
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final IntRange m1158getIndicesGBYM_sE(@NotNull byte[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m1159getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final IntRange m1160getIndicesQwZRm1k(@NotNull long[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m1161getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final IntRange m1162getIndicesrL5Bavg(@NotNull short[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m1163getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* JADX INFO: renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m1164getLastIndexajY9A(@NotNull int[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m1165getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m1166getLastIndexGBYM_sE(@NotNull byte[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m1167getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m1168getLastIndexQwZRm1k(@NotNull long[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m1169getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m1170getLastIndexrL5Bavg(@NotNull short[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m1171getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: getOrElse-CVVdw08, reason: not valid java name */
    private static final short m1172getOrElseCVVdw08(short[] getOrElse, int i10, Function1<? super Integer, e2> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= f2.v(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).x0() : f2.t(getOrElse, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: getOrElse-QxvSvLU, reason: not valid java name */
    private static final int m1173getOrElseQxvSvLU(int[] getOrElse, int i10, Function1<? super Integer, u1> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= v1.v(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).z0() : v1.t(getOrElse, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: getOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m1174getOrElseXw8i6dc(long[] getOrElse, int i10, Function1<? super Integer, y1> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= z1.v(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).z0() : z1.t(getOrElse, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: getOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m1175getOrElsecOVybQ(byte[] getOrElse, int i10, Function1<? super Integer, q1> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= r1.v(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).x0() : r1.t(getOrElse, i10);
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final q1 m1176getOrNullPpDY95g(@NotNull byte[] getOrNull, int i10) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 >= r1.v(getOrNull)) {
            return null;
        }
        return q1.c(r1.t(getOrNull, i10));
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final e2 m1177getOrNullnggk6HY(@NotNull short[] getOrNull, int i10) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 >= f2.v(getOrNull)) {
            return null;
        }
        return e2.c(f2.t(getOrNull, i10));
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final u1 m1178getOrNullqFRl0hI(@NotNull int[] getOrNull, int i10) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 >= v1.v(getOrNull)) {
            return null;
        }
        return u1.c(v1.t(getOrNull, i10));
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final y1 m1179getOrNullr7IrZao(@NotNull long[] getOrNull, int i10) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 >= z1.v(getOrNull)) {
            return null;
        }
        return y1.c(z1.t(getOrNull, i10));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupBy--_j2Y-Q, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1180groupBy_j2YQ(long[] groupBy, Function1<? super y1, ? extends K> keySelector, Function1<? super y1, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = z1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(groupBy, i10);
            K kInvoke = keySelector.invoke(y1.c(jT));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(y1.c(jT)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupBy-3bBvP4M, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1181groupBy3bBvP4M(short[] groupBy, Function1<? super e2, ? extends K> keySelector, Function1<? super e2, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = f2.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(groupBy, i10);
            K kInvoke = keySelector.invoke(e2.c(sT));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(e2.c(sT)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupBy-JOV_ifY, reason: not valid java name */
    private static final <K> Map<K, List<q1>> m1182groupByJOV_ifY(byte[] groupBy, Function1<? super q1, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = r1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(groupBy, i10);
            K kInvoke = keySelector.invoke(q1.c(bT));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(q1.c(bT));
        }
        return linkedHashMap;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupBy-L4rlFek, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1183groupByL4rlFek(int[] groupBy, Function1<? super u1, ? extends K> keySelector, Function1<? super u1, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = v1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(groupBy, i10);
            K kInvoke = keySelector.invoke(u1.c(iT));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(u1.c(iT)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupBy-MShoTSo, reason: not valid java name */
    private static final <K> Map<K, List<y1>> m1184groupByMShoTSo(long[] groupBy, Function1<? super y1, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = z1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(groupBy, i10);
            K kInvoke = keySelector.invoke(y1.c(jT));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(y1.c(jT));
        }
        return linkedHashMap;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupBy-bBsjw1Y, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1185groupBybBsjw1Y(byte[] groupBy, Function1<? super q1, ? extends K> keySelector, Function1<? super q1, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = r1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(groupBy, i10);
            K kInvoke = keySelector.invoke(q1.c(bT));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(q1.c(bT)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupBy-jgv0xPQ, reason: not valid java name */
    private static final <K> Map<K, List<u1>> m1186groupByjgv0xPQ(int[] groupBy, Function1<? super u1, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = v1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(groupBy, i10);
            K kInvoke = keySelector.invoke(u1.c(iT));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(u1.c(iT));
        }
        return linkedHashMap;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupBy-xTcfx_M, reason: not valid java name */
    private static final <K> Map<K, List<e2>> m1187groupByxTcfx_M(short[] groupBy, Function1<? super e2, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = f2.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(groupBy, i10);
            K kInvoke = keySelector.invoke(e2.c(sT));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(e2.c(sT));
        }
        return linkedHashMap;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupByTo-4D70W2E, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<u1>>> M m1188groupByTo4D70W2E(int[] groupByTo, M destination, Function1<? super u1, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iV = v1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(groupByTo, i10);
            K kInvoke = keySelector.invoke(u1.c(iT));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(u1.c(iT));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupByTo-H21X9dk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<q1>>> M m1189groupByToH21X9dk(byte[] groupByTo, M destination, Function1<? super q1, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iV = r1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(groupByTo, i10);
            K kInvoke = keySelector.invoke(q1.c(bT));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(q1.c(bT));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupByTo-JM6gNCM, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1190groupByToJM6gNCM(int[] groupByTo, M destination, Function1<? super u1, ? extends K> keySelector, Function1<? super u1, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iV = v1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(groupByTo, i10);
            K kInvoke = keySelector.invoke(u1.c(iT));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(u1.c(iT)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupByTo-QxgOkWg, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1191groupByToQxgOkWg(long[] groupByTo, M destination, Function1<? super y1, ? extends K> keySelector, Function1<? super y1, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iV = z1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(groupByTo, i10);
            K kInvoke = keySelector.invoke(y1.c(jT));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(y1.c(jT)));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupByTo-X6OPwNk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<y1>>> M m1192groupByToX6OPwNk(long[] groupByTo, M destination, Function1<? super y1, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iV = z1.v(groupByTo);
        int i10 = 4 ^ 0;
        for (int i11 = 0; i11 < iV; i11++) {
            long jT = z1.t(groupByTo, i11);
            K kInvoke = keySelector.invoke(y1.c(jT));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(y1.c(jT));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupByTo-ciTST-8, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<e2>>> M m1193groupByTociTST8(short[] groupByTo, M destination, Function1<? super e2, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iV = f2.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(groupByTo, i10);
            K kInvoke = keySelector.invoke(e2.c(sT));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(e2.c(sT));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupByTo-q8RuPII, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1194groupByToq8RuPII(short[] groupByTo, M destination, Function1<? super e2, ? extends K> keySelector, Function1<? super e2, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iV = f2.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(groupByTo, i10);
            K kInvoke = keySelector.invoke(e2.c(sT));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(e2.c(sT)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: groupByTo-qOZmbk8, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1195groupByToqOZmbk8(byte[] groupByTo, M destination, Function1<? super q1, ? extends K> keySelector, Function1<? super q1, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iV = r1.v(groupByTo);
        int i10 = 3 & 0;
        for (int i11 = 0; i11 < iV; i11++) {
            byte bT = r1.t(groupByTo, i11);
            K kInvoke = keySelector.invoke(q1.c(bT));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(q1.c(bT)));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOf-3uqUaXg, reason: not valid java name */
    private static final int m1196indexOf3uqUaXg(long[] indexOf, long j10) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, j10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOf-XzdR7RA, reason: not valid java name */
    private static final int m1197indexOfXzdR7RA(short[] indexOf, short s10) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, s10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOf-gMuBH34, reason: not valid java name */
    private static final int m1198indexOfgMuBH34(byte[] indexOf, byte b10) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, b10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOf-uWY9BYg, reason: not valid java name */
    private static final int m1199indexOfuWY9BYg(int[] indexOf, int i10) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOfFirst-JOV_ifY, reason: not valid java name */
    private static final int m1200indexOfFirstJOV_ifY(byte[] indexOfFirst, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(q1.c(q1.n(indexOfFirst[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOfFirst-MShoTSo, reason: not valid java name */
    private static final int m1201indexOfFirstMShoTSo(long[] indexOfFirst, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(y1.c(y1.n(indexOfFirst[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOfFirst-jgv0xPQ, reason: not valid java name */
    private static final int m1202indexOfFirstjgv0xPQ(int[] indexOfFirst, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(u1.c(u1.n(indexOfFirst[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOfFirst-xTcfx_M, reason: not valid java name */
    private static final int m1203indexOfFirstxTcfx_M(short[] indexOfFirst, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(e2.c(e2.n(indexOfFirst[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOfLast-JOV_ifY, reason: not valid java name */
    private static final int m1204indexOfLastJOV_ifY(byte[] indexOfLast, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(q1.c(q1.n(indexOfLast[length]))).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOfLast-MShoTSo, reason: not valid java name */
    private static final int m1205indexOfLastMShoTSo(long[] indexOfLast, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(y1.c(y1.n(indexOfLast[length]))).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOfLast-jgv0xPQ, reason: not valid java name */
    private static final int m1206indexOfLastjgv0xPQ(int[] indexOfLast, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(u1.c(u1.n(indexOfLast[length]))).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: indexOfLast-xTcfx_M, reason: not valid java name */
    private static final int m1207indexOfLastxTcfx_M(short[] indexOfLast, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(e2.c(e2.n(indexOfLast[length]))).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: last--ajY-9A, reason: not valid java name */
    private static final int m1208lastajY9A(int[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return u1.n(ArraysKt.last(last));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: last-GBYM_sE, reason: not valid java name */
    private static final byte m1209lastGBYM_sE(byte[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return q1.n(ArraysKt.last(last));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: last-JOV_ifY, reason: not valid java name */
    private static final byte m1210lastJOV_ifY(byte[] last, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(last) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                byte bT = r1.t(last, iV);
                if (predicate.invoke(q1.c(bT)).booleanValue()) {
                    return bT;
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: last-MShoTSo, reason: not valid java name */
    private static final long m1211lastMShoTSo(long[] last, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(last) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                long jT = z1.t(last, iV);
                if (predicate.invoke(y1.c(jT)).booleanValue()) {
                    return jT;
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: last-QwZRm1k, reason: not valid java name */
    private static final long m1212lastQwZRm1k(long[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return y1.n(ArraysKt.last(last));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: last-jgv0xPQ, reason: not valid java name */
    private static final int m1213lastjgv0xPQ(int[] last, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(last) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                int iT = v1.t(last, iV);
                if (predicate.invoke(u1.c(iT)).booleanValue()) {
                    return iT;
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: last-rL5Bavg, reason: not valid java name */
    private static final short m1214lastrL5Bavg(short[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return e2.n(ArraysKt.last(last));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: last-xTcfx_M, reason: not valid java name */
    private static final short m1215lastxTcfx_M(short[] last, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(last) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                short sT = f2.t(last, iV);
                if (predicate.invoke(e2.c(sT)).booleanValue()) {
                    return sT;
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: lastIndexOf-3uqUaXg, reason: not valid java name */
    private static final int m1216lastIndexOf3uqUaXg(long[] lastIndexOf, long j10) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, j10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: lastIndexOf-XzdR7RA, reason: not valid java name */
    private static final int m1217lastIndexOfXzdR7RA(short[] lastIndexOf, short s10) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, s10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: lastIndexOf-gMuBH34, reason: not valid java name */
    private static final int m1218lastIndexOfgMuBH34(byte[] lastIndexOf, byte b10) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, b10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: lastIndexOf-uWY9BYg, reason: not valid java name */
    private static final int m1219lastIndexOfuWY9BYg(int[] lastIndexOf, int i10) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, i10);
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final u1 m1220lastOrNullajY9A(@NotNull int[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (v1.B(lastOrNull)) {
            return null;
        }
        return u1.c(v1.t(lastOrNull, v1.v(lastOrNull) - 1));
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final q1 m1221lastOrNullGBYM_sE(@NotNull byte[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (r1.B(lastOrNull)) {
            return null;
        }
        return q1.c(r1.t(lastOrNull, r1.v(lastOrNull) - 1));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: lastOrNull-JOV_ifY, reason: not valid java name */
    private static final q1 m1222lastOrNullJOV_ifY(byte[] lastOrNull, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(lastOrNull) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                byte bT = r1.t(lastOrNull, iV);
                if (predicate.invoke(q1.c(bT)).booleanValue()) {
                    return q1.c(bT);
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: lastOrNull-MShoTSo, reason: not valid java name */
    private static final y1 m1223lastOrNullMShoTSo(long[] lastOrNull, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(lastOrNull) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                long jT = z1.t(lastOrNull, iV);
                if (predicate.invoke(y1.c(jT)).booleanValue()) {
                    return y1.c(jT);
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        return null;
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final y1 m1224lastOrNullQwZRm1k(@NotNull long[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (z1.B(lastOrNull)) {
            return null;
        }
        return y1.c(z1.t(lastOrNull, z1.v(lastOrNull) - 1));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: lastOrNull-jgv0xPQ, reason: not valid java name */
    private static final u1 m1225lastOrNulljgv0xPQ(int[] lastOrNull, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(lastOrNull) - 1;
        if (iV < 0) {
            return null;
        }
        while (true) {
            int i10 = iV - 1;
            int iT = v1.t(lastOrNull, iV);
            if (predicate.invoke(u1.c(iT)).booleanValue()) {
                return u1.c(iT);
            }
            if (i10 < 0) {
                return null;
            }
            iV = i10;
        }
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final e2 m1226lastOrNullrL5Bavg(@NotNull short[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (!f2.B(lastOrNull)) {
            return e2.c(f2.t(lastOrNull, f2.v(lastOrNull) - 1));
        }
        int i10 = 3 << 0;
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: lastOrNull-xTcfx_M, reason: not valid java name */
    private static final e2 m1227lastOrNullxTcfx_M(short[] lastOrNull, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(lastOrNull) - 1;
        if (iV < 0) {
            return null;
        }
        while (true) {
            int i10 = iV - 1;
            short sT = f2.t(lastOrNull, iV);
            if (predicate.invoke(e2.c(sT)).booleanValue()) {
                return e2.c(sT);
            }
            if (i10 < 0) {
                return null;
            }
            iV = i10;
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: map-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m1228mapJOV_ifY(byte[] map, Function1<? super q1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(r1.v(map));
        int iV = r1.v(map);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(transform.invoke(q1.c(r1.t(map, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: map-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m1229mapMShoTSo(long[] map, Function1<? super y1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(z1.v(map));
        int iV = z1.v(map);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(transform.invoke(y1.c(z1.t(map, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: map-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m1230mapjgv0xPQ(int[] map, Function1<? super u1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(v1.v(map));
        int iV = v1.v(map);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(transform.invoke(u1.c(v1.t(map, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: map-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m1231mapxTcfx_M(short[] map, Function1<? super e2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(f2.v(map));
        int iV = f2.v(map);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(transform.invoke(e2.c(f2.t(map, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m1232mapIndexedELGow60(byte[] mapIndexed, Function2<? super Integer, ? super q1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(r1.v(mapIndexed));
        int iV = r1.v(mapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), q1.c(r1.t(mapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m1233mapIndexedWyvcNBI(int[] mapIndexed, Function2<? super Integer, ? super u1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(v1.v(mapIndexed));
        int iV = v1.v(mapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), u1.c(v1.t(mapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m1234mapIndexeds8dVfGU(long[] mapIndexed, Function2<? super Integer, ? super y1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(z1.v(mapIndexed));
        int iV = z1.v(mapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), y1.c(z1.t(mapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m1235mapIndexedxzaTVY8(short[] mapIndexed, Function2<? super Integer, ? super e2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(f2.v(mapIndexed));
        int iV = f2.v(mapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), e2.c(f2.t(mapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1236mapIndexedTo6EtJGI(int[] mapIndexedTo, C destination, Function2<? super Integer, ? super u1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = v1.v(mapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            destination.add(transform.invoke(Integer.valueOf(i11), u1.c(v1.t(mapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1237mapIndexedToQqktQ3k(short[] mapIndexedTo, C destination, Function2<? super Integer, ? super e2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = f2.v(mapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            destination.add(transform.invoke(Integer.valueOf(i11), e2.c(f2.t(mapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1238mapIndexedToeNpIKz8(byte[] mapIndexedTo, C destination, Function2<? super Integer, ? super q1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = r1.v(mapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            destination.add(transform.invoke(Integer.valueOf(i11), q1.c(r1.t(mapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1239mapIndexedTope2Q0Dw(long[] mapIndexedTo, C destination, Function2<? super Integer, ? super y1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = z1.v(mapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            destination.add(transform.invoke(Integer.valueOf(i11), y1.c(z1.t(mapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1240mapToHqK1JgA(long[] mapTo, C destination, Function1<? super y1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = z1.v(mapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            destination.add(transform.invoke(y1.c(z1.t(mapTo, i10))));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1241mapTooEOeDjA(short[] mapTo, C destination, Function1<? super e2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = f2.v(mapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            destination.add(transform.invoke(e2.c(f2.t(mapTo, i10))));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1242mapTowU5IKMo(int[] mapTo, C destination, Function1<? super u1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = v1.v(mapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            destination.add(transform.invoke(u1.c(v1.t(mapTo, i10))));
        }
        return destination;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: mapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1243mapTowzUQCXU(byte[] mapTo, C destination, Function1<? super q1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = r1.v(mapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            destination.add(transform.invoke(q1.c(r1.t(mapTo, i10))));
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: maxByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> q1 m1244maxByOrNullJOV_ifY(byte[] maxByOrNull, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxByOrNull)) {
            return null;
        }
        byte bT = r1.t(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return q1.c(bT);
        }
        R rInvoke = selector.invoke(q1.c(bT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bT2 = r1.t(maxByOrNull, i10);
                R rInvoke2 = selector.invoke(q1.c(bT2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bT = bT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: maxByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> y1 m1245maxByOrNullMShoTSo(long[] maxByOrNull, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(maxByOrNull)) {
            return null;
        }
        long jT = z1.t(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return y1.c(jT);
        }
        R rInvoke = selector.invoke(y1.c(jT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jT2 = z1.t(maxByOrNull, i10);
                R rInvoke2 = selector.invoke(y1.c(jT2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jT = jT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: maxByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> u1 m1246maxByOrNulljgv0xPQ(int[] maxByOrNull, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxByOrNull)) {
            return null;
        }
        int iT = v1.t(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return u1.c(iT);
        }
        R rInvoke = selector.invoke(u1.c(iT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(maxByOrNull, i10);
                R rInvoke2 = selector.invoke(u1.c(iT2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iT = iT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: maxByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> e2 m1247maxByOrNullxTcfx_M(short[] maxByOrNull, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(maxByOrNull)) {
            return null;
        }
        short sT = f2.t(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return e2.c(sT);
        }
        R rInvoke = selector.invoke(e2.c(sT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(maxByOrNull, i10);
                R rInvoke2 = selector.invoke(e2.c(sT2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sT = sT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @e1(version = "1.7")
    @u
    @f
    @i(name = "maxByOrThrow-U")
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m1249maxByOrThrowU(int[] maxBy, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxBy)) {
            throw new NoSuchElementException();
        }
        int iT = v1.t(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(u1.c(iT));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int iT2 = v1.t(maxBy, i10);
                    R rInvoke2 = selector.invoke(u1.c(iT2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        iT = iT2;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return iT;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final double m1252maxOfJOV_ifY(byte[] maxOf, Function1<? super q1, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(q1.c(r1.t(maxOf, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(q1.c(r1.t(maxOf, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final double m1255maxOfMShoTSo(long[] maxOf, Function1<? super y1, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(y1.c(z1.t(maxOf, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(y1.c(z1.t(maxOf, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final double m1258maxOfjgv0xPQ(int[] maxOf, Function1<? super u1, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(u1.c(v1.t(maxOf, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(u1.c(v1.t(maxOf, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final double m1261maxOfxTcfx_M(short[] maxOf, Function1<? super e2, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(e2.c(f2.t(maxOf, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(e2.c(f2.t(maxOf, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m1265maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super q1, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(q1.c(r1.t(maxOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(q1.c(r1.t(maxOfOrNull, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m1268maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super y1, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(y1.c(z1.t(maxOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(y1.c(z1.t(maxOfOrNull, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m1271maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super u1, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(u1.c(v1.t(maxOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(u1.c(v1.t(maxOfOrNull, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m1274maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super e2, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(e2.c(f2.t(maxOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(e2.c(f2.t(maxOfOrNull, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m1276maxOfWith5NtCtWE(long[] maxOfWith, Comparator<? super R> comparator, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(y1.c(z1.t(maxOfWith, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(y1.c(z1.t(maxOfWith, i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m1277maxOfWithLTi4i_s(byte[] maxOfWith, Comparator<? super R> comparator, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(q1.c(r1.t(maxOfWith, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(q1.c(r1.t(maxOfWith, i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1278maxOfWithl8EHGbQ(short[] maxOfWith, Comparator<? super R> comparator, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(e2.c(f2.t(maxOfWith, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(e2.c(f2.t(maxOfWith, i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m1279maxOfWithmyNOsp4(int[] maxOfWith, Comparator<? super R> comparator, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(u1.c(v1.t(maxOfWith, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(u1.c(v1.t(maxOfWith, i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m1280maxOfWithOrNull5NtCtWE(long[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(y1.c(z1.t(maxOfWithOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(y1.c(z1.t(maxOfWithOrNull, i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m1281maxOfWithOrNullLTi4i_s(byte[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(q1.c(r1.t(maxOfWithOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(q1.c(r1.t(maxOfWithOrNull, i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1282maxOfWithOrNulll8EHGbQ(short[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(e2.c(f2.t(maxOfWithOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(e2.c(f2.t(maxOfWithOrNull, i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m1283maxOfWithOrNullmyNOsp4(int[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(u1.c(v1.t(maxOfWithOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(u1.c(v1.t(maxOfWithOrNull, i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final u1 m1284maxOrNullajY9A(@NotNull int[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (v1.B(maxOrNull)) {
            return null;
        }
        int iT = v1.t(maxOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(maxOrNull, i10);
                if (Integer.compareUnsigned(iT, iT2) < 0) {
                    iT = iT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final q1 m1285maxOrNullGBYM_sE(@NotNull byte[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (r1.B(maxOrNull)) {
            return null;
        }
        byte bT = r1.t(maxOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bT2 = r1.t(maxOrNull, i10);
                if (Intrinsics.compare(bT & 255, bT2 & 255) < 0) {
                    bT = bT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final y1 m1286maxOrNullQwZRm1k(@NotNull long[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (z1.B(maxOrNull)) {
            return null;
        }
        long jT = z1.t(maxOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jT2 = z1.t(maxOrNull, i10);
                if (Long.compareUnsigned(jT, jT2) < 0) {
                    jT = jT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final e2 m1287maxOrNullrL5Bavg(@NotNull short[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (f2.B(maxOrNull)) {
            return null;
        }
        short sT = f2.t(maxOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(maxOrNull, i10);
                if (Intrinsics.compare(sT & e2.f312492d, 65535 & sT2) < 0) {
                    sT = sT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @e1(version = "1.7")
    @u
    @i(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final int m1289maxOrThrowU(@NotNull int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (v1.B(max)) {
            throw new NoSuchElementException();
        }
        int iT = v1.t(max, 0);
        int lastIndex = ArraysKt.getLastIndex(max);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(max, i10);
                if (Integer.compareUnsigned(iT, iT2) < 0) {
                    iT = iT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iT;
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final q1 m1292maxWithOrNullXMRcp5o(@NotNull byte[] maxWithOrNull, @NotNull Comparator<? super q1> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (r1.B(maxWithOrNull)) {
            return null;
        }
        byte bT = r1.t(maxWithOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bT2 = r1.t(maxWithOrNull, i10);
                if (comparator.compare(q1.c(bT), q1.c(bT2)) < 0) {
                    bT = bT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final u1 m1293maxWithOrNullYmdZ_VM(@NotNull int[] maxWithOrNull, @NotNull Comparator<? super u1> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (v1.B(maxWithOrNull)) {
            return null;
        }
        int iT = v1.t(maxWithOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(maxWithOrNull, i10);
                if (comparator.compare(u1.c(iT), u1.c(iT2)) < 0) {
                    iT = iT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final e2 m1294maxWithOrNulleOHTfZs(@NotNull short[] maxWithOrNull, @NotNull Comparator<? super e2> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (f2.B(maxWithOrNull)) {
            return null;
        }
        short sT = f2.t(maxWithOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(maxWithOrNull, i10);
                if (comparator.compare(e2.c(sT), e2.c(sT2)) < 0) {
                    sT = sT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final y1 m1295maxWithOrNullzrEWJaI(@NotNull long[] maxWithOrNull, @NotNull Comparator<? super y1> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (z1.B(maxWithOrNull)) {
            return null;
        }
        long jT = z1.t(maxWithOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jT2 = z1.t(maxWithOrNull, i10);
                if (comparator.compare(y1.c(jT), y1.c(jT2)) < 0) {
                    jT = jT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @e1(version = "1.7")
    @u
    @i(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final int m1297maxWithOrThrowU(@NotNull int[] maxWith, @NotNull Comparator<? super u1> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (v1.B(maxWith)) {
            throw new NoSuchElementException();
        }
        int iT = v1.t(maxWith, 0);
        int lastIndex = ArraysKt.getLastIndex(maxWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(maxWith, i10);
                if (comparator.compare(u1.c(iT), u1.c(iT2)) < 0) {
                    iT = iT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iT;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: minByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> q1 m1300minByOrNullJOV_ifY(byte[] minByOrNull, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(minByOrNull)) {
            return null;
        }
        byte bT = r1.t(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return q1.c(bT);
        }
        R rInvoke = selector.invoke(q1.c(bT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bT2 = r1.t(minByOrNull, i10);
                R rInvoke2 = selector.invoke(q1.c(bT2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bT = bT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: minByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> y1 m1301minByOrNullMShoTSo(long[] minByOrNull, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(minByOrNull)) {
            return null;
        }
        long jT = z1.t(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return y1.c(jT);
        }
        R rInvoke = selector.invoke(y1.c(jT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jT2 = z1.t(minByOrNull, i10);
                R rInvoke2 = selector.invoke(y1.c(jT2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jT = jT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: minByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> u1 m1302minByOrNulljgv0xPQ(int[] minByOrNull, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(minByOrNull)) {
            return null;
        }
        int iT = v1.t(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return u1.c(iT);
        }
        R rInvoke = selector.invoke(u1.c(iT));
        int i10 = 1;
        int i11 = 3 & 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(minByOrNull, i10);
                R rInvoke2 = selector.invoke(u1.c(iT2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iT = iT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: minByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> e2 m1303minByOrNullxTcfx_M(short[] minByOrNull, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minByOrNull)) {
            return null;
        }
        short sT = f2.t(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return e2.c(sT);
        }
        R rInvoke = selector.invoke(e2.c(sT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(minByOrNull, i10);
                R rInvoke2 = selector.invoke(e2.c(sT2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sT = sT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @e1(version = "1.7")
    @u
    @f
    @i(name = "minByOrThrow-U")
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m1305minByOrThrowU(int[] minBy, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(minBy)) {
            throw new NoSuchElementException();
        }
        int iT = v1.t(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(u1.c(iT));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int iT2 = v1.t(minBy, i10);
                    R rInvoke2 = selector.invoke(u1.c(iT2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        iT = iT2;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return iT;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final double m1308minOfJOV_ifY(byte[] minOf, Function1<? super q1, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(q1.c(r1.t(minOf, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(minOf);
        int i10 = 1;
        boolean z10 = !false;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(q1.c(r1.t(minOf, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final double m1311minOfMShoTSo(long[] minOf, Function1<? super y1, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(y1.c(z1.t(minOf, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(minOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(y1.c(z1.t(minOf, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final double m1314minOfjgv0xPQ(int[] minOf, Function1<? super u1, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(u1.c(v1.t(minOf, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(minOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(u1.c(v1.t(minOf, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final double m1317minOfxTcfx_M(short[] minOf, Function1<? super e2, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(e2.c(f2.t(minOf, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(minOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(e2.c(f2.t(minOf, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m1321minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super q1, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(q1.c(r1.t(minOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(q1.c(r1.t(minOfOrNull, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m1324minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super y1, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(y1.c(z1.t(minOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(y1.c(z1.t(minOfOrNull, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m1327minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super u1, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(u1.c(v1.t(minOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(u1.c(v1.t(minOfOrNull, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m1330minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super e2, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(e2.c(f2.t(minOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(e2.c(f2.t(minOfOrNull, i10))).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m1332minOfWith5NtCtWE(long[] minOfWith, Comparator<? super R> comparator, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(y1.c(z1.t(minOfWith, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(y1.c(z1.t(minOfWith, i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m1333minOfWithLTi4i_s(byte[] minOfWith, Comparator<? super R> comparator, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(minOfWith)) {
            throw new NoSuchElementException();
        }
        boolean z10 = true & false;
        R rInvoke = selector.invoke(q1.c(r1.t(minOfWith, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(q1.c(r1.t(minOfWith, i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1334minOfWithl8EHGbQ(short[] minOfWith, Comparator<? super R> comparator, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(e2.c(f2.t(minOfWith, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(e2.c(f2.t(minOfWith, i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m1335minOfWithmyNOsp4(int[] minOfWith, Comparator<? super R> comparator, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(u1.c(v1.t(minOfWith, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(u1.c(v1.t(minOfWith, i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m1336minOfWithOrNull5NtCtWE(long[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(y1.c(z1.t(minOfWithOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(y1.c(z1.t(minOfWithOrNull, i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m1337minOfWithOrNullLTi4i_s(byte[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(q1.c(r1.t(minOfWithOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(q1.c(r1.t(minOfWithOrNull, i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1338minOfWithOrNulll8EHGbQ(short[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(e2.c(f2.t(minOfWithOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(e2.c(f2.t(minOfWithOrNull, i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m1339minOfWithOrNullmyNOsp4(int[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(u1.c(v1.t(minOfWithOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(u1.c(v1.t(minOfWithOrNull, i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final u1 m1340minOrNullajY9A(@NotNull int[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (v1.B(minOrNull)) {
            return null;
        }
        int iT = v1.t(minOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(minOrNull, i10);
                if (Integer.compareUnsigned(iT, iT2) > 0) {
                    iT = iT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final q1 m1341minOrNullGBYM_sE(@NotNull byte[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (r1.B(minOrNull)) {
            return null;
        }
        byte bT = r1.t(minOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bT2 = r1.t(minOrNull, i10);
                if (Intrinsics.compare(bT & 255, bT2 & 255) > 0) {
                    bT = bT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final y1 m1342minOrNullQwZRm1k(@NotNull long[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (z1.B(minOrNull)) {
            return null;
        }
        long jT = z1.t(minOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jT2 = z1.t(minOrNull, i10);
                if (Long.compareUnsigned(jT, jT2) > 0) {
                    jT = jT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final e2 m1343minOrNullrL5Bavg(@NotNull short[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (f2.B(minOrNull)) {
            return null;
        }
        short sT = f2.t(minOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(minOrNull, i10);
                if (Intrinsics.compare(sT & e2.f312492d, 65535 & sT2) > 0) {
                    sT = sT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @e1(version = "1.7")
    @u
    @i(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final int m1345minOrThrowU(@NotNull int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (v1.B(min)) {
            throw new NoSuchElementException();
        }
        int iT = v1.t(min, 0);
        int lastIndex = ArraysKt.getLastIndex(min);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(min, i10);
                if (Integer.compareUnsigned(iT, iT2) > 0) {
                    iT = iT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iT;
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final q1 m1348minWithOrNullXMRcp5o(@NotNull byte[] minWithOrNull, @NotNull Comparator<? super q1> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (r1.B(minWithOrNull)) {
            return null;
        }
        byte bT = r1.t(minWithOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bT2 = r1.t(minWithOrNull, i10);
                if (comparator.compare(q1.c(bT), q1.c(bT2)) > 0) {
                    bT = bT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final u1 m1349minWithOrNullYmdZ_VM(@NotNull int[] minWithOrNull, @NotNull Comparator<? super u1> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (v1.B(minWithOrNull)) {
            return null;
        }
        int iT = v1.t(minWithOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(minWithOrNull, i10);
                if (comparator.compare(u1.c(iT), u1.c(iT2)) > 0) {
                    iT = iT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final e2 m1350minWithOrNulleOHTfZs(@NotNull short[] minWithOrNull, @NotNull Comparator<? super e2> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (f2.B(minWithOrNull)) {
            return null;
        }
        short sT = f2.t(minWithOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(minWithOrNull, i10);
                if (comparator.compare(e2.c(sT), e2.c(sT2)) > 0) {
                    sT = sT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final y1 m1351minWithOrNullzrEWJaI(@NotNull long[] minWithOrNull, @NotNull Comparator<? super y1> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (z1.B(minWithOrNull)) {
            return null;
        }
        long jT = z1.t(minWithOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jT2 = z1.t(minWithOrNull, i10);
                if (comparator.compare(y1.c(jT), y1.c(jT2)) > 0) {
                    jT = jT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @e1(version = "1.7")
    @u
    @i(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final int m1353minWithOrThrowU(@NotNull int[] minWith, @NotNull Comparator<? super u1> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (v1.B(minWith)) {
            throw new NoSuchElementException();
        }
        int iT = v1.t(minWith, 0);
        int lastIndex = ArraysKt.getLastIndex(minWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(minWith, i10);
                if (comparator.compare(u1.c(iT), u1.c(iT2)) > 0) {
                    iT = iT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: none--ajY-9A, reason: not valid java name */
    private static final boolean m1356noneajY9A(int[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return v1.B(none);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: none-GBYM_sE, reason: not valid java name */
    private static final boolean m1357noneGBYM_sE(byte[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return r1.B(none);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: none-JOV_ifY, reason: not valid java name */
    private static final boolean m1358noneJOV_ifY(byte[] none, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(none);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(q1.c(r1.t(none, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: none-MShoTSo, reason: not valid java name */
    private static final boolean m1359noneMShoTSo(long[] none, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(none);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(y1.c(z1.t(none, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: none-QwZRm1k, reason: not valid java name */
    private static final boolean m1360noneQwZRm1k(long[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return z1.B(none);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: none-jgv0xPQ, reason: not valid java name */
    private static final boolean m1361nonejgv0xPQ(int[] none, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(none);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(u1.c(v1.t(none, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: none-rL5Bavg, reason: not valid java name */
    private static final boolean m1362nonerL5Bavg(short[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return f2.B(none);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: none-xTcfx_M, reason: not valid java name */
    private static final boolean m1363nonexTcfx_M(short[] none, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(none);
        int i10 = 5 & 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(e2.c(f2.t(none, i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: onEach-JOV_ifY, reason: not valid java name */
    private static final byte[] m1364onEachJOV_ifY(byte[] onEach, Function1<? super q1, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = r1.v(onEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(q1.c(r1.t(onEach, i10)));
        }
        return onEach;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: onEach-MShoTSo, reason: not valid java name */
    private static final long[] m1365onEachMShoTSo(long[] onEach, Function1<? super y1, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = z1.v(onEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(y1.c(z1.t(onEach, i10)));
        }
        return onEach;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: onEach-jgv0xPQ, reason: not valid java name */
    private static final int[] m1366onEachjgv0xPQ(int[] onEach, Function1<? super u1, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = v1.v(onEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(u1.c(v1.t(onEach, i10)));
        }
        return onEach;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: onEach-xTcfx_M, reason: not valid java name */
    private static final short[] m1367onEachxTcfx_M(short[] onEach, Function1<? super e2, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = f2.v(onEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(e2.c(f2.t(onEach, i10)));
        }
        return onEach;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: onEachIndexed-ELGow60, reason: not valid java name */
    private static final byte[] m1368onEachIndexedELGow60(byte[] onEachIndexed, Function2<? super Integer, ? super q1, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = r1.v(onEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), q1.c(r1.t(onEachIndexed, i10)));
            i10++;
            i11++;
        }
        return onEachIndexed;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: onEachIndexed-WyvcNBI, reason: not valid java name */
    private static final int[] m1369onEachIndexedWyvcNBI(int[] onEachIndexed, Function2<? super Integer, ? super u1, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = v1.v(onEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), u1.c(v1.t(onEachIndexed, i10)));
            i10++;
            i11++;
        }
        return onEachIndexed;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: onEachIndexed-s8dVfGU, reason: not valid java name */
    private static final long[] m1370onEachIndexeds8dVfGU(long[] onEachIndexed, Function2<? super Integer, ? super y1, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = z1.v(onEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), y1.c(z1.t(onEachIndexed, i10)));
            i10++;
            i11++;
        }
        return onEachIndexed;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: onEachIndexed-xzaTVY8, reason: not valid java name */
    private static final short[] m1371onEachIndexedxzaTVY8(short[] onEachIndexed, Function2<? super Integer, ? super e2, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iV = f2.v(onEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), e2.c(f2.t(onEachIndexed, i10)));
            i10++;
            i11++;
        }
        return onEachIndexed;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: plus-3uqUaXg, reason: not valid java name */
    private static final long[] m1372plus3uqUaXg(long[] plus, long j10) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return z1.k(ArraysKt.plus(plus, j10));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m1373plusCFIt9YE(@NotNull int[] plus, @NotNull Collection<u1> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iV = v1.v(plus);
        int[] iArrCopyOf = Arrays.copyOf(plus, v1.v(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        Iterator<u1> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[iV] = it.next().z0();
            iV++;
        }
        return v1.k(iArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: plus-XzdR7RA, reason: not valid java name */
    private static final short[] m1374plusXzdR7RA(short[] plus, short s10) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return f2.k(ArraysKt.plus(plus, s10));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: plus-ctEhBpI, reason: not valid java name */
    private static final int[] m1375plusctEhBpI(int[] plus, int[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return v1.k(ArraysKt.plus(plus, elements));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: plus-gMuBH34, reason: not valid java name */
    private static final byte[] m1376plusgMuBH34(byte[] plus, byte b10) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return r1.k(ArraysKt.plus(plus, b10));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: plus-kdPth3s, reason: not valid java name */
    private static final byte[] m1377pluskdPth3s(byte[] plus, byte[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return r1.k(ArraysKt.plus(plus, elements));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m1378pluskzHmqpY(@NotNull long[] plus, @NotNull Collection<y1> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iV = z1.v(plus);
        long[] jArrCopyOf = Arrays.copyOf(plus, z1.v(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        Iterator<y1> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[iV] = it.next().z0();
            iV++;
        }
        return z1.k(jArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: plus-mazbYpA, reason: not valid java name */
    private static final short[] m1379plusmazbYpA(short[] plus, short[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return f2.k(ArraysKt.plus(plus, elements));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m1380plusojwP5H8(@NotNull short[] plus, @NotNull Collection<e2> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iV = f2.v(plus);
        short[] sArrCopyOf = Arrays.copyOf(plus, f2.v(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        Iterator<e2> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[iV] = it.next().x0();
            iV++;
        }
        return f2.k(sArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: plus-uWY9BYg, reason: not valid java name */
    private static final int[] m1381plusuWY9BYg(int[] plus, int i10) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return v1.k(ArraysKt.plus(plus, i10));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: plus-us8wMrg, reason: not valid java name */
    private static final long[] m1382plusus8wMrg(long[] plus, long[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return z1.k(ArraysKt.plus(plus, elements));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m1383plusxo_DsdI(@NotNull byte[] plus, @NotNull Collection<q1> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iV = r1.v(plus);
        byte[] bArrCopyOf = Arrays.copyOf(plus, r1.v(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        Iterator<q1> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[iV] = it.next().x0();
            iV++;
        }
        return r1.k(bArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: random--ajY-9A, reason: not valid java name */
    private static final int m1384randomajY9A(int[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1385random2D5oskM(random, kotlin.random.f.f312895a);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m1385random2D5oskM(@NotNull int[] random, @NotNull kotlin.random.f random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (v1.B(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return v1.t(random, random2.m(v1.v(random)));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: random-GBYM_sE, reason: not valid java name */
    private static final byte m1386randomGBYM_sE(byte[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1389randomoSF2wD8(random, kotlin.random.f.f312895a);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m1387randomJzugnMA(@NotNull long[] random, @NotNull kotlin.random.f random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (z1.B(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return z1.t(random, random2.m(z1.v(random)));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: random-QwZRm1k, reason: not valid java name */
    private static final long m1388randomQwZRm1k(long[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1387randomJzugnMA(random, kotlin.random.f.f312895a);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m1389randomoSF2wD8(@NotNull byte[] random, @NotNull kotlin.random.f random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (r1.B(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return r1.t(random, random2.m(r1.v(random)));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: random-rL5Bavg, reason: not valid java name */
    private static final short m1390randomrL5Bavg(short[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1391randoms5X_as8(random, kotlin.random.f.f312895a);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m1391randoms5X_as8(@NotNull short[] random, @NotNull kotlin.random.f random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (f2.B(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return f2.t(random, random2.m(f2.v(random)));
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: randomOrNull--ajY-9A, reason: not valid java name */
    private static final u1 m1392randomOrNullajY9A(int[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1393randomOrNull2D5oskM(randomOrNull, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final u1 m1393randomOrNull2D5oskM(@NotNull int[] randomOrNull, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (v1.B(randomOrNull)) {
            return null;
        }
        return u1.c(v1.t(randomOrNull, random.m(v1.v(randomOrNull))));
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: randomOrNull-GBYM_sE, reason: not valid java name */
    private static final q1 m1394randomOrNullGBYM_sE(byte[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1397randomOrNulloSF2wD8(randomOrNull, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final y1 m1395randomOrNullJzugnMA(@NotNull long[] randomOrNull, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (z1.B(randomOrNull)) {
            return null;
        }
        return y1.c(z1.t(randomOrNull, random.m(z1.v(randomOrNull))));
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: randomOrNull-QwZRm1k, reason: not valid java name */
    private static final y1 m1396randomOrNullQwZRm1k(long[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1395randomOrNullJzugnMA(randomOrNull, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final q1 m1397randomOrNulloSF2wD8(@NotNull byte[] randomOrNull, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (r1.B(randomOrNull)) {
            return null;
        }
        return q1.c(r1.t(randomOrNull, random.m(r1.v(randomOrNull))));
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: randomOrNull-rL5Bavg, reason: not valid java name */
    private static final e2 m1398randomOrNullrL5Bavg(short[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1399randomOrNulls5X_as8(randomOrNull, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @u
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final e2 m1399randomOrNulls5X_as8(@NotNull short[] randomOrNull, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (f2.B(randomOrNull)) {
            return null;
        }
        return e2.c(f2.t(randomOrNull, random.m(f2.v(randomOrNull))));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduce-ELGow60, reason: not valid java name */
    private static final byte m1400reduceELGow60(byte[] reduce, Function2<? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bT = r1.t(reduce, 0);
        int lastIndex = ArraysKt.getLastIndex(reduce);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                bT = operation.invoke(q1.c(bT), q1.c(r1.t(reduce, i10))).x0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return bT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduce-WyvcNBI, reason: not valid java name */
    private static final int m1401reduceWyvcNBI(int[] reduce, Function2<? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iT = v1.t(reduce, 0);
        int lastIndex = ArraysKt.getLastIndex(reduce);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                iT = operation.invoke(u1.c(iT), u1.c(v1.t(reduce, i10))).z0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduce-s8dVfGU, reason: not valid java name */
    private static final long m1402reduces8dVfGU(long[] reduce, Function2<? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jT = z1.t(reduce, 0);
        int lastIndex = ArraysKt.getLastIndex(reduce);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                jT = operation.invoke(y1.c(jT), y1.c(z1.t(reduce, i10))).z0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return jT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduce-xzaTVY8, reason: not valid java name */
    private static final short m1403reducexzaTVY8(short[] reduce, Function2<? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sT = f2.t(reduce, 0);
        int lastIndex = ArraysKt.getLastIndex(reduce);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sT = operation.invoke(e2.c(sT), e2.c(f2.t(reduce, i10))).x0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceIndexed-D40WMg8, reason: not valid java name */
    private static final int m1404reduceIndexedD40WMg8(int[] reduceIndexed, n<? super Integer, ? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iT = v1.t(reduceIndexed, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceIndexed);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                iT = operation.invoke(Integer.valueOf(i10), u1.c(iT), u1.c(v1.t(reduceIndexed, i10))).z0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m1405reduceIndexedEOyYB1Y(byte[] reduceIndexed, n<? super Integer, ? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bT = r1.t(reduceIndexed, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceIndexed);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                bT = operation.invoke(Integer.valueOf(i10), q1.c(bT), q1.c(r1.t(reduceIndexed, i10))).x0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return bT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m1406reduceIndexedaLgx1Fo(short[] reduceIndexed, n<? super Integer, ? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sT = f2.t(reduceIndexed, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceIndexed);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sT = operation.invoke(Integer.valueOf(i10), e2.c(sT), e2.c(f2.t(reduceIndexed, i10))).x0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceIndexed-z1zDJgo, reason: not valid java name */
    private static final long m1407reduceIndexedz1zDJgo(long[] reduceIndexed, n<? super Integer, ? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jT = z1.t(reduceIndexed, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceIndexed);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                jT = operation.invoke(Integer.valueOf(i10), y1.c(jT), y1.c(z1.t(reduceIndexed, i10))).z0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return jT;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final u1 m1408reduceIndexedOrNullD40WMg8(int[] reduceIndexedOrNull, n<? super Integer, ? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(reduceIndexedOrNull)) {
            return null;
        }
        int iT = v1.t(reduceIndexedOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceIndexedOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                iT = operation.invoke(Integer.valueOf(i10), u1.c(iT), u1.c(v1.t(reduceIndexedOrNull, i10))).z0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final q1 m1409reduceIndexedOrNullEOyYB1Y(byte[] reduceIndexedOrNull, n<? super Integer, ? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(reduceIndexedOrNull)) {
            return null;
        }
        byte bT = r1.t(reduceIndexedOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceIndexedOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                bT = operation.invoke(Integer.valueOf(i10), q1.c(bT), q1.c(r1.t(reduceIndexedOrNull, i10))).x0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final e2 m1410reduceIndexedOrNullaLgx1Fo(short[] reduceIndexedOrNull, n<? super Integer, ? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(reduceIndexedOrNull)) {
            return null;
        }
        short sT = f2.t(reduceIndexedOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceIndexedOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sT = operation.invoke(Integer.valueOf(i10), e2.c(sT), e2.c(f2.t(reduceIndexedOrNull, i10))).x0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final y1 m1411reduceIndexedOrNullz1zDJgo(long[] reduceIndexedOrNull, n<? super Integer, ? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(reduceIndexedOrNull)) {
            return null;
        }
        long jT = z1.t(reduceIndexedOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceIndexedOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                jT = operation.invoke(Integer.valueOf(i10), y1.c(jT), y1.c(z1.t(reduceIndexedOrNull, i10))).z0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceOrNull-ELGow60, reason: not valid java name */
    private static final q1 m1412reduceOrNullELGow60(byte[] reduceOrNull, Function2<? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(reduceOrNull)) {
            return null;
        }
        byte bT = r1.t(reduceOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                bT = operation.invoke(q1.c(bT), q1.c(r1.t(reduceOrNull, i10))).x0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceOrNull-WyvcNBI, reason: not valid java name */
    private static final u1 m1413reduceOrNullWyvcNBI(int[] reduceOrNull, Function2<? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(reduceOrNull)) {
            return null;
        }
        int iT = v1.t(reduceOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                iT = operation.invoke(u1.c(iT), u1.c(v1.t(reduceOrNull, i10))).z0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceOrNull-s8dVfGU, reason: not valid java name */
    private static final y1 m1414reduceOrNulls8dVfGU(long[] reduceOrNull, Function2<? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(reduceOrNull)) {
            return null;
        }
        long jT = z1.t(reduceOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceOrNull);
        int i10 = 1;
        int i11 = 4 & 1;
        if (1 <= lastIndex) {
            while (true) {
                jT = operation.invoke(y1.c(jT), y1.c(z1.t(reduceOrNull, i10))).z0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceOrNull-xzaTVY8, reason: not valid java name */
    private static final e2 m1415reduceOrNullxzaTVY8(short[] reduceOrNull, Function2<? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(reduceOrNull)) {
            return null;
        }
        short sT = f2.t(reduceOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(reduceOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sT = operation.invoke(e2.c(sT), e2.c(f2.t(reduceOrNull, i10))).x0();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceRight-ELGow60, reason: not valid java name */
    private static final byte m1416reduceRightELGow60(byte[] reduceRight, Function2<? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bT = r1.t(reduceRight, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bT = operation.invoke(q1.c(r1.t(reduceRight, i10)), q1.c(bT)).x0();
        }
        return bT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceRight-WyvcNBI, reason: not valid java name */
    private static final int m1417reduceRightWyvcNBI(int[] reduceRight, Function2<? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iT = v1.t(reduceRight, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            iT = operation.invoke(u1.c(v1.t(reduceRight, i10)), u1.c(iT)).z0();
        }
        return iT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceRight-s8dVfGU, reason: not valid java name */
    private static final long m1418reduceRights8dVfGU(long[] reduceRight, Function2<? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jT = z1.t(reduceRight, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jT = operation.invoke(y1.c(z1.t(reduceRight, i10)), y1.c(jT)).z0();
        }
        return jT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceRight-xzaTVY8, reason: not valid java name */
    private static final short m1419reduceRightxzaTVY8(short[] reduceRight, Function2<? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sT = f2.t(reduceRight, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sT = operation.invoke(e2.c(f2.t(reduceRight, i10)), e2.c(sT)).x0();
        }
        return sT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightIndexed-D40WMg8, reason: not valid java name */
    private static final int m1420reduceRightIndexedD40WMg8(int[] reduceRightIndexed, n<? super Integer, ? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iT = v1.t(reduceRightIndexed, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            iT = operation.invoke(Integer.valueOf(i10), u1.c(v1.t(reduceRightIndexed, i10)), u1.c(iT)).z0();
        }
        return iT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m1421reduceRightIndexedEOyYB1Y(byte[] reduceRightIndexed, n<? super Integer, ? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bT = r1.t(reduceRightIndexed, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bT = operation.invoke(Integer.valueOf(i10), q1.c(r1.t(reduceRightIndexed, i10)), q1.c(bT)).x0();
        }
        return bT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m1422reduceRightIndexedaLgx1Fo(short[] reduceRightIndexed, n<? super Integer, ? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sT = f2.t(reduceRightIndexed, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sT = operation.invoke(Integer.valueOf(i10), e2.c(f2.t(reduceRightIndexed, i10)), e2.c(sT)).x0();
        }
        return sT;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightIndexed-z1zDJgo, reason: not valid java name */
    private static final long m1423reduceRightIndexedz1zDJgo(long[] reduceRightIndexed, n<? super Integer, ? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jT = z1.t(reduceRightIndexed, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jT = operation.invoke(Integer.valueOf(i10), y1.c(z1.t(reduceRightIndexed, i10)), y1.c(jT)).z0();
        }
        return jT;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final u1 m1424reduceRightIndexedOrNullD40WMg8(int[] reduceRightIndexedOrNull, n<? super Integer, ? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int iT = v1.t(reduceRightIndexedOrNull, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            iT = operation.invoke(Integer.valueOf(i10), u1.c(v1.t(reduceRightIndexedOrNull, i10)), u1.c(iT)).z0();
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final q1 m1425reduceRightIndexedOrNullEOyYB1Y(byte[] reduceRightIndexedOrNull, n<? super Integer, ? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte bT = r1.t(reduceRightIndexedOrNull, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bT = operation.invoke(Integer.valueOf(i10), q1.c(r1.t(reduceRightIndexedOrNull, i10)), q1.c(bT)).x0();
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final e2 m1426reduceRightIndexedOrNullaLgx1Fo(short[] reduceRightIndexedOrNull, n<? super Integer, ? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short sT = f2.t(reduceRightIndexedOrNull, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sT = operation.invoke(Integer.valueOf(i10), e2.c(f2.t(reduceRightIndexedOrNull, i10)), e2.c(sT)).x0();
        }
        return e2.c(sT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final y1 m1427reduceRightIndexedOrNullz1zDJgo(long[] reduceRightIndexedOrNull, n<? super Integer, ? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long jT = z1.t(reduceRightIndexedOrNull, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jT = operation.invoke(Integer.valueOf(i10), y1.c(z1.t(reduceRightIndexedOrNull, i10)), y1.c(jT)).z0();
        }
        return y1.c(jT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightOrNull-ELGow60, reason: not valid java name */
    private static final q1 m1428reduceRightOrNullELGow60(byte[] reduceRightOrNull, Function2<? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte bT = r1.t(reduceRightOrNull, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bT = operation.invoke(q1.c(r1.t(reduceRightOrNull, i10)), q1.c(bT)).x0();
        }
        return q1.c(bT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightOrNull-WyvcNBI, reason: not valid java name */
    private static final u1 m1429reduceRightOrNullWyvcNBI(int[] reduceRightOrNull, Function2<? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int iT = v1.t(reduceRightOrNull, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            iT = operation.invoke(u1.c(v1.t(reduceRightOrNull, i10)), u1.c(iT)).z0();
        }
        return u1.c(iT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightOrNull-s8dVfGU, reason: not valid java name */
    private static final y1 m1430reduceRightOrNulls8dVfGU(long[] reduceRightOrNull, Function2<? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long jT = z1.t(reduceRightOrNull, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jT = operation.invoke(y1.c(z1.t(reduceRightOrNull, i10)), y1.c(jT)).z0();
        }
        return y1.c(jT);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reduceRightOrNull-xzaTVY8, reason: not valid java name */
    private static final e2 m1431reduceRightOrNullxzaTVY8(short[] reduceRightOrNull, Function2<? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short sT = f2.t(reduceRightOrNull, lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sT = operation.invoke(e2.c(f2.t(reduceRightOrNull, i10)), e2.c(sT)).x0();
        }
        return e2.c(sT);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reverse--ajY-9A, reason: not valid java name */
    private static final void m1432reverseajY9A(int[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reverse--nroSd4, reason: not valid java name */
    private static final void m1433reversenroSd4(long[] reverse, int i10, int i11) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, i10, i11);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reverse-4UcCI2c, reason: not valid java name */
    private static final void m1434reverse4UcCI2c(byte[] reverse, int i10, int i11) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, i10, i11);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reverse-Aa5vz7o, reason: not valid java name */
    private static final void m1435reverseAa5vz7o(short[] reverse, int i10, int i11) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, i10, i11);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reverse-GBYM_sE, reason: not valid java name */
    private static final void m1436reverseGBYM_sE(byte[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reverse-QwZRm1k, reason: not valid java name */
    private static final void m1437reverseQwZRm1k(long[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: reverse-oBK06Vg, reason: not valid java name */
    private static final void m1438reverseoBK06Vg(int[] reverse, int i10, int i11) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, i10, i11);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reverse-rL5Bavg, reason: not valid java name */
    private static final void m1439reverserL5Bavg(short[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: reversed--ajY-9A, reason: not valid java name */
    public static List<u1> m1440reversedajY9A(@NotNull int[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (v1.B(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<u1> mutableList = CollectionsKt.toMutableList((Collection) v1.d(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<q1> m1441reversedGBYM_sE(@NotNull byte[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (r1.B(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<q1> mutableList = CollectionsKt.toMutableList((Collection) r1.d(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<y1> m1442reversedQwZRm1k(@NotNull long[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (z1.B(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<y1> mutableList = CollectionsKt.toMutableList((Collection) z1.d(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<e2> m1443reversedrL5Bavg(@NotNull short[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (f2.B(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<e2> mutableList = CollectionsKt.toMutableList((Collection) f2.d(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reversedArray--ajY-9A, reason: not valid java name */
    private static final int[] m1444reversedArrayajY9A(int[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return v1.k(ArraysKt.reversedArray(reversedArray));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reversedArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m1445reversedArrayGBYM_sE(byte[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return r1.k(ArraysKt.reversedArray(reversedArray));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reversedArray-QwZRm1k, reason: not valid java name */
    private static final long[] m1446reversedArrayQwZRm1k(long[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return z1.k(ArraysKt.reversedArray(reversedArray));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: reversedArray-rL5Bavg, reason: not valid java name */
    private static final short[] m1447reversedArrayrL5Bavg(short[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return f2.k(ArraysKt.reversedArray(reversedArray));
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningFold-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m1448runningFoldA8wKCXQ(long[] runningFold, R r10, Function2<? super R, ? super y1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(runningFold)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(z1.v(runningFold) + 1);
        arrayList.add(r10);
        int iV = z1.v(runningFold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, y1.c(z1.t(runningFold, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningFold-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m1449runningFoldyXmHNn8(byte[] runningFold, R r10, Function2<? super R, ? super q1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(runningFold)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(r1.v(runningFold) + 1);
        arrayList.add(r10);
        int iV = r1.v(runningFold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, q1.c(r1.t(runningFold, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningFold-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m1450runningFoldzi1B2BA(int[] runningFold, R r10, Function2<? super R, ? super u1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(runningFold)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(v1.v(runningFold) + 1);
        arrayList.add(r10);
        int iV = v1.v(runningFold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, u1.c(v1.t(runningFold, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningFold-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m1451runningFoldzww5nb8(short[] runningFold, R r10, Function2<? super R, ? super e2, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(runningFold)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(f2.v(runningFold) + 1);
        arrayList.add(r10);
        int iV = f2.v(runningFold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, e2.c(f2.t(runningFold, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningFoldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m1452runningFoldIndexed3iWJZGE(byte[] runningFoldIndexed, R r10, n<? super Integer, ? super R, ? super q1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(runningFoldIndexed)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(r1.v(runningFoldIndexed) + 1);
        arrayList.add(r10);
        int iV = r1.v(runningFoldIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, q1.c(r1.t(runningFoldIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningFoldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m1453runningFoldIndexedbzxtMww(short[] runningFoldIndexed, R r10, n<? super Integer, ? super R, ? super e2, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(runningFoldIndexed)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(f2.v(runningFoldIndexed) + 1);
        arrayList.add(r10);
        int iV = f2.v(runningFoldIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, e2.c(f2.t(runningFoldIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningFoldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m1454runningFoldIndexedmwnnOCs(long[] runningFoldIndexed, R r10, n<? super Integer, ? super R, ? super y1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(runningFoldIndexed)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(z1.v(runningFoldIndexed) + 1);
        arrayList.add(r10);
        int iV = z1.v(runningFoldIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, y1.c(z1.t(runningFoldIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningFoldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m1455runningFoldIndexedyVwIW0Q(int[] runningFoldIndexed, R r10, n<? super Integer, ? super R, ? super u1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(runningFoldIndexed)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(v1.v(runningFoldIndexed) + 1);
        arrayList.add(r10);
        int iV = v1.v(runningFoldIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, u1.c(v1.t(runningFoldIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningReduce-ELGow60, reason: not valid java name */
    private static final List<q1> m1456runningReduceELGow60(byte[] runningReduce, Function2<? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        byte bT = r1.t(runningReduce, 0);
        ArrayList arrayList = new ArrayList(r1.v(runningReduce));
        arrayList.add(q1.c(bT));
        int iV = r1.v(runningReduce);
        for (int i10 = 1; i10 < iV; i10++) {
            bT = operation.invoke(q1.c(bT), q1.c(r1.t(runningReduce, i10))).x0();
            arrayList.add(q1.c(bT));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningReduce-WyvcNBI, reason: not valid java name */
    private static final List<u1> m1457runningReduceWyvcNBI(int[] runningReduce, Function2<? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        int iT = v1.t(runningReduce, 0);
        ArrayList arrayList = new ArrayList(v1.v(runningReduce));
        arrayList.add(u1.c(iT));
        int iV = v1.v(runningReduce);
        for (int i10 = 1; i10 < iV; i10++) {
            iT = operation.invoke(u1.c(iT), u1.c(v1.t(runningReduce, i10))).z0();
            arrayList.add(u1.c(iT));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningReduce-s8dVfGU, reason: not valid java name */
    private static final List<y1> m1458runningReduces8dVfGU(long[] runningReduce, Function2<? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        long jT = z1.t(runningReduce, 0);
        ArrayList arrayList = new ArrayList(z1.v(runningReduce));
        arrayList.add(y1.c(jT));
        int iV = z1.v(runningReduce);
        for (int i10 = 1; i10 < iV; i10++) {
            jT = operation.invoke(y1.c(jT), y1.c(z1.t(runningReduce, i10))).z0();
            arrayList.add(y1.c(jT));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningReduce-xzaTVY8, reason: not valid java name */
    private static final List<e2> m1459runningReducexzaTVY8(short[] runningReduce, Function2<? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        short sT = f2.t(runningReduce, 0);
        ArrayList arrayList = new ArrayList(f2.v(runningReduce));
        arrayList.add(e2.c(sT));
        int iV = f2.v(runningReduce);
        for (int i10 = 1; i10 < iV; i10++) {
            sT = operation.invoke(e2.c(sT), e2.c(f2.t(runningReduce, i10))).x0();
            arrayList.add(e2.c(sT));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningReduceIndexed-D40WMg8, reason: not valid java name */
    private static final List<u1> m1460runningReduceIndexedD40WMg8(int[] runningReduceIndexed, n<? super Integer, ? super u1, ? super u1, u1> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        int iT = v1.t(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(v1.v(runningReduceIndexed));
        arrayList.add(u1.c(iT));
        int iV = v1.v(runningReduceIndexed);
        for (int i10 = 1; i10 < iV; i10++) {
            iT = operation.invoke(Integer.valueOf(i10), u1.c(iT), u1.c(v1.t(runningReduceIndexed, i10))).z0();
            arrayList.add(u1.c(iT));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningReduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final List<q1> m1461runningReduceIndexedEOyYB1Y(byte[] runningReduceIndexed, n<? super Integer, ? super q1, ? super q1, q1> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        byte bT = r1.t(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(r1.v(runningReduceIndexed));
        arrayList.add(q1.c(bT));
        int iV = r1.v(runningReduceIndexed);
        for (int i10 = 1; i10 < iV; i10++) {
            bT = operation.invoke(Integer.valueOf(i10), q1.c(bT), q1.c(r1.t(runningReduceIndexed, i10))).x0();
            arrayList.add(q1.c(bT));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningReduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final List<e2> m1462runningReduceIndexedaLgx1Fo(short[] runningReduceIndexed, n<? super Integer, ? super e2, ? super e2, e2> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        short sT = f2.t(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(f2.v(runningReduceIndexed));
        arrayList.add(e2.c(sT));
        int iV = f2.v(runningReduceIndexed);
        int i10 = 3 | 1;
        for (int i11 = 1; i11 < iV; i11++) {
            sT = operation.invoke(Integer.valueOf(i11), e2.c(sT), e2.c(f2.t(runningReduceIndexed, i11))).x0();
            arrayList.add(e2.c(sT));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: runningReduceIndexed-z1zDJgo, reason: not valid java name */
    private static final List<y1> m1463runningReduceIndexedz1zDJgo(long[] runningReduceIndexed, n<? super Integer, ? super y1, ? super y1, y1> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        long jT = z1.t(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(z1.v(runningReduceIndexed));
        arrayList.add(y1.c(jT));
        int iV = z1.v(runningReduceIndexed);
        for (int i10 = 1; i10 < iV; i10++) {
            jT = operation.invoke(Integer.valueOf(i10), y1.c(jT), y1.c(z1.t(runningReduceIndexed, i10))).z0();
            arrayList.add(y1.c(jT));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: scan-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m1464scanA8wKCXQ(long[] scan, R r10, Function2<? super R, ? super y1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(scan)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(z1.v(scan) + 1);
        arrayList.add(r10);
        int iV = z1.v(scan);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, y1.c(z1.t(scan, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: scan-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m1465scanyXmHNn8(byte[] scan, R r10, Function2<? super R, ? super q1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(scan)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(r1.v(scan) + 1);
        arrayList.add(r10);
        int iV = r1.v(scan);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, q1.c(r1.t(scan, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: scan-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m1466scanzi1B2BA(int[] scan, R r10, Function2<? super R, ? super u1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(scan)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(v1.v(scan) + 1);
        arrayList.add(r10);
        int iV = v1.v(scan);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, u1.c(v1.t(scan, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: scan-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m1467scanzww5nb8(short[] scan, R r10, Function2<? super R, ? super e2, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(scan)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(f2.v(scan) + 1);
        arrayList.add(r10);
        int iV = f2.v(scan);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, e2.c(f2.t(scan, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: scanIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m1468scanIndexed3iWJZGE(byte[] scanIndexed, R r10, n<? super Integer, ? super R, ? super q1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (r1.B(scanIndexed)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(r1.v(scanIndexed) + 1);
        arrayList.add(r10);
        int iV = r1.v(scanIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, q1.c(r1.t(scanIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: scanIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m1469scanIndexedbzxtMww(short[] scanIndexed, R r10, n<? super Integer, ? super R, ? super e2, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (f2.B(scanIndexed)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(f2.v(scanIndexed) + 1);
        arrayList.add(r10);
        int iV = f2.v(scanIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, e2.c(f2.t(scanIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: scanIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m1470scanIndexedmwnnOCs(long[] scanIndexed, R r10, n<? super Integer, ? super R, ? super y1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (z1.B(scanIndexed)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(z1.v(scanIndexed) + 1);
        arrayList.add(r10);
        int iV = z1.v(scanIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, y1.c(z1.t(scanIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    @u
    /* JADX INFO: renamed from: scanIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m1471scanIndexedyVwIW0Q(int[] scanIndexed, R r10, n<? super Integer, ? super R, ? super u1, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (v1.B(scanIndexed)) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(v1.v(scanIndexed) + 1);
        arrayList.add(r10);
        int iV = v1.v(scanIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, u1.c(v1.t(scanIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m1472shuffleajY9A(@NotNull int[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1473shuffle2D5oskM(shuffle, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m1473shuffle2D5oskM(@NotNull int[] shuffle, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            int iT = v1.t(shuffle, lastIndex);
            v1.D(shuffle, lastIndex, v1.t(shuffle, iM));
            v1.D(shuffle, iM, iT);
        }
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m1474shuffleGBYM_sE(@NotNull byte[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1477shuffleoSF2wD8(shuffle, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m1475shuffleJzugnMA(@NotNull long[] shuffle, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            long jT = z1.t(shuffle, lastIndex);
            z1.D(shuffle, lastIndex, z1.t(shuffle, iM));
            z1.D(shuffle, iM, jT);
        }
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m1476shuffleQwZRm1k(@NotNull long[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1475shuffleJzugnMA(shuffle, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m1477shuffleoSF2wD8(@NotNull byte[] shuffle, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            byte bT = r1.t(shuffle, lastIndex);
            r1.D(shuffle, lastIndex, r1.t(shuffle, iM));
            r1.D(shuffle, iM, bT);
        }
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m1478shufflerL5Bavg(@NotNull short[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1479shuffles5X_as8(shuffle, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m1479shuffles5X_as8(@NotNull short[] shuffle, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            short sT = f2.t(shuffle, lastIndex);
            f2.D(shuffle, lastIndex, f2.t(shuffle, iM));
            f2.D(shuffle, iM, sT);
        }
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: single--ajY-9A, reason: not valid java name */
    private static final int m1480singleajY9A(int[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return u1.n(ArraysKt.single(single));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: single-GBYM_sE, reason: not valid java name */
    private static final byte m1481singleGBYM_sE(byte[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return q1.n(ArraysKt.single(single));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: single-JOV_ifY, reason: not valid java name */
    private static final byte m1482singleJOV_ifY(byte[] single, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(single);
        q1 q1VarC = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(single, i10);
            if (predicate.invoke(q1.c(bT)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                q1VarC = q1.c(bT);
                z10 = true;
                int i11 = 6 >> 1;
            }
        }
        if (z10) {
            return q1VarC.x0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: single-MShoTSo, reason: not valid java name */
    private static final long m1483singleMShoTSo(long[] single, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(single);
        y1 y1VarC = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(single, i10);
            if (predicate.invoke(y1.c(jT)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                y1VarC = y1.c(jT);
                z10 = true;
            }
        }
        if (z10) {
            return y1VarC.z0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: single-QwZRm1k, reason: not valid java name */
    private static final long m1484singleQwZRm1k(long[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return y1.n(ArraysKt.single(single));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: single-jgv0xPQ, reason: not valid java name */
    private static final int m1485singlejgv0xPQ(int[] single, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(single);
        u1 u1VarC = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(single, i10);
            if (predicate.invoke(u1.c(iT)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                u1VarC = u1.c(iT);
                z10 = true;
            }
        }
        if (z10) {
            return u1VarC.z0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: single-rL5Bavg, reason: not valid java name */
    private static final short m1486singlerL5Bavg(short[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return e2.n(ArraysKt.single(single));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: single-xTcfx_M, reason: not valid java name */
    private static final short m1487singlexTcfx_M(short[] single, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(single);
        e2 e2VarC = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(single, i10);
            if (predicate.invoke(e2.c(sT)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                e2VarC = e2.c(sT);
                z10 = true;
            }
        }
        if (z10) {
            return e2VarC.x0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final u1 m1488singleOrNullajY9A(@NotNull int[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (v1.v(singleOrNull) == 1) {
            return u1.c(v1.t(singleOrNull, 0));
        }
        return null;
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final q1 m1489singleOrNullGBYM_sE(@NotNull byte[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (r1.v(singleOrNull) == 1) {
            return q1.c(r1.t(singleOrNull, 0));
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: singleOrNull-JOV_ifY, reason: not valid java name */
    private static final q1 m1490singleOrNullJOV_ifY(byte[] singleOrNull, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = r1.v(singleOrNull);
        q1 q1VarC = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(singleOrNull, i10);
            if (predicate.invoke(q1.c(bT)).booleanValue()) {
                if (z10) {
                    return null;
                }
                q1VarC = q1.c(bT);
                z10 = true;
            }
        }
        if (z10) {
            return q1VarC;
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: singleOrNull-MShoTSo, reason: not valid java name */
    private static final y1 m1491singleOrNullMShoTSo(long[] singleOrNull, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = z1.v(singleOrNull);
        y1 y1VarC = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(singleOrNull, i10);
            if (predicate.invoke(y1.c(jT)).booleanValue()) {
                if (z10) {
                    return null;
                }
                y1VarC = y1.c(jT);
                z10 = true;
            }
        }
        if (z10) {
            return y1VarC;
        }
        return null;
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final y1 m1492singleOrNullQwZRm1k(@NotNull long[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (z1.v(singleOrNull) == 1) {
            return y1.c(z1.t(singleOrNull, 0));
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: singleOrNull-jgv0xPQ, reason: not valid java name */
    private static final u1 m1493singleOrNulljgv0xPQ(int[] singleOrNull, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = v1.v(singleOrNull);
        u1 u1VarC = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(singleOrNull, i10);
            if (predicate.invoke(u1.c(iT)).booleanValue()) {
                if (z10) {
                    return null;
                }
                u1VarC = u1.c(iT);
                z10 = true;
            }
        }
        if (z10) {
            return u1VarC;
        }
        return null;
    }

    @e1(version = "1.3")
    @u
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final e2 m1494singleOrNullrL5Bavg(@NotNull short[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (f2.v(singleOrNull) == 1) {
            return e2.c(f2.t(singleOrNull, 0));
        }
        return null;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: singleOrNull-xTcfx_M, reason: not valid java name */
    private static final e2 m1495singleOrNullxTcfx_M(short[] singleOrNull, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iV = f2.v(singleOrNull);
        e2 e2VarC = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            short sT = f2.t(singleOrNull, i10);
            if (predicate.invoke(e2.c(sT)).booleanValue()) {
                if (z10) {
                    return null;
                }
                e2VarC = e2.c(sT);
                z10 = true;
            }
        }
        if (z10) {
            return e2VarC;
        }
        return null;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<y1> m1496sliceF7u83W8(@NotNull long[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(y1.c(z1.t(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<u1> m1497sliceHwE9HBo(@NotNull int[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(u1.c(v1.t(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<e2> m1498sliceJGPC0M(@NotNull short[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(e2.c(f2.t(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<q1> m1499sliceJQknh5Q(@NotNull byte[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(q1.c(r1.t(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<e2> m1500sliceQ6IL4kU(@NotNull short[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m903asListrL5Bavg(f2.k(ArraysKt.copyOfRange(slice, indices.u().intValue(), indices.i().intValue() + 1)));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static List<y1> m1501sliceZRhS8yI(@NotNull long[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m902asListQwZRm1k(z1.k(ArraysKt.copyOfRange(slice, indices.u().intValue(), indices.i().intValue() + 1)));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<q1> m1502slicec0bezYM(@NotNull byte[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m901asListGBYM_sE(r1.k(ArraysKt.copyOfRange(slice, indices.u().intValue(), indices.i().intValue() + 1)));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: slice-tAntMlw, reason: not valid java name */
    public static List<u1> m1503slicetAntMlw(@NotNull int[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m900asListajY9A(v1.k(ArraysKt.copyOfRange(slice, indices.u().intValue(), indices.i().intValue() + 1)));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m1504sliceArrayCFIt9YE(@NotNull int[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return v1.k(ArraysKt.sliceArray(sliceArray, indices));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m1505sliceArrayQ6IL4kU(@NotNull short[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return f2.k(ArraysKt.sliceArray(sliceArray, indices));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m1506sliceArrayZRhS8yI(@NotNull long[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return z1.k(ArraysKt.sliceArray(sliceArray, indices));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m1507sliceArrayc0bezYM(@NotNull byte[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return r1.k(ArraysKt.sliceArray(sliceArray, indices));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m1508sliceArraykzHmqpY(@NotNull long[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return z1.k(ArraysKt.sliceArray(sliceArray, indices));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m1509sliceArrayojwP5H8(@NotNull short[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return f2.k(ArraysKt.sliceArray(sliceArray, indices));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m1510sliceArraytAntMlw(@NotNull int[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return v1.k(ArraysKt.sliceArray(sliceArray, indices));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m1511sliceArrayxo_DsdI(@NotNull byte[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return r1.k(ArraysKt.sliceArray(sliceArray, indices));
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m1512sortajY9A(@NotNull int[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (v1.v(sort) > 1) {
            UArraySortingKt.m898sortArrayoBK06Vg(sort, 0, v1.v(sort));
        }
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m1513sortnroSd4(@NotNull long[] sort, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, z1.v(sort));
        UArraySortingKt.m895sortArraynroSd4(sort, i10, i11);
    }

    /* JADX INFO: renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m1514sortnroSd4$default(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = z1.v(jArr);
        }
        m1513sortnroSd4(jArr, i10, i11);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m1515sort4UcCI2c(@NotNull byte[] sort, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, r1.v(sort));
        UArraySortingKt.m896sortArray4UcCI2c(sort, i10, i11);
    }

    /* JADX INFO: renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m1516sort4UcCI2c$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = r1.v(bArr);
        }
        m1515sort4UcCI2c(bArr, i10, i11);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m1517sortAa5vz7o(@NotNull short[] sort, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, f2.v(sort));
        UArraySortingKt.m897sortArrayAa5vz7o(sort, i10, i11);
    }

    /* JADX INFO: renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m1518sortAa5vz7o$default(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = f2.v(sArr);
        }
        m1517sortAa5vz7o(sArr, i10, i11);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m1519sortGBYM_sE(@NotNull byte[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (r1.v(sort) > 1) {
            UArraySortingKt.m896sortArray4UcCI2c(sort, 0, r1.v(sort));
        }
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m1520sortQwZRm1k(@NotNull long[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (z1.v(sort) > 1) {
            UArraySortingKt.m895sortArraynroSd4(sort, 0, z1.v(sort));
        }
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m1521sortoBK06Vg(@NotNull int[] sort, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, v1.v(sort));
        UArraySortingKt.m898sortArrayoBK06Vg(sort, i10, i11);
    }

    /* JADX INFO: renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m1522sortoBK06Vg$default(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = v1.v(iArr);
        }
        m1521sortoBK06Vg(iArr, i10, i11);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m1523sortrL5Bavg(@NotNull short[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (f2.v(sort) > 1) {
            UArraySortingKt.m897sortArrayAa5vz7o(sort, 0, f2.v(sort));
        }
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m1524sortDescendingajY9A(@NotNull int[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (v1.v(sortDescending) > 1) {
            m1512sortajY9A(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m1525sortDescendingnroSd4(@NotNull long[] sortDescending, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1513sortnroSd4(sortDescending, i10, i11);
        ArraysKt.reverse(sortDescending, i10, i11);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m1526sortDescending4UcCI2c(@NotNull byte[] sortDescending, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1515sort4UcCI2c(sortDescending, i10, i11);
        ArraysKt.reverse(sortDescending, i10, i11);
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m1527sortDescendingAa5vz7o(@NotNull short[] sortDescending, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1517sortAa5vz7o(sortDescending, i10, i11);
        ArraysKt.reverse(sortDescending, i10, i11);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m1528sortDescendingGBYM_sE(@NotNull byte[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (r1.v(sortDescending) > 1) {
            m1519sortGBYM_sE(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m1529sortDescendingQwZRm1k(@NotNull long[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (z1.v(sortDescending) > 1) {
            m1520sortQwZRm1k(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @e1(version = "1.4")
    @u
    /* JADX INFO: renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m1530sortDescendingoBK06Vg(@NotNull int[] sortDescending, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1521sortoBK06Vg(sortDescending, i10, i11);
        ArraysKt.reverse(sortDescending, i10, i11);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m1531sortDescendingrL5Bavg(@NotNull short[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (f2.v(sortDescending) > 1) {
            m1523sortrL5Bavg(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<u1> m1532sortedajY9A(@NotNull int[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        int[] iArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrK = v1.k(iArrCopyOf);
        m1512sortajY9A(iArrK);
        return UArraysKt___UArraysJvmKt.m900asListajY9A(iArrK);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<q1> m1533sortedGBYM_sE(@NotNull byte[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        byte[] bArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrK = r1.k(bArrCopyOf);
        m1519sortGBYM_sE(bArrK);
        return UArraysKt___UArraysJvmKt.m901asListGBYM_sE(bArrK);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<y1> m1534sortedQwZRm1k(@NotNull long[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        long[] jArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrK = z1.k(jArrCopyOf);
        m1520sortQwZRm1k(jArrK);
        return UArraysKt___UArraysJvmKt.m902asListQwZRm1k(jArrK);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<e2> m1535sortedrL5Bavg(@NotNull short[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        short[] sArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrK = f2.k(sArrCopyOf);
        m1523sortrL5Bavg(sArrK);
        return UArraysKt___UArraysJvmKt.m903asListrL5Bavg(sArrK);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m1536sortedArrayajY9A(@NotNull int[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (v1.B(sortedArray)) {
            return sortedArray;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrK = v1.k(iArrCopyOf);
        m1512sortajY9A(iArrK);
        return iArrK;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m1537sortedArrayGBYM_sE(@NotNull byte[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (r1.B(sortedArray)) {
            return sortedArray;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrK = r1.k(bArrCopyOf);
        m1519sortGBYM_sE(bArrK);
        return bArrK;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m1538sortedArrayQwZRm1k(@NotNull long[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (z1.B(sortedArray)) {
            return sortedArray;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrK = z1.k(jArrCopyOf);
        m1520sortQwZRm1k(jArrK);
        return jArrK;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m1539sortedArrayrL5Bavg(@NotNull short[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (f2.B(sortedArray)) {
            return sortedArray;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrK = f2.k(sArrCopyOf);
        m1523sortrL5Bavg(sArrK);
        return sArrK;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m1540sortedArrayDescendingajY9A(@NotNull int[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (v1.B(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrK = v1.k(iArrCopyOf);
        m1524sortDescendingajY9A(iArrK);
        return iArrK;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m1541sortedArrayDescendingGBYM_sE(@NotNull byte[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (r1.B(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrK = r1.k(bArrCopyOf);
        m1528sortDescendingGBYM_sE(bArrK);
        return bArrK;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m1542sortedArrayDescendingQwZRm1k(@NotNull long[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (z1.B(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrK = z1.k(jArrCopyOf);
        m1529sortDescendingQwZRm1k(jArrK);
        return jArrK;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m1543sortedArrayDescendingrL5Bavg(@NotNull short[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (f2.B(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrK = f2.k(sArrCopyOf);
        m1531sortDescendingrL5Bavg(sArrK);
        return sArrK;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<u1> m1544sortedDescendingajY9A(@NotNull int[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] iArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrK = v1.k(iArrCopyOf);
        m1512sortajY9A(iArrK);
        return m1440reversedajY9A(iArrK);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<q1> m1545sortedDescendingGBYM_sE(@NotNull byte[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] bArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrK = r1.k(bArrCopyOf);
        m1519sortGBYM_sE(bArrK);
        return m1441reversedGBYM_sE(bArrK);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<y1> m1546sortedDescendingQwZRm1k(@NotNull long[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] jArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrK = z1.k(jArrCopyOf);
        m1520sortQwZRm1k(jArrK);
        return m1442reversedQwZRm1k(jArrK);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<e2> m1547sortedDescendingrL5Bavg(@NotNull short[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] sArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrK = f2.k(sArrCopyOf);
        m1523sortrL5Bavg(sArrK);
        return m1443reversedrL5Bavg(sArrK);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: sum--ajY-9A, reason: not valid java name */
    private static final int m1548sumajY9A(int[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        return u1.n(ArraysKt.sum(sum));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: sum-GBYM_sE, reason: not valid java name */
    private static final int m1549sumGBYM_sE(byte[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int iN = u1.n(0);
        int iV = r1.v(sum);
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + u1.n(r1.t(sum, i10) & 255));
        }
        return iN;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: sum-QwZRm1k, reason: not valid java name */
    private static final long m1550sumQwZRm1k(long[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        return y1.n(ArraysKt.sum(sum));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: sum-rL5Bavg, reason: not valid java name */
    private static final int m1551sumrL5Bavg(short[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int iN = u1.n(0);
        int iV = f2.v(sum);
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + u1.n(f2.t(sum, i10) & e2.f312492d));
        }
        return iN;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @e1(version = "1.3")
    @kotlin.m(warningSince = "1.5")
    @u
    @f
    /* JADX INFO: renamed from: sumBy-JOV_ifY, reason: not valid java name */
    private static final int m1552sumByJOV_ifY(byte[] sumBy, Function1<? super q1, u1> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = r1.v(sumBy);
        int iN = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + selector.invoke(q1.c(r1.t(sumBy, i10))).z0());
        }
        return iN;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @e1(version = "1.3")
    @kotlin.m(warningSince = "1.5")
    @u
    @f
    /* JADX INFO: renamed from: sumBy-MShoTSo, reason: not valid java name */
    private static final int m1553sumByMShoTSo(long[] sumBy, Function1<? super y1, u1> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = z1.v(sumBy);
        int iN = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + selector.invoke(y1.c(z1.t(sumBy, i10))).z0());
        }
        return iN;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @e1(version = "1.3")
    @kotlin.m(warningSince = "1.5")
    @u
    @f
    /* JADX INFO: renamed from: sumBy-jgv0xPQ, reason: not valid java name */
    private static final int m1554sumByjgv0xPQ(int[] sumBy, Function1<? super u1, u1> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = v1.v(sumBy);
        int iN = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + selector.invoke(u1.c(v1.t(sumBy, i10))).z0());
        }
        return iN;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @e1(version = "1.3")
    @kotlin.m(warningSince = "1.5")
    @u
    @f
    /* JADX INFO: renamed from: sumBy-xTcfx_M, reason: not valid java name */
    private static final int m1555sumByxTcfx_M(short[] sumBy, Function1<? super e2, u1> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = f2.v(sumBy);
        int iN = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + selector.invoke(e2.c(f2.t(sumBy, i10))).z0());
        }
        return iN;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @e1(version = "1.3")
    @kotlin.m(warningSince = "1.5")
    @u
    @f
    /* JADX INFO: renamed from: sumByDouble-JOV_ifY, reason: not valid java name */
    private static final double m1556sumByDoubleJOV_ifY(byte[] sumByDouble, Function1<? super q1, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = r1.v(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(q1.c(r1.t(sumByDouble, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @e1(version = "1.3")
    @kotlin.m(warningSince = "1.5")
    @u
    @f
    /* JADX INFO: renamed from: sumByDouble-MShoTSo, reason: not valid java name */
    private static final double m1557sumByDoubleMShoTSo(long[] sumByDouble, Function1<? super y1, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = z1.v(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(y1.c(z1.t(sumByDouble, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @e1(version = "1.3")
    @kotlin.m(warningSince = "1.5")
    @u
    @f
    /* JADX INFO: renamed from: sumByDouble-jgv0xPQ, reason: not valid java name */
    private static final double m1558sumByDoublejgv0xPQ(int[] sumByDouble, Function1<? super u1, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = v1.v(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(u1.c(v1.t(sumByDouble, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @e1(version = "1.3")
    @kotlin.m(warningSince = "1.5")
    @u
    @f
    /* JADX INFO: renamed from: sumByDouble-xTcfx_M, reason: not valid java name */
    private static final double m1559sumByDoublexTcfx_M(short[] sumByDouble, Function1<? super e2, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = f2.v(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(e2.c(f2.t(sumByDouble, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfDouble")
    private static final double sumOfDouble(int[] sumOf, Function1<? super u1, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = v1.v(sumOf);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(u1.c(v1.t(sumOf, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfInt")
    private static final int sumOfInt(int[] sumOf, Function1<? super u1, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = v1.v(sumOf);
        int iIntValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iIntValue += selector.invoke(u1.c(v1.t(sumOf, i10))).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfLong")
    private static final long sumOfLong(int[] sumOf, Function1<? super u1, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = v1.v(sumOf);
        long jLongValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            jLongValue += selector.invoke(u1.c(v1.t(sumOf, i10))).longValue();
        }
        return jLongValue;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @i(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull q1[] q1VarArr) {
        Intrinsics.checkNotNullParameter(q1VarArr, "<this>");
        int iN = 0;
        for (q1 q1Var : q1VarArr) {
            iN = u1.n(iN + u1.n(q1Var.x0() & 255));
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @u
    @f
    @i(name = "sumOfUInt")
    private static final int sumOfUInt(int[] sumOf, Function1<? super u1, u1> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        int iV = v1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + selector.invoke(u1.c(v1.t(sumOf, i10))).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @u
    @f
    @i(name = "sumOfULong")
    private static final long sumOfULong(int[] sumOf, Function1<? super u1, y1> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        int iV = v1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            jN = y1.n(jN + selector.invoke(u1.c(v1.t(sumOf, i10))).z0());
        }
        return jN;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @i(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull e2[] e2VarArr) {
        Intrinsics.checkNotNullParameter(e2VarArr, "<this>");
        int iN = 0;
        for (e2 e2Var : e2VarArr) {
            iN = u1.n(iN + u1.n(e2Var.x0() & e2.f312492d));
        }
        return iN;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<q1> m1560takePpDY95g(@NotNull byte[] take, int i10) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        if (i10 >= r1.v(take)) {
            return CollectionsKt.toList(r1.d(take));
        }
        if (i10 == 1) {
            return CollectionsKt.listOf(q1.c(r1.t(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iV = r1.v(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iV; i12++) {
            arrayList.add(q1.c(r1.t(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<e2> m1561takenggk6HY(@NotNull short[] take, int i10) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        if (i10 >= f2.v(take)) {
            return CollectionsKt.toList(f2.d(take));
        }
        if (i10 == 1) {
            return CollectionsKt.listOf(e2.c(f2.t(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iV = f2.v(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iV; i12++) {
            arrayList.add(e2.c(f2.t(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: take-qFRl0hI, reason: not valid java name */
    public static List<u1> m1562takeqFRl0hI(@NotNull int[] take, int i10) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        if (i10 >= v1.v(take)) {
            return CollectionsKt.toList(v1.d(take));
        }
        if (i10 == 1) {
            return CollectionsKt.listOf(u1.c(v1.t(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iV = v1.v(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iV; i12++) {
            arrayList.add(u1.c(v1.t(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: take-r7IrZao, reason: not valid java name */
    public static List<y1> m1563taker7IrZao(@NotNull long[] take, int i10) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        if (i10 >= z1.v(take)) {
            return CollectionsKt.toList(z1.d(take));
        }
        if (i10 == 1) {
            return CollectionsKt.listOf(y1.c(z1.t(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iV = z1.v(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iV; i12++) {
            arrayList.add(y1.c(z1.t(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<q1> m1564takeLastPpDY95g(@NotNull byte[] takeLast, int i10) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        int iV = r1.v(takeLast);
        if (i10 >= iV) {
            return CollectionsKt.toList(r1.d(takeLast));
        }
        if (i10 == 1) {
            return CollectionsKt.listOf(q1.c(r1.t(takeLast, iV - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iV - i10; i11 < iV; i11++) {
            arrayList.add(q1.c(r1.t(takeLast, i11)));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<e2> m1565takeLastnggk6HY(@NotNull short[] takeLast, int i10) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        int iV = f2.v(takeLast);
        if (i10 >= iV) {
            return CollectionsKt.toList(f2.d(takeLast));
        }
        if (i10 == 1) {
            return CollectionsKt.listOf(e2.c(f2.t(takeLast, iV - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iV - i10; i11 < iV; i11++) {
            arrayList.add(e2.c(f2.t(takeLast, i11)));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<u1> m1566takeLastqFRl0hI(@NotNull int[] takeLast, int i10) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        int iV = v1.v(takeLast);
        if (i10 >= iV) {
            return CollectionsKt.toList(v1.d(takeLast));
        }
        if (i10 == 1) {
            return CollectionsKt.listOf(u1.c(v1.t(takeLast, iV - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iV - i10; i11 < iV; i11++) {
            arrayList.add(u1.c(v1.t(takeLast, i11)));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<y1> m1567takeLastr7IrZao(@NotNull long[] takeLast, int i10) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        int iV = z1.v(takeLast);
        if (i10 >= iV) {
            return CollectionsKt.toList(z1.d(takeLast));
        }
        if (i10 == 1) {
            return CollectionsKt.listOf(y1.c(z1.t(takeLast, iV - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iV - i10; i11 < iV; i11++) {
            arrayList.add(y1.c(z1.t(takeLast, i11)));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: takeLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<q1> m1568takeLastWhileJOV_ifY(byte[] takeLastWhile, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(q1.c(r1.t(takeLastWhile, lastIndex))).booleanValue()) {
                return m1036dropPpDY95g(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.toList(r1.d(takeLastWhile));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: takeLastWhile-MShoTSo, reason: not valid java name */
    private static final List<y1> m1569takeLastWhileMShoTSo(long[] takeLastWhile, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(y1.c(z1.t(takeLastWhile, lastIndex))).booleanValue()) {
                return m1039dropr7IrZao(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.toList(z1.d(takeLastWhile));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: takeLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<u1> m1570takeLastWhilejgv0xPQ(int[] takeLastWhile, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(u1.c(v1.t(takeLastWhile, lastIndex))).booleanValue()) {
                return m1038dropqFRl0hI(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.toList(v1.d(takeLastWhile));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: takeLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<e2> m1571takeLastWhilexTcfx_M(short[] takeLastWhile, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(e2.c(f2.t(takeLastWhile, lastIndex))).booleanValue()) {
                return m1037dropnggk6HY(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.toList(f2.d(takeLastWhile));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: takeWhile-JOV_ifY, reason: not valid java name */
    private static final List<q1> m1572takeWhileJOV_ifY(byte[] takeWhile, Function1<? super q1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = r1.v(takeWhile);
        int i10 = 3 ^ 0;
        for (int i11 = 0; i11 < iV; i11++) {
            byte bT = r1.t(takeWhile, i11);
            if (!predicate.invoke(q1.c(bT)).booleanValue()) {
                break;
            }
            arrayList.add(q1.c(bT));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: takeWhile-MShoTSo, reason: not valid java name */
    private static final List<y1> m1573takeWhileMShoTSo(long[] takeWhile, Function1<? super y1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = z1.v(takeWhile);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(takeWhile, i10);
            if (!predicate.invoke(y1.c(jT)).booleanValue()) {
                break;
            }
            arrayList.add(y1.c(jT));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: takeWhile-jgv0xPQ, reason: not valid java name */
    private static final List<u1> m1574takeWhilejgv0xPQ(int[] takeWhile, Function1<? super u1, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = v1.v(takeWhile);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(takeWhile, i10);
            if (!predicate.invoke(u1.c(iT)).booleanValue()) {
                break;
            }
            arrayList.add(u1.c(iT));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: takeWhile-xTcfx_M, reason: not valid java name */
    private static final List<e2> m1575takeWhilexTcfx_M(short[] takeWhile, Function1<? super e2, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = f2.v(takeWhile);
        int i10 = 4 | 0;
        for (int i11 = 0; i11 < iV; i11++) {
            short sT = f2.t(takeWhile, i11);
            if (!predicate.invoke(e2.c(sT)).booleanValue()) {
                break;
            }
            arrayList.add(e2.c(sT));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: toByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m1576toByteArrayGBYM_sE(byte[] toByteArray) {
        Intrinsics.checkNotNullParameter(toByteArray, "$this$toByteArray");
        byte[] bArrCopyOf = Arrays.copyOf(toByteArray, toByteArray.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: toIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m1577toIntArrayajY9A(int[] toIntArray) {
        Intrinsics.checkNotNullParameter(toIntArray, "$this$toIntArray");
        int[] iArrCopyOf = Arrays.copyOf(toIntArray, toIntArray.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: toLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m1578toLongArrayQwZRm1k(long[] toLongArray) {
        Intrinsics.checkNotNullParameter(toLongArray, "$this$toLongArray");
        long[] jArrCopyOf = Arrays.copyOf(toLongArray, toLongArray.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: toShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m1579toShortArrayrL5Bavg(short[] toShortArray) {
        Intrinsics.checkNotNullParameter(toShortArray, "$this$toShortArray");
        short[] sArrCopyOf = Arrays.copyOf(toShortArray, toShortArray.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final u1[] m1580toTypedArrayajY9A(@NotNull int[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iV = v1.v(toTypedArray);
        u1[] u1VarArr = new u1[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            u1VarArr[i10] = u1.c(v1.t(toTypedArray, i10));
        }
        return u1VarArr;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final q1[] m1581toTypedArrayGBYM_sE(@NotNull byte[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iV = r1.v(toTypedArray);
        q1[] q1VarArr = new q1[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            q1VarArr[i10] = q1.c(r1.t(toTypedArray, i10));
        }
        return q1VarArr;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final y1[] m1582toTypedArrayQwZRm1k(@NotNull long[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iV = z1.v(toTypedArray);
        y1[] y1VarArr = new y1[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            y1VarArr[i10] = y1.c(z1.t(toTypedArray, i10));
        }
        return y1VarArr;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final e2[] m1583toTypedArrayrL5Bavg(@NotNull short[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iV = f2.v(toTypedArray);
        e2[] e2VarArr = new e2[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            e2VarArr[i10] = e2.c(f2.t(toTypedArray, i10));
        }
        return e2VarArr;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static final byte[] toUByteArray(@NotNull q1[] q1VarArr) {
        Intrinsics.checkNotNullParameter(q1VarArr, "<this>");
        int length = q1VarArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = q1VarArr[i10].x0();
        }
        return r1.k(bArr);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static final int[] toUIntArray(@NotNull u1[] u1VarArr) {
        Intrinsics.checkNotNullParameter(u1VarArr, "<this>");
        int length = u1VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = u1VarArr[i10].z0();
        }
        return v1.k(iArr);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static final long[] toULongArray(@NotNull y1[] y1VarArr) {
        Intrinsics.checkNotNullParameter(y1VarArr, "<this>");
        int length = y1VarArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = y1VarArr[i10].z0();
        }
        return z1.k(jArr);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static final short[] toUShortArray(@NotNull e2[] e2VarArr) {
        Intrinsics.checkNotNullParameter(e2VarArr, "<this>");
        int length = e2VarArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = e2VarArr[i10].x0();
        }
        return f2.k(sArr);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<IndexedValue<u1>> m1584withIndexajY9A(@NotNull int[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new UArraysKt___UArraysKt$withIndex$1(withIndex));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<IndexedValue<q1>> m1585withIndexGBYM_sE(@NotNull byte[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new UArraysKt___UArraysKt$withIndex$3(withIndex));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<IndexedValue<y1>> m1586withIndexQwZRm1k(@NotNull long[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new UArraysKt___UArraysKt$withIndex$2(withIndex));
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<IndexedValue<e2>> m1587withIndexrL5Bavg(@NotNull short[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new UArraysKt___UArraysKt$withIndex$4(withIndex));
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-7znnbtw, reason: not valid java name */
    private static final <R, V> List<V> m1588zip7znnbtw(int[] zip, Iterable<? extends R> other, Function2<? super u1, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = v1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(transform.invoke(u1.c(v1.t(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-8LME4QE, reason: not valid java name */
    private static final <R, V> List<V> m1589zip8LME4QE(long[] zip, R[] other, Function2<? super y1, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(z1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(y1.c(z1.t(zip, i10)), other[i10]));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<Pair<u1, R>> m1590zipCE_24M(@NotNull int[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(v1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iT = v1.t(zip, i10);
            arrayList.add(TuplesKt.to(u1.c(iT), other[i10]));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<Pair<y1, R>> m1591zipF7u83W8(@NotNull long[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = z1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(TuplesKt.to(y1.c(z1.t(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<Pair<u1, R>> m1592zipHwE9HBo(@NotNull int[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = v1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(TuplesKt.to(u1.c(v1.t(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-JAKpvQM, reason: not valid java name */
    private static final <V> List<V> m1593zipJAKpvQM(byte[] zip, byte[] other, Function2<? super q1, ? super q1, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(r1.v(zip), r1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(q1.c(r1.t(zip, i10)), q1.c(r1.t(other, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<Pair<e2, R>> m1594zipJGPC0M(@NotNull short[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = f2.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(TuplesKt.to(e2.c(f2.t(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<Pair<q1, R>> m1595zipJQknh5Q(@NotNull byte[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = r1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(TuplesKt.to(q1.c(r1.t(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-L83TJbI, reason: not valid java name */
    private static final <V> List<V> m1596zipL83TJbI(int[] zip, int[] other, Function2<? super u1, ? super u1, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(v1.v(zip), v1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(u1.c(v1.t(zip, i10)), u1.c(v1.t(other, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-LuipOMY, reason: not valid java name */
    private static final <R, V> List<V> m1597zipLuipOMY(byte[] zip, R[] other, Function2<? super q1, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(r1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(q1.c(r1.t(zip, i10)), other[i10]));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-PabeH-Q, reason: not valid java name */
    private static final <V> List<V> m1598zipPabeHQ(long[] zip, long[] other, Function2<? super y1, ? super y1, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(z1.v(zip), z1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(y1.c(z1.t(zip, i10)), y1.c(z1.t(other, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-TUPTUsU, reason: not valid java name */
    private static final <R, V> List<V> m1599zipTUPTUsU(long[] zip, Iterable<? extends R> other, Function2<? super y1, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = z1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(transform.invoke(y1.c(z1.t(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-UCnP4_w, reason: not valid java name */
    private static final <R, V> List<V> m1600zipUCnP4_w(byte[] zip, Iterable<? extends R> other, Function2<? super q1, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = r1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(transform.invoke(q1.c(r1.t(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-ZjwqOic, reason: not valid java name */
    private static final <R, V> List<V> m1601zipZjwqOic(int[] zip, R[] other, Function2<? super u1, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(v1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(u1.c(v1.t(zip, i10)), other[i10]));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<Pair<u1, u1>> m1602zipctEhBpI(@NotNull int[] zip, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(v1.v(zip), v1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(u1.c(v1.t(zip, i10)), u1.c(v1.t(other, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-ePBmRWY, reason: not valid java name */
    private static final <R, V> List<V> m1603zipePBmRWY(short[] zip, R[] other, Function2<? super e2, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(f2.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(e2.c(f2.t(zip, i10)), other[i10]));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<Pair<y1, R>> m1604zipf7H3mmw(@NotNull long[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(z1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            long jT = z1.t(zip, i10);
            arrayList.add(TuplesKt.to(y1.c(jT), other[i10]));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-gVVukQo, reason: not valid java name */
    private static final <V> List<V> m1605zipgVVukQo(short[] zip, short[] other, Function2<? super e2, ? super e2, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(f2.v(zip), f2.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(e2.c(f2.t(zip, i10)), e2.c(f2.t(other, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: zip-kBb4a-s, reason: not valid java name */
    private static final <R, V> List<V> m1606zipkBb4as(short[] zip, Iterable<? extends R> other, Function2<? super e2, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iV = f2.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(transform.invoke(e2.c(f2.t(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<Pair<q1, q1>> m1607zipkdPth3s(@NotNull byte[] zip, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(r1.v(zip), r1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(q1.c(r1.t(zip, i10)), q1.c(r1.t(other, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<Pair<e2, e2>> m1608zipmazbYpA(@NotNull short[] zip, @NotNull short[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(f2.v(zip), f2.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(e2.c(f2.t(zip, i10)), e2.c(f2.t(other, i10))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<Pair<q1, R>> m1609zipnl983wc(@NotNull byte[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(r1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte bT = r1.t(zip, i10);
            arrayList.add(TuplesKt.to(q1.c(bT), other[i10]));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<Pair<e2, R>> m1610zipuaTIQ5s(@NotNull short[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(f2.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            short sT = f2.t(zip, i10);
            arrayList.add(TuplesKt.to(e2.c(sT), other[i10]));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<Pair<y1, y1>> m1611zipus8wMrg(@NotNull long[] zip, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(z1.v(zip), z1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        int i10 = 7 << 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            arrayList.add(TuplesKt.to(y1.c(z1.t(zip, i11)), y1.c(z1.t(other, i11))));
        }
        return arrayList;
    }

    @e1(version = "1.3")
    @f
    @u
    private static final byte[] toUByteArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return r1.k(bArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    private static final int[] toUIntArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return v1.k(iArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    private static final long[] toULongArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return z1.k(jArrCopyOf);
    }

    @e1(version = "1.3")
    @f
    @u
    private static final short[] toUShortArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return f2.k(sArrCopyOf);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfDouble")
    private static final double sumOfDouble(long[] sumOf, Function1<? super y1, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = z1.v(sumOf);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(y1.c(z1.t(sumOf, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfInt")
    private static final int sumOfInt(long[] sumOf, Function1<? super y1, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = z1.v(sumOf);
        int iIntValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iIntValue += selector.invoke(y1.c(z1.t(sumOf, i10))).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfLong")
    private static final long sumOfLong(long[] sumOf, Function1<? super y1, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = z1.v(sumOf);
        long jLongValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            jLongValue += selector.invoke(y1.c(z1.t(sumOf, i10))).longValue();
        }
        return jLongValue;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @u
    @f
    @i(name = "sumOfUInt")
    private static final int sumOfUInt(long[] sumOf, Function1<? super y1, u1> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        int iV = z1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + selector.invoke(y1.c(z1.t(sumOf, i10))).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @u
    @f
    @i(name = "sumOfULong")
    private static final long sumOfULong(long[] sumOf, Function1<? super y1, y1> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        int iV = z1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            jN = y1.n(jN + selector.invoke(y1.c(z1.t(sumOf, i10))).z0());
        }
        return jN;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfDouble")
    private static final double sumOfDouble(byte[] sumOf, Function1<? super q1, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = r1.v(sumOf);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(q1.c(r1.t(sumOf, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfInt")
    private static final int sumOfInt(byte[] sumOf, Function1<? super q1, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = r1.v(sumOf);
        int iIntValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iIntValue += selector.invoke(q1.c(r1.t(sumOf, i10))).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfLong")
    private static final long sumOfLong(byte[] sumOf, Function1<? super q1, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = r1.v(sumOf);
        long jLongValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            jLongValue += selector.invoke(q1.c(r1.t(sumOf, i10))).longValue();
        }
        return jLongValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final float m1253maxOfJOV_ifY(byte[] maxOf, Function1<? super q1, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(q1.c(r1.t(maxOf, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(q1.c(r1.t(maxOf, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final float m1256maxOfMShoTSo(long[] maxOf, Function1<? super y1, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!z1.B(maxOf)) {
            float fFloatValue = selector.invoke(y1.c(z1.t(maxOf, 0))).floatValue();
            int lastIndex = ArraysKt.getLastIndex(maxOf);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke(y1.c(z1.t(maxOf, i10))).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final float m1259maxOfjgv0xPQ(int[] maxOf, Function1<? super u1, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(u1.c(v1.t(maxOf, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(u1.c(v1.t(maxOf, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final float m1262maxOfxTcfx_M(short[] maxOf, Function1<? super e2, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!f2.B(maxOf)) {
            int i10 = 7 & 0;
            float fFloatValue = selector.invoke(e2.c(f2.t(maxOf, 0))).floatValue();
            int lastIndex = ArraysKt.getLastIndex(maxOf);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke(e2.c(f2.t(maxOf, i11))).floatValue());
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m1266maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super q1, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(q1.c(r1.t(maxOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(q1.c(r1.t(maxOfOrNull, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m1269maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super y1, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(y1.c(z1.t(maxOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(y1.c(z1.t(maxOfOrNull, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m1272maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super u1, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(u1.c(v1.t(maxOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(u1.c(v1.t(maxOfOrNull, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m1275maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super e2, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(e2.c(f2.t(maxOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(e2.c(f2.t(maxOfOrNull, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @e1(version = "1.7")
    @u
    @i(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final long m1290maxOrThrowU(@NotNull long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!z1.B(max)) {
            long jT = z1.t(max, 0);
            int lastIndex = ArraysKt.getLastIndex(max);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jT2 = z1.t(max, i10);
                    if (Long.compareUnsigned(jT, jT2) < 0) {
                        jT = jT2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return jT;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @u
    @i(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final long m1298maxWithOrThrowU(@NotNull long[] maxWith, @NotNull Comparator<? super y1> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (z1.B(maxWith)) {
            throw new NoSuchElementException();
        }
        long jT = z1.t(maxWith, 0);
        int lastIndex = ArraysKt.getLastIndex(maxWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jT2 = z1.t(maxWith, i10);
                if (comparator.compare(y1.c(jT), y1.c(jT2)) < 0) {
                    jT = jT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return jT;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final float m1309minOfJOV_ifY(byte[] minOf, Function1<? super q1, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!r1.B(minOf)) {
            float fFloatValue = selector.invoke(q1.c(r1.t(minOf, 0))).floatValue();
            int lastIndex = ArraysKt.getLastIndex(minOf);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke(q1.c(r1.t(minOf, i10))).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final float m1312minOfMShoTSo(long[] minOf, Function1<? super y1, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(y1.c(z1.t(minOf, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(minOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(y1.c(z1.t(minOf, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final float m1315minOfjgv0xPQ(int[] minOf, Function1<? super u1, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!v1.B(minOf)) {
            float fFloatValue = selector.invoke(u1.c(v1.t(minOf, 0))).floatValue();
            int lastIndex = ArraysKt.getLastIndex(minOf);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke(u1.c(v1.t(minOf, i10))).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final float m1318minOfxTcfx_M(short[] minOf, Function1<? super e2, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(e2.c(f2.t(minOf, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(minOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(e2.c(f2.t(minOf, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m1322minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super q1, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(q1.c(r1.t(minOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(q1.c(r1.t(minOfOrNull, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m1325minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super y1, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(y1.c(z1.t(minOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(y1.c(z1.t(minOfOrNull, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m1328minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super u1, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(u1.c(v1.t(minOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(u1.c(v1.t(minOfOrNull, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m1331minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super e2, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(e2.c(f2.t(minOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(e2.c(f2.t(minOfOrNull, i10))).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @e1(version = "1.7")
    @u
    @i(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final long m1346minOrThrowU(@NotNull long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!z1.B(min)) {
            long jT = z1.t(min, 0);
            int lastIndex = ArraysKt.getLastIndex(min);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jT2 = z1.t(min, i10);
                    if (Long.compareUnsigned(jT, jT2) > 0) {
                        jT = jT2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return jT;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @u
    @i(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final long m1354minWithOrThrowU(@NotNull long[] minWith, @NotNull Comparator<? super y1> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!z1.B(minWith)) {
            long jT = z1.t(minWith, 0);
            int lastIndex = ArraysKt.getLastIndex(minWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jT2 = z1.t(minWith, i10);
                    if (comparator.compare(y1.c(jT), y1.c(jT2)) > 0) {
                        jT = jT2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return jT;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfDouble")
    private static final double sumOfDouble(short[] sumOf, Function1<? super e2, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = f2.v(sumOf);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(e2.c(f2.t(sumOf, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfInt")
    private static final int sumOfInt(short[] sumOf, Function1<? super e2, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = f2.v(sumOf);
        int iIntValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iIntValue += selector.invoke(e2.c(f2.t(sumOf, i10))).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfLong")
    private static final long sumOfLong(short[] sumOf, Function1<? super e2, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iV = f2.v(sumOf);
        long jLongValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            jLongValue += selector.invoke(e2.c(f2.t(sumOf, i10))).longValue();
        }
        return jLongValue;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @u
    @f
    @i(name = "sumOfUInt")
    private static final int sumOfUInt(byte[] sumOf, Function1<? super q1, u1> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        int iV = r1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + selector.invoke(q1.c(r1.t(sumOf, i10))).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @u
    @f
    @i(name = "sumOfULong")
    private static final long sumOfULong(byte[] sumOf, Function1<? super q1, y1> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        int iV = r1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            jN = y1.n(jN + selector.invoke(q1.c(r1.t(sumOf, i10))).z0());
        }
        return jN;
    }

    @e1(version = "1.7")
    @u
    @f
    @i(name = "maxByOrThrow-U")
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m1250maxByOrThrowU(long[] maxBy, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!z1.B(maxBy)) {
            int i10 = 3 >> 0;
            long jT = z1.t(maxBy, 0);
            int lastIndex = ArraysKt.getLastIndex(maxBy);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(y1.c(jT));
                int i11 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        long jT2 = z1.t(maxBy, i11);
                        R rInvoke2 = selector.invoke(y1.c(jT2));
                        if (rInvoke.compareTo(rInvoke2) < 0) {
                            jT = jT2;
                            rInvoke = rInvoke2;
                        }
                        if (i11 == lastIndex) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            return jT;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @u
    @f
    @i(name = "minByOrThrow-U")
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m1306minByOrThrowU(long[] minBy, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!z1.B(minBy)) {
            long jT = z1.t(minBy, 0);
            int lastIndex = ArraysKt.getLastIndex(minBy);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(y1.c(jT));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        long jT2 = z1.t(minBy, i10);
                        R rInvoke2 = selector.invoke(y1.c(jT2));
                        if (rInvoke.compareTo(rInvoke2) > 0) {
                            jT = jT2;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return jT;
        }
        throw new NoSuchElementException();
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @u
    @f
    @i(name = "sumOfUInt")
    private static final int sumOfUInt(short[] sumOf, Function1<? super e2, u1> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        int iV = f2.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            iN = u1.n(iN + selector.invoke(e2.c(f2.t(sumOf, i10))).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @u
    @f
    @i(name = "sumOfULong")
    private static final long sumOfULong(short[] sumOf, Function1<? super e2, y1> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        int iV = f2.v(sumOf);
        int i10 = 2 & 0;
        for (int i11 = 0; i11 < iV; i11++) {
            jN = y1.n(jN + selector.invoke(e2.c(f2.t(sumOf, i11))).z0());
        }
        return jN;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1254maxOfJOV_ifY(byte[] maxOf, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(q1.c(r1.t(maxOf, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(q1.c(r1.t(maxOf, i10)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1257maxOfMShoTSo(long[] maxOf, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(y1.c(z1.t(maxOf, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(y1.c(z1.t(maxOf, i10)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1260maxOfjgv0xPQ(int[] maxOf, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!v1.B(maxOf)) {
            int i10 = 6 ^ 0;
            R rInvoke = selector.invoke(u1.c(v1.t(maxOf, 0)));
            int lastIndex = ArraysKt.getLastIndex(maxOf);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(u1.c(v1.t(maxOf, i11)));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1263maxOfxTcfx_M(short[] maxOf, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(e2.c(f2.t(maxOf, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(e2.c(f2.t(maxOf, i10)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1264maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(q1.c(r1.t(maxOfOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(q1.c(r1.t(maxOfOrNull, i10)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1267maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(y1.c(z1.t(maxOfOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        boolean z10 = true | true;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(y1.c(z1.t(maxOfOrNull, i10)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1270maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(u1.c(v1.t(maxOfOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(u1.c(v1.t(maxOfOrNull, i10)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1273maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(e2.c(f2.t(maxOfOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(e2.c(f2.t(maxOfOrNull, i10)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.7")
    @u
    @i(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final byte m1288maxOrThrowU(@NotNull byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!r1.B(max)) {
            byte bT = r1.t(max, 0);
            int lastIndex = ArraysKt.getLastIndex(max);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bT2 = r1.t(max, i10);
                    if (Intrinsics.compare(bT & 255, bT2 & 255) < 0) {
                        bT = bT2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return bT;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @u
    @i(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final byte m1296maxWithOrThrowU(@NotNull byte[] maxWith, @NotNull Comparator<? super q1> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!r1.B(maxWith)) {
            byte bT = r1.t(maxWith, 0);
            int lastIndex = ArraysKt.getLastIndex(maxWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bT2 = r1.t(maxWith, i10);
                    if (comparator.compare(q1.c(bT), q1.c(bT2)) < 0) {
                        bT = bT2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return bT;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1310minOfJOV_ifY(byte[] minOf, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!r1.B(minOf)) {
            R rInvoke = selector.invoke(q1.c(r1.t(minOf, 0)));
            int lastIndex = ArraysKt.getLastIndex(minOf);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(q1.c(r1.t(minOf, i10)));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1313minOfMShoTSo(long[] minOf, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!z1.B(minOf)) {
            R rInvoke = selector.invoke(y1.c(z1.t(minOf, 0)));
            int lastIndex = ArraysKt.getLastIndex(minOf);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(y1.c(z1.t(minOf, i10)));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1316minOfjgv0xPQ(int[] minOf, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!v1.B(minOf)) {
            R rInvoke = selector.invoke(u1.c(v1.t(minOf, 0)));
            int lastIndex = ArraysKt.getLastIndex(minOf);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(u1.c(v1.t(minOf, i10)));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1319minOfxTcfx_M(short[] minOf, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(e2.c(f2.t(minOf, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOf);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(e2.c(f2.t(minOf, i10)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1320minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(q1.c(r1.t(minOfOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(q1.c(r1.t(minOfOrNull, i10)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1323minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(y1.c(z1.t(minOfOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(y1.c(z1.t(minOfOrNull, i10)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1326minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(u1.c(v1.t(minOfOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(u1.c(v1.t(minOfOrNull, i10)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1329minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(e2.c(f2.t(minOfOrNull, 0)));
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(e2.c(f2.t(minOfOrNull, i10)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.7")
    @u
    @i(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final byte m1344minOrThrowU(@NotNull byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!r1.B(min)) {
            byte bT = r1.t(min, 0);
            int lastIndex = ArraysKt.getLastIndex(min);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bT2 = r1.t(min, i10);
                    if (Intrinsics.compare(bT & 255, bT2 & 255) > 0) {
                        bT = bT2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return bT;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @u
    @i(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final byte m1352minWithOrThrowU(@NotNull byte[] minWith, @NotNull Comparator<? super q1> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!r1.B(minWith)) {
            byte bT = r1.t(minWith, 0);
            int lastIndex = ArraysKt.getLastIndex(minWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bT2 = r1.t(minWith, i10);
                    if (comparator.compare(q1.c(bT), q1.c(bT2)) > 0) {
                        bT = bT2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return bT;
        }
        throw new NoSuchElementException();
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @i(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull u1[] u1VarArr) {
        Intrinsics.checkNotNullParameter(u1VarArr, "<this>");
        int iN = 0;
        for (u1 u1Var : u1VarArr) {
            iN = u1.n(iN + u1Var.z0());
        }
        return iN;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @i(name = "sumOfULong")
    public static final long sumOfULong(@NotNull y1[] y1VarArr) {
        Intrinsics.checkNotNullParameter(y1VarArr, "<this>");
        long jN = 0;
        for (y1 y1Var : y1VarArr) {
            jN = y1.n(jN + y1Var.z0());
        }
        return jN;
    }

    @e1(version = "1.7")
    @u
    @f
    @i(name = "maxByOrThrow-U")
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m1248maxByOrThrowU(byte[] maxBy, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxBy)) {
            throw new NoSuchElementException();
        }
        byte bT = r1.t(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(q1.c(bT));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bT2 = r1.t(maxBy, i10);
                    R rInvoke2 = selector.invoke(q1.c(bT2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        bT = bT2;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return bT;
    }

    @e1(version = "1.7")
    @u
    @f
    @i(name = "minByOrThrow-U")
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m1304minByOrThrowU(byte[] minBy, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!r1.B(minBy)) {
            byte bT = r1.t(minBy, 0);
            int lastIndex = ArraysKt.getLastIndex(minBy);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(q1.c(bT));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        byte bT2 = r1.t(minBy, i10);
                        R rInvoke2 = selector.invoke(q1.c(bT2));
                        if (rInvoke.compareTo(rInvoke2) > 0) {
                            bT = bT2;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return bT;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @u
    @i(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final short m1291maxOrThrowU(@NotNull short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (f2.B(max)) {
            throw new NoSuchElementException();
        }
        short sT = f2.t(max, 0);
        int lastIndex = ArraysKt.getLastIndex(max);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(max, i10);
                if (Intrinsics.compare(sT & e2.f312492d, 65535 & sT2) < 0) {
                    sT = sT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sT;
    }

    @e1(version = "1.7")
    @u
    @i(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final short m1299maxWithOrThrowU(@NotNull short[] maxWith, @NotNull Comparator<? super e2> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!f2.B(maxWith)) {
            short sT = f2.t(maxWith, 0);
            int lastIndex = ArraysKt.getLastIndex(maxWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sT2 = f2.t(maxWith, i10);
                    if (comparator.compare(e2.c(sT), e2.c(sT2)) < 0) {
                        sT = sT2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return sT;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @u
    @i(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final short m1347minOrThrowU(@NotNull short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (f2.B(min)) {
            throw new NoSuchElementException();
        }
        short sT = f2.t(min, 0);
        int lastIndex = ArraysKt.getLastIndex(min);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(min, i10);
                if (Intrinsics.compare(sT & e2.f312492d, 65535 & sT2) > 0) {
                    sT = sT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sT;
    }

    @e1(version = "1.7")
    @u
    @i(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final short m1355minWithOrThrowU(@NotNull short[] minWith, @NotNull Comparator<? super e2> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (f2.B(minWith)) {
            throw new NoSuchElementException();
        }
        short sT = f2.t(minWith, 0);
        int lastIndex = ArraysKt.getLastIndex(minWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(minWith, i10);
                if (comparator.compare(e2.c(sT), e2.c(sT2)) > 0) {
                    sT = sT2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sT;
    }

    @e1(version = "1.7")
    @u
    @f
    @i(name = "maxByOrThrow-U")
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m1251maxByOrThrowU(short[] maxBy, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!f2.B(maxBy)) {
            short sT = f2.t(maxBy, 0);
            int lastIndex = ArraysKt.getLastIndex(maxBy);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(e2.c(sT));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        short sT2 = f2.t(maxBy, i10);
                        R rInvoke2 = selector.invoke(e2.c(sT2));
                        if (rInvoke.compareTo(rInvoke2) < 0) {
                            sT = sT2;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return sT;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @u
    @f
    @i(name = "minByOrThrow-U")
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m1307minByOrThrowU(short[] minBy, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minBy)) {
            throw new NoSuchElementException();
        }
        short sT = f2.t(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(e2.c(sT));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sT2 = f2.t(minBy, i10);
                    R rInvoke2 = selector.invoke(e2.c(sT2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        sT = sT2;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return sT;
    }
}
