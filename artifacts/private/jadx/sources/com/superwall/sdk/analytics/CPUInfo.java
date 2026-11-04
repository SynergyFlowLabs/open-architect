package com.superwall.sdk.analytics;

import android.os.Build;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCPUInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CPUInfo.kt\ncom/superwall/sdk/analytics/CPUInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1557#2:79\n1628#2,3:80\n1#3:83\n*S KotlinDebug\n*F\n+ 1 CPUInfo.kt\ncom/superwall/sdk/analytics/CPUInfo\n*L\n28#1:79\n28#1:80,3\n*E\n"})
public final class CPUInfo {

    @NotNull
    private static final String CPU_INFO_DIR = "/sys/devices/system/cpu/";

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @b0
    public static final class Data {

        @NotNull
        private final List<Core> cores;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(CPUInfo$Data$Core$$serializer.INSTANCE)};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Data> serializer() {
                return CPUInfo$Data$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @b0
        public static final class Core {

            @NotNull
            public static final Companion Companion = new Companion(null);
            private final long currentFreq;
            private final long maxFreq;
            private final long minFreq;
            private final int number;

            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer<Core> serializer() {
                    return CPUInfo$Data$Core$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Core(int i10, int i11, long j10, long j11, long j12, v2 v2Var) {
                if (15 != (i10 & 15)) {
                    g2.b(i10, 15, CPUInfo$Data$Core$$serializer.INSTANCE.getDescriptor());
                }
                this.number = i11;
                this.currentFreq = j10;
                this.maxFreq = j11;
                this.minFreq = j12;
            }

            public static /* synthetic */ Core copy$default(Core core, int i10, long j10, long j11, long j12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = core.number;
                }
                if ((i11 & 2) != 0) {
                    j10 = core.currentFreq;
                }
                if ((i11 & 4) != 0) {
                    j11 = core.maxFreq;
                }
                if ((i11 & 8) != 0) {
                    j12 = core.minFreq;
                }
                long j13 = j12;
                return core.copy(i10, j10, j11, j13);
            }

            @n
            public static final /* synthetic */ void write$Self$superwall_release(Core core, e eVar, SerialDescriptor serialDescriptor) {
                eVar.encodeIntElement(serialDescriptor, 0, core.number);
                eVar.encodeLongElement(serialDescriptor, 1, core.currentFreq);
                eVar.encodeLongElement(serialDescriptor, 2, core.maxFreq);
                eVar.encodeLongElement(serialDescriptor, 3, core.minFreq);
            }

            public final int component1() {
                return this.number;
            }

            public final long component2() {
                return this.currentFreq;
            }

            public final long component3() {
                return this.maxFreq;
            }

            public final long component4() {
                return this.minFreq;
            }

            @NotNull
            public final Core copy(int i10, long j10, long j11, long j12) {
                return new Core(i10, j10, j11, j12);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Core)) {
                    return false;
                }
                Core core = (Core) obj;
                return this.number == core.number && this.currentFreq == core.currentFreq && this.maxFreq == core.maxFreq && this.minFreq == core.minFreq;
            }

            public final long getCurrentFreq() {
                return this.currentFreq;
            }

            public final long getMaxFreq() {
                return this.maxFreq;
            }

            public final long getMinFreq() {
                return this.minFreq;
            }

            public final int getNumber() {
                return this.number;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.number) * 31) + Long.hashCode(this.currentFreq)) * 31) + Long.hashCode(this.maxFreq)) * 31) + Long.hashCode(this.minFreq);
            }

            @NotNull
            public String toString() {
                return "#" + this.number + ", current: " + this.currentFreq + ", max: " + this.maxFreq + ", min: " + this.minFreq;
            }

            public Core(int i10, long j10, long j11, long j12) {
                this.number = i10;
                this.currentFreq = j10;
                this.maxFreq = j11;
                this.minFreq = j12;
            }
        }

        public /* synthetic */ Data(int i10, List list, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CPUInfo$Data$$serializer.INSTANCE.getDescriptor());
            }
            this.cores = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = data.cores;
            }
            return data.copy(list);
        }

        @NotNull
        public final List<Core> component1() {
            return this.cores;
        }

        @NotNull
        public final Data copy(@NotNull List<Core> cores) {
            Intrinsics.checkNotNullParameter(cores, "cores");
            return new Data(cores);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.areEqual(this.cores, ((Data) obj).cores);
        }

        @NotNull
        public final List<Core> getCores() {
            return this.cores;
        }

        public int hashCode() {
            return this.cores.hashCode();
        }

        @NotNull
        public String toString() {
            return "Cores: " + this.cores.size() + ": [" + CollectionsKt.joinToString$default(this.cores, null, null, null, 0, null, null, 63, null);
        }

        public Data(@NotNull List<Core> cores) {
            Intrinsics.checkNotNullParameter(cores, "cores");
            this.cores = cores;
        }
    }

    public final long frequencyForCore(int i10) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/scaling_cur_freq", "r");
            try {
                String line = randomAccessFile.readLine();
                Intrinsics.checkNotNullExpressionValue(line, "readLine(...)");
                long j10 = Long.parseLong(line) / ((long) 1000);
                kotlin.io.c.a(randomAccessFile, null);
                return j10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(randomAccessFile, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return -1L;
        }
    }

    @NotNull
    public final String getAbi() {
        String str = Build.SUPPORTED_ABIS[0];
        Intrinsics.checkNotNull(str);
        return str;
    }

    @NotNull
    public final Data getCpuData() {
        getGetNumberOfCores();
        IntRange intRangeW1 = r.W1(0, getGetNumberOfCores());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            Pair<Long, Long> pairMinMaxFrequencyForCore = minMaxFrequencyForCore(iNextInt);
            arrayList.add(new Data.Core(iNextInt, frequencyForCore(iNextInt), pairMinMaxFrequencyForCore.getSecond().longValue(), pairMinMaxFrequencyForCore.getFirst().longValue()));
        }
        return new Data(arrayList);
    }

    public final int getGetNumberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    @NotNull
    public final Pair<Long, Long> minMaxFrequencyForCore(int i10) {
        String str = "/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_min_freq";
        String str2 = "/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_max_freq";
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            try {
                String line = randomAccessFile.readLine();
                Intrinsics.checkNotNullExpressionValue(line, "readLine(...)");
                long j10 = 1000;
                long j11 = Long.parseLong(line) / j10;
                kotlin.io.c.a(randomAccessFile, null);
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str2, "r");
                try {
                    String line2 = randomAccessFile2.readLine();
                    Intrinsics.checkNotNullExpressionValue(line2, "readLine(...)");
                    long j12 = Long.parseLong(line2) / j10;
                    kotlin.io.c.a(randomAccessFile2, null);
                    return new Pair<>(Long.valueOf(j11), Long.valueOf(j12));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(randomAccessFile2, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    kotlin.io.c.a(randomAccessFile, th4);
                    throw th5;
                }
            }
        } catch (Exception unused) {
            return new Pair<>(-1L, -1L);
        }
    }
}
