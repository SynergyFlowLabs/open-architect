package com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial;

import android.util.Pair;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.y;
import com.planner5d.library.model.z;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.editor.popup.itemproperties.x;
import com.planner5d.library.widget.editor.popup.properties.adapter.q;
import java.util.List;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class k extends f2 implements ze.a.InterfaceC2545a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f257343m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f257344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p0 f257345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f257346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k5 f257347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ze.a f257348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f257349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f257350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final f0 f257351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<List<com.planner5d.library.widget.editor.popup.properties.adapter.b<y>>> f257352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.editorcollection.h<y> f257353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<List<y>> f257354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final c1<x> f257355l;

    public static final class a extends com.planner5d.library.services.rx.e<List<? extends com.planner5d.library.widget.editor.popup.properties.adapter.b<y>>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ z f257357e;

        a(z zVar) {
            this.f257357e = zVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            timber.log.b.f381052a.a("Failed to get available textures for group %s", this.f257357e.f222860a);
            k.this.g0().r(x.a.f257888b);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(List<com.planner5d.library.widget.editor.popup.properties.adapter.b<y>> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            k.this.Z().r(list);
            k.this.g0().r(x.b.f257890b);
        }
    }

    @ij.a
    public k(@NotNull com.planner5d.library.application.b context, @NotNull p0 formatter, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull k5 textureManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        this.f257344a = context;
        this.f257345b = formatter;
        this.f257346c = builtInDataManager;
        this.f257347d = textureManager;
        this.f257349f = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.o0(this.f257340a);
            }
        });
        this.f257350g = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.q0(this.f257341a);
            }
        });
        this.f257351h = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.p0(this.f257342a);
            }
        });
        this.f257352i = new c1<>();
        com.planner5d.library.model.editorcollection.h<y> hVarL = textureManager.l();
        Intrinsics.checkNotNullExpressionValue(hVarL, "createFavoriteTexturesLive(...)");
        this.f257353j = hVarL;
        this.f257354k = hVarL;
        this.f257355l = new c1<>(x.c.f257892b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m0(com.planner5d.library.widget.editor.popup.properties.adapter.a aVar, k kVar, Pair pair) {
        Object first = pair.first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        com.planner5d.library.widget.editor.popup.properties.adapter.a aVarC = aVar.c((Object[]) first);
        String string = kVar.f257344a.getString(com.planner5d.library.f.s.dn);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Object second = pair.second;
        Intrinsics.checkNotNullExpressionValue(second, "second");
        return aVarC.b(string, (Object[]) second).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.w0 o0(k kVar) {
        return kVar.d().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 p0(k kVar) {
        return kVar.d().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 q0(k kVar) {
        return kVar.d().c();
    }

    @Override // ze.a.InterfaceC2545a
    public void K(@NotNull ze.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f257348e = aVar;
    }

    @NotNull
    public final c1<List<com.planner5d.library.widget.editor.popup.properties.adapter.b<y>>> Z() {
        return this.f257352i;
    }

    @NotNull
    public final com.planner5d.library.model.manager.builtin.i a0() {
        return this.f257346c;
    }

    @NotNull
    public final androidx.lifecycle.w0<List<y>> b0() {
        return this.f257354k;
    }

    @NotNull
    public final p0 c0() {
        return this.f257345b;
    }

    @Override // ze.a.InterfaceC2545a
    @NotNull
    public ze.a d() {
        ze.a aVar = this.f257348e;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemPropertiesSelection");
        return null;
    }

    @Nullable
    public final Item d0() {
        ze.b bVarF = h0().f();
        if (bVarF != null) {
            return bVarF.h();
        }
        return null;
    }

    @Nullable
    public final ItemProject f0() {
        ze.b bVarF = h0().f();
        if (bVarF != null) {
            return bVarF.i();
        }
        return null;
    }

    @NotNull
    public final c1<x> g0() {
        return this.f257355l;
    }

    @NotNull
    public final androidx.lifecycle.w0<ze.b> h0() {
        return (androidx.lifecycle.w0) this.f257349f.getValue();
    }

    @NotNull
    public final c1<ze.c> i0() {
        return (c1) this.f257350g.getValue();
    }

    @NotNull
    public final c1<z> j0() {
        return (c1) this.f257351h.getValue();
    }

    @NotNull
    public final k5 k0() {
        return this.f257347d;
    }

    public final void l0(@NotNull z selectedGroup) {
        Intrinsics.checkNotNullParameter(selectedGroup, "selectedGroup");
        this.f257355l.r(x.c.f257892b);
        final com.planner5d.library.widget.editor.popup.properties.adapter.a aVar = new com.planner5d.library.widget.editor.popup.properties.adapter.a();
        if (Intrinsics.areEqual(selectedGroup, k5.f191816t)) {
            y ADD_BUTTON = q.f257971s;
            Intrinsics.checkNotNullExpressionValue(ADD_BUTTON, "ADD_BUTTON");
            aVar.a(ADD_BUTTON);
        }
        Observable<Pair<y[], y[]>> observableH = this.f257347d.H(selectedGroup, f0());
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.m0(aVar, this, (Pair) obj);
            }
        };
        observableH.map(new Func1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.g
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return k.n0(function1, obj);
            }
        }).subscribe((Subscriber<? super R>) new a(selectedGroup));
    }

    public final void r0(@NotNull y texture) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        ze.c cVarF = i0().f();
        if (cVarF != null) {
            i0().r(new ze.c(texture, -1, cVarF.f(), cVarF.e(), cVarF.d(), cVarF.a(), cVarF.c(), cVarF.h()));
        }
    }

    public final void s0(@NotNull y texture) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        this.f257353j.v(texture);
    }
}
