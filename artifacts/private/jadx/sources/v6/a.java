package v6;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Dialog f381338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f381339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f381340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f381341d;

    public a(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f381338a = dialog;
        this.f381339b = rect.left;
        this.f381340c = rect.top;
        this.f381341d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f381339b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f381340c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f381338a.onTouchEvent(motionEventObtain);
    }
}
