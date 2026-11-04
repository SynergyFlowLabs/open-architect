package androidx.navigation;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"TypeParameterUnusedInFormals"})
@SourceDebugExtension({"SMAP\nNavigatorProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
public class r3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f71232b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<Class<?>, String> f71233c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, q3<? extends y1>> f71234a = new LinkedHashMap();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final String a(@NotNull Class<? extends q3<?>> navigatorClass) {
            Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
            String strValue = (String) r3.f71233c.get(navigatorClass);
            if (strValue == null) {
                q3.b bVar = (q3.b) navigatorClass.getAnnotation(q3.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (!b(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                r3.f71233c.put(navigatorClass, strValue);
            }
            Intrinsics.checkNotNull(strValue);
            return strValue;
        }

        public final boolean b(@Nullable String str) {
            return str != null && str.length() > 0;
        }

        private a() {
        }
    }

    @oj.n
    @NotNull
    public static final String d(@NotNull Class<? extends q3<?>> cls) {
        return f71232b.a(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final q3<? extends y1> b(@NotNull q3<? extends y1> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return c(f71232b.a(navigator.getClass()), navigator);
    }

    @androidx.annotation.i
    @Nullable
    public q3<? extends y1> c(@NotNull String name, @NotNull q3<? extends y1> navigator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!f71232b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        q3<? extends y1> q3Var = this.f71234a.get(name);
        if (Intrinsics.areEqual(q3Var, navigator)) {
            return navigator;
        }
        boolean z10 = false;
        if (q3Var != null && q3Var.f()) {
            z10 = true;
        }
        if (z10) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + q3Var).toString());
        }
        if (!navigator.f()) {
            return this.f71234a.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    @androidx.annotation.i
    @NotNull
    public final <T extends q3<?>> T e(@NotNull Class<T> navigatorClass) {
        Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
        return (T) f(f71232b.a(navigatorClass));
    }

    @androidx.annotation.i
    @NotNull
    public <T extends q3<?>> T f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!f71232b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        q3<? extends y1> q3Var = this.f71234a.get(name);
        if (q3Var != null) {
            return q3Var;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final Map<String, q3<? extends y1>> g() {
        return MapsKt.toMap(this.f71234a);
    }
}
