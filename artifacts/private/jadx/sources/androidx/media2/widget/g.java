package androidx.media2.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class g extends q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f59809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f59810b;

    class a extends h implements f.j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C0561a f59811g;

        /* JADX INFO: renamed from: androidx.media2.widget.g$a$a, reason: collision with other inner class name */
        class C0561a implements Handler.Callback {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final String f59813h = "CCHandler";

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final boolean f59814i = false;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final int f59815j = 100;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final int f59816k = 8;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static final int f59817l = 255;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final int f59818m = 1;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final int f59819n = 2;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static final long f59820o = 60000;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f59821a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private d f59823c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f59822b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final d[] f59824d = new d[8];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final ArrayList<f.c> f59825e = new ArrayList<>();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Handler f59826f = new Handler(this);

            C0561a(b bVar) {
                this.f59821a = bVar;
            }

            private void a(int i10) {
                if (i10 != 0) {
                    Iterator<d> it = g(i10).iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
            }

            private void b(f.g gVar) {
                int i10;
                if (gVar != null && (i10 = gVar.f59739a) >= 0) {
                    d[] dVarArr = this.f59824d;
                    if (i10 < dVarArr.length) {
                        d dVar = dVarArr[i10];
                        if (dVar == null) {
                            dVar = new d(a.this, this.f59821a.getContext());
                        }
                        dVar.g(this.f59821a, gVar);
                        this.f59824d[i10] = dVar;
                        this.f59823c = dVar;
                    }
                }
            }

            private void c(int i10) {
                if (i10 >= 0 && i10 <= 255) {
                    this.f59822b = true;
                    Handler handler = this.f59826f;
                    handler.sendMessageDelayed(handler.obtainMessage(1), i10 * 100);
                }
            }

            private void d() {
                this.f59822b = false;
                j();
            }

            private void e(int i10) {
                if (i10 == 0) {
                    return;
                }
                for (d dVar : g(i10)) {
                    dVar.h();
                    this.f59824d[dVar.d()] = null;
                }
            }

            private void f(int i10) {
                if (i10 == 0) {
                    return;
                }
                Iterator<d> it = g(i10).iterator();
                while (it.hasNext()) {
                    it.next().t();
                }
            }

            private ArrayList<d> g(int i10) {
                d dVar;
                ArrayList<d> arrayList = new ArrayList<>();
                for (int i11 = 0; i11 < 8; i11++) {
                    if (((1 << i11) & i10) != 0 && (dVar = this.f59824d[i11]) != null) {
                        arrayList.add(dVar);
                    }
                }
                return arrayList;
            }

            private void h(int i10) {
                if (i10 == 0) {
                    return;
                }
                Iterator<d> it = g(i10).iterator();
                while (it.hasNext()) {
                    it.next().f();
                }
            }

            private void j() {
                Iterator<f.c> it = this.f59825e.iterator();
                while (it.hasNext()) {
                    i(it.next());
                }
                this.f59825e.clear();
            }

            private void l(String str) {
                d dVar = this.f59823c;
                if (dVar != null) {
                    dVar.i(str);
                    this.f59826f.removeMessages(2);
                    Handler handler = this.f59826f;
                    handler.sendMessageDelayed(handler.obtainMessage(2), 60000L);
                }
            }

            private void m(char c10) {
                d dVar = this.f59823c;
                if (dVar != null) {
                    dVar.j(c10);
                }
            }

            private void n(int i10) {
                d dVar;
                if (i10 >= 0) {
                    d[] dVarArr = this.f59824d;
                    if (i10 < dVarArr.length && (dVar = dVarArr[i10]) != null) {
                        this.f59823c = dVar;
                    }
                }
            }

            private void o(f.d dVar) {
                d dVar2 = this.f59823c;
                if (dVar2 != null) {
                    dVar2.n(dVar);
                }
            }

            private void p(f.e eVar) {
                d dVar = this.f59823c;
                if (dVar != null) {
                    dVar.o(eVar);
                }
            }

            private void q(f.C0560f c0560f) {
                d dVar = this.f59823c;
                if (dVar != null) {
                    dVar.p(c0560f.f59737a, c0560f.f59738b);
                }
            }

            private void r(f.h hVar) {
                d dVar = this.f59823c;
                if (dVar != null) {
                    dVar.s(hVar);
                }
            }

            private void s(int i10) {
                if (i10 != 0) {
                    for (d dVar : g(i10)) {
                        if (dVar.isShown()) {
                            dVar.f();
                        } else {
                            dVar.t();
                        }
                    }
                }
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 1) {
                    d();
                    return true;
                }
                if (i10 != 2) {
                    return false;
                }
                a(255);
                return true;
            }

            public void i(f.c cVar) {
                if (this.f59822b) {
                    this.f59825e.add(cVar);
                }
                switch (cVar.f59719a) {
                    case 1:
                        l((String) cVar.f59720b);
                        break;
                    case 2:
                        m(((Character) cVar.f59720b).charValue());
                        break;
                    case 3:
                        n(((Integer) cVar.f59720b).intValue());
                        break;
                    case 4:
                        a(((Integer) cVar.f59720b).intValue());
                        break;
                    case 5:
                        f(((Integer) cVar.f59720b).intValue());
                        break;
                    case 6:
                        h(((Integer) cVar.f59720b).intValue());
                        break;
                    case 7:
                        s(((Integer) cVar.f59720b).intValue());
                        break;
                    case 8:
                        e(((Integer) cVar.f59720b).intValue());
                        break;
                    case 9:
                        c(((Integer) cVar.f59720b).intValue());
                        break;
                    case 10:
                        d();
                        break;
                    case 11:
                        k();
                        break;
                    case 12:
                        o((f.d) cVar.f59720b);
                        break;
                    case 13:
                        p((f.e) cVar.f59720b);
                        break;
                    case 14:
                        q((f.C0560f) cVar.f59720b);
                        break;
                    case 15:
                        r((f.h) cVar.f59720b);
                        break;
                    case 16:
                        b((f.g) cVar.f59720b);
                        break;
                }
            }

            public void k() {
                this.f59823c = null;
                this.f59822b = false;
                this.f59825e.clear();
                for (int i10 = 0; i10 < 8; i10++) {
                    d dVar = this.f59824d[i10];
                    if (dVar != null) {
                        dVar.h();
                    }
                    this.f59824d[i10] = null;
                }
                this.f59821a.setVisibility(4);
                this.f59826f.removeMessages(2);
            }
        }

        class b extends e implements h.b {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final float f59828h = 0.1f;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final float f59829i = 0.9f;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final float f59830j = 0.1f;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final float f59831k = 0.9f;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final e f59832f;

            b(Context context) {
                super(context);
                e eVar = a.this.new e(context);
                this.f59832f = eVar;
                addView(eVar, new e.b(0.1f, 0.9f, 0.1f, 0.9f));
            }

            @Override // androidx.media2.widget.h.b
            public void a(androidx.media2.widget.b bVar) {
                int childCount = this.f59832f.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    ((d) this.f59832f.getChildAt(i10)).k(bVar);
                }
            }

            @Override // androidx.media2.widget.h.b
            public void b(float f10) {
                int childCount = this.f59832f.getChildCount();
                boolean z10 = true | false;
                for (int i10 = 0; i10 < childCount; i10++) {
                    ((d) this.f59832f.getChildAt(i10)).m(f10);
                }
            }

            public void c(d dVar, e.b bVar) {
                if (this.f59832f.indexOfChild(dVar) < 0) {
                    this.f59832f.addView(dVar, bVar);
                } else {
                    this.f59832f.updateViewLayout(dVar, bVar);
                }
            }

            public void d(d dVar) {
                this.f59832f.removeView(dVar);
            }
        }

        class c extends s {
            c(a aVar, Context context) {
                this(aVar, context, null);
            }

            void j(androidx.media2.widget.b bVar) {
                if (bVar.f()) {
                    e(bVar.f59597a);
                }
                if (bVar.b()) {
                    setBackgroundColor(bVar.f59598b);
                }
                if (bVar.e()) {
                    d(bVar.f59599c);
                }
                if (bVar.d()) {
                    c(bVar.f59600d);
                }
                i(bVar.a());
            }

            c(a aVar, Context context, AttributeSet attributeSet) {
                this(context, attributeSet, 0);
            }

            c(Context context, AttributeSet attributeSet, int i10) {
                super(context, attributeSet, i10);
            }
        }

        private class d extends RelativeLayout implements View.OnLayoutChangeListener {
            private static final int H1 = 3;

            /* JADX INFO: renamed from: g3, reason: collision with root package name */
            private static final int f59834g3 = 1;

            /* JADX INFO: renamed from: h3, reason: collision with root package name */
            private static final int f59835h3 = 2;

            /* JADX INFO: renamed from: i3, reason: collision with root package name */
            private static final int f59836i3 = 0;

            /* JADX INFO: renamed from: j3, reason: collision with root package name */
            private static final int f59837j3 = 1;

            /* JADX INFO: renamed from: k3, reason: collision with root package name */
            private static final int f59838k3 = 2;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static final String f59839o = "CCWindowLayout";

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            private static final int f59840p0 = 209;

            /* JADX INFO: renamed from: p1, reason: collision with root package name */
            private static final int f59841p1 = 42;

            /* JADX INFO: renamed from: p2, reason: collision with root package name */
            private static final int f59842p2 = 0;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private static final float f59843s = 0.75f;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private static final float f59844t = 1.25f;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private static final int f59845v = 99;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private static final int f59846w = 74;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private b f59847a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private c f59848b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private androidx.media2.widget.b f59849c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f59850d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final SpannableStringBuilder f59851e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final List<CharacterStyle> f59852f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f59853g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f59854h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private float f59855i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private float f59856j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private String f59857k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f59858l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f59859m;

            d(a aVar, Context context) {
                this(aVar, context, null);
            }

            private int e() {
                return 42;
            }

            private void u(String str, boolean z10) {
                if (!z10) {
                    this.f59851e.clear();
                }
                if (str != null && str.length() > 0) {
                    int length = this.f59851e.length();
                    this.f59851e.append((CharSequence) str);
                    for (CharacterStyle characterStyle : this.f59852f) {
                        SpannableStringBuilder spannableStringBuilder = this.f59851e;
                        spannableStringBuilder.setSpan(characterStyle, length, spannableStringBuilder.length(), 33);
                    }
                }
                String[] strArrSplit = TextUtils.split(this.f59851e.toString(), "\n");
                String strJoin = TextUtils.join("\n", Arrays.copyOfRange(strArrSplit, Math.max(0, strArrSplit.length - (this.f59850d + 1)), strArrSplit.length));
                SpannableStringBuilder spannableStringBuilder2 = this.f59851e;
                spannableStringBuilder2.delete(0, spannableStringBuilder2.length() - strJoin.length());
                int length2 = this.f59851e.length();
                int i10 = length2 - 1;
                int i11 = 0;
                while (i11 <= i10 && this.f59851e.charAt(i11) <= ' ') {
                    i11++;
                }
                int i12 = i10;
                while (i12 >= i11 && this.f59851e.charAt(i12) <= ' ') {
                    i12--;
                }
                if (i11 == 0 && i12 == i10) {
                    this.f59848b.g(this.f59851e);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                spannableStringBuilder3.append((CharSequence) this.f59851e);
                if (i12 < i10) {
                    spannableStringBuilder3.delete(i12 + 1, length2);
                }
                if (i11 > 0) {
                    spannableStringBuilder3.delete(0, i11);
                }
                this.f59848b.g(spannableStringBuilder3);
            }

            private void v() {
                if (this.f59847a == null) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                int iE = e();
                for (int i10 = 0; i10 < iE; i10++) {
                    sb2.append(this.f59857k);
                }
                String string = sb2.toString();
                Paint paint = new Paint();
                paint.setTypeface(this.f59849c.a());
                float f10 = 0.0f;
                float f11 = 255.0f;
                while (f10 < f11) {
                    float f12 = (f10 + f11) / 2.0f;
                    paint.setTextSize(f12);
                    if (this.f59847a.getWidth() * 0.8f > paint.measureText(string)) {
                        f10 = f12 + 0.01f;
                    } else {
                        f11 = f12 - 0.01f;
                    }
                }
                float f13 = f11 * this.f59855i;
                this.f59856j = f13;
                this.f59848b.h(f13);
            }

            private void w() {
                Paint paint = new Paint();
                paint.setTypeface(this.f59849c.a());
                Charset charsetForName = Charset.forName("ISO-8859-1");
                float f10 = 0.0f;
                for (int i10 = 0; i10 < 256; i10++) {
                    String str = new String(new byte[]{(byte) i10}, charsetForName);
                    float fMeasureText = paint.measureText(str);
                    if (f10 < fMeasureText) {
                        this.f59857k = str;
                        f10 = fMeasureText;
                    }
                }
                v();
            }

            public void a(String str) {
                u(str, true);
            }

            public void b() {
                c();
                f();
            }

            public void c() {
                this.f59851e.clear();
                this.f59848b.g("");
            }

            public int d() {
                return this.f59853g;
            }

            public void f() {
                setVisibility(4);
                requestLayout();
            }

            /* JADX WARN: Code duplicated, block: B:48:0x00fc A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:49:0x00fe A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:50:0x0100  */
            /* JADX WARN: Code duplicated, block: B:52:0x0103  */
            /* JADX WARN: Code duplicated, block: B:53:0x0108  */
            /* JADX WARN: Code duplicated, block: B:54:0x0115  */
            /* JADX WARN: Code duplicated, block: B:57:0x0139  */
            /* JADX WARN: Code duplicated, block: B:59:0x013d  */
            public void g(b bVar, f.g gVar) {
                float f10;
                float f11;
                float f12;
                float f13;
                b bVar2 = this.f59847a;
                if (bVar2 != bVar) {
                    if (bVar2 != null) {
                        bVar2.removeOnLayoutChangeListener(this);
                    }
                    this.f59847a = bVar;
                    bVar.addOnLayoutChangeListener(this);
                    w();
                }
                float f14 = gVar.f59745g;
                boolean z10 = gVar.f59744f;
                float fMax = f14 / (z10 ? 99 : 74);
                float fMax2 = gVar.f59746h / (z10 ? 99 : f59840p0);
                float f15 = 1.0f;
                if (fMax < 0.0f || fMax > 1.0f) {
                    fMax = Math.max(0.0f, Math.min(fMax, 1.0f));
                }
                if (fMax2 < 0.0f || fMax2 > 1.0f) {
                    fMax2 = Math.max(0.0f, Math.min(fMax2, 1.0f));
                }
                int i10 = gVar.f59747i;
                int i11 = i10 % 3;
                int i12 = 3;
                int i13 = i10 / 3;
                if (i11 != 0) {
                    if (i11 == 1) {
                        float fMin = Math.min(1.0f - fMax2, fMax2);
                        int iMin = Math.min(e(), gVar.f59749k + 1);
                        StringBuilder sb2 = new StringBuilder();
                        for (int i14 = 0; i14 < iMin; i14++) {
                            sb2.append(this.f59857k);
                        }
                        Paint paint = new Paint();
                        paint.setTypeface(this.f59849c.a());
                        paint.setTextSize(this.f59856j);
                        float fMeasureText = this.f59847a.getWidth() > 0 ? (paint.measureText(sb2.toString()) / 2.0f) / (this.f59847a.getWidth() * 0.8f) : 0.0f;
                        if (fMeasureText <= 0.0f || fMeasureText >= fMax2) {
                            this.f59848b.b(Layout.Alignment.ALIGN_CENTER);
                            f11 = fMax2 + fMin;
                            f10 = fMax2 - fMin;
                            i12 = 1;
                        } else {
                            this.f59848b.b(Layout.Alignment.ALIGN_NORMAL);
                            fMax2 -= fMeasureText;
                        }
                    } else if (i11 != 2) {
                        i12 = 17;
                        f10 = 0.0f;
                        f11 = 1.0f;
                    } else {
                        i12 = 5;
                        f10 = 0.0f;
                        f11 = fMax2;
                    }
                    if (i13 != 0) {
                        i12 |= 48;
                        f12 = fMax;
                    } else {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                f12 = 0.0f;
                            } else {
                                i12 |= 80;
                                f13 = fMax;
                                f12 = 0.0f;
                            }
                            b bVar3 = this.f59847a;
                            b bVar4 = this.f59847a;
                            Objects.requireNonNull(bVar4);
                            bVar3.c(this, new e.b(f12, f13, f10, f11));
                            l(gVar.f59739a);
                            q(gVar.f59748j);
                            setGravity(i12);
                            if (gVar.f59740b) {
                                t();
                            } else {
                                f();
                            }
                        }
                        i12 |= 16;
                        float fMin2 = Math.min(1.0f - fMax, fMax);
                        f15 = fMax + fMin2;
                        f12 = fMax - fMin2;
                    }
                    f13 = f15;
                    b bVar5 = this.f59847a;
                    b bVar6 = this.f59847a;
                    Objects.requireNonNull(bVar6);
                    bVar5.c(this, new e.b(f12, f13, f10, f11));
                    l(gVar.f59739a);
                    q(gVar.f59748j);
                    setGravity(i12);
                    if (gVar.f59740b) {
                        t();
                    } else {
                        f();
                    }
                }
                this.f59848b.b(Layout.Alignment.ALIGN_NORMAL);
                f10 = fMax2;
                f11 = 1.0f;
                if (i13 != 0) {
                    i12 |= 48;
                    f12 = fMax;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            f12 = 0.0f;
                        } else {
                            i12 |= 80;
                            f13 = fMax;
                            f12 = 0.0f;
                        }
                        b bVar7 = this.f59847a;
                        b bVar8 = this.f59847a;
                        Objects.requireNonNull(bVar8);
                        bVar7.c(this, new e.b(f12, f13, f10, f11));
                        l(gVar.f59739a);
                        q(gVar.f59748j);
                        setGravity(i12);
                        if (gVar.f59740b) {
                            t();
                        } else {
                            f();
                        }
                    }
                    i12 |= 16;
                    float fMin3 = Math.min(1.0f - fMax, fMax);
                    f15 = fMax + fMin3;
                    f12 = fMax - fMin3;
                }
                f13 = f15;
                b bVar9 = this.f59847a;
                b bVar10 = this.f59847a;
                Objects.requireNonNull(bVar10);
                bVar9.c(this, new e.b(f12, f13, f10, f11));
                l(gVar.f59739a);
                q(gVar.f59748j);
                setGravity(i12);
                if (gVar.f59740b) {
                    t();
                } else {
                    f();
                }
            }

            public void h() {
                b bVar = this.f59847a;
                if (bVar != null) {
                    bVar.d(this);
                    this.f59847a.removeOnLayoutChangeListener(this);
                    this.f59847a = null;
                }
            }

            public void i(String str) {
                a(str);
            }

            public void j(char c10) {
            }

            public void k(androidx.media2.widget.b bVar) {
                this.f59849c = bVar;
                this.f59848b.j(bVar);
            }

            public void l(int i10) {
                this.f59853g = i10;
            }

            public void m(float f10) {
                this.f59855i = f10;
                v();
            }

            public void n(f.d dVar) {
                this.f59852f.clear();
                if (dVar.f59733g) {
                    this.f59852f.add(new StyleSpan(2));
                }
                if (dVar.f59732f) {
                    this.f59852f.add(new UnderlineSpan());
                }
                int i10 = dVar.f59727a;
                if (i10 == 0) {
                    this.f59852f.add(new RelativeSizeSpan(0.75f));
                } else if (i10 == 2) {
                    this.f59852f.add(new RelativeSizeSpan(f59844t));
                }
                int i11 = dVar.f59728b;
                if (i11 == 0) {
                    this.f59852f.add(new SubscriptSpan());
                } else {
                    if (i11 != 2) {
                        return;
                    }
                    this.f59852f.add(new SuperscriptSpan());
                }
            }

            public void o(f.e eVar) {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                int i18 = i12 - i10;
                int i19 = i13 - i11;
                if (i18 == this.f59858l && i19 == this.f59859m) {
                    return;
                }
                this.f59858l = i18;
                this.f59859m = i19;
                v();
            }

            public void p(int i10, int i11) {
                int i12 = this.f59854h;
                if (i12 >= 0) {
                    while (i12 < i10) {
                        a("\n");
                        i12++;
                    }
                }
                this.f59854h = i10;
            }

            public void q(int i10) {
                if (i10 < 0) {
                    throw new IllegalArgumentException("A rowLimit should have a positive number");
                }
                this.f59850d = i10;
            }

            public void r(String str) {
                u(str, false);
            }

            public void s(f.h hVar) {
            }

            public void t() {
                setVisibility(0);
                requestLayout();
            }

            d(a aVar, Context context, AttributeSet attributeSet) {
                this(context, attributeSet, 0);
            }

            d(Context context, AttributeSet attributeSet, int i10) {
                super(context, attributeSet, i10);
                this.f59850d = 0;
                this.f59851e = new SpannableStringBuilder();
                this.f59852f = new ArrayList();
                this.f59854h = -1;
                this.f59848b = new c(a.this, context);
                addView(this.f59848b, new RelativeLayout.LayoutParams(-2, -2));
                CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
                this.f59855i = androidx.media2.widget.c.a.b(captioningManager);
                k(new androidx.media2.widget.b(androidx.media2.widget.c.a.d(captioningManager)));
                this.f59848b.g("");
                w();
            }
        }

        a(g gVar, Context context) {
            this(gVar, context, null);
        }

        @Override // androidx.media2.widget.f.j
        public void d(f.c cVar) {
            this.f59811g.i(cVar);
            c(getWidth(), getHeight());
            r.d.a aVar = this.f59878d;
            if (aVar != null) {
                aVar.a(this);
            }
        }

        @Override // androidx.media2.widget.h
        public h.b f(Context context) {
            return new b(context);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            ((ViewGroup) this.f59879e).draw(canvas);
        }

        a(g gVar, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        a(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f59811g = new C0561a((b) this.f59879e);
        }

        class e extends ViewGroup {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final String f59861d = "ScaledLayout";

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final boolean f59862e = false;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Comparator<Rect> f59863a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Rect[] f59864b;

            /* JADX INFO: renamed from: androidx.media2.widget.g$a$e$a, reason: collision with other inner class name */
            class C0562a implements Comparator<Rect> {
                C0562a() {
                }

                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(Rect rect, Rect rect2) {
                    int i10 = rect.top;
                    int i11 = rect2.top;
                    return i10 != i11 ? i10 - i11 : rect.left - rect2.left;
                }
            }

            e(Context context) {
                super(context);
                this.f59863a = new C0562a();
            }

            @Override // android.view.ViewGroup
            protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
                return layoutParams instanceof b;
            }

            @Override // android.view.ViewGroup, android.view.View
            public void dispatchDraw(Canvas canvas) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() != 8) {
                        Rect[] rectArr = this.f59864b;
                        if (i10 >= rectArr.length) {
                            return;
                        }
                        Rect rect = rectArr[i10];
                        int i11 = rect.left + paddingLeft;
                        int i12 = rect.top + paddingTop;
                        int iSave = canvas.save();
                        canvas.translate(i11, i12);
                        childAt.draw(canvas);
                        canvas.restoreToCount(iSave);
                    }
                }
            }

            @Override // android.view.ViewGroup
            public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
                return new b(getContext(), attributeSet);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8) {
                        Rect rect = this.f59864b[i14];
                        childAt.layout(rect.left + paddingLeft, rect.top + paddingTop, rect.right + paddingTop, rect.bottom + paddingLeft);
                    }
                }
            }

            @Override // android.view.View
            protected void onMeasure(int i10, int i11) {
                int i12;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
                int childCount = getChildCount();
                this.f59864b = new Rect[childCount];
                int i13 = 0;
                while (i13 < childCount) {
                    View childAt = getChildAt(i13);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (!(layoutParams instanceof b)) {
                        throw new RuntimeException("A child of ScaledLayout cannot have the UNSPECIFIED scale factors");
                    }
                    b bVar = (b) layoutParams;
                    float f10 = bVar.f59868a;
                    float f11 = bVar.f59869b;
                    float f12 = bVar.f59870c;
                    float f13 = bVar.f59871d;
                    if (f10 < 0.0f || f10 > 1.0f) {
                        throw new RuntimeException("A child of ScaledLayout should have a range of scaleStartRow between 0 and 1");
                    }
                    if (f11 < f10 || f10 > 1.0f) {
                        throw new RuntimeException("A child of ScaledLayout should have a range of scaleEndRow between scaleStartRow and 1");
                    }
                    if (f13 < 0.0f || f13 > 1.0f) {
                        throw new RuntimeException("A child of ScaledLayout should have a range of scaleStartCol between 0 and 1");
                    }
                    if (f13 < f12 || f13 > 1.0f) {
                        throw new RuntimeException("A child of ScaledLayout should have a range of scaleEndCol between scaleStartCol and 1");
                    }
                    float f14 = paddingLeft;
                    int i14 = paddingLeft;
                    float f15 = paddingTop;
                    int i15 = i13;
                    this.f59864b[i15] = new Rect((int) (f12 * f14), (int) (f10 * f15), (int) (f13 * f14), (int) (f11 * f15));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (f14 * (f13 - f12)), 1073741824);
                    childAt.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (childAt.getMeasuredHeight() > this.f59864b[i15].height()) {
                        int measuredHeight = ((childAt.getMeasuredHeight() - this.f59864b[i15].height()) + 1) / 2;
                        Rect rect = this.f59864b[i15];
                        int i16 = rect.bottom + measuredHeight;
                        rect.bottom = i16;
                        int i17 = rect.top - measuredHeight;
                        rect.top = i17;
                        if (i17 < 0) {
                            rect.bottom = i16 - i17;
                            rect.top = 0;
                        }
                        int i18 = rect.bottom;
                        if (i18 > paddingTop) {
                            rect.top -= i18 - paddingTop;
                            rect.bottom = paddingTop;
                        }
                    }
                    childAt.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (f15 * (f11 - f10)), 1073741824));
                    i13 = i15 + 1;
                    paddingLeft = i14;
                }
                int[] iArr = new int[childCount];
                Rect[] rectArr = new Rect[childCount];
                int i19 = 0;
                for (int i20 = 0; i20 < childCount; i20++) {
                    if (getChildAt(i20).getVisibility() == 0) {
                        iArr[i19] = i19;
                        rectArr[i19] = this.f59864b[i20];
                        i19++;
                    }
                }
                Arrays.sort(rectArr, 0, i19, this.f59863a);
                int i21 = 0;
                while (true) {
                    i12 = i19 - 1;
                    if (i21 >= i12) {
                        break;
                    }
                    int i22 = i21 + 1;
                    for (int i23 = i22; i23 < i19; i23++) {
                        if (Rect.intersects(rectArr[i21], rectArr[i23])) {
                            iArr[i23] = iArr[i21];
                            Rect rect2 = rectArr[i23];
                            int i24 = rect2.left;
                            int i25 = rectArr[i21].bottom;
                            rect2.set(i24, i25, rect2.right, rect2.height() + i25);
                        }
                    }
                    i21 = i22;
                }
                while (i12 >= 0) {
                    int i26 = rectArr[i12].bottom;
                    if (i26 > paddingTop) {
                        int i27 = i26 - paddingTop;
                        for (int i28 = 0; i28 <= i12; i28++) {
                            if (iArr[i12] == iArr[i28]) {
                                Rect rect3 = rectArr[i28];
                                rect3.set(rect3.left, rect3.top - i27, rect3.right, rect3.bottom - i27);
                            }
                        }
                    }
                    i12--;
                }
                setMeasuredDimension(size, size2);
            }

            class b extends ViewGroup.LayoutParams {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final float f59867f = -1.0f;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public float f59868a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public float f59869b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public float f59870c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public float f59871d;

                b(float f10, float f11, float f12, float f13) {
                    super(-1, -1);
                    this.f59868a = f10;
                    this.f59869b = f11;
                    this.f59870c = f12;
                    this.f59871d = f13;
                }

                b(Context context, AttributeSet attributeSet) {
                    super(-1, -1);
                }
            }
        }
    }

    static class b extends r {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final f f59873o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final a f59874p;

        b(a aVar, MediaFormat mediaFormat) {
            super(mediaFormat);
            this.f59874p = aVar;
            this.f59873o = new f(aVar);
        }

        @Override // androidx.media2.widget.r
        public r.d h() {
            return this.f59874p;
        }

        @Override // androidx.media2.widget.r
        public void l(byte[] bArr, boolean z10, long j10) {
            this.f59873o.c(bArr);
        }

        @Override // androidx.media2.widget.r
        public void t(ArrayList<r.b> arrayList) {
        }
    }

    g(@NonNull Context context) {
        this.f59809a = context;
    }

    @Override // androidx.media2.widget.q.f
    @NonNull
    public r a(@NonNull MediaFormat mediaFormat) {
        if ("text/cea-708".equals(mediaFormat.getString("mime"))) {
            if (this.f59810b == null) {
                this.f59810b = new a(this, this.f59809a);
            }
            return new b(this.f59810b, mediaFormat);
        }
        throw new RuntimeException("No matching format: " + mediaFormat.toString());
    }

    @Override // androidx.media2.widget.q.f
    public boolean b(@NonNull MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("mime")) {
            return "text/cea-708".equals(mediaFormat.getString("mime"));
        }
        return false;
    }
}
