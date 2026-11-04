package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.m1;
import androidx.lifecycle.c0;
import coil.util.b0;
import coil.util.z;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRequestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestService.kt\ncoil/request/RequestService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final coil.j f87740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b0 f87741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final coil.util.v f87742c;

    public q(@NotNull coil.j jVar, @NotNull b0 b0Var, @Nullable z zVar) {
        this.f87740a = jVar;
        this.f87741b = b0Var;
        this.f87742c = coil.util.h.a(zVar);
    }

    @m1
    private final boolean b(n nVar) {
        return !coil.util.a.f(nVar.f()) || this.f87742c.b();
    }

    private final boolean d(i iVar, coil.size.i iVar2) {
        if (coil.util.a.f(iVar.j())) {
            return c(iVar, iVar.j()) && this.f87742c.a(iVar2);
        }
        return true;
    }

    private final boolean e(i iVar) {
        if (!iVar.O().isEmpty() && !ArraysKt.contains(coil.util.l.w(), iVar.j())) {
            return false;
        }
        return true;
    }

    @NotNull
    public final f a(@NotNull i iVar, @NotNull Throwable th2) {
        Drawable drawableT;
        if (!(th2 instanceof l) || (drawableT = iVar.u()) == null) {
            drawableT = iVar.t();
        }
        return new f(drawableT, iVar, th2);
    }

    public final boolean c(@NotNull i iVar, @NotNull Bitmap.Config config) {
        if (!coil.util.a.f(config)) {
            return true;
        }
        if (!iVar.h()) {
            return false;
        }
        coil.target.c cVarM = iVar.M();
        if (cVarM instanceof coil.target.d) {
            View view = ((coil.target.d) cVarM).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final n f(@NotNull i iVar, @NotNull coil.size.i iVar2) {
        Bitmap.Config configJ = (e(iVar) && d(iVar, iVar2)) ? iVar.j() : Bitmap.Config.ARGB_8888;
        coil.size.c cVarF = iVar2.f();
        coil.size.c.b bVar = coil.size.c.b.f87768a;
        return new n(iVar.l(), configJ, iVar.k(), iVar2, (Intrinsics.areEqual(cVarF, bVar) || Intrinsics.areEqual(iVar2.e(), bVar)) ? coil.size.h.FIT : iVar.J(), coil.util.k.a(iVar), iVar.i() && iVar.O().isEmpty() && configJ != Bitmap.Config.ALPHA_8, iVar.I(), iVar.r(), iVar.x(), iVar.L(), iVar.E(), iVar.C(), iVar.s(), iVar.D());
    }

    @NotNull
    public final p g(@NotNull i iVar, @NotNull p2 p2Var) {
        c0 c0VarZ = iVar.z();
        coil.target.c cVarM = iVar.M();
        return cVarM instanceof coil.target.d ? new v(this.f87740a, iVar, (coil.target.d) cVarM, c0VarZ, p2Var) : new a(c0VarZ, p2Var);
    }

    @NotNull
    public final n h(@NotNull n nVar) {
        boolean z10;
        Bitmap.Config configF = nVar.f();
        b bVarL = nVar.l();
        boolean z11 = true;
        if (b(nVar)) {
            z10 = false;
        } else {
            configF = Bitmap.Config.ARGB_8888;
            z10 = true;
        }
        Bitmap.Config config = configF;
        if (!nVar.l().n() || this.f87741b.f()) {
            z11 = z10;
        } else {
            bVarL = b.DISABLED;
        }
        return z11 ? nVar.a((16381 & 1) != 0 ? nVar.f87719a : null, (16381 & 2) != 0 ? nVar.f87720b : config, (16381 & 4) != 0 ? nVar.f87721c : null, (16381 & 8) != 0 ? nVar.f87722d : null, (16381 & 16) != 0 ? nVar.f87723e : null, (16381 & 32) != 0 ? nVar.f87724f : false, (16381 & 64) != 0 ? nVar.f87725g : false, (16381 & 128) != 0 ? nVar.f87726h : false, (16381 & 256) != 0 ? nVar.f87727i : null, (16381 & 512) != 0 ? nVar.f87728j : null, (16381 & 1024) != 0 ? nVar.f87729k : null, (16381 & 2048) != 0 ? nVar.f87730l : null, (16381 & 4096) != 0 ? nVar.f87731m : null, (16381 & 8192) != 0 ? nVar.f87732n : null, (16381 & 16384) != 0 ? nVar.f87733o : bVarL) : nVar;
    }
}
