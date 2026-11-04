package xe;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.o0;
import com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.l;
import com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class b implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f390625d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f390626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final o f390627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final o0 f390628c;

    public b(@NotNull Context context, @NotNull o viewModel, @NotNull o0 lifecycleOwner) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f390626a = context;
        this.f390627b = viewModel;
        this.f390628c = lifecycleOwner;
    }

    @Override // xe.a
    @NotNull
    public View a() {
        return new l(this.f390626a, this.f390627b, this.f390628c);
    }
}
