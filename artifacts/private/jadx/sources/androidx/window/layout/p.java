package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.l1;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f76418b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f76419c = p.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.window.core.g.b f76420a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @e.a({"BanUncheckedReflection"})
        @l1
        public final int a(@NotNull SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                    if (objInvoke != null) {
                        return ((Integer) objInvoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final int b(@NotNull SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        @e.a({"BanUncheckedReflection"})
        @l1
        @NotNull
        public final List<SidecarDisplayFeature> c(@NotNull SidecarWindowLayoutInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            try {
                try {
                    List<SidecarDisplayFeature> listEmptyList = info.displayFeatures;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    return listEmptyList;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return CollectionsKt.emptyList();
                }
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                if (objInvoke != null) {
                    return (List) objInvoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            }
        }

        @e.a({"BanUncheckedReflection"})
        @l1
        public final void d(@NotNull SidecarDeviceState sidecarDeviceState, int i10) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @e.a({"BanUncheckedReflection"})
        @l1
        public final void e(@NotNull SidecarWindowLayoutInfo info, @NotNull List<SidecarDisplayFeature> displayFeatures) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(info, displayFeatures);
            }
        }

        private a() {
        }
    }

    static final class b extends l0 implements Function1<SidecarDisplayFeature, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f76421a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
            Intrinsics.checkNotNullParameter(require, "$this$require");
            boolean z10 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class c extends l0 implements Function1<SidecarDisplayFeature, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f76422a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
            Intrinsics.checkNotNullParameter(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    static final class d extends l0 implements Function1<SidecarDisplayFeature, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f76423a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
            Intrinsics.checkNotNullParameter(require, "$this$require");
            boolean z10 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class e extends l0 implements Function1<SidecarDisplayFeature, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f76424a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
            Intrinsics.checkNotNullParameter(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.areEqual(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType()) {
            return Intrinsics.areEqual(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
        }
        return false;
    }

    private final boolean c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                if (!b(list.get(i10), list2.get(i10))) {
                    return false;
                }
                i10 = i11;
            }
            return true;
        }
        return false;
    }

    public final boolean a(@Nullable SidecarDeviceState sidecarDeviceState, @Nullable SidecarDeviceState sidecarDeviceState2) {
        if (Intrinsics.areEqual(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f76418b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean d(@Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (Intrinsics.areEqual(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f76418b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    @NotNull
    public final x e(@Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @NotNull SidecarDeviceState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new x(CollectionsKt.emptyList());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        a aVar = f76418b;
        aVar.d(sidecarDeviceState, aVar.b(state));
        return new x(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    @NotNull
    public final List<h> f(@NotNull List<SidecarDisplayFeature> sidecarDisplayFeatures, @NotNull SidecarDeviceState deviceState) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            h hVarG = g((SidecarDisplayFeature) it.next(), deviceState);
            if (hVarG != null) {
                arrayList.add(hVarG);
            }
        }
        return arrayList;
    }

    @Nullable
    public final h g(@NotNull SidecarDisplayFeature feature, @NotNull SidecarDeviceState deviceState) {
        n.b bVarA;
        m.c cVar;
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        androidx.window.core.g.a aVar = androidx.window.core.g.f76272a;
        String TAG = f76419c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) androidx.window.core.g.a.b(aVar, feature, TAG, this.f76420a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f76421a).c("Feature bounds must not be 0", c.f76422a).c("TYPE_FOLD must have 0 area", d.f76423a).c("Feature be pinned to either left or top", e.f76424a).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVarA = n.b.f76407b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = n.b.f76407b.b();
        }
        int iB = f76418b.b(deviceState);
        if (iB != 0 && iB != 1) {
            if (iB == 2) {
                cVar = m.c.f76401d;
            } else if (iB == 3 || iB != 4) {
                cVar = m.c.f76400c;
            }
            Rect rect = feature.getRect();
            Intrinsics.checkNotNullExpressionValue(rect, "feature.rect");
            return new n(new androidx.window.core.b(rect), bVarA, cVar);
        }
        return null;
    }

    public p(@NotNull androidx.window.core.g.b verificationMode) {
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f76420a = verificationMode;
    }

    public /* synthetic */ p(androidx.window.core.g.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.window.core.g.b.QUIET : bVar);
    }
}
