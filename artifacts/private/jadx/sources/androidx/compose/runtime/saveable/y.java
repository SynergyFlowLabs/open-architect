package androidx.compose.runtime.saveable;

import androidx.collection.k2;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.m4;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1#1,186:1\n1#2:187\n808#3:188\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryKt\n*L\n102#1:188\n*E\n"})
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m4<v> f36433a = a1.m(new Function0() { // from class: androidx.compose.runtime.saveable.x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return y.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final v b() {
        return null;
    }

    @NotNull
    public static final v c(@Nullable Map<String, ? extends List<? extends Object>> map, @NotNull Function1<Object, Boolean> function1) {
        return new w(map, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharsKt.q(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final m4<v> g() {
        return f36433a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> k2<K, V> h(Map<K, ? extends V> map) {
        k2<K, V> k2Var = new k2<>(map.size());
        k2Var.i0(map);
        return k2Var;
    }
}
