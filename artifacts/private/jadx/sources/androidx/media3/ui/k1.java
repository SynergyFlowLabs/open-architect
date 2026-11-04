package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class k1 extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f69998h = 1.2f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f69999i = "default_bg";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.ui.a f70000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f70001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<androidx.media3.common.text.a> f70002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.ui.b f70003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f70004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f70005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f70006g;

    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70008a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f70008a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70008a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70008a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k1(Context context) {
        this(context, null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(@androidx.annotation.p0 Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f70008a[alignment.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "center" : "end";
        }
        return "start";
    }

    private static String d(androidx.media3.ui.b bVar) {
        int i10 = bVar.f69777d;
        if (i10 == 1) {
            return androidx.media3.common.util.k1.S("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", h.b(bVar.f69778e));
        }
        if (i10 == 2) {
            return androidx.media3.common.util.k1.S("0.1em 0.12em 0.15em %s", h.b(bVar.f69778e));
        }
        if (i10 != 3) {
            return i10 != 4 ? "unset" : androidx.media3.common.util.k1.S("-0.05em -0.05em 0.15em %s", h.b(bVar.f69778e));
        }
        return androidx.media3.common.util.k1.S("0.06em 0.08em 0.15em %s", h.b(bVar.f69778e));
    }

    private String e(int i10, float f10) {
        float f11 = c1.f(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f11 == -3.4028235E38f ? "unset" : androidx.media3.common.util.k1.S("%.2fpx", Float.valueOf(f11 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String h(androidx.media3.common.text.a aVar) {
        float f10 = aVar.f61391q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = aVar.f61390p;
        return androidx.media3.common.util.k1.S("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:28:0x010f  */
    /* JADX WARN: Code duplicated, block: B:31:0x012a  */
    /* JADX WARN: Code duplicated, block: B:32:0x012d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0146  */
    /* JADX WARN: Code duplicated, block: B:39:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0156  */
    /* JADX WARN: Code duplicated, block: B:43:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0196  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x020e  */
    private void i() {
        float f10;
        String strS;
        int iB;
        boolean z10;
        String str;
        float f11;
        String strS2;
        int i10;
        int i11;
        String str2;
        String str3;
        Object obj;
        String str4;
        w0.b bVarA;
        Layout.Alignment alignment;
        String str5;
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        String strB = h.b(this.f70003d.f69774a);
        String strE = e(this.f70005f, this.f70004e);
        float f12 = f69998h;
        sb2.append(androidx.media3.common.util.k1.S("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", strB, strE, Float.valueOf(f69998h), d(this.f70003d)));
        HashMap map = new HashMap();
        map.put(h.a(f69999i), androidx.media3.common.util.k1.S("background-color:%s;", h.b(this.f70003d.f69775b)));
        int i12 = 0;
        while (i12 < this.f70002c.size()) {
            androidx.media3.common.text.a aVar = this.f70002c.get(i12);
            float f13 = aVar.f61382h;
            float f14 = f13 != -3.4028235E38f ? f13 * 100.0f : 50.0f;
            int iB2 = b(aVar.f61383i);
            float f15 = aVar.f61379e;
            float f16 = f12;
            if (f15 != -3.4028235E38f) {
                if (aVar.f61380f != 1) {
                    String strS3 = androidx.media3.common.util.k1.S("%.2f%%", Float.valueOf(f15 * 100.0f));
                    iB = aVar.f61390p == 1 ? -b(aVar.f61381g) : b(aVar.f61381g);
                    f10 = -3.4028235E38f;
                    str = strS3;
                    z10 = false;
                } else {
                    f10 = -3.4028235E38f;
                    if (f15 >= 0.0f) {
                        strS = androidx.media3.common.util.k1.S("%.2fem", Float.valueOf(f15 * f16));
                        z10 = false;
                        iB = 0;
                    } else {
                        strS = androidx.media3.common.util.k1.S("%.2fem", Float.valueOf(((-f15) - 1.0f) * f16));
                        iB = 0;
                        z10 = true;
                    }
                }
                f11 = aVar.f61384j;
                if (f11 != f10) {
                    strS2 = androidx.media3.common.util.k1.S("%.2f%%", Float.valueOf(f11 * 100.0f));
                } else {
                    strS2 = "fit-content";
                }
                String str6 = strS2;
                String strC = c(aVar.f61376b);
                String strF = f(aVar.f61390p);
                String strE2 = e(aVar.f61388n, aVar.f61389o);
                if (aVar.f61386l) {
                    i10 = aVar.f61387m;
                } else {
                    i10 = this.f70003d.f69776c;
                }
                String strB2 = h.b(i10);
                i11 = aVar.f61390p;
                str2 = "right";
                if (i11 != 1) {
                    if (z10) {
                        str2 = "left";
                    }
                    str3 = str2;
                    obj = "top";
                } else if (i11 != 2) {
                    str3 = z10 ? VerticalAlignment.BOTTOM : "top";
                    obj = "left";
                } else {
                    if (!z10) {
                        str2 = "left";
                    }
                    str3 = str2;
                    obj = "top";
                }
                if (i11 != 2 || i11 == 1) {
                    str4 = "height";
                    int i13 = iB;
                    iB = iB2;
                    iB2 = i13;
                } else {
                    str4 = "width";
                }
                String str7 = str4;
                bVarA = w0.a(aVar.f61375a, getContext().getResources().getDisplayMetrics().density);
                for (String str8 : map.keySet()) {
                    str5 = (String) map.put(str8, (String) map.get(str8));
                    if (str5 != null || str5.equals(map.get(str8))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    androidx.media3.common.util.a.i(z11);
                }
                sb2.append(androidx.media3.common.util.k1.S("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i12), obj, Float.valueOf(f14), str3, str, str7, str6, strC, strF, strE2, strB2, Integer.valueOf(iB2), Integer.valueOf(iB), h(aVar)));
                sb2.append(androidx.media3.common.util.k1.S("<span class='%s'>", f69999i));
                alignment = aVar.f61377c;
                if (alignment != null) {
                    sb2.append(androidx.media3.common.util.k1.S("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                    sb2.append(bVarA.f70522a);
                    sb2.append("</span>");
                } else {
                    sb2.append(bVarA.f70522a);
                }
                sb2.append("</span>");
                sb2.append("</div>");
                i12++;
                f12 = f16;
            } else {
                f10 = -3.4028235E38f;
                strS = androidx.media3.common.util.k1.S("%.2f%%", Float.valueOf((1.0f - this.f70006g) * 100.0f));
                iB = -100;
                z10 = false;
            }
            str = strS;
            f11 = aVar.f61384j;
            if (f11 != f10) {
                strS2 = androidx.media3.common.util.k1.S("%.2f%%", Float.valueOf(f11 * 100.0f));
            } else {
                strS2 = "fit-content";
            }
            String str9 = strS2;
            String strC2 = c(aVar.f61376b);
            String strF2 = f(aVar.f61390p);
            String strE3 = e(aVar.f61388n, aVar.f61389o);
            if (aVar.f61386l) {
                i10 = aVar.f61387m;
            } else {
                i10 = this.f70003d.f69776c;
            }
            String strB3 = h.b(i10);
            i11 = aVar.f61390p;
            str2 = "right";
            if (i11 != 1) {
                if (z10) {
                    str2 = "left";
                }
                str3 = str2;
                obj = "top";
            } else if (i11 != 2) {
                str3 = z10 ? VerticalAlignment.BOTTOM : "top";
                obj = "left";
            } else {
                if (!z10) {
                    str2 = "left";
                }
                str3 = str2;
                obj = "top";
            }
            if (i11 != 2) {
                str4 = "height";
                int i14 = iB;
                iB = iB2;
                iB2 = i14;
            } else {
                str4 = "height";
                int i15 = iB;
                iB = iB2;
                iB2 = i15;
            }
            String str10 = str4;
            bVarA = w0.a(aVar.f61375a, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
                str5 = (String) map.put(str8, (String) map.get(str8));
                if (str5 != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                androidx.media3.common.util.a.i(z11);
            }
            sb2.append(androidx.media3.common.util.k1.S("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i12), obj, Float.valueOf(f14), str3, str, str10, str9, strC2, strF2, strE3, strB3, Integer.valueOf(iB2), Integer.valueOf(iB), h(aVar)));
            sb2.append(androidx.media3.common.util.k1.S("<span class='%s'>", f69999i));
            alignment = aVar.f61377c;
            if (alignment != null) {
                sb2.append(androidx.media3.common.util.k1.S("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                sb2.append(bVarA.f70522a);
                sb2.append("</span>");
            } else {
                sb2.append(bVarA.f70522a);
            }
            sb2.append("</span>");
            sb2.append("</div>");
            i12++;
            f12 = f16;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<html><head><style>");
        for (String str11 : map.keySet()) {
            sb3.append(str11);
            sb3.append("{");
            sb3.append((String) map.get(str11));
            sb3.append("}");
        }
        sb3.append("</style></head>");
        sb2.insert(0, sb3.toString());
        this.f70001b.loadData(Base64.encodeToString(sb2.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<androidx.media3.common.text.a> list, androidx.media3.ui.b bVar, float f10, int i10, float f11) {
        this.f70003d = bVar;
        this.f70004e = f10;
        this.f70005f = i10;
        this.f70006g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            androidx.media3.common.text.a aVar = list.get(i11);
            if (aVar.f61378d != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.f70002c.isEmpty() || !arrayList2.isEmpty()) {
            this.f70002c = arrayList2;
            i();
        }
        this.f70000a.a(arrayList, bVar, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f70001b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f70002c.isEmpty()) {
            return;
        }
        i();
    }

    public k1(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70002c = Collections.EMPTY_LIST;
        this.f70003d = androidx.media3.ui.b.f69773m;
        this.f70004e = 0.0533f;
        this.f70005f = 0;
        this.f70006g = 0.08f;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context, attributeSet);
        this.f70000a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f70001b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
