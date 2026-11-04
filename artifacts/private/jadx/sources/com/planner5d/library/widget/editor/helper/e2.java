package com.planner5d.library.widget.editor.helper;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.editor.history.EditorHistoryButtons;
import com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar;
import com.planner5d.library.widget.editor.menu.EditorFloorsView;
import com.planner5d.library.widget.editor.propertiesbar.PropertiesBarView;
import com.planner5d.library.widget.editor.toolbar.EditorToolbar;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorItemActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorItemActions.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorItemActions\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Rect.kt\nandroidx/core/graphics/RectKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n37#2,2:126\n37#2,2:131\n37#2,2:140\n37#2,2:143\n278#3,3:128\n278#3,3:136\n11165#4:133\n11500#4,2:134\n11502#4:139\n1#5:142\n*S KotlinDebug\n*F\n+ 1 HelperEditorItemActions.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorItemActions\n*L\n107#1:126,2\n110#1:131,2\n111#1:140,2\n115#1:143,2\n107#1:128,3\n111#1:136,3\n111#1:133\n111#1:134,2\n111#1:139\n*E\n"})
public final class e2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f256246p = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.itemactionsbar.k f256247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final PropertiesBarView f256248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ItemActionsBar f256249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final View f256250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final EditorToolbar f256251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final EditorHistoryButtons f256252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final EditorFloorsView f256253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final e f256254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f256255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.u1 f256256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f256257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f256258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final List<Rect> f256259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.itemactionsbar.a<Rect> f256260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.itemactionsbar.a<Rect> f256261o;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorItemActions$findAndSetBestPosition$2", f = "HelperEditorItemActions.kt", i = {1}, l = {com.planner5d.library.engine.input.f.b.f160703k1, com.planner5d.library.engine.input.f.b.f160706l1}, m = "invokeSuspend", n = {MetricConsts.Install}, s = {"L$2"})
    @SourceDebugExtension({"SMAP\nHelperEditorItemActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorItemActions.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorItemActions$findAndSetBestPosition$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,125:1\n37#2,2:126\n278#3,3:128\n*S KotlinDebug\n*F\n+ 1 HelperEditorItemActions.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorItemActions$findAndSetBestPosition$2\n*L\n92#1:126,2\n93#1:128,3\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Rect>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f256263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f256264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f256265d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ PropertiesBarView f256267f;

        /* JADX INFO: renamed from: com.planner5d.library.widget.editor.helper.e2$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorItemActions$findAndSetBestPosition$2$1$1$1", f = "HelperEditorItemActions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1732a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f256268a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PropertiesBarView f256269b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Rect f256270c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1732a(PropertiesBarView propertiesBarView, Rect rect, kotlin.coroutines.d<? super C1732a> dVar) {
                super(2, dVar);
                this.f256269b = propertiesBarView;
                this.f256270c = rect;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1732a(this.f256269b, this.f256270c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f256268a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                PropertiesBarView propertiesBarView = this.f256269b;
                Rect rect = this.f256270c;
                propertiesBarView.o(rect.left, rect.top);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1732a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PropertiesBarView propertiesBarView, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f256267f = propertiesBarView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e2.this.new a(this.f256267f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e2 e2Var;
            PropertiesBarView propertiesBarView;
            Rect rect;
            e2 e2Var2;
            Rect rect2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256265d;
            int i11 = 2 ^ 1;
            if (i10 != 0) {
                if (i10 == 1) {
                    PropertiesBarView propertiesBarView2 = (PropertiesBarView) this.f256263b;
                    e2 e2Var3 = (e2) this.f256262a;
                    ResultKt.m(obj);
                    propertiesBarView = propertiesBarView2;
                    e2Var = e2Var3;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rect = (Rect) this.f256264c;
                    rect2 = (Rect) this.f256263b;
                    e2Var2 = (e2) this.f256262a;
                    ResultKt.m(obj);
                }
                e2Var2.f256259m.add(rect);
                return rect2;
            }
            ResultKt.m(obj);
            com.planner5d.library.widget.editor.itemactionsbar.a aVar = e2.this.f256260n;
            e2Var = e2.this;
            propertiesBarView = this.f256267f;
            aVar.b(e2Var.f256259m.toArray(new Rect[0]));
            RectF boundingBox = propertiesBarView.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
            Rect rect3 = new Rect();
            boundingBox.roundOut(rect3);
            aVar.c(rect3);
            this.f256262a = e2Var;
            this.f256263b = propertiesBarView;
            this.f256265d = 1;
            obj = aVar.d(this);
            if (obj != objL) {
            }
            return objL;
            Rect rect4 = (Rect) obj;
            if (rect4 == null) {
                return null;
            }
            kotlinx.coroutines.a3 a3VarA = com.planner5d.library.services.utility.s.f229729a.a();
            C1732a c1732a = new C1732a(propertiesBarView, rect4, null);
            this.f256262a = e2Var;
            this.f256263b = rect4;
            this.f256264c = rect4;
            this.f256265d = 2;
            if (kotlinx.coroutines.i.h(a3VarA, c1732a, this) != objL) {
                rect = rect4;
                e2Var2 = e2Var;
                rect2 = rect;
                e2Var2.f256259m.add(rect);
                return rect2;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Rect> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorItemActions$requestShowAndPositionItemActions$2", f = "HelperEditorItemActions.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160710n, com.planner5d.library.engine.input.f.b.f160710n}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHelperEditorItemActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorItemActions.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorItemActions$requestShowAndPositionItemActions$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256271a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Item f256273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Item item, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f256273c = item;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e2.this.new b(this.f256273c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        
            if (r1.s(r3, r6, r5) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 2
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f256271a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                r4 = 0
                if (r1 == r3) goto L1f
                r4 = 1
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r6)
                goto L4b
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "ousmfth  tvcl /oleoreai/bt//w///euon oris cree enik"
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1f:
                kotlin.ResultKt.m(r6)
                r4 = 3
                goto L38
            L24:
                kotlin.ResultKt.m(r6)
                com.planner5d.library.widget.editor.helper.e2 r6 = com.planner5d.library.widget.editor.helper.e2.this
                com.planner5d.library.widget.editor.itemactionsbar.k r6 = com.planner5d.library.widget.editor.helper.e2.i(r6)
                com.planner5d.library.model.item.Item r1 = r5.f256273c
                r5.f256271a = r3
                java.lang.Object r6 = r6.h(r1, r5)
                if (r6 != r0) goto L38
                goto L4a
            L38:
                com.planner5d.library.widget.editor.itemactionsbar.k$b r6 = (com.planner5d.library.widget.editor.itemactionsbar.k.b) r6
                if (r6 == 0) goto L4b
                r4 = 3
                com.planner5d.library.widget.editor.helper.e2 r1 = com.planner5d.library.widget.editor.helper.e2.this
                com.planner5d.library.model.item.Item r3 = r5.f256273c
                r4 = 4
                r5.f256271a = r2
                java.lang.Object r5 = com.planner5d.library.widget.editor.helper.e2.m(r1, r3, r6, r5)
                if (r5 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.helper.e2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorItemActions", f = "HelperEditorItemActions.kt", i = {0, 0, 0, 1, 1, 1}, l = {63, 76, 85}, m = "showAndPositionItemActions", n = {"this", "item", "positioningData", "this", "item", "positionFinder"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f256275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f256276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f256277d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f256279f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f256277d = obj;
            this.f256279f |= Integer.MIN_VALUE;
            return e2.this.s(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorItemActions$showAndPositionItemActions$positionFinder$1", f = "HelperEditorItemActions.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHelperEditorItemActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorItemActions.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorItemActions$showAndPositionItemActions$positionFinder$1\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,125:1\n278#2,3:126\n*S KotlinDebug\n*F\n+ 1 HelperEditorItemActions.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorItemActions$showAndPositionItemActions$positionFinder$1\n*L\n66#1:126,3\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super com.planner5d.library.widget.editor.itemactionsbar.a<Rect>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256280a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.itemactionsbar.k.b f256282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.planner5d.library.widget.editor.itemactionsbar.k.b bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f256282c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e2.this.new d(this.f256282c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256280a;
            if (i10 == 0) {
                ResultKt.m(obj);
                List list = e2.this.f256259m;
                e2 e2Var = e2.this;
                list.clear();
                RectF rectFO = e2Var.f256254h.o();
                Rect rect = new Rect();
                rectFO.roundOut(rect);
                list.add(rect);
                y3 y3Var = y3.f229862a;
                list.add(y3Var.q(e2Var.f256250d));
                list.add(y3Var.q(e2Var.f256251e));
                list.add(y3Var.q(e2Var.f256252f));
                list.add(y3Var.q(e2Var.f256253g));
                PropertiesBarView propertiesBarView = e2.this.f256248b;
                if (propertiesBarView != null) {
                    e2 e2Var2 = e2.this;
                    this.f256280a = 1;
                    if (e2Var2.p(propertiesBarView, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return e2.this.o(this.f256282c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.widget.editor.itemactionsbar.a<Rect>> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public e2(@NotNull com.planner5d.library.widget.editor.itemactionsbar.k itemActionsPositioningDataLoader, @Nullable PropertiesBarView propertiesBarView, @NotNull ItemActionsBar itemActionsBar, @NotNull View backButton, @NotNull EditorToolbar editorToolbar, @NotNull EditorHistoryButtons historyButtons, @NotNull EditorFloorsView floorsView, @NotNull e bottomMenuHelper, @NotNull Rect maximumArea, boolean z10, @NotNull com.planner5d.library.model.manager.u1 logRecordManagerService, @NotNull kotlinx.coroutines.s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(itemActionsPositioningDataLoader, "itemActionsPositioningDataLoader");
        Intrinsics.checkNotNullParameter(itemActionsBar, "itemActionsBar");
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        Intrinsics.checkNotNullParameter(editorToolbar, "editorToolbar");
        Intrinsics.checkNotNullParameter(historyButtons, "historyButtons");
        Intrinsics.checkNotNullParameter(floorsView, "floorsView");
        Intrinsics.checkNotNullParameter(bottomMenuHelper, "bottomMenuHelper");
        Intrinsics.checkNotNullParameter(maximumArea, "maximumArea");
        Intrinsics.checkNotNullParameter(logRecordManagerService, "logRecordManagerService");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f256247a = itemActionsPositioningDataLoader;
        this.f256248b = propertiesBarView;
        this.f256249c = itemActionsBar;
        this.f256250d = backButton;
        this.f256251e = editorToolbar;
        this.f256252f = historyButtons;
        this.f256253g = floorsView;
        this.f256254h = bottomMenuHelper;
        this.f256255i = z10;
        this.f256256j = logRecordManagerService;
        this.f256257k = coroutineScope;
        this.f256259m = new ArrayList();
        Rect rect = null;
        this.f256260n = new com.planner5d.library.widget.editor.itemactionsbar.m(maximumArea, null, rect, 6, null);
        this.f256261o = new com.planner5d.library.widget.editor.itemactionsbar.m(maximumArea, null, rect, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final com.planner5d.library.widget.editor.itemactionsbar.a<Rect> o(com.planner5d.library.widget.editor.itemactionsbar.k.b bVar) {
        if (!this.f256255i) {
            com.planner5d.library.widget.editor.itemactionsbar.a<Rect> aVar = this.f256260n;
            aVar.b(this.f256259m.toArray(new Rect[0]));
            return aVar;
        }
        com.planner5d.library.widget.editor.itemactionsbar.a<Rect> aVar2 = this.f256260n;
        kotlin.jvm.internal.p1 p1Var = new kotlin.jvm.internal.p1(2);
        p1Var.b(this.f256259m.toArray(new Rect[0]));
        RectF rectFA = bVar.a();
        Rect rect = new Rect();
        rectFA.roundOut(rect);
        p1Var.a(rect);
        aVar2.b(p1Var.d(new Rect[p1Var.c()]));
        com.planner5d.library.widget.editor.itemactionsbar.a<Rect> aVar3 = this.f256261o;
        kotlin.jvm.internal.p1 p1Var2 = new kotlin.jvm.internal.p1(2);
        p1Var2.b(this.f256259m.toArray(new Rect[0]));
        RectF[] rectFArrB = bVar.b();
        ArrayList arrayList = new ArrayList(rectFArrB.length);
        for (RectF rectF : rectFArrB) {
            Rect rect2 = new Rect();
            rectF.roundOut(rect2);
            arrayList.add(rect2);
        }
        p1Var2.b(arrayList.toArray(new Rect[0]));
        aVar3.b(p1Var2.d(new Rect[p1Var2.c()]));
        return new com.planner5d.library.widget.editor.itemactionsbar.l(this.f256260n, this.f256261o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(PropertiesBarView propertiesBarView, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new a(propertiesBarView, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(e2 e2Var, Item item) {
        e2Var.q(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r2.p2(r15, r14, r8, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
    
        if (r14.p2(r12, r15, r3, r0) == r1) goto L49;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00b3, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(com.planner5d.library.model.item.Item r13, com.planner5d.library.widget.editor.itemactionsbar.k.b r14, kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.helper.e2.s(com.planner5d.library.model.item.Item, com.planner5d.library.widget.editor.itemactionsbar.k$b, kotlin.coroutines.d):java.lang.Object");
    }

    @androidx.annotation.l0
    public final void n() {
        kotlinx.coroutines.p2 p2Var = this.f256258l;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f256249c.k2();
    }

    @androidx.annotation.l0
    public final void q(@NotNull final Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PropertiesBarView propertiesBarView = this.f256248b;
        if (propertiesBarView != null) {
            propertiesBarView.setOnBarRepositionListener(new PropertiesBarView.a() { // from class: com.planner5d.library.widget.editor.helper.d2
                @Override // com.planner5d.library.widget.editor.propertiesbar.PropertiesBarView.a
                public final void a() {
                    e2.r(this.f256218a, item);
                }
            });
        }
        kotlinx.coroutines.p2 p2Var = this.f256258l;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f256258l = kotlinx.coroutines.k.f(this.f256257k, null, null, new b(item, null), 3, null);
    }
}
