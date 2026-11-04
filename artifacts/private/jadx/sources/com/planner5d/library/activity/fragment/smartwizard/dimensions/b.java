package com.planner5d.library.activity.fragment.smartwizard.dimensions;

import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.slider.Slider;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class b extends RecyclerView.g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f135505c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f135506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<f> f135507b;

    @SourceDebugExtension({"SMAP\nDimensionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimensionsAdapter.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/DimensionHolder$bind$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1863#2,2:94\n1863#2,2:96\n*S KotlinDebug\n*F\n+ 1 DimensionsAdapter.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/DimensionHolder$bind$1$1\n*L\n75#1:94,2\n83#1:96,2\n*E\n"})
    public static final class a implements Slider.b {
        a() {
        }

        @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
        /* JADX INFO: renamed from: c */
        public void a(Slider slider) {
            Intrinsics.checkNotNullParameter(slider, "slider");
            List<f> list = b.this.f135507b;
            b bVar = b.this;
            for (f fVar : list) {
                if (!Intrinsics.areEqual(fVar, bVar.f135506a)) {
                    fVar.setEnabled(false);
                }
            }
        }

        @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
        /* JADX INFO: renamed from: f */
        public void b(Slider slider) {
            Intrinsics.checkNotNullParameter(slider, "slider");
            List<f> list = b.this.f135507b;
            b bVar = b.this;
            for (f fVar : list) {
                if (!Intrinsics.areEqual(fVar, bVar.f135506a)) {
                    fVar.setEnabled(true);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull f view, @NotNull List<f> relatedViews) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(relatedViews, "relatedViews");
        this.f135506a = view;
        this.f135507b = relatedViews;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(x xVar, w wVar, int i10, boolean z10) {
        xVar.a(i10, wVar, z10);
        return Unit.f312394a;
    }

    public final void j(@NotNull final w wall, @NotNull final x sliderListener) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(sliderListener, "sliderListener");
        f fVar = this.f135506a;
        fVar.setFocusable(true);
        fVar.setProgressColor(wall.g().getWallColor());
        fVar.setMin(wall.d());
        fVar.setMax(wall.c());
        fVar.setInitialValue(wall.b());
        fVar.setOnSliderTouchListener(new a());
        fVar.setOnValueChangeListener(new Function2() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return b.k(sliderListener, wall, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
            }
        });
    }
}
