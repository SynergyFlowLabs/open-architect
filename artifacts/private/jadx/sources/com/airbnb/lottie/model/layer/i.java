package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.p0;
import androidx.collection.b1;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.k;
import com.airbnb.lottie.l1;
import com.airbnb.lottie.model.content.q;
import com.airbnb.lottie.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes3.dex */
public class i extends com.airbnb.lottie.model.layer.b {
    private final StringBuilder H;
    private final RectF I;
    private final Matrix J;
    private final Paint K;
    private final Paint L;
    private final Map<com.airbnb.lottie.model.d, List<com.airbnb.lottie.animation.content.d>> M;
    private final b1<String> N;
    private final List<d> O;
    private final o P;
    private final w0 Q;
    private final k R;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> S;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> T;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> U;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> V;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> W;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> X;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> Y;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f88616a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> f88617b0;

    class a extends Paint {
        a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88620a;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.b.a.values().length];
            f88620a = iArr;
            try {
                iArr[com.airbnb.lottie.model.b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88620a[com.airbnb.lottie.model.b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88620a[com.airbnb.lottie.model.b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    i(w0 w0Var, e eVar) {
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.a aVar;
        com.airbnb.lottie.model.animatable.a aVar2;
        super(w0Var, eVar);
        this.H = new StringBuilder(2);
        this.I = new RectF();
        this.J = new Matrix();
        this.K = new a(1);
        this.L = new b(1);
        this.M = new HashMap();
        this.N = new b1<>();
        this.O = new ArrayList();
        this.Q = w0Var;
        this.R = eVar.c();
        o oVarA = eVar.t().a();
        this.P = oVarA;
        oVarA.a(this);
        i(oVarA);
        com.airbnb.lottie.model.animatable.k kVarU = eVar.u();
        if (kVarU != null && (aVar2 = kVarU.f88348a) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarA = aVar2.a();
            this.S = aVarA;
            aVarA.a(this);
            i(this.S);
        }
        if (kVarU != null && (aVar = kVarU.f88349b) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarA2 = aVar.a();
            this.U = aVarA2;
            aVarA2.a(this);
            i(this.U);
        }
        if (kVarU != null && (bVar2 = kVarU.f88350c) != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA3 = bVar2.a();
            this.W = aVarA3;
            aVarA3.a(this);
            i(this.W);
        }
        if (kVarU == null || (bVar = kVarU.f88351d) == null) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA4 = bVar.a();
        this.Y = aVarA4;
        aVarA4.a(this);
        i(this.Y);
    }

    private String O(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!d0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.N.d(j10)) {
            return this.N.g(j10);
        }
        this.H.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.H.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.H.toString();
        this.N.n(j10, string);
        return string;
    }

    private void P(com.airbnb.lottie.model.b bVar, int i10) {
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.T;
        if (aVar != null) {
            this.K.setColor(aVar.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.S;
            if (aVar2 != null) {
                this.K.setColor(aVar2.h().intValue());
            } else {
                this.K.setColor(bVar.f88370h);
            }
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar3 = this.V;
        if (aVar3 != null) {
            this.L.setColor(aVar3.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar4 = this.U;
            if (aVar4 != null) {
                this.L.setColor(aVar4.h().intValue());
            } else {
                this.L.setColor(bVar.f88371i);
            }
        }
        int iIntValue = ((((this.f88570x.h() == null ? 100 : this.f88570x.h().h().intValue()) * 255) / 100) * i10) / 255;
        this.K.setAlpha(iIntValue);
        this.L.setAlpha(iIntValue);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.X;
        if (aVar5 != null) {
            this.L.setStrokeWidth(aVar5.h().floatValue());
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar6 = this.W;
        if (aVar6 != null) {
            this.L.setStrokeWidth(aVar6.h().floatValue());
        } else {
            this.L.setStrokeWidth(bVar.f88372j * com.airbnb.lottie.utils.j.e());
        }
    }

    private void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void R(com.airbnb.lottie.model.d dVar, float f10, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        List<com.airbnb.lottie.animation.content.d> listA0 = a0(dVar);
        for (int i10 = 0; i10 < listA0.size(); i10++) {
            Path pathS = listA0.get(i10).S();
            pathS.computeBounds(this.I, false);
            this.J.reset();
            this.J.preTranslate(0.0f, (-bVar.f88369g) * com.airbnb.lottie.utils.j.e());
            this.J.preScale(f10, f10);
            pathS.transform(this.J);
            if (bVar.f88373k) {
                V(pathS, this.K, canvas);
                V(pathS, this.L, canvas);
            } else {
                V(pathS, this.L, canvas);
                V(pathS, this.K, canvas);
            }
        }
    }

    private void T(String str, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        if (bVar.f88373k) {
            Q(str, this.K, canvas);
            Q(str, this.L, canvas);
        } else {
            Q(str, this.L, canvas);
            Q(str, this.K, canvas);
        }
    }

    private void U(String str, com.airbnb.lottie.model.b bVar, Canvas canvas, float f10) {
        int length = 0;
        while (length < str.length()) {
            String strO = O(str, length);
            length += strO.length();
            T(strO, bVar, canvas);
            canvas.translate(this.K.measureText(strO) + f10, 0.0f);
        }
    }

    private void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0 || (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f)) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void W(String str, com.airbnb.lottie.model.b bVar, com.airbnb.lottie.model.c cVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            com.airbnb.lottie.model.d dVarG = this.R.c().g(com.airbnb.lottie.model.d.c(str.charAt(i10), cVar.b(), cVar.d()));
            if (dVarG != null) {
                R(dVarG, f11, bVar, canvas);
                canvas.translate((((float) dVarG.b()) * f11 * com.airbnb.lottie.utils.j.e()) + f12, 0.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca A[SYNTHETIC] */
    private void X(com.airbnb.lottie.model.b bVar, com.airbnb.lottie.model.c cVar, Canvas canvas) {
        float fFloatValue;
        float fE;
        List<String> listB0;
        int size;
        int i10;
        int i11;
        PointF pointF;
        float f10;
        i iVar;
        List<d> listF0;
        int i12;
        d dVar;
        Typeface typefaceC0 = c0(cVar);
        if (typefaceC0 == null) {
            return;
        }
        String strC = bVar.f88363a;
        l1 l1VarL0 = this.Q.l0();
        if (l1VarL0 != null) {
            strC = l1VarL0.c(getName(), strC);
        }
        this.K.setTypeface(typefaceC0);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.f88616a0;
        float fFloatValue2 = aVar != null ? aVar.h().floatValue() : bVar.f88365c;
        this.K.setTextSize(com.airbnb.lottie.utils.j.e() * fFloatValue2);
        this.L.setTypeface(this.K.getTypeface());
        this.L.setTextSize(this.K.getTextSize());
        float f11 = bVar.f88367e / 10.0f;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.Z;
        if (aVar2 == null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar3 = this.Y;
            if (aVar3 != null) {
                fFloatValue = aVar3.h().floatValue();
            }
            fE = ((f11 * com.airbnb.lottie.utils.j.e()) * fFloatValue2) / 100.0f;
            listB0 = b0(strC);
            size = listB0.size();
            i10 = 0;
            i11 = -1;
            while (i10 < size) {
                String str = listB0.get(i10);
                pointF = bVar.f88375m;
                if (pointF == null) {
                    f10 = 0.0f;
                } else {
                    f10 = pointF.x;
                }
                float f12 = f10;
                iVar = this;
                com.airbnb.lottie.model.c cVar2 = cVar;
                listF0 = iVar.f0(str, f12, cVar2, 0.0f, fE, false);
                for (i12 = 0; i12 < listF0.size(); i12++) {
                    dVar = listF0.get(i12);
                    i11++;
                    canvas.save();
                    if (iVar.e0(canvas, bVar, i11, dVar.f88622b)) {
                        iVar.U(dVar.f88621a, bVar, canvas, fE);
                    }
                    canvas.restore();
                }
                i10++;
                this = iVar;
                cVar = cVar2;
            }
        }
        fFloatValue = aVar2.h().floatValue();
        f11 += fFloatValue;
        fE = ((f11 * com.airbnb.lottie.utils.j.e()) * fFloatValue2) / 100.0f;
        listB0 = b0(strC);
        size = listB0.size();
        i10 = 0;
        i11 = -1;
        while (i10 < size) {
            String str2 = listB0.get(i10);
            pointF = bVar.f88375m;
            if (pointF == null) {
                f10 = 0.0f;
            } else {
                f10 = pointF.x;
            }
            float f13 = f10;
            iVar = this;
            com.airbnb.lottie.model.c cVar3 = cVar;
            listF0 = iVar.f0(str2, f13, cVar3, 0.0f, fE, false);
            while (i12 < listF0.size()) {
                dVar = listF0.get(i12);
                i11++;
                canvas.save();
                if (iVar.e0(canvas, bVar, i11, dVar.f88622b)) {
                    iVar.U(dVar.f88621a, bVar, canvas, fE);
                }
                canvas.restore();
            }
            i10++;
            this = iVar;
            cVar = cVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    private void Y(com.airbnb.lottie.model.b bVar, Matrix matrix, com.airbnb.lottie.model.c cVar, Canvas canvas) {
        float fFloatValue;
        float f10;
        int i10;
        int i11;
        PointF pointF;
        float f11;
        List<d> listF0;
        int i12;
        d dVar;
        float f12;
        float f13;
        i iVar = this;
        com.airbnb.lottie.model.b bVar2 = bVar;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = iVar.f88616a0;
        float fFloatValue2 = (aVar != null ? aVar.h().floatValue() : bVar2.f88365c) / 100.0f;
        float fG = com.airbnb.lottie.utils.j.g(matrix);
        List<String> listB0 = iVar.b0(bVar2.f88363a);
        int size = listB0.size();
        float f14 = bVar2.f88367e / 10.0f;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = iVar.Z;
        if (aVar2 == null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar3 = iVar.Y;
            if (aVar3 != null) {
                fFloatValue = aVar3.h().floatValue();
            }
            f10 = f14;
            i10 = -1;
            i11 = 0;
            while (i11 < size) {
                String str = listB0.get(i11);
                pointF = bVar2.f88375m;
                if (pointF == null) {
                    f11 = 0.0f;
                } else {
                    f11 = pointF.x;
                }
                listF0 = iVar.f0(str, f11, cVar, fFloatValue2, f10, true);
                i12 = 0;
                while (i12 < listF0.size()) {
                    dVar = listF0.get(i12);
                    i10++;
                    canvas.save();
                    if (iVar.e0(canvas, bVar2, i10, dVar.f88622b)) {
                        float f15 = fFloatValue2;
                        com.airbnb.lottie.model.b bVar3 = bVar2;
                        f12 = f10;
                        f13 = fG;
                        iVar.W(dVar.f88621a, bVar3, cVar, canvas, f13, f15, f12);
                        fFloatValue2 = f15;
                    } else {
                        f12 = f10;
                        f13 = fG;
                    }
                    canvas.restore();
                    i12++;
                    iVar = this;
                    fG = f13;
                    f10 = f12;
                    bVar2 = bVar;
                }
                i11++;
                iVar = this;
                f10 = f10;
                bVar2 = bVar;
            }
        }
        fFloatValue = aVar2.h().floatValue();
        f14 += fFloatValue;
        f10 = f14;
        i10 = -1;
        i11 = 0;
        while (i11 < size) {
            String str2 = listB0.get(i11);
            pointF = bVar2.f88375m;
            if (pointF == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF.x;
            }
            listF0 = iVar.f0(str2, f11, cVar, fFloatValue2, f10, true);
            i12 = 0;
            while (i12 < listF0.size()) {
                dVar = listF0.get(i12);
                i10++;
                canvas.save();
                if (iVar.e0(canvas, bVar2, i10, dVar.f88622b)) {
                    float f16 = fFloatValue2;
                    com.airbnb.lottie.model.b bVar4 = bVar2;
                    f12 = f10;
                    f13 = fG;
                    iVar.W(dVar.f88621a, bVar4, cVar, canvas, f13, f16, f12);
                    fFloatValue2 = f16;
                } else {
                    f12 = f10;
                    f13 = fG;
                }
                canvas.restore();
                i12++;
                iVar = this;
                fG = f13;
                f10 = f12;
                bVar2 = bVar;
            }
            i11++;
            iVar = this;
            f10 = f10;
            bVar2 = bVar;
        }
    }

    private d Z(int i10) {
        for (int size = this.O.size(); size < i10; size++) {
            this.O.add(new d(null));
        }
        return this.O.get(i10 - 1);
    }

    private List<com.airbnb.lottie.animation.content.d> a0(com.airbnb.lottie.model.d dVar) {
        if (this.M.containsKey(dVar)) {
            return this.M.get(dVar);
        }
        List<q> listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new com.airbnb.lottie.animation.content.d(this.Q, this, listA.get(i10), this.R));
        }
        this.M.put(dVar, arrayList);
        return arrayList;
    }

    private List<String> b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", z.f337565d).replaceAll("\u0003", z.f337565d).replaceAll("\n", z.f337565d).split(z.f337565d));
    }

    @p0
    private Typeface c0(com.airbnb.lottie.model.c cVar) {
        Typeface typefaceH;
        com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar = this.f88617b0;
        if (aVar != null && (typefaceH = aVar.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceM0 = this.Q.m0(cVar);
        return typefaceM0 != null ? typefaceM0 : cVar.e();
    }

    private boolean d0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    private boolean e0(Canvas canvas, com.airbnb.lottie.model.b bVar, int i10, float f10) {
        PointF pointF = bVar.f88374l;
        PointF pointF2 = bVar.f88375m;
        float fE = com.airbnb.lottie.utils.j.e();
        float f11 = (i10 * bVar.f88368f * fE) + (pointF == null ? 0.0f : (bVar.f88368f * fE) + pointF.y);
        if (this.Q.R() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f88365c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f88620a[bVar.f88366d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    private List<d> f0(String str, float f10, com.airbnb.lottie.model.c cVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                com.airbnb.lottie.model.d dVarG = this.R.c().g(com.airbnb.lottie.model.d.c(cCharAt, cVar.b(), cVar.d()));
                if (dVarG != null) {
                    fMeasureText = ((float) dVarG.b()) * f11 * com.airbnb.lottie.utils.j.e();
                }
            } else {
                fMeasureText = this.K.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                d dVarZ = Z(i10);
                if (i12 == i11) {
                    String strSubstring = str.substring(i11, i13);
                    String strTrim = strSubstring.trim();
                    dVarZ.c(strTrim, (f13 - f16) - ((strTrim.length() - strSubstring.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    String strSubstring2 = str.substring(i11, i12 - 1);
                    String strTrim2 = strSubstring2.trim();
                    dVarZ.c(strTrim2, ((f13 - f14) - ((strSubstring2.length() - strTrim2.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            Z(i10).c(str.substring(i11), f13);
        }
        return this.O.subList(0, i10);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.R.b().width(), this.R.b().height());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.g(t10, jVar);
        if (t10 == com.airbnb.lottie.b1.f88151a) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.T;
            if (aVar != null) {
                G(aVar);
            }
            if (jVar == null) {
                this.T = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.T = qVar;
            qVar.a(this);
            i(this.T);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.f88152b) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.V;
            if (aVar2 != null) {
                G(aVar2);
            }
            if (jVar == null) {
                this.V = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.V = qVar2;
            qVar2.a(this);
            i(this.V);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.f88169s) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar3 = this.X;
            if (aVar3 != null) {
                G(aVar3);
            }
            if (jVar == null) {
                this.X = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.X = qVar3;
            qVar3.a(this);
            i(this.X);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.f88170t) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar4 = this.Z;
            if (aVar4 != null) {
                G(aVar4);
            }
            if (jVar == null) {
                this.Z = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.Z = qVar4;
            qVar4.a(this);
            i(this.Z);
            return;
        }
        if (t10 == com.airbnb.lottie.b1.F) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.f88616a0;
            if (aVar5 != null) {
                G(aVar5);
            }
            if (jVar == null) {
                this.f88616a0 = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar5 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f88616a0 = qVar5;
            qVar5.a(this);
            i(this.f88616a0);
            return;
        }
        if (t10 != com.airbnb.lottie.b1.M) {
            if (t10 == com.airbnb.lottie.b1.O) {
                this.P.r(jVar);
                return;
            }
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar6 = this.f88617b0;
        if (aVar6 != null) {
            G(aVar6);
        }
        if (jVar == null) {
            this.f88617b0 = null;
            return;
        }
        com.airbnb.lottie.animation.keyframe.q qVar6 = new com.airbnb.lottie.animation.keyframe.q(jVar);
        this.f88617b0 = qVar6;
        qVar6.a(this);
        i(this.f88617b0);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i10) {
        com.airbnb.lottie.model.b bVarH = this.P.h();
        com.airbnb.lottie.model.c cVar = this.R.g().get(bVarH.f88364b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        P(bVarH, i10);
        if (this.Q.s1()) {
            Y(bVarH, matrix, cVar, canvas);
        } else {
            X(bVarH, cVar, canvas);
        }
        canvas.restore();
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f88621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f88622b;

        private d() {
            this.f88621a = "";
            this.f88622b = 0.0f;
        }

        void c(String str, float f10) {
            this.f88621a = str;
            this.f88622b = f10;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
