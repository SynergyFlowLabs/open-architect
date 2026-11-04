package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface BottomSheetState {

    @w0(parameters = 1)
    public static final class Empty implements BottomSheetState {
        public static final int $stable = 0;

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public int hashCode() {
            return -1704299409;
        }

        @NotNull
        public String toString() {
            return "Empty";
        }
    }

    @w0(parameters = 0)
    public static final class GifSearch implements BottomSheetState {
        public static final int $stable = 8;

        @NotNull
        private final List<Block> gifs;

        /* JADX WARN: Multi-variable type inference failed */
        public GifSearch(@NotNull List<? extends Block> gifs) {
            Intrinsics.checkNotNullParameter(gifs, "gifs");
            this.gifs = gifs;
        }

        @NotNull
        public final List<Block> getGifs() {
            return this.gifs;
        }
    }

    @w0(parameters = 0)
    public static final class InlineSources implements BottomSheetState {
        public static final int $stable = 8;

        @NotNull
        private final List<InlineSource> selectedSources;

        @NotNull
        private final List<Source> sources;

        public InlineSources(@NotNull List<InlineSource> selectedSources, @NotNull List<Source> sources) {
            Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
            Intrinsics.checkNotNullParameter(sources, "sources");
            this.selectedSources = selectedSources;
            this.sources = sources;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineSources copy$default(InlineSources inlineSources, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = inlineSources.selectedSources;
            }
            if ((i10 & 2) != 0) {
                list2 = inlineSources.sources;
            }
            return inlineSources.copy(list, list2);
        }

        @NotNull
        public final List<InlineSource> component1() {
            return this.selectedSources;
        }

        @NotNull
        public final List<Source> component2() {
            return this.sources;
        }

        @NotNull
        public final InlineSources copy(@NotNull List<InlineSource> selectedSources, @NotNull List<Source> sources) {
            Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
            Intrinsics.checkNotNullParameter(sources, "sources");
            return new InlineSources(selectedSources, sources);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineSources)) {
                return false;
            }
            InlineSources inlineSources = (InlineSources) obj;
            return Intrinsics.areEqual(this.selectedSources, inlineSources.selectedSources) && Intrinsics.areEqual(this.sources, inlineSources.sources);
        }

        @NotNull
        public final List<InlineSource> getSelectedSources() {
            return this.selectedSources;
        }

        @NotNull
        public final List<Source> getSources() {
            return this.sources;
        }

        public int hashCode() {
            return (this.selectedSources.hashCode() * 31) + this.sources.hashCode();
        }

        @NotNull
        public String toString() {
            return "InlineSources(selectedSources=" + this.selectedSources + ", sources=" + this.sources + ')';
        }
    }

    @w0(parameters = 1)
    public static final class MediaInput implements BottomSheetState {
        public static final int $stable = 0;

        @NotNull
        public static final MediaInput INSTANCE = new MediaInput();

        private MediaInput() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof MediaInput);
        }

        public int hashCode() {
            return -1100907420;
        }

        @NotNull
        public String toString() {
            return "MediaInput";
        }
    }

    @w0(parameters = 1)
    public static final class TeammatePresence implements BottomSheetState {
        public static final int $stable = 0;

        @NotNull
        public static final TeammatePresence INSTANCE = new TeammatePresence();

        private TeammatePresence() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof TeammatePresence);
        }

        public int hashCode() {
            return 298154395;
        }

        @NotNull
        public String toString() {
            return "TeammatePresence";
        }
    }
}
