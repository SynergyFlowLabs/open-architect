package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.j;

/* JADX INFO: loaded from: classes2.dex */
public class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f45590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f45591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f45592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f45594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f45595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f45596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f45598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f45600k;

    public c(Context context) {
        super(context);
        this.f45590a = new Paint();
        this.f45591b = new Paint();
        this.f45592c = new Paint();
        this.f45593d = true;
        this.f45594e = true;
        this.f45595f = null;
        this.f45596g = new Rect();
        this.f45597h = Color.argb(255, 0, 0, 0);
        this.f45598i = Color.argb(255, 200, 200, 200);
        this.f45599j = Color.argb(255, 50, 50, 50);
        this.f45600k = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Cc);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.Ec) {
                    this.f45595f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == j.c.Hc) {
                    this.f45593d = typedArrayObtainStyledAttributes.getBoolean(index, this.f45593d);
                } else if (index == j.c.Dc) {
                    this.f45597h = typedArrayObtainStyledAttributes.getColor(index, this.f45597h);
                } else if (index == j.c.Fc) {
                    this.f45599j = typedArrayObtainStyledAttributes.getColor(index, this.f45599j);
                } else if (index == j.c.Gc) {
                    this.f45598i = typedArrayObtainStyledAttributes.getColor(index, this.f45598i);
                } else if (index == j.c.Ic) {
                    this.f45594e = typedArrayObtainStyledAttributes.getBoolean(index, this.f45594e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f45595f == null) {
            try {
                this.f45595f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f45590a.setColor(this.f45597h);
        this.f45590a.setAntiAlias(true);
        this.f45591b.setColor(this.f45598i);
        this.f45591b.setAntiAlias(true);
        this.f45592c.setColor(this.f45599j);
        this.f45600k = Math.round(this.f45600k * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f45593d) {
            width--;
            height--;
            float f10 = width;
            float f11 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f10, f11, this.f45590a);
            canvas2.drawLine(0.0f, f11, f10, 0.0f, this.f45590a);
            canvas2.drawLine(0.0f, 0.0f, f10, 0.0f, this.f45590a);
            canvas2.drawLine(f10, 0.0f, f10, f11, this.f45590a);
            canvas2.drawLine(f10, f11, 0.0f, f11, this.f45590a);
            canvas2.drawLine(0.0f, f11, 0.0f, 0.0f, this.f45590a);
        } else {
            canvas2 = canvas;
        }
        String str = this.f45595f;
        if (str != null && this.f45594e) {
            this.f45591b.getTextBounds(str, 0, str.length(), this.f45596g);
            float fWidth = (width - this.f45596g.width()) / 2.0f;
            float fHeight = ((height - this.f45596g.height()) / 2.0f) + this.f45596g.height();
            this.f45596g.offset((int) fWidth, (int) fHeight);
            Rect rect = this.f45596g;
            int i10 = rect.left;
            int i11 = this.f45600k;
            rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
            canvas2.drawRect(this.f45596g, this.f45592c);
            canvas2.drawText(this.f45595f, fWidth, fHeight, this.f45591b);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45590a = new Paint();
        this.f45591b = new Paint();
        this.f45592c = new Paint();
        this.f45593d = true;
        this.f45594e = true;
        this.f45595f = null;
        this.f45596g = new Rect();
        this.f45597h = Color.argb(255, 0, 0, 0);
        this.f45598i = Color.argb(255, 200, 200, 200);
        this.f45599j = Color.argb(255, 50, 50, 50);
        this.f45600k = 4;
        a(context, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45590a = new Paint();
        this.f45591b = new Paint();
        this.f45592c = new Paint();
        this.f45593d = true;
        this.f45594e = true;
        this.f45595f = null;
        this.f45596g = new Rect();
        this.f45597h = Color.argb(255, 0, 0, 0);
        this.f45598i = Color.argb(255, 200, 200, 200);
        this.f45599j = Color.argb(255, 50, 50, 50);
        this.f45600k = 4;
        a(context, attributeSet);
    }
}
