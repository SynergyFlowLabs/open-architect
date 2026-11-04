package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLayoutIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.android.kt\nandroidx/compose/ui/text/android/LayoutIntrinsics\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1#2:228\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f41392i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f41393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextPaint f41394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f41396d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f41397e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private BoringLayout.Metrics f41398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private CharSequence f41400h;

    public g0(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10) {
        this.f41393a = charSequence;
        this.f41394b = textPaint;
        this.f41395c = i10;
    }

    private final float b() {
        BoringLayout.Metrics metricsE = e();
        float fCeil = metricsE != null ? metricsE.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(h(this, 0, 0, 3, null));
        }
        return h0.e(fCeil, this.f41393a, this.f41394b) ? fCeil + 0.5f : fCeil;
    }

    private final float c() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.f41394b.getTextLocale());
        CharSequence charSequence = this.f41393a;
        int i10 = 0;
        lineInstance.setText(new x(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.f0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g0.d((Pair) obj, (Pair) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Pair pair2 = (Pair) it.next();
        float fG = g(((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue());
        while (it.hasNext()) {
            Pair pair3 = (Pair) it.next();
            fG = Math.max(fG, g(((Number) pair3.component1()).intValue(), ((Number) pair3.component2()).intValue()));
        }
        return fG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
    }

    private final CharSequence f() {
        CharSequence charSequence = this.f41400h;
        if (charSequence != null) {
            Intrinsics.checkNotNull(charSequence);
            return charSequence;
        }
        if (!h0.f41401a) {
            return this.f41393a;
        }
        CharSequence charSequenceF = h0.f(this.f41393a);
        this.f41400h = charSequenceF;
        return charSequenceF;
    }

    private final float g(int i10, int i11) {
        return Layout.getDesiredWidth(f(), i10, i11, this.f41394b);
    }

    static /* synthetic */ float h(g0 g0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = g0Var.f().length();
        }
        return g0Var.g(i10, i11);
    }

    @Nullable
    public final BoringLayout.Metrics e() {
        if (!this.f41399g) {
            this.f41398f = k.f41407a.d(this.f41393a, this.f41394b, h1.k(this.f41395c));
            this.f41399g = true;
        }
        return this.f41398f;
    }

    public final float i() {
        if (!Float.isNaN(this.f41396d)) {
            return this.f41396d;
        }
        float fB = b();
        this.f41396d = fB;
        return fB;
    }

    public final float j() {
        if (!Float.isNaN(this.f41397e)) {
            return this.f41397e;
        }
        float fC = c();
        this.f41397e = fC;
        return fC;
    }
}
