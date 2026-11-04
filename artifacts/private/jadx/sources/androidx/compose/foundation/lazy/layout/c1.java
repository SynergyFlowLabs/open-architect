package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLazyLayoutNearestRangeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,66:1\n85#2:67\n117#2,2:68\n*S KotlinDebug\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n*L\n32#1:67\n32#1:68,2\n*E\n"})
public final class c1 implements n7<IntRange> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f17345e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17346f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f17349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17350d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IntRange b(int i10, int i11, int i12) {
            int i13 = (i10 / i11) * i11;
            return kotlin.ranges.r.W1(Math.max(i13 - i12, 0), i13 + i11 + i12);
        }

        private a() {
        }
    }

    public c1(int i10, int i11, int i12) {
        this.f17347a = i11;
        this.f17348b = i12;
        this.f17349c = w6.k(f17345e.b(i10, i11, i12), w6.z());
        this.f17350d = i10;
    }

    private void b(IntRange intRange) {
        this.f17349c.setValue(intRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.n7
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public IntRange getValue() {
        return (IntRange) this.f17349c.getValue();
    }

    public final void d(int i10) {
        if (i10 != this.f17350d) {
            this.f17350d = i10;
            b(f17345e.b(i10, this.f17347a, this.f17348b));
        }
    }
}
