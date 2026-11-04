package androidx.paging;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g3<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f72018e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final g3<Object> f72019f = new g3<>(0, CollectionsKt.emptyList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f72020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<T> f72021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f72022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final List<Integer> f72023d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> g3<T> a() {
            g3<T> g3Var = (g3<T>) b();
            Intrinsics.checkNotNull(g3Var, "null cannot be cast to non-null type androidx.paging.TransformablePage<T of androidx.paging.TransformablePage.Companion.empty>");
            return g3Var;
        }

        @NotNull
        public final g3<Object> b() {
            return g3.f72019f;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g3(@NotNull int[] originalPageOffsets, @NotNull List<? extends T> data, int i10, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f72020a = originalPageOffsets;
        this.f72021b = data;
        this.f72022c = i10;
        this.f72023d = list;
        if (originalPageOffsets.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list == null || list.size() == data.size()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("If originalIndices (size = ");
        Intrinsics.checkNotNull(list);
        sb2.append(list.size());
        sb2.append(") is provided, it must be same length as data (size = ");
        sb2.append(data.size());
        sb2.append(')');
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g3 g(g3 g3Var, int[] iArr, List list, int i10, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iArr = g3Var.f72020a;
        }
        if ((i11 & 2) != 0) {
            list = g3Var.f72021b;
        }
        if ((i11 & 4) != 0) {
            i10 = g3Var.f72022c;
        }
        if ((i11 & 8) != 0) {
            list2 = g3Var.f72023d;
        }
        return g3Var.f(iArr, list, i10, list2);
    }

    @NotNull
    public final int[] b() {
        return this.f72020a;
    }

    @NotNull
    public final List<T> c() {
        return this.f72021b;
    }

    public final int d() {
        return this.f72022c;
    }

    @Nullable
    public final List<Integer> e() {
        return this.f72023d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g3.class == obj.getClass()) {
            g3 g3Var = (g3) obj;
            return Arrays.equals(this.f72020a, g3Var.f72020a) && Intrinsics.areEqual(this.f72021b, g3Var.f72021b) && this.f72022c == g3Var.f72022c && Intrinsics.areEqual(this.f72023d, g3Var.f72023d);
        }
        return false;
    }

    @NotNull
    public final g3<T> f(@NotNull int[] originalPageOffsets, @NotNull List<? extends T> data, int i10, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        Intrinsics.checkNotNullParameter(data, "data");
        return new g3<>(originalPageOffsets, data, i10, list);
    }

    @NotNull
    public final List<T> h() {
        return this.f72021b;
    }

    public int hashCode() {
        int iHashCode = ((((Arrays.hashCode(this.f72020a) * 31) + this.f72021b.hashCode()) * 31) + this.f72022c) * 31;
        List<Integer> list = this.f72023d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Nullable
    public final List<Integer> i() {
        return this.f72023d;
    }

    public final int j() {
        return this.f72022c;
    }

    @NotNull
    public final int[] k() {
        return this.f72020a;
    }

    @NotNull
    public final j3.a l(int i10, int i11, int i12, int i13, int i14) {
        IntRange indices;
        int i15 = this.f72022c;
        List<Integer> list = this.f72023d;
        if (list != null && (indices = CollectionsKt.getIndices(list)) != null && indices.t(i10)) {
            i10 = this.f72023d.get(i10).intValue();
        }
        return new j3.a(i15, i10, i11, i12, i13, i14);
    }

    @NotNull
    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f72020a) + ", data=" + this.f72021b + ", hintOriginalPageOffset=" + this.f72022c + ", hintOriginalIndices=" + this.f72023d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g3(int i10, @NotNull List<? extends T> data) {
        this(new int[]{i10}, data, i10, null);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
