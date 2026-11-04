package com.planner5d.library.widget.editor.popup.itemproperties.pages.texture;

import android.util.Pair;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.y;
import com.planner5d.library.widget.editor.popup.itemproperties.x;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class o extends f2 implements ze.a.InterfaceC2545a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f257763h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.f f257764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ze.a f257765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f257766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f257767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<List<Pair<com.planner5d.library.model.c, List<com.planner5d.library.model.b>>>> f257768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Integer f257769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<x> f257770g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.TextureSettingsViewModel$resetColors$1$1", f = "TextureSettingsViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f257772b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ItemProject f257774d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ItemProject itemProject, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f257774d = itemProject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new a(this.f257774d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257772b;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1<List<Pair<com.planner5d.library.model.c, List<com.planner5d.library.model.b>>>> c1VarY = o.this.Y();
                com.planner5d.library.model.manager.f fVar = o.this.f257764a;
                ItemProject itemProject = this.f257774d;
                this.f257771a = c1VarY;
                this.f257772b = 1;
                Object objI = fVar.i(itemProject, this);
                if (objI == objL) {
                    return objL;
                }
                c1Var = c1VarY;
                obj = objI;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1Var = (c1) this.f257771a;
                ResultKt.m(obj);
            }
            c1Var.r(obj);
            o.this.Z().r(x.b.f257890b);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public o(@NotNull com.planner5d.library.model.manager.f colorManager) {
        Intrinsics.checkNotNullParameter(colorManager, "colorManager");
        this.f257764a = colorManager;
        this.f257766c = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.d0(this.f257761a);
            }
        });
        this.f257767d = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.f0(this.f257762a);
            }
        });
        this.f257768e = new c1<>(new LinkedList());
        this.f257770g = new c1<>(x.c.f257892b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.w0 d0(o oVar) {
        return oVar.d().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 f0(o oVar) {
        return oVar.d().c();
    }

    private final void k0(Float f10, Float f11, Boolean bool, Boolean bool2, Float f12, Float f13) {
        com.planner5d.library.engine.rendering.util.i iVarD;
        com.planner5d.library.engine.rendering.util.f fVarA;
        ze.c cVarF = b0().f();
        if (cVarF != null) {
            c1<ze.c> c1VarB0 = b0();
            y yVarG = cVarF.g();
            int iB = cVarF.b();
            float fFloatValue = f10 != null ? f10.floatValue() : cVarF.f();
            float fFloatValue2 = f11 != null ? f11.floatValue() : cVarF.e();
            if (bool == null || (iVarD = r0(bool.booleanValue())) == null) {
                iVarD = cVarF.d();
            }
            com.planner5d.library.engine.rendering.util.i iVar = iVarD;
            if (bool2 == null || (fVarA = q0(bool2.booleanValue())) == null) {
                fVarA = cVarF.a();
            }
            c1VarB0.r(new ze.c(yVarG, iB, fFloatValue, fFloatValue2, iVar, fVarA, f12 != null ? f12.floatValue() : cVarF.c(), f13 != null ? f13.floatValue() : cVarF.h()));
        }
    }

    static /* synthetic */ void l0(o oVar, Float f10, Float f11, Boolean bool, Boolean bool2, Float f12, Float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            bool2 = null;
        }
        if ((i10 & 16) != 0) {
            f12 = null;
        }
        if ((i10 & 32) != 0) {
            f13 = null;
        }
        oVar.k0(f10, f11, bool, bool2, f12, f13);
    }

    private final com.planner5d.library.engine.rendering.util.f q0(boolean z10) {
        return z10 ? com.planner5d.library.engine.rendering.util.f.BottomLeft : com.planner5d.library.engine.rendering.util.f.Center;
    }

    private final com.planner5d.library.engine.rendering.util.i r0(boolean z10) {
        return z10 ? com.planner5d.library.engine.rendering.util.i.NoRepeat : com.planner5d.library.engine.rendering.util.i.RepeatXY;
    }

    @Override // ze.a.InterfaceC2545a
    public void K(@NotNull ze.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f257765b = aVar;
    }

    public final void X() {
        ze.c cVarF = b0().f();
        if (cVarF != null) {
            this.f257764a.f(new com.planner5d.library.model.b(cVarF.b()));
            c0();
        }
    }

    @NotNull
    public final c1<List<Pair<com.planner5d.library.model.c, List<com.planner5d.library.model.b>>>> Y() {
        return this.f257768e;
    }

    @NotNull
    public final c1<x> Z() {
        return this.f257770g;
    }

    @NotNull
    public final androidx.lifecycle.w0<ze.b> a0() {
        return (androidx.lifecycle.w0) this.f257766c.getValue();
    }

    @NotNull
    public final c1<ze.c> b0() {
        return (c1) this.f257767d.getValue();
    }

    public final void c0() {
        ItemProject itemProjectI;
        this.f257770g.r(x.c.f257892b);
        ze.b bVarF = a0().f();
        if (bVarF == null || (itemProjectI = bVarF.i()) == null) {
            return;
        }
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(itemProjectI, null), 3, null);
    }

    @Override // ze.a.InterfaceC2545a
    @NotNull
    public ze.a d() {
        ze.a aVar = this.f257765b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemPropertiesSelection");
        return null;
    }

    public final void g0(@NotNull ze.c selectedTexture) {
        Intrinsics.checkNotNullParameter(selectedTexture, "selectedTexture");
        if (this.f257769f == null) {
            this.f257769f = Integer.valueOf(selectedTexture.b());
        }
        c0();
    }

    public final void h0(@Nullable Integer num) {
        ze.c cVarF = b0().f();
        if (cVarF != null) {
            c1<ze.c> c1VarB0 = b0();
            y yVarG = cVarF.g();
            if (num != null) {
                c1VarB0.r(new ze.c(yVarG, num.intValue(), cVarF.f(), cVarF.e(), cVarF.d(), cVarF.a(), cVarF.c(), cVarF.h()));
            }
        }
    }

    public final void i0(@Nullable Boolean bool) {
        l0(this, null, null, null, bool, null, null, 55, null);
    }

    public final void j0(@Nullable Float f10) {
        int i10 = 4 ^ 0;
        l0(this, null, null, null, null, f10, null, 47, null);
    }

    public final void m0(@Nullable Float f10) {
        l0(this, null, f10, null, null, null, null, 61, null);
    }

    public final void n0(@Nullable Float f10) {
        int i10 = 5 >> 0;
        l0(this, f10, null, null, null, null, null, 62, null);
    }

    public final void o0(@Nullable Boolean bool) {
        int i10 = 3 ^ 0;
        l0(this, null, null, bool, null, null, null, 59, null);
    }

    public final void p0(@Nullable Float f10) {
        l0(this, null, null, null, null, null, f10, 31, null);
    }
}
