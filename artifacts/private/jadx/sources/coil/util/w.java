package coil.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f87875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f87876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f87878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final coil.decode.k f87879e;

    public w() {
        this(false, false, false, 0, null, 31, null);
    }

    public static /* synthetic */ w b(w wVar, boolean z10, boolean z11, boolean z12, int i10, coil.decode.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = wVar.f87875a;
        }
        if ((i11 & 2) != 0) {
            z11 = wVar.f87876b;
        }
        if ((i11 & 4) != 0) {
            z12 = wVar.f87877c;
        }
        if ((i11 & 8) != 0) {
            i10 = wVar.f87878d;
        }
        if ((i11 & 16) != 0) {
            kVar = wVar.f87879e;
        }
        coil.decode.k kVar2 = kVar;
        boolean z13 = z12;
        return wVar.a(z10, z11, z13, i10, kVar2);
    }

    @NotNull
    public final w a(boolean z10, boolean z11, boolean z12, int i10, @NotNull coil.decode.k kVar) {
        return new w(z10, z11, z12, i10, kVar);
    }

    public final boolean c() {
        return this.f87875a;
    }

    @NotNull
    public final coil.decode.k d() {
        return this.f87879e;
    }

    public final int e() {
        return this.f87878d;
    }

    public final boolean f() {
        return this.f87876b;
    }

    public final boolean g() {
        return this.f87877c;
    }

    public w(boolean z10, boolean z11, boolean z12, int i10, @NotNull coil.decode.k kVar) {
        this.f87875a = z10;
        this.f87876b = z11;
        this.f87877c = z12;
        this.f87878d = i10;
        this.f87879e = kVar;
    }

    public /* synthetic */ w(boolean z10, boolean z11, boolean z12, int i10, coil.decode.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? 4 : i10, (i11 & 16) != 0 ? coil.decode.k.RESPECT_PERFORMANCE : kVar);
    }
}
