package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 {

    public static final class a implements Sequence<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f48453a;

        a(ViewGroup viewGroup) {
            this.f48453a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<View> iterator() {
            return a2.k(this.f48453a);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<View, Iterator<? extends View>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48454a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(View view) {
            Sequence<View> sequenceE;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (sequenceE = a2.e(viewGroup)) == null) {
                return null;
            }
            return sequenceE.iterator();
        }
    }

    public static final class c implements Iterator<View>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f48456b;

        c(ViewGroup viewGroup) {
            this.f48456b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f48456b;
            int i10 = this.f48455a;
            this.f48455a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48455a < this.f48456b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f48456b;
            int i10 = this.f48455a - 1;
            this.f48455a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,680:1\n134#2:681\n*E\n"})
    public static final class d implements Sequence<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f48457a;

        public d(ViewGroup viewGroup) {
            this.f48457a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        @NotNull
        public Iterator<View> iterator() {
            return new q1(a2.e(this.f48457a).iterator(), b.f48454a);
        }
    }

    public static final boolean a(@NotNull ViewGroup viewGroup, @NotNull View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void b(@NotNull ViewGroup viewGroup, @NotNull Function1<? super View, Unit> function1) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            function1.invoke(viewGroup.getChildAt(i10));
        }
    }

    public static final void c(@NotNull ViewGroup viewGroup, @NotNull Function2<? super Integer, ? super View, Unit> function2) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            function2.invoke(Integer.valueOf(i10), viewGroup.getChildAt(i10));
        }
    }

    @NotNull
    public static final View d(@NotNull ViewGroup viewGroup, int i10) {
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + viewGroup.getChildCount());
    }

    @NotNull
    public static final Sequence<View> e(@NotNull ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @NotNull
    public static final Sequence<View> f(@NotNull ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    @NotNull
    public static final IntRange g(@NotNull ViewGroup viewGroup) {
        return kotlin.ranges.r.W1(0, viewGroup.getChildCount());
    }

    public static final int h(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean i(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean j(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    @NotNull
    public static final Iterator<View> k(@NotNull ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    public static final void l(@NotNull ViewGroup viewGroup, @NotNull View view) {
        viewGroup.removeView(view);
    }

    public static final void m(@NotNull ViewGroup viewGroup, @NotNull View view) {
        viewGroup.addView(view);
    }

    public static final void n(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.t0 int i10) {
        marginLayoutParams.setMargins(i10, i10, i10, i10);
    }

    public static final void o(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.leftMargin;
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.rightMargin;
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static final void q(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }

    public static /* synthetic */ void r(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.getMarginStart();
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.getMarginEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }
}
