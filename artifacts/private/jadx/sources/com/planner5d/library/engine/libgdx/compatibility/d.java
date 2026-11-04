package com.planner5d.library.engine.libgdx.compatibility;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class d extends com.badlogic.gdx.backends.android.b implements vb.d {
    private final ArrayList<View.OnGenericMotionListener> C3;
    private final com.badlogic.gdx.backends.android.c D3;
    private boolean E3;

    public d(com.planner5d.library.engine.a aVar, Context context, Object obj, vb.b bVar) {
        super(aVar, context, obj, bVar);
        this.C3 = new ArrayList<>();
        this.E3 = true;
        this.D3 = new com.badlogic.gdx.backends.android.c();
    }

    @Override // com.badlogic.gdx.backends.android.b, vb.d
    public void K(View.OnGenericMotionListener onGenericMotionListener) {
        this.C3.add(onGenericMotionListener);
        n(false);
    }

    public void n(boolean z10) {
        this.E3 = z10;
    }

    @Override // com.badlogic.gdx.backends.android.b, android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (this.E3 && this.D3.a(motionEvent, this)) {
            return true;
        }
        int size = this.C3.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.C3.get(i10).onGenericMotion(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
