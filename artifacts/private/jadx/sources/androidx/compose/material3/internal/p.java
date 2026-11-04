package androidx.compose.material3.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f29046a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f29047b = 0;

    @androidx.compose.runtime.o2
    public static final class a implements a3.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f29048d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.b f29049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.b f29050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f29051c;

        public a(@NotNull androidx.compose.ui.e.b bVar, @NotNull androidx.compose.ui.e.b bVar2, int i10) {
            this.f29049a = bVar;
            this.f29050b = bVar2;
            this.f29051c = i10;
        }

        private final androidx.compose.ui.e.b b() {
            return this.f29049a;
        }

        private final androidx.compose.ui.e.b c() {
            return this.f29050b;
        }

        private final int d() {
            return this.f29051c;
        }

        public static /* synthetic */ a f(a aVar, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.b bVar2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = aVar.f29049a;
            }
            if ((i11 & 2) != 0) {
                bVar2 = aVar.f29050b;
            }
            if ((i11 & 4) != 0) {
                i10 = aVar.f29051c;
            }
            return aVar.e(bVar, bVar2, i10);
        }

        @Override // androidx.compose.material3.internal.a3.a
        public int a(@NotNull androidx.compose.ui.unit.s sVar, long j10, int i10, @NotNull androidx.compose.ui.unit.w wVar) {
            int iA = this.f29050b.a(0, sVar.G(), wVar);
            int i11 = -this.f29049a.a(0, i10, wVar);
            androidx.compose.ui.unit.w wVar2 = androidx.compose.ui.unit.w.Ltr;
            int i12 = this.f29051c;
            if (wVar != wVar2) {
                i12 = -i12;
            }
            return sVar.t() + iA + i11 + i12;
        }

        @NotNull
        public final a e(@NotNull androidx.compose.ui.e.b bVar, @NotNull androidx.compose.ui.e.b bVar2, int i10) {
            return new a(bVar, bVar2, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f29049a, aVar.f29049a) && Intrinsics.areEqual(this.f29050b, aVar.f29050b) && this.f29051c == aVar.f29051c;
        }

        public int hashCode() {
            return (((this.f29049a.hashCode() * 31) + this.f29050b.hashCode()) * 31) + Integer.hashCode(this.f29051c);
        }

        @NotNull
        public String toString() {
            return "Horizontal(menuAlignment=" + this.f29049a + ", anchorAlignment=" + this.f29050b + ", offset=" + this.f29051c + ')';
        }
    }

    @androidx.compose.runtime.o2
    public static final class b implements a3.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f29052d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.c f29053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.c f29054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f29055c;

        public b(@NotNull androidx.compose.ui.e.c cVar, @NotNull androidx.compose.ui.e.c cVar2, int i10) {
            this.f29053a = cVar;
            this.f29054b = cVar2;
            this.f29055c = i10;
        }

        private final androidx.compose.ui.e.c b() {
            return this.f29053a;
        }

        private final androidx.compose.ui.e.c c() {
            return this.f29054b;
        }

        private final int d() {
            return this.f29055c;
        }

        public static /* synthetic */ b f(b bVar, androidx.compose.ui.e.c cVar, androidx.compose.ui.e.c cVar2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = bVar.f29053a;
            }
            if ((i11 & 2) != 0) {
                cVar2 = bVar.f29054b;
            }
            if ((i11 & 4) != 0) {
                i10 = bVar.f29055c;
            }
            return bVar.e(cVar, cVar2, i10);
        }

        @Override // androidx.compose.material3.internal.a3.b
        public int a(@NotNull androidx.compose.ui.unit.s sVar, long j10, int i10) {
            int iA = this.f29054b.a(0, sVar.r());
            return sVar.B() + iA + (-this.f29053a.a(0, i10)) + this.f29055c;
        }

        @NotNull
        public final b e(@NotNull androidx.compose.ui.e.c cVar, @NotNull androidx.compose.ui.e.c cVar2, int i10) {
            return new b(cVar, cVar2, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.areEqual(this.f29053a, bVar.f29053a) && Intrinsics.areEqual(this.f29054b, bVar.f29054b) && this.f29055c == bVar.f29055c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f29053a.hashCode() * 31) + this.f29054b.hashCode()) * 31) + Integer.hashCode(this.f29055c);
        }

        @NotNull
        public String toString() {
            return "Vertical(menuAlignment=" + this.f29053a + ", anchorAlignment=" + this.f29054b + ", offset=" + this.f29055c + ')';
        }
    }

    private p() {
    }
}
