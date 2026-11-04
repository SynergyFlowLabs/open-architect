package com.superwall.sdk.analytics;

import android.content.Context;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDeviceClassifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceClassifier.kt\ncom/superwall/sdk/analytics/DeviceClassifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,133:1\n1734#2,3:134\n1557#2:137\n1628#2,3:138\n1782#2,4:141\n1755#2,3:145\n1755#2,3:148\n1755#2,3:151\n1755#2,3:154\n774#2:167\n865#2,2:168\n136#3,10:157\n*S KotlinDebug\n*F\n+ 1 DeviceClassifier.kt\ncom/superwall/sdk/analytics/DeviceClassifier\n*L\n66#1:134,3\n70#1:137\n70#1:138,3\n87#1:141,4\n100#1:145,3\n101#1:148,3\n102#1:151,3\n103#1:154,3\n41#1:167\n41#1:168,2\n118#1:157,10\n*E\n"})
public final class DeviceClassifier implements ClassifierDataFactory {

    @NotNull
    private final ClassifierDataFactory factory;

    @NotNull
    private final f0 videoCodecs$delegate;

    public enum Orientation {
        LANDSCAPE,
        PORTRAIT,
        UNDEFINED;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        public static kotlin.enums.a<Orientation> getEntries() {
            return $ENTRIES;
        }
    }

    public DeviceClassifier(@NotNull ClassifierDataFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factory = factory;
        this.videoCodecs$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.analytics.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceClassifier.videoCodecs_delegate$lambda$1(this.f267355a);
            }
        });
    }

    private final int cpuScore() {
        if (!getCpuInfo().getCores().isEmpty()) {
            List<CPUInfo.Data.Core> cores = getCpuInfo().getCores();
            if (!(cores instanceof Collection) || !cores.isEmpty()) {
                Iterator<T> it = cores.iterator();
                while (it.hasNext()) {
                    if (((CPUInfo.Data.Core) it.next()).getCurrentFreq() >= 0) {
                        List<CPUInfo.Data.Core> cores2 = getCpuInfo().getCores();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cores2, 10));
                        Iterator<T> it2 = cores2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(((CPUInfo.Data.Core) it2.next()).getMaxFreq()));
                        }
                        double dAverageOfLong = CollectionsKt.averageOfLong(arrayList) / 1000000.0d;
                        if (dAverageOfLong > 1000.0d) {
                            dAverageOfLong /= (double) 1000;
                        }
                        int size = arrayList.size();
                        return (int) (r.z(((double) size) / 8.0d, 1.0d) * r.z(dAverageOfLong / 4.0d, 1.0d) * ((double) 35));
                    }
                }
            }
        }
        return -1;
    }

    private final int displayScore() {
        double screenWidth = getScreenWidth();
        double screenHeight = getScreenHeight();
        return (int) (r.z((Math.sqrt((screenWidth * screenWidth) + (screenHeight * screenHeight)) / getScreenSize()) / 500.0d, 1.0d) * ((double) 20));
    }

    private final List<String> getVideoCodecs() {
        return (List) this.videoCodecs$delegate.getValue();
    }

    private final int memScore() {
        return (int) (r.z((advertisedMemory() / 1.073741824E9d) / 10.0d, 1.0d) * ((double) 25));
    }

    private final int primeFreqBonus() {
        int i10;
        List<CPUInfo.Data.Core> cores = getCpuInfo().getCores();
        if ((cores instanceof Collection) && cores.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = cores.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((CPUInfo.Data.Core) it.next()).getMaxFreq() >= 3500000 && (i10 = i10 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i10 >= getCpuInfo().getCores().size() / 3 ? 5 : 0;
    }

    private final Either<Integer, Throwable> totalScore() {
        try {
            int iCpuScore = cpuScore();
            int iPrimeFreqBonus = primeFreqBonus() + memScore() + videoScore() + displayScore();
            return new Either.Success(Integer.valueOf(iCpuScore == -1 ? (iPrimeFreqBonus * 100) / 65 : iPrimeFreqBonus + iCpuScore));
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            return new Either.Failure(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List videoCodecs_delegate$lambda$1(DeviceClassifier deviceClassifier) {
        List<String> listCodecs = deviceClassifier.codecs();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listCodecs) {
            if (StringsKt.V2((String) obj, "video", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:42:0x00c1->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:1: B:31:0x008a->B:54:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:2: B:20:0x0056->B:57:?, LOOP_END, SYNTHETIC] */
    private final int videoScore() {
        int i10;
        List<String> videoCodecs;
        Iterator<T> it;
        List<String> videoCodecs2;
        Iterator<T> it2;
        List<String> videoCodecs3;
        Iterator<T> it3;
        List<String> videoCodecs4 = getVideoCodecs();
        if (!(videoCodecs4 instanceof Collection) || !videoCodecs4.isEmpty()) {
            Iterator<T> it4 = videoCodecs4.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (StringsKt.S2((String) it4.next(), "av01", true)) {
                        i10 = 10;
                        break;
                    }
                }
            }
            videoCodecs = getVideoCodecs();
            if ((videoCodecs instanceof Collection) || !videoCodecs.isEmpty()) {
                it = videoCodecs.iterator();
                while (it.hasNext()) {
                    if (StringsKt.S2((String) it.next(), "hevc", true)) {
                        i10 += 14;
                        break;
                    }
                }
            }
            videoCodecs2 = getVideoCodecs();
            if ((videoCodecs2 instanceof Collection) || !videoCodecs2.isEmpty()) {
                it2 = videoCodecs2.iterator();
                while (it2.hasNext()) {
                    if (StringsKt.S2((String) it2.next(), "vp9", true)) {
                        i10 += 6;
                        break;
                    }
                }
            }
            videoCodecs3 = getVideoCodecs();
            if ((videoCodecs3 instanceof Collection) || !videoCodecs3.isEmpty()) {
                it3 = videoCodecs3.iterator();
                while (it3.hasNext()) {
                    if (StringsKt.S2((String) it3.next(), "vp8", true)) {
                        i10 += 4;
                        break;
                    }
                }
            }
            return r.B(i10, 20);
        }
        i10 = 0;
        videoCodecs = getVideoCodecs();
        if (videoCodecs instanceof Collection) {
            it = videoCodecs.iterator();
            while (it.hasNext()) {
                if (StringsKt.S2((String) it.next(), "hevc", true)) {
                    i10 += 14;
                    break;
                }
            }
        } else {
            it = videoCodecs.iterator();
            while (it.hasNext()) {
                if (StringsKt.S2((String) it.next(), "hevc", true)) {
                    i10 += 14;
                    break;
                }
            }
        }
        videoCodecs2 = getVideoCodecs();
        if (videoCodecs2 instanceof Collection) {
            it2 = videoCodecs2.iterator();
            while (it2.hasNext()) {
                if (StringsKt.S2((String) it2.next(), "vp9", true)) {
                    i10 += 6;
                    break;
                }
            }
        } else {
            it2 = videoCodecs2.iterator();
            while (it2.hasNext()) {
                if (StringsKt.S2((String) it2.next(), "vp9", true)) {
                    i10 += 6;
                    break;
                }
            }
        }
        videoCodecs3 = getVideoCodecs();
        if (videoCodecs3 instanceof Collection) {
            it3 = videoCodecs3.iterator();
            while (it3.hasNext()) {
                if (StringsKt.S2((String) it3.next(), "vp8", true)) {
                    i10 += 4;
                    break;
                }
            }
        } else {
            it3 = videoCodecs3.iterator();
            while (it3.hasNext()) {
                if (StringsKt.S2((String) it3.next(), "vp8", true)) {
                    i10 += 4;
                    break;
                }
            }
        }
        return r.B(i10, 20);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public long advertisedMemory() {
        return this.factory.advertisedMemory();
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public List<String> codecs() {
        return this.factory.codecs();
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public Context context() {
        return this.factory.context();
    }

    @NotNull
    public final Tier deviceTier() {
        Integer success = totalScore().getSuccess();
        if (success == null) {
            return Tier.UNKNOWN;
        }
        if (new IntRange(0, 24).t(success.intValue())) {
            return Tier.ULTRA_LOW;
        }
        if (new IntRange(25, 44).t(success.intValue())) {
            return Tier.LOW;
        }
        if (new IntRange(45, 69).t(success.intValue())) {
            return Tier.MID;
        }
        return new IntRange(70, 85).t(success.intValue()) ? Tier.HIGH : Tier.ULTRA_HIGH;
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public CPUInfo.Data getCpuInfo() {
        return this.factory.getCpuInfo();
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public Orientation getOrientation() {
        return this.factory.getOrientation();
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public int getScreenHeight() {
        return this.factory.getScreenHeight();
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public double getScreenSize() {
        return this.factory.getScreenSize();
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public int getScreenWidth() {
        return this.factory.getScreenWidth();
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public boolean isTabletMinWidth() {
        return this.factory.isTabletMinWidth();
    }
}
