package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.core.content.res.n;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class c extends h implements androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f75866i = "AnimatedVDCompat";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f75867j = "animated-vector";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f75868k = "target";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f75869l = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0764c f75870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f75871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f75872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f75873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f75874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<androidx.vectordrawable.graphics.drawable.b.a> f75875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Drawable.Callback f75876h;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f75875g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b.a) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f75875g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b.a) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0764c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f75879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        i f75880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f75881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f75882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.collection.a<Animator, String> f75883e;

        public C0764c(Context context, C0764c c0764c, Drawable.Callback callback, Resources resources) {
            if (c0764c != null) {
                this.f75879a = c0764c.f75879a;
                i iVar = c0764c.f75880b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f75880b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f75880b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f75880b.mutate();
                    this.f75880b = iVar2;
                    iVar2.setCallback(callback);
                    this.f75880b.setBounds(c0764c.f75880b.getBounds());
                    this.f75880b.l(false);
                }
                ArrayList<Animator> arrayList = c0764c.f75882d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f75882d = new ArrayList<>(size);
                    this.f75883e = new androidx.collection.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = c0764c.f75882d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = c0764c.f75883e.get(animator);
                        animatorClone.setTarget(this.f75880b.g(str));
                        this.f75882d.add(animatorClone);
                        this.f75883e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f75881c == null) {
                this.f75881c = new AnimatorSet();
            }
            this.f75881c.playTogether(this.f75882d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f75879a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    @p0
    public static c d(@NonNull Context context, @v int i10) {
        c cVar = new c(context);
        Drawable drawableG = androidx.core.content.res.i.g(context.getResources(), i10, context.getTheme());
        cVar.f75901a = drawableG;
        drawableG.setCallback(cVar.f75876h);
        cVar.f75873e = new d(cVar.f75901a.getConstantState());
        return cVar;
    }

    public static c e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void f(Drawable drawable, androidx.vectordrawable.graphics.drawable.b.a aVar) {
        if (drawable != null && aVar != null && (drawable instanceof Animatable)) {
            g((AnimatedVectorDrawable) drawable, aVar);
        }
    }

    @w0(23)
    private static void g(@NonNull AnimatedVectorDrawable animatedVectorDrawable, @NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    private void h() {
        Animator.AnimatorListener animatorListener = this.f75874f;
        if (animatorListener != null) {
            this.f75870b.f75881c.removeListener(animatorListener);
            this.f75874f = null;
        }
    }

    private void i(String str, Animator animator) {
        animator.setTarget(this.f75870b.f75880b.g(str));
        C0764c c0764c = this.f75870b;
        if (c0764c.f75882d == null) {
            c0764c.f75882d = new ArrayList<>();
            this.f75870b.f75883e = new androidx.collection.a<>();
        }
        this.f75870b.f75882d.add(animator);
        this.f75870b.f75883e.put(animator, str);
    }

    private void j(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                j(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f75872d == null) {
                    this.f75872d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f75872d);
            }
        }
    }

    public static boolean k(Drawable drawable, androidx.vectordrawable.graphics.drawable.b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return l((AnimatedVectorDrawable) drawable, aVar);
    }

    @w0(23)
    private static boolean l(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.a(drawable, theme);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean b(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            l((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b.a> arrayList = this.f75875g;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(aVar);
        if (this.f75875g.size() == 0) {
            h();
        }
        return zRemove;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void c(@NonNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, aVar);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.f75875g == null) {
            this.f75875g = new ArrayList<>();
        }
        if (this.f75875g.contains(aVar)) {
            return;
        }
        this.f75875g.add(aVar);
        if (this.f75874f == null) {
            this.f75874f = new b();
        }
        this.f75870b.f75881c.addListener(this.f75874f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.c.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        h();
        ArrayList<androidx.vectordrawable.graphics.drawable.b.a> arrayList = this.f75875g;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f75870b.f75880b.draw(canvas);
        if (this.f75870b.f75881c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f75901a;
        return drawable != null ? androidx.core.graphics.drawable.c.d(drawable) : this.f75870b.f75880b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f75870b.f75879a | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f75901a;
        return drawable != null ? androidx.core.graphics.drawable.c.e(drawable) : this.f75870b.f75880b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f75901a != null) {
            return new d(this.f75901a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f75901a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f75870b.f75880b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f75901a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f75870b.f75880b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f75901a;
        return drawable != null ? drawable.getOpacity() : this.f75870b.f75880b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f75867j.equals(name)) {
                    TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.M);
                    int resourceId = typedArrayS.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i iVarD = i.d(resources, resourceId, theme);
                        iVarD.l(false);
                        iVarD.setCallback(this.f75876h);
                        i iVar = this.f75870b.f75880b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f75870b.f75880b = iVarD;
                    }
                    typedArrayS.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.O);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f75871c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        i(string, e.j(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f75870b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f75901a;
        return drawable != null ? androidx.core.graphics.drawable.c.h(drawable) : this.f75870b.f75880b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f75901a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f75870b.f75881c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f75901a;
        return drawable != null ? drawable.isStateful() : this.f75870b.f75880b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f75870b.f75880b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f75901a;
        return drawable != null ? drawable.setLevel(i10) : this.f75870b.f75880b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f75901a;
        return drawable != null ? drawable.setState(iArr) : this.f75870b.f75880b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f75870b.f75880b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.j(drawable, z10);
        } else {
            this.f75870b.f75880b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTint(int i10) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.n(drawable, i10);
        } else {
            this.f75870b.f75880b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.o(drawable, colorStateList);
        } else {
            this.f75870b.f75880b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.p(drawable, mode);
        } else {
            this.f75870b.f75880b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f75870b.f75880b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f75870b.f75881c.isStarted()) {
                return;
            }
            this.f75870b.f75881c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f75870b.f75881c.end();
        }
    }

    private c(@p0 Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f75870b.f75880b.setColorFilter(colorFilter);
        }
    }

    @w0(24)
    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f75884a;

        public d(Drawable.ConstantState constantState) {
            this.f75884a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f75884a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f75884a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f75884a.newDrawable();
            cVar.f75901a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f75876h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f75884a.newDrawable(resources);
            cVar.f75901a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f75876h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f75884a.newDrawable(resources, theme);
            cVar.f75901a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f75876h);
            return cVar;
        }
    }

    private c(@p0 Context context, @p0 C0764c c0764c, @p0 Resources resources) {
        this.f75872d = null;
        this.f75874f = null;
        this.f75875g = null;
        a aVar = new a();
        this.f75876h = aVar;
        this.f75871c = context;
        if (c0764c != null) {
            this.f75870b = c0764c;
        } else {
            this.f75870b = new C0764c(context, c0764c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
