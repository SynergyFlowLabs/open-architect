package androidx.compose.ui.window;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f42992g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f42995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f42996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f42997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f42998f;

    public t(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f42993a = i10;
        this.f42994b = z10;
        this.f42995c = z11;
        this.f42996d = z12;
        this.f42997e = z13;
        this.f42998f = z14;
    }

    public final boolean a() {
        return (this.f42993a & 512) == 0;
    }

    public final boolean b() {
        return this.f42995c;
    }

    public final boolean c() {
        return this.f42996d;
    }

    public final boolean d() {
        return this.f42997e;
    }

    public final int e() {
        return this.f42993a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f42993a == tVar.f42993a && this.f42994b == tVar.f42994b && this.f42995c == tVar.f42995c && this.f42996d == tVar.f42996d && this.f42997e == tVar.f42997e && this.f42998f == tVar.f42998f;
    }

    public final boolean f() {
        return (this.f42993a & 8) == 0;
    }

    public final boolean g() {
        return this.f42994b;
    }

    @NotNull
    public final u h() {
        if (this.f42994b) {
            return u.Inherit;
        }
        return (this.f42993a & 8192) == 0 ? u.SecureOff : u.SecureOn;
    }

    public int hashCode() {
        return (((((((((this.f42993a * 31) + Boolean.hashCode(this.f42994b)) * 31) + Boolean.hashCode(this.f42995c)) * 31) + Boolean.hashCode(this.f42996d)) * 31) + Boolean.hashCode(this.f42997e)) * 31) + Boolean.hashCode(this.f42998f);
    }

    public final boolean i() {
        return this.f42998f;
    }

    public /* synthetic */ t(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? true : z10, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? true : z13, (i11 & 32) != 0 ? false : z14);
    }

    public /* synthetic */ t(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }

    public t(boolean z10, boolean z11, boolean z12, boolean z13) {
        this(z10, z11, z12, u.Inherit, true, z13);
    }

    public /* synthetic */ t(boolean z10, boolean z11, boolean z12, u uVar, boolean z13, boolean z14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? u.Inherit : uVar, (i10 & 16) != 0 ? true : z13, (i10 & 32) != 0 ? true : z14);
    }

    public t(boolean z10, boolean z11, boolean z12, @NotNull u uVar, boolean z13, boolean z14) {
        this(z10, z11, z12, uVar, z13, z14, false);
    }

    public /* synthetic */ t(boolean z10, boolean z11, boolean z12, u uVar, boolean z13, boolean z14, boolean z15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? u.Inherit : uVar, (i10 & 16) != 0 ? true : z13, (i10 & 32) != 0 ? true : z14, (i10 & 64) != 0 ? false : z15);
    }

    public t(boolean z10, boolean z11, boolean z12, @NotNull u uVar, boolean z13, boolean z14, boolean z15) {
        this(c.j(z10, uVar, z14), uVar == u.Inherit, z11, z12, z13, z15);
    }
}
