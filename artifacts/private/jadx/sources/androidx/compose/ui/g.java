package androidx.compose.ui;

import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
@SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,284:1\n54#2:285\n59#2:287\n54#2:291\n59#2:293\n85#3:286\n90#3:288\n80#3:290\n85#3:292\n90#3:294\n80#3:297\n30#4:289\n26#5:295\n32#6:296\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n*L\n244#1:285\n244#1:287\n245#1:291\n246#1:293\n244#1:286\n244#1:288\n244#1:290\n245#1:292\n246#1:294\n250#1:297\n244#1:289\n250#1:295\n250#1:296\n*E\n"})
public final class g implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f37489d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f37490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37491c;

    @o2
    @SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,284:1\n26#2:285\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n*L\n273#1:285\n*E\n"})
    public static final class a implements e.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f37492b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f37493a;

        public a(float f10) {
            this.f37493a = f10;
        }

        public static /* synthetic */ a e(a aVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f37493a;
            }
            return aVar.d(f10);
        }

        @Override // androidx.compose.ui.e.b
        public int a(int i10, int i11, @NotNull androidx.compose.ui.unit.w wVar) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.f37493a));
        }

        @Override // androidx.compose.ui.e.b
        @NotNull
        public e b(@NotNull e.c cVar) {
            return cVar instanceof h.b ? new g(this.f37493a, ((h.b) cVar).f()) : super.b(cVar);
        }

        public final float c() {
            return this.f37493a;
        }

        @NotNull
        public final a d(float f10) {
            return new a(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f37493a, ((a) obj).f37493a) == 0;
        }

        public final float f() {
            return this.f37493a;
        }

        public int hashCode() {
            return Float.hashCode(this.f37493a);
        }

        @NotNull
        public String toString() {
            return "Horizontal(bias=" + this.f37493a + ')';
        }
    }

    public g(float f10, float f11) {
        this.f37490b = f10;
        this.f37491c = f11;
    }

    public static /* synthetic */ g e(g gVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = gVar.f37490b;
        }
        if ((i10 & 2) != 0) {
            f11 = gVar.f37491c;
        }
        return gVar.d(f10, f11);
    }

    @Override // androidx.compose.ui.e
    public long a(long j10, long j11, @NotNull androidx.compose.ui.unit.w wVar) {
        long jE = androidx.compose.ui.unit.u.e((((long) (((int) (j11 >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j11 & k0.f265952a)) - ((int) (j10 & k0.f265952a)))) & k0.f265952a));
        float f10 = ((int) (jE >> 32)) / 2.0f;
        float f11 = ((int) (jE & k0.f265952a)) / 2.0f;
        float f12 = 1;
        float f13 = f10 * (this.f37490b + f12);
        return androidx.compose.ui.unit.q.f((((long) Math.round(f11 * (f12 + this.f37491c))) & k0.f265952a) | (((long) Math.round(f13)) << 32));
    }

    public final float b() {
        return this.f37490b;
    }

    public final float c() {
        return this.f37491c;
    }

    @NotNull
    public final g d(float f10, float f11) {
        return new g(f10, f11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f37490b, gVar.f37490b) == 0 && Float.compare(this.f37491c, gVar.f37491c) == 0;
    }

    public final float f() {
        return this.f37490b;
    }

    public final float g() {
        return this.f37491c;
    }

    public int hashCode() {
        return (Float.hashCode(this.f37490b) * 31) + Float.hashCode(this.f37491c);
    }

    @NotNull
    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f37490b + ", verticalBias=" + this.f37491c + ')';
    }
}
