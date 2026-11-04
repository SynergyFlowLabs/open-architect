package com.planner5d.library.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes12.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f258295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f258296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f258297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f258298d = null;

    public interface a {
        void a();
    }

    public m(ViewGroup viewGroup, int i10, a aVar) {
        this.f258295a = viewGroup;
        this.f258296b = i10;
        this.f258297c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
        a aVar = this.f258297c;
        if (aVar != null) {
            aVar.a();
        }
        c(false);
        return false;
    }

    public m c(boolean z10) {
        View view = this.f258298d;
        if (view != null) {
            this.f258295a.removeView(view);
            this.f258298d = null;
        }
        if (z10) {
            View view2 = new View(this.f258295a.getContext());
            this.f258298d = view2;
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: com.planner5d.library.widget.l
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    return this.f258225a.b(view3, motionEvent);
                }
            });
            this.f258295a.addView(this.f258298d, this.f258296b);
        }
        return this;
    }
}
