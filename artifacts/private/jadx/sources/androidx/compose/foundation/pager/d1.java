package androidx.compose.foundation.pager;

import androidx.collection.g3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nPagerSnapDistance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n+ 2 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceKt\n*L\n1#1,111:1\n107#2,4:112\n*S KotlinDebug\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n*L\n80#1:112,4\n*E\n"})
public final class d1 implements b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18208c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18209b;

    public d1(int i10) {
        this.f18209b = i10;
    }

    @Override // androidx.compose.foundation.pager.b1
    public int a(int i10, int i11, float f10, int i12, int i13) {
        long j10 = i10;
        return kotlin.ranges.r.I(i11, (int) kotlin.ranges.r.v(j10 - ((long) this.f18209b), 0L), (int) kotlin.ranges.r.C(j10 + ((long) this.f18209b), g3.f12256c));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof d1) && this.f18209b == ((d1) obj).f18209b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f18209b);
    }
}
