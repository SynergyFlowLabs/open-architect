package androidx.recyclerview.widget;

import android.view.View;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f74531j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f74532k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f74533l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f74534m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f74535n = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f74537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f74538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f74539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f74540e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f74543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f74544i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f74536a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f74541f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f74542g = 0;

    r() {
    }

    boolean a(RecyclerView.c0 c0Var) {
        int i10 = this.f74538c;
        return i10 >= 0 && i10 < c0Var.d();
    }

    View b(RecyclerView.x xVar) {
        View viewP = xVar.p(this.f74538c);
        this.f74538c += this.f74539d;
        return viewP;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f74537b + ", mCurrentPosition=" + this.f74538c + ", mItemDirection=" + this.f74539d + ", mLayoutDirection=" + this.f74540e + ", mStartLine=" + this.f74541f + ", mEndLine=" + this.f74542g + AbstractJsonLexerKt.END_OBJ;
    }
}
