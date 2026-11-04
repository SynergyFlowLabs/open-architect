package androidx.compose.foundation.text.contextmenu.internal;

import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f18929a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static pj.p<b0.g, androidx.compose.foundation.text.contextmenu.provider.j, Function0<? extends androidx.compose.ui.layout.g0>, androidx.compose.runtime.c0, Integer, Unit> f18930b = androidx.compose.runtime.internal.w.c(129995601, false, b.f18934a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static pj.p<b0.g, androidx.compose.foundation.text.contextmenu.provider.j, Function0<? extends androidx.compose.ui.layout.g0>, androidx.compose.runtime.c0, Integer, Unit> f18931c = androidx.compose.runtime.internal.w.c(636288403, false, c.f18935a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static pj.p<b0.g, androidx.compose.foundation.text.contextmenu.provider.j, Function0<? extends androidx.compose.ui.layout.g0>, androidx.compose.runtime.c0, Integer, Unit> f18932d = androidx.compose.runtime.internal.w.c(-1357803046, false, a.f18933a);

    static final class a implements pj.p<b0.g, androidx.compose.foundation.text.contextmenu.provider.j, Function0<? extends androidx.compose.ui.layout.g0>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18933a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(b0.g gVar, androidx.compose.foundation.text.contextmenu.provider.j jVar, Function0<? extends androidx.compose.ui.layout.g0> function0, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? c0Var.D(gVar) : c0Var.k0(gVar) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? c0Var.D(jVar) : c0Var.k0(jVar) ? 32 : 16;
            }
            if ((i10 & a5.S0) == 0) {
                i11 |= c0Var.k0(function0) ? 256 : 128;
            }
            if (!c0Var.h((i11 & 1171) != 1170, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1357803046, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$-1357803046.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:99)");
            }
            d0.r(gVar, jVar, function0, c0Var, i11 & androidx.media3.exoplayer.analytics.b.f62802b0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.p
        public /* bridge */ /* synthetic */ Unit invoke(b0.g gVar, androidx.compose.foundation.text.contextmenu.provider.j jVar, Function0<? extends androidx.compose.ui.layout.g0> function0, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(gVar, jVar, function0, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements pj.p<b0.g, androidx.compose.foundation.text.contextmenu.provider.j, Function0<? extends androidx.compose.ui.layout.g0>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18934a = new b();

        b() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(b0.g gVar, androidx.compose.foundation.text.contextmenu.provider.j jVar, Function0<? extends androidx.compose.ui.layout.g0> function0, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? c0Var.D(gVar) : c0Var.k0(gVar) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? c0Var.D(jVar) : c0Var.k0(jVar) ? 32 : 16;
            }
            if ((i10 & a5.S0) == 0) {
                i11 |= c0Var.k0(function0) ? 256 : 128;
            }
            if (!c0Var.h((i11 & 1171) != 1170, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(129995601, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$129995601.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:75)");
            }
            d0.r(gVar, jVar, function0, c0Var, i11 & androidx.media3.exoplayer.analytics.b.f62802b0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.p
        public /* bridge */ /* synthetic */ Unit invoke(b0.g gVar, androidx.compose.foundation.text.contextmenu.provider.j jVar, Function0<? extends androidx.compose.ui.layout.g0> function0, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(gVar, jVar, function0, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements pj.p<b0.g, androidx.compose.foundation.text.contextmenu.provider.j, Function0<? extends androidx.compose.ui.layout.g0>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f18935a = new c();

        c() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(b0.g gVar, androidx.compose.foundation.text.contextmenu.provider.j jVar, Function0<? extends androidx.compose.ui.layout.g0> function0, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? c0Var.D(gVar) : c0Var.k0(gVar) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? c0Var.D(jVar) : c0Var.k0(jVar) ? 32 : 16;
            }
            if ((i10 & a5.S0) == 0) {
                i11 |= c0Var.k0(function0) ? 256 : 128;
            }
            if (!c0Var.h((i11 & 1171) != 1170, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(636288403, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$636288403.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:90)");
            }
            d0.r(gVar, jVar, function0, c0Var, i11 & androidx.media3.exoplayer.analytics.b.f62802b0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.p
        public /* bridge */ /* synthetic */ Unit invoke(b0.g gVar, androidx.compose.foundation.text.contextmenu.provider.j jVar, Function0<? extends androidx.compose.ui.layout.g0> function0, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(gVar, jVar, function0, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final pj.p<b0.g, androidx.compose.foundation.text.contextmenu.provider.j, Function0<? extends androidx.compose.ui.layout.g0>, androidx.compose.runtime.c0, Integer, Unit> a() {
        return f18932d;
    }

    @NotNull
    public final pj.p<b0.g, androidx.compose.foundation.text.contextmenu.provider.j, Function0<? extends androidx.compose.ui.layout.g0>, androidx.compose.runtime.c0, Integer, Unit> b() {
        return f18930b;
    }

    @NotNull
    public final pj.p<b0.g, androidx.compose.foundation.text.contextmenu.provider.j, Function0<? extends androidx.compose.ui.layout.g0>, androidx.compose.runtime.c0, Integer, Unit> c() {
        return f18931c;
    }
}
