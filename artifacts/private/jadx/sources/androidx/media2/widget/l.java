package androidx.media2.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class l extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f59996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f59997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f59998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f59999d;

    private enum a {
        WITH_TITLE_LANDSCAPE,
        WITH_TITLE_PORTRAIT,
        WITHOUT_TITLE
    }

    l(@NonNull Context context) {
        super(context);
        this.f59996a = a.WITHOUT_TITLE;
        b();
    }

    private static boolean a(@NonNull View view) {
        return ((view.getMeasuredHeightAndState() & 16777216) | (view.getMeasuredWidthAndState() & 16777216)) != 0;
    }

    private void b() {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f59997b = layoutInflater.inflate(n.g.f60109e, (ViewGroup) null);
        this.f59998c = layoutInflater.inflate(n.g.f60110f, (ViewGroup) null);
        this.f59999d = layoutInflater.inflate(n.g.f60111g, (ViewGroup) null);
        addView(this.f59997b);
        addView(this.f59998c);
        addView(this.f59999d);
    }

    void c(Drawable drawable) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ImageView imageView = (ImageView) getChildAt(i10).findViewById(n.f.f60084f);
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
    }

    void d(String str) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            TextView textView = (TextView) getChildAt(i10).findViewById(n.f.f60085g);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    void e(String str) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            TextView textView = (TextView) getChildAt(i10).findViewById(n.f.P);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a aVar = this.f59996a;
        View view = aVar == a.WITH_TITLE_LANDSCAPE ? this.f59997b : aVar == a.WITH_TITLE_PORTRAIT ? this.f59998c : this.f59999d;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt == view) {
                childAt.setVisibility(0);
            } else {
                childAt.setVisibility(4);
            }
        }
        int i15 = i12 - i10;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i16 = (i15 - measuredWidth) / 2;
        int i17 = ((i13 - i11) - measuredHeight) / 2;
        view.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824 || View.MeasureSpec.getMode(i11) != 1073741824) {
            throw new AssertionError("MusicView should be measured in MeasureSpec.EXACTLY");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size > size2) {
            this.f59996a = a.WITH_TITLE_LANDSCAPE;
            this.f59997b.measure(View.MeasureSpec.makeMeasureSpec(size, 0), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            if (a(this.f59997b) || this.f59997b.getMeasuredWidth() > size) {
                this.f59996a = a.WITHOUT_TITLE;
            }
        } else {
            this.f59996a = a.WITH_TITLE_PORTRAIT;
            this.f59998c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
            if (a(this.f59998c) || this.f59998c.getMeasuredHeight() > size2) {
                this.f59996a = a.WITHOUT_TITLE;
            }
        }
        if (this.f59996a == a.WITHOUT_TITLE) {
            this.f59999d.measure(View.MeasureSpec.makeMeasureSpec(size / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 / 2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
