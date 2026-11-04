package com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.engine.p;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.model.u;
import com.planner5d.library.model.y;
import com.planner5d.library.model.z;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.services.b0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class n extends f2 implements ze.a.InterfaceC2545a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f257810m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.popup.itemproperties.b f257811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f257812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k5 f257813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t0 f257814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b2 f257815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.engine.i f257816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final vb.f f257817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final p f257818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ze.a f257819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final f0 f257820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f0 f257821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final c1<b> f257822l;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.TextureAddPreviewViewModel$1$1$1", f = "TextureAddPreviewViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160710n}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257823a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f257825c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Bitmap bitmap, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f257825c = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new a(this.f257825c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257823a;
            if (i10 == 0) {
                ResultKt.m(obj);
                n nVar = n.this;
                Bitmap bitmap = this.f257825c;
                this.f257823a = 1;
                if (nVar.j0(bitmap, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @w0(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f257826d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Bitmap f257827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f257828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f257829c;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b() {
            this(null, false, false, 7, null);
            int i10 = 2 | 0;
        }

        public final boolean a() {
            return this.f257829c;
        }

        @Nullable
        public final Bitmap b() {
            return this.f257827a;
        }

        public final boolean c() {
            return this.f257828b;
        }

        public b(@Nullable Bitmap bitmap, boolean z10, boolean z11) {
            this.f257827a = bitmap;
            this.f257828b = z10;
            this.f257829c = z11;
        }

        public /* synthetic */ b(Bitmap bitmap, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bitmap, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? true : z11);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.TextureAddPreviewViewModel$processBitmap$2", f = "TextureAddPreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f257831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f257832c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap, n nVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f257831b = bitmap;
            this.f257832c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f257831b, this.f257832c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257830a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.f257831b.getWidth() < 512 || this.f257831b.getHeight() < 512) {
                this.f257832c.f257815e.e(new u(u.c.Error, new k3(com.planner5d.library.f.s.f169130gb, kotlin.coroutines.jvm.internal.b.f(512), kotlin.coroutines.jvm.internal.b.f(512)), new u.a[0]));
            } else {
                this.f257832c.h0().o(new b(this.f257831b, false, false));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class d extends com.planner5d.library.services.rx.e<Boolean> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bitmap f257834e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.TextureAddPreviewViewModel$uploadTexture$1$onCompleted$1", f = "TextureAddPreviewViewModel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f257835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f257836b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f257836b = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f257836b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f257835a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        t0 t0Var = this.f257836b.f257814d;
                        id.a aVarA = this.f257836b.f257812b.a();
                        this.f257835a = 1;
                        if (u0.b.a(t0Var, aVarA, false, this, 2, null) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                } catch (Throwable unused) {
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        d(Bitmap bitmap) {
            this.f257834e = bitmap;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            n.this.h0().r(new b(this.f257834e, false, false, 4, null));
            b2 b2Var = n.this.f257815e;
            if (th2 == null) {
                int i10 = 5 >> 0;
                th2 = new ErrorMessageException(com.planner5d.library.f.s.f169296n9, new String[0]);
            }
            b2Var.c(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            y yVarG;
            n.this.f257815e.b(com.planner5d.library.f.s.wF, new Object[0]);
            kotlinx.coroutines.k.f(g2.a(n.this), null, null, new a(n.this, null), 3, null);
            ze.c cVarF = n.this.f0().f();
            if (cVarF != null && (yVarG = cVarF.g()) != null) {
                c1<ze.c> c1VarF0 = n.this.f0();
                int i10 = yVarG.f222849a;
                Float f10 = yVarG.f222852d;
                float fFloatValue = f10 != null ? f10.floatValue() : 1.0f;
                Float f11 = yVarG.f222853e;
                float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
                com.planner5d.library.engine.rendering.util.i iVar = yVarG.f222857i;
                if (iVar == null) {
                    iVar = com.planner5d.library.engine.rendering.util.i.RepeatXY;
                }
                com.planner5d.library.engine.rendering.util.f fVar = yVarG.f222858j;
                if (fVar == null) {
                    fVar = com.planner5d.library.engine.rendering.util.f.Center;
                }
                Float f12 = yVarG.f222854f;
                float fFloatValue3 = f12 != null ? f12.floatValue() : 0.0f;
                Float f13 = yVarG.f222855g;
                c1VarF0.r(new ze.c(yVarG, i10, fFloatValue, fFloatValue2, iVar, fVar, fFloatValue3, f13 != null ? f13.floatValue() : 0.0f));
            }
            n.this.g0().r(k5.f191816t);
            n.this.h0().r(new b(null, false, false, 7, null));
        }
    }

    @ij.a
    public n(@NotNull com.planner5d.library.widget.editor.popup.itemproperties.b helperImageChooser, @NotNull t userAuthorization, @NotNull k5 textureManager, @NotNull t0 userPurchases, @NotNull b2 messageManager, @NotNull com.planner5d.library.engine.i engineFactory, @NotNull vb.f configChooserFactory, @NotNull p texturePreviewApplicationListenerFactory) {
        Intrinsics.checkNotNullParameter(helperImageChooser, "helperImageChooser");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(engineFactory, "engineFactory");
        Intrinsics.checkNotNullParameter(configChooserFactory, "configChooserFactory");
        Intrinsics.checkNotNullParameter(texturePreviewApplicationListenerFactory, "texturePreviewApplicationListenerFactory");
        this.f257811a = helperImageChooser;
        this.f257812b = userAuthorization;
        this.f257813c = textureManager;
        this.f257814d = userPurchases;
        this.f257815e = messageManager;
        this.f257816f = engineFactory;
        this.f257817g = configChooserFactory;
        this.f257818h = texturePreviewApplicationListenerFactory;
        this.f257820j = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.m0(this.f257807a);
            }
        });
        this.f257821k = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.l0(this.f257808a);
            }
        });
        this.f257822l = new c1<>(null);
        helperImageChooser.k(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.X(this.f257809a, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(n nVar, Bitmap bitmap) {
        if (bitmap != null) {
            kotlinx.coroutines.k.f(g2.a(nVar), null, null, nVar.new a(bitmap, null), 3, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j0(Bitmap bitmap, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.d(), new c(bitmap, this, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 l0(n nVar) {
        return nVar.d().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 m0(n nVar) {
        return nVar.d().c();
    }

    private final void n0() throws Throwable {
        this.f257811a.i();
    }

    @Override // ze.a.InterfaceC2545a
    public void K(@NotNull ze.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f257819i = aVar;
    }

    @NotNull
    public final vb.f c0() {
        return this.f257817g;
    }

    @Override // ze.a.InterfaceC2545a
    @NotNull
    public ze.a d() {
        ze.a aVar = this.f257819i;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemPropertiesSelection");
        return null;
    }

    @NotNull
    public final com.planner5d.library.engine.i d0() {
        return this.f257816f;
    }

    @NotNull
    public final c1<ze.c> f0() {
        return (c1) this.f257820j.getValue();
    }

    @NotNull
    public final c1<z> g0() {
        return (c1) this.f257821k.getValue();
    }

    @NotNull
    public final c1<b> h0() {
        return this.f257822l;
    }

    @NotNull
    public final p i0() {
        return this.f257818h;
    }

    public final void k0() throws Throwable {
        if (this.f257814d.Y()) {
            n0();
        } else {
            b0.f223959b.o(new b0.a(fd.k.TEXTURES, null, com.planner5d.library.model.manager.config.purchaseplacement.b.a.textures, y3.c.textures));
        }
    }

    public final void o0(@Nullable Bitmap bitmap) {
        this.f257822l.r(new b(bitmap, true, false));
        this.f257813c.T(bitmap).subscribe((Subscriber<? super Boolean>) new d(bitmap));
    }
}
