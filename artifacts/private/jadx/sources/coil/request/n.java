package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f87719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bitmap.Config f87720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final ColorSpace f87721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final coil.size.i f87722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final coil.size.h f87723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f87724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f87725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f87726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f87727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final okhttp3.u f87728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final s f87729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final o f87730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final b f87731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final b f87732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final b f87733o;

    public n(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull coil.size.i iVar, @NotNull coil.size.h hVar, boolean z10, boolean z11, boolean z12, @Nullable String str, @NotNull okhttp3.u uVar, @NotNull s sVar, @NotNull o oVar, @NotNull b bVar, @NotNull b bVar2, @NotNull b bVar3) {
        this.f87719a = context;
        this.f87720b = config;
        this.f87721c = colorSpace;
        this.f87722d = iVar;
        this.f87723e = hVar;
        this.f87724f = z10;
        this.f87725g = z11;
        this.f87726h = z12;
        this.f87727i = str;
        this.f87728j = uVar;
        this.f87729k = sVar;
        this.f87730l = oVar;
        this.f87731m = bVar;
        this.f87732n = bVar2;
        this.f87733o = bVar3;
    }

    @NotNull
    public final n a(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull coil.size.i iVar, @NotNull coil.size.h hVar, boolean z10, boolean z11, boolean z12, @Nullable String str, @NotNull okhttp3.u uVar, @NotNull s sVar, @NotNull o oVar, @NotNull b bVar, @NotNull b bVar2, @NotNull b bVar3) {
        return new n(context, config, colorSpace, iVar, hVar, z10, z11, z12, str, uVar, sVar, oVar, bVar, bVar2, bVar3);
    }

    public final boolean c() {
        return this.f87724f;
    }

    public final boolean d() {
        return this.f87725g;
    }

    @Nullable
    public final ColorSpace e() {
        return this.f87721c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (Intrinsics.areEqual(this.f87719a, nVar.f87719a) && this.f87720b == nVar.f87720b && Intrinsics.areEqual(this.f87721c, nVar.f87721c) && Intrinsics.areEqual(this.f87722d, nVar.f87722d) && this.f87723e == nVar.f87723e && this.f87724f == nVar.f87724f && this.f87725g == nVar.f87725g && this.f87726h == nVar.f87726h && Intrinsics.areEqual(this.f87727i, nVar.f87727i) && Intrinsics.areEqual(this.f87728j, nVar.f87728j) && Intrinsics.areEqual(this.f87729k, nVar.f87729k) && Intrinsics.areEqual(this.f87730l, nVar.f87730l) && this.f87731m == nVar.f87731m && this.f87732n == nVar.f87732n && this.f87733o == nVar.f87733o) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Bitmap.Config f() {
        return this.f87720b;
    }

    @NotNull
    public final Context g() {
        return this.f87719a;
    }

    @Nullable
    public final String h() {
        return this.f87727i;
    }

    public int hashCode() {
        int iHashCode = ((this.f87719a.hashCode() * 31) + this.f87720b.hashCode()) * 31;
        ColorSpace colorSpace = this.f87721c;
        int iHashCode2 = (((((((((((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f87722d.hashCode()) * 31) + this.f87723e.hashCode()) * 31) + Boolean.hashCode(this.f87724f)) * 31) + Boolean.hashCode(this.f87725g)) * 31) + Boolean.hashCode(this.f87726h)) * 31;
        String str = this.f87727i;
        return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f87728j.hashCode()) * 31) + this.f87729k.hashCode()) * 31) + this.f87730l.hashCode()) * 31) + this.f87731m.hashCode()) * 31) + this.f87732n.hashCode()) * 31) + this.f87733o.hashCode();
    }

    @NotNull
    public final b i() {
        return this.f87732n;
    }

    @NotNull
    public final okhttp3.u j() {
        return this.f87728j;
    }

    @NotNull
    public final b k() {
        return this.f87731m;
    }

    @NotNull
    public final b l() {
        return this.f87733o;
    }

    @NotNull
    public final o m() {
        return this.f87730l;
    }

    public final boolean n() {
        return this.f87726h;
    }

    @NotNull
    public final coil.size.h o() {
        return this.f87723e;
    }

    @NotNull
    public final coil.size.i p() {
        return this.f87722d;
    }

    @NotNull
    public final s q() {
        return this.f87729k;
    }

    public /* synthetic */ n(Context context, Bitmap.Config config, ColorSpace colorSpace, coil.size.i iVar, coil.size.h hVar, boolean z10, boolean z11, boolean z12, String str, okhttp3.u uVar, s sVar, o oVar, b bVar, b bVar2, b bVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? Bitmap.Config.ARGB_8888 : config, (i10 & 4) != 0 ? coil.util.l.r() : colorSpace, (i10 & 8) != 0 ? coil.size.i.f87783d : iVar, (i10 & 16) != 0 ? coil.size.h.FIT : hVar, (i10 & 32) != 0 ? false : z10, (i10 & 64) == 0 ? z11 : false, (i10 & 128) != 0 ? true : z12, (i10 & 256) != 0 ? null : str, (i10 & 512) != 0 ? coil.util.l.k() : uVar, (i10 & 1024) != 0 ? s.f87751c : sVar, (i10 & 2048) != 0 ? o.f87735c : oVar, (i10 & 4096) != 0 ? b.ENABLED : bVar, (i10 & 8192) != 0 ? b.ENABLED : bVar2, (i10 & 16384) != 0 ? b.ENABLED : bVar3);
    }
}
