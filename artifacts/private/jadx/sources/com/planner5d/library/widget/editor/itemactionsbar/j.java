package com.planner5d.library.widget.editor.itemactionsbar;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@kotlin.l(message = "Refactor and optimize in future - as now it is only pure brute-force solution")
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nItemActionsFreePositionFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemActionsFreePositionFinder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsFreePositionFinder\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,88:1\n278#2,3:89\n*S KotlinDebug\n*F\n+ 1 ItemActionsFreePositionFinder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsFreePositionFinder\n*L\n24#1:89,3\n*E\n"})
public final class j implements com.planner5d.library.widget.editor.itemactionsbar.a<RectF> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f256971e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private RectF f256972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private RectF[] f256973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private RectF f256974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f256975d;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.math.k f256976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final RectF f256977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f256978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f256979d;

        public a(@NotNull RectF area, @NotNull com.planner5d.library.math.k center) {
            Intrinsics.checkNotNullParameter(area, "area");
            Intrinsics.checkNotNullParameter(center, "center");
            this.f256976a = center;
            this.f256977b = new RectF(area);
        }

        @NotNull
        public final RectF a() {
            return this.f256977b;
        }

        public final float b() {
            return this.f256979d;
        }

        public final float c() {
            return this.f256978c;
        }

        public final void d(@NotNull a intersectingArea) {
            Intrinsics.checkNotNullParameter(intersectingArea, "intersectingArea");
            this.f256977b.set(intersectingArea.f256977b);
            g(intersectingArea.f256978c);
        }

        public final void e(float f10) {
            this.f256979d = f10;
        }

        public final void f(float f10) {
            this.f256978c = f10;
        }

        public final void g(float f10) {
            this.f256978c = f10;
            this.f256979d = this.f256976a.l(this.f256977b.centerX(), this.f256977b.centerY());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.itemactionsbar.ItemActionsFreePositionFinder$findFreeArea$2", f = "ItemActionsFreePositionFinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super RectF>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f256981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RectF f256982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f256983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RectF[] f256984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.j f256985f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.j f256986g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(RectF rectF, j jVar, RectF[] rectFArr, kotlin.ranges.j jVar2, kotlin.ranges.j jVar3, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f256982c = rectF;
            this.f256983d = jVar;
            this.f256984e = rectFArr;
            this.f256985f = jVar2;
            this.f256986g = jVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f256982c, this.f256983d, this.f256984e, this.f256985f, this.f256986g, dVar);
            bVar.f256981b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f256980a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            s0 s0Var = (s0) this.f256981b;
            com.planner5d.library.math.k kVar = new com.planner5d.library.math.k(this.f256982c.centerX(), this.f256982c.centerY());
            a aVar = new a(this.f256982c, kVar);
            a aVar2 = new a(this.f256982c, kVar);
            RectF rectF = new RectF();
            aVar.g(this.f256983d.l(aVar.a(), rectF, this.f256984e));
            int iL = this.f256985f.l();
            int iM = this.f256985f.m();
            int iN = this.f256985f.n();
            if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
                while (true) {
                    int iL2 = this.f256986g.l();
                    int iM2 = this.f256986g.m();
                    int iN2 = this.f256986g.n();
                    if ((iN2 > 0 && iL2 <= iM2) || (iN2 < 0 && iM2 <= iL2)) {
                        while (true) {
                            t0.j(s0Var);
                            float f10 = iL;
                            float f11 = iL2;
                            aVar2.a().set(f10, f11, this.f256982c.width() + f10, this.f256982c.height() + f11);
                            aVar2.g(this.f256983d.l(aVar2.a(), rectF, this.f256984e));
                            if (aVar2.c() <= aVar.c() && (aVar.c() > 0.0f || aVar2.b() < aVar.b())) {
                                aVar.d(aVar2);
                            }
                            if (iL2 == iM2) {
                                break;
                            }
                            iL2 += iN2;
                        }
                    }
                    if (iL == iM) {
                        break;
                    }
                    iL += iN;
                }
            }
            return aVar.a();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super RectF> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j() {
        this(null, null, null, 0, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(RectF rectF, kotlin.ranges.j jVar, kotlin.ranges.j jVar2, RectF[] rectFArr, kotlin.coroutines.d<? super RectF> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new b(rectF, this, rectFArr, jVar, jVar2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float l(RectF rectF, RectF rectF2, RectF[] rectFArr) {
        float fWidth = 0.0f;
        for (RectF rectF3 : rectFArr) {
            rectF2.set(rectF);
            if (rectF2.intersect(rectF3)) {
                fWidth += rectF2.width() * rectF2.height();
            }
        }
        return fWidth;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super RectF> dVar) {
        RectF rectFA = a();
        if (rectFA == null) {
            return null;
        }
        Rect rect = new Rect();
        rectFA.roundOut(rect);
        RectF rectFG = g();
        if (rectFG == null) {
            return null;
        }
        kotlin.ranges.j jVarB1 = r.B1(new IntRange(rect.left, rect.right), this.f256975d);
        kotlin.ranges.j jVarB2 = r.B1(new IntRange(rect.top, rect.bottom), this.f256975d);
        RectF[] rectFArrE = e();
        if (rectFArrE == null) {
            rectFArrE = new RectF[0];
        }
        return j(rectFG, jVarB1, jVarB2, rectFArrE, dVar);
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public RectF a() {
        return this.f256972a;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public RectF g() {
        return this.f256974c;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public RectF[] e() {
        return this.f256973b;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void f(@Nullable RectF rectF) {
        this.f256972a = rectF;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void c(@Nullable RectF rectF) {
        this.f256974c = rectF;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void b(@Nullable RectF[] rectFArr) {
        this.f256973b = rectFArr;
    }

    public j(@Nullable RectF rectF, @Nullable RectF[] rectFArr, @Nullable RectF rectF2, int i10) {
        this.f256972a = rectF;
        this.f256973b = rectFArr;
        this.f256974c = rectF2;
        this.f256975d = i10;
    }

    public /* synthetic */ j(RectF rectF, RectF[] rectFArr, RectF rectF2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : rectF, (i11 & 2) != 0 ? null : rectFArr, (i11 & 4) != 0 ? null : rectF2, (i11 & 8) != 0 ? 15 : i10);
    }
}
