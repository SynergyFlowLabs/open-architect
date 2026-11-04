package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.appcompat.widget.w0;
import androidx.collection.b1;
import androidx.collection.j3;
import androidx.core.content.res.n;
import androidx.core.graphics.drawable.i;
import androidx.core.util.o;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.appcompat.graphics.drawable.e implements i {
    private static final String H1 = "a";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final String f10425g3 = "item";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final String f10426h3 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final String f10427i3 = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final String f10428j3 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f10429p2 = "transition";
    private c X;
    private g Y;
    private int Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f10430p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f10431p1;

    private static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Animatable f10432a;

        b(Animatable animatable) {
            super();
            this.f10432a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f10432a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f10432a.stop();
        }
    }

    static class c extends androidx.appcompat.graphics.drawable.e.a {
        private static final long M = 4294967296L;
        private static final long N = 8589934592L;
        b1<Long> K;
        j3<Integer> L;

        c(@p0 c cVar, @NonNull a aVar, @p0 Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new b1<>();
                this.L = new j3<>();
            }
        }

        private static long H(int i10, int i11) {
            return ((long) i11) | (((long) i10) << 32);
        }

        int F(@NonNull int[] iArr, @NonNull Drawable drawable, int i10) {
            int iD = super.D(iArr, drawable);
            this.L.o(iD, Integer.valueOf(i10));
            return iD;
        }

        int G(int i10, int i11, @NonNull Drawable drawable, boolean z10) {
            int iA = super.a(drawable);
            long jH = H(i10, i11);
            long j10 = z10 ? N : 0L;
            long j11 = iA;
            this.K.a(jH, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(H(i11, i10), Long.valueOf(M | j11 | j10));
            }
            return iA;
        }

        int I(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.h(i10, 0).intValue();
        }

        int J(@NonNull int[] iArr) {
            int iE = super.E(iArr);
            return iE >= 0 ? iE : super.E(StateSet.WILD_CARD);
        }

        int K(int i10, int i11) {
            return (int) this.K.h(H(i10, i11), -1L).longValue();
        }

        boolean L(int i10, int i11) {
            return (this.K.h(H(i10, i11), -1L).longValue() & M) != 0;
        }

        boolean M(int i10, int i11) {
            return (this.K.h(H(i10, i11), -1L).longValue() & N) != 0;
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, androidx.appcompat.graphics.drawable.b.d
        void v() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f10433a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f10433a = cVar;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f10433a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f10433a.stop();
        }
    }

    private static class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f10434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f10435b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = 0;
            int i11 = z10 ? numberOfFrames - 1 : 0;
            if (!z10) {
                i10 = numberOfFrames - 1;
            }
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i10);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f10435b = z11;
            this.f10434a = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public boolean a() {
            return this.f10435b;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void b() {
            this.f10434a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f10434a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f10434a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f10436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10438c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        int a() {
            return this.f10438c;
        }

        int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f10437b = numberOfFrames;
            int[] iArr = this.f10436a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f10436a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f10436a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f10438c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f10438c) + 0.5f);
            int i11 = this.f10437b;
            int[] iArr = this.f10436a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f10438c : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    @p0
    public static a B(@NonNull Context context, @v int i10, @p0 Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C(context, resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @NonNull
    public static a C(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.v(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void D() {
        onStateChange(getState());
    }

    private int E(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, k.b.C2243b.f307501h);
        int resourceId = typedArrayS.getResourceId(k.b.C2243b.f307502i, 0);
        int resourceId2 = typedArrayS.getResourceId(k.b.C2243b.f307503j, -1);
        Drawable drawableJ = resourceId2 > 0 ? w0.h().j(context, resourceId2) : null;
        typedArrayS.recycle();
        int[] iArrP = p(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f10428j3);
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? androidx.vectordrawable.graphics.drawable.i.e(resources, xmlPullParser, attributeSet, theme) : k.a.C2242a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ != null) {
            return this.X.F(iArrP, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f10428j3);
    }

    private int F(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, k.b.C2243b.f307504k);
        int resourceId = typedArrayS.getResourceId(k.b.C2243b.f307507n, -1);
        int resourceId2 = typedArrayS.getResourceId(k.b.C2243b.f307506m, -1);
        int resourceId3 = typedArrayS.getResourceId(k.b.C2243b.f307505l, -1);
        Drawable drawableJ = resourceId3 > 0 ? w0.h().j(context, resourceId3) : null;
        boolean z10 = typedArrayS.getBoolean(k.b.C2243b.f307508o, false);
        typedArrayS.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f10426h3);
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.c.e(context, resources, xmlPullParser, attributeSet, theme) : k.a.C2242a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f10426h3);
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.X.G(resourceId, resourceId2, drawableJ, z10);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f10427i3);
    }

    private boolean G(int i10) {
        int iD;
        int iK;
        g bVar;
        g gVar = this.Y;
        if (gVar == null) {
            iD = d();
        } else {
            if (i10 == this.Z) {
                return true;
            }
            if (i10 == this.f10430p0 && gVar.a()) {
                gVar.b();
                this.Z = this.f10430p0;
                this.f10430p0 = i10;
                return true;
            }
            iD = this.Z;
            gVar.d();
        }
        this.Y = null;
        this.f10430p0 = -1;
        this.Z = -1;
        c cVar = this.X;
        int I = cVar.I(iD);
        int I2 = cVar.I(i10);
        if (I2 == 0 || I == 0 || (iK = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean zM = cVar.M(I, I2);
        h(iK);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I, I2), zM);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        }
        bVar.c();
        this.Y = bVar;
        this.f10430p0 = iD;
        this.Z = i10;
        return true;
    }

    private void w(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                if (xmlPullParser.getName().equals(f10425g3)) {
                    E(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(f10429p2)) {
                    F(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void x(TypedArray typedArray) {
        c cVar = this.X;
        cVar.f10459d |= k.a.C2242a.b(typedArray);
        cVar.B(typedArray.getBoolean(k.b.C2243b.f307497d, cVar.f10464i));
        cVar.x(typedArray.getBoolean(k.b.C2243b.f307498e, cVar.f10467l));
        cVar.y(typedArray.getInt(k.b.C2243b.f307499f, cVar.A));
        cVar.z(typedArray.getInt(k.b.C2243b.f307500g, cVar.B));
        setDither(typedArray.getBoolean(k.b.C2243b.f307495b, cVar.f10479x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.e
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o() {
        return new c(this.X, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b
    void b() {
        super.b();
        this.f10431p1 = false;
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b
    void i(@NonNull androidx.appcompat.graphics.drawable.b.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.X = (c) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.Y;
        if (gVar != null) {
            gVar.d();
            this.Y = null;
            h(this.Z);
            this.Z = -1;
            this.f10430p0 = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f10431p1 && super.mutate() == this) {
            this.X.v();
            this.f10431p1 = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] iArr) {
        int iJ = this.X.J(iArr);
        boolean z10 = iJ != d() && (G(iJ) || h(iJ));
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z10 : z10;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.Y;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.e
    public void v(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, k.b.C2243b.f307494a);
        setVisible(typedArrayS.getBoolean(k.b.C2243b.f307496c, true), true);
        x(typedArrayS);
        m(resources);
        typedArrayS.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@NonNull int[] iArr, @NonNull Drawable drawable, int i10) {
        o.d(drawable);
        this.X.F(iArr, drawable, i10);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int i10, int i11, @NonNull T t10, boolean z10) {
        o.d(t10);
        this.X.G(i10, i11, t10, z10);
    }

    a(@p0 c cVar, @p0 Resources resources) {
        super(null);
        this.Z = -1;
        this.f10430p0 = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
