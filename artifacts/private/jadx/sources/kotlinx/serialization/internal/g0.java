package kotlinx.serialization.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f315920e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final long[] f315921f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<SerialDescriptor, Integer, Boolean> f315923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f315924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final long[] f315925d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(@NotNull SerialDescriptor descriptor, @NotNull Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f315922a = descriptor;
        this.f315923b = readIfAbsent;
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.f315924c = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.f315925d = f315921f;
        } else {
            this.f315924c = 0L;
            this.f315925d = e(elementsCount);
        }
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f315925d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f315925d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f315925d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (this.f315923b.invoke(this.f315922a, Integer.valueOf(i13)).booleanValue()) {
                    this.f315925d[i10] = j10;
                    return i13;
                }
            }
            this.f315925d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f315924c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int elementsCount = this.f315922a.getElementsCount();
        do {
            long j10 = this.f315924c;
            if (j10 == -1) {
                if (elementsCount > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f315924c |= 1 << iNumberOfTrailingZeros;
        } while (!this.f315923b.invoke(this.f315922a, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
