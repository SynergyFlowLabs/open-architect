package com.planner5d.library.widget.editor.itemactionsbar;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.services.utility.h2;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.y3;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nItemActionsBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemActionsBar.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBar\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 NullabilityUtils.kt\ncom/planner5d/library/services/utility/NullabilityUtils\n*L\n1#1,120:1\n257#2,2:121\n8#3:123\n*S KotlinDebug\n*F\n+ 1 ItemActionsBar.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBar\n*L\n111#1:121,2\n33#1:123\n*E\n"})
public final class ItemActionsBar extends RecyclerView {

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final int f256916e5 = 8;
    private int Y4;
    private int Z4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    private final int f256917a5;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    @NotNull
    private final PointF f256918b5;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    private final int f256919c5;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    private final long f256920d5;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar$reveal$2", f = "ItemActionsBar.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nItemActionsBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemActionsBar.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBar$reveal$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,120:1\n257#2,2:121\n*S KotlinDebug\n*F\n+ 1 ItemActionsBar.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBar$reveal$2\n*L\n73#1:121,2\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256921a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f256923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PointF f256924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.itemactionsbar.a<Rect> f256925e;

        /* JADX INFO: renamed from: com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar$reveal$2$1", f = "ItemActionsBar.kt", i = {0}, l = {64}, m = "invokeSuspend", n = {"originalPosition"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nItemActionsBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemActionsBar.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBar$reveal$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
        static final class C1735a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f256926a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f256927b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ItemActionsBar f256928c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f256929d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ PointF f256930e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f256931f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.widget.editor.itemactionsbar.a<Rect> f256932g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1735a(ItemActionsBar itemActionsBar, int i10, PointF pointF, float f10, com.planner5d.library.widget.editor.itemactionsbar.a<Rect> aVar, kotlin.coroutines.d<? super C1735a> dVar) {
                super(2, dVar);
                this.f256928c = itemActionsBar;
                this.f256929d = i10;
                this.f256930e = pointF;
                this.f256931f = f10;
                this.f256932g = aVar;
                int i11 = 1 | 2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1735a(this.f256928c, this.f256929d, this.f256930e, this.f256931f, this.f256932g, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Rect rect;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f256927b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    int i11 = this.f256928c.f256917a5 + this.f256929d;
                    int iL0 = kotlin.math.b.L0(this.f256930e.y);
                    Rect rect2 = new Rect(kotlin.math.b.L0(this.f256930e.x - this.f256931f), iL0 - i11, kotlin.math.b.L0(this.f256930e.x + this.f256931f), iL0);
                    this.f256932g.c(rect2);
                    com.planner5d.library.widget.editor.itemactionsbar.a<Rect> aVar = this.f256932g;
                    this.f256926a = rect2;
                    this.f256927b = 1;
                    obj = aVar.d(this);
                    if (obj == objL) {
                        return objL;
                    }
                    rect = rect2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rect = (Rect) this.f256926a;
                    ResultKt.m(obj);
                }
                Rect rect3 = (Rect) obj;
                if (rect3 == null) {
                    com.planner5d.library.widget.editor.itemactionsbar.a<Rect> aVar2 = this.f256932g;
                    ItemActionsBar itemActionsBar = this.f256928c;
                    Rect rectA = aVar2.a();
                    if (rectA != null) {
                        itemActionsBar.m2(rect, rectA);
                    }
                } else {
                    rect = rect3;
                }
                this.f256928c.f256918b5.x = rect.centerX();
                this.f256928c.f256918b5.y = rect.top;
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1735a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, PointF pointF, com.planner5d.library.widget.editor.itemactionsbar.a<Rect> aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f256923c = i10;
            this.f256924d = pointF;
            this.f256925e = aVar;
            int i11 = 4 | 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ItemActionsBar.this.new a(this.f256923c, this.f256924d, this.f256925e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256921a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (!ItemActionsBar.this.isAttachedToWindow()) {
                    return Unit.f312394a;
                }
                float measuredWidthInstant = ItemActionsBar.this.getMeasuredWidthInstant() / 2.0f;
                z1 z1VarH = s.f229729a.h();
                C1735a c1735a = new C1735a(ItemActionsBar.this, this.f256923c, this.f256924d, measuredWidthInstant, this.f256925e, null);
                this.f256921a = 1;
                if (kotlinx.coroutines.i.h(z1VarH, c1735a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            ItemActionsBar.this.setScaleX(0.0f);
            ItemActionsBar.this.setScaleY(0.0f);
            ItemActionsBar itemActionsBar = ItemActionsBar.this;
            itemActionsBar.setX(itemActionsBar.f256918b5.x);
            ItemActionsBar itemActionsBar2 = ItemActionsBar.this;
            itemActionsBar2.setY(itemActionsBar2.f256918b5.y);
            ItemActionsBar.this.setVisibility(0);
            ItemActionsBar.this.animate().setDuration(ItemActionsBar.this.f256920d5).scaleX(1.0f).scaleY(1.0f);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar", f = "ItemActionsBar.kt", i = {0, 0, 0, 0}, l = {42, 47}, m = "show", n = {"this", "positionFinder", "topCenter", "padding"}, s = {"L$0", "L$1", "L$2", "I$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f256934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f256935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f256936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f256937e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f256939g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f256937e = obj;
            this.f256939g |= Integer.MIN_VALUE;
            return ItemActionsBar.this.p2(null, null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar$show$2", f = "ItemActionsBar.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nItemActionsBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemActionsBar.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBar$show$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,120:1\n255#2:121\n*S KotlinDebug\n*F\n+ 1 ItemActionsBar.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBar$show$2\n*L\n43#1:121\n*E\n"})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256940a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ItemActionsBar.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f256940a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (ItemActionsBar.this.getVisibility() == 0) {
                ItemActionsBar.this.k2();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ItemActionsBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 5 | 0;
    }

    private final float getLayoutPositionX() {
        float x10 = getX() + (getMeasuredWidth() / 2);
        int i10 = this.f256919c5;
        float f10 = x10 + i10;
        int i11 = this.Z4;
        return f10 > ((float) i11) ? (i11 - getMeasuredWidth()) - this.f256919c5 : Math.max(i10, this.f256918b5.x - (getMeasuredWidth() / 2));
    }

    private final float getLayoutPositionY() {
        float y10 = getY() + getMeasuredHeight();
        int i10 = this.f256919c5;
        float f10 = y10 + i10;
        int i11 = this.Y4;
        return f10 > ((float) i11) ? (i11 - getMeasuredHeight()) - this.f256919c5 : Math.max(i10, getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMeasuredWidthInstant() {
        if (getMeasuredWidth() == 0) {
            measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        return getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2(Rect rect, Rect rect2) {
        rect.offset(rect2.centerX() - rect.centerX(), rect2.centerY() - rect.centerY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n2(com.planner5d.library.widget.editor.itemactionsbar.a<Rect> aVar, PointF pointF, int i10, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.a(), new a(i10, pointF, aVar, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o2(ItemActionsBar itemActionsBar, List list) {
        h2 h2Var = h2.f225257a;
        RecyclerView.h adapter = itemActionsBar.getAdapter();
        Unit unit = null;
        d dVar = adapter instanceof d ? (d) adapter : null;
        if (dVar != null) {
            dVar.h(list);
            unit = Unit.f312394a;
        }
        if (unit == null) {
            itemActionsBar.setAdapter(new d(list));
        }
        return Unit.f312394a;
    }

    public final void k2() {
        setScaleY(0.0f);
        setScaleX(0.0f);
        setVisibility(8);
    }

    public final void l2() {
        this.Y4 = h3.A(getContext());
        this.Z4 = h3.H(getContext());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setX(getLayoutPositionX());
        setY(getLayoutPositionY());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r8.n2(r9, r10, r11, r0) == r1) goto L25;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p2(@org.jetbrains.annotations.NotNull com.planner5d.library.widget.editor.itemactionsbar.a<android.graphics.Rect> r9, @org.jetbrains.annotations.NotNull android.graphics.PointF r10, boolean r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar.b
            r7 = 3
            if (r0 == 0) goto L18
            r0 = r12
            r7 = 5
            com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar$b r0 = (com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar.b) r0
            int r1 = r0.f256939g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r7 = 2
            if (r3 == 0) goto L18
            r7 = 3
            int r1 = r1 - r2
            r0.f256939g = r1
            r7 = 6
            goto L1e
        L18:
            r7 = 3
            com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar$b r0 = new com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar$b
            r0.<init>(r12)
        L1e:
            java.lang.Object r12 = r0.f256937e
            r7 = 6
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f256939g
            r3 = 2
            r7 = r7 ^ r3
            r4 = 1
            r7 = 3
            r5 = 0
            if (r2 == 0) goto L57
            if (r2 == r4) goto L40
            if (r2 != r3) goto L37
            kotlin.ResultKt.m(r12)
            r7 = 4
            goto L9c
        L37:
            r7 = 0
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            int r8 = r0.f256936d
            java.lang.Object r9 = r0.f256935c
            r10 = r9
            android.graphics.PointF r10 = (android.graphics.PointF) r10
            java.lang.Object r9 = r0.f256934b
            r7 = 5
            com.planner5d.library.widget.editor.itemactionsbar.a r9 = (com.planner5d.library.widget.editor.itemactionsbar.a) r9
            java.lang.Object r11 = r0.f256933a
            com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar r11 = (com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar) r11
            kotlin.ResultKt.m(r12)
            r6 = r11
            r11 = r8
            r8 = r6
            goto L8c
        L57:
            r7 = 4
            kotlin.ResultKt.m(r12)
            android.content.res.Resources r12 = r8.getResources()
            if (r11 == 0) goto L64
            int r11 = com.planner5d.library.f.g.Ph
            goto L66
        L64:
            int r11 = com.planner5d.library.f.g.Dh
        L66:
            r7 = 7
            int r11 = r12.getDimensionPixelSize(r11)
            com.planner5d.library.services.utility.s r12 = com.planner5d.library.services.utility.s.f229729a
            r7 = 6
            kotlinx.coroutines.a3 r12 = r12.a()
            r7 = 0
            com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar$c r2 = new com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar$c
            r2.<init>(r5)
            r0.f256933a = r8
            r0.f256934b = r9
            r7 = 4
            r0.f256935c = r10
            r7 = 5
            r0.f256936d = r11
            r0.f256939g = r4
            java.lang.Object r12 = kotlinx.coroutines.i.h(r12, r2, r0)
            r7 = 7
            if (r12 != r1) goto L8c
            goto L9b
        L8c:
            r0.f256933a = r5
            r0.f256934b = r5
            r0.f256935c = r5
            r0.f256939g = r3
            java.lang.Object r8 = r8.n2(r9, r10, r11, r0)
            r7 = 2
            if (r8 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r7 = 7
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar.p2(com.planner5d.library.widget.editor.itemactionsbar.a, android.graphics.PointF, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    public final void setActions(@NotNull final List<com.planner5d.library.widget.editor.itemactionsbar.b> actionsForItem) {
        Intrinsics.checkNotNullParameter(actionsForItem, "actionsForItem");
        y3.f229862a.w(this, new Function0() { // from class: com.planner5d.library.widget.editor.itemactionsbar.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ItemActionsBar.o2(this.f256953a, actionsForItem);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ItemActionsBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ItemActionsBar(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ItemActionsBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.Y4 = h3.A(context);
        this.Z4 = h3.H(context);
        this.f256917a5 = getResources().getDimensionPixelSize(com.planner5d.library.f.g.Ph);
        this.f256918b5 = new PointF();
        this.f256919c5 = getResources().getDimensionPixelSize(com.planner5d.library.f.g.Th);
        this.f256920d5 = getResources().getInteger(com.planner5d.library.f.k.f168564e);
    }
}
