package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,139:1\n252#2:140\n252#2:145\n118#3,4:141\n118#3,4:146\n*S KotlinDebug\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n*L\n44#1:140\n45#1:145\n44#1:141,4\n45#1:146,4\n*E\n"})
public final class v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42314d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42317c;

    public /* synthetic */ v0(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, i10);
    }

    public static /* synthetic */ v0 b(v0 v0Var, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = v0Var.f42315a;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = v0Var.f42316b;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = v0Var.f42317c;
        }
        return v0Var.a(j12, j13, i10);
    }

    @NotNull
    public final v0 a(long j10, long j11, int i10) {
        return new v0(j10, j11, i10, null);
    }

    public final long c() {
        return this.f42316b;
    }

    public final int d() {
        return this.f42317c;
    }

    public final long e() {
        return this.f42315a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return androidx.compose.ui.unit.z.j(this.f42315a, v0Var.f42315a) && androidx.compose.ui.unit.z.j(this.f42316b, v0Var.f42316b) && w0.k(this.f42317c, v0Var.f42317c);
    }

    public int hashCode() {
        return (((androidx.compose.ui.unit.z.o(this.f42315a) * 31) + androidx.compose.ui.unit.z.o(this.f42316b)) * 31) + w0.l(this.f42317c);
    }

    @NotNull
    public String toString() {
        return "Placeholder(width=" + ((Object) androidx.compose.ui.unit.z.u(this.f42315a)) + ", height=" + ((Object) androidx.compose.ui.unit.z.u(this.f42316b)) + ", placeholderVerticalAlign=" + ((Object) w0.m(this.f42317c)) + ')';
    }

    private v0(long j10, long j11, int i10) {
        this.f42315a = j10;
        this.f42316b = j11;
        this.f42317c = i10;
        if (androidx.compose.ui.unit.z.l(j10) == 0) {
            x0.a.e("width cannot be TextUnit.Unspecified");
        }
        if (androidx.compose.ui.unit.z.l(j11) == 0) {
            x0.a.e("height cannot be TextUnit.Unspecified");
        }
    }
}
