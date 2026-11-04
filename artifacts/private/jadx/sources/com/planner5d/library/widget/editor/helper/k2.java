package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.model.item.Item;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class k2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f256487h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f256488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.itemactionsbar.h f256489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f256490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f256491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f256492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f256493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f256494g;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @ij.f
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f256495b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.widget.editor.itemactionsbar.h f256496a;

        @ij.a
        public a(@NotNull com.planner5d.library.widget.editor.itemactionsbar.h itemActionsBuilder) {
            Intrinsics.checkNotNullParameter(itemActionsBuilder, "itemActionsBuilder");
            this.f256496a = itemActionsBuilder;
        }

        @NotNull
        public final k2 a(@NotNull g1 helperEditor, @NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull b callback) {
            Intrinsics.checkNotNullParameter(helperEditor, "helperEditor");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new k2(helperEditor, this.f256496a, coroutineScope, callback);
        }
    }

    public interface b {
        @androidx.annotation.l0
        boolean E(@NotNull Item item);

        @androidx.annotation.l0
        void G(@NotNull List<com.planner5d.library.widget.editor.itemactionsbar.b> list);

        @androidx.annotation.l0
        void v(@NotNull Item item, @NotNull List<com.planner5d.library.widget.editor.itemactionsbar.b> list);
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorSelectedItemUiPresenter$refreshItemActionBar$1$1", f = "HelperEditorSelectedItemUiPresenter.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256497a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Item f256499c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorSelectedItemUiPresenter$refreshItemActionBar$1$1$1", f = "HelperEditorSelectedItemUiPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f256500a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k2 f256501b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<com.planner5d.library.widget.editor.itemactionsbar.b> f256502c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k2 k2Var, List<com.planner5d.library.widget.editor.itemactionsbar.b> list, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f256501b = k2Var;
                this.f256502c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f256501b, this.f256502c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f256500a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f256501b.f256491d.G(this.f256502c);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Item item, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f256499c = item;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k2.this.new c(this.f256499c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256497a;
            if (i10 == 0) {
                ResultKt.m(obj);
                List<com.planner5d.library.widget.editor.itemactionsbar.b> listD = k2.this.f256489b.d(k2.this.f256488a, this.f256499c);
                kotlinx.coroutines.a3 a3VarA = com.planner5d.library.services.utility.s.f229729a.a();
                a aVar = new a(k2.this, listD, null);
                this.f256497a = 1;
                if (kotlinx.coroutines.i.h(a3VarA, aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorSelectedItemUiPresenter$showSelectedItemViews$1$1", f = "HelperEditorSelectedItemUiPresenter.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f256504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f256505c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Item f256507e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorSelectedItemUiPresenter$showSelectedItemViews$1$1$1", f = "HelperEditorSelectedItemUiPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<com.planner5d.library.widget.editor.itemactionsbar.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f256508a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k2 f256509b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Item f256510c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k2 k2Var, Item item, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f256509b = k2Var;
                this.f256510c = item;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f256509b, this.f256510c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f256508a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f256509b.f256489b.d(this.f256509b.f256488a, this.f256510c);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<com.planner5d.library.widget.editor.itemactionsbar.b>> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Item item, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f256507e = item;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k2.this.new d(this.f256507e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Item item;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256505c;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (!k2.this.f256491d.E(this.f256507e)) {
                    return Unit.f312394a;
                }
                b bVar2 = k2.this.f256491d;
                Item item2 = this.f256507e;
                kotlinx.coroutines.z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                a aVar = new a(k2.this, this.f256507e, null);
                this.f256503a = bVar2;
                this.f256504b = item2;
                this.f256505c = 1;
                Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                if (objH == objL) {
                    return objL;
                }
                obj = objH;
                bVar = bVar2;
                item = item2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                item = (Item) this.f256504b;
                bVar = (b) this.f256503a;
                ResultKt.m(obj);
            }
            bVar.v(item, (List) obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public k2(@NotNull g1 helperEditor, @NotNull com.planner5d.library.widget.editor.itemactionsbar.h itemActionsBuilder, @NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull b ui2) {
        Intrinsics.checkNotNullParameter(helperEditor, "helperEditor");
        Intrinsics.checkNotNullParameter(itemActionsBuilder, "itemActionsBuilder");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(ui2, "ui");
        this.f256488a = helperEditor;
        this.f256489b = itemActionsBuilder;
        this.f256490c = coroutineScope;
        this.f256491d = ui2;
        this.f256494g = new Object();
    }

    @androidx.annotation.d
    public final void d(@NotNull Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        synchronized (this.f256494g) {
            try {
                kotlinx.coroutines.p2 p2Var = this.f256493f;
                if (p2Var != null) {
                    kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
                }
                this.f256493f = kotlinx.coroutines.k.f(this.f256490c, com.planner5d.library.services.utility.s.f229729a.h(), null, new c(item, null), 2, null);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.d
    public final void e(@NotNull Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        synchronized (this.f256494g) {
            try {
                kotlinx.coroutines.p2 p2Var = this.f256492e;
                if (p2Var != null) {
                    kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
                }
                this.f256492e = kotlinx.coroutines.k.f(this.f256490c, com.planner5d.library.services.utility.s.f229729a.e(), null, new d(item, null), 2, null);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
