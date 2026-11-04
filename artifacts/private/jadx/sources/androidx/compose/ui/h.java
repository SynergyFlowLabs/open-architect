package androidx.compose.ui;

import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
@SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,284:1\n54#2:285\n59#2:287\n85#3:286\n90#3:288\n80#3:291\n26#4:289\n32#5:290\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n*L\n152#1:285\n153#1:287\n152#1:286\n153#1:288\n163#1:291\n163#1:289\n163#1:290\n*E\n"})
public final class h implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38726d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f38727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f38728c;

    @o2
    @SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,284:1\n26#2:285\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n*L\n184#1:285\n*E\n"})
    public static final class a implements e.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38729b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f38730a;

        public a(float f10) {
            this.f38730a = f10;
        }

        public static /* synthetic */ a e(a aVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f38730a;
            }
            return aVar.d(f10);
        }

        @Override // androidx.compose.ui.e.b
        public int a(int i10, int i11, @NotNull androidx.compose.ui.unit.w wVar) {
            float f10;
            float f11 = (i11 - i10) / 2.0f;
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                f10 = this.f38730a;
            } else {
                f10 = this.f38730a * (-1);
            }
            return Math.round(f11 * (1 + f10));
        }

        @Override // androidx.compose.ui.e.b
        @NotNull
        public e b(@NotNull e.c cVar) {
            return cVar instanceof b ? new h(this.f38730a, ((b) cVar).f()) : super.b(cVar);
        }

        public final float c() {
            return this.f38730a;
        }

        @NotNull
        public final a d(float f10) {
            return new a(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f38730a, ((a) obj).f38730a) == 0;
        }

        public final float f() {
            return this.f38730a;
        }

        public int hashCode() {
            return Float.hashCode(this.f38730a);
        }

        @NotNull
        public String toString() {
            return "Horizontal(bias=" + this.f38730a + ')';
        }
    }

    @o2
    @SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,284:1\n26#2:285\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n*L\n211#1:285\n*E\n"})
    public static final class b implements e.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38731b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f38732a;

        public b(float f10) {
            this.f38732a = f10;
        }

        public static /* synthetic */ b e(b bVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = bVar.f38732a;
            }
            return bVar.d(f10);
        }

        @Override // androidx.compose.ui.e.c
        public int a(int i10, int i11) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.f38732a));
        }

        @Override // androidx.compose.ui.e.c
        @NotNull
        public e b(@NotNull e.b bVar) {
            if (bVar instanceof a) {
                return new h(((a) bVar).f(), this.f38732a);
            }
            return bVar instanceof g.a ? new g(((g.a) bVar).f(), this.f38732a) : super.b(bVar);
        }

        public final float c() {
            return this.f38732a;
        }

        @NotNull
        public final b d(float f10) {
            return new b(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f38732a, ((b) obj).f38732a) == 0;
        }

        public final float f() {
            return this.f38732a;
        }

        public int hashCode() {
            return Float.hashCode(this.f38732a);
        }

        @NotNull
        public String toString() {
            return "Vertical(bias=" + this.f38732a + ')';
        }
    }

    public h(float f10, float f11) {
        this.f38727b = f10;
        this.f38728c = f11;
    }

    public static /* synthetic */ h e(h hVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = hVar.f38727b;
        }
        if ((i10 & 2) != 0) {
            f11 = hVar.f38728c;
        }
        return hVar.d(f10, f11);
    }

    @Override // androidx.compose.ui.e
    public long a(long j10, long j11, @NotNull androidx.compose.ui.unit.w wVar) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & k0.f265952a)) - ((int) (j10 & k0.f265952a))) / 2.0f;
        float f12 = 1;
        return androidx.compose.ui.unit.q.f((((long) Math.round(f11 * (f12 + this.f38728c))) & k0.f265952a) | (((long) Math.round(f10 * ((wVar == androidx.compose.ui.unit.w.Ltr ? this.f38727b : (-1) * this.f38727b) + f12))) << 32));
    }

    public final float b() {
        return this.f38727b;
    }

    public final float c() {
        return this.f38728c;
    }

    @NotNull
    public final h d(float f10, float f11) {
        return new h(f10, f11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f38727b, hVar.f38727b) == 0 && Float.compare(this.f38728c, hVar.f38728c) == 0;
    }

    public final float f() {
        return this.f38727b;
    }

    public final float g() {
        return this.f38728c;
    }

    public int hashCode() {
        return (Float.hashCode(this.f38727b) * 31) + Float.hashCode(this.f38728c);
    }

    @NotNull
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f38727b + ", verticalBias=" + this.f38728c + ')';
    }
}
