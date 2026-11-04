package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.m1;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFileCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n1855#2,2:329\n1855#2,2:332\n1855#2:334\n1856#2:337\n1855#2,2:339\n1855#2:341\n1856#2:344\n6442#3:331\n13579#3,2:342\n18#4:335\n26#5:336\n1#6:338\n*S KotlinDebug\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n*L\n105#1:329,2\n182#1:332,2\n200#1:334\n200#1:337\n256#1:339,2\n289#1:341\n289#1:344\n180#1:331\n292#1:342,2\n206#1:335\n206#1:336\n*E\n"})
public final class AFc1tSDK implements AFc1vSDK {

    @NotNull
    private final AFc1iSDK AFAdRevenueData;

    @NotNull
    private final AFc1qSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1sSDK getMediationNetwork;

    @NotNull
    private final Map<String, Integer> getRevenue;

    public AFc1tSDK(@NotNull AFc1iSDK aFc1iSDK, @NotNull AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.AFAdRevenueData = aFc1iSDK;
        this.getCurrencyIso4217Code = aFc1qSDK;
        int i10 = 3 | 1;
        this.getMediationNetwork = new AFc1sSDK(CollectionsKt.listOf((Object[]) new AFc1uSDK[]{new AFc1uSDK("ConversionsCache", CollectionsKt.listOf(AFe1mSDK.CONVERSION), 1), new AFc1uSDK("AttrCache", CollectionsKt.listOf(AFe1mSDK.ATTR), 1), new AFc1uSDK("OtherCache", CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.ADREVENUE, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.SDK_SERVICES}), 40)}));
        this.getRevenue = MapsKt.mutableMapOf(TuplesKt.to("ConversionsCache", 0), TuplesKt.to("AttrCache", 0), TuplesKt.to("OtherCache", 0));
    }

    private final boolean getCurrencyIso4217Code(File file) {
        try {
            file.delete();
            getMonetizationNetwork();
            return true;
        } catch (Exception e10) {
            int i10 = 7 >> 0;
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not delete " + file.getName() + " from cache", e10, false, false, false, false, 120, null);
            return false;
        }
    }

    private static AFc1rSDK getMediationNetwork(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1rSDK aFc1rSDK = new AFc1rSDK(cArr);
                aFc1rSDK.getMediationNetwork = file.getName();
                kotlin.io.c.a(inputStreamReader, null);
                return aFc1rSDK;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(inputStreamReader, th2);
                    throw th3;
                }
            }
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e10, false, false, true, false);
            return null;
        }
    }

    private final void getMonetizationNetwork() {
        for (AFc1uSDK aFc1uSDK : this.getMediationNetwork.AFAdRevenueData) {
            String str = aFc1uSDK.getCurrencyIso4217Code;
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getRevenue;
                String str2 = aFc1uSDK.getCurrencyIso4217Code;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.getRevenue.put(aFc1uSDK.getCurrencyIso4217Code, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @m1
    public final void AFAdRevenueData() {
        try {
            if (this.getCurrencyIso4217Code.AFAdRevenueData("AF_CACHE_VERSION", -1) == 1) {
                Context context = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getCurrencyIso4217Code.getMediationNetwork("AF_CACHE_VERSION", 1);
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context4);
                    kotlin.io.l.Y(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getMonetizationNetwork();
        } catch (Exception e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e10, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @m1
    @NotNull
    public final List<AFc1rSDK> getRevenue() {
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
            while (it.hasNext()) {
                String str = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                CollectionsKt.addAll(arrayList2, fileArrListFiles);
            }
            for (File file2 : arrayList2) {
                AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1rSDK mediationNetwork = getMediationNetwork(file2);
                if (mediationNetwork != null) {
                    arrayList.add(mediationNetwork);
                }
            }
        } catch (Exception e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e10, false, false, false, false, 120, null);
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found " + arrayList.size() + " Cached Requests", false, 4, null);
        return arrayList;
    }

    private final AFc1uSDK getCurrencyIso4217Code(AFe1mSDK aFe1mSDK) {
        Object next;
        Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AFc1uSDK) next).getRevenue.contains(aFe1mSDK)) {
                return (AFc1uSDK) next;
            }
        }
        next = null;
        return (AFc1uSDK) next;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @m1
    public final void getMediationNetwork() {
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
            while (it.hasNext()) {
                String str = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context4);
            kotlin.io.l.Y(new File(context4.getFilesDir(), "AFRequestCache"));
            getMonetizationNetwork();
        } catch (Exception e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e10, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @m1
    @Nullable
    public final String AFAdRevenueData(@NotNull AFc1rSDK aFc1rSDK) {
        Exception exc;
        File file;
        String str;
        List listSortedWith;
        List<File> listTake;
        Intrinsics.checkNotNullParameter(aFc1rSDK, "");
        int i10 = 5 << 0;
        try {
            AFe1mSDK aFe1mSDK = aFc1rSDK.getMonetizationNetwork;
            Intrinsics.checkNotNullExpressionValue(aFe1mSDK, "");
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFe1mSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1rSDK.getRevenue, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1rSDK.AFAdRevenueData);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1rSDK.getRevenue);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1rSDK.getMediationNetwork(), 2));
                    outputStreamWriter.write(10);
                    AFe1mSDK aFe1mSDK2 = aFc1rSDK.getMonetizationNetwork;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1mSDK2.name());
                    outputStreamWriter.write(10);
                    outputStreamWriter.flush();
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(outputStreamWriter, null);
                    AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                    AFe1mSDK aFe1mSDK3 = aFc1rSDK.getMonetizationNetwork;
                    Intrinsics.checkNotNullExpressionValue(aFe1mSDK3, "");
                    AFc1uSDK currencyIso4217Code = getCurrencyIso4217Code(aFe1mSDK3);
                    Integer numValueOf = currencyIso4217Code != null ? Integer.valueOf(currencyIso4217Code.AFAdRevenueData) : null;
                    if (numValueOf == null) {
                        return strValueOf;
                    }
                    int iIntValue = numValueOf.intValue();
                    Map<String, Integer> map = this.getRevenue;
                    AFc1uSDK currencyIso4217Code2 = getCurrencyIso4217Code(aFe1mSDK3);
                    if (currencyIso4217Code2 == null || (str = currencyIso4217Code2.getCurrencyIso4217Code) == null) {
                        throw new UnsupportedOperationException("Cache do not support this type of events");
                    }
                    Integer num = map.get(str);
                    int iIntValue2 = num != null ? num.intValue() : 0;
                    if (iIntValue2 >= iIntValue) {
                        int i11 = (iIntValue2 + 1) - iIntValue;
                        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1mSDK3 + ", removing " + i11 + " item(s)", false, 4, null);
                        Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                        Intrinsics.checkNotNull(context2);
                        File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFe1mSDK3));
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        File[] fileArrListFiles = file3.listFiles();
                        if (fileArrListFiles != null && (listSortedWith = ArraysKt.sortedWith(fileArrListFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1tSDK.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t10, T t11) {
                                return kotlin.comparisons.a.l(((File) t10).getName(), ((File) t11).getName());
                            }
                        })) != null && (listTake = CollectionsKt.take(listSortedWith, i11)) != null) {
                            for (File file4 : listTake) {
                                file4.delete();
                                AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                            }
                        }
                    }
                    getMonetizationNetwork();
                    return strValueOf;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(outputStreamWriter, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                exc = e10;
                if (file != null) {
                    file.delete();
                }
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e11) {
            exc = e11;
            file = null;
        }
    }

    private final String getMediationNetwork(AFe1mSDK aFe1mSDK) {
        String str;
        AFc1uSDK currencyIso4217Code = getCurrencyIso4217Code(aFe1mSDK);
        if (currencyIso4217Code == null || (str = currencyIso4217Code.getCurrencyIso4217Code) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @m1
    public final boolean AFAdRevenueData(@Nullable String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        Intrinsics.checkNotNull(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Deleting " + str + " from cache", false, 4, null);
        Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
            Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getCurrencyIso4217Code(file);
            }
        }
        return true;
    }
}
