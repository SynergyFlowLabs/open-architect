package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@af
public final class ll {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f30368f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.window.u f30369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Boolean f30372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Boolean f30373e;

    public ll() {
        this.f30369a = androidx.compose.ui.window.u.Inherit;
        this.f30370b = true;
        this.f30371c = true;
        this.f30372d = null;
        this.f30373e = null;
    }

    @NotNull
    public final androidx.compose.ui.window.u a() {
        return this.f30369a;
    }

    public final boolean b() {
        return this.f30370b;
    }

    @Nullable
    public final Boolean c() {
        return this.f30373e;
    }

    @Nullable
    public final Boolean d() {
        return this.f30372d;
    }

    @oj.i(name = "shouldDismissOnClickOutside")
    public final boolean e() {
        return this.f30371c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll)) {
            return false;
        }
        ll llVar = (ll) obj;
        return this.f30369a == llVar.f30369a && Intrinsics.areEqual(this.f30372d, llVar.f30372d) && Intrinsics.areEqual(this.f30373e, llVar.f30373e) && this.f30371c == llVar.f30371c && this.f30370b == llVar.f30370b;
    }

    public int hashCode() {
        int iHashCode = ((this.f30369a.hashCode() * 31) + Boolean.hashCode(this.f30370b)) * 31;
        Boolean bool = this.f30372d;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f30373e;
        return ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f30371c);
    }

    public ll(boolean z10, boolean z11) {
        this.f30369a = androidx.compose.ui.window.u.Inherit;
        this.f30370b = z10;
        this.f30371c = z11;
        int i10 = 2 & 0;
        this.f30373e = null;
        this.f30372d = null;
    }

    public /* synthetic */ ll(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11);
    }

    public /* synthetic */ ll(androidx.compose.ui.window.u uVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.window.u.Inherit : uVar, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? true : z11);
    }

    public ll(@NotNull androidx.compose.ui.window.u uVar, boolean z10, boolean z11) {
        this.f30369a = uVar;
        this.f30370b = z10;
        this.f30371c = z11;
        this.f30373e = null;
        this.f30372d = null;
    }

    public /* synthetic */ ll(boolean z10, boolean z11, androidx.compose.ui.window.u uVar, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, (i10 & 4) != 0 ? androidx.compose.ui.window.u.Inherit : uVar, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    public ll(boolean z10, boolean z11, @NotNull androidx.compose.ui.window.u uVar, boolean z12, boolean z13) {
        this.f30370b = z12;
        this.f30371c = z13;
        this.f30369a = uVar;
        this.f30372d = Boolean.valueOf(z10);
        this.f30373e = Boolean.valueOf(z11);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replaced with additional shouldDismissOnScrimClick param constructor.")
    public /* synthetic */ ll(boolean z10) {
        this(z10, true);
    }

    public /* synthetic */ ll(androidx.compose.ui.window.u uVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.window.u.Inherit : uVar, (i10 & 2) != 0 ? true : z10);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use empty constructor or constructor including shouldDismissOnScrimClick param.")
    public /* synthetic */ ll(androidx.compose.ui.window.u uVar, boolean z10) {
        this(uVar, z10, true);
    }

    public /* synthetic */ ll(boolean z10, boolean z11, androidx.compose.ui.window.u uVar, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, (i10 & 4) != 0 ? androidx.compose.ui.window.u.Inherit : uVar, (i10 & 8) != 0 ? true : z12);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use empty constructor or constructor including shouldDismissOnScrimClick param.")
    public /* synthetic */ ll(boolean z10, boolean z11, androidx.compose.ui.window.u uVar, boolean z12) {
        this.f30370b = z12;
        this.f30371c = true;
        this.f30369a = uVar;
        this.f30372d = Boolean.valueOf(z10);
        this.f30373e = Boolean.valueOf(z11);
    }
}
