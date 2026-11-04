package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends RecyclerView.g0 {
    private b(@NonNull FrameLayout frameLayout) {
        super(frameLayout);
    }

    @NonNull
    static b g(@NonNull ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(u1.D());
        frameLayout.setSaveEnabled(false);
        return new b(frameLayout);
    }

    @NonNull
    FrameLayout h() {
        return (FrameLayout) this.itemView;
    }
}
