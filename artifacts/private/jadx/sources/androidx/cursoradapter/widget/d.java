package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
public class d extends c {
    String[] X;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected int[] f49181o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected int[] f49182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f49183t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a f49184v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b f49185w;

    public interface a {
        CharSequence convertToString(Cursor cursor);
    }

    public interface b {
        boolean setViewValue(View view, Cursor cursor, int i10);
    }

    @Deprecated
    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i10, cursor);
        this.f49183t = -1;
        this.f49182s = iArr;
        this.X = strArr;
        p(cursor, strArr);
    }

    private void p(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f49181o = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f49181o;
        if (iArr == null || iArr.length != length) {
            this.f49181o = new int[length];
        }
        for (int i10 = 0; i10 < length; i10++) {
            this.f49181o[i10] = cursor.getColumnIndexOrThrow(strArr[i10]);
        }
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence convertToString(Cursor cursor) {
        a aVar = this.f49184v;
        if (aVar != null) {
            return aVar.convertToString(cursor);
        }
        int i10 = this.f49183t;
        return i10 > -1 ? cursor.getString(i10) : super.convertToString(cursor);
    }

    @Override // androidx.cursoradapter.widget.a
    public void d(View view, Context context, Cursor cursor) {
        b bVar = this.f49185w;
        int[] iArr = this.f49182s;
        int length = iArr.length;
        int[] iArr2 = this.f49181o;
        for (int i10 = 0; i10 < length; i10++) {
            View viewFindViewById = view.findViewById(iArr[i10]);
            if (viewFindViewById != null) {
                if (bVar != null ? bVar.setViewValue(viewFindViewById, cursor, iArr2[i10]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i10]);
                    if (string == null) {
                        string = "";
                    }
                    if (viewFindViewById instanceof TextView) {
                        x((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                        }
                        w((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    @Override // androidx.cursoradapter.widget.a
    public Cursor l(Cursor cursor) {
        p(cursor, this.X);
        return super.l(cursor);
    }

    public void o(Cursor cursor, String[] strArr, int[] iArr) {
        this.X = strArr;
        this.f49182s = iArr;
        p(cursor, strArr);
        super.a(cursor);
    }

    public a q() {
        return this.f49184v;
    }

    public int r() {
        return this.f49183t;
    }

    public b s() {
        return this.f49185w;
    }

    public void t(a aVar) {
        this.f49184v = aVar;
    }

    public void u(int i10) {
        this.f49183t = i10;
    }

    public void v(b bVar) {
        this.f49185w = bVar;
    }

    public void w(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void x(TextView textView, String str) {
        textView.setText(str);
    }

    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr, int i11) {
        super(context, i10, cursor, i11);
        this.f49183t = -1;
        this.f49182s = iArr;
        this.X = strArr;
        p(cursor, strArr);
    }
}
