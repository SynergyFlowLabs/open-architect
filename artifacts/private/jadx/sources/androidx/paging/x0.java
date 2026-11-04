package androidx.paging;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f72690a;

    public static final class a extends x0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Throwable f72691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Throwable error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f72691b = error;
        }

        @NotNull
        public final Throwable b() {
            return this.f72691b;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a() != aVar.a() || !Intrinsics.areEqual(this.f72691b, aVar.f72691b)) {
                return false;
            }
            int i10 = 3 ^ 1;
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(a()) + this.f72691b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(endOfPaginationReached=" + a() + ", error=" + this.f72691b + ')';
        }
    }

    public static final class b extends x0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f72692b = new b();

        private b() {
            super(false, null);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof b) && a() == ((b) obj).a();
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        @NotNull
        public String toString() {
            return "Loading(endOfPaginationReached=" + a() + ')';
        }
    }

    public static final class c extends x0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f72693b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final c f72694c = new c(true);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final c f72695d = new c(false);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final c a() {
                return c.f72694c;
            }

            @NotNull
            public final c b() {
                return c.f72695d;
            }

            private a() {
            }
        }

        public c(boolean z10) {
            super(z10, null);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof c) && a() == ((c) obj).a();
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        @NotNull
        public String toString() {
            return "NotLoading(endOfPaginationReached=" + a() + ')';
        }
    }

    public /* synthetic */ x0(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f72690a;
    }

    private x0(boolean z10) {
        this.f72690a = z10;
    }
}
