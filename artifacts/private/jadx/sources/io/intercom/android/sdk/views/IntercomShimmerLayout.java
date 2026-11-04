package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.shimmer.c;
import com.facebook.shimmer.e;
import e.b;

/* JADX INFO: loaded from: classes13.dex */
public class IntercomShimmerLayout extends e {
    private static final c SHIMMER_CONFIG = new c.a().v(0.0f).q(0.01f).l(1500).p(0.6f).s(100).a();

    public IntercomShimmerLayout(Context context) {
        super(context);
        init();
    }

    private void init() {
        setShimmer(SHIMMER_CONFIG);
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init();
    }

    @b(21)
    public IntercomShimmerLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        init();
    }
}
