package com.planner5d.library.application;

import com.planner5d.library.widget.carousel.CarouselView;
import com.planner5d.library.widget.colorpicker.ColorPickerCompact;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;
import com.planner5d.library.widget.preloader.PreloaderBoxView;
import com.planner5d.library.widget.preloader.PreloaderDialogView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@fg.k
public interface d6 {

    public interface a {
        @NotNull
        d6 b();
    }

    @NotNull
    com.planner5d.library.services.y f();

    @NotNull
    com.planner5d.library.services.utility.f1 g();

    void h(@NotNull PreloaderBoxView preloaderBoxView);

    void i(@NotNull ColorPickerCompact colorPickerCompact);

    void j(@NotNull PreloaderBoxV2View preloaderBoxV2View);

    @NotNull
    com.planner5d.library.model.manager.u1 k();

    void l(@NotNull CarouselView carouselView);

    void m(@NotNull PreloaderDialogView preloaderDialogView);

    void n(@NotNull com.github.danielnilsson9.colorpickerview.view.b bVar);
}
