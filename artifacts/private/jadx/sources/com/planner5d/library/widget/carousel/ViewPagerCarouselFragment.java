package com.planner5d.library.widget.carousel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class ViewPagerCarouselFragment extends Fragment {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ImageView imageView = new ImageView(requireContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(new j(getArguments()).c(r.id, 0));
        return imageView;
    }
}
