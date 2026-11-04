package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,715:1\n1#2:716\n*E\n"})
final class y1 implements v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f16551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f16553e;

    public /* synthetic */ y1(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        return dVar.g6(this.f16551c);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return dVar.g6(this.f16552d);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        return dVar.g6(this.f16553e);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return dVar.g6(this.f16550b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return androidx.compose.ui.unit.h.x(this.f16550b, y1Var.f16550b) && androidx.compose.ui.unit.h.x(this.f16551c, y1Var.f16551c) && androidx.compose.ui.unit.h.x(this.f16552d, y1Var.f16552d) && androidx.compose.ui.unit.h.x(this.f16553e, y1Var.f16553e);
    }

    public int hashCode() {
        return (((((androidx.compose.ui.unit.h.D(this.f16550b) * 31) + androidx.compose.ui.unit.h.D(this.f16551c)) * 31) + androidx.compose.ui.unit.h.D(this.f16552d)) * 31) + androidx.compose.ui.unit.h.D(this.f16553e);
    }

    @NotNull
    public String toString() {
        return "Insets(left=" + ((Object) androidx.compose.ui.unit.h.M(this.f16550b)) + ", top=" + ((Object) androidx.compose.ui.unit.h.M(this.f16551c)) + ", right=" + ((Object) androidx.compose.ui.unit.h.M(this.f16552d)) + ", bottom=" + ((Object) androidx.compose.ui.unit.h.M(this.f16553e)) + ')';
    }

    private y1(float f10, float f11, float f12, float f13) {
        this.f16550b = f10;
        this.f16551c = f11;
        this.f16552d = f12;
        this.f16553e = f13;
    }
}
