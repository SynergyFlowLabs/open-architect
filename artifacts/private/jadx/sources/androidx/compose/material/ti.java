package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,489:1\n49#2:490\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n*L\n318#1:490\n*E\n"})
public final class ti {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f25019c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25021b;

    public /* synthetic */ ti(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    public final float a() {
        return this.f25020a;
    }

    public final float b() {
        return androidx.compose.ui.unit.h.r(this.f25020a + this.f25021b);
    }

    public final float c() {
        return this.f25021b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti)) {
            return false;
        }
        ti tiVar = (ti) obj;
        return androidx.compose.ui.unit.h.x(this.f25020a, tiVar.f25020a) && androidx.compose.ui.unit.h.x(this.f25021b, tiVar.f25021b);
    }

    public int hashCode() {
        return (androidx.compose.ui.unit.h.D(this.f25020a) * 31) + androidx.compose.ui.unit.h.D(this.f25021b);
    }

    @NotNull
    public String toString() {
        return "TabPosition(left=" + ((Object) androidx.compose.ui.unit.h.M(this.f25020a)) + ", right=" + ((Object) androidx.compose.ui.unit.h.M(b())) + ", width=" + ((Object) androidx.compose.ui.unit.h.M(this.f25021b)) + ')';
    }

    private ti(float f10, float f11) {
        this.f25020a = f10;
        this.f25021b = f11;
    }
}
