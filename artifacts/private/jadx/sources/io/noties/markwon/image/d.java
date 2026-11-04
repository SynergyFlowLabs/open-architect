package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import io.noties.markwon.s;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d {

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f297630a;

        a(TextView textView) {
            this.f297630a = textView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            d.c(this.f297630a);
            view.removeOnAttachStateChangeListener(this);
            view.setTag(s.g.E0, null);
        }
    }

    private static class b implements Drawable.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f297631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC2114b f297632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Rect f297633c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Drawable f297634a;

            a(Drawable drawable) {
                this.f297634a = drawable;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.invalidateDrawable(this.f297634a);
            }
        }

        /* JADX INFO: renamed from: io.noties.markwon.image.d$b$b, reason: collision with other inner class name */
        interface InterfaceC2114b {
            void invalidate();
        }

        b(@NonNull TextView textView, @NonNull InterfaceC2114b interfaceC2114b, Rect rect) {
            this.f297631a = textView;
            this.f297632b = interfaceC2114b;
            this.f297633c = new Rect(rect);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f297631a.post(new a(drawable));
                return;
            }
            Rect bounds = drawable.getBounds();
            if (this.f297633c.equals(bounds)) {
                this.f297631a.postInvalidate();
            } else {
                this.f297632b.invalidate();
                this.f297633c = new Rect(bounds);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
            this.f297631a.postDelayed(runnable, j10 - SystemClock.uptimeMillis());
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.f297631a.removeCallbacks(runnable);
        }
    }

    private static class c implements b.InterfaceC2114b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f297636a;

        c(@NonNull TextView textView) {
            this.f297636a = textView;
        }

        @Override // io.noties.markwon.image.d.b.InterfaceC2114b
        public void invalidate() {
            this.f297636a.removeCallbacks(this);
            this.f297636a.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.f297636a;
            textView.setText(textView.getText());
        }
    }

    private d() {
    }

    @p0
    private static e[] a(@NonNull TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (e[]) ((Spanned) text).getSpans(0, length, e.class);
    }

    public static void b(@NonNull TextView textView) {
        Integer num = (Integer) textView.getTag(s.g.F0);
        int iHashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            textView.setTag(s.g.F0, Integer.valueOf(iHashCode));
            e[] eVarArrA = a(textView);
            if (eVarArrA == null || eVarArrA.length <= 0) {
                return;
            }
            if (textView.getTag(s.g.E0) == null) {
                a aVar = new a(textView);
                textView.addOnAttachStateChangeListener(aVar);
                textView.setTag(s.g.E0, aVar);
            }
            c cVar = new c(textView);
            for (e eVar : eVarArrA) {
                io.noties.markwon.image.a aVarA = eVar.a();
                aVarA.o(new b(textView, cVar, aVarA.getBounds()));
            }
        }
    }

    public static void c(@NonNull TextView textView) {
        if (textView.getTag(s.g.F0) == null) {
            return;
        }
        textView.setTag(s.g.F0, null);
        e[] eVarArrA = a(textView);
        if (eVarArrA == null || eVarArrA.length <= 0) {
            return;
        }
        for (e eVar : eVarArrA) {
            eVar.a().o(null);
        }
    }
}
