package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1558:1\n1#2:1559\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41109e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f41111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.ranges.f<Float> f41112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f41108d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final i f41110f = new i(0.0f, kotlin.ranges.r.e(0.0f, 0.0f), 0, 4, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final i a() {
            return i.f41110f;
        }

        private a() {
        }
    }

    public i(float f10, @NotNull kotlin.ranges.f<Float> fVar, int i10) {
        this.f41111a = f10;
        this.f41112b = fVar;
        this.f41113c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f41111a;
    }

    @NotNull
    public final kotlin.ranges.f<Float> c() {
        return this.f41112b;
    }

    public final int d() {
        return this.f41113c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f41111a == iVar.f41111a && Intrinsics.areEqual(this.f41112b, iVar.f41112b) && this.f41113c == iVar.f41113c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f41111a) * 31) + this.f41112b.hashCode()) * 31) + this.f41113c;
    }

    @NotNull
    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f41111a + ", range=" + this.f41112b + ", steps=" + this.f41113c + ')';
    }

    public /* synthetic */ i(float f10, kotlin.ranges.f fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, fVar, (i11 & 4) != 0 ? 0 : i10);
    }
}
