package t0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f376176h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function0<Unit> f376177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private j f376178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f376179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f376180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f376181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f376182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f376183g;

    public d() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    private final void b(Menu menu, b bVar, Function0<Unit> function0) {
        if (function0 != null && menu.findItem(bVar.n()) == null) {
            a(menu, bVar);
        } else {
            if (function0 != null || menu.findItem(bVar.n()) == null) {
                return;
            }
            menu.removeItem(bVar.n());
        }
    }

    public final void a(@NotNull Menu menu, @NotNull b bVar) {
        menu.add(0, bVar.n(), bVar.o(), bVar.p()).setShowAsAction(1);
    }

    @Nullable
    public final Function0<Unit> c() {
        return this.f376177a;
    }

    @Nullable
    public final Function0<Unit> d() {
        return this.f376183g;
    }

    @Nullable
    public final Function0<Unit> e() {
        return this.f376179c;
    }

    @Nullable
    public final Function0<Unit> f() {
        return this.f376181e;
    }

    @Nullable
    public final Function0<Unit> g() {
        return this.f376180d;
    }

    @Nullable
    public final Function0<Unit> h() {
        return this.f376182f;
    }

    @NotNull
    public final j i() {
        return this.f376178b;
    }

    public final boolean j(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        Intrinsics.checkNotNull(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.n()) {
            Function0<Unit> function0 = this.f376179c;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == b.Paste.n()) {
            Function0<Unit> function1 = this.f376180d;
            if (function1 != null) {
                function1.invoke();
            }
        } else if (itemId == b.Cut.n()) {
            Function0<Unit> function2 = this.f376181e;
            if (function2 != null) {
                function2.invoke();
            }
        } else if (itemId == b.SelectAll.n()) {
            Function0<Unit> function3 = this.f376182f;
            if (function3 != null) {
                function3.invoke();
            }
        } else {
            if (itemId != b.Autofill.n()) {
                return false;
            }
            Function0<Unit> function4 = this.f376183g;
            if (function4 != null) {
                function4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final boolean k(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.f376179c != null) {
            a(menu, b.Copy);
        }
        if (this.f376180d != null) {
            a(menu, b.Paste);
        }
        if (this.f376181e != null) {
            a(menu, b.Cut);
        }
        if (this.f376182f != null) {
            a(menu, b.SelectAll);
        }
        if (this.f376183g == null) {
            return true;
        }
        a(menu, b.Autofill);
        return true;
    }

    public final void l() {
        Function0<Unit> function0 = this.f376177a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean m(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (actionMode != null && menu != null) {
            t(menu);
            return true;
        }
        return false;
    }

    public final void n(@Nullable Function0<Unit> function0) {
        this.f376183g = function0;
    }

    public final void o(@Nullable Function0<Unit> function0) {
        this.f376179c = function0;
    }

    public final void p(@Nullable Function0<Unit> function0) {
        this.f376181e = function0;
    }

    public final void q(@Nullable Function0<Unit> function0) {
        this.f376180d = function0;
    }

    public final void r(@Nullable Function0<Unit> function0) {
        this.f376182f = function0;
    }

    public final void s(@NotNull j jVar) {
        this.f376178b = jVar;
    }

    @l1
    public final void t(@NotNull Menu menu) {
        b(menu, b.Copy, this.f376179c);
        b(menu, b.Paste, this.f376180d);
        b(menu, b.Cut, this.f376181e);
        b(menu, b.SelectAll, this.f376182f);
        b(menu, b.Autofill, this.f376183g);
    }

    public d(@Nullable Function0<Unit> function0, @NotNull j jVar, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3, @Nullable Function0<Unit> function4, @Nullable Function0<Unit> function5) {
        this.f376177a = function0;
        this.f376178b = jVar;
        this.f376179c = function1;
        this.f376180d = function2;
        this.f376181e = function3;
        this.f376182f = function4;
        this.f376183g = function5;
    }

    public /* synthetic */ d(Function0 function0, j jVar, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0, (i10 & 2) != 0 ? j.f332705e.a() : jVar, (i10 & 4) != 0 ? null : function1, (i10 & 8) != 0 ? null : function2, (i10 & 16) != 0 ? null : function3, (i10 & 32) != 0 ? null : function4, (i10 & 64) != 0 ? null : function5);
    }
}
