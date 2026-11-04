package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f extends g0 {
    private static final String I3 = "android:changeImageTransform:matrix";
    private static final String J3 = "android:changeImageTransform:bounds";
    private static final String[] K3 = {I3, J3};
    private static final TypeEvaluator<Matrix> L3 = new a();
    private static final Property<ImageView, Matrix> M3 = new b(Matrix.class, "animatedTransform");

    class a implements TypeEvaluator<Matrix> {
        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    class b extends Property<ImageView, Matrix> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            t.a(imageView, matrix);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f75559a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f75559a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75559a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class d extends AnimatorListenerAdapter implements g0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImageView f75560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Matrix f75561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f75562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f75563d = true;

        d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f75560a = imageView;
            this.f75561b = matrix;
            this.f75562c = matrix2;
        }

        private void a() {
            Matrix matrix = (Matrix) this.f75560a.getTag(a0.a.f75500h);
            if (matrix != null) {
                t.a(this.f75560a, matrix);
                this.f75560a.setTag(a0.a.f75500h, null);
            }
        }

        private void c(Matrix matrix) {
            this.f75560a.setTag(a0.a.f75500h, matrix);
            t.a(this.f75560a, this.f75562c);
        }

        @Override // androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
            a();
        }

        @Override // androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
            if (this.f75563d) {
                c(this.f75561b);
            }
        }

        @Override // androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            this.f75563d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            c((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            this.f75563d = false;
        }

        @Override // androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f75563d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f75563d = false;
        }
    }

    public f() {
    }

    private void N0(u0 u0Var, boolean z10) {
        View view = u0Var.f75776b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = u0Var.f75775a;
            map.put(J3, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrixP0 = z10 ? (Matrix) imageView.getTag(a0.a.f75500h) : null;
            if (matrixP0 == null) {
                matrixP0 = P0(imageView);
            }
            map.put(I3, matrixP0);
        }
    }

    private static Matrix O0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f10 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f11 = intrinsicHeight;
        float fMax = Math.max(width / f10, height / f11);
        int iRound = Math.round((width - (f10 * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f11 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    @NonNull
    private static Matrix P0(@NonNull ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i10 = c.f75559a[imageView.getScaleType().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? new Matrix(imageView.getImageMatrix()) : O0(imageView);
        }
        return S0(imageView);
    }

    private ObjectAnimator Q0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) M3, (TypeEvaluator) new t0.b(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @NonNull
    private ObjectAnimator R0(@NonNull ImageView imageView) {
        Property<ImageView, Matrix> property = M3;
        TypeEvaluator<Matrix> typeEvaluator = L3;
        Matrix matrix = u.f75774a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix S0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.g0
    @NonNull
    public String[] b0() {
        return K3;
    }

    @Override // androidx.transition.g0
    public boolean e0() {
        return true;
    }

    @Override // androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        N0(u0Var, false);
    }

    @Override // androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        N0(u0Var, true);
    }

    @Override // androidx.transition.g0
    @androidx.annotation.p0
    public Animator t(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        if (u0Var != null && u0Var2 != null) {
            Rect rect = (Rect) u0Var.f75775a.get(J3);
            Rect rect2 = (Rect) u0Var2.f75775a.get(J3);
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) u0Var.f75775a.get(I3);
                Matrix matrix2 = (Matrix) u0Var2.f75775a.get(I3);
                boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z10) {
                    return null;
                }
                ImageView imageView = (ImageView) u0Var2.f75776b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    return R0(imageView);
                }
                if (matrix == null) {
                    matrix = u.f75774a;
                }
                if (matrix2 == null) {
                    matrix2 = u.f75774a;
                }
                M3.set(imageView, matrix);
                ObjectAnimator objectAnimatorQ0 = Q0(imageView, matrix, matrix2);
                d dVar = new d(imageView, matrix, matrix2);
                objectAnimatorQ0.addListener(dVar);
                objectAnimatorQ0.addPauseListener(dVar);
                c(dVar);
                return objectAnimatorQ0;
            }
        }
        return null;
    }

    public f(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
