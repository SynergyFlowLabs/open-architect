package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.w0;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(21)
@SourceDebugExtension({"SMAP\nNetworkDataCollectorApi21.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollectorApi21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi21\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n179#2,2:47\n1#3:49\n1#3:60\n11653#4,9:50\n13579#4:59\n13580#4:61\n11662#4:62\n1747#5,3:63\n*S KotlinDebug\n*F\n+ 1 NetworkDataCollectorApi21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi21\n*L\n17#1:47,2\n31#1:60\n31#1:50,9\n31#1:59\n31#1:61\n31#1:62\n33#1:63,3\n*E\n"})
public final class AFi1qSDK extends AFi1pSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1qSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.jvm.internal.l0 implements Function1<Network, NetworkInfo> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: x_, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1qSDK.this.getMonetizationNetwork;
            Intrinsics.checkNotNull(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1qSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getMonetizationNetwork() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Network network : allNetworks) {
                    ConnectivityManager connectivityManager2 = this.getMonetizationNetwork;
                    Intrinsics.checkNotNull(connectivityManager2);
                    NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                    if (networkCapabilities != null) {
                        arrayList.add(networkCapabilities);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (w_((NetworkCapabilities) it.next())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Failed collecting ivc data", e10);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    protected final String getRevenue() {
        Network[] allNetworks;
        Sequence sequenceAsSequence;
        Sequence sequenceP1;
        Object next;
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (sequenceAsSequence = ArraysKt.asSequence(allNetworks)) != null && (sequenceP1 = kotlin.sequences.o.p1(sequenceAsSequence, new AnonymousClass1())) != null) {
            Iterator it = sequenceP1.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AFi1pSDK.v_((NetworkInfo) next));
            NetworkInfo networkInfo = (NetworkInfo) next;
            if (networkInfo != null) {
                int type = networkInfo.getType();
                if (type != 0) {
                    return type != 1 ? "unknown" : "WIFI";
                }
                return "MOBILE";
            }
        }
        return "unknown";
    }
}
