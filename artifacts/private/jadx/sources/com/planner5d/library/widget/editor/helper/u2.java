package com.planner5d.library.widget.editor.helper;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.TooltipListenerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorTooltips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorTooltips.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorTooltips\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,122:1\n1#2:123\n255#3:124\n257#3,2:125\n*S KotlinDebug\n*F\n+ 1 HelperEditorTooltips.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorTooltips\n*L\n106#1:124\n107#1:125,2\n*E\n"})
public final class u2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f256781e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f256782f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f256783g = 57.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f256784h = 145.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f256785i = 45.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f256786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f256787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f256788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f256789d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorTooltips$editorOpen$1", f = "HelperEditorTooltips.kt", i = {}, l = {33, 34}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f256791b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u2.this.new b(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
        
            if (r8.t(r1, r3, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 1
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f256791b
                r2 = 2
                r3 = 1
                r6 = r3
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r8)
                goto L6d
            L14:
                r6 = 0
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 6
                throw r7
            L1e:
                r6 = 3
                java.lang.Object r1 = r7.f256790a
                com.planner5d.library.widget.editor.helper.u2 r1 = (com.planner5d.library.widget.editor.helper.u2) r1
                kotlin.ResultKt.m(r8)
                r6 = 7
                goto L42
            L28:
                kotlin.ResultKt.m(r8)
                r6 = 2
                com.planner5d.library.widget.editor.helper.u2 r1 = com.planner5d.library.widget.editor.helper.u2.this
                com.planner5d.library.model.manager.config.p r8 = com.planner5d.library.widget.editor.helper.u2.c(r1)
                r6 = 7
                com.planner5d.library.services.r r4 = com.planner5d.library.services.r.editorOpenCount
                r6 = 4
                r7.f256790a = r1
                r7.f256791b = r3
                r5 = 0
                java.lang.Object r8 = r8.p(r4, r5, r7)
                if (r8 != r0) goto L42
                goto L6c
            L42:
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                r6 = 1
                int r8 = r8 + r3
                com.planner5d.library.widget.editor.helper.u2.d(r1, r8)
                com.planner5d.library.widget.editor.helper.u2 r8 = com.planner5d.library.widget.editor.helper.u2.this
                com.planner5d.library.model.manager.config.p r8 = com.planner5d.library.widget.editor.helper.u2.c(r8)
                r6 = 3
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.editorOpenCount
                com.planner5d.library.widget.editor.helper.u2 r3 = com.planner5d.library.widget.editor.helper.u2.this
                int r3 = com.planner5d.library.widget.editor.helper.u2.b(r3)
                r6 = 1
                r4 = 0
                r6 = 5
                r7.f256790a = r4
                r6 = 7
                r7.f256791b = r2
                r6 = 7
                java.lang.Object r7 = r8.t(r1, r3, r7)
                r6 = 0
                if (r7 != r0) goto L6d
            L6c:
                return r0
            L6d:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.helper.u2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorTooltips$setupTooltip$1", f = "HelperEditorTooltips.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHelperEditorTooltips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorTooltips.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorTooltips$setupTooltip$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f256794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f256795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u2 f256796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f256797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f256798f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.planner5d.library.services.r rVar, Activity activity, u2 u2Var, View view, int i10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f256794b = rVar;
            this.f256795c = activity;
            this.f256796d = u2Var;
            this.f256797e = view;
            this.f256798f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f256794b, this.f256795c, this.f256796d, this.f256797e, this.f256798f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:18:0x004d  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256793a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.r rVar = this.f256794b;
                if (rVar != null) {
                    com.planner5d.library.model.manager.config.p pVar = this.f256796d.f256787b;
                    this.f256793a = 1;
                    obj = pVar.G(rVar, false, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else if (!y3.f229862a.s(this.f256795c)) {
                    this.f256796d.m(this.f256795c);
                    this.f256797e.setVisibility(this.f256798f);
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (!((Boolean) obj).booleanValue()) {
                if (!y3.f229862a.s(this.f256795c)) {
                    this.f256796d.m(this.f256795c);
                    this.f256797e.setVisibility(this.f256798f);
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorTooltips$setupTooltipAction$1", f = "HelperEditorTooltips.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHelperEditorTooltips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorTooltips.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorTooltips$setupTooltipAction$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f256800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u2 f256801c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.planner5d.library.services.r rVar, u2 u2Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f256800b = rVar;
            this.f256801c = u2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f256800b, this.f256801c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256799a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.r rVar = this.f256800b;
                if (rVar != null) {
                    com.planner5d.library.model.manager.config.p pVar = this.f256801c.f256787b;
                    this.f256799a = 1;
                    if (pVar.L(rVar, true, this) == objL) {
                        return objL;
                    }
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public u2(@NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull com.planner5d.library.model.manager.config.p sharedPreferences, @NotNull com.planner5d.library.services.utility.f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f256786a = featureConfigManager;
        this.f256787b = sharedPreferences;
        this.f256788c = coroutineScope;
    }

    private final void f(Activity activity, int i10, boolean z10, float f10) {
        View viewFindViewById = activity.findViewById(i10);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (!z10) {
                f10 += 45.0f;
            }
            marginLayoutParams.topMargin = com.github.danielnilsson9.colorpickerview.view.d.a(activity, f10);
        }
    }

    private final boolean i(Activity activity, int i10, int i11, com.planner5d.library.services.r rVar) {
        View viewFindViewById = activity.findViewById(i10);
        if (viewFindViewById == null || viewFindViewById.getVisibility() == i11) {
            return true;
        }
        if (i11 == 8) {
            viewFindViewById.setVisibility(i11);
            return false;
        }
        kotlinx.coroutines.k.f(this.f256788c, com.planner5d.library.services.utility.s.f229729a.a(), null, new c(rVar, activity, this, viewFindViewById, i11, null), 2, null);
        return false;
    }

    static /* synthetic */ boolean j(u2 u2Var, Activity activity, int i10, int i11, com.planner5d.library.services.r rVar, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            rVar = null;
        }
        return u2Var.i(activity, i10, i11, rVar);
    }

    private final void k(Activity activity, int i10, com.planner5d.library.services.r rVar) {
        View viewFindViewById = activity.findViewById(i10);
        if (viewFindViewById == null || viewFindViewById.getVisibility() != 0) {
            return;
        }
        viewFindViewById.setVisibility(8);
        kotlinx.coroutines.k.f(this.f256788c, null, null, new d(rVar, this, null), 3, null);
    }

    static /* synthetic */ void l(u2 u2Var, Activity activity, int i10, com.planner5d.library.services.r rVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            rVar = null;
        }
        u2Var.k(activity, i10, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(final Activity activity) {
        TooltipListenerView tooltipListenerView = (TooltipListenerView) activity.findViewById(com.planner5d.library.f.j.Lw);
        if (tooltipListenerView != null) {
            tooltipListenerView.setListener(new Function0() { // from class: com.planner5d.library.widget.editor.helper.t2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.n(this.f256771a, activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(u2 u2Var, Activity activity) {
        l(u2Var, activity, com.planner5d.library.f.j.Ew, null, 4, null);
        l(u2Var, activity, com.planner5d.library.f.j.Iw, null, 4, null);
        u2Var.k(activity, com.planner5d.library.f.j.Aw, com.planner5d.library.services.r.aiDesignerShown);
        l(u2Var, activity, com.planner5d.library.f.j.Dw, null, 4, null);
        return Unit.f312394a;
    }

    public final void g() {
        if (this.f256786a.a(com.planner5d.library.model.manager.config.f.ProAndroid)) {
            kotlinx.coroutines.k.f(this.f256788c, com.planner5d.library.services.utility.s.f229729a.h(), null, new b(null), 2, null);
        }
    }

    public final void h(@Nullable View view, int i10, boolean z10) {
        u2 u2Var;
        int i11;
        Context context = view != null ? view.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            Activity activity2 = !y3.f229862a.s(activity) ? activity : null;
            if (activity2 == null) {
                return;
            }
            f(activity2, com.planner5d.library.f.j.Ew, z10, 57.0f);
            f(activity2, com.planner5d.library.f.j.Iw, z10, 145.0f);
            if (this.f256786a.a(com.planner5d.library.model.manager.config.f.ProAndroid)) {
                if (this.f256789d == 2) {
                    u2Var = this;
                    i11 = i10;
                    j(u2Var, activity2, com.planner5d.library.f.j.Gw, i11, null, 8, null);
                } else {
                    u2Var = this;
                    i11 = i10;
                }
                if (u2Var.f256789d == 3) {
                    j(u2Var, activity2, com.planner5d.library.f.j.Hw, i11, null, 8, null);
                }
            } else {
                u2Var = this;
                i11 = i10;
            }
            if (!u2Var.f256786a.a(com.planner5d.library.model.manager.config.f.AiDesigner) || u2Var.f256786a.a(com.planner5d.library.model.manager.config.f.BernardEditor) || u2Var.f256789d <= 3) {
                return;
            }
            u2Var.i(activity2, com.planner5d.library.f.j.Aw, i11, com.planner5d.library.services.r.aiDesignerShown);
        }
    }

    public final void o(@Nullable View view) {
        Context context = view != null ? view.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            Activity activity2 = !y3.f229862a.s(activity) ? activity : null;
            if (activity2 == null) {
                return;
            }
            j(this, activity2, com.planner5d.library.f.j.Dw, 0, null, 8, null);
        }
    }
}
