package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.l1;
import androidx.compose.foundation.s3;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@l1
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidTextContextMenuToolbarProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,495:1\n1#2:496\n*E\n"})
public final class k implements androidx.compose.foundation.text.contextmenu.provider.k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18879j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f18880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Function1<m0, m0> f18881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<androidx.compose.ui.layout.g0> f18882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final s3 f18883d = new s3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.snapshots.q0 f18884e = new androidx.compose.runtime.snapshots.q0(new Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return k.E(this.f18856a, (Function0) obj);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<Object, Unit> f18885f = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.f
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return k.C(this.f18858a, obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function1<Object, Unit> f18886g = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.g
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return k.D(this.f18864a, obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private ActionMode f18887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Runnable f18888i;

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension({"SMAP\nAndroidTextContextMenuToolbarProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$TextActionModeCallbackImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,495:1\n35#2,5:496\n1#3:501\n*S KotlinDebug\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$TextActionModeCallbackImpl\n*L\n274#1:496,5\n*E\n"})
    static final class a implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b0.g f18889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function0<b0.c> f18890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Function0<n0.j> f18891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final View f18892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private b0.c f18893e;

        public a(@NotNull b0.g gVar, @NotNull Function0<b0.c> function0, @NotNull Function0<n0.j> function1, @NotNull View view) {
            this.f18889a = gVar;
            this.f18890b = function0;
            this.f18891c = function1;
            this.f18892d = view;
        }

        private final boolean c(Menu menu) {
            b0.c cVarInvoke = this.f18890b.invoke();
            if (Intrinsics.areEqual(cVarInvoke, this.f18893e)) {
                return false;
            }
            menu.clear();
            List<b0.b> listB = cVarInvoke.b();
            int size = listB.size();
            int i10 = 1;
            int i11 = 1;
            for (int i12 = 0; i12 < size; i12++) {
                final b0.b bVar = listB.get(i12);
                if (bVar instanceof b0.d) {
                    int i13 = i10 + 1;
                    MenuItem menuItemAdd = menu.add(i11, i10, i10, ((b0.d) bVar).b());
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.j
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return k.a.d(bVar, this, menuItem);
                        }
                    });
                    i10 = i13;
                } else if (bVar instanceof b0.h) {
                    b0.h hVar = (b0.h) bVar;
                    d1.f18855a.e(menu, i10, this.f18892d.getContext(), hVar.c(), hVar.b());
                    i10++;
                } else if (bVar instanceof b0.f) {
                    i11++;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(b0.b bVar, a aVar, MenuItem menuItem) {
            ((b0.d) bVar).d().invoke(aVar.f18889a);
            return true;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.m0
        @NotNull
        public n0.j a(@NotNull ActionMode actionMode, @Nullable View view) {
            return this.f18891c.invoke();
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.m0
        public boolean onActionItemClicked(@NotNull ActionMode actionMode, @NotNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.m0
        public boolean onCreateActionMode(@NotNull ActionMode actionMode, @NotNull Menu menu) {
            c(menu);
            return menu.size() > 0;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.m0
        public void onDestroyActionMode(@NotNull ActionMode actionMode) {
            this.f18889a.close();
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.m0
        public boolean onPrepareActionMode(@NotNull ActionMode actionMode, @NotNull Menu menu) {
            return c(menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements b0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.channels.p<Unit> f18894a = kotlinx.coroutines.channels.s.d(0, null, null, 7, null);

        @Nullable
        public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objJ = this.f18894a.j(dVar);
            return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
        }

        @Override // b0.g
        public void close() {
            this.f18894a.p(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAndroidTextContextMenuToolbarProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,495:1\n1#2:496\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18895a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.j f18897c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.text.contextmenu.provider.j jVar, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f18897c = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(k kVar, m0 m0Var, b bVar) {
            ActionMode actionModeB = z0.f18971a.b(kVar.f18880a, m0Var);
            Intrinsics.areEqual(kVar.f18887h, actionModeB);
            if (actionModeB == null) {
                bVar.close();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return k.this.new c(this.f18897c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f18895a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    final b bVar = new b();
                    final m0 m0VarS = k.this.s(bVar, this.f18897c);
                    Looper looperMyLooper = Looper.myLooper();
                    Handler handler = k.this.f18880a.getHandler();
                    if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnable = k.this.f18888i;
                        if (runnable == null) {
                            final k kVar = k.this;
                            Runnable runnable2 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    k.c.m(kVar, m0VarS, bVar);
                                }
                            };
                            k.this.f18888i = runnable2;
                            runnable = runnable2;
                        }
                        kotlin.coroutines.jvm.internal.b.a(k.this.f18880a.post(runnable));
                    } else {
                        k kVar2 = k.this;
                        ActionMode actionModeB = z0.f18971a.b(kVar2.f18880a, m0VarS);
                        if (actionModeB == null) {
                            return Unit.f312394a;
                        }
                        kVar2.f18887h = actionModeB;
                    }
                    this.f18895a = 1;
                    if (bVar.a(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                k.this.f18884e.f();
                ActionMode actionMode = k.this.f18887h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                Runnable runnable3 = k.this.f18888i;
                if (runnable3 != null) {
                    kotlin.coroutines.jvm.internal.b.a(k.this.f18880a.removeCallbacks(runnable3));
                }
                k.this.f18887h = null;
                return Unit.f312394a;
            } catch (Throwable th2) {
                k.this.f18884e.f();
                ActionMode actionMode2 = k.this.f18887h;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
                Runnable runnable4 = k.this.f18888i;
                if (runnable4 != null) {
                    kotlin.coroutines.jvm.internal.b.a(k.this.f18880a.removeCallbacks(runnable4));
                }
                k.this.f18887h = null;
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull View view, @Nullable Function1<? super m0, ? extends m0> function1, @NotNull Function0<? extends androidx.compose.ui.layout.g0> function0) {
        this.f18880a = view;
        this.f18881b = function1;
        this.f18882c = function0;
    }

    private final <T, S> T A(S s10, Function1<? super S, Unit> function1, final Function0<? extends T> function0) {
        final i1.h hVar = new i1.h();
        this.f18884e.m(s10, function1, new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.B(hVar, function0);
            }
        });
        T t10 = hVar.f312751a;
        if (t10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
            t10 = (T) Unit.f312394a;
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    public static final Unit B(i1.h hVar, Function0 function0) {
        hVar.f312751a = function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(k kVar, Object obj) {
        ActionMode actionMode = kVar.f18887h;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(k kVar, Object obj) {
        ActionMode actionMode = kVar.f18887h;
        if (actionMode != null) {
            z0.f18971a.a(actionMode);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(k kVar, final Function0 function0) {
        Handler handler = kVar.f18880a.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            function0.invoke();
        } else {
            Handler handler2 = kVar.f18880a.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.F(function0);
                    }
                });
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(Function0 function0) {
        function0.invoke();
    }

    private final n0.j r(androidx.compose.foundation.text.contextmenu.provider.j jVar) {
        androidx.compose.ui.layout.g0 g0VarInvoke = this.f18882c.invoke();
        return jVar.h8(g0VarInvoke).T(androidx.compose.ui.layout.h0.f(g0VarInvoke));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m0 s(b bVar, final androidx.compose.foundation.text.contextmenu.provider.j jVar) {
        m0 m0VarInvoke;
        a aVar = new a(bVar, new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.t(this.f18836a, jVar);
            }
        }, new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.u(this.f18841a, jVar);
            }
        }, this.f18880a);
        Function1<m0, m0> function1 = this.f18881b;
        return (function1 == null || (m0VarInvoke = function1.invoke(aVar)) == null) ? aVar : m0VarInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0.c t(k kVar, androidx.compose.foundation.text.contextmenu.provider.j jVar) {
        return kVar.y(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j u(k kVar, androidx.compose.foundation.text.contextmenu.provider.j jVar) {
        return kVar.w(jVar);
    }

    private final n0.j w(final androidx.compose.foundation.text.contextmenu.provider.j jVar) {
        return (n0.j) A("positioner", this.f18886g, new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.x(this.f18866a, jVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j x(k kVar, androidx.compose.foundation.text.contextmenu.provider.j jVar) {
        return kVar.r(jVar);
    }

    private final b0.c y(final androidx.compose.foundation.text.contextmenu.provider.j jVar) {
        return (b0.c) A("dataBuilder", this.f18885f, new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.z(jVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0.c z(androidx.compose.foundation.text.contextmenu.provider.j jVar) {
        return jVar.K();
    }

    public final void G() {
        this.f18884e.t();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.k
    @Nullable
    public Object a(@NotNull androidx.compose.foundation.text.contextmenu.provider.j jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        boolean z10 = true | false;
        Object objE = s3.e(this.f18883d, null, new c(jVar, null), dVar, 1, null);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    public final void v() {
        this.f18884e.u();
        this.f18884e.f();
        ActionMode actionMode = this.f18887h;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f18887h = null;
    }
}
