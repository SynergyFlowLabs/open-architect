package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.m1;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@m1
@SourceDebugExtension({"SMAP\nExceptionManageCacheImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n11653#2,9:131\n13579#2:140\n11653#2,9:141\n13579#2:150\n13580#2:152\n11662#2:153\n13580#2:155\n11662#2:156\n4117#2:158\n4217#2,2:159\n4117#2:165\n4217#2,2:166\n1#3:151\n1#3:154\n1#3:157\n1549#4:161\n1620#4,3:162\n1549#4:168\n1620#4,3:169\n*S KotlinDebug\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n*L\n69#1:131,9\n69#1:140\n71#1:141,9\n71#1:150\n71#1:152\n71#1:153\n69#1:155\n69#1:156\n101#1:158\n101#1:159,2\n119#1:165\n119#1:166,2\n71#1:151\n69#1:154\n101#1:161\n101#1:162,3\n120#1:168\n120#1:169,3\n*E\n"})
public final class AFc1bSDK implements AFc1aSDK {

    @NotNull
    private final AFc1iSDK AFAdRevenueData;

    public AFc1bSDK(@NotNull AFc1iSDK aFc1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        this.AFAdRevenueData = aFc1iSDK;
    }

    private final File getRevenue() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @Nullable
    public final String AFAdRevenueData(@NotNull Throwable th2, @NotNull String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            try {
                File revenue = getRevenue();
                str2 = null;
                if (revenue != null) {
                    file = new File(revenue, "6.17.0");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                } else {
                    file = null;
                }
                if (file != null) {
                    try {
                        AFc1cSDK currencyIso4217Code = AFd1qSDK.getCurrencyIso4217Code(th2, str);
                        String str3 = currencyIso4217Code.getMonetizationNetwork;
                        File file2 = new File(file, str3);
                        if (file2.exists()) {
                            AFc1cSDK.AFa1ySDK aFa1ySDK = AFc1cSDK.AFa1ySDK;
                            AFc1cSDK revenue2 = AFc1cSDK.AFa1ySDK.getRevenue(kotlin.io.l.B(file2, null, 1, null));
                            if (revenue2 != null) {
                                revenue2.getMediationNetwork++;
                                currencyIso4217Code = revenue2;
                            }
                        }
                        kotlin.io.l.I(file2, currencyIso4217Code.AFAdRevenueData(), null, 2, null);
                        str2 = str3;
                    } catch (Exception e10) {
                        AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e10.getMessage(), false, 4, null);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final int getCurrencyIso4217Code() {
        Iterator<T> it = getMediationNetwork().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((AFc1cSDK) it.next()).getMediationNetwork;
        }
        return i10;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NotNull
    public final List<AFc1cSDK> getMediationNetwork() {
        List<AFc1cSDK> listEmptyList;
        File[] fileArrListFiles;
        ArrayList arrayList;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                listEmptyList = null;
                if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 != null) {
                                Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                                arrayList = new ArrayList();
                                for (File file2 : fileArrListFiles2) {
                                    AFc1cSDK.AFa1ySDK aFa1ySDK = AFc1cSDK.AFa1ySDK;
                                    Intrinsics.checkNotNullExpressionValue(file2, "");
                                    AFc1cSDK revenue2 = AFc1cSDK.AFa1ySDK.getRevenue(kotlin.io.l.B(file2, null, 1, null));
                                    if (revenue2 != null) {
                                        arrayList.add(revenue2);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                        } catch (Throwable th2) {
                            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th2.getMessage(), false, 4, null);
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listEmptyList = CollectionsKt.flatten(arrayList2);
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listEmptyList;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getMonetizationNetwork() {
        return getRevenue(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getRevenue(@NotNull String... strArr) {
        boolean zY;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File revenue = getRevenue();
                zY = true;
                if (revenue != null) {
                    if (strArr.length == 0) {
                        AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zY = kotlin.io.l.Y(revenue);
                    } else {
                        int i10 = 5 | 0;
                        AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), false, 4, null);
                        File[] fileArrListFiles = revenue.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!ArraysKt.contains(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(kotlin.io.l.Y(file2)));
                            }
                            Set set = CollectionsKt.toSet(arrayList2);
                            if (set.isEmpty()) {
                                set = SetsKt.setOf(Boolean.TRUE);
                            }
                            Set set2 = set;
                            if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
                                zY = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zY;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final void AFAdRevenueData(int i10, int i11) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int monetizationNetwork = AFj1aSDK.getMonetizationNetwork(name);
                        if (i10 > monetizationNetwork || monetizationNetwork > i11) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(kotlin.io.l.Y(file2)));
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
