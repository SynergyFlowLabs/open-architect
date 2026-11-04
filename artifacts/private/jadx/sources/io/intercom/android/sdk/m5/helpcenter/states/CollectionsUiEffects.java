package io.intercom.android.sdk.m5.helpcenter.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class CollectionsUiEffects {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class NavigateToCollectionContent extends CollectionsUiEffects {
        public static final int $stable = 0;

        @NotNull
        private final String collectionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCollectionContent(@NotNull String collectionId) {
            super(null);
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            this.collectionId = collectionId;
        }

        public static /* synthetic */ NavigateToCollectionContent copy$default(NavigateToCollectionContent navigateToCollectionContent, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToCollectionContent.collectionId;
            }
            return navigateToCollectionContent.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.collectionId;
        }

        @NotNull
        public final NavigateToCollectionContent copy(@NotNull String collectionId) {
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            return new NavigateToCollectionContent(collectionId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToCollectionContent) && Intrinsics.areEqual(this.collectionId, ((NavigateToCollectionContent) obj).collectionId);
        }

        @NotNull
        public final String getCollectionId() {
            return this.collectionId;
        }

        public int hashCode() {
            return this.collectionId.hashCode();
        }

        @NotNull
        public String toString() {
            return "NavigateToCollectionContent(collectionId=" + this.collectionId + ')';
        }
    }

    public /* synthetic */ CollectionsUiEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CollectionsUiEffects() {
    }
}
