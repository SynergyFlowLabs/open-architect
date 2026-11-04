package androidx.databinding.adapters;

import androidx.annotation.b1;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @androidx.databinding.g(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @androidx.databinding.g(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @androidx.databinding.g(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
@b1({b1.a.LIBRARY})
public class h {
    @androidx.databinding.d({"contentPadding"})
    public static void a(CardView cardView, int i10) {
        cardView.h(i10, i10, i10, i10);
    }

    @androidx.databinding.d({"contentPaddingBottom"})
    public static void b(CardView cardView, int i10) {
        cardView.h(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i10);
    }

    @androidx.databinding.d({"contentPaddingLeft"})
    public static void c(CardView cardView, int i10) {
        cardView.h(i10, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    @androidx.databinding.d({"contentPaddingRight"})
    public static void d(CardView cardView, int i10) {
        cardView.h(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i10, cardView.getContentPaddingBottom());
    }

    @androidx.databinding.d({"contentPaddingTop"})
    public static void e(CardView cardView, int i10) {
        cardView.h(cardView.getContentPaddingLeft(), i10, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }
}
