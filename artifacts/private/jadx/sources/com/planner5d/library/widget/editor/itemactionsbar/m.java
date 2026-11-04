package com.planner5d.library.widget.editor.itemactionsbar;

import android.graphics.Rect;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRectOptimizedBestPositionFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectOptimizedBestPositionFinder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/RectOptimizedBestPositionFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
public final class m implements com.planner5d.library.widget.editor.itemactionsbar.a<Rect> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f257007d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Rect f257008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Rect[] f257009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Rect f257010c;

    @SourceDebugExtension({"SMAP\nRectOptimizedBestPositionFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectOptimizedBestPositionFinder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/RectOptimizedBestPositionFinder$BestPositionComputation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,209:1\n1#2:210\n13474#3,3:211\n*S KotlinDebug\n*F\n+ 1 RectOptimizedBestPositionFinder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/RectOptimizedBestPositionFinder$BestPositionComputation\n*L\n113#1:211,3\n*E\n"})
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Rect f257011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Rect[] f257012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Rect f257013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Rect f257014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f257015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f257016f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private Long f257017g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final Rect f257018h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private Float f257019i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f257020j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private Rect f257021k;

        /* JADX INFO: renamed from: com.planner5d.library.widget.editor.itemactionsbar.m$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.itemactionsbar.RectOptimizedBestPositionFinder$BestPositionComputation$computeBestPosition$2", f = "RectOptimizedBestPositionFinder.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
        static final class C1736a extends o implements Function2<s0, kotlin.coroutines.d<? super Rect>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f257022a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f257023b;

            C1736a(kotlin.coroutines.d<? super C1736a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C1736a c1736a = a.this.new C1736a(dVar);
                c1736a.f257023b = obj;
                return c1736a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                s0 s0Var;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f257022a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    s0Var = (s0) this.f257023b;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s0Var = (s0) this.f257023b;
                    ResultKt.m(obj);
                }
                while (a.this.q()) {
                    t0.j(s0Var);
                    if (a.this.o()) {
                        a aVar = a.this;
                        this.f257023b = s0Var;
                        this.f257022a = 1;
                        if (aVar.w(this) == objL) {
                            return objL;
                        }
                    } else {
                        if (a.this.r()) {
                            a.this.j();
                            a.this.n();
                            a.this.k();
                        }
                        a.this.x();
                    }
                }
                return a.this.f257021k;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Rect> dVar) {
                return ((C1736a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public a(@NotNull Rect availableArea, @NotNull Rect[] restrictedAreas, @NotNull Rect preferableResult) {
            Intrinsics.checkNotNullParameter(availableArea, "availableArea");
            Intrinsics.checkNotNullParameter(restrictedAreas, "restrictedAreas");
            Intrinsics.checkNotNullParameter(preferableResult, "preferableResult");
            this.f257011a = availableArea;
            this.f257012b = restrictedAreas;
            this.f257013c = preferableResult;
            Rect rect = new Rect(preferableResult);
            z(rect, availableArea.left, availableArea.top);
            this.f257014d = rect;
            this.f257018h = new Rect();
            this.f257020j = Float.MAX_VALUE;
        }

        private final boolean A(Rect rect, Rect rect2) {
            return rect != null && rect2 != null && rect.top < rect2.bottom && rect.bottom > rect2.top;
        }

        private final int B(Rect rect, Rect rect2) {
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 > i11) {
                i10 = i11;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                i12 = i13;
            }
            return i10 - i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j() {
            Rect rect = this.f257014d;
            z(rect, this.f257018h.left, rect.top);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k() {
            float f10 = this.f257016f;
            if (f10 < this.f257020j) {
                this.f257020j = f10;
                Rect rect = this.f257021k;
                if (rect != null) {
                    rect.set(this.f257014d);
                } else {
                    rect = new Rect(this.f257014d);
                }
                this.f257021k = rect;
            }
        }

        private final void m() {
            this.f257015e = 0L;
            Rect[] rectArr = this.f257012b;
            int length = rectArr.length;
            int i10 = 0;
            int i11 = 4 | 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = i12 + 1;
                if (A(this.f257014d, rectArr[i10])) {
                    this.f257015e = (1 << i12) | this.f257015e;
                }
                i10++;
                i12 = i13;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n() {
            double d10 = 2;
            this.f257016f = (float) Math.sqrt(((float) Math.pow(this.f257014d.left - this.f257013c.left, d10)) + ((float) Math.pow(this.f257014d.top - this.f257013c.top, d10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o() {
            m();
            long j10 = this.f257015e;
            Long l10 = this.f257017g;
            if (l10 != null && j10 == l10.longValue()) {
                return false;
            }
            this.f257017g = Long.valueOf(this.f257015e);
            return true;
        }

        private final boolean p() {
            return this.f257014d.right < this.f257011a.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q() {
            return this.f257014d.bottom < this.f257011a.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r() {
            return this.f257019i != null;
        }

        private final boolean s() {
            float f10 = this.f257016f;
            Float f11 = this.f257019i;
            return f10 < (f11 != null ? f11.floatValue() : Float.MAX_VALUE);
        }

        private final boolean t() {
            for (Rect rect : this.f257012b) {
                if (rect != null && this.f257014d.intersects(rect.left, rect.top, rect.right, rect.bottom)) {
                    Rect rect2 = this.f257014d;
                    rect2.offset(B(rect2, rect), 0);
                    int i10 = 5 >> 1;
                    return true;
                }
            }
            return false;
        }

        private final void u() {
            this.f257018h.set(this.f257014d);
            this.f257019i = null;
        }

        private final void v() {
            this.f257019i = Float.valueOf(this.f257016f);
            this.f257018h.set(this.f257014d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object w(kotlin.coroutines.d<? super Unit> dVar) {
            u();
            while (true) {
                s2.y(dVar.getContext());
                if (!p()) {
                    x();
                    break;
                }
                if (!t()) {
                    n();
                    k();
                    if (!s()) {
                        x();
                        break;
                    }
                    v();
                    y();
                }
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void x() {
            Rect rect = this.f257014d;
            z(rect, this.f257011a.left, rect.top + 1);
        }

        private final void y() {
            this.f257014d.offset(1, 0);
        }

        private final void z(Rect rect, int i10, int i11) {
            rect.right = rect.width() + i10;
            rect.bottom = rect.height() + i11;
            rect.left = i10;
            rect.top = i11;
        }

        @Nullable
        public final Object l(@NotNull kotlin.coroutines.d<? super Rect> dVar) {
            return kotlinx.coroutines.i.h(s.f229729a.h(), new C1736a(null), dVar);
        }
    }

    public m() {
        this(null, null, null, 7, null);
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Rect> dVar) {
        Rect rectA = a();
        if (rectA != null) {
            if (rectA.isEmpty()) {
                rectA = null;
            }
            if (rectA != null) {
                Rect[] rectArrE = e();
                if (rectArrE != null) {
                    if (rectArrE.length > 64) {
                        rectArrE = null;
                    }
                    if (rectArrE == null) {
                        return null;
                    }
                } else {
                    rectArrE = new Rect[0];
                }
                Rect rectG = g();
                if (rectG != null) {
                    if (rectG.isEmpty()) {
                        rectG = null;
                    }
                    if (rectG != null) {
                        return new a(rectA, rectArrE, rectG).l(dVar);
                    }
                }
            }
        }
        return null;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Rect a() {
        return this.f257008a;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Rect g() {
        return this.f257010c;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Rect[] e() {
        return this.f257009b;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void f(@Nullable Rect rect) {
        this.f257008a = rect;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void c(@Nullable Rect rect) {
        this.f257010c = rect;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(@Nullable Rect[] rectArr) {
        this.f257009b = rectArr;
    }

    public m(@Nullable Rect rect, @Nullable Rect[] rectArr, @Nullable Rect rect2) {
        this.f257008a = rect;
        this.f257009b = rectArr;
        this.f257010c = rect2;
    }

    public /* synthetic */ m(Rect rect, Rect[] rectArr, Rect rect2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : rect, (i10 & 2) != 0 ? null : rectArr, (i10 & 4) != 0 ? null : rect2);
    }
}
