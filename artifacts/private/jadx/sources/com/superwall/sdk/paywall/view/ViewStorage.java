package com.superwall.sdk.paywall.view;

import android.view.View;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ViewStorage {

    public static final class DefaultImpls {
        @NotNull
        public static List<View> all(@NotNull ViewStorage viewStorage) {
            Collection<View> collectionValues = viewStorage.getViews().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            return CollectionsKt.toList(collectionValues);
        }

        @NotNull
        public static Set<String> keys(@NotNull ViewStorage viewStorage) {
            Set<String> setKeySet = viewStorage.getViews().keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            return setKeySet;
        }

        public static void removeView(@NotNull ViewStorage viewStorage, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            viewStorage.getViews().remove(key);
        }

        @Nullable
        public static View retrieveView(@NotNull ViewStorage viewStorage, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return viewStorage.getViews().get(key);
        }

        public static void storeView(@NotNull ViewStorage viewStorage, @NotNull String key, @NotNull View view) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(view, "view");
            viewStorage.getViews().put(key, view);
        }
    }

    @NotNull
    List<View> all();

    @NotNull
    ConcurrentHashMap<String, View> getViews();

    @NotNull
    Set<String> keys();

    void removeView(@NotNull String str);

    @Nullable
    View retrieveView(@NotNull String str);

    void storeView(@NotNull String str, @NotNull View view);
}
