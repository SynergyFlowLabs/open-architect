package androidx.navigation.fragment;

import android.view.View;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFragmentNavigatorExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n1#2:35\n13409#3,2:36\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n*L\n32#1:36,2\n*E\n"})
public final class t {
    @NotNull
    public static final q.d a(@NotNull Pair<? extends View, String>... sharedElements) {
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        q.d.a aVar = new q.d.a();
        int i10 = 7 >> 0;
        for (Pair<? extends View, String> pair : sharedElements) {
            aVar.a(pair.component1(), pair.component2());
        }
        return aVar.c();
    }
}
