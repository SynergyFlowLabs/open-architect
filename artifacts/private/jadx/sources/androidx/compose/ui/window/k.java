package androidx.compose.ui.window;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f42943g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f42944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u f42946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f42947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f42948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f42949f;

    public k() {
        this(false, false, null, false, false, null, 63, null);
    }

    public final boolean a() {
        return this.f42948e;
    }

    public final boolean b() {
        return this.f42944a;
    }

    public final boolean c() {
        return this.f42945b;
    }

    @NotNull
    public final u d() {
        return this.f42946c;
    }

    public final boolean e() {
        return this.f42947d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f42944a == kVar.f42944a && this.f42945b == kVar.f42945b && this.f42946c == kVar.f42946c && this.f42947d == kVar.f42947d && this.f42948e == kVar.f42948e;
    }

    @NotNull
    public final String f() {
        return this.f42949f;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f42944a) * 31) + Boolean.hashCode(this.f42945b)) * 31) + this.f42946c.hashCode()) * 31) + Boolean.hashCode(this.f42947d)) * 31) + Boolean.hashCode(this.f42948e);
    }

    public k(boolean z10, boolean z11, @NotNull u uVar, boolean z12, boolean z13, @NotNull String str) {
        this.f42944a = z10;
        this.f42945b = z11;
        this.f42946c = uVar;
        this.f42947d = z12;
        this.f42948e = z13;
        this.f42949f = str;
    }

    public /* synthetic */ k(boolean z10, boolean z11, u uVar, boolean z12, boolean z13, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? u.Inherit : uVar, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13, (i10 & 32) != 0 ? "" : str);
    }

    public /* synthetic */ k(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public k(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, u.Inherit, z12, true, null, 32, null);
    }

    public /* synthetic */ k(boolean z10, boolean z11, u uVar, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? u.Inherit : uVar, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public /* synthetic */ k(boolean z10, boolean z11, u uVar, boolean z12, boolean z13) {
        this(z10, z11, u.Inherit, z12, true, "");
    }

    public /* synthetic */ k(boolean z10, boolean z11, u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? u.Inherit : uVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public /* synthetic */ k(boolean z10, boolean z11, u uVar) {
        this(z10, z11, uVar, true, true, null, 32, null);
    }
}
