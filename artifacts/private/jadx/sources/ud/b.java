package ud;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.profile.ProfileNavigationFragment;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import ij.f;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@f
public final class b implements UrlSpanWithListener.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f381238b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, a> f381239a;

    public interface a {
        void a();
    }

    @ij.a
    public b(@NotNull y1 menuManager, @NotNull x navigator) {
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f381239a = MapsKt.mapOf(TuplesKt.to("p5d://profile", new ud.a(menuManager, ProfileNavigationFragment.class, navigator)));
    }

    @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
    public void a(@Nullable String str) {
        a aVar = this.f381239a.get(str);
        if (aVar != null) {
            aVar.a();
        }
    }
}
