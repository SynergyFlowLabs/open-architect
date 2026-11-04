package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.w6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,180:1\n1863#2,2:181\n216#3,2:183\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n165#1:181,2\n174#1:183,2\n*E\n"})
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Class<? extends Object>[] f40986a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f40987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.savedstate.j f40988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40989c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, androidx.savedstate.j jVar, String str) {
            super(0);
            this.f40987a = z10;
            this.f40988b = jVar;
            this.f40989c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f40987a) {
                this.f40988b.f(this.f40989c);
            }
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40990a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(z1.f(obj));
        }
    }

    @NotNull
    public static final x1 b(@NotNull View view, @NotNull androidx.savedstate.m mVar) {
        Object parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(androidx.compose.ui.d0.b.H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, mVar);
    }

    @NotNull
    public static final x1 c(@NotNull String str, @NotNull androidx.savedstate.m mVar) {
        boolean z10;
        String str2 = androidx.compose.runtime.saveable.v.class.getSimpleName() + AbstractJsonLexerKt.COLON + str;
        androidx.savedstate.j savedStateRegistry = mVar.getSavedStateRegistry();
        Bundle bundleA = savedStateRegistry.a(str2);
        final androidx.compose.runtime.saveable.v vVarC = androidx.compose.runtime.saveable.y.c(bundleA != null ? h(bundleA) : null, b.f40990a);
        try {
            savedStateRegistry.d(str2, new androidx.savedstate.j.b() { // from class: androidx.compose.ui.platform.y1
                @Override // androidx.savedstate.j.b
                public final Bundle a() {
                    return z1.d(vVarC);
                }
            });
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new x1(vVarC, new a(z10, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(androidx.compose.runtime.saveable.v vVar) {
        return g(vVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.g0) {
            androidx.compose.runtime.snapshots.g0 g0Var = (androidx.compose.runtime.snapshots.g0) obj;
            if (g0Var.c() != w6.o() && g0Var.c() != w6.z() && g0Var.c() != w6.v()) {
                return false;
            }
            T value = g0Var.getValue();
            if (value == 0) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof kotlin.x) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f40986a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Intrinsics.checkNotNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
