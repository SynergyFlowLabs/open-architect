package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class b extends com.planner5d.library.engine.input.b implements View.OnGenericMotionListener {
    private final ArrayList<View.OnGenericMotionListener> A3;
    private final c B3;

    public b(com.planner5d.library.engine.a aVar, Context context, Object obj, vb.b bVar) {
        super(aVar, context, obj, bVar);
        this.A3 = new ArrayList<>();
        if (obj instanceof View) {
            ((View) obj).setOnGenericMotionListener(this);
        }
        this.B3 = new c();
    }

    public void K(View.OnGenericMotionListener onGenericMotionListener) {
        this.A3.add(onGenericMotionListener);
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (this.B3.a(motionEvent, this)) {
            return true;
        }
        int size = this.A3.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.A3.get(i10).onGenericMotion(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
