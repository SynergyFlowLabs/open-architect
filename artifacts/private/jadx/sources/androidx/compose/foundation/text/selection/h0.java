package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21092d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f21093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f21094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21095c;

    @androidx.compose.runtime.o2
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f21096d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.text.style.i f21097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f21099c;

        public a(@NotNull androidx.compose.ui.text.style.i iVar, int i10, long j10) {
            this.f21097a = iVar;
            this.f21098b = i10;
            this.f21099c = j10;
        }

        public static /* synthetic */ a e(a aVar, androidx.compose.ui.text.style.i iVar, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iVar = aVar.f21097a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f21098b;
            }
            if ((i11 & 4) != 0) {
                j10 = aVar.f21099c;
            }
            return aVar.d(iVar, i10, j10);
        }

        @NotNull
        public final androidx.compose.ui.text.style.i a() {
            return this.f21097a;
        }

        public final int b() {
            return this.f21098b;
        }

        public final long c() {
            return this.f21099c;
        }

        @NotNull
        public final a d(@NotNull androidx.compose.ui.text.style.i iVar, int i10, long j10) {
            return new a(iVar, i10, j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21097a == aVar.f21097a && this.f21098b == aVar.f21098b && this.f21099c == aVar.f21099c;
        }

        @NotNull
        public final androidx.compose.ui.text.style.i f() {
            return this.f21097a;
        }

        public final int g() {
            return this.f21098b;
        }

        public final long h() {
            return this.f21099c;
        }

        public int hashCode() {
            return (((this.f21097a.hashCode() * 31) + Integer.hashCode(this.f21098b)) * 31) + Long.hashCode(this.f21099c);
        }

        @NotNull
        public String toString() {
            return "AnchorInfo(direction=" + this.f21097a + ", offset=" + this.f21098b + ", selectableId=" + this.f21099c + ')';
        }
    }

    public h0(@NotNull a aVar, @NotNull a aVar2, boolean z10) {
        this.f21093a = aVar;
        this.f21094b = aVar2;
        this.f21095c = z10;
    }

    public static /* synthetic */ h0 e(h0 h0Var, a aVar, a aVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = h0Var.f21093a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = h0Var.f21094b;
        }
        if ((i10 & 4) != 0) {
            z10 = h0Var.f21095c;
        }
        return h0Var.d(aVar, aVar2, z10);
    }

    @NotNull
    public final a a() {
        return this.f21093a;
    }

    @NotNull
    public final a b() {
        return this.f21094b;
    }

    public final boolean c() {
        return this.f21095c;
    }

    @NotNull
    public final h0 d(@NotNull a aVar, @NotNull a aVar2, boolean z10) {
        return new h0(aVar, aVar2, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.areEqual(this.f21093a, h0Var.f21093a) && Intrinsics.areEqual(this.f21094b, h0Var.f21094b) && this.f21095c == h0Var.f21095c;
    }

    @NotNull
    public final a f() {
        return this.f21094b;
    }

    public final boolean g() {
        return this.f21095c;
    }

    @NotNull
    public final a h() {
        return this.f21093a;
    }

    public int hashCode() {
        return (((this.f21093a.hashCode() * 31) + this.f21094b.hashCode()) * 31) + Boolean.hashCode(this.f21095c);
    }

    @NotNull
    public final h0 i(@Nullable h0 h0Var) {
        if (h0Var == null) {
            return this;
        }
        boolean z10 = this.f21095c;
        if (z10 || h0Var.f21095c) {
            return new h0(h0Var.f21095c ? h0Var.f21093a : h0Var.f21094b, z10 ? this.f21094b : this.f21093a, true);
        }
        return e(this, null, h0Var.f21094b, false, 5, null);
    }

    public final long j() {
        return androidx.compose.ui.text.x3.b(this.f21093a.g(), this.f21094b.g());
    }

    @NotNull
    public String toString() {
        return "Selection(start=" + this.f21093a + ", end=" + this.f21094b + ", handlesCrossed=" + this.f21095c + ')';
    }

    public /* synthetic */ h0(a aVar, a aVar2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, (i10 & 4) != 0 ? false : z10);
    }
}
