package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class q extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f313516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f313517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f313518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object[] f313519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f313520e;

    public q(int i10, @NotNull n format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f313516a = format;
        if (i10 < 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iHighestOneBit = Integer.highestOneBit((i10 << 1) - 1);
        this.f313517b = iHighestOneBit;
        this.f313518c = iHighestOneBit - 1;
        this.f313519d = new Object[iHighestOneBit];
        this.f313520e = new AtomicInteger(0);
    }

    @Override // kotlinx.atomicfu.m
    public void a(@NotNull Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f313519d[this.f313518c & this.f313520e.getAndIncrement()] = event;
    }

    @Override // kotlinx.atomicfu.m
    public void b(@NotNull Object event1, @NotNull Object event2) {
        Intrinsics.checkNotNullParameter(event1, "event1");
        Intrinsics.checkNotNullParameter(event2, "event2");
        int andAdd = this.f313520e.getAndAdd(2);
        Object[] objArr = this.f313519d;
        int i10 = this.f313518c;
        objArr[andAdd & i10] = event1;
        objArr[i10 & (andAdd + 1)] = event2;
    }

    @Override // kotlinx.atomicfu.m
    public void c(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3) {
        Intrinsics.checkNotNullParameter(event1, "event1");
        Intrinsics.checkNotNullParameter(event2, "event2");
        Intrinsics.checkNotNullParameter(event3, "event3");
        int andAdd = this.f313520e.getAndAdd(3);
        Object[] objArr = this.f313519d;
        int i10 = this.f313518c;
        objArr[andAdd & i10] = event1;
        objArr[(andAdd + 1) & i10] = event2;
        objArr[i10 & (andAdd + 2)] = event3;
    }

    @Override // kotlinx.atomicfu.m
    public void d(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3, @NotNull Object event4) {
        Intrinsics.checkNotNullParameter(event1, "event1");
        Intrinsics.checkNotNullParameter(event2, "event2");
        Intrinsics.checkNotNullParameter(event3, "event3");
        Intrinsics.checkNotNullParameter(event4, "event4");
        int andAdd = this.f313520e.getAndAdd(4);
        Object[] objArr = this.f313519d;
        int i10 = this.f313518c;
        objArr[andAdd & i10] = event1;
        objArr[(andAdd + 1) & i10] = event2;
        objArr[(andAdd + 2) & i10] = event3;
        objArr[i10 & (andAdd + 3)] = event4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f313520e.get();
        int i11 = this.f313518c & i10;
        int i12 = this.f313517b;
        int i13 = 0;
        int i14 = i10 > i12 ? i10 - i12 : 0;
        int i15 = i11;
        do {
            Object obj = this.f313519d[i15];
            if (obj != null) {
                int i16 = i13 + 1;
                if (i13 > 0) {
                    sb2.append('\n');
                }
                sb2.append(this.f313516a.a(i14, obj));
                i14++;
                i13 = i16;
            }
            i15 = (i15 + 1) & this.f313518c;
        } while (i15 != i11);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
