package com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import com.planner5d.library.widget.editor.popup.itemproperties.v;
import com.planner5d.library.widget.preloader.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class j implements xe.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f257799f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f257800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f257801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f257802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f257803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final o0 f257804e;

    public static final class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f257805a;

        a(h hVar) {
            this.f257805a = hVar;
        }

        @e1(c0.a.ON_PAUSE)
        private final void onPause() {
            this.f257805a.setResumed(false);
        }

        @e1(c0.a.ON_RESUME)
        private final void onResume() {
            this.f257805a.setResumed(true);
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f257806a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f257806a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f257806a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f257806a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public j(@NotNull v itemPropertiesViewModel, @NotNull n viewModel, @NotNull Context context, @NotNull t preloader, @NotNull o0 lifecycleOwner) {
        Intrinsics.checkNotNullParameter(itemPropertiesViewModel, "itemPropertiesViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preloader, "preloader");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f257800a = itemPropertiesViewModel;
        this.f257801b = viewModel;
        this.f257802c = context;
        this.f257803d = preloader;
        this.f257804e = lifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(j jVar, h hVar, n.b bVar) {
        if ((bVar != null ? bVar.b() : null) == null || bVar.c()) {
            if ((bVar != null ? bVar.b() : null) == null) {
                hVar.setActive(false);
                hVar.setBitmap(null);
            }
        } else {
            jVar.f257800a.p0(v.a.TexturePreview);
            hVar.setActive(true);
            hVar.setBitmap(bVar.b());
        }
        if (bVar == null || !bVar.c()) {
            jVar.f257803d.a().b();
        } else {
            jVar.f257803d.a().p(jVar.f257802c.getString(com.planner5d.library.f.s.xF), true);
        }
        if (bVar != null && bVar.a()) {
            v.n0(jVar.f257800a, null, 1, null);
        }
        return Unit.f312394a;
    }

    @Override // xe.a
    @NotNull
    public View a() {
        final h hVar = new h(this.f257802c, this.f257801b);
        this.f257804e.getLifecycle().c(new a(hVar));
        this.f257801b.h0().k(this.f257804e, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.c(this.f257797a, hVar, (n.b) obj);
            }
        }));
        return hVar;
    }
}
