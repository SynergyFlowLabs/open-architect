package androidx.databinding.adapters;

import android.widget.RatingBar;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:rating", type = RatingBar.class)})
public class w {

    class a implements RatingBar.OnRatingBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RatingBar.OnRatingBarChangeListener f49316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f49317b;

        a(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.o oVar) {
            this.f49316a = onRatingBarChangeListener;
            this.f49317b = oVar;
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f10, boolean z10) {
            RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.f49316a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f10, z10);
            }
            this.f49317b.a();
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void a(RatingBar ratingBar, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new a(onRatingBarChangeListener, oVar));
        }
    }

    @androidx.databinding.d({"android:rating"})
    public static void b(RatingBar ratingBar, float f10) {
        if (ratingBar.getRating() != f10) {
            ratingBar.setRating(f10);
        }
    }
}
