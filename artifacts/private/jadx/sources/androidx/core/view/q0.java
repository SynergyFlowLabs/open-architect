package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class q0 {

    public static final class a implements Sequence<MenuItem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f48905a;

        a(Menu menu) {
            this.f48905a = menu;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<MenuItem> iterator() {
            return q0.i(this.f48905a);
        }
    }

    @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n87#2:96\n1#3:97\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n78#1:96\n78#1:97\n*E\n"})
    public static final class b implements Iterator<MenuItem>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Menu f48907b;

        b(Menu menu) {
            this.f48907b = menu;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f48907b;
            int i10 = this.f48906a;
            this.f48906a = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48906a < this.f48907b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Unit unit;
            Menu menu = this.f48907b;
            int i10 = this.f48906a - 1;
            this.f48906a = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                menu.removeItem(item.getItemId());
                unit = Unit.f312394a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final boolean a(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Intrinsics.areEqual(menu.getItem(i10), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@NotNull Menu menu, @NotNull Function1<? super MenuItem, Unit> function1) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            function1.invoke(menu.getItem(i10));
        }
    }

    public static final void c(@NotNull Menu menu, @NotNull Function2<? super Integer, ? super MenuItem, Unit> function2) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(i10), menu.getItem(i10));
        }
    }

    @NotNull
    public static final MenuItem d(@NotNull Menu menu, int i10) {
        return menu.getItem(i10);
    }

    @NotNull
    public static final Sequence<MenuItem> e(@NotNull Menu menu) {
        return new a(menu);
    }

    public static final int f(@NotNull Menu menu) {
        return menu.size();
    }

    public static final boolean g(@NotNull Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean h(@NotNull Menu menu) {
        return menu.size() != 0;
    }

    @NotNull
    public static final Iterator<MenuItem> i(@NotNull Menu menu) {
        return new b(menu);
    }

    public static final void j(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void k(@NotNull Menu menu, int i10) {
        Unit unit;
        MenuItem item = menu.getItem(i10);
        if (item != null) {
            menu.removeItem(item.getItemId());
            unit = Unit.f312394a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
