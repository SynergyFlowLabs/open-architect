package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,147:1\n635#2:148\n118#3,4:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n93#1:148\n93#1:149,4\n*E\n"})
final class d implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42148b;

    public /* synthetic */ d(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public static /* synthetic */ d i(d dVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = dVar.f42148b;
        }
        return dVar.h(j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && q0.y(this.f42148b, ((d) obj).f42148b);
    }

    public final long g() {
        return this.f42148b;
    }

    @NotNull
    public final d h(long j10) {
        return new d(j10, null);
    }

    public int hashCode() {
        return q0.K(this.f42148b);
    }

    public final long j() {
        return this.f42148b;
    }

    @Override // androidx.compose.ui.text.style.p
    @Nullable
    public i0 o0() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.p
    public float r() {
        return q0.A(u());
    }

    @NotNull
    public String toString() {
        return "ColorStyle(value=" + ((Object) q0.L(this.f42148b)) + ')';
    }

    @Override // androidx.compose.ui.text.style.p
    public long u() {
        return this.f42148b;
    }

    private d(long j10) {
        this.f42148b = j10;
        if (j10 != 16) {
            return;
        }
        x0.a.e("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }
}
