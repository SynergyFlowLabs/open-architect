package androidx.paging;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f72294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f72296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f72297d;

    public static final class a extends j3 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f72298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f72299f;

        public a(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(i12, i13, i14, i15, null);
            this.f72298e = i10;
            this.f72299f = i11;
        }

        @Override // androidx.paging.j3
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f72298e == aVar.f72298e && this.f72299f == aVar.f72299f && d() == aVar.d() && c() == aVar.c() && a() == aVar.a() && b() == aVar.b();
        }

        public final int f() {
            return this.f72299f;
        }

        public final int g() {
            return this.f72298e;
        }

        @Override // androidx.paging.j3
        public int hashCode() {
            return super.hashCode() + Integer.hashCode(this.f72298e) + Integer.hashCode(this.f72299f);
        }

        @NotNull
        public String toString() {
            return StringsKt.r("ViewportHint.Access(\n            |    pageOffset=" + this.f72298e + ",\n            |    indexInPage=" + this.f72299f + ",\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", null, 1, null);
        }
    }

    public static final class b extends j3 {
        public b(int i10, int i11, int i12, int i13) {
            super(i10, i11, i12, i13, null);
        }

        @NotNull
        public String toString() {
            return StringsKt.r("ViewportHint.Initial(\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", null, 1, null);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72300a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72300a = iArr;
        }
    }

    public /* synthetic */ j3(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, i13);
    }

    public final int a() {
        return this.f72296c;
    }

    public final int b() {
        return this.f72297d;
    }

    public final int c() {
        return this.f72295b;
    }

    public final int d() {
        return this.f72294a;
    }

    public final int e(@NotNull a1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i10 = c.f72300a[loadType.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i10 == 2) {
            return this.f72294a;
        }
        if (i10 == 3) {
            return this.f72295b;
        }
        throw new kotlin.k0();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return this.f72294a == j3Var.f72294a && this.f72295b == j3Var.f72295b && this.f72296c == j3Var.f72296c && this.f72297d == j3Var.f72297d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f72294a) + Integer.hashCode(this.f72295b) + Integer.hashCode(this.f72296c) + Integer.hashCode(this.f72297d);
    }

    private j3(int i10, int i11, int i12, int i13) {
        this.f72294a = i10;
        this.f72295b = i11;
        this.f72296c = i12;
        this.f72297d = i13;
    }
}
