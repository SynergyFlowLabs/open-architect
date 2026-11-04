package androidx.compose.foundation.text.input.internal.selection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f19963g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f19967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.style.i f19968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f19962f = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final g f19964h = new g(false, n0.g.f332700b.c(), 0.0f, androidx.compose.ui.text.style.i.Ltr, false, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g a() {
            return g.f19964h;
        }

        private a() {
        }
    }

    public /* synthetic */ g(boolean z10, long j10, float f10, androidx.compose.ui.text.style.i iVar, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, j10, f10, iVar, z11);
    }

    public static /* synthetic */ g h(g gVar, boolean z10, long j10, float f10, androidx.compose.ui.text.style.i iVar, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = gVar.f19965a;
        }
        if ((i10 & 2) != 0) {
            j10 = gVar.f19966b;
        }
        if ((i10 & 4) != 0) {
            f10 = gVar.f19967c;
        }
        if ((i10 & 8) != 0) {
            iVar = gVar.f19968d;
        }
        if ((i10 & 16) != 0) {
            z11 = gVar.f19969e;
        }
        boolean z12 = z11;
        float f11 = f10;
        return gVar.g(z10, j10, f11, iVar, z12);
    }

    public final boolean b() {
        return this.f19965a;
    }

    public final long c() {
        return this.f19966b;
    }

    public final float d() {
        return this.f19967c;
    }

    @NotNull
    public final androidx.compose.ui.text.style.i e() {
        return this.f19968d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f19965a == gVar.f19965a && n0.g.l(this.f19966b, gVar.f19966b) && Float.compare(this.f19967c, gVar.f19967c) == 0 && this.f19968d == gVar.f19968d && this.f19969e == gVar.f19969e;
    }

    public final boolean f() {
        return this.f19969e;
    }

    @NotNull
    public final g g(boolean z10, long j10, float f10, @NotNull androidx.compose.ui.text.style.i iVar, boolean z11) {
        return new g(z10, j10, f10, iVar, z11, null);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f19965a) * 31) + n0.g.t(this.f19966b)) * 31) + Float.hashCode(this.f19967c)) * 31) + this.f19968d.hashCode()) * 31) + Boolean.hashCode(this.f19969e);
    }

    @NotNull
    public final androidx.compose.ui.text.style.i i() {
        return this.f19968d;
    }

    public final boolean j() {
        return this.f19969e;
    }

    public final float k() {
        return this.f19967c;
    }

    public final long l() {
        return this.f19966b;
    }

    public final boolean m() {
        return this.f19965a;
    }

    @NotNull
    public String toString() {
        return "TextFieldHandleState(visible=" + this.f19965a + ", position=" + ((Object) n0.g.z(this.f19966b)) + ", lineHeight=" + this.f19967c + ", direction=" + this.f19968d + ", handlesCrossed=" + this.f19969e + ')';
    }

    private g(boolean z10, long j10, float f10, androidx.compose.ui.text.style.i iVar, boolean z11) {
        this.f19965a = z10;
        this.f19966b = j10;
        this.f19967c = f10;
        this.f19968d = iVar;
        this.f19969e = z11;
    }
}
