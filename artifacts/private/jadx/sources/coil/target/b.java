package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class b extends a<ImageView> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ImageView f87794b;

    public b(@NotNull ImageView imageView) {
        this.f87794b = imageView;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(getView(), ((b) obj).getView());
    }

    @Override // coil.target.a, coil.transition.d
    @Nullable
    public Drawable f() {
        return getView().getDrawable();
    }

    public int hashCode() {
        return getView().hashCode();
    }

    @Override // coil.target.a
    public void l(@Nullable Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    @Override // coil.target.d, coil.transition.d
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ImageView getView() {
        return this.f87794b;
    }
}
