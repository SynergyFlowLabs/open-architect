package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1427:1\n49#2:1428\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n*L\n950#1:1428\n*E\n"})
public final class f30 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27520d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f27521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f27522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f27523c;

    public /* synthetic */ f30(float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12);
    }

    public final float a() {
        return this.f27523c;
    }

    public final float b() {
        return this.f27521a;
    }

    public final float c() {
        return androidx.compose.ui.unit.h.r(this.f27521a + this.f27522b);
    }

    public final float d() {
        return this.f27522b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f30)) {
            return false;
        }
        f30 f30Var = (f30) obj;
        return androidx.compose.ui.unit.h.x(this.f27521a, f30Var.f27521a) && androidx.compose.ui.unit.h.x(this.f27522b, f30Var.f27522b) && androidx.compose.ui.unit.h.x(this.f27523c, f30Var.f27523c);
    }

    public int hashCode() {
        return (((androidx.compose.ui.unit.h.D(this.f27521a) * 31) + androidx.compose.ui.unit.h.D(this.f27522b)) * 31) + androidx.compose.ui.unit.h.D(this.f27523c);
    }

    @NotNull
    public String toString() {
        return "TabPosition(left=" + ((Object) androidx.compose.ui.unit.h.M(this.f27521a)) + ", right=" + ((Object) androidx.compose.ui.unit.h.M(c())) + ", width=" + ((Object) androidx.compose.ui.unit.h.M(this.f27522b)) + ", contentWidth=" + ((Object) androidx.compose.ui.unit.h.M(this.f27523c)) + ')';
    }

    private f30(float f10, float f11, float f12) {
        this.f27521a = f10;
        this.f27522b = f11;
        this.f27523c = f12;
    }
}
