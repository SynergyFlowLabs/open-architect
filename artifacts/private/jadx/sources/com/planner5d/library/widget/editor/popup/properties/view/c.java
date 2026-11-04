package com.planner5d.library.widget.editor.popup.properties.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.subjects.PublishSubject;

/* JADX INFO: loaded from: classes8.dex */
public class c extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f257982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PublishSubject<com.planner5d.library.model.b> f257983b;

    private static class a extends Drawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.planner5d.library.model.b> f257984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Rect> f257985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Paint f257986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final RectF f257987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f257988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f257989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f257990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f257991h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f257992i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Point f257993j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f257994k;

        /* JADX INFO: Access modifiers changed from: private */
        public com.planner5d.library.model.b b(int i10, int i11) {
            for (int i12 = 0; i12 < this.f257985b.size(); i12++) {
                if (this.f257985b.get(i12).contains(i10, i11)) {
                    return this.f257984a.get(i12);
                }
            }
            return null;
        }

        private void c() {
            this.f257985b.clear();
            Rect bounds = getBounds();
            int i10 = bounds.left;
            for (com.planner5d.library.model.b bVar : this.f257984a) {
                List<Rect> list = this.f257985b;
                int i11 = bounds.top;
                Point point = this.f257993j;
                list.add(new Rect(i10, i11, point.x + i10, point.y + i11));
                i10 += this.f257993j.x + this.f257989f;
            }
        }

        public void d(List<com.planner5d.library.model.b> list) {
            this.f257984a.clear();
            for (com.planner5d.library.model.b bVar : list) {
                if (this.f257984a.size() < 5) {
                    this.f257984a.add(bVar);
                }
            }
            c();
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            Rect bounds = getBounds();
            if (this.f257984a.isEmpty()) {
                this.f257986c.setTextSize(this.f257988e);
                this.f257986c.setColor(this.f257992i);
                canvas.drawText(this.f257994k, bounds.left, bounds.centerY() + (this.f257988e / 2), this.f257986c);
                return;
            }
            this.f257986c.setStrokeWidth(this.f257991h);
            int i10 = 7 | 0;
            for (int i11 = 0; i11 < this.f257984a.size(); i11++) {
                this.f257987d.set(this.f257985b.get(i11));
                this.f257986c.setColor(this.f257984a.get(i11).a());
                this.f257986c.setStyle(Paint.Style.FILL_AND_STROKE);
                RectF rectF = this.f257987d;
                int i12 = this.f257990g;
                canvas.drawRoundRect(rectF, i12, i12, this.f257986c);
                this.f257986c.setColor(570425344);
                this.f257986c.setStyle(Paint.Style.STROKE);
                RectF rectF2 = this.f257987d;
                int i13 = this.f257990g;
                canvas.drawRoundRect(rectF2, i13, i13, this.f257986c);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13);
            c();
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@p0 ColorFilter colorFilter) {
        }

        private a(Context context, String str) {
            this.f257984a = new LinkedList();
            this.f257985b = new LinkedList();
            Paint paint = new Paint(1);
            this.f257986c = paint;
            this.f257987d = new RectF();
            Point point = new Point();
            this.f257993j = point;
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.planner5d.library.f.g.T3);
            this.f257988e = dimensionPixelSize;
            this.f257989f = resources.getDimensionPixelSize(com.planner5d.library.f.g.Lh);
            this.f257990g = resources.getDimensionPixelSize(com.planner5d.library.f.g.Xg);
            this.f257991h = resources.getDimensionPixelSize(com.planner5d.library.f.g.Mg);
            this.f257992i = androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.G5);
            point.set(resources.getDimensionPixelSize(com.planner5d.library.f.g.Ch), resources.getDimensionPixelSize(com.planner5d.library.f.g.Ch));
            paint.setStyle(Paint.Style.FILL);
            paint.setTypeface(androidx.core.content.res.i.j(context, com.planner5d.library.f.i.f167926e));
            paint.setTextSize(dimensionPixelSize);
            this.f257994k = str;
        }
    }

    public c(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        setCompoundDrawables(null, null, null, this.f257982a);
    }

    public Observable<com.planner5d.library.model.b> j() {
        return this.f257983b;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
        if (this.f257982a.getBounds().width() != paddingLeft) {
            this.f257982a.setBounds(0, 0, paddingLeft, getResources().getDimensionPixelSize(com.planner5d.library.f.g.Ch) + getResources().getDimensionPixelSize(com.planner5d.library.f.g.Mg));
            post(new Runnable() { // from class: com.planner5d.library.widget.editor.popup.properties.view.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f257981a.k();
                }
            });
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.planner5d.library.model.b bVarB;
        if (motionEvent.getActionMasked() != 0 || (bVarB = this.f257982a.b(((int) motionEvent.getX()) - getCompoundPaddingLeft(), ((int) motionEvent.getY()) - (getHeight() - this.f257982a.getBounds().height()))) == null) {
            return super.onTouchEvent(motionEvent);
        }
        this.f257983b.onNext(bVarB);
        return true;
    }

    public void setColors(List<com.planner5d.library.model.b> list) {
        this.f257982a.d(list);
    }

    public void setTitle(String str) {
        setText(str);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f257983b = PublishSubject.create();
        this.f257982a = new a(context, context.getString(com.planner5d.library.f.s.U7));
        setTextColor(androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.f166585oh));
        setTextSize(0, getResources().getDimensionPixelSize(com.planner5d.library.f.g.K3));
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(com.planner5d.library.f.g.Lh));
    }
}
