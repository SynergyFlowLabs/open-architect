package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.q2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
final class j implements f, q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f18741a;

    public /* synthetic */ j(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    private final float c() {
        return this.f18741a;
    }

    public static /* synthetic */ j j(j jVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = jVar.f18741a;
        }
        return jVar.i(f10);
    }

    @Override // androidx.compose.foundation.shape.f
    public float a(long j10, @NotNull androidx.compose.ui.unit.d dVar) {
        return dVar.S7(this.f18741a);
    }

    @Override // androidx.compose.ui.platform.q2
    public /* bridge */ /* synthetic */ Object b() {
        return androidx.compose.ui.unit.h.o(k());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && androidx.compose.ui.unit.h.x(this.f18741a, ((j) obj).f18741a);
    }

    public int hashCode() {
        return androidx.compose.ui.unit.h.D(this.f18741a);
    }

    @NotNull
    public final j i(float f10) {
        return new j(f10, null);
    }

    public float k() {
        return this.f18741a;
    }

    @NotNull
    public String toString() {
        return "CornerSize(size = " + this.f18741a + ".dp)";
    }

    private j(float f10) {
        this.f18741a = f10;
    }
}
