package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class xw {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f34584e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f34585f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f34586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f34589d;

    @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/SelectedRangeInfo$Companion\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1118:1\n32#2:1119\n32#2:1121\n80#3:1120\n80#3:1122\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/SelectedRangeInfo$Companion\n*L\n982#1:1119\n987#1:1121\n982#1:1120\n987#1:1122\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final xw a(@NotNull androidx.compose.material3.internal.o1 o1Var, @NotNull androidx.compose.material3.internal.j1 j1Var, @NotNull androidx.compose.material3.internal.j1 j1Var2) {
            if (j1Var.v() > o1Var.j() || j1Var2.v() < o1Var.m()) {
                return null;
            }
            boolean z10 = false | true;
            boolean z11 = j1Var.v() >= o1Var.m();
            boolean z12 = j1Var2.v() <= o1Var.j();
            int i10 = z11 ? (o1Var.i() + j1Var.s()) - 1 : o1Var.i();
            int i11 = z12 ? (o1Var.i() + j1Var2.s()) - 1 : (o1Var.i() + o1Var.l()) - 1;
            return new xw(androidx.compose.ui.unit.q.f((((long) (i10 % 7)) << 32) | (((long) (i10 / 7)) & com.rabbitmq.client.k0.f265952a)), androidx.compose.ui.unit.q.f((((long) (i11 / 7)) & com.rabbitmq.client.k0.f265952a) | (((long) (i11 % 7)) << 32)), z11, z12, null);
        }

        private a() {
        }
    }

    public /* synthetic */ xw(long j10, long j11, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, z10, z11);
    }

    public final boolean a() {
        return this.f34588c;
    }

    public final long b() {
        return this.f34587b;
    }

    public final long c() {
        return this.f34586a;
    }

    public final boolean d() {
        return this.f34589d;
    }

    private xw(long j10, long j11, boolean z10, boolean z11) {
        this.f34586a = j10;
        this.f34587b = j11;
        this.f34588c = z10;
        this.f34589d = z11;
    }
}
