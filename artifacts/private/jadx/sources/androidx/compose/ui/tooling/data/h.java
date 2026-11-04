package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@n
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f42528h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f42529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f42530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f42531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f42532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f42533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f42534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f42535g;

    public h(@NotNull String str, @Nullable Object obj, boolean z10, boolean z11, boolean z12, @Nullable String str2, boolean z13) {
        this.f42529a = str;
        this.f42530b = obj;
        this.f42531c = z10;
        this.f42532d = z11;
        this.f42533e = z12;
        this.f42534f = str2;
        this.f42535g = z13;
    }

    public static /* synthetic */ h i(h hVar, String str, Object obj, boolean z10, boolean z11, boolean z12, String str2, boolean z13, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = hVar.f42529a;
        }
        if ((i10 & 2) != 0) {
            obj = hVar.f42530b;
        }
        if ((i10 & 4) != 0) {
            z10 = hVar.f42531c;
        }
        if ((i10 & 8) != 0) {
            z11 = hVar.f42532d;
        }
        if ((i10 & 16) != 0) {
            z12 = hVar.f42533e;
        }
        if ((i10 & 32) != 0) {
            str2 = hVar.f42534f;
        }
        if ((i10 & 64) != 0) {
            z13 = hVar.f42535g;
        }
        String str3 = str2;
        boolean z14 = z13;
        boolean z15 = z12;
        boolean z16 = z10;
        return hVar.h(str, obj, z16, z11, z15, str3, z14);
    }

    @NotNull
    public final String a() {
        return this.f42529a;
    }

    @Nullable
    public final Object b() {
        return this.f42530b;
    }

    public final boolean c() {
        return this.f42531c;
    }

    public final boolean d() {
        return this.f42532d;
    }

    public final boolean e() {
        return this.f42533e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f42529a, hVar.f42529a) && Intrinsics.areEqual(this.f42530b, hVar.f42530b) && this.f42531c == hVar.f42531c && this.f42532d == hVar.f42532d && this.f42533e == hVar.f42533e && Intrinsics.areEqual(this.f42534f, hVar.f42534f) && this.f42535g == hVar.f42535g;
    }

    @Nullable
    public final String f() {
        return this.f42534f;
    }

    public final boolean g() {
        return this.f42535g;
    }

    @NotNull
    public final h h(@NotNull String str, @Nullable Object obj, boolean z10, boolean z11, boolean z12, @Nullable String str2, boolean z13) {
        return new h(str, obj, z10, z11, z12, str2, z13);
    }

    public int hashCode() {
        int iHashCode = this.f42529a.hashCode() * 31;
        Object obj = this.f42530b;
        int iHashCode2 = 0;
        int iHashCode3 = (((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + Boolean.hashCode(this.f42531c)) * 31) + Boolean.hashCode(this.f42532d)) * 31) + Boolean.hashCode(this.f42533e)) * 31;
        String str = this.f42534f;
        if (str != null) {
            iHashCode2 = str.hashCode();
        }
        return ((iHashCode3 + iHashCode2) * 31) + Boolean.hashCode(this.f42535g);
    }

    public final boolean j() {
        return this.f42533e;
    }

    public final boolean k() {
        return this.f42531c;
    }

    @Nullable
    public final String l() {
        return this.f42534f;
    }

    @NotNull
    public final String m() {
        return this.f42529a;
    }

    public final boolean n() {
        return this.f42535g;
    }

    public final boolean o() {
        return this.f42532d;
    }

    @Nullable
    public final Object p() {
        return this.f42530b;
    }

    @NotNull
    public String toString() {
        return "ParameterInformation(name=" + this.f42529a + ", value=" + this.f42530b + ", fromDefault=" + this.f42531c + ", static=" + this.f42532d + ", compared=" + this.f42533e + ", inlineClass=" + this.f42534f + ", stable=" + this.f42535g + ')';
    }
}
