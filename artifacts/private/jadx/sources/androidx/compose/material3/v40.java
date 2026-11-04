package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class v40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f33860a = 0;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a extends v40 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f33861c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.b f33862b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final androidx.compose.ui.e.b a() {
            return this.f33862b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return Intrinsics.areEqual(this.f33862b, ((a) obj).f33862b);
            }
            return false;
        }

        public int hashCode() {
            return this.f33862b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Above(alignment=" + this.f33862b + ')';
        }

        public a(@NotNull androidx.compose.ui.e.b bVar) {
            super(null);
            this.f33862b = bVar;
        }

        public /* synthetic */ a(androidx.compose.ui.e.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? androidx.compose.ui.e.f37317a.u() : bVar);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b extends v40 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f33863e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f33864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.b f33865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.b f33866d;

        public b() {
            this(false, null, null, 7, null);
        }

        public final boolean a() {
            return this.f33864b;
        }

        @NotNull
        public final androidx.compose.ui.e.b b() {
            return this.f33866d;
        }

        @NotNull
        public final androidx.compose.ui.e.b c() {
            return this.f33865c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f33864b == bVar.f33864b && Intrinsics.areEqual(this.f33865c, bVar.f33865c) && Intrinsics.areEqual(this.f33866d, bVar.f33866d);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f33864b) * 31) + this.f33865c.hashCode()) * 31) + this.f33866d.hashCode();
        }

        @NotNull
        public String toString() {
            return "Attached(alwaysMinimize=" + this.f33864b + ", minimizedAlignment=" + this.f33865c + ", expandedAlignment=" + this.f33866d + ')';
        }

        public /* synthetic */ b(boolean z10, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.b bVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? androidx.compose.ui.e.f37317a.u() : bVar, (i10 & 4) != 0 ? androidx.compose.ui.e.f37317a.u() : bVar2);
        }

        public b(boolean z10, @NotNull androidx.compose.ui.e.b bVar, @NotNull androidx.compose.ui.e.b bVar2) {
            super(null);
            this.f33864b = z10;
            this.f33865c = bVar;
            this.f33866d = bVar2;
        }
    }

    public /* synthetic */ v40(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private v40() {
    }
}
