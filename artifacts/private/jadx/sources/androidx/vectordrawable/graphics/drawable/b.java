package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends Animatable {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Animatable2.AnimationCallback f75864a;

        /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.b$a$a, reason: collision with other inner class name */
        class C0763a extends Animatable2.AnimationCallback {
            C0763a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        @w0(23)
        Animatable2.AnimationCallback a() {
            if (this.f75864a == null) {
                this.f75864a = new C0763a();
            }
            return this.f75864a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }

    boolean b(@NonNull a aVar);

    void c(@NonNull a aVar);

    void clearAnimationCallbacks();
}
