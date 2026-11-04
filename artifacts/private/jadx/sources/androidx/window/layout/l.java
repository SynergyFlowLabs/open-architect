package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f76390a = new l();

    private l() {
    }

    private final boolean c(Activity activity, androidx.window.core.b bVar) {
        Rect rectA = a0.f76376b.c(activity).a();
        if (bVar.h()) {
            return false;
        }
        if (bVar.f() != rectA.width() && bVar.b() != rectA.height()) {
            return false;
        }
        if (bVar.f() >= rectA.width() || bVar.b() >= rectA.height()) {
            return (bVar.f() == rectA.width() && bVar.b() == rectA.height()) ? false : true;
        }
        return false;
    }

    @Nullable
    public final m a(@NotNull Activity activity, @NotNull FoldingFeature oemFeature) {
        n.b bVarA;
        m.c cVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVarA = n.b.f76407b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = n.b.f76407b.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            cVar = m.c.f76400c;
        } else {
            if (state != 2) {
                return null;
            }
            cVar = m.c.f76401d;
        }
        Rect bounds = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        if (!c(activity, new androidx.window.core.b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds2, "oemFeature.bounds");
        return new n(new androidx.window.core.b(bounds2), bVarA, cVar);
    }

    @NotNull
    public final x b(@NotNull Activity activity, @NotNull WindowLayoutInfo info) {
        m mVarA;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                l lVar = f76390a;
                Intrinsics.checkNotNullExpressionValue(feature, "feature");
                mVarA = lVar.a(activity, feature);
            } else {
                mVarA = null;
            }
            if (mVarA != null) {
                arrayList.add(mVarA);
            }
        }
        return new x(arrayList);
    }
}
