package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,90:1\n113#2:91\n113#2:92\n113#2:93\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n*L\n51#1:91\n53#1:92\n55#1:93\n*E\n"})
public final class re {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24653d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f24654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f24655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f24656c;

    public re() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ re b(re reVar, androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = reVar.f24654a;
        }
        if ((i10 & 2) != 0) {
            eVar2 = reVar.f24655b;
        }
        if ((i10 & 4) != 0) {
            eVar3 = reVar.f24656c;
        }
        return reVar.a(eVar, eVar2, eVar3);
    }

    @NotNull
    public final re a(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.e eVar2, @NotNull androidx.compose.foundation.shape.e eVar3) {
        return new re(eVar, eVar2, eVar3);
    }

    @NotNull
    public final androidx.compose.foundation.shape.e c() {
        return this.f24656c;
    }

    @NotNull
    public final androidx.compose.foundation.shape.e d() {
        return this.f24655b;
    }

    @NotNull
    public final androidx.compose.foundation.shape.e e() {
        return this.f24654a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return Intrinsics.areEqual(this.f24654a, reVar.f24654a) && Intrinsics.areEqual(this.f24655b, reVar.f24655b) && Intrinsics.areEqual(this.f24656c, reVar.f24656c);
    }

    public int hashCode() {
        return (((this.f24654a.hashCode() * 31) + this.f24655b.hashCode()) * 31) + this.f24656c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Shapes(small=" + this.f24654a + ", medium=" + this.f24655b + ", large=" + this.f24656c + ')';
    }

    public re(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.e eVar2, @NotNull androidx.compose.foundation.shape.e eVar3) {
        this.f24654a = eVar;
        this.f24655b = eVar2;
        this.f24656c = eVar3;
    }

    public /* synthetic */ re(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(4)) : eVar, (i10 & 2) != 0 ? androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(4)) : eVar2, (i10 & 4) != 0 ? androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(0)) : eVar3);
    }
}
